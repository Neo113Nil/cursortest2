package ru.ozon.app.android.search.widgets.feedbackForm.v2.presentation.cell;

import A00.a;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import j10.h;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.search.widgets.feedbackForm.v2.data.OptionSelectedV2;
import ru.ozon.app.android.search.widgets.feedbackForm.v2.data.model.CellV2Model;
import ru.ozon.app.android.search.widgets.feedbackForm.v2.di.FeedbackFormV2Component;
import ru.ozon.app.android.search.widgets.feedbackForm.v2.presentation.cell.FeedbackCellV2ViewHolder;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.android.cell.CellView;

@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J=\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00072\n\u0010\u000b\u001a\u00060\tj\u0002`\n2\u0006\u0010\r\u001a\u00020\f2\u0010\u0010\u0010\u001a\f\u0012\u0004\u0012\u00020\t0\u000ej\u0002`\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b \u0010!J!\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00020%2\n\u0010$\u001a\u00060\"j\u0002`#H\u0016¢\u0006\u0004\b&\u0010'R&\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0)0(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R6\u00102\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u000600j\u0002`1\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040(0/8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R<\u00109\u001a$\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020\f\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000407j\b\u0012\u0004\u0012\u00020\u0004`80/8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u00103\u001a\u0004\b:\u00105¨\u0006;"}, d2 = {"Lru/ozon/app/android/search/widgets/feedbackForm/v2/presentation/cell/FeedbackCellV2ViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/search/widgets/feedbackForm/v2/di/FeedbackFormV2Component;", "Lru/ozon/app/android/search/widgets/feedbackForm/v2/data/model/CellV2Model;", "Lru/ozon/app/android/search/widgets/feedbackForm/v2/presentation/cell/FeedbackCellV2VO;", "<init>", "()V", "Landroid/view/ViewGroup;", "composerRootView", "Lru/ozon/composer/ui/widget/l;", "Lru/ozon/app/android/composer/view/ComposerViewObject;", "viewObject", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lj10/h;", "Lru/ozon/app/android/composer/viewmodel/ComposerVoHelper;", "viewItemHelper", "", "constructLayout", "(Landroid/view/ViewGroup;Lru/ozon/composer/ui/widget/l;Lru/ozon/app/android/composer/ComposerReferences;Lj10/h;)V", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/search/widgets/feedbackForm/v2/presentation/cell/FeedbackCellV2VO;)Lru/ozon/app/android/search/widgets/feedbackForm/v2/presentation/cell/FeedbackCellV2VO;", "parent", "Lru/ozon/uni/android/cell/CellView;", "createView", "(Landroid/view/ViewGroup;)Lru/ozon/uni/android/cell/CellView;", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "", "Ljava/lang/Class;", "Lru/ozon/app/android/search/widgets/feedbackForm/v2/data/OptionSelectedV2;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Lkotlin/Function2;", "Ll20/d;", "Lru/ozon/composer/network/widget/item/WidgetInfo;", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "Landroid/view/View;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "holderProducer", "getHolderProducer", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FeedbackCellV2ViewMapper extends WidgetViewMapper2<FeedbackFormV2Component, CellV2Model, FeedbackCellV2VO> {

    @NotNull
    private final List<Class<OptionSelectedV2>> supportedUpdates = C7714v.a0(OptionSelectedV2.class);

    @NotNull
    private final Function2<CellV2Model, d, List<FeedbackCellV2VO>> mapper = FeedbackCellV2ViewMapper$mapper$1.INSTANCE;

    @NotNull
    private final Function2<View, ComposerReferences, k<FeedbackCellV2VO>> holderProducer = new FeedbackCellV2ViewMapper$holderProducer$1(this);

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return state instanceof CellV2Model;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    public void constructLayout(@NotNull ViewGroup composerRootView, @NotNull l viewObject, @NotNull ComposerReferences references, @NotNull h<l> viewItemHelper) {
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(viewItemHelper, "viewItemHelper");
        ComposerViewExtensionKt.composerRecyclerView(composerRootView).setItemAnimator(null);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<FeedbackCellV2VO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<CellV2Model, d, List<FeedbackCellV2VO>> getMapper() {
        return this.mapper;
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<OptionSelectedV2>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<FeedbackFormV2Component> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return FeedbackFormV2Component.INSTANCE.create(storage);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public CellView createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        CellView cellView = new CellView(context, null, 0, 0, null, 30, null);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        FeedbackCellV2ViewHolder.Companion companion = FeedbackCellV2ViewHolder.INSTANCE;
        marginLayoutParams.setMargins(companion.getHORIZONTAL_MARGIN(), marginLayoutParams.topMargin, companion.getHORIZONTAL_MARGIN(), marginLayoutParams.bottomMargin);
        cellView.setLayoutParams(marginLayoutParams);
        return cellView;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public FeedbackCellV2VO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull FeedbackCellV2VO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        return update instanceof OptionSelectedV2 ? FeedbackCellV2VO.copy$default(oldItem, 0L, null, null, null, false, false, ((OptionSelectedV2) update).getIsCellSelected(), 63, null) : oldItem;
    }
}
