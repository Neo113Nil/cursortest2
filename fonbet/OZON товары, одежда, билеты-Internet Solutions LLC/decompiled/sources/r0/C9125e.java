package r0;

import S0.InterfaceC3994y;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import m0.C8004n;
import m0.C8025y;
import m0.InterfaceC8002m;
import m0.T0;
import org.jetbrains.annotations.NotNull;
import r0.InterfaceC9124d;

/* renamed from: r0.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C9125e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final S0.E f82561a = new S0.E(a.f82563b);

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final b f82562b = new b();

    /* renamed from: r0.e$a */
    static final class a extends AbstractC7737t implements Function1<InterfaceC3994y, InterfaceC9124d> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f82563b = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC9124d invoke(InterfaceC3994y interfaceC3994y) {
            if (((Context) interfaceC3994y.a(AndroidCompositionLocals_androidKt.d())).getPackageManager().hasSystemFeature("android.software.leanback")) {
                return C9125e.b();
            }
            InterfaceC9124d.f82557a.getClass();
            return InterfaceC9124d.a.a();
        }
    }

    /* renamed from: r0.e$b */
    public static final class b implements InterfaceC9124d {

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final T0 f82564b = C8004n.d(125, 0, new C8025y(0.25f, 0.1f, 0.25f, 1.0f), 2);

        b() {
        }

        @Override // r0.InterfaceC9124d
        @NotNull
        public final InterfaceC8002m<Float> a() {
            return this.f82564b;
        }

        @Override // r0.InterfaceC9124d
        public final float b(float f7, float f11, float f12) {
            float abs = Math.abs((f11 + f7) - f7);
            float f13 = (0.3f * f12) - (0.0f * abs);
            float f14 = f12 - f13;
            if ((abs <= f12) && f14 < abs) {
                f13 = f12 - abs;
            }
            return f7 - f13;
        }
    }

    @NotNull
    public static final S0.E a() {
        return f82561a;
    }

    @NotNull
    public static final b b() {
        return f82562b;
    }
}
