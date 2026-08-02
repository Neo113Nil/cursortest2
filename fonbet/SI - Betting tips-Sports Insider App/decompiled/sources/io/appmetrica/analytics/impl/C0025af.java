package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.af, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0025af implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final C0408pf f13355a;

    public C0025af() {
        this(new C0408pf());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0333mf fromModel(@NonNull C0077cf c0077cf) {
        C0333mf c0333mf = new C0333mf();
        if (!TextUtils.isEmpty(c0077cf.f13522a)) {
            c0333mf.f14263a = c0077cf.f13522a;
        }
        c0333mf.f14264b = c0077cf.f13523b.toString();
        c0333mf.f14265c = this.f13355a.fromModel(c0077cf.f13524c).intValue();
        return c0333mf;
    }

    public C0025af(C0408pf c0408pf) {
        this.f13355a = c0408pf;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0077cf toModel(@NonNull C0333mf c0333mf) {
        JSONObject jSONObject;
        String str = c0333mf.f14263a;
        String str2 = c0333mf.f14264b;
        if (!TextUtils.isEmpty(str2)) {
            try {
                jSONObject = new JSONObject(str2);
            } catch (Throwable unused) {
            }
            return new C0077cf(str, jSONObject, this.f13355a.toModel(Integer.valueOf(c0333mf.f14265c)));
        }
        jSONObject = new JSONObject();
        return new C0077cf(str, jSONObject, this.f13355a.toModel(Integer.valueOf(c0333mf.f14265c)));
    }
}
