package defpackage;

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class pzn implements Runnable {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013b  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        HashSet hashSet;
        KeyguardManager keyguardManager;
        c0l c0lVar;
        Iterator it;
        HashSet hashSet2;
        Activity activity;
        Boolean bool;
        String str;
        j0o j0oVar = j0o.f;
        izn iznVar = j0oVar.d;
        c0l c0lVar2 = j0oVar.e;
        j0oVar.b.clear();
        for (i2o i2oVar : Collections.unmodifiableCollection(tsn.c.b)) {
        }
        System.nanoTime();
        HashMap hashMap = iznVar.g;
        HashSet hashSet3 = iznVar.e;
        HashMap hashMap2 = iznVar.b;
        HashMap hashMap3 = iznVar.a;
        HashSet hashSet4 = iznVar.d;
        HashSet hashSet5 = iznVar.h;
        HashSet hashSet6 = iznVar.f;
        HashMap hashMap4 = iznVar.c;
        tsn tsnVar = tsn.c;
        if (tsnVar != null) {
            Iterator it2 = Collections.unmodifiableCollection(tsnVar.b).iterator();
            while (it2.hasNext()) {
                i2o i2oVar2 = (i2o) it2.next();
                View view = (View) i2oVar2.c.get();
                String str2 = i2oVar2.g;
                if (!i2oVar2.e || i2oVar2.f) {
                    c0lVar = c0lVar2;
                    it = it2;
                    hashSet2 = hashSet5;
                } else if (view != null) {
                    Context context = view.getContext();
                    c0lVar = c0lVar2;
                    while (true) {
                        if (!(context instanceof ContextWrapper)) {
                            activity = null;
                            break;
                        } else {
                            if (context instanceof Activity) {
                                activity = (Activity) context;
                                break;
                            }
                            context = ((ContextWrapper) context).getBaseContext();
                        }
                    }
                    boolean isInPictureInPictureMode = activity != null ? activity.isInPictureInPictureMode() : false;
                    if (isInPictureInPictureMode) {
                        hashSet5.add(str2);
                    }
                    boolean z = isInPictureInPictureMode;
                    if (view.isAttachedToWindow()) {
                        boolean hasWindowFocus = view.hasWindowFocus();
                        it = it2;
                        WeakHashMap weakHashMap = iznVar.i;
                        if (hasWindowFocus) {
                            weakHashMap.remove(view);
                            bool = Boolean.FALSE;
                        } else if (weakHashMap.containsKey(view)) {
                            bool = (Boolean) weakHashMap.get(view);
                        } else {
                            Boolean bool2 = Boolean.FALSE;
                            weakHashMap.put(view, bool2);
                            bool = bool2;
                        }
                        if (!bool.booleanValue() || z) {
                            HashSet hashSet7 = new HashSet();
                            View view2 = view;
                            while (view2 != null) {
                                String L = qea.L(view2);
                                if (L != null) {
                                    str = L;
                                } else {
                                    hashSet7.add(view2);
                                    Object parent = view2.getParent();
                                    HashSet hashSet8 = hashSet5;
                                    if (parent instanceof View) {
                                        view2 = (View) parent;
                                        hashSet5 = hashSet8;
                                    } else {
                                        hashSet5 = hashSet8;
                                        view2 = null;
                                    }
                                }
                            }
                            hashSet2 = hashSet5;
                            hashSet4.addAll(hashSet7);
                            str = null;
                            if (str != null) {
                                hashSet3.add(str2);
                                hashMap3.put(view, str2);
                                Iterator it3 = i2oVar2.b.a.iterator();
                                while (it3.hasNext()) {
                                    ptn ptnVar = (ptn) it3.next();
                                    View view3 = (View) ptnVar.a.get();
                                    if (view3 != null) {
                                        hzn hznVar = (hzn) hashMap2.get(view3);
                                        if (hznVar != null) {
                                            hznVar.b.add(str2);
                                        } else {
                                            hashMap2.put(view3, new hzn(ptnVar, str2));
                                        }
                                    }
                                }
                            } else if (str != "noWindowFocus") {
                                hashSet6.add(str2);
                                hashMap4.put(str2, view);
                                hashMap.put(str2, str);
                            }
                        } else {
                            str = "noWindowFocus";
                        }
                    } else {
                        str = "notAttached";
                        it = it2;
                    }
                    hashSet2 = hashSet5;
                    if (str != null) {
                    }
                } else {
                    hashSet6.add(str2);
                    hashMap.put(str2, "noAdView");
                    c0lVar2 = c0lVar2;
                }
                c0lVar2 = c0lVar;
                hashSet5 = hashSet2;
                it2 = it;
            }
        }
        c0l c0lVar3 = c0lVar2;
        HashSet hashSet9 = hashSet5;
        rwn rwnVar = j0oVar.c;
        long nanoTime = System.nanoTime();
        fjn fjnVar = rwnVar.b;
        if (hashSet6.size() > 0) {
            Iterator it4 = hashSet6.iterator();
            while (it4.hasNext()) {
                String str3 = (String) it4.next();
                JSONObject a = fjnVar.a(null);
                View view4 = (View) hashMap4.get(str3);
                HashMap hashMap5 = hashMap4;
                fxn fxnVar = rwnVar.a;
                fjn fjnVar2 = fjnVar;
                String str4 = (String) hashMap.get(str3);
                if (str4 != null) {
                    JSONObject a2 = fxnVar.a(view4);
                    try {
                        a2.put("adSessionId", str3);
                    } catch (JSONException unused) {
                    }
                    try {
                        a2.put("notVisibleReason", str4);
                    } catch (JSONException unused2) {
                    }
                    myn.c(a, a2);
                }
                myn.d(a);
                HashSet hashSet10 = new HashSet();
                hashSet10.add(str3);
                c0lVar3.getClass();
                HashMap hashMap6 = hashMap;
                c0l c0lVar4 = c0lVar3;
                l1o l1oVar = new l1o(c0lVar4, hashSet10, a, nanoTime, 0);
                d1o d1oVar = (d1o) c0lVar4.c;
                l1oVar.a = d1oVar;
                ArrayDeque arrayDeque = d1oVar.b;
                arrayDeque.add(l1oVar);
                if (d1oVar.c == null) {
                    w0o w0oVar = (w0o) arrayDeque.poll();
                    d1oVar.c = w0oVar;
                    if (w0oVar != null) {
                        w0oVar.executeOnExecutor(d1oVar.a, new Object[0]);
                    }
                }
                hashMap4 = hashMap5;
                hashMap = hashMap6;
                c0lVar3 = c0lVar4;
                fjnVar = fjnVar2;
            }
        }
        fjn fjnVar3 = fjnVar;
        HashMap hashMap7 = hashMap;
        c0l c0lVar5 = c0lVar3;
        HashMap hashMap8 = hashMap4;
        if (hashSet3.size() > 0) {
            JSONObject a3 = fjnVar3.a(null);
            ArrayList arrayList = new ArrayList();
            tsn tsnVar2 = tsn.c;
            if (tsnVar2 != null) {
                Collection unmodifiableCollection = Collections.unmodifiableCollection(tsnVar2.b);
                int size = unmodifiableCollection.size();
                IdentityHashMap identityHashMap = new IdentityHashMap(size + size + 3);
                Iterator it5 = unmodifiableCollection.iterator();
                while (it5.hasNext()) {
                    View view5 = (View) ((i2o) it5.next()).c.get();
                    if (view5 != null && view5.isAttachedToWindow() && view5.isShown()) {
                        View view6 = view5;
                        while (true) {
                            if (view6 == null) {
                                c0l c0lVar6 = c0lVar5;
                                long j = nanoTime;
                                View rootView = view5.getRootView();
                                if (rootView != null && !identityHashMap.containsKey(rootView)) {
                                    identityHashMap.put(rootView, rootView);
                                    float z2 = rootView.getZ();
                                    int size2 = arrayList.size();
                                    while (size2 > 0) {
                                        int i = size2 - 1;
                                        if (((View) arrayList.get(i)).getZ() <= z2) {
                                            break;
                                        } else {
                                            size2 = i;
                                        }
                                    }
                                    arrayList.add(size2, rootView);
                                }
                                c0lVar5 = c0lVar6;
                                nanoTime = j;
                            } else {
                                if (view6.getAlpha() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                    break;
                                }
                                c0l c0lVar7 = c0lVar5;
                                Object parent2 = view6.getParent();
                                long j2 = nanoTime;
                                if (parent2 instanceof View) {
                                    view6 = (View) parent2;
                                    c0lVar5 = c0lVar7;
                                    nanoTime = j2;
                                } else {
                                    c0lVar5 = c0lVar7;
                                    nanoTime = j2;
                                    view6 = null;
                                }
                            }
                        }
                    }
                }
            }
            c0l c0lVar8 = c0lVar5;
            long j3 = nanoTime;
            int size3 = arrayList.size();
            for (int i2 = 0; i2 < size3; i2++) {
                j0oVar.a((View) arrayList.get(i2), (fxn) fjnVar3.b, a3, false);
            }
            myn.d(a3);
            c0lVar8.getClass();
            hashSet = hashSet3;
            l1o l1oVar2 = new l1o(c0lVar8, hashSet, a3, j3, 1);
            d1o d1oVar2 = (d1o) c0lVar8.c;
            l1oVar2.a = d1oVar2;
            ArrayDeque arrayDeque2 = d1oVar2.b;
            arrayDeque2.add(l1oVar2);
            if (d1oVar2.c == null) {
                w0o w0oVar2 = (w0o) arrayDeque2.poll();
                d1oVar2.c = w0oVar2;
                if (w0oVar2 != null) {
                    w0oVar2.executeOnExecutor(d1oVar2.a, new Object[0]);
                }
            }
        } else {
            hashSet = hashSet3;
            c0lVar5.getClass();
            i1o i1oVar = new i1o(c0lVar5);
            d1o d1oVar3 = (d1o) c0lVar5.c;
            i1oVar.a = d1oVar3;
            ArrayDeque arrayDeque3 = d1oVar3.b;
            arrayDeque3.add(i1oVar);
            if (d1oVar3.c == null) {
                w0o w0oVar3 = (w0o) arrayDeque3.poll();
                d1oVar3.c = w0oVar3;
                if (w0oVar3 != null) {
                    w0oVar3.executeOnExecutor(d1oVar3.a, new Object[0]);
                }
            }
        }
        hashMap3.clear();
        hashMap2.clear();
        hashMap8.clear();
        hashSet4.clear();
        hashSet.clear();
        hashSet6.clear();
        hashMap7.clear();
        iznVar.j = false;
        hashSet9.clear();
        System.nanoTime();
        ArrayList arrayList2 = j0oVar.a;
        if (arrayList2.size() > 0) {
            Iterator it6 = arrayList2.iterator();
            if (it6.hasNext()) {
                throw lnb.i(it6);
            }
        }
        tvn tvnVar = tvn.d;
        Context context2 = (Context) tvnVar.a.get();
        if (context2 == null || (keyguardManager = (KeyguardManager) context2.getSystemService("keyguard")) == null) {
            return;
        }
        boolean isDeviceLocked = keyguardManager.isDeviceLocked();
        tvnVar.a(tvnVar.b, isDeviceLocked);
        tvnVar.c = isDeviceLocked;
    }
}
