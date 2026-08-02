package fe;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: fe.y, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C6545y<T> {

    /* renamed from: a, reason: collision with root package name */
    private final Rd.e f63264a;

    /* renamed from: b, reason: collision with root package name */
    private final Rd.e f63265b;

    /* renamed from: c, reason: collision with root package name */
    private final Rd.e f63266c;

    /* renamed from: d, reason: collision with root package name */
    private final Rd.e f63267d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final String f63268e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final Sd.b f63269f;

    public C6545y(Rd.e eVar, Rd.e eVar2, Rd.e eVar3, Rd.e eVar4, @NotNull String filePath, @NotNull Sd.b classId) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        Intrinsics.checkNotNullParameter(classId, "classId");
        this.f63264a = eVar;
        this.f63265b = eVar2;
        this.f63266c = eVar3;
        this.f63267d = eVar4;
        this.f63268e = filePath;
        this.f63269f = classId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6545y)) {
            return false;
        }
        C6545y c6545y = (C6545y) obj;
        return Intrinsics.d(this.f63264a, c6545y.f63264a) && Intrinsics.d(this.f63265b, c6545y.f63265b) && Intrinsics.d(this.f63266c, c6545y.f63266c) && this.f63267d.equals(c6545y.f63267d) && Intrinsics.d(this.f63268e, c6545y.f63268e) && Intrinsics.d(this.f63269f, c6545y.f63269f);
    }

    public final int hashCode() {
        Rd.e eVar = this.f63264a;
        int hashCode = (eVar == null ? 0 : eVar.hashCode()) * 31;
        Rd.e eVar2 = this.f63265b;
        int hashCode2 = (hashCode + (eVar2 == null ? 0 : eVar2.hashCode())) * 31;
        Rd.e eVar3 = this.f63266c;
        return this.f63269f.hashCode() + G.g.a((this.f63267d.hashCode() + ((hashCode2 + (eVar3 != null ? eVar3.hashCode() : 0)) * 31)) * 31, 31, this.f63268e);
    }

    @NotNull
    public final String toString() {
        return "IncompatibleVersionErrorData(actualVersion=" + this.f63264a + ", compilerVersion=" + this.f63265b + ", languageVersion=" + this.f63266c + ", expectedVersion=" + this.f63267d + ", filePath=" + this.f63268e + ", classId=" + this.f63269f + ')';
    }
}
