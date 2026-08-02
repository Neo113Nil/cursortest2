package defpackage;

import android.content.Context;
import android.content.Intent;
import com.sofascore.results.tv.TVScheduleActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class mx5 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ k3k b;

    public /* synthetic */ mx5(k3k k3kVar, int i) {
        this.a = i;
        this.b = k3kVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        k3k k3kVar = this.b;
        switch (i) {
            case 0:
                int i2 = TVScheduleActivity.O;
                Context context = k3kVar.getContext();
                context.getClass();
                context.startActivity(new Intent(context, (Class<?>) TVScheduleActivity.class));
                return Unit.a;
            case 1:
                int i3 = TVScheduleActivity.O;
                Context context2 = k3kVar.getContext();
                context2.getClass();
                context2.startActivity(new Intent(context2, (Class<?>) TVScheduleActivity.class));
                return Unit.a;
            case 2:
                return k3k.m(k3kVar);
            default:
                Function0 function0 = k3kVar.q;
                if (function0 != null) {
                    function0.invoke();
                }
                return Unit.a;
        }
    }
}
