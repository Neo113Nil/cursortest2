package bo.app;

import android.content.Context;
import com.braze.Constants;
import com.braze.enums.inappmessage.MessageType;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0018B\u0019\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\f\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\fH\u0017R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0019"}, d2 = {"Lbo/app/f3;", "Lbo/app/t6;", "Landroid/content/Context;", "context", "Lbo/app/h2;", "internalEventPublisher", "Lbo/app/t2;", "triggerEvent", "", "triggeredActionDisplayExpirationTimestamp", "", Constants.BRAZE_PUSH_CONTENT_KEY, "Lorg/json/JSONObject;", "e", "", "Lbo/app/r4;", "b", "()Ljava/util/List;", "remoteAssetPaths", "json", "Lbo/app/z1;", "brazeManager", "<init>", "(Lorg/json/JSONObject;Lbo/app/z1;)V", "c", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public final class f3 extends t6 {
    public static final c l = new c(null);
    private final IInAppMessage i;
    private final JSONObject j;
    private final z1 k;

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class a extends Lambda implements Function0<String> {
        final /* synthetic */ JSONObject b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(JSONObject jSONObject) {
            super(0);
            this.b = jSONObject;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Attempting to parse in-app message triggered action with JSON: ", JsonUtils.getPrettyPrintedString(this.b));
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
            return "Failed to parse in-app message triggered action.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lbo/app/f3$c;", "", "", "INAPP_TYPE", "Ljava/lang/String;", "<init>", "()V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class d {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[MessageType.values().length];
            iArr[MessageType.HTML_FULL.ordinal()] = 1;
            iArr[MessageType.FULL.ordinal()] = 2;
            iArr[MessageType.MODAL.ordinal()] = 3;
            iArr[MessageType.SLIDEUP.ordinal()] = 4;
            iArr[MessageType.HTML.ordinal()] = 5;
            a = iArr;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class e extends Lambda implements Function0<String> {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Attempting to publish in-app message after delay of " + f3.this.getC().getE() + " seconds.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class f extends Lambda implements Function0<String> {
        final /* synthetic */ t2 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(t2 t2Var) {
            super(0);
            this.b = t2Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Cannot perform triggered action for " + this.b + " due to in-app message json being null";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class g extends Lambda implements Function0<String> {
        final /* synthetic */ t2 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(t2 t2Var) {
            super(0);
            this.b = t2Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Cannot perform triggered action for " + this.b + " due to deserialized in-app message being null";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class h extends Lambda implements Function0<String> {
        public static final h b = new h();

        h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Caught exception while performing triggered action.";
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
            return "In-app message has no remote assets for prefetch. Returning empty list.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class j extends Lambda implements Function0<String> {
        j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            IInAppMessage iInAppMessage = f3.this.i;
            return Intrinsics.stringPlus("Failed to return remote paths to assets for type: ", iInAppMessage == null ? null : iInAppMessage.getMessageType());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(JSONObject json, z1 brazeManager) {
        super(json);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, this, BrazeLogger.Priority.V, (Throwable) null, new a(json), 2, (Object) null);
        JSONObject inAppMessageObject = json.getJSONObject("data");
        this.k = brazeManager;
        this.j = inAppMessageObject;
        Intrinsics.checkNotNullExpressionValue(inAppMessageObject, "inAppMessageObject");
        IInAppMessage a2 = c3.a(inAppMessageObject, brazeManager);
        this.i = a2;
        if (a2 != null) {
            return;
        }
        BrazeLogger.brazelog$default(brazeLogger, this, BrazeLogger.Priority.W, (Throwable) null, b.b, 2, (Object) null);
        throw new IllegalArgumentException(Intrinsics.stringPlus("Failed to parse in-app message triggered action with JSON: ", JsonUtils.getPrettyPrintedString(json)));
    }

    @Override // bo.app.y2
    public List<r4> b() {
        ArrayList arrayList = new ArrayList();
        IInAppMessage iInAppMessage = this.i;
        List<String> remoteAssetPathsForPrefetch = iInAppMessage == null ? null : iInAppMessage.getRemoteAssetPathsForPrefetch();
        if (remoteAssetPathsForPrefetch == null || remoteAssetPathsForPrefetch.isEmpty()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, i.b, 3, (Object) null);
            return arrayList;
        }
        IInAppMessage iInAppMessage2 = this.i;
        MessageType messageType = iInAppMessage2 != null ? iInAppMessage2.getMessageType() : null;
        int i2 = messageType == null ? -1 : d.a[messageType.ordinal()];
        if (i2 == 1) {
            arrayList.add(new r4(s4.ZIP, remoteAssetPathsForPrefetch.get(0)));
            return arrayList;
        }
        if (i2 == 2 || i2 == 3 || i2 == 4) {
            arrayList.add(new r4(s4.IMAGE, remoteAssetPathsForPrefetch.get(0)));
            return arrayList;
        }
        if (i2 != 5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new j(), 2, (Object) null);
            return arrayList;
        }
        Iterator<String> it = remoteAssetPathsForPrefetch.iterator();
        while (it.hasNext()) {
            arrayList.add(new r4(s4.FILE, it.next()));
        }
        return arrayList;
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public JSONObject getKey() {
        JSONObject key;
        try {
            key = super.getKey();
        } catch (JSONException unused) {
        }
        if (key == null) {
            return null;
        }
        IInAppMessage iInAppMessage = this.i;
        key.put("data", iInAppMessage == null ? null : iInAppMessage.getKey());
        key.put("type", "inapp");
        return key;
    }

    @Override // bo.app.y2
    public void a(Context context, h2 internalEventPublisher, t2 triggerEvent, long triggeredActionDisplayExpirationTimestamp) {
        BrazeLogger brazeLogger;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(internalEventPublisher, "internalEventPublisher");
        Intrinsics.checkNotNullParameter(triggerEvent, "triggerEvent");
        try {
            brazeLogger = BrazeLogger.INSTANCE;
        } catch (Exception e2) {
            e = e2;
        }
        try {
            BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new e(), 3, (Object) null);
            JSONObject jSONObject = this.j;
            if (jSONObject == null) {
                BrazeLogger.brazelog$default(brazeLogger, this, BrazeLogger.Priority.W, (Throwable) null, new f(triggerEvent), 2, (Object) null);
                return;
            }
            IInAppMessage a2 = c3.a(jSONObject, this.k);
            if (a2 == null) {
                BrazeLogger.brazelog$default(brazeLogger, this, BrazeLogger.Priority.W, (Throwable) null, new g(triggerEvent), 2, (Object) null);
                return;
            }
            a2.setLocalPrefetchedAssetPaths(y());
            a2.setExpirationTimestamp(triggeredActionDisplayExpirationTimestamp);
            internalEventPublisher.a((h2) new d3(triggerEvent, this, a2, this.k.a()), (Class<h2>) d3.class);
        } catch (Exception e3) {
            e = e3;
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e, h.b);
        }
    }
}
