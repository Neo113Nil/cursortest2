package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import com.appsflyer.sdk_base.referrer.Payload;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.android.gms.internal.play_billing.zzc;
import com.ironsource.U3;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.sofascore.model.fantasy.FantasyCompetitionType;
import com.sofascore.model.fantasy.FantasyLeague;
import com.sofascore.model.fantasy.FantasyUserLeague;
import com.sofascore.model.mvvm.model.Country;
import com.sofascore.model.mvvm.model.FieldTranslations;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.PlayerKt;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.network.response.PlayerOrTeam;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.io.ByteArrayInputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class c6o {
    public static final gz2 b = new gz2(null);
    public static final tc3 c = new tc3(-1901538327, new qs2(26), false);
    public static final tc3 d = new tc3(-320080918, new ud3(19), false);
    public static final int[][] e = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};
    public static final int[][] f = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};
    public static final int[][] g = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE, -1, -1}, new int[]{6, 34, 62, 90, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, -1, -1}, new int[]{6, 26, 50, 74, 98, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, -1}, new int[]{6, 30, 54, 78, 102, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE, 142, -1}, new int[]{6, 34, 62, 90, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, 146, -1}, new int[]{6, 30, 54, 78, 102, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, 150}, new int[]{6, 24, 50, 76, 102, 128, 154}, new int[]{6, 28, 54, 80, 106, Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, 158}, new int[]{6, 32, 58, 84, 110, Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE, 142, 170}};
    public static final int[][] h = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};
    public static final Object i = new Object();
    public static Method j;
    public static boolean k;
    public static final /* synthetic */ int l = 0;
    public static final /* synthetic */ int m = 0;
    public static final /* synthetic */ int n = 0;
    public static final /* synthetic */ int o = 0;
    public static final /* synthetic */ int p = 0;
    public static final /* synthetic */ int q = 0;
    public final /* synthetic */ int a;

    public /* synthetic */ c6o(int i2) {
        this.a = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final oma A(wtc wtcVar) {
        if ((wtcVar.c & 2) != 0) {
            if (wtcVar instanceof oma) {
                return (oma) wtcVar;
            }
            if (wtcVar instanceof bw4) {
                wtc wtcVar2 = ((bw4) wtcVar).p;
                while (wtcVar2 != 0) {
                    if (wtcVar2 instanceof oma) {
                        return (oma) wtcVar2;
                    }
                    wtcVar2 = (!(wtcVar2 instanceof bw4) || (wtcVar2.c & 2) == 0) ? wtcVar2.f : ((bw4) wtcVar2).p;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object B(g6b g6bVar, sq3 sq3Var) {
        g gVar;
        int i2;
        g6b g6bVar2;
        fsf fsfVar;
        Throwable th;
        t6b t6bVar;
        t6b t6bVar2;
        if (sq3Var instanceof g) {
            gVar = (g) sq3Var;
            int i3 = gVar.u;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                gVar.u = i3 - Integer.MIN_VALUE;
                Object obj = gVar.t;
                lu3 lu3Var = lu3.a;
                i2 = gVar.u;
                if (i2 != 0) {
                    y6a.M(obj);
                    if (g6bVar.b().compareTo(e6b.d) >= 0) {
                        return Unit.a;
                    }
                    fsf fsfVar2 = new fsf();
                    try {
                        gVar.r = g6bVar;
                        gVar.s = fsfVar2;
                        gVar.u = 1;
                        lj2 lj2Var = new lj2(1, z9a.b(gVar));
                        lj2Var.t();
                        h hVar = new h(lj2Var, 0);
                        fsfVar2.a = hVar;
                        g6bVar.a(hVar);
                        if (lj2Var.q() == lu3Var) {
                            return lu3Var;
                        }
                        g6bVar2 = g6bVar;
                        fsfVar = fsfVar2;
                    } catch (Throwable th2) {
                        g6bVar2 = g6bVar;
                        fsfVar = fsfVar2;
                        th = th2;
                        t6bVar = (t6b) fsfVar.a;
                        if (t6bVar != null) {
                        }
                        throw th;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fsfVar = gVar.s;
                    g6bVar2 = gVar.r;
                    try {
                        y6a.M(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        t6bVar = (t6b) fsfVar.a;
                        if (t6bVar != null) {
                            g6bVar2.d(t6bVar);
                        }
                        throw th;
                    }
                }
                t6bVar2 = (t6b) fsfVar.a;
                if (t6bVar2 != null) {
                    g6bVar2.d(t6bVar2);
                }
                return Unit.a;
            }
        }
        gVar = new g(sq3Var);
        Object obj2 = gVar.t;
        lu3 lu3Var2 = lu3.a;
        i2 = gVar.u;
        if (i2 != 0) {
        }
        t6bVar2 = (t6b) fsfVar.a;
        if (t6bVar2 != null) {
        }
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x0248  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void C(kw1 kw1Var, int i2, gok gokVar, int i3, und undVar) {
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        int i8;
        int i9;
        byte[][] bArr = (byte[][]) undVar.d;
        int i10 = undVar.b;
        int i11 = undVar.c;
        for (byte[] bArr2 : bArr) {
            Arrays.fill(bArr2, (byte) -1);
        }
        int length = e[0].length;
        J(0, 0, undVar);
        int i12 = i10 - length;
        J(i12, 0, undVar);
        J(0, i12, undVar);
        I(0, 7, undVar);
        int i13 = i10 - 8;
        I(i13, 7, undVar);
        I(0, i13, undVar);
        K(7, 0, undVar);
        int i14 = i11 - 8;
        K(i14, 0, undVar);
        int i15 = i11 - 7;
        K(7, i15, undVar);
        if (undVar.c(8, i14) == 0) {
            throw new iml();
        }
        undVar.e(8, i14, 1);
        int i16 = gokVar.a;
        if (i16 < 2) {
            i4 = 0;
        } else {
            i4 = 0;
            int[] iArr = g[i16 - 1];
            int length2 = iArr.length;
            int i17 = 0;
            while (i17 < length2) {
                int i18 = iArr[i17];
                if (i18 >= 0) {
                    int length3 = iArr.length;
                    int i19 = 0;
                    while (i19 < length3) {
                        int i20 = iArr[i19];
                        if (i20 >= 0 && N(undVar.c(i20, i18))) {
                            int i21 = i20 - 2;
                            int i22 = i18 - 2;
                            i5 = i17;
                            i6 = i10;
                            int i23 = 0;
                            while (true) {
                                if (i23 >= 5) {
                                    break;
                                }
                                int[] iArr2 = f[i23];
                                int i24 = i23;
                                int i25 = 0;
                                for (int i26 = 5; i25 < i26; i26 = 5) {
                                    int i27 = i25;
                                    undVar.e(i21 + i25, i22 + i24, iArr2[i27]);
                                    i25 = i27 + 1;
                                    iArr = iArr;
                                }
                                i23 = i24 + 1;
                            }
                        } else {
                            i5 = i17;
                            i6 = i10;
                        }
                        i19++;
                        i17 = i5;
                        i10 = i6;
                        iArr = iArr;
                    }
                }
                i17++;
                i10 = i10;
                iArr = iArr;
            }
        }
        int i28 = i10;
        int i29 = 8;
        while (i29 < i13) {
            int i30 = i29 + 1;
            int i31 = i30 % 2;
            if (N(undVar.c(i29, 6))) {
                undVar.e(i29, 6, i31);
            }
            if (N(undVar.c(6, i29))) {
                undVar.e(6, i29, i31);
            }
            i29 = i30;
        }
        kw1 kw1Var2 = new kw1();
        if (i3 < 0 || i3 >= 8) {
            throw new iml("Invalid mask pattern");
        }
        if (i2 == 1) {
            i7 = 1;
        } else if (i2 == 2) {
            i7 = i4;
        } else if (i2 == 3) {
            i7 = 3;
        } else {
            if (i2 != 4) {
                throw null;
            }
            i7 = 2;
        }
        int i32 = (i7 << 3) | i3;
        kw1Var2.b(i32, 5);
        kw1Var2.b(D(i32, 1335), 10);
        kw1 kw1Var3 = new kw1();
        kw1Var3.b(21522, 15);
        if (kw1Var2.b != kw1Var3.b) {
            a70.p("Sizes don't match");
            return;
        }
        int i33 = i4;
        while (true) {
            int[] iArr3 = kw1Var2.a;
            if (i33 >= iArr3.length) {
                break;
            }
            iArr3[i33] = iArr3[i33] ^ kw1Var3.a[i33];
            i33++;
        }
        if (kw1Var2.b != 15) {
            throw new iml("should not happen but we got: " + kw1Var2.b);
        }
        int i34 = i4;
        while (true) {
            int i35 = kw1Var2.b;
            if (i34 >= i35) {
                break;
            }
            boolean d2 = kw1Var2.d((i35 - 1) - i34);
            int[] iArr4 = h[i34];
            undVar.f(iArr4[i4], iArr4[1], d2);
            if (i34 < 8) {
                undVar.f((i28 - i34) - 1, 8, d2);
            } else {
                undVar.f(8, (i34 - 8) + i15, d2);
            }
            i34++;
        }
        if (i16 >= 7) {
            kw1 kw1Var4 = new kw1();
            kw1Var4.b(i16, 6);
            kw1Var4.b(D(i16, 7973), 12);
            if (kw1Var4.b != 18) {
                throw new iml("should not happen but we got: " + kw1Var4.b);
            }
            int i36 = 17;
            for (int i37 = i4; i37 < 6; i37++) {
                for (int i38 = i4; i38 < 3; i38++) {
                    boolean d3 = kw1Var4.d(i36);
                    i36--;
                    int i39 = (i11 - 11) + i38;
                    undVar.f(i37, i39, d3);
                    undVar.f(i39, i37, d3);
                }
            }
        }
        int i40 = i28 - 1;
        int i41 = i11 - 1;
        int i42 = i4;
        int i43 = -1;
        while (i40 > 0) {
            if (i40 == 6) {
                i40--;
            }
            while (i41 >= 0 && i41 < i11) {
                for (int i44 = i4; i44 < 2; i44++) {
                    int i45 = i40 - i44;
                    if (N(undVar.c(i45, i41))) {
                        if (i42 < kw1Var.b) {
                            z = kw1Var.d(i42);
                            i42++;
                        } else {
                            z = i4;
                        }
                        if (i3 != -1) {
                            switch (i3) {
                                case 0:
                                    i8 = i41 + i45;
                                    i9 = i8 & 1;
                                    if (i9 == 0) {
                                        z = !z;
                                        break;
                                    }
                                    break;
                                case 1:
                                    i9 = i41 & 1;
                                    if (i9 == 0) {
                                    }
                                    break;
                                case 2:
                                    i9 = i45 % 3;
                                    if (i9 == 0) {
                                    }
                                    break;
                                case 3:
                                    i9 = (i41 + i45) % 3;
                                    if (i9 == 0) {
                                    }
                                    break;
                                case 4:
                                    i9 = ((i45 / 3) + (i41 / 2)) & 1;
                                    if (i9 == 0) {
                                    }
                                    break;
                                case 5:
                                    int i46 = i41 * i45;
                                    i9 = (i46 % 3) + (i46 & 1);
                                    if (i9 == 0) {
                                    }
                                    break;
                                case 6:
                                    int i47 = i41 * i45;
                                    i9 = ((i47 % 3) + (i47 & 1)) & 1;
                                    if (i9 == 0) {
                                    }
                                    break;
                                case 7:
                                    i8 = ((i41 * i45) % 3) + ((i41 + i45) & 1);
                                    i9 = i8 & 1;
                                    if (i9 == 0) {
                                    }
                                    break;
                                default:
                                    a70.p("Invalid mask pattern: ".concat(String.valueOf(i3)));
                                    return;
                            }
                        }
                        undVar.f(i45, i41, z);
                    }
                }
                i41 += i43;
            }
            i43 = -i43;
            i41 += i43;
            i40 -= 2;
        }
        if (i42 == kw1Var.b) {
            return;
        }
        throw new iml("Not all bits consumed: " + i42 + '/' + kw1Var.b);
    }

    public static int D(int i2, int i3) {
        if (i3 == 0) {
            a70.p("0 polynomial");
            return 0;
        }
        int numberOfLeadingZeros = Integer.numberOfLeadingZeros(i3);
        int i4 = 32 - numberOfLeadingZeros;
        int i5 = i2 << (31 - numberOfLeadingZeros);
        while (32 - Integer.numberOfLeadingZeros(i5) >= i4) {
            i5 ^= i3 << ((32 - Integer.numberOfLeadingZeros(i5)) - i4);
        }
        return i5;
    }

    public static q89 E(q89 q89Var, q89 q89Var2) {
        ef0 ef0Var = new ef0(1);
        int size = q89Var.size();
        for (int i2 = 0; i2 < size; i2++) {
            String j2 = vha.j(q89Var, i2);
            String l2 = vha.l(q89Var, i2);
            if ((!"Warning".equalsIgnoreCase(j2) || !c.v(l2, "1", false)) && ("Content-Length".equalsIgnoreCase(j2) || "Content-Encoding".equalsIgnoreCase(j2) || "Content-Type".equalsIgnoreCase(j2) || !O(j2) || q89Var2.a(j2) == null)) {
                ef0Var.b(j2, l2);
            }
        }
        int size2 = q89Var2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            String j3 = vha.j(q89Var2, i3);
            if (!"Content-Length".equalsIgnoreCase(j3) && !"Content-Encoding".equalsIgnoreCase(j3) && !"Content-Type".equalsIgnoreCase(j3) && O(j3)) {
                ef0Var.b(j3, vha.l(q89Var2, i3));
            }
        }
        return vha.i(ef0Var);
    }

    public static Bitmap F(int i2, int i3, byte[] bArr) {
        BitmapFactory.Options options;
        if (i3 != -1) {
            options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, i2, options);
            options.inJustDecodeBounds = false;
            options.inSampleSize = 1;
            for (int max = Math.max(options.outWidth, options.outHeight); max > i3; max /= 2) {
                options.inSampleSize *= 2;
            }
        } else {
            options = null;
        }
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, i2, options);
        if (options != null) {
            options.inSampleSize = 1;
        }
        if (decodeByteArray == null) {
            throw s9e.a(new IllegalStateException(), "Could not decode image data");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            ef6 ef6Var = new ef6(byteArrayInputStream);
            byteArrayInputStream.close();
            int l2 = ef6Var.l();
            if (l2 == 0) {
                return decodeByteArray;
            }
            Matrix matrix = new Matrix();
            matrix.postRotate(l2);
            return Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, false);
        } finally {
        }
    }

    public static void I(int i2, int i3, und undVar) {
        for (int i4 = 0; i4 < 8; i4++) {
            int i5 = i2 + i4;
            if (!N(undVar.c(i5, i3))) {
                throw new iml();
            }
            undVar.e(i5, i3, 0);
        }
    }

    public static void J(int i2, int i3, und undVar) {
        for (int i4 = 0; i4 < 7; i4++) {
            int[] iArr = e[i4];
            for (int i5 = 0; i5 < 7; i5++) {
                undVar.e(i2 + i5, i3 + i4, iArr[i5]);
            }
        }
    }

    public static void K(int i2, int i3, und undVar) {
        for (int i4 = 0; i4 < 7; i4++) {
            int i5 = i3 + i4;
            if (!N(undVar.c(i2, i5))) {
                throw new iml();
            }
            undVar.e(i2, i5, 0);
        }
    }

    public static void L(Context context, long j2, TextView textView, TextView textView2) {
        context.getClass();
        textView.getClass();
        Pair v = pd0.v(j2, context);
        String str = (String) v.a;
        String str2 = (String) v.b;
        Pair x = pd0.x(j2);
        int intValue = ((Number) x.a).intValue();
        int intValue2 = ((Number) x.b).intValue();
        textView.setTextDirection(intValue);
        textView2.setTextDirection(intValue2);
        textView.setText(str);
        textView2.setText(str2);
    }

    public static boolean N(int i2) {
        return i2 == -1;
    }

    public static boolean O(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || PlayerKt.AMERICAN_FOOTBALL_TIGHT_END.equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    public static final eo7 P(FantasyUserLeague fantasyUserLeague, Integer num, Integer num2) {
        fantasyUserLeague.getClass();
        Integer rank = fantasyUserLeague.getRank();
        Integer previousRank = fantasyUserLeague.getPreviousRank();
        Integer totalScore = fantasyUserLeague.getTotalScore();
        String userId = fantasyUserLeague.getUserId();
        String userName = fantasyUserLeague.getUserName();
        String teamName = fantasyUserLeague.getTeamName();
        boolean z = num != null && fantasyUserLeague.getJoinedInRoundId() == num.intValue();
        boolean z2 = num2 != null && fantasyUserLeague.getJoinedInRoundId() == num2.intValue();
        long recalculatedAt = fantasyUserLeague.getRecalculatedAt();
        Integer roundId = fantasyUserLeague.getRoundId();
        return new eo7(rank, previousRank, totalScore, fantasyUserLeague.getCurrentScore(), userId, userName, fantasyUserLeague.getUserImageUrl(), teamName, z, z2, Long.valueOf(recalculatedAt), roundId, fantasyUserLeague.getWins(), fantasyUserLeague.getDraws(), fantasyUserLeague.getLosses(), fantasyUserLeague.getPoints(), fantasyUserLeague.getScoreAgainst());
    }

    public static fo7 Q(FantasyUserLeague fantasyUserLeague, String str) {
        fantasyUserLeague.getClass();
        FantasyLeague league = fantasyUserLeague.getLeague();
        j67 w = league != null ? iz8.w(league) : null;
        eo7 P = P(fantasyUserLeague, null, null);
        FantasyLeague league2 = fantasyUserLeague.getLeague();
        return new fo7(w, P, Intrinsics.c(str, league2 != null ? league2.getOwnerId() : null));
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00af A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void R(int i2, zci zciVar, tm3 tm3Var, bd2 bd2Var) {
        String e2;
        an2 an2Var = i2 == 0 ? (cf9) zciVar.e(1) : (qok) zciVar.e(2);
        dd2 s = bd2Var.s(1);
        if (s instanceof bd2) {
            bd2 bd2Var2 = (bd2) s;
            if (bd2Var2.e.size() < 1) {
                return;
            }
            for (int i3 = 0; i3 < bd2Var2.e.size(); i3++) {
                an2Var.q(bd2Var2.x(i3));
            }
            if (bd2Var.e.size() > 2) {
                dd2 s2 = bd2Var.s(2);
                if (s2 instanceof hd2) {
                    hd2 hd2Var = (hd2) s2;
                    Iterator it = hd2Var.B().iterator();
                    while (it.hasNext()) {
                        String str = (String) it.next();
                        str.getClass();
                        if (str.equals(TtmlNode.TAG_STYLE)) {
                            dd2 t = hd2Var.t(str);
                            if (t instanceof bd2) {
                                bd2 bd2Var3 = (bd2) t;
                                if (bd2Var3.e.size() > 1) {
                                    e2 = bd2Var3.x(0);
                                    an2Var.n0 = bd2Var3.getFloat(1);
                                    if (!e2.equals("packed")) {
                                        an2Var.t0 = xci.c;
                                    } else if (e2.equals("spread_inside")) {
                                        an2Var.t0 = xci.b;
                                    } else {
                                        an2Var.t0 = xci.a;
                                    }
                                }
                            }
                            e2 = t.e();
                            if (!e2.equals("packed")) {
                            }
                        } else {
                            S(hd2Var, an2Var, tm3Var, zciVar, str);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void S(hd2 hd2Var, fm3 fm3Var, tm3 tm3Var, zci zciVar, String str) {
        fm3 b2;
        char c2;
        boolean z;
        boolean z2;
        char c3;
        boolean z3;
        boolean z4 = zciVar.b;
        dd2 w = hd2Var.w(str);
        bd2 bd2Var = w instanceof bd2 ? (bd2) w : null;
        if (bd2Var == null || bd2Var.e.size() <= 1) {
            String z5 = hd2Var.z(str);
            if (z5 != null) {
                b2 = z5.equals("parent") ? zciVar.b(0) : zciVar.b(z5);
                str.getClass();
                switch (str) {
                    case "baseline":
                        zciVar.a(fm3Var.a);
                        zciVar.a(b2.a);
                        fm3Var.j0 = 15;
                        fm3Var.X = b2;
                        break;
                    case "bottom":
                        fm3Var.e(b2);
                        break;
                    case "end":
                        if (!z4) {
                            fm3Var.j0 = 1;
                            fm3Var.J = b2;
                            break;
                        } else {
                            fm3Var.j0 = 4;
                            fm3Var.M = b2;
                            break;
                        }
                    case "top":
                        fm3Var.p(b2);
                        break;
                    case "start":
                        if (!z4) {
                            fm3Var.j0 = 4;
                            fm3Var.M = b2;
                            break;
                        } else {
                            fm3Var.j0 = 1;
                            fm3Var.J = b2;
                            break;
                        }
                }
            }
            return;
        }
        String x = bd2Var.x(0);
        dd2 v = bd2Var.v(1);
        String e2 = v instanceof kd2 ? v.e() : null;
        int size = bd2Var.e.size();
        float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float i2 = size > 2 ? zciVar.a.i(tm3Var.a(bd2Var.v(2))) : 0.0f;
        float i3 = bd2Var.e.size() > 3 ? zciVar.a.i(tm3Var.a(bd2Var.v(3))) : 0.0f;
        fm3 b3 = x.equals("parent") ? zciVar.b(0) : zciVar.b(x);
        str.getClass();
        switch (str.hashCode()) {
            case -1720785339:
                if (str.equals("baseline")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -1498085729:
                if (str.equals("circular")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case -1383228885:
                if (str.equals("bottom")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 100571:
                if (str.equals(TtmlNode.END)) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 115029:
                if (str.equals(PlayerKt.E_SPORTS_TOP)) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 3317767:
                if (str.equals("left")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case 108511772:
                if (str.equals("right")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case 109757538:
                if (str.equals("start")) {
                    c2 = 7;
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
                e2.getClass();
                switch (e2) {
                    case "baseline":
                        zciVar.a(fm3Var.a);
                        zciVar.a(b3.a);
                        fm3Var.j0 = 15;
                        fm3Var.X = b3;
                        break;
                    case "bottom":
                        zciVar.a(fm3Var.a);
                        fm3Var.j0 = 17;
                        fm3Var.Z = b3;
                        break;
                    case "top":
                        zciVar.a(fm3Var.a);
                        fm3Var.j0 = 16;
                        fm3Var.Y = b3;
                        break;
                }
                z = false;
                z2 = true;
                break;
            case 1:
                float a = tm3Var.a(bd2Var.s(1));
                if (bd2Var.e.size() > 2) {
                    f2 = zciVar.a.i(tm3Var.a(bd2Var.v(2)));
                }
                fm3Var.a0 = fm3Var.j(b3);
                fm3Var.b0 = a;
                fm3Var.c0 = f2;
                fm3Var.j0 = 20;
                z = false;
                z2 = true;
                break;
            case 2:
                e2.getClass();
                switch (e2) {
                    case "baseline":
                        zciVar.a(b3.a);
                        fm3Var.j0 = 14;
                        fm3Var.W = b3;
                        break;
                    case "bottom":
                        fm3Var.e(b3);
                        break;
                    case "top":
                        fm3Var.j0 = 12;
                        fm3Var.U = b3;
                        break;
                }
                z = false;
                z2 = true;
                break;
            case 3:
                z2 = !z4;
                z = true;
                break;
            case 4:
                e2.getClass();
                switch (e2) {
                    case "baseline":
                        zciVar.a(b3.a);
                        fm3Var.j0 = 11;
                        fm3Var.T = b3;
                        break;
                    case "bottom":
                        fm3Var.j0 = 10;
                        fm3Var.S = b3;
                        break;
                    case "top":
                        fm3Var.p(b3);
                        break;
                }
                z = false;
                z2 = true;
                break;
            case 5:
                z = true;
                z2 = true;
                break;
            case 6:
                z = true;
                z2 = false;
                break;
            case 7:
                z2 = z4;
                z = true;
                break;
            default:
                z = false;
                z2 = true;
                break;
        }
        if (z) {
            e2.getClass();
            switch (e2.hashCode()) {
                case 100571:
                    if (e2.equals(TtmlNode.END)) {
                        c3 = 0;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 108511772:
                    if (e2.equals("right")) {
                        c3 = 1;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 109757538:
                    if (e2.equals("start")) {
                        c3 = 2;
                        break;
                    }
                    c3 = 65535;
                    break;
                default:
                    c3 = 65535;
                    break;
            }
            switch (c3) {
                case 0:
                    z3 = !z4;
                    break;
                case 1:
                    z3 = false;
                    break;
                case 2:
                    z3 = z4;
                    break;
                default:
                    z3 = true;
                    break;
            }
            if (z2) {
                if (z3) {
                    fm3Var.j0 = 1;
                    fm3Var.J = b3;
                } else {
                    fm3Var.j0 = 2;
                    fm3Var.K = b3;
                }
            } else if (z3) {
                fm3Var.j0 = 3;
                fm3Var.L = b3;
            } else {
                fm3Var.j0 = 4;
                fm3Var.M = b3;
            }
        }
        fm3Var.l(Float.valueOf(i2)).n(Float.valueOf(i3));
    }

    public static y25 T(hd2 hd2Var, String str, zci zciVar, imf imfVar) {
        dd2 t = hd2Var.t(str);
        y25 d2 = y25.d(0);
        if (t instanceof kd2) {
            return U(t.e());
        }
        if (t instanceof fd2) {
            return y25.d(zciVar.c(Float.valueOf(imfVar.i(hd2Var.u(str)))));
        }
        if (t instanceof hd2) {
            hd2 hd2Var2 = (hd2) t;
            String z = hd2Var2.z(U3.i.X);
            if (z != null) {
                d2 = U(z);
            }
            dd2 w = hd2Var2.w("min");
            if (w != null) {
                if (w instanceof fd2) {
                    int c2 = zciVar.c(Float.valueOf(imfVar.i(((fd2) w).m())));
                    if (c2 >= 0) {
                        d2.b = c2;
                    }
                } else if (w instanceof kd2) {
                    d2.b = -2;
                }
            }
            dd2 w2 = hd2Var2.w(InneractiveMediationNameConsts.MAX);
            if (w2 != null) {
                if (w2 instanceof fd2) {
                    int c3 = zciVar.c(Float.valueOf(imfVar.i(((fd2) w2).m())));
                    if (d2.c >= 0) {
                        d2.c = c3;
                        return d2;
                    }
                } else if ((w2 instanceof kd2) && d2.a) {
                    d2.g = y25.i;
                    d2.c = Integer.MAX_VALUE;
                }
            }
        }
        return d2;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static y25 U(String str) {
        y25 d2 = y25.d(0);
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1460244870:
                if (str.equals("preferWrap")) {
                    c2 = 0;
                    break;
                }
                break;
            case -995424086:
                if (str.equals("parent")) {
                    c2 = 1;
                    break;
                }
                break;
            case -895684237:
                if (str.equals("spread")) {
                    c2 = 2;
                    break;
                }
                break;
            case 3657802:
                if (str.equals("wrap")) {
                    c2 = 3;
                    break;
                }
                break;
        }
        String str2 = y25.i;
        String str3 = y25.j;
        switch (c2) {
            case 0:
                return y25.e(str2);
            case 1:
                return new y25(y25.k);
            case 2:
                return y25.e(str3);
            case 3:
                return new y25(str2);
            default:
                if (str.endsWith("%")) {
                    float parseFloat = Float.parseFloat(str.substring(0, str.indexOf(37))) / 100.0f;
                    y25 y25Var = new y25(y25.l);
                    y25Var.e = parseFloat;
                    y25Var.a = true;
                    y25Var.c = 0;
                    return y25Var;
                }
                if (!str.contains(":")) {
                    return d2;
                }
                y25 y25Var2 = new y25(y25.m);
                y25Var2.d = str;
                y25Var2.g = str3;
                y25Var2.a = true;
                return y25Var2;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void V(int i2, zci zciVar, String str, hd2 hd2Var) {
        char c2;
        char c3;
        ArrayList B = hd2Var.B();
        fm3 b2 = zciVar.b(str);
        if (i2 == 0) {
            zciVar.d(0, str);
        } else {
            zciVar.d(1, str);
        }
        boolean z = zciVar.b || i2 == 0;
        u49 u49Var = (u49) b2.c;
        Iterator it = B.iterator();
        boolean z2 = false;
        boolean z3 = true;
        float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        while (it.hasNext()) {
            String str2 = (String) it.next();
            str2.getClass();
            switch (str2.hashCode()) {
                case -678927291:
                    if (str2.equals("percent")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 100571:
                    if (str2.equals(TtmlNode.END)) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3317767:
                    if (str2.equals("left")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 108511772:
                    if (str2.equals("right")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 109757538:
                    if (str2.equals("start")) {
                        c2 = 4;
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
                    dd2 w = hd2Var.w(str2);
                    bd2 bd2Var = w instanceof bd2 ? (bd2) w : null;
                    if (bd2Var != null) {
                        if (bd2Var.e.size() > 1) {
                            String x = bd2Var.x(0);
                            float f3 = bd2Var.getFloat(1);
                            switch (x.hashCode()) {
                                case 100571:
                                    if (x.equals(TtmlNode.END)) {
                                        c3 = 0;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 3317767:
                                    if (x.equals("left")) {
                                        c3 = 1;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 108511772:
                                    if (x.equals("right")) {
                                        c3 = 2;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 109757538:
                                    if (x.equals("start")) {
                                        c3 = 3;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                default:
                                    c3 = 65535;
                                    break;
                            }
                            switch (c3) {
                                case 0:
                                    z3 = !z;
                                    break;
                                case 1:
                                    z3 = true;
                                    f2 = f3;
                                    z2 = true;
                                    continue;
                                case 2:
                                    z3 = false;
                                    break;
                                case 3:
                                    z3 = z;
                                    break;
                            }
                            f2 = f3;
                        }
                        z2 = true;
                        break;
                    } else {
                        f2 = hd2Var.u(str2);
                        z2 = true;
                        z3 = true;
                        break;
                    }
                    break;
                case 1:
                    f2 = zciVar.a.i(hd2Var.u(str2));
                    z3 = !z;
                    break;
                case 2:
                    f2 = zciVar.a.i(hd2Var.u(str2));
                    z3 = true;
                    break;
                case 3:
                    f2 = zciVar.a.i(hd2Var.u(str2));
                    z3 = false;
                    break;
                case 4:
                    f2 = zciVar.a.i(hd2Var.u(str2));
                    z3 = z;
                    break;
            }
        }
        if (z2) {
            if (z3) {
                u49Var.d = -1;
                u49Var.e = -1;
                u49Var.f = f2;
                return;
            } else {
                u49Var.d = -1;
                u49Var.e = -1;
                u49Var.f = 1.0f - f2;
                return;
            }
        }
        if (z3) {
            u49Var.d = u49Var.a.c(Float.valueOf(f2));
            u49Var.e = -1;
            u49Var.f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        } else {
            Float valueOf = Float.valueOf(f2);
            u49Var.d = -1;
            u49Var.e = u49Var.a.c(valueOf);
            u49Var.f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
    }

    public static void W(zci zciVar, tm3 tm3Var, String str, hd2 hd2Var) {
        fm3 b2 = zciVar.b(str);
        y25 y25Var = b2.d0;
        Iterator it = hd2Var.B().iterator();
        while (it.hasNext()) {
            y(hd2Var, b2, tm3Var, zciVar, (String) it.next());
        }
    }

    public static final wtc X(i1d i1dVar) {
        int i2;
        if (i1dVar == null || (i2 = i1dVar.c) == 0) {
            return null;
        }
        return (wtc) i1dVar.r(i2 - 1);
    }

    public static Uri Y(Uri uri) {
        if (!uri.isHierarchical() || uri.getQueryParameter("CMCD") == null) {
            return uri;
        }
        Uri.Builder buildUpon = uri.buildUpon();
        buildUpon.clearQuery();
        for (String str : uri.getQueryParameterNames()) {
            if (!str.equals("CMCD")) {
                Iterator<String> it = uri.getQueryParameters(str).iterator();
                while (it.hasNext()) {
                    buildUpon.appendQueryParameter(str, it.next());
                }
            }
        }
        return buildUpon.build();
    }

    public static final void Z(xv4 xv4Var) {
        tx txVar;
        wma c0 = c0(xv4Var);
        if (c0.t || (txVar = ((xy) zma.a(c0)).N) == null) {
            return;
        }
        txVar.d.b.G(c0.b, new sx(txVar, c0));
    }

    public static final wdd a0(xv4 xv4Var, int i2) {
        wdd wddVar = ((wtc) xv4Var).a.h;
        wddVar.getClass();
        if (wddVar.e1() != xv4Var || !xdd.g(i2)) {
            return wddVar;
        }
        wdd wddVar2 = wddVar.p;
        wddVar2.getClass();
        return wddVar2;
    }

    public static final wdd b0(xv4 xv4Var) {
        if (!((wtc) xv4Var).a.n) {
            r3a.b("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        wdd a0 = a0(xv4Var, 2);
        if (!a0.e1().n) {
            r3a.b("LayoutCoordinates is not attached.");
        }
        return a0;
    }

    public static final void c(wkc wkcVar, xtc xtcVar, Function1 function1, of3 of3Var, int i2) {
        wkcVar.getClass();
        function1.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(454577906);
        int i3 = (av8Var.g(wkcVar) ? 4 : 2) | i2 | (av8Var.i(function1) ? 256 : 128);
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            xtc q2 = n9e.q(wnn.A(bkh.d(xtcVar, 1.0f), o7g.a(16.0f)), lz.D(R.color.surface_1, av8Var), oyn.e);
            u23 a = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, q2);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a, hf3.g);
            waa.K(av8Var, m2, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            rha.b(oea.v(R.string.injuries_and_suspensions, av8Var), null, 0L, av8Var, 0, 6);
            if (wkcVar instanceof vkc) {
                av8Var.d0(-2046719034);
                for (skc skcVar : ((vkc) wkcVar).a) {
                    boolean g2 = ((i3 & 896) == 256) | av8Var.g(skcVar);
                    Object O = av8Var.O();
                    if (g2 || O == nf3.a) {
                        O = new h84(13, function1, skcVar);
                        av8Var.n0(O);
                    }
                    k(skcVar, (Function0) O, null, av8Var, 0);
                }
                av8Var.s(false);
            } else {
                if (!(wkcVar instanceof ukc)) {
                    throw dmi.h(av8Var, -1451498113, false);
                }
                av8Var.d0(-2046415203);
                Iterator<E> it = ((ukc) wkcVar).a.iterator();
                while (it.hasNext()) {
                    j((tkc) it.next(), function1, null, av8Var, (i3 >> 3) & 112);
                }
                av8Var.s(false);
            }
            w1l.s(utc.a, 8.0f, av8Var, true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new cyb(wkcVar, xtcVar, function1, i2, 23);
        }
    }

    public static final wma c0(xv4 xv4Var) {
        wdd wddVar = ((wtc) xv4Var).a.h;
        if (wddVar != null) {
            return wddVar.o;
        }
        throw wt3.j("Cannot obtain node coordinator. Is the Modifier.Node attached?");
    }

    public static final void d(s37 s37Var, Function1 function1, xtc xtcVar, of3 of3Var, int i2) {
        xtc xtcVar2;
        String str;
        utc utcVar;
        s37Var.getClass();
        j67 j67Var = s37Var.a;
        function1.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-275759512);
        int i3 = i2 | (av8Var.g(s37Var) ? 4 : 2) | (av8Var.i(function1) ? 32 : 16) | 384;
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            lv1 lv1Var = uxf.m;
            utc utcVar2 = utc.a;
            xtc d2 = bkh.d(utcVar2, 1.0f);
            boolean z = ((i3 & 14) == 4) | ((i3 & 112) == 32);
            Object O = av8Var.O();
            if (z || O == nf3.a) {
                O = new h84(20, function1, s37Var);
                av8Var.n0(O);
            }
            xtc b0 = l98.b0(tol.y(d2, false, false, false, 0L, null, (Function0) O, av8Var, 31), 16.0f);
            l8g a = k8g.a(ww9.b, lv1Var, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, b0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a, hf3.g);
            waa.K(av8Var, m2, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            boolean z2 = s37Var.b;
            if (j67Var.d()) {
                str = ljg.k(av8Var, 1896130303, R.string.fantasy_global_league, av8Var, false);
            } else {
                av8Var.d0(1896132880);
                av8Var.s(false);
                str = j67Var.b;
            }
            goa goaVar = new goa(1.0f, true);
            wg8 wg8Var = z2 ? wg8.j : wg8.g;
            yf8 yf8Var = xth.a;
            udj.c(str, goaVar, lz.D(R.color.n_lv_1, av8Var), null, 0L, wg8Var, 0L, null, new p7j(5), 0L, 2, false, 1, 0, null, xth.e(), av8Var, 0, 24960, 109496);
            av8Var = av8Var;
            if (z2) {
                utcVar = utcVar2;
                ljg.r(16.0f, -1349013259, av8Var, av8Var, utcVar);
                e12.a(0, av8Var, n9e.q(bkh.l(utcVar, 8.0f), lz.D(R.color.live, av8Var), o7g.a));
                av8Var.s(false);
            } else {
                utcVar = utcVar2;
                av8Var.d0(-1348797034);
                av8Var.s(false);
            }
            kq9.b(s6a.N(R.drawable.ic_chevron_right_large_16, 6, av8Var), null, ljg.i(utcVar, 16.0f, av8Var, utcVar, 16.0f), lz.D(R.color.primary_default, av8Var), av8Var, 432, 0);
            av8Var.s(true);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new cyb(s37Var, function1, xtcVar2, i2, 27);
        }
    }

    public static final ryd d0(xv4 xv4Var) {
        ryd rydVar = c0(xv4Var).n;
        if (rydVar != null) {
            return rydVar;
        }
        throw wt3.j("This node does not have an owner.");
    }

    public static final void e(int i2, of3 of3Var, xtc xtcVar, Function0 function0) {
        xtc xtcVar2;
        Function0 function02;
        function0.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(258597625);
        int i3 = (av8Var.i(function0) ? 32 : 16) | i2 | (av8Var.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        int i4 = 0;
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            qug o0 = hkg.o0(av8Var);
            xtcVar2 = xtcVar;
            function02 = function0;
            tz9.k(true, function02, xtcVar2, o0, null, oea.v(R.string.fantasy_lineup_view_expected_fantasy_points_title, av8Var), null, null, yqo.H(-1805021796, av8Var, new r97(o0, i4)), av8Var, (i3 & 112) | 100663302 | (i3 & 896), Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE);
        } else {
            xtcVar2 = xtcVar;
            function02 = function0;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new fm(function02, xtcVar2, i2, 4);
        }
    }

    public static final void f(int i2, of3 of3Var, xtc xtcVar, Function0 function0, boolean z) {
        av8 av8Var;
        function0.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(468160261);
        int i3 = i2 | (av8Var2.h(z) ? 4 : 2) | (av8Var2.i(function0) ? 32 : 16) | (av8Var2.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var2.T(i3 & 1, (i3 & 147) != 146)) {
            xtc c0 = l98.c0(n9e.q(bkh.d(xtcVar, 1.0f), lz.D(R.color.surface_1, av8Var2), oyn.e), 8.0f, 16.0f);
            u23 a = t23.a(ww9.d, uxf.o, av8Var2, 0);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m2 = av8Var2.m();
            xtc C = fqj.C(av8Var2, c0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a, hf3.g);
            waa.K(av8Var2, m2, hf3.f);
            waa.K(av8Var2, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var2, hf3.k);
            waa.K(av8Var2, C, hf3.d);
            av8Var = av8Var2;
            j72.h(null, Integer.valueOf(R.drawable.no_standings), Integer.valueOf(z ? R.string.fantasy_empty_leaderboard_title : R.string.fantasy_global_leaderboard_empty_title), Integer.valueOf(z ? R.string.fantasy_empty_leaderboard_text : R.string.fantasy_global_leaderboard_empty_text), false, null, 0, 0L, av8Var, 24576, Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE);
            if (z) {
                av8Var.d0(552311637);
                utc utcVar = utc.a;
                qx9.m(oea.v(R.string.fantasy_invite_players_button, av8Var), function0, vxd.f(utcVar, 16.0f, av8Var, utcVar, 1.0f), 0L, 0L, false, av8Var, (i3 & 112) | 384, 56);
                av8Var = av8Var;
                av8Var.s(false);
            } else {
                av8Var.d0(552574951);
                av8Var.s(false);
            }
            av8Var.s(true);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new s27(i2, 0, xtcVar, function0, z);
        }
    }

    public static final Bitmap.Config f0(int i2) {
        return i2 == 0 ? Bitmap.Config.ARGB_8888 : i2 == 1 ? Bitmap.Config.ALPHA_8 : i2 == 2 ? Bitmap.Config.RGB_565 : i2 == 3 ? Bitmap.Config.RGBA_F16 : i2 == 4 ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
    }

    public static final void g(final osa osaVar, final FantasyCompetitionType fantasyCompetitionType, final q67 q67Var, final w28 w28Var, final gv9 gv9Var, final Function1 function1, final Function1 function12, final boolean z, final boolean z2, final ho1 ho1Var, final Function1 function13, final Float f2, final Function1 function14, final rz6 rz6Var, final Function1 function15, final Function0 function0, final mei meiVar, final nei neiVar, final Function1 function16, final boolean z3, final xtc xtcVar, of3 of3Var, final int i2) {
        av8 av8Var;
        g28 g28Var;
        ksa ksaVar;
        osaVar.getClass();
        fantasyCompetitionType.getClass();
        gv9Var.getClass();
        function1.getClass();
        function12.getClass();
        function13.getClass();
        function14.getClass();
        function15.getClass();
        function0.getClass();
        meiVar.getClass();
        neiVar.getClass();
        function16.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1322102516);
        int i3 = i2 | (av8Var2.i(osaVar) ? 4 : 2) | (av8Var2.e(fantasyCompetitionType.ordinal()) ? 32 : 16) | (av8Var2.g(q67Var) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var2.g(w28Var) ? a.o : 1024) | (av8Var2.g(gv9Var) ? 16384 : 8192) | (av8Var2.i(function1) ? 131072 : 65536) | (av8Var2.i(function12) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (av8Var2.h(z) ? 8388608 : 4194304) | (av8Var2.h(z2) ? 67108864 : 33554432) | (av8Var2.g(ho1Var) ? 536870912 : 268435456);
        int i4 = (av8Var2.i(function13) ? (char) 4 : (char) 2) | (av8Var2.g(f2) ? ' ' : (char) 16) | (av8Var2.i(function14) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var2.e(rz6Var == null ? -1 : rz6Var.ordinal()) ? (char) 2048 : (char) 1024) | (av8Var2.i(function15) ? (char) 16384 : (char) 8192) | (av8Var2.i(function0) ? (char) 0 : (char) 0) | (av8Var2.e(meiVar.ordinal()) ? (char) 0 : (char) 0) | (av8Var2.e(neiVar.ordinal()) ? (char) 0 : (char) 0) | (av8Var2.i(function16) ? (char) 0 : (char) 0) | (av8Var2.h(z3) ? (char) 0 : (char) 0);
        if (av8Var2.T(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 306783379) == 306783378 && ((av8Var2.g(xtcVar) ? (char) 4 : (char) 2) & 3) == 2) ? false : true)) {
            ksa a = msa.a(0, 0, av8Var2, 0, 3);
            Object O = av8Var2.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = goh.b(new bk7(a, q67Var != null ? 1 : 0, 0));
                av8Var2.n0(O);
            }
            cdi cdiVar = (cdi) O;
            qug o0 = hkg.o0(av8Var2);
            boolean g2 = av8Var2.g(a);
            Object O2 = av8Var2.O();
            if (g2 || O2 == a99Var) {
                O2 = new ck1(6, null, a);
                av8Var2.n0(O2);
            }
            int i5 = i4 & 112;
            hz8.p(ho1Var, f2, rz6Var, (Function2) O2, av8Var2);
            g28 g28Var2 = bkh.c;
            xtc q2 = n9e.q(xtcVar.z(g28Var2), lz.D(R.color.surface_0, av8Var2), oyn.e);
            k1c c2 = e12.c(uxf.c, false);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m2 = av8Var2.m();
            xtc C = fqj.C(av8Var2, q2);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, c2, hf3.g);
            waa.K(av8Var2, m2, hf3.f);
            waa.K(av8Var2, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var2, hf3.k);
            waa.K(av8Var2, C, hf3.d);
            t3e C2 = l98.C(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 48.0f, 7);
            boolean g3 = ((i3 & 896) == 256) | ((i3 & 112) == 32) | ((i4 & 3670016) == 1048576) | ((i4 & 1879048192) == 536870912) | ((i3 & 3670016) == 1048576) | av8Var2.g(o0) | ((i3 & 7168) == 2048) | ((i3 & 29360128) == 8388608) | ((i3 & 234881024) == 67108864) | ((i3 & 1879048192) == 536870912) | ((i4 & 14) == 4) | (i5 == 32) | ((i4 & 896) == 256) | ((i4 & 7168) == 2048) | ((i4 & 57344) == 16384) | ((i4 & 458752) == 131072) | ((i3 & 14) == 4 || av8Var2.i(osaVar)) | ((i4 & 234881024) == 67108864) | ((i4 & 29360128) == 8388608) | ((i3 & 57344) == 16384) | ((i3 & 458752) == 131072);
            Object O3 = av8Var2.O();
            if (g3 || O3 == a99Var) {
                g28Var = g28Var2;
                ksaVar = a;
                ke7 ke7Var = new ke7(q67Var, osaVar, fantasyCompetitionType, meiVar, z3, function12, o0, w28Var, z, z2, ho1Var, function13, f2, function14, rz6Var, function15, function0, cdiVar, function16, neiVar, gv9Var, function1);
                av8Var = av8Var2;
                av8Var.n0(ke7Var);
                O3 = ke7Var;
            } else {
                g28Var = g28Var2;
                av8Var = av8Var2;
                ksaVar = a;
            }
            g28 g28Var3 = g28Var;
            v8a.a(g28Var3, ksaVar, C2, null, null, null, false, null, (Function1) O3, av8Var, 390, PglCryptUtils.BASE64_FAILED);
            s6a.a(Intrinsics.c(osaVar.d().a, ofb.b), g28Var3, av8Var, 48);
            av8Var.s(true);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new Function2(fantasyCompetitionType, q67Var, w28Var, gv9Var, function1, function12, z, z2, ho1Var, function13, f2, function14, rz6Var, function15, function0, meiVar, neiVar, function16, z3, xtcVar, i2) { // from class: ck7
                public final /* synthetic */ FantasyCompetitionType b;
                public final /* synthetic */ q67 c;
                public final /* synthetic */ w28 d;
                public final /* synthetic */ gv9 e;
                public final /* synthetic */ Function1 f;
                public final /* synthetic */ Function1 g;
                public final /* synthetic */ boolean h;
                public final /* synthetic */ boolean i;
                public final /* synthetic */ ho1 j;
                public final /* synthetic */ Function1 k;
                public final /* synthetic */ Float l;
                public final /* synthetic */ Function1 m;
                public final /* synthetic */ rz6 n;
                public final /* synthetic */ Function1 o;
                public final /* synthetic */ Function0 p;
                public final /* synthetic */ mei q;
                public final /* synthetic */ nei r;
                public final /* synthetic */ Function1 s;
                public final /* synthetic */ boolean t;
                public final /* synthetic */ xtc u;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int K = aba.K(9);
                    c6o.g(osa.this, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, (of3) obj, K);
                    return Unit.a;
                }
            };
        }
    }

    public static Object g0(y5o y5oVar, Number number) {
        try {
            return y5oVar.zza();
        } catch (Exception e2) {
            "Fail to get the runtime flags: ".concat(e2.toString());
            int i2 = zzc.a;
            return number;
        }
    }

    public static b18 h(uae uaeVar, s18 s18Var, String str, rof rofVar, int i2) {
        if ((i2 & 4) != 0) {
            str = null;
        }
        if ((i2 & 8) != 0) {
            rofVar = null;
        }
        return new b18(uaeVar, s18Var, str, rofVar);
    }

    public static hwh i(l62 l62Var, s18 s18Var) {
        return new hwh(l62Var, s18Var, null);
    }

    public static final void j(tkc tkcVar, Function1 function1, xtc xtcVar, of3 of3Var, int i2) {
        int i3;
        xtc xtcVar2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1482711308);
        if ((i2 & 6) == 0) {
            i3 = i2 | (av8Var.g(tkcVar) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.i(function1) ? 32 : 16;
        }
        int i4 = i3 | 384;
        if (av8Var.T(i4 & 1, (i4 & 147) != 146)) {
            utc utcVar = utc.a;
            xtc Y = fz8.Y(bkh.b(bkh.d(utcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 56.0f, 1), n9a.a);
            l8g a = k8g.a(ww9.b, uxf.l, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, Y);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a, hf3.g);
            waa.K(av8Var, m2, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            skc skcVar = tkcVar.a;
            if (1.0f <= 0.0d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            int i5 = ((i4 << 3) & 896) | 48;
            l(skcVar, true, function1, bkh.c(new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 1.0f), av8Var, i5);
            skc skcVar2 = tkcVar.b;
            if (1.0f <= 0.0d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            l(skcVar2, false, function1, bkh.c(new goa(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true), 1.0f), av8Var, i5);
            av8Var.s(true);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new b30(tkcVar, function1, xtcVar2, i2, 18);
        }
    }

    public static final void k(skc skcVar, Function0 function0, xtc xtcVar, of3 of3Var, int i2) {
        xtc xtcVar2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1147451732);
        int i3 = i2 | (av8Var.g(skcVar) ? 4 : 2) | (av8Var.i(function0) ? 32 : 16) | 384;
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            utc utcVar = utc.a;
            xtc b2 = bkh.b(bkh.d(utcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 56.0f, 1);
            long D = lz.D(R.color.n_lv_4, av8Var);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = mz1.e(av8Var);
            }
            wzc wzcVar = (wzc) O;
            Object[] objArr = new Object[0];
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                O2 = b74.h;
                av8Var.n0(O2);
            }
            xtc c0 = l98.c0(tol.y(b2, true, true, true, D, wzcVar, new gm(function0, (boh) o3a.N(objArr, (Function0) O2, av8Var, 48), 13), av8Var, 0), 16.0f, 8.0f);
            l8g a = k8g.a(new ng0(16.0f, true, new a70(6)), uxf.m, av8Var, 54);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, c0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a, hf3.g);
            waa.K(av8Var, m2, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            td4.C(skcVar.a, bkh.l(utcVar, 40.0f), 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 48, 12);
            q(skcVar, uxf.o, new goa(1.0f, true), av8Var, (i3 & 14) | 48);
            av8Var.s(true);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new cyb(skcVar, function0, xtcVar2, i2, 24);
        }
    }

    public static final void l(final skc skcVar, final boolean z, final Function1 function1, final xtc xtcVar, of3 of3Var, final int i2) {
        int i3;
        skc skcVar2;
        Function1 function12;
        av8 av8Var;
        eqf u;
        Function2 function2;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(725884177);
        if ((i2 & 6) == 0) {
            i3 = (av8Var2.g(skcVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var2.h(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var2.i(function1) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= av8Var2.g(xtcVar) ? a.o : 1024;
        }
        int i4 = i3;
        if (!av8Var2.T(i4 & 1, (i4 & 1171) != 1170)) {
            skcVar2 = skcVar;
            function12 = function1;
            av8Var = av8Var2;
            av8Var.W();
        } else {
            if (skcVar == null) {
                av8Var2.d0(-344654950);
                e12.a((i4 >> 9) & 14, av8Var2, xtcVar);
                av8Var2.s(false);
                u = av8Var2.u();
                if (u != null) {
                    final int i5 = 0;
                    function2 = new Function2() { // from class: eu5
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i5) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    c6o.l(skcVar, z, function1, xtcVar, (of3) obj, aba.K(i2 | 1));
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    c6o.l(skcVar, z, function1, xtcVar, (of3) obj, aba.K(i2 | 1));
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    u.d = function2;
                }
                return;
            }
            skcVar2 = skcVar;
            function12 = function1;
            av8Var2.d0(-344602095);
            av8Var2.s(false);
            float f2 = z ? 16.0f : 8.0f;
            float f3 = z ? 8.0f : 16.0f;
            long D = lz.D(R.color.n_lv_4, av8Var2);
            Object O = av8Var2.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = mz1.e(av8Var2);
            }
            wzc wzcVar = (wzc) O;
            Object[] objArr = new Object[0];
            Object O2 = av8Var2.O();
            if (O2 == a99Var) {
                O2 = b74.i;
                av8Var2.n0(O2);
            }
            av8Var = av8Var2;
            xtc e0 = l98.e0(tol.y(xtcVar, true, true, true, D, wzcVar, new gi(6, (boh) o3a.N(objArr, (Function0) O2, av8Var2, 48), function12, skcVar2), av8Var2, 0), f2, 8.0f, f3, 8.0f);
            l8g a = k8g.a(new ng0(16.0f, true, new a70(6)), uxf.m, av8Var, 54);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, e0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a, hf3.g);
            waa.K(av8Var, m2, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            utc utcVar = utc.a;
            if (z) {
                av8Var.d0(551722544);
                td4.C(skcVar2.a, bkh.l(utcVar, 40.0f), 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 48, 12);
                kv1 kv1Var = uxf.o;
                if (1.0f <= 0.0d) {
                    p3a.a("invalid weight; must be greater than zero");
                }
                q(skcVar2, kv1Var, new goa(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true), av8Var, (i4 & 14) | 48);
                av8Var.s(false);
            } else {
                av8Var.d0(552050834);
                kv1 kv1Var2 = uxf.q;
                if (1.0f <= 0.0d) {
                    p3a.a("invalid weight; must be greater than zero");
                }
                q(skcVar2, kv1Var2, new goa(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true), av8Var, (i4 & 14) | 48);
                td4.C(skcVar2.a, bkh.l(utcVar, 40.0f), 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 48, 12);
                av8Var.s(false);
            }
            av8Var.s(true);
        }
        u = av8Var.u();
        if (u != null) {
            final int i6 = 1;
            final skc skcVar3 = skcVar2;
            final Function1 function13 = function12;
            function2 = new Function2() { // from class: eu5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    switch (i6) {
                        case 0:
                            ((Integer) obj2).getClass();
                            c6o.l(skcVar3, z, function13, xtcVar, (of3) obj, aba.K(i2 | 1));
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            c6o.l(skcVar3, z, function13, xtcVar, (of3) obj, aba.K(i2 | 1));
                            break;
                    }
                    return Unit.a;
                }
            };
            u.d = function2;
        }
    }

    public static final void m(PlayerOrTeam playerOrTeam, float f2, of3 of3Var, int i2) {
        int i3;
        Country country;
        Team team;
        mv1 mv1Var = uxf.k;
        mv1 mv1Var2 = uxf.g;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1027932333);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.i(playerOrTeam) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.d(f2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var.d(16.0f) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            Player player = playerOrTeam.getPlayer();
            utc utcVar = utc.a;
            n12 n12Var = n12.a;
            if (player != null) {
                av8Var.d0(-15171212);
                k1c c2 = e12.c(mv1Var2, false);
                int hashCode = Long.hashCode(av8Var.T);
                aee m2 = av8Var.m();
                xtc C = fqj.C(av8Var, utcVar);
                if3.k7.getClass();
                zg3 zg3Var = hf3.b;
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, c2, hf3.g);
                waa.K(av8Var, m2, hf3.f);
                waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
                waa.J(av8Var, hf3.k);
                waa.K(av8Var, C, hf3.d);
                Player player2 = playerOrTeam.getPlayer();
                td4.C(player2 != null ? player2.getId() : 0, bkh.l(utcVar, f2), 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 0, 12);
                Player player3 = playerOrTeam.getPlayer();
                td4.G((player3 == null || (team = player3.getTeam()) == null) ? 0 : team.getId(), n12Var.a(bkh.l(utcVar, 16.0f), mv1Var), false, 0L, av8Var, 0, 12);
                av8Var.s(true);
                av8Var.s(false);
            } else {
                av8Var.d0(-14725742);
                k1c c3 = e12.c(mv1Var2, false);
                int hashCode2 = Long.hashCode(av8Var.T);
                aee m3 = av8Var.m();
                xtc C2 = fqj.C(av8Var, utcVar);
                if3.k7.getClass();
                zg3 zg3Var2 = hf3.b;
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var2);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, c3, hf3.g);
                waa.K(av8Var, m3, hf3.f);
                waa.K(av8Var, Integer.valueOf(hashCode2), hf3.j);
                waa.J(av8Var, hf3.k);
                waa.K(av8Var, C2, hf3.d);
                Team team2 = playerOrTeam.getTeam();
                td4.G(team2 != null ? team2.getId() : 0, bkh.l(utcVar, f2), false, 0L, av8Var, 0, 12);
                Team team3 = playerOrTeam.getTeam();
                td4.k((team3 == null || (country = team3.getCountry()) == null) ? null : country.getAlpha2(), n12Var.a(bkh.l(utcVar, 16.0f), mv1Var), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, av8Var, 0, 12);
                av8Var = av8Var;
                av8Var.s(true);
                av8Var.s(false);
            }
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new jn1(playerOrTeam, f2, i2);
        }
    }

    public static final void n(final w28 w28Var, final boolean z, final boolean z2, ho1 ho1Var, final Function1 function1, final Float f2, final Function1 function12, rz6 rz6Var, final Function1 function13, final boolean z3, final Function0 function0, final boolean z4, final xtc xtcVar, of3 of3Var, final int i2) {
        av8 av8Var;
        ho1 ho1Var2;
        rz6 rz6Var2;
        Iterable iterable;
        Iterable iterable2;
        Iterable iterable3;
        Object obj;
        oxh oxhVar;
        Object obj2;
        boolean z5;
        String H;
        Object obj3;
        String str;
        function1.getClass();
        function12.getClass();
        function13.getClass();
        function0.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(593401743);
        int i3 = (av8Var2.g(w28Var) ? 4 : 2) | i2;
        if ((i2 & 48) == 0) {
            i3 |= av8Var2.h(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var2.h(z2) ? 256 : 128;
        }
        int i4 = i3 | (av8Var2.g(ho1Var) ? a.o : 1024) | (av8Var2.i(function1) ? 16384 : 8192) | (av8Var2.g(f2) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE) | (av8Var2.i(function12) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (av8Var2.e(rz6Var == null ? -1 : rz6Var.ordinal()) ? 8388608 : 4194304) | (av8Var2.i(function13) ? 67108864 : 33554432) | (av8Var2.h(z3) ? 536870912 : 268435456);
        int i5 = (av8Var2.i(function0) ? 4 : 2) | (av8Var2.h(z4) ? 32 : 16) | (av8Var2.g(xtcVar) ? 256 : 128);
        if (av8Var2.T(i4 & 1, ((i4 & 306783379) == 306783378 && (i5 & 147) == 146) ? false : true)) {
            Context context = (Context) av8Var2.k(nz.b);
            List c2 = kotlin.collections.a.c(null);
            if (w28Var == null || (iterable = w28Var.a) == null) {
                iterable = km5.a;
            }
            ArrayList w0 = CollectionsKt.w0(iterable, c2);
            List c3 = kotlin.collections.a.c(null);
            if (w28Var == null || (iterable2 = w28Var.c) == null) {
                iterable2 = km5.a;
            }
            ArrayList w02 = CollectionsKt.w0(iterable2, c3);
            List c4 = kotlin.collections.a.c(null);
            if (w28Var == null || (iterable3 = w28Var.b) == null) {
                iterable3 = km5.a;
            }
            ArrayList w03 = CollectionsKt.w0(iterable3, c4);
            cdi b2 = a60.b(z3 ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : 1.0f, null, null, av8Var2, 0, 30);
            qug o0 = hkg.o0(av8Var2);
            boolean z6 = (ho1Var == null && f2 == null && (rz6Var == null || !z)) ? false : true;
            Object O = av8Var2.O();
            int i6 = 6;
            if (O == nf3.a) {
                O = goh.b(new fu5(o0, i6));
                av8Var = av8Var2;
                av8Var.n0(O);
            } else {
                av8Var = av8Var2;
            }
            cdi cdiVar = (cdi) O;
            kg0 kg0Var = ww9.h;
            xtc q2 = n9e.q(d2a.E(fz8.Y(bkh.d(l98.b0(xtcVar, ((Number) b2.getValue()).floatValue() * 8.0f), 1.0f), n9a.b), 8.0f, o7g.a(((Number) b2.getValue()).floatValue() * 16.0f), false, 0L, 28), lz.D(R.color.surface_1, av8Var), o7g.a(((Number) b2.getValue()).floatValue() * 16.0f));
            l8g a = k8g.a(kg0Var, uxf.l, av8Var, 6);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, q2);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var, a, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m2, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            lv1 lv1Var = uxf.m;
            boolean z7 = z6;
            p8g p8gVar = p8g.a;
            utc utcVar = utc.a;
            xtc d0 = l98.d0(hkg.Z(p8gVar.a(1.0f, utcVar, true), o0, false, 14), 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            l8g a2 = k8g.a(ww9.b, lv1Var, av8Var, 48);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C2 = fqj.C(av8Var, d0);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            av8Var.d0(925368746);
            ArrayList arrayList = new ArrayList(k13.r(w0, 10));
            Iterator it = w0.iterator();
            while (it.hasNext()) {
                ho1 ho1Var3 = (ho1) it.next();
                String str2 = ho1Var3 != null ? ho1Var3.b : null;
                if (str2 == null) {
                    str2 = ljg.k(av8Var, -708770648, R.string.all_teams, av8Var, false);
                } else {
                    av8Var.d0(-708771082);
                    av8Var.s(false);
                }
                arrayList.add(new oxh(ho1Var3, str2, yqo.H(1107225481, av8Var, new pu5(ho1Var3, z4)), null, null, false, 248));
            }
            av8Var.s(false);
            gv9 W = l6g.W(arrayList);
            Iterator<E> it2 = W.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    ho1Var2 = ho1Var;
                    obj = null;
                    break;
                } else {
                    obj = it2.next();
                    ho1Var2 = ho1Var;
                    if (Intrinsics.c(((oxh) obj).a, ho1Var2)) {
                        break;
                    }
                }
            }
            oxh oxhVar2 = (oxh) obj;
            if (oxhVar2 != null) {
                String str3 = oxhVar2.b;
                if (ho1Var2 != null && !z4) {
                    str3 = null;
                }
                ct8 ct8Var = oxhVar2.c;
                if (ho1Var2 == null) {
                    ct8Var = null;
                }
                oxhVar = oxh.a(oxhVar2, str3, ct8Var, null, 249);
            } else {
                oxhVar = null;
            }
            r4a.j(W, oxhVar, function1, p8gVar.a(1.0f, utcVar, false), null, false, null, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, (i4 >> 6) & 896, 1008);
            if (z2) {
                av8Var.d0(-1377220193);
                av8Var.d0(925405850);
                ArrayList arrayList2 = new ArrayList(k13.r(w03, 10));
                Iterator it3 = w03.iterator();
                while (it3.hasNext()) {
                    Float f3 = (Float) it3.next();
                    if (f3 != null) {
                        float floatValue = f3.floatValue();
                        context.getClass();
                        Locale d2 = dla.d();
                        Set set = o84.a;
                        str = String.format(d2, "%s%.1fM", Arrays.copyOf(new Object[]{o84.e(context), Float.valueOf(floatValue)}, 2));
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        str = ljg.k(av8Var, 1419319141, R.string.fantasy_max_price_player, av8Var, false);
                    } else {
                        av8Var.d0(1419317188);
                        av8Var.s(false);
                    }
                    arrayList2.add(new oxh(f3, str, null, null, null, false, 252));
                }
                av8Var.s(false);
                gv9 W2 = l6g.W(arrayList2);
                Iterator<E> it4 = W2.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        obj3 = null;
                        break;
                    }
                    obj3 = it4.next();
                    Float f4 = (Float) ((oxh) obj3).a;
                    if (f4 != null) {
                        if (f2 != null && f4.floatValue() == f2.floatValue()) {
                            break;
                        }
                    } else if (f2 == null) {
                        break;
                    }
                }
                r4a.j(W2, (oxh) obj3, function12, p8gVar.a(1.0f, utcVar, false), null, false, null, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, (i4 >> 12) & 896, 1008);
                av8Var.s(false);
            } else {
                av8Var.d0(-1376608997);
                av8Var.s(false);
            }
            if (z) {
                av8Var.d0(-1376546315);
                av8Var.d0(925427762);
                ArrayList arrayList3 = new ArrayList(k13.r(w02, 10));
                Iterator it5 = w02.iterator();
                while (it5.hasNext()) {
                    rz6 rz6Var3 = (rz6) it5.next();
                    Integer valueOf2 = rz6Var3 != null ? Integer.valueOf(rz6Var3.c) : null;
                    if (valueOf2 == null) {
                        av8Var.d0(957853888);
                        z5 = false;
                        av8Var.s(false);
                        H = null;
                    } else {
                        z5 = false;
                        av8Var.d0(957853889);
                        H = s02.H(valueOf2.intValue(), null, null, av8Var, 4);
                        av8Var.s(false);
                    }
                    if (H == null) {
                        H = ljg.k(av8Var, 585091923, R.string.all_positions, av8Var, z5);
                    } else {
                        av8Var.d0(585087242);
                        av8Var.s(z5);
                    }
                    arrayList3.add(new oxh(rz6Var3, H, null, null, null, false, 252));
                }
                av8Var.s(false);
                gv9 W3 = l6g.W(arrayList3);
                Iterator<E> it6 = W3.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        rz6Var2 = rz6Var;
                        obj2 = null;
                        break;
                    } else {
                        obj2 = it6.next();
                        rz6Var2 = rz6Var;
                        if (((oxh) obj2).a == rz6Var2) {
                            break;
                        }
                    }
                }
                r4a.j(W3, (oxh) obj2, function13, p8gVar.a(1.0f, utcVar, false), null, false, null, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, (i4 >> 18) & 896, 1008);
                av8Var.s(false);
            } else {
                rz6Var2 = rz6Var;
                av8Var.d0(-1375833253);
                av8Var.s(false);
            }
            av8Var.s(true);
            mv1 mv1Var = uxf.g;
            xtc p2 = bkh.p(bkh.c(utcVar, 1.0f), 48.0f);
            if (((Boolean) cdiVar.getValue()).booleanValue()) {
                p2 = p2.z(d2a.E(utcVar, 4.0f, null, false, 0L, 30));
            }
            xtc q3 = n9e.q(p2, lz.D(R.color.surface_1, av8Var), oyn.e);
            k1c c5 = e12.c(mv1Var, false);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m4 = av8Var.m();
            xtc C3 = fqj.C(av8Var, q3);
            if3.k7.getClass();
            zg3 zg3Var2 = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var2);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c5, hf3.g);
            waa.K(av8Var, m4, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode3), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C3, hf3.d);
            ao2.g(function0, null, z7, null, null, yqo.H(-325945209, av8Var, new zj7(z7, 0)), av8Var, (i5 & 14) | 1572864, 58);
            av8Var.s(true);
            av8Var.s(true);
        } else {
            av8Var = av8Var2;
            ho1Var2 = ho1Var;
            rz6Var2 = rz6Var;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            final rz6 rz6Var4 = rz6Var2;
            final ho1 ho1Var4 = ho1Var2;
            u.d = new Function2() { // from class: ak7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj4, Object obj5) {
                    ((Integer) obj5).getClass();
                    int K = aba.K(i2 | 1);
                    c6o.n(w28.this, z, z2, ho1Var4, function1, f2, function12, rz6Var4, function13, z3, function0, z4, xtcVar, (of3) obj4, K);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0261, code lost:
    
        if (r0 != null) goto L59;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void o(int i2, PlayerOrTeam playerOrTeam, xtc xtcVar, of3 of3Var, int i3, int i4) {
        xtc xtcVar2;
        int i5;
        xtc xtcVar3;
        Team team;
        String p2;
        String str;
        FieldTranslations fieldTranslations;
        Player player;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(561616249);
        int i6 = i3 | (av8Var.e(i2) ? 4 : 2) | (av8Var.i(playerOrTeam) ? 32 : 16);
        int i7 = i4 & 4;
        if (i7 != 0) {
            i5 = i6 | 384;
            xtcVar2 = xtcVar;
        } else {
            xtcVar2 = xtcVar;
            i5 = i6 | (av8Var.g(xtcVar2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        }
        if (av8Var.T(i5 & 1, (i5 & 147) != 146)) {
            utc utcVar = utc.a;
            xtc xtcVar4 = i7 != 0 ? utcVar : xtcVar2;
            Context context = (Context) av8Var.k(nz.b);
            p4h p4hVar = ww9.d;
            kv1 kv1Var = uxf.p;
            xtc f0 = l98.f0(bkh.d(xtcVar4, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            long D = lz.D(R.color.on_color_highlight_2, av8Var);
            f0.getClass();
            xtc X = td4.X(f0, new yz(D, 23));
            u23 a = t23.a(p4hVar, kv1Var, av8Var, 54);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, X);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var, a, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m2, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            xtc f02 = l98.f0(bkh.d(utcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            lv1 lv1Var = uxf.m;
            int i8 = i5;
            wxf wxfVar = ww9.b;
            l8g a2 = k8g.a(wxfVar, lv1Var, av8Var, 54);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C2 = fqj.C(av8Var, f02);
            av8Var.h0();
            xtc xtcVar5 = xtcVar4;
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            nq8.h(av8Var, bkh.p(utcVar, 16.0f));
            m(playerOrTeam, 40.0f, av8Var, ((i8 >> 3) & 14) | 432);
            nq8.h(av8Var, new goa(1.0f, true));
            String str2 = null;
            if (playerOrTeam.getPlayer() == null ? (team = playerOrTeam.getTeam()) != null : !((player = playerOrTeam.getPlayer()) == null || (team = player.getTeam()) == null)) {
                str2 = team.getSportSlug();
            }
            kq9.b(s6a.N(wyh.a(str2), 6, av8Var), null, bkh.l(utcVar, 34.0f), lz.D(R.color.on_color_highlight_1, av8Var), av8Var, 432, 0);
            bf3.u(utcVar, 12.0f, av8Var, true);
            xtc f03 = l98.f0(bkh.d(utcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            l8g a3 = k8g.a(wxfVar, lv1Var, av8Var, 54);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m4 = av8Var.m();
            xtc C3 = fqj.C(av8Var, f03);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, f50Var);
            waa.K(av8Var, m4, ff3Var);
            bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C3, f50Var3);
            nq8.h(av8Var, bkh.p(utcVar, 8.0f));
            String valueOf2 = String.valueOf(i2 + 1);
            yf8 yf8Var = xth.a;
            udj.c(valueOf2, null, lz.D(R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.j(), av8Var, 0, 0, 131066);
            nq8.h(av8Var, bkh.p(utcVar, 8.0f));
            String str3 = "";
            if (playerOrTeam.getPlayer() != null) {
                Player player2 = playerOrTeam.getPlayer();
                if (player2 == null || (fieldTranslations = player2.getFieldTranslations()) == null || (p2 = tba.r(fieldTranslations)) == null) {
                    Player player3 = playerOrTeam.getPlayer();
                    if (player3 != null) {
                        str3 = player3.getName();
                    }
                    str = str3;
                }
                str = p2;
            } else {
                Team team2 = playerOrTeam.getTeam();
                if (team2 != null) {
                    p2 = tba.p(context, team2);
                }
                str = str3;
            }
            udj.c(str, null, lz.D(R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.j(), av8Var, 0, 24960, 110586);
            av8Var = av8Var;
            av8Var.s(true);
            av8Var.s(true);
            xtcVar3 = xtcVar5;
        } else {
            av8Var.W();
            xtcVar3 = xtcVar2;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new wx1(i2, playerOrTeam, xtcVar3, i3, i4, 10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x01a0, code lost:
    
        if (r1 != null) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void p(int i2, PlayerOrTeam playerOrTeam, boolean z, xtc xtcVar, of3 of3Var, int i3, int i4) {
        xtc xtcVar2;
        int i5;
        xtc xtcVar3;
        String p2;
        String str;
        Team team;
        Player player;
        FieldTranslations fieldTranslations;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1878354313);
        int i6 = i3 | (av8Var.e(i2) ? 4 : 2) | (av8Var.i(playerOrTeam) ? 32 : 16) | (av8Var.h(z) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        int i7 = i4 & 8;
        if (i7 != 0) {
            i5 = i6 | 3072;
            xtcVar2 = xtcVar;
        } else {
            xtcVar2 = xtcVar;
            i5 = i6 | (av8Var.g(xtcVar2) ? a.o : 1024);
        }
        if (av8Var.T(i5 & 1, (i5 & 1171) != 1170)) {
            utc utcVar = utc.a;
            xtc xtcVar4 = i7 != 0 ? utcVar : xtcVar2;
            Context context = (Context) av8Var.k(nz.b);
            xtc d2 = bkh.d(xtcVar4, 1.0f);
            u23 a = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, d2);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var, a, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m2, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            lv1 lv1Var = uxf.m;
            int i8 = i5;
            wxf wxfVar = ww9.b;
            xtc c0 = l98.c0(bkh.d(utcVar, 1.0f), 8.0f, 16.0f);
            l8g a2 = k8g.a(wxfVar, lv1Var, av8Var, 54);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C2 = fqj.C(av8Var, c0);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            String valueOf2 = String.valueOf(i2 + 1);
            yf8 yf8Var = xth.a;
            xtc xtcVar5 = xtcVar4;
            udj.c(valueOf2, null, lz.D(R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.l(), av8Var, 0, 0, 131066);
            nq8.h(av8Var, bkh.p(utcVar, 8.0f));
            m(playerOrTeam, 32.0f, av8Var, ((i8 >> 3) & 14) | 432);
            nq8.h(av8Var, bkh.p(utcVar, 8.0f));
            String str2 = "";
            if (playerOrTeam.getPlayer() != null) {
                Player player2 = playerOrTeam.getPlayer();
                if (player2 == null || (fieldTranslations = player2.getFieldTranslations()) == null || (p2 = tba.r(fieldTranslations)) == null) {
                    Player player3 = playerOrTeam.getPlayer();
                    if (player3 != null) {
                        str2 = player3.getName();
                    }
                    str = str2;
                }
                str = p2;
            } else {
                Team team2 = playerOrTeam.getTeam();
                if (team2 != null) {
                    p2 = tba.p(context, team2);
                }
                str = str2;
            }
            udj.c(str, new goa(1.0f, true), lz.D(R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.l(), av8Var, 0, 24960, 110584);
            av8Var = av8Var;
            String str3 = null;
            if (playerOrTeam.getPlayer() == null ? (team = playerOrTeam.getTeam()) != null : !((player = playerOrTeam.getPlayer()) == null || (team = player.getTeam()) == null)) {
                str3 = team.getSportSlug();
            }
            kq9.b(s6a.N(wyh.a(str3), 6, av8Var), null, bkh.l(utcVar, 20.0f), lz.D(R.color.on_color_highlight_1, av8Var), av8Var, 432, 0);
            av8Var.s(true);
            if (z) {
                av8Var.d0(2067513283);
                av8Var.s(false);
            } else {
                bf3.r(8.0f, 2067285526, av8Var, av8Var, utcVar);
                td4.w(bkh.d(utcVar, 1.0f), 1.0f, hkg.b(653323999), av8Var, 438, 0);
                av8Var = av8Var;
                av8Var.s(false);
            }
            av8Var.s(true);
            xtcVar3 = xtcVar5;
        } else {
            av8Var.W();
            xtcVar3 = xtcVar2;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new x80(i2, playerOrTeam, z, xtcVar3, i3, i4, 10);
        }
    }

    public static final void q(skc skcVar, kv1 kv1Var, xtc xtcVar, of3 of3Var, int i2) {
        int i3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-700022039);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.g(skcVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.g(kv1Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            long D = lz.D(skcVar.d, av8Var);
            int i4 = 6;
            u23 a = t23.a(ww9.f, kv1Var, av8Var, (((((i3 << 3) & 896) | (((i3 >> 6) & 14) | 48)) >> 3) & 112) | 6);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, xtcVar);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var, a, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m2, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            String str = skcVar.b;
            yf8 yf8Var = xth.a;
            q5a.w(str, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, 0L, null, 0L, 2, false, 1, 0, xth.e(), av8Var, 0, 24960, 110586);
            utc utcVar = utc.a;
            nq8.h(av8Var, bkh.e(utcVar, 4.0f));
            l8g a2 = k8g.a(new ng0(2.0f, true, new a70(i4)), uxf.m, av8Var, 54);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C2 = fqj.C(av8Var, utcVar);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            kq9.b(s6a.N(skcVar.c, 6, av8Var), null, bkh.l(utcVar, 16.0f), skcVar.e ? D : r13.i, av8Var, 432, 0);
            q5a.w(oea.v(skcVar.f, av8Var), null, D, null, 0L, 0L, null, 0L, 2, false, 1, 0, xth.b(), av8Var, 0, 24960, 110586);
            av8Var = av8Var;
            av8Var.s(true);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new b30(skcVar, kv1Var, xtcVar, i2, 19);
        }
    }

    public static final void r(e9i e9iVar, gv9 gv9Var, of3 of3Var, int i2) {
        float f2;
        boolean z;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1649489239);
        int i3 = (i2 & 6) == 0 ? (av8Var.g(e9iVar) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i3 |= av8Var.i(gv9Var) ? 32 : 16;
        }
        int i4 = 0;
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            int i5 = 0;
            for (Object obj : CollectionsKt.L0(gv9Var, 5)) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    b.q();
                    throw null;
                }
                PlayerOrTeam playerOrTeam = (PlayerOrTeam) obj;
                float a = e9iVar.a((i5 * TTAdConstant.STYLE_SIZE_RADIO_3_2) + 1000, 1000);
                float f3 = (0.1f * a) + 0.9f;
                if (i5 == gv9Var.size() - 1) {
                    f2 = a;
                    z = true;
                } else {
                    f2 = a;
                    z = false;
                }
                boolean d2 = av8Var.d(f2) | av8Var.d(f3);
                Object O = av8Var.O();
                if (d2 || O == nf3.a) {
                    O = new n28(24, f2, f3);
                    av8Var.n0(O);
                }
                p(i5, playerOrTeam, z, s02.M(utc.a, (Function1) O), av8Var, 0, 0);
                i5 = i6;
            }
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new imj(e9iVar, gv9Var, i2, i4);
        }
    }

    public static final void s(v23 v23Var, gmj gmjVar, of3 of3Var, int i2) {
        gv9 gv9Var = gmjVar.b;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-63953421);
        int i3 = (i2 & 6) == 0 ? (av8Var.g(v23Var) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i3 |= av8Var.g(gmjVar) ? 32 : 16;
        }
        int i4 = 1;
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            utc utcVar = utc.a;
            nq8.h(av8Var, v23Var.a(100.0f, utcVar, true));
            av8Var.d0(-1329690910);
            int i5 = 0;
            for (Object obj : CollectionsKt.L0(gv9Var, 5)) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    b.q();
                    throw null;
                }
                p(i5, (PlayerOrTeam) obj, i5 == gv9Var.size() - 1, null, av8Var, 0, 8);
                i5 = i6;
            }
            av8Var.s(false);
            nq8.h(av8Var, v23Var.a(109.0f, utcVar, true));
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new hmj(v23Var, gmjVar, i2, i4);
        }
    }

    public static final void t(e9i e9iVar, gmj gmjVar, of3 of3Var, int i2) {
        int i3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-738041558);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.g(e9iVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.g(gmjVar) ? 32 : 16;
        }
        int i4 = i3;
        if (av8Var.T(i4 & 1, (i4 & 19) != 18)) {
            kg0 kg0Var = ww9.f;
            kv1 kv1Var = uxf.p;
            xtc d0 = l98.d0(bkh.c, 12.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            u23 a = t23.a(kg0Var, kv1Var, av8Var, 54);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, d0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a, hf3.g);
            waa.K(av8Var, m2, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            q9k q9kVar = gmjVar.a;
            gv9 gv9Var = gmjVar.b;
            String a2 = q9kVar.a(av8Var);
            yf8 yf8Var = xth.a;
            dfj i5 = xth.i();
            long D = lz.D(R.color.on_color_primary, av8Var);
            utc utcVar = utc.a;
            udj.c(a2, bkh.d(utcVar, 1.0f), D, null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, i5, av8Var, 48, 0, 130040);
            av8Var = av8Var;
            nq8.h(av8Var, bkh.e(utcVar, 48.0f));
            if (gv9Var.size() < 5) {
                av8Var.d0(-1619464478);
                v(e9iVar, gv9Var, av8Var, i4 & 14);
                av8Var.s(false);
            } else {
                av8Var.d0(-1619462719);
                r(e9iVar, gv9Var, av8Var, i4 & 14);
                av8Var.s(false);
            }
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new nmi(e9iVar, gmjVar, i2, 13);
        }
    }

    public static final void u(v23 v23Var, gmj gmjVar, of3 of3Var, int i2) {
        int i3;
        int i4;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1955490843);
        if ((i2 & 6) == 0) {
            i3 = i2 | (av8Var.g(v23Var) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.g(gmjVar) ? 32 : 16;
        }
        int i5 = i3;
        if (av8Var.T(i5 & 1, (i5 & 19) != 18)) {
            utc utcVar = utc.a;
            nq8.h(av8Var, v23Var.a(32.0f, utcVar, true));
            String a = gmjVar.f.a(av8Var);
            yf8 yf8Var = xth.a;
            i4 = 0;
            udj.c(a, bkh.d(utcVar, 1.0f), lz.D(R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.i(), av8Var, 48, 0, 130040);
            av8Var = av8Var;
            if (gmjVar.b.size() >= 5) {
                av8Var.d0(1968987200);
                s(v23Var, gmjVar, av8Var, i5 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                av8Var.s(false);
            } else {
                av8Var.d0(1968988609);
                w(v23Var, gmjVar, av8Var, i5 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                av8Var.s(false);
            }
        } else {
            i4 = 0;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new hmj(v23Var, gmjVar, i2, i4);
        }
    }

    public static final void v(e9i e9iVar, gv9 gv9Var, of3 of3Var, int i2) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(353724009);
        int i3 = (i2 & 6) == 0 ? (av8Var.g(e9iVar) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i3 |= av8Var.i(gv9Var) ? 32 : 16;
        }
        int i4 = 1;
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            int i5 = 0;
            for (Object obj : CollectionsKt.L0(gv9Var, 3)) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    b.q();
                    throw null;
                }
                PlayerOrTeam playerOrTeam = (PlayerOrTeam) obj;
                float a = e9iVar.a((i5 * TTAdConstant.STYLE_SIZE_RADIO_3_2) + 1000, 1000);
                float f2 = (0.1f * a) + 0.9f;
                boolean d2 = av8Var.d(a) | av8Var.d(f2);
                Object O = av8Var.O();
                if (d2 || O == nf3.a) {
                    O = new n28(25, a, f2);
                    av8Var.n0(O);
                }
                utc utcVar = utc.a;
                o(i5, playerOrTeam, s02.M(utcVar, (Function1) O), av8Var, 0, 0);
                if (i5 != 2) {
                    bf3.r(16.0f, 439185602, av8Var, av8Var, utcVar);
                    av8Var.s(false);
                } else {
                    av8Var.d0(439248067);
                    av8Var.s(false);
                }
                i5 = i6;
            }
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new imj(e9iVar, gv9Var, i2, i4);
        }
    }

    public static final void w(v23 v23Var, gmj gmjVar, of3 of3Var, int i2) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-59830511);
        int i3 = 2;
        int i4 = (i2 & 6) == 0 ? (av8Var.g(v23Var) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i4 |= av8Var.g(gmjVar) ? 32 : 16;
        }
        if (av8Var.T(i4 & 1, (i4 & 19) != 18)) {
            utc utcVar = utc.a;
            nq8.h(av8Var, v23Var.a(93.0f, utcVar, true));
            av8Var.d0(-1662541701);
            int i5 = 0;
            for (Object obj : CollectionsKt.L0(gmjVar.b, 3)) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    b.q();
                    throw null;
                }
                o(i5, (PlayerOrTeam) obj, null, av8Var, 0, 4);
                if (i5 != 2) {
                    bf3.r(16.0f, 1687569670, av8Var, av8Var, utcVar);
                    av8Var.s(false);
                } else {
                    av8Var.d0(1687632135);
                    av8Var.s(false);
                }
                i5 = i6;
            }
            av8Var.s(false);
            nq8.h(av8Var, v23Var.a(115.0f, utcVar, true));
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new hmj(v23Var, gmjVar, i2, i3);
        }
    }

    public static final void x(i1d i1dVar, wtc wtcVar) {
        i1d z = c0(wtcVar).z();
        int i2 = z.c - 1;
        Object[] objArr = z.a;
        if (i2 < objArr.length) {
            while (i2 >= 0) {
                i1dVar.b((wtc) ((wma) objArr[i2]).F.g);
                i2--;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void y(hd2 hd2Var, fm3 fm3Var, tm3 tm3Var, zci zciVar, String str) {
        char c2;
        long j2;
        char c3;
        char c4;
        str.getClass();
        switch (str.hashCode()) {
            case -1448775240:
                if (str.equals("centerVertically")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -1364013995:
                if (str.equals(TtmlNode.CENTER)) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case -1349088399:
                if (str.equals(Payload.CUSTOM)) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case -1249320806:
                if (str.equals("rotationX")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case -1249320804:
                if (str.equals("rotationZ")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            case -1221029593:
                if (str.equals("height")) {
                    c2 = '\t';
                    break;
                }
                c2 = 65535;
                break;
            case -1068318794:
                if (str.equals("motion")) {
                    c2 = '\n';
                    break;
                }
                c2 = 65535;
                break;
            case -987906986:
                if (str.equals("pivotX")) {
                    c2 = 11;
                    break;
                }
                c2 = 65535;
                break;
            case -987906985:
                if (str.equals("pivotY")) {
                    c2 = '\f';
                    break;
                }
                c2 = 65535;
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c2 = '\r';
                    break;
                }
                c2 = 65535;
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c2 = 14;
                    break;
                }
                c2 = 65535;
                break;
            case -247669061:
                if (str.equals("hRtlBias")) {
                    c2 = 15;
                    break;
                }
                c2 = 65535;
                break;
            case -61505906:
                if (str.equals("vWeight")) {
                    c2 = 16;
                    break;
                }
                c2 = 65535;
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c2 = 17;
                    break;
                }
                c2 = 65535;
                break;
            case 98116417:
                if (str.equals("hBias")) {
                    c2 = 18;
                    break;
                }
                c2 = 65535;
                break;
            case 111045711:
                if (str.equals("vBias")) {
                    c2 = 19;
                    break;
                }
                c2 = 65535;
                break;
            case 113126854:
                if (str.equals("width")) {
                    c2 = 20;
                    break;
                }
                c2 = 65535;
                break;
            case 398344448:
                if (str.equals("hWeight")) {
                    c2 = 21;
                    break;
                }
                c2 = 65535;
                break;
            case 1404070310:
                if (str.equals("centerHorizontally")) {
                    c2 = 22;
                    break;
                }
                c2 = 65535;
                break;
            case 1941332754:
                if (str.equals("visibility")) {
                    c2 = 23;
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
                String y = hd2Var.y(str);
                fm3 b2 = y.equals("parent") ? zciVar.b(0) : zciVar.b(y);
                fm3Var.p(b2);
                fm3Var.e(b2);
                return;
            case 1:
                String y2 = hd2Var.y(str);
                fm3 b3 = y2.equals("parent") ? zciVar.b(0) : zciVar.b(y2);
                fm3Var.o(b3);
                fm3Var.i(b3);
                fm3Var.p(b3);
                fm3Var.e(b3);
                return;
            case 2:
                dd2 w = hd2Var.w(str);
                hd2 hd2Var2 = w instanceof hd2 ? (hd2) w : null;
                if (hd2Var2 == null) {
                    return;
                }
                Iterator it = hd2Var2.B().iterator();
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    dd2 t = hd2Var2.t(str2);
                    if (t instanceof fd2) {
                        fm3Var.i0.put(str2, Float.valueOf(t.m()));
                    } else if (t instanceof kd2) {
                        String e2 = t.e();
                        if (e2.startsWith("#")) {
                            String substring = e2.substring(1);
                            if (substring.length() == 6) {
                                substring = "FF".concat(substring);
                            }
                            j2 = Long.parseLong(substring, 16);
                        } else {
                            j2 = -1;
                        }
                        if (j2 != -1) {
                            fm3Var.h0.put(str2, Integer.valueOf((int) j2));
                        }
                    }
                }
                return;
            case 3:
                fm3Var.z = tm3Var.a(hd2Var.t(str));
                return;
            case 4:
                fm3Var.A = tm3Var.a(hd2Var.t(str));
                return;
            case 5:
                fm3Var.B = tm3Var.a(hd2Var.t(str));
                return;
            case 6:
                fm3Var.C = zciVar.a.i(tm3Var.a(hd2Var.t(str)));
                return;
            case 7:
                fm3Var.D = zciVar.a.i(tm3Var.a(hd2Var.t(str)));
                return;
            case '\b':
                fm3Var.E = zciVar.a.i(tm3Var.a(hd2Var.t(str)));
                return;
            case '\t':
                fm3Var.e0 = T(hd2Var, str, zciVar, zciVar.a);
                return;
            case '\n':
                dd2 t2 = hd2Var.t(str);
                if (t2 instanceof hd2) {
                    hd2 hd2Var3 = (hd2) t2;
                    w5k w5kVar = new w5k();
                    w5kVar.a = new int[10];
                    w5kVar.b = new int[10];
                    w5kVar.c = 0;
                    w5kVar.d = new int[10];
                    w5kVar.e = new float[10];
                    w5kVar.f = 0;
                    w5kVar.g = new int[5];
                    w5kVar.h = new String[5];
                    w5kVar.i = 0;
                    Iterator it2 = hd2Var3.B().iterator();
                    while (it2.hasNext()) {
                        String str3 = (String) it2.next();
                        str3.getClass();
                        switch (str3.hashCode()) {
                            case -1897525331:
                                if (str3.equals("stagger")) {
                                    c3 = 0;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -1310311125:
                                if (str3.equals("easing")) {
                                    c3 = 1;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -1285003983:
                                if (str3.equals("quantize")) {
                                    c3 = 2;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -791482387:
                                if (str3.equals("pathArc")) {
                                    c3 = 3;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -236944793:
                                if (str3.equals("relativeTo")) {
                                    c3 = 4;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            default:
                                c3 = 65535;
                                break;
                        }
                        switch (c3) {
                            case 0:
                                w5kVar.a(hd2Var3.u(str3), 600);
                                continue;
                            case 1:
                                w5kVar.c(IronSourceError.ERROR_BN_LOAD_WHILE_LONG_INITIATION, hd2Var3.y(str3));
                                continue;
                            case 2:
                                dd2 t3 = hd2Var3.t(str3);
                                if (t3 instanceof bd2) {
                                    bd2 bd2Var = (bd2) t3;
                                    int size = bd2Var.e.size();
                                    if (size <= 0) {
                                        break;
                                    } else {
                                        w5kVar.b(610, bd2Var.getInt(0));
                                        if (size <= 1) {
                                            break;
                                        } else {
                                            w5kVar.c(IronSourceError.ERROR_BN_INSTANCE_LOAD_EMPTY_ADAPTER, bd2Var.x(1));
                                            if (size > 2) {
                                                w5kVar.a(bd2Var.getFloat(2), IronSourceError.ERROR_BN_INIT_FAILED_AFTER_LOAD);
                                            }
                                        }
                                    }
                                } else {
                                    dd2 t4 = hd2Var3.t(str3);
                                    if (t4 == null) {
                                        StringBuilder q2 = wt3.q("no int found for key <", str3, ">, found [");
                                        q2.append(t4.o());
                                        q2.append("] : ");
                                        q2.append(t4);
                                        throw new id2(q2.toString(), hd2Var3);
                                    }
                                    w5kVar.b(610, t4.n());
                                }
                            case 3:
                                String y3 = hd2Var3.y(str3);
                                String[] strArr = {"none", "startVertical", "startHorizontal", "flip", "below", "above"};
                                int i2 = 0;
                                while (true) {
                                    if (i2 >= 6) {
                                        i2 = -1;
                                    } else if (!strArr[i2].equals(y3)) {
                                        i2++;
                                    }
                                }
                                if (i2 != -1) {
                                    w5kVar.b(IronSourceError.ERROR_BN_INSTANCE_INIT_TIMEOUT, i2);
                                    break;
                                } else {
                                    System.err.println("0 pathArc = '" + y3 + "'");
                                    break;
                                }
                            case 4:
                                w5kVar.c(IronSourceError.ERROR_BN_LOAD_EXCEPTION, hd2Var3.y(str3));
                                break;
                        }
                    }
                    fm3Var.getClass();
                    return;
                }
                return;
            case 11:
                fm3Var.x = tm3Var.a(hd2Var.t(str));
                return;
            case '\f':
                fm3Var.y = tm3Var.a(hd2Var.t(str));
                return;
            case '\r':
                fm3Var.G = tm3Var.a(hd2Var.t(str));
                return;
            case 14:
                fm3Var.H = tm3Var.a(hd2Var.t(str));
                return;
            case 15:
                float a = tm3Var.a(hd2Var.t(str));
                if (!zciVar.b) {
                    a = 1.0f - a;
                }
                fm3Var.h = a;
                return;
            case 16:
                fm3Var.g = tm3Var.a(hd2Var.t(str));
                return;
            case 17:
                fm3Var.F = tm3Var.a(hd2Var.t(str));
                return;
            case 18:
                fm3Var.h = tm3Var.a(hd2Var.t(str));
                return;
            case 19:
                fm3Var.i = tm3Var.a(hd2Var.t(str));
                return;
            case 20:
                fm3Var.d0 = T(hd2Var, str, zciVar, zciVar.a);
                return;
            case 21:
                fm3Var.f = tm3Var.a(hd2Var.t(str));
                return;
            case 22:
                String y4 = hd2Var.y(str);
                fm3 b4 = y4.equals("parent") ? zciVar.b(0) : zciVar.b(y4);
                fm3Var.o(b4);
                fm3Var.i(b4);
                return;
            case 23:
                String y5 = hd2Var.y(str);
                switch (y5.hashCode()) {
                    case -1901805651:
                        if (y5.equals("invisible")) {
                            c4 = 0;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 3178655:
                        if (y5.equals("gone")) {
                            c4 = 1;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 466743410:
                        if (y5.equals("visible")) {
                            c4 = 2;
                            break;
                        }
                        c4 = 65535;
                        break;
                    default:
                        c4 = 65535;
                        break;
                }
                switch (c4) {
                    case 0:
                        fm3Var.I = 4;
                        fm3Var.F = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        return;
                    case 1:
                        fm3Var.I = 8;
                        return;
                    case 2:
                        fm3Var.I = 0;
                        return;
                    default:
                        return;
                }
            default:
                S(hd2Var, fm3Var, tm3Var, zciVar, str);
                return;
        }
    }

    public static final Bitmap z(a10 a10Var) {
        if (a10Var instanceof a10) {
            return a10Var.a;
        }
        a70.m("Unable to obtain android.graphics.Bitmap");
        return null;
    }

    public abstract Object G();

    public abstract float M(Object obj);

    public abstract void e0(Object obj, float f2);

    public String toString() {
        switch (this.a) {
            case 27:
                return G().toString();
            default:
                return super.toString();
        }
    }
}
