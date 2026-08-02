package com.vk.auth.ui.fastlogin;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.vk.auth.oauth.VkOAuthService;
import com.vk.auth.ui.VkOAuthServiceInfo;
import com.vkontakte.android.R;
import xsna.asp;
import xsna.e3m;
import xsna.m33;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkSecondaryAuthInfo.kt */
/* loaded from: classes15.dex */
public final class VkSecondaryAuthInfo {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VkSecondaryAuthInfo[] $VALUES;
    public static final a Companion;
    public static final VkSecondaryAuthInfo MAILRU;
    private final VkOAuthServiceInfo oAuthServiceInfo;
    private final int backgroundColor = R.color.vk_black;
    private final int foregroundColor = R.color.vk_white;
    private final int toolbarPicture = R.drawable.vk_ic_logo_vkid_composite;

    /* compiled from: VkSecondaryAuthInfo.kt */
    public static final class a {
    }

    static {
        VkSecondaryAuthInfo vkSecondaryAuthInfo = new VkSecondaryAuthInfo(VkOAuthServiceInfo.MAILRU);
        MAILRU = vkSecondaryAuthInfo;
        VkSecondaryAuthInfo[] vkSecondaryAuthInfoArr = {vkSecondaryAuthInfo};
        $VALUES = vkSecondaryAuthInfoArr;
        $ENTRIES = new asp(vkSecondaryAuthInfoArr);
        Companion = new a();
    }

    public VkSecondaryAuthInfo(VkOAuthServiceInfo vkOAuthServiceInfo) {
        this.oAuthServiceInfo = vkOAuthServiceInfo;
    }

    public static VkSecondaryAuthInfo valueOf(String str) {
        return (VkSecondaryAuthInfo) Enum.valueOf(VkSecondaryAuthInfo.class, str);
    }

    public static VkSecondaryAuthInfo[] values() {
        return (VkSecondaryAuthInfo[]) $VALUES.clone();
    }

    public final VkOAuthService h() {
        return this.oAuthServiceInfo.j();
    }

    public final Drawable i(Context context) {
        int i = this.toolbarPicture;
        e3m.a aVar = e3m.a;
        Drawable a2 = m33.a(i, context);
        if (a2 == null) {
            return null;
        }
        a2.mutate();
        a2.setTint(e3m.f(R.attr.vk_ui_vkontakte_color_placeholder_icon_foreground_secondary, context));
        return a2;
    }
}
