package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.Constants;
import com.braze.events.IEventSubscriber;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.StringUtils;
import com.ironsource.X3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0005\u000eB3\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u0002H\u0002J\u000e\u0010\u0005\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006J\u0010\u0010\u0005\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\tH\u0007R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u000bR$\u0010\u0011\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u000e\u0010\u0010¨\u0006\u001c"}, d2 = {"Lbo/app/l4;", "", "Landroid/content/SharedPreferences;", "", "Lbo/app/l4$a;", Constants.BRAZE_PUSH_CONTENT_KEY, "", "pushCampaign", "", "", "updateTime", "()Ljava/util/List;", "allPushMaxCampaignData", "value", "b", "()J", "(J)V", "pushMaxLastUpdateTime", "Landroid/content/Context;", "context", "apiKey", "userId", "Lbo/app/h2;", "internalEventPublisher", "Lbo/app/k5;", "serverConfigStorageProvider", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lbo/app/h2;Lbo/app/k5;)V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class l4 {
    public static final b d = new b(null);
    private final k5 a;
    private final SharedPreferences b;
    private final SharedPreferences c;

    @Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lbo/app/l4$a;", "", "", "toString", "", "hashCode", "other", "", "equals", "id", "Ljava/lang/String;", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;", "", "timestamp", "<init>", "(Ljava/lang/String;J)V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
    public static final /* data */ class a {
        private final String a;
        private final long b;

        public a(String id, long j) {
            Intrinsics.checkNotNullParameter(id, "id");
            this.a = id;
            this.b = j;
        }

        /* renamed from: a, reason: from getter */
        public final String getA() {
            return this.a;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return Intrinsics.areEqual(this.a, aVar.a) && this.b == aVar.b;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + Long.hashCode(this.b);
        }

        public String toString() {
            return "CampaignData(id=" + this.a + ", timestamp=" + this.b + ')';
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\t"}, d2 = {"Lbo/app/l4$b;", "", "", "BRAZE_PUSH_CAMPAIGNS_LAST_UPDATE_KEY", "Ljava/lang/String;", "BRAZE_PUSH_MAX_METADATA_FILENAME", "BRAZE_PUSH_MAX_STORAGE_FILENAME", "<init>", "()V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class c extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Adding push campaign to storage with uid ", this.b);
        }
    }

    public l4(Context context, String apiKey, String str, h2 internalEventPublisher, k5 serverConfigStorageProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(internalEventPublisher, "internalEventPublisher");
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        this.a = serverConfigStorageProvider;
        this.b = context.getSharedPreferences(Intrinsics.stringPlus("com.braze.storage.braze_push_max_storage", StringUtils.getCacheFileSuffix(context, str, apiKey)), 0);
        this.c = context.getSharedPreferences(Intrinsics.stringPlus("com.braze.storage.braze_push_max_metadata", StringUtils.getCacheFileSuffix(context, str, apiKey)), 0);
        internalEventPublisher.b(m4.class, new IEventSubscriber() { // from class: bo.app.l4$$ExternalSyntheticLambda0
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                l4.a(l4.this, (m4) obj);
            }
        });
    }

    public final List<a> a() {
        SharedPreferences pushMaxPrefs = this.b;
        Intrinsics.checkNotNullExpressionValue(pushMaxPrefs, "pushMaxPrefs");
        return a(pushMaxPrefs);
    }

    public final long b() {
        return this.c.getLong(X3.j.V, -1L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(l4 this$0, m4 it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.b(it.getA());
        this$0.a(it.getA());
    }

    public final void b(long j) {
        this.c.edit().putLong(X3.j.V, j).apply();
    }

    public final void a(String pushCampaign) {
        Intrinsics.checkNotNullParameter(pushCampaign, "pushCampaign");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new c(pushCampaign), 3, (Object) null);
        this.b.edit().putLong(pushCampaign, DateTimeUtils.nowInSeconds()).apply();
    }

    public final void a(long updateTime) {
        SharedPreferences pushMaxPrefs = this.b;
        Intrinsics.checkNotNullExpressionValue(pushMaxPrefs, "pushMaxPrefs");
        List<a> a2 = a(pushMaxPrefs);
        SharedPreferences.Editor edit = this.b.edit();
        for (a aVar : a2) {
            if (this.b.getLong(aVar.getA(), 0L) < updateTime) {
                edit.remove(aVar.getA());
            }
        }
        edit.apply();
    }

    private final List<a> a(SharedPreferences sharedPreferences) {
        ArrayList arrayList = new ArrayList();
        Map<String, ?> all = sharedPreferences.getAll();
        Intrinsics.checkNotNullExpressionValue(all, "this.all");
        Iterator<Map.Entry<String, ?>> it = all.entrySet().iterator();
        while (it.hasNext()) {
            String campaignId = it.next().getKey();
            Intrinsics.checkNotNullExpressionValue(campaignId, "campaignId");
            arrayList.add(new a(campaignId, sharedPreferences.getLong(campaignId, 0L)));
        }
        return CollectionsKt.toList(arrayList);
    }
}
