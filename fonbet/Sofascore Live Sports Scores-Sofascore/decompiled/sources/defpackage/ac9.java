package defpackage;

import android.app.Application;
import com.sofascore.model.mvvm.model.Season;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lac9;", "Lq8;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ac9 extends q8 {
    public static final String l = Season.SubSeasonType.OVERALL.getLabel();
    public final w3b e;
    public final yzc f;
    public final yzc g;
    public Integer h;
    public Integer i;
    public ulj j;
    public String k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac9(w3b w3bVar, Application application) {
        super(application);
        w3bVar.getClass();
        this.e = w3bVar;
        yzc yzcVar = new yzc();
        this.f = yzcVar;
        this.g = yzcVar;
    }

    public final void k(i1g i1gVar) {
        i1gVar.getClass();
        Integer num = this.h;
        if (num != null) {
            int intValue = num.intValue();
            Integer num2 = this.i;
            if (num2 != null) {
                int intValue2 = num2.intValue();
                ulj uljVar = this.j;
                if (uljVar == null) {
                    return;
                }
                xw3.L(un0.z(this), null, null, new zb9(this, uljVar, intValue, intValue2, i1gVar, (rq3) null), 3);
            }
        }
    }
}
