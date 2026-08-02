package com.vk.id.internal.analytics;

import Sc.o;
import com.vk.id.OAuth;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002H\u0000¨\u0006\u0003"}, d2 = {"toAnalyticsParam", "", "Lcom/vk/id/OAuth;", "vkid_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CustomAuthAnalyticsKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OAuth.values().length];
            try {
                iArr[OAuth.VK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OAuth.MAIL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OAuth.OK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final String toAnalyticsParam(OAuth oAuth) {
        int i11 = oAuth == null ? -1 : WhenMappings.$EnumSwitchMapping$0[oAuth.ordinal()];
        if (i11 == -1) {
            return "";
        }
        if (i11 == 1) {
            return "vk";
        }
        if (i11 == 2) {
            return "mail_ru";
        }
        if (i11 == 3) {
            return "ok_ru";
        }
        throw new o();
    }
}
