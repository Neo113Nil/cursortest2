package defpackage;

import com.inmobi.media.S4;
import com.sofascore.model.newNetwork.RunsPerOverInning;
import com.sofascore.model.newNetwork.RunsPerOverInningsData;
import com.sofascore.model.newNetwork.topperformance.response.RugbyTopTeamsStatistics;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class u9g implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ u9g(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        KSerializer _childSerializers$_anonymous_$4;
        KSerializer _childSerializers$_anonymous_$10;
        KSerializer _childSerializers$_anonymous_$5;
        KSerializer _childSerializers$_anonymous_$6;
        KSerializer _childSerializers$_anonymous_$7;
        KSerializer _childSerializers$_anonymous_$8;
        KSerializer _childSerializers$_anonymous_$11;
        KSerializer _childSerializers$_anonymous_$12;
        KSerializer _childSerializers$_anonymous_$13;
        KSerializer _childSerializers$_anonymous_$14;
        KSerializer _childSerializers$_anonymous_$15;
        KSerializer _childSerializers$_anonymous_$16;
        KSerializer _childSerializers$_anonymous_$17;
        KSerializer _childSerializers$_anonymous_;
        KSerializer _childSerializers$_anonymous_2;
        KSerializer _childSerializers$_anonymous_$0;
        switch (this.a) {
            case 0:
                _childSerializers$_anonymous_$4 = RugbyTopTeamsStatistics._childSerializers$_anonymous_$4();
                return _childSerializers$_anonymous_$4;
            case 1:
                _childSerializers$_anonymous_$10 = RugbyTopTeamsStatistics._childSerializers$_anonymous_$10();
                return _childSerializers$_anonymous_$10;
            case 2:
                _childSerializers$_anonymous_$5 = RugbyTopTeamsStatistics._childSerializers$_anonymous_$5();
                return _childSerializers$_anonymous_$5;
            case 3:
                _childSerializers$_anonymous_$6 = RugbyTopTeamsStatistics._childSerializers$_anonymous_$6();
                return _childSerializers$_anonymous_$6;
            case 4:
                _childSerializers$_anonymous_$7 = RugbyTopTeamsStatistics._childSerializers$_anonymous_$7();
                return _childSerializers$_anonymous_$7;
            case 5:
                _childSerializers$_anonymous_$8 = RugbyTopTeamsStatistics._childSerializers$_anonymous_$8();
                return _childSerializers$_anonymous_$8;
            case 6:
                _childSerializers$_anonymous_$11 = RugbyTopTeamsStatistics._childSerializers$_anonymous_$11();
                return _childSerializers$_anonymous_$11;
            case 7:
                _childSerializers$_anonymous_$12 = RugbyTopTeamsStatistics._childSerializers$_anonymous_$12();
                return _childSerializers$_anonymous_$12;
            case 8:
                _childSerializers$_anonymous_$13 = RugbyTopTeamsStatistics._childSerializers$_anonymous_$13();
                return _childSerializers$_anonymous_$13;
            case 9:
                _childSerializers$_anonymous_$14 = RugbyTopTeamsStatistics._childSerializers$_anonymous_$14();
                return _childSerializers$_anonymous_$14;
            case 10:
                _childSerializers$_anonymous_$15 = RugbyTopTeamsStatistics._childSerializers$_anonymous_$15();
                return _childSerializers$_anonymous_$15;
            case 11:
                _childSerializers$_anonymous_$16 = RugbyTopTeamsStatistics._childSerializers$_anonymous_$16();
                return _childSerializers$_anonymous_$16;
            case 12:
                _childSerializers$_anonymous_$17 = RugbyTopTeamsStatistics._childSerializers$_anonymous_$17();
                return _childSerializers$_anonymous_$17;
            case 13:
                _childSerializers$_anonymous_ = RunsPerOverInning._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_;
            case 14:
                _childSerializers$_anonymous_2 = RunsPerOverInningsData._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_2;
            case 15:
                _childSerializers$_anonymous_$0 = RunsPerOverInningsData._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$0;
            case 16:
                return S4.b();
            case 17:
                return Long.valueOf(new Date().getTime());
            case 18:
                return Boolean.TRUE;
            case 19:
                return Boolean.valueOf(hog.K());
            case 20:
                return Boolean.valueOf(hog.l());
            case 21:
                return Boolean.valueOf(hog.C());
            case 22:
                return Boolean.valueOf(hog.z());
            case 23:
                return Boolean.valueOf(hog.x());
            case 24:
                return Boolean.valueOf(hog.w());
            case 25:
                return Boolean.valueOf(hog.j());
            case 26:
                return Boolean.valueOf(hog.N());
            case 27:
                return new ppg(new LinkedHashMap());
            case 28:
                return null;
            default:
                return new HashSet();
        }
    }
}
