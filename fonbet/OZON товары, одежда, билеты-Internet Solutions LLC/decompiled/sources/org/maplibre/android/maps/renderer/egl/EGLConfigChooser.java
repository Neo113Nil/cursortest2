package org.maplibre.android.maps.renderer.egl;

import Vf.a;
import android.opengl.GLSurfaceView;
import android.os.Build;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collections;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;
import org.maplibre.android.log.Logger;

/* loaded from: classes10.dex */
public class EGLConfigChooser implements GLSurfaceView.EGLConfigChooser {

    /* renamed from: a, reason: collision with root package name */
    private boolean f79881a;

    enum BufferFormat {
        Format16Bit(3),
        Format32BitNoAlpha(1),
        Format32BitAlpha(2),
        Format24Bit(0),
        Unknown(4);

        int value;

        BufferFormat(int i11) {
            this.value = i11;
        }
    }

    enum DepthStencilFormat {
        Format16Depth8Stencil(1),
        Format24Depth8Stencil(0);

        int value;

        DepthStencilFormat(int i11) {
            this.value = i11;
        }
    }

    public EGLConfigChooser() {
        this(false);
    }

    private static int a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i11) {
        int[] iArr = new int[1];
        if (!egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i11, iArr)) {
            Logger.e("Mbgl-EGLConfigChooser", String.format(a.f32686a, "eglGetConfigAttrib(%d) returned error %d", Integer.valueOf(i11), Integer.valueOf(egl10.eglGetError())));
        }
        return iArr[0];
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0110  */
    @Override // android.opengl.GLSurfaceView.EGLConfigChooser
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final EGLConfig chooseConfig(@NonNull EGL10 egl10, EGLDisplay eGLDisplay) {
        boolean z11;
        int[] iArr;
        int[] iArr2;
        int i11;
        EGLConfig[] eGLConfigArr;
        EGL10 egl102;
        EGLDisplay eGLDisplay2;
        ArrayList arrayList;
        int i12;
        EGLConfig eGLConfig;
        EGLConfig[] eGLConfigArr2;
        int i13;
        String str = Build.FINGERPRINT;
        if (!str.startsWith("generic") && !str.startsWith("unknown")) {
            String str2 = Build.MODEL;
            if (!str2.contains("google_sdk") && !str2.contains("Emulator") && !str2.contains("Android SDK built for x86") && ((!Build.BRAND.startsWith("generic") || !Build.DEVICE.startsWith("generic")) && !"google_sdk".equals(Build.PRODUCT) && System.getProperty("ro.kernel.qemu") == null && !Build.MANUFACTURER.contains("Genymotion"))) {
                z11 = false;
                Logger.i("Mbgl-EGLConfigChooser", "In emulator: " + z11);
                iArr = new int[]{12327, 12344, 12339, 4, 12320, 16, 12324, 5, 12323, 6, 12322, 5, 12321, !this.f79881a ? 8 : 0, 12325, 16, 12326, 8, !z11 ? 12344 : 12351, 12430, 12352, 64, 12344};
                iArr2 = new int[1];
                if (!egl10.eglChooseConfig(eGLDisplay, iArr, null, 0, iArr2)) {
                    Logger.e("Mbgl-EGLConfigChooser", String.format(a.f32686a, "eglChooseConfig(NULL) returned error %d", Integer.valueOf(egl10.eglGetError())));
                }
                if (iArr2[0] < 1) {
                    Logger.e("Mbgl-EGLConfigChooser", "eglChooseConfig() returned no configs.");
                }
                i11 = iArr2[0];
                eGLConfigArr = new EGLConfig[i11];
                egl102 = egl10;
                eGLDisplay2 = eGLDisplay;
                if (!egl102.eglChooseConfig(eGLDisplay2, iArr, eGLConfigArr, i11, iArr2)) {
                    Logger.e("Mbgl-EGLConfigChooser", String.format(a.f32686a, "eglChooseConfig() returned error %d", Integer.valueOf(egl102.eglGetError())));
                }
                arrayList = new ArrayList();
                i12 = 0;
                int i14 = 0;
                while (i12 < i11) {
                    EGLConfig eGLConfig2 = eGLConfigArr[i12];
                    if (eGLConfig2 == null) {
                        eGLConfigArr2 = eGLConfigArr;
                        i13 = i11;
                    } else {
                        int i15 = i14 + 1;
                        int a11 = a(egl102, eGLDisplay2, eGLConfig2, 12327);
                        int a12 = a(egl102, eGLDisplay2, eGLConfig2, 12320);
                        int a13 = a(egl102, eGLDisplay2, eGLConfig2, 12324);
                        int a14 = a(egl102, eGLDisplay2, eGLConfig2, 12323);
                        int a15 = a(egl102, eGLDisplay2, eGLConfig2, 12322);
                        int a16 = a(egl102, eGLDisplay2, eGLConfig2, 12321);
                        a(egl102, eGLDisplay2, eGLConfig2, 12350);
                        int a17 = a(egl102, eGLDisplay2, eGLConfig2, 12325);
                        eGLConfigArr2 = eGLConfigArr;
                        int a18 = a(egl102, eGLDisplay2, eGLConfig2, 12326);
                        i13 = i11;
                        if ((a17 == 24 || a17 == 16) & (a18 == 8) & (a(egl102, eGLDisplay2, eGLConfig2, 12338) == 0) & (a(egl102, eGLDisplay2, eGLConfig2, 12337) == 0)) {
                            BufferFormat bufferFormat = (a12 == 16 && a13 == 5 && a14 == 6 && a15 == 5 && a16 == 0) ? BufferFormat.Format16Bit : (a12 == 32 && a13 == 8 && a14 == 8 && a15 == 8 && a16 == 0) ? BufferFormat.Format32BitNoAlpha : (a12 == 32 && a13 == 8 && a14 == 8 && a15 == 8 && a16 == 8) ? BufferFormat.Format32BitAlpha : (a12 == 24 && a13 == 8 && a14 == 8 && a15 == 8 && a16 == 0) ? BufferFormat.Format24Bit : BufferFormat.Unknown;
                            DepthStencilFormat depthStencilFormat = (a17 == 16 && a18 == 8) ? DepthStencilFormat.Format16Depth8Stencil : DepthStencilFormat.Format24Depth8Stencil;
                            boolean z12 = a11 != 12344;
                            if (bufferFormat != BufferFormat.Unknown) {
                                arrayList.add(new Comparable<C1Config>(bufferFormat, depthStencilFormat, z12, i15, eGLConfig2) { // from class: org.maplibre.android.maps.renderer.egl.EGLConfigChooser.1Config

                                    /* renamed from: a, reason: collision with root package name */
                                    private final BufferFormat f79882a;

                                    /* renamed from: b, reason: collision with root package name */
                                    private final DepthStencilFormat f79883b;

                                    /* renamed from: c, reason: collision with root package name */
                                    private final boolean f79884c;

                                    /* renamed from: d, reason: collision with root package name */
                                    private final int f79885d;

                                    /* renamed from: e, reason: collision with root package name */
                                    private final EGLConfig f79886e;

                                    {
                                        this.f79882a = bufferFormat;
                                        this.f79883b = depthStencilFormat;
                                        this.f79884c = z12;
                                        this.f79885d = i15;
                                        this.f79886e = eGLConfig2;
                                    }

                                    @Override // java.lang.Comparable
                                    public final int compareTo(@NonNull C1Config c1Config) {
                                        C1Config c1Config2 = c1Config;
                                        int i16 = this.f79882a.value;
                                        int i17 = c1Config2.f79882a.value;
                                        int i18 = 1;
                                        int i19 = i16 < i17 ? -1 : i16 == i17 ? 0 : 1;
                                        if (i19 != 0) {
                                            return i19;
                                        }
                                        int i21 = this.f79883b.value;
                                        int i22 = c1Config2.f79883b.value;
                                        int i23 = i21 < i22 ? -1 : i21 == i22 ? 0 : 1;
                                        if (i23 != 0) {
                                            return i23;
                                        }
                                        boolean z13 = c1Config2.f79884c;
                                        boolean z14 = this.f79884c;
                                        int i24 = z14 == z13 ? 0 : z14 ? 1 : -1;
                                        if (i24 != 0) {
                                            return i24;
                                        }
                                        int i25 = this.f79885d;
                                        int i26 = c1Config2.f79885d;
                                        if (i25 < i26) {
                                            i18 = -1;
                                        } else if (i25 == i26) {
                                            i18 = 0;
                                        }
                                        if (i18 != 0) {
                                            return i18;
                                        }
                                        return 0;
                                    }
                                });
                            }
                        }
                        i14 = i15;
                    }
                    i12++;
                    egl102 = egl10;
                    eGLDisplay2 = eGLDisplay;
                    eGLConfigArr = eGLConfigArr2;
                    i11 = i13;
                }
                Collections.sort(arrayList);
                if (arrayList.size() != 0) {
                    Logger.e("Mbgl-EGLConfigChooser", "No matching configurations after filtering");
                    eGLConfig = null;
                } else {
                    C1Config c1Config = (C1Config) arrayList.get(0);
                    if (c1Config.f79884c) {
                        Logger.w("Mbgl-EGLConfigChooser", "Chosen config has a caveat.");
                    }
                    eGLConfig = c1Config.f79886e;
                }
                if (eGLConfig == null) {
                    Logger.e("Mbgl-EGLConfigChooser", "No config chosen");
                }
                return eGLConfig;
            }
        }
        z11 = true;
        Logger.i("Mbgl-EGLConfigChooser", "In emulator: " + z11);
        iArr = new int[]{12327, 12344, 12339, 4, 12320, 16, 12324, 5, 12323, 6, 12322, 5, 12321, !this.f79881a ? 8 : 0, 12325, 16, 12326, 8, !z11 ? 12344 : 12351, 12430, 12352, 64, 12344};
        iArr2 = new int[1];
        if (!egl10.eglChooseConfig(eGLDisplay, iArr, null, 0, iArr2)) {
        }
        if (iArr2[0] < 1) {
        }
        i11 = iArr2[0];
        eGLConfigArr = new EGLConfig[i11];
        egl102 = egl10;
        eGLDisplay2 = eGLDisplay;
        if (!egl102.eglChooseConfig(eGLDisplay2, iArr, eGLConfigArr, i11, iArr2)) {
        }
        arrayList = new ArrayList();
        i12 = 0;
        int i142 = 0;
        while (i12 < i11) {
        }
        Collections.sort(arrayList);
        if (arrayList.size() != 0) {
        }
        if (eGLConfig == null) {
        }
        return eGLConfig;
    }

    public EGLConfigChooser(boolean z11) {
        this.f79881a = z11;
    }
}
