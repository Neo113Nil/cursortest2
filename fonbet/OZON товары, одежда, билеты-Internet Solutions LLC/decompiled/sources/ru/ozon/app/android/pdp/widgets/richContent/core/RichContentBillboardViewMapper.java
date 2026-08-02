package ru.ozon.app.android.pdp.widgets.richContent.core;

import A00.a;
import Kk.c;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
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
import ru.ozon.app.android.pdp.utils.PDPBackgroundColorDecorator;
import ru.ozon.app.android.pdp.widgets.richContent.data.RichContentDTO;
import ru.ozon.app.android.pdp.widgets.richContent.di.RichContentWidgetComponent;
import ru.ozon.app.android.pdp.widgets.richContent.presentation.RichContentViewFactory;
import ru.ozon.app.android.pdp.widgets.richContent.presentation.subWidgets.billboard.RichContentBillboardVoWrapper;
import ru.ozon.app.android.pdp.widgets.richContent.presentation.subWidgets.billboard.RichContentBillboardWidgetViewHolder;

@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0014j\b\u0012\u0004\u0012\u00020\u0002`\u00152\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010!\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0004H\u0016¢\u0006\u0004\b!\u0010\"R\u001c\u0010$\u001a\u0004\u0018\u00010#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R&\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0(0\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R2\u00100\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020/\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u001a0.8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R,\u00107\u001a\u0014\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u0002060.8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b7\u00101\u001a\u0004\b8\u00103¨\u00069"}, d2 = {"Lru/ozon/app/android/pdp/widgets/richContent/core/RichContentBillboardViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/pdp/widgets/richContent/di/RichContentWidgetComponent;", "Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO$Content$BillboardDTO;", "Lru/ozon/app/android/pdp/widgets/richContent/presentation/subWidgets/billboard/RichContentBillboardVoWrapper;", "<init>", "()V", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "parent", "Landroidx/appcompat/widget/AppCompatImageView;", "createView", "(Landroid/view/ViewGroup;)Landroidx/appcompat/widget/AppCompatImageView;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Landroid/content/Context;", "context", "", "Lru/ozon/app/android/pdp/utils/PDPBackgroundColorDecorator;", "getDecorators", "(Landroid/content/Context;)Ljava/util/List;", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/pdp/widgets/richContent/presentation/subWidgets/billboard/RichContentBillboardVoWrapper;)Lru/ozon/app/android/pdp/widgets/richContent/presentation/subWidgets/billboard/RichContentBillboardVoWrapper;", "", "layout", "Ljava/lang/Integer;", "getLayout", "()Ljava/lang/Integer;", "Ljava/lang/Class;", "Lru/ozon/app/android/pdp/widgets/richContent/core/RichContentExpandStateChangedUpdateKey;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Lkotlin/Function2;", "Ll20/d;", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/pdp/widgets/richContent/presentation/subWidgets/billboard/RichContentBillboardWidgetViewHolder;", "holderProducer", "getHolderProducer", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RichContentBillboardViewMapper extends WidgetViewMapper2<RichContentWidgetComponent, RichContentDTO.Content.BillboardDTO, RichContentBillboardVoWrapper> {
    private final Integer layout;

    @NotNull
    private final List<Class<RichContentExpandStateChangedUpdateKey>> supportedUpdates = C7714v.a0(RichContentExpandStateChangedUpdateKey.class);

    @NotNull
    private final Function2<RichContentDTO.Content.BillboardDTO, d, List<RichContentBillboardVoWrapper>> mapper = new RichContentBillboardViewMapper$mapper$1(this);

    @NotNull
    private final Function2<View, ComposerReferences, RichContentBillboardWidgetViewHolder> holderProducer = RichContentBillboardViewMapper$holderProducer$1.INSTANCE;

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return state instanceof RichContentDTO.Content.BillboardDTO;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public List<PDPBackgroundColorDecorator> getDecorators(@NotNull Context context) {
        return c.g(context, context, "context");
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, RichContentBillboardWidgetViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    public Integer getLayout() {
        return this.layout;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<RichContentDTO.Content.BillboardDTO, d, List<RichContentBillboardVoWrapper>> getMapper() {
        return this.mapper;
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<RichContentExpandStateChangedUpdateKey>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<RichContentWidgetComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return RichContentWidgetComponent.INSTANCE.create(storage);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public AppCompatImageView createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        RichContentViewFactory richContentViewFactory = RichContentViewFactory.INSTANCE;
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return RichContentViewFactory.createBillboardView$default(richContentViewFactory, context, null, 2, null);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, I00.d
    public RichContentBillboardVoWrapper handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull RichContentBillboardVoWrapper oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Boolean isExpanded = RichContentUtilsKt.isExpanded(oldItem, update);
        if (isExpanded != null) {
            return RichContentBillboardVoWrapper.copy$default(oldItem, null, 0, null, 0L, isExpanded.booleanValue(), 15, null);
        }
        return null;
    }
}
