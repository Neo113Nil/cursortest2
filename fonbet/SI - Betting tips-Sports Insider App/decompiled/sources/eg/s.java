package eg;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final Object f9216a;

    /* renamed from: b, reason: collision with root package name */
    public final i f9217b;

    /* renamed from: c, reason: collision with root package name */
    public final vf.a f9218c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f9219d;

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f9220e;

    public s(Object obj, i iVar, vf.a aVar, Object obj2, Throwable th2) {
        this.f9216a = obj;
        this.f9217b = iVar;
        this.f9218c = aVar;
        this.f9219d = obj2;
        this.f9220e = th2;
    }

    public static s a(s sVar, i iVar, Throwable th2, int i5) {
        Object obj = sVar.f9216a;
        if ((i5 & 2) != 0) {
            iVar = sVar.f9217b;
        }
        i iVar2 = iVar;
        vf.a aVar = sVar.f9218c;
        Object obj2 = sVar.f9219d;
        if ((i5 & 16) != 0) {
            th2 = sVar.f9220e;
        }
        return new s(obj, iVar2, aVar, obj2, th2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Intrinsics.areEqual(this.f9216a, sVar.f9216a) && Intrinsics.areEqual(this.f9217b, sVar.f9217b) && Intrinsics.areEqual(this.f9218c, sVar.f9218c) && Intrinsics.areEqual(this.f9219d, sVar.f9219d) && Intrinsics.areEqual(this.f9220e, sVar.f9220e);
    }

    public final int hashCode() {
        Object obj = this.f9216a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        i iVar = this.f9217b;
        int hashCode2 = (hashCode + (iVar == null ? 0 : iVar.hashCode())) * 31;
        vf.a aVar = this.f9218c;
        int hashCode3 = (hashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Object obj2 = this.f9219d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th2 = this.f9220e;
        return hashCode4 + (th2 != null ? th2.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f9216a + ", cancelHandler=" + this.f9217b + ", onCancellation=" + this.f9218c + ", idempotentResume=" + this.f9219d + ", cancelCause=" + this.f9220e + ')';
    }

    public /* synthetic */ s(Object obj, i iVar, vf.a aVar, Throwable th2, int i5) {
        this(obj, (i5 & 2) != 0 ? null : iVar, (i5 & 4) != 0 ? null : aVar, (Object) null, (i5 & 16) != 0 ? null : th2);
    }
}
