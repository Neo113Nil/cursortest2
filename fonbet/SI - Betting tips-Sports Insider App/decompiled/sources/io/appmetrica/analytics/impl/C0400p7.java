package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.p7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0400p7 implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final C0307le f14463a;

    /* JADX WARN: Multi-variable type inference failed */
    public C0400p7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0375o7 fromModel(@NotNull C0449r7 c0449r7) {
        C0375o7 c0375o7 = new C0375o7();
        Long l6 = c0449r7.f14547a;
        if (l6 != null) {
            c0375o7.f14399a = l6.longValue();
        }
        Long l10 = c0449r7.f14548b;
        if (l10 != null) {
            c0375o7.f14400b = l10.longValue();
        }
        Boolean bool = c0449r7.f14549c;
        if (bool != null) {
            c0375o7.f14401c = this.f14463a.fromModel(bool).intValue();
        }
        return c0375o7;
    }

    public C0400p7(@NotNull C0307le c0307le) {
        this.f14463a = c0307le;
    }

    public /* synthetic */ C0400p7(C0307le c0307le, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? new C0307le() : c0307le);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0449r7 toModel(@NotNull C0375o7 c0375o7) {
        C0375o7 c0375o72 = new C0375o7();
        long j = c0375o7.f14399a;
        Long valueOf = Long.valueOf(j);
        if (j == c0375o72.f14399a) {
            valueOf = null;
        }
        long j6 = c0375o7.f14400b;
        return new C0449r7(valueOf, j6 != c0375o72.f14400b ? Long.valueOf(j6) : null, this.f14463a.a(c0375o7.f14401c));
    }
}
