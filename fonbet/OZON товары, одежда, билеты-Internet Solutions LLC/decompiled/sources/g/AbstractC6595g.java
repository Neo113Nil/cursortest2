package g;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.G;
import androidx.lifecycle.J;
import h.AbstractC6755a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.U;
import org.jetbrains.annotations.NotNull;

/* renamed from: g.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6595g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f63657a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f63658b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f63659c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ArrayList f63660d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final transient LinkedHashMap f63661e = new LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f63662f = new LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final Bundle f63663g = new Bundle();

    /* renamed from: g.g$a */
    private static final class a<O> {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final InterfaceC6590b<O> f63664a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final AbstractC6755a<?, O> f63665b;

        public a(@NotNull AbstractC6755a contract, @NotNull InterfaceC6590b callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            Intrinsics.checkNotNullParameter(contract, "contract");
            this.f63664a = callback;
            this.f63665b = contract;
        }

        @NotNull
        public final InterfaceC6590b<O> a() {
            return this.f63664a;
        }

        @NotNull
        public final AbstractC6755a<?, O> b() {
            return this.f63665b;
        }
    }

    /* renamed from: g.g$b */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final AbstractC5434v f63666a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final ArrayList f63667b;

        public b(@NotNull AbstractC5434v lifecycle) {
            Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
            this.f63666a = lifecycle;
            this.f63667b = new ArrayList();
        }

        public final void a(@NotNull C6593e observer) {
            Intrinsics.checkNotNullParameter(observer, "observer");
            this.f63666a.a(observer);
            this.f63667b.add(observer);
        }

        public final void b() {
            ArrayList arrayList = this.f63667b;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.f63666a.e((G) it.next());
            }
            arrayList.clear();
        }
    }

    public static void a(AbstractC6595g this$0, String key, InterfaceC6590b callback, AbstractC6755a contract, J j11, AbstractC5434v.a event) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(key, "$key");
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNullParameter(contract, "$contract");
        Intrinsics.checkNotNullParameter(j11, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (AbstractC5434v.a.ON_START != event) {
            if (AbstractC5434v.a.ON_STOP == event) {
                this$0.f63661e.remove(key);
                return;
            } else {
                if (AbstractC5434v.a.ON_DESTROY == event) {
                    this$0.l(key);
                    return;
                }
                return;
            }
        }
        this$0.f63661e.put(key, new a(contract, callback));
        LinkedHashMap linkedHashMap = this$0.f63662f;
        if (linkedHashMap.containsKey(key)) {
            Object obj = linkedHashMap.get(key);
            linkedHashMap.remove(key);
            callback.onActivityResult(obj);
        }
        Bundle bundle = this$0.f63663g;
        C6589a c6589a = (C6589a) androidx.core.os.c.a(bundle, key, C6589a.class);
        if (c6589a != null) {
            bundle.remove(key);
            callback.onActivityResult(contract.c(c6589a.b(), c6589a.a()));
        }
    }

    private final void k(String str) {
        LinkedHashMap linkedHashMap = this.f63658b;
        if (((Integer) linkedHashMap.get(str)) != null) {
            return;
        }
        Iterator it = kotlin.sequences.l.p(C6596h.f63668b).iterator();
        while (it.hasNext()) {
            Number number = (Number) it.next();
            int intValue = number.intValue();
            LinkedHashMap linkedHashMap2 = this.f63657a;
            if (!linkedHashMap2.containsKey(Integer.valueOf(intValue))) {
                int intValue2 = number.intValue();
                linkedHashMap2.put(Integer.valueOf(intValue2), str);
                linkedHashMap.put(str, Integer.valueOf(intValue2));
                return;
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    public final void d(int i11, Object obj) {
        String str = (String) this.f63657a.get(Integer.valueOf(i11));
        if (str == null) {
            return;
        }
        a aVar = (a) this.f63661e.get(str);
        if ((aVar != null ? aVar.a() : null) == null) {
            this.f63663g.remove(str);
            this.f63662f.put(str, obj);
            return;
        }
        InterfaceC6590b a11 = aVar.a();
        Intrinsics.g(a11, "null cannot be cast to non-null type androidx.activity.result.ActivityResultCallback<O of androidx.activity.result.ActivityResultRegistry.dispatchResult>");
        if (this.f63660d.remove(str)) {
            a11.onActivityResult(obj);
        }
    }

    public final boolean e(int i11, int i12, Intent intent) {
        String str = (String) this.f63657a.get(Integer.valueOf(i11));
        if (str == null) {
            return false;
        }
        a aVar = (a) this.f63661e.get(str);
        if ((aVar != null ? aVar.a() : null) != null) {
            ArrayList arrayList = this.f63660d;
            if (arrayList.contains(str)) {
                aVar.a().onActivityResult(aVar.b().c(i12, intent));
                arrayList.remove(str);
                return true;
            }
        }
        this.f63662f.remove(str);
        this.f63663g.putParcelable(str, new C6589a(i12, intent));
        return true;
    }

    public abstract void f(int i11, @NotNull AbstractC6755a abstractC6755a, Object obj);

    public final void g(Bundle bundle) {
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
        if (stringArrayList == null || integerArrayList == null) {
            return;
        }
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
        if (stringArrayList2 != null) {
            this.f63660d.addAll(stringArrayList2);
        }
        Bundle bundle2 = bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
        Bundle bundle3 = this.f63663g;
        if (bundle2 != null) {
            bundle3.putAll(bundle2);
        }
        int size = stringArrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            String str = stringArrayList.get(i11);
            LinkedHashMap linkedHashMap = this.f63658b;
            boolean containsKey = linkedHashMap.containsKey(str);
            LinkedHashMap linkedHashMap2 = this.f63657a;
            if (containsKey) {
                Integer num = (Integer) linkedHashMap.remove(str);
                if (!bundle3.containsKey(str)) {
                    U.d(linkedHashMap2).remove(num);
                }
            }
            Integer num2 = integerArrayList.get(i11);
            Intrinsics.checkNotNullExpressionValue(num2, "rcs[i]");
            int intValue = num2.intValue();
            String str2 = stringArrayList.get(i11);
            Intrinsics.checkNotNullExpressionValue(str2, "keys[i]");
            String str3 = str2;
            linkedHashMap2.put(Integer.valueOf(intValue), str3);
            linkedHashMap.put(str3, Integer.valueOf(intValue));
        }
    }

    public final void h(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        LinkedHashMap linkedHashMap = this.f63658b;
        outState.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
        outState.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
        outState.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(this.f63660d));
        outState.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(this.f63663g));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [g.e] */
    @NotNull
    public final C6597i i(@NotNull final String key, @NotNull J lifecycleOwner, @NotNull final AbstractC6755a contract, @NotNull final InterfaceC6590b callback) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(callback, "callback");
        AbstractC5434v lifecycle = lifecycleOwner.getLifecycle();
        if (lifecycle.b().a(AbstractC5434v.b.STARTED)) {
            throw new IllegalStateException(("LifecycleOwner " + lifecycleOwner + " is attempting to register while current state is " + lifecycle.b() + ". LifecycleOwners must call register before they are STARTED.").toString());
        }
        k(key);
        LinkedHashMap linkedHashMap = this.f63659c;
        b bVar = (b) linkedHashMap.get(key);
        b bVar2 = bVar;
        if (bVar == null) {
            bVar2 = new b(lifecycle);
        }
        bVar2.a(new G() { // from class: g.e
            @Override // androidx.lifecycle.G
            public final void onStateChanged(J j11, AbstractC5434v.a aVar) {
                AbstractC6595g.a(AbstractC6595g.this, key, callback, contract, j11, aVar);
            }
        });
        linkedHashMap.put(key, bVar2);
        return new C6597i(this, key, contract);
    }

    @NotNull
    public final C6598j j(@NotNull String key, @NotNull AbstractC6755a contract, @NotNull InterfaceC6590b callback) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(callback, "callback");
        k(key);
        this.f63661e.put(key, new a(contract, callback));
        LinkedHashMap linkedHashMap = this.f63662f;
        if (linkedHashMap.containsKey(key)) {
            Object obj = linkedHashMap.get(key);
            linkedHashMap.remove(key);
            callback.onActivityResult(obj);
        }
        Bundle bundle = this.f63663g;
        C6589a c6589a = (C6589a) androidx.core.os.c.a(bundle, key, C6589a.class);
        if (c6589a != null) {
            bundle.remove(key);
            callback.onActivityResult(contract.c(c6589a.b(), c6589a.a()));
        }
        return new C6598j(this, key, contract);
    }

    public final void l(@NotNull String key) {
        Integer num;
        Intrinsics.checkNotNullParameter(key, "key");
        if (!this.f63660d.contains(key) && (num = (Integer) this.f63658b.remove(key)) != null) {
            this.f63657a.remove(num);
        }
        this.f63661e.remove(key);
        LinkedHashMap linkedHashMap = this.f63662f;
        if (linkedHashMap.containsKey(key)) {
            StringBuilder b11 = C6594f.b("Dropping pending result for request ", key, ": ");
            b11.append(linkedHashMap.get(key));
            Log.w("ActivityResultRegistry", b11.toString());
            linkedHashMap.remove(key);
        }
        Bundle bundle = this.f63663g;
        if (bundle.containsKey(key)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + key + ": " + ((C6589a) androidx.core.os.c.a(bundle, key, C6589a.class)));
            bundle.remove(key);
        }
        LinkedHashMap linkedHashMap2 = this.f63659c;
        b bVar = (b) linkedHashMap2.get(key);
        if (bVar != null) {
            bVar.b();
            linkedHashMap2.remove(key);
        }
    }
}
