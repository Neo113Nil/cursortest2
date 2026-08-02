package com.inmobi.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Base64;
import android.webkit.WebResourceResponse;
import android.widget.RelativeLayout;
import com.appsflyer.sdk_base.referrer.Payload;
import com.ironsource.U3;
import defpackage.a70;
import defpackage.joa;
import defpackage.ku3;
import defpackage.l62;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.s9a;
import defpackage.sub;
import defpackage.wzb;
import defpackage.x52;
import defpackage.xw3;
import defpackage.y6a;
import defpackage.yda;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class N3 {
    public static final String a(HashMap hashMap) {
        String str;
        String str2;
        hashMap.getClass();
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : hashMap.entrySet()) {
            String str3 = (String) entry.getKey();
            String obj = StringsKt.l0((String) entry.getValue()).toString();
            if (obj.length() != 0) {
                if (sb.length() > 0) {
                    sb.append(U3.j.c);
                }
                Locale locale = Locale.US;
                try {
                    str = URLEncoder.encode(str3, com.mbridge.msdk.playercommon.exoplayer2.C.UTF8_NAME);
                    str.getClass();
                } catch (UnsupportedEncodingException unused) {
                    str = "";
                }
                try {
                    str2 = URLEncoder.encode(obj, com.mbridge.msdk.playercommon.exoplayer2.C.UTF8_NAME);
                    str2.getClass();
                } catch (UnsupportedEncodingException unused2) {
                    str2 = "";
                }
                sb.append(String.format(locale, "%s=%s", Arrays.copyOf(new Object[]{str, str2}, 2)));
            }
        }
        return sb.toString();
    }

    public static final int b(float f) {
        try {
            return wzb.b(f);
        } catch (Exception unused) {
            return 0;
        }
    }

    public static final int c(float f) {
        try {
            return (int) (f / R5.b());
        } catch (Exception unused) {
            return 0;
        }
    }

    public static final int a(int i) {
        try {
            return (int) (i / R5.b());
        } catch (Exception unused) {
            return i;
        }
    }

    public static final float a(float f) {
        return b(f * 10.0f) / 10.0f;
    }

    public static final String a(l62 l62Var, int i) {
        try {
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            if (l62Var != null) {
                int i2 = i;
                boolean z = false;
                do {
                    try {
                        String K = l62Var.K();
                        if (K == null) {
                            break;
                        }
                        if (i > 0 && !z) {
                            sb2.append(K);
                            sb2.append("\n");
                            i--;
                        }
                        if (kotlin.text.c.v(K, "\"main\"", false)) {
                            sb2.setLength(0);
                            z = true;
                        }
                        if (z) {
                            i2--;
                            sb.append(K);
                            sb.append("\n");
                        }
                        if (StringsKt.J(K, "ZygoteInit.java", false)) {
                            break;
                        }
                    } catch (IOException unused) {
                    }
                } while (i2 > 0);
            }
            if (sb.length() == 0) {
                String sb3 = sb2.toString();
                if (l62Var != null) {
                    try {
                        l62Var.close();
                    } catch (IOException unused2) {
                    }
                }
                return sb3;
            }
            String sb4 = sb.toString();
            if (l62Var != null) {
                try {
                    l62Var.close();
                } catch (IOException unused3) {
                }
            }
            return sb4;
        } catch (Throwable th) {
            if (l62Var != null) {
                try {
                    l62Var.close();
                } catch (IOException unused4) {
                }
            }
            throw th;
        }
    }

    public static final WebResourceResponse a(InputStream inputStream, String str) {
        inputStream.getClass();
        str.getClass();
        Map d = sub.d(new Pair("Access-Control-Allow-Origin", "*"));
        F5.a.getClass();
        if (F5.x()) {
            return new WebResourceResponse(str, com.mbridge.msdk.playercommon.exoplayer2.C.UTF8_NAME, 200, Payload.RESPONSE_OK, d, inputStream);
        }
        return new WebResourceResponse(str, com.mbridge.msdk.playercommon.exoplayer2.C.UTF8_NAME, inputStream);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|24|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003f, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0040, code lost:
    
        r6 = com.inmobi.media.AbstractC3286aa.a;
        com.inmobi.media.AbstractC3286aa.a(new com.inmobi.media.Q2(r5));
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(Hh hh, Function1 function1, rq3 rq3Var) {
        L3 l3;
        int i;
        if (rq3Var instanceof L3) {
            l3 = (L3) rq3Var;
            int i2 = l3.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                l3.b = i2 - Integer.MIN_VALUE;
                Object obj = l3.a;
                Object obj2 = lu3.a;
                i = l3.b;
                if (i != 0) {
                    y6a.M(obj);
                    M3 m3 = new M3(function1, null);
                    l3.b = 1;
                    if (hh.a(m3, l3) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            }
        }
        l3 = new L3(rq3Var);
        Object obj3 = l3.a;
        Object obj22 = lu3.a;
        i = l3.b;
        if (i != 0) {
        }
        return Unit.a;
    }

    public static final String a(x52 x52Var) {
        x52Var.getClass();
        String encodeToString = Base64.encodeToString(x52Var.j0(x52Var.b), 0);
        encodeToString.getClass();
        return encodeToString;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean a(Context context) {
        int i;
        ApplicationInfo applicationInfo;
        context.getClass();
        F5.a.getClass();
        if (Build.VERSION.SDK_INT < 35) {
            return false;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
            packageInfo.getClass();
            applicationInfo = packageInfo.applicationInfo;
        } catch (Exception unused) {
        }
        if (applicationInfo != null) {
            i = applicationInfo.targetSdkVersion;
            return i < 35;
        }
        i = -1;
        if (i < 35) {
        }
    }

    public static final void a(Vo vo, RelativeLayout.LayoutParams layoutParams, Tf tf) {
        vo.getClass();
        layoutParams.getClass();
        tf.getClass();
        vo.getClass();
        tf.getClass();
        Uo uo = (Uo) vo.a.get(tf);
        int i = uo != null ? uo.a : 0;
        tf.getClass();
        Uo uo2 = (Uo) vo.a.get(tf);
        int i2 = uo2 != null ? uo2.c : 0;
        tf.getClass();
        Uo uo3 = (Uo) vo.a.get(tf);
        layoutParams.setMargins(i, 0, i2, uo3 != null ? uo3.d : 0);
    }

    public static final void a(ku3 ku3Var) {
        if (ku3Var == null) {
            return;
        }
        try {
            s9a.o(ku3Var, null);
        } catch (IllegalStateException unused) {
        }
    }

    public static final boolean a(String str) {
        return str != null && str.length() > 0;
    }

    public static final yda a(ku3 ku3Var, long j, long j2, Function1 function1) {
        ku3Var.getClass();
        function1.getClass();
        return xw3.L(ku3Var, null, null, new J3(j, function1, j2, null), 3);
    }

    public static final Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        context.getClass();
        intentFilter.getClass();
        try {
            F5.a.getClass();
            if (Build.VERSION.SDK_INT >= 33) {
                return context.registerReceiver(broadcastReceiver, intentFilter, 2);
            }
            return context.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e) {
            joa joaVar = AbstractC3286aa.a;
            AbstractC3776t9.a(e);
            return null;
        }
    }
}
