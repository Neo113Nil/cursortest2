package ru.ozon.uni.foundation.components.checkbox;

import J0.T0;
import J1.a;
import K1.T;
import P0.p2;
import S0.InterfaceC3967k;
import V1.h;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import e1.InterfaceC6250b;
import fd.InterfaceC6512o;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import l0.InterfaceC7772p;
import l1.C7807Z;
import q1.AbstractC8972b;
import u0.InterfaceC9893b;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ll0/p;", "Lkotlin/Pair;", "LJ1/a;", "", "<destruct>", "", "invoke", "(Ll0/p;Lkotlin/Pair;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class FoundationCheckboxKt$FoundationCheckbox$1$2 extends AbstractC7737t implements InterfaceC6512o<InterfaceC7772p, Pair<? extends a, ? extends Integer>, InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ long $iconColor;
    final /* synthetic */ float $iconSize;
    final /* synthetic */ AbstractC8972b $indeterminateIcon;
    final /* synthetic */ T $quantityTextStyle;
    final /* synthetic */ AbstractC8972b $selectedIcon;
    final /* synthetic */ InterfaceC9893b $this_Box;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.Indeterminate.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FoundationCheckboxKt$FoundationCheckbox$1$2(T t2, InterfaceC9893b interfaceC9893b, AbstractC8972b abstractC8972b, AbstractC8972b abstractC8972b2, long j11, float f7) {
        super(4);
        this.$quantityTextStyle = t2;
        this.$this_Box = interfaceC9893b;
        this.$indeterminateIcon = abstractC8972b;
        this.$selectedIcon = abstractC8972b2;
        this.$iconColor = j11;
        this.$iconSize = f7;
    }

    @Override // fd.InterfaceC6512o
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC7772p interfaceC7772p, Pair<? extends a, ? extends Integer> pair, InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC7772p, (Pair<? extends a, Integer>) pair, interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC7772p AnimatedContent, Pair<? extends a, Integer> destruct$, InterfaceC3967k interfaceC3967k, int i11) {
        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
        Intrinsics.checkNotNullParameter(destruct$, "$destruct$");
        a a11 = destruct$.a();
        Integer b11 = destruct$.b();
        interfaceC3967k.o(-403421910);
        if (b11 == null || this.$quantityTextStyle == null || a11 != a.Indeterminate || !new IntRange(0, 99, 1).n(b11.intValue())) {
            interfaceC3967k.k();
            T0.a(WhenMappings.$EnumSwitchMapping$0[a11.ordinal()] == 1 ? this.$indeterminateIcon : this.$selectedIcon, null, a0.n(e.f40358c0, this.$iconSize), a11 == a.Off ? C7807Z.f72258l : this.$iconColor, interfaceC3967k, 48);
        } else {
            p2.b(b11.toString(), this.$this_Box.a(e.f40358c0, InterfaceC6250b.a.e()), 0L, 0L, 0L, h.a(3), 0L, 0, false, 0, 0, this.$quantityTextStyle, interfaceC3967k, 0, 0, 65020);
            interfaceC3967k.k();
        }
    }
}
