package kc;

import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.util.Base64;
import android.util.Log;
import android.webkit.MimeTypeMap;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.PromiseImpl;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.modules.core.PermissionAwareActivity;
import com.facebook.react.modules.core.PermissionListener;
import com.twilio.voice.EventKeys;
import com.yalantis.ucrop.a;
import j.f;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import k.f;
import l0.AbstractC5338c;
import l0.AbstractC5339d;
import lb.C5444x;

/* renamed from: kc.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5247g implements ActivityEventListener {

    /* renamed from: A, reason: collision with root package name */
    public ReactApplicationContext f54433A;

    /* renamed from: n, reason: collision with root package name */
    public ReadableMap f54447n;

    /* renamed from: w, reason: collision with root package name */
    public Uri f54456w;

    /* renamed from: x, reason: collision with root package name */
    public String f54457x;

    /* renamed from: a, reason: collision with root package name */
    public String f54434a = "any";

    /* renamed from: b, reason: collision with root package name */
    public boolean f54435b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f54436c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f54437d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f54438e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f54439f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f54440g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f54441h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f54442i = true;

    /* renamed from: j, reason: collision with root package name */
    public boolean f54443j = false;

    /* renamed from: k, reason: collision with root package name */
    public boolean f54444k = false;

    /* renamed from: l, reason: collision with root package name */
    public boolean f54445l = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f54446m = false;

    /* renamed from: o, reason: collision with root package name */
    public String f54448o = null;

    /* renamed from: p, reason: collision with root package name */
    public String f54449p = null;

    /* renamed from: q, reason: collision with root package name */
    public String f54450q = null;

    /* renamed from: r, reason: collision with root package name */
    public String f54451r = null;

    /* renamed from: s, reason: collision with root package name */
    public String f54452s = null;

    /* renamed from: t, reason: collision with root package name */
    public int f54453t = 0;

    /* renamed from: u, reason: collision with root package name */
    public int f54454u = 0;

    /* renamed from: v, reason: collision with root package name */
    public int f54455v = 5;

    /* renamed from: y, reason: collision with root package name */
    public k f54458y = new k();

    /* renamed from: z, reason: collision with root package name */
    public C5241a f54459z = new C5241a();

    /* renamed from: kc.g$a */
    public class a implements Callable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C5247g f54460a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Activity f54461b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Promise f54462c;

        public a(C5247g c5247g, Activity activity, Promise promise) {
            this.f54460a = c5247g;
            this.f54461b = activity;
            this.f54462c = promise;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            File file;
            try {
                file = new File(this.f54460a.y(this.f54461b));
            } catch (Exception e10) {
                e10.printStackTrace();
                this.f54462c.reject("E_ERROR_WHILE_CLEANING_FILES", e10.getMessage());
            }
            if (!file.exists()) {
                throw new Exception("File does not exist");
            }
            this.f54460a.q(file);
            this.f54462c.resolve(null);
            return null;
        }
    }

    /* renamed from: kc.g$b */
    public class b implements Callable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f54464a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C5247g f54465b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Promise f54466c;

        public b(String str, C5247g c5247g, Promise promise) {
            this.f54464a = str;
            this.f54465b = c5247g;
            this.f54466c = promise;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            String str;
            File file;
            try {
                str = this.f54464a;
                if (str.startsWith("file://")) {
                    str = str.substring(7);
                }
                file = new File(str);
            } catch (Exception e10) {
                e10.printStackTrace();
                this.f54466c.reject("E_ERROR_WHILE_CLEANING_FILES", e10.getMessage());
            }
            if (file.exists()) {
                this.f54465b.q(file);
                this.f54466c.resolve(null);
                return null;
            }
            throw new Exception("File does not exist. Path: " + str);
        }
    }

    /* renamed from: kc.g$c */
    public class c implements PermissionListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Promise f54468a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Callable f54469b;

        public c(Promise promise, Callable callable) {
            this.f54468a = promise;
            this.f54469b = callable;
        }

        @Override // com.facebook.react.modules.core.PermissionListener
        public boolean onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
            if (i10 == 1) {
                for (int i11 = 0; i11 < strArr.length; i11++) {
                    String str = strArr[i11];
                    if (iArr[i11] == -1) {
                        if (str.equals("android.permission.CAMERA")) {
                            this.f54468a.reject("E_NO_CAMERA_PERMISSION", "User did not grant camera permission.");
                        } else if (str.equals("android.permission.WRITE_EXTERNAL_STORAGE")) {
                            this.f54468a.reject("E_NO_LIBRARY_PERMISSION", "User did not grant library permission.");
                        } else {
                            this.f54468a.reject("E_NO_LIBRARY_PERMISSION", "Required permission missing");
                        }
                        return true;
                    }
                }
                try {
                    this.f54469b.call();
                } catch (Exception e10) {
                    this.f54468a.reject("E_CALLBACK_ERROR", "Unknown error", e10);
                }
            }
            return true;
        }
    }

    /* renamed from: kc.g$d */
    public class d implements Callable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Activity f54471a;

        public d(Activity activity) {
            this.f54471a = activity;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            C5247g.this.C(this.f54471a);
            return null;
        }
    }

    /* renamed from: kc.g$e */
    public class e implements Callable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Activity f54473a;

        public e(Activity activity) {
            this.f54473a = activity;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            C5247g.this.D(this.f54473a);
            return null;
        }
    }

    /* renamed from: kc.g$f */
    public class f implements Callable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Activity f54475a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Uri f54476b;

        public f(Activity activity, Uri uri) {
            this.f54475a = activity;
            this.f54476b = uri;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            C5247g.this.O(this.f54475a, this.f54476b);
            return null;
        }
    }

    public C5247g(ReactApplicationContext reactApplicationContext) {
        this.f54433A = reactApplicationContext;
        reactApplicationContext.addActivityEventListener(this);
    }

    public static Long A(String str) {
        try {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(str);
            return Long.valueOf(Long.parseLong(mediaMetadataRetriever.extractMetadata(9)));
        } catch (Exception unused) {
            return -1L;
        }
    }

    public static WritableMap t(Intent intent) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putInt(C5444x.f55808b, intent.getIntExtra("com.yalantis.ucrop.OffsetX", -1));
        writableNativeMap.putInt("y", intent.getIntExtra("com.yalantis.ucrop.OffsetY", -1));
        writableNativeMap.putInt("width", intent.getIntExtra("com.yalantis.ucrop.ImageWidth", -1));
        writableNativeMap.putInt("height", intent.getIntExtra("com.yalantis.ucrop.ImageHeight", -1));
        return writableNativeMap;
    }

    public final void B(Activity activity, int i10, int i11, Intent intent) {
        ClipData clipData;
        if (i11 == 0) {
            this.f54458y.b("E_PICKER_CANCELLED", "User cancelled image selection");
            return;
        }
        if (i11 == -1) {
            if (this.f54435b) {
                ClipData clipData2 = intent.getClipData();
                try {
                    if (clipData2 == null) {
                        this.f54458y.e(1);
                        r(activity, intent.getData(), false);
                        return;
                    }
                    this.f54458y.e(clipData2.getItemCount());
                    for (int i12 = 0; i12 < clipData2.getItemCount(); i12++) {
                        r(activity, clipData2.getItemAt(i12).getUri(), false);
                    }
                    return;
                } catch (Exception e10) {
                    this.f54458y.b("E_NO_IMAGE_DATA_FOUND", e10.getMessage());
                    return;
                }
            }
            Uri data = intent.getData();
            if (data == null && (clipData = intent.getClipData()) != null && clipData.getItemCount() > 0) {
                data = clipData.getItemAt(0).getUri();
            }
            if (data == null) {
                this.f54458y.b("E_NO_IMAGE_DATA_FOUND", "Cannot resolve image url");
                return;
            }
            if (this.f54438e) {
                O(activity, data);
                return;
            }
            try {
                r(activity, data, false);
            } catch (Exception e11) {
                this.f54458y.b("E_NO_IMAGE_DATA_FOUND", e11.getMessage());
            }
        }
    }

    public final void C(Activity activity) {
        String str;
        File n10;
        try {
            if (this.f54434a.equals("video")) {
                str = "android.media.action.VIDEO_CAPTURE";
                n10 = o();
            } else {
                str = "android.media.action.IMAGE_CAPTURE";
                n10 = n();
            }
            Intent intent = new Intent(str);
            Uri uriForFile = AbstractC5339d.getUriForFile(activity, activity.getApplicationContext().getPackageName() + ".provider", n10);
            this.f54456w = uriForFile;
            intent.putExtra("output", uriForFile);
            if (this.f54446m) {
                intent.putExtra("android.intent.extras.CAMERA_FACING", 1);
                intent.putExtra("android.intent.extras.LENS_FACING_FRONT", 1);
                intent.putExtra("android.intent.extra.USE_FRONT_CAMERA", true);
            }
            if (intent.resolveActivity(activity.getPackageManager()) == null) {
                this.f54458y.b("E_CANNOT_LAUNCH_CAMERA", "Cannot launch camera");
            } else {
                activity.startActivityForResult(intent, 61111);
            }
        } catch (Exception e10) {
            this.f54458y.c("E_FAILED_TO_OPEN_CAMERA", e10);
        }
    }

    public final void D(Activity activity) {
        try {
            f.a aVar = new f.a();
            if (this.f54434a.equals("video")) {
                aVar.e(f.e.f54003a);
            } else {
                if (!this.f54434a.equals("photo") && !this.f54438e) {
                    aVar.e(f.c.f54001a);
                }
                aVar.e(f.d.f54002a);
            }
            activity.startActivityForResult(this.f54435b ? new k.d(this.f54455v).createIntent(activity, aVar.a()) : new k.f().createIntent(activity, aVar.a()), 61110);
        } catch (Exception e10) {
            this.f54458y.c("E_FAILED_TO_SHOW_PICKER", e10);
        }
    }

    public final boolean E(Activity activity) {
        return activity.getPackageManager().hasSystemFeature("android.hardware.camera") || activity.getPackageManager().hasSystemFeature("android.hardware.camera.any");
    }

    public final /* synthetic */ void F(String str, Object[] objArr) {
        String str2 = (String) objArr[0];
        try {
            Bitmap Q10 = Q(Uri.fromFile(new File(str2)));
            long lastModified = new File(str2).lastModified();
            long longValue = A(str2).longValue();
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putInt("width", Q10.getWidth());
            writableNativeMap.putInt("height", Q10.getHeight());
            writableNativeMap.putString("mime", str);
            writableNativeMap.putInt("size", (int) new File(str2).length());
            writableNativeMap.putInt("duration", (int) longValue);
            writableNativeMap.putString("path", "file://" + str2);
            writableNativeMap.putString("modificationDate", String.valueOf(lastModified));
            this.f54458y.d(writableNativeMap);
        } catch (Exception e10) {
            this.f54458y.c("E_NO_IMAGE_DATA_FOUND", e10);
        }
    }

    public final /* synthetic */ void G(Object[] objArr) {
        WritableNativeMap writableNativeMap = (WritableNativeMap) objArr[0];
        this.f54458y.b(writableNativeMap.getString(EventKeys.ERROR_CODE), writableNativeMap.getString("message"));
    }

    public final /* synthetic */ void H(Activity activity, String str, String str2, final String str3) {
        this.f54459z.d(activity, this.f54447n, str, str2, new PromiseImpl(new Callback() { // from class: kc.e
            @Override // com.facebook.react.bridge.Callback
            public final void invoke(Object[] objArr) {
                C5247g.this.F(str3, objArr);
            }
        }, new Callback() { // from class: kc.f
            @Override // com.facebook.react.bridge.Callback
            public final void invoke(Object[] objArr) {
                C5247g.this.G(objArr);
            }
        }));
    }

    public void I(ReadableMap readableMap, Promise promise) {
        Activity currentActivity = this.f54433A.getCurrentActivity();
        if (currentActivity == null) {
            promise.reject("E_ACTIVITY_DOES_NOT_EXIST", "Activity doesn't exist");
        } else {
            if (!E(currentActivity)) {
                promise.reject("E_CAMERA_IS_NOT_AVAILABLE", "Camera not available");
                return;
            }
            N(readableMap);
            this.f54458y.f(promise, false);
            L(currentActivity, promise, Arrays.asList("android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"), new d(currentActivity));
        }
    }

    public void J(ReadableMap readableMap, Promise promise) {
        Activity currentActivity = this.f54433A.getCurrentActivity();
        if (currentActivity == null) {
            promise.reject("E_ACTIVITY_DOES_NOT_EXIST", "Activity doesn't exist");
            return;
        }
        N(readableMap);
        this.f54458y.f(promise, false);
        L(currentActivity, promise, Collections.singletonList("android.permission.WRITE_EXTERNAL_STORAGE"), new f(currentActivity, Uri.parse(readableMap.getString("path"))));
    }

    public void K(ReadableMap readableMap, Promise promise) {
        Activity currentActivity = this.f54433A.getCurrentActivity();
        if (currentActivity == null) {
            promise.reject("E_ACTIVITY_DOES_NOT_EXIST", "Activity doesn't exist");
            return;
        }
        N(readableMap);
        this.f54458y.f(promise, this.f54435b);
        L(currentActivity, promise, Collections.singletonList("android.permission.WRITE_EXTERNAL_STORAGE"), new e(currentActivity));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void L(Activity activity, Promise promise, List list, Callable callable) {
        ArrayList arrayList = new ArrayList();
        ArrayList<String> arrayList2 = new ArrayList(list);
        if (Build.VERSION.SDK_INT > 29) {
            arrayList2.remove("android.permission.WRITE_EXTERNAL_STORAGE");
        }
        for (String str : arrayList2) {
            if (AbstractC5338c.checkSelfPermission(activity, str) != 0) {
                arrayList.add(str);
            }
        }
        if (!arrayList.isEmpty()) {
            ((PermissionAwareActivity) activity).requestPermissions((String[]) arrayList.toArray(new String[arrayList.size()]), 1, new c(promise, callable));
            return;
        }
        try {
            callable.call();
        } catch (Exception e10) {
            promise.reject("E_CALLBACK_ERROR", "Unknown error", e10);
        }
    }

    public final String M(Activity activity, Uri uri, boolean z10) {
        String path = z10 ? Uri.parse(this.f54457x).getPath() : AbstractC5250j.b(activity, uri);
        if (Build.VERSION.SDK_INT >= 29) {
            String type = activity.getContentResolver().getType(uri);
            if (type != null && type.startsWith("video/")) {
                return AbstractC5250j.b(activity, uri);
            }
            String path2 = Uri.fromFile(activity.getExternalCacheDir()).getPath();
            String path3 = Uri.fromFile(activity.getExternalFilesDir(null)).getPath();
            String path4 = Uri.fromFile(activity.getCacheDir()).getPath();
            String path5 = Uri.fromFile(activity.getFilesDir()).getPath();
            if (!path.startsWith(path2) && !path.startsWith(path3) && !path.startsWith(path4) && !path.startsWith(path5)) {
                return AbstractC5250j.b(activity, Uri.fromFile(m(activity, uri)));
            }
        }
        return path;
    }

    public final void N(ReadableMap readableMap) {
        this.f54434a = readableMap.hasKey("mediaType") ? readableMap.getString("mediaType") : "any";
        this.f54435b = readableMap.hasKey("multiple") && readableMap.getBoolean("multiple");
        this.f54436c = readableMap.hasKey("includeBase64") && readableMap.getBoolean("includeBase64");
        this.f54437d = readableMap.hasKey("includeExif") && readableMap.getBoolean("includeExif");
        this.f54453t = readableMap.hasKey("width") ? readableMap.getInt("width") : 0;
        this.f54454u = readableMap.hasKey("height") ? readableMap.getInt("height") : 0;
        this.f54455v = readableMap.hasKey("maxFiles") ? readableMap.getInt("maxFiles") : this.f54455v;
        this.f54438e = readableMap.hasKey("cropping") && readableMap.getBoolean("cropping");
        this.f54448o = readableMap.hasKey("cropperActiveWidgetColor") ? readableMap.getString("cropperActiveWidgetColor") : null;
        this.f54449p = readableMap.hasKey("cropperStatusBarColor") ? readableMap.getString("cropperStatusBarColor") : null;
        this.f54450q = readableMap.hasKey("cropperToolbarColor") ? readableMap.getString("cropperToolbarColor") : null;
        this.f54451r = readableMap.hasKey("cropperToolbarTitle") ? readableMap.getString("cropperToolbarTitle") : null;
        this.f54452s = readableMap.hasKey("cropperToolbarWidgetColor") ? readableMap.getString("cropperToolbarWidgetColor") : null;
        this.f54439f = readableMap.hasKey("cropperCircleOverlay") && readableMap.getBoolean("cropperCircleOverlay");
        this.f54440g = readableMap.hasKey("freeStyleCropEnabled") && readableMap.getBoolean("freeStyleCropEnabled");
        this.f54441h = !readableMap.hasKey("showCropGuidelines") || readableMap.getBoolean("showCropGuidelines");
        this.f54442i = !readableMap.hasKey("showCropFrame") || readableMap.getBoolean("showCropFrame");
        this.f54443j = readableMap.hasKey("hideBottomControls") && readableMap.getBoolean("hideBottomControls");
        this.f54444k = readableMap.hasKey("enableRotationGesture") && readableMap.getBoolean("enableRotationGesture");
        this.f54445l = readableMap.hasKey("disableCropperColorSetters") && readableMap.getBoolean("disableCropperColorSetters");
        this.f54446m = readableMap.hasKey("useFrontCamera") && readableMap.getBoolean("useFrontCamera");
        this.f54447n = readableMap;
    }

    public final void O(Activity activity, Uri uri) {
        int i10;
        a.C0602a c0602a = new a.C0602a();
        c0602a.e(Bitmap.CompressFormat.JPEG);
        c0602a.f(100);
        c0602a.d(this.f54439f);
        c0602a.g(this.f54440g);
        c0602a.j(this.f54441h);
        c0602a.i(this.f54442i);
        c0602a.h(this.f54443j);
        String str = this.f54451r;
        if (str != null) {
            c0602a.m(str);
        }
        if (this.f54444k) {
            c0602a.c(3, 3, 3);
        }
        if (!this.f54445l) {
            l(c0602a);
        }
        com.yalantis.ucrop.a g10 = com.yalantis.ucrop.a.c(uri, Uri.fromFile(new File(y(activity), UUID.randomUUID().toString() + ".jpg"))).g(c0602a);
        int i11 = this.f54453t;
        if (i11 > 0 && (i10 = this.f54454u) > 0) {
            g10.f(i11, i10);
        }
        g10.d(activity);
    }

    public final BitmapFactory.Options P(String str) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        options.inDither = true;
        BitmapFactory.decodeFile(str, options);
        if (options.outMimeType == null || options.outWidth == 0 || options.outHeight == 0) {
            throw new Exception("Invalid image selected");
        }
        return options;
    }

    public final Bitmap Q(Uri uri) {
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mediaMetadataRetriever.setDataSource(this.f54433A.getCurrentActivity(), uri);
        Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime();
        if (frameAtTime == null) {
            throw new Exception("Cannot retrieve video data");
        }
        mediaMetadataRetriever.release();
        return frameAtTime;
    }

    public final void i(Activity activity, int i10, int i11, Intent intent) {
        if (i11 == 0) {
            this.f54458y.b("E_PICKER_CANCELLED", "User cancelled image selection");
            return;
        }
        if (i11 == -1) {
            Uri uri = this.f54456w;
            if (uri == null) {
                this.f54458y.b("E_NO_IMAGE_DATA_FOUND", "Cannot resolve image url");
                return;
            }
            if (this.f54438e) {
                new a.C0602a().e(Bitmap.CompressFormat.JPEG);
                O(activity, uri);
                return;
            }
            try {
                this.f54458y.e(1);
                WritableMap x10 = x(activity, uri, true);
                if (x10 != null) {
                    this.f54458y.d(x10);
                }
            } catch (Exception e10) {
                this.f54458y.b("E_NO_IMAGE_DATA_FOUND", e10.getMessage());
            }
        }
    }

    public void j(Promise promise) {
        Activity currentActivity = this.f54433A.getCurrentActivity();
        if (currentActivity == null) {
            promise.reject("E_ACTIVITY_DOES_NOT_EXIST", "Activity doesn't exist");
        } else {
            L(currentActivity, promise, Collections.singletonList("android.permission.WRITE_EXTERNAL_STORAGE"), new a(this, currentActivity, promise));
        }
    }

    public void k(String str, Promise promise) {
        if (str == null) {
            promise.reject("E_ERROR_WHILE_CLEANING_FILES", "Cannot cleanup empty path");
            return;
        }
        Activity currentActivity = this.f54433A.getCurrentActivity();
        if (currentActivity == null) {
            promise.reject("E_ACTIVITY_DOES_NOT_EXIST", "Activity doesn't exist");
        } else {
            L(currentActivity, promise, Collections.singletonList("android.permission.WRITE_EXTERNAL_STORAGE"), new b(str, this, promise));
        }
    }

    public final void l(a.C0602a c0602a) {
        String str = this.f54448o;
        if (str != null) {
            c0602a.b(Color.parseColor(str));
        }
        String str2 = this.f54450q;
        if (str2 != null) {
            c0602a.l(Color.parseColor(str2));
        }
        String str3 = this.f54449p;
        if (str3 != null) {
            c0602a.k(Color.parseColor(str3));
        }
        String str4 = this.f54452s;
        if (str4 != null) {
            c0602a.n(Color.parseColor(str4));
        }
    }

    public final File m(Context context, Uri uri) {
        InputStream openInputStream = context.getContentResolver().openInputStream(uri);
        String u10 = u(context, uri);
        File file = new File(context.getExternalCacheDir(), "/temp/" + System.currentTimeMillis() + "." + u10);
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[openInputStream.available()];
            openInputStream.read(bArr);
            fileOutputStream.write(bArr);
            openInputStream.close();
            fileOutputStream.close();
            return file;
        } catch (IOException e10) {
            Log.w("image-crop-picker", "Error writing " + file, e10);
            return file;
        }
    }

    public final File n() {
        String str = "image-" + UUID.randomUUID().toString();
        File externalFilesDir = this.f54433A.getExternalFilesDir(Environment.DIRECTORY_PICTURES);
        if (!externalFilesDir.exists() && !externalFilesDir.isDirectory()) {
            externalFilesDir.mkdirs();
        }
        File createTempFile = File.createTempFile(str, ".jpg", externalFilesDir);
        this.f54457x = "file:" + createTempFile.getAbsolutePath();
        return createTempFile;
    }

    public final File o() {
        String str = "video-" + UUID.randomUUID().toString();
        File externalFilesDir = this.f54433A.getExternalFilesDir(Environment.DIRECTORY_PICTURES);
        if (!externalFilesDir.exists() && !externalFilesDir.isDirectory()) {
            externalFilesDir.mkdirs();
        }
        File createTempFile = File.createTempFile(str, ".mp4", externalFilesDir);
        this.f54457x = "file:" + createTempFile.getAbsolutePath();
        return createTempFile;
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onActivityResult(Activity activity, int i10, int i11, Intent intent) {
        if (i10 == 61110) {
            B(activity, i10, i11, intent);
        } else if (i10 == 61111) {
            i(activity, i10, i11, intent);
        } else if (i10 == 69) {
            p(activity, i10, i11, intent);
        }
    }

    public final void p(Activity activity, int i10, int i11, Intent intent) {
        File file;
        if (intent == null) {
            this.f54458y.b("E_PICKER_CANCELLED", "User cancelled image selection");
            return;
        }
        Uri b10 = com.yalantis.ucrop.a.b(intent);
        if (b10 == null) {
            this.f54458y.b("E_NO_IMAGE_DATA_FOUND", "Cannot find image data");
            return;
        }
        try {
            if (this.f54453t > 0 && this.f54454u > 0) {
                try {
                    C5241a c5241a = this.f54459z;
                    ReactApplicationContext reactApplicationContext = this.f54433A;
                    String path = b10.getPath();
                    int i12 = this.f54453t;
                    int i13 = this.f54454u;
                    file = c5241a.e(reactApplicationContext, path, i12, i13, i12, i13, 100);
                } catch (OutOfMemoryError e10) {
                    this.f54458y.b("E_LOW_MEMORY_ERROR", e10.getMessage());
                    file = null;
                }
                b10 = Uri.fromFile(file);
            }
            WritableMap x10 = x(activity, b10, false);
            if (x10 == null) {
                throw new Exception("Cannot crop video files");
            }
            x10.putMap("cropRect", t(intent));
            this.f54458y.e(1);
            this.f54458y.d(x10);
        } catch (Exception e11) {
            this.f54458y.b("E_NO_IMAGE_DATA_FOUND", e11.getMessage());
        }
    }

    public final void q(File file) {
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                q(file2);
            }
        }
        file.delete();
    }

    public final void r(Activity activity, Uri uri, boolean z10) {
        String M10 = M(activity, uri, z10);
        if (M10 == null || M10.isEmpty()) {
            this.f54458y.b("E_NO_IMAGE_DATA_FOUND", "Cannot resolve asset path.");
            return;
        }
        String w10 = w(M10);
        if (w10 == null || !w10.startsWith("video/")) {
            this.f54458y.d(v(activity, M10));
        } else {
            z(activity, M10, w10);
        }
    }

    public final String s(String str) {
        try {
            FileInputStream fileInputStream = new FileInputStream(str);
            byte[] bArr = new byte[8192];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                try {
                    int read = fileInputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                } catch (IOException e10) {
                    e10.printStackTrace();
                }
            }
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
        } catch (FileNotFoundException e11) {
            e11.printStackTrace();
            return null;
        }
    }

    public String u(Context context, Uri uri) {
        return uri.getScheme().equals("content") ? MimeTypeMap.getSingleton().getExtensionFromMimeType(context.getContentResolver().getType(uri)) : MimeTypeMap.getFileExtensionFromUrl(Uri.fromFile(new File(uri.getPath())).toString());
    }

    public final WritableMap v(Activity activity, String str) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        if (str.startsWith("http://") || str.startsWith("https://")) {
            throw new Exception("Cannot select remote files");
        }
        BitmapFactory.Options P10 = P(str);
        boolean z10 = true;
        int i10 = new androidx.exifinterface.media.a(str).i("Orientation", 1);
        if (i10 != 6 && i10 != 8 && i10 != 5 && i10 != 7) {
            z10 = false;
        }
        String path = this.f54459z.c(this.f54433A, this.f54447n, str, P10).getPath();
        BitmapFactory.Options P11 = P(path);
        long lastModified = new File(str).lastModified();
        writableNativeMap.putString("path", "file://" + path);
        writableNativeMap.putInt("width", z10 ? P11.outHeight : P11.outWidth);
        writableNativeMap.putInt("height", z10 ? P11.outWidth : P11.outHeight);
        writableNativeMap.putString("mime", P11.outMimeType);
        writableNativeMap.putInt("size", (int) new File(path).length());
        writableNativeMap.putString("modificationDate", String.valueOf(lastModified));
        writableNativeMap.putString("filename", new File(str).getName());
        if (this.f54436c) {
            writableNativeMap.putString(EventKeys.DATA, s(path));
        }
        if (this.f54437d) {
            try {
                writableNativeMap.putMap("exif", AbstractC5242b.a(str));
                return writableNativeMap;
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return writableNativeMap;
    }

    public final String w(String str) {
        Uri fromFile = Uri.fromFile(new File(str));
        if (fromFile.getScheme().equals("content")) {
            return this.f54433A.getContentResolver().getType(fromFile);
        }
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(fromFile.toString());
        if (fileExtensionFromUrl != null) {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl.toLowerCase());
        }
        return null;
    }

    public final WritableMap x(Activity activity, Uri uri, boolean z10) {
        String M10 = M(activity, uri, z10);
        if (M10 == null || M10.isEmpty()) {
            throw new Exception("Cannot resolve asset path.");
        }
        String w10 = w(M10);
        if (w10 == null || !w10.startsWith("video/")) {
            return v(activity, M10);
        }
        z(activity, M10, w10);
        return null;
    }

    public final String y(Activity activity) {
        String str = activity.getCacheDir() + "/react-native-image-crop-picker";
        new File(str).mkdir();
        return str;
    }

    public final void z(final Activity activity, final String str, final String str2) {
        Q(Uri.parse(str));
        final String str3 = y(activity) + "/" + UUID.randomUUID().toString() + ".mp4";
        new Thread(new Runnable() { // from class: kc.d
            @Override // java.lang.Runnable
            public final void run() {
                C5247g.this.H(activity, str, str3, str2);
            }
        }).start();
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onNewIntent(Intent intent) {
    }
}
