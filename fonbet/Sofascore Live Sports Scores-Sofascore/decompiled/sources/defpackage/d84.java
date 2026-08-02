package defpackage;

import android.content.Context;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class d84 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ Integer c;

    public /* synthetic */ d84(Context context, Integer num, int i) {
        this.a = i;
        this.b = context;
        this.c = num;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Integer num = this.c;
        Context context = this.b;
        List list = (List) obj;
        switch (i) {
            case 0:
                list.getClass();
                v02.l(context, list, num);
                break;
            case 1:
                list.getClass();
                v02.l(context, list, num);
                break;
            default:
                list.getClass();
                v02.l(context, list, num);
                break;
        }
        return Unit.a;
    }
}
