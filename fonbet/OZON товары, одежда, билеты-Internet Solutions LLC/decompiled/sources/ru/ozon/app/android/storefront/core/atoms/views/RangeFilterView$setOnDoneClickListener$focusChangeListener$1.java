package ru.ozon.app.android.storefront.core.atoms.views;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"ru/ozon/app/android/storefront/core/atoms/views/RangeFilterView$setOnDoneClickListener$focusChangeListener$1", "Landroid/view/View$OnFocusChangeListener;", "Landroid/view/View;", "v", "", "hasFocus", "", "onFocusChange", "(Landroid/view/View;Z)V", "prevFocusFlag", "Z", "getPrevFocusFlag", "()Z", "setPrevFocusFlag", "(Z)V", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RangeFilterView$setOnDoneClickListener$focusChangeListener$1 implements View.OnFocusChangeListener {
    final /* synthetic */ Function0<Boolean> $update;
    private boolean prevFocusFlag;
    final /* synthetic */ RangeFilterView this$0;

    RangeFilterView$setOnDoneClickListener$focusChangeListener$1(Function0<Boolean> function0, RangeFilterView rangeFilterView) {
        this.$update = function0;
        this.this$0 = rangeFilterView;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View v11, boolean hasFocus) {
        Function1 function1;
        if (!this.prevFocusFlag || hasFocus) {
            this.prevFocusFlag = hasFocus;
            return;
        }
        this.prevFocusFlag = hasFocus;
        if (this.$update.invoke().booleanValue()) {
            function1 = this.this$0.onDoneListener;
            function1.invoke(Boolean.TRUE);
        }
    }

    public final void setPrevFocusFlag(boolean z11) {
        this.prevFocusFlag = z11;
    }
}
