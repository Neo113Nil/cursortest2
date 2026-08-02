package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class s0n extends i1m {
    public final Integer e;
    public final String f;
    public final Exception g;

    public /* synthetic */ s0n(Integer num, String str, Exception exc, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : exc);
    }

    public static s0n copy$default(s0n s0nVar, Integer num, String str, Exception exc, int i, Object obj) {
        if ((i & 1) != 0) {
            num = s0nVar.e;
        }
        if ((i & 2) != 0) {
            str = s0nVar.f;
        }
        if ((i & 4) != 0) {
            exc = s0nVar.g;
        }
        s0nVar.getClass();
        return new s0n(num, str, exc);
    }

    @Override // defpackage.i1m, defpackage.a6m
    public final Exception a() {
        return this.g;
    }

    @Override // defpackage.i1m, defpackage.a6m
    public final String b() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0n)) {
            return false;
        }
        s0n s0nVar = (s0n) obj;
        return Intrinsics.c(this.e, s0nVar.e) && Intrinsics.c(this.f, s0nVar.f) && Intrinsics.c(this.g, s0nVar.g);
    }

    public final int hashCode() {
        Integer num = this.e;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Exception exc = this.g;
        return hashCode2 + (exc != null ? exc.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ServiceUnavailableHttpErrorRemote(code=");
        sb.append(this.e);
        sb.append(", message=");
        sb.append(this.f);
        sb.append(", cause=");
        return wt3.o(sb, this.g, ')');
    }

    public s0n() {
        this(null, null, null, 7, null);
    }

    public s0n(@Nullable Integer num, @Nullable String str, @Nullable Exception exc) {
        super(null, null, null, 7, null);
        this.e = num;
        this.f = str;
        this.g = exc;
    }
}
