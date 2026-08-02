package com.google.gson.internal.bind;

import com.google.gson.j;
import com.google.gson.reflect.TypeToken;
import com.google.gson.x;
import com.google.gson.y;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
class TypeAdapters$30 implements y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Class f6268a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Class f6269b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f6270c;

    public TypeAdapters$30(Class cls, Class cls2, x xVar) {
        this.f6268a = cls;
        this.f6269b = cls2;
        this.f6270c = xVar;
    }

    @Override // com.google.gson.y
    public final x a(j jVar, TypeToken typeToken) {
        Class rawType = typeToken.getRawType();
        if (rawType == this.f6268a || rawType == this.f6269b) {
            return this.f6270c;
        }
        return null;
    }

    public final String toString() {
        return "Factory[type=" + this.f6269b.getName() + "+" + this.f6268a.getName() + ",adapter=" + this.f6270c + "]";
    }
}
