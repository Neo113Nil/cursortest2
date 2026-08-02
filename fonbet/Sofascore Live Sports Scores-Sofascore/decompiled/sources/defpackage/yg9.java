package defpackage;

import android.content.Context;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class yg9 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ yg9(int i, int i2, znh znhVar) {
        this.a = 1;
        this.b = i;
        this.c = i2;
        this.d = znhVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        int i2 = this.c;
        int i3 = this.b;
        Object obj = this.d;
        switch (i) {
            case 0:
                zg9 zg9Var = (zg9) obj;
                try {
                    zg9Var.x.j(i3, i2, true);
                } catch (IOException e) {
                    tp5 tp5Var = tp5.PROTOCOL_ERROR;
                    zg9Var.e(tp5Var, tp5Var, e);
                }
                return Unit.a;
            case 1:
                int b = wzb.b(((i3 - ((znh) obj).h()) / i2) * 900.0f);
                if (b < 200) {
                    b = 200;
                }
                return Integer.valueOf(b);
            default:
                Context context = ((gai) obj).b;
                String string = context.getString(i3);
                string.getClass();
                String string2 = context.getString(i2);
                string2.getClass();
                f7a.w(context, string, string2, "StatisticsModal", null);
                return Unit.a;
        }
    }

    public /* synthetic */ yg9(Object obj, int i, int i2, int i3) {
        this.a = i3;
        this.d = obj;
        this.b = i;
        this.c = i2;
    }
}
