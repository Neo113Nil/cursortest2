package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.media.La;
import com.sofascore.model.Injury;
import com.sofascore.model.Money;
import com.sofascore.model.mvvm.model.FieldTranslations;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.mvvm.model.Incident;
import com.sofascore.model.mvvm.model.Inning;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.PlayerKt;
import com.sofascore.model.mvvm.model.Point2D;
import com.sofascore.model.newNetwork.InfoResponse;
import com.sofascore.model.newNetwork.commentary.AnimatedGoalType;
import com.sofascore.model.newNetwork.commentary.FootballPassingNetworkSegment;
import com.sofascore.model.newNetwork.commentary.SegmentEventType;
import com.sofascore.results.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class us9 implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ us9(int i) {
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        KSerializer _childSerializers$_anonymous_;
        KSerializer _childSerializers$_anonymous_2;
        KSerializer _childSerializers$_anonymous_3;
        KSerializer _childSerializers$_anonymous_$0;
        KSerializer _childSerializers$_anonymous_4;
        KSerializer _init_$_anonymous_;
        KSerializer _childSerializers$_anonymous_5;
        KSerializer _childSerializers$_anonymous_$02;
        KSerializer _childSerializers$_anonymous_$1;
        KSerializer _childSerializers$_anonymous_$2;
        KSerializer _childSerializers$_anonymous_$3;
        switch (this.a) {
            case 0:
                return (sof) cjk.a.getValue();
            case 1:
                return InMobiBanner.e();
            case 2:
                _childSerializers$_anonymous_ = Incident.GoalIncident._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_;
            case 3:
                _childSerializers$_anonymous_2 = Incident.PenaltyShotIncident._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_2;
            case 4:
                return new int[2];
            case 5:
                return Unit.a;
            case 6:
                return new h0a(true, "86'", new rz9(R.drawable.ic_goal_incidents, Integer.valueOf(R.color.n_lv_1), false, false, null, 12), null, new wz9("2 - 2", 4), "L. Messi", "C. Ronaldo", "L. Modric", "K. Benzema", false, new kae(l6g.K((FootballPassingNetworkSegment) nz9.a.getValue()), 12437545, 2817, 2829, false, null, null), false, null, 0, null, 30720);
            case 7:
                String str = "Pape Matar Sarr";
                String str2 = "";
                String str3 = "";
                String str4 = "pape-matar-sarr";
                String str5 = "P. M. Sarr";
                String str6 = PlayerKt.FOOTBALL_MIDFIELDER;
                String str7 = "29";
                Player player = new Player(1002711, str, str2, str3, str4, str5, str6, 24393L, 1031961600L, null, null, null, str7, Integer.valueOf(ModuleDescriptor.MODULE_VERSION), null, null, false, false, null, null, null, new Money(30000000, "EUR"), null, null, null, null, false, null, null, null, null, null, null, null, null, null, false, -536870912, 31, null);
                SegmentEventType segmentEventType = SegmentEventType.GOAL;
                Point2D point2D = new Point2D(42.3d, 61.7d);
                Point2D point2D2 = new Point2D(18.0d, 55.1d);
                Point2D point2D3 = new Point2D(52.15d, 67.33d);
                Point2D point2D4 = new Point2D(0.0d, 50.4d);
                int i = 581310;
                String str8 = null;
                long j = 21571;
                Long l = null;
                Integer num = null;
                boolean z = false;
                boolean z2 = false;
                FieldTranslations fieldTranslations = null;
                Gender gender = null;
                boolean z3 = false;
                List list = null;
                Money money = null;
                String str9 = null;
                String str10 = null;
                String str11 = null;
                String str12 = null;
                String str13 = null;
                String str14 = null;
                boolean z4 = false;
                int i2 = -536870912;
                String str15 = "David Raya";
                String str16 = "david-raya";
                String str17 = "D. Raya";
                String str18 = "G";
                String str19 = "1";
                Object[] objArr = null == true ? 1 : 0;
                return new FootballPassingNetworkSegment(player, segmentEventType, null, 45, point2D, point2D2, point2D3, point2D4, new Player(i, str15, str8, null == true ? 1 : 0, str16, str17, str18, j, 811123200L, l, null == true ? 1 : 0, null == true ? 1 : 0, str19, 183, num, null == true ? 1 : 0, z, z2, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, new Money(43000000, "EUR"), null == true ? 1 : 0, null == true ? 1 : 0, fieldTranslations, gender, z3, objArr, list, money, str9, str10, str11, str12, str13, str14, z4, i2, 31, null), Boolean.FALSE, AnimatedGoalType.REGULAR);
            case 8:
                return Unit.a;
            case 9:
                return Unit.a;
            case 10:
                ff5 ff5Var = f1a.a;
                return ko4.a;
            case 11:
                _childSerializers$_anonymous_3 = InfoResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_3;
            case 12:
                _childSerializers$_anonymous_$0 = InfoResponse._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$0;
            case 13:
                _childSerializers$_anonymous_4 = Injury._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_4;
            case 14:
                _init_$_anonymous_ = Injury.ExpectedReturn._init_$_anonymous_();
                return _init_$_anonymous_;
            case 15:
                _childSerializers$_anonymous_5 = Inning._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_5;
            case 16:
                _childSerializers$_anonymous_$02 = Inning._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$02;
            case 17:
                _childSerializers$_anonymous_$1 = Inning._childSerializers$_anonymous_$1();
                return _childSerializers$_anonymous_$1;
            case 18:
                _childSerializers$_anonymous_$2 = Inning._childSerializers$_anonymous_$2();
                return _childSerializers$_anonymous_$2;
            case 19:
                _childSerializers$_anonymous_$3 = Inning._childSerializers$_anonymous_$3();
                return _childSerializers$_anonymous_$3;
            case 20:
                return null;
            case 21:
                return new p75(48.0f);
            case 22:
                return Unit.a;
            case 23:
                return Unit.a;
            case 24:
                return uga.b;
            case 25:
                return hga.b;
            case 26:
                return ega.b;
            case 27:
                return lga.b;
            case 28:
                return dfa.b;
            default:
                return La.a();
        }
    }
}
