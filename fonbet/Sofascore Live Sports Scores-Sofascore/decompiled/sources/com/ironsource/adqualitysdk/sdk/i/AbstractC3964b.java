package com.ironsource.adqualitysdk.sdk.i;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3964b {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static final Rect f132;

    static {
        StringFog.decrypt("3x1iRyTpmOT6\n", "iXQHMHGd8Yg=\n");
        f132 = new Rect();
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static void m88(View view, Class cls, String str, boolean z, boolean z2, List list, List list2, ArrayList arrayList) {
        ArrayList arrayList2 = arrayList;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int i = 0;
            while (i < viewGroup.getChildCount()) {
                View childAt = viewGroup.getChildAt(i);
                if (m93(childAt, cls, str, list, list2)) {
                    arrayList2.add(childAt);
                    if (z) {
                        return;
                    }
                    if (z2) {
                        m88(childAt, cls, str, z, z2, list, list2, arrayList2);
                    }
                } else {
                    m88(childAt, cls, str, z, z2, list, list2, arrayList2);
                    if (arrayList != null && arrayList.size() > 0 && z) {
                        return;
                    }
                }
                i++;
                arrayList2 = arrayList;
            }
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static Activity m89(View view) {
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
            View findViewById = view.findViewById(R.id.content);
            if (findViewById != null && (findViewById.getContext() instanceof Activity)) {
                return (Activity) findViewById.getContext();
            }
        }
        return null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m92(View view, Class cls, String str, boolean z, boolean z2, List list, List list2, ArrayList arrayList) {
        if (view.getParent() != null && (view.getParent() instanceof ViewGroup)) {
            m92((View) view.getParent(), cls, str, z, z2, list, list2, arrayList);
        } else {
            m88(view, cls, str, z, z2, list, list2, arrayList);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static boolean m93(View view, Class cls, String str, List list, List list2) {
        if (!cls.isInstance(view)) {
            return false;
        }
        if (list != null && !list.isEmpty() && !list.contains(Integer.valueOf(view.getId()))) {
            return false;
        }
        if (list2 == null || !list2.contains(view.getClass().getName())) {
            return str == null || view.getClass().getName().startsWith(str);
        }
        return false;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static ArrayList m90(ArrayList arrayList, ArrayList arrayList2) {
        Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        newSetFromMap.addAll(arrayList2);
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            View view = (View) ((WeakReference) it.next()).get();
            if (view == null || !newSetFromMap.contains(view)) {
                it.remove();
                if (view != null) {
                    arrayList3.add(view);
                }
            }
        }
        return arrayList3;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m91(Activity activity, Class cls, int i, String str, boolean z, boolean z2, List list, List list2, ArrayList arrayList) {
        if (i != -1) {
            View findViewById = activity.findViewById(i);
            if (cls.isInstance(findViewById)) {
                arrayList.add(findViewById);
                if (z) {
                    return;
                }
            }
            m88(findViewById, cls, str, z, z2, list, list2, arrayList);
            if (arrayList.size() > 0 && z) {
                return;
            }
        }
        View findViewById2 = activity.findViewById(R.id.content);
        if (findViewById2 != null) {
            m92(findViewById2, cls, str, z, z2, list, list2, arrayList);
        }
    }
}
