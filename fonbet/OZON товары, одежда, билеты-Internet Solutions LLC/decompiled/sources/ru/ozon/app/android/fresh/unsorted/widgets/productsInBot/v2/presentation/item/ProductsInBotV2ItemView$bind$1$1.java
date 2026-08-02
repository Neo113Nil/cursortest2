package ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v2.presentation.item;

import Sc.o;
import WZ.l;
import WZ.t;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v2.domain.ProductsInBotV2VO;
import ru.ozon.uni.android.atom.selectionControls.CheckBoxView;
import ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<unused var>", "Lru/ozon/uni/android/atom/selectionControls/CheckBoxView;", "checkboxStatus", "Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckboxStatus;", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class ProductsInBotV2ItemView$bind$1$1 extends AbstractC7737t implements InterfaceC6511n<CheckBoxView, CheckBoxDTO.CheckboxStatus, Boolean, Unit> {
    final /* synthetic */ ProductsInBotV2VO.ItemVO $item;
    final /* synthetic */ Function1<Long, Unit> $removeProduct;
    final /* synthetic */ Function2<Long, Integer, Unit> $setProduct;
    final /* synthetic */ l $tokenizedAnalytics;
    final /* synthetic */ ProductsInBotV2ItemView this$0;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CheckBoxDTO.CheckboxStatus.values().length];
            try {
                iArr[CheckBoxDTO.CheckboxStatus.EMPTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CheckBoxDTO.CheckboxStatus.INDETERMINATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CheckBoxDTO.CheckboxStatus.SELECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ProductsInBotV2ItemView$bind$1$1(Function1<? super Long, Unit> function1, ProductsInBotV2VO.ItemVO itemVO, Function2<? super Long, ? super Integer, Unit> function2, ProductsInBotV2ItemView productsInBotV2ItemView, l lVar) {
        super(3);
        this.$removeProduct = function1;
        this.$item = itemVO;
        this.$setProduct = function2;
        this.this$0 = productsInBotV2ItemView;
        this.$tokenizedAnalytics = lVar;
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ Unit invoke(CheckBoxView checkBoxView, CheckBoxDTO.CheckboxStatus checkboxStatus, Boolean bool) {
        invoke(checkBoxView, checkboxStatus, bool.booleanValue());
        return Unit.f71690a;
    }

    public final void invoke(CheckBoxView checkBoxView, CheckBoxDTO.CheckboxStatus checkboxStatus, boolean z11) {
        Intrinsics.checkNotNullParameter(checkBoxView, "<unused var>");
        Intrinsics.checkNotNullParameter(checkboxStatus, "checkboxStatus");
        int i11 = WhenMappings.$EnumSwitchMapping$0[checkboxStatus.ordinal()];
        if (i11 == 1 || i11 == 2) {
            this.$removeProduct.invoke(Long.valueOf(this.$item.getSkuId()));
            t trackingInfo = this.$item.getTrackingInfo();
            if (trackingInfo != null) {
                this.this$0.setupCheckedAnalytics(this.$tokenizedAnalytics, trackingInfo, "unselect");
                return;
            }
            return;
        }
        if (i11 != 3) {
            throw new o();
        }
        this.$setProduct.invoke(Long.valueOf(this.$item.getSkuId()), Integer.valueOf(this.$item.getCurrentQuantity()));
        t trackingInfo2 = this.$item.getTrackingInfo();
        if (trackingInfo2 != null) {
            this.this$0.setupCheckedAnalytics(this.$tokenizedAnalytics, trackingInfo2, "select");
        }
    }
}
