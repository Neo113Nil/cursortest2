package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import java.io.File;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class vs9 extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ ox9 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vs9(ox9 ox9Var, int i) {
        super(0);
        this.i = i;
        this.j = ox9Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        tof tofVar;
        switch (this.i) {
            case 0:
                return new mec((Context) this.j.b).a();
            default:
                p4h p4hVar = p4h.h;
                Context context = (Context) this.j.b;
                synchronized (p4hVar) {
                    try {
                        tofVar = p4h.i;
                        if (tofVar == null) {
                            r35 r35Var = new r35();
                            Bitmap.Config[] configArr = l.a;
                            File cacheDir = context.getCacheDir();
                            if (cacheDir == null) {
                                throw new IllegalStateException("cacheDir == null");
                            }
                            cacheDir.mkdirs();
                            File i = d28.i(cacheDir, "image_cache");
                            String str = uae.b;
                            r35Var.a = tnf.k(i);
                            tofVar = r35Var.a();
                            p4h.i = tofVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return tofVar;
        }
    }
}
