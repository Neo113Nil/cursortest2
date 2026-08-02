package defpackage;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class zj implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ zj(Context context, Function1 function1, int i) {
        this.a = i;
        this.b = context;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        jtf jtfVar = jtf.a;
        Function1 function1 = this.c;
        Context context = this.b;
        switch (i) {
            case 0:
                nv.z0(context, kv.CLICK, "ai_insights", "odds_tab");
                function1.invoke(zh.a);
                break;
            case 1:
                nv.z0(context, kv.CLICK, "invite_more_friends", "profile");
                function1.invoke(jtfVar);
                break;
            default:
                nv.z0(context, kv.CLICK, "invite_friends", "profile");
                function1.invoke(jtfVar);
                break;
        }
        return Unit.a;
    }
}
