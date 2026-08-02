package ru.ozon.fintech.features.demo.ui.account;

import Ar.b;
import C.D;
import E30.f;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.Keep;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.fintech.ui.button.small.FinSmallButtonView;

@Keep
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016¨\u0006\u0019"}, d2 = {"Lru/ozon/fintech/features/demo/ui/account/DemoAccountItemView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lru/ozon/fintech/features/demo/ui/account/DemoAccountItem;", "demoAccountItem", "", "bindState", "(Lru/ozon/fintech/features/demo/ui/account/DemoAccountItem;)V", "Landroid/widget/TextView;", "accountTitle", "Landroid/widget/TextView;", "accountDescription", "Lru/ozon/fintech/ui/button/small/FinSmallButtonView;", "accountDelete", "Lru/ozon/fintech/ui/button/small/FinSmallButtonView;", "Lru/ozon/fintech/features/demo/ui/account/DemoAccountItem;", "Companion", "b", "demo_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DemoAccountItemView extends FrameLayout {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    private static final RecyclerView.n accountsDecoration = new a();

    @NotNull
    private final FinSmallButtonView accountDelete;

    @NotNull
    private final TextView accountDescription;

    @NotNull
    private final TextView accountTitle;
    private DemoAccountItem demoAccountItem;

    public static final class a extends RecyclerView.n {
        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.A state) {
            Intrinsics.checkNotNullParameter(outRect, "outRect");
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(parent, "parent");
            Intrinsics.checkNotNullParameter(state, "state");
            if (view instanceof DemoAccountItemView) {
                outRect.left = f.i();
                outRect.top = f.i();
                outRect.right = f.i();
                outRect.bottom = f.i();
            }
        }
    }

    /* renamed from: ru.ozon.fintech.features.demo.ui.account.DemoAccountItemView$b, reason: from kotlin metadata */
    public static final class Companion {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DemoAccountItemView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(DemoAccountItemView demoAccountItemView, View view) {
        DemoAccountItem demoAccountItem = demoAccountItemView.demoAccountItem;
        if (demoAccountItem != null) {
            demoAccountItem.getOnCardClick().invoke(demoAccountItem.getId());
        }
    }

    public final void bindState(@NotNull DemoAccountItem demoAccountItem) {
        Intrinsics.checkNotNullParameter(demoAccountItem, "demoAccountItem");
        this.demoAccountItem = demoAccountItem;
        this.accountTitle.setText(demoAccountItem.getTitle());
        this.accountDescription.setText(demoAccountItem.getDescription());
        this.accountDelete.bindState(demoAccountItem.getDeleteButton());
        setBackground(androidx.core.content.a.getDrawable(getContext(), demoAccountItem.getSelected() ? R.drawable.background_rounded_white_stroke_16 : R.drawable.background_rounded_semantic_bg_secondary_16));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DemoAccountItemView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ DemoAccountItemView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DemoAccountItemView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(context).inflate(R.layout.demo_account_view, this);
        setLayoutParams(new ViewGroup.LayoutParams(D.d(140), -2));
        this.accountTitle = (TextView) findViewById(R.id.account_title);
        this.accountDescription = (TextView) findViewById(R.id.account_description);
        this.accountDelete = (FinSmallButtonView) findViewById(R.id.account_delete);
        setBackground(androidx.core.content.a.getDrawable(context, R.drawable.background_rounded_semantic_bg_secondary_16));
        setForeground(androidx.core.content.a.getDrawable(context, R.drawable.fintech_ripple_rect_round_bluewave));
        setElevation(4.0f);
        setPadding(f.i(), f.i(), f.i(), f.i());
        setOnClickListener(new b(this, 1));
    }
}
