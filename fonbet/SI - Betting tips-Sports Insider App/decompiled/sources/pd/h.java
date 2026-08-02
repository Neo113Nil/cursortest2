package pd;

import com.sports.insider.R;
import com.sports.insider.ui.activities.MainActivity;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f21769b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MainActivity f21770c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(MainActivity mainActivity, Continuation continuation, int i5) {
        super(2, continuation);
        this.f21769b = i5;
        this.f21770c = mainActivity;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f21769b) {
            case 0:
                return new h(this.f21770c, continuation, 0);
            case 1:
                return new h(this.f21770c, continuation, 1);
            case 2:
                return new h(this.f21770c, continuation, 2);
            case 3:
                return new h(this.f21770c, continuation, 3);
            case 4:
                return new h(this.f21770c, continuation, 4);
            default:
                return new h(this.f21770c, continuation, 5);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        eg.z zVar = (eg.z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f21769b) {
            case 3:
                ((h) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
                break;
        }
        return ((h) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c8, code lost:
    
        if (r8.intValue() != com.sports.insider.R.id.liveFragment) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00dc, code lost:
    
        if (r8.intValue() != com.sports.insider.R.id.livePayFragment) goto L43;
     */
    @Override // mf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object direction;
        int i5 = this.f21769b;
        com.android.billingclient.api.i iVar = null;
        com.android.billingclient.api.i iVar2 = null;
        r4 = null;
        y1.c0 fVar = null;
        MainActivity mainActivity = this.f21770c;
        switch (i5) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                h8.b.B(obj);
                Set set = MainActivity.J0;
                if (mainActivity.H().f21792b) {
                    mainActivity.W();
                } else {
                    com.android.billingclient.api.i iVar3 = mainActivity.f6885h0;
                    if (iVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("queueController");
                    } else {
                        iVar = iVar3;
                    }
                    y1.a direction2 = new y1.a(R.id.action_global_bonusesInfo);
                    Intrinsics.checkNotNullExpressionValue(direction2, "actionGlobalBonusesInfo(...)");
                    iVar.getClass();
                    Intrinsics.checkNotNullParameter(direction2, "direction");
                    ((kotlin.collections.l) iVar.f4029c).addLast(direction2);
                }
                return Unit.f19194a;
            case 1:
                lf.a aVar2 = lf.a.f20034a;
                h8.b.B(obj);
                Set set2 = MainActivity.J0;
                if (mainActivity.H().f21792b) {
                    try {
                        boolean e7 = da.r.e();
                        y1.f0 C = mainActivity.C();
                        y1.b0 f6 = C.f25625b.f();
                        Integer num = f6 != null ? new Integer(f6.f25534b.f3017e) : null;
                        if (e7) {
                            if (num != null) {
                                break;
                            }
                            fVar = new y1.a(R.id.action_global_liveFragment);
                        } else {
                            if (num != null) {
                                break;
                            }
                            fVar = new da.f();
                        }
                        if (fVar == null) {
                            return Unit.f19194a;
                        }
                        if (mainActivity.f3250a.f2169d.a(androidx.lifecycle.x.f2256d)) {
                            C.d(fVar);
                        } else {
                            zc.d.c("isAtLeast not State.STARTED." + num + ':' + e7, "handlePushLive");
                        }
                    } catch (Exception e9) {
                        zc.d.b(4, "handlePushLive", e9);
                    }
                } else {
                    if (da.r.e()) {
                        direction = new y1.a(R.id.action_global_liveFragment);
                        Intrinsics.checkNotNullExpressionValue(direction, "actionGlobalLiveFragment(...)");
                    } else {
                        direction = new da.f();
                        Intrinsics.checkNotNullExpressionValue(direction, "actionGlobalLivePayFragment(...)");
                    }
                    com.android.billingclient.api.i iVar4 = mainActivity.f6885h0;
                    if (iVar4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("queueController");
                    } else {
                        iVar2 = iVar4;
                    }
                    iVar2.getClass();
                    Intrinsics.checkNotNullParameter(direction, "direction");
                    ((kotlin.collections.l) iVar2.f4029c).addLast(direction);
                }
                return Unit.f19194a;
            case 2:
                lf.a aVar3 = lf.a.f20034a;
                h8.b.B(obj);
                Set set3 = MainActivity.J0;
                mainActivity.Y(-1);
                new cd.d().i("PushClickAction");
                return Unit.f19194a;
            case 3:
                lf.a aVar4 = lf.a.f20034a;
                h8.b.B(obj);
                try {
                    mainActivity.U();
                    throw null;
                } catch (Exception e10) {
                    zc.d.b(4, "observerState40X", e10);
                    da.r.b(400);
                    return Boolean.TRUE;
                }
            case 4:
                lf.a aVar5 = lf.a.f20034a;
                h8.b.B(obj);
                return x1.b.a(mainActivity);
            default:
                lf.a aVar6 = lf.a.f20034a;
                h8.b.B(obj);
                Set set4 = MainActivity.J0;
                mainActivity.H().g(false);
                return Unit.f19194a;
        }
    }
}
