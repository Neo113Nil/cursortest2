package ru.ozon.app.android.pdp.widgets.aspectsV4.info.core;

import A00.a;
import Kk.c;
import Sc.InterfaceC4008j;
import Sc.k;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import java.util.Map;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.WidgetViewHolderKt;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.pdp.ui.configurators.pdp.aspectsV4.data.AspectsV4DTO;
import ru.ozon.app.android.pdp.utils.DelegatesKt;
import ru.ozon.app.android.pdp.utils.PDPBackgroundColorDecorator;
import ru.ozon.app.android.pdp.widgets.aspectsV4.di.AspectsV4WidgetComponent;
import ru.ozon.app.android.pdp.widgets.aspectsV4.info.presentation.AspectsV4InfoUpdate;
import ru.ozon.app.android.pdp.widgets.aspectsV4.info.presentation.AspectsV4InfoVO;
import ru.ozon.app.android.pdp.widgets.aspectsV4.info.presentation.AspectsV4InfoView;
import ru.ozon.app.android.pdp.widgets.aspectsV4.info.presentation.AspectsV4InfoWidgetViewHolder;
import ru.ozon.uni.atoms.data.text.expandable.ExpandableTextDTO;

@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0014j\b\u0012\u0004\u0012\u00020\u0002`\u00152\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b$\u0010%R\u001b\u0010+\u001a\u00020&8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R,\u0010/\u001a\u0014\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020.0,8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R(\u00104\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\f030\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R'\u0010=\u001a\u000e\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020\t088BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010(\u001a\u0004\b;\u0010<¨\u0006>"}, d2 = {"Lru/ozon/app/android/pdp/widgets/aspectsV4/info/core/AspectsV4InfoExpandableTextViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/pdp/widgets/aspectsV4/di/AspectsV4WidgetComponent;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/aspectsV4/data/AspectsV4DTO$AspectInfo;", "Lru/ozon/app/android/pdp/widgets/aspectsV4/info/presentation/AspectsV4InfoVO;", "<init>", "()V", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/pdp/widgets/aspectsV4/info/presentation/AspectsV4InfoVO;)Lru/ozon/app/android/pdp/widgets/aspectsV4/info/presentation/AspectsV4InfoVO;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "newItem", "getPayload", "(Lru/ozon/app/android/pdp/widgets/aspectsV4/info/presentation/AspectsV4InfoVO;Lru/ozon/app/android/pdp/widgets/aspectsV4/info/presentation/AspectsV4InfoVO;)Ljava/lang/Object;", "Landroid/content/Context;", "context", "", "Lru/ozon/app/android/pdp/utils/PDPBackgroundColorDecorator;", "getDecorators", "(Landroid/content/Context;)Ljava/util/List;", "Lru/ozon/app/android/pdp/widgets/aspectsV4/info/core/AspectsV4InfoMapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/pdp/widgets/aspectsV4/info/core/AspectsV4InfoMapper;", "mapper", "Lkotlin/Function2;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/pdp/widgets/aspectsV4/info/presentation/AspectsV4InfoWidgetViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Ljava/lang/Class;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "", "", "expandedState$delegate", "getExpandedState", "()Ljava/util/Map;", "expandedState", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AspectsV4InfoExpandableTextViewMapper extends WidgetViewMapper2<AspectsV4WidgetComponent, AspectsV4DTO.AspectInfo, AspectsV4InfoVO> {

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j mapper = k.b(new AspectsV4InfoExpandableTextViewMapper$mapper$2(this));

    @NotNull
    private final Function2<View, ComposerReferences, AspectsV4InfoWidgetViewHolder> holderProducer = new AspectsV4InfoExpandableTextViewMapper$holderProducer$1(this);

    @NotNull
    private final List<Class<? extends a.J.InterfaceC0007a>> supportedUpdates = C7714v.a0(AspectsV4InfoUpdate.class);

    /* renamed from: expandedState$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j expandedState = DelegatesKt.lazyUnsafe(AspectsV4InfoExpandableTextViewMapper$expandedState$2.INSTANCE);

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, Boolean> getExpandedState() {
        return (Map) this.expandedState.getValue();
    }

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        AspectsV4DTO.AspectInfo aspectInfo = state instanceof AspectsV4DTO.AspectInfo ? (AspectsV4DTO.AspectInfo) state : null;
        return (aspectInfo != null ? aspectInfo.getExpandableText() : null) != null;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new AspectsV4InfoView(context);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public List<PDPBackgroundColorDecorator> getDecorators(@NotNull Context context) {
        return c.g(context, context, "context");
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, AspectsV4InfoWidgetViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<? extends a.J.InterfaceC0007a>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<AspectsV4WidgetComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return AspectsV4WidgetComponent.INSTANCE.getInstance(storage);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public AspectsV4InfoMapper getMapper() {
        return (AspectsV4InfoMapper) this.mapper.getValue();
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Object getPayload(@NotNull AspectsV4InfoVO oldItem, @NotNull AspectsV4InfoVO newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        WidgetViewHolderKt.getEMPTY_PAYLOAD();
        return Unit.f71690a;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public AspectsV4InfoVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull AspectsV4InfoVO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (update instanceof AspectsV4InfoUpdate) {
            AspectsV4InfoUpdate aspectsV4InfoUpdate = (AspectsV4InfoUpdate) update;
            if (oldItem.getId() == aspectsV4InfoUpdate.getStateId().hashCode()) {
                getExpandedState().put(aspectsV4InfoUpdate.getStateId(), Boolean.valueOf(aspectsV4InfoUpdate.getIsExpanded()));
                ExpandableTextDTO expandableText = oldItem.getExpandableText();
                return AspectsV4InfoVO.copy$default(oldItem, 0L, null, expandableText != null ? ExpandableTextDTO.copy$default(expandableText, null, null, null, null, null, aspectsV4InfoUpdate.getIsExpanded(), null, null, null, null, null, null, null, false, null, null, null, null, 262111, null) : null, null, 11, null);
            }
        }
        return oldItem;
    }
}
