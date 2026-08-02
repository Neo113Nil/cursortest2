package defpackage;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Base64;
import android.widget.RemoteViews;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.core.app.NotificationCompat;
import com.bumptech.glide.a;
import com.bumptech.glide.integration.okhttp3.OkHttpGlideModule;
import com.google.android.gms.internal.measurement.b;
import com.google.android.gms.internal.measurement.zzacr;
import com.google.android.gms.internal.measurement.zzaef;
import com.google.android.gms.internal.measurement.zzaga;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.U3;
import com.ironsource.V2;
import com.sofascore.model.fantasy.FantasyPlayer;
import com.sofascore.model.mvvm.model.Country;
import com.sofascore.model.network.response.TeamAverageRatingVersion;
import com.sofascore.model.newNetwork.topperformance.response.BasketballTopTeamsStatistics;
import com.sofascore.model.newNetwork.topperformance.response.FootballTopTeamsStatistics;
import com.sofascore.model.newNetwork.topperformance.response.FutsalTopTeamsStatistics;
import com.sofascore.model.newNetwork.topperformance.response.HandballTopTeamsStatistics;
import com.sofascore.model.newNetwork.topperformance.response.IceHockeyTopTeamsStatistics;
import com.sofascore.model.newNetwork.topperformance.response.RugbyTopTeamsStatistics;
import com.sofascore.model.newNetwork.topperformance.response.TennisTopTeamsStatistics;
import com.sofascore.model.newNetwork.topperformance.response.TopPerformanceStatistics;
import com.sofascore.model.newNetwork.topperformance.response.VolleyballTopTeamsStatistics;
import com.sofascore.model.newNetwork.topperformance.topTeams.items.BaseTopTeamsStatisticsItem;
import com.sofascore.model.newNetwork.topperformance.topTeams.items.TopTeamsStatisticsItem;
import com.sofascore.results.R;
import com.sofascore.results.league.fragment.topStats.TopTeamCategoryUiModel;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlin.text.c;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class w1a {
    public static final int a = 9;
    public static final int b = 10;
    public static final int c = 12;
    public static final /* synthetic */ int d = 0;
    public static final /* synthetic */ int e = 0;
    public static final /* synthetic */ int f = 0;
    public static final /* synthetic */ int g = 0;
    public static final /* synthetic */ int h = 0;
    public static final /* synthetic */ int i = 0;
    public static final /* synthetic */ int j = 0;

    public static ric B(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            String str = (String) list.get(i2);
            String str2 = nik.a;
            String[] split = str.split(U3.j.b, 2);
            if (split.length != 2) {
                tgj.d0("Failed to parse Vorbis comment: ".concat(str));
            } else if (split[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(pge.a(new j9e(Base64.decode(split[1], 0))));
                } catch (RuntimeException e2) {
                    tgj.e0("Failed to parse vorbis picture", e2);
                }
            } else {
                arrayList.add(new txk(split[0], split[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new ric(arrayList);
    }

    public static n89 C(j9e j9eVar, boolean z, boolean z2) {
        if (z) {
            G(3, j9eVar, false);
        }
        j9eVar.y((int) j9eVar.r(), StandardCharsets.UTF_8);
        long r = j9eVar.r();
        String[] strArr = new String[(int) r];
        for (int i2 = 0; i2 < r; i2++) {
            strArr[i2] = j9eVar.y((int) j9eVar.r(), StandardCharsets.UTF_8);
        }
        if (z2 && (j9eVar.A() & 1) == 0) {
            throw s9e.a(null, "framing bit expected to be set");
        }
        return new n89(strArr);
    }

    public static final scj D(String str, of3 of3Var, int i2) {
        int length = str.length();
        long g2 = t6a.g(length, length);
        Object[] objArr = new Object[0];
        k03 k03Var = k03.k;
        boolean z = ((((i2 & 14) ^ 6) > 4 && ((av8) of3Var).g(str)) || (i2 & 6) == 4) | ((((i2 & 112) ^ 48) > 32 && ((av8) of3Var).f(g2)) || (i2 & 48) == 32);
        av8 av8Var = (av8) of3Var;
        Object O = av8Var.O();
        if (z || O == nf3.a) {
            O = new e40(str, g2, 2);
            av8Var.n0(O);
        }
        return (scj) o3a.M(objArr, k03Var, (Function0) O, av8Var, 48);
    }

    public static final void E(scj scjVar, String str) {
        l9j f2 = scjVar.f();
        e1d e1dVar = scjVar.c;
        try {
            f2.c(0, f2.c.length(), str);
            cga.J(f2);
            scjVar.a(f2);
        } finally {
            ((eoh) e1dVar).setValue(Boolean.FALSE);
            scjVar.e(false);
        }
    }

    public static qel F(FantasyPlayer fantasyPlayer, Context context, String str) {
        String str2;
        fantasyPlayer.getClass();
        f7a f7aVar = rz6.g;
        String position = fantasyPlayer.getPosition();
        f7aVar.getClass();
        String str3 = f7a.g(position).a;
        Float price = fantasyPlayer.getPrice();
        if (price != null) {
            float floatValue = price.floatValue();
            Locale d2 = dla.d();
            Set set = o84.a;
            str2 = String.format(d2, "%s%.1fM", Arrays.copyOf(new Object[]{o84.e(context), Float.valueOf(floatValue)}, 2));
        } else {
            str2 = "-";
        }
        return new qel(fantasyPlayer, str, lnb.o(str3, " · ", str2));
    }

    public static boolean G(int i2, j9e j9eVar, boolean z) {
        if (j9eVar.a() < 7) {
            if (z) {
                return false;
            }
            throw s9e.a(null, "too short header: " + j9eVar.a());
        }
        if (j9eVar.A() != i2) {
            if (z) {
                return false;
            }
            throw s9e.a(null, "expected header type " + Integer.toHexString(i2));
        }
        if (j9eVar.A() == 118 && j9eVar.A() == 111 && j9eVar.A() == 114 && j9eVar.A() == 98 && j9eVar.A() == 105 && j9eVar.A() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw s9e.a(null, "expected characters 'vorbis'");
    }

    public static boolean H(String str, String str2) {
        if (!StringsKt.J(str2, "*", false)) {
            return false;
        }
        if (str2.equals("*")) {
            return true;
        }
        if (StringsKt.P(str2, "*", 0, false, 6) == StringsKt.T("*", str2, 6) && c.n(str2, "*", false)) {
            return c.v(str, str2.substring(0, str2.length() - 1), false);
        }
        a70.p("Name pattern with a wildcard must only contain a single wildcard in the end");
        return false;
    }

    public static int I(byte[] bArr, int i2, tg0 tg0Var) {
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        if (b2 < 0) {
            return L(b2, bArr, i3, tg0Var);
        }
        tg0Var.a = b2;
        return i3;
    }

    public static Object J(int i2) {
        if (i2 >= 2 && i2 <= 1073741824 && Integer.highestOneBit(i2) == i2) {
            return i2 <= 256 ? new byte[i2] : i2 <= 65536 ? new short[i2] : new int[i2];
        }
        a70.p(me4.g(i2, "must be power of 2 between 2^1 and 2^30: ", new StringBuilder(String.valueOf(i2).length() + 41)));
        return null;
    }

    public static int K(int i2, Object obj) {
        return obj instanceof byte[] ? ((byte[]) obj)[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED : obj instanceof short[] ? (char) ((short[]) obj)[i2] : ((int[]) obj)[i2];
    }

    public static int L(int i2, byte[] bArr, int i3, tg0 tg0Var) {
        byte b2 = bArr[i3];
        int i4 = i3 + 1;
        int i5 = i2 & Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE;
        if (b2 >= 0) {
            tg0Var.a = i5 | (b2 << 7);
            return i4;
        }
        int i6 = i5 | ((b2 & Byte.MAX_VALUE) << 7);
        int i7 = i3 + 2;
        byte b3 = bArr[i4];
        if (b3 >= 0) {
            tg0Var.a = i6 | (b3 << 14);
            return i7;
        }
        int i8 = i6 | ((b3 & Byte.MAX_VALUE) << 14);
        int i9 = i3 + 3;
        byte b4 = bArr[i7];
        if (b4 >= 0) {
            tg0Var.a = i8 | (b4 << 21);
            return i9;
        }
        int i10 = i8 | ((b4 & Byte.MAX_VALUE) << 21);
        int i11 = i3 + 4;
        byte b5 = bArr[i9];
        if (b5 >= 0) {
            tg0Var.a = i10 | (b5 << 28);
            return i11;
        }
        int i12 = i10 | ((b5 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i13 = i11 + 1;
            if (bArr[i11] >= 0) {
                tg0Var.a = i12;
                return i13;
            }
            i11 = i13;
        }
    }

    public static int M(byte[] bArr, int i2, tg0 tg0Var) {
        long j2 = bArr[i2];
        int i3 = i2 + 1;
        if (j2 >= 0) {
            tg0Var.b = j2;
            return i3;
        }
        int i4 = i2 + 2;
        byte b2 = bArr[i3];
        long j3 = (j2 & 127) | ((b2 & Byte.MAX_VALUE) << 7);
        int i5 = 7;
        while (b2 < 0) {
            int i6 = i4 + 1;
            i5 += 7;
            j3 |= (r10 & Byte.MAX_VALUE) << i5;
            b2 = bArr[i4];
            i4 = i6;
        }
        tg0Var.b = j3;
        return i4;
    }

    public static void N(int i2, int i3, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i2] = (byte) i3;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i2] = (short) i3;
        } else {
            ((int[]) obj)[i2] = i3;
        }
    }

    public static int O(int i2, byte[] bArr) {
        int i3 = bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i4 = bArr[i2 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i5 = bArr[i2 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        return ((bArr[i2 + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | (i4 << 8) | i3 | (i5 << 16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        if (r5 != (-1)) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        N(r1, r7, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        r12[r5] = (r12[r5] & r4) | (r7 & r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int P(Object obj, Object obj2, int i2, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int J = d2a.J(obj);
        int i3 = J & i2;
        int K = K(i3, obj3);
        if (K != 0) {
            int i4 = ~i2;
            int i5 = J & i4;
            int i6 = -1;
            while (true) {
                int i7 = K - 1;
                int i8 = iArr[i7];
                int i9 = i8 & i2;
                if ((i8 & i4) != i5 || !Objects.equals(obj, objArr[i7]) || (objArr2 != null && !Objects.equals(obj2, objArr2[i7]))) {
                    if (i9 == 0) {
                        break;
                    }
                    i6 = i7;
                    K = i9;
                }
            }
        }
        return -1;
    }

    public static long Q(int i2, byte[] bArr) {
        return (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16) | ((bArr[i2 + 3] & 255) << 24) | ((bArr[i2 + 4] & 255) << 32) | ((bArr[i2 + 5] & 255) << 40) | ((bArr[i2 + 6] & 255) << 48) | ((bArr[i2 + 7] & 255) << 56);
    }

    public static int R(byte[] bArr, int i2, tg0 tg0Var) {
        int I = I(bArr, i2, tg0Var);
        int i3 = tg0Var.a;
        if (i3 < 0) {
            hbo.o("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        if (i3 == 0) {
            tg0Var.c = "";
            return I;
        }
        tg0Var.c = ten.d(I, i3, bArr);
        return I + i3;
    }

    public static int S(byte[] bArr, int i2, tg0 tg0Var) {
        int I = I(bArr, i2, tg0Var);
        int i3 = tg0Var.a;
        if (i3 < 0) {
            hbo.o("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        if (i3 > bArr.length - I) {
            hbo.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        if (i3 == 0) {
            tg0Var.c = zzacr.b;
            return I;
        }
        tg0Var.c = zzacr.q(I, i3, bArr);
        return I + i3;
    }

    public static int T(Object obj, odn odnVar, byte[] bArr, int i2, int i3, tg0 tg0Var) {
        int i4 = i2 + 1;
        int i5 = bArr[i2];
        if (i5 < 0) {
            i4 = L(i5, bArr, i4, tg0Var);
            i5 = tg0Var.a;
        }
        int i6 = i4;
        if (i5 < 0 || i5 > i3 - i6) {
            hbo.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        int i7 = tg0Var.d + 1;
        tg0Var.d = i7;
        if (i7 >= 100) {
            hbo.o("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        int i8 = i6 + i5;
        odnVar.e(obj, bArr, i6, i8, tg0Var);
        tg0Var.d--;
        tg0Var.c = obj;
        return i8;
    }

    public static int U(Object obj, odn odnVar, byte[] bArr, int i2, int i3, int i4, tg0 tg0Var) {
        b bVar = (b) odnVar;
        int i5 = tg0Var.d + 1;
        tg0Var.d = i5;
        if (i5 >= 100) {
            hbo.o("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        int y = bVar.y(obj, bArr, i2, i3, i4, tg0Var);
        tg0Var.d--;
        tg0Var.c = obj;
        return y;
    }

    public static int V(int i2, byte[] bArr, int i3, int i4, zzaef zzaefVar, tg0 tg0Var) {
        tan tanVar = (tan) zzaefVar;
        int I = I(bArr, i3, tg0Var);
        tanVar.g(tg0Var.a);
        while (I < i4) {
            int I2 = I(bArr, I, tg0Var);
            if (i2 != tg0Var.a) {
                break;
            }
            I = I(bArr, I2, tg0Var);
            tanVar.g(tg0Var.a);
        }
        return I;
    }

    public static int W(byte[] bArr, int i2, zzaef zzaefVar, tg0 tg0Var) {
        tan tanVar = (tan) zzaefVar;
        int I = I(bArr, i2, tg0Var);
        int i3 = tg0Var.a + I;
        while (I < i3) {
            I = I(bArr, I, tg0Var);
            tanVar.g(tg0Var.a);
        }
        if (I == i3) {
            return I;
        }
        hbo.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return 0;
    }

    public static int X(odn odnVar, int i2, byte[] bArr, int i3, int i4, zzaef zzaefVar, tg0 tg0Var) {
        Object zza = odnVar.zza();
        odn odnVar2 = odnVar;
        byte[] bArr2 = bArr;
        int i5 = i4;
        tg0 tg0Var2 = tg0Var;
        int T = T(zza, odnVar2, bArr2, i3, i5, tg0Var2);
        odnVar2.c(zza);
        tg0Var2.c = zza;
        zzaefVar.add(zza);
        while (T < i5) {
            tg0 tg0Var3 = tg0Var2;
            int i6 = i5;
            int I = I(bArr2, T, tg0Var3);
            if (i2 != tg0Var3.a) {
                break;
            }
            byte[] bArr3 = bArr2;
            odn odnVar3 = odnVar2;
            Object zza2 = odnVar3.zza();
            T = T(zza2, odnVar3, bArr3, I, i6, tg0Var3);
            odnVar2 = odnVar3;
            bArr2 = bArr3;
            i5 = i6;
            tg0Var2 = tg0Var3;
            odnVar2.c(zza2);
            tg0Var2.c = zza2;
            zzaefVar.add(zza2);
        }
        return T;
    }

    public static int Y(int i2, byte[] bArr, int i3, int i4, zzaga zzagaVar, tg0 tg0Var) {
        if ((i2 >>> 3) == 0) {
            hbo.o("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i5 = i2 & 7;
        if (i5 == 0) {
            int M = M(bArr, i3, tg0Var);
            zzagaVar.d(i2, Long.valueOf(tg0Var.b));
            return M;
        }
        if (i5 == 1) {
            zzagaVar.d(i2, Long.valueOf(Q(i3, bArr)));
            return i3 + 8;
        }
        if (i5 == 2) {
            int I = I(bArr, i3, tg0Var);
            int i6 = tg0Var.a;
            if (i6 < 0) {
                hbo.o("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                return 0;
            }
            if (i6 > bArr.length - I) {
                hbo.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return 0;
            }
            if (i6 == 0) {
                zzagaVar.d(i2, zzacr.b);
            } else {
                zzagaVar.d(i2, zzacr.q(I, i6, bArr));
            }
            return I + i6;
        }
        if (i5 != 3) {
            if (i5 == 5) {
                zzagaVar.d(i2, Integer.valueOf(O(i3, bArr)));
                return i3 + 4;
            }
            hbo.o("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i7 = (i2 & (-8)) | 4;
        zzaga a2 = zzaga.a();
        int i8 = tg0Var.d + 1;
        tg0Var.d = i8;
        if (i8 >= 100) {
            hbo.o("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        int i9 = 0;
        while (true) {
            if (i3 >= i4) {
                break;
            }
            int I2 = I(bArr, i3, tg0Var);
            int i10 = tg0Var.a;
            if (i10 == i7) {
                i9 = i10;
                i3 = I2;
                break;
            }
            i3 = Y(i10, bArr, I2, i4, a2, tg0Var);
            i9 = i10;
        }
        tg0Var.d--;
        if (i3 > i4 || i9 != i7) {
            hbo.o("Failed to parse the message.");
            return 0;
        }
        zzagaVar.d(i2, a2);
        return i3;
    }

    public static int Z(int i2, byte[] bArr, int i3, int i4, tg0 tg0Var) {
        if ((i2 >>> 3) == 0) {
            hbo.o("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i5 = i2 & 7;
        if (i5 == 0) {
            return M(bArr, i3, tg0Var);
        }
        if (i5 == 1) {
            return i3 + 8;
        }
        if (i5 == 2) {
            return I(bArr, i3, tg0Var) + tg0Var.a;
        }
        if (i5 != 3) {
            if (i5 == 5) {
                return i3 + 4;
            }
            hbo.o("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i6 = (i2 & (-8)) | 4;
        int i7 = 0;
        while (i3 < i4) {
            i3 = I(bArr, i3, tg0Var);
            i7 = tg0Var.a;
            if (i7 == i6) {
                break;
            }
            i3 = Z(i7, bArr, i3, i4, tg0Var);
        }
        if (i3 <= i4 && i7 == i6) {
            return i3;
        }
        hbo.o("Failed to parse the message.");
        return 0;
    }

    public static final void a(String str, String str2, of3 of3Var, int i2) {
        String str3;
        av8 av8Var;
        int i3;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-209129119);
        int i4 = i2 | (av8Var2.g(str) ? 4 : 2) | (av8Var2.g(str2) ? 32 : 16);
        if (av8Var2.T(i4 & 1, (i4 & 19) != 18)) {
            xtc d0 = l98.d0(utc.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1);
            l8g a2 = k8g.a(new ng0(16.0f, true, new a70(6)), uxf.m, av8Var2, 54);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m = av8Var2.m();
            xtc C = fqj.C(av8Var2, d0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a2, hf3.g);
            waa.K(av8Var2, m, hf3.f);
            waa.K(av8Var2, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var2, hf3.k);
            goa g2 = ljg.g(av8Var2, C, hf3.d, 1.0f, true);
            yf8 yf8Var = xth.a;
            udj.c(str, g2, lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.e(), av8Var2, i4 & 14, 0, 131064);
            str3 = str2;
            udj.c(str3, null, lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.e(), av8Var2, (i4 >> 3) & 14, 0, 131066);
            av8Var = av8Var2;
            i3 = 1;
            av8Var.s(true);
        } else {
            str3 = str2;
            av8Var = av8Var2;
            i3 = 1;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new v54(str, str3, i2, i3);
        }
    }

    public static final void b(hle hleVar, of3 of3Var, int i2) {
        int i3;
        long j2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(248754142);
        int i4 = i2 | (av8Var.g(hleVar) ? 4 : 2);
        if (av8Var.T(i4 & 1, (i4 & 3) != 2)) {
            utc utcVar = utc.a;
            xtc d0 = l98.d0(bkh.d(utcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1);
            l8g a2 = k8g.a(ww9.b, uxf.m, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, d0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            xtc l = bkh.l(utcVar, 24.0f);
            int i5 = hleVar.c;
            r9k r9kVar = hleVar.f;
            int i6 = hleVar.i;
            ImageVector N = s6a.N(i5, 6, av8Var);
            if (hleVar.j) {
                j2 = ljg.f(av8Var, -1904558981, i6, av8Var, false);
            } else {
                av8Var.d0(-1904557687);
                av8Var.s(false);
                j2 = r13.i;
            }
            kq9.b(N, null, l, j2, av8Var, 432, 0);
            goa d2 = bf3.d(utcVar, 8.0f, av8Var, 1.0f, true);
            String a3 = hleVar.d.a(av8Var);
            yf8 yf8Var = xth.a;
            udj.c(a3, d2, lz.D(i6, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.j(), av8Var, 0, 0, 131064);
            av8Var = av8Var;
            if (r9kVar != null) {
                ljg.r(10.0f, 1088613790, av8Var, av8Var, utcVar);
                udj.c(oea.w(R.string.injury_last_updated, new Object[]{r9kVar.a(av8Var)}, av8Var), null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, new p7j(6), 0L, 0, false, 0, 0, null, xth.g(), av8Var, 0, 0, 130042);
                av8Var = av8Var;
                av8Var.s(false);
            } else {
                av8Var.d0(1088957828);
                av8Var.s(false);
            }
            i3 = 1;
            av8Var.s(true);
        } else {
            i3 = 1;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ble(hleVar, i2, i3);
        }
    }

    public static final void c(z88 z88Var, e6b e6bVar, Function1 function1, of3 of3Var, int i2, int i3) {
        e6b e6bVar2;
        e6b e6bVar3;
        z88Var.getClass();
        function1.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1932277916);
        int i4 = (av8Var.i(z88Var) ? 4 : 2) | i2;
        int i5 = i4 | 432;
        int i6 = i3 & 8;
        if (i6 != 0) {
            i5 = i4 | V2.b.f;
        } else if ((i2 & 3072) == 0) {
            i5 |= av8Var.e(e6bVar == null ? -1 : e6bVar.ordinal()) ? 2048 : 1024;
        }
        int i7 = (av8Var.i(function1) ? 16384 : 8192) | i5;
        if (av8Var.T(i7 & 1, (i7 & 9363) != 9362)) {
            if (i6 != 0) {
                e6bVar = e6b.d;
            }
            u6b u6bVar = (u6b) av8Var.k(mhb.a);
            Object[] objArr = {z88Var, u6bVar.getLifecycle(), null, null};
            boolean i8 = av8Var.i(u6bVar) | ((i7 & 7168) == 2048) | av8Var.i(z88Var) | ((i7 & 57344) == 16384);
            Object O = av8Var.O();
            if (i8 || O == nf3.a) {
                e6bVar3 = e6bVar;
                va8 va8Var = new va8(u6bVar, e6bVar3, z88Var, function1, null, 26);
                av8Var.n0(va8Var);
                O = va8Var;
            } else {
                e6bVar3 = e6bVar;
            }
            hz8.r(objArr, (Function2) O, av8Var);
            e6bVar2 = e6bVar3;
        } else {
            av8Var.W();
            e6bVar2 = e6bVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new r22(i2, i3, 9, z88Var, e6bVar2, function1);
        }
    }

    public static final void d(hle hleVar, of3 of3Var, int i2) {
        gle gleVar = hleVar.g;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1293254563);
        int i3 = (av8Var.g(hleVar) ? 4 : 2) | i2;
        int i4 = 0;
        if (av8Var.T(i3 & 1, (i3 & 3) != 2)) {
            xtc f0 = l98.f0(n9e.q(bkh.d(utc.a, 1.0f), lz.D(R.color.surface_1, av8Var), o7g.a(16.0f)), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 8.0f, 2);
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, f0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            b(hleVar, av8Var, i3 & 14);
            if (gleVar != null) {
                av8Var.d0(-409252084);
                h(gleVar, av8Var, 0);
                av8Var.s(false);
            } else {
                av8Var.d0(-409183853);
                av8Var.s(false);
            }
            av8Var.d0(-1952861242);
            for (cle cleVar : hleVar.h) {
                a(cleVar.a.a(av8Var), cleVar.b.a(av8Var), av8Var, 0);
            }
            av8Var.s(false);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ble(hleVar, i2, i4);
        }
    }

    public static final void e(gv9 gv9Var, xtc xtcVar, of3 of3Var, int i2) {
        gv9Var.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-500302044);
        int i3 = (av8Var.g(gv9Var) ? 4 : 2) | i2;
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            xtc d2 = bkh.d(xtcVar, 1.0f);
            u23 a2 = t23.a(new ng0(8.0f, true, new a70(6)), uxf.o, av8Var, 6);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, d2);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            Iterator p = ljg.p(av8Var, C, hf3.d, -131809749, gv9Var);
            while (p.hasNext()) {
                hle hleVar = (hle) p.next();
                fle fleVar = hleVar.b;
                int i4 = hleVar.a;
                StringBuilder sb = new StringBuilder();
                sb.append(fleVar);
                sb.append(i4);
                av8Var.a0(-1365422520, sb.toString());
                d(hleVar, av8Var, 0);
                av8Var.s(false);
            }
            av8Var.s(false);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new y81(gv9Var, xtcVar, i2, 17);
        }
    }

    public static final void f(long j2, dfj dfjVar, Function2 function2, of3 of3Var, int i2) {
        int i3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-684938728);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.f(j2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.g(dfjVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var.i(function2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            ff5 ff5Var = udj.a;
            tol.c(new gb0[]{lo3.a.a(new r13(j2)), ff5Var.a(((dfj) av8Var.k(ff5Var)).e(dfjVar))}, function2, av8Var, ((i3 >> 3) & 112) | 8);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new tff(j2, dfjVar, function2, i2, 0);
        }
    }

    public static final void g(jsh jshVar, Function1 function1, xtc xtcVar, of3 of3Var, int i2) {
        int i3;
        av8 av8Var;
        function1.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(727962851);
        int i4 = 2;
        if ((i2 & 6) == 0) {
            i3 = (av8Var2.g(jshVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var2.i(function1) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var2.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if (av8Var2.T(i3 & 1, (i3 & 147) != 146)) {
            String str = jshVar.h;
            String str2 = jshVar.i;
            tc3 H = yqo.H(2033288706, av8Var2, new gsh(jshVar, i4));
            Integer valueOf = Integer.valueOf(R.drawable.media_card_rating_background);
            boolean z = ((i3 & 112) == 32) | ((i3 & 14) == 4);
            Object O = av8Var2.O();
            if (z || O == nf3.a) {
                O = new hsh(function1, jshVar, i4);
                av8Var2.n0(O);
            }
            av8Var = av8Var2;
            v9g.c(xtcVar, null, H, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, valueOf, null, str, str2, (Function0) O, av8Var, ((i3 >> 6) & 14) | 384, 378);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ish(jshVar, function1, xtcVar, i2, 1);
        }
    }

    public static final void h(gle gleVar, of3 of3Var, int i2) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1609560377);
        int i3 = (av8Var.g(gleVar) ? 4 : 2) | i2;
        if (av8Var.T(i3 & 1, (i3 & 3) != 2)) {
            utc utcVar = utc.a;
            xtc d0 = l98.d0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1);
            l8g a2 = k8g.a(new ng0(8.0f, true, new a70(6)), uxf.m, av8Var, 54);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, d0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            td4.y(gleVar.a, 48, 12, av8Var, bkh.l(utcVar, 16.0f), null, false);
            String str = gleVar.b;
            if (str == null) {
                str = "";
            }
            yf8 yf8Var = xth.a;
            udj.c(str, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.e(), av8Var, 0, 0, 131066);
            av8Var = av8Var;
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new t1d(gleVar, i2, 8);
        }
    }

    public static n6g i(JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONArray optJSONArray;
        String str = "";
        boolean z = false;
        try {
            if (jSONObject.has("data") && (optJSONObject = jSONObject.optJSONObject("data")) != null) {
                String optString = optJSONObject.optString("igniteVersion", "");
                try {
                    if (optJSONObject.has(U3.a.v) && (optJSONArray = optJSONObject.optJSONArray(U3.a.v)) != null) {
                        for (int length = optJSONArray.length() - 1; length >= 0; length--) {
                            JSONObject optJSONObject2 = optJSONArray.optJSONObject(length);
                            if (optJSONObject2.has("type") && "GET_PROPERTY".equalsIgnoreCase(optJSONObject2.optString("type", ""))) {
                                str = optString;
                                z = true;
                                break;
                            }
                        }
                    }
                    str = optString;
                } catch (Exception e2) {
                    e = e2;
                    str = optString;
                    hpo.h("IgniteVersionParser: exception on parse: %s", e.getMessage());
                    return new n6g(3, str, z);
                }
            }
        } catch (Exception e3) {
            e = e3;
        }
        return new n6g(3, str, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean j(xc xcVar, xc xcVar2) {
        String str = xcVar2.b;
        String str2 = xcVar2.a;
        if (xcVar == null) {
            return str2.equals("*") && str.equals("*");
        }
        String str3 = xcVar.b;
        String str4 = xcVar.a;
        if (StringsKt.J(xcVar.toString(), "*", false)) {
            a70.p("Wildcard can only be part of the rule.");
            return false;
        }
        boolean z = str4.equals(str2) || H(str4, str2);
        boolean z2 = str3.equals(str) || H(str3, str);
        if (!z || !z2) {
        }
    }

    public static void k(String str, boolean z) {
        if (z) {
            return;
        }
        a70.p(str);
    }

    public static void l(Object obj) {
        m(obj, "Argument must not be null");
    }

    public static void m(Object obj, String str) {
        if (obj != null) {
            return;
        }
        yhk.s(str);
    }

    public static ovf n(a aVar, ArrayList arrayList) {
        String str;
        j1g nw1Var;
        j1g j1gVar;
        dx1 dx1Var;
        int i2;
        String str2;
        int i3;
        dx1 dx1Var2 = aVar.a;
        kn4 kn4Var = aVar.d;
        jz8 jz8Var = aVar.c;
        Context applicationContext = jz8Var.getApplicationContext();
        t9d t9dVar = jz8Var.f;
        ovf ovfVar = new ovf();
        eq4 eq4Var = new eq4();
        ef0 ef0Var = ovfVar.g;
        synchronized (ef0Var) {
            ef0Var.a.add(eq4Var);
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 27) {
            ff6 ff6Var = new ff6();
            ef0 ef0Var2 = ovfVar.g;
            synchronized (ef0Var2) {
                str = "legacy_append";
                ef0Var2.a.add(ff6Var);
            }
        } else {
            str = "legacy_append";
        }
        Resources resources = applicationContext.getResources();
        ArrayList e2 = ovfVar.e();
        ca2 ca2Var = new ca2(applicationContext, e2, dx1Var2, kn4Var);
        gpk gpkVar = new gpk(dx1Var2, new ubf(5));
        n75 n75Var = new n75(ovfVar.e(), resources.getDisplayMetrics(), dx1Var2, kn4Var);
        if (i4 < 28 || !((Map) t9dVar.a).containsKey(fz8.class)) {
            x92 x92Var = new x92(n75Var, 0);
            nw1Var = new nw1(2, n75Var, kn4Var);
            j1gVar = x92Var;
        } else {
            j1g y92Var = new y92(1);
            j1gVar = new y92(0);
            nw1Var = y92Var;
        }
        if (i4 >= 28) {
            i2 = i4;
            dx1Var = dx1Var2;
            ovfVar.d("Animation", InputStream.class, Drawable.class, new v60(new c70(e2, kn4Var), 1));
            ovfVar.d("Animation", ByteBuffer.class, Drawable.class, new v60(new c70(e2, kn4Var), 0));
        } else {
            dx1Var = dx1Var2;
            i2 = i4;
        }
        l1g l1gVar = new l1g(applicationContext);
        ow1 ow1Var = new ow1(kn4Var);
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
        zic zicVar = new zic(17);
        ccd ccdVar = new ccd();
        ContentResolver contentResolver = applicationContext.getContentResolver();
        ovfVar.a(ByteBuffer.class, new ug5());
        ovfVar.a(InputStream.class, new bka(kn4Var, 22));
        ovfVar.d("Bitmap", ByteBuffer.class, Bitmap.class, j1gVar);
        ovfVar.d("Bitmap", InputStream.class, Bitmap.class, nw1Var);
        String str3 = Build.FINGERPRINT;
        if ("robolectric".equals(str3)) {
            str2 = str3;
        } else {
            str2 = str3;
            ovfVar.d("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new x92(n75Var, 1));
        }
        dx1 dx1Var3 = dx1Var;
        ovfVar.d("Bitmap", AssetFileDescriptor.class, Bitmap.class, new gpk(dx1Var3, new w9f(5)));
        ovfVar.d("Bitmap", ParcelFileDescriptor.class, Bitmap.class, gpkVar);
        xak xakVar = xak.b;
        ovfVar.c(Bitmap.class, Bitmap.class, xakVar);
        ovfVar.d("Bitmap", Bitmap.class, Bitmap.class, new r08(1));
        ovfVar.b(Bitmap.class, ow1Var);
        ovfVar.d("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new nw1(resources, j1gVar));
        ovfVar.d("BitmapDrawable", InputStream.class, BitmapDrawable.class, new nw1(resources, nw1Var));
        ovfVar.d("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new nw1(resources, gpkVar));
        ovfVar.b(BitmapDrawable.class, new z41(2, dx1Var3, ow1Var));
        ovfVar.d("Animation", InputStream.class, xx8.class, new mgi(e2, ca2Var, kn4Var));
        ovfVar.d("Animation", ByteBuffer.class, xx8.class, ca2Var);
        ovfVar.b(xx8.class, new q1f(24));
        ovfVar.c(k9i.class, k9i.class, xakVar);
        ovfVar.d("Bitmap", k9i.class, Bitmap.class, new x92(dx1Var3, 2));
        String str4 = str;
        ovfVar.d(str4, Uri.class, Drawable.class, l1gVar);
        ovfVar.d(str4, Uri.class, Bitmap.class, new nw1(1, l1gVar, dx1Var3));
        ovfVar.h(new ga2(0));
        ovfVar.c(File.class, ByteBuffer.class, new xak(3));
        ovfVar.c(File.class, InputStream.class, new e18(new q1f(23)));
        ovfVar.d(str4, File.class, File.class, new r08(0));
        ovfVar.c(File.class, ParcelFileDescriptor.class, new e18(new ccd()));
        ovfVar.c(File.class, File.class, xakVar);
        ovfVar.h(new m4a(kn4Var));
        if ("robolectric".equals(str2)) {
            i3 = 2;
        } else {
            i3 = 2;
            ovfVar.h(new ga2(2));
        }
        j35 j35Var = new j35(applicationContext, i3);
        j35 j35Var2 = new j35(applicationContext, 0);
        j35 j35Var3 = new j35(applicationContext, 1);
        Class cls = Integer.TYPE;
        ovfVar.c(cls, InputStream.class, j35Var);
        ovfVar.c(Integer.class, InputStream.class, j35Var);
        ovfVar.c(cls, AssetFileDescriptor.class, j35Var2);
        ovfVar.c(Integer.class, AssetFileDescriptor.class, j35Var2);
        ovfVar.c(cls, Drawable.class, j35Var3);
        ovfVar.c(Integer.class, Drawable.class, j35Var3);
        ovfVar.c(Uri.class, InputStream.class, new j35(applicationContext, 7));
        ovfVar.c(Uri.class, AssetFileDescriptor.class, new j35(applicationContext, 6));
        r1g r1gVar = new r1g(resources, 2);
        r1g r1gVar2 = new r1g(resources, 0);
        r1g r1gVar3 = new r1g(resources, 1);
        ovfVar.c(Integer.class, Uri.class, r1gVar);
        ovfVar.c(cls, Uri.class, r1gVar);
        ovfVar.c(Integer.class, AssetFileDescriptor.class, r1gVar2);
        ovfVar.c(cls, AssetFileDescriptor.class, r1gVar2);
        ovfVar.c(Integer.class, InputStream.class, r1gVar3);
        ovfVar.c(cls, InputStream.class, r1gVar3);
        ovfVar.c(String.class, InputStream.class, new yod(1));
        ovfVar.c(Uri.class, InputStream.class, new yod(1));
        ovfVar.c(String.class, InputStream.class, new xak(6));
        ovfVar.c(String.class, ParcelFileDescriptor.class, new xak(5));
        int i5 = 4;
        ovfVar.c(String.class, AssetFileDescriptor.class, new xak(i5));
        ovfVar.c(Uri.class, InputStream.class, new zi0(applicationContext.getAssets(), 1));
        ovfVar.c(Uri.class, AssetFileDescriptor.class, new zi0(applicationContext.getAssets(), 0));
        ovfVar.c(Uri.class, InputStream.class, new j35(applicationContext, i5));
        ovfVar.c(Uri.class, InputStream.class, new j35(applicationContext, 5));
        if (i2 >= 29) {
            ovfVar.c(Uri.class, InputStream.class, new hif(applicationContext, InputStream.class));
            ovfVar.c(Uri.class, ParcelFileDescriptor.class, new hif(applicationContext, ParcelFileDescriptor.class));
        }
        boolean containsKey = ((Map) t9dVar.a).containsKey(iz8.class);
        ovfVar.c(Uri.class, InputStream.class, new gek(contentResolver, containsKey, 2));
        ovfVar.c(Uri.class, ParcelFileDescriptor.class, new gek(contentResolver, containsKey, 1));
        ovfVar.c(Uri.class, AssetFileDescriptor.class, new gek(contentResolver, containsKey, 0));
        ovfVar.c(Uri.class, InputStream.class, new xak(8));
        ovfVar.c(URL.class, InputStream.class, new xak(7));
        ovfVar.c(Uri.class, File.class, new j35(applicationContext, 3));
        int i6 = 2;
        ovfVar.c(qz8.class, InputStream.class, new yod(2));
        ovfVar.c(byte[].class, ByteBuffer.class, new xak(1));
        ovfVar.c(byte[].class, InputStream.class, new xak(i6));
        ovfVar.c(Uri.class, Uri.class, xakVar);
        ovfVar.c(Drawable.class, Drawable.class, xakVar);
        ovfVar.d(str4, Drawable.class, Drawable.class, new r08(i6));
        ovfVar.i(Bitmap.class, BitmapDrawable.class, new dad(resources, 10));
        ovfVar.i(Bitmap.class, byte[].class, zicVar);
        ovfVar.i(Drawable.class, byte[].class, new sx2(dx1Var3, zicVar, ccdVar));
        ovfVar.i(xx8.class, byte[].class, ccdVar);
        gpk gpkVar2 = new gpk(dx1Var3, new y9f(5));
        ovfVar.d("legacy_append", ByteBuffer.class, Bitmap.class, gpkVar2);
        ovfVar.d("legacy_append", ByteBuffer.class, BitmapDrawable.class, new nw1(resources, gpkVar2));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            OkHttpGlideModule okHttpGlideModule = (OkHttpGlideModule) it.next();
            try {
                okHttpGlideModule.a(ovfVar);
            } catch (AbstractMethodError e3) {
                sw9.m("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: ".concat(okHttpGlideModule.getClass().getName()), e3);
                return null;
            }
        }
        return ovfVar;
    }

    public static boolean o(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            if (set.size() == set2.size()) {
                return set.containsAll(set2);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static t9h p(Set set, m3f m3fVar) {
        if (set instanceof SortedSet) {
            Collection collection = (SortedSet) set;
            if (!(collection instanceof t9h)) {
                return new u9h(collection, m3fVar);
            }
            t9h t9hVar = (t9h) collection;
            return new u9h((SortedSet) t9hVar.a, new n3f(Arrays.asList(t9hVar.b, m3fVar)));
        }
        if (set instanceof t9h) {
            t9h t9hVar2 = (t9h) set;
            return new t9h((Set) t9hVar2.a, new n3f(Arrays.asList(t9hVar2.b, m3fVar)));
        }
        set.getClass();
        return new t9h(set, m3fVar);
    }

    public static final List q(pej pejVar, i1d i1dVar) {
        if (i1dVar != null && i1dVar.c != 0) {
            return CollectionsKt.S0(i1dVar.m());
        }
        if (pejVar != null) {
            long j2 = pejVar.a;
            if (!pej.d(j2)) {
                return kotlin.collections.a.c(new p80(new pwh(0L, 0L, (wg8) null, (rg8) null, (sg8) null, (tf8) null, (String) null, 0L, (sn1) null, (zcj) null, (eib) null, 0L, v8j.c, (qah) null, 61439), pej.g(j2), pej.f(j2)));
            }
        }
        return km5.a;
    }

    public static final int r(nlg nlgVar, String str) {
        nlgVar.getClass();
        int F = z1a.F(nlgVar, str);
        if (F >= 0) {
            return F;
        }
        int columnCount = nlgVar.getColumnCount();
        ArrayList arrayList = new ArrayList(columnCount);
        for (int i2 = 0; i2 < columnCount; i2++) {
            arrayList.add(nlgVar.getColumnName(i2));
        }
        throw new IllegalArgumentException("Column '" + str + "' does not exist. Available columns: [" + CollectionsKt.f0(arrayList, null, null, null, null, 63) + ']');
    }

    public static int s(Set set) {
        Iterator it = set.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i2 = ~(~(i2 + (next != null ? next.hashCode() : 0)));
        }
        return i2;
    }

    public static final int t(RemoteViews remoteViews, pxj pxjVar, int i2, int i3, Integer num) {
        if (i2 == -1) {
            a70.p("viewStubId must not be View.NO_ID");
            return 0;
        }
        int intValue = num != null ? num.intValue() : pxjVar.g.incrementAndGet();
        if (intValue != -1) {
            remoteViews.getClass();
            remoteViews.setInt(i2, "setInflatedId", intValue);
        }
        if (i3 != 0) {
            remoteViews.getClass();
            remoteViews.setInt(i2, "setLayoutResource", i3);
        }
        remoteViews.setViewVisibility(i2, 0);
        return intValue;
    }

    public static s9h u(Set set, vv9 vv9Var) {
        z1a.y(set, "set1");
        z1a.y(vv9Var, "set2");
        return new s9h(set, vv9Var);
    }

    public static boolean v(Intent intent, xc xcVar) {
        String str;
        ComponentName component = intent.getComponent();
        boolean j2 = j(component != null ? new xc(component) : null, xcVar);
        String str2 = xcVar.a;
        if (j2) {
            return true;
        }
        if (intent.getComponent() == null && (str = intent.getPackage()) != null) {
            return (str.equals(str2) || H(str, str2)) && xcVar.b.equals("*");
        }
        return false;
    }

    public static final y3g w(Function2 function2, Function1 function1) {
        he3 he3Var = new he3(3, function2);
        i5k.e(1, function1);
        return new y3g(9, he3Var, function1);
    }

    public static gv9 x(Context context, TopPerformanceStatistics topPerformanceStatistics, hub hubVar) {
        return topPerformanceStatistics instanceof FootballTopTeamsStatistics ? y(context, topPerformanceStatistics, rpj.f, hubVar) : topPerformanceStatistics instanceof BasketballTopTeamsStatistics ? y(context, topPerformanceStatistics, opj.e, null) : topPerformanceStatistics instanceof IceHockeyTopTeamsStatistics ? y(context, topPerformanceStatistics, wpj.e, null) : topPerformanceStatistics instanceof HandballTopTeamsStatistics ? y(context, topPerformanceStatistics, upj.e, null) : topPerformanceStatistics instanceof TennisTopTeamsStatistics ? y(context, topPerformanceStatistics, bqj.e, null) : topPerformanceStatistics instanceof RugbyTopTeamsStatistics ? y(context, topPerformanceStatistics, zpj.e, null) : topPerformanceStatistics instanceof VolleyballTopTeamsStatistics ? y(context, topPerformanceStatistics, dqj.e, null) : topPerformanceStatistics instanceof FutsalTopTeamsStatistics ? y(context, topPerformanceStatistics, tpj.e, null) : rlh.b;
    }

    public static gv9 y(Context context, Object obj, List list, hub hubVar) {
        TeamAverageRatingVersion teamAverageRatingVersion;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            cqj cqjVar = (cqj) it.next();
            if (hubVar == null || cqjVar.c(hubVar)) {
                cqjVar.getClass();
                String string = context.getString(cqjVar.d());
                string.getClass();
                List<TopTeamsStatisticsItem> b2 = cqjVar.b(obj);
                if (b2 != null) {
                    Iterator it2 = b2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            teamAverageRatingVersion = null;
                            break;
                        }
                        Object statistics = ((TopTeamsStatisticsItem) it2.next()).getStatistics();
                        BaseTopTeamsStatisticsItem baseTopTeamsStatisticsItem = statistics instanceof BaseTopTeamsStatisticsItem ? (BaseTopTeamsStatisticsItem) statistics : null;
                        teamAverageRatingVersion = baseTopTeamsStatisticsItem != null ? baseTopTeamsStatisticsItem.getAvgRatingVersion() : null;
                        if (teamAverageRatingVersion != null) {
                            break;
                        }
                    }
                    for (TopTeamsStatisticsItem topTeamsStatisticsItem : b2) {
                        String a2 = cqjVar.a(topTeamsStatisticsItem.getStatistics());
                        if (a2 != null) {
                            int id = topTeamsStatisticsItem.getTeam().getId();
                            String p = tba.p(context, topTeamsStatisticsItem.getTeam());
                            Country country = topTeamsStatisticsItem.getTeam().getCountry();
                            arrayList2.add(new aoj(new znj(id, null, Integer.valueOf(topTeamsStatisticsItem.getTeam().getType()), p, country != null ? country.getAlpha2() : null), new umj(string, a2)));
                        }
                    }
                    gv9 W = l6g.W(arrayList2);
                    TeamAverageRatingVersion teamAverageRatingVersion2 = teamAverageRatingVersion;
                    Integer y = qha.y(context, string, "league_top_teams");
                    Integer A = qha.A(context, string, "league_top_teams", false);
                    if (teamAverageRatingVersion2 == null) {
                        teamAverageRatingVersion2 = TeamAverageRatingVersion.ORIGINAL;
                    }
                    arrayList.add(new TopTeamCategoryUiModel(string, W, y, A, teamAverageRatingVersion2));
                    arrayList2.clear();
                } else {
                    arrayList.add(new TopTeamCategoryUiModel(string, rlh.b, null, null, TeamAverageRatingVersion.ORIGINAL));
                }
            }
        }
        return l6g.W(arrayList);
    }

    public abstract void A(k3d k3dVar);

    public abstract void z(xei xeiVar);
}
