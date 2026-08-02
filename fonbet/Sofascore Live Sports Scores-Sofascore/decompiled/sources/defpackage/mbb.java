package defpackage;

import com.ironsource.U3;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class mbb implements Map.Entry {
    public final /* synthetic */ int a;
    public final Object b;
    public final boolean c;
    public Object d;
    public int e;
    public Map.Entry f;
    public Map.Entry g;
    public Map.Entry h;
    public Map.Entry i;
    public Map.Entry j;

    public mbb(boolean z, mbb mbbVar, Object obj, mbb mbbVar2, mbb mbbVar3, char c) {
        this.a = 2;
        this.f = mbbVar;
        this.b = obj;
        this.c = z;
        this.e = 1;
        this.i = mbbVar2;
        this.j = mbbVar3;
        mbbVar3.i = this;
        mbbVar2.j = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    if (obj2 != null ? obj2.equals(key) : key == null) {
                        Object obj3 = this.d;
                        if (obj3 == null) {
                            if (entry.getValue() == null) {
                            }
                        } else if (obj3.equals(entry.getValue())) {
                        }
                    }
                }
                break;
            case 1:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry2 = (Map.Entry) obj;
                    if (obj2 != null ? obj2.equals(entry2.getKey()) : entry2.getKey() == null) {
                        Object obj4 = this.d;
                        if (obj4 == null) {
                            if (entry2.getValue() == null) {
                            }
                        } else if (obj4.equals(entry2.getValue())) {
                        }
                    }
                }
                break;
            default:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry3 = (Map.Entry) obj;
                    if (obj2 != null ? obj2.equals(entry3.getKey()) : entry3.getKey() == null) {
                        Object obj5 = this.d;
                        if (obj5 == null) {
                            if (entry3.getValue() == null) {
                            }
                        } else if (obj5.equals(entry3.getValue())) {
                        }
                    }
                }
                break;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        switch (this.a) {
        }
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        switch (this.a) {
        }
        return this.d;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                int hashCode = obj == null ? 0 : obj.hashCode();
                Object obj2 = this.d;
                return hashCode ^ (obj2 != null ? obj2.hashCode() : 0);
            case 1:
                int hashCode2 = obj == null ? 0 : obj.hashCode();
                Object obj3 = this.d;
                return hashCode2 ^ (obj3 != null ? obj3.hashCode() : 0);
            default:
                int hashCode3 = obj == null ? 0 : obj.hashCode();
                Object obj4 = this.d;
                return hashCode3 ^ (obj4 != null ? obj4.hashCode() : 0);
        }
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        int i = this.a;
        boolean z = this.c;
        switch (i) {
            case 0:
                if (obj == null && !z) {
                    yhk.s("value == null");
                    return null;
                }
                Object obj2 = this.d;
                this.d = obj;
                return obj2;
            case 1:
                if (obj == null && !z) {
                    yhk.s("value == null");
                    return null;
                }
                Object obj3 = this.d;
                this.d = obj;
                return obj3;
            default:
                if (obj == null && !z) {
                    yhk.s("value == null");
                    return null;
                }
                Object obj4 = this.d;
                this.d = obj;
                return obj4;
        }
    }

    public final String toString() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return obj + U3.j.b + this.d;
            case 1:
                String valueOf = String.valueOf(obj);
                String valueOf2 = String.valueOf(this.d);
                return wt3.m(valueOf, U3.j.b, new StringBuilder(valueOf.length() + 1 + valueOf2.length()), valueOf2);
            default:
                String valueOf3 = String.valueOf(obj);
                String valueOf4 = String.valueOf(this.d);
                return wt3.m(valueOf3, U3.j.b, new StringBuilder(valueOf3.length() + 1 + valueOf4.length()), valueOf4);
        }
    }

    public mbb(boolean z, mbb mbbVar, Object obj, mbb mbbVar2, mbb mbbVar3, byte b) {
        this.a = 1;
        this.f = mbbVar;
        this.b = obj;
        this.c = z;
        this.e = 1;
        this.i = mbbVar2;
        this.j = mbbVar3;
        mbbVar3.i = this;
        mbbVar2.j = this;
    }

    public /* synthetic */ mbb(boolean z, int i) {
        this.a = i;
        this.b = null;
        this.c = z;
        this.j = this;
        this.i = this;
    }

    public mbb(boolean z, mbb mbbVar, Object obj, mbb mbbVar2, mbb mbbVar3) {
        this.a = 0;
        this.f = mbbVar;
        this.b = obj;
        this.c = z;
        this.e = 1;
        this.i = mbbVar2;
        this.j = mbbVar3;
        mbbVar3.i = this;
        mbbVar2.j = this;
    }
}
