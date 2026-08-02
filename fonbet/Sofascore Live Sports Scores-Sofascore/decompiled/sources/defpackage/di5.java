package defpackage;

import android.app.Application;
import com.sofascore.model.mvvm.model.FieldTranslations;
import com.sofascore.model.mvvm.model.Manager;
import com.sofascore.model.mvvm.model.Stadium;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.Venue;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Ldi5;", "Lq8;", "Lcn9;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class di5 extends q8 implements cn9 {
    public final /* synthetic */ wj9 e;
    public final e64 f;
    public g9i g;
    public g9i h;
    public final yzc i;
    public final yzc j;
    public final yzc k;
    public final yzc l;
    public final Team m;
    public final String n;
    public String o;
    public String p;
    public String q;
    public Manager r;
    public Venue s;
    public String t;
    public Integer u;
    public String v;
    public Integer w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public di5(e64 e64Var, fqg fqgVar, Application application) {
        super(application);
        Venue venue;
        Venue venue2;
        String shortName;
        FieldTranslations fieldTranslations;
        e64Var.getClass();
        fqgVar.getClass();
        this.e = new wj9(2);
        this.f = e64Var;
        yzc yzcVar = new yzc();
        this.i = yzcVar;
        this.j = yzcVar;
        yzc yzcVar2 = new yzc();
        this.k = yzcVar2;
        this.l = yzcVar2;
        Team team = (Team) fqgVar.a("ARG_TEAM");
        this.m = team;
        String str = "";
        String name = (team == null || (fieldTranslations = team.getFieldTranslations()) == null || (name = tba.r(fieldTranslations)) == null) ? team != null ? team.getName() : "" : name;
        this.n = name;
        this.o = name;
        if (team != null && (shortName = team.getShortName()) != null) {
            str = shortName;
        }
        this.p = str;
        Integer num = null;
        this.r = team != null ? team.getManager() : null;
        this.s = team != null ? team.getVenue() : null;
        this.t = (team == null || (venue2 = team.getVenue()) == null) ? null : venue2.getName();
        if (team != null && (venue = team.getVenue()) != null) {
            num = venue.getCapacity();
        }
        this.u = num;
        this.v = this.t;
        this.w = num;
    }

    @Override // defpackage.cn9
    public final yzc b() {
        return (yzc) this.e.c;
    }

    public final void k(Venue venue) {
        Stadium stadium;
        Stadium stadium2;
        this.s = venue;
        Integer num = null;
        this.t = (venue == null || (stadium2 = venue.getStadium()) == null) ? null : stadium2.getName();
        if (venue != null && (stadium = venue.getStadium()) != null) {
            num = stadium.getCapacity();
        }
        this.u = num;
    }
}
