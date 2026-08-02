package com.vk.id.onetap.compose.onetap;

import B1.V;
import Bl0.C2652m;
import D1.InterfaceC2801g;
import P0.N1;
import S0.A0;
import S0.C3969l;
import S0.D1;
import S0.F1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.J0;
import S0.Q;
import S0.n1;
import Sc.o;
import T7.E;
import android.annotation.SuppressLint;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.Q1;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.vk.id.AccessToken;
import com.vk.id.OAuth;
import com.vk.id.VKID;
import com.vk.id.VKIDAuthFail;
import com.vk.id.VKIDUser;
import com.vk.id.auth.AuthCodeData;
import com.vk.id.auth.VKIDAuthParams;
import com.vk.id.auth.VKIDAuthUiParams;
import com.vk.id.group.subscription.common.fail.VKIDGroupSubscriptionFail;
import com.vk.id.group.subscription.common.style.GroupSubscriptionStyle;
import com.vk.id.group.subscription.compose.ui.GroupSubscriptionSheetKt;
import com.vk.id.group.subscription.compose.ui.GroupSubscriptionSheetState;
import com.vk.id.multibranding.OAuthListWidgetKt;
import com.vk.id.multibranding.common.style.OAuthListWidgetStyle;
import com.vk.id.onetap.common.OneTapOAuth;
import com.vk.id.onetap.common.OneTapStyle;
import com.vk.id.onetap.compose.button.alternate.AlternateAccountButtonKt;
import com.vk.id.onetap.compose.button.auth.VKIDButtonKt;
import com.vk.id.onetap.compose.button.auth.VKIDButtonState;
import com.vk.id.onetap.compose.button.auth.VKIDButtonTextProvider;
import com.vk.id.onetap.compose.onetap.OneTapKt;
import com.vk.id.util.UpdateLocaleKt;
import e1.InterfaceC6250b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import k70.C7601b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.M;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import oa.C8678a;
import org.jetbrains.annotations.NotNull;
import za.p;
import za.r;
import za.t;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0091\u0002\u0010$\u001a\u00020\f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022 \b\u0002\u0010\b\u001a\u001a\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00042\u001a\u0010\r\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\t2\u001a\b\u0002\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\f0\t2\u001c\b\u0002\u0010\u0012\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\f0\t2\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u000f2\b\b\u0002\u0010\u0016\u001a\u00020\u000f2\b\b\u0002\u0010\u0017\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\f0\u001c2\u0014\b\u0002\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\f0\u00042\u0006\u0010!\u001a\u00020 2\b\b\u0002\u0010#\u001a\u00020\"H\u0007¢\u0006\u0004\b$\u0010%\u001aÓ\u0001\u0010$\u001a\u00020\f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022 \b\u0002\u0010\b\u001a\u001a\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00042\u001a\u0010\r\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\t2\u001a\b\u0002\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\f0\t2\u001c\b\u0002\u0010\u0012\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\f0\t2\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u000f2\b\b\u0002\u0010\u0016\u001a\u00020\u000f2\b\b\u0002\u0010\u0017\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b$\u0010&\u001aõ\u0001\u0010$\u001a\u00020\f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u000f2\b\u0010(\u001a\u0004\u0018\u00010'2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\f0\u001c2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\f0\u001c2\u001a\u0010\r\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\t2\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\f0\t2\u001a\u0010\u0012\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\f0\t2\b\b\u0002\u0010\u0017\u001a\u00020\u00062\u0016\b\u0002\u0010,\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010+\u0012\u0004\u0012\u00020\f0\u00042\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020\u000f2\u0006\u0010.\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b$\u0010/\u001a\u0015\u00101\u001a\u0004\u0018\u000100*\u00020\u0002H\u0002¢\u0006\u0004\b1\u00102¨\u00066²\u0006\u000e\u00103\u001a\u00020\u001a8\n@\nX\u008a\u008e\u0002²\u0006\u0010\u00104\u001a\u0004\u0018\u00010+8\n@\nX\u008a\u008e\u0002²\u0006\f\u00105\u001a\u00020\u000f8\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/ui/e;", "modifier", "Lcom/vk/id/onetap/common/OneTapStyle;", "style", "Lkotlin/Function1;", "Lkotlin/coroutines/d;", "Lcom/vk/id/auth/VKIDAuthUiParams;", "", "onGetParams", "Lkotlin/Function2;", "Lcom/vk/id/onetap/common/OneTapOAuth;", "Lcom/vk/id/AccessToken;", "", "onAuth", "Lcom/vk/id/auth/AuthCodeData;", "", "onAuthCode", "Lcom/vk/id/VKIDAuthFail;", "onFail", "", "oAuths", "fastAuthEnabled", "signInAnotherAccountButtonEnabled", "authParams", "Lcom/vk/id/onetap/compose/onetap/OneTapTitleScenario;", "scenario", "", "subscribeToGroupId", "Lkotlin/Function0;", "onSuccessSubscribingToGroup", "Lcom/vk/id/group/subscription/common/fail/VKIDGroupSubscriptionFail;", "onFailSubscribingToGroup", "LP0/N1;", "groupSubscriptionSnackbarHostState", "Lcom/vk/id/group/subscription/common/style/GroupSubscriptionStyle;", "groupSubscriptionStyle", "OneTap", "(Landroidx/compose/ui/e;Lcom/vk/id/onetap/common/OneTapStyle;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Ljava/util/Set;ZZLcom/vk/id/auth/VKIDAuthUiParams;Lcom/vk/id/onetap/compose/onetap/OneTapTitleScenario;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;LP0/N1;Lcom/vk/id/group/subscription/common/style/GroupSubscriptionStyle;LS0/k;III)V", "(Landroidx/compose/ui/e;Lcom/vk/id/onetap/common/OneTapStyle;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Ljava/util/Set;ZZLcom/vk/id/auth/VKIDAuthUiParams;Lcom/vk/id/onetap/compose/onetap/OneTapTitleScenario;LS0/k;III)V", "Lcom/vk/id/onetap/compose/button/auth/VKIDButtonTextProvider;", "vkidButtonTextProvider", "onVKIDButtonClick", "onAlternateButtonClick", "Lcom/vk/id/VKIDUser;", "onUserFetched", "largeText", "measureInProgress", "(Landroidx/compose/ui/e;Lcom/vk/id/onetap/common/OneTapStyle;Ljava/util/Set;ZLcom/vk/id/onetap/compose/button/auth/VKIDButtonTextProvider;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lcom/vk/id/auth/VKIDAuthUiParams;Lkotlin/jvm/functions/Function1;ZZZLcom/vk/id/onetap/compose/onetap/OneTapTitleScenario;LS0/k;III)V", "Lcom/vk/id/auth/VKIDAuthParams$Theme;", "toProviderTheme", "(Lcom/vk/id/onetap/common/OneTapStyle;)Lcom/vk/id/auth/VKIDAuthParams$Theme;", "isSuccessfulAuth", "user", "fastAuthEnabledValue", "onetap-compose_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class OneTapKt {
    /* JADX WARN: Removed duplicated region for block: B:109:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0249  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OneTap(androidx.compose.ui.e eVar, OneTapStyle oneTapStyle, Function1<? super kotlin.coroutines.d<? super VKIDAuthUiParams>, ? extends Object> function1, @NotNull final Function2<? super OneTapOAuth, ? super AccessToken, Unit> onAuth, Function2<? super AuthCodeData, ? super Boolean, Unit> function2, Function2<? super OneTapOAuth, ? super VKIDAuthFail, Unit> function22, Set<? extends OneTapOAuth> set, boolean z11, boolean z12, VKIDAuthUiParams vKIDAuthUiParams, OneTapTitleScenario oneTapTitleScenario, @NotNull final String subscribeToGroupId, @NotNull final Function0<Unit> onSuccessSubscribingToGroup, Function1<? super VKIDGroupSubscriptionFail, Unit> function12, @NotNull final N1 groupSubscriptionSnackbarHostState, GroupSubscriptionStyle groupSubscriptionStyle, InterfaceC3967k interfaceC3967k, final int i11, final int i12, final int i13) {
        androidx.compose.ui.e eVar2;
        int i14;
        OneTapStyle oneTapStyle2;
        Function1<? super kotlin.coroutines.d<? super VKIDAuthUiParams>, ? extends Object> function13;
        Function2<? super AuthCodeData, ? super Boolean, Unit> function23;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        OneTapStyle oneTapStyle3;
        Function1<? super kotlin.coroutines.d<? super VKIDAuthUiParams>, ? extends Object> function14;
        Function2<? super AuthCodeData, ? super Boolean, Unit> function24;
        Function2<? super OneTapOAuth, ? super VKIDAuthFail, Unit> function25;
        VKIDAuthUiParams vKIDAuthUiParams2;
        androidx.compose.ui.e eVar3;
        Function1<? super VKIDGroupSubscriptionFail, Unit> function15;
        GroupSubscriptionStyle groupSubscriptionStyle2;
        Function1<? super kotlin.coroutines.d<? super VKIDAuthUiParams>, ? extends Object> function16;
        Function2<? super AuthCodeData, ? super Boolean, Unit> function26;
        Function2<? super OneTapOAuth, ? super VKIDAuthFail, Unit> function27;
        Set<? extends OneTapOAuth> set2;
        int i26;
        boolean z13;
        boolean z14;
        VKIDAuthUiParams vKIDAuthUiParams3;
        OneTapTitleScenario oneTapTitleScenario2;
        OneTapStyle oneTapStyle4;
        int i27;
        Function1<? super VKIDGroupSubscriptionFail, Unit> function17;
        androidx.compose.ui.e eVar4;
        Object C11;
        final InterfaceC3978p0 interfaceC3978p0;
        int I11;
        Object C12;
        boolean z15;
        Object C13;
        C3969l c3969l;
        final Function1<? super VKIDGroupSubscriptionFail, Unit> function18;
        final GroupSubscriptionStyle groupSubscriptionStyle3;
        final OneTapStyle oneTapStyle5;
        final Function1<? super kotlin.coroutines.d<? super VKIDAuthUiParams>, ? extends Object> function19;
        final Function2<? super AuthCodeData, ? super Boolean, Unit> function28;
        final Function2<? super OneTapOAuth, ? super VKIDAuthFail, Unit> function29;
        final Set<? extends OneTapOAuth> set3;
        final boolean z16;
        final boolean z17;
        final OneTapTitleScenario oneTapTitleScenario3;
        final VKIDAuthUiParams vKIDAuthUiParams4;
        final androidx.compose.ui.e eVar5;
        J0 m02;
        int i28;
        int i29;
        int i31;
        Intrinsics.checkNotNullParameter(onAuth, "onAuth");
        Intrinsics.checkNotNullParameter(subscribeToGroupId, "subscribeToGroupId");
        Intrinsics.checkNotNullParameter(onSuccessSubscribingToGroup, "onSuccessSubscribingToGroup");
        Intrinsics.checkNotNullParameter(groupSubscriptionSnackbarHostState, "groupSubscriptionSnackbarHostState");
        C3969l u11 = interfaceC3967k.u(505659780);
        int i32 = i13 & 1;
        if (i32 != 0) {
            i14 = i11 | 6;
            eVar2 = eVar;
        } else if ((i11 & 6) == 0) {
            eVar2 = eVar;
            i14 = (u11.n(eVar2) ? 4 : 2) | i11;
        } else {
            eVar2 = eVar;
            i14 = i11;
        }
        if ((i11 & 48) == 0) {
            if ((i13 & 2) == 0) {
                oneTapStyle2 = oneTapStyle;
                if (u11.n(oneTapStyle2)) {
                    i31 = 32;
                    i14 |= i31;
                }
            } else {
                oneTapStyle2 = oneTapStyle;
            }
            i31 = 16;
            i14 |= i31;
        } else {
            oneTapStyle2 = oneTapStyle;
        }
        if ((i11 & 384) == 0) {
            if ((i13 & 4) == 0) {
                function13 = function1;
                if (u11.F(function13)) {
                    i29 = 256;
                    i14 |= i29;
                }
            } else {
                function13 = function1;
            }
            i29 = 128;
            i14 |= i29;
        } else {
            function13 = function1;
        }
        int i33 = i13 & 8;
        int i34 = UserVerificationMethods.USER_VERIFY_ALL;
        if (i33 != 0) {
            i14 |= 3072;
        } else if ((i11 & 3072) == 0) {
            i14 |= u11.F(onAuth) ? 2048 : 1024;
        }
        int i35 = i13 & 16;
        if (i35 != 0) {
            i14 |= 24576;
        } else if ((i11 & 24576) == 0) {
            function23 = function2;
            i14 |= u11.F(function23) ? 16384 : 8192;
            i15 = i13 & 32;
            int i36 = 65536;
            if (i15 == 0) {
                i14 |= 196608;
            } else if ((i11 & 196608) == 0) {
                i14 |= u11.F(function22) ? 131072 : 65536;
            }
            i16 = i13 & 64;
            if (i16 == 0) {
                i14 |= 1572864;
            } else if ((i11 & 1572864) == 0) {
                i14 |= u11.F(set) ? 1048576 : 524288;
            }
            i17 = i13 & UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i17 == 0) {
                i14 |= 12582912;
            } else if ((i11 & 12582912) == 0) {
                i18 = i17;
                i14 |= u11.p(z11) ? 8388608 : 4194304;
                i19 = i13 & 256;
                if (i19 != 0) {
                    i14 |= 100663296;
                } else if ((i11 & 100663296) == 0) {
                    i21 = i19;
                    i14 |= u11.p(z12) ? 67108864 : 33554432;
                    if ((i11 & 805306368) == 0) {
                        if ((i13 & UserVerificationMethods.USER_VERIFY_NONE) == 0) {
                            if ((i11 & 1073741824) == 0 ? u11.n(vKIDAuthUiParams) : u11.F(vKIDAuthUiParams)) {
                                i28 = 536870912;
                                i14 |= i28;
                            }
                        }
                        i28 = 268435456;
                        i14 |= i28;
                    }
                    i22 = i13 & UserVerificationMethods.USER_VERIFY_ALL;
                    if (i22 == 0) {
                        i23 = i12 | 6;
                    } else if ((i12 & 6) == 0) {
                        i23 = i12 | (u11.n(oneTapTitleScenario) ? 4 : 2);
                    } else {
                        i23 = i12;
                    }
                    if ((i13 & 2048) == 0) {
                        i23 |= 48;
                    } else if ((i12 & 48) == 0) {
                        i23 |= u11.n(subscribeToGroupId) ? 32 : 16;
                    }
                    int i37 = i23;
                    if ((i13 & 4096) == 0) {
                        i37 |= 384;
                    } else if ((i12 & 384) == 0) {
                        i37 |= u11.F(onSuccessSubscribingToGroup) ? 256 : 128;
                    }
                    i24 = i13 & 8192;
                    if (i24 == 0) {
                        i25 = i37 | 3072;
                    } else {
                        int i38 = i37;
                        if ((i12 & 3072) == 0) {
                            if (u11.F(function12)) {
                                i34 = 2048;
                            }
                            i38 |= i34;
                        }
                        i25 = i38;
                    }
                    if ((i13 & 16384) == 0) {
                        i25 |= 24576;
                    } else if ((i12 & 24576) == 0) {
                        i25 |= u11.n(groupSubscriptionSnackbarHostState) ? 16384 : 8192;
                    }
                    if ((i12 & 196608) == 0) {
                        if ((i13 & 32768) == 0 && u11.F(groupSubscriptionStyle)) {
                            i36 = 131072;
                        }
                        i25 |= i36;
                    }
                    int i39 = i25;
                    if ((i14 & 306783379) != 306783378 && (i39 & 74899) == 74898 && u11.b()) {
                        u11.j();
                        function29 = function22;
                        vKIDAuthUiParams4 = vKIDAuthUiParams;
                        function18 = function12;
                        groupSubscriptionStyle3 = groupSubscriptionStyle;
                        c3969l = u11;
                        function19 = function13;
                        function28 = function23;
                        eVar5 = eVar2;
                        oneTapStyle5 = oneTapStyle2;
                        set3 = set;
                        z16 = z11;
                        z17 = z12;
                        oneTapTitleScenario3 = oneTapTitleScenario;
                    } else {
                        u11.Q0();
                        if ((i11 & 1) != 0 || u11.w0()) {
                            androidx.compose.ui.e eVar6 = i32 == 0 ? androidx.compose.ui.e.f40358c0 : eVar2;
                            if ((i13 & 2) == 0) {
                                oneTapStyle3 = new OneTapStyle.Light(null, null, null, 7, null);
                                i14 &= -113;
                            } else {
                                oneTapStyle3 = oneTapStyle2;
                            }
                            if ((i13 & 4) == 0) {
                                u11.o(1495074080);
                                Object C14 = u11.C();
                                if (C14 == InterfaceC3967k.a.a()) {
                                    C14 = new OneTapKt$OneTap$5$1(null);
                                    u11.x(C14);
                                }
                                function14 = (Function1) C14;
                                u11.k();
                                i14 &= -897;
                            } else {
                                function14 = function13;
                            }
                            if (i35 == 0) {
                                u11.o(1495079347);
                                Object C15 = u11.C();
                                if (C15 == InterfaceC3967k.a.a()) {
                                    C15 = new za.l();
                                    u11.x(C15);
                                }
                                function24 = (Function2) C15;
                                u11.k();
                            } else {
                                function24 = function23;
                            }
                            if (i15 == 0) {
                                u11.o(1495081811);
                                Object C16 = u11.C();
                                if (C16 == InterfaceC3967k.a.a()) {
                                    C16 = new p();
                                    u11.x(C16);
                                }
                                function25 = (Function2) C16;
                                u11.k();
                            } else {
                                function25 = function22;
                            }
                            Set<? extends OneTapOAuth> set4 = i16 == 0 ? M.f71699a : set;
                            boolean z18 = i18 == 0 ? true : z11;
                            boolean z19 = i21 == 0 ? false : z12;
                            if ((i13 & UserVerificationMethods.USER_VERIFY_NONE) == 0) {
                                vKIDAuthUiParams2 = new VKIDAuthUiParams.Builder().build();
                                i14 &= -1879048193;
                            } else {
                                vKIDAuthUiParams2 = vKIDAuthUiParams;
                            }
                            OneTapTitleScenario oneTapTitleScenario4 = i22 == 0 ? OneTapTitleScenario.SignIn : oneTapTitleScenario;
                            if (i24 == 0) {
                                u11.o(1495095050);
                                Object C17 = u11.C();
                                eVar3 = eVar6;
                                if (C17 == InterfaceC3967k.a.a()) {
                                    C17 = new C8678a(3);
                                    u11.x(C17);
                                }
                                function15 = (Function1) C17;
                                u11.k();
                            } else {
                                eVar3 = eVar6;
                                function15 = function12;
                            }
                            if ((i13 & 32768) == 0) {
                                groupSubscriptionStyle2 = new GroupSubscriptionStyle.Light(null, null, null, 7, null);
                                function16 = function14;
                                function26 = function24;
                                function27 = function25;
                                set2 = set4;
                                i26 = i14;
                                z13 = z18;
                                z14 = z19;
                                vKIDAuthUiParams3 = vKIDAuthUiParams2;
                                oneTapTitleScenario2 = oneTapTitleScenario4;
                                i27 = i39 & (-458753);
                                oneTapStyle4 = oneTapStyle3;
                            } else {
                                groupSubscriptionStyle2 = groupSubscriptionStyle;
                                function16 = function14;
                                function26 = function24;
                                function27 = function25;
                                set2 = set4;
                                i26 = i14;
                                z13 = z18;
                                z14 = z19;
                                vKIDAuthUiParams3 = vKIDAuthUiParams2;
                                oneTapTitleScenario2 = oneTapTitleScenario4;
                                oneTapStyle4 = oneTapStyle3;
                                i27 = i39;
                            }
                            function17 = function15;
                            eVar4 = eVar3;
                        } else {
                            u11.j();
                            if ((i13 & 2) != 0) {
                                i14 &= -113;
                            }
                            if ((i13 & 4) != 0) {
                                i14 &= -897;
                            }
                            if ((i13 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                                i14 &= -1879048193;
                            }
                            if ((i13 & 32768) != 0) {
                                function27 = function22;
                                set2 = set;
                                z13 = z11;
                                z14 = z12;
                                vKIDAuthUiParams3 = vKIDAuthUiParams;
                                oneTapTitleScenario2 = oneTapTitleScenario;
                                groupSubscriptionStyle2 = groupSubscriptionStyle;
                                i27 = i39 & (-458753);
                            } else {
                                function27 = function22;
                                set2 = set;
                                z13 = z11;
                                z14 = z12;
                                vKIDAuthUiParams3 = vKIDAuthUiParams;
                                oneTapTitleScenario2 = oneTapTitleScenario;
                                groupSubscriptionStyle2 = groupSubscriptionStyle;
                                i27 = i39;
                            }
                            function16 = function13;
                            function26 = function23;
                            eVar4 = eVar2;
                            i26 = i14;
                            oneTapStyle4 = oneTapStyle2;
                            function17 = function12;
                        }
                        u11.j0();
                        u11.o(1495100839);
                        C11 = u11.C();
                        if (C11 == InterfaceC3967k.a.a()) {
                            C11 = n1.f("", D1.f25195a);
                            u11.x(C11);
                        }
                        interfaceC3978p0 = (InterfaceC3978p0) C11;
                        u11.k();
                        V f7 = C5185h.f(InterfaceC6250b.a.o(), false);
                        I11 = u11.I();
                        A0 d11 = u11.d();
                        androidx.compose.ui.e f11 = androidx.compose.ui.c.f(u11, eVar4);
                        androidx.compose.ui.e eVar7 = eVar4;
                        Function0 a11 = Fr.g.a(InterfaceC2801g.f5440U, u11);
                        if (u11.t()) {
                            u11.e();
                        } else {
                            u11.H(a11);
                        }
                        Function2 f12 = E.f(u11, f7, u11, d11);
                        if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                            Ep.a.d(I11, u11, I11, f12);
                        }
                        F1.b(u11, f11, InterfaceC2801g.a.f());
                        u11.o(-1075065383);
                        C12 = u11.C();
                        if (C12 == InterfaceC3967k.a.a()) {
                            C12 = new sa.f(1);
                            u11.x(C12);
                        }
                        u11.k();
                        VKIDAuthUiParams newBuilder = vKIDAuthUiParams3.newBuilder((Function1) C12);
                        u11.o(-1075080192);
                        z15 = (i26 & 7168) != 2048;
                        C13 = u11.C();
                        if (!z15 || C13 == InterfaceC3967k.a.a()) {
                            C13 = new Function2() { // from class: za.q
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit OneTap$lambda$24$lambda$20$lambda$19;
                                    OneTap$lambda$24$lambda$20$lambda$19 = OneTapKt.OneTap$lambda$24$lambda$20$lambda$19(Function2.this, interfaceC3978p0, (OneTapOAuth) obj, (AccessToken) obj2);
                                    return OneTap$lambda$24$lambda$20$lambda$19;
                                }
                            };
                            u11.x(C13);
                        }
                        u11.k();
                        OneTap(null, oneTapStyle4, function16, (Function2) C13, function26, function27, set2, z13, z14, newBuilder, oneTapTitleScenario2, u11, (268428272 & i26) | (VKIDAuthUiParams.$stable << 27), i27 & 14, 1);
                        u11.o(-1075061481);
                        if (kotlin.text.h.K(OneTap$lambda$15(interfaceC3978p0))) {
                            GroupSubscriptionSheetState rememberGroupSubscriptionSheetState = GroupSubscriptionSheetKt.rememberGroupSubscriptionSheetState(u11, 0);
                            u11.o(-1075055546);
                            Object C18 = u11.C();
                            if (C18 == InterfaceC3967k.a.a()) {
                                C18 = new r();
                                u11.x(C18);
                            }
                            u11.k();
                            int i41 = i27 << 6;
                            c3969l = u11;
                            GroupSubscriptionSheetKt.GroupSubscriptionSheet(null, rememberGroupSubscriptionSheetState, (Function0) C18, subscribeToGroupId, onSuccessSubscribingToGroup, function17, groupSubscriptionSnackbarHostState, groupSubscriptionStyle2, c3969l, (i41 & 7168) | 384 | (57344 & i41) | (458752 & i41) | (3670016 & i41) | (i41 & 29360128), 1);
                            String OneTap$lambda$15 = OneTap$lambda$15(interfaceC3978p0);
                            c3969l.o(-1075042829);
                            boolean n11 = c3969l.n(rememberGroupSubscriptionSheetState);
                            Object C19 = c3969l.C();
                            if (n11 || C19 == InterfaceC3967k.a.a()) {
                                C19 = new OneTapKt$OneTap$10$4$1(rememberGroupSubscriptionSheetState, null);
                                c3969l.x(C19);
                            }
                            c3969l.k();
                            Q.e(c3969l, OneTap$lambda$15, (Function2) C19);
                        } else {
                            c3969l = u11;
                        }
                        c3969l.k();
                        c3969l.f();
                        function18 = function17;
                        groupSubscriptionStyle3 = groupSubscriptionStyle2;
                        oneTapStyle5 = oneTapStyle4;
                        function19 = function16;
                        function28 = function26;
                        function29 = function27;
                        set3 = set2;
                        z16 = z13;
                        z17 = z14;
                        oneTapTitleScenario3 = oneTapTitleScenario2;
                        vKIDAuthUiParams4 = vKIDAuthUiParams3;
                        eVar5 = eVar7;
                    }
                    m02 = c3969l.m0();
                    if (m02 == null) {
                        m02.G(new Function2() { // from class: za.s
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit OneTap$lambda$25;
                                int intValue = ((Integer) obj2).intValue();
                                int i42 = i12;
                                int i43 = i13;
                                OneTap$lambda$25 = OneTapKt.OneTap$lambda$25(androidx.compose.ui.e.this, oneTapStyle5, function19, onAuth, function28, function29, set3, z16, z17, vKIDAuthUiParams4, oneTapTitleScenario3, subscribeToGroupId, onSuccessSubscribingToGroup, function18, groupSubscriptionSnackbarHostState, groupSubscriptionStyle3, i11, i42, i43, (InterfaceC3967k) obj, intValue);
                                return OneTap$lambda$25;
                            }
                        });
                        return;
                    }
                    return;
                }
                i21 = i19;
                if ((i11 & 805306368) == 0) {
                }
                i22 = i13 & UserVerificationMethods.USER_VERIFY_ALL;
                if (i22 == 0) {
                }
                if ((i13 & 2048) == 0) {
                }
                int i372 = i23;
                if ((i13 & 4096) == 0) {
                }
                i24 = i13 & 8192;
                if (i24 == 0) {
                }
                if ((i13 & 16384) == 0) {
                }
                if ((i12 & 196608) == 0) {
                }
                int i392 = i25;
                if ((i14 & 306783379) != 306783378) {
                }
                u11.Q0();
                if ((i11 & 1) != 0) {
                }
                if (i32 == 0) {
                }
                if ((i13 & 2) == 0) {
                }
                if ((i13 & 4) == 0) {
                }
                if (i35 == 0) {
                }
                if (i15 == 0) {
                }
                if (i16 == 0) {
                }
                if (i18 == 0) {
                }
                if (i21 == 0) {
                }
                if ((i13 & UserVerificationMethods.USER_VERIFY_NONE) == 0) {
                }
                if (i22 == 0) {
                }
                if (i24 == 0) {
                }
                if ((i13 & 32768) == 0) {
                }
                function17 = function15;
                eVar4 = eVar3;
                u11.j0();
                u11.o(1495100839);
                C11 = u11.C();
                if (C11 == InterfaceC3967k.a.a()) {
                }
                interfaceC3978p0 = (InterfaceC3978p0) C11;
                u11.k();
                V f72 = C5185h.f(InterfaceC6250b.a.o(), false);
                I11 = u11.I();
                A0 d112 = u11.d();
                androidx.compose.ui.e f112 = androidx.compose.ui.c.f(u11, eVar4);
                androidx.compose.ui.e eVar72 = eVar4;
                Function0 a112 = Fr.g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                }
                Function2 f122 = E.f(u11, f72, u11, d112);
                if (!u11.t()) {
                }
                Ep.a.d(I11, u11, I11, f122);
                F1.b(u11, f112, InterfaceC2801g.a.f());
                u11.o(-1075065383);
                C12 = u11.C();
                if (C12 == InterfaceC3967k.a.a()) {
                }
                u11.k();
                VKIDAuthUiParams newBuilder2 = vKIDAuthUiParams3.newBuilder((Function1) C12);
                u11.o(-1075080192);
                if ((i26 & 7168) != 2048) {
                }
                C13 = u11.C();
                if (!z15) {
                }
                C13 = new Function2() { // from class: za.q
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit OneTap$lambda$24$lambda$20$lambda$19;
                        OneTap$lambda$24$lambda$20$lambda$19 = OneTapKt.OneTap$lambda$24$lambda$20$lambda$19(Function2.this, interfaceC3978p0, (OneTapOAuth) obj, (AccessToken) obj2);
                        return OneTap$lambda$24$lambda$20$lambda$19;
                    }
                };
                u11.x(C13);
                u11.k();
                OneTap(null, oneTapStyle4, function16, (Function2) C13, function26, function27, set2, z13, z14, newBuilder2, oneTapTitleScenario2, u11, (268428272 & i26) | (VKIDAuthUiParams.$stable << 27), i27 & 14, 1);
                u11.o(-1075061481);
                if (kotlin.text.h.K(OneTap$lambda$15(interfaceC3978p0))) {
                }
                c3969l.k();
                c3969l.f();
                function18 = function17;
                groupSubscriptionStyle3 = groupSubscriptionStyle2;
                oneTapStyle5 = oneTapStyle4;
                function19 = function16;
                function28 = function26;
                function29 = function27;
                set3 = set2;
                z16 = z13;
                z17 = z14;
                oneTapTitleScenario3 = oneTapTitleScenario2;
                vKIDAuthUiParams4 = vKIDAuthUiParams3;
                eVar5 = eVar72;
                m02 = c3969l.m0();
                if (m02 == null) {
                }
            }
            i18 = i17;
            i19 = i13 & 256;
            if (i19 != 0) {
            }
            i21 = i19;
            if ((i11 & 805306368) == 0) {
            }
            i22 = i13 & UserVerificationMethods.USER_VERIFY_ALL;
            if (i22 == 0) {
            }
            if ((i13 & 2048) == 0) {
            }
            int i3722 = i23;
            if ((i13 & 4096) == 0) {
            }
            i24 = i13 & 8192;
            if (i24 == 0) {
            }
            if ((i13 & 16384) == 0) {
            }
            if ((i12 & 196608) == 0) {
            }
            int i3922 = i25;
            if ((i14 & 306783379) != 306783378) {
            }
            u11.Q0();
            if ((i11 & 1) != 0) {
            }
            if (i32 == 0) {
            }
            if ((i13 & 2) == 0) {
            }
            if ((i13 & 4) == 0) {
            }
            if (i35 == 0) {
            }
            if (i15 == 0) {
            }
            if (i16 == 0) {
            }
            if (i18 == 0) {
            }
            if (i21 == 0) {
            }
            if ((i13 & UserVerificationMethods.USER_VERIFY_NONE) == 0) {
            }
            if (i22 == 0) {
            }
            if (i24 == 0) {
            }
            if ((i13 & 32768) == 0) {
            }
            function17 = function15;
            eVar4 = eVar3;
            u11.j0();
            u11.o(1495100839);
            C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
            }
            interfaceC3978p0 = (InterfaceC3978p0) C11;
            u11.k();
            V f722 = C5185h.f(InterfaceC6250b.a.o(), false);
            I11 = u11.I();
            A0 d1122 = u11.d();
            androidx.compose.ui.e f1122 = androidx.compose.ui.c.f(u11, eVar4);
            androidx.compose.ui.e eVar722 = eVar4;
            Function0 a1122 = Fr.g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
            }
            Function2 f1222 = E.f(u11, f722, u11, d1122);
            if (!u11.t()) {
            }
            Ep.a.d(I11, u11, I11, f1222);
            F1.b(u11, f1122, InterfaceC2801g.a.f());
            u11.o(-1075065383);
            C12 = u11.C();
            if (C12 == InterfaceC3967k.a.a()) {
            }
            u11.k();
            VKIDAuthUiParams newBuilder22 = vKIDAuthUiParams3.newBuilder((Function1) C12);
            u11.o(-1075080192);
            if ((i26 & 7168) != 2048) {
            }
            C13 = u11.C();
            if (!z15) {
            }
            C13 = new Function2() { // from class: za.q
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit OneTap$lambda$24$lambda$20$lambda$19;
                    OneTap$lambda$24$lambda$20$lambda$19 = OneTapKt.OneTap$lambda$24$lambda$20$lambda$19(Function2.this, interfaceC3978p0, (OneTapOAuth) obj, (AccessToken) obj2);
                    return OneTap$lambda$24$lambda$20$lambda$19;
                }
            };
            u11.x(C13);
            u11.k();
            OneTap(null, oneTapStyle4, function16, (Function2) C13, function26, function27, set2, z13, z14, newBuilder22, oneTapTitleScenario2, u11, (268428272 & i26) | (VKIDAuthUiParams.$stable << 27), i27 & 14, 1);
            u11.o(-1075061481);
            if (kotlin.text.h.K(OneTap$lambda$15(interfaceC3978p0))) {
            }
            c3969l.k();
            c3969l.f();
            function18 = function17;
            groupSubscriptionStyle3 = groupSubscriptionStyle2;
            oneTapStyle5 = oneTapStyle4;
            function19 = function16;
            function28 = function26;
            function29 = function27;
            set3 = set2;
            z16 = z13;
            z17 = z14;
            oneTapTitleScenario3 = oneTapTitleScenario2;
            vKIDAuthUiParams4 = vKIDAuthUiParams3;
            eVar5 = eVar722;
            m02 = c3969l.m0();
            if (m02 == null) {
            }
        }
        function23 = function2;
        i15 = i13 & 32;
        int i362 = 65536;
        if (i15 == 0) {
        }
        i16 = i13 & 64;
        if (i16 == 0) {
        }
        i17 = i13 & UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i17 == 0) {
        }
        i18 = i17;
        i19 = i13 & 256;
        if (i19 != 0) {
        }
        i21 = i19;
        if ((i11 & 805306368) == 0) {
        }
        i22 = i13 & UserVerificationMethods.USER_VERIFY_ALL;
        if (i22 == 0) {
        }
        if ((i13 & 2048) == 0) {
        }
        int i37222 = i23;
        if ((i13 & 4096) == 0) {
        }
        i24 = i13 & 8192;
        if (i24 == 0) {
        }
        if ((i13 & 16384) == 0) {
        }
        if ((i12 & 196608) == 0) {
        }
        int i39222 = i25;
        if ((i14 & 306783379) != 306783378) {
        }
        u11.Q0();
        if ((i11 & 1) != 0) {
        }
        if (i32 == 0) {
        }
        if ((i13 & 2) == 0) {
        }
        if ((i13 & 4) == 0) {
        }
        if (i35 == 0) {
        }
        if (i15 == 0) {
        }
        if (i16 == 0) {
        }
        if (i18 == 0) {
        }
        if (i21 == 0) {
        }
        if ((i13 & UserVerificationMethods.USER_VERIFY_NONE) == 0) {
        }
        if (i22 == 0) {
        }
        if (i24 == 0) {
        }
        if ((i13 & 32768) == 0) {
        }
        function17 = function15;
        eVar4 = eVar3;
        u11.j0();
        u11.o(1495100839);
        C11 = u11.C();
        if (C11 == InterfaceC3967k.a.a()) {
        }
        interfaceC3978p0 = (InterfaceC3978p0) C11;
        u11.k();
        V f7222 = C5185h.f(InterfaceC6250b.a.o(), false);
        I11 = u11.I();
        A0 d11222 = u11.d();
        androidx.compose.ui.e f11222 = androidx.compose.ui.c.f(u11, eVar4);
        androidx.compose.ui.e eVar7222 = eVar4;
        Function0 a11222 = Fr.g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 f12222 = E.f(u11, f7222, u11, d11222);
        if (!u11.t()) {
        }
        Ep.a.d(I11, u11, I11, f12222);
        F1.b(u11, f11222, InterfaceC2801g.a.f());
        u11.o(-1075065383);
        C12 = u11.C();
        if (C12 == InterfaceC3967k.a.a()) {
        }
        u11.k();
        VKIDAuthUiParams newBuilder222 = vKIDAuthUiParams3.newBuilder((Function1) C12);
        u11.o(-1075080192);
        if ((i26 & 7168) != 2048) {
        }
        C13 = u11.C();
        if (!z15) {
        }
        C13 = new Function2() { // from class: za.q
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Unit OneTap$lambda$24$lambda$20$lambda$19;
                OneTap$lambda$24$lambda$20$lambda$19 = OneTapKt.OneTap$lambda$24$lambda$20$lambda$19(Function2.this, interfaceC3978p0, (OneTapOAuth) obj, (AccessToken) obj2);
                return OneTap$lambda$24$lambda$20$lambda$19;
            }
        };
        u11.x(C13);
        u11.k();
        OneTap(null, oneTapStyle4, function16, (Function2) C13, function26, function27, set2, z13, z14, newBuilder222, oneTapTitleScenario2, u11, (268428272 & i26) | (VKIDAuthUiParams.$stable << 27), i27 & 14, 1);
        u11.o(-1075061481);
        if (kotlin.text.h.K(OneTap$lambda$15(interfaceC3978p0))) {
        }
        c3969l.k();
        c3969l.f();
        function18 = function17;
        groupSubscriptionStyle3 = groupSubscriptionStyle2;
        oneTapStyle5 = oneTapStyle4;
        function19 = function16;
        function28 = function26;
        function29 = function27;
        set3 = set2;
        z16 = z13;
        z17 = z14;
        oneTapTitleScenario3 = oneTapTitleScenario2;
        vKIDAuthUiParams4 = vKIDAuthUiParams3;
        eVar5 = eVar7222;
        m02 = c3969l.m0();
        if (m02 == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OneTap$lambda$10$lambda$9(OneTapOAuth oneTapOAuth, VKIDAuthFail vKIDAuthFail) {
        Intrinsics.checkNotNullParameter(vKIDAuthFail, "<unused var>");
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OneTap$lambda$13$lambda$12(VKIDGroupSubscriptionFail it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f71690a;
    }

    private static final String OneTap$lambda$15(InterfaceC3978p0<String> interfaceC3978p0) {
        return interfaceC3978p0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OneTap$lambda$24$lambda$18$lambda$17(VKIDAuthUiParams.Builder newBuilder) {
        Intrinsics.checkNotNullParameter(newBuilder, "$this$newBuilder");
        newBuilder.setScopes(e0.g(newBuilder.getScopes(), "groups"));
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OneTap$lambda$24$lambda$20$lambda$19(Function2 function2, InterfaceC3978p0 interfaceC3978p0, OneTapOAuth oneTapOAuth, AccessToken accessToken) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        function2.invoke(oneTapOAuth, accessToken);
        interfaceC3978p0.setValue(String.valueOf(System.currentTimeMillis()));
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String OneTap$lambda$24$lambda$22$lambda$21() {
        String token;
        AccessToken accessToken = VKID.INSTANCE.getInstance().getAccessToken();
        if (accessToken == null || (token = accessToken.getToken()) == null) {
            throw new IllegalStateException("Not authorized");
        }
        return token;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OneTap$lambda$25(androidx.compose.ui.e eVar, OneTapStyle oneTapStyle, Function1 function1, Function2 function2, Function2 function22, Function2 function23, Set set, boolean z11, boolean z12, VKIDAuthUiParams vKIDAuthUiParams, OneTapTitleScenario oneTapTitleScenario, String str, Function0 function0, Function1 function12, N1 n12, GroupSubscriptionStyle groupSubscriptionStyle, int i11, int i12, int i13, InterfaceC3967k interfaceC3967k, int i14) {
        OneTap(eVar, oneTapStyle, (Function1<? super kotlin.coroutines.d<? super VKIDAuthUiParams>, ? extends Object>) function1, (Function2<? super OneTapOAuth, ? super AccessToken, Unit>) function2, (Function2<? super AuthCodeData, ? super Boolean, Unit>) function22, (Function2<? super OneTapOAuth, ? super VKIDAuthFail, Unit>) function23, (Set<? extends OneTapOAuth>) set, z11, z12, vKIDAuthUiParams, oneTapTitleScenario, str, (Function0<Unit>) function0, (Function1<? super VKIDGroupSubscriptionFail, Unit>) function12, n12, groupSubscriptionStyle, interfaceC3967k, C2652m.e(i11 | 1), C2652m.e(i12), i13);
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OneTap$lambda$28$lambda$27(AuthCodeData authCodeData, boolean z11) {
        Intrinsics.checkNotNullParameter(authCodeData, "<unused var>");
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OneTap$lambda$30$lambda$29(OneTapOAuth oneTapOAuth, VKIDAuthFail vKIDAuthFail) {
        Intrinsics.checkNotNullParameter(vKIDAuthFail, "<unused var>");
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OneTap$lambda$32(androidx.compose.ui.e eVar, OneTapStyle oneTapStyle, Function1 function1, Function2 function2, Function2 function22, Function2 function23, Set set, boolean z11, boolean z12, VKIDAuthUiParams vKIDAuthUiParams, OneTapTitleScenario oneTapTitleScenario, int i11, int i12, int i13, InterfaceC3967k interfaceC3967k, int i14) {
        OneTap(eVar, oneTapStyle, function1, function2, function22, function23, set, z11, z12, vKIDAuthUiParams, oneTapTitleScenario, interfaceC3967k, C2652m.e(i11 | 1), C2652m.e(i12), i13);
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OneTap$lambda$35$lambda$34(VKIDUser vKIDUser) {
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OneTap$lambda$42$lambda$39$lambda$38(Function2 function2, OAuth oAuth, AccessToken accessToken) {
        Intrinsics.checkNotNullParameter(oAuth, "oAuth");
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        function2.invoke(OneTapOAuth.INSTANCE.fromOAuth(oAuth), accessToken);
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OneTap$lambda$42$lambda$41$lambda$40(Function2 function2, OAuth oAuth, VKIDAuthFail fail) {
        Intrinsics.checkNotNullParameter(oAuth, "oAuth");
        Intrinsics.checkNotNullParameter(fail, "fail");
        function2.invoke(OneTapOAuth.INSTANCE.fromOAuth(oAuth), fail);
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OneTap$lambda$43(androidx.compose.ui.e eVar, OneTapStyle oneTapStyle, Set set, boolean z11, VKIDButtonTextProvider vKIDButtonTextProvider, Function0 function0, Function0 function02, Function2 function2, Function2 function22, Function2 function23, VKIDAuthUiParams vKIDAuthUiParams, Function1 function1, boolean z12, boolean z13, boolean z14, OneTapTitleScenario oneTapTitleScenario, int i11, int i12, int i13, InterfaceC3967k interfaceC3967k, int i14) {
        OneTap(eVar, oneTapStyle, (Set<? extends OneTapOAuth>) set, z11, vKIDButtonTextProvider, (Function0<Unit>) function0, (Function0<Unit>) function02, (Function2<? super OneTapOAuth, ? super AccessToken, Unit>) function2, (Function2<? super AuthCodeData, ? super Boolean, Unit>) function22, (Function2<? super OneTapOAuth, ? super VKIDAuthFail, Unit>) function23, vKIDAuthUiParams, (Function1<? super VKIDUser, Unit>) function1, z12, z13, z14, oneTapTitleScenario, interfaceC3967k, C2652m.e(i11 | 1), C2652m.e(i12), i13);
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OneTap$lambda$8$lambda$7(AuthCodeData authCodeData, boolean z11) {
        Intrinsics.checkNotNullParameter(authCodeData, "<unused var>");
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VKIDAuthParams.Theme toProviderTheme(OneTapStyle oneTapStyle) {
        if ((oneTapStyle instanceof OneTapStyle.Dark) || (oneTapStyle instanceof OneTapStyle.SecondaryDark) || (oneTapStyle instanceof OneTapStyle.TransparentDark)) {
            return VKIDAuthParams.Theme.Dark;
        }
        if ((oneTapStyle instanceof OneTapStyle.Light) || (oneTapStyle instanceof OneTapStyle.SecondaryLight) || (oneTapStyle instanceof OneTapStyle.TransparentLight)) {
            return VKIDAuthParams.Theme.Light;
        }
        if (oneTapStyle instanceof OneTapStyle.Icon) {
            return null;
        }
        throw new o();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0225  */
    @SuppressLint({"UnusedBoxWithConstraintsScope"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OneTap(androidx.compose.ui.e eVar, OneTapStyle oneTapStyle, Function1<? super kotlin.coroutines.d<? super VKIDAuthUiParams>, ? extends Object> function1, @NotNull final Function2<? super OneTapOAuth, ? super AccessToken, Unit> onAuth, Function2<? super AuthCodeData, ? super Boolean, Unit> function2, Function2<? super OneTapOAuth, ? super VKIDAuthFail, Unit> function22, Set<? extends OneTapOAuth> set, boolean z11, boolean z12, VKIDAuthUiParams vKIDAuthUiParams, OneTapTitleScenario oneTapTitleScenario, InterfaceC3967k interfaceC3967k, final int i11, final int i12, final int i13) {
        androidx.compose.ui.e eVar2;
        int i14;
        OneTapStyle oneTapStyle2;
        Function1<? super kotlin.coroutines.d<? super VKIDAuthUiParams>, ? extends Object> function12;
        Function2<? super AuthCodeData, ? super Boolean, Unit> function23;
        int i15;
        Function2<? super OneTapOAuth, ? super VKIDAuthFail, Unit> function24;
        int i16;
        Set<? extends OneTapOAuth> set2;
        int i17;
        int i18;
        int i19;
        int i21;
        int i22;
        int i23;
        OneTapTitleScenario oneTapTitleScenario2;
        boolean z13;
        boolean z14;
        androidx.compose.ui.e eVar3;
        Function1<? super kotlin.coroutines.d<? super VKIDAuthUiParams>, ? extends Object> function13;
        Function2<? super OneTapOAuth, ? super VKIDAuthFail, Unit> function25;
        VKIDAuthUiParams vKIDAuthUiParams2;
        Function2<? super AuthCodeData, ? super Boolean, Unit> function26;
        Set<? extends OneTapOAuth> set3;
        final OneTapStyle oneTapStyle3;
        final Function2<? super AuthCodeData, ? super Boolean, Unit> function27;
        final Function2<? super OneTapOAuth, ? super VKIDAuthFail, Unit> function28;
        final Set<? extends OneTapOAuth> set4;
        final VKIDAuthUiParams vKIDAuthUiParams3;
        final boolean z15;
        final androidx.compose.ui.e eVar4;
        final Function1<? super kotlin.coroutines.d<? super VKIDAuthUiParams>, ? extends Object> function14;
        final boolean z16;
        final OneTapTitleScenario oneTapTitleScenario3;
        J0 m02;
        int i24;
        int i25;
        int i26;
        Intrinsics.checkNotNullParameter(onAuth, "onAuth");
        C3969l u11 = interfaceC3967k.u(-982846831);
        int i27 = i13 & 1;
        if (i27 != 0) {
            i14 = i11 | 6;
            eVar2 = eVar;
        } else if ((i11 & 6) == 0) {
            eVar2 = eVar;
            i14 = (u11.n(eVar2) ? 4 : 2) | i11;
        } else {
            eVar2 = eVar;
            i14 = i11;
        }
        if ((i11 & 48) == 0) {
            if ((i13 & 2) == 0) {
                oneTapStyle2 = oneTapStyle;
                if (u11.n(oneTapStyle2)) {
                    i26 = 32;
                    i14 |= i26;
                }
            } else {
                oneTapStyle2 = oneTapStyle;
            }
            i26 = 16;
            i14 |= i26;
        } else {
            oneTapStyle2 = oneTapStyle;
        }
        if ((i11 & 384) == 0) {
            if ((i13 & 4) == 0) {
                function12 = function1;
                if (u11.F(function12)) {
                    i25 = 256;
                    i14 |= i25;
                }
            } else {
                function12 = function1;
            }
            i25 = UserVerificationMethods.USER_VERIFY_PATTERN;
            i14 |= i25;
        } else {
            function12 = function1;
        }
        if ((i13 & 8) != 0) {
            i14 |= 3072;
        } else if ((i11 & 3072) == 0) {
            i14 |= u11.F(onAuth) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        int i28 = i13 & 16;
        if (i28 != 0) {
            i14 |= 24576;
        } else if ((i11 & 24576) == 0) {
            function23 = function2;
            i14 |= u11.F(function23) ? 16384 : 8192;
            i15 = i13 & 32;
            if (i15 == 0) {
                i14 |= 196608;
            } else if ((196608 & i11) == 0) {
                function24 = function22;
                i14 |= u11.F(function24) ? 131072 : 65536;
                i16 = i13 & 64;
                if (i16 != 0) {
                    i14 |= 1572864;
                    set2 = set;
                } else {
                    set2 = set;
                    if ((i11 & 1572864) == 0) {
                        i14 |= u11.F(set2) ? 1048576 : 524288;
                    }
                }
                i17 = i13 & UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i17 != 0) {
                    i14 |= 12582912;
                } else if ((i11 & 12582912) == 0) {
                    i18 = i27;
                    i14 |= u11.p(z11) ? 8388608 : 4194304;
                    i19 = i13 & 256;
                    if (i19 == 0) {
                        i14 |= 100663296;
                    } else if ((i11 & 100663296) == 0) {
                        i21 = i19;
                        i14 |= u11.p(z12) ? 67108864 : 33554432;
                        if ((i11 & 805306368) == 0) {
                            if ((i13 & UserVerificationMethods.USER_VERIFY_NONE) == 0) {
                                if ((1073741824 & i11) == 0 ? u11.n(vKIDAuthUiParams) : u11.F(vKIDAuthUiParams)) {
                                    i24 = 536870912;
                                    i14 |= i24;
                                }
                            }
                            i24 = 268435456;
                            i14 |= i24;
                        }
                        i22 = i13 & UserVerificationMethods.USER_VERIFY_ALL;
                        if (i22 != 0) {
                            i23 = i12 | 6;
                        } else if ((i12 & 6) == 0) {
                            i23 = i12 | (u11.n(oneTapTitleScenario) ? 4 : 2);
                        } else {
                            i23 = i12;
                        }
                        if ((i14 & 306783379) != 306783378 && (i23 & 3) == 2 && u11.b()) {
                            u11.j();
                            OneTapStyle oneTapStyle4 = oneTapStyle2;
                            set4 = set2;
                            oneTapStyle3 = oneTapStyle4;
                            z16 = z12;
                            oneTapTitleScenario3 = oneTapTitleScenario;
                            eVar4 = eVar2;
                            function14 = function12;
                            function27 = function23;
                            function28 = function24;
                            z15 = z11;
                            vKIDAuthUiParams3 = vKIDAuthUiParams;
                        } else {
                            u11.Q0();
                            if ((i11 & 1) == 0 && !u11.w0()) {
                                u11.j();
                                z13 = z11;
                                z14 = z12;
                                oneTapTitleScenario2 = oneTapTitleScenario;
                                eVar3 = eVar2;
                                function13 = function12;
                                function26 = function23;
                                vKIDAuthUiParams2 = vKIDAuthUiParams;
                                set3 = set2;
                                oneTapStyle3 = oneTapStyle2;
                                function25 = function24;
                            } else {
                                if (i18 != 0) {
                                    eVar2 = androidx.compose.ui.e.f40358c0;
                                }
                                OneTapStyle light = (i13 & 2) != 0 ? new OneTapStyle.Light(null, null, null, 7, null) : oneTapStyle2;
                                if ((i13 & 4) != 0) {
                                    u11.o(1495220064);
                                    Object C11 = u11.C();
                                    if (C11 == InterfaceC3967k.a.a()) {
                                        C11 = new OneTapKt$OneTap$12$1(null);
                                        u11.x(C11);
                                    }
                                    u11.k();
                                    function12 = (Function1) C11;
                                }
                                if (i28 != 0) {
                                    u11.o(1495225331);
                                    Object C12 = u11.C();
                                    if (C12 == InterfaceC3967k.a.a()) {
                                        C12 = new t60.g(2);
                                        u11.x(C12);
                                    }
                                    u11.k();
                                    function23 = (Function2) C12;
                                }
                                if (i15 != 0) {
                                    u11.o(1495227795);
                                    Object C13 = u11.C();
                                    if (C13 == InterfaceC3967k.a.a()) {
                                        C13 = new t();
                                        u11.x(C13);
                                    }
                                    u11.k();
                                    function24 = (Function2) C13;
                                }
                                if (i16 != 0) {
                                    set2 = M.f71699a;
                                }
                                boolean z17 = i17 != 0 ? true : z11;
                                boolean z18 = i21 != 0 ? false : z12;
                                VKIDAuthUiParams build = (i13 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? new VKIDAuthUiParams.Builder().build() : vKIDAuthUiParams;
                                if (i22 != 0) {
                                    oneTapTitleScenario2 = OneTapTitleScenario.SignIn;
                                    z14 = z18;
                                    eVar3 = eVar2;
                                    function13 = function12;
                                    function25 = function24;
                                    z13 = z17;
                                } else {
                                    oneTapTitleScenario2 = oneTapTitleScenario;
                                    z13 = z17;
                                    z14 = z18;
                                    eVar3 = eVar2;
                                    function13 = function12;
                                    function25 = function24;
                                }
                                vKIDAuthUiParams2 = build;
                                function26 = function23;
                                set3 = set2;
                                oneTapStyle3 = light;
                            }
                            u11.j0();
                            UpdateLocaleKt.InternalVKIDWithUpdatedLocale(a1.c.c(1526952168, new OneTapKt$OneTap$16(z13, oneTapStyle3, eVar3, oneTapTitleScenario2, onAuth, function26, function25, vKIDAuthUiParams2, function13, set3, z14), u11), u11, 6);
                            function27 = function26;
                            function28 = function25;
                            set4 = set3;
                            vKIDAuthUiParams3 = vKIDAuthUiParams2;
                            z15 = z13;
                            eVar4 = eVar3;
                            function14 = function13;
                            z16 = z14;
                            oneTapTitleScenario3 = oneTapTitleScenario2;
                        }
                        m02 = u11.m0();
                        if (m02 != null) {
                            m02.G(new Function2() { // from class: za.u
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit OneTap$lambda$32;
                                    int intValue = ((Integer) obj2).intValue();
                                    int i29 = i12;
                                    int i31 = i13;
                                    OneTap$lambda$32 = OneTapKt.OneTap$lambda$32(androidx.compose.ui.e.this, oneTapStyle3, function14, onAuth, function27, function28, set4, z15, z16, vKIDAuthUiParams3, oneTapTitleScenario3, i11, i29, i31, (InterfaceC3967k) obj, intValue);
                                    return OneTap$lambda$32;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i21 = i19;
                    if ((i11 & 805306368) == 0) {
                    }
                    i22 = i13 & UserVerificationMethods.USER_VERIFY_ALL;
                    if (i22 != 0) {
                    }
                    if ((i14 & 306783379) != 306783378) {
                    }
                    u11.Q0();
                    if ((i11 & 1) == 0) {
                    }
                    if (i18 != 0) {
                    }
                    if ((i13 & 2) != 0) {
                    }
                    if ((i13 & 4) != 0) {
                    }
                    if (i28 != 0) {
                    }
                    if (i15 != 0) {
                    }
                    if (i16 != 0) {
                    }
                    if (i17 != 0) {
                    }
                    if (i21 != 0) {
                    }
                    if ((i13 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                    }
                    if (i22 != 0) {
                    }
                    vKIDAuthUiParams2 = build;
                    function26 = function23;
                    set3 = set2;
                    oneTapStyle3 = light;
                    u11.j0();
                    UpdateLocaleKt.InternalVKIDWithUpdatedLocale(a1.c.c(1526952168, new OneTapKt$OneTap$16(z13, oneTapStyle3, eVar3, oneTapTitleScenario2, onAuth, function26, function25, vKIDAuthUiParams2, function13, set3, z14), u11), u11, 6);
                    function27 = function26;
                    function28 = function25;
                    set4 = set3;
                    vKIDAuthUiParams3 = vKIDAuthUiParams2;
                    z15 = z13;
                    eVar4 = eVar3;
                    function14 = function13;
                    z16 = z14;
                    oneTapTitleScenario3 = oneTapTitleScenario2;
                    m02 = u11.m0();
                    if (m02 != null) {
                    }
                }
                i18 = i27;
                i19 = i13 & 256;
                if (i19 == 0) {
                }
                i21 = i19;
                if ((i11 & 805306368) == 0) {
                }
                i22 = i13 & UserVerificationMethods.USER_VERIFY_ALL;
                if (i22 != 0) {
                }
                if ((i14 & 306783379) != 306783378) {
                }
                u11.Q0();
                if ((i11 & 1) == 0) {
                }
                if (i18 != 0) {
                }
                if ((i13 & 2) != 0) {
                }
                if ((i13 & 4) != 0) {
                }
                if (i28 != 0) {
                }
                if (i15 != 0) {
                }
                if (i16 != 0) {
                }
                if (i17 != 0) {
                }
                if (i21 != 0) {
                }
                if ((i13 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                }
                if (i22 != 0) {
                }
                vKIDAuthUiParams2 = build;
                function26 = function23;
                set3 = set2;
                oneTapStyle3 = light;
                u11.j0();
                UpdateLocaleKt.InternalVKIDWithUpdatedLocale(a1.c.c(1526952168, new OneTapKt$OneTap$16(z13, oneTapStyle3, eVar3, oneTapTitleScenario2, onAuth, function26, function25, vKIDAuthUiParams2, function13, set3, z14), u11), u11, 6);
                function27 = function26;
                function28 = function25;
                set4 = set3;
                vKIDAuthUiParams3 = vKIDAuthUiParams2;
                z15 = z13;
                eVar4 = eVar3;
                function14 = function13;
                z16 = z14;
                oneTapTitleScenario3 = oneTapTitleScenario2;
                m02 = u11.m0();
                if (m02 != null) {
                }
            }
            function24 = function22;
            i16 = i13 & 64;
            if (i16 != 0) {
            }
            i17 = i13 & UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i17 != 0) {
            }
            i18 = i27;
            i19 = i13 & 256;
            if (i19 == 0) {
            }
            i21 = i19;
            if ((i11 & 805306368) == 0) {
            }
            i22 = i13 & UserVerificationMethods.USER_VERIFY_ALL;
            if (i22 != 0) {
            }
            if ((i14 & 306783379) != 306783378) {
            }
            u11.Q0();
            if ((i11 & 1) == 0) {
            }
            if (i18 != 0) {
            }
            if ((i13 & 2) != 0) {
            }
            if ((i13 & 4) != 0) {
            }
            if (i28 != 0) {
            }
            if (i15 != 0) {
            }
            if (i16 != 0) {
            }
            if (i17 != 0) {
            }
            if (i21 != 0) {
            }
            if ((i13 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            }
            if (i22 != 0) {
            }
            vKIDAuthUiParams2 = build;
            function26 = function23;
            set3 = set2;
            oneTapStyle3 = light;
            u11.j0();
            UpdateLocaleKt.InternalVKIDWithUpdatedLocale(a1.c.c(1526952168, new OneTapKt$OneTap$16(z13, oneTapStyle3, eVar3, oneTapTitleScenario2, onAuth, function26, function25, vKIDAuthUiParams2, function13, set3, z14), u11), u11, 6);
            function27 = function26;
            function28 = function25;
            set4 = set3;
            vKIDAuthUiParams3 = vKIDAuthUiParams2;
            z15 = z13;
            eVar4 = eVar3;
            function14 = function13;
            z16 = z14;
            oneTapTitleScenario3 = oneTapTitleScenario2;
            m02 = u11.m0();
            if (m02 != null) {
            }
        }
        function23 = function2;
        i15 = i13 & 32;
        if (i15 == 0) {
        }
        function24 = function22;
        i16 = i13 & 64;
        if (i16 != 0) {
        }
        i17 = i13 & UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i17 != 0) {
        }
        i18 = i27;
        i19 = i13 & 256;
        if (i19 == 0) {
        }
        i21 = i19;
        if ((i11 & 805306368) == 0) {
        }
        i22 = i13 & UserVerificationMethods.USER_VERIFY_ALL;
        if (i22 != 0) {
        }
        if ((i14 & 306783379) != 306783378) {
        }
        u11.Q0();
        if ((i11 & 1) == 0) {
        }
        if (i18 != 0) {
        }
        if ((i13 & 2) != 0) {
        }
        if ((i13 & 4) != 0) {
        }
        if (i28 != 0) {
        }
        if (i15 != 0) {
        }
        if (i16 != 0) {
        }
        if (i17 != 0) {
        }
        if (i21 != 0) {
        }
        if ((i13 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
        }
        if (i22 != 0) {
        }
        vKIDAuthUiParams2 = build;
        function26 = function23;
        set3 = set2;
        oneTapStyle3 = light;
        u11.j0();
        UpdateLocaleKt.InternalVKIDWithUpdatedLocale(a1.c.c(1526952168, new OneTapKt$OneTap$16(z13, oneTapStyle3, eVar3, oneTapTitleScenario2, onAuth, function26, function25, vKIDAuthUiParams2, function13, set3, z14), u11), u11, 6);
        function27 = function26;
        function28 = function25;
        set4 = set3;
        vKIDAuthUiParams3 = vKIDAuthUiParams2;
        z15 = z13;
        eVar4 = eVar3;
        function14 = function13;
        z16 = z14;
        oneTapTitleScenario3 = oneTapTitleScenario2;
        m02 = u11.m0();
        if (m02 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0321  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OneTap(androidx.compose.ui.e eVar, OneTapStyle oneTapStyle, @NotNull final Set<? extends OneTapOAuth> oAuths, boolean z11, final VKIDButtonTextProvider vKIDButtonTextProvider, @NotNull final Function0<Unit> onVKIDButtonClick, @NotNull final Function0<Unit> onAlternateButtonClick, @NotNull final Function2<? super OneTapOAuth, ? super AccessToken, Unit> onAuth, @NotNull final Function2<? super AuthCodeData, ? super Boolean, Unit> onAuthCode, @NotNull final Function2<? super OneTapOAuth, ? super VKIDAuthFail, Unit> onFail, VKIDAuthUiParams vKIDAuthUiParams, Function1<? super VKIDUser, Unit> function1, final boolean z12, final boolean z13, final boolean z14, @NotNull final OneTapTitleScenario scenario, InterfaceC3967k interfaceC3967k, final int i11, final int i12, final int i13) {
        androidx.compose.ui.e eVar2;
        int i14;
        OneTapStyle oneTapStyle2;
        int i15;
        int i16;
        int i17;
        int i18;
        VKIDAuthUiParams vKIDAuthUiParams2;
        boolean z15;
        Function1<? super VKIDUser, Unit> function12;
        VKIDAuthUiParams vKIDAuthUiParams3;
        int i19;
        int i21;
        androidx.compose.ui.e eVar3;
        OneTapStyle oneTapStyle3;
        boolean z16;
        Object C11;
        int I11;
        boolean z17;
        VKIDAuthUiParams vKIDAuthUiParams4;
        final OneTapStyle oneTapStyle4;
        final boolean z18;
        final VKIDAuthUiParams vKIDAuthUiParams5;
        final Function1<? super VKIDUser, Unit> function13;
        J0 m02;
        int i22;
        int i23;
        int i24;
        int i25;
        Intrinsics.checkNotNullParameter(oAuths, "oAuths");
        Intrinsics.checkNotNullParameter(onVKIDButtonClick, "onVKIDButtonClick");
        Intrinsics.checkNotNullParameter(onAlternateButtonClick, "onAlternateButtonClick");
        Intrinsics.checkNotNullParameter(onAuth, "onAuth");
        Intrinsics.checkNotNullParameter(onAuthCode, "onAuthCode");
        Intrinsics.checkNotNullParameter(onFail, "onFail");
        Intrinsics.checkNotNullParameter(scenario, "scenario");
        C3969l u11 = interfaceC3967k.u(-300761866);
        int i26 = i13 & 1;
        if (i26 != 0) {
            i14 = i11 | 6;
            eVar2 = eVar;
        } else {
            eVar2 = eVar;
            if ((i11 & 6) == 0) {
                i14 = i11 | (u11.n(eVar2) ? 4 : 2);
            } else {
                i14 = i11;
            }
        }
        if ((i11 & 48) == 0) {
            oneTapStyle2 = oneTapStyle;
            i14 |= ((i13 & 2) == 0 && u11.n(oneTapStyle2)) ? 32 : 16;
        } else {
            oneTapStyle2 = oneTapStyle;
        }
        int i27 = i14;
        if ((i13 & 4) != 0) {
            i15 = i27 | 384;
        } else if ((i11 & 384) == 0) {
            i15 = i27 | (u11.F(oAuths) ? 256 : 128);
        } else {
            i15 = i27;
        }
        int i28 = i13 & 8;
        if (i28 != 0) {
            i15 |= 3072;
        } else if ((i11 & 3072) == 0) {
            i15 |= u11.p(z11) ? 2048 : 1024;
            if ((i13 & 16) == 0) {
                i15 |= 24576;
            } else if ((i11 & 24576) == 0) {
                i15 |= (i11 & 32768) == 0 ? u11.n(vKIDButtonTextProvider) : u11.F(vKIDButtonTextProvider) ? 16384 : 8192;
            }
            if ((i13 & 32) == 0) {
                i15 |= 196608;
            } else if ((i11 & 196608) == 0) {
                i15 |= u11.F(onVKIDButtonClick) ? 131072 : 65536;
            }
            if ((i13 & 64) == 0) {
                i15 |= 1572864;
            } else if ((i11 & 1572864) == 0) {
                i15 |= u11.F(onAlternateButtonClick) ? 1048576 : 524288;
            }
            if ((i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                i25 = (12582912 & i11) == 0 ? u11.F(onAuth) ? 8388608 : 4194304 : 12582912;
                if ((i13 & 256) == 0) {
                    i24 = (100663296 & i11) == 0 ? u11.F(onAuthCode) ? 67108864 : 33554432 : 100663296;
                    if ((i13 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                        i23 = (805306368 & i11) == 0 ? u11.F(onFail) ? 536870912 : 268435456 : 805306368;
                        if ((i12 & 6) == 0) {
                            if ((i13 & UserVerificationMethods.USER_VERIFY_ALL) == 0) {
                                if ((i12 & 8) == 0 ? u11.n(vKIDAuthUiParams) : u11.F(vKIDAuthUiParams)) {
                                    i22 = 4;
                                    i16 = i12 | i22;
                                }
                            }
                            i22 = 2;
                            i16 = i12 | i22;
                        } else {
                            i16 = i12;
                        }
                        i17 = i13 & 2048;
                        if (i17 != 0) {
                            i16 |= 48;
                        } else if ((i12 & 48) == 0) {
                            i18 = i17;
                            i16 |= u11.F(function1) ? 32 : 16;
                            if ((i13 & 4096) == 0) {
                                i16 |= 384;
                            } else if ((i12 & 384) == 0) {
                                i16 |= u11.p(z12) ? 256 : 128;
                                if ((i13 & 8192) != 0) {
                                    i16 |= 3072;
                                } else if ((i12 & 3072) == 0) {
                                    i16 |= u11.p(z13) ? 2048 : 1024;
                                    if ((i13 & 16384) == 0) {
                                        i16 |= 24576;
                                    } else if ((i12 & 24576) == 0) {
                                        i16 |= u11.p(z14) ? 16384 : 8192;
                                        if ((i13 & 32768) != 0) {
                                            i16 |= 196608;
                                        } else if ((i12 & 196608) == 0) {
                                            i16 |= u11.n(scenario) ? 131072 : 65536;
                                        }
                                        if ((i15 & 306783379) != 306783378 && (74899 & i16) == 74898 && u11.b()) {
                                            u11.j();
                                            z18 = z11;
                                            function13 = function1;
                                            vKIDAuthUiParams5 = vKIDAuthUiParams;
                                            oneTapStyle4 = oneTapStyle2;
                                        } else {
                                            u11.Q0();
                                            if ((i11 & 1) != 0 || u11.w0()) {
                                                if (i26 != 0) {
                                                    eVar2 = androidx.compose.ui.e.f40358c0;
                                                }
                                                if ((i13 & 2) != 0) {
                                                    i15 &= -113;
                                                    oneTapStyle2 = new OneTapStyle.Light(null, null, null, 7, null);
                                                }
                                                boolean z19 = i28 != 0 ? false : z11;
                                                if ((i13 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                                                    vKIDAuthUiParams2 = new VKIDAuthUiParams.Builder().build();
                                                    i16 &= -15;
                                                } else {
                                                    vKIDAuthUiParams2 = vKIDAuthUiParams;
                                                }
                                                if (i18 != 0) {
                                                    u11.o(1495484106);
                                                    Object C12 = u11.C();
                                                    z15 = z19;
                                                    if (C12 == InterfaceC3967k.a.a()) {
                                                        C12 = new za.m();
                                                        u11.x(C12);
                                                    }
                                                    u11.k();
                                                    function12 = (Function1) C12;
                                                } else {
                                                    z15 = z19;
                                                    function12 = function1;
                                                }
                                                vKIDAuthUiParams3 = vKIDAuthUiParams2;
                                                i19 = i16;
                                                i21 = i15;
                                                eVar3 = eVar2;
                                                oneTapStyle3 = oneTapStyle2;
                                                z16 = z15;
                                            } else {
                                                u11.j();
                                                if ((i13 & 2) != 0) {
                                                    i15 &= -113;
                                                }
                                                if ((i13 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                                                    i16 &= -15;
                                                }
                                                function12 = function1;
                                                vKIDAuthUiParams3 = vKIDAuthUiParams;
                                                i21 = i15;
                                                eVar3 = eVar2;
                                                oneTapStyle3 = oneTapStyle2;
                                                i19 = i16;
                                                z16 = z11;
                                            }
                                            u11.j0();
                                            u11.o(1495489112);
                                            C11 = u11.C();
                                            if (C11 == InterfaceC3967k.a.a()) {
                                                C11 = new VKIDButtonState(false, null, null, null, false, false, false, 126, null);
                                                u11.x(C11);
                                            }
                                            VKIDButtonState vKIDButtonState = (VKIDButtonState) C11;
                                            u11.k();
                                            OneTapStyle oneTapStyle5 = oneTapStyle3;
                                            C5194q a11 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
                                            I11 = u11.I();
                                            A0 d11 = u11.d();
                                            z17 = z16;
                                            androidx.compose.ui.e f7 = androidx.compose.ui.c.f(u11, eVar3);
                                            androidx.compose.ui.e eVar4 = eVar3;
                                            Function0 a12 = Fr.g.a(InterfaceC2801g.f5440U, u11);
                                            if (u11.t()) {
                                                u11.H(a12);
                                            } else {
                                                u11.e();
                                            }
                                            Function2 g10 = K00.b.g(u11, a11, u11, d11);
                                            if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                                                Ep.a.d(I11, u11, I11, g10);
                                            }
                                            F1.b(u11, f7, InterfaceC2801g.a.f());
                                            e.a aVar = androidx.compose.ui.e.f40358c0;
                                            int i29 = i21 >> 3;
                                            int i31 = i19 << 12;
                                            int i32 = i19 << 9;
                                            int i33 = (i32 & 234881024) | (i29 & 57344) | (i29 & 7168) | 390 | (458752 & i31) | (3670016 & i31) | (i31 & 29360128);
                                            int i34 = i19;
                                            VKIDButtonKt.VKIDButton(Q1.a(aVar, "vkid_button"), oneTapStyle5.getVkidButtonStyle(), vKIDButtonState, vKIDButtonTextProvider, onVKIDButtonClick, function12, z12, z13, scenario, u11, i33, 0);
                                            Function1<? super VKIDUser, Unit> function14 = function12;
                                            u11.o(-1074679632);
                                            if (z17) {
                                                AlternateAccountButtonKt.AdaptiveAlternateAccountButton(vKIDButtonState, oneTapStyle5.getAlternateAccountButtonStyle(), onAlternateButtonClick, z13, u11, ((i21 >> 12) & 896) | 6 | (i34 & 7168), 0);
                                            }
                                            u11.k();
                                            u11.o(-1074669457);
                                            if (oAuths.isEmpty()) {
                                                vKIDAuthUiParams4 = vKIDAuthUiParams3;
                                            } else {
                                                u0.E.a(u11, a0.f(aVar, 16));
                                                OAuthListWidgetStyle oAuthListWidgetStyle = oneTapStyle5.getOAuthListWidgetStyle();
                                                Set<? extends OneTapOAuth> set = oAuths;
                                                ArrayList arrayList = new ArrayList(C7714v.z(set, 10));
                                                Iterator<T> it = set.iterator();
                                                while (it.hasNext()) {
                                                    arrayList.add(((OneTapOAuth) it.next()).toOAuth());
                                                }
                                                Set Y02 = C7714v.Y0(arrayList);
                                                u11.o(-1074665636);
                                                boolean z21 = (i21 & 29360128) == 8388608;
                                                Object C13 = u11.C();
                                                if (z21 || C13 == InterfaceC3967k.a.a()) {
                                                    C13 = new C7601b(onAuth, 1);
                                                    u11.x(C13);
                                                }
                                                Function2 function2 = (Function2) C13;
                                                u11.k();
                                                u11.o(-1074657788);
                                                boolean z22 = (i21 & 1879048192) == 536870912;
                                                Object C14 = u11.C();
                                                if (z22 || C14 == InterfaceC3967k.a.a()) {
                                                    C14 = new Function2() { // from class: za.n
                                                        @Override // kotlin.jvm.functions.Function2
                                                        public final Object invoke(Object obj, Object obj2) {
                                                            Unit OneTap$lambda$42$lambda$41$lambda$40;
                                                            OneTap$lambda$42$lambda$41$lambda$40 = OneTapKt.OneTap$lambda$42$lambda$41$lambda$40(Function2.this, (OAuth) obj, (VKIDAuthFail) obj2);
                                                            return OneTap$lambda$42$lambda$41$lambda$40;
                                                        }
                                                    };
                                                    u11.x(C14);
                                                }
                                                u11.k();
                                                vKIDAuthUiParams4 = vKIDAuthUiParams3;
                                                OAuthListWidgetKt.OAuthListWidget(null, oAuthListWidgetStyle, function2, onAuthCode, (Function2) C14, Y02, vKIDAuthUiParams4, z14, u11, ((i21 >> 15) & 7168) | (VKIDAuthUiParams.$stable << 18) | ((i34 << 18) & 3670016) | (i32 & 29360128), 1);
                                            }
                                            u11.k();
                                            u11.f();
                                            oneTapStyle4 = oneTapStyle5;
                                            z18 = z17;
                                            vKIDAuthUiParams5 = vKIDAuthUiParams4;
                                            u11 = u11;
                                            function13 = function14;
                                            eVar2 = eVar4;
                                        }
                                        m02 = u11.m0();
                                        if (m02 != null) {
                                            final androidx.compose.ui.e eVar5 = eVar2;
                                            m02.G(new Function2() { // from class: za.o
                                                @Override // kotlin.jvm.functions.Function2
                                                public final Object invoke(Object obj, Object obj2) {
                                                    Unit OneTap$lambda$43;
                                                    int intValue = ((Integer) obj2).intValue();
                                                    int i35 = i12;
                                                    int i36 = i13;
                                                    OneTap$lambda$43 = OneTapKt.OneTap$lambda$43(androidx.compose.ui.e.this, oneTapStyle4, oAuths, z18, vKIDButtonTextProvider, onVKIDButtonClick, onAlternateButtonClick, onAuth, onAuthCode, onFail, vKIDAuthUiParams5, function13, z12, z13, z14, scenario, i11, i35, i36, (InterfaceC3967k) obj, intValue);
                                                    return OneTap$lambda$43;
                                                }
                                            });
                                            return;
                                        }
                                        return;
                                    }
                                    if ((i13 & 32768) != 0) {
                                    }
                                    if ((i15 & 306783379) != 306783378) {
                                    }
                                    u11.Q0();
                                    if ((i11 & 1) != 0) {
                                    }
                                    if (i26 != 0) {
                                    }
                                    if ((i13 & 2) != 0) {
                                    }
                                    if (i28 != 0) {
                                    }
                                    if ((i13 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                                    }
                                    if (i18 != 0) {
                                    }
                                    vKIDAuthUiParams3 = vKIDAuthUiParams2;
                                    i19 = i16;
                                    i21 = i15;
                                    eVar3 = eVar2;
                                    oneTapStyle3 = oneTapStyle2;
                                    z16 = z15;
                                    u11.j0();
                                    u11.o(1495489112);
                                    C11 = u11.C();
                                    if (C11 == InterfaceC3967k.a.a()) {
                                    }
                                    VKIDButtonState vKIDButtonState2 = (VKIDButtonState) C11;
                                    u11.k();
                                    OneTapStyle oneTapStyle52 = oneTapStyle3;
                                    C5194q a112 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
                                    I11 = u11.I();
                                    A0 d112 = u11.d();
                                    z17 = z16;
                                    androidx.compose.ui.e f72 = androidx.compose.ui.c.f(u11, eVar3);
                                    androidx.compose.ui.e eVar42 = eVar3;
                                    Function0 a122 = Fr.g.a(InterfaceC2801g.f5440U, u11);
                                    if (u11.t()) {
                                    }
                                    Function2 g102 = K00.b.g(u11, a112, u11, d112);
                                    if (!u11.t()) {
                                    }
                                    Ep.a.d(I11, u11, I11, g102);
                                    F1.b(u11, f72, InterfaceC2801g.a.f());
                                    e.a aVar2 = androidx.compose.ui.e.f40358c0;
                                    int i292 = i21 >> 3;
                                    int i312 = i19 << 12;
                                    int i322 = i19 << 9;
                                    int i332 = (i322 & 234881024) | (i292 & 57344) | (i292 & 7168) | 390 | (458752 & i312) | (3670016 & i312) | (i312 & 29360128);
                                    int i342 = i19;
                                    VKIDButtonKt.VKIDButton(Q1.a(aVar2, "vkid_button"), oneTapStyle52.getVkidButtonStyle(), vKIDButtonState2, vKIDButtonTextProvider, onVKIDButtonClick, function12, z12, z13, scenario, u11, i332, 0);
                                    Function1<? super VKIDUser, Unit> function142 = function12;
                                    u11.o(-1074679632);
                                    if (z17) {
                                    }
                                    u11.k();
                                    u11.o(-1074669457);
                                    if (oAuths.isEmpty()) {
                                    }
                                    u11.k();
                                    u11.f();
                                    oneTapStyle4 = oneTapStyle52;
                                    z18 = z17;
                                    vKIDAuthUiParams5 = vKIDAuthUiParams4;
                                    u11 = u11;
                                    function13 = function142;
                                    eVar2 = eVar42;
                                    m02 = u11.m0();
                                    if (m02 != null) {
                                    }
                                }
                                if ((i13 & 16384) == 0) {
                                }
                                if ((i13 & 32768) != 0) {
                                }
                                if ((i15 & 306783379) != 306783378) {
                                }
                                u11.Q0();
                                if ((i11 & 1) != 0) {
                                }
                                if (i26 != 0) {
                                }
                                if ((i13 & 2) != 0) {
                                }
                                if (i28 != 0) {
                                }
                                if ((i13 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                                }
                                if (i18 != 0) {
                                }
                                vKIDAuthUiParams3 = vKIDAuthUiParams2;
                                i19 = i16;
                                i21 = i15;
                                eVar3 = eVar2;
                                oneTapStyle3 = oneTapStyle2;
                                z16 = z15;
                                u11.j0();
                                u11.o(1495489112);
                                C11 = u11.C();
                                if (C11 == InterfaceC3967k.a.a()) {
                                }
                                VKIDButtonState vKIDButtonState22 = (VKIDButtonState) C11;
                                u11.k();
                                OneTapStyle oneTapStyle522 = oneTapStyle3;
                                C5194q a1122 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
                                I11 = u11.I();
                                A0 d1122 = u11.d();
                                z17 = z16;
                                androidx.compose.ui.e f722 = androidx.compose.ui.c.f(u11, eVar3);
                                androidx.compose.ui.e eVar422 = eVar3;
                                Function0 a1222 = Fr.g.a(InterfaceC2801g.f5440U, u11);
                                if (u11.t()) {
                                }
                                Function2 g1022 = K00.b.g(u11, a1122, u11, d1122);
                                if (!u11.t()) {
                                }
                                Ep.a.d(I11, u11, I11, g1022);
                                F1.b(u11, f722, InterfaceC2801g.a.f());
                                e.a aVar22 = androidx.compose.ui.e.f40358c0;
                                int i2922 = i21 >> 3;
                                int i3122 = i19 << 12;
                                int i3222 = i19 << 9;
                                int i3322 = (i3222 & 234881024) | (i2922 & 57344) | (i2922 & 7168) | 390 | (458752 & i3122) | (3670016 & i3122) | (i3122 & 29360128);
                                int i3422 = i19;
                                VKIDButtonKt.VKIDButton(Q1.a(aVar22, "vkid_button"), oneTapStyle522.getVkidButtonStyle(), vKIDButtonState22, vKIDButtonTextProvider, onVKIDButtonClick, function12, z12, z13, scenario, u11, i3322, 0);
                                Function1<? super VKIDUser, Unit> function1422 = function12;
                                u11.o(-1074679632);
                                if (z17) {
                                }
                                u11.k();
                                u11.o(-1074669457);
                                if (oAuths.isEmpty()) {
                                }
                                u11.k();
                                u11.f();
                                oneTapStyle4 = oneTapStyle522;
                                z18 = z17;
                                vKIDAuthUiParams5 = vKIDAuthUiParams4;
                                u11 = u11;
                                function13 = function1422;
                                eVar2 = eVar422;
                                m02 = u11.m0();
                                if (m02 != null) {
                                }
                            }
                            if ((i13 & 8192) != 0) {
                            }
                            if ((i13 & 16384) == 0) {
                            }
                            if ((i13 & 32768) != 0) {
                            }
                            if ((i15 & 306783379) != 306783378) {
                            }
                            u11.Q0();
                            if ((i11 & 1) != 0) {
                            }
                            if (i26 != 0) {
                            }
                            if ((i13 & 2) != 0) {
                            }
                            if (i28 != 0) {
                            }
                            if ((i13 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                            }
                            if (i18 != 0) {
                            }
                            vKIDAuthUiParams3 = vKIDAuthUiParams2;
                            i19 = i16;
                            i21 = i15;
                            eVar3 = eVar2;
                            oneTapStyle3 = oneTapStyle2;
                            z16 = z15;
                            u11.j0();
                            u11.o(1495489112);
                            C11 = u11.C();
                            if (C11 == InterfaceC3967k.a.a()) {
                            }
                            VKIDButtonState vKIDButtonState222 = (VKIDButtonState) C11;
                            u11.k();
                            OneTapStyle oneTapStyle5222 = oneTapStyle3;
                            C5194q a11222 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
                            I11 = u11.I();
                            A0 d11222 = u11.d();
                            z17 = z16;
                            androidx.compose.ui.e f7222 = androidx.compose.ui.c.f(u11, eVar3);
                            androidx.compose.ui.e eVar4222 = eVar3;
                            Function0 a12222 = Fr.g.a(InterfaceC2801g.f5440U, u11);
                            if (u11.t()) {
                            }
                            Function2 g10222 = K00.b.g(u11, a11222, u11, d11222);
                            if (!u11.t()) {
                            }
                            Ep.a.d(I11, u11, I11, g10222);
                            F1.b(u11, f7222, InterfaceC2801g.a.f());
                            e.a aVar222 = androidx.compose.ui.e.f40358c0;
                            int i29222 = i21 >> 3;
                            int i31222 = i19 << 12;
                            int i32222 = i19 << 9;
                            int i33222 = (i32222 & 234881024) | (i29222 & 57344) | (i29222 & 7168) | 390 | (458752 & i31222) | (3670016 & i31222) | (i31222 & 29360128);
                            int i34222 = i19;
                            VKIDButtonKt.VKIDButton(Q1.a(aVar222, "vkid_button"), oneTapStyle5222.getVkidButtonStyle(), vKIDButtonState222, vKIDButtonTextProvider, onVKIDButtonClick, function12, z12, z13, scenario, u11, i33222, 0);
                            Function1<? super VKIDUser, Unit> function14222 = function12;
                            u11.o(-1074679632);
                            if (z17) {
                            }
                            u11.k();
                            u11.o(-1074669457);
                            if (oAuths.isEmpty()) {
                            }
                            u11.k();
                            u11.f();
                            oneTapStyle4 = oneTapStyle5222;
                            z18 = z17;
                            vKIDAuthUiParams5 = vKIDAuthUiParams4;
                            u11 = u11;
                            function13 = function14222;
                            eVar2 = eVar4222;
                            m02 = u11.m0();
                            if (m02 != null) {
                            }
                        }
                        i18 = i17;
                        if ((i13 & 4096) == 0) {
                        }
                        if ((i13 & 8192) != 0) {
                        }
                        if ((i13 & 16384) == 0) {
                        }
                        if ((i13 & 32768) != 0) {
                        }
                        if ((i15 & 306783379) != 306783378) {
                        }
                        u11.Q0();
                        if ((i11 & 1) != 0) {
                        }
                        if (i26 != 0) {
                        }
                        if ((i13 & 2) != 0) {
                        }
                        if (i28 != 0) {
                        }
                        if ((i13 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                        }
                        if (i18 != 0) {
                        }
                        vKIDAuthUiParams3 = vKIDAuthUiParams2;
                        i19 = i16;
                        i21 = i15;
                        eVar3 = eVar2;
                        oneTapStyle3 = oneTapStyle2;
                        z16 = z15;
                        u11.j0();
                        u11.o(1495489112);
                        C11 = u11.C();
                        if (C11 == InterfaceC3967k.a.a()) {
                        }
                        VKIDButtonState vKIDButtonState2222 = (VKIDButtonState) C11;
                        u11.k();
                        OneTapStyle oneTapStyle52222 = oneTapStyle3;
                        C5194q a112222 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
                        I11 = u11.I();
                        A0 d112222 = u11.d();
                        z17 = z16;
                        androidx.compose.ui.e f72222 = androidx.compose.ui.c.f(u11, eVar3);
                        androidx.compose.ui.e eVar42222 = eVar3;
                        Function0 a122222 = Fr.g.a(InterfaceC2801g.f5440U, u11);
                        if (u11.t()) {
                        }
                        Function2 g102222 = K00.b.g(u11, a112222, u11, d112222);
                        if (!u11.t()) {
                        }
                        Ep.a.d(I11, u11, I11, g102222);
                        F1.b(u11, f72222, InterfaceC2801g.a.f());
                        e.a aVar2222 = androidx.compose.ui.e.f40358c0;
                        int i292222 = i21 >> 3;
                        int i312222 = i19 << 12;
                        int i322222 = i19 << 9;
                        int i332222 = (i322222 & 234881024) | (i292222 & 57344) | (i292222 & 7168) | 390 | (458752 & i312222) | (3670016 & i312222) | (i312222 & 29360128);
                        int i342222 = i19;
                        VKIDButtonKt.VKIDButton(Q1.a(aVar2222, "vkid_button"), oneTapStyle52222.getVkidButtonStyle(), vKIDButtonState2222, vKIDButtonTextProvider, onVKIDButtonClick, function12, z12, z13, scenario, u11, i332222, 0);
                        Function1<? super VKIDUser, Unit> function142222 = function12;
                        u11.o(-1074679632);
                        if (z17) {
                        }
                        u11.k();
                        u11.o(-1074669457);
                        if (oAuths.isEmpty()) {
                        }
                        u11.k();
                        u11.f();
                        oneTapStyle4 = oneTapStyle52222;
                        z18 = z17;
                        vKIDAuthUiParams5 = vKIDAuthUiParams4;
                        u11 = u11;
                        function13 = function142222;
                        eVar2 = eVar42222;
                        m02 = u11.m0();
                        if (m02 != null) {
                        }
                    }
                    i15 |= i23;
                    if ((i12 & 6) == 0) {
                    }
                    i17 = i13 & 2048;
                    if (i17 != 0) {
                    }
                    i18 = i17;
                    if ((i13 & 4096) == 0) {
                    }
                    if ((i13 & 8192) != 0) {
                    }
                    if ((i13 & 16384) == 0) {
                    }
                    if ((i13 & 32768) != 0) {
                    }
                    if ((i15 & 306783379) != 306783378) {
                    }
                    u11.Q0();
                    if ((i11 & 1) != 0) {
                    }
                    if (i26 != 0) {
                    }
                    if ((i13 & 2) != 0) {
                    }
                    if (i28 != 0) {
                    }
                    if ((i13 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                    }
                    if (i18 != 0) {
                    }
                    vKIDAuthUiParams3 = vKIDAuthUiParams2;
                    i19 = i16;
                    i21 = i15;
                    eVar3 = eVar2;
                    oneTapStyle3 = oneTapStyle2;
                    z16 = z15;
                    u11.j0();
                    u11.o(1495489112);
                    C11 = u11.C();
                    if (C11 == InterfaceC3967k.a.a()) {
                    }
                    VKIDButtonState vKIDButtonState22222 = (VKIDButtonState) C11;
                    u11.k();
                    OneTapStyle oneTapStyle522222 = oneTapStyle3;
                    C5194q a1122222 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
                    I11 = u11.I();
                    A0 d1122222 = u11.d();
                    z17 = z16;
                    androidx.compose.ui.e f722222 = androidx.compose.ui.c.f(u11, eVar3);
                    androidx.compose.ui.e eVar422222 = eVar3;
                    Function0 a1222222 = Fr.g.a(InterfaceC2801g.f5440U, u11);
                    if (u11.t()) {
                    }
                    Function2 g1022222 = K00.b.g(u11, a1122222, u11, d1122222);
                    if (!u11.t()) {
                    }
                    Ep.a.d(I11, u11, I11, g1022222);
                    F1.b(u11, f722222, InterfaceC2801g.a.f());
                    e.a aVar22222 = androidx.compose.ui.e.f40358c0;
                    int i2922222 = i21 >> 3;
                    int i3122222 = i19 << 12;
                    int i3222222 = i19 << 9;
                    int i3322222 = (i3222222 & 234881024) | (i2922222 & 57344) | (i2922222 & 7168) | 390 | (458752 & i3122222) | (3670016 & i3122222) | (i3122222 & 29360128);
                    int i3422222 = i19;
                    VKIDButtonKt.VKIDButton(Q1.a(aVar22222, "vkid_button"), oneTapStyle522222.getVkidButtonStyle(), vKIDButtonState22222, vKIDButtonTextProvider, onVKIDButtonClick, function12, z12, z13, scenario, u11, i3322222, 0);
                    Function1<? super VKIDUser, Unit> function1422222 = function12;
                    u11.o(-1074679632);
                    if (z17) {
                    }
                    u11.k();
                    u11.o(-1074669457);
                    if (oAuths.isEmpty()) {
                    }
                    u11.k();
                    u11.f();
                    oneTapStyle4 = oneTapStyle522222;
                    z18 = z17;
                    vKIDAuthUiParams5 = vKIDAuthUiParams4;
                    u11 = u11;
                    function13 = function1422222;
                    eVar2 = eVar422222;
                    m02 = u11.m0();
                    if (m02 != null) {
                    }
                }
                i15 |= i24;
                if ((i13 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                }
                i15 |= i23;
                if ((i12 & 6) == 0) {
                }
                i17 = i13 & 2048;
                if (i17 != 0) {
                }
                i18 = i17;
                if ((i13 & 4096) == 0) {
                }
                if ((i13 & 8192) != 0) {
                }
                if ((i13 & 16384) == 0) {
                }
                if ((i13 & 32768) != 0) {
                }
                if ((i15 & 306783379) != 306783378) {
                }
                u11.Q0();
                if ((i11 & 1) != 0) {
                }
                if (i26 != 0) {
                }
                if ((i13 & 2) != 0) {
                }
                if (i28 != 0) {
                }
                if ((i13 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                }
                if (i18 != 0) {
                }
                vKIDAuthUiParams3 = vKIDAuthUiParams2;
                i19 = i16;
                i21 = i15;
                eVar3 = eVar2;
                oneTapStyle3 = oneTapStyle2;
                z16 = z15;
                u11.j0();
                u11.o(1495489112);
                C11 = u11.C();
                if (C11 == InterfaceC3967k.a.a()) {
                }
                VKIDButtonState vKIDButtonState222222 = (VKIDButtonState) C11;
                u11.k();
                OneTapStyle oneTapStyle5222222 = oneTapStyle3;
                C5194q a11222222 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
                I11 = u11.I();
                A0 d11222222 = u11.d();
                z17 = z16;
                androidx.compose.ui.e f7222222 = androidx.compose.ui.c.f(u11, eVar3);
                androidx.compose.ui.e eVar4222222 = eVar3;
                Function0 a12222222 = Fr.g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                }
                Function2 g10222222 = K00.b.g(u11, a11222222, u11, d11222222);
                if (!u11.t()) {
                }
                Ep.a.d(I11, u11, I11, g10222222);
                F1.b(u11, f7222222, InterfaceC2801g.a.f());
                e.a aVar222222 = androidx.compose.ui.e.f40358c0;
                int i29222222 = i21 >> 3;
                int i31222222 = i19 << 12;
                int i32222222 = i19 << 9;
                int i33222222 = (i32222222 & 234881024) | (i29222222 & 57344) | (i29222222 & 7168) | 390 | (458752 & i31222222) | (3670016 & i31222222) | (i31222222 & 29360128);
                int i34222222 = i19;
                VKIDButtonKt.VKIDButton(Q1.a(aVar222222, "vkid_button"), oneTapStyle5222222.getVkidButtonStyle(), vKIDButtonState222222, vKIDButtonTextProvider, onVKIDButtonClick, function12, z12, z13, scenario, u11, i33222222, 0);
                Function1<? super VKIDUser, Unit> function14222222 = function12;
                u11.o(-1074679632);
                if (z17) {
                }
                u11.k();
                u11.o(-1074669457);
                if (oAuths.isEmpty()) {
                }
                u11.k();
                u11.f();
                oneTapStyle4 = oneTapStyle5222222;
                z18 = z17;
                vKIDAuthUiParams5 = vKIDAuthUiParams4;
                u11 = u11;
                function13 = function14222222;
                eVar2 = eVar4222222;
                m02 = u11.m0();
                if (m02 != null) {
                }
            }
            i15 |= i25;
            if ((i13 & 256) == 0) {
            }
            i15 |= i24;
            if ((i13 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            }
            i15 |= i23;
            if ((i12 & 6) == 0) {
            }
            i17 = i13 & 2048;
            if (i17 != 0) {
            }
            i18 = i17;
            if ((i13 & 4096) == 0) {
            }
            if ((i13 & 8192) != 0) {
            }
            if ((i13 & 16384) == 0) {
            }
            if ((i13 & 32768) != 0) {
            }
            if ((i15 & 306783379) != 306783378) {
            }
            u11.Q0();
            if ((i11 & 1) != 0) {
            }
            if (i26 != 0) {
            }
            if ((i13 & 2) != 0) {
            }
            if (i28 != 0) {
            }
            if ((i13 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            }
            if (i18 != 0) {
            }
            vKIDAuthUiParams3 = vKIDAuthUiParams2;
            i19 = i16;
            i21 = i15;
            eVar3 = eVar2;
            oneTapStyle3 = oneTapStyle2;
            z16 = z15;
            u11.j0();
            u11.o(1495489112);
            C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
            }
            VKIDButtonState vKIDButtonState2222222 = (VKIDButtonState) C11;
            u11.k();
            OneTapStyle oneTapStyle52222222 = oneTapStyle3;
            C5194q a112222222 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
            I11 = u11.I();
            A0 d112222222 = u11.d();
            z17 = z16;
            androidx.compose.ui.e f72222222 = androidx.compose.ui.c.f(u11, eVar3);
            androidx.compose.ui.e eVar42222222 = eVar3;
            Function0 a122222222 = Fr.g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
            }
            Function2 g102222222 = K00.b.g(u11, a112222222, u11, d112222222);
            if (!u11.t()) {
            }
            Ep.a.d(I11, u11, I11, g102222222);
            F1.b(u11, f72222222, InterfaceC2801g.a.f());
            e.a aVar2222222 = androidx.compose.ui.e.f40358c0;
            int i292222222 = i21 >> 3;
            int i312222222 = i19 << 12;
            int i322222222 = i19 << 9;
            int i332222222 = (i322222222 & 234881024) | (i292222222 & 57344) | (i292222222 & 7168) | 390 | (458752 & i312222222) | (3670016 & i312222222) | (i312222222 & 29360128);
            int i342222222 = i19;
            VKIDButtonKt.VKIDButton(Q1.a(aVar2222222, "vkid_button"), oneTapStyle52222222.getVkidButtonStyle(), vKIDButtonState2222222, vKIDButtonTextProvider, onVKIDButtonClick, function12, z12, z13, scenario, u11, i332222222, 0);
            Function1<? super VKIDUser, Unit> function142222222 = function12;
            u11.o(-1074679632);
            if (z17) {
            }
            u11.k();
            u11.o(-1074669457);
            if (oAuths.isEmpty()) {
            }
            u11.k();
            u11.f();
            oneTapStyle4 = oneTapStyle52222222;
            z18 = z17;
            vKIDAuthUiParams5 = vKIDAuthUiParams4;
            u11 = u11;
            function13 = function142222222;
            eVar2 = eVar42222222;
            m02 = u11.m0();
            if (m02 != null) {
            }
        }
        if ((i13 & 16) == 0) {
        }
        if ((i13 & 32) == 0) {
        }
        if ((i13 & 64) == 0) {
        }
        if ((i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
        }
        i15 |= i25;
        if ((i13 & 256) == 0) {
        }
        i15 |= i24;
        if ((i13 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
        }
        i15 |= i23;
        if ((i12 & 6) == 0) {
        }
        i17 = i13 & 2048;
        if (i17 != 0) {
        }
        i18 = i17;
        if ((i13 & 4096) == 0) {
        }
        if ((i13 & 8192) != 0) {
        }
        if ((i13 & 16384) == 0) {
        }
        if ((i13 & 32768) != 0) {
        }
        if ((i15 & 306783379) != 306783378) {
        }
        u11.Q0();
        if ((i11 & 1) != 0) {
        }
        if (i26 != 0) {
        }
        if ((i13 & 2) != 0) {
        }
        if (i28 != 0) {
        }
        if ((i13 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
        }
        if (i18 != 0) {
        }
        vKIDAuthUiParams3 = vKIDAuthUiParams2;
        i19 = i16;
        i21 = i15;
        eVar3 = eVar2;
        oneTapStyle3 = oneTapStyle2;
        z16 = z15;
        u11.j0();
        u11.o(1495489112);
        C11 = u11.C();
        if (C11 == InterfaceC3967k.a.a()) {
        }
        VKIDButtonState vKIDButtonState22222222 = (VKIDButtonState) C11;
        u11.k();
        OneTapStyle oneTapStyle522222222 = oneTapStyle3;
        C5194q a1122222222 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
        I11 = u11.I();
        A0 d1122222222 = u11.d();
        z17 = z16;
        androidx.compose.ui.e f722222222 = androidx.compose.ui.c.f(u11, eVar3);
        androidx.compose.ui.e eVar422222222 = eVar3;
        Function0 a1222222222 = Fr.g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 g1022222222 = K00.b.g(u11, a1122222222, u11, d1122222222);
        if (!u11.t()) {
        }
        Ep.a.d(I11, u11, I11, g1022222222);
        F1.b(u11, f722222222, InterfaceC2801g.a.f());
        e.a aVar22222222 = androidx.compose.ui.e.f40358c0;
        int i2922222222 = i21 >> 3;
        int i3122222222 = i19 << 12;
        int i3222222222 = i19 << 9;
        int i3322222222 = (i3222222222 & 234881024) | (i2922222222 & 57344) | (i2922222222 & 7168) | 390 | (458752 & i3122222222) | (3670016 & i3122222222) | (i3122222222 & 29360128);
        int i3422222222 = i19;
        VKIDButtonKt.VKIDButton(Q1.a(aVar22222222, "vkid_button"), oneTapStyle522222222.getVkidButtonStyle(), vKIDButtonState22222222, vKIDButtonTextProvider, onVKIDButtonClick, function12, z12, z13, scenario, u11, i3322222222, 0);
        Function1<? super VKIDUser, Unit> function1422222222 = function12;
        u11.o(-1074679632);
        if (z17) {
        }
        u11.k();
        u11.o(-1074669457);
        if (oAuths.isEmpty()) {
        }
        u11.k();
        u11.f();
        oneTapStyle4 = oneTapStyle522222222;
        z18 = z17;
        vKIDAuthUiParams5 = vKIDAuthUiParams4;
        u11 = u11;
        function13 = function1422222222;
        eVar2 = eVar422222222;
        m02 = u11.m0();
        if (m02 != null) {
        }
    }
}
