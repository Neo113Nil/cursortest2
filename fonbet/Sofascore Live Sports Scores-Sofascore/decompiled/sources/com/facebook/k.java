package com.facebook;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Parcelable;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class k {
    public static k e;
    public static volatile k g;
    public final LocalBroadcastManager a;
    public final Object b;
    public Parcelable c;
    public static final b d = new b(4);
    public static final b f = new b(7);

    public k(LocalBroadcastManager localBroadcastManager, c cVar, boolean z) {
        localBroadcastManager.getClass();
        this.a = localBroadcastManager;
        this.b = cVar;
    }

    public void a(Profile profile, boolean z) {
        Profile profile2 = (Profile) this.c;
        this.c = profile;
        if (z) {
            SharedPreferences sharedPreferences = ((c) this.b).a;
            if (profile != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", profile.a);
                    jSONObject.put("first_name", profile.b);
                    jSONObject.put("middle_name", profile.c);
                    jSONObject.put("last_name", profile.d);
                    jSONObject.put("name", profile.e);
                    Uri uri = profile.f;
                    if (uri != null) {
                        jSONObject.put("link_uri", uri.toString());
                    }
                    Uri uri2 = profile.g;
                    if (uri2 != null) {
                        jSONObject.put("picture_uri", uri2.toString());
                    }
                } catch (JSONException unused) {
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    sharedPreferences.edit().putString("com.facebook.ProfileManager.CachedProfile", jSONObject.toString()).apply();
                }
            } else {
                sharedPreferences.edit().remove("com.facebook.ProfileManager.CachedProfile").apply();
            }
        }
        if (profile2 == null ? profile == null : profile2.equals(profile)) {
            return;
        }
        Intent intent = new Intent("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_PROFILE", profile2);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_PROFILE", profile);
        this.a.sendBroadcast(intent);
    }

    public k(LocalBroadcastManager localBroadcastManager, c cVar) {
        localBroadcastManager.getClass();
        this.a = localBroadcastManager;
        this.b = cVar;
    }
}
