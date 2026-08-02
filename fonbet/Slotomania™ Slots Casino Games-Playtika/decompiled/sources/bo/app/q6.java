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
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0005B!\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0014\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0002J\u0016\u0010\u0005\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0007H\u0016J\u0018\u0010\u0005\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0004H\u0016¨\u0006\u0014"}, d2 = {"Lbo/app/q6;", "Lbo/app/x2;", "", "", "", Constants.BRAZE_PUSH_CONTENT_KEY, "", "Lbo/app/y2;", "triggeredActions", "", "triggeredAction", "", "b", "eventTimeInSeconds", "Landroid/content/Context;", "context", "userId", "apiKey", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public final class q6 implements x2 {
    public static final a c = new a(null);
    private final SharedPreferences a;
    private final Map<String, Long> b;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lbo/app/q6$a;", "", "", "RE_ELIGIBILITY_FILE_PREFIX", "Ljava/lang/String;", "<init>", "()V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class b extends Lambda implements Function0<String> {
        final /* synthetic */ y2 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(y2 y2Var) {
            super(0);
            this.b = y2Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Triggered action id " + this.b.getB() + " always eligible via configuration. Returning true for eligibility status";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class c extends Lambda implements Function0<String> {
        final /* synthetic */ y2 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(y2 y2Var) {
            super(0);
            this.b = y2Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Triggered action id " + this.b.getB() + " always eligible via never having been triggered. Returning true for eligibility status";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class d extends Lambda implements Function0<String> {
        final /* synthetic */ y2 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(y2 y2Var) {
            super(0);
            this.b = y2Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Triggered action id " + this.b.getB() + " no longer eligible due to having been triggered in the past and is only eligible once.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class e extends Lambda implements Function0<String> {
        final /* synthetic */ long b;
        final /* synthetic */ l2 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(long j, l2 l2Var) {
            super(0);
            this.b = j;
            this.c = l2Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Trigger action is re-eligible for display since " + (DateTimeUtils.nowInSeconds() - this.b) + " seconds have passed since the last time it was triggered (minimum interval: " + this.c.q() + ").";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class f extends Lambda implements Function0<String> {
        final /* synthetic */ long b;
        final /* synthetic */ l2 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(long j, l2 l2Var) {
            super(0);
            this.b = j;
            this.c = l2Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Trigger action is not re-eligible for display since only " + (DateTimeUtils.nowInSeconds() - this.b) + " seconds have passed since the last time it was triggered (minimum interval: " + this.c.q() + ").";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class g extends Lambda implements Function0<String> {
        final /* synthetic */ y2 b;
        final /* synthetic */ long c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(y2 y2Var, long j) {
            super(0);
            this.b = y2Var;
            this.c = j;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Updating re-eligibility for action Id " + this.b.getB() + " to time " + this.c + '.';
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class h extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Deleting outdated triggered action id " + this.b + " from stored re-eligibility list. In-memory re-eligibility list is unchanged.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class i extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Retaining triggered action " + this.b + " in re-eligibility list.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class j extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Retrieving triggered action id " + ((Object) this.b) + " eligibility information from local storage.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class k extends Lambda implements Function0<String> {
        public static final k b = new k();

        k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Encountered unexpected exception while parsing stored re-eligibility information.";
        }
    }

    public q6(Context context, String str, String apiKey) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        SharedPreferences sharedPreferences = context.getSharedPreferences(Intrinsics.stringPlus("com.appboy.storage.triggers.re_eligibility", StringUtils.getCacheFileSuffix(context, str, apiKey)), 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…ontext.MODE_PRIVATE\n    )");
        this.a = sharedPreferences;
        this.b = a();
    }

    @Override // bo.app.x2
    public void a(y2 triggeredAction, long eventTimeInSeconds) {
        Intrinsics.checkNotNullParameter(triggeredAction, "triggeredAction");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new g(triggeredAction, eventTimeInSeconds), 3, (Object) null);
        this.b.put(triggeredAction.getB(), Long.valueOf(eventTimeInSeconds));
        this.a.edit().putLong(triggeredAction.getB(), eventTimeInSeconds).apply();
    }

    @Override // bo.app.x2
    public boolean b(y2 triggeredAction) {
        Intrinsics.checkNotNullParameter(triggeredAction, "triggeredAction");
        l2 g2 = triggeredAction.getC().getG();
        if (g2.o()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new b(triggeredAction), 3, (Object) null);
            return true;
        }
        if (!this.b.containsKey(triggeredAction.getB())) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new c(triggeredAction), 3, (Object) null);
            return true;
        }
        if (g2.s()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new d(triggeredAction), 3, (Object) null);
            return false;
        }
        Long l = this.b.get(triggeredAction.getB());
        long longValue = l == null ? 0L : l.longValue();
        if (DateTimeUtils.nowInSeconds() + triggeredAction.getC().getE() >= (g2.q() == null ? 0 : r0.intValue()) + longValue) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new e(longValue, g2), 3, (Object) null);
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new f(longValue, g2), 3, (Object) null);
        return false;
    }

    private final Map<String, Long> a() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        try {
            for (String actionId : this.a.getAll().keySet()) {
                long j2 = this.a.getLong(actionId, 0L);
                try {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new j(actionId), 3, (Object) null);
                    Intrinsics.checkNotNullExpressionValue(actionId, "actionId");
                    concurrentHashMap.put(actionId, Long.valueOf(j2));
                } catch (Exception e2) {
                    e = e2;
                    BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e, k.b);
                    return concurrentHashMap;
                }
            }
        } catch (Exception e3) {
            e = e3;
        }
        return concurrentHashMap;
    }

    @Override // bo.app.w2
    public void a(List<? extends y2> triggeredActions) {
        Intrinsics.checkNotNullParameter(triggeredActions, "triggeredActions");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(triggeredActions, 10));
        Iterator<T> it = triggeredActions.iterator();
        while (it.hasNext()) {
            arrayList.add(((y2) it.next()).getB());
        }
        SharedPreferences.Editor edit = this.a.edit();
        for (String str : CollectionsKt.toSet(this.b.keySet())) {
            if (!arrayList.contains(str)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new h(str), 3, (Object) null);
                edit.remove(str);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new i(str), 3, (Object) null);
            }
        }
        edit.apply();
    }
}
