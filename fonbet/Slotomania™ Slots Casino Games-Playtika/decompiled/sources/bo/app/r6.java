package bo.app;

import com.braze.Constants;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import io.ktor.http.LinkHeader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b'\u0018\u00002\u00020\u0001:\u0001!B\u0011\b\u0014\u0012\u0006\u0010#\u001a\u00020\u0006¢\u0006\u0004\b$\u0010%J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016R\u0014\u0010\n\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\tR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0019\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\tR$\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006&"}, d2 = {"Lbo/app/r6;", "Lbo/app/y2;", "Lbo/app/t2;", "event", "", "b", "Lorg/json/JSONObject;", "e", "x", "()Z", "isWithinTimeWindow", "w", "isPastStartDate", "v", "isNotExpired", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Lbo/app/p2;", "scheduleConfig", "Lbo/app/p2;", "f", "()Lbo/app/p2;", "shouldPrefetchAssets", "Z", "m", "Lbo/app/o6;", "triggerMetadata", "Lbo/app/o6;", "i", "()Lbo/app/o6;", Constants.BRAZE_PUSH_CONTENT_KEY, "(Lbo/app/o6;)V", "json", "<init>", "(Lorg/json/JSONObject;)V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public abstract class r6 implements y2 {
    public static final a g = new a(null);
    private final String b;
    private final p2 c;
    private final boolean d;
    private o6 e;
    private final List<s2> f;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\t"}, d2 = {"Lbo/app/r6$a;", "", "", "ID", "Ljava/lang/String;", "PREFETCH", "TRIGGER_CONDITIONS", "<init>", "()V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class b extends Lambda implements Function0<String> {
        final /* synthetic */ t2 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(t2 t2Var) {
            super(0);
            this.c = t2Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Triggered action " + r6.this.getB() + " not eligible to be triggered by " + ((Object) this.c.d()) + " event. Current device time outside triggered action time window.";
        }
    }

    protected r6(JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        ArrayList arrayList = new ArrayList();
        this.f = arrayList;
        String string = json.getString("id");
        Intrinsics.checkNotNullExpressionValue(string, "json.getString(ID)");
        this.b = string;
        this.c = new b5(json);
        JSONArray triggers = json.getJSONArray("trigger_condition");
        if (triggers.length() > 0) {
            p6 p6Var = p6.a;
            Intrinsics.checkNotNullExpressionValue(triggers, "triggers");
            arrayList.addAll(p6Var.a(triggers));
        }
        this.d = json.optBoolean(LinkHeader.Rel.Prefetch, true);
    }

    private final boolean v() {
        return this.c.getC() == -1 || DateTimeUtils.nowInSeconds() < this.c.getC();
    }

    private final boolean w() {
        return this.c.getB() == -1 || DateTimeUtils.nowInSeconds() > this.c.getB();
    }

    private final boolean x() {
        return w() && v();
    }

    @Override // bo.app.y2
    public void a(o6 o6Var) {
        this.e = o6Var;
    }

    @Override // bo.app.y2
    public boolean b(t2 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!x()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new b(event), 3, (Object) null);
            return false;
        }
        Iterator<s2> it = this.f.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (it.next().a(event)) {
                break;
            }
            i++;
        }
        return i != -1;
    }

    public JSONObject e() {
        try {
            JSONObject key = this.c.getKey();
            if (key == null) {
                return null;
            }
            key.put("id", this.b);
            JSONArray jSONArray = new JSONArray();
            Iterator<T> it = this.f.iterator();
            while (it.hasNext()) {
                jSONArray.put(((s2) it.next()).getKey());
            }
            key.put("trigger_condition", jSONArray);
            key.put(LinkHeader.Rel.Prefetch, this.d);
            return key;
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // bo.app.y2
    /* renamed from: f, reason: from getter */
    public final p2 getC() {
        return this.c;
    }

    @Override // bo.app.y2
    /* renamed from: getId, reason: from getter */
    public final String getB() {
        return this.b;
    }

    @Override // bo.app.y2
    /* renamed from: i, reason: from getter */
    public o6 getE() {
        return this.e;
    }

    @Override // bo.app.y2
    /* renamed from: m, reason: from getter */
    public final boolean getD() {
        return this.d;
    }
}
