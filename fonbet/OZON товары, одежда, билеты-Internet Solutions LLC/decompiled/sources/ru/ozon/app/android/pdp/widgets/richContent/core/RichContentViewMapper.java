package ru.ozon.app.android.pdp.widgets.richContent.core;

import A00.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import gk0.q;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.pdp.flags.RichContentSubWidgetsFlag;
import ru.ozon.app.android.pdp.ui.configurators.R$layout;
import ru.ozon.app.android.pdp.view.shared.ExpandableWidget$ExpandButton;
import ru.ozon.app.android.pdp.widgets.richContent.data.RichContentDTO;
import ru.ozon.app.android.pdp.widgets.richContent.di.RichContentWidgetComponent;
import ru.ozon.app.android.pdp.widgets.richContent.presentation.RichContentVO;
import ru.ozon.app.android.pdp.widgets.richContent.presentation.RichContentWidgetViewHolder;
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0019j\b\u0012\u0004\u0012\u00020\u0002`\u001a2\n\u0010\u0018\u001a\u00060\u0016j\u0002`\u0017H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010 \u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R,\u0010%\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R&\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0*0)8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0014\u00103\u001a\u0002008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00102¨\u00064"}, d2 = {"Lru/ozon/app/android/pdp/widgets/richContent/core/RichContentViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/pdp/widgets/richContent/di/RichContentWidgetComponent;", "Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO;", "Lru/ozon/app/android/pdp/widgets/richContent/presentation/RichContentVO;", "<init>", "()V", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/pdp/widgets/richContent/presentation/RichContentVO;)Lru/ozon/app/android/pdp/widgets/richContent/presentation/RichContentVO;", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "", "layoutRes", "I", "imageHeight", "Ljava/lang/Integer;", "Lkotlin/Function2;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/pdp/widgets/richContent/presentation/RichContentWidgetViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "", "Ljava/lang/Class;", "Lru/ozon/app/android/pdp/widgets/richContent/core/RichContentExpandStateChangedUpdateKey;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Lru/ozon/app/android/pdp/widgets/richContent/core/RichContentMapper;", "getMapper", "()Lru/ozon/app/android/pdp/widgets/richContent/core/RichContentMapper;", "mapper", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RichContentViewMapper extends WidgetViewMapper2<RichContentWidgetComponent, RichContentDTO, RichContentVO> {
    private Integer imageHeight;
    private final int layoutRes = R$layout.pdp_widget_rich_content;

    @NotNull
    private final Function2<View, ComposerReferences, RichContentWidgetViewHolder> holderProducer = new RichContentViewMapper$holderProducer$1(this);

    @NotNull
    private final List<Class<RichContentExpandStateChangedUpdateKey>> supportedUpdates = C7714v.a0(RichContentExpandStateChangedUpdateKey.class);

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return state instanceof RichContentDTO;
    }

    @Override // ru.ozon.composer.ui.widget.g
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View h11 = q.f64554a.h(this.layoutRes);
        return h11 == null ? LayoutInflater.from(parent.getContext()).inflate(this.layoutRes, parent, false) : h11;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, RichContentWidgetViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
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

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public RichContentMapper getMapper() {
        return new RichContentMapper(component().getContext(), component().getAppType() == AppType.SELECT, new RichContentViewMapper$mapper$1(this));
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, I00.d
    public RichContentVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull RichContentVO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        RichContentExpandStateChangedUpdateKey richContentExpandStateChangedUpdateKey = (RichContentExpandStateChangedUpdateKey) update;
        RichContentVO vo = richContentExpandStateChangedUpdateKey.getVo();
        boolean isExpanded = vo.getIsExpanded();
        boolean z11 = !isExpanded;
        ExpandableWidget$ExpandButton expandButton = vo.getExpandButton();
        if (!isExpanded) {
            expandButton = null;
        }
        return RichContentVO.copy$default(vo, 0L, null, expandButton, z11, component().getFeatureChecker().isEnabled(RichContentSubWidgetsFlag.INSTANCE) ? C7714v.K0(vo.getItems(), richContentExpandStateChangedUpdateKey.getVisibleItemsCount()) : vo.getItems(), null, 35, null);
    }
}
