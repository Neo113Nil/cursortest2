package gh;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: gh.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4387h {

    /* renamed from: a, reason: collision with root package name */
    public final String f47443a;

    public C4387h(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f47443a = name;
    }

    public final String a() {
        return this.f47443a;
    }

    public String toString() {
        return "Phase('" + this.f47443a + "')";
    }
}
