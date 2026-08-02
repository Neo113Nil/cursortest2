package ru.ozon.app.android.account.orders.commonBarcode.presentation.fullwidth;

import AN.a;
import android.view.View;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.commonBarcode.data.CommonBarcodeDTO;
import ru.ozon.app.android.account.orders.commonBarcode.data.CommonBarcodeMapper;
import ru.ozon.app.android.account.orders.commonBarcode.di.CommonBarcodeComponent;
import ru.ozon.app.android.account.orders.commonBarcode.presentation.CommonBarcodeVO;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.WidgetViewHolderKt;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.cs_orders.R$layout;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\u00020\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR,\u0010 \u001a\u0014\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0014\u0010'\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Lru/ozon/app/android/account/orders/commonBarcode/presentation/fullwidth/CommonBarcodeFullWidthViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/account/orders/commonBarcode/di/CommonBarcodeComponent;", "Lru/ozon/app/android/account/orders/commonBarcode/data/CommonBarcodeDTO;", "Lru/ozon/app/android/account/orders/commonBarcode/presentation/CommonBarcodeVO;", "<init>", "()V", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "oldItem", "newItem", "", "getPayload", "(Lru/ozon/app/android/account/orders/commonBarcode/presentation/CommonBarcodeVO;Lru/ozon/app/android/account/orders/commonBarcode/presentation/CommonBarcodeVO;)V", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/account/orders/commonBarcode/presentation/fullwidth/CommonBarcodeFullWidthViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Lru/ozon/app/android/account/orders/commonBarcode/data/CommonBarcodeMapper;", "getMapper", "()Lru/ozon/app/android/account/orders/commonBarcode/data/CommonBarcodeMapper;", "mapper", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CommonBarcodeFullWidthViewMapper extends WidgetViewMapper2<CommonBarcodeComponent, CommonBarcodeDTO, CommonBarcodeVO> {
    private final int layout = R$layout.widget_common_barcode_full_width;

    @NotNull
    private final Function2<View, ComposerReferences, CommonBarcodeFullWidthViewHolder> holderProducer = new CommonBarcodeFullWidthViewMapper$holderProducer$1(this);

    /* JADX INFO: Access modifiers changed from: private */
    public static final CommonBarcodeComponent widgetComponent$lambda$0(C7475g c7475g) {
        return CommonBarcodeComponent.INSTANCE.create(c7475g);
    }

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return (state instanceof CommonBarcodeDTO) && Intrinsics.d(((CommonBarcodeDTO) state).isFullWidth(), Boolean.TRUE);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, CommonBarcodeFullWidthViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.composer.ui.widget.g
    public /* bridge */ /* synthetic */ Object getPayload(c cVar, c cVar2) {
        getPayload((CommonBarcodeVO) cVar, (CommonBarcodeVO) cVar2);
        return Unit.f71690a;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<CommonBarcodeComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new C7473e<>(N.b(CommonBarcodeComponent.class), new a(storage, 3));
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public CommonBarcodeMapper getMapper() {
        return component().getMapper();
    }

    public void getPayload(@NotNull CommonBarcodeVO oldItem, @NotNull CommonBarcodeVO newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        WidgetViewHolderKt.getEMPTY_PAYLOAD();
    }
}
