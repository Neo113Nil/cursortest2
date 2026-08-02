package com.ironsource.adqualitysdk.sdk.i;

import android.R;
import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.webkit.WebView;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3965c extends AbstractC0475 {
    static {
        StringFog.decrypt("E6nQ+z7KvL4ipcHNHO+2sTWv0NMs9K2l\n", "dMykulqd2dw=\n");
        StringFog.decrypt("2V6QYoeJ1PHDRKRnhw==\n", "sC3GC+L+gpg=\n");
        StringFog.decrypt("AMy3QmG7lg==\n", "Z6nDFAje4eU=\n");
        StringFog.decrypt("a4A6iND2wJxikRii2u8=\n", "DOVOy7+YtPk=\n");
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static boolean m110(ArrayList arrayList) {
        View view = (View) AbstractC0475.m295(arrayList, 0, View.class);
        Rect rect = AbstractC3964b.f132;
        view.getHitRect(rect);
        return view.getGlobalVisibleRect(rect);
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static View m111(ArrayList arrayList) {
        View view = (View) AbstractC0475.m295(arrayList, 0, View.class);
        Class cls = (Class) AbstractC0475.m295(arrayList, 1, Class.class);
        boolean booleanValue = ((Boolean) AbstractC0475.m295(arrayList, 2, Boolean.class)).booleanValue();
        Rect rect = AbstractC3964b.f132;
        ArrayList arrayList2 = new ArrayList();
        AbstractC3964b.m88(view, cls, null, true, booleanValue, null, null, arrayList2);
        if (arrayList2.isEmpty()) {
            return null;
        }
        return (View) arrayList2.get(0);
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static View m112(ArrayList arrayList) {
        Activity activity = (Activity) AbstractC0475.m295(arrayList, 0, Activity.class);
        Rect rect = AbstractC3964b.f132;
        return activity.findViewById(R.id.content);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0061  */
    /* renamed from: ﾒ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static WebView m113(ArrayList arrayList) {
        int i;
        List list;
        int i2;
        String str;
        Activity activity = (Activity) AbstractC0475.m295(arrayList, 0, Activity.class);
        List arrayList2 = new ArrayList();
        if (arrayList.size() > 1) {
            i = ((Integer) AbstractC0475.m295(arrayList, 1, Integer.class)).intValue();
            if (arrayList.size() > 2) {
                String str2 = (String) AbstractC0475.m295(arrayList, 2, String.class);
                if (arrayList.size() > 3) {
                    arrayList2 = (List) AbstractC0475.m295(arrayList, 3, List.class);
                }
                list = arrayList2;
                str = str2;
                i2 = i;
                Rect rect = AbstractC3964b.f132;
                ArrayList arrayList3 = new ArrayList();
                AbstractC3964b.m91(activity, WebView.class, i2, str, true, false, null, list, arrayList3);
                return (WebView) (arrayList3.size() > 0 ? (View) arrayList3.get(0) : null);
            }
        } else {
            i = -1;
        }
        list = arrayList2;
        i2 = i;
        str = null;
        Rect rect2 = AbstractC3964b.f132;
        ArrayList arrayList32 = new ArrayList();
        AbstractC3964b.m91(activity, WebView.class, i2, str, true, false, null, list, arrayList32);
        return (WebView) (arrayList32.size() > 0 ? (View) arrayList32.get(0) : null);
    }
}
