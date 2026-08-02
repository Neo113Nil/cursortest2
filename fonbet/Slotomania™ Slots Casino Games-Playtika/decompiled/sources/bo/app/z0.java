package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.Constants;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.StringUtils;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0005B!\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0002J\u0010\u0010\u0005\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0002H\u0007J\b\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\u0013"}, d2 = {"Lbo/app/z0;", "", "", "eventId", "", Constants.BRAZE_PUSH_CONTENT_KEY, "eventKey", "", "b", "Lbo/app/x1;", "event", "", "expiresAt", "Landroid/content/Context;", "context", "userId", "apiKey", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class z0 {
    public static final a b = new a(null);
    private static final long c = TimeUnit.DAYS.toMillis(7);
    private final SharedPreferences a;

    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lbo/app/z0$a;", "", "Lbo/app/x1;", "event", "", Constants.BRAZE_PUSH_CONTENT_KEY, "", "CACHE_EXPIRATION", "J", "STORAGE_PREFIX", "Ljava/lang/String;", "<init>", "()V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(x1 event) {
            Intrinsics.checkNotNullParameter(event, "event");
            return event.getB() + h4.j.a(event);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class b extends Lambda implements Function0<String> {
        final /* synthetic */ Map.Entry<String, ? extends Object> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Map.Entry<String, ? extends Object> entry) {
            super(0);
            this.b = entry;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Failed to get expiration time. Deleting entry: ", this.b);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class c extends Lambda implements Function0<String> {
        final /* synthetic */ x1 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(x1 x1Var) {
            super(0);
            this.b = x1Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Event already seen in cache. Ignoring duplicate: ", this.b);
        }
    }

    public z0(Context context, String str, String apiKey) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        SharedPreferences sharedPreferences = context.getSharedPreferences(Intrinsics.stringPlus("com.appboy.storage.event_data_validator", StringUtils.getCacheFileSuffix(context, str, apiKey)), 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…ontext.MODE_PRIVATE\n    )");
        this.a = sharedPreferences;
        a();
    }

    private final boolean b(String eventKey) {
        return this.a.contains(eventKey);
    }

    public boolean a(x1 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getB() != e1.PUSH_CLICKED) {
            return true;
        }
        a();
        String a2 = b.a(event);
        if (b(a2)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new c(event), 3, (Object) null);
            return false;
        }
        a(DateTimeUtils.nowInMilliseconds() + c, a2);
        return true;
    }

    private final void a(String eventId) {
        this.a.edit().remove(eventId).apply();
    }

    public final void a(long expiresAt, String eventKey) {
        Intrinsics.checkNotNullParameter(eventKey, "eventKey");
        this.a.edit().putLong(eventKey, expiresAt).apply();
    }

    public final void a() {
        Object value;
        long nowInMilliseconds = DateTimeUtils.nowInMilliseconds();
        for (Map.Entry<String, ?> entry : this.a.getAll().entrySet()) {
            try {
                value = entry.getValue();
            } catch (Exception e) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e, new b(entry));
                String key = entry.getKey();
                Intrinsics.checkNotNullExpressionValue(key, "entry.key");
                a(key);
            }
            if (value == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
            }
            if (nowInMilliseconds >= ((Long) value).longValue()) {
                String key2 = entry.getKey();
                Intrinsics.checkNotNullExpressionValue(key2, "entry.key");
                a(key2);
            }
        }
    }
}
