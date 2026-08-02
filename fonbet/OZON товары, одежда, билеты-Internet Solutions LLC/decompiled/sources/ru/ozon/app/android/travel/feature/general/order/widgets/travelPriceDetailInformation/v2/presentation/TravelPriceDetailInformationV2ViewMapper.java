package ru.ozon.app.android.travel.feature.general.order.widgets.travelPriceDetailInformation.v2.presentation;

import Xc.a;
import Xc.b;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.travel.feature.general.order.widgets.travelPriceDetailInformation.v2.data.TravelPriceDetailInformationV2DTO;
import ru.ozon.app.android.travel.feature.general.order.widgets.travelPriceDetailInformation.v2.di.TravelPriceDetailInformationV2Component;
import ru.ozon.app.android.travel.feature.general.order.widgets.travelPriceDetailInformation.v2.presentation.view.TravelPriceDetailInformationV2View;
import ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.data.SelectionItemDescriptionDTO;
import ru.ozon.app.android.utils.CollectionExtKt;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001$B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00102\n\u0010\u000f\u001a\u00060\rj\u0002`\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R<\u0010\u001c\u001a$\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0019\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040\u001aj\b\u0012\u0004\u0012\u00020\u0004`\u001b0\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR0\u0010#\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u00060 j\u0002`!\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\t0\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u001f¨\u0006%"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/presentation/TravelPriceDetailInformationV2ViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/di/TravelPriceDetailInformationV2Component;", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/data/TravelPriceDetailInformationV2DTO;", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/presentation/TravelPriceDetailInformationV2VO;", "<init>", "()V", "oldItem", "newItem", "", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/presentation/TravelPriceDetailInformationV2ViewMapper$Payload;", "getPayload", "(Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/presentation/TravelPriceDetailInformationV2VO;Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/presentation/TravelPriceDetailInformationV2VO;)Ljava/util/List;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "Lkotlin/Function2;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "getMapper", "mapper", "Payload", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TravelPriceDetailInformationV2ViewMapper extends WidgetViewMapper2<TravelPriceDetailInformationV2Component, TravelPriceDetailInformationV2DTO, TravelPriceDetailInformationV2VO> {

    @NotNull
    private final Function2<View, ComposerReferences, k<TravelPriceDetailInformationV2VO>> holderProducer = new TravelPriceDetailInformationV2ViewMapper$holderProducer$1(this);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/presentation/TravelPriceDetailInformationV2ViewMapper$Payload;", "", "<init>", "(Ljava/lang/String;I)V", SelectionItemDescriptionDTO.TITLE, "ROWS", "TOTAL", "ROW_UNDER_TOTAL", "BONUS_TOTAL", "BONUS_VISIBILITY", "BUTTON", "AGREEMENT", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Payload {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Payload[] $VALUES;
        public static final Payload TITLE = new Payload(SelectionItemDescriptionDTO.TITLE, 0);
        public static final Payload ROWS = new Payload("ROWS", 1);
        public static final Payload TOTAL = new Payload("TOTAL", 2);
        public static final Payload ROW_UNDER_TOTAL = new Payload("ROW_UNDER_TOTAL", 3);
        public static final Payload BONUS_TOTAL = new Payload("BONUS_TOTAL", 4);
        public static final Payload BONUS_VISIBILITY = new Payload("BONUS_VISIBILITY", 5);
        public static final Payload BUTTON = new Payload("BUTTON", 6);
        public static final Payload AGREEMENT = new Payload("AGREEMENT", 7);

        private static final /* synthetic */ Payload[] $values() {
            return new Payload[]{TITLE, ROWS, TOTAL, ROW_UNDER_TOTAL, BONUS_TOTAL, BONUS_VISIBILITY, BUTTON, AGREEMENT};
        }

        static {
            Payload[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Payload(String str, int i11) {
        }

        public static Payload valueOf(String str) {
            return (Payload) Enum.valueOf(Payload.class, str);
        }

        public static Payload[] values() {
            return (Payload[]) $VALUES.clone();
        }
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TravelPriceDetailInformationV2View travelPriceDetailInformationV2View = new TravelPriceDetailInformationV2View(context);
        ConstraintLayout.b bVar = new ConstraintLayout.b(-1, -2);
        Context context2 = travelPriceDetailInformationV2View.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int px = ResourceExtKt.toPx(16, context2);
        travelPriceDetailInformationV2View.setPadding(px, px, px, px);
        travelPriceDetailInformationV2View.setLayoutParams(bVar);
        return travelPriceDetailInformationV2View;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<TravelPriceDetailInformationV2VO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<TravelPriceDetailInformationV2DTO, d, List<TravelPriceDetailInformationV2VO>> getMapper() {
        return component().getMapper();
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<TravelPriceDetailInformationV2Component> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return TravelPriceDetailInformationV2Component.INSTANCE.create(storage);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public List<Payload> getPayload(@NotNull TravelPriceDetailInformationV2VO oldItem, @NotNull TravelPriceDetailInformationV2VO newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        ArrayList arrayList = new ArrayList();
        if (!Intrinsics.d(oldItem.getTitle(), newItem.getTitle())) {
            arrayList.add(Payload.TITLE);
        }
        if (!Intrinsics.d(oldItem.getButton(), newItem.getButton())) {
            arrayList.add(Payload.BUTTON);
        }
        if (!CollectionExtKt.deepEquals(oldItem.getPriceRows(), newItem.getPriceRows())) {
            arrayList.add(Payload.ROWS);
        }
        if (!Intrinsics.d(oldItem.getAgreement(), newItem.getAgreement())) {
            arrayList.add(Payload.AGREEMENT);
        }
        if (!newItem.getIsBonusPriceVisible() && !Intrinsics.d(oldItem.getTotal(), newItem.getTotal())) {
            arrayList.add(Payload.TOTAL);
        }
        if (!newItem.getIsBonusPriceVisible() && !Intrinsics.d(oldItem.getRowUnderTotal(), newItem.getRowUnderTotal())) {
            arrayList.add(Payload.ROW_UNDER_TOTAL);
        }
        if (newItem.getIsBonusPriceVisible() && !Intrinsics.d(oldItem.getBonusTotal(), newItem.getBonusTotal())) {
            arrayList.add(Payload.BONUS_TOTAL);
        }
        if (oldItem.getIsBonusPriceVisible() == newItem.getIsBonusPriceVisible() && Intrinsics.d(oldItem.getTotal(), newItem.getTotal())) {
            return arrayList;
        }
        arrayList.add(Payload.BONUS_VISIBILITY);
        return arrayList;
    }
}
