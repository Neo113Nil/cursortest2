package defpackage;

import android.os.Bundle;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class nqg {
    public final pqg a;
    public za0 b;

    public nqg(pqg pqgVar) {
        this.a = pqgVar;
    }

    public final Bundle a(String str) {
        pqg pqgVar = this.a;
        if (!pqgVar.b) {
            a70.r("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
            return null;
        }
        Bundle bundle = (Bundle) pqgVar.h;
        if (bundle == null) {
            return null;
        }
        Bundle B = bundle.containsKey(str) ? o3a.B(bundle, str) : null;
        bundle.remove(str);
        if (bundle.isEmpty()) {
            pqgVar.h = null;
        }
        return B;
    }

    public final mqg b(String str) {
        mqg mqgVar;
        pqg pqgVar = this.a;
        synchronized (((haf) pqgVar.f)) {
            Iterator it = ((LinkedHashMap) pqgVar.g).entrySet().iterator();
            do {
                mqgVar = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str2 = (String) entry.getKey();
                mqg mqgVar2 = (mqg) entry.getValue();
                if (Intrinsics.c(str2, str)) {
                    mqgVar = mqgVar2;
                }
            } while (mqgVar == null);
        }
        return mqgVar;
    }

    public final void c(String str, mqg mqgVar) {
        pqg pqgVar = this.a;
        synchronized (((haf) pqgVar.f)) {
            if (((LinkedHashMap) pqgVar.g).containsKey(str)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            ((LinkedHashMap) pqgVar.g).put(str, mqgVar);
            Unit unit = Unit.a;
        }
    }

    public final void d() {
        if (!this.a.c) {
            a70.r("Can not perform this action after onSaveInstanceState");
            return;
        }
        za0 za0Var = this.b;
        if (za0Var == null) {
            za0Var = new za0(this);
        }
        this.b = za0Var;
        try {
            o5b.class.getDeclaredConstructor(null);
            za0 za0Var2 = this.b;
            if (za0Var2 != null) {
                ((LinkedHashSet) za0Var2.b).add(o5b.class.getName());
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + o5b.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }
}
