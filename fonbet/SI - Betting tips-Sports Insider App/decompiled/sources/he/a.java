package he;

import androidx.recyclerview.widget.d;
import hc.f;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a extends d {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10584d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f10585e;

    /* renamed from: f, reason: collision with root package name */
    public List f10586f;

    @Override // androidx.recyclerview.widget.d
    public final boolean a(int i5, int i10) {
        switch (this.f10584d) {
            case 0:
                if (this.f10585e.get(i5) != null || this.f10586f.get(i10) != null) {
                    f fVar = (f) this.f10585e.get(i5);
                    if (fVar != null) {
                        break;
                    }
                }
                break;
            default:
                Object obj = this.f10585e.get(i5);
                ka.a aVar = obj instanceof ka.a ? (ka.a) obj : null;
                Object obj2 = this.f10586f.get(i10);
                ka.a aVar2 = obj2 instanceof ka.a ? (ka.a) obj2 : null;
                if ((aVar != null || aVar2 != null) && (aVar == null || aVar2 == null || aVar.f18945a != aVar2.f18945a || aVar.f18946b != aVar2.f18946b || aVar.f18947c != aVar2.f18947c || aVar.f18949e != aVar2.f18949e || aVar.f18950f != aVar2.f18950f || aVar.f18953i != aVar2.f18953i || aVar.f18948d != aVar2.f18948d || !z.j(aVar.f18951g, aVar2.f18951g, false) || !z.j(aVar.f18952h, aVar2.f18952h, false) || !z.j(aVar.j, aVar2.j, false) || !z.j(aVar.f18954k, aVar2.f18954k, false))) {
                }
                break;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.d
    public final boolean b(int i5, int i10) {
        switch (this.f10584d) {
            case 0:
                if (this.f10585e.get(i5) == null && this.f10586f.get(i10) == null) {
                    return true;
                }
                f fVar = (f) this.f10585e.get(i5);
                if (fVar != null) {
                    return fVar.areItemsTheSame(this.f10586f.get(i10));
                }
                return false;
            default:
                Object obj = this.f10585e.get(i5);
                Object obj2 = this.f10586f.get(i10);
                if ((obj instanceof ka.a) && (obj2 instanceof ka.a)) {
                    if (((ka.a) obj).f18945a == ((ka.a) obj2).f18945a) {
                        return true;
                    }
                } else if ((obj instanceof lc.a) && (obj2 instanceof lc.a)) {
                    return Intrinsics.areEqual(((lc.a) obj).f19667a, ((lc.a) obj2).f19667a);
                }
                return false;
        }
    }

    @Override // androidx.recyclerview.widget.d
    public final Object g(int i5, int i10) {
        switch (this.f10584d) {
            case 0:
                f fVar = (f) this.f10585e.get(i5);
                if (fVar != null) {
                    return fVar.getChangePayload(this.f10586f.get(i10));
                }
                return null;
            default:
                return null;
        }
    }

    @Override // androidx.recyclerview.widget.d
    public final int h() {
        switch (this.f10584d) {
        }
        return this.f10586f.size();
    }

    @Override // androidx.recyclerview.widget.d
    public final int i() {
        switch (this.f10584d) {
        }
        return this.f10585e.size();
    }
}
