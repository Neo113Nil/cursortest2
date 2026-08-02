package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class a3p extends u2p {
    public final /* synthetic */ int a;
    public final h3p b;
    public final Object c;
    public int d;

    public a3p(h3p h3pVar, int i, int i2) {
        this.a = i2;
        switch (i2) {
            case 1:
                this.b = h3pVar;
                this.c = h3pVar.b[i];
                this.d = i;
                break;
            default:
                this.b = h3pVar;
                this.c = h3pVar.a[i];
                this.d = i;
                break;
        }
    }

    public void a() {
        int i = this.d;
        Object obj = this.c;
        h3p h3pVar = this.b;
        if (i == -1 || i > h3pVar.c || !Objects.equals(h3pVar.a[i], obj)) {
            h3pVar.getClass();
            this.d = h3pVar.p(bea.T(obj), obj);
        }
    }

    public void b() {
        int i = this.d;
        Object obj = this.c;
        h3p h3pVar = this.b;
        if (i == -1 || i > h3pVar.c || !Objects.equals(obj, h3pVar.b[i])) {
            h3pVar.getClass();
            this.d = h3pVar.a(bea.T(obj), obj);
        }
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        switch (this.a) {
        }
        return this.c;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        switch (this.a) {
            case 0:
                a();
                int i = this.d;
                if (i == -1) {
                    return null;
                }
                return this.b.b[i];
            default:
                b();
                int i2 = this.d;
                if (i2 == -1) {
                    return null;
                }
                return this.b.a[i2];
        }
    }

    @Override // defpackage.u2p, java.util.Map.Entry
    public final Object setValue(Object obj) {
        int i = this.a;
        Object obj2 = this.c;
        h3p h3pVar = this.b;
        switch (i) {
            case 0:
                a();
                int i2 = this.d;
                if (i2 == -1) {
                    h3pVar.put(obj2, obj);
                    return null;
                }
                Object obj3 = h3pVar.b[i2];
                if (Objects.equals(obj3, obj)) {
                    return obj;
                }
                h3pVar.h(this.d, obj);
                return obj3;
            default:
                b();
                int i3 = this.d;
                if (i3 == -1) {
                    h3pVar.l(obj2, obj);
                    return null;
                }
                Object obj4 = h3pVar.a[i3];
                if (Objects.equals(obj4, obj)) {
                    return obj;
                }
                h3pVar.i(this.d, obj);
                return obj4;
        }
    }
}
