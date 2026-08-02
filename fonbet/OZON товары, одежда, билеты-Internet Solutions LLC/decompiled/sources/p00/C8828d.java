package p00;

import org.jetbrains.annotations.NotNull;
import p00.InterfaceC8826b;

/* renamed from: p00.d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C8828d extends InterfaceC8826b.a {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public static final C8828d f80010b = new C8828d();

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final String f80011c = "SHOW_PAGE_DEBUG_INFORMATION";

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final String f80012d = "Отображать информацию о странице";

    @Override // p00.InterfaceC8826b.a
    @NotNull
    public final String b() {
        return f80012d;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C8828d);
    }

    @Override // p00.InterfaceC8826b
    @NotNull
    public final String getName() {
        return f80011c;
    }

    public final int hashCode() {
        return 1396935400;
    }

    @NotNull
    public final String toString() {
        return "ShowPageDebugInformation";
    }
}
