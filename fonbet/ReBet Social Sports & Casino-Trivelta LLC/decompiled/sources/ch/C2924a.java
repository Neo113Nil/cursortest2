package ch;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: ch.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2924a {

    /* renamed from: a, reason: collision with root package name */
    public final String f27819a;

    public C2924a(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f27819a = name;
        if (name.length() == 0) {
            throw new IllegalStateException("Name can't be blank");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C2924a.class == obj.getClass() && Intrinsics.areEqual(this.f27819a, ((C2924a) obj).f27819a);
    }

    public int hashCode() {
        return this.f27819a.hashCode();
    }

    public String toString() {
        return "AttributeKey: " + this.f27819a;
    }
}
