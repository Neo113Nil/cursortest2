package le;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.sports.insider.R;
import com.sports.insider.ui.pays.LivePayFragment;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class l extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19859b;

    /* renamed from: c, reason: collision with root package name */
    public LivePayFragment f19860c;

    /* renamed from: d, reason: collision with root package name */
    public int f19861d;

    /* renamed from: e, reason: collision with root package name */
    public int f19862e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ LivePayFragment f19863f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(LivePayFragment livePayFragment, Continuation continuation, int i5) {
        super(2, continuation);
        this.f19859b = i5;
        this.f19863f = livePayFragment;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f19859b) {
            case 0:
                return new l(this.f19863f, continuation, 0);
            default:
                return new l(this.f19863f, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        eg.z zVar = (eg.z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f19859b) {
        }
        return ((l) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0069, code lost:
    
        if (r9 == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004f, code lost:
    
        if (r9 == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ce, code lost:
    
        if (r9 == r0) goto L42;
     */
    @Override // mf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i5;
        int i10 = this.f19859b;
        LivePayFragment livePayFragment = this.f19863f;
        int i11 = 0;
        switch (i10) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                int i12 = this.f19862e;
                if (i12 == 0) {
                    h8.b.B(obj);
                    Context context = livePayFragment.getContext();
                    if (context == null) {
                        return null;
                    }
                    livePayFragment.H().getClass();
                    Integer num = new Integer(R.drawable.vip_image_background);
                    this.f19860c = livePayFragment;
                    this.f19861d = 0;
                    this.f19862e = 1;
                    obj = LivePayFragment.G(livePayFragment, context, num, this);
                    if (obj != aVar) {
                        i5 = 0;
                    }
                    return aVar;
                }
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return (Unit) obj;
                }
                i5 = this.f19861d;
                livePayFragment = this.f19860c;
                h8.b.B(obj);
                Drawable drawable = (Drawable) obj;
                if (drawable == null) {
                    return null;
                }
                lg.e eVar = eg.m0.f9201a;
                fg.e eVar2 = jg.q.f18523a;
                k kVar = new k(livePayFragment, drawable, null, 0);
                this.f19860c = null;
                this.f19861d = i5;
                this.f19862e = 2;
                obj = eg.c0.A(eVar2, kVar, this);
                break;
            default:
                lf.a aVar2 = lf.a.f20034a;
                int i13 = this.f19862e;
                if (i13 == 0) {
                    h8.b.B(obj);
                    Context context2 = livePayFragment.getContext();
                    if (context2 == null) {
                        return null;
                    }
                    livePayFragment.H().getClass();
                    Integer num2 = new Integer(R.drawable.image_vip_top);
                    this.f19860c = livePayFragment;
                    this.f19861d = 0;
                    this.f19862e = 1;
                    obj = LivePayFragment.G(livePayFragment, context2, num2, this);
                    break;
                } else {
                    if (i13 != 1) {
                        if (i13 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        return (Unit) obj;
                    }
                    i11 = this.f19861d;
                    livePayFragment = this.f19860c;
                    h8.b.B(obj);
                }
                Drawable drawable2 = (Drawable) obj;
                if (drawable2 == null) {
                    return null;
                }
                lg.e eVar3 = eg.m0.f9201a;
                fg.e eVar4 = jg.q.f18523a;
                k kVar2 = new k(livePayFragment, drawable2, null, 1);
                this.f19860c = null;
                this.f19861d = i11;
                this.f19862e = 2;
                obj = eg.c0.A(eVar4, kVar2, this);
                break;
        }
    }
}
