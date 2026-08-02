package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class hsm extends a6m {
    public final Integer c;
    public final String d;
    public final Exception e;

    public /* synthetic */ hsm(Integer num, String str, Exception exc, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : exc);
    }

    public static hsm copy$default(hsm hsmVar, Integer num, String str, Exception exc, int i, Object obj) {
        if ((i & 1) != 0) {
            num = hsmVar.c;
        }
        if ((i & 2) != 0) {
            str = hsmVar.d;
        }
        if ((i & 4) != 0) {
            exc = hsmVar.e;
        }
        hsmVar.getClass();
        return new hsm(num, str, exc);
    }

    @Override // defpackage.a6m
    public final Exception a() {
        return this.e;
    }

    @Override // defpackage.a6m
    public final String b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hsm)) {
            return false;
        }
        hsm hsmVar = (hsm) obj;
        return Intrinsics.c(this.c, hsmVar.c) && Intrinsics.c(this.d, hsmVar.d) && Intrinsics.c(this.e, hsmVar.e);
    }

    public final int hashCode() {
        Integer num = this.c;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Exception exc = this.e;
        return hashCode2 + (exc != null ? exc.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoggerConfigurationsTurnedOff(code=");
        sb.append(this.c);
        sb.append(", message=");
        sb.append(this.d);
        sb.append(", cause=");
        return wt3.o(sb, this.e, ')');
    }

    public hsm() {
        this(null, null, null, 7, null);
    }

    public hsm(@Nullable Integer num, @Nullable String str, @Nullable Exception exc) {
        super(null, null, null, 7, null);
        this.c = num;
        this.d = str;
        this.e = exc;
    }
}
