package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.rf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0457rf implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final C0408pf f14556a = new C0408pf();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0308lf fromModel(@NonNull C0433qf c0433qf) {
        C0308lf c0308lf = new C0308lf();
        if (!TextUtils.isEmpty(c0433qf.f14513a)) {
            c0308lf.f14198a = c0433qf.f14513a;
        }
        c0308lf.f14199b = c0433qf.f14514b.toString();
        c0308lf.f14200c = c0433qf.f14515c;
        c0308lf.f14201d = c0433qf.f14516d;
        c0308lf.f14202e = this.f14556a.fromModel(c0433qf.f14517e).intValue();
        return c0308lf;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0433qf toModel(@NonNull C0308lf c0308lf) {
        JSONObject jSONObject;
        String str = c0308lf.f14198a;
        String str2 = c0308lf.f14199b;
        if (!TextUtils.isEmpty(str2)) {
            try {
                jSONObject = new JSONObject(str2);
            } catch (Throwable unused) {
            }
            return new C0433qf(str, jSONObject, c0308lf.f14200c, c0308lf.f14201d, this.f14556a.toModel(Integer.valueOf(c0308lf.f14202e)));
        }
        jSONObject = new JSONObject();
        return new C0433qf(str, jSONObject, c0308lf.f14200c, c0308lf.f14201d, this.f14556a.toModel(Integer.valueOf(c0308lf.f14202e)));
    }
}
