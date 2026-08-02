package com.google.gson.internal.bind;

import androidx.appcompat.widget.c1;
import com.google.gson.m;
import com.google.gson.x;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f6277a;

    /* renamed from: b, reason: collision with root package name */
    public final Field f6278b;

    /* renamed from: c, reason: collision with root package name */
    public final String f6279c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Method f6280d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x f6281e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x f6282f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f6283g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f6284h;

    public c(String str, Field field, Method method, x xVar, x xVar2, boolean z5, boolean z7) {
        this.f6280d = method;
        this.f6281e = xVar;
        this.f6282f = xVar2;
        this.f6283g = z5;
        this.f6284h = z7;
        this.f6277a = str;
        this.f6278b = field;
        this.f6279c = field.getName();
    }

    public final void a(r9.b bVar, Object obj) {
        Object obj2;
        Method method = this.f6280d;
        if (method != null) {
            try {
                obj2 = method.invoke(obj, null);
            } catch (InvocationTargetException e7) {
                throw new m(c1.n("Accessor ", q9.c.d(method, false), " threw exception"), e7.getCause());
            }
        } else {
            obj2 = this.f6278b.get(obj);
        }
        if (obj2 == obj) {
            return;
        }
        bVar.y(this.f6277a);
        this.f6281e.c(bVar, obj2);
    }
}
