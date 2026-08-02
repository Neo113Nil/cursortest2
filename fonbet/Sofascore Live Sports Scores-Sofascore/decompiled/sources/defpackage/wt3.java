package defpackage;

import android.content.SharedPreferences;
import android.os.Parcel;
import android.view.View;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.ironsource.InterfaceC4060ee;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.sofascore.model.mvvm.model.Status;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.Tournament;
import com.sofascore.model.newNetwork.statistics.season.player.AmericanFootballPlayerSeasonStatistics;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class wt3 implements vh2 {
    public static final /* synthetic */ int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28};

    public static void A(String str, String str2, StringBuilder sb, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
    }

    public static int B(int i, int i2, int i3, int i4) {
        return i + i2 + i3 + i4;
    }

    public static /* synthetic */ int C(int i) {
        if (i != 0) {
            return i - 1;
        }
        throw null;
    }

    public static /* synthetic */ int[] D(int i) {
        int[] iArr = new int[i];
        System.arraycopy(a, 0, iArr, 0, i);
        return iArr;
    }

    public static /* synthetic */ int a(int i, int i2) {
        if (i == 0 || i2 == 0) {
            throw null;
        }
        return i - i2;
    }

    public static /* synthetic */ boolean b(int i, int i2) {
        if (i != 0) {
            return i == i2;
        }
        throw null;
    }

    public static /* synthetic */ byte c(int i) {
        switch (i) {
            case 1:
                return (byte) 0;
            case 2:
                return (byte) 1;
            case 3:
                return (byte) 2;
            case 4:
                return (byte) 3;
            case 5:
                return (byte) 4;
            case 6:
                return (byte) 5;
            default:
                throw null;
        }
    }

    public static /* synthetic */ int d(int i) {
        switch (i) {
            case 1:
                return -1;
            case 2:
                return 100;
            case 3:
                return 1010;
            case 4:
                return 200;
            case 5:
                return Sdk.SDKError.Reason.MRAID_ERROR_VALUE;
            case 6:
                return Sdk.SDKError.Reason.INVALID_IFA_STATUS_VALUE;
            case 7:
                return 303;
            case 8:
                return 400;
            case 9:
                return TTAdConstant.AD_ID_IS_NULL_CODE;
            case 10:
                return 403;
            case 11:
                return 500;
            case 12:
                return 502;
            case 13:
                return PglCryptUtils.COMPRESS_FAILED;
            case 14:
                return IronSourceError.ERROR_BN_LOAD_WHILE_LONG_INITIATION;
            case 15:
                return 900;
            case 16:
                return 1009;
            case 17:
                return 1005;
            case 18:
                return 1007;
            case 19:
                return TTAdConstant.IMAGE_MODE_1012;
            case 20:
                return 1101;
            case 21:
                return 1205;
            case 22:
                return InterfaceC4060ee.a.e;
            case 23:
                return 1207;
            case 24:
                return 1208;
            default:
                throw null;
        }
    }

    public static float e(float f, float f2, float f3, float f4) {
        return ((f - f2) / f3) + f4;
    }

    public static int f(int i, int i2, int i3, int i4) {
        return ((i - i2) / i3) + i4;
    }

    public static int h(int i, int i2, int i3, int i4, int i5) {
        return i + i2 + i3 + i4 + i5;
    }

    public static fka i(Object obj) {
        y6a.M(obj);
        return new fka();
    }

    public static fka j(String str) {
        r3a.c(str);
        return new fka();
    }

    public static String k(AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics, Integer num) {
        return rei.l(yid.m(americanFootballPlayerSeasonStatistics.getAppearances()), num);
    }

    public static String l(String str, int i, AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics, boolean z) {
        str.getClass();
        return zt.a(americanFootballPlayerSeasonStatistics, Integer.valueOf(i), z);
    }

    public static String m(String str, String str2, StringBuilder sb, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    public static String n(StringBuilder sb, float f, char c) {
        sb.append(f);
        sb.append(c);
        return sb.toString();
    }

    public static String o(StringBuilder sb, Exception exc, char c) {
        sb.append(exc);
        sb.append(c);
        return sb.toString();
    }

    public static String p(StringBuilder sb, boolean z, String str) {
        sb.append(z);
        sb.append(str);
        return sb.toString();
    }

    public static StringBuilder q(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder r(String str, SimpleTypeMarker simpleTypeMarker, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(simpleTypeMarker);
        sb.append(str2);
        return sb;
    }

    public static void s(int i, int i2, int i3, int i4, int i5) {
        nik.N(i);
        nik.N(i2);
        nik.N(i3);
        nik.N(i4);
        nik.N(i5);
    }

    public static void t(int i, String str, String str2, String str3, StringBuilder sb) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(i);
    }

    public static void u(int i, String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(i);
        sb.append(str2);
    }

    public static void v(SharedPreferences sharedPreferences, String str, boolean z) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.getClass();
        edit.putBoolean(str, z);
        edit.apply();
    }

    public static void w(Parcel parcel, int i, Float f) {
        parcel.writeInt(i);
        parcel.writeFloat(f.floatValue());
    }

    public static void x(Tournament tournament, String str, Status status, Team team, Team team2) {
        tournament.getClass();
        str.getClass();
        status.getClass();
        team.getClass();
        team2.getClass();
    }

    public static void y(Integer num, View view, Object obj) {
        num.getClass();
        view.getClass();
        obj.getClass();
    }

    public static /* synthetic */ void z(Object obj) {
        if (obj == null) {
            return;
        }
        pvd.j();
    }
}
