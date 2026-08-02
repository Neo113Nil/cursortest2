package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.networktasks.internal.NetworkResponseHandler;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Rl implements NetworkResponseHandler {

    /* renamed from: a, reason: collision with root package name */
    public final Yl f12828a;

    /* renamed from: b, reason: collision with root package name */
    public final V2 f12829b;

    public Rl() {
        this(new Yl(), new V2());
    }

    @Override // io.appmetrica.analytics.networktasks.internal.NetworkResponseHandler
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0110dm handle(@NonNull ResponseDataHolder responseDataHolder) {
        String str;
        String str2;
        if (200 == responseDataHolder.getResponseCode()) {
            byte[] responseData = responseDataHolder.getResponseData();
            Map<String, List<String>> responseHeaders = responseDataHolder.getResponseHeaders();
            List list = responseHeaders != null ? (List) CollectionUtils.getFromMapIgnoreCase(responseHeaders, "Content-Encoding") : null;
            if (!lo.a((Collection) list) && "encrypted".equals(list.get(0))) {
                responseData = this.f12829b.a(responseDataHolder.getResponseData());
            }
            if (responseData != null) {
                Yl yl = this.f12828a;
                yl.getClass();
                C0110dm c0110dm = new C0110dm();
                try {
                    yl.f13246h.getClass();
                    C0150fb c0150fb = new C0150fb(new String(responseData, "UTF-8"));
                    JSONObject optJSONObject = c0150fb.optJSONObject("device_id");
                    if (optJSONObject != null) {
                        str = optJSONObject.optString("hash");
                        str2 = optJSONObject.optString("value");
                    } else {
                        str = "";
                        str2 = "";
                    }
                    c0110dm.f13606h = str2;
                    c0110dm.f13607i = str;
                    yl.a(c0110dm, c0150fb);
                    c0110dm.f13599a = TextUtils.isEmpty(c0110dm.f13607i) ? 1 : 2;
                } catch (Throwable unused) {
                    c0110dm = new C0110dm();
                    c0110dm.f13599a = 1;
                }
                if (2 == c0110dm.f13599a) {
                    return c0110dm;
                }
            }
        }
        return null;
    }

    public Rl(Yl yl, V2 v22) {
        this.f12828a = yl;
        this.f12829b = v22;
    }
}
