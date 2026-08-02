package com.google.gson.internal.bind;

import com.google.gson.j;
import com.google.gson.reflect.TypeToken;
import com.google.gson.x;
import com.google.gson.y;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
class TypeAdapters$29 implements y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Class f6266a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f6267b;

    public TypeAdapters$29(Class cls, x xVar) {
        this.f6266a = cls;
        this.f6267b = xVar;
    }

    @Override // com.google.gson.y
    public final x a(j jVar, TypeToken typeToken) {
        if (typeToken.getRawType() == this.f6266a) {
            return this.f6267b;
        }
        return null;
    }

    public final String toString() {
        return "Factory[type=" + this.f6266a.getName() + ",adapter=" + this.f6267b + "]";
    }
}
