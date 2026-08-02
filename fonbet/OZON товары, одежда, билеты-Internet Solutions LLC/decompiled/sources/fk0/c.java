package fk0;

import android.view.View;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f63628a = new LinkedHashMap();

    public final synchronized void a() {
        Iterator it = this.f63628a.values().iterator();
        while (it.hasNext()) {
            ((b) it.next()).b();
        }
    }

    public final Object b(@NotNull Integer type) {
        Intrinsics.checkNotNullParameter(type, "type");
        b bVar = (b) this.f63628a.get(type);
        if (bVar != null) {
            return bVar.c();
        }
        return null;
    }

    public final synchronized int c(int i11) {
        b bVar;
        Integer type = Integer.valueOf(i11);
        Intrinsics.checkNotNullParameter(type, "type");
        bVar = (b) this.f63628a.get(type);
        return bVar != null ? bVar.d() : 5;
    }

    public final synchronized Integer d(int i11) {
        b bVar;
        Integer type = Integer.valueOf(i11);
        Intrinsics.checkNotNullParameter(type, "type");
        bVar = (b) this.f63628a.get(type);
        return bVar != null ? Integer.valueOf(bVar.e()) : null;
    }

    public final synchronized void e(int i11, @NotNull View item) {
        Intrinsics.checkNotNullParameter(item, "item");
        Integer type = Integer.valueOf(i11);
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(item, "item");
        LinkedHashMap linkedHashMap = this.f63628a;
        Object obj = linkedHashMap.get(type);
        if (obj == null) {
            obj = new b(null);
            linkedHashMap.put(type, obj);
        }
        ((b) obj).a(item);
    }
}
