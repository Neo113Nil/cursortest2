package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzli {
    static {
        new zzlo();
        new zzlx();
        new zzma();
        new zzlu();
        new zzmg();
        new zzmk();
        new zzmd();
        new zzmn();
        int i = zzwx.a;
        try {
            a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void a() {
        zzlf.c(new zzll());
        zzqs.a();
        zzlf.b(new zzlo());
        zzlf.b(new zzlx());
        if (zznb.a()) {
            return;
        }
        zzlf.b(new zzlu());
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            zzlf.b(new zzma());
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
        }
        zzlf.b(new zzmd());
        zzlf.b(new zzmg());
        zzlf.b(new zzmk());
        zzlf.b(new zzmn());
    }
}
