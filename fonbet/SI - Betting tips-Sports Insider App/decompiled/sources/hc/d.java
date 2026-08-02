package hc;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d implements f {

    /* renamed from: b, reason: collision with root package name */
    public static int f10491b = 40;

    /* renamed from: c, reason: collision with root package name */
    public static String f10492c = "+40%";

    /* renamed from: a, reason: collision with root package name */
    public final int f10493a;

    public d(int i5) {
        this.f10493a = i5;
    }

    @Override // hc.f
    public final boolean areContentsTheSame(Object obj) {
        d dVar = obj instanceof d ? (d) obj : null;
        return dVar != null && this.f10493a == dVar.f10493a;
    }

    @Override // hc.f
    public final boolean areItemsTheSame(Object obj) {
        return obj instanceof d;
    }

    @Override // hc.f
    public final Object getChangePayload(Object obj) {
        d dVar = obj instanceof d ? (d) obj : null;
        if (dVar != null) {
            return Integer.valueOf(dVar.f10493a);
        }
        return null;
    }
}
