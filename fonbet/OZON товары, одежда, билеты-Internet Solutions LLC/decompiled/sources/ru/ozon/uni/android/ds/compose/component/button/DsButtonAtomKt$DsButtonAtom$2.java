package ru.ozon.uni.android.ds.compose.component.button;

import S0.InterfaceC3967k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.android.ds.compose.component.loader.DsLoaderKt;
import ru.ozon.uni.android.ds.compose.component.loader.DsLoaderSize;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class DsButtonAtomKt$DsButtonAtom$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ ButtonV3DTO.Sizes $size;
    final /* synthetic */ DsButtonStyle $style;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ButtonV3DTO.Sizes.values().length];
            try {
                iArr[ButtonV3DTO.Sizes.SIZE_400.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DsButtonAtomKt$DsButtonAtom$2(ButtonV3DTO.Sizes sizes, DsButtonStyle dsButtonStyle) {
        super(2);
        this.$size = sizes;
        this.$style = dsButtonStyle;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        if ((i11 & 3) == 2 && interfaceC3967k.b()) {
            interfaceC3967k.j();
        } else {
            DsLoaderKt.m1753DsLoader3IgeMak(null, this.$style.getTitleTextColor(), WhenMappings.$EnumSwitchMapping$0[this.$size.ordinal()] == 1 ? DsLoaderSize.Size200 : DsLoaderSize.Size300, interfaceC3967k, 0, 1);
        }
    }
}
