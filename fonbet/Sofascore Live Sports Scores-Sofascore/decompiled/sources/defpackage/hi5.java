package defpackage;

import android.app.Application;
import com.sofascore.model.mvvm.model.Stadium;
import com.sofascore.model.mvvm.model.Venue;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lhi5;", "Lq8;", "Lcn9;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class hi5 extends q8 implements cn9 {
    public final /* synthetic */ wj9 e;
    public final e64 f;
    public final Venue g;
    public Integer h;
    public String i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hi5(e64 e64Var, fqg fqgVar, Application application) {
        super(application);
        Stadium stadium;
        String name;
        Stadium stadium2;
        e64Var.getClass();
        fqgVar.getClass();
        this.e = new wj9(2);
        this.f = e64Var;
        Venue venue = (Venue) fqgVar.a("ARG_VENUE");
        this.g = venue;
        this.h = (venue == null || (stadium2 = venue.getStadium()) == null) ? null : stadium2.getCapacity();
        this.i = (venue == null || (stadium = venue.getStadium()) == null || (name = stadium.getName()) == null) ? "" : name;
    }

    @Override // defpackage.cn9
    public final yzc b() {
        return (yzc) this.e.c;
    }
}
