package defpackage;

import android.os.ParcelFileDescriptor;
import android.util.SparseArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.n;
import androidx.viewpager2.widget.ViewPager2;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdInteractionListener;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.rtb.SignalCallbacks;
import com.google.protobuf.ByteString;
import com.google.protobuf.h2;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.BidTokenCallback;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class by9 implements e8g, qs3, PAGNativeAdInteractionListener, lrk, je6, hlg, ekj, zdk, k80, sa, BidTokenCallback {
    public Object a;

    public by9(int i) {
        switch (i) {
            case 17:
                this.a = new ArrayDeque();
                break;
            case 21:
                this.a = new LinkedHashMap();
                break;
            default:
                Level level = Level.FINE;
                Logger logger = Logger.getLogger(ood.class.getName());
                z1a.y(level, "level");
                z1a.y(logger, "logger");
                this.a = logger;
                break;
        }
    }

    public static String E(x52 x52Var) {
        long j = x52Var.b;
        if (j <= 64) {
            return x52Var.I0().i();
        }
        return x52Var.P0((int) Math.min(j, 64L)).i() + "...";
    }

    @Override // defpackage.lrk
    public int A(View view) {
        return ((n) this.a).getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) ((hrf) view.getLayoutParams())).rightMargin;
    }

    public ArrayList B(int i) {
        ArrayList arrayList = new ArrayList();
        qpa qpaVar = (qpa) this.a;
        nnh w = bea.w();
        Function1 e = w != null ? w.e() : null;
        nnh C = bea.C(w);
        try {
            fpa fpaVar = qpaVar.b ? qpaVar.c : (fpa) ((eoh) qpaVar.e).getValue();
            if (fpaVar != null) {
                dsf dsfVar = new dsf();
                dsfVar.a = 1;
                List list = (List) fpaVar.k.invoke(Integer.valueOf(i));
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Pair pair = (Pair) list.get(i2);
                    dsfVar = dsfVar;
                    arrayList.add(qpaVar.o.a(((Number) pair.a).intValue(), ((an3) pair.b).a, false, new l50((ArrayList) null, dsfVar, list, i, fpaVar)));
                }
                Unit unit = Unit.a;
            }
            bea.K(w, C, e);
            return arrayList;
        } catch (Throwable th) {
            bea.K(w, C, e);
            throw th;
        }
    }

    public void C(int i, long j, long j2) {
        d0c d0cVar = (d0c) this.a;
        d0cVar.j0.getClass();
        if (i == 160) {
            d0cVar.Y = false;
            d0cVar.Z = 0L;
            return;
        }
        if (i == 174) {
            b0c b0cVar = new b0c();
            b0cVar.n = -1;
            b0cVar.o = -1;
            b0cVar.p = -1;
            b0cVar.q = -1;
            b0cVar.r = -1;
            b0cVar.s = 0;
            b0cVar.t = -1;
            b0cVar.u = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            b0cVar.v = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            b0cVar.w = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            b0cVar.x = null;
            b0cVar.y = -1;
            b0cVar.z = false;
            b0cVar.A = -1;
            b0cVar.B = -1;
            b0cVar.C = -1;
            b0cVar.D = 1000;
            b0cVar.E = 200;
            b0cVar.F = -1.0f;
            b0cVar.G = -1.0f;
            b0cVar.H = -1.0f;
            b0cVar.I = -1.0f;
            b0cVar.J = -1.0f;
            b0cVar.K = -1.0f;
            b0cVar.L = -1.0f;
            b0cVar.M = -1.0f;
            b0cVar.N = -1.0f;
            b0cVar.O = -1.0f;
            b0cVar.Q = 1;
            b0cVar.R = -1;
            b0cVar.S = 8000;
            b0cVar.T = 0L;
            b0cVar.U = 0L;
            b0cVar.W = false;
            b0cVar.Y = true;
            b0cVar.Z = "eng";
            d0cVar.y = b0cVar;
            b0cVar.a = d0cVar.w;
            return;
        }
        if (i == 183) {
            if (d0cVar.z) {
                return;
            }
            d0cVar.f(i);
            d0cVar.F = -1;
            d0cVar.G = -1L;
            d0cVar.H = -1L;
            return;
        }
        if (i == 187) {
            if (d0cVar.z) {
                return;
            }
            d0cVar.f(i);
            d0cVar.E = C.TIME_UNSET;
            return;
        }
        if (i == 19899) {
            d0cVar.A = -1;
            d0cVar.B = -1L;
            return;
        }
        if (i == 20533) {
            d0cVar.g(i);
            d0cVar.y.i = true;
            return;
        }
        if (i == 21968) {
            d0cVar.g(i);
            d0cVar.y.z = true;
            return;
        }
        if (i == 408125543) {
            long j3 = d0cVar.s;
            if (j3 != -1 && j3 != j) {
                throw s9e.a(null, "Multiple Segment elements not supported");
            }
            d0cVar.s = j;
            d0cVar.r = j2;
            return;
        }
        if (i == 475249515) {
            if (d0cVar.z) {
                return;
            }
            d0cVar.D = true;
        } else if (i == 524531317 && !d0cVar.z) {
            if (d0cVar.d && d0cVar.K != -1) {
                d0cVar.J = true;
            } else {
                d0cVar.j0.m(new bw0(d0cVar.v));
                d0cVar.z = true;
            }
        }
    }

    public void D(int i, String str) {
        d0c d0cVar = (d0c) this.a;
        if (i == 134) {
            d0cVar.g(i);
            d0cVar.y.c = str;
            return;
        }
        if (i == 17026) {
            if ("webm".equals(str) || "matroska".equals(str)) {
                d0cVar.w = str.equals("webm");
                return;
            }
            throw s9e.a(null, "DocType " + str + " not supported");
        }
        if (i == 21358) {
            d0cVar.g(i);
            d0cVar.y.b = str;
        } else {
            if (i != 2274716) {
                return;
            }
            d0cVar.g(i);
            d0cVar.y.Z = str;
        }
    }

    public cci F(qbl qblVar) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.a;
        Object obj = linkedHashMap.get(qblVar);
        if (obj == null) {
            obj = new cci(qblVar);
            linkedHashMap.put(qblVar, obj);
        }
        return (cci) obj;
    }

    @Override // defpackage.je6
    public qof a() {
        c8g b;
        IOException iOException = null;
        while (!((ipf) this.a).l.q) {
            try {
                b = ((ipf) this.a).b();
            } catch (IOException e) {
                if (iOException == null) {
                    iOException = e;
                } else {
                    de6.a(iOException, e);
                }
                if (!((ipf) this.a).a(null)) {
                    throw iOException;
                }
            }
            if (!b.isReady()) {
                b8g g = b.g();
                if (g.b == null && g.c == null) {
                    g = b.e();
                }
                c8g c8gVar = g.b;
                Throwable th = g.c;
                if (th != null) {
                    throw th;
                }
                if (c8gVar != null) {
                    ((ipf) this.a).q.addFirst(c8gVar);
                }
            }
            return b.d();
        }
        is8.e("Canceled");
        return null;
    }

    @Override // defpackage.e8g
    public xtc b(int i, av8 av8Var) {
        av8Var.d0(696460577);
        float a = ((e9i) this.a).a((i * 300) + 1000, 1000);
        float f = (0.1f * a) + 0.9f;
        boolean d = av8Var.d(a) | av8Var.d(f);
        Object O = av8Var.O();
        if (d || O == nf3.a) {
            O = new n28(1, a, f);
            av8Var.n0(O);
        }
        xtc M = s02.M(utc.a, (Function1) O);
        av8Var.s(false);
        return M;
    }

    @Override // defpackage.zdk
    public FileChannel c() {
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) this.a;
        if (parcelFileDescriptor.getStatSize() != -1) {
            return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor).getChannel();
        }
        parcelFileDescriptor.close();
        is8.c(parcelFileDescriptor, "Not a file: ");
        return null;
    }

    @Override // defpackage.qs3
    public Object convert(Object obj) {
        return Optional.ofNullable(((qs3) this.a).convert((i2g) obj));
    }

    @Override // defpackage.je6
    public ipf d() {
        return (ipf) this.a;
    }

    @Override // defpackage.lrk
    public int e(View view) {
        return ((n) this.a).getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) ((hrf) view.getLayoutParams())).leftMargin;
    }

    @Override // defpackage.lrk
    public int f() {
        return ((n) this.a).getPaddingLeft();
    }

    public void g(int i, int i2, nl6 nl6Var) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        long j;
        int i9;
        int i10;
        int[] iArr;
        int i11;
        int i12;
        d0c d0cVar = (d0c) this.a;
        nkk nkkVar = d0cVar.b;
        SparseArray sparseArray = d0cVar.c;
        j9e j9eVar = d0cVar.k;
        j9e j9eVar2 = d0cVar.i;
        int i13 = 2;
        int i14 = 0;
        if (i != 161 && i != 163) {
            if (i == 165) {
                if (d0cVar.O != 2) {
                    return;
                }
                b0c b0cVar = (b0c) sparseArray.get(d0cVar.U);
                int i15 = d0cVar.X;
                j9e j9eVar3 = d0cVar.p;
                if (i15 != 4 || !"V_VP9".equals(b0cVar.c)) {
                    nl6Var.skipFully(i2);
                    return;
                } else {
                    j9eVar3.K(i2);
                    nl6Var.readFully(j9eVar3.a, 0, i2);
                    return;
                }
            }
            if (i == 16877) {
                d0cVar.g(i);
                b0c b0cVar2 = d0cVar.y;
                int i16 = b0cVar2.h;
                if (i16 != 1685485123 && i16 != 1685480259) {
                    nl6Var.skipFully(i2);
                    return;
                }
                byte[] bArr = new byte[i2];
                b0cVar2.P = bArr;
                nl6Var.readFully(bArr, 0, i2);
                return;
            }
            if (i == 16981) {
                d0cVar.g(i);
                byte[] bArr2 = new byte[i2];
                d0cVar.y.j = bArr2;
                nl6Var.readFully(bArr2, 0, i2);
                return;
            }
            if (i == 18402) {
                byte[] bArr3 = new byte[i2];
                nl6Var.readFully(bArr3, 0, i2);
                d0cVar.g(i);
                d0cVar.y.k = new tsj(1, bArr3, 0, 0);
                return;
            }
            if (i == 21419) {
                Arrays.fill(j9eVar.a, (byte) 0);
                nl6Var.readFully(j9eVar.a, 4 - i2, i2);
                j9eVar.N(0);
                d0cVar.A = (int) j9eVar.C();
                return;
            }
            if (i == 25506) {
                d0cVar.g(i);
                byte[] bArr4 = new byte[i2];
                d0cVar.y.l = bArr4;
                nl6Var.readFully(bArr4, 0, i2);
                return;
            }
            if (i != 30322) {
                throw s9e.a(null, "Unexpected id: " + i);
            }
            d0cVar.g(i);
            byte[] bArr5 = new byte[i2];
            d0cVar.y.x = bArr5;
            nl6Var.readFully(bArr5, 0, i2);
            return;
        }
        int i17 = 8;
        if (d0cVar.O == 0) {
            d0cVar.U = (int) nkkVar.z(nl6Var, false, true, 8);
            d0cVar.V = nkkVar.c;
            d0cVar.Q = C.TIME_UNSET;
            d0cVar.O = 1;
            j9eVar2.K(0);
        }
        b0c b0cVar3 = (b0c) sparseArray.get(d0cVar.U);
        if (b0cVar3 == null) {
            nl6Var.skipFully(i2 - d0cVar.V);
            d0cVar.O = 0;
            return;
        }
        b0cVar3.a0.getClass();
        if (d0cVar.O == 1) {
            d0cVar.k(nl6Var, 3);
            int i18 = (j9eVar2.a[2] & 6) >> 1;
            if (i18 == 0) {
                d0cVar.S = 1;
                int[] iArr2 = d0cVar.T;
                if (iArr2 == null) {
                    iArr2 = new int[1];
                } else if (iArr2.length < 1) {
                    iArr2 = new int[Math.max(iArr2.length * 2, 1)];
                }
                d0cVar.T = iArr2;
                iArr2[0] = (i2 - d0cVar.V) - 3;
            } else {
                d0cVar.k(nl6Var, 4);
                int i19 = (j9eVar2.a[3] & 255) + 1;
                d0cVar.S = i19;
                int[] iArr3 = d0cVar.T;
                if (iArr3 == null) {
                    iArr3 = new int[i19];
                    i3 = 4;
                } else {
                    i3 = 4;
                    if (iArr3.length < i19) {
                        iArr3 = new int[Math.max(iArr3.length * 2, i19)];
                    }
                }
                d0cVar.T = iArr3;
                if (i18 == 2) {
                    int i20 = (i2 - d0cVar.V) - 4;
                    int i21 = d0cVar.S;
                    Arrays.fill(iArr3, 0, i21, i20 / i21);
                } else {
                    if (i18 != 1) {
                        if (i18 != 3) {
                            throw s9e.a(null, "Unexpected lacing value: " + i18);
                        }
                        int i22 = 0;
                        int i23 = 0;
                        int i24 = i3;
                        while (true) {
                            int i25 = d0cVar.S - 1;
                            int[] iArr4 = d0cVar.T;
                            if (i22 >= i25) {
                                i4 = i13;
                                i5 = i14;
                                iArr4[i25] = ((i2 - d0cVar.V) - i24) - i23;
                                break;
                            }
                            iArr4[i22] = i14;
                            int i26 = i24 + 1;
                            d0cVar.k(nl6Var, i26);
                            if (j9eVar2.a[i24] == 0) {
                                throw s9e.a(null, "No valid varint length mask found");
                            }
                            int i27 = i14;
                            while (true) {
                                if (i27 >= i17) {
                                    i6 = i17;
                                    i7 = i13;
                                    i8 = i14;
                                    j = 0;
                                    i9 = i26;
                                    break;
                                }
                                i6 = i17;
                                int i28 = 1 << (7 - i27);
                                i8 = i14;
                                if ((j9eVar2.a[i24] & i28) != 0) {
                                    i9 = i26 + i27;
                                    d0cVar.k(nl6Var, i9);
                                    i7 = i13;
                                    j = (~i28) & j9eVar2.a[i24] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                                    while (i26 < i9) {
                                        j = (j << i6) | (j9eVar2.a[i26] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                                        i26++;
                                    }
                                    if (i22 > 0) {
                                        j -= (1 << ((i27 * 7) + 6)) - 1;
                                    }
                                } else {
                                    i27++;
                                    i14 = i8;
                                    i17 = i6;
                                }
                            }
                            if (j < -2147483648L || j > 2147483647L) {
                                break;
                            }
                            int i29 = (int) j;
                            int[] iArr5 = d0cVar.T;
                            if (i22 != 0) {
                                i29 += iArr5[i22 - 1];
                            }
                            iArr5[i22] = i29;
                            i23 += i29;
                            i22++;
                            i24 = i9;
                            i14 = i8;
                            i17 = i6;
                            i13 = i7;
                        }
                        throw s9e.a(null, "EBML lacing sample size out of range.");
                    }
                    int i30 = 0;
                    int i31 = 0;
                    int i32 = i3;
                    while (true) {
                        i10 = d0cVar.S - 1;
                        iArr = d0cVar.T;
                        if (i30 >= i10) {
                            break;
                        }
                        iArr[i30] = 0;
                        while (true) {
                            i11 = i32 + 1;
                            d0cVar.k(nl6Var, i11);
                            int i33 = j9eVar2.a[i32] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                            int[] iArr6 = d0cVar.T;
                            i12 = iArr6[i30] + i33;
                            iArr6[i30] = i12;
                            if (i33 != 255) {
                                break;
                            } else {
                                i32 = i11;
                            }
                        }
                        i31 += i12;
                        i30++;
                        i32 = i11;
                    }
                    iArr[i10] = ((i2 - d0cVar.V) - i32) - i31;
                }
            }
            i4 = 2;
            i5 = 0;
            byte[] bArr6 = j9eVar2.a;
            d0cVar.P = d0cVar.m((bArr6[1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | (bArr6[i5] << 8)) + d0cVar.M;
            d0cVar.W = (b0cVar3.e == 1 || (i == 163 && (j9eVar2.a[i4] & 128) == 128)) ? 1 : i5;
            d0cVar.O = i4;
            d0cVar.R = i5;
        }
        if (i == 163) {
            while (true) {
                int i34 = d0cVar.R;
                if (i34 >= d0cVar.S) {
                    d0cVar.O = 0;
                    return;
                } else {
                    d0cVar.h(b0cVar3, ((d0cVar.R * b0cVar3.f) / 1000) + d0cVar.P, d0cVar.W, d0cVar.n(nl6Var, b0cVar3, d0cVar.T[i34], false), 0);
                    d0cVar.R++;
                }
            }
        } else {
            while (true) {
                int i35 = d0cVar.R;
                if (i35 >= d0cVar.S) {
                    return;
                }
                int[] iArr7 = d0cVar.T;
                iArr7[i35] = d0cVar.n(nl6Var, b0cVar3, iArr7[i35], true);
                d0cVar.R++;
            }
        }
    }

    @Override // defpackage.k80
    public u78 get(int i) {
        return (u78) this.a;
    }

    public void h(ByteString byteString) {
        if (!byteString.isBalanced()) {
            if (!(byteString instanceof h2)) {
                zzl.i(byteString.getClass(), "Has a new type of ByteString been created? Found ");
                return;
            }
            h2 h2Var = (h2) byteString;
            h(h2Var.b);
            h(h2Var.c);
            return;
        }
        int binarySearch = Arrays.binarySearch(h2.f, byteString.size());
        if (binarySearch < 0) {
            binarySearch = (-(binarySearch + 1)) - 1;
        }
        int c = h2.c(binarySearch + 1);
        ArrayDeque arrayDeque = (ArrayDeque) this.a;
        if (arrayDeque.isEmpty() || ((ByteString) arrayDeque.peek()).size() >= c) {
            arrayDeque.push(byteString);
            return;
        }
        int c2 = h2.c(binarySearch);
        ByteString byteString2 = (ByteString) arrayDeque.pop();
        while (!arrayDeque.isEmpty() && ((ByteString) arrayDeque.peek()).size() < c2) {
            byteString2 = new h2((ByteString) arrayDeque.pop(), byteString2);
        }
        h2 h2Var2 = new h2(byteString2, byteString);
        while (!arrayDeque.isEmpty()) {
            int binarySearch2 = Arrays.binarySearch(h2.f, h2Var2.a);
            if (binarySearch2 < 0) {
                binarySearch2 = (-(binarySearch2 + 1)) - 1;
            }
            if (((ByteString) arrayDeque.peek()).size() >= h2.c(binarySearch2 + 1)) {
                break;
            } else {
                h2Var2 = new h2((ByteString) arrayDeque.pop(), h2Var2);
            }
        }
        arrayDeque.push(h2Var2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object i(String str, sq3 sq3Var) {
        wha whaVar;
        int i;
        String str2;
        d2g d2gVar;
        if (sq3Var instanceof wha) {
            whaVar = (wha) sq3Var;
            int i2 = whaVar.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                whaVar.u = i2 - Integer.MIN_VALUE;
                Object obj = whaVar.s;
                lu3 lu3Var = lu3.a;
                i = whaVar.u;
                if (i != 0) {
                    y6a.M(obj);
                    pzf pzfVar = new pzf();
                    pzfVar.f(str);
                    qzf qzfVar = new qzf(pzfVar);
                    StringBuilder sb = new StringBuilder();
                    jl9 jl9Var = qzfVar.a;
                    sb.append(jl9Var.a);
                    sb.append("://");
                    sb.append(jl9Var.d);
                    String sb2 = sb.toString();
                    pof pofVar = new pof((jod) this.a, qzfVar);
                    whaVar.r = sb2;
                    whaVar.u = 1;
                    Object P = l98.P(pofVar, whaVar);
                    if (P == lu3Var) {
                        return lu3Var;
                    }
                    obj = P;
                    str2 = sb2;
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str2 = whaVar.r;
                    y6a.M(obj);
                }
                d2gVar = (d2g) obj;
                if (!d2gVar.q) {
                    return new t9e(d2gVar.g.byteStream(), str2);
                }
                vi9 vi9Var = new vi9(d2gVar.d, d2gVar.c);
                d2gVar.close();
                throw vi9Var;
            }
        }
        whaVar = new wha(this, sq3Var);
        Object obj2 = whaVar.s;
        lu3 lu3Var2 = lu3.a;
        i = whaVar.u;
        if (i != 0) {
        }
        d2gVar = (d2g) obj2;
        if (!d2gVar.q) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object j(String str, sq3 sq3Var) {
        xha xhaVar;
        int i;
        d2g d2gVar;
        if (sq3Var instanceof xha) {
            xhaVar = (xha) sq3Var;
            int i2 = xhaVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xhaVar.t = i2 - Integer.MIN_VALUE;
                Object obj = xhaVar.r;
                lu3 lu3Var = lu3.a;
                i = xhaVar.t;
                if (i != 0) {
                    y6a.M(obj);
                    pzf pzfVar = new pzf();
                    pzfVar.f(str);
                    pof pofVar = new pof((jod) this.a, new qzf(pzfVar));
                    xhaVar.t = 1;
                    obj = l98.P(pofVar, xhaVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                d2gVar = (d2g) obj;
                if (!d2gVar.q) {
                    return d2gVar.g.string();
                }
                vi9 vi9Var = new vi9(d2gVar.d, d2gVar.c);
                d2gVar.close();
                throw vi9Var;
            }
        }
        xhaVar = new xha(this, sq3Var);
        Object obj2 = xhaVar.r;
        lu3 lu3Var2 = lu3.a;
        i = xhaVar.t;
        if (i != 0) {
        }
        d2gVar = (d2g) obj2;
        if (!d2gVar.q) {
        }
    }

    public void k(int i, long j) {
        d0c d0cVar = (d0c) this.a;
        if (i == 240) {
            if (d0cVar.z) {
                return;
            }
            d0cVar.f(i);
            if (d0cVar.H == -1) {
                d0cVar.H = j;
                return;
            }
            return;
        }
        if (i == 241) {
            if (d0cVar.z) {
                return;
            }
            d0cVar.f(i);
            if (d0cVar.G == -1) {
                d0cVar.G = j;
                return;
            }
            return;
        }
        if (i == 20529) {
            if (j == 0) {
                return;
            }
            throw s9e.a(null, "ContentEncodingOrder " + j + " not supported");
        }
        if (i == 20530) {
            if (j == 1) {
                return;
            }
            throw s9e.a(null, "ContentEncodingScope " + j + " not supported");
        }
        switch (i) {
            case MRAID_JS_WRITE_FAILED_VALUE:
                int i2 = (int) j;
                if (i2 == 1) {
                    d0cVar.g(i);
                    d0cVar.y.e = 2;
                    return;
                }
                if (i2 == 2) {
                    d0cVar.g(i);
                    d0cVar.y.e = 1;
                    return;
                } else if (i2 == 17) {
                    d0cVar.g(i);
                    d0cVar.y.e = 3;
                    return;
                } else if (i2 != 33) {
                    d0cVar.g(i);
                    d0cVar.y.e = -1;
                    return;
                } else {
                    d0cVar.g(i);
                    d0cVar.y.e = 5;
                    return;
                }
            case PRIVACY_URL_ERROR_VALUE:
                d0cVar.g(i);
                d0cVar.y.Y = j == 1;
                return;
            case 155:
                d0cVar.Q = d0cVar.m(j);
                return;
            case 159:
                d0cVar.g(i);
                d0cVar.y.Q = (int) j;
                return;
            case 176:
                d0cVar.g(i);
                d0cVar.y.n = (int) j;
                return;
            case 179:
                if (d0cVar.z) {
                    return;
                }
                d0cVar.f(i);
                d0cVar.E = d0cVar.m(j);
                return;
            case 186:
                d0cVar.g(i);
                d0cVar.y.o = (int) j;
                return;
            case AD_RESPONSE_EMPTY_VALUE:
                d0cVar.g(i);
                d0cVar.y.d = (int) j;
                return;
            case 231:
                d0cVar.M = d0cVar.m(j);
                return;
            case 238:
                d0cVar.X = (int) j;
                return;
            case 247:
                if (d0cVar.z) {
                    return;
                }
                d0cVar.f(i);
                d0cVar.F = (int) j;
                return;
            case 251:
                d0cVar.Y = true;
                return;
            case 16871:
                d0cVar.g(i);
                d0cVar.y.h = (int) j;
                return;
            case 16980:
                if (j == 3) {
                    return;
                }
                throw s9e.a(null, "ContentCompAlgo " + j + " not supported");
            case 17029:
                if (j < 1 || j > 2) {
                    throw s9e.a(null, "DocTypeReadVersion " + j + " not supported");
                }
                return;
            case 17143:
                if (j == 1) {
                    return;
                }
                throw s9e.a(null, "EBMLReadVersion " + j + " not supported");
            case 18401:
                if (j == 5) {
                    return;
                }
                throw s9e.a(null, "ContentEncAlgo " + j + " not supported");
            case 18408:
                if (j == 1) {
                    return;
                }
                throw s9e.a(null, "AESSettingsCipherMode " + j + " not supported");
            case 21420:
                d0cVar.B = j + d0cVar.s;
                return;
            case 21432:
                int i3 = (int) j;
                d0cVar.g(i);
                if (i3 == 0) {
                    d0cVar.y.y = 0;
                    return;
                }
                if (i3 == 1) {
                    d0cVar.y.y = 2;
                    return;
                } else if (i3 == 3) {
                    d0cVar.y.y = 1;
                    return;
                } else {
                    if (i3 != 15) {
                        return;
                    }
                    d0cVar.y.y = 3;
                    return;
                }
            case 21680:
                d0cVar.g(i);
                d0cVar.y.q = (int) j;
                return;
            case 21682:
                d0cVar.g(i);
                d0cVar.y.s = (int) j;
                return;
            case 21690:
                d0cVar.g(i);
                d0cVar.y.r = (int) j;
                return;
            case 21930:
                d0cVar.g(i);
                d0cVar.y.X = j == 1;
                return;
            case 21938:
                d0cVar.g(i);
                b0c b0cVar = d0cVar.y;
                b0cVar.z = true;
                b0cVar.p = (int) j;
                return;
            case 21998:
                d0cVar.g(i);
                d0cVar.y.g = (int) j;
                return;
            case 22186:
                d0cVar.g(i);
                d0cVar.y.T = j;
                return;
            case 22203:
                d0cVar.g(i);
                d0cVar.y.U = j;
                return;
            case 25188:
                d0cVar.g(i);
                d0cVar.y.R = (int) j;
                return;
            case 30114:
                d0cVar.Z = j;
                return;
            case 30321:
                d0cVar.g(i);
                int i4 = (int) j;
                if (i4 == 0) {
                    d0cVar.y.t = 0;
                    return;
                }
                if (i4 == 1) {
                    d0cVar.y.t = 1;
                    return;
                } else if (i4 == 2) {
                    d0cVar.y.t = 2;
                    return;
                } else {
                    if (i4 != 3) {
                        return;
                    }
                    d0cVar.y.t = 3;
                    return;
                }
            case 2352003:
                d0cVar.g(i);
                d0cVar.y.f = (int) j;
                return;
            case 2807729:
                d0cVar.t = j;
                return;
            default:
                switch (i) {
                    case 21945:
                        d0cVar.g(i);
                        int i5 = (int) j;
                        if (i5 == 1) {
                            d0cVar.y.C = 2;
                            return;
                        } else {
                            if (i5 != 2) {
                                return;
                            }
                            d0cVar.y.C = 1;
                            return;
                        }
                    case 21946:
                        d0cVar.g(i);
                        int g = w13.g((int) j);
                        if (g != -1) {
                            d0cVar.y.B = g;
                            return;
                        }
                        return;
                    case 21947:
                        d0cVar.g(i);
                        d0cVar.y.z = true;
                        int f = w13.f((int) j);
                        if (f != -1) {
                            d0cVar.y.A = f;
                            return;
                        }
                        return;
                    case 21948:
                        d0cVar.g(i);
                        d0cVar.y.D = (int) j;
                        return;
                    case 21949:
                        d0cVar.g(i);
                        d0cVar.y.E = (int) j;
                        return;
                    default:
                        return;
                }
        }
    }

    public boolean l() {
        return ((Logger) this.a).isLoggable(Level.FINE);
    }

    public void m(int i, int i2, x52 x52Var, int i3, boolean z) {
        if (l()) {
            ((Logger) this.a).log(Level.FINE, lnb.A(i) + " DATA: streamId=" + i2 + " endStream=" + z + " length=" + i3 + " bytes=" + E(x52Var));
        }
    }

    @Override // defpackage.sa
    public boolean n(View view) {
        ujg ujgVar = (ujg) this.a;
        int currentItem = ((ViewPager2) view).getCurrentItem() + 1;
        ViewPager2 viewPager2 = (ViewPager2) ujgVar.e;
        if (viewPager2.r) {
            viewPager2.d(currentItem, true);
        }
        return true;
    }

    @Override // defpackage.hlg
    public boolean o() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public void onAdClicked() {
        MediationNativeAdCallback mediationNativeAdCallback = ((y7e) this.a).w;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.reportAdClicked();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public void onAdShowed() {
        MediationNativeAdCallback mediationNativeAdCallback = ((y7e) this.a).w;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.reportAdImpression();
        }
    }

    @Override // com.vungle.ads.BidTokenCallback
    public void onBidTokenCollected(String str) {
        ((SignalCallbacks) this.a).onSuccess(str);
    }

    @Override // com.vungle.ads.BidTokenCallback
    public void onBidTokenError(String str) {
        AdError adError = new AdError(108, "Liftoff Monetize returned an empty bid token.", VungleMediationAdapter.ERROR_DOMAIN);
        adError.toString();
        ((SignalCallbacks) this.a).onFailure(adError);
    }

    @Override // defpackage.ekj
    public boolean onMenuItemClick(MenuItem menuItem) {
        return ((fkj) this.a).n.onMenuItemSelected(0, menuItem);
    }

    @Override // defpackage.hlg
    public glg open(String str) {
        str.getClass();
        fni fniVar = (fni) this.a;
        String databaseName = fniVar.getDatabaseName();
        if (databaseName == null) {
            if (!str.equals(":memory:")) {
                ogj.h(lnb.o("This driver is configured to open an in-memory database but a file-based named '", str, "' was requested."));
                return null;
            }
        } else if (!databaseName.equals(str) && !StringsKt.e0('/', databaseName, databaseName).equals(StringsKt.e0('/', str, str))) {
            pvd.t("This driver is configured to open a database named '", fniVar.getDatabaseName(), "' but '", str, "' was requested.");
            return null;
        }
        return new cni(fniVar.getWritableDatabase());
    }

    public void p(int i, int i2, up5 up5Var, gc2 gc2Var) {
        if (l()) {
            Logger logger = (Logger) this.a;
            Level level = Level.FINE;
            StringBuilder sb = new StringBuilder(lnb.A(i));
            sb.append(" GO_AWAY: lastStreamId=");
            sb.append(i2);
            sb.append(" errorCode=");
            sb.append(up5Var);
            sb.append(" length=");
            sb.append(gc2Var.h());
            sb.append(" bytes=");
            x52 x52Var = new x52();
            x52Var.X0(gc2Var);
            sb.append(E(x52Var));
            logger.log(level, sb.toString());
        }
    }

    public void q(int i, long j) {
        if (l()) {
            ((Logger) this.a).log(Level.FINE, x5n.m(j, " PING: ack=false bytes=", new StringBuilder(lnb.A(i))));
        }
    }

    public void r(int i, int i2, up5 up5Var) {
        if (l()) {
            ((Logger) this.a).log(Level.FINE, lnb.A(i) + " RST_STREAM: streamId=" + i2 + " errorCode=" + up5Var);
        }
    }

    @Override // defpackage.lrk
    public int s() {
        n nVar = (n) this.a;
        return nVar.getWidth() - nVar.getPaddingRight();
    }

    public void t(int i, e7a e7aVar) {
        if (l()) {
            Logger logger = (Logger) this.a;
            Level level = Level.FINE;
            StringBuilder sb = new StringBuilder(lnb.A(i));
            sb.append(" SETTINGS: ack=false settings=");
            EnumMap enumMap = new EnumMap(pod.class);
            for (pod podVar : pod.values()) {
                int i2 = podVar.a;
                if (((1 << i2) & e7aVar.b) != 0) {
                    enumMap.put((EnumMap) podVar, (pod) Integer.valueOf(e7aVar.a[i2]));
                }
            }
            sb.append(enumMap.toString());
            logger.log(level, sb.toString());
        }
    }

    public void u(int i, int i2, long j) {
        if (l()) {
            Logger logger = (Logger) this.a;
            Level level = Level.FINE;
            StringBuilder sb = new StringBuilder(lnb.A(i));
            wt3.u(i2, " WINDOW_UPDATE: streamId=", " windowSizeIncrement=", sb);
            sb.append(j);
            logger.log(level, sb.toString());
        }
    }

    public void v() {
        wp2 wp2Var = (wp2) this.a;
        t92 t92Var = t92.c;
        byte[] array = wp2Var.c.array();
        array.getClass();
        t92Var.getClass();
        synchronized (t92Var) {
            try {
                int i = t92Var.b;
                if (array.length + i < eh0.a) {
                    t92Var.b = i + (array.length / 2);
                    t92Var.a.addLast(array);
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public cci w(qbl qblVar) {
        qblVar.getClass();
        return (cci) ((LinkedHashMap) this.a).remove(qblVar);
    }

    @Override // defpackage.lrk
    public View x(int i) {
        return ((n) this.a).getChildAt(i);
    }

    public List y(String str) {
        str.getClass();
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.a;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (Intrinsics.c(((qbl) entry.getKey()).a, str)) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap2.keySet().iterator();
        while (it.hasNext()) {
            linkedHashMap.remove((qbl) it.next());
        }
        return CollectionsKt.S0(linkedHashMap2.values());
    }

    public Object z(ln2 ln2Var, Function0 function0) {
        vih vihVar;
        l4h l4hVar;
        int i;
        if (((t01) this.a) == null) {
            h3f.b("Called runAndWatch on a manager that has been disposed of");
        }
        t01 t01Var = (t01) this.a;
        if ((t01Var instanceof vih) && (l4hVar = (vihVar = (vih) t01Var).g) != null && !l4hVar.equals(ln2Var)) {
            tyc tycVar = new tyc();
            l4h l4hVar2 = vihVar.g;
            if (l4hVar2 == null) {
                h3f.b("promote must only be called when a manager is managing subscriptions for one channel and needs to start managing them for a second");
            }
            y0d y0dVar = vihVar.e;
            ArrayList arrayList = tycVar.d;
            if (y0dVar == null) {
                Object obj = vihVar.c;
                obj.getClass();
                arrayList.add(new qyc(l4hVar2, obj));
            } else {
                Object[] objArr = y0dVar.b;
                long[] jArr = y0dVar.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j = jArr[i2];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8;
                            int i4 = 8 - ((~(i2 - length)) >>> 31);
                            int i5 = 0;
                            while (i5 < i4) {
                                if ((j & 255) < 128) {
                                    i = i3;
                                    arrayList.add(new qyc(l4hVar2, objArr[(i2 << 3) + i5]));
                                } else {
                                    i = i3;
                                }
                                j >>= i;
                                i5++;
                                i3 = i;
                            }
                            if (i4 != i3) {
                                break;
                            }
                        }
                        if (i2 == length) {
                            break;
                        }
                        i2++;
                    }
                }
            }
            tycVar.o();
            vihVar.q();
            this.a = tycVar;
        }
        t01 t01Var2 = (t01) this.a;
        t01Var2.getClass();
        nnh u = snh.h().u(t01Var2.G(ln2Var));
        t01Var2.n(ln2Var);
        try {
            nnh j2 = u.j();
            try {
                Object invoke = function0.invoke();
                u.c();
                t01Var2.o();
                return invoke;
            } finally {
                nnh.q(j2);
            }
        } catch (Throwable th) {
            u.c();
            throw th;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public void onAdDismissed() {
    }

    public by9(fni fniVar) {
        fniVar.getClass();
        this.a = fniVar;
    }

    public /* synthetic */ by9(Object obj) {
        this.a = obj;
    }
}
