package com.mbridge.msdk.mbnative.controller;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import defpackage.bsk;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class f {
    private static View a(View view) {
        if (view == null) {
            return null;
        }
        try {
            WeakHashMap weakHashMap = bsk.a;
            view.isAttachedToWindow();
        } catch (Throwable unused) {
        }
        try {
            View rootView = view.getRootView();
            if (rootView == null) {
                return null;
            }
            View findViewById = rootView.findViewById(R.id.content);
            return findViewById != null ? findViewById : rootView;
        } catch (Throwable unused2) {
            return null;
        }
    }

    private static View a(Context context) {
        if (context != null && (context instanceof Activity)) {
            return ((Activity) context).getWindow().getDecorView().findViewById(R.id.content);
        }
        return null;
    }

    public static View a(Context context, View view) {
        View a = a(context);
        return a != null ? a : a(view);
    }
}
