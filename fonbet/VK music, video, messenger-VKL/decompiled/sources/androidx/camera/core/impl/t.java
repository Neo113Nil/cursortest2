package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: UseCaseAttachState.java */
/* loaded from: classes11.dex */
public final class t {
    public final HashMap a = new HashMap();

    /* compiled from: UseCaseAttachState.java */
    public static final class a {

        @NonNull
        public final r a;
        public boolean b = false;
        public boolean c = false;

        public a(@NonNull r rVar) {
            this.a = rVar;
        }
    }

    public t(@NonNull String str) {
    }

    @NonNull
    public final r.e a() {
        r.e eVar = new r.e();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.a.entrySet()) {
            a aVar = (a) entry.getValue();
            if (aVar.b) {
                eVar.a(aVar.a);
                arrayList.add((String) entry.getKey());
            }
        }
        arrayList.toString();
        return eVar;
    }

    @NonNull
    public final Collection<r> b() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.a.entrySet()) {
            if (((a) entry.getValue()).b) {
                arrayList.add(((a) entry.getValue()).a);
            }
        }
        return Collections.unmodifiableCollection(arrayList);
    }

    public final void c(@NonNull String str) {
        HashMap hashMap = this.a;
        if (hashMap.containsKey(str)) {
            a aVar = (a) hashMap.get(str);
            aVar.c = false;
            if (aVar.b) {
                return;
            }
            hashMap.remove(str);
        }
    }

    public final void d(@NonNull String str, @NonNull r rVar) {
        HashMap hashMap = this.a;
        if (hashMap.containsKey(str)) {
            a aVar = new a(rVar);
            a aVar2 = (a) hashMap.get(str);
            aVar.b = aVar2.b;
            aVar.c = aVar2.c;
            hashMap.put(str, aVar);
        }
    }
}
