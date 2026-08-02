package com.vk.stat.sak.scheme;

import com.android.billingclient.api.BillingClient;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import ru.ok.android.api.methods.users.changePassword.ChangePasswordApiRequestV1;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SchemeStatSak.kt */
/* loaded from: classes11.dex */
public final class SchemeStatSak$EcosystemNavigationItem {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SchemeStatSak$EcosystemNavigationItem[] $VALUES;

    @pmi0("avatar")
    public static final SchemeStatSak$EcosystemNavigationItem AVATAR;

    @pmi0("balance")
    public static final SchemeStatSak$EcosystemNavigationItem BALANCE;

    @pmi0("cloud")
    public static final SchemeStatSak$EcosystemNavigationItem CLOUD;

    @pmi0("email")
    public static final SchemeStatSak$EcosystemNavigationItem EMAIL;

    @pmi0("help")
    public static final SchemeStatSak$EcosystemNavigationItem HELP;

    @pmi0(ChangePasswordApiRequestV1.PARAM_NAME_LOGOUT_ALL)
    public static final SchemeStatSak$EcosystemNavigationItem LOGOUT;

    @pmi0("settings")
    public static final SchemeStatSak$EcosystemNavigationItem SETTINGS;

    @pmi0(BillingClient.FeatureType.SUBSCRIPTIONS)
    public static final SchemeStatSak$EcosystemNavigationItem SUBSCRIPTIONS;

    @pmi0("switcher")
    public static final SchemeStatSak$EcosystemNavigationItem SWITCHER;

    @pmi0("theme")
    public static final SchemeStatSak$EcosystemNavigationItem THEME;

    @pmi0("vkid_lk")
    public static final SchemeStatSak$EcosystemNavigationItem VKID_LK;

    static {
        SchemeStatSak$EcosystemNavigationItem schemeStatSak$EcosystemNavigationItem = new SchemeStatSak$EcosystemNavigationItem(CommonConstant.RETKEY.EMAIL, 0);
        EMAIL = schemeStatSak$EcosystemNavigationItem;
        SchemeStatSak$EcosystemNavigationItem schemeStatSak$EcosystemNavigationItem2 = new SchemeStatSak$EcosystemNavigationItem("CLOUD", 1);
        CLOUD = schemeStatSak$EcosystemNavigationItem2;
        SchemeStatSak$EcosystemNavigationItem schemeStatSak$EcosystemNavigationItem3 = new SchemeStatSak$EcosystemNavigationItem("AVATAR", 2);
        AVATAR = schemeStatSak$EcosystemNavigationItem3;
        SchemeStatSak$EcosystemNavigationItem schemeStatSak$EcosystemNavigationItem4 = new SchemeStatSak$EcosystemNavigationItem("VKID_LK", 3);
        VKID_LK = schemeStatSak$EcosystemNavigationItem4;
        SchemeStatSak$EcosystemNavigationItem schemeStatSak$EcosystemNavigationItem5 = new SchemeStatSak$EcosystemNavigationItem("SUBSCRIPTIONS", 4);
        SUBSCRIPTIONS = schemeStatSak$EcosystemNavigationItem5;
        SchemeStatSak$EcosystemNavigationItem schemeStatSak$EcosystemNavigationItem6 = new SchemeStatSak$EcosystemNavigationItem("BALANCE", 5);
        BALANCE = schemeStatSak$EcosystemNavigationItem6;
        SchemeStatSak$EcosystemNavigationItem schemeStatSak$EcosystemNavigationItem7 = new SchemeStatSak$EcosystemNavigationItem("SETTINGS", 6);
        SETTINGS = schemeStatSak$EcosystemNavigationItem7;
        SchemeStatSak$EcosystemNavigationItem schemeStatSak$EcosystemNavigationItem8 = new SchemeStatSak$EcosystemNavigationItem("THEME", 7);
        THEME = schemeStatSak$EcosystemNavigationItem8;
        SchemeStatSak$EcosystemNavigationItem schemeStatSak$EcosystemNavigationItem9 = new SchemeStatSak$EcosystemNavigationItem("HELP", 8);
        HELP = schemeStatSak$EcosystemNavigationItem9;
        SchemeStatSak$EcosystemNavigationItem schemeStatSak$EcosystemNavigationItem10 = new SchemeStatSak$EcosystemNavigationItem("LOGOUT", 9);
        LOGOUT = schemeStatSak$EcosystemNavigationItem10;
        SchemeStatSak$EcosystemNavigationItem schemeStatSak$EcosystemNavigationItem11 = new SchemeStatSak$EcosystemNavigationItem("SWITCHER", 10);
        SWITCHER = schemeStatSak$EcosystemNavigationItem11;
        SchemeStatSak$EcosystemNavigationItem[] schemeStatSak$EcosystemNavigationItemArr = {schemeStatSak$EcosystemNavigationItem, schemeStatSak$EcosystemNavigationItem2, schemeStatSak$EcosystemNavigationItem3, schemeStatSak$EcosystemNavigationItem4, schemeStatSak$EcosystemNavigationItem5, schemeStatSak$EcosystemNavigationItem6, schemeStatSak$EcosystemNavigationItem7, schemeStatSak$EcosystemNavigationItem8, schemeStatSak$EcosystemNavigationItem9, schemeStatSak$EcosystemNavigationItem10, schemeStatSak$EcosystemNavigationItem11};
        $VALUES = schemeStatSak$EcosystemNavigationItemArr;
        $ENTRIES = new asp(schemeStatSak$EcosystemNavigationItemArr);
    }

    private SchemeStatSak$EcosystemNavigationItem(String str, int i) {
    }

    public static SchemeStatSak$EcosystemNavigationItem valueOf(String str) {
        return (SchemeStatSak$EcosystemNavigationItem) Enum.valueOf(SchemeStatSak$EcosystemNavigationItem.class, str);
    }

    public static SchemeStatSak$EcosystemNavigationItem[] values() {
        return (SchemeStatSak$EcosystemNavigationItem[]) $VALUES.clone();
    }
}
