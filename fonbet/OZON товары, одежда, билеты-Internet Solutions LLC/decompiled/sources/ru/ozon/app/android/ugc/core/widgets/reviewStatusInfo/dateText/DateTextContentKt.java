package ru.ozon.app.android.ugc.core.widgets.reviewStatusInfo.dateText;

import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import Tg.b;
import WZ.t;
import android.content.Context;
import android.text.format.DateFormat;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.AbstractC5434v;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e3.i;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import l1.y0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.reviewStatusInfo.data.ReviewStatusInfoDTO;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aI\u0010\n\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewStatusInfo/dateText/DateTextVO;", "item", "Ljava/util/Locale;", "appLocale", "Lkotlin/Function1;", "LWZ/t;", "", "onView", "LTg/b;", "onAction", "DateTextContent", "(Lru/ozon/app/android/ugc/core/widgets/reviewStatusInfo/dateText/DateTextVO;Ljava/util/Locale;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LS0/k;II)V", "core_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DateTextContentKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DateTextContent(@NotNull DateTextVO item, @NotNull Locale appLocale, Function1<? super t, Unit> function1, @NotNull Function1<? super b, Unit> onAction, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        Function1<? super t, Unit> function12;
        t tokenizedEvent;
        boolean n11;
        Object C11;
        C7807Z c7807z;
        b action;
        Paddings bottomPadding;
        Paddings rightPadding;
        Paddings topPadding;
        Paddings leftPadding;
        J0 m02;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(appLocale, "appLocale");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        C3969l u11 = interfaceC3967k.u(284370231);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.F(item) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.F(appLocale) ? 32 : 16;
        }
        int i14 = i12 & 4;
        if (i14 != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            function12 = function1;
            i13 |= u11.F(function12) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
            if ((i12 & 8) == 0) {
                i13 |= 3072;
            } else if ((i11 & 3072) == 0) {
                i13 |= u11.F(onAction) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
            }
            if ((i13 & 1171) == 1170 || !u11.b()) {
                if (i14 != 0) {
                    u11.o(1451785047);
                    Object C12 = u11.C();
                    if (C12 == InterfaceC3967k.a.a()) {
                        C12 = DateTextContentKt$DateTextContent$1$1.INSTANCE;
                        u11.x(C12);
                    }
                    u11.k();
                    function12 = (Function1) C12;
                }
                tokenizedEvent = item.getTokenizedEvent();
                u11.o(1451787355);
                if (tokenizedEvent != null) {
                    AbstractC5434v.a aVar = AbstractC5434v.a.ON_RESUME;
                    u11.o(1820022358);
                    boolean F11 = ((i13 & 896) == 256) | u11.F(tokenizedEvent);
                    Object C13 = u11.C();
                    if (F11 || C13 == InterfaceC3967k.a.a()) {
                        C13 = new DateTextContentKt$DateTextContent$2$1$1(function12, tokenizedEvent);
                        u11.x(C13);
                    }
                    u11.k();
                    i.a(aVar, null, (Function0) C13, u11, 6);
                    Unit unit = Unit.f71690a;
                }
                u11.k();
                Context context = (Context) u11.m(AndroidCompositionLocals_androidKt.d());
                TextDTO text = item.getText();
                String timestamp = item.getTimestamp();
                String dateFormat = item.getDateFormat();
                u11.o(1451792606);
                n11 = u11.n(text) | u11.n(timestamp) | u11.n(dateFormat) | u11.n(appLocale);
                C11 = u11.C();
                if (!n11 || C11 == InterfaceC3967k.a.a()) {
                    C11 = TextDTO.copy$default(item.getText(), DateTextFormatterKt.replaceTimestamp(item.getText().getText(), DateTextFormatterKt.formatTimestamp(item.getTimestamp(), item.getDateFormat(), DateFormat.is24HourFormat(context), appLocale)), null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 524286, null);
                    u11.x(C11);
                }
                TextDTO textDTO = (TextDTO) C11;
                u11.k();
                String backgroundColor = item.getBackgroundColor();
                u11.o(1451803427);
                c7807z = backgroundColor != null ? TokenParserKt.tokenToColor(backgroundColor, u11, 0) : null;
                u11.k();
                action = item.getAction();
                u11.o(1451809001);
                e.a aVar2 = e.f40358c0;
                e e11 = a0.e(aVar2, 1.0f);
                if (c7807z != null) {
                    e11 = androidx.compose.foundation.e.b(aVar2, c7807z.w(), y0.a());
                }
                e eVar = e11;
                if (action != null) {
                    u11.o(1820043140);
                    boolean F12 = u11.F(action) | ((i13 & 7168) == 2048);
                    Object C14 = u11.C();
                    if (F12 || C14 == InterfaceC3967k.a.a()) {
                        C14 = new DateTextContentKt$DateTextContent$modifier$2$1$1(onAction, action);
                        u11.x(C14);
                    }
                    u11.k();
                    eVar = androidx.compose.foundation.i.c(eVar, false, null, null, (Function0) C14, 7);
                }
                u11.k();
                ReviewStatusInfoDTO.DateTextDTO.PaddingsDTO paddings = item.getPaddings();
                float m1867getDpD9Ej5fM = (paddings != null || (leftPadding = paddings.getLeftPadding()) == null) ? 0 : leftPadding.m1867getDpD9Ej5fM();
                ReviewStatusInfoDTO.DateTextDTO.PaddingsDTO paddings2 = item.getPaddings();
                float m1867getDpD9Ej5fM2 = (paddings2 != null || (topPadding = paddings2.getTopPadding()) == null) ? 0 : topPadding.m1867getDpD9Ej5fM();
                ReviewStatusInfoDTO.DateTextDTO.PaddingsDTO paddings3 = item.getPaddings();
                float m1867getDpD9Ej5fM3 = (paddings3 != null || (rightPadding = paddings3.getRightPadding()) == null) ? 0 : rightPadding.m1867getDpD9Ej5fM();
                ReviewStatusInfoDTO.DateTextDTO.PaddingsDTO paddings4 = item.getPaddings();
                DsTextAtomKt.DsTextAtom(textDTO, T.i(eVar, m1867getDpD9Ej5fM, m1867getDpD9Ej5fM2, m1867getDpD9Ej5fM3, (paddings4 != null || (bottomPadding = paddings4.getBottomPadding()) == null) ? 0 : bottomPadding.m1867getDpD9Ej5fM()), u11, 0, 0);
            } else {
                u11.j();
            }
            Function1<? super t, Unit> function13 = function12;
            m02 = u11.m0();
            if (m02 == null) {
                m02.G(new DateTextContentKt$DateTextContent$3(item, appLocale, function13, onAction, i11, i12));
                return;
            }
            return;
        }
        function12 = function1;
        if ((i12 & 8) == 0) {
        }
        if ((i13 & 1171) == 1170) {
        }
        if (i14 != 0) {
        }
        tokenizedEvent = item.getTokenizedEvent();
        u11.o(1451787355);
        if (tokenizedEvent != null) {
        }
        u11.k();
        Context context2 = (Context) u11.m(AndroidCompositionLocals_androidKt.d());
        TextDTO text2 = item.getText();
        String timestamp2 = item.getTimestamp();
        String dateFormat2 = item.getDateFormat();
        u11.o(1451792606);
        n11 = u11.n(text2) | u11.n(timestamp2) | u11.n(dateFormat2) | u11.n(appLocale);
        C11 = u11.C();
        if (!n11) {
        }
        C11 = TextDTO.copy$default(item.getText(), DateTextFormatterKt.replaceTimestamp(item.getText().getText(), DateTextFormatterKt.formatTimestamp(item.getTimestamp(), item.getDateFormat(), DateFormat.is24HourFormat(context2), appLocale)), null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 524286, null);
        u11.x(C11);
        TextDTO textDTO2 = (TextDTO) C11;
        u11.k();
        String backgroundColor2 = item.getBackgroundColor();
        u11.o(1451803427);
        if (backgroundColor2 != null) {
        }
        u11.k();
        action = item.getAction();
        u11.o(1451809001);
        e.a aVar22 = e.f40358c0;
        e e112 = a0.e(aVar22, 1.0f);
        if (c7807z != null) {
        }
        e eVar2 = e112;
        if (action != null) {
        }
        u11.k();
        ReviewStatusInfoDTO.DateTextDTO.PaddingsDTO paddings5 = item.getPaddings();
        if (paddings5 != null) {
        }
        ReviewStatusInfoDTO.DateTextDTO.PaddingsDTO paddings22 = item.getPaddings();
        if (paddings22 != null) {
        }
        ReviewStatusInfoDTO.DateTextDTO.PaddingsDTO paddings32 = item.getPaddings();
        if (paddings32 != null) {
        }
        ReviewStatusInfoDTO.DateTextDTO.PaddingsDTO paddings42 = item.getPaddings();
        DsTextAtomKt.DsTextAtom(textDTO2, T.i(eVar2, m1867getDpD9Ej5fM, m1867getDpD9Ej5fM2, m1867getDpD9Ej5fM3, (paddings42 != null || (bottomPadding = paddings42.getBottomPadding()) == null) ? 0 : bottomPadding.m1867getDpD9Ej5fM()), u11, 0, 0);
        Function1<? super t, Unit> function132 = function12;
        m02 = u11.m0();
        if (m02 == null) {
        }
    }
}
