package ru.ozon.app.android.returns.creation.widgets.methods.presentation.dates.content;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.creation.widgets.methods.presentation.dates.DatesElementVO;
import ru.ozon.app.android.uikit.view.recycler.adapter.ViewHolder;
import ru.ozon.uni.android.atom.aspect.AspectView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.apsect.AspectHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00022\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001b¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/methods/presentation/dates/content/DateSlotViewHolder;", "Lru/ozon/app/android/uikit/view/recycler/adapter/ViewHolder;", "Lru/ozon/app/android/returns/creation/widgets/methods/presentation/dates/DatesElementVO$DateVO;", "Lru/ozon/uni/android/atom/aspect/AspectView;", "containerView", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "clickListener", "<init>", "(Lru/ozon/uni/android/atom/aspect/AspectView;Lkotlin/jvm/functions/Function1;)V", "createLayout", "()V", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "createTextAtomV2View", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "item", "", "", "payloads", "bind", "(Lru/ozon/app/android/returns/creation/widgets/methods/presentation/dates/DatesElementVO$DateVO;Ljava/util/List;)V", "Lru/ozon/uni/android/atom/aspect/AspectView;", "getContainerView", "()Lru/ozon/uni/android/atom/aspect/AspectView;", "Lkotlin/jvm/functions/Function1;", "dateTV", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "weekDayTV", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DateSlotViewHolder extends ViewHolder<DatesElementVO.DateVO> {
    public static final int $stable = TextAtomV2View.$stable | AspectView.$stable;

    @NotNull
    private final Function1<AtomAction, Unit> clickListener;

    @NotNull
    private final AspectView containerView;

    @NotNull
    private final TextAtomV2View dateTV;

    @NotNull
    private final TextAtomV2View weekDayTV;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DateSlotViewHolder(@NotNull AspectView containerView, @NotNull Function1<? super AtomAction, Unit> clickListener) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(clickListener, "clickListener");
        this.containerView = containerView;
        this.clickListener = clickListener;
        this.dateTV = createTextAtomV2View();
        this.weekDayTV = createTextAtomV2View();
        createLayout();
    }

    private final void createLayout() {
        LinearLayout linearLayout = new LinearLayout(getContainerView().getContext());
        linearLayout.setId(View.generateViewId());
        linearLayout.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        linearLayout.setOrientation(1);
        Context context = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int px = UiExtKt.toPx(10, context);
        Context context2 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int px2 = UiExtKt.toPx(4, context2);
        ViewExtKt.updatePadding(linearLayout, px, px2, px, px2);
        linearLayout.addView(this.dateTV);
        linearLayout.addView(this.weekDayTV);
        getContainerView().addView(linearLayout);
    }

    private final TextAtomV2View createTextAtomV2View() {
        Context context = getContainerView().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View.setId(View.generateViewId());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        textAtomV2View.setLayoutParams(layoutParams);
        textAtomV2View.setTextIsSelectable(false);
        return textAtomV2View;
    }

    @Override // ru.ozon.app.android.uikit.view.recycler.adapter.BaseViewHolder
    public /* bridge */ /* synthetic */ void bind(Object obj, List list) {
        bind((DatesElementVO.DateVO) obj, (List<? extends Object>) list);
    }

    @NotNull
    public AspectView getContainerView() {
        return this.containerView;
    }

    public void bind(@NotNull DatesElementVO.DateVO item, @NotNull List<? extends Object> payloads) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        AspectHolderKt.bind$default(getContainerView(), item.getWrapper(), null, 2, null);
        TextHolderKt.bind$default(this.dateTV, item.getTitle(), null, 2, null);
        TextHolderKt.bind$default(this.weekDayTV, item.getSubtitle(), null, 2, null);
        View itemView = this.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        ViewExtKt.setOnClickListenerThrottle$default(itemView, 0L, new DateSlotViewHolder$bind$1(item, this), 1, null);
    }
}
