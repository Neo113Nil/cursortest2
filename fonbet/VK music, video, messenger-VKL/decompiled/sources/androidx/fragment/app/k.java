package androidx.fragment.app;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: FragmentStore.java */
/* loaded from: classes.dex */
public final class k {
    public final ArrayList<Fragment> a = new ArrayList<>();
    public final HashMap<String, j> b = new HashMap<>();
    public final HashMap<String, Bundle> c = new HashMap<>();
    public i d;

    public final void a(@NonNull Fragment fragment) {
        if (this.a.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (this.a) {
            this.a.add(fragment);
        }
        fragment.mAdded = true;
    }

    @Nullable
    public final Fragment b(@NonNull String str) {
        j jVar = this.b.get(str);
        if (jVar != null) {
            return jVar.c;
        }
        return null;
    }

    @Nullable
    public final Fragment c(@NonNull String str) {
        Fragment findFragmentByWho;
        for (j jVar : this.b.values()) {
            if (jVar != null && (findFragmentByWho = jVar.c.findFragmentByWho(str)) != null) {
                return findFragmentByWho;
            }
        }
        return null;
    }

    @NonNull
    public final ArrayList d() {
        ArrayList arrayList = new ArrayList();
        for (j jVar : this.b.values()) {
            if (jVar != null) {
                arrayList.add(jVar);
            }
        }
        return arrayList;
    }

    @NonNull
    public final ArrayList e() {
        ArrayList arrayList = new ArrayList();
        for (j jVar : this.b.values()) {
            if (jVar != null) {
                arrayList.add(jVar.c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    @NonNull
    public final List<Fragment> f() {
        ArrayList arrayList;
        if (this.a.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (this.a) {
            arrayList = new ArrayList(this.a);
        }
        return arrayList;
    }

    public final void g(@NonNull j jVar) {
        Fragment fragment = jVar.c;
        String str = fragment.mWho;
        HashMap<String, j> hashMap = this.b;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(fragment.mWho, jVar);
        if (fragment.mRetainInstanceChangedWhileDetached) {
            if (fragment.mRetainInstance) {
                this.d.i(fragment);
            } else {
                this.d.k(fragment);
            }
            fragment.mRetainInstanceChangedWhileDetached = false;
        }
        if (FragmentManager.P(2)) {
            fragment.toString();
        }
    }

    public final void h(@NonNull j jVar) {
        Fragment fragment = jVar.c;
        if (fragment.mRetainInstance) {
            this.d.k(fragment);
        }
        String str = fragment.mWho;
        HashMap<String, j> hashMap = this.b;
        if (hashMap.get(str) == jVar && hashMap.put(fragment.mWho, null) != null && FragmentManager.P(2)) {
            fragment.toString();
        }
    }

    @Nullable
    public final Bundle i(@Nullable Bundle bundle, @NonNull String str) {
        HashMap<String, Bundle> hashMap = this.c;
        return bundle != null ? hashMap.put(str, bundle) : hashMap.remove(str);
    }
}
