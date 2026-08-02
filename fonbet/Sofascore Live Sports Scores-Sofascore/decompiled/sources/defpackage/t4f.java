package defpackage;

import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.s;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import com.inmobi.media.C3278a2;
import com.inmobi.media.V8;
import com.inmobi.media.Y5;
import com.ironsource.C3990ag;
import com.ironsource.P8;
import com.mbridge.msdk.config.component.style.StyleCpt;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.customui.views.YouTubePlayerSeekBar;
import com.sofascore.results.settings.PreferenceFragment;
import com.unity3d.ads.InitializationListener;
import com.unity3d.ads.core.domain.InternalLoadListener;
import com.unity3d.services.ads.UnityAdsImplementation;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class t4f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t4f(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View findFocus;
        int i = this.a;
        boolean z = true;
        String str = null;
        Map map = null;
        Object obj = this.b;
        switch (i) {
            case 0:
                PreferenceFragment preferenceFragment = (PreferenceFragment) obj;
                if (preferenceFragment.isAdded()) {
                    s parentFragmentManager = preferenceFragment.getParentFragmentManager();
                    parentFragmentManager.getClass();
                    parentFragmentManager.x(new ep8(parentFragmentManager, null, -1, 0), false);
                    return;
                }
                return;
            case 1:
                b8f b8fVar = (b8f) obj;
                y6b y6bVar = b8fVar.f;
                if (b8fVar.b == 0) {
                    b8fVar.c = true;
                    y6bVar.g(d6b.ON_PAUSE);
                }
                if (b8fVar.a == 0 && b8fVar.c) {
                    y6bVar.g(d6b.ON_STOP);
                    b8fVar.d = true;
                    return;
                }
                return;
            case 2:
                ((blf) obj).f();
                return;
            case 3:
                c4g c4gVar = ((b4g) obj).l;
                c4gVar.j.a(new kac(c4gVar, 15));
                return;
            case 4:
                l5g.setRippleState$lambda$1((l5g) obj);
                return;
            case 5:
                ((InitializationListener) obj).onInitializationComplete(null);
                return;
            case 6:
                ejg ejgVar = (ejg) obj;
                synchronized (((ArrayDeque) ejgVar.b)) {
                    SharedPreferences.Editor edit = ((SharedPreferences) ejgVar.c).edit();
                    StringBuilder sb = new StringBuilder();
                    Iterator it = ((ArrayDeque) ejgVar.b).iterator();
                    while (it.hasNext()) {
                        sb.append((String) it.next());
                        sb.append(BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
                    }
                    edit.putString("topic_operation_queue", sb.toString()).apply();
                }
                return;
            case 7:
                a02 a02Var = (a02) obj;
                a02Var.c = false;
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) a02Var.e;
                jsk jskVar = sideSheetBehavior.i;
                if (jskVar != null && jskVar.f()) {
                    a02Var.b(a02Var.b);
                    return;
                } else {
                    if (sideSheetBehavior.h == 2) {
                        sideSheetBehavior.x(a02Var.b);
                        return;
                    }
                    return;
                }
            case 8:
                toh tohVar = (toh) obj;
                if (System.nanoTime() > tohVar.k.get()) {
                    tohVar.j.a();
                    p4d p4dVar = tohVar.a;
                    ilg ilgVar = new ilg(18);
                    p4dVar.getClass();
                    p4dVar.e0(new n4d(p4dVar, ilgVar));
                    try {
                        p4d p4dVar2 = tohVar.a;
                        dm8 dm8Var = dm8.c;
                        AtomicBoolean atomicBoolean = p4dVar2.H;
                        if (atomicBoolean.compareAndSet(false, true)) {
                            if (dm8Var == null) {
                                try {
                                    dm8Var = dm8.b;
                                } finally {
                                    atomicBoolean.set(false);
                                }
                            }
                            p4dVar2.p(dm8Var);
                            atomicBoolean.set(false);
                            return;
                        }
                        return;
                    } catch (IOException unused) {
                        return;
                    } catch (InterruptedException unused2) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                }
                return;
            case 9:
                nxh nxhVar = (nxh) obj;
                int i2 = nxh.l;
                Surface surface = nxhVar.h;
                if (surface != null) {
                    Iterator it2 = nxhVar.a.iterator();
                    while (it2.hasNext()) {
                        vg6 vg6Var = ((mg6) it2.next()).a;
                        int i3 = vg6.r0;
                        vg6Var.c0(null);
                    }
                }
                SurfaceTexture surfaceTexture = nxhVar.g;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
                if (surface != null) {
                    surface.release();
                }
                nxhVar.g = null;
                nxhVar.h = null;
                return;
            case 10:
                mxh mxhVar = (mxh) obj;
                int i4 = mxh.l;
                Surface surface2 = mxhVar.h;
                if (surface2 != null) {
                    Iterator it3 = mxhVar.a.iterator();
                    while (it3.hasNext()) {
                        ((lg6) it3.next()).a.M(null);
                    }
                }
                SurfaceTexture surfaceTexture2 = mxhVar.g;
                if (surfaceTexture2 != null) {
                    surfaceTexture2.release();
                }
                if (surface2 != null) {
                    surface2.release();
                }
                mxhVar.g = null;
                mxhVar.h = null;
                return;
            case 11:
                ((chi) obj).c();
                return;
            case 12:
                ((StyleCpt) obj).m();
                return;
            case 13:
                ((cji) obj).m();
                return;
            case 14:
                int[] iArr = SwipeRefreshLayout.M;
                ((SwipeRefreshLayout) obj).l();
                return;
            case 15:
                nqi nqiVar = ((pqi) obj).a;
                ViewParent parent = nqiVar.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(nqiVar);
                    return;
                }
                return;
            case 16:
                int[][] iArr2 = TextInputLayout.D0;
                ((TextInputLayout) obj).e.requestLayout();
                return;
            case 17:
                idj idjVar = (idj) obj;
                ejg ejgVar2 = idjVar.b;
                idjVar.n = null;
                i1d i1dVar = idjVar.m;
                View view = idjVar.a;
                if (!view.isFocused() && (findFocus = view.getRootView().findFocus()) != null && findFocus.onCheckIsTextEditor()) {
                    i1dVar.n();
                    return;
                }
                fsf fsfVar = new fsf();
                fsf fsfVar2 = new fsf();
                Object[] objArr = i1dVar.a;
                int i5 = i1dVar.c;
                for (int i6 = 0; i6 < i5; i6++) {
                    hdj hdjVar = (hdj) objArr[i6];
                    int ordinal = hdjVar.ordinal();
                    if (ordinal == 0) {
                        Boolean bool = Boolean.TRUE;
                        fsfVar.a = bool;
                        fsfVar2.a = bool;
                    } else if (ordinal == 1) {
                        Boolean bool2 = Boolean.FALSE;
                        fsfVar.a = bool2;
                        fsfVar2.a = bool2;
                    } else if (ordinal != 2 && ordinal != 3) {
                        zzl.b();
                        return;
                    } else if (!Intrinsics.c(fsfVar.a, Boolean.FALSE)) {
                        fsfVar2.a = Boolean.valueOf(hdjVar == hdj.c);
                    }
                }
                i1dVar.n();
                if (Intrinsics.c(fsfVar.a, Boolean.TRUE)) {
                    ((InputMethodManager) ((joa) ejgVar2.b).getValue()).restartInput((View) ejgVar2.c);
                }
                Boolean bool3 = (Boolean) fsfVar2.a;
                if (bool3 != null) {
                    if (bool3.booleanValue()) {
                        ((yia) ((bka) ejgVar2.d).b).j();
                    } else {
                        ((yia) ((bka) ejgVar2.d).b).g();
                    }
                }
                if (Intrinsics.c(fsfVar.a, Boolean.FALSE)) {
                    ((InputMethodManager) ((joa) ejgVar2.b).getValue()).restartInput((View) ejgVar2.c);
                    return;
                }
                return;
            case 18:
                UnityAdsImplementation.lambda$load$2((InternalLoadListener) obj);
                return;
            case 19:
                r18 r18Var = (r18) obj;
                synchronized (((AtomicMarkableReference) r18Var.g)) {
                    try {
                        if (((AtomicMarkableReference) r18Var.g).isMarked()) {
                            str = (String) ((AtomicMarkableReference) r18Var.g).getReference();
                            ((AtomicMarkableReference) r18Var.g).set(str, false);
                        } else {
                            z = false;
                        }
                    } finally {
                    }
                }
                if (z) {
                    ((hic) r18Var.b).j((String) r18Var.a, str);
                    return;
                }
                return;
            case 20:
                en0 en0Var = (en0) obj;
                ((AtomicReference) en0Var.d).set(null);
                synchronized (en0Var) {
                    if (((AtomicMarkableReference) en0Var.c).isMarked()) {
                        wja wjaVar = (wja) ((AtomicMarkableReference) en0Var.c).getReference();
                        synchronized (wjaVar) {
                            map = Collections.unmodifiableMap(new HashMap(wjaVar.a));
                        }
                        AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) en0Var.c;
                        atomicMarkableReference.set((wja) atomicMarkableReference.getReference(), false);
                    }
                }
                if (map != null) {
                    r18 r18Var2 = (r18) en0Var.e;
                    ((hic) r18Var2.b).h((String) r18Var2.a, map, en0Var.b);
                    return;
                }
                return;
            case 21:
                V8.a((Y5) obj);
                return;
            case 22:
                ((xpk) obj).i();
                return;
            case 23:
                wtk wtkVar = (wtk) obj;
                if (cw3.a.contains(wtk.class)) {
                    return;
                }
                try {
                    WeakReference weakReference = wtkVar.a;
                    View z2 = pd0.z((Activity) weakReference.get());
                    Activity activity = (Activity) weakReference.get();
                    if (z2 != null && activity != null) {
                        Iterator it4 = gmi.a(z2).iterator();
                        while (it4.hasNext()) {
                            View view2 = (View) it4.next();
                            if (!p4h.v(view2)) {
                                String d = gmi.d(view2);
                                if (d.length() > 0 && d.length() <= 300) {
                                    HashSet hashSet = auk.e;
                                    String localClassName = activity.getLocalClassName();
                                    localClassName.getClass();
                                    cga.p(view2, z2, localClassName);
                                }
                            }
                        }
                        return;
                    }
                    return;
                } catch (Exception unused3) {
                    return;
                } catch (Throwable th) {
                    cw3.a(wtk.class, th);
                    return;
                }
            case 24:
                gbl gblVar = (gbl) obj;
                gblVar.a.getAction();
                gblVar.b.trySetResult(null);
                return;
            case 25:
                ujg ujgVar = (ujg) obj;
                ((mlg) ujgVar.e).n(new bnk(ujgVar, 6));
                return;
            case 26:
                ((YouTubePlayerSeekBar) obj).videoDurationTextView.setText("");
                return;
            case 27:
                C3278a2.a((C3278a2) obj);
                return;
            case 28:
                C3990ag.e((C3990ag) obj);
                return;
            default:
                C3990ag.a((P8) obj);
                return;
        }
    }
}
