package ru.ozon.app.android.ugc.core.widgets.reviewStatusInfo.dateText;

import S0.InterfaceC3967k;
import Sc.InterfaceC4008j;
import Tg.b;
import WZ.l;
import a1.C4912a;
import b00.f;
import fd.InterfaceC6512o;
import java.util.Locale;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.action.WidgetActionHandlerBuilder;
import ru.ozon.app.android.action.WidgetActionHandlerKt;
import ru.ozon.composer.compose.widget.g;
import ru.ozon.composer.compose.widget.i;
import ru.ozon.composer.compose.widget.scrollable.k;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/k;", "Lru/ozon/app/android/ugc/core/widgets/reviewStatusInfo/dateText/DateTextVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/k;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class DateTextWidgetKt$dateTextWidget$3 extends AbstractC7737t implements Function1<k<DateTextVO>, Unit> {
    final /* synthetic */ InterfaceC4008j<Locale> $appLocale$delegate;
    final /* synthetic */ C7475g $widgetStorage;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/app/android/ugc/core/widgets/reviewStatusInfo/dateText/DateTextVO;", "Lru/ozon/composer/compose/widget/g$a;", "it", "", "invoke", "(Lru/ozon/composer/compose/widget/i;Lru/ozon/composer/compose/widget/g$a;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.ugc.core.widgets.reviewStatusInfo.dateText.DateTextWidgetKt$dateTextWidget$3$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6512o<i<DateTextVO>, g.a, InterfaceC3967k, Integer, Unit> {
        final /* synthetic */ InterfaceC4008j<Locale> $appLocale$delegate;
        final /* synthetic */ C7475g $widgetStorage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(C7475g c7475g, InterfaceC4008j<Locale> interfaceC4008j) {
            super(4);
            this.$widgetStorage = c7475g;
            this.$appLocale$delegate = interfaceC4008j;
        }

        @Override // fd.InterfaceC6512o
        public /* bridge */ /* synthetic */ Unit invoke(i<DateTextVO> iVar, g.a aVar, InterfaceC3967k interfaceC3967k, Integer num) {
            invoke(iVar, aVar, interfaceC3967k, num.intValue());
            return Unit.f71690a;
        }

        public final void invoke(i<DateTextVO> content, g.a it, InterfaceC3967k interfaceC3967k, int i11) {
            Locale dateTextWidget$lambda$0;
            Intrinsics.checkNotNullParameter(content, "$this$content");
            Intrinsics.checkNotNullParameter(it, "it");
            if ((i11 & 6) == 0) {
                i11 |= interfaceC3967k.n(content) ? 4 : 2;
            }
            if ((i11 & 131) == 130 && interfaceC3967k.b()) {
                interfaceC3967k.j();
                return;
            }
            l lVar = (l) interfaceC3967k.m(f.e());
            Function1<b, Unit> m470buildHandlerimpl = WidgetActionHandlerBuilder.m470buildHandlerimpl(WidgetActionHandlerKt.widgetActionHandlerBuilder(content, this.$widgetStorage, null, null, null, interfaceC3967k, i11 & 14, 14));
            DateTextVO b11 = content.b();
            dateTextWidget$lambda$0 = DateTextWidgetKt.dateTextWidget$lambda$0(this.$appLocale$delegate);
            Intrinsics.checkNotNullExpressionValue(dateTextWidget$lambda$0, "access$dateTextWidget$lambda$0(...)");
            interfaceC3967k.o(-870075925);
            boolean F11 = interfaceC3967k.F(lVar);
            Object C11 = interfaceC3967k.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new DateTextWidgetKt$dateTextWidget$3$1$1$1(lVar);
                interfaceC3967k.x(C11);
            }
            interfaceC3967k.k();
            DateTextContentKt.DateTextContent(b11, dateTextWidget$lambda$0, (Function1) C11, m470buildHandlerimpl, interfaceC3967k, 0, 0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DateTextWidgetKt$dateTextWidget$3(C7475g c7475g, InterfaceC4008j<Locale> interfaceC4008j) {
        super(1);
        this.$widgetStorage = c7475g;
        this.$appLocale$delegate = interfaceC4008j;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(k<DateTextVO> kVar) {
        invoke2(kVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(k<DateTextVO> widgetSpec) {
        Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
        widgetSpec.a(new C4912a(true, 2134851047, new AnonymousClass1(this.$widgetStorage, this.$appLocale$delegate)));
    }
}
