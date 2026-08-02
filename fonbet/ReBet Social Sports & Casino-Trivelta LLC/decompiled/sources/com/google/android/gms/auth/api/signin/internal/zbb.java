package com.google.android.gms.auth.api.signin.internal;

import G9.a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.C3161w;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.internal.p000authapi.zbbc;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* loaded from: classes2.dex */
public final class zbb implements Runnable {
    private static final a zba = new a("RevokeAccessOperation", new String[0]);
    private final String zbb;
    private final C3161w zbc = new C3161w(null);

    public zbb(String str) {
        this.zbb = AbstractC3191o.g(str);
    }

    public static h zba(String str) {
        if (str == null) {
            return i.a(new Status(4), null);
        }
        zbb zbbVar = new zbb(str);
        new Thread(zbbVar).start();
        return zbbVar.zbc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Status status = Status.f32277h;
        try {
            String str = this.zbb;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 50);
            sb2.append("https://accounts.google.com/o/oauth2/revoke?token=");
            sb2.append(str);
            URL url = new URL(sb2.toString());
            int i10 = zbbc.zbb;
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.f32275f;
            } else {
                zba.c("Unable to revoke access!", new Object[0]);
            }
            a aVar = zba;
            StringBuilder sb3 = new StringBuilder(String.valueOf(responseCode).length() + 15);
            sb3.append("Response Code: ");
            sb3.append(responseCode);
            aVar.a(sb3.toString(), new Object[0]);
        } catch (IOException e10) {
            zba.c("IOException when revoking access: ".concat(String.valueOf(e10.toString())), new Object[0]);
        } catch (Exception e11) {
            zba.c("Exception when revoking access: ".concat(String.valueOf(e11.toString())), new Object[0]);
        }
        this.zbc.setResult(status);
    }
}
