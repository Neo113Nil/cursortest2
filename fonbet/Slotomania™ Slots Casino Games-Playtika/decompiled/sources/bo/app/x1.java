package bo.app;

import com.braze.Constants;
import com.braze.models.IPutIntoJson;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fR\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\u0011\u001a\u0004\u0018\u00010\n8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\f\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u00128&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u000f\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001dÀ\u0006\u0001"}, d2 = {"Lbo/app/x1;", "Lcom/braze/models/IPutIntoJson;", "Lorg/json/JSONObject;", "Lbo/app/e1;", "j", "()Lbo/app/e1;", "type", "k", "()Lorg/json/JSONObject;", "data", "", AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, "()Ljava/lang/String;", "uniqueIdentifier", "getUserId", Constants.BRAZE_PUSH_CONTENT_KEY, "(Ljava/lang/String;)V", "userId", "Lbo/app/o5;", "n", "()Lbo/app/o5;", "(Lbo/app/o5;)V", JsonStorageKeyNames.SESSION_ID_KEY, "", Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, "()Z", "isNonPersistable", "p", "serialization", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public interface x1 extends IPutIntoJson<JSONObject> {
    public static final a a = a.a;

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbo/app/x1$a;", "", "<init>", "()V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
    public static final class a {
        static final /* synthetic */ a a = new a();

        private a() {
        }
    }

    void a(o5 o5Var);

    void a(String str);

    boolean d();

    e1 j();

    JSONObject k();

    o5 n();

    default String p() {
        String jSONObject = getJsonObject().toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "forJsonPut().toString()");
        return jSONObject;
    }

    String r();
}
