package tZ;

import EZ.e;
import EZ.g;
import EZ.i;
import androidx.fragment.app.G;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.f;

/* renamed from: tZ.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9789d extends i<C9788c> {

    /* renamed from: tZ.d$a */
    static final class a extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ g f99318c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ e<C9788c> f99319d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(g gVar, e<C9788c> eVar) {
            super(0);
            this.f99318c = gVar;
            this.f99319d = eVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            e<C9788c> eVar = this.f99319d;
            C9789d.this.b(this.f99318c, eVar, 0);
            return Unit.f71690a;
        }
    }

    /* renamed from: tZ.d$b */
    static final class b extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ g f99321c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ e<C9788c> f99322d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f99323e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(g gVar, e<C9788c> eVar, int i11) {
            super(0);
            this.f99321c = gVar;
            this.f99322d = eVar;
            this.f99323e = i11;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            C9789d.this.b(this.f99321c, this.f99322d, this.f99323e);
            return Unit.f71690a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(g gVar, e<C9788c> eVar, int i11) {
        G fragmentManager = gVar.getFragmentManager();
        boolean a11 = eVar.b().a();
        if (a11 || fragmentManager.l0() > 1) {
            String c11 = eVar.b().c();
            if (c11 != null) {
                fragmentManager.U0(a11 ? 1 : 0, c11);
            } else {
                fragmentManager.R0(fragmentManager.k0(0).getId(), a11 ? 1 : 0);
            }
        }
        f b11 = eVar.b().b();
        if (b11 != null) {
            redirect(eVar.e(b11), i11);
        }
    }

    @Override // EZ.a
    public final void navigate(@NotNull g navigator, @NotNull e<C9788c> response) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(response, "response");
        navigator.safeTransaction(new a(navigator, response));
    }

    @Override // EZ.a
    public final void navigateForResult(@NotNull g navigator, @NotNull e<C9788c> response, int i11) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(response, "response");
        navigator.safeTransaction(new b(navigator, response, i11));
    }
}
