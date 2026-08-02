package jb0;

import C.o0;
import ed.InterfaceC6346b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@InterfaceC6346b
/* renamed from: jb0.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C7333a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f69655a;

    private /* synthetic */ C7333a(String str) {
        this.f69655a = str;
    }

    public static final /* synthetic */ C7333a a(String str) {
        return new C7333a(str);
    }

    public final /* synthetic */ String b() {
        return this.f69655a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C7333a) {
            return Intrinsics.d(this.f69655a, ((C7333a) obj).f69655a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f69655a.hashCode();
    }

    public final String toString() {
        return o0.c(new StringBuilder("HostAppDomain(address="), this.f69655a, ")");
    }
}
