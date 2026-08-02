package Q5;

import G5.CoralogixAndroidStackFrame;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class e implements g {

    /* renamed from: a, reason: collision with root package name */
    public final String f9404a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9405b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9406c;

    /* renamed from: d, reason: collision with root package name */
    public final String f9407d;

    public e(String className, String methodName, int i10, String fileName) {
        Intrinsics.checkNotNullParameter(className, "className");
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        this.f9404a = className;
        this.f9405b = methodName;
        this.f9406c = i10;
        this.f9407d = fileName;
    }

    public final String a() {
        return this.f9404a;
    }

    public final String b() {
        return this.f9407d;
    }

    public final int c() {
        return this.f9406c;
    }

    public final String d() {
        return this.f9405b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.areEqual(this.f9404a, eVar.f9404a) && Intrinsics.areEqual(this.f9405b, eVar.f9405b) && this.f9406c == eVar.f9406c && Intrinsics.areEqual(this.f9407d, eVar.f9407d);
    }

    public int hashCode() {
        return (((((this.f9404a.hashCode() * 31) + this.f9405b.hashCode()) * 31) + Integer.hashCode(this.f9406c)) * 31) + this.f9407d.hashCode();
    }

    public String toString() {
        return "EditableCoralogixAndroidStackFrame(className=" + this.f9404a + ", methodName=" + this.f9405b + ", lineNumber=" + this.f9406c + ", fileName=" + this.f9407d + ")";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(CoralogixAndroidStackFrame stackFrame) {
        this(stackFrame.getClassName(), stackFrame.getMethodName(), stackFrame.getLineNumber(), stackFrame.getFileName());
        Intrinsics.checkNotNullParameter(stackFrame, "stackFrame");
    }
}
