package ru.ozon.uni.ozi.components.notificationBar;

import A0.h;
import P9.a;
import S0.InterfaceC3967k;
import a1.C4912a;
import a1.c;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import fd.InterfaceC6511n;
import i1.C6988h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import l1.y0;
import q1.AbstractC8972b;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.core.R$drawable;
import ru.ozon.uni.core.compose.tokens.UniComposeIconTokensKt;
import ru.ozon.uni.core.compose.tokens.UniPaddings;
import ru.ozon.uni.core.compose.tokens.UniRadii;
import ru.ozon.uni.core.compose.tokens.UniResourceIcons;
import ru.ozon.uni.foundation.components.notificationBar.FoundationNotificationBarKt;
import ru.ozon.uni.ozi.components.button.OziIconButtonKt;
import ru.ozon.uni.ozi.components.button.presets.OziIconButtonShape;
import ru.ozon.uni.ozi.components.button.presets.size.OziIconButtonSize;
import ru.ozon.uni.ozi.components.button.presets.style.OziIconButtonStyle;
import ru.ozon.uni.ozi.components.notificationBar.presets.OziNotificationBarStatus;
import ru.ozon.uni.ozi.theme.OziTheme;
import ru.ozon.uni.ozi.utils.OziTestTagsKt;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class OziNotificationBarKt$OziNotificationBar$1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ InterfaceC6511n<OziNotificationBarButtonScope, InterfaceC3967k, Integer, Unit> $firstButton;
    final /* synthetic */ InterfaceC6511n<OziNotificationBarIconScope, InterfaceC3967k, Integer, Unit> $icon;
    final /* synthetic */ e $modifier;
    final /* synthetic */ Function0<Unit> $onCloseClick;
    final /* synthetic */ InterfaceC6511n<OziNotificationBarButtonScope, InterfaceC3967k, Integer, Unit> $secondButton;
    final /* synthetic */ OziNotificationBarStatus $status;
    final /* synthetic */ String $subtitle;
    final /* synthetic */ int $subtitleLinesLimit;
    final /* synthetic */ String $title;
    final /* synthetic */ int $titleLinesLimit;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.uni.ozi.components.notificationBar.OziNotificationBarKt$OziNotificationBar$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
        final /* synthetic */ Function0<Unit> $onCloseClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Function0<Unit> function0) {
            super(2);
            this.$onCloseClick = function0;
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
            e oziTestTag = OziTestTagsKt.oziTestTag(e.f40358c0, OziNotificationBarTestTags.CloseButton, null, interfaceC3967k, 54, 2);
            a.b(oziTestTag, "closeButton");
            OziTheme.INSTANCE.getIcons();
            interfaceC3967k.B(945175447);
            AbstractC8972b uniPainterResource = UniComposeIconTokensKt.uniPainterResource(R$drawable.ic_m_cross_filled, "ic_m_cross_filled", interfaceC3967k, 48);
            interfaceC3967k.K();
            OziIconButtonShape oziIconButtonShape = OziIconButtonShape.Square;
            OziIconButtonSize oziIconButtonSize = OziIconButtonSize.Size400;
            OziIconButtonKt.OziIconButton(uniPainterResource, this.$onCloseClick, oziTestTag, false, oziIconButtonShape, OziIconButtonStyle.NeutralTransparent.INSTANCE, oziIconButtonSize, null, interfaceC3967k, 1794048, 136);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.uni.ozi.components.notificationBar.OziNotificationBarKt$OziNotificationBar$1$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
        final /* synthetic */ InterfaceC6511n<OziNotificationBarButtonScope, InterfaceC3967k, Integer, Unit> $firstButton;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass3(InterfaceC6511n<? super OziNotificationBarButtonScope, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n) {
            super(2);
            this.$firstButton = interfaceC6511n;
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
                this.$firstButton.invoke(new OziNotificationBarButtonScope(), interfaceC3967k, 0);
            }
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.uni.ozi.components.notificationBar.OziNotificationBarKt$OziNotificationBar$1$4, reason: invalid class name */
    static final class AnonymousClass4 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
        final /* synthetic */ InterfaceC6511n<OziNotificationBarButtonScope, InterfaceC3967k, Integer, Unit> $secondButton;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass4(InterfaceC6511n<? super OziNotificationBarButtonScope, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n) {
            super(2);
            this.$secondButton = interfaceC6511n;
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
                this.$secondButton.invoke(new OziNotificationBarButtonScope(), interfaceC3967k, 0);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    OziNotificationBarKt$OziNotificationBar$1(String str, String str2, int i11, int i12, InterfaceC6511n<? super OziNotificationBarIconScope, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n, Function0<Unit> function0, InterfaceC6511n<? super OziNotificationBarButtonScope, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n2, InterfaceC6511n<? super OziNotificationBarButtonScope, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n3, e eVar, OziNotificationBarStatus oziNotificationBarStatus) {
        super(2);
        this.$title = str;
        this.$subtitle = str2;
        this.$titleLinesLimit = i11;
        this.$subtitleLinesLimit = i12;
        this.$icon = interfaceC6511n;
        this.$onCloseClick = function0;
        this.$firstButton = interfaceC6511n2;
        this.$secondButton = interfaceC6511n3;
        this.$modifier = eVar;
        this.$status = oziNotificationBarStatus;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        String str;
        C4912a c4912a;
        e b11;
        if ((i11 & 3) == 2 && interfaceC3967k.b()) {
            interfaceC3967k.j();
            return;
        }
        String str2 = this.$title;
        String str3 = this.$subtitle;
        int i12 = this.$titleLinesLimit;
        int i13 = this.$subtitleLinesLimit;
        InterfaceC6511n<OziNotificationBarIconScope, InterfaceC3967k, Integer, Unit> interfaceC6511n = this.$icon;
        interfaceC3967k.o(1799460137);
        C4912a c11 = interfaceC6511n == null ? null : c.c(1397727351, new OziNotificationBarKt$OziNotificationBar$1$1$1(this.$icon, this.$status), interfaceC3967k);
        interfaceC3967k.k();
        interfaceC3967k.o(1799465938);
        Function0<Unit> function0 = this.$onCloseClick;
        C4912a c12 = function0 != null ? c.c(-439132827, new AnonymousClass2(function0), interfaceC3967k) : null;
        interfaceC3967k.k();
        interfaceC3967k.o(1799487422);
        InterfaceC6511n<OziNotificationBarButtonScope, InterfaceC3967k, Integer, Unit> interfaceC6511n2 = this.$firstButton;
        if (interfaceC6511n2 != null) {
            str = str2;
            c4912a = c.c(2044267268, new AnonymousClass3(interfaceC6511n2), interfaceC3967k);
        } else {
            str = str2;
            c4912a = null;
        }
        interfaceC3967k.k();
        interfaceC3967k.o(1799494432);
        InterfaceC6511n<OziNotificationBarButtonScope, InterfaceC3967k, Integer, Unit> interfaceC6511n3 = this.$secondButton;
        C4912a c13 = interfaceC6511n3 != null ? c.c(232700067, new AnonymousClass4(interfaceC6511n3), interfaceC3967k) : null;
        interfaceC3967k.k();
        float f7 = 16;
        e a11 = C6988h.a(a0.e(OziTestTagsKt.oziTestTag(this.$modifier, OziNotificationBarTestTags.Container, null, interfaceC3967k, 48, 2), 1.0f), h.b(f7));
        OziTheme oziTheme = OziTheme.INSTANCE;
        int i14 = UniResourceIcons.$stable | UniPaddings.$stable | UniRadii.$stable;
        b11 = androidx.compose.foundation.e.b(a11, oziTheme.getColors(interfaceC3967k, i14).getLayerFloor2(), y0.a());
        a.b(b11, "container");
        float f11 = this.$icon == null ? f7 : 10;
        if (this.$onCloseClick != null) {
            f7 = 0;
        }
        e j11 = T.j(b11, f11, 0.0f, f7, 0.0f, 10);
        K1.T body400 = oziTheme.getTypography().getBody400();
        long textSecondaryTransparent = oziTheme.getColors(interfaceC3967k, i14).getTextSecondaryTransparent();
        e.a aVar = e.f40358c0;
        e oziTestTag = OziTestTagsKt.oziTestTag(aVar, OziNotificationBarTestTags.Subtitle, null, interfaceC3967k, 54, 2);
        a.b(oziTestTag, "subtitle");
        K1.T compactControl500 = oziTheme.getTypography().getCompactControl500();
        long textPrimary = oziTheme.getColors(interfaceC3967k, i14).getTextPrimary();
        e oziTestTag2 = OziTestTagsKt.oziTestTag(aVar, OziNotificationBarTestTags.Title, null, interfaceC3967k, 54, 2);
        a.b(oziTestTag2, SelectionItemFormDTO.TITLE_FIELD_NAME);
        FoundationNotificationBarKt.m3025FoundationNotificationBarsGQTBBs(str, str3, i12, i13, c11, c12, c4912a, c13, j11, body400, textSecondaryTransparent, oziTestTag, compactControl500, textPrimary, oziTestTag2, OziTestTagsKt.oziTestTag(aVar, OziNotificationBarTestTags.IconContainer, null, interfaceC3967k, 54, 2), interfaceC3967k, 0, 0, 0);
    }
}
