package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.Constants;
import com.braze.enums.GeofenceTransitionType;
import com.braze.events.IEventSubscriber;
import com.braze.models.BrazeGeofence;
import com.braze.support.BrazeLogger;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Regex;

@Metadata(bv = {}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B)\b\u0000\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u000e\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u001e\u0010\u0006\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nJ\u0016\u0010\u0006\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007J\u0018\u0010\u0006\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0007J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0011J\u001c\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00070\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¨\u0006\u001f"}, d2 = {"Lbo/app/m;", "", "", "Lcom/braze/models/BrazeGeofence;", "brazeGeofenceList", "", Constants.BRAZE_PUSH_CONTENT_KEY, "", "nowInSeconds", "geofence", "Lcom/braze/enums/GeofenceTransitionType;", "transitionType", "", "ignoreRateLimit", "", "reEligibilityId", "geofenceId", "Lbo/app/i5;", "serverConfig", "Landroid/content/SharedPreferences;", "sharedPreferences", "", "Landroid/content/Context;", "context", "apiKey", "Lbo/app/k5;", "serverConfigStorageProvider", "Lbo/app/h2;", "internalIEventMessenger", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lbo/app/k5;Lbo/app/h2;)V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes8.dex */
public final class m {
    public static final a i = new a(null);
    public final SharedPreferences a;
    public final SharedPreferences b;
    public final Map<String, Long> c;
    private final AtomicBoolean d;
    public long e;
    public long f;
    public int g;
    public int h;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087T¢\u0006\f\n\u0004\b\u0006\u0010\u0004\u0012\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087T¢\u0006\f\n\u0004\b\t\u0010\u0004\u0012\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004¨\u0006\r"}, d2 = {"Lbo/app/m$a;", "", "", "GEOFENCE_GLOBAL_ELIGIBILITY_SHARED_PREFS_LOCATION", "Ljava/lang/String;", "GEOFENCE_INDIVIDUAL_ELIGIBILITY_SHARED_PREFS_LOCATION", "LAST_REPORT_GLOBAL", "getLAST_REPORT_GLOBAL$annotations", "()V", "LAST_REQUEST_GLOBAL", "getLAST_REQUEST_GLOBAL$annotations", "SEPARATOR", "<init>", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class b extends Lambda implements Function0<String> {
        final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i) {
            super(0);
            this.b = i;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Min time since last geofence request reset via server configuration: " + this.b + '.';
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class c extends Lambda implements Function0<String> {
        final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i) {
            super(0);
            this.b = i;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Min time since last geofence report reset via server configuration: " + this.b + '.';
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class d extends Lambda implements Function0<String> {
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str) {
            super(0);
            this.c = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            StringBuilder sb = new StringBuilder("Retrieving geofence id ");
            m mVar = m.this;
            String reEligibilityId = this.c;
            Intrinsics.checkNotNullExpressionValue(reEligibilityId, "reEligibilityId");
            return sb.append((Object) mVar.a(reEligibilityId)).append(" eligibility information from local storage.").toString();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class e extends Lambda implements Function0<String> {
        final /* synthetic */ long b;
        final /* synthetic */ m c;
        final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(long j, m mVar, String str) {
            super(0);
            this.b = j;
            this.c = mVar;
            this.d = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Geofence report suppressed since only " + this.b + " seconds have passed since the last time geofences were reported globally (minimum interval: " + this.c.h + "). id:" + this.d;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class f extends Lambda implements Function0<String> {
        final /* synthetic */ long b;
        final /* synthetic */ int c;
        final /* synthetic */ String d;
        final /* synthetic */ GeofenceTransitionType e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(long j, int i, String str, GeofenceTransitionType geofenceTransitionType) {
            super(0);
            this.b = j;
            this.c = i;
            this.d = str;
            this.e = geofenceTransitionType;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Geofence report suppressed since only " + this.b + " seconds have passed since the last time this geofence/transition combination was reported (minimum interval: " + this.c + "). id:" + this.d + " transition:" + this.e;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class g extends Lambda implements Function0<String> {
        final /* synthetic */ long b;
        final /* synthetic */ int c;
        final /* synthetic */ String d;
        final /* synthetic */ GeofenceTransitionType e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(long j, int i, String str, GeofenceTransitionType geofenceTransitionType) {
            super(0);
            this.b = j;
            this.c = i;
            this.d = str;
            this.e = geofenceTransitionType;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return this.b + " seconds have passed since the last time this geofence/transition combination was reported (minimum interval: " + this.c + "). id:" + this.d + " transition:" + this.e;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class h extends Lambda implements Function0<String> {
        final /* synthetic */ String b;
        final /* synthetic */ GeofenceTransitionType c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(String str, GeofenceTransitionType geofenceTransitionType) {
            super(0);
            this.b = str;
            this.c = geofenceTransitionType;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Geofence report eligible since this geofence/transition combination has never been reported.id:" + this.b + " transition:" + this.c;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class i extends Lambda implements Function0<String> {
        final /* synthetic */ long b;
        final /* synthetic */ m c;
        final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(long j, m mVar, String str) {
            super(0);
            this.b = j;
            this.c = mVar;
            this.d = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Geofence report eligible since " + this.b + " seconds have passed since the last time geofences were reported globally (minimum interval: " + this.c.h + "). id:" + this.d;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class j extends Lambda implements Function0<String> {
        final /* synthetic */ long b;
        final /* synthetic */ m c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(long j, m mVar) {
            super(0);
            this.b = j;
            this.c = mVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Geofence request suppressed since only " + this.b + " seconds have passed since the last time geofences were requested (minimum interval: " + this.c.g + ").";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class k extends Lambda implements Function0<String> {
        final /* synthetic */ long b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(long j) {
            super(0);
            this.b = j;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Ignoring rate limit for this geofence request. Elapsed time since last request:", Long.valueOf(this.b));
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class l extends Lambda implements Function0<String> {
        final /* synthetic */ long b;
        final /* synthetic */ m c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(long j, m mVar) {
            super(0);
            this.b = j;
            this.c = mVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return this.b + " seconds have passed since the last time geofences were requested (minimum interval: " + this.c.g + ").";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    /* renamed from: bo.app.m$m, reason: collision with other inner class name */
    static final class C0082m extends Lambda implements Function0<String> {
        public static final C0082m b = new C0082m();

        C0082m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Geofences have not been requested for the current session yet. Request is eligible.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class n extends Lambda implements Function0<String> {
        public static final n b = new n();

        n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Geofences have already been requested for the current session. Geofence request not eligible.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class o extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Exception trying to parse re-eligibility id: ", this.b);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class p extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Deleting outdated id " + ((Object) this.b) + " from re-eligibility list.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class q extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Retaining id " + ((Object) this.b) + " in re-eligibility list.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class r extends Lambda implements Function0<String> {
        final /* synthetic */ long b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(long j) {
            super(0);
            this.b = j;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Updating the last successful location request time to: ", Long.valueOf(this.b));
        }
    }

    public m(Context context, String apiKey, k5 serverConfigStorageProvider, h2 internalIEventMessenger) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        Intrinsics.checkNotNullParameter(internalIEventMessenger, "internalIEventMessenger");
        internalIEventMessenger.b(n5.class, new IEventSubscriber() { // from class: bo.app.m$$ExternalSyntheticLambda0
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                m.a(m.this, (n5) obj);
            }
        });
        SharedPreferences sharedPreferences = context.getSharedPreferences(Intrinsics.stringPlus("com.appboy.managers.geofences.eligibility.global.", apiKey), 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…ontext.MODE_PRIVATE\n    )");
        this.a = sharedPreferences;
        SharedPreferences sharedPreferences2 = context.getSharedPreferences(Intrinsics.stringPlus("com.appboy.managers.geofences.eligibility.individual.", apiKey), 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences2, "context.getSharedPrefere…ontext.MODE_PRIVATE\n    )");
        this.b = sharedPreferences2;
        this.c = a(sharedPreferences2);
        this.d = new AtomicBoolean(false);
        this.e = sharedPreferences.getLong("last_request_global", 0L);
        this.f = sharedPreferences.getLong("last_report_global", 0L);
        this.g = serverConfigStorageProvider.l();
        this.h = serverConfigStorageProvider.k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(m this$0, n5 it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.d.set(false);
    }

    public final void a(List<BrazeGeofence> brazeGeofenceList) {
        Intrinsics.checkNotNullParameter(brazeGeofenceList, "brazeGeofenceList");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<BrazeGeofence> it = brazeGeofenceList.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(it.next().getId());
        }
        HashSet hashSet = new HashSet(this.c.keySet());
        SharedPreferences.Editor edit = this.b.edit();
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            String reEligibilityId = (String) it2.next();
            Intrinsics.checkNotNullExpressionValue(reEligibilityId, "reEligibilityId");
            if (linkedHashSet.contains(a(reEligibilityId))) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new q(reEligibilityId), 3, (Object) null);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new p(reEligibilityId), 3, (Object) null);
                this.c.remove(reEligibilityId);
                edit.remove(reEligibilityId);
            }
        }
        edit.apply();
    }

    public final boolean a(long nowInSeconds, BrazeGeofence geofence, GeofenceTransitionType transitionType) {
        String str;
        Intrinsics.checkNotNullParameter(geofence, "geofence");
        Intrinsics.checkNotNullParameter(transitionType, "transitionType");
        String id = geofence.getId();
        long j2 = nowInSeconds - this.f;
        if (this.h > j2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new e(j2, this, id), 3, (Object) null);
            return false;
        }
        String a2 = a(id, transitionType);
        int cooldownEnterSeconds = transitionType == GeofenceTransitionType.ENTER ? geofence.getCooldownEnterSeconds() : geofence.getCooldownExitSeconds();
        if (this.c.containsKey(a2)) {
            Long l2 = this.c.get(a2);
            if (l2 != null) {
                long longValue = nowInSeconds - l2.longValue();
                if (cooldownEnterSeconds > longValue) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new f(longValue, cooldownEnterSeconds, id, transitionType), 3, (Object) null);
                    return false;
                }
                str = id;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new g(longValue, cooldownEnterSeconds, id, transitionType), 3, (Object) null);
            } else {
                str = id;
            }
        } else {
            str = id;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new h(str, transitionType), 3, (Object) null);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new i(j2, this, str), 3, (Object) null);
        this.c.put(a2, Long.valueOf(nowInSeconds));
        this.b.edit().putLong(a2, nowInSeconds).apply();
        this.f = nowInSeconds;
        this.a.edit().putLong("last_report_global", nowInSeconds).apply();
        return true;
    }

    public final boolean a(boolean ignoreRateLimit, long nowInSeconds) {
        long j2 = nowInSeconds - this.e;
        if (!ignoreRateLimit && this.g > j2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new j(j2, this), 3, (Object) null);
            return false;
        }
        if (ignoreRateLimit) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new k(j2), 3, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new l(j2, this), 3, (Object) null);
        }
        if (this.d.compareAndSet(false, true)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, C0082m.b, 3, (Object) null);
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, n.b, 3, (Object) null);
        return false;
    }

    public final void a(long nowInSeconds) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new r(nowInSeconds), 3, (Object) null);
        this.e = nowInSeconds;
        this.a.edit().putLong("last_request_global", this.e).apply();
    }

    public final String a(String reEligibilityId) {
        Intrinsics.checkNotNullParameter(reEligibilityId, "reEligibilityId");
        try {
            return new Regex("_").split(reEligibilityId, 2).get(1);
        } catch (Exception e2) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e2, new o(reEligibilityId));
            return null;
        }
    }

    public final String a(String geofenceId, GeofenceTransitionType transitionType) {
        Intrinsics.checkNotNullParameter(geofenceId, "geofenceId");
        Intrinsics.checkNotNullParameter(transitionType, "transitionType");
        StringBuilder sb = new StringBuilder();
        String str = transitionType.toString();
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = str.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return sb.append(lowerCase).append('_').append(geofenceId).toString();
    }

    public final void a(i5 serverConfig) {
        Intrinsics.checkNotNullParameter(serverConfig, "serverConfig");
        int e2 = serverConfig.getE();
        if (e2 >= 0) {
            this.g = e2;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new b(e2), 2, (Object) null);
        }
        int f2 = serverConfig.getF();
        if (f2 >= 0) {
            this.h = f2;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new c(f2), 2, (Object) null);
        }
    }

    public final Map<String, Long> a(SharedPreferences sharedPreferences) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        Map<String, ?> all = sharedPreferences.getAll();
        if (all != null && !all.isEmpty()) {
            Set<String> keySet = all.keySet();
            if (!keySet.isEmpty()) {
                for (String reEligibilityId : keySet) {
                    long j2 = sharedPreferences.getLong(reEligibilityId, 0L);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new d(reEligibilityId), 3, (Object) null);
                    Intrinsics.checkNotNullExpressionValue(reEligibilityId, "reEligibilityId");
                    concurrentHashMap.put(reEligibilityId, Long.valueOf(j2));
                }
            }
        }
        return concurrentHashMap;
    }
}
