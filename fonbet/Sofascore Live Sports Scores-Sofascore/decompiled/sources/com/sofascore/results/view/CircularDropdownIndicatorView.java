package com.sofascore.results.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.compose.runtime.e;
import androidx.compose.ui.platform.ComposeView;
import com.ironsource.U3;
import defpackage.av8;
import defpackage.e1d;
import defpackage.eoh;
import defpackage.fv2;
import defpackage.of3;
import defpackage.tc3;
import defpackage.wnn;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\u0006R+\u0010\u000e\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u0006R+\u0010\u0012\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/sofascore/results/view/CircularDropdownIndicatorView;", "Landroid/widget/FrameLayout;", "", U3.i.X, "", "setExpanded", "(Z)V", "setLoading", "<set-?>", "a", "Le1d;", "getExpandedState", "()Z", "setExpandedState", "expandedState", "b", "getLoadingState", "setLoadingState", "loadingState", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CircularDropdownIndicatorView extends FrameLayout {

    /* renamed from: a, reason: from kotlin metadata */
    public final e1d expandedState;

    /* renamed from: b, reason: from kotlin metadata */
    public final e1d loadingState;
    public final ComposeView c;
    public boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CircularDropdownIndicatorView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        context.getClass();
        Boolean bool = Boolean.FALSE;
        this.expandedState = e.f(bool);
        this.loadingState = e.f(bool);
        ComposeView composeView = new ComposeView(context, null, 6);
        this.c = composeView;
        addView(composeView, new FrameLayout.LayoutParams(-1, -1));
    }

    public static final Unit a(CircularDropdownIndicatorView circularDropdownIndicatorView, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(i & 1, (i & 3) != 2)) {
            wnn.a(0, 4, av8Var, null, circularDropdownIndicatorView.getExpandedState(), circularDropdownIndicatorView.getLoadingState());
        } else {
            av8Var.W();
        }
        return Unit.a;
    }

    private final boolean getExpandedState() {
        return ((Boolean) ((eoh) this.expandedState).getValue()).booleanValue();
    }

    private final boolean getLoadingState() {
        return ((Boolean) ((eoh) this.loadingState).getValue()).booleanValue();
    }

    private final void setExpandedState(boolean z) {
        ((eoh) this.expandedState).setValue(Boolean.valueOf(z));
    }

    private final void setLoadingState(boolean z) {
        ((eoh) this.loadingState).setValue(Boolean.valueOf(z));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.d) {
            return;
        }
        this.d = true;
        this.c.setContent(new tc3(57355168, new fv2(this, 0), true));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (isAttachedToWindow()) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public final void setExpanded(boolean value) {
        setExpandedState(value);
    }

    public final void setLoading(boolean value) {
        setLoadingState(value);
    }
}
