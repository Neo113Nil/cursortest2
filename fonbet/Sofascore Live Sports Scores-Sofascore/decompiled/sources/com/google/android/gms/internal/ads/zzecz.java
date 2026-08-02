package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.util.Base64;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.io.ByteArrayOutputStream;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzecz {
    public final Context a;
    public final ApplicationInfo b;
    public String e = "";
    public final int c = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Ia)).intValue();
    public final int d = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Ja)).intValue();

    public zzecz(Context context) {
        this.a = context;
        this.b = context.getApplicationInfo();
    }

    public final JSONObject a() {
        String str;
        String encodeToString;
        ApplicationInfo applicationInfo = this.b;
        Context context = this.a;
        JSONObject jSONObject = new JSONObject();
        try {
            String str2 = applicationInfo.packageName;
            zzgbp zzgbpVar = com.google.android.gms.ads.internal.util.zzs.zza;
            Context context2 = Wrappers.a(context).a;
            jSONObject.put("name", context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(str2, 0)));
        } catch (PackageManager.NameNotFoundException unused) {
        }
        jSONObject.put(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME, applicationInfo.packageName);
        com.google.android.gms.ads.internal.zzt.zzc();
        Drawable drawable = null;
        try {
            str = com.google.android.gms.ads.internal.util.zzs.zzr(context);
        } catch (RemoteException unused2) {
            str = null;
        }
        jSONObject.put("adMobAppId", str);
        boolean isEmpty = this.e.isEmpty();
        int i = this.d;
        int i2 = this.c;
        if (isEmpty) {
            try {
                PackageManagerWrapper a = Wrappers.a(context);
                String str3 = applicationInfo.packageName;
                Context context3 = a.a;
                ApplicationInfo applicationInfo2 = context3.getPackageManager().getApplicationInfo(str3, 0);
                context3.getPackageManager().getApplicationLabel(applicationInfo2);
                drawable = context3.getPackageManager().getApplicationIcon(applicationInfo2);
            } catch (PackageManager.NameNotFoundException unused3) {
            }
            if (drawable == null) {
                encodeToString = "";
            } else {
                drawable.setBounds(0, 0, i2, i);
                Bitmap createBitmap = Bitmap.createBitmap(i2, i, Bitmap.Config.ARGB_8888);
                drawable.draw(new Canvas(createBitmap));
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                createBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            }
            this.e = encodeToString;
        }
        if (!this.e.isEmpty()) {
            jSONObject.put("icon", this.e);
            jSONObject.put("iconWidthPx", i2);
            jSONObject.put("iconHeightPx", i);
        }
        return jSONObject;
    }
}
