package ru.ozon.app.android.search.widgets.feedbackForm.v2.presentation.input;

import A00.a;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
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
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.search.widgets.feedbackForm.v2.data.OptionSelectedV2;
import ru.ozon.app.android.search.widgets.feedbackForm.v2.data.model.InputV2Model;
import ru.ozon.app.android.search.widgets.feedbackForm.v2.di.FeedbackFormV2Component;
import ru.ozon.app.android.search.widgets.feedbackForm.v2.presentation.input.FeedbackInputV2ViewHolder;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.textArea.TextAreaView;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u00192\n\u0010\u0018\u001a\u00060\u0016j\u0002`\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR6\u0010 \u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u00060\u001dj\u0002`\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u001f0\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R<\u0010'\u001a$\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020$\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040%j\b\u0012\u0004\u0012\u00020\u0004`&0\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010!\u001a\u0004\b(\u0010#R&\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0)0\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lru/ozon/app/android/search/widgets/feedbackForm/v2/presentation/input/FeedbackInputV2ViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/search/widgets/feedbackForm/v2/di/FeedbackFormV2Component;", "Lru/ozon/app/android/search/widgets/feedbackForm/v2/data/model/InputV2Model;", "Lru/ozon/app/android/search/widgets/feedbackForm/v2/presentation/input/FeedbackInputV2VO;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/search/widgets/feedbackForm/v2/presentation/input/FeedbackInputV2VO;)Lru/ozon/app/android/search/widgets/feedbackForm/v2/presentation/input/FeedbackInputV2VO;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lkotlin/Function2;", "Ll20/d;", "Lru/ozon/composer/network/widget/item/WidgetInfo;", "", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "holderProducer", "getHolderProducer", "Ljava/lang/Class;", "Lru/ozon/app/android/search/widgets/feedbackForm/v2/data/OptionSelectedV2;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FeedbackInputV2ViewMapper extends WidgetViewMapper2<FeedbackFormV2Component, InputV2Model, FeedbackInputV2VO> {

    @NotNull
    private final Function2<InputV2Model, d, List<FeedbackInputV2VO>> mapper = FeedbackInputV2ViewMapper$mapper$1.INSTANCE;

    @NotNull
    private final Function2<View, ComposerReferences, k<FeedbackInputV2VO>> holderProducer = new FeedbackInputV2ViewMapper$holderProducer$1(this);

    @NotNull
    private final List<Class<OptionSelectedV2>> supportedUpdates = C7714v.a0(OptionSelectedV2.class);

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return state instanceof InputV2Model;
    }

    @Override // ru.ozon.composer.ui.widget.g
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TextAreaView textAreaView = new TextAreaView(context, null, 0, 6, null);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        FeedbackInputV2ViewHolder.Companion companion = FeedbackInputV2ViewHolder.INSTANCE;
        marginLayoutParams.setMargins(companion.getHORIZONTAL_MARGIN(), marginLayoutParams.topMargin, companion.getHORIZONTAL_MARGIN(), companion.getBOTTOM_MARGIN());
        textAreaView.setLayoutParams(marginLayoutParams);
        return textAreaView;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<FeedbackInputV2VO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<InputV2Model, d, List<FeedbackInputV2VO>> getMapper() {
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

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public FeedbackInputV2VO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull FeedbackInputV2VO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        return update instanceof OptionSelectedV2 ? FeedbackInputV2VO.copy$default(oldItem, 0L, ((OptionSelectedV2) update).getInputSettings(), 1, null) : oldItem;
    }
}
