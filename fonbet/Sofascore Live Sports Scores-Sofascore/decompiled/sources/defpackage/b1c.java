package defpackage;

import com.inmobi.media.Mc;
import com.inmobi.media.Mh;
import com.sofascore.model.chat.Message;
import com.sofascore.model.mvvm.model.MmaEvent;
import com.sofascore.model.network.response.MediaHighlightSummaryResponse;
import com.sofascore.model.newNetwork.MediaResponse;
import com.sofascore.model.newNetwork.MediaVideoResponse;
import com.sofascore.model.newNetwork.MmaEventListResponse;
import com.sofascore.model.newNetwork.MmaMonthsWithEventsResponse;
import com.sofascore.model.newNetwork.MmaPostMatchVotingOptions;
import com.sofascore.model.newNetwork.MonthlyStages;
import com.sofascore.model.newNetwork.mediaposts.MediaPost;
import com.sofascore.model.newNetwork.mediaposts.MediaType;
import com.sofascore.results.R;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final /* synthetic */ class b1c implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ b1c(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        KSerializer _childSerializers$_anonymous_;
        KSerializer _childSerializers$_anonymous_2;
        KSerializer _childSerializers$_anonymous_$0;
        KSerializer _childSerializers$_anonymous_$1;
        KSerializer _childSerializers$_anonymous_$2;
        KSerializer _childSerializers$_anonymous_3;
        KSerializer _init_$_anonymous_;
        KSerializer _childSerializers$_anonymous_4;
        KSerializer _childSerializers$_anonymous_5;
        KSerializer _childSerializers$_anonymous_$02;
        KSerializer _childSerializers$_anonymous_6;
        KSerializer _childSerializers$_anonymous_$03;
        KSerializer _childSerializers$_anonymous_$12;
        KSerializer _childSerializers$_anonymous_$22;
        KSerializer _childSerializers$_anonymous_$3;
        KSerializer _childSerializers$_anonymous_$4;
        KSerializer _childSerializers$_anonymous_7;
        KSerializer _childSerializers$_anonymous_8;
        KSerializer _init_$_anonymous_2;
        KSerializer _childSerializers$_anonymous_9;
        switch (this.a) {
            case 0:
                return Boolean.valueOf(Mc.b());
            case 1:
                return Unit.a;
            case 2:
                return Unit.a;
            case 3:
                _childSerializers$_anonymous_ = MediaHighlightSummaryResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_;
            case 4:
                _childSerializers$_anonymous_2 = MediaPost._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_2;
            case 5:
                _childSerializers$_anonymous_$0 = MediaPost._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$0;
            case 6:
                _childSerializers$_anonymous_$1 = MediaPost._childSerializers$_anonymous_$1();
                return _childSerializers$_anonymous_$1;
            case 7:
                _childSerializers$_anonymous_$2 = MediaPost._childSerializers$_anonymous_$2();
                return _childSerializers$_anonymous_$2;
            case 8:
                _childSerializers$_anonymous_3 = MediaResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_3;
            case 9:
                _init_$_anonymous_ = MediaType._init_$_anonymous_();
                return _init_$_anonymous_;
            case 10:
                _childSerializers$_anonymous_4 = MediaVideoResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_4;
            case 11:
                _childSerializers$_anonymous_5 = Message._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_5;
            case 12:
                _childSerializers$_anonymous_$02 = Message._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$02;
            case 13:
                return Mh.a();
            case 14:
                return new xjc(0, 1, 2, 3, 2, "PEN 4-2", 1);
            case 15:
                _childSerializers$_anonymous_6 = MmaEvent._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_6;
            case 16:
                _childSerializers$_anonymous_$03 = MmaEvent._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$03;
            case 17:
                _childSerializers$_anonymous_$12 = MmaEvent._childSerializers$_anonymous_$1();
                return _childSerializers$_anonymous_$12;
            case 18:
                _childSerializers$_anonymous_$22 = MmaEvent._childSerializers$_anonymous_$2();
                return _childSerializers$_anonymous_$22;
            case 19:
                _childSerializers$_anonymous_$3 = MmaEvent._childSerializers$_anonymous_$3();
                return _childSerializers$_anonymous_$3;
            case 20:
                _childSerializers$_anonymous_$4 = MmaEvent._childSerializers$_anonymous_$4();
                return _childSerializers$_anonymous_$4;
            case 21:
                _childSerializers$_anonymous_7 = MmaEventListResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_7;
            case 22:
                return new j29(Integer.valueOf(R.drawable.no_games_mma), null, Integer.valueOf(R.string.no_events_empty_state_mma), 437);
            case 23:
                int i = s9d.d;
                return Boolean.valueOf(zu3.V.hasMcc(Integer.valueOf(ke0.c)));
            case 24:
                return new j29(Integer.valueOf(R.drawable.no_games_mma), null, Integer.valueOf(R.string.no_events_empty_state_mma), 437);
            case 25:
                _childSerializers$_anonymous_8 = MmaMonthsWithEventsResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_8;
            case 26:
                _init_$_anonymous_2 = MmaPostMatchVotingOptions._init_$_anonymous_();
                return _init_$_anonymous_2;
            case 27:
                return UUID.randomUUID();
            case 28:
                SerialDescriptor[] serialDescriptorArr = new SerialDescriptor[0];
                if (StringsKt.R("kotlinx.datetime.MonthBased")) {
                    a70.p("Blank serial names are prohibited");
                    return null;
                }
                vv2 vv2Var = new vv2("kotlinx.datetime.MonthBased");
                km5 km5Var = km5.a;
                a7a a7aVar = a7a.a;
                vv2Var.a("months", a7a.b, km5Var, false);
                Unit unit = Unit.a;
                return new m5h("kotlinx.datetime.MonthBased", nii.f, vv2Var.c.size(), ph0.X(serialDescriptorArr), vv2Var);
            default:
                _childSerializers$_anonymous_9 = MonthlyStages._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_9;
        }
    }
}
