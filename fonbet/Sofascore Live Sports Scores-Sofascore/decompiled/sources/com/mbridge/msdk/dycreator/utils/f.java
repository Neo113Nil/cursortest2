package com.mbridge.msdk.dycreator.utils;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.io.File;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class f {
    private static volatile f b;
    private com.mbridge.msdk.dycreator.engine.b a;

    private f(Context context) {
        this.a = null;
        com.mbridge.msdk.dycreator.engine.b a = com.mbridge.msdk.dycreator.engine.b.a();
        this.a = a;
        a.a(context, "");
    }

    public View a(ViewGroup viewGroup, String str) {
        if (viewGroup != null && !TextUtils.isEmpty(str)) {
            if (viewGroup.getId() == str.hashCode()) {
                return viewGroup;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getId() == str.hashCode()) {
                    return childAt;
                }
                if (childAt instanceof ViewGroup) {
                    a((ViewGroup) childAt, str);
                }
            }
        }
        return null;
    }

    public View a(String str) {
        if (new File(str).exists()) {
            return this.a.e(str);
        }
        return null;
    }

    public static f a(Context context) {
        if (b == null) {
            synchronized (f.class) {
                try {
                    if (b == null) {
                        b = new f(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return b;
    }
}
