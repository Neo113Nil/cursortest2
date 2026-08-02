package ah;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class x extends IllegalArgumentException {

    /* renamed from: a, reason: collision with root package name */
    public final String f16242a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16243b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(String headerName, int i10) {
        super("Header name '" + headerName + "' contains illegal character '" + headerName.charAt(i10) + "' (code " + (headerName.charAt(i10) & 255) + ')');
        Intrinsics.checkNotNullParameter(headerName, "headerName");
        this.f16242a = headerName;
        this.f16243b = i10;
    }
}
