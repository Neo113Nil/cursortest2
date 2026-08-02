package j;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.result.ActivityResult;
import androidx.lifecycle.AbstractC2185j;
import androidx.lifecycle.InterfaceC2191p;
import androidx.lifecycle.InterfaceC2193s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import k.AbstractC5140a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.random.Random;
import kotlin.sequences.SequencesKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: h, reason: collision with root package name */
    public static final b f53593h = new b(null);

    /* renamed from: a, reason: collision with root package name */
    public final Map f53594a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final Map f53595b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final Map f53596c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final List f53597d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final transient Map f53598e = new LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final Map f53599f = new LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f53600g = new Bundle();

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC5085a f53601a;

        /* renamed from: b, reason: collision with root package name */
        public final AbstractC5140a f53602b;

        public a(InterfaceC5085a callback, AbstractC5140a contract) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            Intrinsics.checkNotNullParameter(contract, "contract");
            this.f53601a = callback;
            this.f53602b = contract;
        }

        public final InterfaceC5085a a() {
            return this.f53601a;
        }

        public final AbstractC5140a b() {
            return this.f53602b;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public b() {
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final AbstractC2185j f53603a;

        /* renamed from: b, reason: collision with root package name */
        public final List f53604b;

        public c(AbstractC2185j lifecycle) {
            Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
            this.f53603a = lifecycle;
            this.f53604b = new ArrayList();
        }

        public final void a(InterfaceC2191p observer) {
            Intrinsics.checkNotNullParameter(observer, "observer");
            this.f53603a.a(observer);
            this.f53604b.add(observer);
        }

        public final void b() {
            Iterator it = this.f53604b.iterator();
            while (it.hasNext()) {
                this.f53603a.d((InterfaceC2191p) it.next());
            }
            this.f53604b.clear();
        }
    }

    /* renamed from: j.d$d, reason: collision with other inner class name */
    public static final class C0772d extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final C0772d f53605d = new C0772d();

        public C0772d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            return Integer.valueOf(Random.INSTANCE.nextInt(2147418112) + PKIFailureInfo.notAuthorized);
        }
    }

    public static final class e extends AbstractC5086b {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f53607b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AbstractC5140a f53608c;

        public e(String str, AbstractC5140a abstractC5140a) {
            this.f53607b = str;
            this.f53608c = abstractC5140a;
        }

        @Override // j.AbstractC5086b
        public AbstractC5140a a() {
            return this.f53608c;
        }

        @Override // j.AbstractC5086b
        public void c(Object obj, androidx.core.app.c cVar) {
            Object obj2 = d.this.f53595b.get(this.f53607b);
            AbstractC5140a abstractC5140a = this.f53608c;
            if (obj2 != null) {
                int intValue = ((Number) obj2).intValue();
                d.this.f53597d.add(this.f53607b);
                try {
                    d.this.i(intValue, this.f53608c, obj, cVar);
                    return;
                } catch (Exception e10) {
                    d.this.f53597d.remove(this.f53607b);
                    throw e10;
                }
            }
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + abstractC5140a + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }

        @Override // j.AbstractC5086b
        public void d() {
            d.this.p(this.f53607b);
        }
    }

    public static final class f extends AbstractC5086b {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f53610b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AbstractC5140a f53611c;

        public f(String str, AbstractC5140a abstractC5140a) {
            this.f53610b = str;
            this.f53611c = abstractC5140a;
        }

        @Override // j.AbstractC5086b
        public AbstractC5140a a() {
            return this.f53611c;
        }

        @Override // j.AbstractC5086b
        public void c(Object obj, androidx.core.app.c cVar) {
            Object obj2 = d.this.f53595b.get(this.f53610b);
            AbstractC5140a abstractC5140a = this.f53611c;
            if (obj2 != null) {
                int intValue = ((Number) obj2).intValue();
                d.this.f53597d.add(this.f53610b);
                try {
                    d.this.i(intValue, this.f53611c, obj, cVar);
                    return;
                } catch (Exception e10) {
                    d.this.f53597d.remove(this.f53610b);
                    throw e10;
                }
            }
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + abstractC5140a + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }

        @Override // j.AbstractC5086b
        public void d() {
            d.this.p(this.f53610b);
        }
    }

    public static final void n(d dVar, String str, InterfaceC5085a interfaceC5085a, AbstractC5140a abstractC5140a, InterfaceC2193s interfaceC2193s, AbstractC2185j.a event) {
        Intrinsics.checkNotNullParameter(interfaceC2193s, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (AbstractC2185j.a.ON_START != event) {
            if (AbstractC2185j.a.ON_STOP == event) {
                dVar.f53598e.remove(str);
                return;
            } else {
                if (AbstractC2185j.a.ON_DESTROY == event) {
                    dVar.p(str);
                    return;
                }
                return;
            }
        }
        dVar.f53598e.put(str, new a(interfaceC5085a, abstractC5140a));
        if (dVar.f53599f.containsKey(str)) {
            Object obj = dVar.f53599f.get(str);
            dVar.f53599f.remove(str);
            interfaceC5085a.a(obj);
        }
        ActivityResult activityResult = (ActivityResult) u0.b.a(dVar.f53600g, str, ActivityResult.class);
        if (activityResult != null) {
            dVar.f53600g.remove(str);
            interfaceC5085a.a(abstractC5140a.parseResult(activityResult.getResultCode(), activityResult.getData()));
        }
    }

    public final void d(int i10, String str) {
        this.f53594a.put(Integer.valueOf(i10), str);
        this.f53595b.put(str, Integer.valueOf(i10));
    }

    public final boolean e(int i10, int i11, Intent intent) {
        String str = (String) this.f53594a.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        g(str, i11, intent, (a) this.f53598e.get(str));
        return true;
    }

    public final boolean f(int i10, Object obj) {
        String str = (String) this.f53594a.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        a aVar = (a) this.f53598e.get(str);
        if ((aVar != null ? aVar.a() : null) == null) {
            this.f53600g.remove(str);
            this.f53599f.put(str, obj);
            return true;
        }
        InterfaceC5085a a10 = aVar.a();
        Intrinsics.checkNotNull(a10, "null cannot be cast to non-null type androidx.activity.result.ActivityResultCallback<O of androidx.activity.result.ActivityResultRegistry.dispatchResult>");
        if (!this.f53597d.remove(str)) {
            return true;
        }
        a10.a(obj);
        return true;
    }

    public final void g(String str, int i10, Intent intent, a aVar) {
        if ((aVar != null ? aVar.a() : null) == null || !this.f53597d.contains(str)) {
            this.f53599f.remove(str);
            this.f53600g.putParcelable(str, new ActivityResult(i10, intent));
        } else {
            aVar.a().a(aVar.b().parseResult(i10, intent));
            this.f53597d.remove(str);
        }
    }

    public final int h() {
        for (Number number : SequencesKt.generateSequence(C0772d.f53605d)) {
            if (!this.f53594a.containsKey(Integer.valueOf(number.intValue()))) {
                return number.intValue();
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    public abstract void i(int i10, AbstractC5140a abstractC5140a, Object obj, androidx.core.app.c cVar);

    public final void j(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
        if (stringArrayList == null || integerArrayList == null) {
            return;
        }
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
        if (stringArrayList2 != null) {
            this.f53597d.addAll(stringArrayList2);
        }
        Bundle bundle2 = bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
        if (bundle2 != null) {
            this.f53600g.putAll(bundle2);
        }
        int size = stringArrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            String str = stringArrayList.get(i10);
            if (this.f53595b.containsKey(str)) {
                Integer num = (Integer) this.f53595b.remove(str);
                if (!this.f53600g.containsKey(str)) {
                    TypeIntrinsics.asMutableMap(this.f53594a).remove(num);
                }
            }
            Integer num2 = integerArrayList.get(i10);
            Intrinsics.checkNotNullExpressionValue(num2, "rcs[i]");
            int intValue = num2.intValue();
            String str2 = stringArrayList.get(i10);
            Intrinsics.checkNotNullExpressionValue(str2, "keys[i]");
            d(intValue, str2);
        }
    }

    public final void k(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        outState.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(this.f53595b.values()));
        outState.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(this.f53595b.keySet()));
        outState.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(this.f53597d));
        outState.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(this.f53600g));
    }

    public final AbstractC5086b l(final String key, InterfaceC2193s lifecycleOwner, final AbstractC5140a contract, final InterfaceC5085a callback) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(callback, "callback");
        AbstractC2185j lifecycle = lifecycleOwner.getLifecycle();
        if (lifecycle.b().b(AbstractC2185j.b.f20393d)) {
            throw new IllegalStateException(("LifecycleOwner " + lifecycleOwner + " is attempting to register while current state is " + lifecycle.b() + ". LifecycleOwners must call register before they are STARTED.").toString());
        }
        o(key);
        c cVar = (c) this.f53596c.get(key);
        if (cVar == null) {
            cVar = new c(lifecycle);
        }
        cVar.a(new InterfaceC2191p() { // from class: j.c
            @Override // androidx.lifecycle.InterfaceC2191p
            public final void k(InterfaceC2193s interfaceC2193s, AbstractC2185j.a aVar) {
                d.n(d.this, key, callback, contract, interfaceC2193s, aVar);
            }
        });
        this.f53596c.put(key, cVar);
        return new e(key, contract);
    }

    public final AbstractC5086b m(String key, AbstractC5140a contract, InterfaceC5085a callback) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(callback, "callback");
        o(key);
        this.f53598e.put(key, new a(callback, contract));
        if (this.f53599f.containsKey(key)) {
            Object obj = this.f53599f.get(key);
            this.f53599f.remove(key);
            callback.a(obj);
        }
        ActivityResult activityResult = (ActivityResult) u0.b.a(this.f53600g, key, ActivityResult.class);
        if (activityResult != null) {
            this.f53600g.remove(key);
            callback.a(contract.parseResult(activityResult.getResultCode(), activityResult.getData()));
        }
        return new f(key, contract);
    }

    public final void o(String str) {
        if (((Integer) this.f53595b.get(str)) != null) {
            return;
        }
        d(h(), str);
    }

    public final void p(String key) {
        Integer num;
        Intrinsics.checkNotNullParameter(key, "key");
        if (!this.f53597d.contains(key) && (num = (Integer) this.f53595b.remove(key)) != null) {
            this.f53594a.remove(num);
        }
        this.f53598e.remove(key);
        if (this.f53599f.containsKey(key)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + key + ": " + this.f53599f.get(key));
            this.f53599f.remove(key);
        }
        if (this.f53600g.containsKey(key)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + key + ": " + ((ActivityResult) u0.b.a(this.f53600g, key, ActivityResult.class)));
            this.f53600g.remove(key);
        }
        c cVar = (c) this.f53596c.get(key);
        if (cVar != null) {
            cVar.b();
            this.f53596c.remove(key);
        }
    }
}
