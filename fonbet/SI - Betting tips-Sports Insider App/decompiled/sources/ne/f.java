package ne;

import com.sports.insider.ui.settings.SettingFragment;
import eg.c0;
import eg.m0;
import eg.z;
import jg.q;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import zc.k;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20879b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f20880c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ SettingFragment f20881d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(SettingFragment settingFragment, Continuation continuation, int i5) {
        super(2, continuation);
        this.f20879b = i5;
        this.f20881d = settingFragment;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f20879b) {
            case 0:
                f fVar = new f(this.f20881d, continuation, 0);
                fVar.f20880c = obj;
                return fVar;
            default:
                f fVar2 = new f(this.f20881d, continuation, 1);
                fVar2.f20880c = obj;
                return fVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f20879b) {
        }
        return ((f) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        int i5 = this.f20879b;
        int i10 = 1;
        Continuation continuation = null;
        SettingFragment settingFragment = this.f20881d;
        int i11 = 2;
        switch (i5) {
            case 0:
                z zVar = (z) this.f20880c;
                lf.a aVar = lf.a.f20034a;
                h8.b.B(obj);
                k kVar = new k();
                lg.e eVar = m0.f9201a;
                lg.d dVar = lg.d.f20063c;
                c0.e(zVar, dVar, new e(kVar, settingFragment, continuation, 0), 2);
                return c0.e(zVar, dVar, new e(kVar, settingFragment, continuation, i10), 2);
            default:
                z zVar2 = (z) this.f20880c;
                lf.a aVar2 = lf.a.f20034a;
                h8.b.B(obj);
                lg.e eVar2 = m0.f9201a;
                fg.e eVar3 = q.f18523a;
                c0.e(zVar2, eVar3, new h(settingFragment, continuation, i10), 2);
                c0.e(zVar2, eVar3, new h(settingFragment, continuation, i11), 2);
                c0.e(zVar2, eVar3, new h(settingFragment, continuation, 3), 2);
                return Unit.f19194a;
        }
    }
}
