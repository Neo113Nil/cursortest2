package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import defpackage.ng2;
import java.io.ByteArrayOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class zzcc implements Runnable {
    public final /* synthetic */ ng2 a;

    public /* synthetic */ zzcc(ng2 ng2Var) {
        this.a = ng2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JSONObject jSONObject = new JSONObject();
        ng2 ng2Var = this.a;
        Application application = (Application) ng2Var.a;
        try {
            jSONObject.put("app_name", application.getPackageManager().getApplicationLabel(application.getApplicationInfo()).toString());
            Drawable applicationIcon = application.getPackageManager().getApplicationIcon(application.getApplicationInfo());
            String str = null;
            if (applicationIcon != null && applicationIcon.getIntrinsicWidth() > 0 && applicationIcon.getIntrinsicHeight() > 0) {
                Bitmap createBitmap = Bitmap.createBitmap(applicationIcon.getIntrinsicWidth(), applicationIcon.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                applicationIcon.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                applicationIcon.draw(canvas);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                createBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                str = "data:image/png;base64,".concat(String.valueOf(Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2)));
            }
            jSONObject.put("app_icon", str);
            JSONObject jSONObject2 = new JSONObject();
            zzaq zzaqVar = (zzaq) ng2Var.h;
            for (String str2 : zzaqVar.a().keySet()) {
                jSONObject2.put(str2, zzaqVar.a().get(str2));
            }
            jSONObject.put("stored_infos_map", jSONObject2);
        } catch (JSONException unused) {
        }
        ((zzbe) ng2Var.g).h.a("UMP_configureFormWithAppAssets", jSONObject.toString());
    }
}
