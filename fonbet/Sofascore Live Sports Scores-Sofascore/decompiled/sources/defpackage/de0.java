package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MenuItem;
import androidx.media3.common.b;
import com.fyber.inneractive.sdk.ignite.events.wrappers.a;
import com.fyber.inneractive.sdk.network.t;
import com.fyber.inneractive.sdk.network.w;
import com.fyber.inneractive.sdk.util.IAlog;
import com.google.ads.mediation.ironsource.IronSourceMediationAdapter;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;
import com.google.android.gms.internal.consent_sdk.zzqs;
import com.google.android.gms.tasks.OnFailureListener;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.sofascore.results.R;
import com.unity3d.ironsourceads.InitListener;
import com.unity3d.services.core.fid.Constants;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class de0 implements xfc, ro3, ie4, dfc, dq4, rsj, lt9, vyf, OnFailureListener, InitListener, e3g, pub {
    public static volatile de0 d;
    public static final de0 e;
    public static final bw8 f;
    public final /* synthetic */ int a;
    public Object b;
    public static final k03 c = new k03();
    public static final de0 g = new de0(3, false);
    public static final x3f h = new x3f(27);

    static {
        int i = 1;
        e = new de0(new float[]{0.8951f, -0.7502f, 0.0389f, 0.2664f, 1.7135f, -0.0685f, -0.1614f, 0.0367f, 1.0296f}, i);
        f = new bw8(i);
    }

    public de0(int i) {
        zgc zgcVar;
        this.a = i;
        switch (i) {
            case 2:
                kff kffVar = kff.c;
                try {
                    zgcVar = (zgc) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod(Constants.GET_INSTANCE, null).invoke(null, null);
                } catch (Exception unused) {
                    zgcVar = f;
                }
                zgc[] zgcVarArr = {bw8.b, zgcVar};
                gtb gtbVar = new gtb();
                gtbVar.a = zgcVarArr;
                Charset charset = w7a.a;
                this.b = gtbVar;
                break;
            case 4:
                int i2 = k1p.a;
                gmo gmoVar = new gmo(new n4p[]{kpg.o, h}, 9);
                Charset charset2 = zzqs.a;
                this.b = gmoVar;
                break;
            case 10:
                this.b = new AtomicInteger(0);
                break;
            case 20:
                this.b = new zs3();
                break;
            case 22:
                this.b = new ConcurrentHashMap();
                break;
            case 27:
                r45 r45Var = new r45(1);
                this.b = r45Var;
                if (!r45Var.b) {
                    if (r45Var.c) {
                        i3f.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    r45Var.b();
                    r45Var.c = true;
                    break;
                }
                break;
            default:
                this.b = ypa.b(mz.z);
                break;
        }
    }

    public static void g(p5m p5mVar, Exception exc) {
        l(p5mVar, z1a.g(exc, null));
    }

    public static void l(p5m p5mVar, Object... objArr) {
        hpo.a("%s : dispatching event", "IgniteEventDispatcher");
        if (((a) g.b) != null) {
            t a = t.a(p5mVar);
            if (a == null) {
                IAlog.f("%s : One DT Error: %s is missing in IAReportError map", "IgniteEventDispatcherWrapper", p5mVar);
            } else {
                new w(a).a(objArr).a((String) null);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004d A[Catch: all -> 0x005d, TRY_LEAVE, TryCatch #3 {all -> 0x005d, blocks: (B:4:0x0009, B:9:0x0031, B:19:0x0047, B:21:0x004d, B:34:0x002b, B:13:0x003a, B:16:0x0041, B:27:0x0019, B:30:0x0020), top: B:3:0x0009, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005f A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031 A[Catch: all -> 0x005d, TRY_LEAVE, TryCatch #3 {all -> 0x005d, blocks: (B:4:0x0009, B:9:0x0031, B:19:0x0047, B:21:0x004d, B:34:0x002b, B:13:0x003a, B:16:0x0041, B:27:0x0019, B:30:0x0020), top: B:3:0x0009, inners: #0, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void A(Uri uri, Intent intent) {
        String queryParameter;
        String string;
        Set set = cw3.a;
        if (set.contains(this)) {
            return;
        }
        try {
            intent.getClass();
            String str = null;
            if (!set.contains(this)) {
                try {
                    queryParameter = uri.getQueryParameter("al_applink_data");
                } catch (Throwable th) {
                    cw3.a(this, th);
                }
                if (queryParameter != null) {
                    try {
                        string = new JSONObject(queryParameter).getString("campaign_ids");
                    } catch (Exception unused) {
                    }
                    if (string == null) {
                        if (!cw3.a.contains(this)) {
                            try {
                                Bundle bundleExtra = intent.getBundleExtra("al_applink_data");
                                if (bundleExtra != null) {
                                    str = bundleExtra.getString("campaign_ids");
                                }
                            } catch (Throwable th2) {
                                cw3.a(this, th2);
                            }
                        }
                        string = str;
                    }
                    if (string == null) {
                        v().edit().putString("campaign_ids", string).apply();
                        return;
                    }
                    return;
                }
            }
            string = null;
            if (string == null) {
            }
            if (string == null) {
            }
        } catch (Throwable th3) {
            cw3.a(this, th3);
        }
    }

    public void B(p4h p4hVar) {
        p4hVar.getClass();
        wt3.z(((zs3) this.b).a(p4hVar));
    }

    @Override // defpackage.ie4
    public void a() {
        switch (this.a) {
            case 11:
            case 13:
                break;
            case 12:
            default:
                ((uqf) this.b).release();
                break;
        }
    }

    @Override // defpackage.xfc
    public void b(vec vecVar, boolean z) {
        if (vecVar instanceof sji) {
            ((sji) vecVar).z.k().c(false);
        }
        xfc xfcVar = ((dc) this.b).e;
        if (xfcVar != null) {
            xfcVar.b(vecVar, z);
        }
    }

    @Override // defpackage.dfc
    public void c(vec vecVar, MenuItem menuItem) {
        ((ql2) this.b).g.removeCallbacksAndMessages(vecVar);
    }

    @Override // defpackage.dq4
    public int d() {
        return j() | (j() << 8);
    }

    @Override // defpackage.ie4
    public Object e() {
        switch (this.a) {
            case 11:
                ByteBuffer byteBuffer = (ByteBuffer) this.b;
                byteBuffer.position(0);
                return byteBuffer;
            case 12:
            default:
                uqf uqfVar = (uqf) this.b;
                uqfVar.reset();
                return uqfVar;
            case 13:
                return this.b;
        }
    }

    @Override // defpackage.pub
    public Object f(Object obj, Object obj2) {
        return ((xs8) this.b).apply(obj2);
    }

    @Override // defpackage.dfc
    public void h(vec vecVar, efc efcVar) {
        ql2 ql2Var = (ql2) this.b;
        Handler handler = ql2Var.g;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = ql2Var.i;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (vecVar == ((pl2) arrayList.get(i)).b) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        handler.postAtTime(new n2(this, i2 < arrayList.size() ? (pl2) arrayList.get(i2) : null, efcVar, vecVar, 1), vecVar, SystemClock.uptimeMillis() + 200);
    }

    @Override // defpackage.dq4
    public int i(int i, byte[] bArr) {
        int i2 = 0;
        int i3 = 0;
        while (i2 < i && (i3 = ((InputStream) this.b).read(bArr, i2, i - i2)) != -1) {
            i2 += i3;
        }
        if (i2 == 0 && i3 == -1) {
            throw new cq4();
        }
        return i2;
    }

    @Override // defpackage.dq4
    public short j() {
        int read = ((InputStream) this.b).read();
        if (read != -1) {
            return (short) read;
        }
        throw new cq4();
    }

    @Override // defpackage.xfc
    public boolean k(vec vecVar) {
        dc dcVar = (dc) this.b;
        if (vecVar == dcVar.c) {
            return false;
        }
        efc efcVar = ((sji) vecVar).A;
        xfc xfcVar = dcVar.e;
        if (xfcVar != null) {
            return xfcVar.k(vecVar);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void m(int i, int i2, ml6 ml6Var) {
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
        c0c c0cVar = (c0c) this.b;
        nkk nkkVar = c0cVar.b;
        SparseArray sparseArray = c0cVar.c;
        nkk nkkVar2 = c0cVar.i;
        nkk nkkVar3 = c0cVar.g;
        int i13 = 1;
        int i14 = 0;
        if (i != 161 && i != 163) {
            if (i == 165) {
                if (c0cVar.G != 2) {
                    return;
                }
                a0c a0cVar = (a0c) sparseArray.get(c0cVar.M);
                int i15 = c0cVar.P;
                nkk nkkVar4 = c0cVar.n;
                if (i15 != 4 || !"V_VP9".equals(a0cVar.b)) {
                    ml6Var.skipFully(i2);
                    return;
                } else {
                    nkkVar4.B(i2);
                    ml6Var.readFully(nkkVar4.a, 0, i2);
                    return;
                }
            }
            if (i == 16877) {
                c0cVar.e(i);
                a0c a0cVar2 = c0cVar.u;
                int i16 = a0cVar2.g;
                if (i16 != 1685485123 && i16 != 1685480259) {
                    ml6Var.skipFully(i2);
                    return;
                }
                byte[] bArr = new byte[i2];
                a0cVar2.N = bArr;
                ml6Var.readFully(bArr, 0, i2);
                return;
            }
            if (i == 16981) {
                c0cVar.e(i);
                byte[] bArr2 = new byte[i2];
                c0cVar.u.i = bArr2;
                ml6Var.readFully(bArr2, 0, i2);
                return;
            }
            if (i == 18402) {
                byte[] bArr3 = new byte[i2];
                ml6Var.readFully(bArr3, 0, i2);
                c0cVar.e(i);
                c0cVar.u.j = new ssj(1, bArr3, 0, 0);
                return;
            }
            if (i == 21419) {
                Arrays.fill(nkkVar2.a, (byte) 0);
                ml6Var.readFully(nkkVar2.a, 4 - i2, i2);
                nkkVar2.E(0);
                c0cVar.w = (int) nkkVar2.t();
                return;
            }
            if (i == 25506) {
                c0cVar.e(i);
                byte[] bArr4 = new byte[i2];
                c0cVar.u.k = bArr4;
                ml6Var.readFully(bArr4, 0, i2);
                return;
            }
            if (i != 30322) {
                throw r9e.a("Unexpected id: " + i, null);
            }
            c0cVar.e(i);
            byte[] bArr5 = new byte[i2];
            c0cVar.u.v = bArr5;
            ml6Var.readFully(bArr5, 0, i2);
            return;
        }
        int i17 = 8;
        if (c0cVar.G == 0) {
            c0cVar.M = (int) nkkVar.y(ml6Var, false, true, 8);
            c0cVar.N = nkkVar.c;
            c0cVar.I = C.TIME_UNSET;
            c0cVar.G = 1;
            nkkVar3.B(0);
        }
        a0c a0cVar3 = (a0c) sparseArray.get(c0cVar.M);
        if (a0cVar3 == null) {
            ml6Var.skipFully(i2 - c0cVar.N);
            c0cVar.G = 0;
            return;
        }
        a0cVar3.X.getClass();
        if (c0cVar.G == 1) {
            c0cVar.h(ml6Var, 3);
            int i18 = (nkkVar3.a[2] & 6) >> 1;
            if (i18 == 0) {
                c0cVar.K = 1;
                int[] iArr2 = c0cVar.L;
                if (iArr2 == null) {
                    iArr2 = new int[1];
                } else if (iArr2.length < 1) {
                    iArr2 = new int[Math.max(iArr2.length * 2, 1)];
                }
                c0cVar.L = iArr2;
                iArr2[0] = (i2 - c0cVar.N) - 3;
            } else {
                c0cVar.h(ml6Var, 4);
                int i19 = (nkkVar3.a[3] & 255) + 1;
                c0cVar.K = i19;
                int[] iArr3 = c0cVar.L;
                if (iArr3 == null) {
                    iArr3 = new int[i19];
                    i4 = 4;
                } else {
                    i4 = 4;
                    if (iArr3.length < i19) {
                        iArr3 = new int[Math.max(iArr3.length * 2, i19)];
                    }
                }
                c0cVar.L = iArr3;
                if (i18 == 2) {
                    int i20 = (i2 - c0cVar.N) - 4;
                    int i21 = c0cVar.K;
                    Arrays.fill(iArr3, 0, i21, i20 / i21);
                } else {
                    if (i18 != 1) {
                        if (i18 != 3) {
                            throw r9e.a("Unexpected lacing value: " + i18, null);
                        }
                        int i22 = 0;
                        int i23 = 0;
                        int i24 = i4;
                        while (true) {
                            int i25 = c0cVar.K - i13;
                            int[] iArr4 = c0cVar.L;
                            if (i22 >= i25) {
                                i3 = i13;
                                i5 = i14;
                                iArr4[i25] = ((i2 - c0cVar.N) - i24) - i23;
                                break;
                            }
                            iArr4[i22] = i14;
                            int i26 = i24 + 1;
                            c0cVar.h(ml6Var, i26);
                            if (nkkVar3.a[i24] == 0) {
                                throw r9e.a("No valid varint length mask found", null);
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
                                int i28 = i13 << (7 - i27);
                                i7 = i13;
                                if ((nkkVar3.a[i24] & i28) != 0) {
                                    i9 = i26 + i27;
                                    c0cVar.h(ml6Var, i9);
                                    i8 = i14;
                                    j = (~i28) & nkkVar3.a[i24] & 255;
                                    while (i26 < i9) {
                                        j = (j << i6) | (nkkVar3.a[i26] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                                        i26++;
                                    }
                                    if (i22 > 0) {
                                        j -= (1 << ((i27 * 7) + 6)) - 1;
                                    }
                                } else {
                                    i27++;
                                    i13 = i7;
                                    i17 = i6;
                                }
                            }
                            if (j < -2147483648L || j > 2147483647L) {
                                break;
                            }
                            int i29 = (int) j;
                            int[] iArr5 = c0cVar.L;
                            if (i22 != 0) {
                                i29 += iArr5[i22 - 1];
                            }
                            iArr5[i22] = i29;
                            i23 += i29;
                            i22++;
                            i24 = i9;
                            i13 = i7;
                            i17 = i6;
                            i14 = i8;
                        }
                        throw r9e.a("EBML lacing sample size out of range.", null);
                    }
                    int i30 = 0;
                    int i31 = 0;
                    int i32 = i4;
                    while (true) {
                        i10 = c0cVar.K - 1;
                        iArr = c0cVar.L;
                        if (i30 >= i10) {
                            break;
                        }
                        iArr[i30] = 0;
                        while (true) {
                            i11 = i32 + 1;
                            c0cVar.h(ml6Var, i11);
                            int i33 = nkkVar3.a[i32] & 255;
                            int[] iArr6 = c0cVar.L;
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
                    iArr[i10] = ((i2 - c0cVar.N) - i32) - i31;
                }
            }
            i3 = 1;
            i5 = 0;
            byte[] bArr6 = nkkVar3.a;
            c0cVar.H = c0cVar.j((bArr6[i3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | (bArr6[i5] << 8)) + c0cVar.B;
            c0cVar.O = (a0cVar3.d == 2 || (i == 163 && (nkkVar3.a[2] & 128) == 128)) ? i3 : i5;
            c0cVar.G = 2;
            c0cVar.J = i5;
        } else {
            i3 = 1;
        }
        if (i == 163) {
            while (true) {
                int i34 = c0cVar.J;
                if (i34 >= c0cVar.K) {
                    c0cVar.G = 0;
                    return;
                } else {
                    c0cVar.f(a0cVar3, ((c0cVar.J * a0cVar3.e) / 1000) + c0cVar.H, c0cVar.O, c0cVar.k(ml6Var, a0cVar3, c0cVar.L[i34], false), 0);
                    c0cVar.J++;
                }
            }
        } else {
            while (true) {
                int i35 = c0cVar.J;
                if (i35 >= c0cVar.K) {
                    return;
                }
                int[] iArr7 = c0cVar.L;
                boolean z = i3;
                iArr7[i35] = c0cVar.k(ml6Var, a0cVar3, iArr7[i35], z);
                c0cVar.J += z ? 1 : 0;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String n(b bVar) {
        String str;
        String z;
        String str2 = bVar.d;
        String str3 = bVar.b;
        if (!TextUtils.isEmpty(str2) && !C.LANGUAGE_UNDETERMINED.equals(str2)) {
            Locale forLanguageTag = Locale.forLanguageTag(str2);
            String str4 = nik.a;
            Locale locale = Locale.getDefault(Locale.Category.DISPLAY);
            str = forLanguageTag.getDisplayName(locale);
            if (!TextUtils.isEmpty(str)) {
                try {
                    int offsetByCodePoints = str.offsetByCodePoints(0, 1);
                    str = str.substring(0, offsetByCodePoints).toUpperCase(locale) + str.substring(offsetByCodePoints);
                } catch (IndexOutOfBoundsException unused) {
                }
                z = z(str, o(bVar));
                if (TextUtils.isEmpty(z)) {
                    return z;
                }
                if (TextUtils.isEmpty(str3)) {
                    str3 = "";
                }
                return str3;
            }
        }
        str = "";
        z = z(str, o(bVar));
        if (TextUtils.isEmpty(z)) {
        }
    }

    public String o(b bVar) {
        Resources resources = (Resources) this.b;
        int i = bVar.f;
        int i2 = bVar.f;
        String string = (i & 2) != 0 ? resources.getString(R.string.exo_track_role_alternate) : "";
        if ((i2 & 4) != 0) {
            string = z(string, resources.getString(R.string.exo_track_role_supplementary));
        }
        if ((i2 & 8) != 0) {
            string = z(string, resources.getString(R.string.exo_track_role_commentary));
        }
        return (i2 & 1088) != 0 ? z(string, resources.getString(R.string.exo_track_role_closed_captions)) : string;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        exc.getClass();
        ugj.a.getClass();
        exc.getMessage();
        oog oogVar = (oog) this.b;
        p2g p2gVar = w2g.b;
        oogVar.resumeWith(null);
    }

    @Override // defpackage.vyf
    public void onFinish() {
        e48 e48Var;
        b48 b48Var = ((z38) this.b).f;
        if (b48Var.j == null || (e48Var = b48Var.k) == null) {
            return;
        }
        ((d55) e48Var).c();
    }

    @Override // com.unity3d.ironsourceads.InitListener
    public void onInitFailed(IronSourceError ironSourceError) {
        ((InitializationCompleteCallback) this.b).onInitializationFailed(ironSourceError.getErrorMessage());
    }

    @Override // com.unity3d.ironsourceads.InitListener
    public void onInitSuccess() {
        IronSourceMediationAdapter.b.set(true);
        ((InitializationCompleteCallback) this.b).onInitializationSucceeded();
    }

    @Override // defpackage.lt9
    public void onSuccess() {
        ((jq5) this.b).b.setVisibility(0);
    }

    public void r(byte b) {
        ((Parcel) this.b).writeByte(b);
    }

    public void s(float f2) {
        ((Parcel) this.b).writeFloat(f2);
    }

    @Override // defpackage.dq4
    public long skip(long j) {
        InputStream inputStream = (InputStream) this.b;
        if (j < 0) {
            return 0L;
        }
        long j2 = j;
        while (j2 > 0) {
            long skip = inputStream.skip(j2);
            if (skip <= 0) {
                if (inputStream.read() == -1) {
                    break;
                }
                skip = 1;
            }
            j2 -= skip;
        }
        return j - j2;
    }

    public void t(long j) {
        long b = lfj.b(j);
        byte b2 = 0;
        if (!mfj.a(b, 0L)) {
            if (mfj.a(b, 4294967296L)) {
                b2 = 1;
            } else if (mfj.a(b, 8589934592L)) {
                b2 = 2;
            }
        }
        r(b2);
        if (mfj.a(lfj.b(j), 0L)) {
            return;
        }
        s(lfj.c(j));
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "Bradford";
            case 24:
                String jSONObject = ((JSONObject) this.b).toString();
                jSONObject.getClass();
                return jSONObject;
            default:
                return super.toString();
        }
    }

    public String u(String str) {
        if (cw3.a.contains(this)) {
            return null;
        }
        try {
            return v().getString(str, null);
        } catch (Throwable th) {
            cw3.a(this, th);
            return null;
        }
    }

    public SharedPreferences v() {
        if (cw3.a.contains(this)) {
            return null;
        }
        try {
            Object value = ((mqi) this.b).getValue();
            value.getClass();
            return (SharedPreferences) value;
        } catch (Throwable th) {
            cw3.a(this, th);
            return null;
        }
    }

    public String w(b bVar) {
        String n;
        Resources resources = (Resources) this.b;
        String str = bVar.o;
        int i = bVar.j;
        int i2 = bVar.G;
        int i3 = bVar.w;
        int i4 = bVar.v;
        String str2 = bVar.k;
        int i5 = sjc.i(str);
        if (i5 == -1) {
            if (sjc.j(str2) == null) {
                if (sjc.b(str2) == null) {
                    if (i4 == -1 && i3 == -1) {
                        if (i2 == -1 && bVar.H == -1) {
                            i5 = -1;
                        }
                    }
                }
                i5 = 1;
            }
            i5 = 2;
        }
        if (i5 == 2) {
            n = z(o(bVar), (i4 == -1 || i3 == -1) ? "" : resources.getString(R.string.exo_track_resolution, Integer.valueOf(i4), Integer.valueOf(i3)), i != -1 ? resources.getString(R.string.exo_track_bitrate, Float.valueOf(i / 1000000.0f)) : "");
        } else if (i5 == 1) {
            n = z(n(bVar), (i2 == -1 || i2 < 1) ? "" : i2 != 1 ? i2 != 2 ? (i2 == 6 || i2 == 7) ? resources.getString(R.string.exo_track_surround_5_point_1) : i2 != 8 ? resources.getString(R.string.exo_track_surround) : resources.getString(R.string.exo_track_surround_7_point_1) : resources.getString(R.string.exo_track_stereo) : resources.getString(R.string.exo_track_mono), i != -1 ? resources.getString(R.string.exo_track_bitrate, Float.valueOf(i / 1000000.0f)) : "");
        } else {
            n = n(bVar);
        }
        if (!n.isEmpty()) {
            return n;
        }
        String str3 = bVar.d;
        return (str3 == null || str3.trim().isEmpty()) ? resources.getString(R.string.exo_track_unknown) : resources.getString(R.string.exo_track_unknown_name, str3);
    }

    public void x(Activity activity) {
        Set set = cw3.a;
        if (set.contains(this)) {
            return;
        }
        try {
            activity.getClass();
            Uri data = activity.getIntent().getData();
            if (data == null) {
                return;
            }
            Intent intent = activity.getIntent();
            intent.getClass();
            A(data, intent);
            if (set.contains(this)) {
                return;
            }
            try {
                String queryParameter = data.getQueryParameter("fbclid");
                if (queryParameter != null && queryParameter.length() != 0) {
                    v().edit().putString("click_id", queryParameter).apply();
                }
            } catch (Throwable th) {
                cw3.a(this, th);
            }
        } catch (Throwable th2) {
            cw3.a(this, th2);
        }
    }

    public void y(int i, long j) {
        c0c c0cVar = (c0c) this.b;
        if (i == 20529) {
            if (j == 0) {
                return;
            }
            throw r9e.a("ContentEncodingOrder " + j + " not supported", null);
        }
        if (i == 20530) {
            if (j == 1) {
                return;
            }
            throw r9e.a("ContentEncodingScope " + j + " not supported", null);
        }
        int i2 = 3;
        switch (i) {
            case MRAID_JS_WRITE_FAILED_VALUE:
                c0cVar.e(i);
                c0cVar.u.d = (int) j;
                return;
            case PRIVACY_URL_ERROR_VALUE:
                c0cVar.e(i);
                c0cVar.u.V = j == 1;
                return;
            case 155:
                c0cVar.I = c0cVar.j(j);
                return;
            case 159:
                c0cVar.e(i);
                c0cVar.u.O = (int) j;
                return;
            case 176:
                c0cVar.e(i);
                c0cVar.u.m = (int) j;
                return;
            case 179:
                c0cVar.a(i);
                c0cVar.C.a(c0cVar.j(j));
                return;
            case 186:
                c0cVar.e(i);
                c0cVar.u.n = (int) j;
                return;
            case AD_RESPONSE_EMPTY_VALUE:
                c0cVar.e(i);
                c0cVar.u.c = (int) j;
                return;
            case 231:
                c0cVar.B = c0cVar.j(j);
                return;
            case 238:
                c0cVar.P = (int) j;
                return;
            case 241:
                if (c0cVar.E) {
                    return;
                }
                c0cVar.a(i);
                c0cVar.D.a(j);
                c0cVar.E = true;
                return;
            case 251:
                c0cVar.Q = true;
                return;
            case 16871:
                c0cVar.e(i);
                c0cVar.u.g = (int) j;
                return;
            case 16980:
                if (j == 3) {
                    return;
                }
                throw r9e.a("ContentCompAlgo " + j + " not supported", null);
            case 17029:
                if (j < 1 || j > 2) {
                    throw r9e.a("DocTypeReadVersion " + j + " not supported", null);
                }
                return;
            case 17143:
                if (j == 1) {
                    return;
                }
                throw r9e.a("EBMLReadVersion " + j + " not supported", null);
            case 18401:
                if (j == 5) {
                    return;
                }
                throw r9e.a("ContentEncAlgo " + j + " not supported", null);
            case 18408:
                if (j == 1) {
                    return;
                }
                throw r9e.a("AESSettingsCipherMode " + j + " not supported", null);
            case 21420:
                c0cVar.x = j + c0cVar.q;
                return;
            case 21432:
                int i3 = (int) j;
                c0cVar.e(i);
                if (i3 == 0) {
                    c0cVar.u.w = 0;
                    return;
                }
                if (i3 == 1) {
                    c0cVar.u.w = 2;
                    return;
                } else if (i3 == 3) {
                    c0cVar.u.w = 1;
                    return;
                } else {
                    if (i3 != 15) {
                        return;
                    }
                    c0cVar.u.w = 3;
                    return;
                }
            case 21680:
                c0cVar.e(i);
                c0cVar.u.o = (int) j;
                return;
            case 21682:
                c0cVar.e(i);
                c0cVar.u.q = (int) j;
                return;
            case 21690:
                c0cVar.e(i);
                c0cVar.u.p = (int) j;
                return;
            case 21930:
                c0cVar.e(i);
                c0cVar.u.U = j == 1;
                return;
            case 21998:
                c0cVar.e(i);
                c0cVar.u.f = (int) j;
                return;
            case 22186:
                c0cVar.e(i);
                c0cVar.u.R = j;
                return;
            case 22203:
                c0cVar.e(i);
                c0cVar.u.S = j;
                return;
            case 25188:
                c0cVar.e(i);
                c0cVar.u.P = (int) j;
                return;
            case 30114:
                c0cVar.R = j;
                return;
            case 30321:
                c0cVar.e(i);
                int i4 = (int) j;
                if (i4 == 0) {
                    c0cVar.u.r = 0;
                    return;
                }
                if (i4 == 1) {
                    c0cVar.u.r = 1;
                    return;
                } else if (i4 == 2) {
                    c0cVar.u.r = 2;
                    return;
                } else {
                    if (i4 != 3) {
                        return;
                    }
                    c0cVar.u.r = 3;
                    return;
                }
            case 2352003:
                c0cVar.e(i);
                c0cVar.u.e = (int) j;
                return;
            case 2807729:
                c0cVar.r = j;
                return;
            default:
                switch (i) {
                    case 21945:
                        c0cVar.e(i);
                        int i5 = (int) j;
                        if (i5 == 1) {
                            c0cVar.u.A = 2;
                            return;
                        } else {
                            if (i5 != 2) {
                                return;
                            }
                            c0cVar.u.A = 1;
                            return;
                        }
                    case 21946:
                        c0cVar.e(i);
                        int i6 = (int) j;
                        if (i6 != 1) {
                            if (i6 == 16) {
                                i2 = 6;
                            } else if (i6 == 18) {
                                i2 = 7;
                            } else if (i6 != 6 && i6 != 7) {
                                i2 = -1;
                            }
                        }
                        if (i2 != -1) {
                            c0cVar.u.z = i2;
                            return;
                        }
                        return;
                    case 21947:
                        c0cVar.e(i);
                        c0cVar.u.x = true;
                        int a = v13.a((int) j);
                        if (a != -1) {
                            c0cVar.u.y = a;
                            return;
                        }
                        return;
                    case 21948:
                        c0cVar.e(i);
                        c0cVar.u.B = (int) j;
                        return;
                    case 21949:
                        c0cVar.e(i);
                        c0cVar.u.C = (int) j;
                        return;
                    default:
                        return;
                }
        }
    }

    public String z(String... strArr) {
        String str = "";
        for (String str2 : strArr) {
            if (!str2.isEmpty()) {
                str = TextUtils.isEmpty(str) ? str2 : ((Resources) this.b).getString(R.string.exo_item_list, str, str2);
            }
        }
        return str;
    }

    private final void p() {
    }

    private final void q() {
    }

    @Override // defpackage.lt9
    public void E(fq5 fq5Var) {
    }

    public /* synthetic */ de0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public de0(InputStream inputStream, kn4 kn4Var) {
        this.a = 25;
        uqf uqfVar = new uqf(inputStream, kn4Var);
        this.b = uqfVar;
        uqfVar.mark(5242880);
    }

    public /* synthetic */ de0(int i, boolean z) {
        this.a = i;
    }

    public de0(Resources resources) {
        this.a = 16;
        resources.getClass();
        this.b = resources;
    }
}
