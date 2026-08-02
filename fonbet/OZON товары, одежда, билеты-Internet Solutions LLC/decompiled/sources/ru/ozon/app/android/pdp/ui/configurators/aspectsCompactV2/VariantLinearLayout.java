package ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.AspectV2CustomAttrStates;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\bH\u0014R\u001a\u0010\u000b\u001a\u00020\fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/VariantLinearLayout;", "Landroid/widget/LinearLayout;", "Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/AspectV2CustomAttrStates;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "isProbably", "", "()Z", "setProbably", "(Z)V", "onCreateDrawableState", "", "extraSpace", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class VariantLinearLayout extends LinearLayout implements AspectV2CustomAttrStates {
    private boolean isProbably;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VariantLinearLayout(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public int[] customDrawableState() {
        return AspectV2CustomAttrStates.DefaultImpls.customDrawableState(this);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.AspectV2CustomAttrStates
    /* renamed from: isProbably, reason: from getter */
    public boolean getIsProbably() {
        return this.isProbably;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int extraSpace) {
        int[] onCreateDrawableState = super.onCreateDrawableState(extraSpace + 2);
        int[] customDrawableState = customDrawableState();
        if (customDrawableState != null) {
            View.mergeDrawableStates(onCreateDrawableState, customDrawableState);
        }
        return onCreateDrawableState;
    }

    public void setProbably(boolean z11) {
        this.isProbably = z11;
    }

    public /* synthetic */ VariantLinearLayout(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VariantLinearLayout(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
