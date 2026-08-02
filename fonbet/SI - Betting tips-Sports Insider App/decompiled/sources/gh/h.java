package gh;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class h {

    /* renamed from: c, reason: collision with root package name */
    public static final h f10194c = new h(CollectionsKt.Z(new ArrayList()), null);

    /* renamed from: a, reason: collision with root package name */
    public final Set f10195a;

    /* renamed from: b, reason: collision with root package name */
    public final y4.a f10196b;

    public h(Set pins, y4.a aVar) {
        Intrinsics.checkNotNullParameter(pins, "pins");
        this.f10195a = pins;
        this.f10196b = aVar;
    }

    public final void a(String hostname, Function0 cleanedPeerCertificatesFn) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        Intrinsics.checkNotNullParameter(cleanedPeerCertificatesFn, "cleanedPeerCertificatesFn");
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        kotlin.collections.e0 e0Var = kotlin.collections.e0.f19204a;
        Iterator it = this.f10195a.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        e0Var.getClass();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.areEqual(hVar.f10195a, this.f10195a) && Intrinsics.areEqual(hVar.f10196b, this.f10196b);
    }

    public final int hashCode() {
        int hashCode = (this.f10195a.hashCode() + 1517) * 41;
        y4.a aVar = this.f10196b;
        return hashCode + (aVar != null ? aVar.hashCode() : 0);
    }
}
