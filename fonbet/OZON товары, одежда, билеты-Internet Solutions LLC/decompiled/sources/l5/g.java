package l5;

import A5.p;
import Sc.InterfaceC4008j;
import Ve.A;
import We.InterfaceC4865g;
import android.content.Context;
import org.jetbrains.annotations.NotNull;
import v5.AbstractC10235i;
import v5.C10229c;
import v5.C10234h;
import v5.InterfaceC10231e;

/* loaded from: classes8.dex */
public interface g {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Context f72813a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private C10229c f72814b = A5.i.b();

        /* renamed from: c, reason: collision with root package name */
        private InterfaceC4008j<? extends InterfaceC4865g.a> f72815c = null;

        /* renamed from: d, reason: collision with root package name */
        private C7873b f72816d = null;

        /* renamed from: e, reason: collision with root package name */
        @NotNull
        private p f72817e = new p();

        public a(@NotNull Context context) {
            this.f72813a = context.getApplicationContext();
        }

        @NotNull
        public final i b() {
            InterfaceC4008j b11 = Sc.k.b(new C7875d(this));
            InterfaceC4008j b12 = Sc.k.b(new C7876e(this));
            InterfaceC4008j<? extends InterfaceC4865g.a> interfaceC4008j = this.f72815c;
            if (interfaceC4008j == null) {
                interfaceC4008j = Sc.k.b(f.f72812b);
            }
            InterfaceC4008j<? extends InterfaceC4865g.a> interfaceC4008j2 = interfaceC4008j;
            C7873b c7873b = this.f72816d;
            if (c7873b == null) {
                c7873b = new C7873b();
            }
            return new i(this.f72813a, this.f72814b, b11, b12, interfaceC4008j2, c7873b, this.f72817e);
        }

        @NotNull
        public final void c(@NotNull C7873b c7873b) {
            this.f72816d = c7873b;
        }

        @NotNull
        public final void d(@NotNull A a11) {
            this.f72815c = Sc.k.b(a11);
        }
    }

    @NotNull
    InterfaceC10231e a(@NotNull C10234h c10234h);

    @NotNull
    C10229c b();

    Object c(@NotNull C10234h c10234h, @NotNull kotlin.coroutines.d<? super AbstractC10235i> dVar);
}
