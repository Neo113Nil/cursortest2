package io.sentry.clientreport;

import androidx.appcompat.widget.c1;
import com.sports.insider.data.repository.room.live.LiveTable;
import com.sports.insider.data.room.general.table.predictions.PredictionTable;
import io.appmetrica.analytics.impl.C0122e9;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.sentry.ILogger;
import io.sentry.b2;
import io.sentry.b5;
import io.sentry.c5;
import io.sentry.h3;
import io.sentry.p6;
import io.sentry.protocol.DebugImage;
import io.sentry.protocol.a0;
import io.sentry.protocol.b0;
import io.sentry.protocol.f0;
import io.sentry.protocol.h;
import io.sentry.protocol.i;
import io.sentry.protocol.j;
import io.sentry.protocol.k;
import io.sentry.protocol.l;
import io.sentry.protocol.m;
import io.sentry.protocol.n;
import io.sentry.protocol.o;
import io.sentry.protocol.p;
import io.sentry.protocol.r;
import io.sentry.protocol.s;
import io.sentry.protocol.t;
import io.sentry.protocol.u;
import io.sentry.protocol.v;
import io.sentry.protocol.w;
import io.sentry.protocol.x;
import io.sentry.protocol.y;
import io.sentry.protocol.z;
import io.sentry.q6;
import io.sentry.s1;
import j$.util.DesugarTimeZone;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b implements s1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16277a;

    public /* synthetic */ b(int i5) {
        this.f16277a = i5;
    }

    public static io.sentry.protocol.a b(b2 b2Var, ILogger iLogger) {
        String c02;
        b2Var.k();
        io.sentry.protocol.a aVar = new io.sentry.protocol.a();
        ConcurrentHashMap concurrentHashMap = null;
        while (b2Var.l0() == io.sentry.vendor.gson.stream.b.NAME) {
            c02 = b2Var.c0();
            c02.getClass();
            switch (c02) {
                case "split_names":
                    List list = (List) b2Var.d0();
                    if (list == null) {
                        break;
                    } else {
                        aVar.f16744m = list;
                        break;
                    }
                case "device_app_hash":
                    aVar.f16735c = b2Var.i0();
                    break;
                case "start_type":
                    aVar.j = b2Var.i0();
                    break;
                case "view_names":
                    List list2 = (List) b2Var.d0();
                    if (list2 == null) {
                        break;
                    } else {
                        aVar.f16741i = list2;
                        break;
                    }
                case "app_version":
                    aVar.f16738f = b2Var.i0();
                    break;
                case "in_foreground":
                    aVar.f16742k = b2Var.w();
                    break;
                case "build_type":
                    aVar.f16736d = b2Var.i0();
                    break;
                case "app_identifier":
                    aVar.f16733a = b2Var.i0();
                    break;
                case "app_start_time":
                    aVar.f16734b = b2Var.y(iLogger);
                    break;
                case "permissions":
                    aVar.f16740h = com.google.android.play.core.appupdate.b.A((Map) b2Var.d0());
                    break;
                case "app_name":
                    aVar.f16737e = b2Var.i0();
                    break;
                case "app_build":
                    aVar.f16739g = b2Var.i0();
                    break;
                case "is_split_apks":
                    aVar.f16743l = b2Var.w();
                    break;
                default:
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    b2Var.j0(iLogger, concurrentHashMap, c02);
                    break;
            }
        }
        aVar.f16745n = concurrentHashMap;
        b2Var.r();
        return aVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static io.sentry.protocol.c c(b2 b2Var, ILogger iLogger) {
        char c2;
        boolean z5;
        boolean z7;
        io.sentry.protocol.c cVar = new io.sentry.protocol.c();
        b2Var.k();
        while (b2Var.l0() == io.sentry.vendor.gson.stream.b.NAME) {
            String c02 = b2Var.c0();
            c02.getClass();
            int i5 = 11;
            switch (c02.hashCode()) {
                case -1335157162:
                    if (c02.equals("device")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -895679987:
                    if (c02.equals("spring")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -340323263:
                    if (c02.equals("response")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -309425751:
                    if (c02.equals("profile")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -191501435:
                    if (c02.equals("feedback")) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3556:
                    if (c02.equals("os")) {
                        c2 = 5;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 96801:
                    if (c02.equals("app")) {
                        c2 = 6;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 102572:
                    if (c02.equals("gpu")) {
                        c2 = 7;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 97513095:
                    if (c02.equals("flags")) {
                        c2 = '\b';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 110620997:
                    if (c02.equals("trace")) {
                        c2 = '\t';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 150940456:
                    if (c02.equals("browser")) {
                        c2 = '\n';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1550962648:
                    if (c02.equals("runtime")) {
                        c2 = 11;
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            ArrayList arrayList = null;
            switch (c2) {
                case 0:
                    cVar.o(d(b2Var, iLogger));
                    break;
                case 1:
                    b2Var.k();
                    f0 f0Var = new f0();
                    ConcurrentHashMap concurrentHashMap = null;
                    while (b2Var.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                        String c03 = b2Var.c0();
                        c03.getClass();
                        if (c03.equals("active_profiles")) {
                            List list = (List) b2Var.d0();
                            if (list != null) {
                                String[] strArr = new String[list.size()];
                                list.toArray(strArr);
                                f0Var.f16800a = strArr;
                            }
                        } else {
                            if (concurrentHashMap == null) {
                                concurrentHashMap = new ConcurrentHashMap();
                            }
                            b2Var.j0(iLogger, concurrentHashMap, c03);
                        }
                    }
                    f0Var.f16801b = concurrentHashMap;
                    b2Var.r();
                    cVar.u(f0Var);
                    break;
                case 2:
                    b2Var.k();
                    r rVar = new r();
                    ConcurrentHashMap concurrentHashMap2 = null;
                    while (b2Var.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                        String c04 = b2Var.c0();
                        c04.getClass();
                        switch (c04.hashCode()) {
                            case -891699686:
                                if (c04.equals("status_code")) {
                                    z5 = false;
                                    break;
                                }
                                z5 = -1;
                                break;
                            case 3076010:
                                if (c04.equals("data")) {
                                    z5 = true;
                                    break;
                                }
                                z5 = -1;
                                break;
                            case 795307910:
                                if (c04.equals("headers")) {
                                    z5 = 2;
                                    break;
                                }
                                z5 = -1;
                                break;
                            case 952189583:
                                if (c04.equals("cookies")) {
                                    z5 = 3;
                                    break;
                                }
                                z5 = -1;
                                break;
                            case 1252988030:
                                if (c04.equals("body_size")) {
                                    z5 = 4;
                                    break;
                                }
                                z5 = -1;
                                break;
                            default:
                                z5 = -1;
                                break;
                        }
                        switch (z5) {
                            case false:
                                rVar.f16901c = b2Var.O();
                                break;
                            case true:
                                rVar.f16903e = b2Var.d0();
                                break;
                            case true:
                                Map map = (Map) b2Var.d0();
                                if (map == null) {
                                    break;
                                } else {
                                    rVar.f16900b = com.google.android.play.core.appupdate.b.A(map);
                                    break;
                                }
                            case true:
                                rVar.f16899a = b2Var.i0();
                                break;
                            case true:
                                rVar.f16902d = b2Var.W();
                                break;
                            default:
                                if (concurrentHashMap2 == null) {
                                    concurrentHashMap2 = new ConcurrentHashMap();
                                }
                                b2Var.j0(iLogger, concurrentHashMap2, c04);
                                break;
                        }
                    }
                    rVar.f16904f = concurrentHashMap2;
                    b2Var.r();
                    cVar.s(rVar);
                    break;
                case 3:
                    b2Var.k();
                    h3 h3Var = new h3(v.f16922b);
                    ConcurrentHashMap concurrentHashMap3 = null;
                    while (b2Var.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                        String c05 = b2Var.c0();
                        c05.getClass();
                        if (c05.equals("profiler_id")) {
                            v vVar = (v) b2Var.f0(iLogger, new b(23));
                            if (vVar != null) {
                                h3Var.f16453a = vVar;
                            }
                        } else {
                            if (concurrentHashMap3 == null) {
                                concurrentHashMap3 = new ConcurrentHashMap();
                            }
                            b2Var.j0(iLogger, concurrentHashMap3, c05);
                        }
                    }
                    h3Var.f16454b = concurrentHashMap3;
                    b2Var.r();
                    cVar.k(h3Var, "profile");
                    break;
                case 4:
                    cVar.k(e(b2Var, iLogger), "feedback");
                    break;
                case 5:
                    cVar.r(g(b2Var, iLogger));
                    break;
                case 6:
                    cVar.m(b(b2Var, iLogger));
                    break;
                case 7:
                    cVar.q(f(b2Var, iLogger));
                    break;
                case '\b':
                    b2Var.k();
                    ConcurrentHashMap concurrentHashMap4 = null;
                    while (b2Var.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                        String c06 = b2Var.c0();
                        c06.getClass();
                        if (c06.equals("values")) {
                            arrayList = b2Var.R(iLogger, new b(i5));
                        } else {
                            if (concurrentHashMap4 == null) {
                                concurrentHashMap4 = new ConcurrentHashMap();
                            }
                            b2Var.j0(iLogger, concurrentHashMap4, c06);
                        }
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    h hVar = new h(arrayList);
                    hVar.f16808b = concurrentHashMap4;
                    b2Var.r();
                    cVar.p(hVar);
                    break;
                case '\t':
                    cVar.v(io.sentry.d.b(b2Var, iLogger));
                    break;
                case '\n':
                    b2Var.k();
                    io.sentry.protocol.b bVar = new io.sentry.protocol.b();
                    ConcurrentHashMap concurrentHashMap5 = null;
                    while (b2Var.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                        String c07 = b2Var.c0();
                        c07.getClass();
                        if (c07.equals("name")) {
                            bVar.f16746a = b2Var.i0();
                        } else if (c07.equals("version")) {
                            bVar.f16747b = b2Var.i0();
                        } else {
                            if (concurrentHashMap5 == null) {
                                concurrentHashMap5 = new ConcurrentHashMap();
                            }
                            b2Var.j0(iLogger, concurrentHashMap5, c07);
                        }
                    }
                    bVar.f16748c = concurrentHashMap5;
                    b2Var.r();
                    cVar.n(bVar);
                    break;
                case 11:
                    b2Var.k();
                    x xVar = new x();
                    ConcurrentHashMap concurrentHashMap6 = null;
                    while (b2Var.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                        String c08 = b2Var.c0();
                        c08.getClass();
                        switch (c08.hashCode()) {
                            case -339173787:
                                if (c08.equals("raw_description")) {
                                    z7 = false;
                                    break;
                                }
                                z7 = -1;
                                break;
                            case 3373707:
                                if (c08.equals("name")) {
                                    z7 = true;
                                    break;
                                }
                                z7 = -1;
                                break;
                            case 351608024:
                                if (c08.equals("version")) {
                                    z7 = 2;
                                    break;
                                }
                                z7 = -1;
                                break;
                            default:
                                z7 = -1;
                                break;
                        }
                        switch (z7) {
                            case false:
                                xVar.f16929c = b2Var.i0();
                                break;
                            case true:
                                xVar.f16927a = b2Var.i0();
                                break;
                            case true:
                                xVar.f16928b = b2Var.i0();
                                break;
                            default:
                                if (concurrentHashMap6 == null) {
                                    concurrentHashMap6 = new ConcurrentHashMap();
                                }
                                b2Var.j0(iLogger, concurrentHashMap6, c08);
                                break;
                        }
                    }
                    xVar.f16930d = concurrentHashMap6;
                    b2Var.r();
                    cVar.t(xVar);
                    break;
                default:
                    Object d02 = b2Var.d0();
                    if (d02 == null) {
                        break;
                    } else {
                        cVar.k(d02, c02);
                        break;
                    }
            }
        }
        b2Var.r();
        return cVar;
    }

    public static io.sentry.protocol.f d(b2 b2Var, ILogger iLogger) {
        String c02;
        int i5;
        TimeZone timeZone;
        b2Var.k();
        io.sentry.protocol.f fVar = new io.sentry.protocol.f();
        ConcurrentHashMap concurrentHashMap = null;
        while (b2Var.l0() == io.sentry.vendor.gson.stream.b.NAME) {
            c02 = b2Var.c0();
            c02.getClass();
            i5 = 10;
            switch (c02) {
                case "timezone":
                    switch (b2Var.f16207a) {
                        case 0:
                            io.sentry.vendor.gson.stream.a aVar = (io.sentry.vendor.gson.stream.a) b2Var.f16208b;
                            if (aVar.h0() == io.sentry.vendor.gson.stream.b.NULL) {
                                aVar.Y();
                            } else {
                                try {
                                    timeZone = DesugarTimeZone.getTimeZone(aVar.d0());
                                    break;
                                } catch (Exception e7) {
                                    iLogger.e(b5.ERROR, "Error when deserializing TimeZone", e7);
                                }
                            }
                            timeZone = null;
                            break;
                        default:
                            String str = (String) b2Var.k0();
                            if (str != null) {
                                timeZone = DesugarTimeZone.getTimeZone(str);
                                break;
                            }
                            timeZone = null;
                            break;
                    }
                    fVar.f16799z = timeZone;
                    break;
                case "boot_time":
                    if (b2Var.l0() != io.sentry.vendor.gson.stream.b.STRING) {
                        break;
                    } else {
                        fVar.f16798y = b2Var.y(iLogger);
                        break;
                    }
                case "simulator":
                    fVar.f16786l = b2Var.w();
                    break;
                case "manufacturer":
                    fVar.f16777b = b2Var.i0();
                    break;
                case "processor_count":
                    fVar.E = b2Var.O();
                    break;
                case "orientation":
                    fVar.f16785k = (io.sentry.protocol.e) b2Var.f0(iLogger, new b(i5));
                    break;
                case "battery_temperature":
                    fVar.D = b2Var.K();
                    break;
                case "family":
                    fVar.f16779d = b2Var.i0();
                    break;
                case "locale":
                    fVar.B = b2Var.i0();
                    break;
                case "online":
                    fVar.j = b2Var.w();
                    break;
                case "battery_level":
                    fVar.f16783h = b2Var.K();
                    break;
                case "model_id":
                    fVar.f16781f = b2Var.i0();
                    break;
                case "screen_density":
                    fVar.f16796w = b2Var.K();
                    break;
                case "screen_dpi":
                    fVar.f16797x = b2Var.O();
                    break;
                case "free_memory":
                    fVar.f16788n = b2Var.W();
                    break;
                case "id":
                    fVar.A = b2Var.i0();
                    break;
                case "name":
                    fVar.f16776a = b2Var.i0();
                    break;
                case "low_memory":
                    fVar.f16790p = b2Var.w();
                    break;
                case "archs":
                    List list = (List) b2Var.d0();
                    if (list == null) {
                        break;
                    } else {
                        String[] strArr = new String[list.size()];
                        list.toArray(strArr);
                        fVar.f16782g = strArr;
                        break;
                    }
                case "brand":
                    fVar.f16778c = b2Var.i0();
                    break;
                case "model":
                    fVar.f16780e = b2Var.i0();
                    break;
                case "cpu_description":
                    fVar.G = b2Var.i0();
                    break;
                case "processor_frequency":
                    fVar.F = b2Var.C();
                    break;
                case "connection_type":
                    fVar.C = b2Var.i0();
                    break;
                case "chipset":
                    fVar.H = b2Var.i0();
                    break;
                case "screen_width_pixels":
                    fVar.f16794u = b2Var.O();
                    break;
                case "external_storage_size":
                    fVar.f16792s = b2Var.W();
                    break;
                case "storage_size":
                    fVar.q = b2Var.W();
                    break;
                case "usable_memory":
                    fVar.f16789o = b2Var.W();
                    break;
                case "memory_size":
                    fVar.f16787m = b2Var.W();
                    break;
                case "charging":
                    fVar.f16784i = b2Var.w();
                    break;
                case "external_free_storage":
                    fVar.f16793t = b2Var.W();
                    break;
                case "free_storage":
                    fVar.f16791r = b2Var.W();
                    break;
                case "screen_height_pixels":
                    fVar.f16795v = b2Var.O();
                    break;
                default:
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    b2Var.j0(iLogger, concurrentHashMap, c02);
                    break;
            }
        }
        fVar.I = concurrentHashMap;
        b2Var.r();
        return fVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0061, code lost:
    
        if (r7.equals("associated_event_id") == false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static i e(b2 b2Var, ILogger iLogger) {
        b2Var.k();
        String str = null;
        String str2 = null;
        String str3 = null;
        v vVar = null;
        v vVar2 = null;
        String str4 = null;
        HashMap hashMap = null;
        while (true) {
            char c2 = 0;
            if (b2Var.l0() != io.sentry.vendor.gson.stream.b.NAME) {
                b2Var.r();
                if (str == null) {
                    IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"message\"");
                    iLogger.e(b5.ERROR, "Missing required field \"message\"", illegalStateException);
                    throw illegalStateException;
                }
                i iVar = new i();
                if (str.length() > 4096) {
                    iVar.f16809a = str.substring(0, 4096);
                } else {
                    iVar.f16809a = str;
                }
                iVar.f16810b = str2;
                iVar.f16811c = str3;
                iVar.f16812d = vVar;
                iVar.f16813e = vVar2;
                iVar.f16814f = str4;
                iVar.f16815g = hashMap;
                return iVar;
            }
            String c02 = b2Var.c0();
            c02.getClass();
            switch (c02.hashCode()) {
                case -964729863:
                    break;
                case -454767501:
                    if (c02.equals("replay_id")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 116079:
                    if (c02.equals("url")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3373707:
                    if (c02.equals("name")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 947010237:
                    if (c02.equals("contact_email")) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 954925063:
                    if (c02.equals(LiveTable.messageColumn)) {
                        c2 = 5;
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
                    vVar = new v(b2Var.h0());
                    break;
                case 1:
                    vVar2 = new v(b2Var.h0());
                    break;
                case 2:
                    str4 = b2Var.i0();
                    break;
                case 3:
                    str3 = b2Var.i0();
                    break;
                case 4:
                    str2 = b2Var.i0();
                    break;
                case 5:
                    str = b2Var.i0();
                    break;
                default:
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    b2Var.j0(iLogger, hashMap, c02);
                    break;
            }
        }
    }

    public static k f(b2 b2Var, ILogger iLogger) {
        String c02;
        b2Var.k();
        k kVar = new k();
        ConcurrentHashMap concurrentHashMap = null;
        while (b2Var.l0() == io.sentry.vendor.gson.stream.b.NAME) {
            c02 = b2Var.c0();
            c02.getClass();
            switch (c02) {
                case "npot_support":
                    kVar.f16839i = b2Var.i0();
                    break;
                case "vendor_id":
                    kVar.f16833c = b2Var.i0();
                    break;
                case "multi_threaded_rendering":
                    kVar.f16837g = b2Var.w();
                    break;
                case "id":
                    kVar.f16832b = b2Var.O();
                    break;
                case "name":
                    kVar.f16831a = b2Var.i0();
                    break;
                case "vendor_name":
                    kVar.f16834d = b2Var.i0();
                    break;
                case "version":
                    kVar.f16838h = b2Var.i0();
                    break;
                case "api_type":
                    kVar.f16836f = b2Var.i0();
                    break;
                case "memory_size":
                    kVar.f16835e = b2Var.O();
                    break;
                default:
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    b2Var.j0(iLogger, concurrentHashMap, c02);
                    break;
            }
        }
        kVar.j = concurrentHashMap;
        b2Var.r();
        return kVar;
    }

    public static o g(b2 b2Var, ILogger iLogger) {
        String c02;
        b2Var.k();
        o oVar = new o();
        ConcurrentHashMap concurrentHashMap = null;
        while (b2Var.l0() == io.sentry.vendor.gson.stream.b.NAME) {
            c02 = b2Var.c0();
            c02.getClass();
            switch (c02) {
                case "rooted":
                    oVar.f16874f = b2Var.w();
                    break;
                case "raw_description":
                    oVar.f16871c = b2Var.i0();
                    break;
                case "name":
                    oVar.f16869a = b2Var.i0();
                    break;
                case "build":
                    oVar.f16872d = b2Var.i0();
                    break;
                case "version":
                    oVar.f16870b = b2Var.i0();
                    break;
                case "kernel_version":
                    oVar.f16873e = b2Var.i0();
                    break;
                default:
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    b2Var.j0(iLogger, concurrentHashMap, c02);
                    break;
            }
        }
        oVar.f16875g = concurrentHashMap;
        b2Var.r();
        return oVar;
    }

    public static IllegalStateException h(String str, ILogger iLogger) {
        String n9 = c1.n("Missing required field \"", str, "\"");
        IllegalStateException illegalStateException = new IllegalStateException(n9);
        iLogger.e(b5.ERROR, n9, illegalStateException);
        return illegalStateException;
    }

    public static IllegalStateException i(String str, ILogger iLogger) {
        String n9 = c1.n("Missing required field \"", str, "\"");
        IllegalStateException illegalStateException = new IllegalStateException(n9);
        iLogger.e(b5.ERROR, n9, illegalStateException);
        return illegalStateException;
    }

    public static IllegalStateException j(String str, ILogger iLogger) {
        String n9 = c1.n("Missing required field \"", str, "\"");
        IllegalStateException illegalStateException = new IllegalStateException(n9);
        iLogger.e(b5.ERROR, n9, illegalStateException);
        return illegalStateException;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // io.sentry.s1
    public final Object a(b2 b2Var, ILogger iLogger) {
        boolean z5;
        boolean z7;
        Double valueOf;
        boolean z10;
        boolean z11;
        char c2;
        boolean z12;
        char c8;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        char c10;
        char c11;
        boolean z17;
        int i5 = 7;
        int i10 = 3;
        int i11 = 1;
        Boolean bool = null;
        switch (this.f16277a) {
            case 0:
                ArrayList arrayList = new ArrayList();
                b2Var.k();
                Date date = null;
                HashMap hashMap = null;
                while (b2Var.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String c02 = b2Var.c0();
                    c02.getClass();
                    if (c02.equals("discarded_events")) {
                        arrayList.addAll(b2Var.R(iLogger, new b(i11)));
                    } else if (c02.equals("timestamp")) {
                        date = b2Var.y(iLogger);
                    } else {
                        if (hashMap == null) {
                            hashMap = new HashMap();
                        }
                        b2Var.j0(iLogger, hashMap, c02);
                    }
                }
                b2Var.r();
                if (date == null) {
                    throw h("timestamp", iLogger);
                }
                if (arrayList.isEmpty()) {
                    throw h("discarded_events", iLogger);
                }
                c cVar = new c(date, arrayList);
                cVar.f16280c = hashMap;
                return cVar;
            case 1:
                b2Var.k();
                String str = null;
                String str2 = null;
                Long l6 = null;
                HashMap hashMap2 = null;
                while (b2Var.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String c03 = b2Var.c0();
                    c03.getClass();
                    switch (c03.hashCode()) {
                        case -1285004149:
                            if (c03.equals("quantity")) {
                                z5 = false;
                                break;
                            }
                            z5 = -1;
                            break;
                        case -934964668:
                            if (c03.equals("reason")) {
                                z5 = true;
                                break;
                            }
                            z5 = -1;
                            break;
                        case 50511102:
                            if (c03.equals("category")) {
                                z5 = 2;
                                break;
                            }
                            z5 = -1;
                            break;
                        default:
                            z5 = -1;
                            break;
                    }
                    switch (z5) {
                        case false:
                            l6 = b2Var.W();
                            break;
                        case true:
                            str = b2Var.i0();
                            break;
                        case true:
                            str2 = b2Var.i0();
                            break;
                        default:
                            if (hashMap2 == null) {
                                hashMap2 = new HashMap();
                            }
                            b2Var.j0(iLogger, hashMap2, c03);
                            break;
                    }
                }
                b2Var.r();
                if (str == null) {
                    throw i("reason", iLogger);
                }
                if (str2 == null) {
                    throw i("category", iLogger);
                }
                if (l6 == null) {
                    throw i("quantity", iLogger);
                }
                f fVar = new f(str, str2, l6);
                fVar.f16286d = hashMap2;
                return fVar;
            case 2:
                b2Var.k();
                io.sentry.profilemeasurements.a aVar = new io.sentry.profilemeasurements.a("unknown", new ArrayList());
                ConcurrentHashMap concurrentHashMap = null;
                while (b2Var.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String c04 = b2Var.c0();
                    c04.getClass();
                    if (c04.equals("values")) {
                        ArrayList R = b2Var.R(iLogger, new b(i10));
                        if (R != null) {
                            aVar.f16728c = R;
                        }
                    } else if (c04.equals("unit")) {
                        String i02 = b2Var.i0();
                        if (i02 != null) {
                            aVar.f16727b = i02;
                        }
                    } else {
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        b2Var.j0(iLogger, concurrentHashMap, c04);
                    }
                }
                aVar.f16726a = concurrentHashMap;
                b2Var.r();
                return aVar;
            case 3:
                b2Var.k();
                io.sentry.profilemeasurements.b bVar = new io.sentry.profilemeasurements.b(0L, 0, 0L);
                ConcurrentHashMap concurrentHashMap2 = null;
                while (b2Var.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String c05 = b2Var.c0();
                    c05.getClass();
                    switch (c05.hashCode()) {
                        case -1709412534:
                            if (c05.equals("elapsed_since_start_ns")) {
                                z7 = false;
                                break;
                            }
                            z7 = -1;
                            break;
                        case 55126294:
                            if (c05.equals("timestamp")) {
                                z7 = true;
                                break;
                            }
                            z7 = -1;
                            break;
                        case 111972721:
                            if (c05.equals("value")) {
                                z7 = 2;
                                break;
                            }
                            z7 = -1;
                            break;
                        default:
                            z7 = -1;
                            break;
                    }
                    switch (z7) {
                        case false:
                            String i03 = b2Var.i0();
                            if (i03 == null) {
                                break;
                            } else {
                                bVar.f16731c = i03;
                                break;
                            }
                        case true:
                            try {
                                valueOf = b2Var.C();
                            } catch (NumberFormatException unused) {
                                valueOf = b2Var.y(iLogger) != null ? Double.valueOf(r5.getTime() / 1000.0d) : null;
                            }
                            if (valueOf == null) {
                                break;
                            } else {
                                bVar.f16730b = valueOf.doubleValue();
                                break;
                            }
                        case true:
                            Double C = b2Var.C();
                            if (C == null) {
                                break;
                            } else {
                                bVar.f16732d = C.doubleValue();
                                break;
                            }
                        default:
                            if (concurrentHashMap2 == null) {
                                concurrentHashMap2 = new ConcurrentHashMap();
                            }
                            b2Var.j0(iLogger, concurrentHashMap2, c05);
                            break;
                    }
                }
                bVar.f16729a = concurrentHashMap2;
                b2Var.r();
                return bVar;
            case 4:
                return b(b2Var, iLogger);
            case 5:
                b2Var.k();
                io.sentry.protocol.b bVar2 = new io.sentry.protocol.b();
                ConcurrentHashMap concurrentHashMap3 = null;
                while (b2Var.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String c06 = b2Var.c0();
                    c06.getClass();
                    if (c06.equals("name")) {
                        bVar2.f16746a = b2Var.i0();
                    } else if (c06.equals("version")) {
                        bVar2.f16747b = b2Var.i0();
                    } else {
                        if (concurrentHashMap3 == null) {
                            concurrentHashMap3 = new ConcurrentHashMap();
                        }
                        b2Var.j0(iLogger, concurrentHashMap3, c06);
                    }
                }
                bVar2.f16748c = concurrentHashMap3;
                b2Var.r();
                return bVar2;
            case 6:
                return c(b2Var, iLogger);
            case 7:
                DebugImage debugImage = new DebugImage();
                b2Var.k();
                AbstractMap abstractMap = null;
                while (b2Var.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String c07 = b2Var.c0();
                    c07.getClass();
                    switch (c07.hashCode()) {
                        case -1840639000:
                            if (c07.equals("debug_file")) {
                                z10 = false;
                                break;
                            }
                            z10 = -1;
                            break;
                        case -1443345323:
                            if (c07.equals("image_addr")) {
                                z10 = true;
                                break;
                            }
                            z10 = -1;
                            break;
                        case -1442803611:
                            if (c07.equals("image_size")) {
                                z10 = 2;
                                break;
                            }
                            z10 = -1;
                            break;
                        case -1127437170:
                            if (c07.equals("code_file")) {
                                z10 = 3;
                                break;
                            }
                            z10 = -1;
                            break;
                        case 3002454:
                            if (c07.equals("arch")) {
                                z10 = 4;
                                break;
                            }
                            z10 = -1;
                            break;
                        case 3575610:
                            if (c07.equals("type")) {
                                z10 = 5;
                                break;
                            }
                            z10 = -1;
                            break;
                        case 3601339:
                            if (c07.equals(CommonUrlParts.UUID)) {
                                z10 = 6;
                                break;
                            }
                            z10 = -1;
                            break;
                        case 547804807:
                            if (c07.equals("debug_id")) {
                                z10 = 7;
                                break;
                            }
                            z10 = -1;
                            break;
                        case 941842605:
                            if (c07.equals("code_id")) {
                                z10 = 8;
                                break;
                            }
                            z10 = -1;
                            break;
                        default:
                            z10 = -1;
                            break;
                    }
                    switch (z10) {
                        case false:
                            debugImage.debugFile = b2Var.i0();
                            break;
                        case true:
                            debugImage.imageAddr = b2Var.i0();
                            break;
                        case true:
                            debugImage.imageSize = b2Var.W();
                            break;
                        case true:
                            debugImage.codeFile = b2Var.i0();
                            break;
                        case true:
                            debugImage.arch = b2Var.i0();
                            break;
                        case true:
                            debugImage.type = b2Var.i0();
                            break;
                        case true:
                            debugImage.uuid = b2Var.i0();
                            break;
                        case true:
                            debugImage.debugId = b2Var.i0();
                            break;
                        case true:
                            debugImage.codeId = b2Var.i0();
                            break;
                        default:
                            if (abstractMap == null) {
                                abstractMap = new HashMap();
                            }
                            b2Var.j0(iLogger, abstractMap, c07);
                            break;
                    }
                }
                b2Var.r();
                debugImage.setUnknown(abstractMap);
                return debugImage;
            case 8:
                io.sentry.protocol.d dVar = new io.sentry.protocol.d();
                b2Var.k();
                HashMap hashMap3 = null;
                while (b2Var.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String c08 = b2Var.c0();
                    c08.getClass();
                    if (c08.equals("images")) {
                        dVar.f16758b = b2Var.R(iLogger, new b(i5));
                    } else if (c08.equals("sdk_info")) {
                        dVar.f16757a = (s) b2Var.f0(iLogger, new b(20));
                    } else {
                        if (hashMap3 == null) {
                            hashMap3 = new HashMap();
                        }
                        b2Var.j0(iLogger, hashMap3, c08);
                    }
                }
                b2Var.r();
                dVar.f16759c = hashMap3;
                return dVar;
            case 9:
                return d(b2Var, iLogger);
            case 10:
                return io.sentry.protocol.e.valueOf(b2Var.h0().toUpperCase(Locale.ROOT));
            case 11:
                b2Var.k();
                String str3 = null;
                ConcurrentHashMap concurrentHashMap4 = null;
                while (b2Var.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String c09 = b2Var.c0();
                    c09.getClass();
                    if (c09.equals("result")) {
                        bool = b2Var.w();
                    } else if (c09.equals("flag")) {
                        str3 = b2Var.i0();
                    } else {
                        if (concurrentHashMap4 == null) {
                            concurrentHashMap4 = new ConcurrentHashMap();
                        }
                        b2Var.j0(iLogger, concurrentHashMap4, c09);
                    }
                }
                if (str3 == null) {
                    IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"flag\"");
                    iLogger.e(b5.ERROR, "Missing required field \"flag\"", illegalStateException);
                    throw illegalStateException;
                }
                if (bool == null) {
                    IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"result\"");
                    iLogger.e(b5.ERROR, "Missing required field \"result\"", illegalStateException2);
                    throw illegalStateException2;
                }
                boolean booleanValue = bool.booleanValue();
                io.sentry.protocol.g gVar = new io.sentry.protocol.g();
                gVar.f16802a = str3;
                gVar.f16803b = booleanValue;
                gVar.f16804c = concurrentHashMap4;
                b2Var.r();
                return gVar;
            case 12:
                return e(b2Var, iLogger);
            case 13:
                b2Var.k();
                j jVar = new j();
                ConcurrentHashMap concurrentHashMap5 = null;
                while (b2Var.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String c010 = b2Var.c0();
                    c010.getClass();
                    switch (c010.hashCode()) {
                        case -934795532:
                            if (c010.equals("region")) {
                                z11 = false;
                                break;
                            }
                            z11 = -1;
                            break;
                        case 3053931:
                            if (c010.equals("city")) {
                                z11 = true;
                                break;
                            }
                            z11 = -1;
                            break;
                        case 1481071862:
                            if (c010.equals("country_code")) {
                                z11 = 2;
                                break;
                            }
                            z11 = -1;
                            break;
                        default:
                            z11 = -1;
                            break;
                    }
                    switch (z11) {
                        case false:
                            jVar.f16826c = b2Var.i0();
                            break;
                        case true:
                            jVar.f16824a = b2Var.i0();
                            break;
                        case true:
                            jVar.f16825b = b2Var.i0();
                            break;
                        default:
                            if (concurrentHashMap5 == null) {
                                concurrentHashMap5 = new ConcurrentHashMap();
                            }
                            b2Var.j0(iLogger, concurrentHashMap5, c010);
                            break;
                    }
                }
                jVar.f16827d = concurrentHashMap5;
                b2Var.r();
                return jVar;
            case 14:
                return f(b2Var, iLogger);
            case 15:
                b2Var.k();
                Number number = null;
                String str4 = null;
                AbstractMap abstractMap2 = null;
                while (b2Var.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String c011 = b2Var.c0();
                    c011.getClass();
                    if (c011.equals("unit")) {
                        str4 = b2Var.i0();
                    } else if (c011.equals("value")) {
                        number = (Number) b2Var.d0();
                    } else {
                        if (abstractMap2 == null) {
                            abstractMap2 = new ConcurrentHashMap();
                        }
                        b2Var.j0(iLogger, abstractMap2, c011);
                    }
                }
                b2Var.r();
                if (number != null) {
                    l lVar = new l(number, str4);
                    lVar.f16854d = abstractMap2;
                    return lVar;
                }
                IllegalStateException illegalStateException3 = new IllegalStateException("Missing required field \"value\"");
                iLogger.e(b5.ERROR, "Missing required field \"value\"", illegalStateException3);
                throw illegalStateException3;
            case 16:
                m mVar = new m();
                b2Var.k();
                HashMap hashMap4 = null;
                while (b2Var.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String c012 = b2Var.c0();
                    c012.getClass();
                    switch (c012.hashCode()) {
                        case -1724546052:
                            if (c012.equals("description")) {
                                c2 = 0;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -268203253:
                            if (c012.equals("exception_id")) {
                                c2 = 1;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 3076010:
                            if (c012.equals("data")) {
                                c2 = 2;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 3347973:
                            if (c012.equals("meta")) {
                                c2 = 3;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 3575610:
                            if (c012.equals("type")) {
                                c2 = 4;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 692803388:
                            if (c012.equals("handled")) {
                                c2 = 5;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 989128517:
                            if (c012.equals("synthetic")) {
                                c2 = 6;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1032012154:
                            if (c012.equals("is_exception_group")) {
                                c2 = 7;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1297152568:
                            if (c012.equals("help_link")) {
                                c2 = '\b';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 2070327504:
                            if (c012.equals("parent_id")) {
                                c2 = '\t';
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
                            mVar.f16856b = b2Var.i0();
                            break;
                        case 1:
                            mVar.f16862h = b2Var.O();
                            break;
                        case 2:
                            mVar.f16860f = com.google.android.play.core.appupdate.b.A((Map) b2Var.d0());
                            break;
                        case 3:
                            mVar.f16859e = com.google.android.play.core.appupdate.b.A((Map) b2Var.d0());
                            break;
                        case 4:
                            mVar.f16855a = b2Var.i0();
                            break;
                        case 5:
                            mVar.f16858d = b2Var.w();
                            break;
                        case 6:
                            mVar.f16861g = b2Var.w();
                            break;
                        case 7:
                            mVar.j = b2Var.w();
                            break;
                        case '\b':
                            mVar.f16857c = b2Var.i0();
                            break;
                        case '\t':
                            mVar.f16863i = b2Var.O();
                            break;
                        default:
                            if (hashMap4 == null) {
                                hashMap4 = new HashMap();
                            }
                            b2Var.j0(iLogger, hashMap4, c012);
                            break;
                    }
                }
                b2Var.r();
                mVar.f16864k = hashMap4;
                return mVar;
            case 17:
                b2Var.k();
                n nVar = new n();
                ConcurrentHashMap concurrentHashMap6 = null;
                while (b2Var.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String c013 = b2Var.c0();
                    c013.getClass();
                    switch (c013.hashCode()) {
                        case -995427962:
                            if (c013.equals("params")) {
                                z12 = false;
                                break;
                            }
                            z12 = -1;
                            break;
                        case 954925063:
                            if (c013.equals(LiveTable.messageColumn)) {
                                z12 = true;
                                break;
                            }
                            z12 = -1;
                            break;
                        case 1811591356:
                            if (c013.equals("formatted")) {
                                z12 = 2;
                                break;
                            }
                            z12 = -1;
                            break;
                        default:
                            z12 = -1;
                            break;
                    }
                    switch (z12) {
                        case false:
                            List list = (List) b2Var.d0();
                            if (list == null) {
                                break;
                            } else {
                                nVar.f16867c = list;
                                break;
                            }
                        case true:
                            nVar.f16866b = b2Var.i0();
                            break;
                        case true:
                            nVar.f16865a = b2Var.i0();
                            break;
                        default:
                            if (concurrentHashMap6 == null) {
                                concurrentHashMap6 = new ConcurrentHashMap();
                            }
                            b2Var.j0(iLogger, concurrentHashMap6, c013);
                            break;
                    }
                }
                nVar.f16868d = concurrentHashMap6;
                b2Var.r();
                return nVar;
            case 18:
                return g(b2Var, iLogger);
            case 19:
                b2Var.k();
                p pVar = new p();
                ConcurrentHashMap concurrentHashMap7 = null;
                while (b2Var.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String c014 = b2Var.c0();
                    c014.getClass();
                    switch (c014.hashCode()) {
                        case -1650269616:
                            if (c014.equals("fragment")) {
                                c8 = 0;
                                break;
                            }
                            c8 = 65535;
                            break;
                        case -1077554975:
                            if (c014.equals("method")) {
                                c8 = 1;
                                break;
                            }
                            c8 = 65535;
                            break;
                        case 100589:
                            if (c014.equals("env")) {
                                c8 = 2;
                                break;
                            }
                            c8 = 65535;
                            break;
                        case 116079:
                            if (c014.equals("url")) {
                                c8 = 3;
                                break;
                            }
                            c8 = 65535;
                            break;
                        case 3076010:
                            if (c014.equals("data")) {
                                c8 = 4;
                                break;
                            }
                            c8 = 65535;
                            break;
                        case 106069776:
                            if (c014.equals("other")) {
                                c8 = 5;
                                break;
                            }
                            c8 = 65535;
                            break;
                        case 795307910:
                            if (c014.equals("headers")) {
                                c8 = 6;
                                break;
                            }
                            c8 = 65535;
                            break;
                        case 952189583:
                            if (c014.equals("cookies")) {
                                c8 = 7;
                                break;
                            }
                            c8 = 65535;
                            break;
                        case 1252988030:
                            if (c014.equals("body_size")) {
                                c8 = '\b';
                                break;
                            }
                            c8 = 65535;
                            break;
                        case 1595298664:
                            if (c014.equals("query_string")) {
                                c8 = '\t';
                                break;
                            }
                            c8 = 65535;
                            break;
                        case 1980646230:
                            if (c014.equals("api_target")) {
                                c8 = '\n';
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
                            pVar.j = b2Var.i0();
                            break;
                        case 1:
                            pVar.f16877b = b2Var.i0();
                            break;
                        case 2:
                            Map map = (Map) b2Var.d0();
                            if (map == null) {
                                break;
                            } else {
                                pVar.f16882g = com.google.android.play.core.appupdate.b.A(map);
                                break;
                            }
                        case 3:
                            pVar.f16876a = b2Var.i0();
                            break;
                        case 4:
                            pVar.f16879d = b2Var.d0();
                            break;
                        case 5:
                            Map map2 = (Map) b2Var.d0();
                            if (map2 == null) {
                                break;
                            } else {
                                pVar.f16884i = com.google.android.play.core.appupdate.b.A(map2);
                                break;
                            }
                        case 6:
                            Map map3 = (Map) b2Var.d0();
                            if (map3 == null) {
                                break;
                            } else {
                                pVar.f16881f = com.google.android.play.core.appupdate.b.A(map3);
                                break;
                            }
                        case 7:
                            pVar.f16880e = b2Var.i0();
                            break;
                        case '\b':
                            pVar.f16883h = b2Var.W();
                            break;
                        case '\t':
                            pVar.f16878c = b2Var.i0();
                            break;
                        case '\n':
                            pVar.f16885k = b2Var.i0();
                            break;
                        default:
                            if (concurrentHashMap7 == null) {
                                concurrentHashMap7 = new ConcurrentHashMap();
                            }
                            b2Var.j0(iLogger, concurrentHashMap7, c014);
                            break;
                    }
                }
                pVar.f16886l = concurrentHashMap7;
                b2Var.r();
                return pVar;
            case 20:
                s sVar = new s();
                b2Var.k();
                HashMap hashMap5 = null;
                while (b2Var.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String c015 = b2Var.c0();
                    c015.getClass();
                    switch (c015.hashCode()) {
                        case 270207856:
                            if (c015.equals("sdk_name")) {
                                z13 = false;
                                break;
                            }
                            z13 = -1;
                            break;
                        case 696101379:
                            if (c015.equals("version_patchlevel")) {
                                z13 = true;
                                break;
                            }
                            z13 = -1;
                            break;
                        case 1111241618:
                            if (c015.equals("version_major")) {
                                z13 = 2;
                                break;
                            }
                            z13 = -1;
                            break;
                        case 1111483790:
                            if (c015.equals("version_minor")) {
                                z13 = 3;
                                break;
                            }
                            z13 = -1;
                            break;
                        default:
                            z13 = -1;
                            break;
                    }
                    switch (z13) {
                        case false:
                            sVar.f16905a = b2Var.i0();
                            break;
                        case true:
                            sVar.f16908d = b2Var.O();
                            break;
                        case true:
                            sVar.f16906b = b2Var.O();
                            break;
                        case true:
                            sVar.f16907c = b2Var.O();
                            break;
                        default:
                            if (hashMap5 == null) {
                                hashMap5 = new HashMap();
                            }
                            b2Var.j0(iLogger, hashMap5, c015);
                            break;
                    }
                }
                b2Var.r();
                sVar.f16909e = hashMap5;
                return sVar;
            case 21:
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                b2Var.k();
                String str5 = null;
                String str6 = null;
                HashMap hashMap6 = null;
                while (b2Var.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String c016 = b2Var.c0();
                    c016.getClass();
                    switch (c016.hashCode()) {
                        case 3373707:
                            if (c016.equals("name")) {
                                z14 = false;
                                break;
                            }
                            z14 = -1;
                            break;
                        case 351608024:
                            if (c016.equals("version")) {
                                z14 = true;
                                break;
                            }
                            z14 = -1;
                            break;
                        case 750867693:
                            if (c016.equals("packages")) {
                                z14 = 2;
                                break;
                            }
                            z14 = -1;
                            break;
                        case 1487029535:
                            if (c016.equals("integrations")) {
                                z14 = 3;
                                break;
                            }
                            z14 = -1;
                            break;
                        default:
                            z14 = -1;
                            break;
                    }
                    switch (z14) {
                        case false:
                            str5 = b2Var.h0();
                            break;
                        case true:
                            str6 = b2Var.h0();
                            break;
                        case true:
                            ArrayList R2 = b2Var.R(iLogger, new b(24));
                            if (R2 == null) {
                                break;
                            } else {
                                arrayList2.addAll(R2);
                                break;
                            }
                        case true:
                            List list2 = (List) b2Var.d0();
                            if (list2 == null) {
                                break;
                            } else {
                                arrayList3.addAll(list2);
                                break;
                            }
                        default:
                            if (hashMap6 == null) {
                                hashMap6 = new HashMap();
                            }
                            b2Var.j0(iLogger, hashMap6, c016);
                            break;
                    }
                }
                b2Var.r();
                if (str5 == null) {
                    IllegalStateException illegalStateException4 = new IllegalStateException("Missing required field \"name\"");
                    iLogger.e(b5.ERROR, "Missing required field \"name\"", illegalStateException4);
                    throw illegalStateException4;
                }
                if (str6 == null) {
                    IllegalStateException illegalStateException5 = new IllegalStateException("Missing required field \"version\"");
                    iLogger.e(b5.ERROR, "Missing required field \"version\"", illegalStateException5);
                    throw illegalStateException5;
                }
                t tVar = new t(str5, str6);
                tVar.f16912c = new CopyOnWriteArraySet(arrayList2);
                tVar.f16913d = new CopyOnWriteArraySet(arrayList3);
                tVar.f16914e = hashMap6;
                return tVar;
            case zg.g.DEBUGMODULES_FIELD_NUMBER /* 22 */:
                u uVar = new u();
                b2Var.k();
                HashMap hashMap7 = null;
                while (b2Var.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String c017 = b2Var.c0();
                    c017.getClass();
                    switch (c017.hashCode()) {
                        case -1562235024:
                            if (c017.equals("thread_id")) {
                                z15 = false;
                                break;
                            }
                            z15 = -1;
                            break;
                        case -1068784020:
                            if (c017.equals("module")) {
                                z15 = true;
                                break;
                            }
                            z15 = -1;
                            break;
                        case 3575610:
                            if (c017.equals("type")) {
                                z15 = 2;
                                break;
                            }
                            z15 = -1;
                            break;
                        case 111972721:
                            if (c017.equals("value")) {
                                z15 = 3;
                                break;
                            }
                            z15 = -1;
                            break;
                        case 1225089881:
                            if (c017.equals("mechanism")) {
                                z15 = 4;
                                break;
                            }
                            z15 = -1;
                            break;
                        case 2055832509:
                            if (c017.equals("stacktrace")) {
                                z15 = 5;
                                break;
                            }
                            z15 = -1;
                            break;
                        default:
                            z15 = -1;
                            break;
                    }
                    switch (z15) {
                        case false:
                            uVar.f16918d = b2Var.W();
                            break;
                        case true:
                            uVar.f16917c = b2Var.i0();
                            break;
                        case true:
                            uVar.f16915a = b2Var.i0();
                            break;
                        case true:
                            uVar.f16916b = b2Var.i0();
                            break;
                        case true:
                            uVar.f16920f = (m) b2Var.f0(iLogger, new b(16));
                            break;
                        case true:
                            uVar.f16919e = (b0) b2Var.f0(iLogger, new b(28));
                            break;
                        default:
                            if (hashMap7 == null) {
                                hashMap7 = new HashMap();
                            }
                            b2Var.j0(iLogger, hashMap7, c017);
                            break;
                    }
                }
                b2Var.r();
                uVar.f16921g = hashMap7;
                return uVar;
            case zg.g.ISCRASH_FIELD_NUMBER /* 23 */:
                return new v(b2Var.h0());
            case zg.g.FORCEINGEST_FIELD_NUMBER /* 24 */:
                b2Var.k();
                String str7 = null;
                String str8 = null;
                HashMap hashMap8 = null;
                while (b2Var.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String c018 = b2Var.c0();
                    c018.getClass();
                    if (c018.equals("name")) {
                        str7 = b2Var.h0();
                    } else if (c018.equals("version")) {
                        str8 = b2Var.h0();
                    } else {
                        if (hashMap8 == null) {
                            hashMap8 = new HashMap();
                        }
                        b2Var.j0(iLogger, hashMap8, c018);
                    }
                }
                b2Var.r();
                if (str7 == null) {
                    IllegalStateException illegalStateException6 = new IllegalStateException("Missing required field \"name\"");
                    iLogger.e(b5.ERROR, "Missing required field \"name\"", illegalStateException6);
                    throw illegalStateException6;
                }
                if (str8 != null) {
                    w wVar = new w(str7, str8);
                    wVar.f16926c = hashMap8;
                    return wVar;
                }
                IllegalStateException illegalStateException7 = new IllegalStateException("Missing required field \"version\"");
                iLogger.e(b5.ERROR, "Missing required field \"version\"", illegalStateException7);
                throw illegalStateException7;
            case C0122e9.F /* 25 */:
                b2Var.k();
                x xVar = new x();
                ConcurrentHashMap concurrentHashMap8 = null;
                while (b2Var.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String c019 = b2Var.c0();
                    c019.getClass();
                    switch (c019.hashCode()) {
                        case -339173787:
                            if (c019.equals("raw_description")) {
                                z16 = false;
                                break;
                            }
                            z16 = -1;
                            break;
                        case 3373707:
                            if (c019.equals("name")) {
                                z16 = true;
                                break;
                            }
                            z16 = -1;
                            break;
                        case 351608024:
                            if (c019.equals("version")) {
                                z16 = 2;
                                break;
                            }
                            z16 = -1;
                            break;
                        default:
                            z16 = -1;
                            break;
                    }
                    switch (z16) {
                        case false:
                            xVar.f16929c = b2Var.i0();
                            break;
                        case true:
                            xVar.f16927a = b2Var.i0();
                            break;
                        case true:
                            xVar.f16928b = b2Var.i0();
                            break;
                        default:
                            if (concurrentHashMap8 == null) {
                                concurrentHashMap8 = new ConcurrentHashMap();
                            }
                            b2Var.j0(iLogger, concurrentHashMap8, c019);
                            break;
                    }
                }
                xVar.f16930d = concurrentHashMap8;
                b2Var.r();
                return xVar;
            case C0122e9.G /* 26 */:
                b2Var.k();
                ConcurrentHashMap concurrentHashMap9 = null;
                Map map4 = null;
                HashMap hashMap9 = null;
                Double d10 = null;
                Double d11 = null;
                v vVar = null;
                p6 p6Var = null;
                p6 p6Var2 = null;
                String str9 = null;
                String str10 = null;
                q6 q6Var = null;
                String str11 = null;
                Map map5 = null;
                while (b2Var.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String c020 = b2Var.c0();
                    c020.getClass();
                    switch (c020.hashCode()) {
                        case -2011840976:
                            if (c020.equals("span_id")) {
                                c10 = 0;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -1757797477:
                            if (c020.equals("parent_span_id")) {
                                c10 = 1;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -1724546052:
                            if (c020.equals("description")) {
                                c10 = 2;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -1526966919:
                            if (c020.equals("start_timestamp")) {
                                c10 = 3;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -1008619738:
                            if (c020.equals("origin")) {
                                c10 = 4;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -892481550:
                            if (c020.equals(PredictionTable.statusColumn)) {
                                c10 = 5;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -362243017:
                            if (c020.equals("measurements")) {
                                c10 = 6;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 3553:
                            if (c020.equals("op")) {
                                c10 = 7;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 3076010:
                            if (c020.equals("data")) {
                                c10 = '\b';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 3552281:
                            if (c020.equals("tags")) {
                                c10 = '\t';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 55126294:
                            if (c020.equals("timestamp")) {
                                c10 = '\n';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 1270300245:
                            if (c020.equals("trace_id")) {
                                c10 = 11;
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
                            p6Var = new p6(b2Var.h0());
                            break;
                        case 1:
                            p6Var2 = (p6) b2Var.f0(iLogger, new io.sentry.d(23));
                            break;
                        case 2:
                            str10 = b2Var.i0();
                            break;
                        case 3:
                            try {
                                d10 = b2Var.C();
                                break;
                            } catch (NumberFormatException unused2) {
                                if (b2Var.y(iLogger) == null) {
                                    d10 = null;
                                    break;
                                } else {
                                    d10 = Double.valueOf(r7.getTime() / 1000.0d);
                                    break;
                                }
                            }
                        case 4:
                            str11 = b2Var.i0();
                            break;
                        case 5:
                            q6Var = (q6) b2Var.f0(iLogger, new io.sentry.d(24));
                            break;
                        case 6:
                            hashMap9 = b2Var.Y(iLogger, new b(15));
                            break;
                        case 7:
                            str9 = b2Var.i0();
                            break;
                        case '\b':
                            map5 = (Map) b2Var.d0();
                            break;
                        case '\t':
                            map4 = (Map) b2Var.d0();
                            break;
                        case '\n':
                            try {
                                d11 = b2Var.C();
                                break;
                            } catch (NumberFormatException unused3) {
                                if (b2Var.y(iLogger) == null) {
                                    d11 = null;
                                    break;
                                } else {
                                    d11 = Double.valueOf(r7.getTime() / 1000.0d);
                                    break;
                                }
                            }
                        case 11:
                            vVar = new v(b2Var.h0());
                            break;
                        default:
                            if (concurrentHashMap9 == null) {
                                concurrentHashMap9 = new ConcurrentHashMap();
                            }
                            b2Var.j0(iLogger, concurrentHashMap9, c020);
                            break;
                    }
                }
                if (d10 == null) {
                    throw j("start_timestamp", iLogger);
                }
                if (vVar == null) {
                    throw j("trace_id", iLogger);
                }
                if (p6Var == null) {
                    throw j("span_id", iLogger);
                }
                if (str9 == null) {
                    throw j("op", iLogger);
                }
                if (map4 == null) {
                    map4 = new HashMap();
                }
                Map map6 = map4;
                if (hashMap9 == null) {
                    hashMap9 = new HashMap();
                }
                y yVar = new y(d10, d11, vVar, p6Var, p6Var2, str9, str10, q6Var, str11, map6, hashMap9, map5);
                yVar.f16942m = concurrentHashMap9;
                b2Var.r();
                return yVar;
            case C0122e9.H /* 27 */:
                z zVar = new z();
                b2Var.k();
                ConcurrentHashMap concurrentHashMap10 = null;
                while (b2Var.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String c021 = b2Var.c0();
                    c021.getClass();
                    switch (c021.hashCode()) {
                        case -1641491184:
                            if (c021.equals("post_context")) {
                                c11 = 0;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case -1443345323:
                            if (c021.equals("image_addr")) {
                                c11 = 1;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case -1184392185:
                            if (c021.equals("in_app")) {
                                c11 = 2;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case -1113875953:
                            if (c021.equals("raw_function")) {
                                c11 = 3;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case -1102671691:
                            if (c021.equals("lineno")) {
                                c11 = 4;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case -1068784020:
                            if (c021.equals("module")) {
                                c11 = 5;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case -1052618729:
                            if (c021.equals("native")) {
                                c11 = 6;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case -887523944:
                            if (c021.equals("symbol")) {
                                c11 = 7;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case -807062458:
                            if (c021.equals("package")) {
                                c11 = '\b';
                                break;
                            }
                            c11 = 65535;
                            break;
                        case -734768633:
                            if (c021.equals("filename")) {
                                c11 = '\t';
                                break;
                            }
                            c11 = 65535;
                            break;
                        case -330260936:
                            if (c021.equals("symbol_addr")) {
                                c11 = '\n';
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 3327275:
                            if (c021.equals("lock")) {
                                c11 = 11;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 3612204:
                            if (c021.equals("vars")) {
                                c11 = '\f';
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 94842689:
                            if (c021.equals("colno")) {
                                c11 = '\r';
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 410194178:
                            if (c021.equals("instruction_addr")) {
                                c11 = 14;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 822688787:
                            if (c021.equals("pre_context")) {
                                c11 = 15;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 868820273:
                            if (c021.equals("addr_mode")) {
                                c11 = 16;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 1116694660:
                            if (c021.equals("context_line")) {
                                c11 = 17;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 1380938712:
                            if (c021.equals("function")) {
                                c11 = 18;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 1713445842:
                            if (c021.equals("abs_path")) {
                                c11 = 19;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 1874684019:
                            if (c021.equals("platform")) {
                                c11 = 20;
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
                            zVar.f16944b = (List) b2Var.d0();
                            break;
                        case 1:
                            zVar.f16956o = b2Var.i0();
                            break;
                        case 2:
                            zVar.f16952k = b2Var.w();
                            break;
                        case 3:
                            zVar.f16961u = b2Var.i0();
                            break;
                        case 4:
                            zVar.f16949g = b2Var.O();
                            break;
                        case 5:
                            zVar.f16948f = b2Var.i0();
                            break;
                        case 6:
                            zVar.f16954m = b2Var.w();
                            break;
                        case 7:
                            zVar.f16959s = b2Var.i0();
                            break;
                        case '\b':
                            zVar.f16953l = b2Var.i0();
                            break;
                        case '\t':
                            zVar.f16946d = b2Var.i0();
                            break;
                        case '\n':
                            zVar.f16957p = b2Var.i0();
                            break;
                        case 11:
                            zVar.f16962v = (c5) b2Var.f0(iLogger, new io.sentry.d(12));
                            break;
                        case '\f':
                            zVar.f16945c = (Map) b2Var.d0();
                            break;
                        case '\r':
                            zVar.f16950h = b2Var.O();
                            break;
                        case 14:
                            zVar.q = b2Var.i0();
                            break;
                        case 15:
                            zVar.f16943a = (List) b2Var.d0();
                            break;
                        case 16:
                            zVar.f16958r = b2Var.i0();
                            break;
                        case 17:
                            zVar.j = b2Var.i0();
                            break;
                        case 18:
                            zVar.f16947e = b2Var.i0();
                            break;
                        case 19:
                            zVar.f16951i = b2Var.i0();
                            break;
                        case 20:
                            zVar.f16955n = b2Var.i0();
                            break;
                        default:
                            if (concurrentHashMap10 == null) {
                                concurrentHashMap10 = new ConcurrentHashMap();
                            }
                            b2Var.j0(iLogger, concurrentHashMap10, c021);
                            break;
                    }
                }
                zVar.f16960t = concurrentHashMap10;
                b2Var.r();
                return zVar;
            case 28:
                b0 b0Var = new b0();
                b2Var.k();
                ConcurrentHashMap concurrentHashMap11 = null;
                while (b2Var.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String c022 = b2Var.c0();
                    c022.getClass();
                    switch (c022.hashCode()) {
                        case -1266514778:
                            if (c022.equals("frames")) {
                                z17 = false;
                                break;
                            }
                            z17 = -1;
                            break;
                        case -1010705206:
                            if (c022.equals("instruction_addr_adjustment")) {
                                z17 = true;
                                break;
                            }
                            z17 = -1;
                            break;
                        case 78226992:
                            if (c022.equals("registers")) {
                                z17 = 2;
                                break;
                            }
                            z17 = -1;
                            break;
                        case 284874180:
                            if (c022.equals("snapshot")) {
                                z17 = 3;
                                break;
                            }
                            z17 = -1;
                            break;
                        default:
                            z17 = -1;
                            break;
                    }
                    switch (z17) {
                        case false:
                            b0Var.f16749a = b2Var.R(iLogger, new b(27));
                            break;
                        case true:
                            b0Var.f16752d = (a0) b2Var.f0(iLogger, new b(29));
                            break;
                        case true:
                            b0Var.f16750b = com.google.android.play.core.appupdate.b.A((Map) b2Var.d0());
                            break;
                        case true:
                            b0Var.f16751c = b2Var.w();
                            break;
                        default:
                            if (concurrentHashMap11 == null) {
                                concurrentHashMap11 = new ConcurrentHashMap();
                            }
                            b2Var.j0(iLogger, concurrentHashMap11, c022);
                            break;
                    }
                }
                b0Var.f16753e = concurrentHashMap11;
                b2Var.r();
                return b0Var;
            default:
                return a0.valueOf(b2Var.h0().toUpperCase(Locale.ROOT));
        }
    }
}
