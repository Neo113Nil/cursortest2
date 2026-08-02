package Q5;

import G5.CoralogixJsStackFrame;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class f implements g {

    /* renamed from: a, reason: collision with root package name */
    public final String f9408a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9409b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9410c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9411d;

    public f(String functionName, String fileName, int i10, int i11) {
        Intrinsics.checkNotNullParameter(functionName, "functionName");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        this.f9408a = functionName;
        this.f9409b = fileName;
        this.f9410c = i10;
        this.f9411d = i11;
    }

    public final int a() {
        return this.f9411d;
    }

    public final String b() {
        return this.f9409b;
    }

    public final String c() {
        return this.f9408a;
    }

    public final int d() {
        return this.f9410c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.areEqual(this.f9408a, fVar.f9408a) && Intrinsics.areEqual(this.f9409b, fVar.f9409b) && this.f9410c == fVar.f9410c && this.f9411d == fVar.f9411d;
    }

    public int hashCode() {
        return (((((this.f9408a.hashCode() * 31) + this.f9409b.hashCode()) * 31) + Integer.hashCode(this.f9410c)) * 31) + Integer.hashCode(this.f9411d);
    }

    public String toString() {
        return "EditableCoralogixJsStackFrame(functionName=" + this.f9408a + ", fileName=" + this.f9409b + ", lineNumber=" + this.f9410c + ", columnNumber=" + this.f9411d + ")";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(CoralogixJsStackFrame stackFrame) {
        this(stackFrame.getFunctionName(), stackFrame.getFileName(), stackFrame.getLineNumber(), stackFrame.getColumnNumber());
        Intrinsics.checkNotNullParameter(stackFrame, "stackFrame");
    }
}
