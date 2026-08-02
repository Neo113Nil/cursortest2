package defpackage;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.l;
import androidx.viewpager2.widget.ViewPager2;
import com.blaze.blazesdk.features.videos.players.ui.a;
import com.blaze.blazesdk.players.models.B;
import com.blaze.blazesdk.players.models.H;
import com.blaze.blazesdk.players.ui.n;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class q2d extends hoi implements Function2 {
    public Object r;
    public int s;
    public /* synthetic */ Object t;
    public final /* synthetic */ a u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2d(a aVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.u = aVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        q2d q2dVar = new q2d(this.u, rq3Var);
        q2dVar.t = obj;
        return q2dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        q2d q2dVar = new q2d(this.u, (rq3) obj2);
        q2dVar.t = (ywl) obj;
        return q2dVar.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a6, code lost:
    
        if (r1.I(r4, r12) == r0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x014a, code lost:
    
        if (r1.I(r2, r12) == r0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0161, code lost:
    
        if (r1.I(r2, r12) == r0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x006a, code lost:
    
        if (r9.z(r10, r11, r12) == r0) goto L71;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ywl ywlVar;
        lu3 lu3Var = lu3.a;
        int i = this.s;
        a aVar = this.u;
        if (i == 0) {
            y6a.M(obj);
            ywlVar = (ywl) this.t;
            dxm dxmVar = aVar.q;
            if (aVar.J() && (r9 = aVar.r) != null) {
                int currentItem = dxmVar.e.getCurrentItem();
                boolean z = ywlVar == ywl.c;
                this.t = ywlVar;
                this.r = dxmVar;
                this.s = 1;
            }
        } else {
            if (i != 1) {
                if (i == 2 || i == 3) {
                    y6a.M(obj);
                    return Unit.a;
                }
                if (i != 4) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                aVar = (a) this.r;
                y6a.M(obj);
                int i2 = a.I;
                w3m w3mVar = (w3m) aVar.getViewModel();
                w3mVar.T.k(Boolean.valueOf(w3mVar.S.getAndSet(false)));
                w3mVar.u(qvm.a);
                return Unit.a;
            }
            ywlVar = (ywl) this.t;
            y6a.M(obj);
        }
        dxm dxmVar2 = aVar.q;
        switch (ywlVar.ordinal()) {
            case 0:
            case 1:
                break;
            case 2:
                aVar.p();
                break;
            case 3:
                ((w3m) aVar.getViewModel()).getClass();
                break;
            case 4:
                aVar.j(H.ASSETS_EXPIRY);
                break;
            case 5:
                lzm lzmVar = aVar.r;
                if (lzmVar != null) {
                    int currentItem2 = dxmVar2.e.getCurrentItem();
                    this.t = dxmVar2;
                    this.r = null;
                    this.s = 2;
                    break;
                }
                break;
            case 6:
                lzm lzmVar2 = aVar.r;
                if (lzmVar2 != null) {
                    int currentItem3 = dxmVar2.e.getCurrentItem();
                    this.t = dxmVar2;
                    this.r = null;
                    this.s = 3;
                    break;
                }
                break;
            case 7:
                dxm dxmVar3 = aVar.q;
                FragmentActivity activity = aVar.getActivity();
                activity.getClass();
                Fragment F = activity.k().F("ClosedCaptionsBottomSheetFragment");
                n nVar = F instanceof n ? (n) F : null;
                if (nVar != null) {
                    nVar.k(false, false);
                }
                B b = ((w3m) aVar.getViewModel()).p0;
                if (b != null) {
                    H h = H.VIDEO_FINISHED;
                    h.getClass();
                    b.c = h;
                }
                ViewPager2 viewPager2 = dxmVar3.e;
                int currentItem4 = viewPager2.getCurrentItem() + 1;
                l adapter = viewPager2.getAdapter();
                if (currentItem4 <= (adapter != null ? adapter.getItemCount() - 1 : -1)) {
                    viewPager2.c(currentItem4, false);
                } else if (aVar.t() && ((w3m) aVar.getViewModel()).L()) {
                    Function0 function0 = aVar.B;
                    if (function0 != null) {
                        function0.invoke();
                    }
                } else {
                    aVar.o(new s(aVar, null));
                }
                break;
            case 8:
                Context context = aVar.getContext();
                if (context != null) {
                    if (cnb.g(context)) {
                        ((w3m) aVar.getViewModel()).T();
                    } else {
                        lzm lzmVar3 = aVar.r;
                        if (lzmVar3 != null) {
                            int currentItem5 = dxmVar2.e.getCurrentItem();
                            this.t = dxmVar2;
                            this.r = aVar;
                            this.s = 4;
                            break;
                        }
                        int i22 = a.I;
                        w3m w3mVar2 = (w3m) aVar.getViewModel();
                        w3mVar2.T.k(Boolean.valueOf(w3mVar2.S.getAndSet(false)));
                        w3mVar2.u(qvm.a);
                    }
                }
                break;
            default:
                zzl.b();
                break;
        }
        return null;
    }
}
