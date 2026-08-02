package io.sentry;

import com.sports.insider.data.repository.room.live.LiveTable;
import com.sports.insider.data.room.general.table.AccountTable;
import com.sports.insider.data.room.general.table.predictions.PredictionTable;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import io.appmetrica.analytics.impl.C0122e9;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d implements s1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16298a;

    public /* synthetic */ d(int i5) {
        this.f16298a = i5;
    }

    public static n6 b(b2 b2Var, ILogger iLogger) {
        String c02;
        b2Var.k();
        io.sentry.protocol.v vVar = null;
        p6 p6Var = null;
        String str = null;
        ConcurrentHashMap concurrentHashMap = null;
        p6 p6Var2 = null;
        String str2 = null;
        q6 q6Var = null;
        String str3 = null;
        ConcurrentHashMap concurrentHashMap2 = null;
        Map map = null;
        while (b2Var.l0() == io.sentry.vendor.gson.stream.b.NAME) {
            c02 = b2Var.c0();
            c02.getClass();
            switch (c02) {
                case "span_id":
                    p6Var = new p6(b2Var.h0());
                    break;
                case "parent_span_id":
                    p6Var2 = (p6) b2Var.f0(iLogger, new d(23));
                    break;
                case "description":
                    str2 = b2Var.h0();
                    break;
                case "origin":
                    str3 = b2Var.h0();
                    break;
                case "status":
                    q6Var = (q6) b2Var.f0(iLogger, new d(24));
                    break;
                case "op":
                    str = b2Var.h0();
                    break;
                case "data":
                    map = (Map) b2Var.d0();
                    break;
                case "tags":
                    concurrentHashMap2 = com.google.android.play.core.appupdate.b.A((Map) b2Var.d0());
                    break;
                case "trace_id":
                    vVar = new io.sentry.protocol.v(b2Var.h0());
                    break;
                default:
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    b2Var.j0(iLogger, concurrentHashMap, c02);
                    break;
            }
        }
        if (vVar == null) {
            IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"trace_id\"");
            iLogger.e(b5.ERROR, "Missing required field \"trace_id\"", illegalStateException);
            throw illegalStateException;
        }
        if (p6Var == null) {
            IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"span_id\"");
            iLogger.e(b5.ERROR, "Missing required field \"span_id\"", illegalStateException2);
            throw illegalStateException2;
        }
        if (str == null) {
            str = "";
        }
        n6 n6Var = new n6(vVar, p6Var, str, p6Var2);
        n6Var.f16672f = str2;
        n6Var.f16673g = q6Var;
        n6Var.f16675i = str3;
        if (concurrentHashMap2 != null) {
            n6Var.f16674h = concurrentHashMap2;
        }
        if (map != null) {
            n6Var.j = map;
        }
        n6Var.f16676k = concurrentHashMap;
        b2Var.r();
        return n6Var;
    }

    private final Object c(b2 b2Var, ILogger iLogger) {
        String c02;
        b2Var.k();
        Date n9 = com.google.android.play.core.appupdate.b.n();
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        b5 b5Var = null;
        ConcurrentHashMap concurrentHashMap2 = null;
        while (b2Var.l0() == io.sentry.vendor.gson.stream.b.NAME) {
            c02 = b2Var.c0();
            c02.getClass();
            switch (c02) {
                case "origin":
                    str4 = b2Var.i0();
                    break;
                case "data":
                    ConcurrentHashMap A = com.google.android.play.core.appupdate.b.A((Map) b2Var.d0());
                    if (A == null) {
                        break;
                    } else {
                        concurrentHashMap = A;
                        break;
                    }
                case "type":
                    str2 = b2Var.i0();
                    break;
                case "category":
                    str3 = b2Var.i0();
                    break;
                case "timestamp":
                    Date y5 = b2Var.y(iLogger);
                    if (y5 == null) {
                        break;
                    } else {
                        n9 = y5;
                        break;
                    }
                case "level":
                    try {
                        b5Var = b5.valueOf(b2Var.h0().toUpperCase(Locale.ROOT));
                        break;
                    } catch (Exception e7) {
                        iLogger.b(b5.ERROR, e7, "Error when deserializing SentryLevel", new Object[0]);
                        break;
                    }
                case "message":
                    str = b2Var.i0();
                    break;
                default:
                    if (concurrentHashMap2 == null) {
                        concurrentHashMap2 = new ConcurrentHashMap();
                    }
                    b2Var.j0(iLogger, concurrentHashMap2, c02);
                    break;
            }
        }
        e eVar = new e(n9);
        eVar.f16333d = str;
        eVar.f16334e = str2;
        eVar.f16335f = concurrentHashMap;
        eVar.f16336g = str3;
        eVar.f16337h = str4;
        eVar.f16338i = b5Var;
        eVar.j = concurrentHashMap2;
        b2Var.r();
        return eVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final Object d(b2 b2Var, ILogger iLogger) {
        b2Var.k();
        io.sentry.protocol.v vVar = io.sentry.protocol.v.f16922b;
        g3 g3Var = new g3(vVar, vVar, new File("dummy"), new HashMap(), Double.valueOf(0.0d), ConstantDeviceInfo.APP_PLATFORM, b6.empty());
        ConcurrentHashMap concurrentHashMap = null;
        while (b2Var.l0() == io.sentry.vendor.gson.stream.b.NAME) {
            String c02 = b2Var.c0();
            c02.getClass();
            int i5 = 8;
            int i10 = 5;
            int i11 = 2;
            char c2 = 65535;
            switch (c02.hashCode()) {
                case -1840434063:
                    if (c02.equals("debug_meta")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -362243017:
                    if (c02.equals("measurements")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case -309425751:
                    if (c02.equals("profile")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case -85904877:
                    if (c02.equals("environment")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 55126294:
                    if (c02.equals("timestamp")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case 178573617:
                    if (c02.equals("profiler_id")) {
                        c2 = 5;
                        break;
                    }
                    break;
                case 351608024:
                    if (c02.equals("version")) {
                        c2 = 6;
                        break;
                    }
                    break;
                case 1090594823:
                    if (c02.equals("release")) {
                        c2 = 7;
                        break;
                    }
                    break;
                case 1102774726:
                    if (c02.equals("client_sdk")) {
                        c2 = '\b';
                        break;
                    }
                    break;
                case 1874684019:
                    if (c02.equals("platform")) {
                        c2 = '\t';
                        break;
                    }
                    break;
                case 1953158756:
                    if (c02.equals("sampled_profile")) {
                        c2 = '\n';
                        break;
                    }
                    break;
                case 2005113901:
                    if (c02.equals("chunk_id")) {
                        c2 = 11;
                        break;
                    }
                    break;
            }
            int i12 = 23;
            switch (c2) {
                case 0:
                    io.sentry.protocol.d dVar = (io.sentry.protocol.d) b2Var.f0(iLogger, new io.sentry.clientreport.b(i5));
                    if (dVar == null) {
                        break;
                    } else {
                        g3Var.f16425a = dVar;
                        break;
                    }
                case 1:
                    HashMap Y = b2Var.Y(iLogger, new io.sentry.clientreport.b(i11));
                    if (Y == null) {
                        break;
                    } else {
                        g3Var.f16429e.putAll(Y);
                        break;
                    }
                case 2:
                    io.sentry.protocol.profiling.a aVar = (io.sentry.protocol.profiling.a) b2Var.f0(iLogger, new io.sentry.protocol.c0(i10));
                    if (aVar == null) {
                        break;
                    } else {
                        g3Var.f16436m = aVar;
                        break;
                    }
                case 3:
                    String i02 = b2Var.i0();
                    if (i02 == null) {
                        break;
                    } else {
                        g3Var.f16432h = i02;
                        break;
                    }
                case 4:
                    Double C = b2Var.C();
                    if (C == null) {
                        break;
                    } else {
                        g3Var.j = C.doubleValue();
                        break;
                    }
                case 5:
                    io.sentry.protocol.v vVar2 = (io.sentry.protocol.v) b2Var.f0(iLogger, new io.sentry.clientreport.b(i12));
                    if (vVar2 == null) {
                        break;
                    } else {
                        g3Var.f16426b = vVar2;
                        break;
                    }
                case 6:
                    String i03 = b2Var.i0();
                    if (i03 == null) {
                        break;
                    } else {
                        g3Var.f16433i = i03;
                        break;
                    }
                case 7:
                    String i04 = b2Var.i0();
                    if (i04 == null) {
                        break;
                    } else {
                        g3Var.f16431g = i04;
                        break;
                    }
                case '\b':
                    io.sentry.protocol.t tVar = (io.sentry.protocol.t) b2Var.f0(iLogger, new io.sentry.clientreport.b(21));
                    if (tVar == null) {
                        break;
                    } else {
                        g3Var.f16428d = tVar;
                        break;
                    }
                case '\t':
                    String i05 = b2Var.i0();
                    if (i05 == null) {
                        break;
                    } else {
                        g3Var.f16430f = i05;
                        break;
                    }
                case '\n':
                    String i06 = b2Var.i0();
                    if (i06 == null) {
                        break;
                    } else {
                        g3Var.f16435l = i06;
                        break;
                    }
                case 11:
                    io.sentry.protocol.v vVar3 = (io.sentry.protocol.v) b2Var.f0(iLogger, new io.sentry.clientreport.b(i12));
                    if (vVar3 == null) {
                        break;
                    } else {
                        g3Var.f16427c = vVar3;
                        break;
                    }
                default:
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    b2Var.j0(iLogger, concurrentHashMap, c02);
                    break;
            }
        }
        g3Var.f16437n = concurrentHashMap;
        b2Var.r();
        return g3Var;
    }

    public static IllegalStateException e(String str, ILogger iLogger) {
        String n9 = androidx.appcompat.widget.c1.n("Missing required field \"", str, "\"");
        IllegalStateException illegalStateException = new IllegalStateException(n9);
        iLogger.e(b5.ERROR, n9, illegalStateException);
        return illegalStateException;
    }

    public static IllegalStateException f(String str, ILogger iLogger) {
        String n9 = androidx.appcompat.widget.c1.n("Missing required field \"", str, "\"");
        IllegalStateException illegalStateException = new IllegalStateException(n9);
        iLogger.e(b5.ERROR, n9, illegalStateException);
        return illegalStateException;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x03b6, code lost:
    
        r4.n();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:229:0x03b0. Please report as an issue. */
    @Override // io.sentry.s1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(b2 b2Var, ILogger iLogger) {
        char c2;
        char c8;
        ArrayList arrayList;
        char c10;
        char c11;
        char c12;
        char c13;
        char c14;
        char c15;
        char c16;
        char c17;
        char c18;
        char c19;
        char c20;
        int i5;
        int i10;
        int i11;
        char c21;
        char c22;
        switch (this.f16298a) {
            case 0:
                return c(b2Var, iLogger);
            case 1:
                return d(b2Var, iLogger);
            case 2:
                b2Var.k();
                h3 h3Var = new h3(io.sentry.protocol.v.f16922b);
                ConcurrentHashMap concurrentHashMap = null;
                while (b2Var.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String c02 = b2Var.c0();
                    c02.getClass();
                    if (c02.equals("profiler_id")) {
                        io.sentry.protocol.v vVar = (io.sentry.protocol.v) b2Var.f0(iLogger, new io.sentry.clientreport.b(23));
                        if (vVar != null) {
                            h3Var.f16453a = vVar;
                        }
                    } else {
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        b2Var.j0(iLogger, concurrentHashMap, c02);
                    }
                }
                h3Var.f16454b = concurrentHashMap;
                b2Var.r();
                return h3Var;
            case 3:
                b2Var.k();
                File file = new File("dummy");
                Date n9 = com.google.android.play.core.appupdate.b.n();
                ArrayList arrayList2 = new ArrayList();
                io.sentry.protocol.v vVar2 = io.sentry.protocol.v.f16922b;
                j3 j3Var = new j3(file, n9, arrayList2, "", vVar2.toString(), new n6(vVar2, p6.f16724b, "op", null).f16667a.toString(), CommonUrlParts.Values.FALSE_INTEGER, 0, "", new i0(1), null, null, null, null, null, null, null, null, "normal", new HashMap());
                ConcurrentHashMap concurrentHashMap2 = null;
                while (b2Var.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String c03 = b2Var.c0();
                    c03.getClass();
                    switch (c03.hashCode()) {
                        case -2133529830:
                            if (c03.equals("device_manufacturer")) {
                                c2 = 0;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1981468849:
                            if (c03.equals("android_api_level")) {
                                c2 = 1;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1430655860:
                            if (c03.equals("build_id")) {
                                c2 = 2;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1172160413:
                            if (c03.equals("device_locale")) {
                                c2 = 3;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1102636175:
                            if (c03.equals("profile_id")) {
                                c2 = 4;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -716656436:
                            if (c03.equals("device_os_build_number")) {
                                c2 = 5;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -591076352:
                            if (c03.equals("device_model")) {
                                c2 = 6;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -512511455:
                            if (c03.equals("device_is_emulator")) {
                                c2 = 7;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -478065584:
                            if (c03.equals("duration_ns")) {
                                c2 = '\b';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -362243017:
                            if (c03.equals("measurements")) {
                                c2 = '\t';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -332426004:
                            if (c03.equals("device_physical_memory_bytes")) {
                                c2 = '\n';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -212264198:
                            if (c03.equals("device_cpu_frequencies")) {
                                c2 = 11;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -102985484:
                            if (c03.equals("version_code")) {
                                c2 = '\f';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -102670958:
                            if (c03.equals("version_name")) {
                                c2 = '\r';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -85904877:
                            if (c03.equals("environment")) {
                                c2 = 14;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 55126294:
                            if (c03.equals("timestamp")) {
                                c2 = 15;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 508853068:
                            if (c03.equals("transaction_name")) {
                                c2 = 16;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 796476189:
                            if (c03.equals("device_os_name")) {
                                c2 = 17;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 839674195:
                            if (c03.equals("architecture")) {
                                c2 = 18;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1010584092:
                            if (c03.equals("transaction_id")) {
                                c2 = 19;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1052553990:
                            if (c03.equals("device_os_version")) {
                                c2 = 20;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1163928186:
                            if (c03.equals("truncation_reason")) {
                                c2 = 21;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1270300245:
                            if (c03.equals("trace_id")) {
                                c2 = 22;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1874684019:
                            if (c03.equals("platform")) {
                                c2 = 23;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1953158756:
                            if (c03.equals("sampled_profile")) {
                                c2 = 24;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1954122069:
                            if (c03.equals("transactions")) {
                                c2 = 25;
                                break;
                            }
                            c2 = 65535;
                            break;
                        default:
                            c2 = 65535;
                            break;
                    }
                    switch (c2) {
                        case 0:
                            String i02 = b2Var.i0();
                            if (i02 != null) {
                                j3Var.f16543e = i02;
                                break;
                            } else {
                                continue;
                            }
                        case 1:
                            Integer O = b2Var.O();
                            if (O != null) {
                                j3Var.f16541c = O.intValue();
                                break;
                            } else {
                                continue;
                            }
                        case 2:
                            String i03 = b2Var.i0();
                            if (i03 != null) {
                                j3Var.f16552o = i03;
                                break;
                            } else {
                                continue;
                            }
                        case 3:
                            String i04 = b2Var.i0();
                            if (i04 != null) {
                                j3Var.f16542d = i04;
                                break;
                            } else {
                                continue;
                            }
                        case 4:
                            String i05 = b2Var.i0();
                            if (i05 != null) {
                                j3Var.f16559w = i05;
                                break;
                            } else {
                                continue;
                            }
                        case 5:
                            String i06 = b2Var.i0();
                            if (i06 != null) {
                                j3Var.f16545g = i06;
                                break;
                            } else {
                                continue;
                            }
                        case 6:
                            String i07 = b2Var.i0();
                            if (i07 != null) {
                                j3Var.f16544f = i07;
                                break;
                            } else {
                                continue;
                            }
                        case 7:
                            Boolean w10 = b2Var.w();
                            if (w10 != null) {
                                j3Var.j = w10.booleanValue();
                                break;
                            } else {
                                continue;
                            }
                        case '\b':
                            String i08 = b2Var.i0();
                            if (i08 != null) {
                                j3Var.f16554r = i08;
                                break;
                            } else {
                                continue;
                            }
                        case '\t':
                            HashMap Y = b2Var.Y(iLogger, new io.sentry.clientreport.b(2));
                            if (Y != null) {
                                j3Var.A.putAll(Y);
                                break;
                            } else {
                                continue;
                            }
                        case '\n':
                            String i09 = b2Var.i0();
                            if (i09 != null) {
                                j3Var.f16550m = i09;
                                break;
                            }
                            break;
                        case 11:
                            List list = (List) b2Var.d0();
                            if (list != null) {
                                j3Var.f16549l = list;
                                break;
                            }
                            break;
                        case '\f':
                            String i010 = b2Var.i0();
                            if (i010 != null) {
                                j3Var.f16555s = i010;
                                break;
                            }
                            break;
                        case '\r':
                            String i011 = b2Var.i0();
                            if (i011 != null) {
                                j3Var.f16556t = i011;
                                break;
                            }
                            break;
                        case 14:
                            String i012 = b2Var.i0();
                            if (i012 != null) {
                                j3Var.f16560x = i012;
                                break;
                            }
                            break;
                        case 15:
                            Date y5 = b2Var.y(iLogger);
                            if (y5 != null) {
                                j3Var.f16562z = y5;
                                break;
                            }
                            break;
                        case 16:
                            String i013 = b2Var.i0();
                            if (i013 != null) {
                                j3Var.q = i013;
                                break;
                            }
                            break;
                        case 17:
                            String i014 = b2Var.i0();
                            if (i014 != null) {
                                j3Var.f16546h = i014;
                                break;
                            }
                            break;
                        case 18:
                            String i015 = b2Var.i0();
                            if (i015 != null) {
                                j3Var.f16548k = i015;
                                break;
                            }
                            break;
                        case 19:
                            String i016 = b2Var.i0();
                            if (i016 != null) {
                                j3Var.f16557u = i016;
                                break;
                            }
                            break;
                        case 20:
                            String i017 = b2Var.i0();
                            if (i017 != null) {
                                j3Var.f16547i = i017;
                                break;
                            }
                            break;
                        case 21:
                            String i018 = b2Var.i0();
                            if (i018 != null) {
                                j3Var.f16561y = i018;
                                break;
                            }
                            break;
                        case zg.g.DEBUGMODULES_FIELD_NUMBER /* 22 */:
                            String i019 = b2Var.i0();
                            if (i019 != null) {
                                j3Var.f16558v = i019;
                                break;
                            }
                            break;
                        case zg.g.ISCRASH_FIELD_NUMBER /* 23 */:
                            String i020 = b2Var.i0();
                            if (i020 != null) {
                                j3Var.f16551n = i020;
                                break;
                            }
                            break;
                        case zg.g.FORCEINGEST_FIELD_NUMBER /* 24 */:
                            String i021 = b2Var.i0();
                            if (i021 != null) {
                                j3Var.B = i021;
                                break;
                            }
                            break;
                        case C0122e9.F /* 25 */:
                            ArrayList R = b2Var.R(iLogger, new d(4));
                            if (R != null) {
                                j3Var.f16553p.addAll(R);
                                break;
                            }
                            break;
                        default:
                            if (concurrentHashMap2 == null) {
                                concurrentHashMap2 = new ConcurrentHashMap();
                            }
                            b2Var.j0(iLogger, concurrentHashMap2, c03);
                            continue;
                    }
                }
                j3Var.C = concurrentHashMap2;
                b2Var.r();
                return j3Var;
            case 4:
                b2Var.k();
                k3 k3Var = new k3(y2.f17254a, 0L, 0L);
                ConcurrentHashMap concurrentHashMap3 = null;
                while (b2Var.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String c04 = b2Var.c0();
                    c04.getClass();
                    switch (c04.hashCode()) {
                        case -112372011:
                            if (c04.equals("relative_start_ns")) {
                                c8 = 0;
                                break;
                            }
                            c8 = 65535;
                            break;
                        case -84607876:
                            if (c04.equals("relative_end_ns")) {
                                c8 = 1;
                                break;
                            }
                            c8 = 65535;
                            break;
                        case 3355:
                            if (c04.equals("id")) {
                                c8 = 2;
                                break;
                            }
                            c8 = 65535;
                            break;
                        case 3373707:
                            if (c04.equals("name")) {
                                c8 = 3;
                                break;
                            }
                            c8 = 65535;
                            break;
                        case 1270300245:
                            if (c04.equals("trace_id")) {
                                c8 = 4;
                                break;
                            }
                            c8 = 65535;
                            break;
                        case 1566648660:
                            if (c04.equals("relative_cpu_end_ms")) {
                                c8 = 5;
                                break;
                            }
                            c8 = 65535;
                            break;
                        case 1902256621:
                            if (c04.equals("relative_cpu_start_ms")) {
                                c8 = 6;
                                break;
                            }
                            c8 = 65535;
                            break;
                        default:
                            c8 = 65535;
                            break;
                    }
                    switch (c8) {
                        case 0:
                            Long W = b2Var.W();
                            if (W != null) {
                                k3Var.f16600d = W;
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            Long W2 = b2Var.W();
                            if (W2 != null) {
                                k3Var.f16601e = W2;
                                break;
                            } else {
                                break;
                            }
                        case 2:
                            String i022 = b2Var.i0();
                            if (i022 != null) {
                                k3Var.f16597a = i022;
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            String i023 = b2Var.i0();
                            if (i023 != null) {
                                k3Var.f16599c = i023;
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            String i024 = b2Var.i0();
                            if (i024 != null) {
                                k3Var.f16598b = i024;
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            Long W3 = b2Var.W();
                            if (W3 != null) {
                                k3Var.f16603g = W3;
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            Long W4 = b2Var.W();
                            if (W4 != null) {
                                k3Var.f16602f = W4;
                                break;
                            } else {
                                break;
                            }
                        default:
                            if (concurrentHashMap3 == null) {
                                concurrentHashMap3 = new ConcurrentHashMap();
                            }
                            b2Var.j0(iLogger, concurrentHashMap3, c04);
                            break;
                    }
                }
                k3Var.f16604h = concurrentHashMap3;
                b2Var.r();
                return k3Var;
            case 5:
                o3 o3Var = new o3();
                b2Var.k();
                HashMap hashMap = null;
                Integer num = null;
                while (b2Var.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String c05 = b2Var.c0();
                    c05.getClass();
                    if (c05.equals("segment_id")) {
                        num = b2Var.O();
                    } else {
                        if (hashMap == null) {
                            hashMap = new HashMap();
                        }
                        b2Var.j0(iLogger, hashMap, c05);
                    }
                }
                b2Var.r();
                b2Var.o0(true);
                List list2 = (List) b2Var.d0();
                b2Var.o0(false);
                if (list2 != null) {
                    arrayList = new ArrayList(list2.size());
                    for (Object obj : list2) {
                        if (obj instanceof Map) {
                            Map map = (Map) obj;
                            b2 b2Var2 = new b2(map);
                            for (Map.Entry entry : map.entrySet()) {
                                String str = (String) entry.getKey();
                                Object value = entry.getValue();
                                if (str.equals("type")) {
                                    io.sentry.rrweb.c cVar = io.sentry.rrweb.c.values()[((Integer) value).intValue()];
                                    int i12 = n3.f16662b[cVar.ordinal()];
                                    if (i12 == 1) {
                                        Map map2 = (Map) map.get("data");
                                        if (map2 == null) {
                                            map2 = Collections.EMPTY_MAP;
                                        }
                                        Integer num2 = (Integer) map2.get(AdRevenueConstants.SOURCE_KEY);
                                        if (num2 != null) {
                                            io.sentry.rrweb.d dVar = io.sentry.rrweb.d.values()[num2.intValue()];
                                            int i13 = n3.f16661a[dVar.ordinal()];
                                            if (i13 == 1) {
                                                arrayList.add(io.sentry.protocol.c0.c(b2Var2, iLogger));
                                            } else if (i13 != 2) {
                                                iLogger.h(b5.DEBUG, "Unsupported rrweb incremental snapshot type %s", dVar);
                                            } else {
                                                arrayList.add(io.sentry.protocol.c0.d(b2Var2, iLogger));
                                            }
                                        }
                                    } else if (i12 == 2) {
                                        arrayList.add(io.sentry.protocol.c0.e(b2Var2, iLogger));
                                    } else if (i12 == 3) {
                                        Map map3 = (Map) map.get("data");
                                        if (map3 == null) {
                                            map3 = Collections.EMPTY_MAP;
                                        }
                                        String str2 = (String) map3.get("tag");
                                        if (str2 != null) {
                                            switch (str2.hashCode()) {
                                                case -226040934:
                                                    if (str2.equals("performanceSpan")) {
                                                        c10 = 0;
                                                        break;
                                                    }
                                                    c10 = 65535;
                                                    break;
                                                case 112202875:
                                                    if (str2.equals("video")) {
                                                        c10 = 1;
                                                        break;
                                                    }
                                                    c10 = 65535;
                                                    break;
                                                case 1106718723:
                                                    if (str2.equals("breadcrumb")) {
                                                        c10 = 2;
                                                        break;
                                                    }
                                                    c10 = 65535;
                                                    break;
                                                default:
                                                    c10 = 65535;
                                                    break;
                                            }
                                            switch (c10) {
                                                case 0:
                                                    arrayList.add(io.sentry.protocol.c0.f(b2Var2, iLogger));
                                                    break;
                                                case 1:
                                                    arrayList.add(io.sentry.protocol.c0.g(b2Var2, iLogger));
                                                    break;
                                                case 2:
                                                    arrayList.add(io.sentry.protocol.c0.b(b2Var2, iLogger));
                                                    break;
                                                default:
                                                    iLogger.h(b5.DEBUG, "Unsupported rrweb event type %s", cVar);
                                                    break;
                                            }
                                        }
                                    } else {
                                        iLogger.h(b5.DEBUG, "Unsupported rrweb event type %s", cVar);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    arrayList = null;
                }
                o3Var.f16684a = num;
                o3Var.f16685b = arrayList;
                o3Var.f16686c = hashMap;
                return o3Var;
            case 6:
                b2Var.k();
                e4 e4Var = new e4();
                e4Var.f16371c = false;
                e4Var.f16372d = null;
                e4Var.f16369a = false;
                e4Var.f16370b = null;
                e4Var.f16377i = false;
                e4Var.f16373e = null;
                e4Var.f16374f = false;
                e4Var.f16375g = false;
                e4Var.f16379l = i3.MANUAL;
                e4Var.f16376h = 0;
                e4Var.j = true;
                e4Var.f16378k = false;
                ConcurrentHashMap concurrentHashMap4 = null;
                while (b2Var.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String c06 = b2Var.c0();
                    c06.getClass();
                    switch (c06.hashCode()) {
                        case -801141276:
                            if (c06.equals("is_enable_app_start_profiling")) {
                                c11 = 0;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case -566246656:
                            if (c06.equals("trace_sampled")) {
                                c11 = 1;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case -450071601:
                            if (c06.equals("profiling_traces_dir_path")) {
                                c11 = 2;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case -436975123:
                            if (c06.equals("is_continuous_profiling_enabled")) {
                                c11 = 3;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case -116896685:
                            if (c06.equals("is_profiling_enabled")) {
                                c11 = 4;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case -104146616:
                            if (c06.equals("is_start_profiler_on_app_start")) {
                                c11 = 5;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case -69617820:
                            if (c06.equals("profile_sampled")) {
                                c11 = 6;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 401419348:
                            if (c06.equals("profile_lifecycle")) {
                                c11 = 7;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 1401020980:
                            if (c06.equals("continuous_profile_sampled")) {
                                c11 = '\b';
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 1583866442:
                            if (c06.equals("profiling_traces_hz")) {
                                c11 = '\t';
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 1653938779:
                            if (c06.equals("trace_sample_rate")) {
                                c11 = '\n';
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 2140552383:
                            if (c06.equals("profile_sample_rate")) {
                                c11 = 11;
                                break;
                            }
                            c11 = 65535;
                            break;
                        default:
                            c11 = 65535;
                            break;
                    }
                    switch (c11) {
                        case 0:
                            Boolean w11 = b2Var.w();
                            if (w11 != null) {
                                e4Var.j = w11.booleanValue();
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            Boolean w12 = b2Var.w();
                            if (w12 != null) {
                                e4Var.f16371c = w12.booleanValue();
                                break;
                            } else {
                                break;
                            }
                        case 2:
                            String i025 = b2Var.i0();
                            if (i025 != null) {
                                e4Var.f16373e = i025;
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            Boolean w13 = b2Var.w();
                            if (w13 != null) {
                                e4Var.f16375g = w13.booleanValue();
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            Boolean w14 = b2Var.w();
                            if (w14 != null) {
                                e4Var.f16374f = w14.booleanValue();
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            Boolean w15 = b2Var.w();
                            if (w15 != null) {
                                e4Var.f16378k = w15.booleanValue();
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            Boolean w16 = b2Var.w();
                            if (w16 != null) {
                                e4Var.f16369a = w16.booleanValue();
                                break;
                            } else {
                                break;
                            }
                        case 7:
                            String i026 = b2Var.i0();
                            if (i026 != null) {
                                try {
                                    e4Var.f16379l = i3.valueOf(i026);
                                    break;
                                } catch (IllegalArgumentException unused) {
                                    iLogger.h(b5.ERROR, "Error when deserializing ProfileLifecycle: ".concat(i026), new Object[0]);
                                    break;
                                }
                            } else {
                                break;
                            }
                        case '\b':
                            Boolean w17 = b2Var.w();
                            if (w17 != null) {
                                e4Var.f16377i = w17.booleanValue();
                                break;
                            } else {
                                break;
                            }
                        case '\t':
                            Integer O2 = b2Var.O();
                            if (O2 != null) {
                                e4Var.f16376h = O2.intValue();
                                break;
                            } else {
                                break;
                            }
                        case '\n':
                            Double C = b2Var.C();
                            if (C != null) {
                                e4Var.f16372d = C;
                                break;
                            } else {
                                break;
                            }
                        case 11:
                            Double C2 = b2Var.C();
                            if (C2 != null) {
                                e4Var.f16370b = C2;
                                break;
                            } else {
                                break;
                            }
                        default:
                            if (concurrentHashMap4 == null) {
                                concurrentHashMap4 = new ConcurrentHashMap();
                            }
                            b2Var.j0(iLogger, concurrentHashMap4, c06);
                            break;
                    }
                }
                e4Var.f16380m = concurrentHashMap4;
                b2Var.r();
                return e4Var;
            case 7:
                b2Var.k();
                io.sentry.protocol.t tVar = null;
                t6 t6Var = null;
                Date date = null;
                HashMap hashMap2 = null;
                io.sentry.protocol.v vVar3 = null;
                while (b2Var.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String c07 = b2Var.c0();
                    c07.getClass();
                    switch (c07.hashCode()) {
                        case 113722:
                            if (c07.equals("sdk")) {
                                c12 = 0;
                                break;
                            }
                            c12 = 65535;
                            break;
                        case 110620997:
                            if (c07.equals("trace")) {
                                c12 = 1;
                                break;
                            }
                            c12 = 65535;
                            break;
                        case 278118624:
                            if (c07.equals("event_id")) {
                                c12 = 2;
                                break;
                            }
                            c12 = 65535;
                            break;
                        case 1980389946:
                            if (c07.equals("sent_at")) {
                                c12 = 3;
                                break;
                            }
                            c12 = 65535;
                            break;
                        default:
                            c12 = 65535;
                            break;
                    }
                    switch (c12) {
                        case 0:
                            tVar = (io.sentry.protocol.t) b2Var.f0(iLogger, new io.sentry.clientreport.b(21));
                            break;
                        case 1:
                            t6Var = (t6) b2Var.f0(iLogger, new d(25));
                            break;
                        case 2:
                            vVar3 = (io.sentry.protocol.v) b2Var.f0(iLogger, new io.sentry.clientreport.b(23));
                            break;
                        case 3:
                            date = b2Var.y(iLogger);
                            break;
                        default:
                            if (hashMap2 == null) {
                                hashMap2 = new HashMap();
                            }
                            b2Var.j0(iLogger, hashMap2, c07);
                            break;
                    }
                }
                m4 m4Var = new m4(vVar3, tVar, t6Var);
                m4Var.f16644d = date;
                m4Var.f16645e = hashMap2;
                b2Var.r();
                return m4Var;
            case 8:
                b2Var.k();
                a5 a5Var = null;
                int i14 = 0;
                String str3 = null;
                String str4 = null;
                String str5 = null;
                String str6 = null;
                Integer num3 = null;
                HashMap hashMap3 = null;
                while (b2Var.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String c08 = b2Var.c0();
                    c08.getClass();
                    switch (c08.hashCode()) {
                        case -1966910237:
                            if (c08.equals("item_count")) {
                                c13 = 0;
                                break;
                            }
                            c13 = 65535;
                            break;
                        case -1106363674:
                            if (c08.equals("length")) {
                                c13 = 1;
                                break;
                            }
                            c13 = 65535;
                            break;
                        case -734768633:
                            if (c08.equals("filename")) {
                                c13 = 2;
                                break;
                            }
                            c13 = 65535;
                            break;
                        case -672977706:
                            if (c08.equals("attachment_type")) {
                                c13 = 3;
                                break;
                            }
                            c13 = 65535;
                            break;
                        case 3575610:
                            if (c08.equals("type")) {
                                c13 = 4;
                                break;
                            }
                            c13 = 65535;
                            break;
                        case 831846208:
                            if (c08.equals("content_type")) {
                                c13 = 5;
                                break;
                            }
                            c13 = 65535;
                            break;
                        case 1874684019:
                            if (c08.equals("platform")) {
                                c13 = 6;
                                break;
                            }
                            c13 = 65535;
                            break;
                        default:
                            c13 = 65535;
                            break;
                    }
                    switch (c13) {
                        case 0:
                            num3 = b2Var.O();
                            continue;
                        case 1:
                            i14 = b2Var.N();
                            continue;
                        case 2:
                            str4 = b2Var.i0();
                            continue;
                        case 3:
                            str5 = b2Var.i0();
                            continue;
                        case 4:
                            a5Var = (a5) b2Var.f0(iLogger, new d(10));
                            continue;
                        case 5:
                            str3 = b2Var.i0();
                            break;
                        case 6:
                            str6 = b2Var.i0();
                            break;
                        default:
                            if (hashMap3 == null) {
                                hashMap3 = new HashMap();
                            }
                            b2Var.j0(iLogger, hashMap3, c08);
                            break;
                    }
                }
                if (a5Var == null) {
                    Throwable illegalStateException = new IllegalStateException("Missing required field \"type\"");
                    iLogger.e(b5.ERROR, "Missing required field \"type\"", illegalStateException);
                    throw illegalStateException;
                }
                s4 s4Var = new s4(a5Var, i14, str3, str4, str5, str6, num3);
                s4Var.f17082i = hashMap3;
                b2Var.r();
                return s4Var;
            case 9:
                b2Var.k();
                t4 t4Var = new t4();
                ConcurrentHashMap concurrentHashMap5 = null;
                while (b2Var.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String c09 = b2Var.c0();
                    c09.getClass();
                    switch (c09.hashCode()) {
                        case -1375934236:
                            if (c09.equals("fingerprint")) {
                                c14 = 0;
                                break;
                            }
                            c14 = 65535;
                            break;
                        case -1337936983:
                            if (c09.equals("threads")) {
                                c14 = 1;
                                break;
                            }
                            c14 = 65535;
                            break;
                        case -1097337456:
                            if (c09.equals("logger")) {
                                c14 = 2;
                                break;
                            }
                            c14 = 65535;
                            break;
                        case 55126294:
                            if (c09.equals("timestamp")) {
                                c14 = 3;
                                break;
                            }
                            c14 = 65535;
                            break;
                        case 102865796:
                            if (c09.equals("level")) {
                                c14 = 4;
                                break;
                            }
                            c14 = 65535;
                            break;
                        case 954925063:
                            if (c09.equals(LiveTable.messageColumn)) {
                                c14 = 5;
                                break;
                            }
                            c14 = 65535;
                            break;
                        case 1227433863:
                            if (c09.equals("modules")) {
                                c14 = 6;
                                break;
                            }
                            c14 = 65535;
                            break;
                        case 1481625679:
                            if (c09.equals("exception")) {
                                c14 = 7;
                                break;
                            }
                            c14 = 65535;
                            break;
                        case 2141246174:
                            if (c09.equals("transaction")) {
                                c14 = '\b';
                                break;
                            }
                            c14 = 65535;
                            break;
                        default:
                            c14 = 65535;
                            break;
                    }
                    switch (c14) {
                        case 0:
                            List list3 = (List) b2Var.d0();
                            if (list3 != null) {
                                t4Var.f17098w = list3;
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            b2Var.k();
                            b2Var.c0();
                            t4Var.f17094s = new com.android.billingclient.api.m(b2Var.R(iLogger, new io.sentry.protocol.c0(0)));
                            b2Var.r();
                            break;
                        case 2:
                            t4Var.f17093r = b2Var.i0();
                            break;
                        case 3:
                            Date y10 = b2Var.y(iLogger);
                            if (y10 != null) {
                                t4Var.f17092p = y10;
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            t4Var.f17096u = (b5) b2Var.f0(iLogger, new d(11));
                            break;
                        case 5:
                            t4Var.q = (io.sentry.protocol.n) b2Var.f0(iLogger, new io.sentry.clientreport.b(17));
                            break;
                        case 6:
                            t4Var.f17100y = com.google.android.play.core.appupdate.b.A((Map) b2Var.d0());
                            break;
                        case 7:
                            b2Var.k();
                            b2Var.c0();
                            t4Var.f17095t = new com.android.billingclient.api.m(b2Var.R(iLogger, new io.sentry.clientreport.b(22)));
                            b2Var.r();
                            break;
                        case '\b':
                            t4Var.f17097v = b2Var.i0();
                            break;
                        default:
                            if (f3.x.Z(t4Var, c09, b2Var, iLogger)) {
                                break;
                            } else {
                                if (concurrentHashMap5 == null) {
                                    concurrentHashMap5 = new ConcurrentHashMap();
                                }
                                b2Var.j0(iLogger, concurrentHashMap5, c09);
                                break;
                            }
                    }
                }
                t4Var.f17099x = concurrentHashMap5;
                b2Var.r();
                return t4Var;
            case 10:
                return a5.valueOfLabel(b2Var.h0().toLowerCase(Locale.ROOT));
            case 11:
                return b5.valueOf(b2Var.h0().toUpperCase(Locale.ROOT));
            case 12:
                c5 c5Var = new c5();
                b2Var.k();
                ConcurrentHashMap concurrentHashMap6 = null;
                while (b2Var.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String c010 = b2Var.c0();
                    c010.getClass();
                    switch (c010.hashCode()) {
                        case -1877165340:
                            if (c010.equals("package_name")) {
                                c15 = 0;
                                break;
                            }
                            c15 = 65535;
                            break;
                        case -1562235024:
                            if (c010.equals("thread_id")) {
                                c15 = 1;
                                break;
                            }
                            c15 = 65535;
                            break;
                        case -1147692044:
                            if (c010.equals("address")) {
                                c15 = 2;
                                break;
                            }
                            c15 = 65535;
                            break;
                        case -290474766:
                            if (c010.equals("class_name")) {
                                c15 = 3;
                                break;
                            }
                            c15 = 65535;
                            break;
                        case 3575610:
                            if (c010.equals("type")) {
                                c15 = 4;
                                break;
                            }
                            c15 = 65535;
                            break;
                        default:
                            c15 = 65535;
                            break;
                    }
                    switch (c15) {
                        case 0:
                            c5Var.f16235c = b2Var.i0();
                            break;
                        case 1:
                            c5Var.f16237e = b2Var.W();
                            break;
                        case 2:
                            c5Var.f16234b = b2Var.i0();
                            break;
                        case 3:
                            c5Var.f16236d = b2Var.i0();
                            break;
                        case 4:
                            c5Var.f16233a = b2Var.N();
                            break;
                        default:
                            if (concurrentHashMap6 == null) {
                                concurrentHashMap6 = new ConcurrentHashMap();
                            }
                            b2Var.j0(iLogger, concurrentHashMap6, c010);
                            break;
                    }
                }
                c5Var.f16238f = concurrentHashMap6;
                b2Var.r();
                return c5Var;
            case 13:
                b2Var.k();
                Double d10 = null;
                String str7 = null;
                HashMap hashMap4 = null;
                f5 f5Var = null;
                HashMap hashMap5 = null;
                Integer num4 = null;
                io.sentry.protocol.v vVar4 = null;
                while (b2Var.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String c011 = b2Var.c0();
                    c011.getClass();
                    switch (c011.hashCode()) {
                        case -1615012149:
                            if (c011.equals("severity_number")) {
                                c16 = 0;
                                break;
                            }
                            c16 = 65535;
                            break;
                        case 3029410:
                            if (c011.equals("body")) {
                                c16 = 1;
                                break;
                            }
                            c16 = 65535;
                            break;
                        case 55126294:
                            if (c011.equals("timestamp")) {
                                c16 = 2;
                                break;
                            }
                            c16 = 65535;
                            break;
                        case 102865796:
                            if (c011.equals("level")) {
                                c16 = 3;
                                break;
                            }
                            c16 = 65535;
                            break;
                        case 405645655:
                            if (c011.equals("attributes")) {
                                c16 = 4;
                                break;
                            }
                            c16 = 65535;
                            break;
                        case 1270300245:
                            if (c011.equals("trace_id")) {
                                c16 = 5;
                                break;
                            }
                            c16 = 65535;
                            break;
                        default:
                            c16 = 65535;
                            break;
                    }
                    switch (c16) {
                        case 0:
                            num4 = b2Var.O();
                            continue;
                        case 1:
                            str7 = b2Var.i0();
                            continue;
                        case 2:
                            d10 = b2Var.C();
                            continue;
                        case 3:
                            f5Var = (f5) b2Var.f0(iLogger, new d(16));
                            continue;
                        case 4:
                            hashMap5 = b2Var.Y(iLogger, new d(14));
                            continue;
                        case 5:
                            vVar4 = (io.sentry.protocol.v) b2Var.f0(iLogger, new io.sentry.clientreport.b(23));
                            break;
                        default:
                            if (hashMap4 == null) {
                                hashMap4 = new HashMap();
                            }
                            b2Var.j0(iLogger, hashMap4, c011);
                            break;
                    }
                }
                b2Var.r();
                if (vVar4 == null) {
                    Throwable illegalStateException2 = new IllegalStateException("Missing required field \"trace_id\"");
                    iLogger.e(b5.ERROR, "Missing required field \"trace_id\"", illegalStateException2);
                    throw illegalStateException2;
                }
                if (d10 == null) {
                    Throwable illegalStateException3 = new IllegalStateException("Missing required field \"timestamp\"");
                    iLogger.e(b5.ERROR, "Missing required field \"timestamp\"", illegalStateException3);
                    throw illegalStateException3;
                }
                if (str7 == null) {
                    Throwable illegalStateException4 = new IllegalStateException("Missing required field \"body\"");
                    iLogger.e(b5.ERROR, "Missing required field \"body\"", illegalStateException4);
                    throw illegalStateException4;
                }
                if (f5Var == null) {
                    Throwable illegalStateException5 = new IllegalStateException("Missing required field \"level\"");
                    iLogger.e(b5.ERROR, "Missing required field \"level\"", illegalStateException5);
                    throw illegalStateException5;
                }
                d5 d5Var = new d5(vVar4, d10, str7, f5Var);
                d5Var.f16318f = hashMap5;
                d5Var.f16317e = num4;
                d5Var.f16319g = hashMap4;
                return d5Var;
            case 14:
                b2Var.k();
                Object obj2 = null;
                AbstractMap abstractMap = null;
                String str8 = null;
                while (b2Var.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String c012 = b2Var.c0();
                    c012.getClass();
                    if (c012.equals("type")) {
                        str8 = b2Var.i0();
                    } else if (c012.equals("value")) {
                        obj2 = b2Var.d0();
                    } else {
                        if (abstractMap == null) {
                            abstractMap = new HashMap();
                        }
                        b2Var.j0(iLogger, abstractMap, c012);
                    }
                }
                b2Var.r();
                if (str8 != null) {
                    io.sentry.protocol.l lVar = new io.sentry.protocol.l(obj2, str8);
                    lVar.f16854d = abstractMap;
                    return lVar;
                }
                Throwable illegalStateException6 = new IllegalStateException("Missing required field \"type\"");
                iLogger.e(b5.ERROR, "Missing required field \"type\"", illegalStateException6);
                throw illegalStateException6;
            case 15:
                b2Var.k();
                HashMap hashMap6 = null;
                ArrayList arrayList3 = null;
                while (b2Var.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String c013 = b2Var.c0();
                    c013.getClass();
                    if (c013.equals("items")) {
                        arrayList3 = b2Var.R(iLogger, new d(13));
                    } else {
                        if (hashMap6 == null) {
                            hashMap6 = new HashMap();
                        }
                        b2Var.j0(iLogger, hashMap6, c013);
                    }
                }
                b2Var.r();
                if (arrayList3 != null) {
                    e5 e5Var = new e5(arrayList3);
                    e5Var.f16382b = hashMap6;
                    return e5Var;
                }
                Throwable illegalStateException7 = new IllegalStateException("Missing required field \"items\"");
                iLogger.e(b5.ERROR, "Missing required field \"items\"", illegalStateException7);
                throw illegalStateException7;
            case 16:
                return f5.valueOf(b2Var.h0().toUpperCase(Locale.ROOT));
            case 17:
                b2Var.k();
                String str9 = null;
                Double d11 = null;
                String str10 = null;
                HashMap hashMap7 = null;
                String str11 = null;
                Double d12 = null;
                HashMap hashMap8 = null;
                p6 p6Var = null;
                io.sentry.protocol.v vVar5 = null;
                while (true) {
                    HashMap hashMap9 = hashMap7;
                    if (b2Var.l0() != io.sentry.vendor.gson.stream.b.NAME) {
                        b2Var.r();
                        if (vVar5 == null) {
                            Throwable illegalStateException8 = new IllegalStateException("Missing required field \"trace_id\"");
                            iLogger.e(b5.ERROR, "Missing required field \"trace_id\"", illegalStateException8);
                            throw illegalStateException8;
                        }
                        if (d11 == null) {
                            Throwable illegalStateException9 = new IllegalStateException("Missing required field \"timestamp\"");
                            iLogger.e(b5.ERROR, "Missing required field \"timestamp\"", illegalStateException9);
                            throw illegalStateException9;
                        }
                        if (str10 == null) {
                            Throwable illegalStateException10 = new IllegalStateException("Missing required field \"type\"");
                            iLogger.e(b5.ERROR, "Missing required field \"type\"", illegalStateException10);
                            throw illegalStateException10;
                        }
                        if (str11 == null) {
                            Throwable illegalStateException11 = new IllegalStateException("Missing required field \"name\"");
                            iLogger.e(b5.ERROR, "Missing required field \"name\"", illegalStateException11);
                            throw illegalStateException11;
                        }
                        if (d12 == null) {
                            Throwable illegalStateException12 = new IllegalStateException("Missing required field \"value\"");
                            iLogger.e(b5.ERROR, "Missing required field \"value\"", illegalStateException12);
                            throw illegalStateException12;
                        }
                        h5 h5Var = new h5();
                        h5Var.f16469a = vVar5;
                        h5Var.f16471c = d11;
                        h5Var.f16472d = str11;
                        h5Var.f16474f = str10;
                        h5Var.f16475g = d12;
                        h5Var.f16476h = hashMap8;
                        h5Var.f16470b = p6Var;
                        h5Var.f16473e = str9;
                        h5Var.f16477i = hashMap9;
                        return h5Var;
                    }
                    String c014 = b2Var.c0();
                    c014.getClass();
                    switch (c014.hashCode()) {
                        case -2011840976:
                            if (c014.equals("span_id")) {
                                c17 = 0;
                                break;
                            }
                            c17 = 65535;
                            break;
                        case 3373707:
                            if (c014.equals("name")) {
                                c17 = 1;
                                break;
                            }
                            c17 = 65535;
                            break;
                        case 3575610:
                            if (c014.equals("type")) {
                                c17 = 2;
                                break;
                            }
                            c17 = 65535;
                            break;
                        case 3594628:
                            if (c014.equals("unit")) {
                                c17 = 3;
                                break;
                            }
                            c17 = 65535;
                            break;
                        case 55126294:
                            if (c014.equals("timestamp")) {
                                c17 = 4;
                                break;
                            }
                            c17 = 65535;
                            break;
                        case 111972721:
                            if (c014.equals("value")) {
                                c17 = 5;
                                break;
                            }
                            c17 = 65535;
                            break;
                        case 405645655:
                            if (c014.equals("attributes")) {
                                c17 = 6;
                                break;
                            }
                            c17 = 65535;
                            break;
                        case 1270300245:
                            if (c014.equals("trace_id")) {
                                c17 = 7;
                                break;
                            }
                            c17 = 65535;
                            break;
                        default:
                            c17 = 65535;
                            break;
                    }
                    switch (c17) {
                        case 0:
                            p6Var = (p6) b2Var.f0(iLogger, new d(23));
                            break;
                        case 1:
                            str11 = b2Var.i0();
                            break;
                        case 2:
                            str10 = b2Var.i0();
                            break;
                        case 3:
                            str9 = b2Var.i0();
                            break;
                        case 4:
                            d11 = b2Var.C();
                            break;
                        case 5:
                            d12 = b2Var.C();
                            break;
                        case 6:
                            hashMap8 = b2Var.Y(iLogger, new d(14));
                            break;
                        case 7:
                            vVar5 = (io.sentry.protocol.v) b2Var.f0(iLogger, new io.sentry.clientreport.b(23));
                            break;
                        default:
                            hashMap7 = hashMap9 == null ? new HashMap() : hashMap9;
                            b2Var.j0(iLogger, hashMap7, c014);
                            continue;
                    }
                    hashMap7 = hashMap9;
                }
            case 18:
                b2Var.k();
                HashMap hashMap10 = null;
                ArrayList arrayList4 = null;
                while (b2Var.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String c015 = b2Var.c0();
                    c015.getClass();
                    if (c015.equals("items")) {
                        arrayList4 = b2Var.R(iLogger, new d(17));
                    } else {
                        if (hashMap10 == null) {
                            hashMap10 = new HashMap();
                        }
                        b2Var.j0(iLogger, hashMap10, c015);
                    }
                }
                b2Var.r();
                if (arrayList4 != null) {
                    i5 i5Var = new i5(arrayList4);
                    i5Var.f16490b = hashMap10;
                    return i5Var;
                }
                Throwable illegalStateException13 = new IllegalStateException("Missing required field \"items\"");
                iLogger.e(b5.ERROR, "Missing required field \"items\"", illegalStateException13);
                throw illegalStateException13;
            case 19:
                d6 d6Var = new d6();
                b2Var.k();
                c6 c6Var = null;
                Date date2 = null;
                HashMap hashMap11 = null;
                io.sentry.protocol.v vVar6 = null;
                Date date3 = null;
                List list4 = null;
                List list5 = null;
                List list6 = null;
                String str12 = null;
                Integer num5 = null;
                while (b2Var.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String c016 = b2Var.c0();
                    c016.getClass();
                    switch (c016.hashCode()) {
                        case -454767501:
                            if (c016.equals("replay_id")) {
                                c18 = 0;
                                break;
                            }
                            c18 = 65535;
                            break;
                        case -264026847:
                            if (c016.equals("replay_start_timestamp")) {
                                c18 = 1;
                                break;
                            }
                            c18 = 65535;
                            break;
                        case 3575610:
                            if (c016.equals("type")) {
                                c18 = 2;
                                break;
                            }
                            c18 = 65535;
                            break;
                        case 3598564:
                            if (c016.equals("urls")) {
                                c18 = 3;
                                break;
                            }
                            c18 = 65535;
                            break;
                        case 55126294:
                            if (c016.equals("timestamp")) {
                                c18 = 4;
                                break;
                            }
                            c18 = 65535;
                            break;
                        case 329864193:
                            if (c016.equals("error_ids")) {
                                c18 = 5;
                                break;
                            }
                            c18 = 65535;
                            break;
                        case 724602046:
                            if (c016.equals("trace_ids")) {
                                c18 = 6;
                                break;
                            }
                            c18 = 65535;
                            break;
                        case 1055447186:
                            if (c016.equals("replay_type")) {
                                c18 = 7;
                                break;
                            }
                            c18 = 65535;
                            break;
                        case 1077649831:
                            if (c016.equals("segment_id")) {
                                c18 = '\b';
                                break;
                            }
                            c18 = 65535;
                            break;
                        default:
                            c18 = 65535;
                            break;
                    }
                    switch (c18) {
                        case 0:
                            vVar6 = (io.sentry.protocol.v) b2Var.f0(iLogger, new io.sentry.clientreport.b(23));
                            break;
                        case 1:
                            date3 = b2Var.y(iLogger);
                            break;
                        case 2:
                            str12 = b2Var.i0();
                            break;
                        case 3:
                            list4 = (List) b2Var.d0();
                            break;
                        case 4:
                            date2 = b2Var.y(iLogger);
                            break;
                        case 5:
                            list5 = (List) b2Var.d0();
                            break;
                        case 6:
                            list6 = (List) b2Var.d0();
                            break;
                        case 7:
                            c6Var = (c6) b2Var.f0(iLogger, new d(20));
                            break;
                        case '\b':
                            num5 = b2Var.O();
                            break;
                        default:
                            if (f3.x.Z(d6Var, c016, b2Var, iLogger)) {
                                break;
                            } else {
                                if (hashMap11 == null) {
                                    hashMap11 = new HashMap();
                                }
                                b2Var.j0(iLogger, hashMap11, c016);
                                break;
                            }
                    }
                }
                b2Var.r();
                if (str12 != null) {
                    d6Var.q = str12;
                }
                if (c6Var != null) {
                    d6Var.f16321r = c6Var;
                }
                if (num5 != null) {
                    d6Var.f16323t = num5.intValue();
                }
                if (date2 != null) {
                    d6Var.f16324u = date2;
                }
                d6Var.f16322s = vVar6;
                d6Var.f16325v = date3;
                d6Var.f16326w = list4;
                d6Var.f16327x = list5;
                d6Var.f16328y = list6;
                d6Var.f16329z = hashMap11;
                return d6Var;
            case 20:
                return c6.valueOf(b2Var.h0().toUpperCase(Locale.ROOT));
            case 21:
                b2Var.k();
                ConcurrentHashMap concurrentHashMap7 = null;
                Integer num6 = null;
                k6 k6Var = null;
                Date date4 = null;
                Date date5 = null;
                String str13 = null;
                String str14 = null;
                Boolean bool = null;
                Long l6 = null;
                Double d13 = null;
                String str15 = null;
                String str16 = null;
                String str17 = null;
                String str18 = null;
                String str19 = null;
                while (b2Var.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String c017 = b2Var.c0();
                    c017.getClass();
                    switch (c017.hashCode()) {
                        case -1992012396:
                            if (c017.equals("duration")) {
                                c19 = 0;
                                break;
                            }
                            c19 = 65535;
                            break;
                        case -1897185151:
                            if (c017.equals("started")) {
                                c19 = 1;
                                break;
                            }
                            c19 = 65535;
                            break;
                        case -1294635157:
                            if (c017.equals("errors")) {
                                c19 = 2;
                                break;
                            }
                            c19 = 65535;
                            break;
                        case -892481550:
                            if (c017.equals(PredictionTable.statusColumn)) {
                                c19 = 3;
                                break;
                            }
                            c19 = 65535;
                            break;
                        case 99455:
                            if (c017.equals("did")) {
                                c19 = 4;
                                break;
                            }
                            c19 = 65535;
                            break;
                        case 113759:
                            if (c017.equals("seq")) {
                                c19 = 5;
                                break;
                            }
                            c19 = 65535;
                            break;
                        case 113870:
                            if (c017.equals("sid")) {
                                c19 = 6;
                                break;
                            }
                            c19 = 65535;
                            break;
                        case 3237136:
                            if (c017.equals("init")) {
                                c19 = 7;
                                break;
                            }
                            c19 = 65535;
                            break;
                        case 55126294:
                            if (c017.equals("timestamp")) {
                                c19 = '\b';
                                break;
                            }
                            c19 = 65535;
                            break;
                        case 93152418:
                            if (c017.equals("attrs")) {
                                c19 = '\t';
                                break;
                            }
                            c19 = 65535;
                            break;
                        case 213717026:
                            if (c017.equals("abnormal_mechanism")) {
                                c19 = '\n';
                                break;
                            }
                            c19 = 65535;
                            break;
                        default:
                            c19 = 65535;
                            break;
                    }
                    switch (c19) {
                        case 0:
                            d13 = b2Var.C();
                            continue;
                        case 1:
                            date4 = b2Var.y(iLogger);
                            continue;
                        case 2:
                            num6 = b2Var.O();
                            continue;
                        case 3:
                            String b10 = io.sentry.util.l.b(b2Var.i0());
                            if (b10 != null) {
                                k6Var = k6.valueOf(b10);
                                break;
                            } else {
                                continue;
                            }
                        case 4:
                            str13 = b2Var.i0();
                            continue;
                        case 5:
                            l6 = b2Var.W();
                            continue;
                        case 6:
                            String i027 = b2Var.i0();
                            if (i027 != null && (i027.length() == 36 || i027.length() == 32)) {
                                str14 = i027;
                                break;
                            } else {
                                iLogger.h(b5.ERROR, "%s sid is not valid.", i027);
                                continue;
                            }
                            break;
                        case 7:
                            bool = b2Var.w();
                            continue;
                        case '\b':
                            date5 = b2Var.y(iLogger);
                            continue;
                        case '\t':
                            b2Var.k();
                            while (b2Var.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                                String c018 = b2Var.c0();
                                c018.getClass();
                                switch (c018.hashCode()) {
                                    case -85904877:
                                        if (c018.equals("environment")) {
                                            c20 = 0;
                                            break;
                                        }
                                        c20 = 65535;
                                        break;
                                    case 1090594823:
                                        if (c018.equals("release")) {
                                            c20 = 1;
                                            break;
                                        }
                                        c20 = 65535;
                                        break;
                                    case 1480014044:
                                        if (c018.equals("ip_address")) {
                                            c20 = 2;
                                            break;
                                        }
                                        c20 = 65535;
                                        break;
                                    case 1917799825:
                                        if (c018.equals("user_agent")) {
                                            c20 = 3;
                                            break;
                                        }
                                        c20 = 65535;
                                        break;
                                    default:
                                        c20 = 65535;
                                        break;
                                }
                                switch (c20) {
                                    case 0:
                                        str17 = b2Var.i0();
                                        break;
                                    case 1:
                                        str18 = b2Var.i0();
                                        break;
                                    case 2:
                                        str15 = b2Var.i0();
                                        break;
                                    case 3:
                                        str16 = b2Var.i0();
                                        break;
                                    default:
                                        switch (b2Var.f16207a) {
                                            case 0:
                                                io.sentry.vendor.gson.stream.a aVar = (io.sentry.vendor.gson.stream.a) b2Var.f16208b;
                                                int i15 = 0;
                                                do {
                                                    int i16 = aVar.f17210h;
                                                    if (i16 == 0) {
                                                        i16 = aVar.r();
                                                    }
                                                    if (i16 == 3) {
                                                        i5 = 1;
                                                        aVar.i0(1);
                                                    } else {
                                                        i5 = 1;
                                                        if (i16 == 1) {
                                                            aVar.i0(3);
                                                        } else if (i16 == 4) {
                                                            aVar.f17214m--;
                                                            i15--;
                                                            i10 = i5;
                                                            i11 = 0;
                                                            aVar.f17210h = i11;
                                                        } else if (i16 == 2) {
                                                            aVar.f17214m--;
                                                            i15--;
                                                            i10 = 1;
                                                            i11 = 0;
                                                            aVar.f17210h = i11;
                                                        } else {
                                                            if (i16 == 14 || i16 == 10) {
                                                                do {
                                                                    int i17 = 0;
                                                                    while (true) {
                                                                        int i18 = aVar.f17206d + i17;
                                                                        if (i18 < aVar.f17207e) {
                                                                            char c23 = aVar.f17205c[i18];
                                                                            if (c23 != '\t' && c23 != '\n' && c23 != '\f' && c23 != '\r' && c23 != ' ') {
                                                                                if (c23 == '#') {
                                                                                    break;
                                                                                } else if (c23 == ',') {
                                                                                    break;
                                                                                } else if (c23 != '/' && c23 != '=') {
                                                                                    if (c23 != '{' && c23 != '}' && c23 != ':') {
                                                                                        if (c23 == ';') {
                                                                                            break;
                                                                                        } else {
                                                                                            switch (c23) {
                                                                                                case '[':
                                                                                                case ']':
                                                                                                    break;
                                                                                                case '\\':
                                                                                                    break;
                                                                                                default:
                                                                                                    i17++;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else {
                                                                            aVar.f17206d = i18;
                                                                            i10 = 1;
                                                                        }
                                                                    }
                                                                    i11 = 0;
                                                                    aVar.f17210h = i11;
                                                                } while (aVar.y(1));
                                                                i11 = 0;
                                                                aVar.f17210h = i11;
                                                            } else if (i16 == 8 || i16 == 12) {
                                                                aVar.k0('\'');
                                                            } else if (i16 == 9 || i16 == 13) {
                                                                aVar.k0('\"');
                                                            } else if (i16 == 16) {
                                                                aVar.f17206d += aVar.j;
                                                            }
                                                            i10 = 1;
                                                            i11 = 0;
                                                            aVar.f17210h = i11;
                                                        }
                                                    }
                                                    i15++;
                                                    i10 = i5;
                                                    i11 = 0;
                                                    aVar.f17210h = i11;
                                                } while (i15 != 0);
                                                int[] iArr = aVar.f17216o;
                                                int i19 = aVar.f17214m - i10;
                                                iArr[i19] = iArr[i19] + i10;
                                                aVar.f17215n[i19] = "null";
                                                break;
                                        }
                                }
                            }
                            b2Var.r();
                            continue;
                        case '\n':
                            str19 = b2Var.i0();
                            break;
                        default:
                            if (concurrentHashMap7 == null) {
                                concurrentHashMap7 = new ConcurrentHashMap();
                            }
                            b2Var.j0(iLogger, concurrentHashMap7, c017);
                            break;
                    }
                }
                if (k6Var == null) {
                    throw e(PredictionTable.statusColumn, iLogger);
                }
                if (date4 == null) {
                    throw e("started", iLogger);
                }
                if (num6 == null) {
                    throw e("errors", iLogger);
                }
                if (str18 == null) {
                    throw e("release", iLogger);
                }
                l6 l6Var = new l6(k6Var, date4, date5, num6.intValue(), str13, str14, bool, l6, d13, str15, str16, str17, str18, str19);
                l6Var.f16624p = concurrentHashMap7;
                b2Var.r();
                return l6Var;
            case zg.g.DEBUGMODULES_FIELD_NUMBER /* 22 */:
                return b(b2Var, iLogger);
            case zg.g.ISCRASH_FIELD_NUMBER /* 23 */:
                return new p6(b2Var.h0());
            case zg.g.FORCEINGEST_FIELD_NUMBER /* 24 */:
                return q6.valueOf(b2Var.h0().toUpperCase(Locale.ROOT));
            case C0122e9.F /* 25 */:
                b2Var.k();
                String str20 = null;
                ConcurrentHashMap concurrentHashMap8 = null;
                String str21 = null;
                String str22 = null;
                String str23 = null;
                String str24 = null;
                String str25 = null;
                io.sentry.protocol.v vVar7 = null;
                String str26 = null;
                String str27 = null;
                io.sentry.protocol.v vVar8 = null;
                while (b2Var.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String c019 = b2Var.c0();
                    c019.getClass();
                    switch (c019.hashCode()) {
                        case -454767501:
                            if (c019.equals("replay_id")) {
                                c21 = 0;
                                break;
                            }
                            c21 = 65535;
                            break;
                        case -147132913:
                            if (c019.equals("user_id")) {
                                c21 = 1;
                                break;
                            }
                            c21 = 65535;
                            break;
                        case -85904877:
                            if (c019.equals("environment")) {
                                c21 = 2;
                                break;
                            }
                            c21 = 65535;
                            break;
                        case 153192858:
                            if (c019.equals("sample_rand")) {
                                c21 = 3;
                                break;
                            }
                            c21 = 65535;
                            break;
                        case 153193045:
                            if (c019.equals("sample_rate")) {
                                c21 = 4;
                                break;
                            }
                            c21 = 65535;
                            break;
                        case 1090594823:
                            if (c019.equals("release")) {
                                c21 = 5;
                                break;
                            }
                            c21 = 65535;
                            break;
                        case 1270300245:
                            if (c019.equals("trace_id")) {
                                c21 = 6;
                                break;
                            }
                            c21 = 65535;
                            break;
                        case 1864843258:
                            if (c019.equals("sampled")) {
                                c21 = 7;
                                break;
                            }
                            c21 = 65535;
                            break;
                        case 1904812937:
                            if (c019.equals("public_key")) {
                                c21 = '\b';
                                break;
                            }
                            c21 = 65535;
                            break;
                        case 2141246174:
                            if (c019.equals("transaction")) {
                                c21 = '\t';
                                break;
                            }
                            c21 = 65535;
                            break;
                        default:
                            c21 = 65535;
                            break;
                    }
                    switch (c21) {
                        case 0:
                            vVar7 = new io.sentry.protocol.v(b2Var.h0());
                            break;
                        case 1:
                            str23 = b2Var.i0();
                            break;
                        case 2:
                            str22 = b2Var.i0();
                            break;
                        case 3:
                            str26 = b2Var.i0();
                            break;
                        case 4:
                            str25 = b2Var.i0();
                            break;
                        case 5:
                            str27 = b2Var.i0();
                            break;
                        case 6:
                            vVar8 = new io.sentry.protocol.v(b2Var.h0());
                            break;
                        case 7:
                            str20 = b2Var.i0();
                            break;
                        case '\b':
                            str21 = b2Var.h0();
                            break;
                        case '\t':
                            str24 = b2Var.i0();
                            break;
                        default:
                            if (concurrentHashMap8 == null) {
                                concurrentHashMap8 = new ConcurrentHashMap();
                            }
                            b2Var.j0(iLogger, concurrentHashMap8, c019);
                            break;
                    }
                }
                if (vVar8 == null) {
                    throw f("trace_id", iLogger);
                }
                if (str21 == null) {
                    throw f("public_key", iLogger);
                }
                t6 t6Var2 = new t6(vVar8, str21, str27, str22, str23, str24, str25, str20, vVar7, str26);
                t6Var2.f17112k = concurrentHashMap8;
                b2Var.r();
                return t6Var2;
            default:
                b2Var.k();
                io.sentry.protocol.v vVar9 = null;
                String str28 = null;
                String str29 = null;
                String str30 = null;
                HashMap hashMap12 = null;
                while (b2Var.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String c020 = b2Var.c0();
                    c020.getClass();
                    switch (c020.hashCode()) {
                        case -602415628:
                            if (c020.equals("comments")) {
                                c22 = 0;
                                break;
                            }
                            c22 = 65535;
                            break;
                        case 3373707:
                            if (c020.equals("name")) {
                                c22 = 1;
                                break;
                            }
                            c22 = 65535;
                            break;
                        case 96619420:
                            if (c020.equals(AccountTable.emailColumn)) {
                                c22 = 2;
                                break;
                            }
                            c22 = 65535;
                            break;
                        case 278118624:
                            if (c020.equals("event_id")) {
                                c22 = 3;
                                break;
                            }
                            c22 = 65535;
                            break;
                        default:
                            c22 = 65535;
                            break;
                    }
                    switch (c22) {
                        case 0:
                            str30 = b2Var.i0();
                            break;
                        case 1:
                            str28 = b2Var.i0();
                            break;
                        case 2:
                            str29 = b2Var.i0();
                            break;
                        case 3:
                            vVar9 = new io.sentry.protocol.v(b2Var.h0());
                            break;
                        default:
                            if (hashMap12 == null) {
                                hashMap12 = new HashMap();
                            }
                            b2Var.j0(iLogger, hashMap12, c020);
                            break;
                    }
                }
                b2Var.r();
                if (vVar9 != null) {
                    y6 y6Var = new y6(vVar9, str28, str29, str30);
                    y6Var.f17265e = hashMap12;
                    return y6Var;
                }
                Throwable illegalStateException14 = new IllegalStateException("Missing required field \"event_id\"");
                iLogger.e(b5.ERROR, "Missing required field \"event_id\"", illegalStateException14);
                throw illegalStateException14;
        }
    }
}
