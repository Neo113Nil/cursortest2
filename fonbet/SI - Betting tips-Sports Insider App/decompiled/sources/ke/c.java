package ke;

import android.graphics.Typeface;
import com.sports.insider.R;
import eg.z;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19026b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zc.k f19027c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(zc.k kVar, Continuation continuation, int i5) {
        super(2, continuation);
        this.f19026b = i5;
        this.f19027c = kVar;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f19026b) {
            case 0:
                return new c(this.f19027c, continuation, 0);
            case 1:
                return new c(this.f19027c, continuation, 1);
            default:
                return new c(this.f19027c, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f19026b) {
        }
        return ((c) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        Typeface typeface;
        switch (this.f19026b) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                h8.b.B(obj);
                ((za.i) zc.k.e()).getClass();
                ve.s c2 = za.i.c();
                if (c2.f24830d == null) {
                    try {
                        typeface = f0.l.b(c2.f24827a, R.font.montserrat_black);
                    } catch (Exception unused) {
                        typeface = null;
                    }
                    c2.f24830d = typeface;
                }
                return c2.f24830d;
            case 1:
                lf.a aVar2 = lf.a.f20034a;
                h8.b.B(obj);
                return zc.k.c();
            default:
                lf.a aVar3 = lf.a.f20034a;
                h8.b.B(obj);
                return zc.k.a();
        }
    }
}
