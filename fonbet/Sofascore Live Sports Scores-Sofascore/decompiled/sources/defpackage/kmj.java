package defpackage;

import android.content.Context;
import com.sofascore.local_persistance.Brand;
import com.sofascore.model.branding.BrandLocation;
import com.sofascore.model.branding.BrandType;
import com.sofascore.results.weeklyChallenge.WeeklyChallengeViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class kmj implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kmj(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                lmj lmjVar = (lmj) obj2;
                Context context = lmjVar.getContext();
                context.getClass();
                nv.q(context, Integer.valueOf(lmjVar.n), BrandLocation.EventScreen, ((Brand) obj).getSlug(), BrandType.STRIPE);
                break;
            case 1:
                ((WeeklyChallengeViewModel) obj2).B.a(Integer.valueOf(((edk) obj).a));
                break;
            case 2:
                ((Function1) obj2).invoke(((l3l) obj).g);
                break;
            default:
                ((Function1) obj2).invoke(new vkl((uv3) obj));
                break;
        }
        return Unit.a;
    }
}
