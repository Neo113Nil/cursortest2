package com.vk.auth.oauth.passkey;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.api.sdk.ui.VKBaseAuthActivity;
import com.vk.auth.oauth.passkey.VkPasskeyWebOAuthResult;
import com.vk.dto.common.id.UserId;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.brm0;
import xsna.dhr0;
import xsna.e370;
import xsna.e43;
import xsna.epx;
import xsna.f370;
import xsna.fkq0;
import xsna.gfx0;
import xsna.gzs;
import xsna.rex0;
import xsna.s3q0;

/* compiled from: VkPasskeyWebAuthActivity.kt */
/* loaded from: classes15.dex */
public final class VkPasskeyWebAuthActivity extends VKBaseAuthActivity {
    public static final /* synthetic */ int e = 0;
    public PasskeyWebAuthActivityData d;

    @Override // com.vk.api.sdk.ui.VKBaseAuthActivity
    public final Intent a(Uri uri) {
        Parcelable parcelable;
        String str;
        UserId userId;
        String str2;
        String optString;
        PasskeyWebAuthActivityData passkeyWebAuthActivityData = this.d;
        if (passkeyWebAuthActivityData == null || uri == null) {
            parcelable = VkPasskeyWebOAuthResult.Invalid.b;
        } else {
            String queryParameter = uri.getQueryParameter("status");
            if (queryParameter != null) {
                parcelable = new VkPasskeyWebOAuthResult.Redirect(queryParameter, passkeyWebAuthActivityData.b, passkeyWebAuthActivityData.c);
            } else {
                String queryParameter2 = uri.getQueryParameter("payload");
                if (queryParameter2 != null) {
                    try {
                        JSONObject jSONObject = new JSONObject(queryParameter2);
                        String optString2 = jSONObject.optString("uuid");
                        long optLong = jSONObject.optLong("ttl", 0L);
                        String optString3 = jSONObject.optString("token");
                        JSONObject optJSONObject = jSONObject.optJSONObject("user");
                        JSONObject optJSONObject2 = jSONObject.optJSONObject("oauth");
                        String str3 = "";
                        if (optJSONObject2 == null || (str = optJSONObject2.optString("code")) == null) {
                            str = "";
                        }
                        long millis = optLong > 0 ? TimeUnit.SECONDS.toMillis(optLong) + System.currentTimeMillis() : -1L;
                        String A = f370.A("super_app_token", jSONObject);
                        if (epx.f(optString2, passkeyWebAuthActivityData.d)) {
                            if (optJSONObject != null) {
                                long optLong2 = optJSONObject.optLong("id");
                                gzs<s3q0> gzsVar = fkq0.a;
                                userId = new UserId(optLong2);
                            } else {
                                userId = UserId.d;
                            }
                            if (optJSONObject == null || (str2 = optJSONObject.optString("first_name")) == null) {
                                str2 = "";
                            }
                            if (optJSONObject != null && (optString = optJSONObject.optString("last_name")) != null) {
                                str3 = optString;
                            }
                            parcelable = new VkPasskeyWebOAuthResult.Success(optString3, optString2, millis, userId, str2, str3, optJSONObject != null ? optJSONObject.optString("avatar") : null, optJSONObject != null ? optJSONObject.optString("phone") : null, optJSONObject2 != null ? new VkPasskeyWebOAuthResult.Success.OAuth(str) : null, A);
                        } else {
                            parcelable = new VkPasskeyWebOAuthResult.Fail("invalid_uuid");
                        }
                    } catch (JSONException unused) {
                        parcelable = VkPasskeyWebOAuthResult.Invalid.b;
                    }
                } else {
                    parcelable = VkPasskeyWebOAuthResult.Invalid.b;
                }
            }
        }
        parcelable.getClass();
        Intent intent = new Intent();
        intent.putExtra("KEY_PASSKEY_OAUTH_RESULT", parcelable);
        return intent;
    }

    @Override // com.vk.api.sdk.ui.VKBaseAuthActivity
    public final boolean b(Uri uri) {
        PasskeyWebAuthActivityData passkeyWebAuthActivityData;
        String path;
        Object parcelableExtra;
        if (Build.VERSION.SDK_INT >= 33) {
            Intent intent = getIntent();
            if (intent != null) {
                parcelableExtra = intent.getParcelableExtra("KEY_PASSKEY_AUTH_ACTIVITY_DATA", PasskeyWebAuthActivityData.class);
                passkeyWebAuthActivityData = (PasskeyWebAuthActivityData) parcelableExtra;
            }
            passkeyWebAuthActivityData = null;
        } else {
            Intent intent2 = getIntent();
            if (intent2 != null) {
                passkeyWebAuthActivityData = (PasskeyWebAuthActivityData) intent2.getParcelableExtra("KEY_PASSKEY_AUTH_ACTIVITY_DATA");
            }
            passkeyWebAuthActivityData = null;
        }
        this.d = passkeyWebAuthActivityData;
        String host = uri.getHost();
        if (host != null && host.equals("id.vk.ru") && (path = uri.getPath()) != null && brm0.B(path, "/auth", false)) {
            List l = e43.l("app_id", CommonConstant.ReqAccessTokenParam.RESPONSE_TYPE, "uuid", "redirect_uri");
            if (!(l instanceof Collection) || !l.isEmpty()) {
                Iterator it = l.iterator();
                while (it.hasNext()) {
                    if (uri.getQueryParameter((String) it.next()) != null) {
                    }
                }
            }
            rex0 rex0Var = e370.j;
            (rex0Var != null ? rex0Var : null).b(this, uri);
            return true;
        }
        finish();
        return false;
    }

    @Override // com.vk.api.sdk.ui.VKBaseAuthActivity
    public final boolean c() {
        gfx0 gfx0Var = e370.b;
        if (gfx0Var == null) {
            gfx0Var = null;
        }
        gfx0Var.getClass();
        return dhr0.M();
    }

    @Override // com.vk.api.sdk.ui.VKBaseAuthActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        PasskeyWebAuthActivityData passkeyWebAuthActivityData;
        Object parcelable;
        if (Build.VERSION.SDK_INT >= 33) {
            if (bundle != null) {
                parcelable = bundle.getParcelable("KEY_PASSKEY_AUTH_ACTIVITY_DATA", PasskeyWebAuthActivityData.class);
                passkeyWebAuthActivityData = (PasskeyWebAuthActivityData) parcelable;
            }
            passkeyWebAuthActivityData = null;
        } else {
            if (bundle != null) {
                passkeyWebAuthActivityData = (PasskeyWebAuthActivityData) bundle.getParcelable("KEY_PASSKEY_AUTH_ACTIVITY_DATA");
            }
            passkeyWebAuthActivityData = null;
        }
        this.d = passkeyWebAuthActivityData;
        super.onCreate(bundle);
        if (bundle == null) {
            Intent intent = getIntent();
            if ((intent != null ? intent.getData() : null) == null) {
                finish();
            }
        }
    }

    @Override // com.vk.api.sdk.ui.VKBaseAuthActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("KEY_PASSKEY_AUTH_ACTIVITY_DATA", this.d);
    }
}
