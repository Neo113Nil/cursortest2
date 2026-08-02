package hd;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.google.firebase.messaging.x;
import eg.z;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okio.Segment;
import wc.j0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f10524b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f10525c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f10526d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f10527e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f10528f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Intent intent, boolean z5, Context context, l1.a aVar, Continuation continuation) {
        super(2, continuation);
        this.f10524b = 0;
        this.f10526d = intent;
        this.f10525c = z5;
        this.f10527e = context;
        this.f10528f = aVar;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f10524b) {
            case 0:
                return new e((Intent) this.f10526d, this.f10525c, (Context) this.f10527e, (l1.a) this.f10528f, continuation);
            case 1:
                return new e((x) this.f10526d, (ic.a) this.f10527e, this.f10525c, (ic.a) this.f10528f, continuation, 1);
            default:
                return new e((j0) this.f10526d, (ic.a) this.f10527e, this.f10525c, (ic.a) this.f10528f, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f10524b) {
        }
        return ((e) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        ic.e eVar;
        int i5 = this.f10524b;
        Object obj2 = this.f10528f;
        boolean z5 = this.f10525c;
        Object obj3 = this.f10527e;
        Object obj4 = this.f10526d;
        switch (i5) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                h8.b.B(obj);
                try {
                    Intent createChooser = Intent.createChooser((Intent) obj4, "Open link");
                    createChooser.addFlags(67108864);
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 < 24 || i10 >= 28) {
                        createChooser.addFlags(268435456);
                    }
                    if (i10 >= 30 && z5) {
                        createChooser.addFlags(Segment.SHARE_MINIMUM);
                    }
                    ((Context) obj3).startActivity(createChooser);
                } catch (ActivityNotFoundException e7) {
                    String message = e7.getMessage();
                    if (message == null) {
                        message = d9.e.l(new StringBuilder("chooser "), z5 ? "nonBROWSER" : "", " ActivityNotFoundException");
                    }
                    zc.d.c(message, null);
                    l1.a.E();
                }
                return Unit.f19194a;
            case 1:
                lf.a aVar2 = lf.a.f20034a;
                h8.b.B(obj);
                rc.a aVar3 = (rc.a) ((x) obj4).f6184c;
                ic.a aVar4 = (ic.a) obj3;
                ic.a aVar5 = (ic.a) obj2;
                aVar3.getClass();
                if (aVar5 == null && aVar4 == null) {
                    return null;
                }
                if (aVar4 == null) {
                    Intrinsics.checkNotNull(aVar5);
                    eVar = new ic.e(rc.a.d(aVar3, aVar5, z5), null);
                } else {
                    eVar = new ic.e(rc.a.d(aVar3, aVar4, z5), aVar5 != null ? rc.a.d(aVar3, aVar5, false) : null);
                }
                return eVar;
            default:
                lf.a aVar6 = lf.a.f20034a;
                h8.b.B(obj);
                rc.a aVar7 = ((j0) obj4).f25126i;
                return new Pair(aVar7.c((ic.a) obj3, z5), aVar7.c((ic.a) obj2, false));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj, ic.a aVar, boolean z5, ic.a aVar2, Continuation continuation, int i5) {
        super(2, continuation);
        this.f10524b = i5;
        this.f10526d = obj;
        this.f10527e = aVar;
        this.f10525c = z5;
        this.f10528f = aVar2;
    }
}
