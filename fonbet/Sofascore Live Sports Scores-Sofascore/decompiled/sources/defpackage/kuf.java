package defpackage;

import com.google.gson.Gson;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class kuf {
    public final String a;
    public final Field b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final /* synthetic */ Method f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ u4k h;
    public final /* synthetic */ Gson i;
    public final /* synthetic */ u5k j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ boolean l;

    public kuf(String str, Field field, boolean z, boolean z2, Method method, boolean z3, u4k u4kVar, Gson gson, u5k u5kVar, boolean z4, boolean z5) {
        this.f = method;
        this.g = z3;
        this.h = u4kVar;
        this.i = gson;
        this.j = u5kVar;
        this.k = z4;
        this.l = z5;
        this.a = str;
        this.b = field;
        this.c = field.getName();
        this.d = z;
        this.e = z2;
    }

    public final void a(JsonWriter jsonWriter, Object obj) {
        Object obj2;
        if (this.d) {
            Method method = this.f;
            if (method != null) {
                try {
                    obj2 = method.invoke(obj, null);
                } catch (InvocationTargetException e) {
                    throw new zfa(lnb.o("Accessor ", iuf.d(method, false), " threw exception"), e.getCause());
                }
            } else {
                obj2 = this.b.get(obj);
            }
            if (obj2 == obj) {
                return;
            }
            jsonWriter.name(this.a);
            boolean z = this.g;
            u4k u4kVar = this.h;
            if (!z) {
                u4kVar = new w4k(this.i, u4kVar, this.j.b);
            }
            u4kVar.b(jsonWriter, obj2);
        }
    }
}
