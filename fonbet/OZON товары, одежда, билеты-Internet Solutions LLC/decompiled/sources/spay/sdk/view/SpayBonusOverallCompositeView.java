package spay.sdk.view;

import B1.C2548q;
import T0.g;
import Ve.C4214eg;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import spay.sdk.R;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lspay/sdk/view/SpayBonusOverallCompositeView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "bonusCount", "", "setBonusCount", "(I)V", "LVe/eg;", "a", "LVe/eg;", "getBinding", "()LVe/eg;", "binding", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SpayBonusOverallCompositeView extends ConstraintLayout {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final C4214eg binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SpayBonusOverallCompositeView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @NotNull
    public final C4214eg getBinding() {
        return this.binding;
    }

    public final void setBonusCount(int bonusCount) {
        C4214eg c4214eg = this.binding;
        if (bonusCount <= 0 || !g.f26423a || !g.f26424b) {
            ConstraintLayout root = c4214eg.f30927a;
            Intrinsics.checkNotNullExpressionValue(root, "root");
            root.setVisibility(8);
        } else {
            ConstraintLayout root2 = c4214eg.f30927a;
            Intrinsics.checkNotNullExpressionValue(root2, "root");
            root2.setVisibility(0);
            SpayBonusCompositeView spaySclbovSbcvBonuseCount = c4214eg.f30928b;
            Intrinsics.checkNotNullExpressionValue(spaySclbovSbcvBonuseCount, "spaySclbovSbcvBonuseCount");
            spaySclbovSbcvBonuseCount.a(bonusCount, false);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SpayBonusOverallCompositeView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ SpayBonusOverallCompositeView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpayBonusOverallCompositeView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        View inflate = LayoutInflater.from(context).inflate(R.layout.spay_composite_layout_bonus_overall_view, (ViewGroup) this, false);
        addView(inflate);
        int i12 = R.id.spay_sclbov_sbcv_bonuse_count;
        SpayBonusCompositeView spayBonusCompositeView = (SpayBonusCompositeView) C2548q.d(i12, inflate);
        if (spayBonusCompositeView != null) {
            C4214eg c4214eg = new C4214eg((ConstraintLayout) inflate, spayBonusCompositeView);
            Intrinsics.checkNotNullExpressionValue(c4214eg, "inflate(\n        LayoutI… this,\n        true\n    )");
            this.binding = c4214eg;
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.SpayBonusOverallCompositeView, 0, 0);
            Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.theme.obtainStyl…,\n            0\n        )");
            setBonusCount(obtainStyledAttributes.getInteger(R.styleable.SpayBonusOverallCompositeView_spay_bonus_overall_view_count, 0));
            obtainStyledAttributes.recycle();
            return;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i12)));
    }
}
