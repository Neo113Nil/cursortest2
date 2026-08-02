package com.vk.superapp.verification.account;

import com.vk.auth.oauth.VkOAuthService;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.stat.sak.scheme.SchemeStatSak$NavigationFieldItem;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeVkConnectNavigationItem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.c0h0;
import xsna.j5g;
import xsna.par0;

/* compiled from: VkVerificationAccountTracker.kt */
/* loaded from: classes6.dex */
public final class e {
    public final boolean a;
    public final String b;
    public boolean c;

    /* compiled from: VkVerificationAccountTracker.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VkOAuthService.values().length];
            try {
                iArr[VkOAuthService.TINKOFF.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public e(boolean z, VkOAuthService vkOAuthService) {
        this.a = z;
        this.b = a.$EnumSwitchMapping$0[vkOAuthService.ordinal()] == 1 ? "tinkoff" : vkOAuthService.i();
    }

    public static void c(e eVar, SchemeStatSak$TypeVkConnectNavigationItem.EventType eventType, String str, SchemeStatSak$EventScreen schemeStatSak$EventScreen, SchemeStatSak$EventScreen schemeStatSak$EventScreen2, List list, int i) {
        SchemeStatSak$EventScreen schemeStatSak$EventScreen3 = (i & 16) != 0 ? null : schemeStatSak$EventScreen2;
        List list2 = (i & 32) == 0 ? list : null;
        eVar.getClass();
        if (list2 == null) {
            list2 = EmptyList.b;
        }
        ArrayList v0 = j5g.v0(new SchemeStatSak$NavigationFieldItem(SchemeStatSak$NavigationFieldItem.Name.VERIFICATION_OAUTH, eVar.b, null, 4, null), list2);
        par0.a.getClass();
        par0.a("<" + eventType + "> " + str + ' ' + schemeStatSak$EventScreen + ' ' + ((String) null) + ' ' + schemeStatSak$EventScreen3 + ' ' + v0);
        new c0h0(schemeStatSak$EventScreen, new SchemeStatSak$TypeVkConnectNavigationItem(eventType, null, null, str, null, schemeStatSak$EventScreen, v0, schemeStatSak$EventScreen3, 6, null)).q();
    }

    public final String a() {
        return this.a ? "ma_account_verification" : "sferum_account_verification";
    }

    public final void b() {
        c(this, SchemeStatSak$TypeVkConnectNavigationItem.EventType.GO, a(), SchemeStatSak$EventScreen.NOWHERE, null, Collections.singletonList(new SchemeStatSak$NavigationFieldItem(SchemeStatSak$NavigationFieldItem.Name.VERIFICATION_AWAY, "verification_connect_account", null, 4, null)), 20);
    }
}
