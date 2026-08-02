package defpackage;

import com.blaze.blazesdk.data_source.BlazeDataSourceType;
import com.blaze.blazesdk.data_source.BlazeWidgetLabel;
import com.blaze.blazesdk.features.videos.models.configuration.BlazeVideosPlaybackConfiguration;
import com.blaze.blazesdk.features.videos.models.ui.i;
import com.blaze.blazesdk.players.models.B;
import com.blaze.blazesdk.players.models.F;
import com.blaze.blazesdk.push.ExtraInfoType;
import com.blaze.blazesdk.push.b;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.blaze.blazesdk.shared.results.BlazeResult;
import com.blaze.blazesdk.shared.results.r;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class nam extends hoi implements Function1 {
    public int r;
    public final /* synthetic */ String s;
    public final /* synthetic */ String t;
    public final /* synthetic */ Function1 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nam(String str, String str2, Function1 function1, rq3 rq3Var) {
        super(1, rq3Var);
        this.s = str;
        this.t = str2;
        this.u = function1;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new nam(this.s, this.t, this.u, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((nam) create((rq3) obj)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x034b, code lost:
    
        if (defpackage.xw3.R(r0, r4, r21) != r2) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0339, code lost:
    
        if (defpackage.xw3.R(r5, r6, r21) != r2) goto L69;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.r;
        Function1 function1 = this.u;
        try {
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
            BlazeResult.Error d = new r().d();
            hs4 hs4Var = z45.a;
            r69 r69Var = rob.a;
            w7m w7mVar = new w7m(function1, d, null);
            this.r = 3;
        }
        if (i == 0) {
            y6a.M(obj);
            bwm bwmVar = bwm.a;
            this.r = 1;
            if (bwmVar.a(this) == lu3Var) {
                return lu3Var;
            }
        } else if (i == 1) {
            y6a.M(obj);
        } else {
            if (i == 2) {
                y6a.M(obj);
                return Unit.a;
            }
            if (i != 3) {
                if (i == 4) {
                    y6a.M(obj);
                    return Unit.a;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
            hs4 hs4Var2 = z45.a;
            r69 r69Var2 = rob.a;
            t4m t4mVar = new t4m(function1, null);
            this.r = 4;
        }
        ExtraInfoType a = b.a.a(this.s);
        if (a == null) {
            BlazeSDK blazeSDK = BlazeSDK.INSTANCE;
            j1m j1mVar = j1m.a;
            r rVar = new r();
            j1m.a(rVar);
            BlazeResult.Error d2 = rVar.d();
            this.r = 2;
            if (evl.b(function1, d2, this) == lu3Var) {
                return lu3Var;
            }
            return Unit.a;
        }
        if (a instanceof ExtraInfoType.Story) {
            String label = ((ExtraInfoType.Story) a).getLabel();
            if (label != null && !StringsKt.R(label)) {
                bxm.playStories$blazesdk_release$default(bxm.a, new BlazeDataSourceType.Labels(BlazeWidgetLabel.INSTANCE.singleLabel(((ExtraInfoType.Story) a).getLabel()), null, null, null, null, null, 62, null), null, new B(F.NOTIFICATION, null, null, null, null, null, 62, null), true, this.t, ((ExtraInfoType.Story) a).getStoryId(), null, ((ExtraInfoType.Story) a).getEventId(), new fuj(16, function1), 2, null);
            }
            bxm.fetchAndPlayStory$blazesdk_release$default(bxm.a, ((ExtraInfoType.Story) a).getStoryId(), null, ((ExtraInfoType.Story) a).getEventId(), null, false, new B(F.NOTIFICATION, null, null, null, null, null, 62, null), "handleNotificationValue - playStory failed", this.t, new fuj(17, function1), 26, null);
        } else if (a instanceof ExtraInfoType.StoryPage) {
            String label2 = ((ExtraInfoType.StoryPage) a).getLabel();
            if (label2 != null && !StringsKt.R(label2)) {
                bxm.playStories$blazesdk_release$default(bxm.a, new BlazeDataSourceType.Labels(BlazeWidgetLabel.INSTANCE.singleLabel(((ExtraInfoType.StoryPage) a).getLabel()), null, null, null, null, null, 62, null), null, new B(F.NOTIFICATION, null, null, null, null, null, 62, null), true, this.t, ((ExtraInfoType.StoryPage) a).getStoryId(), ((ExtraInfoType.StoryPage) a).getPageId(), ((ExtraInfoType.StoryPage) a).getEventId(), new fuj(18, function1), 2, null);
            }
            bxm.fetchAndPlayStory$blazesdk_release$default(bxm.a, ((ExtraInfoType.StoryPage) a).getStoryId(), ((ExtraInfoType.StoryPage) a).getPageId(), null, null, false, new B(F.NOTIFICATION, null, null, null, null, null, 62, null), "handleNotificationValue - playStoryPage failed", this.t, new fuj(19, function1), 28, null);
        } else if (a instanceof ExtraInfoType.Moment) {
            String label3 = ((ExtraInfoType.Moment) a).getLabel();
            if (label3 != null && !StringsKt.R(label3)) {
                rsm.playMoments$default(rsm.a, new BlazeDataSourceType.Labels(BlazeWidgetLabel.INSTANCE.singleLabel(((ExtraInfoType.Moment) a).getLabel()), null, null, null, null, null, 62, null), null, null, new B(F.NOTIFICATION, null, null, null, null, null, 62, null), true, this.t, ((ExtraInfoType.Moment) a).getMomentId(), ((ExtraInfoType.Moment) a).getEventId(), new fuj(20, function1), 6, null);
            }
            rsm.fetchAndPlayMoment$default(rsm.a, ((ExtraInfoType.Moment) a).getMomentId(), null, null, "handleNotificationValue - playMoment", new B(F.NOTIFICATION, null, null, null, null, null, 62, null), false, this.t, new fuj(21, function1), 38, null);
        } else {
            if (!(a instanceof ExtraInfoType.Video)) {
                throw new ndd();
            }
            String label4 = ((ExtraInfoType.Video) a).getLabel();
            if (label4 != null && !StringsKt.R(label4)) {
                n0n.playVideos$default(n0n.a, new BlazeDataSourceType.Labels(BlazeWidgetLabel.INSTANCE.singleLabel(((ExtraInfoType.Video) a).getLabel()), null, null, null, null, null, 62, null), null, new B(F.NOTIFICATION, null, null, null, null, null, 62, null), true, this.t, ((ExtraInfoType.Video) a).getVideoId(), ((ExtraInfoType.Video) a).getEventId(), null, new fuj(22, function1), 130, null);
            }
            n0n n0nVar = n0n.a;
            String videoId = ((ExtraInfoType.Video) a).getVideoId();
            B b = new B(F.NOTIFICATION, null, null, null, null, null, 62, null);
            BlazeVideosPlaybackConfiguration blazeVideosPlaybackConfiguration = n0n.c;
            blazeVideosPlaybackConfiguration.getClass();
            n0n.fetchAndPlayVideo$default(n0nVar, videoId, null, "handleNotificationValue - playVideo", b, false, this.t, new i(blazeVideosPlaybackConfiguration.getMultiAspectRatio(), blazeVideosPlaybackConfiguration.getShouldOpenOnLandscape(), blazeVideosPlaybackConfiguration.getPip()), new fuj(23, function1), 18, null);
        }
        hs4 hs4Var22 = z45.a;
        r69 r69Var22 = rob.a;
        t4m t4mVar2 = new t4m(function1, null);
        this.r = 4;
    }
}
