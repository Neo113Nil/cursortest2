package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class uwm extends a6m {
    public final String c;
    public final String d;
    public final Exception e;

    public /* synthetic */ uwm(String str, String str2, Exception exc, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : exc);
    }

    public static uwm copy$default(uwm uwmVar, String str, String str2, Exception exc, int i, Object obj) {
        if ((i & 1) != 0) {
            str = uwmVar.c;
        }
        if ((i & 2) != 0) {
            str2 = uwmVar.d;
        }
        if ((i & 4) != 0) {
            exc = uwmVar.e;
        }
        uwmVar.getClass();
        return new uwm(str, str2, exc);
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
        if (!(obj instanceof uwm)) {
            return false;
        }
        uwm uwmVar = (uwm) obj;
        return Intrinsics.c(this.c, uwmVar.c) && Intrinsics.c(this.d, uwmVar.d) && Intrinsics.c(this.e, uwmVar.e);
    }

    public final int hashCode() {
        String str = this.c;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Exception exc = this.e;
        return hashCode2 + (exc != null ? exc.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParsingErrorRemote(rawResponse=");
        sb.append(this.c);
        sb.append(", message=");
        sb.append(this.d);
        sb.append(", cause=");
        return wt3.o(sb, this.e, ')');
    }

    public uwm() {
        this(null, null, null, 7, null);
    }

    public uwm(@Nullable String str, @Nullable String str2, @Nullable Exception exc) {
        super(null, null, null, 7, null);
        this.c = str;
        this.d = str2;
        this.e = exc;
    }
}
