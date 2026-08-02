package ah;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class y extends IllegalArgumentException {

    /* renamed from: a, reason: collision with root package name */
    public final String f16244a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16245b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(String headerValue, int i10) {
        super("Header value '" + headerValue + "' contains illegal character '" + headerValue.charAt(i10) + "' (code " + (headerValue.charAt(i10) & 255) + ')');
        Intrinsics.checkNotNullParameter(headerValue, "headerValue");
        this.f16244a = headerValue;
        this.f16245b = i10;
    }
}
