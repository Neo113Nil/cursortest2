package ru.ozon.uni.ozi.components.cell.addons;

import K1.C3422b;
import S0.InterfaceC3967k;
import a1.c;
import androidx.compose.foundation.layout.T;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import q1.AbstractC8972b;
import ru.ozon.uni.ozi.components.badge.OziBadgeKt;
import ru.ozon.uni.ozi.components.badge.presets.OziBadgeSize;
import ru.ozon.uni.ozi.components.badge.presets.OziBadgeStyle;
import ru.ozon.uni.ozi.components.cell.OziCellTestTags;
import ru.ozon.uni.ozi.theme.OziTheme;
import ru.ozon.uni.ozi.utils.OziTestTagsKt;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class OziCellCenterScope$Default500Badge$5 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ String $badgeLabel;
    final /* synthetic */ e $badgeModifier;
    final /* synthetic */ boolean $badgeNumeric;
    final /* synthetic */ AbstractC8972b $badgeStartGraphic;
    final /* synthetic */ OziBadgeStyle $badgeStyle;
    final /* synthetic */ C3422b $subtitle;
    final /* synthetic */ long $subtitleColor;
    final /* synthetic */ int $subtitleMaxLines;
    final /* synthetic */ C3422b $title;
    final /* synthetic */ long $titleColor;
    final /* synthetic */ OziCellCenterScope this$0;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.uni.ozi.components.cell.addons.OziCellCenterScope$Default500Badge$5$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
        final /* synthetic */ String $badgeLabel;
        final /* synthetic */ e $badgeModifier;
        final /* synthetic */ boolean $badgeNumeric;
        final /* synthetic */ AbstractC8972b $badgeStartGraphic;
        final /* synthetic */ OziBadgeStyle $badgeStyle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(e eVar, String str, AbstractC8972b abstractC8972b, OziBadgeStyle oziBadgeStyle, boolean z11) {
            super(2);
            this.$badgeModifier = eVar;
            this.$badgeLabel = str;
            this.$badgeStartGraphic = abstractC8972b;
            this.$badgeStyle = oziBadgeStyle;
            this.$badgeNumeric = z11;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            invoke(interfaceC3967k, num.intValue());
            return Unit.f71690a;
        }

        public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
            if ((i11 & 3) == 2 && interfaceC3967k.b()) {
                interfaceC3967k.j();
                return;
            }
            OziBadgeKt.OziBadge(this.$badgeLabel, null, OziTestTagsKt.oziTestTag(T.j(e.f40358c0, 6, 0.0f, 0.0f, 0.0f, 14), OziCellTestTags.CenterBadge, null, interfaceC3967k, 54, 2).l0(this.$badgeModifier), this.$badgeStartGraphic, this.$badgeStyle, this.$badgeNumeric, OziBadgeSize.Size400, interfaceC3967k, 1572912, 0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OziCellCenterScope$Default500Badge$5(OziCellCenterScope oziCellCenterScope, C3422b c3422b, long j11, C3422b c3422b2, int i11, long j12, e eVar, String str, AbstractC8972b abstractC8972b, OziBadgeStyle oziBadgeStyle, boolean z11) {
        super(2);
        this.this$0 = oziCellCenterScope;
        this.$title = c3422b;
        this.$titleColor = j11;
        this.$subtitle = c3422b2;
        this.$subtitleMaxLines = i11;
        this.$subtitleColor = j12;
        this.$badgeModifier = eVar;
        this.$badgeLabel = str;
        this.$badgeStartGraphic = abstractC8972b;
        this.$badgeStyle = oziBadgeStyle;
        this.$badgeNumeric = z11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        if ((i11 & 3) == 2 && interfaceC3967k.b()) {
            interfaceC3967k.j();
            return;
        }
        OziCellCenterScope oziCellCenterScope = this.this$0;
        C3422b c3422b = this.$title;
        long j11 = this.$titleColor;
        OziTheme oziTheme = OziTheme.INSTANCE;
        oziCellCenterScope.m3074TextBlockOjOrPUU(c3422b, 1, j11, oziTheme.getTypography().getCompact500(), this.$subtitle, this.$subtitleMaxLines, this.$subtitleColor, oziTheme.getTypography().getBody400(), c.c(-1871253190, new AnonymousClass1(this.$badgeModifier, this.$badgeLabel, this.$badgeStartGraphic, this.$badgeStyle, this.$badgeNumeric), interfaceC3967k), false, interfaceC3967k, 100663344, 0, UserVerificationMethods.USER_VERIFY_NONE);
    }
}
