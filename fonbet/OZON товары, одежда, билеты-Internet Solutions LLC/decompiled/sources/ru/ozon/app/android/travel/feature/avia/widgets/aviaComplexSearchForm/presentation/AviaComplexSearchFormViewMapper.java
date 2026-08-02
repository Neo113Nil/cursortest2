package ru.ozon.app.android.travel.feature.avia.widgets.aviaComplexSearchForm.presentation;

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
import ru.ozon.app.android.travel.feature.avia.widgets.aviaComplexSearchForm.data.AviaComplexSearchFormDTO;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaComplexSearchForm.di.AviaComplexSearchFormComponent;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaComplexSearchForm.view.AviaComplexSearchFormView;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0019\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR,\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R&\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0#0\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R0\u0010,\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u00060)j\u0002`*\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\"0\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010!¨\u0006-"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/presentation/AviaComplexSearchFormViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/di/AviaComplexSearchFormComponent;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/data/AviaComplexSearchFormDTO;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/presentation/AviaComplexSearchFormVO;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "oldItem", "newItem", "", "getPayload", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/presentation/AviaComplexSearchFormVO;Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/presentation/AviaComplexSearchFormVO;)Ljava/lang/Object;", "LA00/a$J$a;", "update", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/presentation/AviaComplexSearchFormVO;)Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/presentation/AviaComplexSearchFormVO;", "Lkotlin/Function2;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/presentation/AviaComplexSearchFormWidgetViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "", "Ljava/lang/Class;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/presentation/AviaComplexSearchFormUpdate;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "getMapper", "mapper", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AviaComplexSearchFormViewMapper extends WidgetViewMapper2<AviaComplexSearchFormComponent, AviaComplexSearchFormDTO, AviaComplexSearchFormVO> {

    @NotNull
    private final Function2<View, ComposerReferences, AviaComplexSearchFormWidgetViewHolder> holderProducer = new AviaComplexSearchFormViewMapper$holderProducer$1(this);

    @NotNull
    private final List<Class<AviaComplexSearchFormUpdate>> supportedUpdates = C7714v.a0(AviaComplexSearchFormUpdate.class);

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        AviaComplexSearchFormView aviaComplexSearchFormView = new AviaComplexSearchFormView(context);
        aviaComplexSearchFormView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        Context context2 = aviaComplexSearchFormView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int px = ResourceExtKt.toPx(16, context2);
        aviaComplexSearchFormView.setPadding(px, px, px, px);
        Context context3 = aviaComplexSearchFormView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        float pxF = ResourceExtKt.toPxF(24, context3);
        RoundedBackgroundProducer roundedBackgroundProducer = new RoundedBackgroundProducer();
        Context context4 = aviaComplexSearchFormView.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        aviaComplexSearchFormView.setBackground(RoundedBackgroundProducer.produce$default(roundedBackgroundProducer, ThemeExtKt.themeColor(context4, R$attr.layerFloor1), 0.0f, 0.0f, pxF, pxF, 6, null));
        return aviaComplexSearchFormView;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, AviaComplexSearchFormWidgetViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<AviaComplexSearchFormDTO, d, List<AviaComplexSearchFormVO>> getMapper() {
        return component().getMapper();
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<AviaComplexSearchFormUpdate>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<AviaComplexSearchFormComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return AviaComplexSearchFormComponent.INSTANCE.create(storage);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Object getPayload(@NotNull AviaComplexSearchFormVO oldItem, @NotNull AviaComplexSearchFormVO newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        AviaComplexSearchFormPayload aviaComplexSearchFormPayload = new AviaComplexSearchFormPayload();
        if (!Intrinsics.d(oldItem.getFlights(), newItem.getFlights())) {
            aviaComplexSearchFormPayload.setRouteListChanged();
        }
        if (!Intrinsics.d(oldItem.getAddFlight(), newItem.getAddFlight())) {
            aviaComplexSearchFormPayload.setAddFlightButtonChanged();
        }
        if (!Intrinsics.d(oldItem.getPassenger(), newItem.getPassenger())) {
            aviaComplexSearchFormPayload.setPassengerButtonChanged();
        }
        if (!Intrinsics.d(oldItem.getSubmitButton(), newItem.getSubmitButton())) {
            aviaComplexSearchFormPayload.setSubmitButtonChanged();
        }
        return aviaComplexSearchFormPayload;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, I00.d
    public AviaComplexSearchFormVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull AviaComplexSearchFormVO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (update instanceof AviaComplexSearchFormUpdate) {
            return AviaComplexSearchFormVO.copy$default(oldItem, 0L, ((AviaComplexSearchFormUpdate) update).getRoutes(), null, null, null, null, false, 61, null);
        }
        return null;
    }
}
