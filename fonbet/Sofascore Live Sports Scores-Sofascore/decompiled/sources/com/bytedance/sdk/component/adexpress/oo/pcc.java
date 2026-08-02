package com.bytedance.sdk.component.adexpress.oo;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.HardwareRenderer;
import android.graphics.Paint;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.hardware.HardwareBuffer;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import androidx.core.app.NotificationCompat;
import com.unity3d.services.UnityAdsConstants;
import defpackage.by1;
import java.lang.reflect.Array;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class pcc {
    public static Bitmap pcc(Bitmap bitmap, int i) {
        int i2;
        int i3;
        int i4 = i;
        try {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int i5 = width * height;
            int[] iArr = new int[i5];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            int[] iArr2 = iArr;
            int i6 = width - 1;
            int i7 = height - 1;
            int i8 = i4 + i4;
            int i9 = i8 + 1;
            char c = 2;
            int i10 = (i8 + 2) >> 1;
            int i11 = i10 * i10;
            int[] iArr3 = new int[Math.max(width, height)];
            int i12 = i11 * NotificationCompat.FLAG_LOCAL_ONLY;
            int[] iArr4 = new int[i12];
            int[] iArr5 = new int[i5];
            int[] iArr6 = new int[i5];
            int[] iArr7 = new int[i5];
            int i13 = 0;
            for (int i14 = 0; i14 < i12; i14++) {
                iArr4[i14] = i14 / i11;
            }
            int[][] iArr8 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i9, 3);
            int i15 = i4 + 1;
            int i16 = 0;
            int i17 = 0;
            int i18 = 0;
            while (i16 < height) {
                char c2 = c;
                int i19 = -i4;
                int i20 = i13;
                int i21 = i20;
                int i22 = i21;
                int i23 = i22;
                int i24 = i23;
                int i25 = i24;
                int i26 = i25;
                int i27 = i26;
                int i28 = i27;
                while (i19 <= i4) {
                    int[] iArr9 = iArr2;
                    int[][] iArr10 = iArr8;
                    int i29 = iArr9[i17 + Math.min(i6, Math.max(i19, i13))];
                    int[] iArr11 = iArr10[i19 + i4];
                    iArr11[0] = (i29 & 16711680) >> 16;
                    iArr11[1] = (i29 & 65280) >> 8;
                    iArr11[c2] = i29 & 255;
                    int abs = i15 - Math.abs(i19);
                    int i30 = iArr11[0];
                    i20 = (i30 * abs) + i20;
                    int i31 = iArr11[1];
                    i21 = (i31 * abs) + i21;
                    int i32 = iArr11[c2];
                    i22 = (abs * i32) + i22;
                    if (i19 <= 0) {
                        i24 += i30;
                        i26 += i31;
                        i28 += i32;
                    } else {
                        i23 += i30;
                        i25 += i31;
                        i27 += i32;
                    }
                    i19++;
                    iArr2 = iArr9;
                    iArr8 = iArr10;
                    i13 = 0;
                }
                int[] iArr12 = iArr2;
                int[][] iArr13 = iArr8;
                int i33 = i4;
                int i34 = 0;
                while (i34 < width) {
                    iArr5[i17] = iArr4[i20];
                    iArr6[i17] = iArr4[i21];
                    iArr7[i17] = iArr4[i22];
                    int[] iArr14 = iArr13[((i33 - i4) + i9) % i9];
                    int i35 = i20 - i24;
                    int i36 = i21 - i26;
                    int i37 = i22 - i28;
                    int i38 = i24 - iArr14[0];
                    int i39 = i26 - iArr14[1];
                    int i40 = i28 - iArr14[c2];
                    if (i16 == 0) {
                        i3 = i34;
                        iArr3[i3] = Math.min(i34 + i4 + 1, i6);
                    } else {
                        i3 = i34;
                    }
                    int i41 = iArr12[i18 + iArr3[i3]];
                    int i42 = (i41 & 16711680) >> 16;
                    iArr14[0] = i42;
                    int i43 = (i41 & 65280) >> 8;
                    iArr14[1] = i43;
                    int i44 = i41 & 255;
                    iArr14[c2] = i44;
                    int i45 = i23 + i42;
                    int i46 = i25 + i43;
                    int i47 = i27 + i44;
                    i33 = (i33 + 1) % i9;
                    int[] iArr15 = iArr13[i33 % i9];
                    i20 = i35 + i45;
                    i21 = i36 + i46;
                    i22 = i37 + i47;
                    int i48 = iArr15[0];
                    i23 = i45 - i48;
                    int i49 = iArr15[1];
                    i25 = i46 - i49;
                    int i50 = iArr15[c2];
                    i27 = i47 - i50;
                    i24 = i38 + i48;
                    i26 = i39 + i49;
                    i28 = i40 + i50;
                    i17++;
                    i34 = i3 + 1;
                }
                i18 += width;
                i16++;
                c = c2;
                iArr2 = iArr12;
                iArr8 = iArr13;
                i13 = 0;
            }
            int[] iArr16 = iArr2;
            int[][] iArr17 = iArr8;
            char c3 = c;
            int i51 = 0;
            while (i51 < width) {
                int i52 = -i4;
                int i53 = i52 * width;
                int i54 = 0;
                int i55 = 0;
                int i56 = 0;
                int i57 = 0;
                int i58 = 0;
                int i59 = 0;
                int i60 = 0;
                int i61 = 0;
                int i62 = 0;
                while (i52 <= i4) {
                    int[] iArr18 = iArr17[i52 + i4];
                    int max = Math.max(0, i53) + i51;
                    int abs2 = i15 - Math.abs(i52);
                    int i63 = iArr5[max];
                    i54 = (i63 * abs2) + i54;
                    i55 = (iArr6[max] * abs2) + i55;
                    i56 = (iArr7[max] * abs2) + i56;
                    iArr18[0] = i63;
                    int i64 = iArr6[max];
                    iArr18[1] = i64;
                    int i65 = iArr7[max];
                    iArr18[c3] = i65;
                    if (i52 <= 0) {
                        i58 += i63;
                        i60 += i64;
                        i62 += i65;
                    } else {
                        i57 += i63;
                        i59 += i64;
                        i61 += i65;
                    }
                    if (i52 < i7) {
                        i53 += width;
                    }
                    i52++;
                    i4 = i;
                }
                int i66 = i;
                int i67 = i51;
                int i68 = 0;
                while (i68 < height) {
                    iArr16[i67] = (iArr16[i67] & (-16777216)) | (iArr4[i54] << 16) | (iArr4[i55] << 8) | iArr4[i56];
                    int[] iArr19 = iArr17[((i66 - i) + i9) % i9];
                    int i69 = i54 - i58;
                    int i70 = i55 - i60;
                    int i71 = i56 - i62;
                    int i72 = i58 - iArr19[0];
                    int i73 = i60 - iArr19[1];
                    int i74 = i62 - iArr19[c3];
                    if (i51 == 0) {
                        i2 = i68;
                        iArr3[i2] = Math.min(i2 + i15, i7) * width;
                    } else {
                        i2 = i68;
                    }
                    int i75 = iArr3[i2] + i51;
                    int i76 = iArr5[i75];
                    iArr19[0] = i76;
                    int i77 = iArr6[i75];
                    iArr19[1] = i77;
                    int i78 = iArr7[i75];
                    iArr19[c3] = i78;
                    int i79 = i57 + i76;
                    int i80 = i59 + i77;
                    int i81 = i61 + i78;
                    i54 = i69 + i79;
                    i55 = i70 + i80;
                    i56 = i71 + i81;
                    i66 = (i66 + 1) % i9;
                    int[] iArr20 = iArr17[i66];
                    int i82 = iArr20[0];
                    i57 = i79 - i82;
                    int i83 = iArr20[1];
                    i59 = i80 - i83;
                    int i84 = iArr20[c3];
                    i61 = i81 - i84;
                    i58 = i72 + i82;
                    i60 = i73 + i83;
                    i62 = i74 + i84;
                    i67 += width;
                    i68 = i2 + 1;
                }
                i51++;
                i4 = i;
            }
            bitmap.setPixels(iArr16, 0, width, 0, 0, width, height);
            return bitmap;
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.renderscript.BaseObj] */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.renderscript.BaseObj, android.renderscript.ScriptIntrinsicBlur] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap sf(Context context, Bitmap bitmap, int i) {
        RenderScript renderScript;
        Allocation allocation;
        ?? r2;
        Allocation allocation2;
        try {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap);
            renderScript = RenderScript.create(context);
            if (renderScript == null) {
                try {
                    if (com.bytedance.sdk.component.adexpress.pcc.pcc.pcc.pcc().gm() == null || renderScript == null) {
                        return null;
                    }
                    RenderScript.releaseAllContexts();
                    return null;
                } catch (Throwable th) {
                    th.getMessage();
                    return null;
                }
            }
            try {
                r2 = ScriptIntrinsicBlur.create(renderScript, Element.U8_4(renderScript));
                try {
                    allocation = Allocation.createFromBitmap(renderScript, bitmap);
                    try {
                        allocation2 = Allocation.createFromBitmap(renderScript, createBitmap);
                        try {
                            r2.setRadius(i);
                            r2.setInput(allocation);
                            r2.forEach(allocation2);
                            allocation2.copyTo(createBitmap);
                            try {
                                if (com.bytedance.sdk.component.adexpress.pcc.pcc.pcc.pcc().gm() != null) {
                                    RenderScript.releaseAllContexts();
                                    if (allocation != null) {
                                        allocation.destroy();
                                    }
                                    allocation2.destroy();
                                    r2.destroy();
                                }
                            } catch (Throwable th2) {
                                th2.getMessage();
                            }
                            return createBitmap;
                        } catch (Throwable th3) {
                            th = th3;
                            try {
                                th.getMessage();
                                try {
                                    if (com.bytedance.sdk.component.adexpress.pcc.pcc.pcc.pcc().gm() != null) {
                                        return null;
                                    }
                                    if (renderScript != null) {
                                        RenderScript.releaseAllContexts();
                                    }
                                    if (allocation != null) {
                                        allocation.destroy();
                                    }
                                    if (allocation2 != null) {
                                        allocation2.destroy();
                                    }
                                    if (r2 == 0) {
                                        return null;
                                    }
                                    r2.destroy();
                                    return null;
                                } catch (Throwable th4) {
                                    th4.getMessage();
                                    return null;
                                }
                            } catch (Throwable th5) {
                                try {
                                    if (com.bytedance.sdk.component.adexpress.pcc.pcc.pcc.pcc().gm() != null) {
                                        if (renderScript != null) {
                                            RenderScript.releaseAllContexts();
                                        }
                                        if (allocation != null) {
                                            allocation.destroy();
                                        }
                                        if (allocation2 != null) {
                                            allocation2.destroy();
                                        }
                                        if (r2 != 0) {
                                            r2.destroy();
                                        }
                                    }
                                } catch (Throwable th6) {
                                    th6.getMessage();
                                }
                                throw th5;
                            }
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        allocation2 = null;
                    }
                } catch (Throwable th8) {
                    th = th8;
                    allocation = null;
                    allocation2 = null;
                }
            } catch (Throwable th9) {
                th = th9;
                allocation = null;
                r2 = allocation;
                allocation2 = r2;
                th.getMessage();
                if (com.bytedance.sdk.component.adexpress.pcc.pcc.pcc.pcc().gm() != null) {
                }
            }
        } catch (Throwable th10) {
            th = th10;
            renderScript = null;
            allocation = null;
        }
    }

    public static Bitmap sf(Bitmap bitmap, int i) {
        try {
            if (Build.VERSION.SDK_INT < 31) {
                return pcc(bitmap, i);
            }
            ImageReader newInstance = ImageReader.newInstance(bitmap.getWidth(), bitmap.getHeight(), 1, 1, 768L);
            by1.k();
            RenderNode renderNode = new RenderNode("BlurEffect");
            by1.l();
            HardwareRenderer b = by1.b();
            b.setSurface(newInstance.getSurface());
            b.setContentRoot(renderNode);
            renderNode.setPosition(0, 0, newInstance.getWidth(), newInstance.getHeight());
            float f = i;
            renderNode.setRenderEffect(RenderEffect.createBlurEffect(f, f, Shader.TileMode.MIRROR));
            renderNode.beginRecording().drawBitmap(bitmap, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (Paint) null);
            renderNode.endRecording();
            b.createRenderRequest().setWaitForPresent(true).syncAndDraw();
            Image acquireNextImage = newInstance.acquireNextImage();
            HardwareBuffer hardwareBuffer = acquireNextImage.getHardwareBuffer();
            Bitmap wrapHardwareBuffer = Bitmap.wrapHardwareBuffer(hardwareBuffer, null);
            hardwareBuffer.close();
            acquireNextImage.close();
            newInstance.close();
            renderNode.discardDisplayList();
            b.destroy();
            return wrapHardwareBuffer;
        } catch (Throwable th) {
            th.getMessage();
            return pcc(bitmap, i);
        }
    }

    public static Bitmap pcc(Context context, Bitmap bitmap, int i) {
        try {
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, Math.round(bitmap.getWidth() * 0.2f), Math.round(bitmap.getHeight() * 0.2f), false);
            if (com.bytedance.sdk.component.adexpress.oo.oo() == 0) {
                return sf(context, createScaledBitmap, i);
            }
            if (com.bytedance.sdk.component.adexpress.oo.oo() == 1) {
                return pcc(createScaledBitmap, i);
            }
            return sf(createScaledBitmap, i);
        } catch (Throwable unused) {
            return null;
        }
    }
}
