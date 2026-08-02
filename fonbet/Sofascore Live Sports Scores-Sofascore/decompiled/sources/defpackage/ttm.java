package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ttm extends a6m {
    public final String c;
    public final Exception d;

    public /* synthetic */ ttm(String str, Exception exc, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : exc);
    }

    public static ttm copy$default(ttm ttmVar, String str, Exception exc, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ttmVar.c;
        }
        if ((i & 2) != 0) {
            exc = ttmVar.d;
        }
        ttmVar.getClass();
        return new ttm(str, exc);
    }

    @Override // defpackage.a6m
    public final Exception a() {
        return this.d;
    }

    @Override // defpackage.a6m
    public final String b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ttm)) {
            return false;
        }
        ttm ttmVar = (ttm) obj;
        return Intrinsics.c(this.c, ttmVar.c) && Intrinsics.c(this.d, ttmVar.d);
    }

    public final int hashCode() {
        String str = this.c;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Exception exc = this.d;
        return hashCode + (exc != null ? exc.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkErrorRemote(message=");
        sb.append(this.c);
        sb.append(", cause=");
        return wt3.o(sb, this.d, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ttm() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public ttm(@Nullable String str, @Nullable Exception exc) {
        super(null, null, null, 7, null);
        this.c = str;
        this.d = exc;
    }
}
