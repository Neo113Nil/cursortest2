package com.vk.auth.ui;

import android.content.Context;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import com.vk.auth.oauth.VkOAuthService;
import com.vk.auth.oauth.di.OAuthComponent;
import com.vk.auth.ui.VkExternalServiceLoginButton;
import com.vkontakte.android.R;
import kotlin.Lazy;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.api.core.ApiUris;
import xsna.asp;
import xsna.bpn0;
import xsna.fpf0;
import xsna.icn0;
import xsna.k7m;
import xsna.m7m;
import xsna.pnk;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkOAuthServiceInfo.kt */
/* loaded from: classes15.dex */
public class VkOAuthServiceInfo {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VkOAuthServiceInfo[] $VALUES;
    public static final VkOAuthServiceInfo ALFA;
    public static final b Companion;
    public static final VkOAuthServiceInfo ESIA;
    public static final VkOAuthServiceInfo GOOGLE;
    public static final VkOAuthServiceInfo MAILRU;
    public static final VkOAuthServiceInfo OK;
    public static final VkOAuthServiceInfo SBER;
    public static final VkOAuthServiceInfo TINKOFF;
    public static final VkOAuthServiceInfo VK;
    public static final VkOAuthServiceInfo VK_BIG;
    public static final VkOAuthServiceInfo YANDEX;
    private final String alias;
    private final int appIcon24;
    private final Lazy customViewProvider$delegate;
    private final int icon28;
    private final int icon28Tint;
    private final int icon28TintAttr;
    private final VkExternalServiceLoginButton.VkIconGravity iconGravity;
    private final Integer loginText;
    private final VkOAuthService oAuthService;
    private final int serviceName;
    private final int silentBorderColor;

    /* compiled from: VkOAuthServiceInfo.kt */
    public static final class a extends VkOAuthServiceInfo {
    }

    /* compiled from: VkOAuthServiceInfo.kt */
    public static final class b {
    }

    /* compiled from: VkOAuthServiceInfo.kt */
    public static final class c extends VkOAuthServiceInfo {
    }

    static {
        VkOAuthServiceInfo vkOAuthServiceInfo = new VkOAuthServiceInfo("GOOGLE", 0, VkOAuthService.GOOGLE, AndroidStaticDeviceInfoDataSource.STORE_GOOGLE, R.string.vk_connect_google, null, R.drawable.vk_icon_logo_google_filled_28, null, 1000);
        GOOGLE = vkOAuthServiceInfo;
        VkOAuthServiceInfo vkOAuthServiceInfo2 = new VkOAuthServiceInfo("OK", 1, VkOAuthService.OK, ApiUris.SCHEME_OK, R.string.vk_connect_odnoklassniki, null, R.drawable.vk_icon_logo_ok_color_28, null, 1000);
        OK = vkOAuthServiceInfo2;
        VkOAuthService vkOAuthService = VkOAuthService.VK;
        VkOAuthServiceInfo vkOAuthServiceInfo3 = new VkOAuthServiceInfo("VK", 2, vkOAuthService, "vk", R.string.vk_auth_vk_id, null, R.drawable.vk_icon_logo_vk_color_28, null, 1000);
        VK = vkOAuthServiceInfo3;
        VkOAuthServiceInfo vkOAuthServiceInfo4 = new VkOAuthServiceInfo("VK_BIG", 3, vkOAuthService, "vk_big", R.string.vk_auth_vk_id, null, R.drawable.vk_icon_logo_vkid_20, VkExternalServiceLoginButton.VkIconGravity.END, ApiInvocationException.ErrorCodes.GROUP_RESTRICTION);
        VK_BIG = vkOAuthServiceInfo4;
        c cVar = new c("MAILRU", 4, VkOAuthService.MAILRU, "mailru", R.string.vk_connect_mailru_service_name, Integer.valueOf(R.string.vk_connect_mailru), R.drawable.vk_icon_logo_mail_ru_28, null, 864);
        MAILRU = cVar;
        VkOAuthServiceInfo vkOAuthServiceInfo5 = new VkOAuthServiceInfo("ESIA", 5, VkOAuthService.ESIA, "esia", R.string.vk_connect_esia_service_name, Integer.valueOf(R.string.vk_connect_esia_login), R.drawable.vk_icon_logo_gosuslugi_color_28, null, 992);
        ESIA = vkOAuthServiceInfo5;
        VkOAuthService vkOAuthService2 = VkOAuthService.SBER;
        Integer valueOf = Integer.valueOf(R.string.vk_connect_sberid);
        VkExternalServiceLoginButton.VkIconGravity vkIconGravity = VkExternalServiceLoginButton.VkIconGravity.CENTER;
        VkOAuthServiceInfo vkOAuthServiceInfo6 = new VkOAuthServiceInfo("SBER", 6, vkOAuthService2, "sber", R.string.vk_connect_sberid_service_name, valueOf, R.drawable.vk_icon_logo_sber_x_color_28, vkIconGravity, 480);
        SBER = vkOAuthServiceInfo6;
        VkOAuthServiceInfo vkOAuthServiceInfo7 = new VkOAuthServiceInfo("YANDEX", 7, VkOAuthService.YANDEX, "yandex", R.string.vk_connect_yandex_id_service_name, Integer.valueOf(R.string.vk_connect_yandex_id), R.drawable.vk_icon_logo_yandex_color_circle_28, vkIconGravity, 480);
        YANDEX = vkOAuthServiceInfo7;
        VkOAuthServiceInfo vkOAuthServiceInfo8 = new VkOAuthServiceInfo("TINKOFF", 8, VkOAuthService.TINKOFF, "tinkoff", R.string.vk_connect_tinkoff, null, R.drawable.vk_icon_logo_tinkoff_id_color_28, null, 1000);
        TINKOFF = vkOAuthServiceInfo8;
        a aVar = new a("ALFA", 9, VkOAuthService.ALFA, "alfa", R.string.vk_connect_alfa_id_service_name, Integer.valueOf(R.string.vk_connect_alfa_id_login_text), R.drawable.vk_icon_logo_alfa_bank_color_28, null, 992);
        ALFA = aVar;
        VkOAuthServiceInfo[] vkOAuthServiceInfoArr = {vkOAuthServiceInfo, vkOAuthServiceInfo2, vkOAuthServiceInfo3, vkOAuthServiceInfo4, cVar, vkOAuthServiceInfo5, vkOAuthServiceInfo6, vkOAuthServiceInfo7, vkOAuthServiceInfo8, aVar};
        $VALUES = vkOAuthServiceInfoArr;
        $ENTRIES = new asp(vkOAuthServiceInfoArr);
        Companion = new b();
    }

    public VkOAuthServiceInfo() {
        throw null;
    }

    public VkOAuthServiceInfo(String str, int i, VkOAuthService vkOAuthService, String str2, int i2, Integer num, int i3, VkExternalServiceLoginButton.VkIconGravity vkIconGravity, int i4) {
        num = (i4 & 8) != 0 ? null : num;
        int i5 = (i4 & 32) != 0 ? 0 : R.color.vk_white;
        int i6 = (i4 & 128) != 0 ? 0 : R.drawable.vk_app_icon_mail_24;
        vkIconGravity = (i4 & 512) != 0 ? VkExternalServiceLoginButton.VkIconGravity.START : vkIconGravity;
        this.oAuthService = vkOAuthService;
        this.alias = str2;
        this.serviceName = i2;
        this.loginText = num;
        this.icon28 = i3;
        this.icon28Tint = i5;
        this.icon28TintAttr = 0;
        this.appIcon24 = i6;
        this.silentBorderColor = 0;
        this.iconGravity = vkIconGravity;
        this.customViewProvider$delegate = new bpn0(new icn0(this, 19));
    }

    public static pnk a(VkOAuthServiceInfo vkOAuthServiceInfo) {
        return ((OAuthComponent) ((k7m) m7m.f(new com.vk.auth.ui.a())).a(fpf0.a(OAuthComponent.class))).B8().b(vkOAuthServiceInfo.oAuthService);
    }

    public static VkOAuthServiceInfo valueOf(String str) {
        return (VkOAuthServiceInfo) Enum.valueOf(VkOAuthServiceInfo.class, str);
    }

    public static VkOAuthServiceInfo[] values() {
        return (VkOAuthServiceInfo[]) $VALUES.clone();
    }

    public final String h() {
        return this.alias;
    }

    public final String i(Context context) {
        return context.getString(this.serviceName);
    }

    public final VkOAuthService j() {
        return this.oAuthService;
    }
}
