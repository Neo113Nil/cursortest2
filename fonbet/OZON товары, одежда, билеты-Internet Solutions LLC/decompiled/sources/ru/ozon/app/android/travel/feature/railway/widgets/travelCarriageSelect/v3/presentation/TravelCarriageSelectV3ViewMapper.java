package ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageSelect.v3.presentation;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.WidgetViewHolderKt;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageSelect.v3.data.TravelCarriageSelectV3DTO;
import ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageSelect.v3.di.TravelCarriageSelectV3Component;
import ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageSelect.v3.presentation.view.TravelCarriageSelectV3View;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u001aj\b\u0012\u0004\u0012\u00020\u0002`\u001b2\n\u0010\u0019\u001a\u00060\u0017j\u0002`\u0018H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR,\u0010\"\u001a\u0014\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R0\u0010)\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u00060&j\u0002`'\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00130\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010%¨\u0006*"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v3/presentation/TravelCarriageSelectV3ViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v3/di/TravelCarriageSelectV3Component;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v3/data/TravelCarriageSelectV3DTO;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v3/presentation/TravelCarriageSelectV3VO;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v3/presentation/view/TravelCarriageSelectV3View;", "createView", "(Landroid/view/ViewGroup;)Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v3/presentation/view/TravelCarriageSelectV3View;", "oldItem", "newItem", "", "getPayload", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v3/presentation/TravelCarriageSelectV3VO;Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v3/presentation/TravelCarriageSelectV3VO;)Ljava/lang/Object;", "Landroid/content/Context;", "context", "", "Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v3/presentation/TravelCarriageSelectV3Decoration;", "getDecorators", "(Landroid/content/Context;)Ljava/util/List;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v3/presentation/TravelCarriageSelectV3WidgetViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "getMapper", "mapper", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TravelCarriageSelectV3ViewMapper extends WidgetViewMapper2<TravelCarriageSelectV3Component, TravelCarriageSelectV3DTO, TravelCarriageSelectV3VO> {

    @NotNull
    private final Function2<View, ComposerReferences, TravelCarriageSelectV3WidgetViewHolder> holderProducer = new TravelCarriageSelectV3ViewMapper$holderProducer$1(this);

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public List<TravelCarriageSelectV3Decoration> getDecorators(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return C7714v.a0(new TravelCarriageSelectV3Decoration(context));
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, TravelCarriageSelectV3WidgetViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<TravelCarriageSelectV3DTO, d, List<TravelCarriageSelectV3VO>> getMapper() {
        return component().getMapper();
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<TravelCarriageSelectV3Component> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return TravelCarriageSelectV3Component.INSTANCE.create(storage);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public TravelCarriageSelectV3View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TravelCarriageSelectV3View travelCarriageSelectV3View = new TravelCarriageSelectV3View(context);
        travelCarriageSelectV3View.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return travelCarriageSelectV3View;
    }

    @Override // ru.ozon.composer.ui.widget.g
    public Object getPayload(@NotNull TravelCarriageSelectV3VO oldItem, @NotNull TravelCarriageSelectV3VO newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        if (!Intrinsics.d(oldItem, newItem)) {
            return null;
        }
        WidgetViewHolderKt.getEMPTY_PAYLOAD();
        return Unit.f71690a;
    }
}
