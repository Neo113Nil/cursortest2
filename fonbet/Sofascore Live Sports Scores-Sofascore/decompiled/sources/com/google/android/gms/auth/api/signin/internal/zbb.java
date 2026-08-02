package com.google.android.gms.auth.api.signin.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.StatusPendingResult;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zbb implements Runnable {
    public static final Logger c = new Logger("RevokeAccessOperation", new String[0]);
    public final String a;
    public final StatusPendingResult b;

    public zbb(String str) {
        Preconditions.f(str);
        this.a = str;
        this.b = new StatusPendingResult(null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Logger logger = c;
        Status status = Status.g;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://accounts.google.com/o/oauth2/revoke?token=".concat(this.a)).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.e;
            } else {
                logger.a("Unable to revoke access!", new Object[0]);
            }
            String str = "Response Code: " + responseCode;
            Object[] objArr = new Object[0];
            if (logger.c <= 3) {
                logger.a(str, objArr);
            }
        } catch (IOException e) {
            logger.a("IOException when revoking access: ".concat(String.valueOf(e.toString())), new Object[0]);
        } catch (Exception e2) {
            logger.a("Exception when revoking access: ".concat(String.valueOf(e2.toString())), new Object[0]);
        }
        this.b.a(status);
    }
}
