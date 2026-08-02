package la;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final gb.b f19564a;

    public p(gb.b liveDao) {
        Intrinsics.checkNotNullParameter(liveDao, "liveDao");
        this.f19564a = liveDao;
    }

    public final void a(int i5, int i10, String str, String str2, String str3, String str4, String str5) {
        gb.b bVar = this.f19564a;
        bVar.getClass();
        k2.w wVar = bVar.f9927a;
        if (((Number) f3.x.n0(wVar, true, false, new eb.b(i5, 3))).intValue() > 0) {
            ((Number) f3.x.n0(wVar, false, true, new gb.a(i10, str, str2, str3, str4, str5, i5))).intValue();
        } else {
            ((Number) f3.x.n0(wVar, false, true, new gb.a(i5, i10, str, str2, str3, str4, str5))).longValue();
        }
    }
}
