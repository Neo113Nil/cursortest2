package ru.ozon.app.android.travel.feature.hotels.widgets.skiResortInfo.presentation;

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
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.travel.feature.hotels.widgets.skiResortInfo.data.SkiResortInfoDTO;
import ru.ozon.app.android.travel.feature.hotels.widgets.skiResortInfo.data.SkiResortInfoMapper;
import ru.ozon.app.android.travel.feature.hotels.widgets.skiResortInfo.di.SkiResortInfoComponent;
import ru.ozon.app.android.travel.feature.hotels.widgets.skiResortInfo.view.SkiResortInfoView;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00142\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R,\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR&\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 0\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/presentation/SkiResortInfoViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/di/SkiResortInfoComponent;", "Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/data/SkiResortInfoDTO;", "Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/presentation/SkiResortInfoVO;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/view/SkiResortInfoView;", "createView", "(Landroid/view/ViewGroup;)Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/view/SkiResortInfoView;", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/presentation/SkiResortInfoVO;)Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/presentation/SkiResortInfoVO;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/presentation/SkiResortInfoWidgetViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "", "Ljava/lang/Class;", "Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/presentation/SkiResortInfoTabsUpdateKey;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/data/SkiResortInfoMapper;", "getMapper", "()Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/data/SkiResortInfoMapper;", "mapper", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SkiResortInfoViewMapper extends WidgetViewMapper2<SkiResortInfoComponent, SkiResortInfoDTO, SkiResortInfoVO> {

    @NotNull
    private final Function2<View, ComposerReferences, SkiResortInfoWidgetViewHolder> holderProducer = new SkiResortInfoViewMapper$holderProducer$1(this);

    @NotNull
    private final List<Class<SkiResortInfoTabsUpdateKey>> supportedUpdates = C7714v.a0(SkiResortInfoTabsUpdateKey.class);

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, SkiResortInfoWidgetViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<SkiResortInfoTabsUpdateKey>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<SkiResortInfoComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return SkiResortInfoComponent.INSTANCE.create(storage);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public SkiResortInfoView createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        SkiResortInfoView skiResortInfoView = new SkiResortInfoView(context);
        skiResortInfoView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return skiResortInfoView;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public SkiResortInfoMapper getMapper() {
        return component().getMapper();
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, I00.d
    public SkiResortInfoVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull SkiResortInfoVO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (update instanceof SkiResortInfoTabsUpdateKey) {
            return SkiResortInfoVO.copy$default(oldItem, 0L, null, ((SkiResortInfoTabsUpdateKey) update).getNewTabs(), null, null, null, null, 123, null);
        }
        return null;
    }
}
