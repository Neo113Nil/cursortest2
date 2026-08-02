package com.ironsource.adqualitysdk.sdk.i;

import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.vungle.ads.internal.protos.Sdk;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executors;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;

/* loaded from: classes5.dex */
public class ke {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2989 = 0;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2990 = 1;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static long f2991 = 2369173896520347829L;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static void m8356(je jeVar) {
        int i = 2 % 2;
        int i2 = f2989 + 3;
        f2990 = i2 % 128;
        int i3 = i2 % 2;
        try {
            Executors.newSingleThreadExecutor().execute(jeVar);
            int i4 = f2989 + 61;
            f2990 = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            kl.m8458(m8354("틭튬㙿ڮङᘇ栢葭ၘ얚ⵎ䊀圼職\uee7fƩ髽伽", (ViewConfiguration.getFadingEdgeLength() >> 16) + 1).intern(), m8354("りハຶ㹱ﴖ扊鰎\uf03a\uf22cﴟ\ud94d㛁땇뢈ᩱ痹碟矩咗룱㮻㋀釕ｋﻍ\uf04f틬ɨꀁ콰", 1 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern(), th, false);
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static long m8357() {
        int i = 2 % 2;
        int i2 = f2990 + 79;
        f2989 = i2 % 128;
        if (i2 % 2 != 0) {
            Calendar.getInstance().getTimeInMillis();
            throw null;
        }
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        int i3 = f2990 + 87;
        f2989 = i3 % 128;
        if (i3 % 2 == 0) {
            return timeInMillis;
        }
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static long m8359() {
        int i = 2 % 2;
        int i2 = f2989 + 99;
        f2990 = i2 % 128;
        if (i2 % 2 != 0) {
            return SystemClock.elapsedRealtime();
        }
        SystemClock.elapsedRealtime();
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00f9, code lost:
    
        if (r5 != 0) goto L55;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0148 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0149  */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.io.InputStream, javax.crypto.CipherInputStream] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.io.InputStream] */
    /* renamed from: ﻐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m8355(String str, String str2, String str3, String str4) {
        long j;
        Throwable th;
        int i;
        ?? r5;
        int i2 = 2 % 2;
        StringBuilder sb = new StringBuilder();
        try {
            byte[] decode = Base64.decode(str.getBytes(), 0);
            byte[] copyOfRange = Arrays.copyOfRange(decode, 16, decode.length);
            try {
                byte[] m8360 = m8360(str3);
                byte[] m83602 = m8360(str4);
                Cipher cipher = Cipher.getInstance(m8354("䚟䛞\uff00쿰틈\ue3f1돱燁萈ೋ\uf6b5뜭썧䤖㖙\uf465໖虡筏㤎䶫썬븜绹", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern());
                th = null;
                try {
                    j = 0;
                    try {
                        cipher.init(2, SecretKeyFactory.getInstance(m8354("\ue0c0\ue090쌁\uf3f6떸ꬸ풗㥰≝ボ野ﾆ攬畩勫벱꣸먂ᱫ熕\uebd2ｍ\ud956㘖⺡㶋騛쬸灺˯䟷衠덜䟅À亀\uf633萘", 1 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern(), m8354("辁迃恞储乄袿", (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1).intern()).generateSecret(new PBEKeySpec(str2.toCharArray(), m83602, 1, 256)), new IvParameterSpec(m8360, 0, cipher.getBlockSize()));
                        r5 = new CipherInputStream(new ByteArrayInputStream(copyOfRange), cipher);
                        try {
                            m8354("Ⱜⱹй㓘씌㩛ꐠꡩ\ueec0", -Process.getGidForName("")).intern();
                            byte[] bArr = new byte[8192];
                            for (int read = r5.read(bArr); read >= 0; read = r5.read(bArr)) {
                                sb.append(new String(bArr, 0, read, m8354("Ⱜⱹй㓘씌㩛ꐠꡩ\ueec0", View.combineMeasuredStates(0, 0) + 1).intern()));
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                kl.m8458(m8354("틭튬㙿ڮङᘇ栢葭ၘ얚ⵎ䊀圼職\uee7fƩ髽伽", 1 - (ViewConfiguration.getTapTimeout() >> 16)).intern(), m8354("␡⑤娈櫏쯙例꫁\uddfb\ue687ꦡ\uef83ᬝꇪ\uec27Ⲳ堼氩⍐扑長⽑晾ꜗ튖\uea6c꒿\ue430", 1 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern(), th, false);
                            } catch (Throwable th3) {
                                if (r5 != 0) {
                                    try {
                                        r5.close();
                                        int i3 = f2990 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
                                        f2989 = i3 % 128;
                                        if (i3 % 2 != 0) {
                                            int i4 = 4 % 3;
                                        }
                                    } catch (Throwable unused) {
                                    }
                                }
                                try {
                                    throw th3;
                                } catch (Throwable th4) {
                                    th = th4;
                                    kl.m8458(m8354("틭튬㙿ڮङᘇ栢葭ၘ얚ⵎ䊀圼職\uee7fƩ髽伽", 1 - TextUtils.indexOf("", "")).intern(), m8354("輡轤퇀\ue107䈟ꗁ⌇㞱䶇≩時\uf140૬柼ꕹ뉯윳ꢖ\uebd9缾萔\ueda6⻗㣗䅵⽭涱엣\u1fb5ည뀒", (SystemClock.elapsedRealtime() > j ? 1 : (SystemClock.elapsedRealtime() == j ? 0 : -1))).intern(), th, false);
                                    String obj = sb.toString();
                                    i = f2989 + 73;
                                    f2990 = i % 128;
                                    if (i % 2 == 0) {
                                    }
                                }
                            }
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        r5 = th;
                        kl.m8458(m8354("틭튬㙿ڮङᘇ栢葭ၘ얚ⵎ䊀圼職\uee7fƩ髽伽", 1 - (ViewConfiguration.getTapTimeout() >> 16)).intern(), m8354("␡⑤娈櫏쯙例꫁\uddfb\ue687ꦡ\uef83ᬝꇪ\uec27Ⲳ堼氩⍐扑長⽑晾ꜗ튖\uea6c꒿\ue430", 1 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern(), th, false);
                    }
                } catch (Throwable th6) {
                    th = th6;
                    j = 0;
                }
            } catch (Throwable th7) {
                th = th7;
                j = 0;
                th = null;
            }
            try {
                r5.close();
            } catch (Throwable unused2) {
            }
        } catch (Throwable th8) {
            th = th8;
            j = 0;
            th = null;
        }
        String obj2 = sb.toString();
        i = f2989 + 73;
        f2990 = i % 128;
        if (i % 2 == 0) {
            return obj2;
        }
        throw th;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static byte[] m8360(String str) {
        int i = 2 % 2;
        int length = str.length();
        byte[] bArr = new byte[length / 2];
        int i2 = 0;
        while (i2 < length) {
            int i3 = f2990 + 13;
            f2989 = i3 % 128;
            int i4 = i3 % 2;
            bArr[i2 / 2] = (byte) ((Character.digit(str.charAt(i2), 16) << 4) + Character.digit(str.charAt(i2 + 1), 16));
            i2 += 2;
            int i5 = f2990 + 3;
            f2989 = i5 % 128;
            int i6 = i5 % 2;
        }
        return bArr;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static List m8358(List list, List list2) {
        int i = 2 % 2;
        HashSet hashSet = new HashSet(list);
        if (list2 != null) {
            int i2 = f2989 + 91;
            f2990 = i2 % 128;
            int i3 = i2 % 2;
            hashSet.addAll(list2);
            int i4 = f2990 + 95;
            f2989 = i4 % 128;
            int i5 = i4 % 2;
        }
        return new ArrayList(hashSet);
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m8354(String str, int i) {
        String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (g.f2155) {
            char[] m7785 = g.m7785(f2991, cArr2, i);
            g.f2157 = 4;
            while (g.f2157 < m7785.length) {
                g.f2156 = g.f2157 - 4;
                m7785[g.f2157] = (char) ((m7785[g.f2157] ^ m7785[g.f2157 % 4]) ^ (g.f2156 * f2991));
                g.f2157++;
            }
            str2 = new String(m7785, 4, m7785.length - 4);
        }
        return str2;
    }
}
