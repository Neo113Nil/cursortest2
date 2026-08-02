package p5;

import I5.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: p5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6046a extends C6047b {

    /* renamed from: h, reason: collision with root package name */
    public final boolean f63039h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C6046a(Q5.b bVar, Long l10, String str, String str2, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, l10, str, r6, r7);
        boolean z11;
        String str3;
        str = (i10 & 4) != 0 ? null : str;
        if ((i10 & 8) != 0) {
            z11 = z10;
            str3 = null;
        } else {
            z11 = z10;
            str3 = str2;
        }
    }

    @Override // p5.C6047b
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(C6046a.class, obj != null ? obj.getClass() : null) || !super.equals(obj)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.coralogix.android.sdk.internal.features.opentelemetry.span_factory.NetworkSpanDetails");
        return this.f63039h == ((C6046a) obj).f63039h;
    }

    public final boolean h() {
        return this.f63039h;
    }

    @Override // p5.C6047b
    public int hashCode() {
        return (super.hashCode() * 31) + Boolean.hashCode(this.f63039h);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6046a(Q5.b severity, Long l10, String str, String str2, boolean z10) {
        super(a.i.f5359c.a(), severity, null, l10, null, str, str2, 20, null);
        Intrinsics.checkNotNullParameter(severity, "severity");
        this.f63039h = z10;
    }
}
