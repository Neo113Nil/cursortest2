package n3;

import androidx.work.impl.WorkDatabase;
import f3.v;
import f3.x;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20821a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WorkDatabase f20822b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f20823c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v f20824d;

    public /* synthetic */ b(WorkDatabase workDatabase, String str, v vVar, int i5) {
        this.f20821a = i5;
        this.f20822b = workDatabase;
        this.f20823c = str;
        this.f20824d = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20821a) {
            case 0:
                m3.s y5 = this.f20822b.y();
                y5.getClass();
                String name = this.f20823c;
                Intrinsics.checkNotNullParameter(name, "name");
                Iterator it = ((List) x.n0(y5.f20360a, true, false, new a2.k(name, 16))).iterator();
                while (it.hasNext()) {
                    j.a(this.f20824d, (String) it.next());
                }
                break;
            default:
                m3.s y10 = this.f20822b.y();
                y10.getClass();
                String tag = this.f20823c;
                Intrinsics.checkNotNullParameter(tag, "tag");
                Iterator it2 = ((List) x.n0(y10.f20360a, true, false, new a2.k(tag, 22))).iterator();
                while (it2.hasNext()) {
                    j.a(this.f20824d, (String) it2.next());
                }
                break;
        }
    }
}
