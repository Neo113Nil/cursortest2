package bo.app;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import androidx.core.app.NotificationCompat;
import androidx.recyclerview.widget.ItemTouchHelper;
import bo.app.l4;
import bo.app.x3;
import com.braze.BrazeFlushPushDeliveryReceiver;
import com.braze.Constants;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.events.IEventSubscriber;
import com.braze.models.IBrazeLocation;
import com.braze.support.BrazeLogger;
import com.braze.support.IntentUtils;
import com.braze.support.JsonUtils;
import com.google.android.exoplayer2.C;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;

@Metadata(bv = {}, d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000fBq\u0012\u0006\u00107\u001a\u000206\u0012\b\u0010*\u001a\u0004\u0018\u00010(\u0012\u0006\u00108\u001a\u00020(\u0012\u0006\u0010:\u001a\u000209\u0012\u0006\u0010<\u001a\u00020;\u0012\u0006\u0010>\u001a\u00020=\u0012\u0006\u0010@\u001a\u00020?\u0012\u0006\u0010B\u001a\u00020A\u0012\u0006\u0010-\u001a\u00020\u0004\u0012\u0006\u0010D\u001a\u00020C\u0012\u0006\u0010F\u001a\u00020E\u0012\u0006\u0010H\u001a\u00020G\u0012\u0006\u0010J\u001a\u00020I¢\u0006\u0004\bK\u0010LJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010\f\u001a\u00020\u0006H\u0016J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0010\u001a\u00020\u0006H\u0016J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\b\u0010\u0015\u001a\u00020\u0006H\u0016J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\rH\u0016J\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0016J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001bH\u0016J(\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0004H\u0016J\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u0004H\u0007J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010%\u001a\u00020$H\u0007J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u001dH\u0016J\b\u0010'\u001a\u00020\u0006H\u0016J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010)\u001a\u00020(H\u0016J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010)\u001a\u00020(H\u0016R\u001c\u0010*\u001a\u0004\u0018\u00010(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b\u000f\u0010,R\"\u0010-\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b-\u0010/\"\u0004\b\u0010\u00100R\u0016\u00104\u001a\u0004\u0018\u0001018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R$\u00105\u001a\u00020\u00042\u0006\u00105\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010/\"\u0004\b\u000f\u00100¨\u0006M"}, d2 = {"Lbo/app/p;", "Lbo/app/z1;", "", "throwable", "", "c", "", Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, "Landroid/app/Activity;", "activity", "openSession", "closeSession", "e", "Lbo/app/x1;", "event", Constants.BRAZE_PUSH_CONTENT_KEY, "b", "Lbo/app/x3$a;", "respondWithBuilder", "Lcom/braze/models/IBrazeLocation;", FirebaseAnalytics.Param.LOCATION, "refreshFeatureFlags", "Lbo/app/a2;", "request", "geofenceEvent", "Lbo/app/b6;", "templatedTriggeredAction", "Lbo/app/t2;", "triggerEvent", "", "lastCardUpdatedAt", "lastFullSyncAt", "", "retryCount", "isClientInitiated", "shouldPersistError", "Lbo/app/h4;", "notificationTrackingBrazeEvent", "waitTimeInMs", "f", "", "campaignId", "userId", "Ljava/lang/String;", "()Ljava/lang/String;", "isOutboundNetworkRequestsOffline", "Z", "()Z", "(Z)V", "Lbo/app/o5;", "g", "()Lbo/app/o5;", "currentSessionId", "shouldRequestTriggersInNextRequest", "Landroid/content/Context;", "context", "apiKey", "Lbo/app/u;", "sessionManager", "Lbo/app/h2;", "internalEventPublisher", "Lcom/braze/configuration/BrazeConfigurationProvider;", "configurationProvider", "Lbo/app/k5;", "serverConfigStorageProvider", "Lbo/app/d1;", "eventStorageManager", "Lbo/app/q;", "messagingSessionManager", "Lbo/app/f5;", "sdkEnablementProvider", "Lbo/app/l4;", "pushMaxManager", "Lbo/app/j4;", "pushDeliveryManager", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lbo/app/u;Lbo/app/h2;Lcom/braze/configuration/BrazeConfigurationProvider;Lbo/app/k5;Lbo/app/d1;ZLbo/app/q;Lbo/app/f5;Lbo/app/l4;Lbo/app/j4;)V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class p implements z1 {
    public static final a v = new a(null);
    private static final String[] w = {"android.os.deadsystemexception"};
    private final Context a;
    private final String b;
    private final bo.app.u c;
    private final h2 d;
    private final BrazeConfigurationProvider e;
    private final k5 f;
    private final d1 g;
    private boolean h;
    private final bo.app.q i;
    private final f5 j;
    private final l4 k;
    private final j4 l;
    private final AtomicInteger m;
    private final AtomicInteger n;
    private final ReentrantLock o;
    private Job p;
    private final z0 q;
    private final e6 r;
    private volatile String s;
    private final AtomicBoolean t;
    private Class<? extends Activity> u;

    @Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010¨\u0006\u0014"}, d2 = {"Lbo/app/p$a;", "", "", "isSessionInBackground", "Lbo/app/x1;", "event", Constants.BRAZE_PUSH_CONTENT_KEY, "", "INACTIVE_SESSION_DELAY_MILLIS", "J", "", "", "INTERNAL_ERROR_DENYLIST", "[Ljava/lang/String;", "", "MAX_CONSECUTIVE_ERRORS", "I", "MAX_ERRORS", "<init>", "()V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean a(boolean isSessionInBackground, x1 event) {
            if (isSessionInBackground) {
                return event.getB() == e1.PUSH_ACTION_BUTTON_CLICKED ? !((e4) event).getJ() : event.getB() == e1.PUSH_CLICKED || event.getB() == e1.PUSH_STORY_PAGE_CLICK;
            }
            return false;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class a0 extends Lambda implements Function0<String> {
        public static final a0 b = new a0();

        a0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Posting feature flags refresh request.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class b extends Lambda implements Function0<String> {
        public static final b b = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "SDK is disabled. Not adding request to dispatch.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class b0 extends Lambda implements Function0<String> {
        public static final b0 b = new b0();

        b0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Disallowing Content Cards sync due to Content Cards not being enabled.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class c extends Lambda implements Function0<String> {
        public static final c b = new c();

        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "SDK is disabled. Not closing session.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class c0 extends Lambda implements Function0<String> {
        c0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Content card sync proceeding: ", p.this.r);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class d extends Lambda implements Function0<String> {
        final /* synthetic */ Activity b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Activity activity) {
            super(0);
            this.b = activity;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Closed session with activity: ", this.b.getLocalClassName());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class d0 extends Lambda implements Function0<String> {
        d0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Content card sync being throttled: ", p.this.r);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class e extends Lambda implements Function0<String> {
        public static final e b = new e();

        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "SDK is disabled. Not force closing session.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class e0 extends Lambda implements Function0<String> {
        public static final e0 b = new e0();

        e0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Posting geofence request for location.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class f extends Lambda implements Function0<String> {
        final /* synthetic */ Throwable b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Throwable th) {
            super(0);
            this.b = th;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Not logging duplicate error: ", this.b);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class f0 extends Lambda implements Function0<String> {
        public static final f0 b = new f0();

        f0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Sending Push Max data";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class g extends Lambda implements Function0<String> {
        public static final g b = new g();

        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to log error.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class g0 extends Lambda implements Function0<String> {
        g0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Updated shouldRequestTriggersInNextRequest to: ", p.this.t);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class h extends Lambda implements Function0<String> {
        final /* synthetic */ x1 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(x1 x1Var) {
            super(0);
            this.b = x1Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("SDK is disabled. Not logging event: ", this.b);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class i extends Lambda implements Function0<String> {
        final /* synthetic */ x1 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(x1 x1Var) {
            super(0);
            this.b = x1Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Not processing event after validation failed: ", this.b);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class j extends Lambda implements Function0<String> {
        final /* synthetic */ x1 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(x1 x1Var) {
            super(0);
            this.b = x1Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Not adding user id to event: ", JsonUtils.getPrettyPrintedString(this.b.getKey()));
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class k extends Lambda implements Function0<String> {
        final /* synthetic */ x1 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(x1 x1Var) {
            super(0);
            this.b = x1Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Attempting to log event: ", JsonUtils.getPrettyPrintedString(this.b.getKey()));
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class l extends Lambda implements Function0<String> {
        public static final l b = new l();

        l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Publishing an internal push body clicked event for any awaiting triggers.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class m extends Lambda implements Function0<String> {
        public static final m b = new m();

        m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Adding push click to dispatcher pending list";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "com.braze.managers.BrazeManager$logEvent$7", f = "BrazeManager.kt", i = {}, l = {ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION}, m = "invokeSuspend", n = {}, s = {})
    static final class n extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int b;

        n(Continuation<? super n> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((n) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return p.this.new n(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.b = 1;
                if (DelayKt.delay(1000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            p.this.b();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class o extends Lambda implements Function0<String> {
        final /* synthetic */ x1 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(x1 x1Var) {
            super(0);
            this.b = x1Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Not adding session id to event: ", JsonUtils.getPrettyPrintedString(this.b.getKey()));
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    /* renamed from: bo.app.p$p, reason: collision with other inner class name */
    static final class C0085p extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0085p(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Logging push delivery event for campaign id: ", this.b);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class q extends Lambda implements Function0<String> {
        public static final q b = new q();

        q() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Logging push max campaign";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class r extends Lambda implements Function0<String> {
        public static final r b = new r();

        r() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "SDK is disabled. Not opening session.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class s extends Lambda implements Function0<String> {
        s() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Completed the openSession call. Starting or continuing session ", p.this.c.g());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class t extends Lambda implements Function0<String> {
        public static final t b = new t();

        t() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "SDK is disabled. Not opening session.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class u extends Lambda implements Function0<String> {
        final /* synthetic */ Activity b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(Activity activity) {
            super(0);
            this.b = activity;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Opened session with activity: ", this.b.getLocalClassName());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class v extends Lambda implements Function0<String> {
        public static final v b = new v();

        v() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to get local class name for activity when opening session";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class w extends Lambda implements Function0<String> {
        public static final w b = new w();

        w() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Flushing Push Delivery Events now";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class x extends Lambda implements Function0<String> {
        public static final x b = new x();

        x() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Attempted to flush Push Delivery events, but no events are available";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class y extends Lambda implements Function0<String> {
        final /* synthetic */ long b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y(long j) {
            super(0);
            this.b = j;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Scheduling Push Delivery Events Flush in " + this.b + " ms";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class z extends Lambda implements Function0<String> {
        public static final z b = new z();

        z() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Posting geofence report for geofence event.";
        }
    }

    public p(Context context, String str, String apiKey, bo.app.u sessionManager, h2 internalEventPublisher, BrazeConfigurationProvider configurationProvider, k5 serverConfigStorageProvider, d1 eventStorageManager, boolean z2, bo.app.q messagingSessionManager, f5 sdkEnablementProvider, l4 pushMaxManager, j4 pushDeliveryManager) {
        CompletableJob Job$default;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(sessionManager, "sessionManager");
        Intrinsics.checkNotNullParameter(internalEventPublisher, "internalEventPublisher");
        Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        Intrinsics.checkNotNullParameter(eventStorageManager, "eventStorageManager");
        Intrinsics.checkNotNullParameter(messagingSessionManager, "messagingSessionManager");
        Intrinsics.checkNotNullParameter(sdkEnablementProvider, "sdkEnablementProvider");
        Intrinsics.checkNotNullParameter(pushMaxManager, "pushMaxManager");
        Intrinsics.checkNotNullParameter(pushDeliveryManager, "pushDeliveryManager");
        this.a = context;
        this.b = str;
        this.c = sessionManager;
        this.d = internalEventPublisher;
        this.e = configurationProvider;
        this.f = serverConfigStorageProvider;
        this.g = eventStorageManager;
        this.h = z2;
        this.i = messagingSessionManager;
        this.j = sdkEnablementProvider;
        this.k = pushMaxManager;
        this.l = pushDeliveryManager;
        this.m = new AtomicInteger(0);
        this.n = new AtomicInteger(0);
        this.o = new ReentrantLock();
        Job$default = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        this.p = Job$default;
        this.q = new z0(context, getB(), apiKey);
        this.r = new e6(serverConfigStorageProvider.f(), serverConfigStorageProvider.g());
        this.s = "";
        this.t = new AtomicBoolean(false);
        internalEventPublisher.b(c5.class, new IEventSubscriber() { // from class: bo.app.p$$ExternalSyntheticLambda0
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                p.a(p.this, (c5) obj);
            }
        });
    }

    @Override // bo.app.z1
    public void closeSession(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (this.j.a()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, c.b, 2, (Object) null);
        } else if (this.u == null || Intrinsics.areEqual(activity.getClass(), this.u)) {
            this.i.c();
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new d(activity), 2, (Object) null);
            this.c.o();
        }
    }

    @Override // bo.app.z1
    public void d() {
        if (this.j.a()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, r.b, 2, (Object) null);
        } else {
            this.c.m();
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new s(), 2, (Object) null);
        }
    }

    @Override // bo.app.z1
    public void e() {
        if (this.j.a()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, e.b, 2, (Object) null);
        } else {
            this.u = null;
            this.c.l();
        }
    }

    @Override // bo.app.z1
    public void f() {
        if (this.f.v()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, f0.b, 3, (Object) null);
            String baseUrlForRequests = this.e.getBaseUrlForRequests();
            String b2 = getB();
            List<l4.a> a2 = this.k.a();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(a2, 10));
            Iterator<T> it = a2.iterator();
            while (it.hasNext()) {
                arrayList.add(((l4.a) it.next()).getA());
            }
            a(new n4(baseUrlForRequests, b2, arrayList, this.k.b()));
        }
    }

    public o5 g() {
        return this.c.g();
    }

    @Override // bo.app.z1
    public void openSession(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (this.j.a()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, t.b, 2, (Object) null);
            return;
        }
        d();
        this.u = activity.getClass();
        this.i.b();
        try {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new u(activity), 2, (Object) null);
        } catch (Exception e2) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e2, v.b);
        }
    }

    @Override // bo.app.z1
    public void refreshFeatureFlags() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, a0.b, 3, (Object) null);
        a(new j1(this.e.getBaseUrlForRequests(), getB()));
    }

    @Override // bo.app.z1
    /* renamed from: a, reason: from getter */
    public String getB() {
        return this.b;
    }

    @Override // bo.app.z1
    public void b(boolean z2) {
        this.h = z2;
    }

    @Override // bo.app.z1
    public boolean c() {
        return this.t.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(p this$0, c5 it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.a(it.getA());
    }

    private final boolean c(Throwable throwable) {
        ReentrantLock reentrantLock = this.o;
        reentrantLock.lock();
        try {
            this.m.getAndIncrement();
            if (Intrinsics.areEqual(this.s, throwable.getMessage()) && this.n.get() > 3 && this.m.get() < 100) {
                reentrantLock.unlock();
                return true;
            }
            if (Intrinsics.areEqual(this.s, throwable.getMessage())) {
                this.n.getAndIncrement();
            } else {
                this.n.set(0);
            }
            if (this.m.get() >= 100) {
                this.m.set(0);
            }
            this.s = throwable.getMessage();
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // bo.app.z1
    public void b(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        a(throwable, true);
    }

    @Override // bo.app.z1
    public void a(boolean z2) {
        this.t.set(z2);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new g0(), 2, (Object) null);
    }

    @Override // bo.app.z1
    public void b() {
        a(new x3.a(null, null, null, null, 15, null));
    }

    @Override // bo.app.z1
    public boolean a(x1 event) {
        Job launch$default;
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z2 = false;
        if (this.j.a()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new h(event), 2, (Object) null);
            return false;
        }
        if (!this.q.a(event)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new i(event), 2, (Object) null);
            return false;
        }
        if (!this.c.j() && this.c.g() != null) {
            event.a(this.c.g());
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new o(event), 3, (Object) null);
            z2 = true;
        }
        String b2 = getB();
        if (b2 != null && b2.length() != 0) {
            event.a(getB());
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new j(event), 3, (Object) null);
        }
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, this, BrazeLogger.Priority.V, (Throwable) null, new k(event), 2, (Object) null);
        if (event.getB() == e1.PUSH_CLICKED) {
            BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, l.b, 3, (Object) null);
            a((h4) event);
        }
        if (!event.d()) {
            this.g.a(event);
        }
        if (v.a(z2, event)) {
            BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, m.b, 3, (Object) null);
            this.d.a((h2) p0.e.b(event), (Class<h2>) p0.class);
        } else {
            this.d.a((h2) p0.e.a(event), (Class<h2>) p0.class);
        }
        if (event.getB() == e1.SESSION_START) {
            this.d.a((h2) p0.e.a(event.n()), (Class<h2>) p0.class);
        }
        if (z2) {
            Job.DefaultImpls.cancel$default(this.p, (CancellationException) null, 1, (Object) null);
            launch$default = BuildersKt__Builders_commonKt.launch$default(BrazeCoroutineScope.INSTANCE, null, null, new n(null), 3, null);
            this.p = launch$default;
        }
        return true;
    }

    @Override // bo.app.z1
    public void b(x1 geofenceEvent) {
        Intrinsics.checkNotNullParameter(geofenceEvent, "geofenceEvent");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, z.b, 3, (Object) null);
        a(new q1(this.e.getBaseUrlForRequests(), geofenceEvent));
    }

    @Override // bo.app.z1
    public void b(String campaignId) {
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, q.b, 3, (Object) null);
        if (this.f.v()) {
            this.k.a(campaignId);
        }
    }

    @Override // bo.app.z1
    public void a(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        a(throwable, false);
    }

    @Override // bo.app.z1
    public void a(x3.a respondWithBuilder) {
        Intrinsics.checkNotNullParameter(respondWithBuilder, "respondWithBuilder");
        Pair<Long, Boolean> a2 = this.f.a();
        if (a2 != null) {
            respondWithBuilder.a(new w3(a2.getFirst().longValue(), a2.getSecond().booleanValue()));
        }
        if (this.t.get()) {
            respondWithBuilder.c();
        }
        respondWithBuilder.a(getB());
        a(new j0(this.e.getBaseUrlForRequests(), respondWithBuilder.a()));
        this.t.set(false);
    }

    @Override // bo.app.z1
    public void a(IBrazeLocation location) {
        Intrinsics.checkNotNullParameter(location, "location");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, e0.b, 3, (Object) null);
        a(new p1(this.e.getBaseUrlForRequests(), location));
    }

    @Override // bo.app.z1
    public void a(a2 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (this.j.a()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, b.b, 2, (Object) null);
        } else {
            request.a(getB());
            this.d.a((h2) p0.e.a(request), (Class<h2>) p0.class);
        }
    }

    @Override // bo.app.z1
    public void a(b6 templatedTriggeredAction, t2 triggerEvent) {
        Intrinsics.checkNotNullParameter(templatedTriggeredAction, "templatedTriggeredAction");
        Intrinsics.checkNotNullParameter(triggerEvent, "triggerEvent");
        a(new a6(this.e.getBaseUrlForRequests(), templatedTriggeredAction, triggerEvent, this, getB()));
    }

    @Override // bo.app.z1
    public void a(t2 triggerEvent) {
        Intrinsics.checkNotNullParameter(triggerEvent, "triggerEvent");
        this.d.a((h2) new l6(triggerEvent), (Class<h2>) l6.class);
    }

    @Override // bo.app.z1
    public void a(long lastCardUpdatedAt, long lastFullSyncAt, int retryCount, boolean isClientInitiated) {
        if (!this.f.q()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, b0.b, 2, (Object) null);
            return;
        }
        if ((isClientInitiated && this.f.p()) ? this.r.a() : true) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new c0(), 2, (Object) null);
            a(new bo.app.c0(this.e.getBaseUrlForRequests(), lastCardUpdatedAt, lastFullSyncAt, getB(), retryCount));
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new d0(), 2, (Object) null);
        }
    }

    public final void a(Throwable throwable, boolean shouldPersistError) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        try {
        } catch (Exception e2) {
            e = e2;
        }
        try {
            if (c(throwable)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new f(throwable), 2, (Object) null);
                return;
            }
            String th = throwable.toString();
            String[] strArr = w;
            int length = strArr.length;
            int i2 = 0;
            while (i2 < length) {
                String str = strArr[i2];
                i2++;
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                String lowerCase = th.toLowerCase(US);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) str, false, 2, (Object) null)) {
                    return;
                }
            }
            x1 a2 = bo.app.j.h.a(throwable, g(), shouldPersistError);
            if (a2 == null) {
                return;
            }
            a(a2);
        } catch (Exception e3) {
            e = e3;
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e, g.b);
        }
    }

    public final void a(h4 notificationTrackingBrazeEvent) {
        Intrinsics.checkNotNullParameter(notificationTrackingBrazeEvent, "notificationTrackingBrazeEvent");
        String campaignId = notificationTrackingBrazeEvent.getC().optString(Constants.BRAZE_PUSH_CAMPAIGN_ID_KEY, "");
        h2 h2Var = this.d;
        Intrinsics.checkNotNullExpressionValue(campaignId, "campaignId");
        h2Var.a((h2) new j6(campaignId, notificationTrackingBrazeEvent), (Class<h2>) j6.class);
    }

    @Override // bo.app.z1
    public void a(long waitTimeInMs) {
        Object systemService = this.a.getSystemService(NotificationCompat.CATEGORY_ALARM);
        if (systemService != null) {
            AlarmManager alarmManager = (AlarmManager) systemService;
            Intent intent = new Intent(this.a, (Class<?>) BrazeFlushPushDeliveryReceiver.class);
            intent.setAction(BrazeFlushPushDeliveryReceiver.FLUSH_BRAZE_PUSH_DELIVERIES_ACTION);
            PendingIntent broadcast = PendingIntent.getBroadcast(this.a, 0, intent, IntentUtils.getImmutablePendingIntentFlags() | C.BUFFER_FLAG_FIRST_SAMPLE);
            if (waitTimeInMs <= 0) {
                alarmManager.cancel(broadcast);
                List<i4> b2 = this.l.b();
                if (!b2.isEmpty()) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, w.b, 3, (Object) null);
                    a(new k4(this.e.getBaseUrlForRequests(), getB(), b2));
                    return;
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, x.b, 3, (Object) null);
                    return;
                }
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new y(waitTimeInMs), 3, (Object) null);
            alarmManager.set(2, SystemClock.elapsedRealtime() + waitTimeInMs, broadcast);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.AlarmManager");
    }

    @Override // bo.app.z1
    public void a(String campaignId) {
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new C0085p(campaignId), 3, (Object) null);
        this.l.a(campaignId);
    }
}
