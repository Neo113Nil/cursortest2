package androidx.fragment.app;

import android.os.Bundle;
import defpackage.yhk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class v {
    public final ArrayList a = new ArrayList();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public t d;

    public final void a(Fragment fragment) {
        if (this.a.contains(fragment)) {
            yhk.r(fragment, "Fragment already added: ");
            return;
        }
        synchronized (this.a) {
            this.a.add(fragment);
        }
        fragment.mAdded = true;
    }

    public final Fragment b(String str) {
        u uVar = (u) this.b.get(str);
        if (uVar != null) {
            return uVar.c;
        }
        return null;
    }

    public final Fragment c(String str) {
        Fragment findFragmentByWho;
        for (u uVar : this.b.values()) {
            if (uVar != null && (findFragmentByWho = uVar.c.findFragmentByWho(str)) != null) {
                return findFragmentByWho;
            }
        }
        return null;
    }

    public final ArrayList d() {
        ArrayList arrayList = new ArrayList();
        for (u uVar : this.b.values()) {
            if (uVar != null) {
                arrayList.add(uVar);
            }
        }
        return arrayList;
    }

    public final ArrayList e() {
        ArrayList arrayList = new ArrayList();
        for (u uVar : this.b.values()) {
            if (uVar != null) {
                arrayList.add(uVar.c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public final List f() {
        ArrayList arrayList;
        if (this.a.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (this.a) {
            arrayList = new ArrayList(this.a);
        }
        return arrayList;
    }

    public final void g(u uVar) {
        Fragment fragment = uVar.c;
        String str = fragment.mWho;
        HashMap hashMap = this.b;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(fragment.mWho, uVar);
        if (fragment.mRetainInstanceChangedWhileDetached) {
            boolean z = fragment.mRetainInstance;
            t tVar = this.d;
            if (z) {
                tVar.f(fragment);
            } else {
                tVar.h(fragment);
            }
            fragment.mRetainInstanceChangedWhileDetached = false;
        }
        if (s.O(2)) {
            fragment.toString();
        }
    }

    public final void h(u uVar) {
        Fragment fragment = uVar.c;
        if (fragment.mRetainInstance) {
            this.d.h(fragment);
        }
        String str = fragment.mWho;
        HashMap hashMap = this.b;
        if (hashMap.get(str) == uVar && ((u) hashMap.put(fragment.mWho, null)) != null && s.O(2)) {
            fragment.toString();
        }
    }

    public final Bundle i(Bundle bundle, String str) {
        HashMap hashMap = this.c;
        return bundle != null ? (Bundle) hashMap.put(str, bundle) : (Bundle) hashMap.remove(str);
    }
}
