package defpackage;

import android.app.Application;
import android.content.SharedPreferences;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.odds.OddsCountryProvider;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lkk;", "Lynb;", "Lek;", "Lai;", "Lpld;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class kk extends ynb {
    public final ddi l;
    public final umd m;
    public final amd n;
    public final SharedPreferences o;
    public OddsCountryProvider p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kk(Application application, ddi ddiVar, umd umdVar, amd amdVar, SharedPreferences sharedPreferences) {
        super(application, tnb.a);
        ddiVar.getClass();
        umdVar.getClass();
        amdVar.getClass();
        sharedPreferences.getClass();
        this.l = ddiVar;
        this.m = umdVar;
        this.n = amdVar;
        this.o = sharedPreferences;
    }

    public final Event t() {
        return (Event) this.l.getValue();
    }
}
