package com.getcapacitor.plugin;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Base64;
import androidx.core.content.FileProvider;
import com.getcapacitor.Dialogs;
import com.getcapacitor.FileUtils;
import com.getcapacitor.JSObject;
import com.getcapacitor.NativePlugin;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.plugin.camera.CameraResultType;
import com.getcapacitor.plugin.camera.CameraSettings;
import com.getcapacitor.plugin.camera.CameraSource;
import com.getcapacitor.plugin.camera.CameraUtils;
import com.getcapacitor.plugin.camera.ExifWrapper;
import com.getcapacitor.plugin.camera.ImageUtils;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

@NativePlugin(requestCodes = {9002, 9003, 9005})
/* loaded from: classes7.dex */
public class Camera extends Plugin {
    private static final String IMAGE_EDIT_ERROR = "Unable to edit image";
    private static final String IMAGE_FILE_SAVE_ERROR = "Unable to create photo on disk";
    private static final String IMAGE_GALLERY_SAVE_ERROR = "Unable to save the image in the gallery";
    private static final String IMAGE_PROCESS_NO_FILE_ERROR = "Unable to process image, file not found on disk";
    private static final String INVALID_RESULT_TYPE_ERROR = "Invalid resultType option";
    private static final String NO_CAMERA_ACTIVITY_ERROR = "Unable to resolve camera activity";
    private static final String NO_CAMERA_ERROR = "Device doesn't have a camera available";
    private static final String PERMISSION_DENIED_ERROR = "Unable to access camera, user denied permission request";
    static final int REQUEST_IMAGE_CAPTURE = 9002;
    static final int REQUEST_IMAGE_EDIT = 9005;
    static final int REQUEST_IMAGE_PICK = 9003;
    private static final String UNABLE_TO_PROCESS_IMAGE = "Unable to process image";
    private String imageEditedFileSavePath;
    private String imageFileSavePath;
    private Uri imageFileUri;
    private boolean isEdited = false;
    private CameraSettings settings = new CameraSettings();

    public static void safedk_Camera_startActivityForResult_a27cc97a1e51ca1e9603aafc17abe3a1(Camera p0, PluginCall p1, Intent p2, int p3) {
        Logger.d("SafeDK-Special|SafeDK: Call> Lcom/getcapacitor/plugin/Camera;->startActivityForResult(Lcom/getcapacitor/PluginCall;Landroid/content/Intent;I)V");
        if (p2 == null) {
            return;
        }
        p0.startActivityForResult(p1, p2, p3);
    }

    @PluginMethod
    public void getPhoto(PluginCall pluginCall) {
        this.isEdited = false;
        saveCall(pluginCall);
        this.settings = getSettings(pluginCall);
        doShow(pluginCall);
    }

    /* renamed from: com.getcapacitor.plugin.Camera$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$com$getcapacitor$plugin$camera$CameraSource;

        static {
            int[] iArr = new int[CameraSource.values().length];
            $SwitchMap$com$getcapacitor$plugin$camera$CameraSource = iArr;
            try {
                iArr[CameraSource.PROMPT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$getcapacitor$plugin$camera$CameraSource[CameraSource.CAMERA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$getcapacitor$plugin$camera$CameraSource[CameraSource.PHOTOS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private void doShow(PluginCall pluginCall) {
        int i = AnonymousClass3.$SwitchMap$com$getcapacitor$plugin$camera$CameraSource[this.settings.getSource().ordinal()];
        if (i == 1) {
            showPrompt(pluginCall);
            return;
        }
        if (i == 2) {
            showCamera(pluginCall);
        } else if (i == 3) {
            showPhotos(pluginCall);
        } else {
            showPrompt(pluginCall);
        }
    }

    private void showPrompt(final PluginCall pluginCall) {
        String string = pluginCall.getString("promptLabelPhoto", "From Photos");
        String string2 = pluginCall.getString("promptLabelPicture", "Take Picture");
        JSObject jSObject = new JSObject();
        jSObject.put("title", string);
        JSObject jSObject2 = new JSObject();
        jSObject2.put("title", string2);
        Dialogs.actions(getActivity(), new Object[]{jSObject, jSObject2}, new Dialogs.OnSelectListener() { // from class: com.getcapacitor.plugin.Camera.1
            @Override // com.getcapacitor.Dialogs.OnSelectListener
            public void onSelect(int i) {
                if (i == 0) {
                    Camera.this.settings.setSource(CameraSource.PHOTOS);
                    Camera.this.openPhotos(pluginCall);
                } else if (i == 1) {
                    Camera.this.settings.setSource(CameraSource.CAMERA);
                    Camera.this.openCamera(pluginCall);
                }
            }
        }, new Dialogs.OnCancelListener() { // from class: com.getcapacitor.plugin.Camera.2
            @Override // com.getcapacitor.Dialogs.OnCancelListener
            public void onCancel() {
                pluginCall.error("User cancelled photos app");
            }
        });
    }

    private void showCamera(PluginCall pluginCall) {
        if (!getActivity().getPackageManager().hasSystemFeature("android.hardware.camera.any")) {
            pluginCall.error(NO_CAMERA_ERROR);
        } else {
            openCamera(pluginCall);
        }
    }

    private void showPhotos(PluginCall pluginCall) {
        openPhotos(pluginCall);
    }

    private boolean checkCameraPermissions(PluginCall pluginCall) {
        if (this.settings.isSaveToGallery() && (!hasPermission("android.permission.CAMERA") || !hasPermission("android.permission.WRITE_EXTERNAL_STORAGE"))) {
            pluginRequestPermissions(new String[]{"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"}, 9002);
            return false;
        }
        if (hasPermission("android.permission.CAMERA")) {
            return true;
        }
        pluginRequestPermission("android.permission.CAMERA", 9002);
        return false;
    }

    private boolean checkPhotosPermissions(PluginCall pluginCall) {
        if (hasPermission("android.permission.READ_EXTERNAL_STORAGE")) {
            return true;
        }
        pluginRequestPermission("android.permission.READ_EXTERNAL_STORAGE", 9002);
        return false;
    }

    private CameraSettings getSettings(PluginCall pluginCall) {
        CameraSettings cameraSettings = new CameraSettings();
        cameraSettings.setResultType(getResultType(pluginCall.getString("resultType")));
        cameraSettings.setSaveToGallery(pluginCall.getBoolean("saveToGallery", false).booleanValue());
        cameraSettings.setAllowEditing(pluginCall.getBoolean("allowEditing", false).booleanValue());
        cameraSettings.setQuality(pluginCall.getInt("quality", 90).intValue());
        cameraSettings.setWidth(pluginCall.getInt("width", 0).intValue());
        cameraSettings.setHeight(pluginCall.getInt("height", 0).intValue());
        cameraSettings.setShouldResize(cameraSettings.getWidth() > 0 || cameraSettings.getHeight() > 0);
        cameraSettings.setShouldCorrectOrientation(pluginCall.getBoolean("correctOrientation", true).booleanValue());
        cameraSettings.setPreserveAspectRatio(pluginCall.getBoolean("preserveAspectRatio", false).booleanValue());
        try {
            cameraSettings.setSource(CameraSource.valueOf(pluginCall.getString("source", CameraSource.PROMPT.getSource())));
            return cameraSettings;
        } catch (IllegalArgumentException unused) {
            cameraSettings.setSource(CameraSource.PROMPT);
            return cameraSettings;
        }
    }

    private CameraResultType getResultType(String str) {
        if (str == null) {
            return null;
        }
        try {
            return CameraResultType.valueOf(str.toUpperCase());
        } catch (IllegalArgumentException unused) {
            com.getcapacitor.Logger.debug(getLogTag(), "Invalid result type \"" + str + "\", defaulting to base64");
            return CameraResultType.BASE64;
        }
    }

    public void openCamera(PluginCall pluginCall) {
        if (checkCameraPermissions(pluginCall)) {
            Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
            if (intent.resolveActivity(getActivity().getPackageManager()) != null) {
                try {
                    String appId = getAppId();
                    File createImageFile = CameraUtils.createImageFile(getActivity());
                    this.imageFileSavePath = createImageFile.getAbsolutePath();
                    Uri uriForFile = FileProvider.getUriForFile(getActivity(), appId + ".fileprovider", createImageFile);
                    this.imageFileUri = uriForFile;
                    intent.putExtra("output", uriForFile);
                    safedk_Camera_startActivityForResult_a27cc97a1e51ca1e9603aafc17abe3a1(this, pluginCall, intent, 9002);
                    return;
                } catch (Exception e) {
                    pluginCall.error(IMAGE_FILE_SAVE_ERROR, e);
                    return;
                }
            }
            pluginCall.error(NO_CAMERA_ACTIVITY_ERROR);
        }
    }

    public void openPhotos(PluginCall pluginCall) {
        if (checkPhotosPermissions(pluginCall)) {
            Intent intent = new Intent("android.intent.action.PICK");
            intent.setType("image/*");
            safedk_Camera_startActivityForResult_a27cc97a1e51ca1e9603aafc17abe3a1(this, pluginCall, intent, 9003);
        }
    }

    public void processCameraImage(PluginCall pluginCall) {
        if (this.imageFileSavePath == null) {
            pluginCall.error(IMAGE_PROCESS_NO_FILE_ERROR);
            return;
        }
        File file = new File(this.imageFileSavePath);
        BitmapFactory.Options options = new BitmapFactory.Options();
        Uri fromFile = Uri.fromFile(file);
        Bitmap decodeFile = BitmapFactory.decodeFile(this.imageFileSavePath, options);
        if (decodeFile == null) {
            pluginCall.error("User cancelled photos app");
        } else {
            returnResult(pluginCall, decodeFile, fromFile);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.io.IOException, java.lang.Throwable] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x003d -> B:15:0x0056). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x003f -> B:15:0x0056). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0048 -> B:15:0x0056). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x004a -> B:15:0x0056). Please report as a decompilation issue!!! */
    public void processPickedImage(PluginCall pluginCall, Intent intent) {
        if (intent == null) {
            pluginCall.error("No image picked");
            return;
        }
        Uri data = intent.getData();
        InputStream inputStream = null;
        try {
            try {
                try {
                    try {
                        inputStream = getActivity().getContentResolver().openInputStream(data);
                        Bitmap decodeStream = BitmapFactory.decodeStream(inputStream);
                        if (decodeStream == null) {
                            pluginCall.reject("Unable to process bitmap");
                            pluginCall = pluginCall;
                            if (inputStream != null) {
                                inputStream.close();
                            }
                        } else {
                            returnResult(pluginCall, decodeStream, data);
                            pluginCall = pluginCall;
                            if (inputStream != null) {
                                inputStream.close();
                            }
                        }
                    } catch (FileNotFoundException e) {
                        pluginCall.error("No such image found", e);
                        pluginCall = pluginCall;
                        if (inputStream != null) {
                            inputStream.close();
                            pluginCall = pluginCall;
                        }
                    }
                } catch (OutOfMemoryError unused) {
                    pluginCall.error("Out of memory");
                    pluginCall = pluginCall;
                    if (inputStream != null) {
                        inputStream.close();
                        pluginCall = pluginCall;
                    }
                }
            } catch (Throwable th) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e2) {
                        com.getcapacitor.Logger.error(getLogTag(), UNABLE_TO_PROCESS_IMAGE, e2);
                    }
                }
                throw th;
            }
        } catch (IOException e3) {
            com.getcapacitor.Logger.error(getLogTag(), UNABLE_TO_PROCESS_IMAGE, e3);
            pluginCall = e3;
        }
    }

    private Uri saveTemporaryImage(Bitmap bitmap, Uri uri, InputStream inputStream) throws IOException {
        String lastPathSegment = uri.getLastPathSegment();
        if (!lastPathSegment.contains(BrandSafetyUtils.a) && !lastPathSegment.contains(".jpeg")) {
            lastPathSegment = lastPathSegment + "." + new Date().getTime() + ".jpeg";
        }
        File file = new File(getActivity().getCacheDir(), lastPathSegment);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                fileOutputStream.write(bArr, 0, read);
            } else {
                fileOutputStream.close();
                return Uri.fromFile(file);
            }
        }
    }

    private void returnResult(PluginCall pluginCall, Bitmap bitmap, Uri uri) {
        Camera camera;
        String str;
        try {
            Bitmap prepareBitmap = prepareBitmap(bitmap, uri);
            ExifWrapper exifData = ImageUtils.getExifData(getContext(), prepareBitmap, uri);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            prepareBitmap.compress(Bitmap.CompressFormat.JPEG, this.settings.getQuality(), byteArrayOutputStream);
            if (this.settings.isAllowEditing() && !this.isEdited) {
                editImage(pluginCall, prepareBitmap, uri, byteArrayOutputStream);
                return;
            }
            if (pluginCall.getBoolean("saveToGallery", false).booleanValue() && ((str = this.imageEditedFileSavePath) != null || this.imageFileSavePath != null)) {
                if (str == null) {
                    try {
                        str = this.imageFileSavePath;
                    } catch (FileNotFoundException e) {
                        com.getcapacitor.Logger.error(getLogTag(), IMAGE_GALLERY_SAVE_ERROR, e);
                    }
                }
                MediaStore.Images.Media.insertImage(getActivity().getContentResolver(), str, new File(str).getName(), "");
            }
            if (this.settings.getResultType() == CameraResultType.BASE64) {
                returnBase64(pluginCall, exifData, byteArrayOutputStream);
                camera = this;
            } else if (this.settings.getResultType() == CameraResultType.URI) {
                camera = this;
                camera.returnFileURI(pluginCall, exifData, prepareBitmap, uri, byteArrayOutputStream);
            } else {
                camera = this;
                if (camera.settings.getResultType() == CameraResultType.DATAURL) {
                    returnDataUrl(pluginCall, exifData, byteArrayOutputStream);
                } else {
                    pluginCall.reject(INVALID_RESULT_TYPE_ERROR);
                }
            }
            camera.imageFileSavePath = null;
            camera.imageFileUri = null;
            camera.imageEditedFileSavePath = null;
        } catch (IOException unused) {
            pluginCall.reject(UNABLE_TO_PROCESS_IMAGE);
        }
    }

    private void returnFileURI(PluginCall pluginCall, ExifWrapper exifWrapper, Bitmap bitmap, Uri uri, ByteArrayOutputStream byteArrayOutputStream) {
        Uri tempImage = getTempImage(bitmap, uri, byteArrayOutputStream);
        if (tempImage != null) {
            JSObject jSObject = new JSObject();
            jSObject.put("format", "jpeg");
            jSObject.put("exif", (Object) exifWrapper.toJson());
            jSObject.put("path", tempImage.toString());
            jSObject.put("webPath", FileUtils.getPortablePath(getContext(), this.bridge.getLocalUrl(), tempImage));
            pluginCall.resolve(jSObject);
            return;
        }
        pluginCall.reject(UNABLE_TO_PROCESS_IMAGE);
    }

    private Uri getTempImage(Bitmap bitmap, Uri uri, ByteArrayOutputStream byteArrayOutputStream) {
        ByteArrayInputStream byteArrayInputStream;
        Uri uri2 = null;
        uri2 = null;
        uri2 = null;
        ByteArrayInputStream byteArrayInputStream2 = null;
        try {
            try {
                byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            } catch (IOException e) {
                com.getcapacitor.Logger.error(getLogTag(), UNABLE_TO_PROCESS_IMAGE, e);
            }
        } catch (IOException unused) {
            byteArrayInputStream = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            uri2 = saveTemporaryImage(bitmap, uri, byteArrayInputStream);
            byteArrayInputStream.close();
        } catch (IOException unused2) {
            if (byteArrayInputStream != null) {
                byteArrayInputStream.close();
            }
            return uri2;
        } catch (Throwable th2) {
            th = th2;
            byteArrayInputStream2 = byteArrayInputStream;
            if (byteArrayInputStream2 != null) {
                try {
                    byteArrayInputStream2.close();
                } catch (IOException e2) {
                    com.getcapacitor.Logger.error(getLogTag(), UNABLE_TO_PROCESS_IMAGE, e2);
                }
            }
            throw th;
        }
        return uri2;
    }

    private Bitmap prepareBitmap(Bitmap bitmap, Uri uri) throws IOException {
        if (this.settings.isShouldCorrectOrientation()) {
            bitmap = replaceBitmap(bitmap, ImageUtils.correctOrientation(getContext(), bitmap, uri));
        }
        return this.settings.isShouldResize() ? replaceBitmap(bitmap, ImageUtils.resize(bitmap, this.settings.getWidth(), this.settings.getHeight(), this.settings.getPreserveAspectRatio())) : bitmap;
    }

    private Bitmap replaceBitmap(Bitmap bitmap, Bitmap bitmap2) {
        if (bitmap != bitmap2) {
            bitmap.recycle();
        }
        return bitmap2;
    }

    private void returnDataUrl(PluginCall pluginCall, ExifWrapper exifWrapper, ByteArrayOutputStream byteArrayOutputStream) {
        String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
        JSObject jSObject = new JSObject();
        jSObject.put("format", "jpeg");
        jSObject.put("dataUrl", "data:image/jpeg;base64," + encodeToString);
        jSObject.put("exif", (Object) exifWrapper.toJson());
        pluginCall.resolve(jSObject);
    }

    private void returnBase64(PluginCall pluginCall, ExifWrapper exifWrapper, ByteArrayOutputStream byteArrayOutputStream) {
        String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
        JSObject jSObject = new JSObject();
        jSObject.put("format", "jpeg");
        jSObject.put("base64String", encodeToString);
        jSObject.put("exif", (Object) exifWrapper.toJson());
        pluginCall.resolve(jSObject);
    }

    @Override // com.getcapacitor.Plugin
    protected void handleRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.handleRequestPermissionsResult(i, strArr, iArr);
        com.getcapacitor.Logger.debug(getLogTag(), "handling request perms result");
        if (getSavedCall() == null) {
            com.getcapacitor.Logger.debug(getLogTag(), "No stored plugin call for permissions request result");
            return;
        }
        PluginCall savedCall = getSavedCall();
        for (int i2 = 0; i2 < iArr.length; i2++) {
            int i3 = iArr[i2];
            String str = strArr[i2];
            if (i3 == -1) {
                com.getcapacitor.Logger.debug(getLogTag(), "User denied camera permission: " + str);
                savedCall.error(PERMISSION_DENIED_ERROR);
                return;
            }
        }
        if (i == 9002) {
            doShow(savedCall);
        }
    }

    @Override // com.getcapacitor.Plugin
    protected void handleOnActivityResult(int i, int i2, Intent intent) {
        super.handleOnActivityResult(i, i2, intent);
        PluginCall savedCall = getSavedCall();
        if (savedCall == null) {
            return;
        }
        this.settings = getSettings(savedCall);
        if (i == 9002) {
            processCameraImage(savedCall);
            return;
        }
        if (i == 9003) {
            processPickedImage(savedCall, intent);
            return;
        }
        if (i == 9005 && i2 == -1) {
            this.isEdited = true;
            processPickedImage(savedCall, intent);
        } else {
            if (i2 != 0 || this.imageFileSavePath == null) {
                return;
            }
            this.imageEditedFileSavePath = null;
            this.isEdited = true;
            processCameraImage(savedCall);
        }
    }

    private void editImage(PluginCall pluginCall, Bitmap bitmap, Uri uri, ByteArrayOutputStream byteArrayOutputStream) {
        Uri uri2 = this.imageFileUri;
        if (uri2 == null) {
            uri2 = uri;
        }
        try {
            safedk_Camera_startActivityForResult_a27cc97a1e51ca1e9603aafc17abe3a1(this, pluginCall, createEditIntent(uri2, false), 9005);
        } catch (SecurityException unused) {
            Intent createEditIntent = createEditIntent(getTempImage(bitmap, uri, byteArrayOutputStream), true);
            if (createEditIntent != null) {
                safedk_Camera_startActivityForResult_a27cc97a1e51ca1e9603aafc17abe3a1(this, pluginCall, createEditIntent, 9005);
            } else {
                pluginCall.error(IMAGE_EDIT_ERROR);
            }
        } catch (Exception e) {
            pluginCall.error(IMAGE_EDIT_ERROR, e);
        }
    }

    private Intent createEditIntent(Uri uri, boolean z) {
        if (z) {
            try {
                uri = FileProvider.getUriForFile(getActivity(), getContext().getPackageName() + ".fileprovider", new File(uri.getPath()));
            } catch (Exception unused) {
                return null;
            }
        }
        Intent intent = new Intent("android.intent.action.EDIT");
        intent.setDataAndType(uri, "image/*");
        File createImageFile = CameraUtils.createImageFile(getActivity());
        this.imageEditedFileSavePath = createImageFile.getAbsolutePath();
        Uri fromFile = Uri.fromFile(createImageFile);
        intent.addFlags(1);
        intent.addFlags(2);
        intent.putExtra("output", fromFile);
        return intent;
    }

    @Override // com.getcapacitor.Plugin
    protected Bundle saveInstanceState() {
        Bundle saveInstanceState = super.saveInstanceState();
        saveInstanceState.putString("cameraImageFileSavePath", this.imageFileSavePath);
        return saveInstanceState;
    }

    @Override // com.getcapacitor.Plugin
    protected void restoreState(Bundle bundle) {
        String string = bundle.getString("cameraImageFileSavePath");
        if (string != null) {
            this.imageFileSavePath = string;
        }
    }
}
