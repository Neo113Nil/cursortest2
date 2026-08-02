package ne;

import android.graphics.Typeface;
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
public final class e extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20875b;

    /* renamed from: c, reason: collision with root package name */
    public int f20876c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f20877d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ SettingFragment f20878e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(k kVar, SettingFragment settingFragment, Continuation continuation, int i5) {
        super(2, continuation);
        this.f20875b = i5;
        this.f20877d = kVar;
        this.f20878e = settingFragment;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f20875b) {
            case 0:
                return new e(this.f20877d, this.f20878e, continuation, 0);
            default:
                return new e(this.f20877d, this.f20878e, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f20875b) {
        }
        return ((e) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        Typeface typeface;
        Typeface typeface2;
        int i5 = this.f20875b;
        SettingFragment settingFragment = this.f20878e;
        Unit unit = null;
        switch (i5) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                int i10 = this.f20876c;
                if (i10 == 0) {
                    h8.b.B(obj);
                    try {
                        typeface = k.c();
                    } catch (Exception unused) {
                        typeface = null;
                    }
                    if (typeface != null) {
                        lg.e eVar = m0.f9201a;
                        fg.e eVar2 = q.f18523a;
                        d dVar = new d(settingFragment, typeface, null, 0);
                        this.f20876c = 1;
                        if (c0.A(eVar2, dVar, this) == aVar) {
                            return aVar;
                        }
                    }
                    return unit;
                }
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                h8.b.B(obj);
                unit = Unit.f19194a;
                return unit;
            default:
                lf.a aVar2 = lf.a.f20034a;
                int i11 = this.f20876c;
                if (i11 == 0) {
                    h8.b.B(obj);
                    try {
                        typeface2 = k.a();
                    } catch (Exception unused2) {
                        typeface2 = null;
                    }
                    if (typeface2 != null) {
                        lg.e eVar3 = m0.f9201a;
                        fg.e eVar4 = q.f18523a;
                        d dVar2 = new d(settingFragment, typeface2, null, 1);
                        this.f20876c = 1;
                        if (c0.A(eVar4, dVar2, this) == aVar2) {
                            return aVar2;
                        }
                    }
                    return unit;
                }
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                h8.b.B(obj);
                unit = Unit.f19194a;
                return unit;
        }
    }
}
