package com.vk.video.polls.analytics;

import android.content.Context;
import com.vk.dto.uxpolls.PollQuestion;
import com.vk.stat.scheme.CommonUxpollsStat$TypeUxpollsEvent;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vk.video.bugreport.api.dto.VideoTechBugreportData;
import com.vk.video.polls.analytics.UxPollsAnalytics;
import com.vk.video.polls.entrypoint.model.UxPollEntryPoint;
import com.vk.video.polls.entrypoint.model.UxPollEntryPointLocation;
import kotlin.NoWhenBranchMatchedException;
import xsna.bpn0;
import xsna.c2c0;
import xsna.iid0;
import xsna.j5g;
import xsna.ljt0;
import xsna.o4r0;
import xsna.s3q0;
import xsna.xov;

/* compiled from: UxPollsAnalyticsImpl.kt */
/* loaded from: classes6.dex */
public final class a implements UxPollsAnalytics {
    public static final CommonUxpollsStat$TypeUxpollsEvent.QuestionType g = CommonUxpollsStat$TypeUxpollsEvent.QuestionType.OPEN;
    public final Context a;
    public final UxPollEntryPoint b;
    public final o4r0 c;
    public final bpn0 d;
    public final bpn0 e;
    public final bpn0 f = new bpn0(new c2c0(14));

    /* compiled from: UxPollsAnalyticsImpl.kt */
    /* renamed from: com.vk.video.polls.analytics.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C1952a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UxPollEntryPointLocation.values().length];
            try {
                iArr[UxPollEntryPointLocation.Discovery.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UxPollEntryPointLocation.PlayerDiscoveryMenu.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UxPollEntryPointLocation.PlayerFullscreenMenu.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[UxPollEntryPointLocation.PlayerFullscreen.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[UxPollEntryPointLocation.SimilarMenu.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[UxPollEntryPointLocation.PlayerDiscovery.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[UxPollEntryPointLocation.MainPageTabs.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public a(Context context, UxPollEntryPoint uxPollEntryPoint, o4r0 o4r0Var, bpn0 bpn0Var, bpn0 bpn0Var2) {
        this.a = context;
        this.b = uxPollEntryPoint;
        this.c = o4r0Var;
        this.d = bpn0Var;
        this.e = bpn0Var2;
    }

    public static /* synthetic */ void f(a aVar, CommonUxpollsStat$TypeUxpollsEvent.EventType eventType) {
        aVar.e(new UxPollsAnalytics.a((UxPollsAnalytics.QuestionType) null, (Long) null, 7), eventType);
    }

    @Override // com.vk.video.polls.analytics.UxPollsAnalytics
    public final void a() {
        c(false);
    }

    @Override // com.vk.video.polls.analytics.UxPollsAnalytics
    public final void b() {
        c(true);
    }

    public final void c(boolean z) {
        UxPollsAnalytics.QuestionType questionType;
        CommonUxpollsStat$TypeUxpollsEvent.EventType eventType = z ? CommonUxpollsStat$TypeUxpollsEvent.EventType.INVITE_HIDE : CommonUxpollsStat$TypeUxpollsEvent.EventType.INVITE_VIEW;
        PollQuestion pollQuestion = (PollQuestion) j5g.a0(this.b.b.d);
        if (pollQuestion == null) {
            questionType = null;
        } else if (pollQuestion instanceof PollQuestion.Chips) {
            questionType = UxPollsAnalytics.QuestionType.SELECTION;
        } else if (pollQuestion instanceof PollQuestion.Grade) {
            questionType = UxPollsAnalytics.QuestionType.GRADE;
        } else if (pollQuestion instanceof PollQuestion.Open) {
            questionType = UxPollsAnalytics.QuestionType.OPEN;
        } else {
            if (!(pollQuestion instanceof PollQuestion.RatingStar)) {
                throw new NoWhenBranchMatchedException();
            }
            questionType = UxPollsAnalytics.QuestionType.STAR_RATING;
        }
        e(new UxPollsAnalytics.a(questionType, pollQuestion != null ? Long.valueOf(pollQuestion.getId()) : null, 4), eventType);
    }

    public final void d() {
        ljt0 ljt0Var;
        xov xovVar;
        VideoTechBugreportData a;
        CommonUxpollsStat$TypeUxpollsEvent.EventType eventType = CommonUxpollsStat$TypeUxpollsEvent.EventType.COMPLETE;
        f(this, eventType);
        s3q0 s3q0Var = s3q0.a;
        if (!((Boolean) this.f.getValue()).booleanValue() || (ljt0Var = (ljt0) this.e.getValue()) == null || (xovVar = (xov) this.d.getValue()) == null || (a = xovVar.a()) == null) {
            return;
        }
        ljt0Var.a(this.a, a, null, Long.valueOf(this.c.a(this.b, eventType)));
    }

    public final void e(UxPollsAnalytics.a aVar, CommonUxpollsStat$TypeUxpollsEvent.EventType eventType) {
        CommonUxpollsStat$TypeUxpollsEvent.QuestionType questionType;
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen;
        o4r0 o4r0Var = this.c;
        UxPollEntryPoint uxPollEntryPoint = this.b;
        long a = o4r0Var.a(uxPollEntryPoint, eventType);
        int i = uxPollEntryPoint.b.b;
        UxPollsAnalytics.QuestionType questionType2 = aVar.a;
        if (questionType2 == null || (questionType = CommonUxpollsStat$TypeUxpollsEvent.QuestionType.valueOf(questionType2.name())) == null) {
            questionType = g;
        }
        CommonUxpollsStat$TypeUxpollsEvent commonUxpollsStat$TypeUxpollsEvent = new CommonUxpollsStat$TypeUxpollsEvent(eventType, i, a, questionType, aVar.b, aVar.c);
        iid0 iid0Var = new iid0();
        switch (C1952a.$EnumSwitchMapping$0[uxPollEntryPoint.c.ordinal()]) {
            case 1:
                mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.VIDEO_DISCOVERY;
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.VIDEO_ACTIONS_DIALOG;
                break;
            case 7:
                mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.FEED_VIDEO_RECOMMENDATIONS;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        SchemeStat$TypeAction b = SchemeStat$TypeAction.a.b(null, null, commonUxpollsStat$TypeUxpollsEvent, 3);
        iid0Var.f = mobileOfficialAppsCoreNavStat$EventScreen;
        iid0Var.g = b;
        iid0Var.q();
    }
}
