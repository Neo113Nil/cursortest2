package defpackage;

import android.app.Application;
import android.app.UiModeManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.widget.Toast;
import androidx.compose.runtime.e;
import androidx.core.app.NotificationCompat;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.blaze.blazesdk.style.shared.models.BlazeDp;
import com.blaze.blazesdk.style.widgets.BlazeWidgetItemTextStyle;
import com.blaze.blazesdk.widgets.models.OverridableValueRemoteDto;
import com.blaze.blazesdk.widgets.models.WidgetItemTextStyleRemoteDto;
import com.ironsource.U3;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.network.response.serializers.EnumSerializerKt;
import com.sofascore.model.newNetwork.TrendingGridTile;
import com.sofascore.model.newNetwork.TrendingGridTileType;
import com.sofascore.results.R;
import com.sofascore.results.manager.ManagerActivity;
import com.sofascore.results.player.PlayerWorker;
import com.sofascore.results.wc26.widget.LaunchWorldCupHomeAction;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty0;
import kotlin.text.MatchGroup;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class bea {
    public static final /* synthetic */ int a = 0;
    public static boolean b;
    public static final /* synthetic */ int c = 0;
    public static UiModeManager d;

    public static final q55 A(yda ydaVar, boolean z, cea ceaVar) {
        if (ydaVar instanceof kea) {
            return ((kea) ydaVar).S(z, ceaVar);
        }
        return ydaVar.H(new s26(1, ceaVar, cea.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 21), ceaVar.l(), z);
    }

    public static final boolean B(CoroutineContext coroutineContext) {
        yda ydaVar = (yda) coroutineContext.get(uic.g);
        if (ydaVar != null) {
            return ydaVar.isActive();
        }
        return true;
    }

    public static nnh C(nnh nnhVar) {
        if (nnhVar instanceof rxj) {
            rxj rxjVar = (rxj) nnhVar;
            if (rxjVar.t == waa.v()) {
                rxjVar.r = null;
                return nnhVar;
            }
        }
        if (nnhVar instanceof sxj) {
            sxj sxjVar = (sxj) nnhVar;
            if (sxjVar.i == waa.v()) {
                sxjVar.h = null;
                return nnhVar;
            }
        }
        nnh e = snh.e(nnhVar, null, false);
        e.j();
        return e;
    }

    public static String D(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            a70.p("Invalid input received");
            return null;
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }

    public static final wtc E(xv4 xv4Var, int i) {
        wtc wtcVar = ((wtc) xv4Var).a.f;
        if (wtcVar == null || (wtcVar.d & i) == 0) {
            return null;
        }
        while (wtcVar != null) {
            int i2 = wtcVar.c;
            if ((i2 & 2) != 0) {
                return null;
            }
            if ((i2 & i) != 0) {
                return wtcVar;
            }
            wtcVar = wtcVar.f;
        }
        return null;
    }

    public static Object F(yx4 yx4Var, Function0 function0) {
        nnh rxjVar;
        nnh nnhVar = (nnh) snh.b.l();
        if (nnhVar instanceof rxj) {
            rxj rxjVar2 = (rxj) nnhVar;
            if (rxjVar2.t == waa.v()) {
                Function1 function1 = rxjVar2.r;
                Function1 function12 = rxjVar2.s;
                try {
                    ((rxj) nnhVar).r = snh.i(yx4Var, function1, true);
                    ((rxj) nnhVar).s = function12;
                    return function0.invoke();
                } finally {
                    rxjVar2.r = function1;
                    rxjVar2.s = function12;
                }
            }
        }
        if (nnhVar == null || (nnhVar instanceof c1d)) {
            rxjVar = new rxj(nnhVar instanceof c1d ? (c1d) nnhVar : null, yx4Var, null, true, false);
        } else {
            rxjVar = nnhVar.u(yx4Var);
        }
        try {
            nnh j = rxjVar.j();
            try {
                Object invoke = function0.invoke();
                nnh.q(j);
                rxjVar.c();
                return invoke;
            } catch (Throwable th) {
                nnh.q(j);
                throw th;
            }
        } catch (Throwable th2) {
            rxjVar.c();
            throw th2;
        }
    }

    public static final void G(Context context, String str) {
        context.getClass();
        if (str == null) {
            return;
        }
        if (!c.v(str, "http://", false) && !c.v(str, "https://", false) && !c.v(str, "market", false)) {
            str = "http://".concat(str);
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            if (StringsKt.J(str, "play.google.com/store", false)) {
                intent.setPackage("com.android.vending");
            } else if (StringsKt.J(str, "appgallery.cloud.huawei.com/marketshare", false)) {
                intent.setPackage("com.huawei.appmarket");
            }
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(context.getApplicationContext(), context.getString(R.string.web_browser_error), 0).show();
        } catch (SecurityException unused2) {
            Toast.makeText(context.getApplicationContext(), context.getString(R.string.web_browser_error), 0).show();
        }
    }

    public static zdc H(String str) {
        str.getClass();
        try {
            return v(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static kyh I(float f) {
        Object u = new bkk(Float.valueOf(f), "lyh", fok.a, wxf.d).L("Ratio must be in range (0.0, 1.0). Use SplitType.expandContainers() instead of 0 or 1.", new s81(f, 9)).u();
        u.getClass();
        float floatValue = ((Number) u).floatValue();
        return new kyh("ratio:" + floatValue, floatValue);
    }

    public static void J(int i, Context context) {
        Pair[] pairArr = {wv8.t(context, "ACTION", "REMOVE_PLAYER"), new Pair("PLAYER_ID", Integer.valueOf(i))};
        hpo hpoVar = new hpo(18);
        for (int i2 = 0; i2 < 2; i2++) {
            Pair pair = pairArr[i2];
            hpoVar.B(pair.b, (String) pair.a);
        }
        md4 l = hpoVar.l();
        vxd.h(context).b("PlayerWorker-".concat(mha.o(l)), nf6.a, (ltd) vxd.g(PlayerWorker.class, l).a());
    }

    public static void K(nnh nnhVar, nnh nnhVar2, Function1 function1) {
        if (nnhVar != nnhVar2) {
            nnhVar2.getClass();
            nnh.q(nnhVar);
            nnhVar2.c();
        } else if (nnhVar instanceof rxj) {
            ((rxj) nnhVar).r = function1;
        } else if (nnhVar instanceof sxj) {
            ((sxj) nnhVar).h = function1;
        } else {
            cp4.g(nnhVar, "Non-transparent snapshot was reused: ");
        }
    }

    public static void L(Window window, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            y9.m(window, z);
        } else {
            if (i >= 30) {
                y9.l(window, z);
                return;
            }
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    public static void M(int i, Context context) {
        context.getClass();
        Intent intent = new Intent(context, (Class<?>) ManagerActivity.class);
        intent.putExtra("MANAGER_ID", i);
        context.startActivity(intent);
    }

    public static final o0k N(int i, TrendingGridTile trendingGridTile) {
        String serialName = EnumSerializerKt.getSerialName(trendingGridTile.getType());
        if (serialName == null) {
            serialName = "";
        }
        return new o0k(i + 1, serialName, trendingGridTile.getType() == TrendingGridTileType.PAID_AD ? "direct" : "internal", Integer.valueOf(trendingGridTile.getId()));
    }

    public static final long O(long j, lna lnaVar) {
        return lnaVar == lna.a ? cn3.a(an3.j(j), an3.h(j), an3.i(j), an3.g(j)) : cn3.a(an3.i(j), an3.g(j), an3.j(j), an3.h(j));
    }

    public static final xtc P(xtc xtcVar, wla wlaVar, Function0 function0, of3 of3Var, int i, int i2) {
        xtcVar.getClass();
        wlaVar.getClass();
        function0.getClass();
        int i3 = (i2 & 2) != 0 ? 45 : 30;
        av8 av8Var = (av8) of3Var;
        Object obj = (u6b) av8Var.k(mhb.a);
        Object O = av8Var.O();
        Object obj2 = nf3.a;
        if (O == obj2) {
            O = e.f(Boolean.FALSE);
            av8Var.n0(O);
        }
        e1d e1dVar = (e1d) O;
        Object[] objArr = new Object[0];
        Object O2 = av8Var.O();
        if (O2 == obj2) {
            O2 = new khk(25);
            av8Var.n0(O2);
        }
        boh bohVar = (boh) o3a.N(objArr, (Function0) O2, av8Var, 48);
        Boolean bool = (Boolean) e1dVar.getValue();
        bool.booleanValue();
        boolean i4 = av8Var.i(obj) | ((((i & 7168) ^ 3072) > 2048 && av8Var.g(null)) || (i & 3072) == 2048) | av8Var.g(bohVar) | ((((i & 896) ^ 384) > 256 && av8Var.e(i3)) || (i & 384) == 256) | ((((57344 & i) ^ 24576) > 16384 && av8Var.g(function0)) || (i & 24576) == 16384);
        Object O3 = av8Var.O();
        if (i4 || O3 == obj2) {
            Object mj5Var = new mj5(obj, e1dVar, i3, function0, bohVar, (rq3) null, 16);
            av8Var.n0(mj5Var);
            O3 = mj5Var;
        }
        hz8.o(av8Var, bool, (Function2) O3);
        Object O4 = av8Var.O();
        if (O4 == obj2) {
            O4 = new eqh(12, e1dVar);
            av8Var.n0(O4);
        }
        return s02.V(xtcVar, 0L, 0.5f, wlaVar, (Function1) O4);
    }

    public static xtc Q(xtc xtcVar, Function0 function0, int i) {
        int i2 = (i & 1) != 0 ? 45 : 30;
        xtcVar.getClass();
        function0.getClass();
        return fqj.q(xtcVar, new zrd(i2, 2, function0));
    }

    public static final Object R(Function1 function1, hoi hoiVar) {
        return y(hoiVar.getContext()).p(new zn6(7, function1), hoiVar);
    }

    public static int S(int i) {
        return (int) (Integer.rotateLeft((int) (i * (-862048943)), 15) * 461845907);
    }

    public static int T(Object obj) {
        return S(obj == null ? 0 : obj.hashCode());
    }

    public static aea a() {
        return new aea(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:183:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x016d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final xtc xtcVar, ksa ksaVar, final p3e p3eVar, final boolean z, final p78 p78Var, final boolean z2, final myd mydVar, fo foVar, pg0 pg0Var, lv1 lv1Var, lg0 lg0Var, final Function1 function1, of3 of3Var, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        ksa ksaVar2;
        av8 av8Var;
        fo foVar2;
        final pg0 pg0Var2;
        final lv1 lv1Var2;
        final lg0 lg0Var2;
        eqf u;
        int i8;
        fo foVar3;
        pg0 pg0Var3;
        lv1 lv1Var3;
        int i9;
        lg0 lg0Var3;
        boolean z3;
        Object O;
        a99 a99Var;
        KProperty0 kProperty0;
        boolean z4;
        Object O2;
        ira iraVar;
        Object O3;
        boolean e;
        Object O4;
        ira iraVar2;
        int i10;
        KProperty0 kProperty02;
        lg0 lg0Var4;
        xtc xtcVar2;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(924924659);
        if ((i & 6) == 0) {
            i4 = (av8Var2.g(xtcVar) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= av8Var2.g(ksaVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= av8Var2.g(p3eVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= av8Var2.h(false) ? a.o : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= av8Var2.h(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i4 |= av8Var2.g(p78Var) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((i & 1572864) == 0) {
            i4 |= av8Var2.h(z2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i & 12582912) == 0) {
            i4 |= av8Var2.g(mydVar) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i4 |= 33554432;
        }
        int i11 = i3 & 512;
        if (i11 != 0) {
            i4 |= 805306368;
        } else if ((i & 805306368) == 0) {
            i4 |= av8Var2.g(foVar) ? 536870912 : 268435456;
        }
        int i12 = i3 & 1024;
        if (i12 != 0) {
            i6 = i2 | 6;
            i5 = i4;
        } else if ((i2 & 6) == 0) {
            i5 = i4;
            i6 = i2 | (av8Var2.g(pg0Var) ? 4 : 2);
        } else {
            i5 = i4;
            i6 = i2;
        }
        int i13 = i3 & a.o;
        if (i13 != 0) {
            i6 |= 48;
            i7 = i13;
        } else if ((i2 & 48) == 0) {
            i7 = i13;
            i6 |= av8Var2.g(lv1Var) ? 32 : 16;
        } else {
            i7 = i13;
        }
        int i14 = i6;
        int i15 = i3 & 4096;
        if (i15 != 0) {
            i14 |= 384;
        } else if ((i2 & 384) == 0) {
            i14 |= av8Var2.g(lg0Var) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
            if ((i2 & 3072) == 0) {
                i14 |= av8Var2.i(function1) ? a.o : 1024;
            }
            if (av8Var2.T(i5 & 1, (i5 & 306783379) == 306783378 || (i14 & 1171) != 1170)) {
                ksaVar2 = ksaVar;
                av8Var = av8Var2;
                av8Var.W();
                foVar2 = foVar;
                pg0Var2 = pg0Var;
                lv1Var2 = lv1Var;
                lg0Var2 = lg0Var;
            } else {
                av8Var2.Y();
                if ((i & 1) == 0 || av8Var2.B()) {
                    i8 = i5 & (-234881025);
                    foVar3 = i11 != 0 ? null : foVar;
                    pg0Var3 = i12 != 0 ? null : pg0Var;
                    lv1Var3 = i7 != 0 ? null : lv1Var;
                    if (i15 != 0) {
                        i9 = i14;
                        lg0Var3 = null;
                        av8Var2.t();
                        int i16 = i8 >> 3;
                        int i17 = i16 & 14;
                        int i18 = i17 | ((i9 >> 6) & 112);
                        int i19 = i8;
                        e1d g = e.g(function1, av8Var2);
                        int i20 = i9;
                        z3 = (((i18 & 14) ^ 6) <= 4 && av8Var2.g(ksaVar)) || (i18 & 6) == 4;
                        O = av8Var2.O();
                        a99Var = nf3.a;
                        if (!z3 || O == a99Var) {
                            xpa xpaVar = new xpa();
                            xpaVar.a = e.c(Integer.MAX_VALUE);
                            xpaVar.b = e.c(Integer.MAX_VALUE);
                            p4h p4hVar = p4h.g;
                            tra traVar = new tra(0, g);
                            l2a l2aVar = goh.a;
                            O = new apa(0, 2, cdi.class, new ay4(new l97(11, new ay4(traVar, p4hVar), ksaVar, xpaVar), p4hVar), U3.i.X, "getValue()Ljava/lang/Object;");
                            av8Var2.n0(O);
                        }
                        kProperty0 = (KProperty0) O;
                        int i21 = i19 >> 9;
                        int i22 = i17 | (i21 & 112);
                        z4 = ((((i22 & 112) ^ 48) <= 32 && av8Var2.h(z)) || (i22 & 48) == 32) | ((((i22 & 14) ^ 6) <= 4 && av8Var2.g(ksaVar)) || (i22 & 6) == 4);
                        O2 = av8Var2.O();
                        if (!z4 || O2 == a99Var) {
                            O2 = new kra(ksaVar, z);
                            av8Var2.n0(O2);
                        }
                        iraVar = (ira) O2;
                        O3 = av8Var2.O();
                        if (O3 == a99Var) {
                            O3 = hz8.G(g.a, av8Var2);
                            av8Var2.n0(O3);
                        }
                        ku3 ku3Var = (ku3) O3;
                        k29 k29Var = (k29) av8Var2.k(dh3.g);
                        jle jleVar = ((Boolean) av8Var2.k(dh3.w)).booleanValue() ? null : gfi.a;
                        int i23 = i20 << 18;
                        int i24 = (i19 & 65520) | (i21 & 3670016) | (i23 & 29360128) | (i23 & 234881024) | ((i20 << 27) & 1879048192);
                        e = ((((i24 & 112) ^ 48) <= 32 && av8Var2.g(ksaVar)) || (i24 & 48) == 32) | ((((i24 & 896) ^ 384) <= 256 && av8Var2.g(p3eVar)) || (i24 & 384) == 256) | ((((i24 & 7168) ^ 3072) <= 2048 && av8Var2.h(false)) || (i24 & 3072) == 2048) | ((((57344 & i24) ^ 24576) <= 16384 && av8Var2.h(z)) || (i24 & 24576) == 16384) | av8Var2.e(0) | ((((i24 & 3670016) ^ 1572864) <= 1048576 && av8Var2.g(foVar3)) || (i24 & 1572864) == 1048576) | ((((i24 & 29360128) ^ 12582912) <= 8388608 && av8Var2.g(lv1Var3)) || (i24 & 12582912) == 8388608) | ((((i24 & 234881024) ^ 100663296) <= 67108864 && av8Var2.g(lg0Var3)) || (i24 & 100663296) == 67108864) | ((((i24 & 1879048192) ^ 805306368) <= 536870912 && av8Var2.g(pg0Var3)) || (i24 & 805306368) == 536870912) | av8Var2.g(k29Var) | av8Var2.g(jleVar);
                        O4 = av8Var2.O();
                        if (!e || O4 == a99Var) {
                            av8Var = av8Var2;
                            pg0 pg0Var4 = pg0Var3;
                            iraVar2 = iraVar;
                            i10 = 4;
                            foVar2 = foVar3;
                            O4 = new bsa(ksaVar, z, p3eVar, kProperty0, pg0Var4, lg0Var3, ku3Var, k29Var, jleVar, foVar2, lv1Var3);
                            kProperty02 = kProperty0;
                            pg0Var3 = pg0Var4;
                            lg0Var4 = lg0Var3;
                            av8Var.n0(O4);
                        } else {
                            kProperty02 = kProperty0;
                            foVar2 = foVar3;
                            av8Var = av8Var2;
                            lg0Var4 = lg0Var3;
                            iraVar2 = iraVar;
                            i10 = 4;
                        }
                        vqa vqaVar = (vqa) O4;
                        ewd ewdVar = !z ? ewd.a : ewd.b;
                        if (z2) {
                            av8Var.d0(-2076718545);
                            av8Var.s(false);
                            xtcVar2 = utc.a;
                        } else {
                            av8Var.d0(-2077147368);
                            boolean e2 = ((((i16 & 14) ^ 6) > i10 && av8Var.g(ksaVar)) || (i16 & 6) == i10) | av8Var.e(0);
                            Object O5 = av8Var.O();
                            if (e2 || O5 == a99Var) {
                                O5 = new pra(ksaVar);
                                av8Var.n0(O5);
                            }
                            xtcVar2 = gvd.F((pra) O5, ksaVar.p, ewdVar);
                            av8Var.s(false);
                        }
                        ksaVar2 = ksaVar;
                        tba.b(kProperty02, kik.X(fkf.G(xtcVar.z(ksaVar.m).z(ksaVar.n), kProperty02, iraVar2, ewdVar, z2).z(xtcVar2).z((xtc) ksaVar.o.k), ksaVar, ewdVar, mydVar, z2, p78Var, ksaVar.g, null), ksaVar2.q, vqaVar, av8Var, 0);
                        pg0Var2 = pg0Var3;
                        lv1Var2 = lv1Var3;
                        lg0Var2 = lg0Var4;
                    }
                } else {
                    av8Var2.W();
                    i8 = i5 & (-234881025);
                    foVar3 = foVar;
                    pg0Var3 = pg0Var;
                    lv1Var3 = lv1Var;
                }
                i9 = i14;
                lg0Var3 = lg0Var;
                av8Var2.t();
                int i162 = i8 >> 3;
                int i172 = i162 & 14;
                int i182 = i172 | ((i9 >> 6) & 112);
                int i192 = i8;
                e1d g2 = e.g(function1, av8Var2);
                int i202 = i9;
                if (((i182 & 14) ^ 6) <= 4) {
                }
                O = av8Var2.O();
                a99Var = nf3.a;
                if (!z3) {
                }
                xpa xpaVar2 = new xpa();
                xpaVar2.a = e.c(Integer.MAX_VALUE);
                xpaVar2.b = e.c(Integer.MAX_VALUE);
                p4h p4hVar2 = p4h.g;
                tra traVar2 = new tra(0, g2);
                l2a l2aVar2 = goh.a;
                O = new apa(0, 2, cdi.class, new ay4(new l97(11, new ay4(traVar2, p4hVar2), ksaVar, xpaVar2), p4hVar2), U3.i.X, "getValue()Ljava/lang/Object;");
                av8Var2.n0(O);
                kProperty0 = (KProperty0) O;
                int i212 = i192 >> 9;
                int i222 = i172 | (i212 & 112);
                z4 = ((((i222 & 112) ^ 48) <= 32 && av8Var2.h(z)) || (i222 & 48) == 32) | ((((i222 & 14) ^ 6) <= 4 && av8Var2.g(ksaVar)) || (i222 & 6) == 4);
                O2 = av8Var2.O();
                if (!z4) {
                }
                O2 = new kra(ksaVar, z);
                av8Var2.n0(O2);
                iraVar = (ira) O2;
                O3 = av8Var2.O();
                if (O3 == a99Var) {
                }
                ku3 ku3Var2 = (ku3) O3;
                k29 k29Var2 = (k29) av8Var2.k(dh3.g);
                jle jleVar2 = ((Boolean) av8Var2.k(dh3.w)).booleanValue() ? null : gfi.a;
                int i232 = i202 << 18;
                int i242 = (i192 & 65520) | (i212 & 3670016) | (i232 & 29360128) | (i232 & 234881024) | ((i202 << 27) & 1879048192);
                e = ((((i242 & 112) ^ 48) <= 32 && av8Var2.g(ksaVar)) || (i242 & 48) == 32) | ((((i242 & 896) ^ 384) <= 256 && av8Var2.g(p3eVar)) || (i242 & 384) == 256) | ((((i242 & 7168) ^ 3072) <= 2048 && av8Var2.h(false)) || (i242 & 3072) == 2048) | ((((57344 & i242) ^ 24576) <= 16384 && av8Var2.h(z)) || (i242 & 24576) == 16384) | av8Var2.e(0) | ((((i242 & 3670016) ^ 1572864) <= 1048576 && av8Var2.g(foVar3)) || (i242 & 1572864) == 1048576) | ((((i242 & 29360128) ^ 12582912) <= 8388608 && av8Var2.g(lv1Var3)) || (i242 & 12582912) == 8388608) | ((((i242 & 234881024) ^ 100663296) <= 67108864 && av8Var2.g(lg0Var3)) || (i242 & 100663296) == 67108864) | ((((i242 & 1879048192) ^ 805306368) <= 536870912 && av8Var2.g(pg0Var3)) || (i242 & 805306368) == 536870912) | av8Var2.g(k29Var2) | av8Var2.g(jleVar2);
                O4 = av8Var2.O();
                if (e) {
                }
                av8Var = av8Var2;
                pg0 pg0Var42 = pg0Var3;
                iraVar2 = iraVar;
                i10 = 4;
                foVar2 = foVar3;
                O4 = new bsa(ksaVar, z, p3eVar, kProperty0, pg0Var42, lg0Var3, ku3Var2, k29Var2, jleVar2, foVar2, lv1Var3);
                kProperty02 = kProperty0;
                pg0Var3 = pg0Var42;
                lg0Var4 = lg0Var3;
                av8Var.n0(O4);
                vqa vqaVar2 = (vqa) O4;
                ewd ewdVar2 = !z ? ewd.a : ewd.b;
                if (z2) {
                }
                ksaVar2 = ksaVar;
                tba.b(kProperty02, kik.X(fkf.G(xtcVar.z(ksaVar.m).z(ksaVar.n), kProperty02, iraVar2, ewdVar2, z2).z(xtcVar2).z((xtc) ksaVar.o.k), ksaVar, ewdVar2, mydVar, z2, p78Var, ksaVar.g, null), ksaVar2.q, vqaVar2, av8Var, 0);
                pg0Var2 = pg0Var3;
                lv1Var2 = lv1Var3;
                lg0Var2 = lg0Var4;
            }
            u = av8Var.u();
            if (u == null) {
                final ksa ksaVar3 = ksaVar2;
                final fo foVar4 = foVar2;
                u.d = new Function2() { // from class: ura
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int K = aba.K(i | 1);
                        int K2 = aba.K(i2);
                        bea.b(xtc.this, ksaVar3, p3eVar, z, p78Var, z2, mydVar, foVar4, pg0Var2, lv1Var2, lg0Var2, function1, (of3) obj, K, K2, i3);
                        return Unit.a;
                    }
                };
                return;
            }
            return;
        }
        if ((i2 & 3072) == 0) {
        }
        if (av8Var2.T(i5 & 1, (i5 & 306783379) == 306783378 || (i14 & 1171) != 1170)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    public static final void c(gv9 gv9Var, xtc xtcVar, of3 of3Var, int i) {
        gv9Var.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(199477182);
        int i2 = (av8Var.g(gv9Var) ? 4 : 2) | i | 48;
        if (av8Var.T(i2 & 1, (i2 & 19) != 18)) {
            utc utcVar = utc.a;
            int i3 = 6;
            s02.n(bkh.d(utcVar, 1.0f), new ng0(4.0f, true, new a70(i3)), new ng0(8.0f, true, new a70(i3)), null, 0, 0, yqo.H(-1686477213, av8Var, new k73(3, gv9Var)), av8Var, 1573296, 56);
            xtcVar = utcVar;
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new y81(gv9Var, xtcVar, i, 15);
        }
    }

    public static final void d(String str, String str2, long j, long j2, xtc xtcVar, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1299452965);
        int i2 = i | (av8Var.g(str) ? 4 : 2) | (av8Var.g(str2) ? 32 : 16) | (av8Var.f(j) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.f(j2) ? a.o : 1024);
        if (av8Var.T(i2 & 1, (i2 & 9363) != 9362)) {
            u23 a2 = t23.a(ww9.d, uxf.p, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, xtcVar);
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
            yf8 yf8Var = xth.a;
            dfj l = xth.l();
            utc utcVar = utc.a;
            xtc g = bkh.g(utcVar, 24.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            lv1 lv1Var = uxf.m;
            udj.c(str, bkh.r(g, lv1Var, 2), j, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, l, av8Var, (i2 & 14) | 48 | (i2 & 896), 0, 131064);
            int i3 = i2 >> 3;
            udj.c(str2, bkh.r(bkh.g(utcVar, 24.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), lv1Var, 2), j2, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.l(), av8Var, (i3 & 14) | 48 | (i3 & 896), 0, 131064);
            av8Var = av8Var;
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new i82(str, str2, j, j2, xtcVar, i);
        }
    }

    public static final void e(gta gtaVar, qbf qbfVar, xtc xtcVar, of3 of3Var, int i) {
        av8 av8Var;
        xtc xtcVar2;
        int i2;
        int i3;
        int i4;
        int i5;
        utc utcVar;
        boolean z;
        boolean z2;
        float f;
        utc utcVar2;
        boolean z3;
        qbf qbfVar2;
        boolean z4;
        int i6;
        int i7;
        gtaVar.getClass();
        qbfVar.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1288731003);
        int i8 = i | (av8Var2.e(gtaVar.ordinal()) ? 4 : 2) | (av8Var2.g(qbfVar) ? 32 : 16) | 384;
        if (av8Var2.T(i8 & 1, (i8 & 147) != 146)) {
            Context context = (Context) av8Var2.k(nz.b);
            Integer num = qbfVar.i;
            boolean z5 = qbfVar.e;
            int intValue = num.intValue();
            if (intValue > 0) {
                i2 = 1519923335;
                i3 = R.color.success;
            } else {
                i2 = 1519923909;
                i3 = R.color.error;
            }
            long f2 = ljg.f(av8Var2, i2, i3, av8Var2, false);
            if (z5) {
                i4 = 1519925936;
                i5 = R.color.primary_highlight;
            } else {
                i4 = 1519926792;
                i5 = R.color.surface_1;
            }
            long f3 = ljg.f(av8Var2, i4, i5, av8Var2, false);
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
                O2 = mce.j;
                av8Var2.n0(O2);
            }
            z9f z9fVar = new z9f((boh) o3a.N(objArr, (Function0) O2, av8Var2, 48), context, gtaVar, qbfVar, 2);
            utc utcVar3 = utc.a;
            xtc e = bkh.e(bkh.d(tol.y(utcVar3, true, true, true, D, wzcVar, z9fVar, av8Var2, 0), 1.0f), 56.0f);
            jf9 jf9Var = oyn.e;
            xtc q = n9e.q(e, f3, jf9Var);
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var2, 0);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m = av8Var2.m();
            xtc C = fqj.C(av8Var2, q);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var2, a2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var2, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var2, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var2, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var2, C, f50Var3);
            xtc e2 = fn0.e(1.0f, bkh.d(utcVar3, 1.0f), true);
            lv1 lv1Var = uxf.m;
            l8g a3 = k8g.a(ww9.b, lv1Var, av8Var2, 48);
            int hashCode2 = Long.hashCode(av8Var2.T);
            aee m2 = av8Var2.m();
            xtc C2 = fqj.C(av8Var2, e2);
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a3, f50Var);
            waa.K(av8Var2, m2, ff3Var);
            bf3.s(hashCode2, av8Var2, f50Var2, av8Var2, ryVar);
            waa.K(av8Var2, C2, f50Var3);
            av8Var2.d0(938373575);
            xtc c2 = bkh.c(bkh.p(utcVar3, 4.0f), 1.0f);
            if (z5) {
                c2 = c2.z(n9e.q(utcVar3, lz.D(R.color.primary_default, av8Var2), jf9Var));
            }
            av8Var2.s(false);
            e12.a(0, av8Var2, c2);
            xtc f0 = l98.f0(utcVar3, 12.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10);
            u23 a4 = t23.a(ww9.f, uxf.p, av8Var2, 54);
            int hashCode3 = Long.hashCode(av8Var2.T);
            aee m3 = av8Var2.m();
            xtc C3 = fqj.C(av8Var2, f0);
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a4, f50Var);
            waa.K(av8Var2, m3, ff3Var);
            bf3.s(hashCode3, av8Var2, f50Var2, av8Var2, ryVar);
            waa.K(av8Var2, C3, f50Var3);
            xtc p = bkh.p(utcVar3, 32.0f);
            String str = qbfVar.b;
            yf8 yf8Var = xth.a;
            udj.c(str, p, lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.m(), av8Var2, 48, 0, 130040);
            av8 av8Var3 = av8Var2;
            int i9 = 6;
            if (intValue != 0) {
                av8Var3.d0(-1602253351);
                l8g a5 = k8g.a(new ng0(2.0f, true, new a70(i9)), lv1Var, av8Var3, 54);
                int hashCode4 = Long.hashCode(av8Var3.T);
                aee m4 = av8Var3.m();
                xtc C4 = fqj.C(av8Var3, utcVar3);
                av8Var3.h0();
                if (av8Var3.S) {
                    av8Var3.l(zg3Var);
                } else {
                    av8Var3.q0();
                }
                waa.K(av8Var3, a5, f50Var);
                waa.K(av8Var3, m4, ff3Var);
                bf3.s(hashCode4, av8Var3, f50Var2, av8Var3, ryVar);
                waa.K(av8Var3, C4, f50Var3);
                udj.c(String.valueOf(Math.abs(intValue)), null, f2, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.g(), av8Var3, 0, 0, 131066);
                av8Var3 = av8Var3;
                z2 = false;
                d7e t = haa.t(R.drawable.ic_position_arrow_up_8, 0, av8Var3);
                utcVar = utcVar3;
                f = 8.0f;
                xtc l = bkh.l(utcVar, 8.0f);
                if (intValue < 0) {
                    l = l.z(haa.v(utcVar, 180.0f));
                }
                kq9.a(t, null, l, f2, av8Var3, 56, 0);
                z = true;
                av8Var3.s(true);
                av8Var3.s(false);
            } else {
                utcVar = utcVar3;
                z = true;
                z2 = false;
                f = 8.0f;
                av8Var3.d0(-1601301961);
                av8Var3.s(false);
            }
            av8Var3.s(z);
            td4.L(48, av8Var3, bkh.l(utcVar, 32.0f), qbfVar.c);
            float f4 = f;
            av8 av8Var4 = av8Var3;
            utc utcVar4 = utcVar;
            udj.c(qbfVar.d, l98.f0(new goa(1.0f, z), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10), lz.D(R.color.n_lv_1, av8Var3), null, 0L, null, 0L, null, null, 0L, 2, false, 2, 0, null, xth.m(), av8Var4, 0, 24960, 110584);
            av8 av8Var5 = av8Var4;
            String str2 = qbfVar.f;
            if (str2 == null) {
                av8Var5.d0(-972975668);
                av8Var5.s(false);
                qbfVar2 = qbfVar;
                z3 = false;
                utcVar2 = utcVar4;
            } else {
                av8Var5.d0(-972975667);
                utcVar2 = utcVar4;
                udj.c(str2, bkh.p(utcVar4, 48.0f), lz.D(R.color.n_lv_1, av8Var5), null, 0L, null, 0L, null, new p7j(6), 0L, 0, false, 2, 0, null, xth.m(), av8Var5, 48, 24576, 113656);
                av8Var5 = av8Var5;
                Unit unit = Unit.a;
                z3 = false;
                av8Var5.s(false);
                qbfVar2 = qbfVar;
            }
            String str3 = qbfVar2.g;
            if (str3 == null) {
                av8Var5.d0(-972619323);
                av8Var5.s(z3);
                z4 = z3;
            } else {
                av8Var5.d0(-972619322);
                av8 av8Var6 = av8Var5;
                udj.c(str3, bkh.p(l98.f0(utcVar2, f4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), 48.0f), lz.D(R.color.n_lv_1, av8Var5), null, 0L, null, 0L, null, new p7j(6), 0L, 0, false, 2, 0, null, xth.m(), av8Var6, 48, 24576, 113656);
                av8Var5 = av8Var6;
                Unit unit2 = Unit.a;
                z4 = false;
                av8Var5.s(false);
            }
            dfj m5 = xth.m();
            if (gtaVar == gta.b) {
                i6 = 938473544;
                i7 = R.color.primary_default;
            } else {
                i6 = 938474334;
                i7 = R.color.n_lv_1;
            }
            av8 av8Var7 = av8Var5;
            udj.c(dmi.q("\u200e", qbfVar.h), bkh.p(l98.f0(utcVar2, f4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10), 48.0f), ljg.f(av8Var5, i6, i7, av8Var5, z4), null, 0L, null, 0L, null, new p7j(6), 0L, 0, false, 2, 0, null, m5, av8Var7, 48, 24576, 113656);
            av8Var7.s(true);
            tz9.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 13, lz.D(R.color.n_lv_4, av8Var7), 0L, av8Var7, null);
            av8Var = av8Var7;
            av8Var.s(true);
            xtcVar2 = utcVar2;
        } else {
            av8Var = av8Var2;
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new wbc(gtaVar, qbfVar, xtcVar2, i, 16);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void f(String str, xtc xtcVar, dfj dfjVar, boolean z, Function0 function0, Integer num, of3 of3Var, int i, int i2) {
        int i3;
        xtc xtcVar2;
        dfj dfjVar2;
        int i4;
        int i5;
        Integer num2;
        xtc xtcVar3;
        dfj dfjVar3;
        Integer num3;
        boolean z2;
        eqf u;
        dfj dfjVar4;
        dfj dfjVar5;
        Integer num4;
        int i6;
        boolean z3;
        boolean z4;
        boolean z5;
        utc utcVar;
        int i7;
        str.getClass();
        function0.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1397153522);
        if ((i & 6) == 0) {
            i3 = (av8Var.g(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            xtcVar2 = xtcVar;
            i3 |= av8Var.g(xtcVar2) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    dfjVar2 = dfjVar;
                    if (av8Var.g(dfjVar2)) {
                        i7 = NotificationCompat.FLAG_LOCAL_ONLY;
                        i3 |= i7;
                    }
                } else {
                    dfjVar2 = dfjVar;
                }
                i7 = 128;
                i3 |= i7;
            } else {
                dfjVar2 = dfjVar;
            }
            i4 = i3 | 3072;
            if ((i & 24576) == 0) {
                i4 |= av8Var.i(function0) ? 16384 : 8192;
            }
            i5 = i2 & 32;
            if (i5 == 0) {
                i4 |= 196608;
            } else if ((196608 & i) == 0) {
                num2 = num;
                i4 |= av8Var.g(num2) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
                if (av8Var.T(i4 & 1, (74899 & i4) != 74898)) {
                    av8Var.Y();
                    int i9 = i & 1;
                    utc utcVar2 = utc.a;
                    if (i9 == 0 || av8Var.B()) {
                        if (i8 != 0) {
                            xtcVar2 = utcVar2;
                        }
                        if ((i2 & 4) != 0) {
                            yf8 yf8Var = xth.a;
                            dfjVar4 = xth.a();
                            i4 &= -897;
                        } else {
                            dfjVar4 = dfjVar2;
                        }
                        if (i5 != 0) {
                            num4 = null;
                            dfjVar5 = dfjVar4;
                        } else {
                            dfjVar5 = dfjVar4;
                            num4 = num2;
                        }
                        i6 = i4;
                        z3 = true;
                    } else {
                        av8Var.W();
                        if ((i2 & 4) != 0) {
                            i4 &= -897;
                        }
                        i6 = i4;
                        dfjVar5 = dfjVar2;
                        num4 = num2;
                        z3 = z;
                    }
                    av8Var.t();
                    av8Var.d0(1660239364);
                    xtc A = wnn.A(xtcVar2, o7g.a(16.0f));
                    if (z3) {
                        boolean z6 = (57344 & i6) == 16384;
                        Object O = av8Var.O();
                        if (z6 || O == nf3.a) {
                            O = new rsd(15, function0);
                            av8Var.n0(O);
                        }
                        z4 = z3;
                        z5 = false;
                        xtc y = tol.y(utcVar2, false, false, false, 0L, null, (Function0) O, av8Var, 31);
                        utcVar = utcVar2;
                        av8Var = av8Var;
                        A = A.z(y);
                    } else {
                        z4 = z3;
                        z5 = false;
                        utcVar = utcVar2;
                    }
                    av8Var.s(z5);
                    xtc b0 = l98.b0(A, 4.0f);
                    l8g a2 = k8g.a(ww9.b, uxf.m, av8Var, 48);
                    int hashCode = Long.hashCode(av8Var.T);
                    aee m = av8Var.m();
                    xtc C = fqj.C(av8Var, b0);
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
                    av8 av8Var2 = av8Var;
                    udj.c(str, null, z4 ? ljg.f(av8Var, 1826228869, R.color.primary_default, av8Var, z5) : ljg.f(av8Var, 1826229659, R.color.n_lv_3, av8Var, z5), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, dfjVar5, av8Var2, i6 & 14, ((i6 << 15) & 29360128) | 24960, 110586);
                    av8Var = av8Var2;
                    if (num4 == null) {
                        av8Var.d0(778670132);
                        av8Var.s(z5);
                    } else {
                        av8Var.d0(778670133);
                        kq9.b(s6a.N(num4.intValue(), ((i6 >> 12) & 112) | 6, av8Var), null, bkh.l(l98.f0(utcVar, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), 16.0f), z4 ? ljg.f(av8Var, -741973553, R.color.primary_default, av8Var, z5) : ljg.f(av8Var, -741972763, R.color.n_lv_3, av8Var, z5), av8Var, 432, 0);
                        av8Var.s(z5);
                    }
                    av8Var.s(true);
                    xtcVar3 = xtcVar2;
                    num3 = num4;
                    dfjVar3 = dfjVar5;
                    z2 = z4;
                } else {
                    av8Var.W();
                    xtcVar3 = xtcVar2;
                    dfjVar3 = dfjVar2;
                    num3 = num2;
                    z2 = z;
                }
                u = av8Var.u();
                if (u != null) {
                    u.d = new vr5(str, xtcVar3, dfjVar3, z2, function0, num3, i, i2);
                    return;
                }
                return;
            }
            num2 = num;
            if (av8Var.T(i4 & 1, (74899 & i4) != 74898)) {
            }
            u = av8Var.u();
            if (u != null) {
            }
        }
        xtcVar2 = xtcVar;
        if ((i & 384) != 0) {
        }
        i4 = i3 | 3072;
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 == 0) {
        }
        num2 = num;
        if (av8Var.T(i4 & 1, (74899 & i4) != 74898)) {
        }
        u = av8Var.u();
        if (u != null) {
        }
    }

    public static final void g(gv9 gv9Var, xtc xtcVar, of3 of3Var, int i) {
        gv9Var.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(733793815);
        int i2 = (av8Var.g(gv9Var) ? 4 : 2) | i;
        boolean z = false;
        boolean z2 = true;
        if (av8Var.T(i2 & 1, (i2 & 19) != 18)) {
            l8g a2 = k8g.a(new ng0(2.0f, true, new a70(6)), uxf.l, av8Var, 6);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, xtcVar);
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
            Iterator p = ljg.p(av8Var, C, hf3.d, 83487866, gv9Var);
            while (p.hasNext()) {
                String str = (String) p.next();
                yf8 yf8Var = xth.a;
                av8 av8Var2 = av8Var;
                udj.c(str, new goa(1.0f, z2), lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 1, 0, null, xth.b(), av8Var2, 0, 24960, 109560);
                z2 = true;
                z = z;
                av8Var = av8Var2;
            }
            av8Var.s(z);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new y81(gv9Var, xtcVar, i, 19);
        }
    }

    public static final void h(skl sklVar, vy8 vy8Var, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(607450172);
        int i2 = (av8Var.i(sklVar) ? 4 : 2) | i | (av8Var.g(vy8Var) ? 32 : 16);
        if (av8Var.T(i2 & 1, (i2 & 19) != 18)) {
            nq8.g(h5a.O(nq8.A(vy8Var), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1), 0, 0, yqo.H(598362528, av8Var, new uri(sklVar, 23)), av8Var, 3072, 6);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new bmj(sklVar, vy8Var, i, 24);
        }
    }

    public static final void i(int i, vy8 vy8Var, of3 of3Var, int i2) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-787838449);
        int i3 = (av8Var.e(i) ? 4 : 2) | i2 | 48;
        int i4 = 18;
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            Context context = (Context) av8Var.k(bh3.b);
            ty8 ty8Var = ty8.a;
            nq8.g(nq8.A(ty8Var), 0, 1, yqo.H(1317667443, av8Var, new sj(context, i, 6)), av8Var, 3072, 2);
            vy8Var = ty8Var;
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new n61(i, vy8Var, i2, i4);
        }
    }

    public static final void j(skl sklVar, vy8 vy8Var, Bitmap bitmap, Integer num, int i, of3 of3Var, int i2) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1666745964);
        int i3 = i2 | (av8Var.i(sklVar) ? 4 : 2) | 48 | (av8Var.i(bitmap) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.g(num) ? a.o : 1024) | (av8Var.e(i) ? 16384 : 8192);
        if (av8Var.T(i3 & 1, (i3 & 9363) != 9362)) {
            vy8Var = ty8.a;
            rd0.b(j72.x(h5a.N(nq8.z(vy8Var), 8.0f).d(new fy0(new v20(R.drawable.wc_widget_background))), new x9g(LaunchWorldCupHomeAction.class, zm2.A((lc[]) Arrays.copyOf(new lc[0], 0)))), 0, 0, yqo.H(828089438, av8Var, new ti(bitmap, num, sklVar, i)), av8Var, 3072, 6);
        } else {
            av8Var.W();
        }
        vy8 vy8Var2 = vy8Var;
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new b1j(sklVar, vy8Var2, bitmap, num, i, i2);
        }
    }

    public static final void k(Bitmap bitmap, Integer num, vy8 vy8Var, of3 of3Var, int i) {
        vy8 vy8Var2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-548820179);
        int i2 = (av8Var.i(bitmap) ? 4 : 2) | i | (av8Var.g(num) ? 32 : 16) | 384;
        if (av8Var.T(i2 & 1, (i2 & 147) != 146)) {
            Context context = (Context) av8Var.k(bh3.b);
            ty8 ty8Var = ty8.a;
            nq8.g(nq8.A(ty8Var), 0, 1, yqo.H(636009033, av8Var, new zya(17, bitmap, context, num)), av8Var, 3072, 2);
            vy8Var2 = ty8Var;
        } else {
            av8Var.W();
            vy8Var2 = vy8Var;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new dgl(bitmap, num, vy8Var2, i, 7);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void l(WidgetItemTextStyleRemoteDto widgetItemTextStyleRemoteDto, BlazeWidgetItemTextStyle blazeWidgetItemTextStyle) {
        int textColor;
        String gravity;
        int gravity2;
        Application application$blazesdk_release;
        int identifier;
        blazeWidgetItemTextStyle.getClass();
        OverridableValueRemoteDto<String> fontFileName = widgetItemTextStyleRemoteDto.getFontFileName();
        Integer num = null;
        if (fontFileName != null) {
            String value = fontFileName.getValue();
            blazeWidgetItemTextStyle.setFontResId((value == null || (application$blazesdk_release = BlazeSDK.INSTANCE.getApplication$blazesdk_release()) == null || (identifier = application$blazesdk_release.getResources().getIdentifier(value, "font", application$blazesdk_release.getPackageName())) == 0) ? null : Integer.valueOf(identifier));
        }
        Float letterSpacing = widgetItemTextStyleRemoteDto.getLetterSpacing();
        if (letterSpacing == null) {
            letterSpacing = blazeWidgetItemTextStyle.getLetterSpacing();
        }
        blazeWidgetItemTextStyle.setLetterSpacing(letterSpacing);
        String textColor2 = widgetItemTextStyleRemoteDto.getTextColor();
        if (textColor2 != null) {
            Application application$blazesdk_release2 = BlazeSDK.INSTANCE.getApplication$blazesdk_release();
            Integer b2 = application$blazesdk_release2 != null ? cnb.b(application$blazesdk_release2, textColor2) : null;
            if (b2 != null) {
                textColor = b2.intValue();
                blazeWidgetItemTextStyle.setTextColor(textColor);
                Float textSize = widgetItemTextStyleRemoteDto.getTextSize();
                blazeWidgetItemTextStyle.setTextSize(textSize == null ? textSize.floatValue() : blazeWidgetItemTextStyle.getTextSize());
                Integer lineHeight = widgetItemTextStyleRemoteDto.getLineHeight();
                blazeWidgetItemTextStyle.setLineHeight(lineHeight == null ? new BlazeDp(lineHeight.intValue()) : blazeWidgetItemTextStyle.getLineHeight());
                Integer maxNumberOfLines = widgetItemTextStyleRemoteDto.getMaxNumberOfLines();
                blazeWidgetItemTextStyle.setMaxLines(maxNumberOfLines == null ? maxNumberOfLines.intValue() : blazeWidgetItemTextStyle.getMaxLines());
                gravity = widgetItemTextStyleRemoteDto.getGravity();
                if (gravity != null) {
                    switch (gravity.hashCode()) {
                        case -1381826445:
                            if (gravity.equals("CLIP_HORIZONTAL")) {
                                num = 8;
                                break;
                            }
                            break;
                        case -1235462112:
                            if (gravity.equals("CENTER_VERTICAL")) {
                                num = 16;
                                break;
                            }
                            break;
                        case -1034002336:
                            if (gravity.equals("FILL_HORIZONTAL")) {
                                num = 7;
                                break;
                            }
                            break;
                        case -686033330:
                            if (gravity.equals("CENTER_HORIZONTAL")) {
                                num = 1;
                                break;
                            }
                            break;
                        case -520741198:
                            if (gravity.equals("FILL_VERTICAL")) {
                                num = 112;
                                break;
                            }
                            break;
                        case -141402704:
                            if (gravity.equals("NO_GRAVITY")) {
                                num = 0;
                                break;
                            }
                            break;
                        case 68795:
                            if (gravity.equals("END")) {
                                num = 8388613;
                                break;
                            }
                            break;
                        case 83253:
                            if (gravity.equals("TOP")) {
                                num = 48;
                                break;
                            }
                            break;
                        case 2157955:
                            if (gravity.equals("FILL")) {
                                num = Integer.valueOf(Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE);
                                break;
                            }
                            break;
                        case 2332679:
                            if (gravity.equals("LEFT")) {
                                num = 3;
                                break;
                            }
                            break;
                        case 77974012:
                            if (gravity.equals("RIGHT")) {
                                num = 5;
                                break;
                            }
                            break;
                        case 79219778:
                            if (gravity.equals("START")) {
                                num = 8388611;
                                break;
                            }
                            break;
                        case 1056548741:
                            if (gravity.equals("CLIP_VERTICAL")) {
                                num = 128;
                                break;
                            }
                            break;
                        case 1965067819:
                            if (gravity.equals("BOTTOM")) {
                                num = 80;
                                break;
                            }
                            break;
                        case 1984282709:
                            if (gravity.equals("CENTER")) {
                                num = 17;
                                break;
                            }
                            break;
                    }
                    if (num != null) {
                        gravity2 = num.intValue();
                        blazeWidgetItemTextStyle.setGravity(gravity2);
                    }
                }
                gravity2 = blazeWidgetItemTextStyle.getGravity();
                blazeWidgetItemTextStyle.setGravity(gravity2);
            }
        }
        textColor = blazeWidgetItemTextStyle.getTextColor();
        blazeWidgetItemTextStyle.setTextColor(textColor);
        Float textSize2 = widgetItemTextStyleRemoteDto.getTextSize();
        blazeWidgetItemTextStyle.setTextSize(textSize2 == null ? textSize2.floatValue() : blazeWidgetItemTextStyle.getTextSize());
        Integer lineHeight2 = widgetItemTextStyleRemoteDto.getLineHeight();
        blazeWidgetItemTextStyle.setLineHeight(lineHeight2 == null ? new BlazeDp(lineHeight2.intValue()) : blazeWidgetItemTextStyle.getLineHeight());
        Integer maxNumberOfLines2 = widgetItemTextStyleRemoteDto.getMaxNumberOfLines();
        blazeWidgetItemTextStyle.setMaxLines(maxNumberOfLines2 == null ? maxNumberOfLines2.intValue() : blazeWidgetItemTextStyle.getMaxLines());
        gravity = widgetItemTextStyleRemoteDto.getGravity();
        if (gravity != null) {
        }
        gravity2 = blazeWidgetItemTextStyle.getGravity();
        blazeWidgetItemTextStyle.setGravity(gravity2);
    }

    public static void m(int i, Context context) {
        Pair[] pairArr = {wv8.t(context, "ACTION", "ADD_PLAYER"), new Pair("PLAYER_ID", Integer.valueOf(i))};
        hpo hpoVar = new hpo(18);
        for (int i2 = 0; i2 < 2; i2++) {
            Pair pair = pairArr[i2];
            hpoVar.B(pair.b, (String) pair.a);
        }
        md4 l = hpoVar.l();
        vxd.h(context).b("PlayerWorker-".concat(mha.o(l)), nf6.a, (ltd) vxd.g(PlayerWorker.class, l).a());
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object n(g6b g6bVar, sq3 sq3Var) {
        g7b g7bVar;
        int i;
        g6b g6bVar2;
        fsf fsfVar;
        Throwable th;
        t6b t6bVar;
        t6b t6bVar2;
        if (sq3Var instanceof g7b) {
            g7bVar = (g7b) sq3Var;
            int i2 = g7bVar.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                g7bVar.u = i2 - Integer.MIN_VALUE;
                Object obj = g7bVar.t;
                lu3 lu3Var = lu3.a;
                i = g7bVar.u;
                int i3 = 1;
                if (i != 0) {
                    y6a.M(obj);
                    if (g6bVar.b().compareTo(e6b.d) >= 0) {
                        return Unit.a;
                    }
                    fsf fsfVar2 = new fsf();
                    try {
                        g7bVar.r = g6bVar;
                        g7bVar.s = fsfVar2;
                        g7bVar.u = 1;
                        lj2 lj2Var = new lj2(1, z9a.b(g7bVar));
                        lj2Var.t();
                        h hVar = new h(lj2Var, i3);
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
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fsfVar = g7bVar.s;
                    g6bVar2 = g7bVar.r;
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
        g7bVar = new g7b(sq3Var);
        Object obj2 = g7bVar.t;
        lu3 lu3Var2 = lu3.a;
        i = g7bVar.u;
        int i32 = 1;
        if (i != 0) {
        }
        t6bVar2 = (t6b) fsfVar.a;
        if (t6bVar2 != null) {
        }
        return Unit.a;
    }

    public static final void o(yda ydaVar, String str, Throwable th) {
        ydaVar.e(ml4.e(str, th));
    }

    public static final void p(CoroutineContext coroutineContext, CancellationException cancellationException) {
        yda ydaVar = (yda) coroutineContext.get(uic.g);
        if (ydaVar != null) {
            ydaVar.e(cancellationException);
        }
    }

    public static final Object q(yda ydaVar, sq3 sq3Var) {
        ydaVar.e(null);
        Object Z = ydaVar.Z(sq3Var);
        return Z == lu3.a ? Z : Unit.a;
    }

    public static void r(xag xagVar) {
        tbg tbgVar = ((zag) xagVar).j;
        if (tbgVar != null) {
            tbgVar.closeAdView(false);
        } else {
            Intrinsics.i("adViewController");
            throw null;
        }
    }

    public static long s(long j, lna lnaVar) {
        lna lnaVar2 = lna.a;
        return cn3.a(lnaVar == lnaVar2 ? an3.j(j) : an3.i(j), lnaVar == lnaVar2 ? an3.h(j) : an3.g(j), lnaVar == lnaVar2 ? an3.i(j) : an3.j(j), lnaVar == lnaVar2 ? an3.g(j) : an3.h(j));
    }

    public static long t(int i, long j) {
        return cn3.a(0, an3.h(j), (i & 4) != 0 ? an3.i(j) : 0, an3.g(j));
    }

    public static final void u(CoroutineContext coroutineContext) {
        yda ydaVar = (yda) coroutineContext.get(uic.g);
        if (ydaVar != null && !ydaVar.isActive()) {
            throw ydaVar.k();
        }
    }

    public static zdc v(String str) {
        str.getClass();
        txb d2 = zdc.e.d(0, str);
        if (d2 == null) {
            a70.p(dmi.j('\"', "No subtype found for: \"", str));
            return null;
        }
        String str2 = (String) ((sxb) d2.a()).get(1);
        Locale locale = Locale.ROOT;
        String lowerCase = str2.toLowerCase(locale);
        lowerCase.getClass();
        String lowerCase2 = ((String) ((sxb) d2.a()).get(2)).toLowerCase(locale);
        lowerCase2.getClass();
        ArrayList arrayList = new ArrayList();
        int i = d2.b().b;
        while (true) {
            int i2 = i + 1;
            if (i2 >= str.length()) {
                return new zdc(str, lowerCase, (String[]) arrayList.toArray(new String[0]), lowerCase2);
            }
            txb d3 = zdc.f.d(i2, str);
            if (d3 == null) {
                i3c.j("Parameter is not formatted correctly: \"", str.substring(i2), "\" for: \"", str, 34);
                return null;
            }
            a5 a5Var = d3.c;
            MatchGroup c2 = a5Var.c(1);
            String str3 = c2 != null ? c2.a : null;
            if (str3 == null) {
                i = d3.b().b;
            } else {
                MatchGroup c3 = a5Var.c(2);
                String str4 = c3 != null ? c3.a : null;
                if (str4 == null) {
                    MatchGroup c4 = a5Var.c(3);
                    c4.getClass();
                    str4 = c4.a;
                } else if (StringsKt.c0(str4, '\'') && StringsKt.L(str4, '\'') && str4.length() > 2) {
                    str4 = wv8.h(1, 1, str4);
                }
                arrayList.add(str3);
                arrayList.add(str4);
                i = d3.b().b;
            }
        }
    }

    public static nnh w() {
        return (nnh) snh.b.l();
    }

    public static final yda x(CoroutineContext coroutineContext) {
        yda ydaVar = (yda) coroutineContext.get(uic.g);
        if (ydaVar != null) {
            return ydaVar;
        }
        cp4.g(coroutineContext, "Current context doesn't contain Job in it: ");
        return null;
    }

    public static final wuc y(CoroutineContext coroutineContext) {
        wuc wucVar = (wuc) coroutineContext.get(hjg.e);
        if (wucVar != null) {
            return wucVar;
        }
        a70.r("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
        return null;
    }

    public static final d1g z(aej aejVar, int i) {
        zdj zdjVar = aejVar.a;
        eyc eycVar = aejVar.b;
        if (zdjVar.a.b.length() != 0) {
            int d2 = eycVar.d(i);
            if ((i != 0 && d2 == eycVar.d(i - 1)) || (i != zdjVar.a.b.length() && d2 == eycVar.d(i + 1))) {
                return aejVar.a(i);
            }
        }
        return aejVar.i(i);
    }
}
