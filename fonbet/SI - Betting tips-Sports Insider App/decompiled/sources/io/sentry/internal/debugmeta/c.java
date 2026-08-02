package io.sentry.internal.debugmeta;

import android.os.Bundle;
import android.os.Parcel;
import android.text.SpannableStringBuilder;
import android.util.SparseArray;
import android.view.View;
import android.widget.LinearLayout;
import b2.e;
import com.android.billingclient.api.z;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.internal.measurement.d5;
import com.google.android.gms.internal.measurement.g4;
import com.google.android.gms.libs.identity.zzee;
import com.google.android.gms.libs.identity.zzeg;
import com.google.android.gms.libs.identity.zzei;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.measurement.internal.zzoh;
import com.google.android.play.core.integrity.d;
import com.sports.insider.R;
import com.sports.insider.domain.entity.CustomTypefaceSpan;
import d8.g;
import d8.n;
import e6.j;
import e6.k;
import f7.l;
import f7.q;
import gf.t;
import gh.f;
import gh.o0;
import hd.m;
import io.sentry.ILogger;
import io.sentry.b5;
import io.sentry.h0;
import io.sentry.m5;
import j$.util.Objects;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.UUID;
import java.util.concurrent.Executors;
import k2.x;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import m7.h;
import m7.i;
import m7.s;
import md.o;
import oi.a0;
import oi.z0;
import okio.Segment;
import s7.e2;
import s7.f1;
import s7.n0;
import s7.u1;
import s7.v0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c implements a, g, b3.a, k, m5, f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16516a;

    /* renamed from: b, reason: collision with root package name */
    public Object f16517b;

    /* renamed from: c, reason: collision with root package name */
    public Object f16518c;

    public /* synthetic */ c(int i5, Object obj, Object obj2) {
        this.f16516a = i5;
        this.f16517b = obj;
        this.f16518c = obj2;
    }

    public static String p(File file) {
        StringBuilder sb2 = new StringBuilder();
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8);
        char[] cArr = new char[Segment.SHARE_MINIMUM];
        while (true) {
            int read = inputStreamReader.read(cArr, 0, Segment.SHARE_MINIMUM);
            if (read <= 0) {
                return sb2.toString();
            }
            sb2.append(cArr, 0, read);
        }
    }

    @Override // d8.h
    public Object a() {
        return new com.google.android.play.core.integrity.g(((e) this.f16517b).f2968a, (n) ((d8.f) this.f16518c).a(), new d(4));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005a A[Catch: all -> 0x0046, TryCatch #1 {all -> 0x0046, blocks: (B:6:0x0031, B:10:0x003f, B:13:0x005a, B:16:0x006d, B:21:0x0098, B:24:0x004b), top: B:5:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0098 A[Catch: all -> 0x0046, TRY_LEAVE, TryCatch #1 {all -> 0x0046, blocks: (B:6:0x0031, B:10:0x003f, B:13:0x005a, B:16:0x006d, B:21:0x0098, B:24:0x004b), top: B:5:0x0031 }] */
    @Override // e6.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void accept(Object obj, Object obj2) {
        h hVar;
        s.n nVar;
        switch (this.f16516a) {
            case 7:
                f7.a aVar = new f7.a((f7.b) this.f16517b, (w7.g) obj2, 1);
                q qVar = (q) ((f7.d) obj).m();
                BeginSignInRequest beginSignInRequest = (BeginSignInRequest) this.f16518c;
                ApiMetadata a7 = f7.e.a();
                Parcel a10 = qVar.a();
                int i5 = l.f9493a;
                a10.writeStrongBinder(aVar);
                l.b(a10, beginSignInRequest);
                l.b(a10, a7);
                qVar.e(a10, 1);
                return;
            default:
                w7.g gVar = (w7.g) obj2;
                i iVar = (i) obj;
                g4 g4Var = (g4) this.f16517b;
                LocationRequest locationRequest = (LocationRequest) this.f16518c;
                iVar.getClass();
                j c2 = g4Var.c();
                e6.i iVar2 = (e6.i) c2.f8719b;
                Objects.requireNonNull(iVar2);
                boolean y5 = iVar.y(p7.e.f21527b);
                s.n nVar2 = iVar.C;
                synchronized (nVar2) {
                    try {
                        try {
                            h hVar2 = (h) iVar.C.get(iVar2);
                            if (hVar2 != null && !y5) {
                                hVar2.V(c2);
                                hVar = hVar2;
                                hVar2 = null;
                                if (y5) {
                                    h hVar3 = hVar;
                                    s sVar = (s) iVar.m();
                                    nVar = nVar2;
                                    zzei zzeiVar = new zzei(1, new zzeg(locationRequest, null, false, false, false, false, LongCompanionObject.MAX_VALUE), null, hVar3, null, new m7.d(gVar, hVar3), iVar2.a());
                                    Parcel O = sVar.O();
                                    int i10 = m7.c.f20451a;
                                    O.writeInt(1);
                                    zzeiVar.writeToParcel(O, 0);
                                    sVar.P(O, 59);
                                } else {
                                    s sVar2 = (s) iVar.m();
                                    zzee zzeeVar = new zzee(2, hVar2 == null ? null : hVar2, hVar, null, iVar2.a());
                                    m7.e eVar = new m7.e(null, gVar);
                                    Parcel O2 = sVar2.O();
                                    int i11 = m7.c.f20451a;
                                    O2.writeInt(1);
                                    zzeeVar.writeToParcel(O2, 0);
                                    O2.writeInt(1);
                                    locationRequest.writeToParcel(O2, 0);
                                    O2.writeStrongBinder(eVar);
                                    sVar2.P(O2, 88);
                                    nVar = nVar2;
                                }
                                return;
                            }
                            h hVar4 = new h(g4Var);
                            iVar.C.put(iVar2, hVar4);
                            hVar = hVar4;
                            if (y5) {
                            }
                            return;
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        throw th;
                    }
                }
                throw th;
        }
    }

    @Override // gh.f
    public void b(gh.e eVar, IOException iOException) {
        try {
            ((oi.g) this.f16517b).b((a0) this.f16518c, iOException);
        } catch (Throwable th2) {
            z0.q(th2);
            th2.printStackTrace();
        }
    }

    public z c() {
        if ("first_party".equals((String) this.f16518c)) {
            throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
        }
        if (((String) this.f16517b) == null) {
            throw new IllegalArgumentException("Product id must be provided.");
        }
        if (((String) this.f16518c) != null) {
            return new z(this);
        }
        throw new IllegalArgumentException("Product type must be provided.");
    }

    @Override // io.sentry.internal.debugmeta.a
    public List d() {
        ILogger iLogger = (ILogger) this.f16517b;
        ArrayList arrayList = new ArrayList();
        try {
            Enumeration<URL> resources = ((ClassLoader) this.f16518c).getResources("sentry-debug-meta.properties");
            while (resources.hasMoreElements()) {
                URL nextElement = resources.nextElement();
                try {
                    InputStream openStream = nextElement.openStream();
                    try {
                        Properties properties = new Properties();
                        properties.load(openStream);
                        arrayList.add(properties);
                        iLogger.h(b5.INFO, "Debug Meta Data Properties loaded from %s", nextElement);
                        if (openStream != null) {
                            openStream.close();
                        }
                    } catch (Throwable th2) {
                        if (openStream != null) {
                            try {
                                openStream.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                        }
                        throw th2;
                    }
                } catch (RuntimeException e7) {
                    iLogger.b(b5.ERROR, e7, "%s file is malformed.", nextElement);
                }
            }
        } catch (IOException e9) {
            iLogger.b(b5.ERROR, e9, "Failed to load %s", "sentry-debug-meta.properties");
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        iLogger.h(b5.INFO, "No %s file was found.", "sentry-debug-meta.properties");
        return null;
    }

    public void e() {
        long usableSpace = ((File) this.f16517b).getUsableSpace();
        double usableSpace2 = r0.getUsableSpace() / r0.getTotalSpace();
        if (usableSpace <= 10485760 || usableSpace2 <= 0.1d) {
            StringBuilder p10 = r4.k.p(usableSpace, "Not enough storage remaining - availableBytes: ", ", availablePercent: ");
            p10.append(usableSpace2);
            throw new IOException(p10.toString());
        }
        ba.d dVar = (ba.d) this.f16518c;
        StringBuilder p11 = r4.k.p(usableSpace, "availableBytes: ", ", availablePercent: ");
        p11.append(usableSpace2);
        dVar.a(p11.toString());
    }

    public boolean f(m3.j id2) {
        boolean containsKey;
        Intrinsics.checkNotNullParameter(id2, "id");
        synchronized (this.f16518c) {
            e3.i iVar = (e3.i) this.f16517b;
            Intrinsics.checkNotNullParameter(id2, "id");
            containsKey = iVar.f8523a.containsKey(id2);
        }
        return containsKey;
    }

    public File g() {
        File file = new File((File) this.f16517b, UUID.randomUUID().toString());
        if (file.createNewFile()) {
            return file;
        }
        throw new IOException("UUID Collision! This should never happen.");
    }

    @Override // b3.a
    public View getRoot() {
        return (LinearLayout) this.f16517b;
    }

    public io.sentry.e h(io.sentry.e breadcrumb, h0 hint) {
        Intrinsics.checkNotNullParameter(breadcrumb, "breadcrumb");
        Intrinsics.checkNotNullParameter(hint, "hint");
        m5 m5Var = (m5) this.f16517b;
        if (m5Var != null) {
            breadcrumb = ((c) m5Var).h(breadcrumb, hint);
        }
        if (breadcrumb != null) {
            io.sentry.android.replay.d dVar = (io.sentry.android.replay.d) this.f16518c;
            io.sentry.util.network.f fVar = null;
            if (Intrinsics.areEqual(breadcrumb.f16334e, "http") || Intrinsics.areEqual(breadcrumb.f16336g, "http")) {
                Object b10 = hint.b("sentry:replayNetworkDetails");
                if (b10 instanceof io.sentry.util.network.f) {
                    fVar = (io.sentry.util.network.f) b10;
                }
            }
            if (fVar != null) {
                Map map = dVar.f16022b;
                Intrinsics.checkNotNullExpressionValue(map, "access$getHttpNetworkDetails$p(...)");
                map.put(breadcrumb, fVar);
            }
        }
        return breadcrumb;
    }

    public zc.k i() {
        return (zc.k) ((t) this.f16517b).getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0055, code lost:
    
        if (r9 == r2) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00f7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object j(mf.c cVar) {
        hd.j jVar;
        lf.a aVar;
        int i5;
        Object a7;
        String str;
        String str2;
        StringBuilder sb2;
        int G;
        o oVar = (o) this.f16518c;
        if (cVar instanceof hd.j) {
            jVar = (hd.j) cVar;
            int i10 = jVar.f10561f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                jVar.f10561f = i10 - Integer.MIN_VALUE;
                Object obj = jVar.f10559d;
                aVar = lf.a.f20034a;
                i5 = jVar.f10561f;
                if (i5 != 0) {
                    h8.b.B(obj);
                    jVar.f10561f = 1;
                    oVar.getClass();
                    o.c().getClass();
                    obj = za.h.a("rc_diamond_min_count_month", jVar);
                } else {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sb2 = jVar.f10558c;
                        str2 = jVar.f10557b;
                        str = jVar.f10556a;
                        h8.b.B(obj);
                        sb2.append(((Number) obj).longValue());
                        sb2.append('%');
                        String sb3 = sb2.toString();
                        i().getClass();
                        String i11 = zc.k.i(R.string.tarif_diamond_args, str, str2, sb3);
                        i().getClass();
                        G = StringsKt.G(i11, zc.k.h(R.string.tarif_diamond_bold_start), 0, false, 6);
                        if (G > -1) {
                            return i11;
                        }
                        i().getClass();
                        CustomTypefaceSpan b10 = zc.k.b();
                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(i11);
                        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(...)");
                        x.B(valueOf, G, i11.length(), b10);
                        return valueOf;
                    }
                    h8.b.B(obj);
                }
                long longValue = ((Number) obj).longValue();
                String valueOf2 = String.valueOf(longValue);
                i().getClass();
                String d10 = ((za.i) zc.k.e()).d(R.plurals.forecast_plurals, (int) longValue);
                StringBuilder sb4 = new StringBuilder();
                jVar.f10556a = valueOf2;
                jVar.f10557b = d10;
                jVar.f10558c = sb4;
                jVar.f10561f = 2;
                oVar.getClass();
                o.c().getClass();
                a7 = za.h.a("rc_diamond_passage", jVar);
                if (a7 != aVar) {
                    str = valueOf2;
                    obj = a7;
                    str2 = d10;
                    sb2 = sb4;
                    sb2.append(((Number) obj).longValue());
                    sb2.append('%');
                    String sb32 = sb2.toString();
                    i().getClass();
                    String i112 = zc.k.i(R.string.tarif_diamond_args, str, str2, sb32);
                    i().getClass();
                    G = StringsKt.G(i112, zc.k.h(R.string.tarif_diamond_bold_start), 0, false, 6);
                    if (G > -1) {
                    }
                }
                return aVar;
            }
        }
        jVar = new hd.j(this, cVar);
        Object obj2 = jVar.f10559d;
        aVar = lf.a.f20034a;
        i5 = jVar.f10561f;
        if (i5 != 0) {
        }
        long longValue2 = ((Number) obj2).longValue();
        String valueOf22 = String.valueOf(longValue2);
        i().getClass();
        String d102 = ((za.i) zc.k.e()).d(R.plurals.forecast_plurals, (int) longValue2);
        StringBuilder sb42 = new StringBuilder();
        jVar.f10556a = valueOf22;
        jVar.f10557b = d102;
        jVar.f10558c = sb42;
        jVar.f10561f = 2;
        oVar.getClass();
        o.c().getClass();
        a7 = za.h.a("rc_diamond_passage", jVar);
        if (a7 != aVar) {
        }
        return aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0068, code lost:
    
        if (r1 == r4) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0172 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object k(mf.c cVar) {
        hd.k kVar;
        lf.a aVar;
        int i5;
        Object c2;
        int i10;
        String str;
        double doubleValue;
        int i11;
        String format;
        Object a7;
        String str2;
        int i12;
        String str3;
        StringBuilder sb2;
        int G;
        o oVar = (o) this.f16518c;
        if (cVar instanceof hd.k) {
            kVar = (hd.k) cVar;
            int i13 = kVar.f10568g;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                kVar.f10568g = i13 - Integer.MIN_VALUE;
                Object obj = kVar.f10566e;
                aVar = lf.a.f20034a;
                i5 = kVar.f10568g;
                if (i5 != 0) {
                    h8.b.B(obj);
                    kVar.f10568g = 1;
                    oVar.getClass();
                    o.c().getClass();
                    obj = za.h.a("rc_express_min_count_week", kVar);
                } else {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            if (i5 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            i12 = kVar.f10562a;
                            sb2 = kVar.f10565d;
                            str2 = kVar.f10564c;
                            str3 = kVar.f10563b;
                            h8.b.B(obj);
                            sb2.append(((Number) obj).longValue());
                            sb2.append('%');
                            String sb3 = sb2.toString();
                            zc.k i14 = i();
                            Object[] objArr = {new Integer(i12), str3, str2, sb3};
                            i14.getClass();
                            String i15 = zc.k.i(R.string.tarif_express_args, objArr);
                            i().getClass();
                            G = StringsKt.G(i15, zc.k.h(R.string.tarif_bold_start_Odds), 0, false, 6);
                            if (G > -1) {
                                return i15;
                            }
                            i().getClass();
                            CustomTypefaceSpan b10 = zc.k.b();
                            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(i15);
                            Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(...)");
                            x.B(valueOf, G, i15.length(), b10);
                            return valueOf;
                        }
                        i10 = kVar.f10562a;
                        str = kVar.f10563b;
                        h8.b.B(obj);
                        doubleValue = ((Number) obj).doubleValue();
                        i11 = (int) doubleValue;
                        if (doubleValue % i11 != 0.0d) {
                            format = String.valueOf(i11);
                        } else {
                            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                            format = String.format("%.1f", Arrays.copyOf(new Object[]{new Double(doubleValue)}, 1));
                            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                        }
                        String l6 = kotlin.text.z.l(format.toString(), ',', '.', true);
                        StringBuilder sb4 = new StringBuilder();
                        kVar.f10563b = str;
                        kVar.f10564c = l6;
                        kVar.f10565d = sb4;
                        kVar.f10562a = i10;
                        kVar.f10568g = 3;
                        oVar.getClass();
                        o.c().getClass();
                        a7 = za.h.a("rc_express_passage", kVar);
                        if (a7 != aVar) {
                            int i16 = i10;
                            str2 = l6;
                            obj = a7;
                            i12 = i16;
                            str3 = str;
                            sb2 = sb4;
                            sb2.append(((Number) obj).longValue());
                            sb2.append('%');
                            String sb32 = sb2.toString();
                            zc.k i142 = i();
                            Object[] objArr2 = {new Integer(i12), str3, str2, sb32};
                            i142.getClass();
                            String i152 = zc.k.i(R.string.tarif_express_args, objArr2);
                            i().getClass();
                            G = StringsKt.G(i152, zc.k.h(R.string.tarif_bold_start_Odds), 0, false, 6);
                            if (G > -1) {
                            }
                        }
                        return aVar;
                    }
                    h8.b.B(obj);
                }
                int longValue = (int) (((Number) obj).longValue() - 1);
                i().getClass();
                String d10 = ((za.i) zc.k.e()).d(R.plurals.forecast_plurals, longValue);
                kVar.f10563b = d10;
                kVar.f10562a = longValue;
                kVar.f10568g = 2;
                oVar.getClass();
                o.c().getClass();
                c2 = za.h.b().c("min_odds_express", kVar);
                if (c2 != aVar) {
                    i10 = longValue;
                    obj = c2;
                    str = d10;
                    doubleValue = ((Number) obj).doubleValue();
                    i11 = (int) doubleValue;
                    if (doubleValue % i11 != 0.0d) {
                    }
                    String l62 = kotlin.text.z.l(format.toString(), ',', '.', true);
                    StringBuilder sb42 = new StringBuilder();
                    kVar.f10563b = str;
                    kVar.f10564c = l62;
                    kVar.f10565d = sb42;
                    kVar.f10562a = i10;
                    kVar.f10568g = 3;
                    oVar.getClass();
                    o.c().getClass();
                    a7 = za.h.a("rc_express_passage", kVar);
                    if (a7 != aVar) {
                    }
                }
                return aVar;
            }
        }
        kVar = new hd.k(this, cVar);
        Object obj2 = kVar.f10566e;
        aVar = lf.a.f20034a;
        i5 = kVar.f10568g;
        if (i5 != 0) {
        }
        int longValue2 = (int) (((Number) obj2).longValue() - 1);
        i().getClass();
        String d102 = ((za.i) zc.k.e()).d(R.plurals.forecast_plurals, longValue2);
        kVar.f10563b = d102;
        kVar.f10562a = longValue2;
        kVar.f10568g = 2;
        oVar.getClass();
        o.c().getClass();
        c2 = za.h.b().c("min_odds_express", kVar);
        if (c2 != aVar) {
        }
        return aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ae A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object l(mf.c cVar) {
        hd.l lVar;
        int i5;
        StringBuilder sb2;
        int G;
        if (cVar instanceof hd.l) {
            lVar = (hd.l) cVar;
            int i10 = lVar.f10572d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                lVar.f10572d = i10 - Integer.MIN_VALUE;
                Object obj = lVar.f10570b;
                lf.a aVar = lf.a.f20034a;
                i5 = lVar.f10572d;
                if (i5 != 0) {
                    h8.b.B(obj);
                    StringBuilder sb3 = new StringBuilder();
                    o oVar = (o) this.f16518c;
                    lVar.f10569a = sb3;
                    lVar.f10572d = 1;
                    oVar.getClass();
                    o.c().getClass();
                    Object a7 = za.h.a("rc_roi_live", lVar);
                    if (a7 == aVar) {
                        return aVar;
                    }
                    sb2 = sb3;
                    obj = a7;
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sb2 = lVar.f10569a;
                    h8.b.B(obj);
                }
                sb2.append(((Number) obj).longValue());
                sb2.append('%');
                String sb4 = sb2.toString();
                i().getClass();
                String i11 = zc.k.i(R.string.tarif_live_month_args, sb4);
                i().getClass();
                G = StringsKt.G(i11, zc.k.h(R.string.tarif_live_next), 0, false, 6);
                if (G > -1) {
                    return i11;
                }
                i().getClass();
                CustomTypefaceSpan b10 = zc.k.b();
                SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(i11);
                Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(...)");
                x.B(valueOf, G, i11.length(), b10);
                return valueOf;
            }
        }
        lVar = new hd.l(this, cVar);
        Object obj2 = lVar.f10570b;
        lf.a aVar2 = lf.a.f20034a;
        i5 = lVar.f10572d;
        if (i5 != 0) {
        }
        sb2.append(((Number) obj2).longValue());
        sb2.append('%');
        String sb42 = sb2.toString();
        i().getClass();
        String i112 = zc.k.i(R.string.tarif_live_month_args, sb42);
        i().getClass();
        G = StringsKt.G(i112, zc.k.h(R.string.tarif_live_next), 0, false, 6);
        if (G > -1) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ae A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m(mf.c cVar) {
        m mVar;
        int i5;
        StringBuilder sb2;
        int G;
        if (cVar instanceof m) {
            mVar = (m) cVar;
            int i10 = mVar.f10576d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                mVar.f10576d = i10 - Integer.MIN_VALUE;
                Object obj = mVar.f10574b;
                lf.a aVar = lf.a.f20034a;
                i5 = mVar.f10576d;
                if (i5 != 0) {
                    h8.b.B(obj);
                    StringBuilder sb3 = new StringBuilder();
                    o oVar = (o) this.f16518c;
                    mVar.f10573a = sb3;
                    mVar.f10576d = 1;
                    oVar.getClass();
                    o.c().getClass();
                    Object a7 = za.h.a("rc_roi_live", mVar);
                    if (a7 == aVar) {
                        return aVar;
                    }
                    sb2 = sb3;
                    obj = a7;
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sb2 = mVar.f10573a;
                    h8.b.B(obj);
                }
                sb2.append(((Number) obj).longValue());
                sb2.append('%');
                String sb4 = sb2.toString();
                i().getClass();
                String i11 = zc.k.i(R.string.tarif_live_week_args, sb4);
                i().getClass();
                G = StringsKt.G(i11, zc.k.h(R.string.tarif_live_next), 0, false, 6);
                if (G > -1) {
                    return i11;
                }
                i().getClass();
                CustomTypefaceSpan b10 = zc.k.b();
                SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(i11);
                Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(...)");
                x.B(valueOf, G, i11.length(), b10);
                return valueOf;
            }
        }
        mVar = new m(this, cVar);
        Object obj2 = mVar.f10574b;
        lf.a aVar2 = lf.a.f20034a;
        i5 = mVar.f10576d;
        if (i5 != 0) {
        }
        sb2.append(((Number) obj2).longValue());
        sb2.append('%');
        String sb42 = sb2.toString();
        i().getClass();
        String i112 = zc.k.i(R.string.tarif_live_week_args, sb42);
        i().getClass();
        G = StringsKt.G(i112, zc.k.h(R.string.tarif_live_next), 0, false, 6);
        if (G > -1) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0068, code lost:
    
        if (r1 == r4) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0172 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(mf.c cVar) {
        hd.n nVar;
        lf.a aVar;
        int i5;
        Object c2;
        int i10;
        String str;
        double doubleValue;
        int i11;
        String format;
        Object a7;
        String str2;
        int i12;
        String str3;
        StringBuilder sb2;
        int G;
        o oVar = (o) this.f16518c;
        if (cVar instanceof hd.n) {
            nVar = (hd.n) cVar;
            int i13 = nVar.f10583g;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                nVar.f10583g = i13 - Integer.MIN_VALUE;
                Object obj = nVar.f10581e;
                aVar = lf.a.f20034a;
                i5 = nVar.f10583g;
                if (i5 != 0) {
                    h8.b.B(obj);
                    nVar.f10583g = 1;
                    oVar.getClass();
                    o.c().getClass();
                    obj = za.h.a("rc_premium_min_count_week", nVar);
                } else {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            if (i5 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            i12 = nVar.f10577a;
                            sb2 = nVar.f10580d;
                            str2 = nVar.f10579c;
                            str3 = nVar.f10578b;
                            h8.b.B(obj);
                            sb2.append(((Number) obj).longValue());
                            sb2.append('%');
                            String sb3 = sb2.toString();
                            zc.k i14 = i();
                            Object[] objArr = {new Integer(i12), str3, str2, sb3};
                            i14.getClass();
                            String i15 = zc.k.i(R.string.tarif_premium_args, objArr);
                            i().getClass();
                            G = StringsKt.G(i15, zc.k.h(R.string.tarif_bold_start_Odds), 0, false, 6);
                            if (G > -1) {
                                return i15;
                            }
                            i().getClass();
                            CustomTypefaceSpan b10 = zc.k.b();
                            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(i15);
                            Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(...)");
                            x.B(valueOf, G, i15.length(), b10);
                            return valueOf;
                        }
                        i10 = nVar.f10577a;
                        str = nVar.f10578b;
                        h8.b.B(obj);
                        doubleValue = ((Number) obj).doubleValue();
                        i11 = (int) doubleValue;
                        if (doubleValue % i11 != 0.0d) {
                            format = String.valueOf(i11);
                        } else {
                            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                            format = String.format("%.1f", Arrays.copyOf(new Object[]{new Double(doubleValue)}, 1));
                            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                        }
                        String l6 = kotlin.text.z.l(format.toString(), ',', '.', true);
                        StringBuilder sb4 = new StringBuilder();
                        nVar.f10578b = str;
                        nVar.f10579c = l6;
                        nVar.f10580d = sb4;
                        nVar.f10577a = i10;
                        nVar.f10583g = 3;
                        oVar.getClass();
                        o.c().getClass();
                        a7 = za.h.a("rc_premium_passage", nVar);
                        if (a7 != aVar) {
                            int i16 = i10;
                            str2 = l6;
                            obj = a7;
                            i12 = i16;
                            str3 = str;
                            sb2 = sb4;
                            sb2.append(((Number) obj).longValue());
                            sb2.append('%');
                            String sb32 = sb2.toString();
                            zc.k i142 = i();
                            Object[] objArr2 = {new Integer(i12), str3, str2, sb32};
                            i142.getClass();
                            String i152 = zc.k.i(R.string.tarif_premium_args, objArr2);
                            i().getClass();
                            G = StringsKt.G(i152, zc.k.h(R.string.tarif_bold_start_Odds), 0, false, 6);
                            if (G > -1) {
                            }
                        }
                        return aVar;
                    }
                    h8.b.B(obj);
                }
                int longValue = (int) (((Number) obj).longValue() - 1);
                i().getClass();
                String d10 = ((za.i) zc.k.e()).d(R.plurals.forecast_plurals, longValue);
                nVar.f10578b = d10;
                nVar.f10577a = longValue;
                nVar.f10583g = 2;
                oVar.getClass();
                o.c().getClass();
                c2 = za.h.b().c("min_odds_premium", nVar);
                if (c2 != aVar) {
                    i10 = longValue;
                    obj = c2;
                    str = d10;
                    doubleValue = ((Number) obj).doubleValue();
                    i11 = (int) doubleValue;
                    if (doubleValue % i11 != 0.0d) {
                    }
                    String l62 = kotlin.text.z.l(format.toString(), ',', '.', true);
                    StringBuilder sb42 = new StringBuilder();
                    nVar.f10578b = str;
                    nVar.f10579c = l62;
                    nVar.f10580d = sb42;
                    nVar.f10577a = i10;
                    nVar.f10583g = 3;
                    oVar.getClass();
                    o.c().getClass();
                    a7 = za.h.a("rc_premium_passage", nVar);
                    if (a7 != aVar) {
                    }
                }
                return aVar;
            }
        }
        nVar = new hd.n(this, cVar);
        Object obj2 = nVar.f10581e;
        aVar = lf.a.f20034a;
        i5 = nVar.f10583g;
        if (i5 != 0) {
        }
        int longValue2 = (int) (((Number) obj2).longValue() - 1);
        i().getClass();
        String d102 = ((za.i) zc.k.e()).d(R.plurals.forecast_plurals, longValue2);
        nVar.f10578b = d102;
        nVar.f10577a = longValue2;
        nVar.f10583g = 2;
        oVar.getClass();
        o.c().getClass();
        c2 = za.h.b().c("min_odds_premium", nVar);
        if (c2 != aVar) {
        }
        return aVar;
    }

    public void o(Throwable th2) {
        zzoh zzohVar = (zzoh) this.f16517b;
        e2 e2Var = (e2) this.f16518c;
        e2Var.j();
        e2Var.f22702i = false;
        f1 f1Var = (f1) e2Var.f3328a;
        s7.e eVar = f1Var.f22743d;
        n0 n0Var = f1Var.f22745f;
        int i5 = 2;
        if (eVar.t(null, s7.x.U0)) {
            String message = th2.getMessage();
            e2Var.f22706n = false;
            if (message != null) {
                if ((th2 instanceof IllegalStateException) || message.contains("garbage collected") || th2.getClass().getSimpleName().equals("ServiceUnavailableException")) {
                    if (message.contains("Background")) {
                        e2Var.f22706n = true;
                    }
                    i5 = 1;
                } else if ((th2 instanceof SecurityException) && !message.endsWith("READ_DEVICE_CONFIG")) {
                    i5 = 3;
                }
            }
        }
        int i10 = i5 - 1;
        if (i10 == 0) {
            f1.m(n0Var);
            n0Var.f22906i.c(n0.r(f1Var.r().p()), n0.r(th2.toString()), "registerTriggerAsync failed with retriable error. Will try later. App ID, throwable");
            e2Var.j = 1;
            e2Var.H().add(zzohVar);
            return;
        }
        if (i10 != 1) {
            f1.m(n0Var);
            n0Var.f22903f.c(n0.r(f1Var.r().p()), th2, "registerTriggerAsync failed. Dropping URI. App ID, Throwable");
            s();
            e2Var.j = 1;
            e2Var.I();
            return;
        }
        e2Var.H().add(zzohVar);
        if (e2Var.j > ((Integer) s7.x.x0.a(null)).intValue()) {
            e2Var.j = 1;
            f1.m(n0Var);
            n0Var.f22906i.c(n0.r(f1Var.r().p()), n0.r(th2.toString()), "registerTriggerAsync failed. May try later. App ID, throwable");
            return;
        }
        f1.m(n0Var);
        n0Var.f22906i.d("registerTriggerAsync failed. App ID, delay in seconds, throwable", n0.r(f1Var.r().p()), n0.r(String.valueOf(e2Var.j)), n0.r(th2.toString()));
        int i11 = e2Var.j;
        if (e2Var.f22703k == null) {
            e2Var.f22703k = new u1(e2Var, f1Var, 1);
        }
        e2Var.f22703k.b(i11 * 1000);
        int i12 = e2Var.j;
        e2Var.j = i12 + i12;
    }

    public f3.k q(m3.j id2) {
        f3.k g10;
        Intrinsics.checkNotNullParameter(id2, "id");
        synchronized (this.f16518c) {
            g10 = ((e3.i) this.f16517b).g(id2);
        }
        return g10;
    }

    public f3.k r(m3.j id2) {
        f3.k j;
        Intrinsics.checkNotNullParameter(id2, "id");
        synchronized (this.f16518c) {
            j = ((e3.i) this.f16517b).j(id2);
        }
        return j;
    }

    public void s() {
        f1 f1Var = (f1) ((e2) this.f16518c).f3328a;
        v0 v0Var = f1Var.f22744e;
        f1.k(v0Var);
        SparseArray p10 = v0Var.p();
        zzoh zzohVar = (zzoh) this.f16517b;
        p10.put(zzohVar.f5803c, Long.valueOf(zzohVar.f5802b));
        v0 v0Var2 = f1Var.f22744e;
        f1.k(v0Var2);
        int[] iArr = new int[p10.size()];
        long[] jArr = new long[p10.size()];
        for (int i5 = 0; i5 < p10.size(); i5++) {
            iArr[i5] = p10.keyAt(i5);
            jArr[i5] = ((Long) p10.valueAt(i5)).longValue();
        }
        Bundle bundle = new Bundle();
        bundle.putIntArray("uriSources", iArr);
        bundle.putLongArray("uriTimestamps", jArr);
        v0Var2.f23134n.V(bundle);
    }

    public /* synthetic */ c(int i5, Object obj, Object obj2, boolean z5) {
        this.f16516a = i5;
        this.f16518c = obj;
        this.f16517b = obj2;
    }

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, int i5) {
        this.f16516a = i5;
        this.f16517b = obj;
        this.f16518c = obj2;
    }

    public c(int i5) {
        this.f16516a = i5;
        switch (i5) {
            case 3:
                break;
            case 8:
                this.f16517b = gf.k.b(new b2.b(26));
                this.f16518c = new o(4);
                break;
            default:
                this.f16517b = Executors.newSingleThreadScheduledExecutor();
                break;
        }
    }

    @Override // gh.f
    public void a(o0 o0Var) {
        oi.g gVar = (oi.g) this.f16517b;
        a0 a0Var = (a0) this.f16518c;
        try {
            try {
                gVar.d(a0Var, a0Var.d(o0Var));
            } catch (Throwable th2) {
                z0.q(th2);
                th2.printStackTrace();
            }
        } catch (Throwable th3) {
            z0.q(th3);
            try {
                gVar.b(a0Var, th3);
            } catch (Throwable th4) {
                z0.q(th4);
                th4.printStackTrace();
            }
        }
    }

    public c(File file) {
        this.f16516a = 15;
        this.f16518c = new ba.d("crash-report-file-system");
        this.f16517b = file;
    }

    public c(String str, HashMap hashMap) {
        this.f16516a = 9;
        y4.a.C(str, "url is required");
        try {
            this.f16517b = URI.create(str).toURL();
            this.f16518c = hashMap;
        } catch (MalformedURLException e7) {
            throw new IllegalArgumentException("Failed to compose the Sentry's server URL.", e7);
        }
    }

    public c(ILogger iLogger) {
        this.f16516a = 0;
        ClassLoader classLoader = c.class.getClassLoader();
        this.f16517b = iLogger;
        this.f16518c = d5.j(classLoader);
    }

    public c(e3.i delegate) {
        this.f16516a = 6;
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f16517b = delegate;
        this.f16518c = new Object();
    }
}
