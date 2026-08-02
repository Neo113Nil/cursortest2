package pd;

import androidx.lifecycle.d1;
import com.sports.insider.MyApp;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class d0 implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21750a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.sports.insider.ui.activities.a f21751b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ eg.z f21752c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f21753d;

    public /* synthetic */ d0(int i5, com.sports.insider.ui.activities.a aVar, eg.z zVar, boolean z5) {
        this.f21750a = i5;
        this.f21751b = aVar;
        this.f21752c = zVar;
        this.f21753d = z5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        if (r2.a(com.google.android.play.core.appupdate.n.a(1).a()) != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        if (r2.a(com.google.android.play.core.appupdate.n.a(0).a()) != null) goto L10;
     */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        com.google.android.play.core.appupdate.a aVar = (com.google.android.play.core.appupdate.a) obj;
        int i5 = aVar.f5989b;
        com.sports.insider.ui.activities.a aVar2 = this.f21751b;
        if (i5 == 2) {
            int i10 = aVar.f5988a;
            int i11 = this.f21750a;
            boolean z5 = false;
            if (i11 != 0) {
                if (i11 == 1) {
                    Intrinsics.checkNotNull(aVar);
                }
                boolean z7 = z5;
                int i12 = com.sports.insider.ui.activities.a.G;
                jg.d dVar = MyApp.f6830c;
                eg.z zVar = this.f21752c;
                eg.c0.t(dVar, zVar.C(), null, new e0(aVar2, aVar, i10, i11, null), 2);
                if (z7) {
                    eg.c0.t(d1.g(aVar2), zVar.C().t(jg.q.f18523a), null, new e0(aVar2, aVar, i11, null), 2);
                    eg.c0.t(dVar, zVar.C(), null, new a0(aVar2, i11, i10, null), 2);
                }
            } else {
                Intrinsics.checkNotNull(aVar);
            }
        }
        boolean z10 = this.f21753d;
        if (i5 == 1) {
            int i13 = com.sports.insider.ui.activities.a.G;
            z.a();
            if (z10) {
                com.sports.insider.ui.activities.a.x(aVar2);
            }
        }
        if (i5 == 0 && z10) {
            com.sports.insider.ui.activities.a.x(aVar2);
        }
        return Unit.f19194a;
    }
}
