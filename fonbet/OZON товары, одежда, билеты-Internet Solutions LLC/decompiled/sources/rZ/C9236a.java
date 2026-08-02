package rZ;

import EZ.e;
import EZ.g;
import EZ.i;
import androidx.fragment.app.G;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.d;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import qZ.InterfaceC9014f;
import xZ.j;

/* renamed from: rZ.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9236a extends f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC9014f f83257a;

    /* renamed from: b, reason: collision with root package name */
    private final f f83258b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final d<? extends EZ.a<?>> f83259c;

    /* renamed from: rZ.a$a, reason: collision with other inner class name */
    public static final class C1416a extends i<C9236a> {

        /* renamed from: rZ.a$a$a, reason: collision with other inner class name */
        static final class C1417a extends AbstractC7737t implements Function0<Unit> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ G f83260b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ G.k f83261c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1417a(G g10, G.k kVar) {
                super(0);
                this.f83260b = g10;
                this.f83261c = kVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                this.f83260b.R0(this.f83261c.getId(), 1);
                return Unit.f71690a;
            }
        }

        @Override // EZ.a
        public final void navigate(@NotNull g navigator, @NotNull e<C9236a> response) {
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            Intrinsics.checkNotNullParameter(response, "response");
            navigateForResult(navigator, response, 0);
        }

        @Override // EZ.a
        public final void navigateForResult(@NotNull g navigator, @NotNull e<C9236a> response, int i11) {
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            Intrinsics.checkNotNullParameter(response, "response");
            if (!(navigator instanceof j)) {
                next(navigator, response, i11);
                return;
            }
            C9236a b11 = response.b();
            G fragmentManager = navigator.getFragmentManager();
            String name = b11.a().getName();
            G.k kVar = null;
            if (fragmentManager.l0() > 0) {
                int l02 = fragmentManager.l0();
                while (true) {
                    l02--;
                    if (-1 >= l02) {
                        break;
                    }
                    G.k k02 = fragmentManager.k0(l02);
                    Intrinsics.checkNotNullExpressionValue(k02, "getBackStackEntryAt(...)");
                    if (Intrinsics.d(k02.getName(), name)) {
                        kVar = k02;
                        break;
                    }
                }
            }
            if (kVar != null) {
                navigator.safeTransaction(new C1417a(fragmentManager, kVar));
            }
            f redirect$compass_release = b11.getRedirect$compass_release();
            if (redirect$compass_release != null) {
                redirect(response.e(redirect$compass_release), i11);
            }
        }
    }

    public C9236a(@NotNull InterfaceC9014f tag, f fVar) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.f83257a = tag;
        this.f83258b = fVar;
        this.f83259c = N.b(C1416a.class);
    }

    @NotNull
    public final InterfaceC9014f a() {
        return this.f83257a;
    }

    @Override // pZ.f
    @NotNull
    public final d<? extends EZ.a<?>> getNavigator() {
        return this.f83259c;
    }

    public final f getRedirect$compass_release() {
        return this.f83258b;
    }

    @NotNull
    public final String toString() {
        return "CloseFlowDestination(tag=" + this.f83257a + ", redirect=" + this.f83258b + ")";
    }
}
