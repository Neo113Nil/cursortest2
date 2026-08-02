package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class sep {
    public final String a;
    public final Field b;
    public final String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Method e;
    public final /* synthetic */ map f;
    public final /* synthetic */ map g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean i;

    public sep(cfp cfpVar, String str, Field field, boolean z, Method method, map mapVar, map mapVar2, boolean z2, boolean z3) {
        this.d = z;
        this.e = method;
        this.f = mapVar;
        this.g = mapVar2;
        this.h = z2;
        this.i = z3;
        this.a = str;
        this.b = field;
        this.c = field.getName();
    }

    public static /* synthetic */ String b(byte b, String str, e7n e7nVar, String str2, String str3) {
        String P0 = e7nVar.P0();
        StringBuilder sb = new StringBuilder(P0.length() + fn0.c(b, str));
        sb.append(str2);
        sb.append(str);
        sb.append(str3);
        sb.append(P0);
        return sb.toString();
    }

    public final void a(f7n f7nVar, Object obj) {
        Object obj2;
        boolean z = this.d;
        Field field = this.b;
        Method method = this.e;
        if (z) {
            if (method == null) {
                cfp.b(obj, field);
            } else {
                cfp.b(obj, method);
            }
        }
        if (method != null) {
            try {
                obj2 = method.invoke(obj, null);
            } catch (InvocationTargetException e) {
                String b = f6n.b(method, false);
                throw new o9p(16, wt3.m("Accessor ", b, new StringBuilder(b.length() + 25), " threw exception"), e.getCause());
            }
        } else {
            obj2 = field.get(obj);
        }
        if (obj2 == obj) {
            return;
        }
        f7nVar.C(this.a);
        this.f.write(f7nVar, obj2);
    }
}
