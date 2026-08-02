package defpackage;

import android.app.Application;
import com.sofascore.model.mvvm.model.Season;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lonk;", "Lq8;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class onk extends q8 {
    public final unk e;
    public final yzc f;
    public final yzc g;
    public final yzc h;
    public final yzc i;
    public String j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public onk(Application application, unk unkVar) {
        super(application);
        unkVar.getClass();
        this.e = unkVar;
        yzc yzcVar = new yzc();
        this.f = yzcVar;
        this.g = yzcVar;
        yzc yzcVar2 = new yzc();
        this.h = yzcVar2;
        this.i = yzcVar2;
        this.j = Season.YEAR_ALL_TIME;
    }
}
