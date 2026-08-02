package com.reactnativeimageresizer;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import android.util.Base64;
import android.util.Log;
import com.reactnativecommunity.clipboard.ClipboardModule;
import com.twilio.voice.EventKeys;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/* loaded from: classes4.dex */
public abstract class a {
    private static final String[] EXIF_TO_COPY_ROTATED = {"ApertureValue", "MaxApertureValue", "MeteringMode", "Artist", "BitsPerSample", "Compression", "BodySerialNumber", "BrightnessValue", "Contrast", "CameraOwnerName", "ColorSpace", "Copyright", "DateTime", "DateTimeDigitized", "DateTimeOriginal", "DeviceSettingDescription", "DigitalZoomRatio", "ExifVersion", "ExposureBiasValue", "ExposureIndex", "ExposureMode", "ExposureTime", "ExposureProgram", "Flash", "FlashEnergy", "FocalLength", "FocalLengthIn35mmFilm", "FocalPlaneResolutionUnit", "FocalPlaneXResolution", "FocalPlaneYResolution", "PhotometricInterpretation", "PlanarConfiguration", "FNumber", "GainControl", "Gamma", "GPSAltitude", "GPSAltitudeRef", "GPSAreaInformation", "GPSDateStamp", "GPSDOP", "GPSLatitude", "GPSLatitudeRef", "GPSLongitude", "GPSLongitudeRef", "GPSStatus", "GPSDestBearing", "GPSDestBearingRef", "GPSDestDistance", "GPSDestDistanceRef", "GPSDestLatitude", "GPSDestLatitudeRef", "GPSDestLongitude", "GPSDestLongitudeRef", "GPSDifferential", "GPSImgDirection", "GPSImgDirectionRef", "GPSMapDatum", "GPSMeasureMode", "GPSProcessingMethod", "GPSSatellites", "GPSSpeed", "GPSSpeedRef", "GPSStatus", "GPSTimeStamp", "GPSTrack", "GPSTrackRef", "GPSVersionID", "ImageDescription", "ImageUniqueID", "ISOSpeed", "PhotographicSensitivity", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "LensMake", "LensModel", "LensSerialNumber", "LensSpecification", "LightSource", "Make", "MakerNote", "Model", "Saturation", "Sharpness", "ShutterSpeedValue", "Software", "SubjectDistance", "SubjectDistanceRange", "SubjectLocation", "UserComment", "WhiteBalance"};

    public static int a(BitmapFactory.Options options, int i10, int i11) {
        int i12 = options.outHeight;
        int i13 = options.outWidth;
        int i14 = 1;
        if (i12 <= i11 && i13 <= i10) {
            return 1;
        }
        int i15 = i12 / 2;
        int i16 = i13 / 2;
        while (i15 / i14 >= i11 && i16 / i14 >= i10) {
            i14 *= 2;
        }
        return i14;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033 A[Catch: Exception -> 0x003f, TryCatch #0 {Exception -> 0x003f, blocks: (B:14:0x002d, B:16:0x0033, B:18:0x003b, B:20:0x0041, B:23:0x0044), top: B:13:0x002d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean b(Context context, Uri uri, String str) {
        androidx.exifinterface.media.a aVar;
        File d10;
        androidx.exifinterface.media.a aVar2 = null;
        try {
            d10 = d(context, uri);
        } catch (Exception e10) {
            e = e10;
            aVar = null;
        }
        if (!d10.exists()) {
            return false;
        }
        aVar = new androidx.exifinterface.media.a(d10.getAbsolutePath());
        try {
            aVar2 = new androidx.exifinterface.media.a(str);
        } catch (Exception e11) {
            e = e11;
            Log.e("ImageResizer::copyExif", "EXIF read failed", e);
            if (aVar != null) {
                try {
                    while (r3 < r8) {
                    }
                    aVar2.W();
                    return true;
                } catch (Exception e12) {
                    Log.e("ImageResizer::copyExif", "EXIF copy failed", e12);
                }
            }
            return false;
        }
        if (aVar != null && aVar2 != null) {
            for (String str2 : EXIF_TO_COPY_ROTATED) {
                String h10 = aVar.h(str2);
                if (h10 != null) {
                    aVar2.a0(str2, h10);
                }
            }
            aVar2.W();
            return true;
        }
        return false;
    }

    public static Bitmap c(Context context, Uri uri, int i10, int i11, int i12, int i13, String str, boolean z10) {
        String scheme = uri.getScheme();
        Bitmap i14 = (scheme == null || scheme.equalsIgnoreCase("file") || scheme.equalsIgnoreCase("content")) ? i(context, uri, i10, i11) : (scheme.equalsIgnoreCase("http") || scheme.equalsIgnoreCase("https")) ? j(uri, i10, i11) : scheme.equalsIgnoreCase(EventKeys.DATA) ? h(uri) : null;
        if (i14 == null) {
            throw new IOException("Unable to load source image from path");
        }
        Bitmap l10 = l(i14, e(context, uri), i13);
        if (l10 == null) {
            throw new IOException("Unable to rotate image. Most likely due to not enough memory.");
        }
        if (l10 != i14) {
            i14.recycle();
        }
        Bitmap k10 = k(l10, i10, i11, str, z10);
        if (k10 == null) {
            throw new IOException("Unable to resize image. Most likely due to not enough memory.");
        }
        if (k10 != l10) {
            l10.recycle();
        }
        return k10;
    }

    public static File d(Context context, Uri uri) {
        File file = new File(uri.getPath());
        if (!file.exists()) {
            Cursor cursor = null;
            try {
                cursor = context.getContentResolver().query(uri, new String[]{"_data"}, null, null, null);
                int columnIndexOrThrow = cursor.getColumnIndexOrThrow("_data");
                cursor.moveToFirst();
                File file2 = new File(cursor.getString(columnIndexOrThrow));
                cursor.close();
                return file2;
            } catch (Exception unused) {
                if (cursor != null) {
                    cursor.close();
                }
            } catch (Throwable th2) {
                if (cursor == null) {
                    throw th2;
                }
                cursor.close();
                throw th2;
            }
        }
        return file;
    }

    public static Matrix e(Context context, Uri uri) {
        try {
            return f(new androidx.exifinterface.media.a(context.getContentResolver().openInputStream(uri)));
        } catch (Exception unused) {
            return new Matrix();
        }
    }

    public static Matrix f(androidx.exifinterface.media.a aVar) {
        Matrix matrix = new Matrix();
        switch (aVar.i("Orientation", 0)) {
            case 2:
                matrix.setScale(-1.0f, 1.0f);
                break;
            case 3:
                matrix.setRotate(180.0f);
                break;
            case 4:
                matrix.setRotate(180.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 5:
                matrix.setRotate(90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 6:
                matrix.setRotate(90.0f);
                break;
            case 7:
                matrix.setRotate(270.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 8:
                matrix.setRotate(270.0f);
                break;
        }
        return matrix;
    }

    public static Bitmap g(Context context, Uri uri, BitmapFactory.Options options) {
        String scheme = uri.getScheme();
        if (scheme == null || !scheme.equalsIgnoreCase("content")) {
            try {
                return BitmapFactory.decodeFile(uri.getPath(), options);
            } catch (Exception e10) {
                e10.printStackTrace();
                throw new IOException("Error decoding image file");
            }
        }
        InputStream openInputStream = context.getContentResolver().openInputStream(uri);
        if (openInputStream == null) {
            return null;
        }
        Bitmap decodeStream = BitmapFactory.decodeStream(openInputStream, null, options);
        openInputStream.close();
        return decodeStream;
    }

    public static Bitmap h(Uri uri) {
        String schemeSpecificPart = uri.getSchemeSpecificPart();
        int indexOf = schemeSpecificPart.indexOf(44);
        if (indexOf == -1) {
            return null;
        }
        String lowerCase = schemeSpecificPart.substring(0, indexOf).replace('\\', '/').toLowerCase();
        boolean startsWith = lowerCase.startsWith(ClipboardModule.MIMETYPE_JPEG);
        boolean z10 = !startsWith && lowerCase.startsWith(ClipboardModule.MIMETYPE_PNG);
        if (!startsWith && !z10) {
            return null;
        }
        byte[] decode = Base64.decode(schemeSpecificPart.substring(indexOf + 1), 0);
        return BitmapFactory.decodeByteArray(decode, 0, decode.length);
    }

    public static Bitmap i(Context context, Uri uri, int i10, int i11) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        g(context, uri, options);
        options.inSampleSize = a(options, i10, i11);
        options.inJustDecodeBounds = false;
        return g(context, uri, options);
    }

    public static Bitmap j(Uri uri, int i10, int i11) {
        InputStream inputStream = null;
        Bitmap decodeByteArray = null;
        inputStream = null;
        try {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri.toString()).openConnection();
                httpURLConnection.connect();
                InputStream inputStream2 = httpURLConnection.getInputStream();
                if (inputStream2 != null) {
                    try {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        byte[] bArr = new byte[1024];
                        while (true) {
                            try {
                                int read = inputStream2.read(bArr, 0, 1024);
                                if (read == -1) {
                                    break;
                                }
                                byteArrayOutputStream.write(bArr, 0, read);
                            } catch (Throwable th2) {
                                byteArrayOutputStream.close();
                                throw th2;
                            }
                        }
                        byteArrayOutputStream.flush();
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
                        options.inSampleSize = a(options, i10, i11);
                        options.inJustDecodeBounds = false;
                        decodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
                    } catch (Exception e10) {
                        e = e10;
                        inputStream = inputStream2;
                        e.printStackTrace();
                        throw new IOException("Error fetching remote image file.");
                    } catch (Throwable th3) {
                        th = th3;
                        inputStream = inputStream2;
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException e11) {
                                e11.printStackTrace();
                            }
                        }
                        throw th;
                    }
                }
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                        return decodeByteArray;
                    } catch (IOException e12) {
                        e12.printStackTrace();
                    }
                }
                return decodeByteArray;
            } catch (Exception e13) {
                e = e13;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public static Bitmap k(Bitmap bitmap, int i10, int i11, String str, boolean z10) {
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (i11 > 0 && i10 > 0) {
            if (!str.equals("stretch")) {
                float f10 = width;
                float f11 = i10 / f10;
                float f12 = height;
                float f13 = i11 / f12;
                float max = str.equals("cover") ? Math.max(f11, f13) : Math.min(f11, f13);
                if (z10) {
                    max = Math.min(max, 1.0f);
                }
                int round = Math.round(f10 * max);
                i11 = Math.round(f12 * max);
                i10 = round;
            } else if (z10) {
                i10 = Math.min(width, i10);
                i11 = Math.min(height, i11);
            }
            try {
                return Bitmap.createScaledBitmap(bitmap, i10, i11, true);
            } catch (OutOfMemoryError unused) {
            }
        }
        return null;
    }

    public static Bitmap l(Bitmap bitmap, Matrix matrix, float f10) {
        matrix.postRotate(f10);
        try {
            return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        } catch (OutOfMemoryError unused) {
            return null;
        }
    }

    public static File m(Bitmap bitmap, File file, String str, Bitmap.CompressFormat compressFormat, int i10) {
        if (bitmap == null) {
            throw new IOException("The bitmap couldn't be resized");
        }
        File file2 = new File(file, str + "." + compressFormat.name());
        if (!file2.createNewFile()) {
            throw new IOException("The file already exists");
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(compressFormat, i10, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.flush();
        byteArrayOutputStream.close();
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        fileOutputStream.write(byteArray);
        fileOutputStream.flush();
        fileOutputStream.close();
        return file2;
    }
}
