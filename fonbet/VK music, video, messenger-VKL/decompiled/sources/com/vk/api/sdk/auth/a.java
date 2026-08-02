package com.vk.api.sdk.auth;

import com.vk.api.sdk.auth.UtilityTokens;
import com.vk.dto.common.id.UserId;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import org.json.JSONObject;
import ru.ok.android.sdk.SharedKt;
import xsna.drm0;
import xsna.e43;
import xsna.fkq0;
import xsna.gzs;
import xsna.n6j;
import xsna.pn00;
import xsna.s3q0;

/* compiled from: VKAccessToken.kt */
/* loaded from: classes15.dex */
public final class a {
    public static final List<String> k = e43.l(SharedKt.PARAM_ACCESS_TOKEN, SharedKt.PARAM_EXPIRES_IN, "user_id", "secret", "https_required", "created", "vk_access_token", "email", "phone", "phone_access_key", "utility_tokens");
    public final UserId a;
    public final String b;
    public final String c;
    public final long d;
    public final String e;
    public final String f;
    public final String g;
    public final int h;
    public final boolean i;
    public final UtilityTokens j;

    /* compiled from: VKAccessToken.kt */
    /* renamed from: com.vk.api.sdk.auth.a$a, reason: collision with other inner class name */
    public static final class C0375a {
        public static List a() {
            return a.k;
        }
    }

    public a(Map<String, String> map) {
        UserId userId;
        UtilityTokens utilityTokens;
        String str = map.get("user_id");
        if (str != null) {
            long parseLong = Long.parseLong(str);
            gzs<s3q0> gzsVar = fkq0.a;
            userId = new UserId(parseLong);
        } else {
            userId = null;
        }
        this.a = userId;
        this.b = map.get(SharedKt.PARAM_ACCESS_TOKEN);
        this.c = map.get("secret");
        this.i = "1".equals(map.get("https_required"));
        this.d = map.containsKey("created") ? Long.parseLong(map.get("created")) : System.currentTimeMillis();
        this.h = map.containsKey(SharedKt.PARAM_EXPIRES_IN) ? Integer.parseInt(map.get(SharedKt.PARAM_EXPIRES_IN)) : -1;
        this.e = map.containsKey("email") ? map.get("email") : null;
        this.f = map.containsKey("phone") ? map.get("phone") : null;
        this.g = map.containsKey("phone_access_key") ? map.get("phone_access_key") : null;
        String str2 = map.get("utility_tokens");
        if (str2 != null) {
            String str3 = drm0.N(str2) ? null : str2;
            if (str3 != null) {
                UtilityTokens.a aVar = UtilityTokens.CREATOR;
                JSONObject jSONObject = new JSONObject(str3);
                aVar.getClass();
                utilityTokens = UtilityTokens.a.a(jSONObject);
                this.j = utilityTokens;
            }
        }
        utilityTokens = new UtilityTokens(EmptyList.b);
        this.j = utilityTokens;
    }

    public final String a() {
        return this.b;
    }

    public final long b() {
        return this.d;
    }

    public final int c() {
        return this.h;
    }

    public final UserId d() {
        return this.a;
    }

    public final UtilityTokens e() {
        return this.j;
    }

    public final String toString() {
        long j = this.d;
        int i = this.h;
        boolean z = i <= 0 || ((long) (i * 1000)) + j > System.currentTimeMillis();
        StringBuilder sb = new StringBuilder("VKAccessToken(userId=");
        sb.append(this.a);
        sb.append(",createdMs=");
        sb.append(j);
        n6j.b(sb, ",email=", this.e, ",phone=", this.f);
        sb.append(",phoneAccessKey=");
        sb.append(this.g);
        sb.append(",expiresInSec=");
        sb.append(i);
        sb.append(",isValid=");
        sb.append(z);
        sb.append(",utilityTokens=");
        sb.append(this.j);
        sb.append(")");
        return sb.toString();
    }

    public a(int i, long j, UtilityTokens utilityTokens, UserId userId, String str, String str2) {
        this(pn00.k(new Pair("user_id", String.valueOf(userId.b)), new Pair(SharedKt.PARAM_ACCESS_TOKEN, str), new Pair("secret", str2), new Pair(SharedKt.PARAM_EXPIRES_IN, String.valueOf(i)), new Pair("created", String.valueOf(j)), new Pair("https_required", "1"), new Pair("utility_tokens", utilityTokens.d().toString())));
    }
}
