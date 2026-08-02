package com.vk.appredirects.filter;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.appredirects.entity.App;
import com.vk.appredirects.entity.LinkType;
import com.vk.core.apps.BuildInfo;
import com.vk.core.preference.Preference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.EmptySet;
import xsna.c5g;
import xsna.j5g;
import xsna.k83;
import xsna.s3q0;

/* compiled from: AppRedirectOverrides.kt */
/* loaded from: classes15.dex */
public final class AppRedirectOverrides {

    /* compiled from: AppRedirectOverrides.kt */
    public static final class AppRedirectSettingChangeFailedException extends Exception {

        /* renamed from: app, reason: collision with root package name */
        private final App f87app;

        public AppRedirectSettingChangeFailedException(App app2) {
            this.f87app = app2;
        }
    }

    /* compiled from: AppRedirectOverrides.kt */
    public static final class VersionTooLowException extends Exception {
        private final String appName;

        public VersionTooLowException(String str) {
            this.appName = str;
        }

        public final String d() {
            return this.appName;
        }
    }

    public static Set a(Context context) {
        Set<String> stringSet = Preference.h(context, 0, "AppRedirectOverrides").getStringSet("overrides", EmptySet.b);
        if (stringSet != null) {
            Set<String> set = stringSet;
            ArrayList arrayList = new ArrayList(c5g.u(set, 10));
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                arrayList.add(LinkType.values()[Integer.parseInt((String) it.next())]);
            }
            Set S0 = j5g.S0(arrayList);
            if (S0 != null) {
                return S0;
            }
        }
        return EmptySet.b;
    }

    public static boolean b(Context context, App app2, LinkType linkType) {
        App app3;
        switch (k83.$EnumSwitchMapping$0[BuildInfo.a.ordinal()]) {
            case 1:
                app3 = App.VK_APP;
                break;
            case 2:
                app3 = App.VK_ME;
                break;
            case 3:
                app3 = App.VK_CALLS;
                break;
            case 4:
                app3 = App.VK_VIDEO;
                break;
            case 5:
                app3 = App.VK_TV;
                break;
            case 6:
                app3 = App.VK_DATING;
                break;
            case 7:
                app3 = App.VK_MUSIC;
                break;
            default:
                app3 = App.VK_APP;
                break;
        }
        if (app3 == app2) {
            Set R0 = j5g.R0(a(context));
            boolean add = R0.add(linkType);
            if (add) {
                c(context, R0);
            }
            return add;
        }
        ContentResolver contentResolver = context.getContentResolver();
        Uri parse = Uri.parse("content://" + app2.i() + "/deeplinks");
        ContentValues contentValues = new ContentValues();
        contentValues.put(CampaignEx.JSON_KEY_LINK_TYPE, Integer.valueOf(linkType.ordinal()));
        s3q0 s3q0Var = s3q0.a;
        return contentResolver.insert(parse, contentValues) != null;
    }

    @SuppressLint({"ApplySharedPref"})
    public static void c(Context context, Set set) {
        SharedPreferences.Editor edit = Preference.h(context, 0, "AppRedirectOverrides").edit();
        Set set2 = set;
        ArrayList arrayList = new ArrayList(c5g.u(set2, 10));
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((LinkType) it.next()).ordinal()));
        }
        edit.putStringSet("overrides", j5g.S0(arrayList)).commit();
    }
}
