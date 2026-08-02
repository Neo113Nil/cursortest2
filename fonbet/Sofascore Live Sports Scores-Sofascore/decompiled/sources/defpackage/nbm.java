package defpackage;

import androidx.viewpager2.widget.ViewPager2;
import com.blaze.blazesdk.features.stories.models.args.b;
import com.blaze.blazesdk.players.models.H;
import com.blaze.blazesdk.shared.BlazeSDK;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class nbm implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ obm b;

    public /* synthetic */ nbm(obm obmVar, int i) {
        this.a = i;
        this.b = obmVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        obm obmVar = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                int i2 = obm.D;
                if (str != null) {
                    n1n n1nVar = n1n.a;
                    obm obmVar2 = this.b;
                    obmVar2.e(n1nVar, false);
                    b bVar = obmVar2.p;
                    ful.invokeShareChooser$default(obmVar2, str, null, tub.h(new Pair("storyId", String.valueOf(bVar.i)), new Pair("pageId", String.valueOf(bVar.j)), new Pair("link text", str)), 2, null);
                }
                return Unit.a;
            case 1:
                cxl cxlVar = (cxl) obj;
                int i3 = obm.D;
                cxlVar.getClass();
                ((ilm) obmVar.getViewModel()).a0(cxlVar);
                return Unit.a;
            case 2:
                Pair pair = (Pair) obj;
                int i4 = obm.D;
                pair.getClass();
                try {
                    ViewPager2 viewPager2 = obmVar.q.e;
                    Object obj2 = pair.b;
                    Object obj3 = pair.a;
                    int ordinal = ((wrl) obj2).ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal != 2) {
                                throw new ndd();
                            }
                            if (((Boolean) obj3).booleanValue()) {
                                obmVar.j(H.STORIES_COMPLETED);
                            } else {
                                viewPager2.getClass();
                                evl.k(viewPager2, lz.A(viewPager2) ? tml.FORWARD : tml.BACKWARD);
                            }
                        }
                    } else if (((Boolean) obj3).booleanValue()) {
                        obmVar.j(H.SKIP);
                    } else {
                        viewPager2.getClass();
                        evl.k(viewPager2, lz.A(viewPager2) ? tml.BACKWARD : tml.FORWARD);
                    }
                } catch (Throwable th) {
                    BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
                }
                return Unit.a;
            case 3:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                int i5 = obm.D;
                obmVar.o(new hjd(obmVar, booleanValue, null));
                return Unit.a;
            default:
                ((Boolean) obj).getClass();
                int i6 = obm.D;
                ilm ilmVar = (ilm) obmVar.getViewModel();
                ilmVar.y.k(null);
                ilmVar.k(a1n.a, false);
                return Unit.a;
        }
    }
}
