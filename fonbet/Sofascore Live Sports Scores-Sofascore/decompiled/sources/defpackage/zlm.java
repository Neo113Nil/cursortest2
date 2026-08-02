package defpackage;

import android.app.Application;
import com.blaze.blazesdk.shared.BlazeSDK;
import java.io.File;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zlm {
    public static final zlm a = new zlm();
    public static volatile bpf b;

    public static bpf b(final Application application) {
        final int i = 0;
        try {
            ox9 ox9Var = new ox9(application);
            final int i2 = 1;
            ds4 a2 = ds4.a((ds4) ox9Var.c, 1, 0, 28671);
            ox9Var.c = a2;
            ox9Var.c = ds4.a(a2, 0, 1, 24575);
            ox9Var.d = ypa.b(new Function0() { // from class: skm
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i3 = i;
                    Application application2 = application;
                    switch (i3) {
                        case 0:
                            zlm zlmVar = zlm.a;
                            mec mecVar = new mec(application2);
                            mecVar.b = 0.2d;
                            return mecVar.a();
                        default:
                            zlm zlmVar2 = zlm.a;
                            r35 r35Var = new r35();
                            File cacheDir = application2.getCacheDir();
                            cacheDir.getClass();
                            File i4 = d28.i(cacheDir, "image_cache");
                            String str = uae.b;
                            r35Var.a = tnf.k(i4);
                            r35Var.c = 0.04d;
                            return r35Var.a();
                    }
                }
            });
            ox9Var.e = ypa.b(new Function0() { // from class: skm
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i3 = i2;
                    Application application2 = application;
                    switch (i3) {
                        case 0:
                            zlm zlmVar = zlm.a;
                            mec mecVar = new mec(application2);
                            mecVar.b = 0.2d;
                            return mecVar.a();
                        default:
                            zlm zlmVar2 = zlm.a;
                            r35 r35Var = new r35();
                            File cacheDir = application2.getCacheDir();
                            cacheDir.getClass();
                            File i4 = d28.i(cacheDir, "image_cache");
                            String str = uae.b;
                            r35Var.a = tnf.k(i4);
                            r35Var.c = 0.04d;
                            return r35Var.a();
                    }
                }
            });
            ws9 ws9Var = (ws9) ox9Var.f;
            ox9Var.f = new ws9(ws9Var.d, ws9Var.e, ws9Var.a, ws9Var.b, false);
            zid zidVar = new zid(4);
            zidVar.b = 3;
            ox9Var.g = zidVar;
            return ox9Var.c();
        } catch (Exception e) {
            e.getMessage();
            ox9 ox9Var2 = new ox9(application);
            ds4 a3 = ds4.a((ds4) ox9Var2.c, 4, 0, 28671);
            ox9Var2.c = a3;
            ox9Var2.c = ds4.a(a3, 0, 4, 24575);
            return ox9Var2.c();
        }
    }

    public final bpf a() {
        bpf bpfVar;
        Application application$blazesdk_release = BlazeSDK.INSTANCE.getApplication$blazesdk_release();
        if (application$blazesdk_release == null) {
            return null;
        }
        bpf bpfVar2 = b;
        if (bpfVar2 != null) {
            return bpfVar2;
        }
        synchronized (this) {
            bpfVar = b;
            if (bpfVar == null) {
                bpfVar = b(application$blazesdk_release);
                b = bpfVar;
            }
        }
        return bpfVar;
    }
}
