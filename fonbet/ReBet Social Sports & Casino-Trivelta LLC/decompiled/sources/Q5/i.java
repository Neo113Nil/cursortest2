package Q5;

import G5.CoralogixAndroidStackFrame;
import G5.CoralogixDartObfuscatedStackFrame;
import G5.CoralogixJsStackFrame;
import I5.ErrorContext;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f9426a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9427b;

    /* renamed from: c, reason: collision with root package name */
    public final Boolean f9428c;

    /* renamed from: d, reason: collision with root package name */
    public final List f9429d;

    public i(String str, String str2, Boolean bool, List list) {
        this.f9426a = str;
        this.f9427b = str2;
        this.f9428c = bool;
        this.f9429d = list;
    }

    public final String a() {
        return this.f9426a;
    }

    public final List b() {
        return this.f9429d;
    }

    public final String c() {
        return this.f9427b;
    }

    public final Boolean d() {
        return this.f9428c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.areEqual(this.f9426a, iVar.f9426a) && Intrinsics.areEqual(this.f9427b, iVar.f9427b) && Intrinsics.areEqual(this.f9428c, iVar.f9428c) && Intrinsics.areEqual(this.f9429d, iVar.f9429d);
    }

    public int hashCode() {
        String str = this.f9426a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f9427b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f9428c;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        List list = this.f9429d;
        return hashCode3 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "EditableErrorContext(message=" + this.f9426a + ", type=" + this.f9427b + ", isCrash=" + this.f9428c + ", stacktrace=" + this.f9429d + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public i(ErrorContext errorContext) {
        this(r0, r1, r2, r3);
        g gVar;
        Intrinsics.checkNotNullParameter(errorContext, "errorContext");
        String message = errorContext.getMessage();
        String type = errorContext.getType();
        Boolean valueOf = Boolean.valueOf(errorContext.getIsCrash());
        List<G5.d> stacktrace = errorContext.getStacktrace();
        ArrayList arrayList = new ArrayList();
        for (G5.d dVar : stacktrace) {
            if (dVar instanceof CoralogixAndroidStackFrame) {
                gVar = new e((CoralogixAndroidStackFrame) dVar);
            } else if (dVar instanceof CoralogixJsStackFrame) {
                gVar = new f((CoralogixJsStackFrame) dVar);
            } else {
                if (!(dVar instanceof CoralogixDartObfuscatedStackFrame)) {
                    throw new NoWhenBranchMatchedException();
                }
                gVar = null;
            }
            if (gVar != null) {
                arrayList.add(gVar);
            }
        }
    }
}
