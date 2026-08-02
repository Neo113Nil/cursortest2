package defpackage;

import android.content.Context;
import com.sofascore.results.profile.ProfileActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class z9f implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boh b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ gta d;
    public final /* synthetic */ qbf e;

    public /* synthetic */ z9f(boh bohVar, Context context, gta gtaVar, qbf qbfVar, int i) {
        this.a = i;
        this.b = bohVar;
        this.c = context;
        this.d = gtaVar;
        this.e = qbfVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        qbf qbfVar = this.e;
        gta gtaVar = this.d;
        boh bohVar = this.b;
        Context context = this.c;
        switch (i) {
            case 0:
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - bohVar.h() >= 200) {
                    bohVar.i(currentTimeMillis);
                    nv.n0(context, sea.o(gtaVar));
                    int i2 = ProfileActivity.Q;
                    v8a.H(context, qbfVar.a, qbfVar.d);
                }
                break;
            case 1:
                long currentTimeMillis2 = System.currentTimeMillis();
                if (currentTimeMillis2 - bohVar.h() >= 200) {
                    bohVar.i(currentTimeMillis2);
                    nv.n0(context, sea.o(gtaVar));
                    int i3 = ProfileActivity.Q;
                    v8a.H(context, qbfVar.a, qbfVar.d);
                }
                break;
            default:
                long currentTimeMillis3 = System.currentTimeMillis();
                if (currentTimeMillis3 - bohVar.h() >= 200) {
                    bohVar.i(currentTimeMillis3);
                    nv.n0(context, sea.o(gtaVar));
                    int i4 = ProfileActivity.Q;
                    v8a.H(context, qbfVar.a, qbfVar.d);
                }
                break;
        }
        return Unit.a;
    }
}
