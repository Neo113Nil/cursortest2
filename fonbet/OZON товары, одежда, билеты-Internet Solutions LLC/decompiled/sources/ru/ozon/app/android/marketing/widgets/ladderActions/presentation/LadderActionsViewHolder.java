package ru.ozon.app.android.marketing.widgets.ladderActions.presentation;

import W10.c;
import WZ.t;
import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0001\u0018\u0000 :2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001:B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00022\n\u0010\u001e\u001a\u00060\u001cj\u0002`\u001dH\u0014¢\u0006\u0004\b\u001f\u0010 J3\u0010'\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00022\n\u0010#\u001a\u00060!j\u0002`\"2\u000e\u0010&\u001a\n\u0018\u00010$j\u0004\u0018\u0001`%H\u0016¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010)R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010*R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010+R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R \u00102\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u0018008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u00108\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109¨\u0006;"}, d2 = {"Lru/ozon/app/android/marketing/widgets/ladderActions/presentation/LadderActionsViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/marketing/widgets/ladderActions/presentation/LadderActionsVO;", "Lru/ozon/app/android/marketing/widgets/ladderActions/presentation/LadderActionsDecorator;", "itemDecorator", "Landroidx/recyclerview/widget/RecyclerView;", "containerView", "Ll10/i;", "screenContainer", "Lru/ozon/app/android/marketing/widgets/ladderActions/presentation/LadderActionsViewModel;", "viewModel", "", "isSelect", "<init>", "(Lru/ozon/app/android/marketing/widgets/ladderActions/presentation/LadderActionsDecorator;Landroidx/recyclerview/widget/RecyclerView;Ll10/i;Lru/ozon/app/android/marketing/widgets/ladderActions/presentation/LadderActionsViewModel;Z)V", "Landroid/content/Context;", "context", "", "bgColor", "Landroid/graphics/drawable/ShapeDrawable;", "getRoundedBackground", "(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/ShapeDrawable;", "Landroidx/lifecycle/J;", "lifecycle", "", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/marketing/widgets/ladderActions/presentation/LadderActionsVO;Ll20/d;)V", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/marketing/widgets/ladderActions/presentation/LadderActionsVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/marketing/widgets/ladderActions/presentation/LadderActionsDecorator;", "Landroidx/recyclerview/widget/RecyclerView;", "Ll10/i;", "Lru/ozon/app/android/marketing/widgets/ladderActions/presentation/LadderActionsViewModel;", "", "cornerRadius", "F", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/marketing/widgets/ladderActions/presentation/LadderActionsAdapter;", "ladderAdapter", "Lru/ozon/app/android/marketing/widgets/ladderActions/presentation/LadderActionsAdapter;", "", "widgetId", "Ljava/lang/Long;", "Companion", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class LadderActionsViewHolder extends k<LadderActionsVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final RecyclerView containerView;
    private final float cornerRadius;

    @NotNull
    private final LadderActionsDecorator itemDecorator;

    @NotNull
    private final LadderActionsAdapter ladderAdapter;

    @NotNull
    private final i screenContainer;

    @NotNull
    private final LadderActionsViewModel viewModel;
    private Long widgetId;
    public static final int $stable = 8;
    private static final float dp16 = ResourceExtKt.toPxF(16);
    private static final float dp24 = ResourceExtKt.toPxF(24);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LadderActionsViewHolder(@NotNull LadderActionsDecorator itemDecorator, @NotNull RecyclerView containerView, @NotNull i screenContainer, @NotNull LadderActionsViewModel viewModel, boolean z11) {
        super(containerView);
        Intrinsics.checkNotNullParameter(itemDecorator, "itemDecorator");
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(screenContainer, "screenContainer");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.itemDecorator = itemDecorator;
        this.containerView = containerView;
        this.screenContainer = screenContainer;
        this.viewModel = viewModel;
        this.cornerRadius = z11 ? dp24 : dp16;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(screenContainer, this).onClick(new LadderActionsViewHolder$actionHandler$1(this)).buildHandler();
        this.actionHandler = buildHandler;
        LadderActionsAdapter ladderActionsAdapter = new LadderActionsAdapter(buildHandler, this);
        this.ladderAdapter = ladderActionsAdapter;
        containerView.setAdapter(ladderActionsAdapter);
    }

    private final ShapeDrawable getRoundedBackground(Context context, String bgColor) {
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        float[] fArr = new float[8];
        for (int i11 = 0; i11 < 8; i11++) {
            fArr[i11] = this.cornerRadius;
        }
        shapeDrawable.setShape(new RoundRectShape(fArr, null, null));
        shapeDrawable.getPaint().setColor(StyleParser.INSTANCE.parseColor(context, bgColor, UniColors.LAYER_FLOOR_1.getResId()));
        return shapeDrawable;
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onAttachViewModel(@NotNull J lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        this.viewModel.getUpdate().observe(lifecycle, new LadderActionsViewHolder$sam$androidx_lifecycle_Observer$0(new LadderActionsViewHolder$onAttachViewModel$1(this)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull LadderActionsVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.widgetId = Long.valueOf(info.d().hashCode());
        this.itemDecorator.bind(StyleParser.INSTANCE.parseColor(getContext(), item.getCellSeparatorColor(), UniColors.LAYER_FLOOR_1.getResId()));
        this.containerView.setBackground(getRoundedBackground(getContext(), item.getBackgroundColor()));
        this.ladderAdapter.submitList(item.getCells());
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull LadderActionsVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((LadderActionsViewHolder) item, trackingData, viewedPond);
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.screenContainer.X(), tokenizedEvent, null, 2, null);
        }
    }
}
