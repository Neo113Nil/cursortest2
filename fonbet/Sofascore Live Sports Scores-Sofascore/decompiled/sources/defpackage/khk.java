package defpackage;

import android.os.StatFs;
import androidx.compose.runtime.e;
import com.inmobi.media.Ve;
import com.sofascore.model.mvvm.model.Venue;
import com.sofascore.model.newNetwork.ValuableUserResponse;
import com.sofascore.model.newNetwork.VenueResponse;
import com.sofascore.model.newNetwork.VenueSportsResponse;
import com.sofascore.model.newNetwork.cpc.ValuableUserVersionsResponse;
import com.sofascore.model.newNetwork.topperformance.response.VolleyballTopPlayersStatistics;
import com.sofascore.model.profile.UserSubscriptions;
import java.io.File;
import java.time.format.DateTimeFormatterBuilder;
import kotlin.Unit;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final /* synthetic */ class khk implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ khk(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        KSerializer _childSerializers$_anonymous_$1;
        KSerializer _childSerializers$_anonymous_;
        KSerializer _childSerializers$_anonymous_2;
        KSerializer _childSerializers$_anonymous_3;
        KSerializer _childSerializers$_anonymous_$0;
        KSerializer _childSerializers$_anonymous_4;
        KSerializer _childSerializers$_anonymous_5;
        KSerializer _childSerializers$_anonymous_6;
        KSerializer _childSerializers$_anonymous_$02;
        KSerializer _childSerializers$_anonymous_$12;
        KSerializer _childSerializers$_anonymous_$2;
        switch (this.a) {
            case 0:
                _childSerializers$_anonymous_$1 = UserSubscriptions._childSerializers$_anonymous_$1();
                return _childSerializers$_anonymous_$1;
            case 1:
                phk phkVar = new phk(new ef0(0));
                v9g.v(phkVar, new Function1[]{new sbk(12)}, new sbk(13));
                Unit unit = Unit.a;
                return new qhk(phkVar.build());
            case 2:
                phk phkVar2 = new phk(new ef0(0));
                v9g.v(phkVar2, new Function1[]{new sbk(6)}, new sbk(7));
                Unit unit2 = Unit.a;
                return new qhk(phkVar2.build());
            case 3:
                ef0 ef0Var = new ef0(0);
                ef0Var.a(new zgh(new xn1(new xhk(k3e.b))));
                ef0Var.a(new xn1(new uhk(k3e.b)));
                Unit unit3 = Unit.a;
                return new qhk(new of2(ef0Var.a));
            case 4:
                return new DateTimeFormatterBuilder().parseCaseInsensitive().appendOffsetId().toFormatter();
            case 5:
                return new DateTimeFormatterBuilder().parseCaseInsensitive().appendOffset("+HHmmss", "Z").toFormatter();
            case 6:
                return new DateTimeFormatterBuilder().parseCaseInsensitive().appendOffset("+HHMM", "+0000").toFormatter();
            case 7:
                uha uhaVar = s18.a;
                g gVar = g.a;
                uae e = s18.b.e("coil3_disk_cache");
                long j = 10485760;
                try {
                    File file = e.toFile();
                    file.mkdir();
                    StatFs statFs = new StatFs(file.getAbsolutePath());
                    j = llf.e((long) (0.02d * statFs.getBlockSizeLong() * statFs.getBlockCountLong()), 10485760L, 262144000L);
                } catch (Exception unused) {
                }
                return new sof(j, e, uhaVar, gVar);
            case 8:
                _childSerializers$_anonymous_ = ValuableUserResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_;
            case 9:
                _childSerializers$_anonymous_2 = ValuableUserVersionsResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_2;
            case 10:
                return Ve.a();
            case 11:
                return Ve.e();
            case 12:
                return Ve.d();
            case 13:
                return Ve.i();
            case 14:
                return Ve.b();
            case 15:
                return Ve.c();
            case 16:
                return Ve.f();
            case 17:
                return Ve.g();
            case 18:
                return Ve.h();
            case 19:
                _childSerializers$_anonymous_3 = Venue._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_3;
            case 20:
                _childSerializers$_anonymous_$0 = Venue._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$0;
            case 21:
                _childSerializers$_anonymous_4 = VenueResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_4;
            case 22:
                _childSerializers$_anonymous_5 = VenueSportsResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_5;
            case 23:
                return Unit.a;
            case 24:
                return Unit.a;
            case 25:
                return e.d(0L);
            case 26:
                _childSerializers$_anonymous_6 = VolleyballTopPlayersStatistics._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_6;
            case 27:
                _childSerializers$_anonymous_$02 = VolleyballTopPlayersStatistics._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$02;
            case 28:
                _childSerializers$_anonymous_$12 = VolleyballTopPlayersStatistics._childSerializers$_anonymous_$1();
                return _childSerializers$_anonymous_$12;
            default:
                _childSerializers$_anonymous_$2 = VolleyballTopPlayersStatistics._childSerializers$_anonymous_$2();
                return _childSerializers$_anonymous_$2;
        }
    }
}
