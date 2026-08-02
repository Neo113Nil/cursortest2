package hc;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c implements f {

    /* renamed from: a, reason: collision with root package name */
    public int f10489a;

    /* renamed from: b, reason: collision with root package name */
    public String f10490b;

    @Override // hc.f
    public final boolean areContentsTheSame(Object obj) {
        boolean z5 = obj instanceof c;
        c cVar = z5 ? (c) obj : null;
        if (cVar == null || this.f10489a != cVar.f10489a) {
            return false;
        }
        String str = this.f10490b;
        c cVar2 = z5 ? (c) obj : null;
        return Intrinsics.areEqual(str, cVar2 != null ? cVar2.f10490b : null);
    }

    @Override // hc.f
    public final boolean areItemsTheSame(Object obj) {
        return obj instanceof c;
    }

    @Override // hc.f
    public final Object getChangePayload(Object obj) {
        return null;
    }
}
