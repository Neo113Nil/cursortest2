package q2;

import android.os.Bundle;
import androidx.appcompat.app.m;
import androidx.lifecycle.s;
import com.google.android.gms.internal.measurement.d5;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final r2.a f21925a;

    /* renamed from: b, reason: collision with root package name */
    public m f21926b;

    public d(r2.a impl) {
        Intrinsics.checkNotNullParameter(impl, "impl");
        this.f21925a = impl;
    }

    public final Bundle a(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(key, "key");
        r2.a aVar = this.f21925a;
        if (!aVar.f22205g) {
            throw new IllegalStateException("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
        }
        Bundle source = aVar.f22204f;
        if (source == null) {
            return null;
        }
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(key, "key");
        Bundle x10 = source.containsKey(key) ? d5.x(source, key) : null;
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(key, "key");
        source.remove(key);
        Intrinsics.checkNotNullParameter(source, "source");
        if (source.isEmpty()) {
            aVar.f22204f = null;
        }
        return x10;
    }

    public final c b() {
        c cVar;
        Intrinsics.checkNotNullParameter("androidx.lifecycle.internal.SavedStateHandlesProvider", "key");
        r2.a aVar = this.f21925a;
        Intrinsics.checkNotNullParameter("androidx.lifecycle.internal.SavedStateHandlesProvider", "key");
        synchronized (aVar.f22201c) {
            Iterator it = aVar.f22202d.entrySet().iterator();
            do {
                cVar = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                c cVar2 = (c) entry.getValue();
                if (Intrinsics.areEqual(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                    cVar = cVar2;
                }
            } while (cVar == null);
        }
        return cVar;
    }

    public final void c(String key, c provider) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(provider, "provider");
        r2.a aVar = this.f21925a;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(provider, "provider");
        synchronized (aVar.f22201c) {
            if (aVar.f22202d.containsKey(key)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            aVar.f22202d.put(key, provider);
            Unit unit = Unit.f19194a;
        }
    }

    public final void d() {
        Intrinsics.checkNotNullParameter(s.class, "clazz");
        if (!this.f21925a.f22206h) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        m mVar = this.f21926b;
        if (mVar == null) {
            mVar = new m(this);
        }
        this.f21926b = mVar;
        try {
            s.class.getDeclaredConstructor(null);
            m mVar2 = this.f21926b;
            if (mVar2 != null) {
                String className = s.class.getName();
                Intrinsics.checkNotNullExpressionValue(className, "getName(...)");
                Intrinsics.checkNotNullParameter(className, "className");
                ((LinkedHashSet) mVar2.f332b).add(className);
            }
        } catch (NoSuchMethodException e7) {
            throw new IllegalArgumentException("Class " + s.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e7);
        }
    }
}
