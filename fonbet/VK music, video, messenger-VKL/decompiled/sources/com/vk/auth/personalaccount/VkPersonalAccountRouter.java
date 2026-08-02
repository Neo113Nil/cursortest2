package com.vk.auth.personalaccount;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.ironsource.X3;
import xsna.a0a;
import xsna.asp;
import xsna.gnj;
import xsna.zrp;

/* compiled from: VkPersonalAccountRouter.kt */
/* loaded from: classes15.dex */
public final class VkPersonalAccountRouter {
    public final Context a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkPersonalAccountRouter.kt */
    public static final class Tab {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Tab[] $VALUES;
        public static final Tab MAIN;
        public static final Tab PASSKEY;
        public static final Tab PASSKEY_ADDING;
        public static final Tab PERSONAL;
        public static final Tab SECURITY;
        public static final Tab SERVICES;
        public static final Tab SUBS;
        public static final Tab VKPAY;
        private final String id;

        static {
            Tab tab = new Tab("MAIN", 0, X3.i.Z);
            MAIN = tab;
            Tab tab2 = new Tab("PERSONAL", 1, "personal");
            PERSONAL = tab2;
            Tab tab3 = new Tab("SECURITY", 2, "security");
            SECURITY = tab3;
            Tab tab4 = new Tab("VKPAY", 3, "vkpay");
            VKPAY = tab4;
            Tab tab5 = new Tab("SUBS", 4, "subs");
            SUBS = tab5;
            Tab tab6 = new Tab("SERVICES", 5, "services");
            SERVICES = tab6;
            Tab tab7 = new Tab("PASSKEY", 6, "connected-keys");
            PASSKEY = tab7;
            Tab tab8 = new Tab("PASSKEY_ADDING", 7, "adding-key");
            PASSKEY_ADDING = tab8;
            Tab[] tabArr = {tab, tab2, tab3, tab4, tab5, tab6, tab7, tab8};
            $VALUES = tabArr;
            $ENTRIES = new asp(tabArr);
        }

        public Tab(String str, int i, String str2) {
            this.id = str2;
        }

        public static Tab valueOf(String str) {
            return (Tab) Enum.valueOf(Tab.class, str);
        }

        public static Tab[] values() {
            return (Tab[]) $VALUES.clone();
        }

        public final String getId() {
            return this.id;
        }
    }

    public VkPersonalAccountRouter(Context context) {
        this.a = context;
    }

    public final void a(Tab tab, String str, Integer num) {
        int i = VkPersonalAccountActivity.n;
        Intent intent = new Intent(this.a, (Class<?>) VkPersonalAccountActivity.class);
        StringBuilder sb = new StringBuilder();
        sb.append("https://id." + a0a.d + "/account/#/");
        sb.append(tab.getId());
        Uri.Builder appendQueryParameter = Uri.parse(sb.toString()).buildUpon().appendQueryParameter("flow_service", str);
        if (tab == Tab.PASSKEY_ADDING) {
            appendQueryParameter.appendQueryParameter("close_after_onepass", "true");
        }
        Bundle bundle = new Bundle(1);
        bundle.putString("directUrl", appendQueryParameter.build().toString());
        Intent putExtras = intent.putExtras(bundle);
        if (num == null) {
            this.a.startActivity(putExtras);
            return;
        }
        Activity b = gnj.b(this.a);
        if (b != null) {
            b.startActivityForResult(putExtras, num.intValue());
        }
    }
}
