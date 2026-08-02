package ru.ozon.uni.ozi.theme;

import J0.C3363y;
import J0.u3;
import P0.C3776u;
import S0.C3996z;
import S0.H0;
import S0.InterfaceC3967k;
import a1.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import l1.C7807Z;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class OziThemeKt$OziTheme$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ OziColorScheme $colors;
    final /* synthetic */ Function2<InterfaceC3967k, Integer, Unit> $content;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.uni.ozi.theme.OziThemeKt$OziTheme$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
        final /* synthetic */ Function2<InterfaceC3967k, Integer, Unit> $content;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.uni.ozi.theme.OziThemeKt$OziTheme$2$1$1, reason: invalid class name and collision with other inner class name */
        static final class C21561 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
            final /* synthetic */ Function2<InterfaceC3967k, Integer, Unit> $content;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C21561(Function2<? super InterfaceC3967k, ? super Integer, Unit> function2) {
                super(2);
                this.$content = function2;
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
                    this.$content.invoke(interfaceC3967k, 0);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Function2<? super InterfaceC3967k, ? super Integer, Unit> function2) {
            super(2);
            this.$content = function2;
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
                u3.a(OziTypographyKt.getDefaultOziTypography().getBody400(), c.c(1757965644, new C21561(this.$content), interfaceC3967k), interfaceC3967k, 48);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    OziThemeKt$OziTheme$2(OziColorScheme oziColorScheme, Function2<? super InterfaceC3967k, ? super Integer, Unit> function2) {
        super(2);
        this.$colors = oziColorScheme;
        this.$content = function2;
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
            C3996z.b(new H0[]{OziThemeKt.getLocalOziColors().c(this.$colors), C3363y.a().c(C7807Z.m(this.$colors.getTextPrimary())), C3776u.a().c(C7807Z.m(this.$colors.getTextPrimary()))}, c.c(-822753957, new AnonymousClass1(this.$content), interfaceC3967k), interfaceC3967k, 56);
        }
    }
}
