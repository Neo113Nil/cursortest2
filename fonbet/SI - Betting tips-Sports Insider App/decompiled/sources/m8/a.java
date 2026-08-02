package m8;

import com.google.android.gms.internal.measurement.b7;
import com.google.android.gms.internal.measurement.d7;
import com.google.android.gms.internal.measurement.j7;
import com.google.android.gms.internal.measurement.l8;
import com.google.android.gms.internal.measurement.n8;
import com.google.android.gms.internal.measurement.o8;
import com.google.android.gms.internal.measurement.q8;
import com.google.android.gms.internal.measurement.y7;
import com.google.firebase.analytics.connector.internal.AnalyticsConnectorRegistrar;
import gh.h0;
import io.appmetrica.analytics.impl.C0122e9;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.collections.v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import o8.d;
import okio.Buffer;
import rh.e;
import rh.l;
import rh.n;
import s7.p;
import s7.x;
import zg.g;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements d, n5.a, l, p {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a f20473b = new a(0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a f20474c = new a(6);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a f20475d = new a(7);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a f20476e = new a(8);

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a f20477f = new a(9);

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ a f20478g = new a(10);

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ a f20479h = new a(11);

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ a f20480i = new a(12);
    public static final /* synthetic */ a j = new a(13);

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ a f20481k = new a(14);

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ a f20482l = new a(15);

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ a f20483m = new a(16);

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ a f20484n = new a(17);

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ a f20485o = new a(18);

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ a f20486p = new a(19);
    public static final /* synthetic */ a q = new a(20);

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ a f20487r = new a(21);

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ a f20488s = new a(22);

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ a f20489t = new a(23);

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ a f20490u = new a(24);

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ a f20491v = new a(25);

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ a f20492w = new a(26);

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ a f20493x = new a(27);

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ a f20494y = new a(28);

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ a f20495z = new a(29);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20496a;

    public /* synthetic */ a(int i5) {
        this.f20496a = i5;
    }

    public static ArrayList d(List protocols) {
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object obj : protocols) {
            if (((h0) obj) != h0.f10198c) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(v.k(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((h0) it.next()).f10205a);
        }
        return arrayList2;
    }

    public static byte[] e(List protocols) {
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Buffer buffer = new Buffer();
        Iterator it = d(protocols).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            buffer.writeByte(str.length());
            buffer.writeUtf8(str);
        }
        return buffer.readByteArray();
    }

    @Override // s7.p
    public Object a() {
        switch (this.f20496a) {
            case 6:
                return new Boolean(((Boolean) j7.f5104a.b()).booleanValue());
            case 7:
                return new Boolean(((Boolean) y7.f5371a.b()).booleanValue());
            case 8:
                List list = x.f23173a;
                o8.f5169b.get();
                Boolean bool = (Boolean) q8.f5208c.b();
                bool.getClass();
                return bool;
            case 9:
                List list2 = x.f23173a;
                b7.f4937b.get();
                return (String) d7.f4979e.b();
            case 10:
                List list3 = x.f23173a;
                b7.f4937b.get();
                return Integer.valueOf((int) ((Long) d7.f4990l0.b()).longValue());
            case 11:
                List list4 = x.f23173a;
                b7.f4937b.get();
                return Integer.valueOf((int) ((Long) d7.f4999q0.b()).longValue());
            case 12:
                List list5 = x.f23173a;
                b7.f4937b.get();
                return (String) d7.f4993n.b();
            case 13:
                List list6 = x.f23173a;
                b7.f4937b.get();
                Long l6 = (Long) d7.T.b();
                l6.getClass();
                return l6;
            case 14:
                List list7 = x.f23173a;
                b7.f4937b.get();
                Long l10 = (Long) d7.J.b();
                l10.getClass();
                return l10;
            case 15:
                List list8 = x.f23173a;
                b7.f4937b.get();
                return Integer.valueOf((int) ((Long) d7.P.b()).longValue());
            case 16:
                List list9 = x.f23173a;
                b7.f4937b.get();
                Long l11 = (Long) d7.R.b();
                l11.getClass();
                return l11;
            case 17:
                List list10 = x.f23173a;
                b7.f4937b.get();
                Long l12 = (Long) d7.f4980f.b();
                l12.getClass();
                return l12;
            case 18:
                List list11 = x.f23173a;
                b7.f4937b.get();
                Long l13 = (Long) d7.f4985h0.b();
                l13.getClass();
                return l13;
            case 19:
                List list12 = x.f23173a;
                b7.f4937b.get();
                Long l14 = (Long) d7.f5014z.b();
                l14.getClass();
                return l14;
            case 20:
                List list13 = x.f23173a;
                b7.f4937b.get();
                Long l15 = (Long) d7.F.b();
                l15.getClass();
                return l15;
            case 21:
                List list14 = x.f23173a;
                b7.f4937b.get();
                Long l16 = (Long) d7.f5005t0.b();
                l16.getClass();
                return l16;
            case g.DEBUGMODULES_FIELD_NUMBER /* 22 */:
                List list15 = x.f23173a;
                b7.f4937b.get();
                Long l17 = (Long) d7.f4991m.b();
                l17.getClass();
                return l17;
            case g.ISCRASH_FIELD_NUMBER /* 23 */:
                List list16 = x.f23173a;
                b7.f4937b.get();
                Long l18 = (Long) d7.G.b();
                l18.getClass();
                return l18;
            case g.FORCEINGEST_FIELD_NUMBER /* 24 */:
                List list17 = x.f23173a;
                l8.f5132b.get();
                return (String) n8.f5157f.b();
            case C0122e9.F /* 25 */:
                List list18 = x.f23173a;
                l8.f5132b.get();
                Long l19 = (Long) n8.f5153b.b();
                l19.getClass();
                return l19;
            case C0122e9.G /* 26 */:
                List list19 = x.f23173a;
                b7.f4937b.get();
                return Integer.valueOf((int) ((Long) d7.f5002s.b()).longValue());
            case C0122e9.H /* 27 */:
                List list20 = x.f23173a;
                b7.f4937b.get();
                return Integer.valueOf((int) ((Long) d7.f4977d.b()).longValue());
            case 28:
                List list21 = x.f23173a;
                b7.f4937b.get();
                return Integer.valueOf((int) ((Long) d7.j0.b()).longValue());
            default:
                List list22 = x.f23173a;
                b7.f4937b.get();
                return (String) d7.f4976c0.b();
        }
    }

    @Override // rh.l
    public boolean b(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        String name = sslSocket.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return z.o(name, "com.google.android.gms.org.conscrypt.", false);
    }

    @Override // rh.l
    public n c(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        a aVar = e.f22521f;
        Class<?> cls = sslSocket.getClass();
        Class<?> cls2 = cls;
        while (!Intrinsics.areEqual(cls2.getSimpleName(), "OpenSSLSocketImpl")) {
            cls2 = cls2.getSuperclass();
            if (cls2 == null) {
                throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
            }
        }
        Intrinsics.checkNotNull(cls2);
        return new e(cls2);
    }

    @Override // n5.a
    public long getTime() {
        return System.currentTimeMillis();
    }

    @Override // o8.d
    public /* synthetic */ Object h(com.google.firebase.messaging.x xVar) {
        l8.b lambda$getComponents$0;
        lambda$getComponents$0 = AnalyticsConnectorRegistrar.lambda$getComponents$0(xVar);
        return lambda$getComponents$0;
    }
}
