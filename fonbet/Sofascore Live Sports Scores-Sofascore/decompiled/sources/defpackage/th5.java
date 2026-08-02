package defpackage;

import android.app.Application;
import android.text.TextUtils;
import com.sofascore.model.Country;
import com.sofascore.model.Money;
import com.sofascore.model.mvvm.model.Player;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lth5;", "Lq8;", "Lcn9;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class th5 extends q8 implements cn9 {
    public final /* synthetic */ wj9 e;
    public final e64 f;
    public final Player g;
    public final Country h;
    public String i;
    public String j;
    public Integer k;
    public String l;
    public String m;
    public String n;
    public String o;
    public String p;
    public Long q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public th5(e64 e64Var, fqg fqgVar, Application application) {
        super(application);
        Integer num;
        String position;
        Integer height;
        com.sofascore.model.mvvm.model.Country country;
        fqgVar.getClass();
        e64Var.getClass();
        this.e = new wj9(2);
        this.f = e64Var;
        Player player = (Player) fqgVar.a("ARG_PLAYER");
        this.g = player;
        ArrayList arrayList = dv3.a;
        Country a = dv3.a((player == null || (country = player.getCountry()) == null) ? null : country.getAlpha2());
        this.h = a;
        this.i = player != null ? player.getName() : null;
        if (player == null || (height = player.getHeight()) == null) {
            num = null;
        } else {
            double intValue = height.intValue() / 100.0d;
            num = Integer.valueOf(Intrinsics.c(v7a.u(i()), "METRIC") ? wzb.a(intValue * 100.0d) : wzb.a(intValue / 0.0254d));
        }
        this.k = num;
        this.l = player != null ? player.getJerseyNumber() : null;
        this.m = player != null ? player.getPreferredFoot() : null;
        this.n = (player == null || (position = player.getPosition()) == null) ? "" : position;
        this.o = a != null ? a.getIso3Alpha() : null;
        this.p = l();
    }

    @Override // defpackage.cn9
    public final yzc b() {
        return (yzc) this.e.c;
    }

    public final boolean k(int i, String str) {
        return str != null && !StringsKt.R(str) && TextUtils.isDigitsOnly(str) && str.length() <= i;
    }

    public final String l() {
        Money proposedMarketValueRaw;
        Player player = this.g;
        if (player == null || (proposedMarketValueRaw = player.getProposedMarketValueRaw()) == null || proposedMarketValueRaw.getValue() <= 0) {
            return null;
        }
        Set set = o84.a;
        Long b = o84.b(i(), proposedMarketValueRaw, 0L);
        return String.valueOf(b != null ? b.longValue() : proposedMarketValueRaw.getValue());
    }
}
