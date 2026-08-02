package F8;

import com.giphy.sdk.analytics.models.enums.ActionType;
import com.giphy.sdk.analytics.models.enums.EventType;
import java.util.LinkedList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedList f3632a = new LinkedList();

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public String f3633a;

        /* renamed from: b, reason: collision with root package name */
        public String f3634b;

        /* renamed from: c, reason: collision with root package name */
        public String f3635c;

        /* renamed from: d, reason: collision with root package name */
        public String f3636d;

        /* renamed from: e, reason: collision with root package name */
        public String f3637e;

        /* renamed from: f, reason: collision with root package name */
        public EventType f3638f;

        /* renamed from: g, reason: collision with root package name */
        public String f3639g;

        /* renamed from: h, reason: collision with root package name */
        public String f3640h;

        /* renamed from: i, reason: collision with root package name */
        public ActionType f3641i;

        /* renamed from: j, reason: collision with root package name */
        public String f3642j;

        /* renamed from: k, reason: collision with root package name */
        public long f3643k;

        /* renamed from: l, reason: collision with root package name */
        public String f3644l;

        /* renamed from: m, reason: collision with root package name */
        public int f3645m;

        /* renamed from: n, reason: collision with root package name */
        public String f3646n;

        public final ActionType a() {
            ActionType actionType = this.f3641i;
            if (actionType != null) {
                return actionType;
            }
            Intrinsics.throwUninitializedPropertyAccessException("actionType");
            return null;
        }

        public final String b() {
            String str = this.f3636d;
            if (str != null) {
                return str;
            }
            Intrinsics.throwUninitializedPropertyAccessException("analyticsResponsePayload");
            return null;
        }

        public final EventType c() {
            return this.f3638f;
        }

        public final String d() {
            return this.f3644l;
        }

        public final String e() {
            String str = this.f3634b;
            if (str != null) {
                return str;
            }
            Intrinsics.throwUninitializedPropertyAccessException("loggedInUserId");
            return null;
        }

        public final String f() {
            String str = this.f3639g;
            if (str != null) {
                return str;
            }
            Intrinsics.throwUninitializedPropertyAccessException("mediaId");
            return null;
        }

        public final String g() {
            return this.f3646n;
        }

        public final int h() {
            return this.f3645m;
        }

        public final String i() {
            return this.f3635c;
        }

        public final String j() {
            return this.f3637e;
        }

        public final String k() {
            return this.f3642j;
        }

        public final String l() {
            return this.f3640h;
        }

        public final long m() {
            return this.f3643k;
        }

        public final String n() {
            String str = this.f3633a;
            if (str != null) {
                return str;
            }
            Intrinsics.throwUninitializedPropertyAccessException("userId");
            return null;
        }

        public final void o(ActionType actionType) {
            Intrinsics.checkNotNullParameter(actionType, "<set-?>");
            this.f3641i = actionType;
        }

        public final void p(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.f3636d = str;
        }

        public final void q(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.f3634b = str;
        }

        public final void r(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.f3639g = str;
        }

        public final void s(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.f3633a = str;
        }

        public final void t(String userId, String loggedInUserId, String str, String analyticsResponsePayload, String str2, EventType eventType, String mediaId, String str3, ActionType actionType, String str4, String str5, int i10, String str6) {
            Intrinsics.checkNotNullParameter(userId, "userId");
            Intrinsics.checkNotNullParameter(loggedInUserId, "loggedInUserId");
            Intrinsics.checkNotNullParameter(analyticsResponsePayload, "analyticsResponsePayload");
            Intrinsics.checkNotNullParameter(mediaId, "mediaId");
            Intrinsics.checkNotNullParameter(actionType, "actionType");
            s(userId);
            q(loggedInUserId);
            this.f3635c = str;
            p(analyticsResponsePayload);
            this.f3637e = str2;
            this.f3638f = eventType;
            r(mediaId);
            this.f3640h = str3;
            o(actionType);
            this.f3642j = str4;
            this.f3643k = System.currentTimeMillis();
            this.f3644l = str5;
            this.f3645m = i10;
            this.f3646n = str6;
        }
    }

    public final a a(String userId, String loggedInUserId, String str, String analyticsResponsePayload, String str2, EventType eventType, String mediaId, String str3, ActionType actionType, String str4, String str5, int i10, String str6) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(loggedInUserId, "loggedInUserId");
        Intrinsics.checkNotNullParameter(analyticsResponsePayload, "analyticsResponsePayload");
        Intrinsics.checkNotNullParameter(mediaId, "mediaId");
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        a aVar = (a) this.f3632a.pollFirst();
        if (aVar == null) {
            aVar = new a();
        }
        a aVar2 = aVar;
        aVar2.t(userId, loggedInUserId, str, analyticsResponsePayload, str2, eventType, mediaId, str3, actionType, str4, str5, i10, str6);
        return aVar2;
    }

    public final void b(a eventWrapper) {
        Intrinsics.checkNotNullParameter(eventWrapper, "eventWrapper");
        this.f3632a.add(eventWrapper);
    }
}
