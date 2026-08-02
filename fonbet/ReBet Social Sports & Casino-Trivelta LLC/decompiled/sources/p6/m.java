package p6;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import g6.C4331C;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: g, reason: collision with root package name */
    public static final a f63090g = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final Long f63091a;

    /* renamed from: b, reason: collision with root package name */
    public Long f63092b;

    /* renamed from: c, reason: collision with root package name */
    public UUID f63093c;

    /* renamed from: d, reason: collision with root package name */
    public int f63094d;

    /* renamed from: e, reason: collision with root package name */
    public Long f63095e;

    /* renamed from: f, reason: collision with root package name */
    public o f63096f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a() {
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(C4331C.l()).edit();
            edit.remove("com.facebook.appevents.SessionInfo.sessionStartTime");
            edit.remove("com.facebook.appevents.SessionInfo.sessionEndTime");
            edit.remove("com.facebook.appevents.SessionInfo.interruptionCount");
            edit.remove("com.facebook.appevents.SessionInfo.sessionId");
            edit.apply();
            o.f63099c.a();
        }

        public final m b() {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(C4331C.l());
            long j10 = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionStartTime", 0L);
            long j11 = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionEndTime", 0L);
            String string = defaultSharedPreferences.getString("com.facebook.appevents.SessionInfo.sessionId", null);
            if (j10 == 0 || j11 == 0 || string == null) {
                return null;
            }
            m mVar = new m(Long.valueOf(j10), Long.valueOf(j11), null, 4, null);
            mVar.f63094d = defaultSharedPreferences.getInt("com.facebook.appevents.SessionInfo.interruptionCount", 0);
            mVar.l(o.f63099c.b());
            mVar.i(Long.valueOf(System.currentTimeMillis()));
            UUID fromString = UUID.fromString(string);
            Intrinsics.checkNotNullExpressionValue(fromString, "fromString(sessionIDStr)");
            mVar.j(fromString);
            return mVar;
        }

        public a() {
        }
    }

    public m(Long l10, Long l11, UUID sessionId) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.f63091a = l10;
        this.f63092b = l11;
        this.f63093c = sessionId;
    }

    public final Long b() {
        Long l10 = this.f63095e;
        if (l10 == null) {
            return 0L;
        }
        return l10;
    }

    public final int c() {
        return this.f63094d;
    }

    public final UUID d() {
        return this.f63093c;
    }

    public final Long e() {
        return this.f63092b;
    }

    public final long f() {
        Long l10;
        if (this.f63091a == null || (l10 = this.f63092b) == null) {
            return 0L;
        }
        if (l10 != null) {
            return l10.longValue() - this.f63091a.longValue();
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final o g() {
        return this.f63096f;
    }

    public final void h() {
        this.f63094d++;
    }

    public final void i(Long l10) {
        this.f63095e = l10;
    }

    public final void j(UUID uuid) {
        Intrinsics.checkNotNullParameter(uuid, "<set-?>");
        this.f63093c = uuid;
    }

    public final void k(Long l10) {
        this.f63092b = l10;
    }

    public final void l(o oVar) {
        this.f63096f = oVar;
    }

    public final void m() {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(C4331C.l()).edit();
        Long l10 = this.f63091a;
        edit.putLong("com.facebook.appevents.SessionInfo.sessionStartTime", l10 == null ? 0L : l10.longValue());
        Long l11 = this.f63092b;
        edit.putLong("com.facebook.appevents.SessionInfo.sessionEndTime", l11 != null ? l11.longValue() : 0L);
        edit.putInt("com.facebook.appevents.SessionInfo.interruptionCount", this.f63094d);
        edit.putString("com.facebook.appevents.SessionInfo.sessionId", this.f63093c.toString());
        edit.apply();
        o oVar = this.f63096f;
        if (oVar == null || oVar == null) {
            return;
        }
        oVar.a();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ m(Long l10, Long l11, UUID uuid, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(l10, l11, uuid);
        if ((i10 & 4) != 0) {
            uuid = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID()");
        }
    }
}
