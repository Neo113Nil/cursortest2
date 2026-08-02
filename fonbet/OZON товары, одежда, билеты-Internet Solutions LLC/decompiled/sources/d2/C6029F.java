package d2;

import Bl0.C2652m;
import S0.AbstractC3984t;
import S0.C3969l;
import S0.C3991w0;
import S0.D1;
import S0.InterfaceC3967k;
import S0.J0;
import S0.n1;
import a1.C4912a;
import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.compose.ui.platform.AbstractC5228a;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

/* renamed from: d2.F, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C6029F extends AbstractC5228a implements InterfaceC6031H {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Window f60981a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C3991w0 f60982b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f60983c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f60984d;

    /* renamed from: d2.F$a */
    static final class a extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f60986c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i11) {
            super(2);
            this.f60986c = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            num.intValue();
            int e11 = C2652m.e(this.f60986c | 1);
            C6029F.this.Content(interfaceC3967k, e11);
            return Unit.f71690a;
        }
    }

    public C6029F(@NotNull Window window, @NotNull Context context) {
        super(context, null, 0, 6, null);
        C3991w0 f7;
        this.f60981a = window;
        f7 = n1.f(C6027D.f60977a, D1.f25195a);
        this.f60982b = f7;
    }

    @Override // androidx.compose.ui.platform.AbstractC5228a
    public final void Content(InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(1735448596);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(this) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 3) == 2 && u11.b()) {
            u11.j();
        } else {
            ((Function2) this.f60982b.getValue()).invoke(u11, 0);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new a(i11));
        }
    }

    public final boolean a() {
        return this.f60983c;
    }

    public final void b(@NotNull AbstractC3984t abstractC3984t, @NotNull C4912a c4912a) {
        setParentCompositionContext(abstractC3984t);
        this.f60982b.setValue(c4912a);
        this.f60984d = true;
        createComposition();
    }

    public final void c(boolean z11) {
        this.f60983c = z11;
    }

    @Override // androidx.compose.ui.platform.AbstractC5228a
    protected final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f60984d;
    }

    @Override // d2.InterfaceC6031H
    @NotNull
    public final Window getWindow() {
        return this.f60981a;
    }

    @Override // androidx.compose.ui.platform.AbstractC5228a
    public final void internalOnLayout$ui_release(boolean z11, int i11, int i12, int i13, int i14) {
        View childAt;
        super.internalOnLayout$ui_release(z11, i11, i12, i13, i14);
        if (this.f60983c || (childAt = getChildAt(0)) == null) {
            return;
        }
        this.f60981a.setLayout(childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
    }

    @Override // androidx.compose.ui.platform.AbstractC5228a
    public final void internalOnMeasure$ui_release(int i11, int i12) {
        if (this.f60983c) {
            super.internalOnMeasure$ui_release(i11, i12);
            return;
        }
        super.internalOnMeasure$ui_release(View.MeasureSpec.makeMeasureSpec(Math.round(getContext().getResources().getConfiguration().screenWidthDp * getContext().getResources().getDisplayMetrics().density), LinearLayoutManager.INVALID_OFFSET), View.MeasureSpec.makeMeasureSpec(Math.round(getContext().getResources().getConfiguration().screenHeightDp * getContext().getResources().getDisplayMetrics().density), LinearLayoutManager.INVALID_OFFSET));
    }
}
