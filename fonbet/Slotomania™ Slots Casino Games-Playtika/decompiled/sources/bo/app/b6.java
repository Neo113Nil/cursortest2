package bo.app;

import android.content.Context;
import androidx.exifinterface.media.ExifInterface;
import com.braze.Constants;
import com.braze.models.inappmessage.InAppMessageBase;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001eB\u0019\b\u0016\u0012\u0006\u0010!\u001a\u00020\u0011\u0012\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J(\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016R$\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00138\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R$\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0010\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006&"}, d2 = {"Lbo/app/b6;", "Lbo/app/t6;", "Lbo/app/y2;", "Lorg/json/JSONArray;", "remoteAssetUrls", "Lbo/app/s4;", "pathType", "", Constants.BRAZE_PUSH_CONTENT_KEY, "Landroid/content/Context;", "context", "Lbo/app/h2;", "internalEventPublisher", "Lbo/app/t2;", "triggerEvent", "", "triggeredActionDisplayExpirationTimestamp", "Lorg/json/JSONObject;", "e", "", "<set-?>", "triggerId", "Ljava/lang/String;", "z", "()Ljava/lang/String;", "J", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "()J", "", "Lbo/app/r4;", "b", "()Ljava/util/List;", "remoteAssetPaths", "json", "Lbo/app/z1;", "brazeManager", "<init>", "(Lorg/json/JSONObject;Lbo/app/z1;)V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class b6 extends t6 {
    public static final b m = new b(null);
    private z1 i;
    private String j;
    private final List<r4> k;
    private long l;

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
            return Intrinsics.stringPlus("Parsing templated triggered action with JSON: ", JsonUtils.getPrettyPrintedString(this.b));
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\u000b"}, d2 = {"Lbo/app/b6$b;", "", "", "PREFETCH_FILE_URLS", "Ljava/lang/String;", "PREFETCH_IMAGE_URLS", "PREFETCH_ZIP_URLS", "TEMPLATED_INAPP_TYPE", "TRIGGER_ID", "<init>", "()V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[s4.values().length];
            iArr[s4.IMAGE.ordinal()] = 1;
            iArr[s4.ZIP.ordinal()] = 2;
            iArr[s4.FILE.ordinal()] = 3;
            a = iArr;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "", "it", "", Constants.BRAZE_PUSH_CONTENT_KEY, "(I)Ljava/lang/Boolean;", "com/braze/support/JsonUtils$e"}, k = 3, mv = {1, 6, 0})
    public static final class d extends Lambda implements Function1<Integer, Boolean> {
        final /* synthetic */ JSONArray b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(JSONArray jSONArray) {
            super(1);
            this.b = jSONArray;
        }

        public final Boolean a(int i) {
            return Boolean.valueOf(this.b.opt(i) instanceof String);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0003\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"T", "", "it", Constants.BRAZE_PUSH_CONTENT_KEY, "(I)Ljava/lang/Object;", "com/braze/support/JsonUtils$f"}, k = 3, mv = {1, 6, 0})
    public static final class e extends Lambda implements Function1<Integer, String> {
        final /* synthetic */ JSONArray b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(JSONArray jSONArray) {
            super(1);
            this.b = jSONArray;
        }

        public final String a(int i) {
            Object obj = this.b.get(i);
            if (obj != null) {
                return (String) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }

        /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.lang.String] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ String invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class f extends Lambda implements Function0<String> {
        public static final f b = new f();

        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Could not convert TemplatedTriggeredAction to JSON";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class g extends Lambda implements Function0<String> {
        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Posting templating request after delay of " + b6.this.getC().getE() + " seconds.";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b6(JSONObject json, z1 brazeManager) {
        super(json);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        this.k = new ArrayList();
        this.l = -1L;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new a(json), 3, (Object) null);
        this.i = brazeManager;
        JSONObject jSONObject = json.getJSONObject("data");
        String string = jSONObject.getString(InAppMessageBase.TRIGGER_ID);
        Intrinsics.checkNotNullExpressionValue(string, "dataObject.getString(TRIGGER_ID)");
        this.j = string;
        JSONArray optJSONArray = jSONObject.optJSONArray("prefetch_image_urls");
        if (optJSONArray != null) {
            a(optJSONArray, s4.IMAGE);
        }
        JSONArray optJSONArray2 = jSONObject.optJSONArray("prefetch_zip_urls");
        if (optJSONArray2 != null) {
            a(optJSONArray2, s4.ZIP);
        }
        JSONArray optJSONArray3 = jSONObject.optJSONArray("prefetch_file_urls");
        if (optJSONArray3 == null) {
            return;
        }
        a(optJSONArray3, s4.FILE);
    }

    /* renamed from: A, reason: from getter */
    public final long getL() {
        return this.l;
    }

    @Override // bo.app.y2
    public void a(Context context, h2 internalEventPublisher, t2 triggerEvent, long triggeredActionDisplayExpirationTimestamp) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(internalEventPublisher, "internalEventPublisher");
        Intrinsics.checkNotNullParameter(triggerEvent, "triggerEvent");
        this.l = triggeredActionDisplayExpirationTimestamp;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new g(), 3, (Object) null);
        this.i.a(this, triggerEvent);
    }

    @Override // bo.app.y2
    public List<r4> b() {
        return new ArrayList(this.k);
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public JSONObject getJsonKey() {
        try {
            JSONObject jsonKey = super.getJsonKey();
            if (jsonKey == null) {
                return null;
            }
            jsonKey.put("type", "templated_iam");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(InAppMessageBase.TRIGGER_ID, this.j);
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = new JSONArray();
            JSONArray jSONArray3 = new JSONArray();
            for (r4 r4Var : this.k) {
                int i = c.a[r4Var.getA().ordinal()];
                if (i == 1) {
                    jSONArray.put(r4Var.getB());
                } else if (i == 2) {
                    jSONArray2.put(r4Var.getB());
                } else if (i == 3) {
                    jSONArray3.put(r4Var.getB());
                }
            }
            jSONObject.put("prefetch_image_urls", jSONArray);
            jSONObject.put("prefetch_zip_urls", jSONArray2);
            jSONObject.put("prefetch_file_urls", jSONArray3);
            jsonKey.put("data", jSONObject);
            return jsonKey;
        } catch (JSONException e2) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e2, f.b);
            return null;
        }
    }

    /* renamed from: z, reason: from getter */
    public final String getJ() {
        return this.j;
    }

    private final void a(JSONArray remoteAssetUrls, s4 pathType) {
        Iterator it;
        if (remoteAssetUrls == null) {
            it = CollectionsKt.emptyList().iterator();
        } else {
            it = SequencesKt.map(SequencesKt.filter(CollectionsKt.asSequence(RangesKt.until(0, remoteAssetUrls.length())), new d(remoteAssetUrls)), new e(remoteAssetUrls)).iterator();
        }
        while (it.hasNext()) {
            this.k.add(new r4(pathType, (String) it.next()));
        }
    }
}
