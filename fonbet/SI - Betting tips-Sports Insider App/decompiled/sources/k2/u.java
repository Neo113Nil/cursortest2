package k2;

import androidx.lifecycle.d1;
import com.sports.insider.ui.settings.SettingFragment;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class u extends FunctionReferenceImpl implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18777a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(int i5, Object obj, Class cls, String str, String str2, int i10, int i11) {
        super(i5, obj, cls, str, str2, i10);
        this.f18777a = i11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f18777a) {
            case 0:
                w wVar = (w) this.receiver;
                jg.d dVar = wVar.f18779a;
                r rVar = null;
                if (dVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("coroutineScope");
                    dVar = null;
                }
                eg.c0.g(dVar, null);
                wVar.g().getClass();
                r rVar2 = wVar.f18783e;
                if (rVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("connectionManager");
                } else {
                    rVar = rVar2;
                }
                ((m2.b) rVar.f18752f).close();
                t2.d dVar2 = (t2.d) rVar.f18753g;
                if (dVar2 != null) {
                    dVar2.close();
                }
                return Unit.f19194a;
            case 1:
                SettingFragment settingFragment = (SettingFragment) this.receiver;
                settingFragment.getClass();
                eg.r a7 = eg.c0.a();
                eg.c0.t(d1.g(settingFragment), null, null, new qd.d(settingFragment, a7, (Continuation) null, 2), 3);
                return a7;
            case 2:
                ((zc.k) this.receiver).getClass();
                return zc.k.a();
            default:
                ((zc.k) this.receiver).getClass();
                return zc.k.c();
        }
    }
}
