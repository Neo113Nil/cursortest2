package com.vk.stories;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.SparseArray;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.media.MediaUtils;
import com.vk.media.model.CameraVideoEncoderParameters;
import com.vk.stories.StoriesVideoEncoder;
import com.vk.stories.d;
import com.vk.upload.impl.tasks.cover.CoverVideoUploadTask;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.text.Regex;
import xsna.e43;
import xsna.gi9;
import xsna.kd7;
import xsna.lht;
import xsna.r290;
import xsna.uq10;
import xsna.vhk0;

/* compiled from: StoriesProcessor.kt */
/* loaded from: classes6.dex */
public final class b {
    public static final b a = new b();

    public static StoriesVideoEncoder.b a(d.a aVar, CameraVideoEncoderParameters cameraVideoEncoderParameters, gi9 gi9Var) {
        StoriesVideoEncoder.StoriesEncoderParameters a2 = new d(aVar, cameraVideoEncoderParameters).a();
        File file = cameraVideoEncoderParameters.c;
        if (file == null) {
            file = com.vk.core.files.a.u();
        }
        File file2 = file;
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        return new StoriesVideoEncoder(context, file2, a2, new a(gi9Var, file2), "story_save").a();
    }

    public static CameraVideoEncoderParameters b(File file, List list, MediaUtils.d dVar) {
        int size = list.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            uq10 uq10Var = (uq10) list.get(i);
            SparseArray<uq10> sparseArray = ((r290) r290.b.getValue()).a;
            int size2 = sparseArray.size() + 1;
            sparseArray.put(size2, uq10Var);
            iArr[i] = size2;
        }
        if (file != null && !file.exists()) {
            com.vk.metrics.eventtracking.b.a.q(new Exception("CameraVideoEncoder input doesn't exist"));
        }
        CameraVideoEncoderParameters cameraVideoEncoderParameters = new CameraVideoEncoderParameters(file);
        cameraVideoEncoderParameters.e = false;
        cameraVideoEncoderParameters.f = true;
        cameraVideoEncoderParameters.w = 5000;
        int i2 = dVar.a;
        int i3 = dVar.b;
        cameraVideoEncoderParameters.h = i2;
        cameraVideoEncoderParameters.g = i3;
        cameraVideoEncoderParameters.i = iArr;
        cameraVideoEncoderParameters.c = com.vk.core.files.a.r();
        return cameraVideoEncoderParameters;
    }

    public static Bitmap c(List list, MediaUtils.d dVar, int i, int i2) {
        Bitmap bitmap;
        try {
            bitmap = Bitmap.createBitmap(dVar.a, dVar.b, Bitmap.Config.ARGB_8888);
        } catch (Throwable unused) {
            lht.a.a();
            try {
                bitmap = Bitmap.createBitmap(dVar.a, dVar.b, Bitmap.Config.ARGB_8888);
            } catch (Throwable th) {
                com.vk.metrics.eventtracking.b.a.a(th);
                bitmap = null;
            }
        }
        if (bitmap == null) {
            return null;
        }
        Rect rect = new Rect(0, 0, 0, 0);
        Rect rect2 = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        Canvas canvas = new Canvas(bitmap);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            uq10 uq10Var = (uq10) it.next();
            uq10Var.f();
            Bitmap d = uq10Var.d(i, i2);
            if (d != null) {
                rect.set(0, 0, d.getWidth(), d.getHeight());
                canvas.drawBitmap(d, rect, rect2, kd7.b);
            }
        }
        return bitmap;
    }

    public static MediaUtils.d d(int i, boolean z) {
        int max = Math.max(Math.min(i, 2560), z ? 1920 : CoverVideoUploadTask.y);
        int floor = (int) Math.floor(max * 0.5625f);
        while ((floor & 1) != 0 && (max & 11) != 0) {
            floor++;
        }
        return new MediaUtils.d(floor, max);
    }

    public static MediaUtils.d e(boolean z) {
        int i = z ? 1920 : CoverVideoUploadTask.y;
        int floor = (int) Math.floor(i * 0.5625f);
        while ((floor & 1) != 0 && (floor & 11) != 0) {
            floor++;
        }
        return new MediaUtils.d(floor, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0097 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static File f(Bitmap bitmap, File file) {
        FileOutputStream fileOutputStream;
        boolean z = false;
        if (bitmap != null && !bitmap.isRecycled()) {
            if (bitmap.getHeight() * bitmap.getWidth() != 0) {
                try {
                    fileOutputStream = new FileOutputStream(file);
                    try {
                        boolean compress = bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                        try {
                            L l = L.a;
                            l.getClass();
                            if (!L.m(LoggerOutputTarget.NONE)) {
                                L.u(l, L.LogType.d, new Object[]{"jpeg system size=" + fileOutputStream.getChannel().position()});
                            }
                        } catch (Throwable unused) {
                        }
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused2) {
                        }
                        z = compress;
                    } catch (Throwable th) {
                        th = th;
                        try {
                            L l2 = L.a;
                            l2.getClass();
                            if (!L.m(LoggerOutputTarget.NONE)) {
                                L.u(l2, L.LogType.e, new Object[]{"jpeg system compressing error! " + th});
                            }
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException unused3) {
                                }
                            }
                            if (z) {
                            }
                        } catch (Throwable th2) {
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException unused4) {
                                }
                            }
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream = null;
                }
                if (z) {
                    return file;
                }
                Regex regex = com.vk.core.files.a.a;
                vhk0.b(file);
                return null;
            }
        }
        L.G("can't encode recycle or empty image!");
        if (z) {
        }
    }

    public static File g(b bVar, List list, MediaUtils.d dVar, int i, File file) {
        bVar.getClass();
        try {
            return f(c(list, dVar, 0, i), file);
        } catch (Exception unused) {
            return null;
        }
    }

    public static MediaUtils.d h(float f, int i, int i2) {
        float f2 = i;
        float f3 = i2;
        float f4 = f2 / f3;
        if (Math.abs(f - f4) >= 0.0010000000474974513d) {
            if (f < f4) {
                i = (int) (f * f3);
            } else {
                i2 = (int) (f2 / f);
            }
        }
        if ((i & 1) != 0) {
            i++;
        }
        return new MediaUtils.d(i, i2);
    }
}
