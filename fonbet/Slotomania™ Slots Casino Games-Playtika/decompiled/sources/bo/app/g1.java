package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.Constants;
import com.braze.events.FeatureFlagsUpdatedEvent;
import com.braze.events.IEventSubscriber;
import com.braze.models.FeatureFlag;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.StringUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(bv = {}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B;\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010)\u001a\u00020\f\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010+\u001a\u00020\u0011\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b.\u0010/J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0006\u0010\u0005\u001a\u00020\u0002J\u000f\u0010\u0006\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u0006\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0006\u0010\u000bJ!\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0004\b\u0006\u0010\u0010J\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0006\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0019\u001a\u00020\u00188\u0007¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR \u0010 \u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001f\u0010\u0007\u001a\u0004\b\u001d\u0010\u001eR \u0010\"\u001a\u00020!8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\"\u0010#\u0012\u0004\b&\u0010\u0007\u001a\u0004\b$\u0010%¨\u00060"}, d2 = {"Lbo/app/g1;", "", "", "h", "f", "g", Constants.BRAZE_PUSH_CONTENT_KEY, "()V", "Lorg/json/JSONArray;", "featureFlagsData", "Lcom/braze/events/FeatureFlagsUpdatedEvent;", "(Lorg/json/JSONArray;)Lcom/braze/events/FeatureFlagsUpdatedEvent;", "", "id", "", "Lcom/braze/models/FeatureFlag;", "(Ljava/lang/String;)Ljava/util/List;", "Lbo/app/h2;", "externalPublisher", "(Lbo/app/h2;)V", "", "e", "()J", "timestampLastRefresh", "Lbo/app/k5;", "serverConfigStorageProvider", "Lbo/app/k5;", Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, "()Lbo/app/k5;", "c", "()Ljava/util/List;", "getPublishableFeatureFlagList$annotations", "publishableFeatureFlagList", "Ljava/util/concurrent/atomic/AtomicInteger;", "numInProgressFeatureFlagRequests", "Ljava/util/concurrent/atomic/AtomicInteger;", "b", "()Ljava/util/concurrent/atomic/AtomicInteger;", "getNumInProgressFeatureFlagRequests$android_sdk_base_release$annotations", "Landroid/content/Context;", "context", "apiKey", "userId", "internalEventPublisher", "Lbo/app/z1;", "brazeManager", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lbo/app/h2;Lbo/app/k5;Lbo/app/z1;)V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes4.dex */
public final class g1 {
    public static final a g = new a(null);
    private final k5 a;
    private final z1 b;
    private List<FeatureFlag> c;
    private final SharedPreferences d;
    private final SharedPreferences e;
    private final AtomicInteger f;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087T¢\u0006\f\n\u0004\b\u0006\u0010\u0004\u0012\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lbo/app/g1$a;", "", "", "FEATURE_FLAGS_ELIGIBILITY_SHARED_PREFS", "Ljava/lang/String;", "FEATURE_FLAGS_STORAGE_SHARED_PREFS", "LAST_REFRESH_IN_SECONDS", "getLAST_REFRESH_IN_SECONDS$annotations", "()V", "<init>", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
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
            return "Did not find stored Feature Flags.";
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
            return "Failed to find stored Feature Flag keys.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class d extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Received null or blank serialized Feature Flag string for Feature Flag id " + this.b + " from shared preferences. Not parsing.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class e extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Encountered unexpected exception while parsing stored feature flags: ", this.b);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class f extends Lambda implements Function0<String> {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Not refreshing Feature Flags since another " + g1.this.getF().get() + " request is currently in-flight.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class g extends Lambda implements Function0<String> {
        final /* synthetic */ long c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(long j) {
            super(0);
            this.c = j;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Not enough time has passed since last Feature Flags refresh. Not refreshing Feature Flags. " + ((g1.this.e() - this.c) + g1.this.getA().h()) + " seconds remaining until next available flush.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class h extends Lambda implements Function0<String> {
        final /* synthetic */ FeatureFlag b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(FeatureFlag featureFlag) {
            super(0);
            this.b = featureFlag;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Error storing Feature Flag: " + this.b + '.';
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class i extends Lambda implements Function0<String> {
        public static final i b = new i();

        i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Added new Feature Flags to local storage.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class j extends Lambda implements Function0<String> {
        final /* synthetic */ long b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(long j) {
            super(0);
            this.b = j;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Updating last Feature Flags refresh time: ", Long.valueOf(this.b));
        }
    }

    public g1(Context context, String apiKey, String str, h2 internalEventPublisher, k5 serverConfigStorageProvider, z1 brazeManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(internalEventPublisher, "internalEventPublisher");
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        this.a = serverConfigStorageProvider;
        this.b = brazeManager;
        this.c = CollectionsKt.emptyList();
        SharedPreferences sharedPreferences = context.getSharedPreferences(Intrinsics.stringPlus("com.braze.managers.featureflags.eligibility", StringUtils.getCacheFileSuffix(context, str, apiKey)), 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…ontext.MODE_PRIVATE\n    )");
        this.d = sharedPreferences;
        SharedPreferences sharedPreferences2 = context.getSharedPreferences(Intrinsics.stringPlus("com.braze.managers.featureflags.storage", StringUtils.getCacheFileSuffix(context, str, apiKey)), 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences2, "context.getSharedPrefere…ontext.MODE_PRIVATE\n    )");
        this.e = sharedPreferences2;
        this.f = new AtomicInteger(0);
        f();
        internalEventPublisher.b(v4.class, new IEventSubscriber() { // from class: bo.app.g1$$ExternalSyntheticLambda0
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                g1.a(g1.this, (v4) obj);
            }
        });
        internalEventPublisher.b(u4.class, new IEventSubscriber() { // from class: bo.app.g1$$ExternalSyntheticLambda1
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                g1.a(g1.this, (u4) obj);
            }
        });
        internalEventPublisher.b(i1.class, new IEventSubscriber() { // from class: bo.app.g1$$ExternalSyntheticLambda2
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                g1.a(g1.this, (i1) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long e() {
        return this.d.getLong("last_refresh", 0L);
    }

    private final void f() {
        SharedPreferences sharedPreferences = this.e;
        ArrayList arrayList = new ArrayList();
        Map<String, ?> all = sharedPreferences.getAll();
        if (all == null || all.isEmpty()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, b.b, 3, (Object) null);
            this.c = CollectionsKt.emptyList();
            return;
        }
        Set<String> keySet = all.keySet();
        if (keySet.isEmpty()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, c.b, 2, (Object) null);
            this.c = CollectionsKt.emptyList();
            return;
        }
        for (String str : keySet) {
            String str2 = (String) all.get(str);
            if (str2 != null) {
                try {
                } catch (Exception e2) {
                    BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e2, new e(str2));
                }
                if (!StringsKt.isBlank(str2)) {
                    FeatureFlag a2 = k1.a.a(new JSONObject(str2));
                    if (a2 != null) {
                        arrayList.add(a2);
                    }
                }
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new d(str), 2, (Object) null);
        }
        this.c = arrayList;
    }

    private final void h() {
        long nowInSeconds = DateTimeUtils.nowInSeconds();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new j(nowInSeconds), 2, (Object) null);
        this.d.edit().putLong("last_refresh", nowInSeconds).apply();
    }

    /* renamed from: b, reason: from getter */
    public final AtomicInteger getF() {
        return this.f;
    }

    public final List<FeatureFlag> c() {
        List<FeatureFlag> list = this.c;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((FeatureFlag) it.next()).deepcopy$android_sdk_base_release());
        }
        return arrayList;
    }

    /* renamed from: d, reason: from getter */
    public final k5 getA() {
        return this.a;
    }

    public final void g() {
        if (this.f.get() > 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new f(), 3, (Object) null);
            return;
        }
        long nowInSeconds = DateTimeUtils.nowInSeconds();
        if (nowInSeconds - e() < this.a.h()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new g(nowInSeconds), 2, (Object) null);
        } else {
            a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(g1 this$0, v4 it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.getA() instanceof j1) {
            this$0.f.incrementAndGet();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(g1 this$0, u4 it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.getA() instanceof j1) {
            this$0.f.decrementAndGet();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(g1 this$0, i1 it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.h();
    }

    public final void a() {
        this.b.refreshFeatureFlags();
    }

    public final FeatureFlagsUpdatedEvent a(JSONArray featureFlagsData) {
        Intrinsics.checkNotNullParameter(featureFlagsData, "featureFlagsData");
        this.c = k1.a.a(featureFlagsData);
        SharedPreferences.Editor edit = this.e.edit();
        edit.clear();
        for (FeatureFlag featureFlag : this.c) {
            try {
                edit.putString(featureFlag.getId(), featureFlag.getKey().toString());
            } catch (Exception e2) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e2, new h(featureFlag));
            }
        }
        edit.apply();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, i.b, 3, (Object) null);
        return new FeatureFlagsUpdatedEvent(c());
    }

    public static /* synthetic */ List a(g1 g1Var, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        return g1Var.a(str);
    }

    public final List<FeatureFlag> a(String id) {
        Collection collection;
        if (id != null) {
            List<FeatureFlag> list = this.c;
            collection = new ArrayList();
            for (Object obj : list) {
                if (Intrinsics.areEqual(((FeatureFlag) obj).getId(), id)) {
                    collection.add(obj);
                }
            }
        } else {
            collection = this.c;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((FeatureFlag) it.next()).deepcopy$android_sdk_base_release());
        }
        return arrayList;
    }

    public final void a(h2 externalPublisher) {
        Intrinsics.checkNotNullParameter(externalPublisher, "externalPublisher");
        externalPublisher.a((h2) new FeatureFlagsUpdatedEvent(c()), (Class<h2>) FeatureFlagsUpdatedEvent.class);
    }
}
