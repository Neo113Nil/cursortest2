package io.appmetrica.analytics.impl;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.bd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0049bd {

    /* renamed from: a, reason: collision with root package name */
    public final String f13443a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f13444b;

    public C0049bd(String str, boolean z5) {
        this.f13443a = str;
        this.f13444b = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0049bd)) {
            return false;
        }
        C0049bd c0049bd = (C0049bd) obj;
        return Intrinsics.areEqual(this.f13443a, c0049bd.f13443a) && this.f13444b == c0049bd.f13444b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.f13443a.hashCode() * 31;
        boolean z5 = this.f13444b;
        int i5 = z5;
        if (z5 != 0) {
            i5 = 1;
        }
        return hashCode + i5;
    }

    public final String toString() {
        return "ModuleStatus(moduleName=" + this.f13443a + ", loaded=" + this.f13444b + ')';
    }
}
