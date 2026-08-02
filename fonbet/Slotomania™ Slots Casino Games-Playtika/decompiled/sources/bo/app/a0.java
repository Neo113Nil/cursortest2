package bo.app;

import com.braze.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0011B\u0011\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016B\u0011\b\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0015\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001a"}, d2 = {"Lbo/app/a0;", "", "", "lastCardUpdatedAt", "J", "b", "()J", "lastFullSyncAt", "c", "", "isFullSync", "Z", Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, "()Z", "Lorg/json/JSONArray;", "contentCards", "Lorg/json/JSONArray;", Constants.BRAZE_PUSH_CONTENT_KEY, "()Lorg/json/JSONArray;", "Lorg/json/JSONObject;", "jsonObject", "<init>", "(Lorg/json/JSONObject;)V", "", "serializedCardJson", "(Ljava/lang/String;)V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public final class a0 {
    public static final a e = new a(null);
    private final long a;
    private final long b;
    private final boolean c;
    private final JSONArray d;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\n"}, d2 = {"Lbo/app/a0$a;", "", "", "CONTENT_CARDS_KEY", "Ljava/lang/String;", "IS_FULL_SYNC_KEY", "LAST_CARD_UPDATED_AT_KEY", "LAST_FULL_SYNC_AT_KEY", "<init>", "()V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public a0(JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        this.a = jsonObject.optLong("last_card_updated_at", -1L);
        this.b = jsonObject.optLong("last_full_sync_at", -1L);
        this.c = jsonObject.optBoolean("full_sync", false);
        this.d = jsonObject.optJSONArray("cards");
    }

    /* renamed from: a, reason: from getter */
    public final JSONArray getD() {
        return this.d;
    }

    /* renamed from: b, reason: from getter */
    public final long getA() {
        return this.a;
    }

    /* renamed from: c, reason: from getter */
    public final long getB() {
        return this.b;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getC() {
        return this.c;
    }

    public a0(String serializedCardJson) {
        Intrinsics.checkNotNullParameter(serializedCardJson, "serializedCardJson");
        this.c = false;
        this.a = -1L;
        this.b = -1L;
        this.d = new JSONArray().put(new JSONObject(serializedCardJson));
    }
}
