package defpackage;

import androidx.fragment.app.Fragment;
import com.google.firebase.perf.metrics.Trace;
import java.util.HashMap;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class xp8 extends ap8 {
    public static final l10 f = l10.c();
    public final WeakHashMap a = new WeakHashMap();
    public final wxf b;
    public final fyj c;
    public final oe0 d;
    public final ir8 e;

    public xp8(wxf wxfVar, fyj fyjVar, oe0 oe0Var, ir8 ir8Var) {
        this.b = wxfVar;
        this.c = fyjVar;
        this.d = oe0Var;
        this.e = ir8Var;
    }

    @Override // defpackage.ap8
    public final void b(Fragment fragment) {
        jvd jvdVar;
        Object[] objArr = {fragment.getClass().getSimpleName()};
        l10 l10Var = f;
        l10Var.a("FragmentMonitor %s.onFragmentPaused ", objArr);
        WeakHashMap weakHashMap = this.a;
        if (!weakHashMap.containsKey(fragment)) {
            l10Var.e("FragmentMonitor: missed a fragment trace from %s", fragment.getClass().getSimpleName());
            return;
        }
        Trace trace = (Trace) weakHashMap.get(fragment);
        weakHashMap.remove(fragment);
        ir8 ir8Var = this.e;
        HashMap hashMap = ir8Var.c;
        l10 l10Var2 = ir8.e;
        if (!ir8Var.d) {
            l10Var2.getClass();
            jvdVar = new jvd();
        } else if (hashMap.containsKey(fragment)) {
            hr8 hr8Var = (hr8) hashMap.remove(fragment);
            jvd a = ir8Var.a();
            if (a.b()) {
                hr8 hr8Var2 = (hr8) a.a();
                jvdVar = new jvd(new hr8(hr8Var2.a - hr8Var.a, hr8Var2.b - hr8Var.b, hr8Var2.c - hr8Var.c));
            } else {
                l10Var2.a("stopFragment(%s): snapshot() failed", fragment.getClass().getSimpleName());
                jvdVar = new jvd();
            }
        } else {
            l10Var2.a("Sub-recording associated with key %s was not started or does not exist", fragment.getClass().getSimpleName());
            jvdVar = new jvd();
        }
        if (!jvdVar.b()) {
            l10Var.e("onFragmentPaused: recorder failed to trace %s", fragment.getClass().getSimpleName());
        } else {
            stg.a(trace, (hr8) jvdVar.a());
            trace.stop();
        }
    }

    @Override // defpackage.ap8
    public final void c(Fragment fragment) {
        f.a("FragmentMonitor %s.onFragmentResumed", fragment.getClass().getSimpleName());
        Trace trace = new Trace("_st_".concat(fragment.getClass().getSimpleName()), this.c, this.b, this.d);
        trace.start();
        trace.putAttribute("Parent_fragment", fragment.getParentFragment() == null ? "No parent" : fragment.getParentFragment().getClass().getSimpleName());
        if (fragment.getActivity() != null) {
            trace.putAttribute("Hosting_activity", fragment.getActivity().getClass().getSimpleName());
        }
        this.a.put(fragment, trace);
        ir8 ir8Var = this.e;
        HashMap hashMap = ir8Var.c;
        l10 l10Var = ir8.e;
        if (!ir8Var.d) {
            l10Var.getClass();
            return;
        }
        if (hashMap.containsKey(fragment)) {
            l10Var.a("Cannot start sub-recording because one is already ongoing with the key %s", fragment.getClass().getSimpleName());
            return;
        }
        jvd a = ir8Var.a();
        if (a.b()) {
            hashMap.put(fragment, (hr8) a.a());
        } else {
            l10Var.a("startFragment(%s): snapshot() failed", fragment.getClass().getSimpleName());
        }
    }
}
