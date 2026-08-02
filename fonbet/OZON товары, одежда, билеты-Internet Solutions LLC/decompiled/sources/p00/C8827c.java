package p00;

import org.jetbrains.annotations.NotNull;
import p00.InterfaceC8826b;

/* renamed from: p00.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C8827c extends InterfaceC8826b.a {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public static final C8827c f80007b = new C8827c();

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final String f80008c = "SHOW_DECODING_ERRORS";

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final String f80009d = "Отображать ошибки парсинга";

    @Override // p00.InterfaceC8826b.a
    @NotNull
    public final String b() {
        return f80009d;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C8827c);
    }

    @Override // p00.InterfaceC8826b
    @NotNull
    public final String getName() {
        return f80008c;
    }

    public final int hashCode() {
        return 1009713110;
    }

    @NotNull
    public final String toString() {
        return "ShowDecodingErrors";
    }
}
