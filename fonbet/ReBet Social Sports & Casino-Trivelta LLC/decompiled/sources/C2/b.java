package C2;

import B2.g;
import B2.h;
import android.os.Bundle;
import androidx.lifecycle.AbstractC2185j;
import androidx.lifecycle.InterfaceC2191p;
import androidx.lifecycle.InterfaceC2193s;
import androidx.savedstate.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: i, reason: collision with root package name */
    public static final a f1093i = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final g f1094a;

    /* renamed from: b, reason: collision with root package name */
    public final Function0 f1095b;

    /* renamed from: c, reason: collision with root package name */
    public final c f1096c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f1097d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1098e;

    /* renamed from: f, reason: collision with root package name */
    public Bundle f1099f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1100g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1101h;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public b(g owner, Function0 onAttach) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(onAttach, "onAttach");
        this.f1094a = owner;
        this.f1095b = onAttach;
        this.f1096c = new c();
        this.f1097d = new LinkedHashMap();
        this.f1101h = true;
    }

    public static final void g(b bVar, InterfaceC2193s interfaceC2193s, AbstractC2185j.a event) {
        Intrinsics.checkNotNullParameter(interfaceC2193s, "<unused var>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == AbstractC2185j.a.ON_START) {
            bVar.f1101h = true;
        } else if (event == AbstractC2185j.a.ON_STOP) {
            bVar.f1101h = false;
        }
    }

    public final Bundle c(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (!this.f1100g) {
            throw new IllegalStateException("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
        }
        Bundle bundle = this.f1099f;
        if (bundle == null) {
            return null;
        }
        Bundle a10 = B2.b.a(bundle);
        Bundle c10 = B2.b.b(a10, key) ? B2.b.c(a10, key) : null;
        h.e(h.a(bundle), key);
        if (B2.b.f(B2.b.a(bundle))) {
            this.f1099f = null;
        }
        return c10;
    }

    public final a.b d(String key) {
        a.b bVar;
        Intrinsics.checkNotNullParameter(key, "key");
        synchronized (this.f1096c) {
            Iterator it = this.f1097d.entrySet().iterator();
            do {
                bVar = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                a.b bVar2 = (a.b) entry.getValue();
                if (Intrinsics.areEqual(str, key)) {
                    bVar = bVar2;
                }
            } while (bVar == null);
        }
        return bVar;
    }

    public final boolean e() {
        return this.f1101h;
    }

    public final void f() {
        if (this.f1094a.getLifecycle().b() != AbstractC2185j.b.f20391b) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        if (this.f1098e) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        this.f1095b.invoke();
        this.f1094a.getLifecycle().a(new InterfaceC2191p() { // from class: C2.a
            @Override // androidx.lifecycle.InterfaceC2191p
            public final void k(InterfaceC2193s interfaceC2193s, AbstractC2185j.a aVar) {
                b.g(b.this, interfaceC2193s, aVar);
            }
        });
        this.f1098e = true;
    }

    public final void h(Bundle bundle) {
        if (!this.f1098e) {
            f();
        }
        if (this.f1094a.getLifecycle().b().b(AbstractC2185j.b.f20393d)) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + this.f1094a.getLifecycle().b()).toString());
        }
        if (this.f1100g) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        Bundle bundle2 = null;
        if (bundle != null) {
            Bundle a10 = B2.b.a(bundle);
            if (B2.b.b(a10, "androidx.lifecycle.BundlableSavedStateRegistry.key")) {
                bundle2 = B2.b.c(a10, "androidx.lifecycle.BundlableSavedStateRegistry.key");
            }
        }
        this.f1099f = bundle2;
        this.f1100g = true;
    }

    public final void i(Bundle outBundle) {
        Pair[] pairArr;
        Intrinsics.checkNotNullParameter(outBundle, "outBundle");
        Map emptyMap = MapsKt.emptyMap();
        if (emptyMap.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(emptyMap.size());
            for (Map.Entry entry : emptyMap.entrySet()) {
                arrayList.add(TuplesKt.to((String) entry.getKey(), entry.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle a10 = u0.c.a((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        Bundle a11 = h.a(a10);
        Bundle bundle = this.f1099f;
        if (bundle != null) {
            h.b(a11, bundle);
        }
        synchronized (this.f1096c) {
            try {
                for (Map.Entry entry2 : this.f1097d.entrySet()) {
                    h.c(a11, (String) entry2.getKey(), ((a.b) entry2.getValue()).a());
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (B2.b.f(B2.b.a(a10))) {
            return;
        }
        h.c(h.a(outBundle), "androidx.lifecycle.BundlableSavedStateRegistry.key", a10);
    }

    public final void j(String key, a.b provider) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(provider, "provider");
        synchronized (this.f1096c) {
            if (this.f1097d.containsKey(key)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            this.f1097d.put(key, provider);
            Unit unit = Unit.INSTANCE;
        }
    }
}
