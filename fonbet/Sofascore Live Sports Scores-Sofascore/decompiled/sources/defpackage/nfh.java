package defpackage;

import android.content.Context;
import com.sofascore.results.feed.compose.model.ShortVideoFeedCardModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class nfh implements Function1 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ w31 d;

    public nfh(ct8 ct8Var, int i, f49 f49Var) {
        this.c = ct8Var;
        this.b = i;
        this.d = f49Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        w31 w31Var = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                nv.B((Context) obj2, (ShortVideoFeedCardModel) w31Var, ((Number) obj).longValue(), this.b, true);
                break;
            default:
                ShortVideoFeedCardModel shortVideoFeedCardModel = (ShortVideoFeedCardModel) obj;
                shortVideoFeedCardModel.getClass();
                ct8 ct8Var = (ct8) obj2;
                int i2 = shortVideoFeedCardModel.g;
                gv9 gv9Var = ((f49) w31Var).m;
                String str = shortVideoFeedCardModel.l;
                if (str == null) {
                    str = "";
                }
                int i3 = this.b;
                ct8Var.invoke(new iw7(i2, i3, str, gv9Var), Integer.valueOf(i3), Integer.valueOf(i2));
                break;
        }
        return Unit.a;
    }

    public nfh(Context context, ShortVideoFeedCardModel shortVideoFeedCardModel, int i) {
        this.c = context;
        this.d = shortVideoFeedCardModel;
        this.b = i;
    }
}
