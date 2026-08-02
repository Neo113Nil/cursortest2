package ru.ozon.fintech.ui.badge;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import androidx.annotation.Keep;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.ui.databinding.FinTabBadgeIconViewBinding;

@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lru/ozon/fintech/ui/badge/TabBadgeIconView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lru/ozon/fintech/ui/databinding/FinTabBadgeIconViewBinding;", "state", "Lru/ozon/fintech/ui/badge/TabBadgeIconState;", "bindState", "", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TabBadgeIconView extends ConstraintLayout {

    @NotNull
    private final FinTabBadgeIconViewBinding binding;
    private TabBadgeIconState state;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TabBadgeIconView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void bindState(@NotNull TabBadgeIconState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.state = state;
        if (state.getIconBg() != null) {
            this.binding.finBadgeBg.setImageDrawable(state.getIconBg());
        }
        ImageView finBadgeBg = this.binding.finBadgeBg;
        Intrinsics.checkNotNullExpressionValue(finBadgeBg, "finBadgeBg");
        finBadgeBg.setVisibility(state.getIconBg() != null ? 0 : 8);
        this.binding.finBadgeIcon.setImageDrawable(state.getIcon());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TabBadgeIconView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ TabBadgeIconView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabBadgeIconView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.binding = FinTabBadgeIconViewBinding.inflate(LayoutInflater.from(context), this);
    }
}
