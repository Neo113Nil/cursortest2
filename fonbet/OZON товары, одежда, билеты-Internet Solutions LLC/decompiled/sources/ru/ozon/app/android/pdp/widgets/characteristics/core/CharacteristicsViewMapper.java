package ru.ozon.app.android.pdp.widgets.characteristics.core;

import A00.a;
import android.view.View;
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
import ru.ozon.app.android.pdp.R$layout;
import ru.ozon.app.android.pdp.widgets.characteristics.data.CharacteristicsDTO;
import ru.ozon.app.android.pdp.widgets.characteristics.di.CharacteristicsWidgetComponent;
import ru.ozon.app.android.pdp.widgets.characteristics.presentation.CharacteristicsVO;
import ru.ozon.app.android.pdp.widgets.characteristics.presentation.CharacteristicsViewHolder;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\nJ\u001f\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\nJ+\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0010j\b\u0012\u0004\u0012\u00020\u0002`\u00112\n\u0010\u000f\u001a\u00060\rj\u0002`\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R,\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R&\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"0!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R,\u0010*\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040!0\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010 ¨\u0006+"}, d2 = {"Lru/ozon/app/android/pdp/widgets/characteristics/core/CharacteristicsViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/pdp/widgets/characteristics/di/CharacteristicsWidgetComponent;", "Lru/ozon/app/android/pdp/widgets/characteristics/data/CharacteristicsDTO;", "Lru/ozon/app/android/pdp/widgets/characteristics/presentation/CharacteristicsVO;", "<init>", "()V", "LA00/a$J$a;", "update", "oldVO", "(LA00/a$J$a;Lru/ozon/app/android/pdp/widgets/characteristics/presentation/CharacteristicsVO;)Lru/ozon/app/android/pdp/widgets/characteristics/presentation/CharacteristicsVO;", "oldItem", "handleUpdate", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/pdp/widgets/characteristics/presentation/CharacteristicsViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "", "Ljava/lang/Class;", "Lru/ozon/app/android/pdp/widgets/characteristics/core/PdpCharacteristicsExpandedUpdateKey;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Ll20/d;", "getMapper", "mapper", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CharacteristicsViewMapper extends WidgetViewMapper2<CharacteristicsWidgetComponent, CharacteristicsDTO, CharacteristicsVO> {
    private final int layout = R$layout.pdp_widget_characteristics;

    @NotNull
    private final Function2<View, ComposerReferences, CharacteristicsViewHolder> holderProducer = new CharacteristicsViewMapper$holderProducer$1(this);

    @NotNull
    private final List<Class<PdpCharacteristicsExpandedUpdateKey>> supportedUpdates = C7714v.a0(PdpCharacteristicsExpandedUpdateKey.class);

    private final CharacteristicsVO update(a.J.InterfaceC0007a update, CharacteristicsVO oldVO) {
        return update instanceof PdpCharacteristicsExpandedUpdateKey ? CharacteristicsVO.copy$default(oldVO, 0L, null, null, null, null, null, ((PdpCharacteristicsExpandedUpdateKey) update).getIsExpanded(), false, null, 447, null) : oldVO;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, CharacteristicsViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<CharacteristicsDTO, d, List<CharacteristicsVO>> getMapper() {
        return component().getMapper();
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<PdpCharacteristicsExpandedUpdateKey>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<CharacteristicsWidgetComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return CharacteristicsWidgetComponent.INSTANCE.getInstance(storage);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public CharacteristicsVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull CharacteristicsVO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        return update(update, oldItem);
    }
}
