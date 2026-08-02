package androidx.lifecycle;

import android.os.Bundle;
import androidx.savedstate.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class M implements a.b {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.savedstate.a f20282a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f20283b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f20284c;

    /* renamed from: d, reason: collision with root package name */
    public final Lazy f20285d;

    public M(androidx.savedstate.a savedStateRegistry, final W viewModelStoreOwner) {
        Intrinsics.checkNotNullParameter(savedStateRegistry, "savedStateRegistry");
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "viewModelStoreOwner");
        this.f20282a = savedStateRegistry;
        this.f20285d = LazyKt.lazy(new Function0() { // from class: androidx.lifecycle.L
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                SavedStateHandlesVM f10;
                f10 = M.f(W.this);
                return f10;
            }
        });
    }

    public static final SavedStateHandlesVM f(W w10) {
        return K.e(w10);
    }

    @Override // androidx.savedstate.a.b
    public Bundle a() {
        Pair[] pairArr;
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
        Bundle a11 = B2.h.a(a10);
        Bundle bundle = this.f20284c;
        if (bundle != null) {
            B2.h.b(a11, bundle);
        }
        for (Map.Entry entry2 : d().getHandles().entrySet()) {
            String str = (String) entry2.getKey();
            Bundle a12 = ((J) entry2.getValue()).b().a();
            if (!B2.b.f(B2.b.a(a12))) {
                B2.h.c(a11, str, a12);
            }
        }
        this.f20283b = false;
        return a10;
    }

    public final Bundle c(String key) {
        Pair[] pairArr;
        Intrinsics.checkNotNullParameter(key, "key");
        e();
        Bundle bundle = this.f20284c;
        if (bundle == null || !B2.b.b(B2.b.a(bundle), key)) {
            return null;
        }
        Bundle d10 = B2.b.d(B2.b.a(bundle), key);
        if (d10 == null) {
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
            d10 = u0.c.a((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
            B2.h.a(d10);
        }
        B2.h.e(B2.h.a(bundle), key);
        if (B2.b.f(B2.b.a(bundle))) {
            this.f20284c = null;
        }
        return d10;
    }

    public final SavedStateHandlesVM d() {
        return (SavedStateHandlesVM) this.f20285d.getValue();
    }

    public final void e() {
        Pair[] pairArr;
        if (this.f20283b) {
            return;
        }
        Bundle a10 = this.f20282a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
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
        Bundle a11 = u0.c.a((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        Bundle a12 = B2.h.a(a11);
        Bundle bundle = this.f20284c;
        if (bundle != null) {
            B2.h.b(a12, bundle);
        }
        if (a10 != null) {
            B2.h.b(a12, a10);
        }
        this.f20284c = a11;
        this.f20283b = true;
        d();
    }
}
