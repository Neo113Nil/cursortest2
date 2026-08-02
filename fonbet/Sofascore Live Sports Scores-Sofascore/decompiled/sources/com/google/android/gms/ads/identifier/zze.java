package com.google.android.gms.ads.identifier;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zze {
    public static final void zza(String str) {
        try {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                try {
                    if (httpURLConnection.getResponseCode() >= 200) {
                    }
                } finally {
                    httpURLConnection.disconnect();
                }
            } catch (IOException | RuntimeException e) {
                e.getMessage();
            }
        } catch (IndexOutOfBoundsException e2) {
            e2.getMessage();
        }
    }
}
