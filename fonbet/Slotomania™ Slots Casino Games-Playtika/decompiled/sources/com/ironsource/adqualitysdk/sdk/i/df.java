package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.view.View;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class df extends cw {
    /* renamed from: ﾒ, reason: contains not printable characters */
    public static WebView m7472(List<Object> list) {
        int i;
        Activity activity = (Activity) m7365(list, 0, Activity.class);
        List arrayList = new ArrayList();
        String str = null;
        if (list.size() > 1) {
            i = ((Integer) m7365(list, 1, Integer.class)).intValue();
            if (list.size() > 2) {
                str = (String) m7365(list, 2, String.class);
                if (list.size() > 3) {
                    arrayList = (List) m7365(list, 3, List.class);
                }
            }
        } else {
            i = -1;
        }
        return (WebView) kq.m8505(activity, WebView.class, i, arrayList, str);
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static boolean m7470(List<Object> list) {
        return kq.m8507((View) m7365(list, 0, View.class));
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static <E extends View> E m7469(List<Object> list) {
        return (E) kq.m8506((View) m7365(list, 0, View.class), (Class) m7365(list, 1, Class.class), ((Boolean) m7365(list, 2, Boolean.class)).booleanValue());
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static View m7471(List<Object> list) {
        return kq.m8513((Activity) m7365(list, 0, Activity.class));
    }
}
