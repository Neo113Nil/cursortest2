package bo.app;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class o5 {

    /* renamed from: e, reason: collision with root package name */
    public static final m5 f25848e = new m5();

    /* renamed from: a, reason: collision with root package name */
    public final n5 f25849a;

    /* renamed from: b, reason: collision with root package name */
    public final List f25850b;

    /* renamed from: c, reason: collision with root package name */
    public final ye f25851c;

    /* renamed from: d, reason: collision with root package name */
    public final d9 f25852d;

    public o5(n5 commandType, List brazeEvents, ye yeVar, i2 i2Var, int i10) {
        brazeEvents = (i10 & 2) != 0 ? CollectionsKt.emptyList() : brazeEvents;
        yeVar = (i10 & 4) != 0 ? null : yeVar;
        i2Var = (i10 & 8) != 0 ? null : i2Var;
        Intrinsics.checkNotNullParameter(commandType, "commandType");
        Intrinsics.checkNotNullParameter(brazeEvents, "brazeEvents");
        this.f25849a = commandType;
        this.f25850b = brazeEvents;
        this.f25851c = yeVar;
        this.f25852d = i2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o5)) {
            return false;
        }
        o5 o5Var = (o5) obj;
        return this.f25849a == o5Var.f25849a && Intrinsics.areEqual(this.f25850b, o5Var.f25850b) && Intrinsics.areEqual(this.f25851c, o5Var.f25851c) && Intrinsics.areEqual(this.f25852d, o5Var.f25852d);
    }

    public final int hashCode() {
        int hashCode = (this.f25850b.hashCode() + (this.f25849a.hashCode() * 31)) * 31;
        ye yeVar = this.f25851c;
        int hashCode2 = (hashCode + (yeVar == null ? 0 : yeVar.f26326a.hashCode())) * 31;
        d9 d9Var = this.f25852d;
        return hashCode2 + (d9Var != null ? d9Var.hashCode() : 0);
    }

    public final String toString() {
        return "DispatchCommandEvent(commandType=" + this.f25849a + ", brazeEvents=" + this.f25850b + ", sessionId=" + this.f25851c + ", brazeRequest=" + this.f25852d + ")";
    }
}
