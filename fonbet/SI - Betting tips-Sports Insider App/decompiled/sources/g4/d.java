package g4;

import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import eg.z;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Drawable f9748b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f9749c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function0 f9750d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Drawable drawable, Function0 function0, Function0 function02, Continuation continuation) {
        super(2, continuation);
        this.f9748b = drawable;
        this.f9749c = function0;
        this.f9750d = function02;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new d(this.f9748b, this.f9749c, this.f9750d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        lf.a aVar = lf.a.f20034a;
        h8.b.B(obj);
        ((AnimatedImageDrawable) this.f9748b).registerAnimationCallback(new h4.c(this.f9749c, this.f9750d));
        return Unit.f19194a;
    }
}
