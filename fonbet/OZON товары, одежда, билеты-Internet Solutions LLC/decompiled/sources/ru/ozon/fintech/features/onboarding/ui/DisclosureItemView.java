package ru.ozon.fintech.features.onboarding.ui;

import E30.f;
import H30.g;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Keep;
import androidx.recyclerview.widget.RecyclerView;
import j.C7232a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import u70.C9979a;

@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00122\u00020\u0001:\u0001\u0013B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lru/ozon/fintech/features/onboarding/ui/DisclosureItemView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lru/ozon/fintech/features/onboarding/ui/DisclosureItem;", "itemState", "", "binds", "(Lru/ozon/fintech/features/onboarding/ui/DisclosureItem;)V", "Lu70/a;", "binding", "Lu70/a;", "Companion", "b", "onboarding_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DisclosureItemView extends LinearLayout {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    private static final RecyclerView.n decoration = new a();

    @NotNull
    private C9979a binding;

    public static final class a extends RecyclerView.n {
        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.A state) {
            Intrinsics.checkNotNullParameter(outRect, "outRect");
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(parent, "parent");
            Intrinsics.checkNotNullParameter(state, "state");
            if (view instanceof DisclosureItemView) {
                int childAdapterPosition = parent.getChildAdapterPosition(view);
                if (childAdapterPosition == 0) {
                    outRect.top = f.c();
                } else {
                    outRect.top = f.i();
                }
                if (childAdapterPosition == state.b() - 1) {
                    outRect.bottom = f.c();
                } else {
                    outRect.bottom = f.i();
                }
            }
        }
    }

    /* renamed from: ru.ozon.fintech.features.onboarding.ui.DisclosureItemView$b, reason: from kotlin metadata */
    public static final class Companion {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DisclosureItemView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void binds(@NotNull DisclosureItem itemState) {
        Drawable.ConstantState constantState;
        Drawable newDrawable;
        Drawable mutate;
        Intrinsics.checkNotNullParameter(itemState, "itemState");
        this.binding.f100351b.setImageResource(itemState.getIcon());
        this.binding.f100352c.setText(itemState.getTitle());
        Drawable a11 = C7232a.a(getContext(), R.drawable.background_rounded_semantic_bg_secondary_12);
        if (a11 == null || (constantState = a11.getConstantState()) == null || (newDrawable = constantState.newDrawable()) == null || (mutate = newDrawable.mutate()) == null) {
            return;
        }
        g.a(mutate, androidx.core.content.a.getColor(getContext(), itemState.getIconBgColor()));
        this.binding.f100351b.setBackground(mutate);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DisclosureItemView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ DisclosureItemView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisclosureItemView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        C9979a a11 = C9979a.a(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(a11, "inflate(...)");
        this.binding = a11;
    }
}
