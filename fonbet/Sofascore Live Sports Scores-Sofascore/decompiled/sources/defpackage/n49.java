package defpackage;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class n49 {
    public static final Logger a = Logger.getLogger(n49.class.getName());
    public static final Set b = Collections.unmodifiableSet(EnumSet.of(vei.OK, vei.INVALID_ARGUMENT, vei.NOT_FOUND, vei.ALREADY_EXISTS, vei.FAILED_PRECONDITION, vei.ABORTED, vei.OUT_OF_RANGE, vei.DATA_LOSS));
    public static final jic c;
    public static final jic d;
    public static final nic e;
    public static final jic f;
    public static final nic g;
    public static final jic h;
    public static final jic i;
    public static final jic j;
    public static final jic k;
    public static final long l;
    public static final jgf m;
    public static final ih2 n;
    public static final k49 o;
    public static final f7a p;
    public static final inb q;
    public static final l49 r;

    static {
        Charset.forName(C.ASCII_NAME);
        int i2 = 25;
        c = new jic("grpc-timeout", new zic(i2));
        it7 it7Var = qic.d;
        d = new jic("grpc-encoding", it7Var);
        e = h8a.a("grpc-accept-encoding", new uic(i2));
        f = new jic("content-encoding", it7Var);
        g = h8a.a("accept-encoding", new uic(i2));
        h = new jic("content-length", it7Var);
        i = new jic("content-type", it7Var);
        j = new jic("te", it7Var);
        k = new jic("user-agent", it7Var);
        hp2.c.getClass();
        l = 20000000000L;
        m = new jgf();
        n = new ih2("io.grpc.internal.CALL_OPTIONS_RPC_OWNED_BY_BALANCER", 0);
        o = new k49();
        p = new f7a(i2);
        q = new inb(i2);
        r = new l49(0);
    }

    public static URI a(String str) {
        String str2;
        z1a.y(str, "authority");
        try {
            str2 = str;
            try {
                return new URI(null, str2, null, null, null);
            } catch (URISyntaxException e2) {
                e = e2;
                throw new IllegalArgumentException("Invalid authority: ".concat(str2), e);
            }
        } catch (URISyntaxException e3) {
            e = e3;
            str2 = str;
        }
    }

    public static void b(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e2) {
            a.log(Level.WARNING, "exception caught in closeQuietly", (Throwable) e2);
        }
    }

    public static cy2[] c(jh2 jh2Var, qic qicVar, int i2, boolean z) {
        List list = jh2Var.d;
        int size = list.size();
        cy2[] cy2VarArr = new cy2[size + 1];
        jh2 jh2Var2 = jh2.h;
        pp4 pp4Var = new pp4(jh2Var, i2, z);
        for (int i3 = 0; i3 < list.size(); i3++) {
            cy2VarArr[i3] = ((by2) list.get(i3)).a(pp4Var, qicVar);
        }
        cy2VarArr[size] = o;
        return cy2VarArr;
    }

    public static String d(InetSocketAddress inetSocketAddress) {
        try {
            return (String) InetSocketAddress.class.getMethod("getHostString", null).invoke(inetSocketAddress, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return inetSocketAddress.getHostName();
        }
    }

    public static zfj e(String str) {
        Boolean bool = Boolean.TRUE;
        String.format(Locale.ROOT, str, 0);
        return new zfj(Executors.defaultThreadFactory(), str, new AtomicLong(0L), bool);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static dy2 f(bfb bfbVar, boolean z) {
        p8a p8aVar;
        o6a o6aVar = bfbVar.a;
        xei xeiVar = bfbVar.c;
        if (o6aVar != null) {
            t8a t8aVar = (t8a) o6aVar.D();
            p8aVar = t8aVar.v;
            if (p8aVar == null) {
                t8aVar.k.execute(new n8a(t8aVar, 1));
            }
            if (p8aVar == null) {
                by2 by2Var = bfbVar.b;
                return by2Var == null ? p8aVar : new mn6(by2Var, p8aVar);
            }
            if (!xeiVar.f()) {
                if (bfbVar.d) {
                    return new mn6(h(xeiVar), zx2.c);
                }
                if (!z) {
                    return new mn6(h(xeiVar), zx2.a);
                }
            }
            return null;
        }
        p8aVar = null;
        if (p8aVar == null) {
        }
    }

    public static xei g(int i2) {
        vei veiVar;
        if (i2 < 100 || i2 >= 200) {
            if (i2 != 400) {
                if (i2 == 401) {
                    veiVar = vei.UNAUTHENTICATED;
                } else if (i2 == 403) {
                    veiVar = vei.PERMISSION_DENIED;
                } else if (i2 != 404) {
                    if (i2 != 429) {
                        if (i2 != 431) {
                            switch (i2) {
                                case 502:
                                case PglCryptUtils.COMPRESS_FAILED /* 503 */:
                                case PglCryptUtils.BASE64_FAILED /* 504 */:
                                    break;
                                default:
                                    veiVar = vei.UNKNOWN;
                                    break;
                            }
                        }
                    }
                    veiVar = vei.UNAVAILABLE;
                } else {
                    veiVar = vei.UNIMPLEMENTED;
                }
            }
            veiVar = vei.INTERNAL;
        } else {
            veiVar = vei.INTERNAL;
        }
        return veiVar.d().h("HTTP status code " + i2);
    }

    public static xei h(xei xeiVar) {
        z1a.s(xeiVar != null);
        if (!b.contains(xeiVar.a)) {
            return xeiVar;
        }
        return xei.l.h("Inappropriate status code from control plane: " + xeiVar.a + " " + xeiVar.b).g(xeiVar.c);
    }
}
