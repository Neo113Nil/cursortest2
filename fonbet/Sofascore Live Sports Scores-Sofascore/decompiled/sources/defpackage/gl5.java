package defpackage;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.Trace;
import android.view.View;
import com.google.android.gms.internal.ads.zzcea;
import com.google.android.gms.internal.ads.zzcee;
import com.google.android.gms.internal.ads.zzfvq;
import com.google.android.gms.internal.ads.zzfwk;
import com.google.android.gms.internal.ads.zzfwn;
import com.google.android.gms.internal.ads.zzfwu;
import com.google.android.gms.internal.ads.zzfwx;
import com.google.android.gms.internal.ads.zzfwy;
import com.google.android.gms.internal.ads.zzfwz;
import com.google.android.gms.internal.ads.zzfxg;
import com.google.android.gms.internal.ads.zzfxl;
import com.google.android.gms.internal.ads.zzfxm;
import com.google.android.gms.internal.ads.zzfxn;
import com.google.android.gms.internal.ads.zzfxo;
import com.google.android.gms.internal.ads.zzfxs;
import com.google.android.gms.internal.ads.zzfxt;
import com.google.android.gms.internal.ads.zzfxu;
import com.google.android.gms.internal.ads.zzfxw;
import com.google.android.gms.internal.ads.zzfxx;
import com.google.android.gms.internal.ads.zzfxy;
import com.google.android.gms.internal.ads.zzfxz;
import com.google.android.gms.internal.ads.zzfya;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.unity3d.services.UnityAdsConstants;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class gl5 implements Runnable {
    public static final /* synthetic */ gl5 b = new gl5(5);
    public static final /* synthetic */ gl5 c = new gl5(9);
    public static final /* synthetic */ gl5 d = new gl5(17);
    public static final /* synthetic */ gl5 e = new gl5(19);
    public final /* synthetic */ int a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0132  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        CountDownLatch countDownLatch;
        HashSet hashSet;
        KeyguardManager keyguardManager;
        zzfxo zzfxoVar;
        Iterator it;
        HashSet hashSet2;
        Activity activity;
        Boolean bool;
        View view;
        String str;
        boolean z;
        switch (this.a) {
            case 0:
                try {
                    Method method = asj.b;
                    Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                    if (cl5.d()) {
                        cl5.a().e();
                    }
                    Trace.endSection();
                    return;
                } catch (Throwable th) {
                    Method method2 = asj.b;
                    Trace.endSection();
                    throw th;
                }
            case 1:
            case 2:
                return;
            case 3:
                try {
                    sjg.f = cga.y(new URL("https://apps.sascdn.com/sdk/omsdk/1.6.1/omsdk-v1.min.js"), null);
                    return;
                } catch (MalformedURLException unused) {
                    return;
                }
            case 4:
                Iterator it2 = new ArrayList(jsg.d.keySet()).iterator();
                while (it2.hasNext()) {
                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) it2.next();
                    if (scheduledThreadPoolExecutor.isShutdown()) {
                        jsg.d.remove(scheduledThreadPoolExecutor);
                    } else {
                        scheduledThreadPoolExecutor.purge();
                    }
                }
                return;
            case 5:
                return;
            case 6:
                try {
                    gln.b = MessageDigest.getInstance(SameMD5.TAG);
                    countDownLatch = gln.e;
                } catch (NoSuchAlgorithmException unused2) {
                    countDownLatch = gln.e;
                } catch (Throwable th2) {
                    gln.e.countDown();
                    throw th2;
                }
                countDownLatch.countDown();
                return;
            case 7:
            case 8:
                return;
            case 9:
                List list = zzcea.l;
                zzcee.a("Pinged SB successfully.");
                return;
            case 10:
                Looper.myLooper().quit();
                return;
            case 11:
            case 12:
            case 13:
                return;
            case 14:
                zzfxu zzfxuVar = zzfxu.f;
                zzfxn zzfxnVar = zzfxuVar.d;
                zzfxo zzfxoVar2 = zzfxuVar.e;
                zzfxuVar.b.clear();
                for (zzfvq zzfvqVar : Collections.unmodifiableCollection(zzfwk.c.b)) {
                }
                System.nanoTime();
                HashMap hashMap = zzfxnVar.g;
                HashSet hashSet3 = zzfxnVar.e;
                HashMap hashMap2 = zzfxnVar.b;
                HashMap hashMap3 = zzfxnVar.a;
                HashSet hashSet4 = zzfxnVar.d;
                HashSet hashSet5 = zzfxnVar.h;
                HashSet hashSet6 = zzfxnVar.f;
                HashMap hashMap4 = zzfxnVar.c;
                zzfwk zzfwkVar = zzfwk.c;
                if (zzfwkVar != null) {
                    Iterator it3 = Collections.unmodifiableCollection(zzfwkVar.b).iterator();
                    while (it3.hasNext()) {
                        zzfvq zzfvqVar2 = (zzfvq) it3.next();
                        View view2 = (View) zzfvqVar2.c.get();
                        String str2 = zzfvqVar2.g;
                        if (!zzfvqVar2.e || zzfvqVar2.f) {
                            zzfxoVar = zzfxoVar2;
                            it = it3;
                            hashSet2 = hashSet5;
                        } else if (view2 != null) {
                            Context context = view2.getContext();
                            zzfxoVar = zzfxoVar2;
                            while (true) {
                                if (!(context instanceof ContextWrapper)) {
                                    activity = null;
                                } else if (context instanceof Activity) {
                                    activity = (Activity) context;
                                } else {
                                    context = ((ContextWrapper) context).getBaseContext();
                                }
                            }
                            boolean isInPictureInPictureMode = activity != null ? activity.isInPictureInPictureMode() : false;
                            if (isInPictureInPictureMode) {
                                hashSet5.add(str2);
                            }
                            boolean z2 = isInPictureInPictureMode;
                            if (view2.isAttachedToWindow()) {
                                boolean hasWindowFocus = view2.hasWindowFocus();
                                WeakHashMap weakHashMap = zzfxnVar.i;
                                if (hasWindowFocus) {
                                    weakHashMap.remove(view2);
                                    bool = Boolean.FALSE;
                                } else if (weakHashMap.containsKey(view2)) {
                                    bool = (Boolean) weakHashMap.get(view2);
                                } else {
                                    it = it3;
                                    Boolean bool2 = Boolean.FALSE;
                                    weakHashMap.put(view2, bool2);
                                    bool = bool2;
                                    if (bool.booleanValue() || z2) {
                                        HashSet hashSet7 = new HashSet();
                                        view = view2;
                                        while (view != null) {
                                            String a = zzfxl.a(view);
                                            if (a != null) {
                                                str = a;
                                            } else {
                                                hashSet7.add(view);
                                                Object parent = view.getParent();
                                                HashSet hashSet8 = hashSet5;
                                                if (parent instanceof View) {
                                                    view = (View) parent;
                                                    hashSet5 = hashSet8;
                                                } else {
                                                    hashSet5 = hashSet8;
                                                    view = null;
                                                }
                                            }
                                        }
                                        hashSet2 = hashSet5;
                                        hashSet4.addAll(hashSet7);
                                        str = null;
                                        if (str == null) {
                                            hashSet3.add(str2);
                                            hashMap3.put(view2, str2);
                                            Iterator it4 = zzfvqVar2.b.a.iterator();
                                            while (it4.hasNext()) {
                                                zzfwn zzfwnVar = (zzfwn) it4.next();
                                                View view3 = (View) zzfwnVar.a.get();
                                                if (view3 != null) {
                                                    zzfxm zzfxmVar = (zzfxm) hashMap2.get(view3);
                                                    if (zzfxmVar != null) {
                                                        zzfxmVar.b.add(str2);
                                                    } else {
                                                        hashMap2.put(view3, new zzfxm(zzfwnVar, str2));
                                                    }
                                                }
                                            }
                                        } else if (str != "noWindowFocus") {
                                            hashSet6.add(str2);
                                            hashMap4.put(str2, view2);
                                            hashMap.put(str2, str);
                                        }
                                    } else {
                                        str = "noWindowFocus";
                                    }
                                }
                                it = it3;
                                if (bool.booleanValue()) {
                                }
                                HashSet hashSet72 = new HashSet();
                                view = view2;
                                while (view != null) {
                                }
                                hashSet2 = hashSet5;
                                hashSet4.addAll(hashSet72);
                                str = null;
                                if (str == null) {
                                }
                            } else {
                                str = "notAttached";
                                it = it3;
                            }
                            hashSet2 = hashSet5;
                            if (str == null) {
                            }
                        } else {
                            hashSet6.add(str2);
                            hashMap.put(str2, "noAdView");
                        }
                        zzfxoVar2 = zzfxoVar;
                        hashSet5 = hashSet2;
                        it3 = it;
                    }
                }
                zzfxo zzfxoVar3 = zzfxoVar2;
                HashSet hashSet9 = hashSet5;
                zzfwx zzfwxVar = zzfxuVar.c;
                long nanoTime = System.nanoTime();
                zzfwy zzfwyVar = zzfwxVar.b;
                if (hashSet6.size() > 0) {
                    Iterator it5 = hashSet6.iterator();
                    while (it5.hasNext()) {
                        String str3 = (String) it5.next();
                        HashSet hashSet10 = hashSet6;
                        JSONObject a2 = zzfwyVar.a(null);
                        View view4 = (View) hashMap4.get(str3);
                        HashMap hashMap5 = hashMap4;
                        zzfwz zzfwzVar = zzfwxVar.a;
                        zzfwx zzfwxVar2 = zzfwxVar;
                        String str4 = (String) hashMap.get(str3);
                        if (str4 != null) {
                            JSONObject a3 = zzfwzVar.a(view4);
                            try {
                                a3.put("adSessionId", str3);
                            } catch (JSONException unused3) {
                            }
                            try {
                                a3.put("notVisibleReason", str4);
                            } catch (JSONException unused4) {
                            }
                            zzfxg.c(a2, a3);
                        }
                        zzfxg.d(a2);
                        HashSet hashSet11 = new HashSet();
                        hashSet11.add(str3);
                        zzfxoVar3.getClass();
                        zzfxo zzfxoVar4 = zzfxoVar3;
                        zzfxz zzfxzVar = new zzfxz(zzfxoVar4, hashSet11, a2, nanoTime);
                        zzfxx zzfxxVar = zzfxoVar4.b;
                        zzfxzVar.a = zzfxxVar;
                        ArrayDeque arrayDeque = zzfxxVar.b;
                        arrayDeque.add(zzfxzVar);
                        if (zzfxxVar.c == null) {
                            zzfxw zzfxwVar = (zzfxw) arrayDeque.poll();
                            zzfxxVar.c = zzfxwVar;
                            if (zzfxwVar != null) {
                                zzfxwVar.executeOnExecutor(zzfxxVar.a, new Object[0]);
                            }
                        }
                        zzfxoVar3 = zzfxoVar4;
                        hashSet6 = hashSet10;
                        hashMap4 = hashMap5;
                        zzfwxVar = zzfwxVar2;
                    }
                }
                HashSet hashSet12 = hashSet6;
                HashMap hashMap6 = hashMap4;
                zzfxo zzfxoVar5 = zzfxoVar3;
                if (hashSet3.size() > 0) {
                    JSONObject a4 = zzfwyVar.a(null);
                    ArrayList arrayList = new ArrayList();
                    zzfwk zzfwkVar2 = zzfwk.c;
                    if (zzfwkVar2 != null) {
                        Collection unmodifiableCollection = Collections.unmodifiableCollection(zzfwkVar2.b);
                        int size = unmodifiableCollection.size();
                        IdentityHashMap identityHashMap = new IdentityHashMap(size + size + 3);
                        Iterator it6 = unmodifiableCollection.iterator();
                        while (it6.hasNext()) {
                            View view5 = (View) ((zzfvq) it6.next()).c.get();
                            if (view5 != null && view5.isAttachedToWindow() && view5.isShown()) {
                                View view6 = view5;
                                while (true) {
                                    if (view6 == null) {
                                        zzfxo zzfxoVar6 = zzfxoVar5;
                                        Iterator it7 = it6;
                                        View rootView = view5.getRootView();
                                        if (rootView != null && !identityHashMap.containsKey(rootView)) {
                                            identityHashMap.put(rootView, rootView);
                                            float z3 = rootView.getZ();
                                            int size2 = arrayList.size();
                                            while (size2 > 0) {
                                                float f = z3;
                                                int i = size2 - 1;
                                                if (((View) arrayList.get(i)).getZ() > f) {
                                                    size2 = i;
                                                    z3 = f;
                                                } else {
                                                    arrayList.add(size2, rootView);
                                                }
                                            }
                                            arrayList.add(size2, rootView);
                                        }
                                        it6 = it7;
                                        zzfxoVar5 = zzfxoVar6;
                                    } else {
                                        if (view6.getAlpha() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                            break;
                                        }
                                        zzfxo zzfxoVar7 = zzfxoVar5;
                                        Object parent2 = view6.getParent();
                                        Iterator it8 = it6;
                                        if (parent2 instanceof View) {
                                            it6 = it8;
                                            view6 = (View) parent2;
                                            zzfxoVar5 = zzfxoVar7;
                                        } else {
                                            it6 = it8;
                                            zzfxoVar5 = zzfxoVar7;
                                            view6 = null;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    zzfxo zzfxoVar8 = zzfxoVar5;
                    int size3 = arrayList.size();
                    int i2 = 0;
                    while (i2 < size3) {
                        zzfxuVar.a((View) arrayList.get(i2), zzfwyVar.a, a4, false);
                        i2++;
                        zzfwyVar = zzfwyVar;
                    }
                    zzfxg.d(a4);
                    zzfxoVar8.getClass();
                    hashSet = hashSet3;
                    zzfya zzfyaVar = new zzfya(zzfxoVar8, hashSet, a4, nanoTime);
                    zzfxx zzfxxVar2 = zzfxoVar8.b;
                    zzfyaVar.a = zzfxxVar2;
                    ArrayDeque arrayDeque2 = zzfxxVar2.b;
                    arrayDeque2.add(zzfyaVar);
                    if (zzfxxVar2.c == null) {
                        zzfxw zzfxwVar2 = (zzfxw) arrayDeque2.poll();
                        zzfxxVar2.c = zzfxwVar2;
                        if (zzfxwVar2 != null) {
                            zzfxwVar2.executeOnExecutor(zzfxxVar2.a, new Object[0]);
                        }
                    }
                } else {
                    hashSet = hashSet3;
                    zzfxoVar5.getClass();
                    zzfxy zzfxyVar = new zzfxy(zzfxoVar5);
                    zzfxx zzfxxVar3 = zzfxoVar5.b;
                    zzfxyVar.a = zzfxxVar3;
                    ArrayDeque arrayDeque3 = zzfxxVar3.b;
                    arrayDeque3.add(zzfxyVar);
                    if (zzfxxVar3.c == null) {
                        zzfxw zzfxwVar3 = (zzfxw) arrayDeque3.poll();
                        zzfxxVar3.c = zzfxwVar3;
                        if (zzfxwVar3 != null) {
                            zzfxwVar3.executeOnExecutor(zzfxxVar3.a, new Object[0]);
                        }
                    }
                }
                hashMap3.clear();
                hashMap2.clear();
                hashMap6.clear();
                hashSet4.clear();
                hashSet.clear();
                hashSet12.clear();
                hashMap.clear();
                zzfxnVar.j = false;
                hashSet9.clear();
                System.nanoTime();
                ArrayList arrayList2 = zzfxuVar.a;
                if (arrayList2.size() > 0) {
                    Iterator it9 = arrayList2.iterator();
                    while (it9.hasNext()) {
                        zzfxt zzfxtVar = (zzfxt) it9.next();
                        zzfxtVar.zzb();
                        if (zzfxtVar instanceof zzfxs) {
                            ((zzfxs) zzfxtVar).zza();
                        }
                    }
                }
                zzfwu zzfwuVar = zzfwu.d;
                Context context2 = (Context) zzfwuVar.a.get();
                if (context2 == null || (keyguardManager = (KeyguardManager) context2.getSystemService("keyguard")) == null) {
                    return;
                }
                boolean isDeviceLocked = keyguardManager.isDeviceLocked();
                zzfwuVar.a(zzfwuVar.b, isDeviceLocked);
                zzfwuVar.c = isDeviceLocked;
                return;
            case 15:
                Handler handler = zzfxu.h;
                if (handler != null) {
                    handler.post(zzfxu.i);
                    zzfxu.h.postDelayed(zzfxu.j, 200L);
                    return;
                }
                return;
            case 16:
            case 17:
                return;
            case 18:
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                try {
                    ActivityManager.getMyMemoryState(runningAppProcessInfo);
                    new StringBuilder(String.valueOf(runningAppProcessInfo.importance).length() + 17);
                } catch (RuntimeException unused5) {
                }
                if (runningAppProcessInfo.importance >= 400) {
                    z = true;
                    if (new Boolean(z).booleanValue()) {
                        return;
                    }
                    Process.killProcess(Process.myPid());
                    System.exit(0);
                    return;
                }
                z = false;
                if (new Boolean(z).booleanValue()) {
                }
            case 19:
                throw new IllegalStateException("Span was closed by an invalid call to SpanEndSignal.run()");
            default:
                return;
        }
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "EmptyRunnable";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ gl5(int i) {
        this.a = i;
    }

    private final void a() {
    }

    private final void b() {
    }

    private final /* synthetic */ void c() {
    }

    private final void d() {
    }

    private final /* synthetic */ void e() {
    }

    private final /* synthetic */ void f() {
    }

    private final /* synthetic */ void g() {
    }

    private final /* synthetic */ void h() {
    }

    private final void i() {
    }

    private final /* synthetic */ void j() {
    }

    private final void k() {
    }
}
