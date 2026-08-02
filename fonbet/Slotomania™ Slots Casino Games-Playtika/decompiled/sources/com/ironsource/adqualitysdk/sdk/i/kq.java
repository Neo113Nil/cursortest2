package com.ironsource.adqualitysdk.sdk.i;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class kq {

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static Rect f3080 = new Rect();

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static View m8513(Activity activity) {
        return activity.findViewById(R.id.content);
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static <E extends View> E m8505(Activity activity, Class<E> cls, int i, List<String> list, String str) {
        ArrayList arrayList = new ArrayList();
        m8510(activity, cls, i, str, true, false, null, list, arrayList);
        if (arrayList.size() > 0) {
            return (E) arrayList.get(0);
        }
        return null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static <E extends View> void m8516(Activity activity, Class<E> cls, boolean z, List<Integer> list, List<String> list2, List<E> list3) {
        m8510(activity, cls, -1, null, false, z, list, list2, list3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ｋ, reason: contains not printable characters */
    public static <E extends View> void m8510(Activity activity, Class<E> cls, int i, String str, boolean z, boolean z2, List<Integer> list, List<String> list2, List<E> list3) {
        if (i != -1) {
            View findViewById = activity.findViewById(i);
            if (cls.isInstance(findViewById)) {
                list3.add(findViewById);
                if (z) {
                    return;
                }
            }
            m8508(findViewById, cls, str, z, z2, list, list2, list3);
            if (list3.size() > 0 && z) {
                return;
            }
        }
        View findViewById2 = activity.findViewById(R.id.content);
        if (findViewById2 != null) {
            m8511(findViewById2, cls, str, z, z2, list, list2, list3);
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static <E extends View> void m8511(View view, Class<E> cls, String str, boolean z, boolean z2, List<Integer> list, List<String> list2, List<E> list3) {
        while (view.getParent() != null && (view.getParent() instanceof ViewGroup)) {
            view = (View) view.getParent();
        }
        m8508(view, cls, str, z, z2, list, list2, list3);
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static <E extends View> E m8506(View view, Class<E> cls, boolean z) {
        ArrayList arrayList = new ArrayList();
        m8517(view, cls, true, z, null, null, arrayList);
        if (arrayList.isEmpty()) {
            return null;
        }
        return (E) arrayList.get(0);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static <E extends View> void m8517(View view, Class<E> cls, boolean z, boolean z2, List<Integer> list, List<String> list2, List<E> list3) {
        m8508(view, cls, null, z, z2, list, list2, list3);
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static <E extends View> void m8508(View view, Class<E> cls, String str, boolean z, boolean z2, List<Integer> list, List<String> list2, List<E> list3) {
        List list4 = list3;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int i = 0;
            while (i < viewGroup.getChildCount()) {
                View childAt = viewGroup.getChildAt(i);
                if (m8514(childAt, cls, str, list, list2)) {
                    list4.add(childAt);
                    if (z) {
                        return;
                    }
                    if (z2) {
                        m8508(childAt, cls, str, z, z2, list, list2, list4);
                    }
                } else {
                    m8508(childAt, cls, str, z, z2, list, list2, list4);
                    if (list3 != null && list3.size() > 0 && z) {
                        return;
                    }
                }
                i++;
                list4 = list3;
            }
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static <E extends View> boolean m8514(View view, Class<E> cls, String str, List<Integer> list, List<String> list2) {
        if (!cls.isInstance(view)) {
            return false;
        }
        if ((m8518(list) || list.contains(Integer.valueOf(view.getId()))) && !m8512(list2, view)) {
            return str == null || view.getClass().getName().startsWith(str);
        }
        return false;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static boolean m8518(List list) {
        return list == null || list.isEmpty();
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static boolean m8512(List<String> list, View view) {
        return list != null && list.contains(view.getClass().getName());
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static View m8515(View view) {
        while (view.getParent() instanceof View) {
            view = (View) view.getParent();
        }
        return view;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static boolean m8507(View view) {
        view.getHitRect(f3080);
        return view.getGlobalVisibleRect(f3080);
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static Activity m8509(View view) {
        View findViewById;
        if (view != null) {
            View view2 = view;
            while (view2.getId() != 16908290 && (view2.getParent() instanceof View)) {
                view2 = (View) view2.getParent();
            }
            for (Context context = view2.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                if (context instanceof Activity) {
                    return (Activity) context;
                }
            }
            if (view != null && (findViewById = view.findViewById(R.id.content)) != null && (findViewById.getContext() instanceof Activity)) {
                return (Activity) findViewById.getContext();
            }
        }
        return null;
    }
}
