package da;

import com.sports.insider.MyApp;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class q implements p0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8342a;

    public /* synthetic */ q(int i5) {
        this.f8342a = i5;
    }

    @Override // p0.a
    public final void accept(Object obj) {
        Throwable t3 = (Throwable) obj;
        switch (this.f8342a) {
            case 0:
                jg.d dVar = MyApp.f6830c;
                Intrinsics.checkNotNullParameter(t3, "t");
                zc.d.b(4, "workManagerConfiguration", t3);
                break;
            default:
                jg.d dVar2 = MyApp.f6830c;
                Intrinsics.checkNotNullParameter(t3, "t");
                zc.d.b(4, "InitializationWorkManagerConfiguration", t3);
                break;
        }
    }
}
