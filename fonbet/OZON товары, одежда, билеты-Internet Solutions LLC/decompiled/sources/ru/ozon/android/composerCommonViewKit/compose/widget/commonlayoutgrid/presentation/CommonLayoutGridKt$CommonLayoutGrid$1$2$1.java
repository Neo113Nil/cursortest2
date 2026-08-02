package ru.ozon.android.composerCommonViewKit.compose.widget.commonlayoutgrid.presentation;

import S0.A1;
import S0.InterfaceC3967k;
import Tg.b;
import WZ.x;
import a1.C4912a;
import fd.InterfaceC6512o;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.composerCommonViewKit.compose.widget.commonlayoutgrid.data.CommonLayoutGridDTO;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import w0.C10382I;
import w0.InterfaceC10383J;
import w0.InterfaceC10401q;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lw0/J;", "", "invoke", "(Lw0/J;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes10.dex */
final class CommonLayoutGridKt$CommonLayoutGrid$1$2$1 extends AbstractC7737t implements Function1<InterfaceC10383J, Unit> {
    final /* synthetic */ Function1<b, Unit> $actionHandler;
    final /* synthetic */ A1<Boolean> $isUserAnAdult$delegate;
    final /* synthetic */ CommonLayoutGridVO $item;
    final /* synthetic */ CommonLayoutGridDTO $this_with;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lw0/q;", "", "index", "", "invoke", "(Lw0/q;ILS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.android.composerCommonViewKit.compose.widget.commonlayoutgrid.presentation.CommonLayoutGridKt$CommonLayoutGrid$1$2$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6512o<InterfaceC10401q, Integer, InterfaceC3967k, Integer, Unit> {
        final /* synthetic */ Function1<b, Unit> $actionHandler;
        final /* synthetic */ A1<Boolean> $isUserAnAdult$delegate;
        final /* synthetic */ CommonLayoutGridVO $item;
        final /* synthetic */ CommonLayoutGridDTO $this_with;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(CommonLayoutGridDTO commonLayoutGridDTO, Function1<? super b, Unit> function1, CommonLayoutGridVO commonLayoutGridVO, A1<Boolean> a12) {
            super(4);
            this.$this_with = commonLayoutGridDTO;
            this.$actionHandler = function1;
            this.$item = commonLayoutGridVO;
            this.$isUserAnAdult$delegate = a12;
        }

        @Override // fd.InterfaceC6512o
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC10401q interfaceC10401q, Integer num, InterfaceC3967k interfaceC3967k, Integer num2) {
            invoke(interfaceC10401q, num.intValue(), interfaceC3967k, num2.intValue());
            return Unit.f71690a;
        }

        public final void invoke(InterfaceC10401q items, int i11, InterfaceC3967k interfaceC3967k, int i12) {
            boolean CommonLayoutGrid$lambda$3$lambda$1;
            Intrinsics.checkNotNullParameter(items, "$this$items");
            if ((i12 & 48) == 0) {
                i12 |= interfaceC3967k.r(i11) ? 32 : 16;
            }
            if ((i12 & 145) == 144 && interfaceC3967k.b()) {
                interfaceC3967k.j();
                return;
            }
            CommonLayoutGridDTO commonLayoutGridDTO = this.$this_with;
            CommonLayoutGrid$lambda$3$lambda$1 = CommonLayoutGridKt.CommonLayoutGrid$lambda$3$lambda$1(this.$isUserAnAdult$delegate);
            Function1<b, Unit> function1 = this.$actionHandler;
            Map<String, TokenizedTrackingInfo> trackingInfo = this.$this_with.getItems().get(i11).getTrackingInfo();
            CommonLayoutGridKt.Item(commonLayoutGridDTO, i11, CommonLayoutGrid$lambda$3$lambda$1, function1, trackingInfo != null ? x.b(trackingInfo, Long.valueOf(this.$item.getId()), null) : null, interfaceC3967k, i12 & 112);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CommonLayoutGridKt$CommonLayoutGrid$1$2$1(CommonLayoutGridDTO commonLayoutGridDTO, Function1<? super b, Unit> function1, CommonLayoutGridVO commonLayoutGridVO, A1<Boolean> a12) {
        super(1);
        this.$this_with = commonLayoutGridDTO;
        this.$actionHandler = function1;
        this.$item = commonLayoutGridVO;
        this.$isUserAnAdult$delegate = a12;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC10383J interfaceC10383J) {
        invoke2(interfaceC10383J);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC10383J LazyVerticalGrid) {
        Intrinsics.checkNotNullParameter(LazyVerticalGrid, "$this$LazyVerticalGrid");
        LazyVerticalGrid.b(Math.min(this.$this_with.getItems().size(), 12), C10382I.f103185b, new C4912a(true, 1398264410, new AnonymousClass1(this.$this_with, this.$actionHandler, this.$item, this.$isUserAnAdult$delegate)));
    }
}
