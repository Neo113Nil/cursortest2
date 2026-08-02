package ru.ozon.fintech.ui.horizontalthree;

import C.D;
import E30.g;
import H30.z;
import android.content.Context;
import android.graphics.Outline;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.Keep;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.detmir.recycli.adapters.RecyclerAdapter;
import com.detmir.recycli.adapters.RecyclerItem;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.uni.android.uikit.common.StyleParser;

@Keep
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u0011J\b\u0010\u0016\u001a\u00020\u0015H\u0002J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u001b\u0010\u001b\u001a\u00020\u0015*\u00020\u000b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0002\u0010\u001dJ\u0016\u0010\u001e\u001a\u00020\u0015*\u00020\u000b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001aH\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lru/ozon/fintech/ui/horizontalthree/HorizontalThreeView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "leftWidgetView", "Landroid/widget/FrameLayout;", "rightWidgetView", "centerWidgetView", "holder", "Landroid/widget/LinearLayout;", "state", "Lru/ozon/fintech/ui/horizontalthree/HorizontalThreeState;", "clickListener", "Landroid/view/View$OnClickListener;", "bindState", "", "setRounded", "getViewFromRecycli", "Landroid/view/View;", "recyclerItem", "Lcom/detmir/recycli/adapters/RecyclerItem;", "setGravity", "gravity", "(Landroid/widget/FrameLayout;Ljava/lang/Integer;)V", "setView", "item", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HorizontalThreeView extends ConstraintLayout {

    @NotNull
    private final FrameLayout centerWidgetView;

    @NotNull
    private final View.OnClickListener clickListener;

    @NotNull
    private final LinearLayout holder;

    @NotNull
    private final FrameLayout leftWidgetView;

    @NotNull
    private final FrameLayout rightWidgetView;
    private HorizontalThreeState state;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HorizontalThreeView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void clickListener$lambda$1(HorizontalThreeView horizontalThreeView, View view) {
        HorizontalThreeState horizontalThreeState = horizontalThreeView.state;
        Function2<String, Boolean, Unit> onClick = horizontalThreeState != null ? horizontalThreeState.getOnClick() : null;
        HorizontalThreeState horizontalThreeState2 = horizontalThreeView.state;
        String actionId = horizontalThreeState2 != null ? horizontalThreeState2.getActionId() : null;
        HorizontalThreeState horizontalThreeState3 = horizontalThreeView.state;
        g.b(new a(), onClick, actionId, horizontalThreeState3 != null ? Boolean.valueOf(horizontalThreeState3.getCloseOnClick()) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit clickListener$lambda$1$lambda$0(Function2 onClick, String actionId, boolean z11) {
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        onClick.invoke(actionId, Boolean.valueOf(z11));
        return Unit.f71690a;
    }

    private final View getViewFromRecycli(RecyclerItem recyclerItem) {
        RecyclerAdapter recyclerAdapter = new RecyclerAdapter();
        recyclerAdapter.bindState(C7714v.a0(recyclerItem));
        RecyclerView.C createViewHolder = recyclerAdapter.createViewHolder(this, recyclerAdapter.getItemViewType(0));
        Intrinsics.checkNotNullExpressionValue(createViewHolder, "createViewHolder(...)");
        recyclerAdapter.bindViewHolder(createViewHolder, 0);
        View itemView = createViewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        return itemView;
    }

    private final void setGravity(FrameLayout frameLayout, Integer num) {
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.gravity = num != null ? num.intValue() : -1;
        frameLayout.setLayoutParams(layoutParams2);
    }

    private final void setRounded() {
        this.holder.setOutlineProvider(new ViewOutlineProvider() { // from class: ru.ozon.fintech.ui.horizontalthree.HorizontalThreeView$setRounded$1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                HorizontalThreeState horizontalThreeState;
                LinearLayout linearLayout;
                Integer radius;
                horizontalThreeState = HorizontalThreeView.this.state;
                int d11 = D.d((horizontalThreeState == null || (radius = horizontalThreeState.getRadius()) == null) ? 0 : radius.intValue());
                if (view != null && outline != null && view.getWidth() != 0 && view.getHeight() != 0) {
                    outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), d11);
                }
                linearLayout = HorizontalThreeView.this.holder;
                linearLayout.setTag(new Pair("radius", Integer.valueOf(d11)));
            }
        });
    }

    private final void setView(FrameLayout frameLayout, RecyclerItem recyclerItem) {
        frameLayout.removeAllViews();
        if (recyclerItem != null) {
            frameLayout.addView(getViewFromRecycli(recyclerItem));
        }
    }

    public final void bindState(@NotNull HorizontalThreeState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        z.a(this, state.getPaddings());
        LinearLayout linearLayout = this.holder;
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, state.getBackColor());
        linearLayout.setBackgroundColor(parseColor != null ? parseColor.intValue() : 0);
        HorizontalThreeState horizontalThreeState = this.state;
        if (!Intrinsics.d(horizontalThreeState != null ? horizontalThreeState.getLeftWidget() : null, state.getLeftWidget())) {
            setView(this.leftWidgetView, state.getLeftWidget());
        }
        HorizontalThreeState horizontalThreeState2 = this.state;
        if (!Intrinsics.d(horizontalThreeState2 != null ? horizontalThreeState2.getLeftWidgetGravity() : null, state.getLeftWidgetGravity())) {
            setGravity(this.leftWidgetView, state.getLeftWidgetGravity());
        }
        HorizontalThreeState horizontalThreeState3 = this.state;
        if (!Intrinsics.d(horizontalThreeState3 != null ? horizontalThreeState3.getCenterWidget() : null, state.getCenterWidget())) {
            setView(this.centerWidgetView, state.getCenterWidget());
        }
        HorizontalThreeState horizontalThreeState4 = this.state;
        if (!Intrinsics.d(horizontalThreeState4 != null ? horizontalThreeState4.getCenterWidgetGravity() : null, state.getCenterWidgetGravity())) {
            setGravity(this.centerWidgetView, state.getCenterWidgetGravity());
        }
        HorizontalThreeState horizontalThreeState5 = this.state;
        if (!Intrinsics.d(horizontalThreeState5 != null ? horizontalThreeState5.getRightWidget() : null, state.getRightWidget())) {
            setView(this.rightWidgetView, state.getRightWidget());
        }
        HorizontalThreeState horizontalThreeState6 = this.state;
        if (!Intrinsics.d(horizontalThreeState6 != null ? horizontalThreeState6.getRightWidgetGravity() : null, state.getRightWidgetGravity())) {
            setGravity(this.rightWidgetView, state.getRightWidgetGravity());
        }
        if (Intrinsics.d(state.getActionEnabled(), Boolean.TRUE)) {
            setOnClickListener(this.clickListener);
        } else {
            setOnClickListener(null);
            setClickable(false);
        }
        setRounded();
        this.state = state;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HorizontalThreeView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ HorizontalThreeView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HorizontalThreeView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.clickListener = new FM.a(this, 16);
        View.inflate(context, R.layout.fin_horizontal_three_view, this);
        setLayoutParams(new ConstraintLayout.b(-1, -2));
        this.leftWidgetView = (FrameLayout) findViewById(R.id.horizontal_left_widget);
        this.rightWidgetView = (FrameLayout) findViewById(R.id.horizontal_right_widget);
        this.centerWidgetView = (FrameLayout) findViewById(R.id.horizontal_center_widget);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.horizontal_holder);
        this.holder = linearLayout;
        linearLayout.setClipToOutline(true);
        setRounded();
    }
}
