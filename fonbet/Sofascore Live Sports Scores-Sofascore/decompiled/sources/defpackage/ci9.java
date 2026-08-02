package defpackage;

import java.io.Closeable;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class ci9 implements ku3, Closeable {
    public static final /* synthetic */ long c = rh0.a.objectFieldOffset(ci9.class.getDeclaredField("closed"));
    public final mqi a;
    public final mqi b;

    @NotNull
    private volatile /* synthetic */ int closed = 0;

    public ci9() {
        final int i = 0;
        this.a = ypa.b(new Function0(this) { // from class: bi9
            public final /* synthetic */ ci9 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ci9 ci9Var = this.b;
                switch (i2) {
                    case 0:
                        ci9Var.h().getClass();
                        hs4 hs4Var = z45.a;
                        return hq4.c;
                    default:
                        return e.d(new smi(null), new tu3(bu3.a, 0)).plus((au3) ci9Var.a.getValue()).plus(new gu3("ktor-android-context"));
                }
            }
        });
        final int i2 = 1;
        this.b = ypa.b(new Function0(this) { // from class: bi9
            public final /* synthetic */ ci9 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ci9 ci9Var = this.b;
                switch (i22) {
                    case 0:
                        ci9Var.h().getClass();
                        hs4 hs4Var = z45.a;
                        return hq4.c;
                    default:
                        return e.d(new smi(null), new tu3(bu3.a, 0)).plus((au3) ci9Var.a.getValue()).plus(new gu3("ktor-android-context"));
                }
            }
        });
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (rh0.a.compareAndSwapInt(this, c, 0, 1)) {
            CoroutineContext.Element element = getCoroutineContext().get(uic.g);
            xa3 xa3Var = element instanceof xa3 ? (xa3) element : null;
            if (xa3Var == null) {
                return;
            }
            ((aea) xa3Var).j0();
        }
    }

    public abstract Object e(zj9 zj9Var, sq3 sq3Var);

    @Override // defpackage.ku3
    public final CoroutineContext getCoroutineContext() {
        return (CoroutineContext) this.b.getValue();
    }

    public abstract p00 h();
}
