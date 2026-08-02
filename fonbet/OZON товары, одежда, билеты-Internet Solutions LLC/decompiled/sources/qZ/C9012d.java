package qZ;

import EZ.g;
import OZ.h;
import androidx.fragment.app.G;
import androidx.fragment.app.r;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qZ.InterfaceC9014f;
import rZ.C9236a;
import rZ.C9237b;
import ru.ozon.app.android.R;
import tZ.C9786a;

/* renamed from: qZ.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9012d extends g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC9014f f81794a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f81795b;

    /* renamed from: qZ.d$a */
    static final class a extends AbstractC7737t implements Function0<Unit> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            C9012d.this.getFragmentManager().S0();
            return Unit.f71690a;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C9012d(@NotNull C9011c fragment, @NotNull InterfaceC9014f flowTag, boolean z11) {
        super(r0, r1, r2, fragment);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(flowTag, "flowTag");
        r requireActivity = fragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        Integer valueOf = Integer.valueOf(R.id.flowContainer);
        G childFragmentManager = fragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        this.f81794a = flowTag;
        this.f81795b = z11;
    }

    @NotNull
    public final InterfaceC9014f a() {
        return this.f81794a;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [pZ.f] */
    @Override // EZ.g
    public final void navigate(@NotNull EZ.e<?> response, int i11) {
        Intrinsics.checkNotNullParameter(response, "response");
        ?? b11 = response.b();
        boolean z11 = b11 instanceof h;
        boolean z12 = this.f81795b;
        InterfaceC9014f interfaceC9014f = this.f81794a;
        if (z11 || (b11 instanceof OZ.e)) {
            if (getFragmentManager().f0(requireContainerId$compass_release()) == null || z12) {
                super.navigate(response.e(new C9236a(interfaceC9014f, b11)), i11);
                return;
            } else {
                next(response, i11);
                return;
            }
        }
        if (b11 instanceof C9237b) {
            C9237b c9237b = (C9237b) b11;
            if (Intrinsics.d(c9237b.getTag(), interfaceC9014f)) {
                InterfaceC9014f tag = c9237b.getTag();
                InterfaceC9014f.f81797k0.getClass();
                if (!Intrinsics.d(tag, InterfaceC9014f.a.a())) {
                    super.navigate(response.e(c9237b.getRedirect()), i11);
                    return;
                }
            }
            super.navigate(response, i11);
            return;
        }
        if (b11 instanceof C9236a) {
            if (Intrinsics.d(((C9236a) b11).a(), interfaceC9014f)) {
                super.navigate(response, i11);
                return;
            } else {
                next(response, i11);
                return;
            }
        }
        if (b11 instanceof C9786a) {
            if (getFragmentManager().l0() <= 1) {
                super.navigate(response.e(new C9236a(interfaceC9014f, null)), i11);
                return;
            } else {
                safeTransaction(new a());
                return;
            }
        }
        if (getFragmentManager().f0(requireContainerId$compass_release()) == null || z12) {
            super.navigate(response, i11);
        } else {
            next(response, i11);
        }
    }
}
