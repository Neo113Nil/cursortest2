package kd;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.sports.insider.R;
import gf.u;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d extends c {

    /* renamed from: f, reason: collision with root package name */
    public static final u f19011f = new u("Push", "Notice", "General notice");

    /* renamed from: g, reason: collision with root package name */
    public static final u f19012g = new u("LivePush", "Live notice", "Live notice");

    /* renamed from: h, reason: collision with root package name */
    public static final u f19013h = new u("LiveInfoPush", "Live info notice", "Live info notice");

    /* renamed from: i, reason: collision with root package name */
    public static final u f19014i = new u("Push", "Notice", "General notice");
    public static final u j = new u("SupportPush", "Support notice", "Support notice");

    /* renamed from: k, reason: collision with root package name */
    public static final u f19015k = new u("Warning Push", "Warning notice", "Warning notice");

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f19016e;

    public /* synthetic */ d(int i5) {
        this.f19016e = i5;
    }

    public static String i(JSONObject jSONObject, String str, Context context) {
        try {
            String string = jSONObject.has("bodyNotify") ? jSONObject.getString("bodyNotify") : null;
            String string2 = jSONObject.has("body") ? jSONObject.getString("body") : null;
            if (string != null) {
                return string;
            }
            if (string2 != null) {
                return string2;
            }
            if (str != null) {
                return str;
            }
            String string3 = context.getResources().getString(R.string.read_prediction);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            return string3;
        } catch (Exception unused) {
            String string4 = context.getResources().getString(R.string.read_prediction);
            Intrinsics.checkNotNull(string4);
            return string4;
        }
    }

    public static String j(JSONObject jSONObject, String str, Context context) {
        try {
            String string = jSONObject.has("titleNotify") ? jSONObject.getString("titleNotify") : null;
            String string2 = jSONObject.has("title") ? jSONObject.getString("title") : null;
            if (string != null) {
                return string;
            }
            if (string2 != null) {
                return string2;
            }
            if (str != null) {
                return str;
            }
            String string3 = context.getResources().getString(R.string.app_name);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            return string3;
        } catch (Exception unused) {
            String string4 = context.getResources().getString(R.string.app_name);
            Intrinsics.checkNotNull(string4);
            return string4;
        }
    }

    public static int k(JSONObject jSONObject) {
        String optString = jSONObject.optString("message_id", "-1");
        Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
        Integer intOrNull = StringsKt.toIntOrNull(optString);
        if (intOrNull != null) {
            return intOrNull.intValue();
        }
        return -1;
    }

    @Override // kd.c
    public PendingIntent a(Intent intent, Context context) {
        switch (this.f19016e) {
            case 5:
                Intrinsics.checkNotNullParameter(intent, "intent");
                Intrinsics.checkNotNullParameter(context, "context");
                PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, Build.VERSION.SDK_INT >= 31 ? 1241513984 : 1207959552);
                Intrinsics.checkNotNullExpressionValue(broadcast, "getBroadcast(...)");
                return broadcast;
            default:
                return super.a(intent, context);
        }
    }

    @Override // kd.c
    public u b() {
        switch (this.f19016e) {
            case 0:
                return f19011f;
            case 1:
                return f19012g;
            case 2:
                return f19013h;
            case 3:
                return f19014i;
            case 4:
                return j;
            case 5:
                return f19015k;
            default:
                return super.b();
        }
    }

    @Override // kd.c
    public Object g(a aVar) {
        switch (this.f19016e) {
            case 2:
                return Boolean.TRUE;
            case 3:
            case 8:
            case 9:
            case 10:
            default:
                return super.g(aVar);
            case 4:
                return Boolean.TRUE;
            case 5:
                return Boolean.TRUE;
            case 6:
                return Boolean.TRUE;
            case 7:
                return Boolean.TRUE;
            case 11:
                return Boolean.TRUE;
            case 12:
                return Boolean.TRUE;
        }
    }
}
