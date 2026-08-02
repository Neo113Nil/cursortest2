package tc;

import android.content.SharedPreferences;
import com.google.android.gms.internal.measurement.y3;
import eg.z;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mf.i;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f extends i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f23849b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ id.c f23850c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(id.c cVar, Continuation continuation, int i5) {
        super(2, continuation);
        this.f23849b = i5;
        this.f23850c = cVar;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f23849b) {
            case 0:
                return new f(this.f23850c, continuation, 0);
            default:
                return new f(this.f23850c, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f23849b) {
        }
        return ((f) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f23849b) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                h8.b.B(obj);
                fa.a aVar2 = (fa.a) y3.m(fa.a.class, null, 6);
                c[] cVarArr = c.f23841a;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter("pressed_close", "key");
                SharedPreferences.Editor edit = aVar2.f9542b.edit();
                edit.putInt("pressed_close", 0);
                edit.apply();
                break;
            default:
                lf.a aVar3 = lf.a.f20034a;
                h8.b.B(obj);
                fa.a aVar4 = (fa.a) y3.m(fa.a.class, null, 6);
                c[] cVarArr2 = c.f23841a;
                aVar4.getClass();
                Intrinsics.checkNotNullParameter("pressed_close", "key");
                SharedPreferences.Editor edit2 = aVar4.f9542b.edit();
                edit2.putInt("pressed_close", 1);
                edit2.apply();
                break;
        }
        return Unit.f19194a;
    }
}
