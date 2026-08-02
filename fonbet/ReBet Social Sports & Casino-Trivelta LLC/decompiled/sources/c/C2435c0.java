package c;

import android.content.Context;
import android.util.Base64;
import com.facebook.react.uimanager.ViewProps;
import com.surt.guardian.utils.Logger;
import com.twilio.voice.EventGroupType;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* renamed from: c.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2435c0 {

    /* renamed from: b, reason: collision with root package name */
    public static final Dc.b f26520b = new Dc.b(null);

    /* renamed from: a, reason: collision with root package name */
    public final Context f26521a;

    public C2435c0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f26521a = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0062 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C2443g0 a(String jwt) {
        String str;
        List split$default;
        JSONObject optJSONObject;
        boolean areEqual;
        Intrinsics.checkNotNullParameter(jwt, "jwt");
        String str2 = null;
        if (jwt == null) {
            str = jwt;
        } else {
            try {
                str = jwt;
                try {
                    List split$default2 = StringsKt.split$default((CharSequence) str, new String[]{"."}, false, 0, 6, (Object) null);
                    if (split$default2.size() >= 2) {
                        byte[] decode = Base64.decode((String) split$default2.get(1), 11);
                        Intrinsics.checkNotNullExpressionValue(decode, "decode(...)");
                        JSONObject jSONObject = new JSONObject(new String(decode, Charsets.UTF_8));
                        String optString = jSONObject.optString("attestation_challenge", null);
                        str2 = optString == null ? jSONObject.optString("challenge", null) : optString;
                    }
                } catch (Exception e10) {
                    e = e10;
                    Logger.f41582a.b("PreflightClient", "Failed to extract challenge from JWT", e);
                    if (str != null) {
                    }
                    areEqual = false;
                    return new C2443g0(CollectionsKt.listOf((Object[]) new String[]{"hardware", "security", "integrity"}), str2, str, areEqual);
                }
            } catch (Exception e11) {
                e = e11;
                str = jwt;
            }
        }
        if (str != null) {
            try {
                split$default = StringsKt.split$default((CharSequence) str, new String[]{"."}, false, 0, 6, (Object) null);
            } catch (Exception unused) {
            }
            if (split$default.size() >= 2) {
                byte[] decode2 = Base64.decode((String) split$default.get(1), 11);
                Intrinsics.checkNotNullExpressionValue(decode2, "decode(...)");
                JSONObject optJSONObject2 = new JSONObject(new String(decode2, Charsets.UTF_8)).optJSONObject(EventGroupType.SETTINGS_GROUP);
                if (optJSONObject2 != null && (optJSONObject = optJSONObject2.optJSONObject("location")) != null) {
                    areEqual = Intrinsics.areEqual(optJSONObject.optString("gps_collection", "disabled"), ViewProps.ENABLED);
                    return new C2443g0(CollectionsKt.listOf((Object[]) new String[]{"hardware", "security", "integrity"}), str2, str, areEqual);
                }
            }
        }
        areEqual = false;
        return new C2443g0(CollectionsKt.listOf((Object[]) new String[]{"hardware", "security", "integrity"}), str2, str, areEqual);
    }
}
