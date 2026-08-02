package defpackage;

import com.ironsource.U3;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class eio implements Map.Entry {
    public final Object a;
    public int b;
    public final /* synthetic */ fio c;

    public eio(fio fioVar, int i) {
        this.c = fioVar;
        this.a = fioVar.g()[i];
        this.b = i;
    }

    public final void a() {
        int i = this.b;
        Object obj = this.a;
        fio fioVar = this.c;
        if (i != -1 && i < fioVar.size()) {
            if (Objects.equals(obj, fioVar.g()[this.b])) {
                return;
            }
        }
        this.b = fioVar.n(obj);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (Objects.equals(getKey(), entry.getKey()) && Objects.equals(getValue(), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        fio fioVar = this.c;
        Map j = fioVar.j();
        if (j != null) {
            return j.get(this.a);
        }
        a();
        int i = this.b;
        if (i == -1) {
            return null;
        }
        return fioVar.h()[i];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        Object value = getValue();
        return (key == null ? 0 : key.hashCode()) ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        fio fioVar = this.c;
        Map j = fioVar.j();
        Object obj2 = this.a;
        if (j != null) {
            return j.put(obj2, obj);
        }
        a();
        int i = this.b;
        if (i == -1) {
            fioVar.put(obj2, obj);
            return null;
        }
        Object obj3 = fioVar.h()[i];
        fioVar.h()[this.b] = obj;
        return obj3;
    }

    public final String toString() {
        String valueOf = String.valueOf(getKey());
        String valueOf2 = String.valueOf(getValue());
        return wt3.m(valueOf, U3.j.b, new StringBuilder(valueOf.length() + 1 + valueOf2.length()), valueOf2);
    }
}
