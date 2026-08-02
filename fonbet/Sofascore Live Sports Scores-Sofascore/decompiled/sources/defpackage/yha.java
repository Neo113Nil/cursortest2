package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class yha extends a6m {
    public final Integer c;
    public final String d;
    public final Exception e;

    public /* synthetic */ yha(Integer num, String str, Exception exc, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : exc);
    }

    public static yha copy$default(yha yhaVar, Integer num, String str, Exception exc, int i, Object obj) {
        if ((i & 1) != 0) {
            num = yhaVar.c;
        }
        if ((i & 2) != 0) {
            str = yhaVar.d;
        }
        if ((i & 4) != 0) {
            exc = yhaVar.e;
        }
        yhaVar.getClass();
        return new yha(num, str, exc);
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
        if (!(obj instanceof yha)) {
            return false;
        }
        yha yhaVar = (yha) obj;
        return Intrinsics.c(this.c, yhaVar.c) && Intrinsics.c(this.d, yhaVar.d) && Intrinsics.c(this.e, yhaVar.e);
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
        StringBuilder sb = new StringBuilder("UserManagementFailure(code=");
        sb.append(this.c);
        sb.append(", message=");
        sb.append(this.d);
        sb.append(", cause=");
        return wt3.o(sb, this.e, ')');
    }

    public yha() {
        this(null, null, null, 7, null);
    }

    public yha(@Nullable Integer num, @Nullable String str, @Nullable Exception exc) {
        super(null, null, null, 7, null);
        this.c = num;
        this.d = str;
        this.e = exc;
    }
}
