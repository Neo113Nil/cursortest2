package com.vungle.ads.internal;

import android.content.Context;
import com.vungle.ads.NetworkUnreachable;
import com.vungle.ads.internal.model.i3;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.persistence.FilePreferences;
import com.vungle.ads.internal.privacy.PrivacyManager;
import defpackage.bf3;
import defpackage.duf;
import defpackage.joa;
import defpackage.sha;
import defpackage.yea;
import defpackage.ypa;
import defpackage.ysa;
import java.net.UnknownHostException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002¨\u0006\r²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002²\u0006\f\u0010\n\u001a\u00020\t8\nX\u008a\u0084\u0002²\u0006\f\u0010\n\u001a\u00020\t8\nX\u008a\u0084\u0002²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002²\u0006\f\u0010\f\u001a\u00020\u000b8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/vungle/ads/internal/ConfigManager;", "", "", "getAdsEndpoint", "getConfigExtension", "<init>", "()V", "Lcom/vungle/ads/internal/network/VungleApiClient;", "vungleApiClient", "Lcom/vungle/ads/internal/persistence/FilePreferences;", "filePreferences", "Lcom/vungle/ads/internal/executor/a;", "sdkExecutors", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes6.dex */
public final class ConfigManager {
    public static com.vungle.ads.internal.model.v2 a;
    public static com.vungle.ads.internal.model.h2 b;
    public static List c;
    public static String d;
    public static String f;

    @NotNull
    public static final ConfigManager INSTANCE = new ConfigManager();
    public static final joa e = ypa.a(ysa.a, w0.a);

    private ConfigManager() {
    }

    public static boolean b() {
        Boolean bool;
        com.vungle.ads.internal.model.v2 v2Var = a;
        if (v2Var == null || (bool = v2Var.n) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public static String c() {
        com.vungle.ads.internal.model.h2 h2Var = b;
        String str = null;
        String str2 = h2Var != null ? h2Var.e : null;
        if (str2 != null && str2.length() != 0) {
            str = str2;
        }
        return str == null ? Constants.a : str;
    }

    public static int d() {
        com.vungle.ads.internal.model.a2 a2Var;
        Integer num;
        com.vungle.ads.internal.model.v2 v2Var = a;
        if (v2Var == null || (a2Var = v2Var.a) == null || (num = a2Var.b) == null) {
            return 3;
        }
        return num.intValue();
    }

    public static long e() {
        com.vungle.ads.internal.model.a2 a2Var;
        Long l;
        com.vungle.ads.internal.model.v2 v2Var = a;
        if (v2Var == null || (a2Var = v2Var.a) == null || (l = a2Var.a) == null) {
            return 1048576000L;
        }
        return l.longValue() * 1048576;
    }

    public static String f() {
        com.vungle.ads.internal.model.h2 h2Var = b;
        String str = null;
        String str2 = h2Var != null ? h2Var.c : null;
        if (str2 != null && str2.length() != 0) {
            str = str2;
        }
        return str == null ? Constants.b : str;
    }

    public static String g() {
        com.vungle.ads.internal.model.u2 u2Var;
        com.vungle.ads.internal.model.k2 k2Var;
        com.vungle.ads.internal.model.v2 v2Var = a;
        if (v2Var == null || (u2Var = v2Var.f) == null || (k2Var = u2Var.a) == null) {
            return null;
        }
        return k2Var.e;
    }

    public static String h() {
        com.vungle.ads.internal.model.u2 u2Var;
        com.vungle.ads.internal.model.k2 k2Var;
        com.vungle.ads.internal.model.v2 v2Var = a;
        if (v2Var == null || (u2Var = v2Var.f) == null || (k2Var = u2Var.a) == null) {
            return null;
        }
        return k2Var.f;
    }

    public static String i() {
        com.vungle.ads.internal.model.u2 u2Var;
        com.vungle.ads.internal.model.k2 k2Var;
        com.vungle.ads.internal.model.v2 v2Var = a;
        if (v2Var == null || (u2Var = v2Var.f) == null || (k2Var = u2Var.a) == null) {
            return null;
        }
        return k2Var.c;
    }

    public static String j() {
        com.vungle.ads.internal.model.u2 u2Var;
        com.vungle.ads.internal.model.k2 k2Var;
        com.vungle.ads.internal.model.v2 v2Var = a;
        if (v2Var == null || (u2Var = v2Var.f) == null || (k2Var = u2Var.a) == null) {
            return null;
        }
        return k2Var.b;
    }

    public static boolean k() {
        com.vungle.ads.internal.model.u2 u2Var;
        com.vungle.ads.internal.model.k2 k2Var;
        Boolean bool;
        com.vungle.ads.internal.model.v2 v2Var = a;
        if (v2Var == null || (u2Var = v2Var.f) == null || (k2Var = u2Var.a) == null || (bool = k2Var.a) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public static String l() {
        com.vungle.ads.internal.model.h2 h2Var = b;
        String str = null;
        String str2 = h2Var != null ? h2Var.d : null;
        if (str2 != null && str2.length() != 0) {
            str = str2;
        }
        return str == null ? Constants.c : str;
    }

    public static String m() {
        com.vungle.ads.internal.model.h2 h2Var = b;
        if (h2Var != null) {
            return h2Var.b;
        }
        return null;
    }

    public static com.vungle.ads.internal.model.n2 n() {
        com.vungle.ads.internal.model.u2 u2Var;
        com.vungle.ads.internal.model.o2 o2Var;
        LinkedHashMap linkedHashMap = com.vungle.ads.internal.model.n2.b;
        com.vungle.ads.internal.model.v2 v2Var = a;
        return (com.vungle.ads.internal.model.n2) com.vungle.ads.internal.model.n2.b.get((v2Var == null || (u2Var = v2Var.f) == null || (o2Var = u2Var.b) == null) ? null : o2Var.a);
    }

    public static boolean o() {
        Boolean bool;
        com.vungle.ads.internal.model.v2 v2Var = a;
        if (v2Var == null || (bool = v2Var.i) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public static boolean p() {
        Boolean bool;
        com.vungle.ads.internal.model.v2 v2Var = a;
        if (v2Var == null || (bool = v2Var.r) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public static boolean q() {
        Boolean bool;
        com.vungle.ads.internal.model.v2 v2Var = a;
        if (v2Var == null || (bool = v2Var.o) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public static boolean r() {
        Boolean bool;
        com.vungle.ads.internal.model.v2 v2Var = a;
        if (v2Var == null || (bool = v2Var.m) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00fd A[Catch: all -> 0x002b, Exception -> 0x002e, Merged into TryCatch #1 {all -> 0x002b, Exception -> 0x002e, blocks: (B:3:0x0001, B:5:0x0004, B:11:0x0036, B:13:0x003b, B:14:0x0041, B:16:0x0045, B:17:0x004b, B:19:0x0051, B:21:0x0055, B:23:0x0059, B:24:0x005f, B:26:0x0063, B:28:0x0067, B:30:0x006b, B:31:0x006f, B:34:0x009c, B:36:0x00ab, B:38:0x00b5, B:39:0x00b9, B:41:0x00bf, B:43:0x00c3, B:44:0x00c7, B:53:0x00d3, B:55:0x00d9, B:56:0x00dd, B:59:0x00e9, B:61:0x00ed, B:62:0x00e2, B:65:0x00fd, B:68:0x0016, B:70:0x001a, B:73:0x0023, B:79:0x0108), top: B:2:0x0001 }, TRY_ENTER, TRY_LEAVE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void a(Context context, com.vungle.ads.internal.model.v2 v2Var, boolean z, m2 m2Var) {
        Long l;
        char c2;
        Boolean bool;
        com.vungle.ads.internal.model.r2 r2Var;
        Boolean bool2;
        com.vungle.ads.internal.model.r2 r2Var2;
        Integer num;
        try {
            context.getClass();
            ysa ysaVar = ysa.a;
            joa a2 = ypa.a(ysaVar, new s0(context));
            boolean z2 = false;
            boolean z3 = true;
            if (v2Var != null && (l = v2Var.p) != null && l.longValue() != -1) {
                c2 = v2Var.c == null ? (char) 1 : (char) 2;
                if (c2 != 0) {
                    boolean z4 = com.vungle.ads.internal.util.u.a;
                    com.vungle.ads.internal.util.t.b("ConfigManager", "Config is not available.");
                    return;
                }
                if (c2 == 1) {
                    if (!z && v2Var != null) {
                        Long b2 = v2Var.b();
                        long longValue = b2 != null ? b2.longValue() : -1L;
                        com.vungle.ads.internal.model.v2 v2Var2 = a;
                        if (v2Var2 != null) {
                            v2Var2.a(Long.valueOf(longValue));
                        }
                        com.vungle.ads.internal.model.v2 v2Var3 = a;
                        if (v2Var3 != null) {
                            ConfigManager configManager = INSTANCE;
                            FilePreferences filePreferences = (FilePreferences) a2.getValue();
                            configManager.getClass();
                            a(v2Var3, filePreferences);
                        }
                    }
                    return;
                }
                a = v2Var;
                b = v2Var != null ? v2Var.d() : null;
                c = v2Var != null ? v2Var.e() : null;
                com.vungle.ads.internal.model.v2 v2Var4 = a;
                int intValue = (v2Var4 == null || (r2Var2 = v2Var4.d) == null || (num = r2Var2.a) == null) ? 1 : num.intValue();
                com.vungle.ads.internal.model.v2 v2Var5 = a;
                if (v2Var5 != null && (r2Var = v2Var5.d) != null && (bool2 = r2Var.b) != null) {
                    z2 = bool2.booleanValue();
                }
                joa a3 = ypa.a(ysaVar, new t0(context));
                joa a4 = ypa.a(ysaVar, new u0(context));
                AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
                analyticsClient.a((VungleApiClient) a3.getValue(), ((com.vungle.ads.internal.executor.d) ((com.vungle.ads.internal.executor.a) a4.getValue())).e(), intValue, z2);
                if (!z && v2Var != null) {
                    a(v2Var, (FilePreferences) a2.getValue());
                    String a5 = v2Var.a();
                    if (a5 != null) {
                        INSTANCE.getClass();
                        a(context, a5);
                    }
                }
                if (m2Var != null) {
                    AnalyticsClient.a(analyticsClient, m2Var, (com.vungle.ads.internal.util.s) null, 6);
                }
                PrivacyManager privacyManager = PrivacyManager.INSTANCE;
                com.vungle.ads.internal.model.v2 v2Var6 = a;
                if (v2Var6 != null && (bool = v2Var6.h) != null) {
                    z3 = bool.booleanValue();
                }
                privacyManager.getClass();
                PrivacyManager.a(z3);
                return;
            }
            c2 = 0;
            if (c2 != 0) {
            }
        } catch (Exception e2) {
            boolean z5 = com.vungle.ads.internal.util.u.a;
            StringBuilder a6 = com.iab.omid.library.vungle.internal.l.a("Error while validating config: ");
            a6.append(e2.getMessage());
            com.vungle.ads.internal.util.t.b("ConfigManager", a6.toString());
        } finally {
        }
    }

    @NotNull
    public final String getAdsEndpoint() {
        com.vungle.ads.internal.model.h2 h2Var = b;
        String str = null;
        String str2 = h2Var != null ? h2Var.a : null;
        if (str2 != null && str2.length() != 0) {
            str = str2;
        }
        return str == null ? Constants.DEFAULT_ADS_ENDPOINT : str;
    }

    @NotNull
    public final String getConfigExtension() {
        String str = d;
        return str == null ? "" : str;
    }

    public static void b(String str) {
        str.getClass();
        f = str;
    }

    public static i3 a(String str) {
        List list = c;
        Object obj = null;
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (Intrinsics.c(((i3) next).b(), str)) {
                obj = next;
                break;
            }
        }
        return (i3) obj;
    }

    public static long a() {
        Long l;
        com.vungle.ads.internal.model.v2 v2Var = a;
        if (v2Var == null || (l = v2Var.p) == null) {
            return -1L;
        }
        return l.longValue();
    }

    public static com.vungle.ads.internal.model.v2 a(FilePreferences filePreferences, String str) {
        Long a2;
        filePreferences.getClass();
        str.getClass();
        try {
            String string = filePreferences.getString("config_app_id");
            if (string != null && string.length() != 0 && kotlin.text.c.o(string, str, true)) {
                String string2 = filePreferences.getString("config_response");
                if (string2 == null) {
                    return null;
                }
                long a3 = filePreferences.a("config_update_time", 0L);
                INSTANCE.getClass();
                yea yeaVar = (yea) e.getValue();
                com.vungle.ads.internal.model.v2 v2Var = (com.vungle.ads.internal.model.v2) yeaVar.b(sha.Q(yeaVar.b, duf.b(com.vungle.ads.internal.model.v2.class)), string2);
                com.vungle.ads.internal.model.e2 c2 = v2Var.c();
                if (((c2 == null || (a2 = c2.a()) == null) ? -1L : a2.longValue()) + a3 < System.currentTimeMillis()) {
                    boolean z = com.vungle.ads.internal.util.u.a;
                    com.vungle.ads.internal.util.t.c("ConfigManager", "cache config expired. re-config");
                    return null;
                }
                boolean z2 = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.c("ConfigManager", "use cache config.");
                return v2Var;
            }
            boolean z3 = com.vungle.ads.internal.util.u.a;
            com.vungle.ads.internal.util.t.c("ConfigManager", "app id mismatch, re-config");
            return null;
        } catch (Exception e2) {
            boolean z4 = com.vungle.ads.internal.util.u.a;
            StringBuilder a4 = com.iab.omid.library.vungle.internal.l.a("Error while parsing cached config: ");
            a4.append(e2.getMessage());
            com.vungle.ads.internal.util.t.b("ConfigManager", a4.toString());
            return null;
        }
    }

    public static void a(com.vungle.ads.internal.model.v2 v2Var, FilePreferences filePreferences) {
        v2Var.getClass();
        filePreferences.getClass();
        try {
            String str = f;
            if (str != null) {
                filePreferences.a("config_app_id", str);
                filePreferences.b("config_update_time", System.currentTimeMillis());
                yea yeaVar = (yea) e.getValue();
                filePreferences.a("config_response", yeaVar.c(sha.Q(yeaVar.b, duf.b(com.vungle.ads.internal.model.v2.class)), v2Var));
                filePreferences.b();
                return;
            }
            Intrinsics.i("applicationId");
            throw null;
        } catch (Exception e2) {
            boolean z = com.vungle.ads.internal.util.u.a;
            StringBuilder a2 = com.iab.omid.library.vungle.internal.l.a("Exception: ");
            a2.append(e2.getMessage());
            a2.append(" for updating cached config");
            com.vungle.ads.internal.util.t.b("ConfigManager", a2.toString());
        }
    }

    public static void a(Context context, q2 q2Var) {
        context.getClass();
        q2Var.getClass();
        try {
            com.vungle.ads.internal.network.m a2 = ((VungleApiClient) ypa.a(ysa.a, new q0(context)).getValue()).a();
            if (a2 != null) {
                a2.a(new r0(context, q2Var));
            }
        } catch (Throwable th) {
            if (th instanceof UnknownHostException ? true : th instanceof SecurityException) {
                new NetworkUnreachable(bf3.o(com.iab.omid.library.vungle.internal.l.a("Config unknown: "), th)).logErrorNoReturnValue$vungle_ads_release();
            } else {
                new NetworkUnreachable(bf3.o(com.iab.omid.library.vungle.internal.l.a("Config: "), th)).logErrorNoReturnValue$vungle_ads_release();
            }
            q2Var.invoke(Boolean.FALSE);
        }
    }

    public static void a(Context context, String str) {
        context.getClass();
        str.getClass();
        d = str;
        ((FilePreferences) ypa.a(ysa.a, new x0(context)).getValue()).a("config_extension", str).b();
    }
}
