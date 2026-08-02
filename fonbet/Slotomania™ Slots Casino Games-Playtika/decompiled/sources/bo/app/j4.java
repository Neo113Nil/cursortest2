package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.Constants;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0014\u0010\u0004\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007J\u0014\u0010\t\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002R&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\n8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\t\u0010\r¨\u0006\u0015"}, d2 = {"Lbo/app/j4;", "", "", "Lbo/app/i4;", "b", "events", "", "", "pushCampaignId", Constants.BRAZE_PUSH_CONTENT_KEY, "", "allPdeEvents", "Ljava/util/List;", "()Ljava/util/List;", "getAllPdeEvents$android_sdk_base_release$annotations", "()V", "Landroid/content/Context;", "context", "apiKey", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public final class j4 {
    public static final a d = new a(null);
    private final ReentrantLock a;
    private final List<i4> b;
    private final SharedPreferences c;

    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0006\u001a\u00020\u00058\u0000X\u0081T¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u0012\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lbo/app/j4$a;", "", "", "BRAZE_PUSH_DELIVERY_STORAGE_FILENAME", "Ljava/lang/String;", "", "MAX_PDE_EVENTS_PER_SEND", "I", "getMAX_PDE_EVENTS_PER_SEND$android_sdk_base_release$annotations", "()V", "<init>", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class b extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Adding push campaign to storage with uid ", this.b);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class c extends Lambda implements Function0<String> {
        final /* synthetic */ i4 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(i4 i4Var) {
            super(0);
            this.b = i4Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Clearing PDE from storage with uid ", this.b.x());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class d extends Lambda implements Function0<String> {
        final /* synthetic */ List<i4> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(List<i4> list) {
            super(0);
            this.b = list;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Re-adding PDEs to storage: ", this.b);
        }
    }

    public j4(Context context, String apiKey) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        ReentrantLock reentrantLock = new ReentrantLock();
        this.a = reentrantLock;
        this.b = new ArrayList();
        SharedPreferences sharedPreferences = context.getSharedPreferences(Intrinsics.stringPlus("com.braze.storage.braze_push_delivery_storage", StringUtils.getCacheFileSuffix(context, null, apiKey)), 0);
        this.c = sharedPreferences;
        reentrantLock.lock();
        try {
            a().clear();
            Map<String, ?> all = sharedPreferences.getAll();
            Intrinsics.checkNotNullExpressionValue(all, "pdePrefs.all");
            Iterator<Map.Entry<String, ?>> it = all.entrySet().iterator();
            while (it.hasNext()) {
                String campaignId = it.next().getKey();
                List<i4> a2 = a();
                Intrinsics.checkNotNullExpressionValue(campaignId, "campaignId");
                a2.add(new i4(campaignId, this.c.getLong(campaignId, 0L)));
            }
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final List<i4> a() {
        return this.b;
    }

    public final List<i4> b() {
        ArrayList arrayList = new ArrayList();
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            for (i4 i4Var : a()) {
                if (arrayList.size() >= 32) {
                    break;
                }
                arrayList.add(i4Var);
            }
            a().removeAll(arrayList);
            return arrayList;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void a(String pushCampaignId) {
        Intrinsics.checkNotNullParameter(pushCampaignId, "pushCampaignId");
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            try {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new b(pushCampaignId), 3, (Object) null);
                long nowInSeconds = DateTimeUtils.nowInSeconds();
                this.c.edit().putLong(pushCampaignId, nowInSeconds).apply();
                a().add(new i4(pushCampaignId, nowInSeconds));
                reentrantLock.unlock();
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                reentrantLock.unlock();
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final void a(List<i4> events) {
        Intrinsics.checkNotNullParameter(events, "events");
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            SharedPreferences.Editor edit = this.c.edit();
            for (i4 i4Var : events) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new c(i4Var), 3, (Object) null);
                edit.remove(i4Var.x());
            }
            edit.apply();
            a().removeAll(events);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void b(List<i4> events) {
        Intrinsics.checkNotNullParameter(events, "events");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new d(events), 3, (Object) null);
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            a().addAll(events);
        } finally {
            reentrantLock.unlock();
        }
    }
}
