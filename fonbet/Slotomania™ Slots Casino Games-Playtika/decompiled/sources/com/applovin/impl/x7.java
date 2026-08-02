package com.applovin.impl;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import android.widget.ImageView;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class x7 implements s4 {
    public final Set a = new HashSet();
    public final Set b = new HashSet();
    private Uri c;
    private Uri d;
    private int e;
    private int f;

    public static x7 a(q8 q8Var, com.applovin.impl.sdk.l lVar) {
        if (q8Var == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (lVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        q8 c = q8Var.c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.D);
        if (c == null || !URLUtil.isValidUrl(c.d())) {
            lVar.Q();
            if (!com.applovin.impl.sdk.p.a()) {
                return null;
            }
            lVar.Q().b("VastIndustryIcon", "Unable to create industry icon.  No valid image URL found.");
            return null;
        }
        x7 x7Var = new x7();
        x7Var.c = Uri.parse(c.d());
        q8 b = q8Var.b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.H);
        if (b != null && URLUtil.isValidUrl(b.d())) {
            x7Var.d = Uri.parse(b.d());
        }
        String str = (String) q8Var.a().get("width");
        int i = 0;
        int parseInt = (str == null || Integer.parseInt(str) <= 0) ? 0 : Integer.parseInt(str);
        String str2 = (String) q8Var.a().get("height");
        if (str2 != null && Integer.parseInt(str2) > 0) {
            i = Integer.parseInt(str2);
        }
        int intValue = ((Integer) lVar.a(z4.b5)).intValue();
        if (parseInt <= 0 || i <= 0) {
            x7Var.f = intValue;
            x7Var.e = intValue;
            return x7Var;
        }
        double d = parseInt / i;
        int min = Math.min(Math.max(parseInt, i), intValue);
        if (parseInt >= i) {
            x7Var.e = min;
            x7Var.f = (int) (min / d);
            return x7Var;
        }
        x7Var.f = min;
        x7Var.e = (int) (min * d);
        return x7Var;
    }

    public Set b() {
        return this.a;
    }

    public Uri c() {
        return this.d;
    }

    public int d() {
        return this.f;
    }

    public Uri e() {
        return this.c;
    }

    public Set f() {
        return this.b;
    }

    public int g() {
        return this.e;
    }

    public String toString() {
        return "VastIndustryIcon{imageUri='" + e() + "', clickUri='" + c() + "', width=" + g() + ", height=" + d() + "}";
    }

    public static ImageView a(Uri uri, Context context, com.applovin.impl.sdk.l lVar) {
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setClickable(true);
        imageView.setVisibility(8);
        ImageViewUtils.setImageUri(imageView, uri, lVar);
        return imageView;
    }

    public static x7 a(JSONObject jSONObject, com.applovin.impl.sdk.l lVar) {
        b8 a;
        b8 a2;
        if (jSONObject == null) {
            return null;
        }
        x7 x7Var = new x7();
        String string = JsonUtils.getString(jSONObject, "image_uri", null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        x7Var.c = Uri.parse(string);
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "click_trackers", new JSONArray());
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null);
            if (jSONObject2 != null && (a2 = b8.a(jSONObject2, lVar)) != null) {
                x7Var.a.add(a2);
            }
        }
        JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "view_trackers", new JSONArray());
        for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONArray2, i2, (JSONObject) null);
            if (jSONObject3 != null && (a = b8.a(jSONObject3, lVar)) != null) {
                x7Var.b.add(a);
            }
        }
        String string2 = JsonUtils.getString(jSONObject, "click_uri", null);
        x7Var.d = StringUtils.isValidString(string2) ? Uri.parse(string2) : null;
        x7Var.e = JsonUtils.getInt(jSONObject, "width", 0);
        x7Var.f = JsonUtils.getInt(jSONObject, "height", 0);
        return x7Var;
    }

    @Override // com.applovin.impl.s4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            jSONArray.put(((b8) it.next()).a());
        }
        JsonUtils.putJsonArray(jSONObject, "click_trackers", jSONArray);
        JSONArray jSONArray2 = new JSONArray();
        Iterator it2 = this.b.iterator();
        while (it2.hasNext()) {
            jSONArray.put(((b8) it2.next()).a());
        }
        JsonUtils.putJsonArray(jSONObject, "view_trackers", jSONArray2);
        Uri uri = this.c;
        JsonUtils.putString(jSONObject, "image_uri", uri == null ? null : uri.toString());
        Uri uri2 = this.d;
        JsonUtils.putString(jSONObject, "click_uri", uri2 != null ? uri2.toString() : null);
        JsonUtils.putInt(jSONObject, "width", this.e);
        JsonUtils.putInt(jSONObject, "height", this.f);
        return jSONObject;
    }
}
