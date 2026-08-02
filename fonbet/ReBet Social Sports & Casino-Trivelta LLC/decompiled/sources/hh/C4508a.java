package hh;

import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;

/* renamed from: hh.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4508a {

    /* renamed from: a, reason: collision with root package name */
    public final KClass f47902a;

    /* renamed from: b, reason: collision with root package name */
    public final Type f47903b;

    /* renamed from: c, reason: collision with root package name */
    public final KType f47904c;

    public C4508a(KClass type, Type reifiedType, KType kType) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(reifiedType, "reifiedType");
        this.f47902a = type;
        this.f47903b = reifiedType;
        this.f47904c = kType;
    }

    public final KClass a() {
        return this.f47902a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4508a)) {
            return false;
        }
        C4508a c4508a = (C4508a) obj;
        return Intrinsics.areEqual(this.f47902a, c4508a.f47902a) && Intrinsics.areEqual(this.f47903b, c4508a.f47903b) && Intrinsics.areEqual(this.f47904c, c4508a.f47904c);
    }

    public int hashCode() {
        int hashCode = ((this.f47902a.hashCode() * 31) + this.f47903b.hashCode()) * 31;
        KType kType = this.f47904c;
        return hashCode + (kType == null ? 0 : kType.hashCode());
    }

    public String toString() {
        return "TypeInfo(type=" + this.f47902a + ", reifiedType=" + this.f47903b + ", kotlinType=" + this.f47904c + ')';
    }
}
