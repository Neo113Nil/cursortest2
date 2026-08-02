package z5;

import org.jetbrains.annotations.NotNull;
import v5.AbstractC10235i;

/* renamed from: z5.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C10984b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC10986d f107257a;

    /* renamed from: z5.b$a */
    public static final class a implements InterfaceC10985c {
        @Override // z5.InterfaceC10985c
        @NotNull
        public final C10984b a(@NotNull InterfaceC10986d interfaceC10986d, @NotNull AbstractC10235i abstractC10235i) {
            return new C10984b(interfaceC10986d, abstractC10235i);
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final int hashCode() {
            return a.class.hashCode();
        }
    }

    public C10984b(@NotNull InterfaceC10986d interfaceC10986d, @NotNull AbstractC10235i abstractC10235i) {
        this.f107257a = interfaceC10986d;
    }
}
