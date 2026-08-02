package Lj;

import Fj.C1155a;
import zendesk.talk.android.internal.call.service.TalkCallService;

/* loaded from: classes5.dex */
public abstract class d {
    public static void a(TalkCallService talkCallService, C1155a c1155a) {
        talkCallService.activeCallChecker = c1155a;
    }

    public static void b(TalkCallService talkCallService, a aVar) {
        talkCallService.pendingIntentFactory = aVar;
    }

    public static void c(TalkCallService talkCallService, Kj.b bVar) {
        talkCallService.talkCallInteractor = bVar;
    }

    public static void d(TalkCallService talkCallService, b bVar) {
        talkCallService.talkCallNotification = bVar;
    }
}
