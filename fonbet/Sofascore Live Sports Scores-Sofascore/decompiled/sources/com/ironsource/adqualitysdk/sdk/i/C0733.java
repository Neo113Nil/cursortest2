package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.ironsource.adqualitysdk.sdk.StringFog;
import defpackage.vp2;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᔭ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0733 {

    /* renamed from: ﺙ, reason: contains not printable characters */
    public static final String f2442;

    /* renamed from: ﻏ, reason: contains not printable characters */
    public static final byte[] f2443;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static final String f2444;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static final String f2445;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final SecretKeySpec f2446;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public Cipher f2447;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public Cipher f2448;

    static {
        StringFog.decrypt("ggoQTrKc1CeIHV9rpLb3FMsxLGGkoO43jQ0MQ4CHzic=\n", "63h/IOHzoVU=\n");
        f2445 = StringFog.decrypt("0KiJShM=\n", "hfzPZysAoZw=\n");
        StringFog.decrypt("F1rHOk24570PWcMjQN6a2AVR1ixBv4KtBVuvL0c=\n", "RxiCbQTsr+4=\n");
        f2444 = StringFog.decrypt("gNibjJLX9aSR1ovw5MXX76X0psQ=\n", "wZ3Io9GVtos=\n");
        f2442 = StringFog.decrypt("0t+XCjdnz0fd0dRGLWTMQ9/X1FEwYcwE8PWpayZu1VnS0Y5LNiWRVg==\n", "sbD6JEQIoCo=\n");
        f2443 = new byte[]{16, 74, 71, -80, 32, 101, -47, 72, 117, -14, 0, -29, 70, 65, -12, 74};
    }

    public C0733(byte[] bArr, String str, String str2, String str3) {
        byte[] digest;
        try {
            digest = SecretKeyFactory.getInstance(StringFog.decrypt("dQvmfYeLj19tCOJkiu3yOmcA92uLjOpPZwqOaI0=\n", "JUmjKs7fxww=\n")).generateSecret(new PBEKeySpec((str + str2 + str3).toCharArray(), bArr, 1024, NotificationCompat.FLAG_LOCAL_ONLY)).getEncoded();
        } catch (GeneralSecurityException unused) {
            String decrypt = StringFog.decrypt("GF7X7zOv8c8AVPDfB/zT6yd04A==\n", "UxuSuXKPsIo=\n");
            String decrypt2 = StringFog.decrypt("tLkbJmtm5B7EqhpkY2rrCIm7FTBjZuQCxK8RMmNn7UnEnwY9Y2rvR4CiEiJvdu0JkOsVNHp25waH\no1o=\n", "5Mt0RAoEiGc=\n");
            String str4 = AbstractC0707.f2382;
            AbstractC0420.m244(decrypt, decrypt2);
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(StringFog.decrypt("TGzO\n", "ASj72b/Lqfc=\n"));
                char[] charArray = (str + str2 + str3).toCharArray();
                for (char c : charArray) {
                    messageDigest.update((byte) c);
                }
                digest = messageDigest.digest();
            } catch (NoSuchAlgorithmException e) {
                vp2.e(StringFog.decrypt("qVRK3Aibf8eFVErUFp11ioVUSA==\n", "4Do8vWTyG+c=\n"), e);
                throw null;
            }
        }
        this.f2446 = new SecretKeySpec(digest, StringFog.decrypt("MOzg\n", "camzWcqrE38=\n"));
        m416();
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final synchronized String m414(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            try {
                try {
                    String str2 = new String(this.f2447.doFinal(AbstractC0728.m413(str)), f2445);
                    String str3 = f2442;
                    if (str2.indexOf(str3) == 0) {
                        return str2.substring(str3.length(), str2.length());
                    }
                    throw new C0755(StringFog.decrypt("a5HnfVwKskpMgKZ/Vg38QAPc73dPGf5NR9TieE0ZsktR1O18QFGo\n", "I/SGGTl4kiQ=\n") + str);
                } catch (IllegalBlockSizeException e) {
                    m416();
                    StringBuilder sb = new StringBuilder();
                    sb.append(e.getMessage());
                    throw new C0755(AbstractC0424.m255("Kg==\n", "ELubi5jngfQ=\n", sb, str));
                }
            } catch (C0718 e2) {
                m416();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(e2.getMessage());
                throw new C0755(AbstractC0424.m255("lA==\n", "rq5dd0i0TqQ=\n", sb2, str));
            }
        } catch (UnsupportedEncodingException e3) {
            throw new RuntimeException(StringFog.decrypt("tKuor/RY0R6Yq6in6l7bU5irqg==\n", "/cXezpgxtT4=\n"), e3);
        } catch (BadPaddingException e4) {
            m416();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(e4.getMessage());
            throw new C0755(AbstractC0424.m255("nA==\n", "pgIVcXHtx20=\n", sb3, str));
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized String m415(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            return AbstractC0728.m412(this.f2448.doFinal((f2442 + str).getBytes(f2445)));
        } catch (UnsupportedEncodingException e) {
            m416();
            throw new RuntimeException(StringFog.decrypt("RoiyRR6F+H9qiLJNAIPyMmqIsA==\n", "D+bEJHLsnF8=\n"), e);
        } catch (GeneralSecurityException e2) {
            m416();
            throw new RuntimeException(StringFog.decrypt("pQoT8fIKqaqJChP57Ayj54kKEQ==\n", "7GRlkJ5jzYo=\n"), e2);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m416() {
        try {
            String str = f2444;
            Cipher cipher = Cipher.getInstance(str);
            this.f2448 = cipher;
            SecretKeySpec secretKeySpec = this.f2446;
            byte[] bArr = f2443;
            cipher.init(1, secretKeySpec, new IvParameterSpec(bArr));
            Cipher cipher2 = Cipher.getInstance(str);
            this.f2447 = cipher2;
            cipher2.init(2, this.f2446, new IvParameterSpec(bArr));
        } catch (GeneralSecurityException e) {
            vp2.e(StringFog.decrypt("0Z91FQSRtq/9n3UdGpe84v2fd1Ra\n", "mPEDdGj40o8=\n"), e);
        }
    }
}
