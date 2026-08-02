package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.media.Image;
import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.os.Trace;
import android.util.Base64;
import android.view.View;
import androidx.compose.runtime.e;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.core.app.NotificationCompat;
import androidx.viewpager2.widget.ViewPager2;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.facebook.w;
import com.google.android.gms.internal.play_billing.zzhm;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.results.R;
import com.sofascore.results.league.service.ShortcutWorker;
import com.sofascore.results.main.start.StartActivity;
import com.sofascore.results.mvvm.base.AbstractActivity;
import com.sofascore.results.stagesport.fragments.raceFlow.RaceFlowModels$RaceEntrant;
import com.sofascore.results.stagesport.fragments.raceFlow.RaceFlowModels$RaceTeam;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.network.model.HttpRequest;
import com.vungle.ads.internal.protos.Sdk;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.net.URL;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.b;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class q5a {
    public static final /* synthetic */ int a = 0;
    public static final /* synthetic */ int b = 0;
    public static final /* synthetic */ int c = 0;
    public static final /* synthetic */ int d = 0;
    public static final /* synthetic */ int e = 0;
    public static final /* synthetic */ int f = 0;

    public static final k7d A(Context context) {
        context.getClass();
        k7d k7dVar = new k7d(context);
        k6d k6dVar = k7dVar.b;
        z8d z8dVar = k6dVar.s;
        z8dVar.a(new le3(z8dVar));
        z8d z8dVar2 = k6dVar.s;
        z8dVar2.a(new oe3());
        z8dVar2.a(new y15());
        return k7dVar;
    }

    public static void B() {
        if (lik.a >= 18) {
            Trace.endSection();
        }
    }

    public static void C(StartActivity startActivity) {
        Pair[] pairArr = {new Pair("ACTION", "FIRST_INIT")};
        hpo hpoVar = new hpo(18);
        Pair pair = pairArr[0];
        hpoVar.B(pair.b, (String) pair.a);
        md4 l = hpoVar.l();
        ktd g = vxd.g(ShortcutWorker.class, l);
        Context applicationContext = startActivity.getApplicationContext();
        applicationContext.getClass();
        xbl d2 = xbl.d(applicationContext);
        d2.getClass();
        d2.b("ShortcutWorker-".concat(mha.o(l)), nf6.a, (ltd) g.a());
    }

    public static final void D(vkk vkkVar, Map map) {
        List list;
        map.getClass();
        mlk mlkVar = vkkVar.b;
        if (mlkVar == null || (list = mlkVar.a) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((llk) obj).c == 15) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((llk) it.next()).a);
        }
        g7a.w(map, arrayList2, "verificationNotExecuted");
    }

    public static final PublicKey E(String str) {
        byte[] decode = Base64.decode(c.r(c.r(c.r(str, "\n", "", false), "-----BEGIN PUBLIC KEY-----", "", false), "-----END PUBLIC KEY-----", "", false), 0);
        decode.getClass();
        PublicKey generatePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(decode));
        generatePublic.getClass();
        return generatePublic;
    }

    public static final String F(String str) {
        str.getClass();
        URL url = new URL(HttpRequest.DEFAULT_SCHEME, "www." + w.s, "/.well-known/oauth/openid/keys/");
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition newCondition = reentrantLock.newCondition();
        fsf fsfVar = new fsf();
        w.c().execute(new dp1(url, fsfVar, str, reentrantLock, newCondition, 2));
        reentrantLock.lock();
        try {
            newCondition.await(5000L, TimeUnit.MILLISECONDS);
            reentrantLock.unlock();
            return (String) fsfVar.a;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static File G(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i = 0; i < 100; i++) {
            File file = new File(cacheDir, ljg.j(i, str));
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    public static final void H(AbstractActivity abstractActivity, View view, ViewPager2 viewPager2, Function1 function1, Function1 function12) {
        view.getClass();
        viewPager2.getClass();
        stk viewModelStore = abstractActivity.getViewModelStore();
        qtk s = ufa.s(abstractActivity);
        ly3 r = ufa.r(abstractActivity);
        viewModelStore.getClass();
        s.getClass();
        r.getClass();
        g7h g7hVar = new g7h(viewModelStore, s, r);
        KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(dsi.class);
        orCreateKotlinClass.getClass();
        String qualifiedName = orCreateKotlinClass.getQualifiedName();
        if (qualifiedName != null) {
            new ng2(abstractActivity, (dsi) g7hVar.u("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(qualifiedName), orCreateKotlinClass), view, viewPager2, new k1e(16, function1), function12);
        } else {
            a70.p("Local and anonymous classes can not be ViewModels");
        }
    }

    public static void I(AbstractActivity abstractActivity, s8 s8Var) {
        g2i g2iVar = new g2i(s8Var, 17);
        rfi rfiVar = new rfi(13);
        s8Var.getClass();
        H(abstractActivity, s8Var.p, s8Var.j, g2iVar, rfiVar);
    }

    public static MappedByteBuffer J(Context context, Uri uri) {
        ParcelFileDescriptor openFileDescriptor;
        try {
            openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
        } catch (IOException unused) {
        }
        if (openFileDescriptor == null) {
            if (openFileDescriptor != null) {
                openFileDescriptor.close();
                return null;
            }
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                openFileDescriptor.close();
                return map;
            } finally {
            }
        } finally {
        }
    }

    public static final boolean K(ViewPager2 viewPager2, int i) {
        viewPager2.getClass();
        if (i == -1 || i == viewPager2.getCurrentItem()) {
            return false;
        }
        viewPager2.c(i, true);
        return true;
    }

    public static final o5a L(CharSequence charSequence, d3 d3Var) {
        o5a o5aVar = o5a.c;
        charSequence.getClass();
        d3Var.getClass();
        try {
            return uj4.a((uj4) d3Var.c(charSequence));
        } catch (IllegalArgumentException e2) {
            throw new gk4("Failed to parse an instant from '" + ((Object) charSequence) + '\'', e2);
        }
    }

    public static dg4 M(String str, e3c e3cVar, ida idaVar, ad2 ad2Var, int i) {
        if ((i & 2) != 0) {
            e3cVar = null;
        }
        Function1 function1 = idaVar;
        if ((i & 4) != 0) {
            function1 = new b1f(12);
        }
        if ((i & 8) != 0) {
            hs4 hs4Var = z45.a;
            ad2Var = s9a.c(hq4.c.plus(tz9.o()));
        }
        return new dg4(str, e3cVar, function1, ad2Var);
    }

    public static final k7d N(y8d[] y8dVarArr, of3 of3Var) {
        av8 av8Var = (av8) of3Var;
        Context context = (Context) av8Var.k(nz.b);
        Object[] copyOf = Arrays.copyOf(y8dVarArr, y8dVarArr.length);
        y3g y3gVar = new y3g(9, new mpa(13), new vt(context, 8));
        boolean i = av8Var.i(context);
        Object O = av8Var.O();
        if (i || O == nf3.a) {
            O = new c6(context, 29);
            av8Var.n0(O);
        }
        k7d k7dVar = (k7d) o3a.L(copyOf, y3gVar, null, (Function0) O, av8Var, 0, 4);
        for (y8d y8dVar : y8dVarArr) {
            k7dVar.b.s.a(y8dVar);
        }
        return k7dVar;
    }

    public static final Bitmap O(Image image) {
        Image.Plane[] planes = image.getPlanes();
        planes.getClass();
        Image.Plane plane = planes[0];
        int height = image.getHeight() * image.getWidth();
        int[] iArr = new int[height];
        plane.getBuffer().asIntBuffer().get(iArr);
        for (int i = 0; i < height; i++) {
            int i2 = iArr[i];
            iArr[i] = hkg.s0(hkg.c(i2 & 255, (i2 >> 8) & 255, (i2 >> 16) & 255, (i2 >> 24) & 255));
        }
        return Bitmap.createBitmap(iArr, image.getWidth(), image.getHeight(), Bitmap.Config.ARGB_8888);
    }

    public static final boolean P(PublicKey publicKey, String str, String str2) {
        publicKey.getClass();
        str2.getClass();
        try {
            Signature signature = Signature.getInstance("SHA256withRSA");
            signature.initVerify(publicKey);
            byte[] bytes = str.getBytes(Charsets.UTF_8);
            bytes.getClass();
            signature.update(bytes);
            byte[] decode = Base64.decode(str2, 8);
            decode.getClass();
            return signature.verify(decode);
        } catch (Exception unused) {
            return false;
        }
    }

    public static final zzhm Q(Object obj, Object obj2) {
        zzhm zzhmVar = (zzhm) obj;
        zzhm zzhmVar2 = (zzhm) obj2;
        if (!zzhmVar2.isEmpty()) {
            if (!zzhmVar.a) {
                zzhmVar = zzhmVar.g();
            }
            zzhmVar.i();
            if (!zzhmVar2.isEmpty()) {
                zzhmVar.putAll(zzhmVar2);
            }
        }
        return zzhmVar;
    }

    public static Object R(Field field, Object obj) {
        try {
            return field.get(obj);
        } catch (IllegalAccessException e2) {
            ilg.k(e2);
            return null;
        }
    }

    public static final void a(RaceFlowModels$RaceEntrant raceFlowModels$RaceEntrant, xtc xtcVar, of3 of3Var, int i) {
        xtc xtcVar2;
        long j;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1282926574);
        int i2 = i | (av8Var.g(raceFlowModels$RaceEntrant) ? 4 : 2) | 48;
        if (av8Var.T(i2 & 1, (i2 & 19) != 18)) {
            lv1 lv1Var = uxf.m;
            utc utcVar = utc.a;
            xtc d0 = l98.d0(bkh.d(utcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, 1);
            l8g a2 = k8g.a(ww9.b, lv1Var, av8Var, 48);
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
            int i3 = raceFlowModels$RaceEntrant.b;
            RaceFlowModels$RaceTeam raceFlowModels$RaceTeam = raceFlowModels$RaceEntrant.e;
            r13 r13Var = raceFlowModels$RaceTeam != null ? new r13(hkg.b(raceFlowModels$RaceTeam.c)) : null;
            if (r13Var == null) {
                j = ljg.f(av8Var, -70822263, R.color.neutral_default, av8Var, false);
            } else {
                av8Var.d0(-70823658);
                av8Var.s(false);
                j = r13Var.a;
            }
            h5a.s(i3, 0, j, av8Var, null);
            nq8.h(av8Var, bkh.p(utcVar, 4.0f));
            xtc p = bkh.p(utcVar, 32.0f);
            String str = raceFlowModels$RaceEntrant.c;
            yf8 yf8Var = xth.a;
            xtcVar2 = utcVar;
            udj.c(str, p, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var, 48, 24960, 110584);
            nq8.h(av8Var, bkh.p(xtcVar2, 12.0f));
            udj.c(raceFlowModels$RaceEntrant.d, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.g(), av8Var, 0, 24960, 110586);
            av8Var = av8Var;
            av8Var.s(true);
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new gme(raceFlowModels$RaceEntrant, xtcVar2, i, 21);
        }
    }

    public static final void b(ec9 ec9Var, xtc xtcVar, String str, of3 of3Var, int i) {
        int i2;
        boolean z;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(220633464);
        if ((i & 6) == 0) {
            i2 = (av8Var.g(ec9Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.g(xtcVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var.g(str) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if (av8Var.T(i2 & 1, (i2 & 147) != 146)) {
            av8Var.Y();
            if ((i & 1) != 0 && !av8Var.B()) {
                av8Var.W();
            }
            av8Var.t();
            xjc xjcVar = ec9Var.b;
            Integer num = xjcVar.g;
            int i3 = (num != null && num.intValue() == 1) ? xjcVar.b : xjcVar.c;
            Context context = (Context) av8Var.k(nz.b);
            xtc q = n9e.q(wnn.A(xtcVar, o7g.a(8.0f)), lz.D(R.color.surface_2, av8Var), oyn.e);
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
                O2 = jxa.d;
                av8Var.n0(O2);
            }
            xtc d0 = l98.d0(tol.y(q, true, true, true, D, wzcVar, new gi(17, (boh) o3a.N(objArr, (Function0) O2, av8Var, 48), context, ec9Var), av8Var, 0), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
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
            f50 f50Var = hf3.g;
            waa.K(av8Var, a2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            utc utcVar = utc.a;
            int i4 = i2;
            td4.G(i3, bkh.l(utcVar, 32.0f), false, 0L, av8Var, 48, 12);
            nq8.h(av8Var, bkh.p(utcVar, 16.0f));
            xtc d02 = l98.d0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 1);
            p4h p4hVar = ww9.d;
            u23 a3 = t23.a(p4hVar, uxf.o, av8Var, 0);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, d02);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, f50Var);
            waa.K(av8Var, m2, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            yf8 yf8Var = xth.a;
            udj.c(str, null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.c(), av8Var, (i4 >> 6) & 14, 0, 131066);
            udj.c(ec9Var.a, l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.l(), av8Var, 48, 24960, 110584);
            av8Var.s(true);
            nq8.h(av8Var, new goa(1.0f, true));
            kv1 kv1Var = uxf.p;
            xtc x = gz8.x(utcVar, null, null, 3);
            u23 a4 = t23.a(p4hVar, kv1Var, av8Var, 48);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C3 = fqj.C(av8Var, x);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a4, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C3, f50Var3);
            av8Var.d0(-2125345324);
            int i5 = xjcVar.b;
            String str2 = xjcVar.f;
            int i6 = xjcVar.c;
            Integer num2 = xjcVar.d;
            int intValue = num2 != null ? num2.intValue() : 0;
            Integer num3 = xjcVar.e;
            rha.d(i5, i6, intValue, num3 != null ? num3.intValue() : 0, xjcVar.g, null, lz.D(R.color.surface_1, av8Var), 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 0, 0, 1952);
            av8Var = av8Var;
            if (str2 == null || str2.length() == 0) {
                z = false;
                av8Var.d0(1682997039);
                av8Var.s(false);
            } else {
                av8Var.d0(1682731245);
                udj.c(l4a.O(str2), l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.c(), av8Var, 48, 0, 131064);
                av8Var = av8Var;
                z = false;
                av8Var.s(false);
            }
            Unit unit = Unit.a;
            ljg.t(av8Var, z, true, true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new zt7(ec9Var, xtcVar, str, i, 10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0404  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(sxa sxaVar, Function1 function1, xtc xtcVar, lrh lrhVar, boolean z, String str, String str2, of3 of3Var, int i, int i2) {
        int i3;
        boolean z2;
        String str3;
        int i4;
        String str4;
        int i5;
        int i6;
        lrh lrhVar2;
        boolean z3;
        String str5;
        String str6;
        eqf u;
        lrh lrhVar3;
        String str7;
        int i7;
        String str8;
        boolean z4;
        String str9;
        Object O;
        a99 a99Var;
        lrh lrhVar4;
        boolean z5;
        boolean i8;
        Object O2;
        boolean z6;
        rxa rxaVar;
        Object O3;
        boolean z7;
        av8 av8Var;
        boolean z8;
        Object O4;
        zg3 zg3Var;
        ec9 ec9Var;
        String str10;
        boolean z9;
        utc utcVar;
        pr4 pr4Var;
        sxaVar.getClass();
        function1.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-582702745);
        int i9 = (av8Var2.g(sxaVar) ? 4 : 2) | i | (av8Var2.i(function1) ? 32 : 16);
        if ((i & 384) == 0) {
            i9 |= av8Var2.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        int i10 = i2 & 8;
        if (i10 != 0) {
            i9 |= 3072;
        } else if ((i & 3072) == 0) {
            i9 |= av8Var2.g(lrhVar) ? a.o : 1024;
            i3 = i2 & 16;
            if (i3 == 0) {
                i9 |= 24576;
            } else if ((i & 24576) == 0) {
                z2 = z;
                i9 |= av8Var2.h(z2) ? 16384 : 8192;
                if ((i2 & 32) == 0) {
                    str3 = str;
                    if (av8Var2.g(str3)) {
                        i4 = 131072;
                        int i11 = i9 | i4;
                        if ((i2 & 64) != 0) {
                            str4 = str2;
                            if (av8Var2.g(str4)) {
                                i5 = ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                                i6 = i11 | i5;
                                if (av8Var2.T(i6 & 1, (i6 & 599187) != 599186)) {
                                    av8Var2.Y();
                                    if ((i & 1) == 0 || av8Var2.B()) {
                                        lrhVar3 = i10 != 0 ? jrh.m : lrhVar;
                                        if (i3 != 0) {
                                            z2 = false;
                                        }
                                        if ((i2 & 32) != 0) {
                                            str7 = oea.v(R.string.football_historical_data, av8Var2);
                                            i6 &= -458753;
                                        } else {
                                            str7 = str3;
                                        }
                                        if ((i2 & 64) != 0) {
                                            String upperCase = oea.v(R.string.winner, av8Var2).toUpperCase(Locale.ROOT);
                                            upperCase.getClass();
                                            i7 = i6 & (-3670017);
                                            str8 = str7;
                                            str9 = upperCase;
                                            z4 = z2;
                                            av8Var2.t();
                                            Context context = (Context) av8Var2.k(nz.b);
                                            View view = (View) av8Var2.k(nz.f);
                                            O = av8Var2.O();
                                            a99Var = nf3.a;
                                            if (O == a99Var) {
                                                O = e.f(Boolean.TRUE);
                                                av8Var2.n0(O);
                                            }
                                            e1d e1dVar = (e1d) O;
                                            av8Var2.d0(-1631568055);
                                            xtc d2 = bkh.d(xtcVar, 1.0f);
                                            utc utcVar2 = utc.a;
                                            if (z4) {
                                                lrhVar4 = lrhVar3;
                                            } else {
                                                lrhVar4 = lrhVar3;
                                                d2 = d2.z(n9e.q(utcVar2, lz.D(R.color.surface_1, av8Var2), o7g.a(16.0f)));
                                            }
                                            xtc xtcVar2 = d2;
                                            av8Var2.s(false);
                                            xtc f0 = l98.f0(xtcVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                                            ng0 ng0Var = new ng0(8.0f, true, new a70(6));
                                            kv1 kv1Var = uxf.o;
                                            u23 a2 = t23.a(ng0Var, kv1Var, av8Var2, 6);
                                            int hashCode = Long.hashCode(av8Var2.T);
                                            aee m = av8Var2.m();
                                            xtc C = fqj.C(av8Var2, f0);
                                            if3.k7.getClass();
                                            zg3 zg3Var2 = hf3.b;
                                            av8Var2.h0();
                                            z5 = z4;
                                            if (av8Var2.S) {
                                                av8Var2.q0();
                                            } else {
                                                av8Var2.l(zg3Var2);
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
                                            String str11 = str8;
                                            xtc d0 = l98.d0(bkh.d(utcVar2, 1.0f), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                                            kg0 kg0Var = ww9.h;
                                            lv1 lv1Var = uxf.m;
                                            l8g a3 = k8g.a(kg0Var, lv1Var, av8Var2, 54);
                                            int hashCode2 = Long.hashCode(av8Var2.T);
                                            aee m2 = av8Var2.m();
                                            xtc C2 = fqj.C(av8Var2, d0);
                                            av8Var2.h0();
                                            if (av8Var2.S) {
                                                av8Var2.q0();
                                            } else {
                                                av8Var2.l(zg3Var2);
                                            }
                                            waa.K(av8Var2, a3, f50Var);
                                            waa.K(av8Var2, m2, ff3Var);
                                            bf3.s(hashCode2, av8Var2, f50Var2, av8Var2, ryVar);
                                            waa.K(av8Var2, C2, f50Var3);
                                            yf8 yf8Var = xth.a;
                                            udj.c(str11, null, lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.i(), av8Var2, (i7 >> 15) & 14, 0, 131066);
                                            String v = oea.v(R.string.see_more, av8Var2);
                                            int i12 = i7 & 14;
                                            i8 = av8Var2.i(context) | (i12 != 4);
                                            O2 = av8Var2.O();
                                            if (!i8 || O2 == a99Var) {
                                                z6 = true;
                                                O2 = new ixa(1 == true ? 1 : 0, context, sxaVar);
                                                av8Var2.n0(O2);
                                            } else {
                                                z6 = true;
                                            }
                                            tz9.s(0, 4, av8Var2, null, v, (Function0) O2);
                                            av8Var2.s(z6);
                                            xtc d3 = bkh.d(utcVar2, 1.0f);
                                            gv9 gv9Var = sxaVar.b;
                                            rxaVar = sxaVar.d;
                                            if (rxaVar == null) {
                                                vt2 vt2Var = (vt2) CollectionsKt.firstOrNull(gv9Var);
                                                rxaVar = vt2Var != null ? (rxa) vt2Var.a : null;
                                            }
                                            boolean z10 = (i7 & 112) != 32;
                                            O3 = av8Var2.O();
                                            z7 = z10;
                                            int i13 = 10;
                                            if (!z7 || O3 == a99Var) {
                                                O3 = new uj8(i13, function1);
                                                av8Var2.n0(O3);
                                            }
                                            String str12 = str9;
                                            lrh lrhVar5 = lrhVar4;
                                            trh.a(gv9Var, rxaVar, (Function1) O3, d3, null, null, lrhVar5, false, false, false, null, null, av8Var2, ((i7 << 9) & 3670016) | 3072, 4016);
                                            av8Var = av8Var2;
                                            z8 = i12 != 4;
                                            O4 = av8Var.O();
                                            if (!z8 || O4 == a99Var) {
                                                O4 = new sr8(sxaVar, 23);
                                                av8Var.n0(O4);
                                            }
                                            pr4 b2 = c6e.b(0, (Function0) O4, av8Var, 6, 2);
                                            xtc x = gz8.x(n9e.q(l98.d0(bkh.d(utcVar2, 1.0f), !z5 ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), lz.D(R.color.surface_1, av8Var), o7g.a(16.0f)), null, null, 3);
                                            u23 a4 = t23.a(ww9.d, kv1Var, av8Var, 0);
                                            int hashCode3 = Long.hashCode(av8Var.T);
                                            aee m3 = av8Var.m();
                                            xtc C3 = fqj.C(av8Var, x);
                                            av8Var.h0();
                                            if (av8Var.S) {
                                                zg3Var = zg3Var2;
                                                av8Var.q0();
                                            } else {
                                                zg3Var = zg3Var2;
                                                av8Var.l(zg3Var);
                                            }
                                            waa.K(av8Var, a4, f50Var);
                                            waa.K(av8Var, m3, ff3Var);
                                            bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar);
                                            waa.K(av8Var, C3, f50Var3);
                                            ec9Var = sxaVar.f;
                                            if (ec9Var != null) {
                                                av8Var.d0(1580123433);
                                                z9 = false;
                                                av8Var.s(false);
                                                str10 = str12;
                                            } else {
                                                av8Var.d0(1580123434);
                                                str10 = str12;
                                                b(ec9Var, l98.f0(bkh.d(utcVar2, 1.0f), 8.0f, z5 ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : 8.0f, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8), str10, av8Var, (i7 >> 12) & 896);
                                                Unit unit = Unit.a;
                                                z9 = false;
                                                av8Var.s(false);
                                            }
                                            k1c c2 = e12.c(uxf.g, z9);
                                            int hashCode4 = Long.hashCode(av8Var.T);
                                            aee m4 = av8Var.m();
                                            xtc C4 = fqj.C(av8Var, utcVar2);
                                            av8Var.h0();
                                            if (av8Var.S) {
                                                av8Var.q0();
                                            } else {
                                                av8Var.l(zg3Var);
                                            }
                                            waa.K(av8Var, c2, f50Var);
                                            waa.K(av8Var, m4, ff3Var);
                                            bf3.s(hashCode4, av8Var, f50Var2, av8Var, ryVar);
                                            waa.K(av8Var, C4, f50Var3);
                                            boolean booleanValue = ((Boolean) e1dVar.getValue()).booleanValue();
                                            av8Var.d0(780550235);
                                            xtc d02 = l98.d0(bkh.d(utcVar2, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1);
                                            if (z5) {
                                                utcVar = utcVar2;
                                                pr4Var = b2;
                                            } else {
                                                Object O5 = av8Var.O();
                                                if (O5 == a99Var) {
                                                    O5 = new fw6(16, e1dVar);
                                                    av8Var.n0(O5);
                                                }
                                                xtc u2 = i9a.u(utcVar2, view, b2, (Function1) O5, av8Var, 3072);
                                                utcVar = utcVar2;
                                                pr4Var = b2;
                                                av8Var = av8Var;
                                                d02 = d02.z(u2);
                                            }
                                            xtc xtcVar3 = d02;
                                            av8Var.s(false);
                                            av8 av8Var3 = av8Var;
                                            f6a.a(pr4Var, xtcVar3, l98.C(pr4Var.k() == pr4Var.n() + (-1) ? 8.0f : 32.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, pr4Var.k() == pr4Var.n() + (-1) ? 8.0f : 32.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10), null, pr4Var.n(), 8.0f, lv1Var, null, booleanValue, null, null, null, yqo.H(102732570, av8Var, new jw5(sxaVar, 9)), av8Var3, 1769472, 24576, 16008);
                                            av8Var2 = av8Var3;
                                            s6a.a(sxaVar.e, n12.a.a(utcVar, uxf.j), av8Var2, 0);
                                            ljg.t(av8Var2, true, true, true);
                                            str5 = str11;
                                            str6 = str10;
                                            lrhVar2 = lrhVar5;
                                            z3 = z5;
                                        } else {
                                            i7 = i6;
                                            str8 = str7;
                                            z4 = z2;
                                        }
                                    } else {
                                        av8Var2.W();
                                        if ((i2 & 32) != 0) {
                                            i6 &= -458753;
                                        }
                                        if ((i2 & 64) != 0) {
                                            i6 &= -3670017;
                                        }
                                        lrhVar3 = lrhVar;
                                        i7 = i6;
                                        z4 = z2;
                                        str8 = str3;
                                    }
                                    str9 = str4;
                                    av8Var2.t();
                                    Context context2 = (Context) av8Var2.k(nz.b);
                                    View view2 = (View) av8Var2.k(nz.f);
                                    O = av8Var2.O();
                                    a99Var = nf3.a;
                                    if (O == a99Var) {
                                    }
                                    e1d e1dVar2 = (e1d) O;
                                    av8Var2.d0(-1631568055);
                                    xtc d22 = bkh.d(xtcVar, 1.0f);
                                    utc utcVar22 = utc.a;
                                    if (z4) {
                                    }
                                    xtc xtcVar22 = d22;
                                    av8Var2.s(false);
                                    xtc f02 = l98.f0(xtcVar22, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                                    ng0 ng0Var2 = new ng0(8.0f, true, new a70(6));
                                    kv1 kv1Var2 = uxf.o;
                                    u23 a22 = t23.a(ng0Var2, kv1Var2, av8Var2, 6);
                                    int hashCode5 = Long.hashCode(av8Var2.T);
                                    aee m5 = av8Var2.m();
                                    xtc C5 = fqj.C(av8Var2, f02);
                                    if3.k7.getClass();
                                    zg3 zg3Var22 = hf3.b;
                                    av8Var2.h0();
                                    z5 = z4;
                                    if (av8Var2.S) {
                                    }
                                    f50 f50Var4 = hf3.g;
                                    waa.K(av8Var2, a22, f50Var4);
                                    ff3 ff3Var2 = hf3.f;
                                    waa.K(av8Var2, m5, ff3Var2);
                                    Integer valueOf2 = Integer.valueOf(hashCode5);
                                    f50 f50Var22 = hf3.j;
                                    waa.K(av8Var2, valueOf2, f50Var22);
                                    ry ryVar2 = hf3.k;
                                    waa.J(av8Var2, ryVar2);
                                    f50 f50Var32 = hf3.d;
                                    waa.K(av8Var2, C5, f50Var32);
                                    String str112 = str8;
                                    xtc d03 = l98.d0(bkh.d(utcVar22, 1.0f), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                                    kg0 kg0Var2 = ww9.h;
                                    lv1 lv1Var2 = uxf.m;
                                    l8g a32 = k8g.a(kg0Var2, lv1Var2, av8Var2, 54);
                                    int hashCode22 = Long.hashCode(av8Var2.T);
                                    aee m22 = av8Var2.m();
                                    xtc C22 = fqj.C(av8Var2, d03);
                                    av8Var2.h0();
                                    if (av8Var2.S) {
                                    }
                                    waa.K(av8Var2, a32, f50Var4);
                                    waa.K(av8Var2, m22, ff3Var2);
                                    bf3.s(hashCode22, av8Var2, f50Var22, av8Var2, ryVar2);
                                    waa.K(av8Var2, C22, f50Var32);
                                    yf8 yf8Var2 = xth.a;
                                    udj.c(str112, null, lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.i(), av8Var2, (i7 >> 15) & 14, 0, 131066);
                                    String v2 = oea.v(R.string.see_more, av8Var2);
                                    int i122 = i7 & 14;
                                    i8 = av8Var2.i(context2) | (i122 != 4);
                                    O2 = av8Var2.O();
                                    if (i8) {
                                    }
                                    z6 = true;
                                    O2 = new ixa(1 == true ? 1 : 0, context2, sxaVar);
                                    av8Var2.n0(O2);
                                    tz9.s(0, 4, av8Var2, null, v2, (Function0) O2);
                                    av8Var2.s(z6);
                                    xtc d32 = bkh.d(utcVar22, 1.0f);
                                    gv9 gv9Var2 = sxaVar.b;
                                    rxaVar = sxaVar.d;
                                    if (rxaVar == null) {
                                    }
                                    if ((i7 & 112) != 32) {
                                    }
                                    O3 = av8Var2.O();
                                    z7 = z10;
                                    int i132 = 10;
                                    if (!z7) {
                                    }
                                    O3 = new uj8(i132, function1);
                                    av8Var2.n0(O3);
                                    String str122 = str9;
                                    lrh lrhVar52 = lrhVar4;
                                    trh.a(gv9Var2, rxaVar, (Function1) O3, d32, null, null, lrhVar52, false, false, false, null, null, av8Var2, ((i7 << 9) & 3670016) | 3072, 4016);
                                    av8Var = av8Var2;
                                    if (i122 != 4) {
                                    }
                                    O4 = av8Var.O();
                                    if (!z8) {
                                    }
                                    O4 = new sr8(sxaVar, 23);
                                    av8Var.n0(O4);
                                    pr4 b22 = c6e.b(0, (Function0) O4, av8Var, 6, 2);
                                    xtc x2 = gz8.x(n9e.q(l98.d0(bkh.d(utcVar22, 1.0f), !z5 ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), lz.D(R.color.surface_1, av8Var), o7g.a(16.0f)), null, null, 3);
                                    u23 a42 = t23.a(ww9.d, kv1Var2, av8Var, 0);
                                    int hashCode32 = Long.hashCode(av8Var.T);
                                    aee m32 = av8Var.m();
                                    xtc C32 = fqj.C(av8Var, x2);
                                    av8Var.h0();
                                    if (av8Var.S) {
                                    }
                                    waa.K(av8Var, a42, f50Var4);
                                    waa.K(av8Var, m32, ff3Var2);
                                    bf3.s(hashCode32, av8Var, f50Var22, av8Var, ryVar2);
                                    waa.K(av8Var, C32, f50Var32);
                                    ec9Var = sxaVar.f;
                                    if (ec9Var != null) {
                                    }
                                    k1c c22 = e12.c(uxf.g, z9);
                                    int hashCode42 = Long.hashCode(av8Var.T);
                                    aee m42 = av8Var.m();
                                    xtc C42 = fqj.C(av8Var, utcVar22);
                                    av8Var.h0();
                                    if (av8Var.S) {
                                    }
                                    waa.K(av8Var, c22, f50Var4);
                                    waa.K(av8Var, m42, ff3Var2);
                                    bf3.s(hashCode42, av8Var, f50Var22, av8Var, ryVar2);
                                    waa.K(av8Var, C42, f50Var32);
                                    boolean booleanValue2 = ((Boolean) e1dVar2.getValue()).booleanValue();
                                    av8Var.d0(780550235);
                                    xtc d022 = l98.d0(bkh.d(utcVar22, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1);
                                    if (z5) {
                                    }
                                    xtc xtcVar32 = d022;
                                    av8Var.s(false);
                                    av8 av8Var32 = av8Var;
                                    f6a.a(pr4Var, xtcVar32, l98.C(pr4Var.k() == pr4Var.n() + (-1) ? 8.0f : 32.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, pr4Var.k() == pr4Var.n() + (-1) ? 8.0f : 32.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10), null, pr4Var.n(), 8.0f, lv1Var2, null, booleanValue2, null, null, null, yqo.H(102732570, av8Var, new jw5(sxaVar, 9)), av8Var32, 1769472, 24576, 16008);
                                    av8Var2 = av8Var32;
                                    s6a.a(sxaVar.e, n12.a.a(utcVar, uxf.j), av8Var2, 0);
                                    ljg.t(av8Var2, true, true, true);
                                    str5 = str112;
                                    str6 = str10;
                                    lrhVar2 = lrhVar52;
                                    z3 = z5;
                                } else {
                                    av8Var2.W();
                                    lrhVar2 = lrhVar;
                                    z3 = z2;
                                    str5 = str3;
                                    str6 = str4;
                                }
                                u = av8Var2.u();
                                if (u != null) {
                                    u.d = new x72(sxaVar, function1, xtcVar, lrhVar2, z3, str5, str6, i, i2);
                                    return;
                                }
                                return;
                            }
                        } else {
                            str4 = str2;
                        }
                        i5 = 524288;
                        i6 = i11 | i5;
                        if (av8Var2.T(i6 & 1, (i6 & 599187) != 599186)) {
                        }
                        u = av8Var2.u();
                        if (u != null) {
                        }
                    }
                } else {
                    str3 = str;
                }
                i4 = C.DEFAULT_BUFFER_SEGMENT_SIZE;
                int i112 = i9 | i4;
                if ((i2 & 64) != 0) {
                }
                i5 = 524288;
                i6 = i112 | i5;
                if (av8Var2.T(i6 & 1, (i6 & 599187) != 599186)) {
                }
                u = av8Var2.u();
                if (u != null) {
                }
            }
            z2 = z;
            if ((i2 & 32) == 0) {
            }
            i4 = C.DEFAULT_BUFFER_SEGMENT_SIZE;
            int i1122 = i9 | i4;
            if ((i2 & 64) != 0) {
            }
            i5 = 524288;
            i6 = i1122 | i5;
            if (av8Var2.T(i6 & 1, (i6 & 599187) != 599186)) {
            }
            u = av8Var2.u();
            if (u != null) {
            }
        }
        i3 = i2 & 16;
        if (i3 == 0) {
        }
        z2 = z;
        if ((i2 & 32) == 0) {
        }
        i4 = C.DEFAULT_BUFFER_SEGMENT_SIZE;
        int i11222 = i9 | i4;
        if ((i2 & 64) != 0) {
        }
        i5 = 524288;
        i6 = i11222 | i5;
        if (av8Var2.T(i6 & 1, (i6 & 599187) != 599186)) {
        }
        u = av8Var2.u();
        if (u != null) {
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0467, code lost:
    
        if (r6.equals(com.sofascore.model.mvvm.model.StatusKt.STATUS_IN_PROGRESS) == false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0477, code lost:
    
        if (r6.equals(com.sofascore.model.mvvm.model.StatusKt.STATUS_SUSPENDED) != false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0488, code lost:
    
        if (r6.equals(com.sofascore.model.mvvm.model.StatusKt.STATUS_INTERRUPTED) == false) goto L116;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x05d8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x07f2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x07fb  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0823  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0866  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0827  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x07ff  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x06b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(xel xelVar, Function1 function1, of3 of3Var, int i) {
        zg3 zg3Var;
        boolean z;
        int i2;
        boolean z2;
        long f2;
        int i3;
        int g;
        long f3;
        wn1 wn1Var;
        String str;
        utc utcVar;
        f50 f50Var;
        f50 f50Var2;
        ff3 ff3Var;
        ry ryVar;
        f50 f50Var3;
        zg3 zg3Var2;
        av8 av8Var;
        ry ryVar2;
        f50 f50Var4;
        zg3 zg3Var3;
        String str2;
        zg3 zg3Var4;
        wn1 wn1Var2;
        String O;
        boolean f4;
        Object O2;
        lv1 lv1Var = uxf.m;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(810437901);
        int i4 = i | (av8Var2.g(xelVar) ? 4 : 2) | (av8Var2.i(function1) ? 32 : 16);
        if (av8Var2.T(i4 & 1, (i4 & 19) != 18)) {
            wn1 wn1Var3 = xelVar.a;
            Context context = (Context) av8Var2.k(nz.b);
            utc utcVar2 = utc.a;
            xtc q = n9e.q(wnn.A(bkh.d(utcVar2, 1.0f), o7g.a(8.0f)), lz.D(R.color.on_color_highlight_2, av8Var2), oyn.e);
            boolean g2 = ((i4 & 112) == 32) | av8Var2.g(wn1Var3);
            Object O3 = av8Var2.O();
            a99 a99Var = nf3.a;
            if (g2 || O3 == a99Var) {
                O3 = new eel(function1, wn1Var3);
                av8Var2.n0(O3);
            }
            xtc c0 = l98.c0(tol.y(q, false, false, false, 0L, null, (Function0) O3, av8Var2, 31), 16.0f, 8.0f);
            kv1 kv1Var = uxf.p;
            u23 a2 = t23.a(ww9.e, kv1Var, av8Var2, 54);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m = av8Var2.m();
            xtc C = fqj.C(av8Var2, c0);
            if3.k7.getClass();
            zg3 zg3Var5 = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var5);
            } else {
                av8Var2.q0();
            }
            f50 f50Var5 = hf3.g;
            waa.K(av8Var2, a2, f50Var5);
            ff3 ff3Var2 = hf3.f;
            waa.K(av8Var2, m, ff3Var2);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var6 = hf3.j;
            waa.K(av8Var2, valueOf, f50Var6);
            ry ryVar3 = hf3.k;
            waa.J(av8Var2, ryVar3);
            f50 f50Var7 = hf3.d;
            waa.K(av8Var2, C, f50Var7);
            xtc d2 = bkh.d(utcVar2, 1.0f);
            lv1 lv1Var2 = uxf.n;
            wxf wxfVar = ww9.b;
            l8g a3 = k8g.a(wxfVar, lv1Var2, av8Var2, 48);
            int hashCode2 = Long.hashCode(av8Var2.T);
            aee m2 = av8Var2.m();
            xtc C2 = fqj.C(av8Var2, d2);
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var5);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a3, f50Var5);
            waa.K(av8Var2, m2, ff3Var2);
            bf3.s(hashCode2, av8Var2, f50Var6, av8Var2, ryVar3);
            waa.K(av8Var2, C2, f50Var7);
            if (1.0f <= 0.0d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            goa goaVar = new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            p4h p4hVar = ww9.d;
            u23 a4 = t23.a(p4hVar, kv1Var, av8Var2, 48);
            int hashCode3 = Long.hashCode(av8Var2.T);
            aee m3 = av8Var2.m();
            xtc C3 = fqj.C(av8Var2, goaVar);
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var5);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a4, f50Var5);
            waa.K(av8Var2, m3, ff3Var2);
            bf3.s(hashCode3, av8Var2, f50Var6, av8Var2, ryVar3);
            waa.K(av8Var2, C3, f50Var7);
            int i5 = wn1Var3.b;
            long j = wn1Var3.p;
            Integer num = wn1Var3.k;
            Integer num2 = wn1Var3.j;
            Integer num3 = wn1Var3.u;
            td4.G(i5, bkh.l(utcVar2, 24.0f), false, 0L, av8Var2, 48, 12);
            xtc f0 = l98.f0(utcVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            String str3 = wn1Var3.e;
            if (str3 == null) {
                str3 = wn1Var3.d;
            }
            yf8 yf8Var = xth.a;
            udj.c(str3, f0, lz.D(R.color.on_color_primary, av8Var2), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.k(), av8Var2, 48, 24960, 110584);
            av8Var2.s(true);
            xtc d0 = l98.d0(utcVar2, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            u23 a5 = t23.a(p4hVar, kv1Var, av8Var2, 48);
            int hashCode4 = Long.hashCode(av8Var2.T);
            aee m4 = av8Var2.m();
            xtc C4 = fqj.C(av8Var2, d0);
            av8Var2.h0();
            if (av8Var2.S) {
                zg3Var = zg3Var5;
                av8Var2.l(zg3Var);
            } else {
                zg3Var = zg3Var5;
                av8Var2.q0();
            }
            waa.K(av8Var2, a5, f50Var5);
            waa.K(av8Var2, m4, ff3Var2);
            bf3.s(hashCode4, av8Var2, f50Var6, av8Var2, ryVar3);
            waa.K(av8Var2, C4, f50Var7);
            String a6 = xelVar.b.a(av8Var2);
            if (a6.length() <= 0) {
                a6 = null;
            }
            if (a6 == null) {
                av8Var2.d0(393722160);
                a6 = xelVar.c.a(av8Var2);
                z = false;
            } else {
                z = false;
                av8Var2.d0(393719463);
            }
            av8Var2.s(z);
            zg3 zg3Var6 = zg3Var;
            udj.c(a6, null, lz.D(R.color.on_color_secondary, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.c(), av8Var2, 0, 0, 131066);
            av8Var2.d0(393731196);
            o80 o80Var = new o80();
            String str4 = wn1Var3.q;
            String str5 = wn1Var3.r;
            String str6 = wn1Var3.s;
            String str7 = "";
            switch (str4.hashCode()) {
                case -1947652542:
                    i2 = R.color.on_color_primary;
                    z2 = false;
                    break;
                case -1661628965:
                    i2 = R.color.on_color_primary;
                    z2 = false;
                    break;
                case -1411655086:
                    i2 = R.color.on_color_primary;
                    z2 = false;
                    break;
                case -673660814:
                    try {
                        if (str4.equals(StatusKt.STATUS_FINISHED)) {
                            av8Var2.d0(870214719);
                            if (num3 != null && num3.intValue() == 1) {
                                i2 = R.color.on_color_primary;
                                z2 = false;
                                f2 = ljg.f(av8Var2, 582262872, R.color.on_color_primary, av8Var2, false);
                                i3 = R.color.on_color_secondary;
                            } else {
                                i2 = R.color.on_color_primary;
                                z2 = false;
                                i3 = R.color.on_color_secondary;
                                f2 = ljg.f(av8Var2, 582263514, R.color.on_color_secondary, av8Var2, false);
                            }
                            g = o80Var.g(new pwh(f2, 0L, (wg8) null, (rg8) null, (sg8) null, (tf8) null, (String) null, 0L, (sn1) null, (zcj) null, (eib) null, 0L, (v8j) null, (qah) null, 65534));
                            try {
                                o80Var.d(String.valueOf(num2 == null ? "" : num2));
                                Unit unit = Unit.a;
                                o80Var.f(g);
                                g = o80Var.g(new pwh(lz.D(i3, av8Var2), 0L, (wg8) null, (rg8) null, (sg8) null, (tf8) null, (String) null, 0L, (sn1) null, (zcj) null, (eib) null, 0L, (v8j) null, (qah) null, 65534));
                                try {
                                    o80Var.d(" - ");
                                    o80Var.f(g);
                                    g = o80Var.g(new pwh((num3 != null && num3.intValue() == 2) ? ljg.f(av8Var2, 582275000, i2, av8Var2, z2) : ljg.f(av8Var2, 582275642, i3, av8Var2, z2), 0L, (wg8) null, (rg8) null, (sg8) null, (tf8) null, (String) null, 0L, (sn1) null, (zcj) null, (eib) null, 0L, (v8j) null, (qah) null, 65534));
                                    try {
                                        o80Var.d(String.valueOf(num == null ? "" : num));
                                        o80Var.f(g);
                                        av8Var2.s(z2);
                                        q80 h = o80Var.h();
                                        av8Var2.s(z2);
                                        wn1Var = wn1Var3;
                                        udj.d(h, l98.f0(utcVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12.0f, 5), 0L, null, 0L, 0L, null, 0L, 2, false, 1, 0, null, null, xth.l(), av8Var2, 48, 24960, 241660);
                                        if (wn1Var.c()) {
                                            av8Var2.d0(393796372);
                                            l8g a7 = k8g.a(wxfVar, lv1Var, av8Var2, 48);
                                            int hashCode5 = Long.hashCode(av8Var2.T);
                                            aee m5 = av8Var2.m();
                                            xtc C5 = fqj.C(av8Var2, utcVar2);
                                            av8Var2.h0();
                                            if (av8Var2.S) {
                                                zg3Var4 = zg3Var6;
                                                av8Var2.l(zg3Var4);
                                            } else {
                                                zg3Var4 = zg3Var6;
                                                av8Var2.q0();
                                            }
                                            waa.K(av8Var2, a7, f50Var5);
                                            waa.K(av8Var2, m5, ff3Var2);
                                            bf3.s(hashCode5, av8Var2, f50Var6, av8Var2, ryVar3);
                                            waa.K(av8Var2, C5, f50Var7);
                                            f50Var4 = f50Var7;
                                            ryVar2 = ryVar3;
                                            kq9.b(s6a.N(R.drawable.ic_live_icon, 6, av8Var2), null, bkh.l(utcVar2, 16.0f), lz.D(R.color.on_color_primary, av8Var2), av8Var2, 432, 0);
                                            xtc f02 = l98.f0(utcVar2, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
                                            if (str6 != null) {
                                                O = l4a.O(str6);
                                                wn1Var2 = wn1Var;
                                            } else {
                                                wn1Var2 = wn1Var;
                                                String str8 = wn1Var2.t;
                                                O = str8 != null ? l4a.O(str8) : str5;
                                            }
                                            zg3Var3 = zg3Var4;
                                            udj.c(O, f02, lz.D(R.color.on_color_primary, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.c(), av8Var2, 48, 0, 131064);
                                            av8Var = av8Var2;
                                            av8Var.s(true);
                                            av8Var.s(false);
                                            utcVar = utcVar2;
                                            wn1Var = wn1Var2;
                                            f50Var2 = f50Var5;
                                            ff3Var = ff3Var2;
                                            f50Var = f50Var6;
                                        } else if (wn1Var.d()) {
                                            av8Var2.d0(393830663);
                                            l8g a8 = k8g.a(wxfVar, lv1Var, av8Var2, 48);
                                            int hashCode6 = Long.hashCode(av8Var2.T);
                                            aee m6 = av8Var2.m();
                                            xtc C6 = fqj.C(av8Var2, utcVar2);
                                            av8Var2.h0();
                                            if (av8Var2.S) {
                                                av8Var2.l(zg3Var6);
                                            } else {
                                                av8Var2.q0();
                                            }
                                            waa.K(av8Var2, a8, f50Var5);
                                            waa.K(av8Var2, m6, ff3Var2);
                                            bf3.s(hashCode6, av8Var2, f50Var6, av8Var2, ryVar3);
                                            waa.K(av8Var2, C6, f50Var7);
                                            ryVar2 = ryVar3;
                                            f50Var4 = f50Var7;
                                            kq9.b(s6a.N(R.drawable.ic_location, 6, av8Var2), null, bkh.l(utcVar2, 16.0f), lz.D(R.color.on_color_secondary, av8Var2), av8Var2, 432, 0);
                                            zg3Var3 = zg3Var6;
                                            udj.c(xelVar.d, l98.f0(utcVar2, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), lz.D(R.color.on_color_secondary, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.c(), av8Var2, 48, 0, 131064);
                                            av8Var = av8Var2;
                                            av8Var.s(true);
                                            av8Var.s(false);
                                            utcVar = utcVar2;
                                            f50Var = f50Var6;
                                            f50Var2 = f50Var5;
                                            ff3Var = ff3Var2;
                                        } else {
                                            av8Var2.d0(-675429994);
                                            if (str6 == null) {
                                                String str9 = str5.equals("-") ? null : str5;
                                                if (str9 != null) {
                                                    str = str9;
                                                    utcVar = utcVar2;
                                                    f50Var = f50Var6;
                                                    f50Var2 = f50Var5;
                                                    ff3Var = ff3Var2;
                                                    ryVar = ryVar3;
                                                    f50Var3 = f50Var7;
                                                    zg3Var2 = zg3Var6;
                                                    udj.c(str, null, lz.D(R.color.on_color_secondary, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.c(), av8Var2, 0, 0, 131066);
                                                    av8Var = av8Var2;
                                                    av8Var.s(false);
                                                    av8Var.s(true);
                                                    if (1.0f <= 0.0d) {
                                                        p3a.a("invalid weight; must be greater than zero");
                                                    }
                                                    goa goaVar2 = new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                                                    u23 a9 = t23.a(p4hVar, kv1Var, av8Var, 48);
                                                    int hashCode7 = Long.hashCode(av8Var.T);
                                                    aee m7 = av8Var.m();
                                                    xtc C7 = fqj.C(av8Var, goaVar2);
                                                    av8Var.h0();
                                                    if (av8Var.S) {
                                                        av8Var.l(zg3Var2);
                                                    } else {
                                                        av8Var.q0();
                                                    }
                                                    waa.K(av8Var, a9, f50Var2);
                                                    waa.K(av8Var, m7, ff3Var);
                                                    bf3.s(hashCode7, av8Var, f50Var, av8Var, ryVar);
                                                    waa.K(av8Var, C7, f50Var3);
                                                    wn1 wn1Var4 = wn1Var;
                                                    utc utcVar3 = utcVar;
                                                    td4.G(wn1Var4.c, bkh.l(utcVar3, 24.0f), false, 0L, av8Var, 48, 12);
                                                    xtc f03 = l98.f0(utcVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                                                    str2 = wn1Var4.h;
                                                    if (str2 == null) {
                                                        str2 = wn1Var4.g;
                                                    }
                                                    av8 av8Var3 = av8Var;
                                                    udj.c(str2, f03, lz.D(R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.k(), av8Var3, 48, 24960, 110584);
                                                    av8Var2 = av8Var3;
                                                    ljg.t(av8Var2, true, true, true);
                                                    break;
                                                }
                                            } else {
                                                str7 = l4a.O(str6);
                                            }
                                            str = str7;
                                            utcVar = utcVar2;
                                            f50Var = f50Var6;
                                            f50Var2 = f50Var5;
                                            ff3Var = ff3Var2;
                                            ryVar = ryVar3;
                                            f50Var3 = f50Var7;
                                            zg3Var2 = zg3Var6;
                                            udj.c(str, null, lz.D(R.color.on_color_secondary, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.c(), av8Var2, 0, 0, 131066);
                                            av8Var = av8Var2;
                                            av8Var.s(false);
                                            av8Var.s(true);
                                            if (1.0f <= 0.0d) {
                                            }
                                            goa goaVar22 = new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                                            u23 a92 = t23.a(p4hVar, kv1Var, av8Var, 48);
                                            int hashCode72 = Long.hashCode(av8Var.T);
                                            aee m72 = av8Var.m();
                                            xtc C72 = fqj.C(av8Var, goaVar22);
                                            av8Var.h0();
                                            if (av8Var.S) {
                                            }
                                            waa.K(av8Var, a92, f50Var2);
                                            waa.K(av8Var, m72, ff3Var);
                                            bf3.s(hashCode72, av8Var, f50Var, av8Var, ryVar);
                                            waa.K(av8Var, C72, f50Var3);
                                            wn1 wn1Var42 = wn1Var;
                                            utc utcVar32 = utcVar;
                                            td4.G(wn1Var42.c, bkh.l(utcVar32, 24.0f), false, 0L, av8Var, 48, 12);
                                            xtc f032 = l98.f0(utcVar32, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                                            str2 = wn1Var42.h;
                                            if (str2 == null) {
                                            }
                                            av8 av8Var32 = av8Var;
                                            udj.c(str2, f032, lz.D(R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.k(), av8Var32, 48, 24960, 110584);
                                            av8Var2 = av8Var32;
                                            ljg.t(av8Var2, true, true, true);
                                        }
                                        ryVar = ryVar2;
                                        f50Var3 = f50Var4;
                                        zg3Var2 = zg3Var3;
                                        av8Var.s(true);
                                        if (1.0f <= 0.0d) {
                                        }
                                        goa goaVar222 = new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                                        u23 a922 = t23.a(p4hVar, kv1Var, av8Var, 48);
                                        int hashCode722 = Long.hashCode(av8Var.T);
                                        aee m722 = av8Var.m();
                                        xtc C722 = fqj.C(av8Var, goaVar222);
                                        av8Var.h0();
                                        if (av8Var.S) {
                                        }
                                        waa.K(av8Var, a922, f50Var2);
                                        waa.K(av8Var, m722, ff3Var);
                                        bf3.s(hashCode722, av8Var, f50Var, av8Var, ryVar);
                                        waa.K(av8Var, C722, f50Var3);
                                        wn1 wn1Var422 = wn1Var;
                                        utc utcVar322 = utcVar;
                                        td4.G(wn1Var422.c, bkh.l(utcVar322, 24.0f), false, 0L, av8Var, 48, 12);
                                        xtc f0322 = l98.f0(utcVar322, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                                        str2 = wn1Var422.h;
                                        if (str2 == null) {
                                        }
                                        av8 av8Var322 = av8Var;
                                        udj.c(str2, f0322, lz.D(R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.k(), av8Var322, 48, 24960, 110584);
                                        av8Var2 = av8Var322;
                                        ljg.t(av8Var2, true, true, true);
                                    } finally {
                                    }
                                } finally {
                                }
                            } finally {
                            }
                        }
                        f4 = av8Var2.f(j);
                        O2 = av8Var2.O();
                        if (!f4 || O2 == a99Var) {
                            O2 = rik.j(context, j, bi4.PATTERN_DMM, " · ");
                            av8Var2.n0(O2);
                        }
                        o80Var.d((String) O2);
                        Unit unit2 = Unit.a;
                        o80Var.f(g);
                        av8Var2.s(z2);
                        i3 = R.color.on_color_secondary;
                        q80 h2 = o80Var.h();
                        av8Var2.s(z2);
                        wn1Var = wn1Var3;
                        udj.d(h2, l98.f0(utcVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12.0f, 5), 0L, null, 0L, 0L, null, 0L, 2, false, 1, 0, null, null, xth.l(), av8Var2, 48, 24960, 241660);
                        if (wn1Var.c()) {
                        }
                        ryVar = ryVar2;
                        f50Var3 = f50Var4;
                        zg3Var2 = zg3Var3;
                        av8Var.s(true);
                        if (1.0f <= 0.0d) {
                        }
                        goa goaVar2222 = new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                        u23 a9222 = t23.a(p4hVar, kv1Var, av8Var, 48);
                        int hashCode7222 = Long.hashCode(av8Var.T);
                        aee m7222 = av8Var.m();
                        xtc C7222 = fqj.C(av8Var, goaVar2222);
                        av8Var.h0();
                        if (av8Var.S) {
                        }
                        waa.K(av8Var, a9222, f50Var2);
                        waa.K(av8Var, m7222, ff3Var);
                        bf3.s(hashCode7222, av8Var, f50Var, av8Var, ryVar);
                        waa.K(av8Var, C7222, f50Var3);
                        wn1 wn1Var4222 = wn1Var;
                        utc utcVar3222 = utcVar;
                        td4.G(wn1Var4222.c, bkh.l(utcVar3222, 24.0f), false, 0L, av8Var, 48, 12);
                        xtc f03222 = l98.f0(utcVar3222, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                        str2 = wn1Var4222.h;
                        if (str2 == null) {
                        }
                        av8 av8Var3222 = av8Var;
                        udj.c(str2, f03222, lz.D(R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.k(), av8Var3222, 48, 24960, 110584);
                        av8Var2 = av8Var3222;
                        ljg.t(av8Var2, true, true, true);
                    } finally {
                    }
                    i2 = R.color.on_color_primary;
                    z2 = false;
                    av8Var2.d0(870868292);
                    g = o80Var.g(new pwh(lz.D(i2, av8Var2), 0L, (wg8) null, (rg8) null, (sg8) null, (tf8) null, (String) null, 0L, (sn1) null, (zcj) null, (eib) null, 0L, (v8j) null, (qah) null, 65534));
                    break;
                case 527231609:
                    if (str4.equals(StatusKt.STATUS_WILL_CONTINUE)) {
                        i2 = R.color.on_color_primary;
                        z2 = false;
                        av8Var2.d0(869791042);
                        if (Intrinsics.c(wn1Var3.q, StatusKt.STATUS_IN_PROGRESS)) {
                            f3 = ljg.f(av8Var2, 582250104, i2, av8Var2, z2);
                            i3 = R.color.on_color_secondary;
                        } else {
                            i3 = R.color.on_color_secondary;
                            f3 = ljg.f(av8Var2, 582250746, R.color.on_color_secondary, av8Var2, z2);
                        }
                        g = o80Var.g(new pwh(f3, 0L, (wg8) null, (rg8) null, (sg8) null, (tf8) null, (String) null, 0L, (sn1) null, (zcj) null, (eib) null, 0L, (v8j) null, (qah) null, 65534));
                        try {
                            o80Var.d((num2 == null ? "" : num2) + " - " + (num == null ? "" : num));
                            Unit unit3 = Unit.a;
                            o80Var.f(g);
                            av8Var2.s(z2);
                            q80 h22 = o80Var.h();
                            av8Var2.s(z2);
                            wn1Var = wn1Var3;
                            udj.d(h22, l98.f0(utcVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12.0f, 5), 0L, null, 0L, 0L, null, 0L, 2, false, 1, 0, null, null, xth.l(), av8Var2, 48, 24960, 241660);
                            if (wn1Var.c()) {
                            }
                            ryVar = ryVar2;
                            f50Var3 = f50Var4;
                            zg3Var2 = zg3Var3;
                            av8Var.s(true);
                            if (1.0f <= 0.0d) {
                            }
                            goa goaVar22222 = new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                            u23 a92222 = t23.a(p4hVar, kv1Var, av8Var, 48);
                            int hashCode72222 = Long.hashCode(av8Var.T);
                            aee m72222 = av8Var.m();
                            xtc C72222 = fqj.C(av8Var, goaVar22222);
                            av8Var.h0();
                            if (av8Var.S) {
                            }
                            waa.K(av8Var, a92222, f50Var2);
                            waa.K(av8Var, m72222, ff3Var);
                            bf3.s(hashCode72222, av8Var, f50Var, av8Var, ryVar);
                            waa.K(av8Var, C72222, f50Var3);
                            wn1 wn1Var42222 = wn1Var;
                            utc utcVar32222 = utcVar;
                            td4.G(wn1Var42222.c, bkh.l(utcVar32222, 24.0f), false, 0L, av8Var, 48, 12);
                            xtc f032222 = l98.f0(utcVar32222, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                            str2 = wn1Var42222.h;
                            if (str2 == null) {
                            }
                            av8 av8Var32222 = av8Var;
                            udj.c(str2, f032222, lz.D(R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.k(), av8Var32222, 48, 24960, 110584);
                            av8Var2 = av8Var32222;
                            ljg.t(av8Var2, true, true, true);
                            break;
                        } finally {
                        }
                    }
                    i2 = R.color.on_color_primary;
                    z2 = false;
                    av8Var2.d0(870868292);
                    g = o80Var.g(new pwh(lz.D(i2, av8Var2), 0L, (wg8) null, (rg8) null, (sg8) null, (tf8) null, (String) null, 0L, (sn1) null, (zcj) null, (eib) null, 0L, (v8j) null, (qah) null, 65534));
                    f4 = av8Var2.f(j);
                    O2 = av8Var2.O();
                    if (!f4) {
                        break;
                    }
                    O2 = rik.j(context, j, bi4.PATTERN_DMM, " · ");
                    av8Var2.n0(O2);
                    o80Var.d((String) O2);
                    Unit unit22 = Unit.a;
                    o80Var.f(g);
                    av8Var2.s(z2);
                    i3 = R.color.on_color_secondary;
                    q80 h222 = o80Var.h();
                    av8Var2.s(z2);
                    wn1Var = wn1Var3;
                    udj.d(h222, l98.f0(utcVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12.0f, 5), 0L, null, 0L, 0L, null, 0L, 2, false, 1, 0, null, null, xth.l(), av8Var2, 48, 24960, 241660);
                    if (wn1Var.c()) {
                    }
                    ryVar = ryVar2;
                    f50Var3 = f50Var4;
                    zg3Var2 = zg3Var3;
                    av8Var.s(true);
                    if (1.0f <= 0.0d) {
                    }
                    goa goaVar222222 = new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                    u23 a922222 = t23.a(p4hVar, kv1Var, av8Var, 48);
                    int hashCode722222 = Long.hashCode(av8Var.T);
                    aee m722222 = av8Var.m();
                    xtc C722222 = fqj.C(av8Var, goaVar222222);
                    av8Var.h0();
                    if (av8Var.S) {
                    }
                    waa.K(av8Var, a922222, f50Var2);
                    waa.K(av8Var, m722222, ff3Var);
                    bf3.s(hashCode722222, av8Var, f50Var, av8Var, ryVar);
                    waa.K(av8Var, C722222, f50Var3);
                    wn1 wn1Var422222 = wn1Var;
                    utc utcVar322222 = utcVar;
                    td4.G(wn1Var422222.c, bkh.l(utcVar322222, 24.0f), false, 0L, av8Var, 48, 12);
                    xtc f0322222 = l98.f0(utcVar322222, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                    str2 = wn1Var422222.h;
                    if (str2 == null) {
                    }
                    av8 av8Var322222 = av8Var;
                    udj.c(str2, f0322222, lz.D(R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.k(), av8Var322222, 48, 24960, 110584);
                    av8Var2 = av8Var322222;
                    ljg.t(av8Var2, true, true, true);
                    break;
                default:
                    i2 = R.color.on_color_primary;
                    z2 = false;
                    av8Var2.d0(870868292);
                    g = o80Var.g(new pwh(lz.D(i2, av8Var2), 0L, (wg8) null, (rg8) null, (sg8) null, (tf8) null, (String) null, 0L, (sn1) null, (zcj) null, (eib) null, 0L, (v8j) null, (qah) null, 65534));
                    f4 = av8Var2.f(j);
                    O2 = av8Var2.O();
                    if (!f4) {
                    }
                    O2 = rik.j(context, j, bi4.PATTERN_DMM, " · ");
                    av8Var2.n0(O2);
                    o80Var.d((String) O2);
                    Unit unit222 = Unit.a;
                    o80Var.f(g);
                    av8Var2.s(z2);
                    i3 = R.color.on_color_secondary;
                    q80 h2222 = o80Var.h();
                    av8Var2.s(z2);
                    wn1Var = wn1Var3;
                    udj.d(h2222, l98.f0(utcVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12.0f, 5), 0L, null, 0L, 0L, null, 0L, 2, false, 1, 0, null, null, xth.l(), av8Var2, 48, 24960, 241660);
                    if (wn1Var.c()) {
                    }
                    ryVar = ryVar2;
                    f50Var3 = f50Var4;
                    zg3Var2 = zg3Var3;
                    av8Var.s(true);
                    if (1.0f <= 0.0d) {
                    }
                    goa goaVar2222222 = new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                    u23 a9222222 = t23.a(p4hVar, kv1Var, av8Var, 48);
                    int hashCode7222222 = Long.hashCode(av8Var.T);
                    aee m7222222 = av8Var.m();
                    xtc C7222222 = fqj.C(av8Var, goaVar2222222);
                    av8Var.h0();
                    if (av8Var.S) {
                    }
                    waa.K(av8Var, a9222222, f50Var2);
                    waa.K(av8Var, m7222222, ff3Var);
                    bf3.s(hashCode7222222, av8Var, f50Var, av8Var, ryVar);
                    waa.K(av8Var, C7222222, f50Var3);
                    wn1 wn1Var4222222 = wn1Var;
                    utc utcVar3222222 = utcVar;
                    td4.G(wn1Var4222222.c, bkh.l(utcVar3222222, 24.0f), false, 0L, av8Var, 48, 12);
                    xtc f03222222 = l98.f0(utcVar3222222, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                    str2 = wn1Var4222222.h;
                    if (str2 == null) {
                    }
                    av8 av8Var3222222 = av8Var;
                    udj.c(str2, f03222222, lz.D(R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.k(), av8Var3222222, 48, 24960, 110584);
                    av8Var2 = av8Var3222222;
                    ljg.t(av8Var2, true, true, true);
                    break;
            }
        } else {
            av8Var2.W();
        }
        eqf u = av8Var2.u();
        if (u != null) {
            u.d = new bmj(xelVar, function1, i, 19);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(rfl rflVar, boolean z, final long j, final boolean z2, Function1 function1, of3 of3Var, final int i) {
        int i2;
        final Function1 function12;
        rfl rflVar2;
        boolean z3;
        int i3;
        int i4;
        int i5;
        agl aglVar;
        int i6;
        int i7;
        cdi cdiVar;
        utc utcVar;
        a99 a99Var;
        boolean z4;
        Object O;
        final boolean z5 = z;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-197138655);
        if ((i & 6) == 0) {
            i2 = (av8Var.g(rflVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.h(z5) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var.f(j) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= av8Var.h(z2) ? a.o : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= av8Var.i(function1) ? 16384 : 8192;
        }
        if (av8Var.T(i2 & 1, (i2 & 9363) != 9362)) {
            boolean booleanValue = ((Boolean) av8Var.k(f5a.a)).booleanValue();
            int i8 = i2;
            cdi b2 = a60.b(z5 ? 180.0f : 0.0f, null, "arrow_rotation_animation", av8Var, 3072, 22);
            utc utcVar2 = utc.a;
            xtc d0 = l98.d0(bkh.d(utcVar2, 1.0f), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            long D = lz.D(R.color.n_lv_4, av8Var);
            Object O2 = av8Var.O();
            a99 a99Var2 = nf3.a;
            if (O2 == a99Var2) {
                O2 = mz1.e(av8Var);
            }
            wzc wzcVar = (wzc) O2;
            Object[] objArr = new Object[0];
            Object O3 = av8Var.O();
            if (O3 == a99Var2) {
                O3 = wzj.p;
                av8Var.n0(O3);
            }
            xtc y = tol.y(d0, true, true, false, D, wzcVar, new eui((boh) o3a.N(objArr, (Function0) O3, av8Var, 48), (Object) rflVar, function1, 15), av8Var, 0);
            av8 av8Var2 = av8Var;
            l8g a2 = k8g.a(ww9.b, uxf.m, av8Var2, 48);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m = av8Var2.m();
            xtc C = fqj.C(av8Var2, y);
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
            agl aglVar2 = rflVar.e;
            td4.k(aglVar2 != null ? aglVar2.b : null, bkh.l(utcVar2, 32.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, av8Var2, 48, 12);
            xtc f0 = l98.f0(new goa(1.0f, true), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
            u23 a3 = t23.a(ww9.d, uxf.o, av8Var2, 0);
            int hashCode2 = Long.hashCode(av8Var2.T);
            aee m2 = av8Var2.m();
            xtc C2 = fqj.C(av8Var2, f0);
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
            if (aglVar2 == null) {
                av8Var2.d0(904051230);
                av8Var2.s(false);
                i4 = 4;
                i5 = 16384;
                rflVar2 = rflVar;
                aglVar = aglVar2;
                i3 = i8;
                z3 = false;
                z5 = z;
            } else {
                av8Var2.d0(904051231);
                String str = aglVar2.c;
                yf8 yf8Var = xth.a;
                z3 = false;
                udj.c(str, null, lz.D(R.color.on_color_primary, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.i(), av8Var2, 0, 0, 131066);
                rflVar2 = rflVar;
                av8Var2 = av8Var2;
                i3 = i8;
                i4 = 4;
                i5 = 16384;
                t(aglVar2, rflVar2.f, j, z, av8Var2, (i8 & 896) | ((i8 << 6) & 7168));
                aglVar = aglVar2;
                z5 = z;
                Unit unit = Unit.a;
                av8Var2.s(false);
            }
            av8Var2.s(true);
            if (!booleanValue) {
                if ((aglVar != null ? aglVar.a : null) != null) {
                    av8Var2.d0(-150715701);
                    xtc f02 = l98.f0(utcVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11);
                    utcVar = utcVar2;
                    int intValue = aglVar.a.intValue();
                    String str2 = aglVar.c;
                    i6 = i4;
                    i7 = i5;
                    cdiVar = b2;
                    a99Var = a99Var2;
                    uaa.g(intValue, ((i3 >> 3) & 896) | 3072, lz.D(R.color.on_color_primary, av8Var2), av8Var2, f02, str2, z2);
                    av8Var2.s(z3);
                    xtc l = bkh.l(utcVar, 32.0f);
                    boolean z6 = (i3 & 57344) != i7 ? true : z3;
                    if ((i3 & 112) == 32) {
                        z3 = true;
                    }
                    z4 = z3 | z6;
                    O = av8Var2.O();
                    if (!z4 || O == a99Var) {
                        function12 = function1;
                        O = new ct2(function12, z5, i6);
                        av8Var2.n0(O);
                    } else {
                        function12 = function1;
                    }
                    av8 av8Var3 = av8Var2;
                    ao2.g((Function0) O, l, false, null, null, yqo.H(717761503, av8Var2, new mph(cdiVar, 2)), av8Var3, 1572912, 60);
                    av8Var = av8Var3;
                    av8Var.s(true);
                }
            }
            i6 = i4;
            i7 = i5;
            cdiVar = b2;
            utcVar = utcVar2;
            a99Var = a99Var2;
            av8Var2.d0(-150434779);
            av8Var2.s(z3);
            xtc l2 = bkh.l(utcVar, 32.0f);
            if ((i3 & 57344) != i7) {
            }
            if ((i3 & 112) == 32) {
            }
            z4 = z3 | z6;
            O = av8Var2.O();
            if (z4) {
            }
            function12 = function1;
            O = new ct2(function12, z5, i6);
            av8Var2.n0(O);
            av8 av8Var32 = av8Var2;
            ao2.g((Function0) O, l2, false, null, null, yqo.H(717761503, av8Var2, new mph(cdiVar, 2)), av8Var32, 1572912, 60);
            av8Var = av8Var32;
            av8Var.s(true);
        } else {
            function12 = function1;
            rflVar2 = rflVar;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            final rfl rflVar3 = rflVar2;
            u.d = new Function2() { // from class: xfl
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    q5a.e(rfl.this, z5, j, z2, function12, (of3) obj, aba.K(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x063c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0646  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void f(boolean z, int i, int i2, String str, String str2, String str3, String str4, Integer num, Integer num2, String str5, Function1 function1, of3 of3Var, int i3) {
        boolean z2;
        av8 av8Var;
        eqf u;
        Object xj7Var;
        int i4;
        char c2;
        int i5;
        String str6;
        utc utcVar;
        float f2;
        f50 f50Var;
        ry ryVar;
        n12 n12Var;
        ff3 ff3Var;
        int i6;
        String t;
        float f3;
        List split$default;
        int i7;
        q80 q80Var;
        float f4;
        float f5;
        float f6;
        mv1 mv1Var;
        boolean z3;
        n12 n12Var2;
        int i8;
        av8 av8Var2;
        boolean z4;
        boolean z5;
        av8 av8Var3;
        String str7 = str;
        mv1 mv1Var2 = uxf.k;
        av8 av8Var4 = (av8) of3Var;
        av8Var4.f0(519443991);
        int i9 = i3 | (av8Var4.h(z) ? 4 : 2) | (av8Var4.e(i) ? 32 : 16) | (av8Var4.e(i2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var4.g(str7) ? a.o : 1024) | (av8Var4.g(str2) ? 16384 : 8192) | (av8Var4.g(str3) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE) | (av8Var4.g(str4) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (av8Var4.g(num) ? 8388608 : 4194304) | (av8Var4.g(num2) ? 67108864 : 33554432) | (av8Var4.g(str5) ? 536870912 : 268435456);
        char c3 = av8Var4.i(function1) ? (char) 4 : (char) 2;
        if ((i9 & 306783379) == 306783378 && (c3 & 3) == 2) {
            z2 = false;
            if (av8Var4.T(i9 & 1, z2)) {
                av8Var = av8Var4;
                av8Var.W();
            } else {
                n7g a2 = o7g.a(16.0f);
                utc utcVar2 = utc.a;
                xtc m = bkh.m(n9e.q(wnn.A(utcVar2, a2), lz.D(R.color.on_color_highlight_2, av8Var4), oyn.e), 234.0f, 274.0f);
                boolean z6 = ((234881024 & i9) == 67108864) | ((c3 & 14) == 4) | ((i9 & 112) == 32) | ((i9 & 896) == 256) | ((i9 & 7168) == 2048);
                Object O = av8Var4.O();
                if (z6 || O == nf3.a) {
                    i4 = i9;
                    c2 = 14;
                    xj7Var = new xj7(function1, num2, i, i2, str);
                    i5 = i2;
                    str6 = str;
                    av8Var4.n0(xj7Var);
                } else {
                    i5 = i2;
                    i4 = i9;
                    xj7Var = O;
                    c2 = 14;
                    str6 = str;
                }
                xtc y = tol.y(m, false, false, false, 0L, null, (Function0) xj7Var, av8Var4, 31);
                k1c c4 = e12.c(uxf.c, false);
                int hashCode = Long.hashCode(av8Var4.T);
                aee m2 = av8Var4.m();
                xtc C = fqj.C(av8Var4, y);
                if3.k7.getClass();
                Function0 function0 = hf3.b;
                av8Var4.h0();
                if (av8Var4.S) {
                    av8Var4.l(function0);
                } else {
                    av8Var4.q0();
                }
                f50 f50Var2 = hf3.g;
                waa.K(av8Var4, c4, f50Var2);
                ff3 ff3Var2 = hf3.f;
                waa.K(av8Var4, m2, ff3Var2);
                Integer valueOf = Integer.valueOf(hashCode);
                f50 f50Var3 = hf3.j;
                waa.K(av8Var4, valueOf, f50Var3);
                ry ryVar2 = hf3.k;
                waa.J(av8Var4, ryVar2);
                f50 f50Var4 = hf3.d;
                waa.K(av8Var4, C, f50Var4);
                boolean c5 = Intrinsics.c(str6, oea.v(R.string.football_big_chances_created, av8Var4));
                ImageVector N = s6a.N(num != null ? num.intValue() : R.drawable.ic_ball_football, 6, av8Var4);
                long D = lz.D(R.color.on_color_highlight_2, av8Var4);
                xtc l = bkh.l(utcVar2, 152.0f);
                mv1 mv1Var3 = uxf.i;
                n12 n12Var3 = n12.a;
                kq9.b(N, null, haa.v(l98.f0(rd0.O(n12Var3.a(l, mv1Var3), -16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, z ? 0.0f : 16.0f, 7), c5 ? 180.0f : 0.0f), D, av8Var4, 48, 0);
                if (z) {
                    av8Var4.d0(-234794219);
                    td4.D(i5, (i4 >> 6) & 14, av8Var4, rd0.O(n12Var3.a(bkh.l(utcVar2, 192.0f), mv1Var2), 32.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2));
                    av8Var4.s(false);
                    utcVar = utcVar2;
                    i6 = 0;
                    n12Var = n12Var3;
                    ryVar = ryVar2;
                    ff3Var = ff3Var2;
                    f50Var = f50Var2;
                    f2 = 16.0f;
                } else {
                    av8Var4.d0(-234537973);
                    utcVar = utcVar2;
                    f2 = 16.0f;
                    f50Var = f50Var2;
                    ryVar = ryVar2;
                    n12Var = n12Var3;
                    ff3Var = ff3Var2;
                    td4.C(i5, n12Var3.a(bkh.l(l98.f0(utcVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 52.0f, 3), 92.0f), mv1Var2), 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var4, (i4 >> 6) & 14, 12);
                    i6 = 0;
                    av8Var4.s(false);
                }
                xtc b0 = l98.b0(utcVar, f2);
                u23 a3 = t23.a(ww9.d, uxf.o, av8Var4, i6);
                int hashCode2 = Long.hashCode(av8Var4.T);
                aee m3 = av8Var4.m();
                xtc C2 = fqj.C(av8Var4, b0);
                av8Var4.h0();
                if (av8Var4.S) {
                    av8Var4.l(function0);
                } else {
                    av8Var4.q0();
                }
                waa.K(av8Var4, a3, f50Var);
                waa.K(av8Var4, m3, ff3Var);
                bf3.s(hashCode2, av8Var4, f50Var3, av8Var4, ryVar);
                waa.K(av8Var4, C2, f50Var4);
                utc utcVar3 = utcVar;
                xtc f0 = l98.f0(utcVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                yf8 yf8Var = xth.a;
                f50 f50Var5 = f50Var;
                ff3 ff3Var3 = ff3Var;
                float f7 = f2;
                mv1 mv1Var4 = mv1Var3;
                ry ryVar3 = ryVar;
                udj.c(str, f0, lz.D(R.color.on_color_primary, av8Var4), null, 0L, null, 0L, null, null, 0L, 2, false, 2, 0, null, xth.j(), av8Var4, ((i4 >> 9) & 14) | 48, 24960, 110584);
                str7 = str;
                udj.c(str2, l98.f0(utcVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 22.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), lz.D(R.color.on_color_primary, av8Var4), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.d(), av8Var4, ((i4 >> 12) & 14) | 48, 24960, 110584);
                t = vha.t((Context) av8Var4.k(nz.b), null, Sports.FOOTBALL, str3, false);
                udj.c(t, bkh.d(utcVar3, 0.58f), lz.D(R.color.on_color_secondary, av8Var4), null, 0L, null, 0L, null, null, 0L, 0, false, 1, 0, null, xth.b(), av8Var4, 48, 24576, 114680);
                av8Var4.s(true);
                if (Intrinsics.c(str7, oea.v(R.string.average_sofascore_rating, av8Var4))) {
                    av8Var4.d0(-233133146);
                    Double f8 = b.f(str4);
                    if (f8 == null) {
                        av8Var4.d0(-233133147);
                        z5 = 0;
                        av8Var4.s(false);
                        av8Var3 = av8Var4;
                        z4 = true;
                        f3 = 48.0f;
                    } else {
                        av8Var4.d0(-233133146);
                        n12 n12Var4 = n12Var;
                        z4 = true;
                        n12Var = n12Var4;
                        mv1Var4 = mv1Var4;
                        f3 = 48.0f;
                        i9a.i(Double.valueOf(f8.doubleValue()), false, l98.f0(n12Var4.a(utcVar3, mv1Var4), f7, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, z ? 56.0f : 78.0f, 6), new p75(28.0f), Integer.valueOf(R.color.on_color_primary), new p75(26.0f), false, av8Var4, 12779952, 272);
                        av8 av8Var5 = av8Var4;
                        Unit unit = Unit.a;
                        z5 = 0;
                        av8Var5.s(false);
                        av8Var3 = av8Var5;
                    }
                    av8Var3.s(z5);
                    i7 = 48;
                    n12Var2 = n12Var;
                    f6 = f7;
                    mv1Var = mv1Var4;
                    z3 = z4;
                    av8Var2 = av8Var3;
                    i8 = z5;
                } else {
                    f3 = 48.0f;
                    n12 n12Var5 = n12Var;
                    av8Var4.d0(-232483262);
                    split$default = StringsKt__StringsKt.split$default(str4, new String[]{" "}, false, 2, 2, null);
                    if (split$default.size() > 1) {
                        o80 o80Var = new o80();
                        i7 = 48;
                        int g = o80Var.g(pwh.a(xth.h().a, v8a.v(48), 65533));
                        try {
                            o80Var.d((String) split$default.get(0));
                            Unit unit2 = Unit.a;
                            o80Var.f(g);
                            o80Var.d("\n");
                            int g2 = o80Var.g(pwh.a(xth.h().a, v8a.v(20), 65533));
                            try {
                                o80Var.d((String) split$default.get(1));
                                o80Var.f(g2);
                                q80Var = o80Var.h();
                            } finally {
                            }
                        } finally {
                        }
                    } else {
                        i7 = 48;
                        q80Var = new q80(str4);
                    }
                    xtc a4 = n12Var5.a(utcVar3, mv1Var4);
                    if (z && split$default.size() > 1) {
                        f4 = 24.0f;
                    } else if (z) {
                        f5 = 48.0f;
                        f6 = f7;
                        mv1Var = mv1Var4;
                        q80 q80Var2 = q80Var;
                        z3 = true;
                        n12Var2 = n12Var5;
                        udj.d(q80Var2, l98.f0(a4, f7, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f5, 6), lz.D(R.color.on_color_primary, av8Var4), null, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, dfj.a(xth.h(), 0L, v8a.v(i7), null, null, 0L, null, 0, 0, 0L, null, null, 0, 16777213), av8Var4, 0, 0, 262136);
                        av8 av8Var6 = av8Var4;
                        i8 = 0;
                        av8Var6.s(false);
                        Unit unit3 = Unit.a;
                        av8Var2 = av8Var6;
                    } else {
                        f4 = split$default.size() > 1 ? 36.0f : 69.0f;
                    }
                    f5 = f4;
                    f6 = f7;
                    mv1Var = mv1Var4;
                    q80 q80Var22 = q80Var;
                    z3 = true;
                    n12Var2 = n12Var5;
                    udj.d(q80Var22, l98.f0(a4, f7, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f5, 6), lz.D(R.color.on_color_primary, av8Var4), null, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, dfj.a(xth.h(), 0L, v8a.v(i7), null, null, 0L, null, 0, 0, 0L, null, null, 0, 16777213), av8Var4, 0, 0, 262136);
                    av8 av8Var62 = av8Var4;
                    i8 = 0;
                    av8Var62.s(false);
                    Unit unit32 = Unit.a;
                    av8Var2 = av8Var62;
                }
                nq8.h(av8Var2, n9e.p(n12Var2.a(bkh.e(bkh.d(utcVar3, 1.0f), f3), uxf.j), wxf.E(kotlin.collections.b.j(new r13(r13.h), new r13(r13.c(r13.b, 0.7f))), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), null, 6));
                lv1 lv1Var = uxf.m;
                xtc c0 = l98.c0(n12Var2.a(utcVar3, mv1Var), f6, 8.0f);
                l8g a5 = k8g.a(ww9.b, lv1Var, av8Var2, i7);
                int hashCode3 = Long.hashCode(av8Var2.T);
                aee m4 = av8Var2.m();
                xtc C3 = fqj.C(av8Var2, c0);
                av8Var2.h0();
                if (av8Var2.S) {
                    av8Var2.l(function0);
                } else {
                    av8Var2.q0();
                }
                waa.K(av8Var2, a5, f50Var5);
                waa.K(av8Var2, m4, ff3Var3);
                bf3.s(hashCode3, av8Var2, f50Var3, av8Var2, ryVar3);
                waa.K(av8Var2, C3, f50Var4);
                td4.y(num2 != null ? num2.intValue() : i8, 48, 12, av8Var2, bkh.l(utcVar3, 14.0f), null, false);
                av8Var = av8Var2;
                udj.c(str5 == null ? "" : str5, l98.f0(utcVar3, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), lz.D(R.color.on_color_secondary, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.c(), av8Var, 48, 0, 131064);
                av8Var.s(z3);
                av8Var.s(z3);
            }
            u = av8Var.u();
            if (u == null) {
                u.d = new pm1(z, i, i2, str7, str2, str3, str4, num, num2, str5, function1, i3);
                return;
            }
            return;
        }
        z2 = true;
        if (av8Var4.T(i9 & 1, z2)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    public static final void g(ajl ajlVar, int i, boolean z, Function1 function1, of3 of3Var, int i2) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-2091099274);
        int i3 = i2 | (av8Var.g(ajlVar) ? 4 : 2) | (av8Var.e(i) ? 32 : 16) | (av8Var.h(z) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.i(function1) ? a.o : 1024);
        if (av8Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            l98.b(ajlVar, bkh.d(utc.a, 1.0f), null, null, null, null, yqo.H(447860636, av8Var, new vfl(ajlVar, z, i, function1)), av8Var, (i3 & 14) | 1572912, 60);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new di(i, i2, 19, ajlVar, function1, z);
        }
    }

    public static final void h(gv9 gv9Var, Function1 function1, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(582325161);
        int i2 = (av8Var.g(gv9Var) ? 4 : 2) | i | (av8Var.i(function1) ? 32 : 16);
        int i3 = 18;
        if (av8Var.T(i2 & 1, (i2 & 19) != 18)) {
            xtc d0 = l98.d0(bkh.d(utc.a, 1.0f), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            u23 a2 = t23.a(new ng0(8.0f, true, new a70(6)), uxf.o, av8Var, 6);
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
            if (gv9Var == null) {
                av8Var.d0(-1692997770);
                av8Var.s(false);
            } else {
                av8Var.d0(-1692997769);
                Iterator<E> it = gv9Var.iterator();
                while (it.hasNext()) {
                    xel xelVar = (xel) it.next();
                    av8Var.a0(-607585051, Integer.valueOf(xelVar.a.a));
                    d(xelVar, function1, av8Var, i2 & 112);
                    av8Var.s(false);
                }
                av8Var.s(false);
            }
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new bmj(gv9Var, function1, i, i3);
        }
    }

    public static final void i(final int i, final zdl zdlVar, rfl rflVar, final long j, final boolean z, final boolean z2, final boolean z3, final Function1 function1, final xtc xtcVar, of3 of3Var, final int i2) {
        int i3;
        boolean z4;
        boolean z5;
        final rfl rflVar2 = rflVar;
        rflVar2.getClass();
        function1.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1317916195);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.e(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.g(zdlVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var.g(rflVar2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= av8Var.f(j) ? a.o : 1024;
        }
        if ((i2 & 24576) == 0) {
            z4 = z;
            i3 |= av8Var.h(z4) ? 16384 : 8192;
        } else {
            z4 = z;
        }
        if ((196608 & i2) == 0) {
            z5 = z2;
            i3 |= av8Var.h(z5) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        } else {
            z5 = z2;
        }
        if ((1572864 & i2) == 0) {
            i3 |= av8Var.h(z3) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= av8Var.i(function1) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i3 |= av8Var.g(xtcVar) ? 67108864 : 33554432;
        }
        if (av8Var.T(i3 & 1, (38347923 & i3) != 38347922)) {
            int i4 = i3 >> 3;
            int s0 = hkg.s0(lz.D(zdlVar.b, av8Var));
            int s02 = hkg.s0(lz.D(zdlVar.a, av8Var));
            int i5 = i3;
            boolean z6 = (((i4 & 14) ^ 6) > 4 && av8Var.g(zdlVar)) || (i4 & 6) == 4;
            Object O = av8Var.O();
            if (z6 || O == nf3.a) {
                O = new xdl(s0, s02);
                av8Var.n0(O);
            }
            xtc d0 = l98.d0(n9e.q(n9e.p(wnn.A(l98.d0(bkh.d(xtcVar, 1.0f), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), o7g.a(16.0f)), (xdl) O, null, 6), lz.D(R.color.darken_overlay_1, av8Var), oyn.e), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 1);
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
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
            int i6 = i5 >> 6;
            int i7 = i5 >> 9;
            int i8 = i7 & 112;
            rflVar2 = rflVar;
            e(rflVar2, z4, j, z5, function1, av8Var, (i6 & 7168) | (i6 & 14) | i8 | (i4 & 896) | (57344 & i7));
            fz8.b(x23.a, z, null, null, null, null, yqo.H(-69397589, av8Var, new ak(rflVar2, function1, i, z3)), av8Var, 1572870 | i8, 30);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new Function2() { // from class: wfl
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    q5a.i(i, zdlVar, rflVar2, j, z, z2, z3, function1, xtcVar, (of3) obj, aba.K(i2 | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void j(jqk jqkVar, Integer num, Function1 function1, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1872969085);
        int i2 = i | (av8Var.g(jqkVar) ? 4 : 2) | (av8Var.g(num) ? 32 : 16) | (av8Var.i(function1) ? 256 : 128);
        if (av8Var.T(i2 & 1, (i2 & 147) != 146)) {
            utc utcVar = utc.a;
            xtc q = n9e.q(wnn.A(bkh.d(utcVar, 1.0f), o7g.a(16.0f)), lz.D(R.color.on_color_highlight_2, av8Var), oyn.e);
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object O = av8Var.O();
            if (z || O == nf3.a) {
                O = new mth(num, function1, jqkVar);
                av8Var.n0(O);
            }
            xtc c0 = l98.c0(tol.y(q, false, false, false, 0L, null, (Function0) O, av8Var, 31), 16.0f, 8.0f);
            l8g a2 = k8g.a(new ng0(16.0f, true, new a70(6)), uxf.l, av8Var, 6);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, c0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var, a2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            if (1.0f <= 0.0d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            xtc O2 = kda.O(new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), "media_highlight_card", av8Var);
            k1c c2 = e12.c(uxf.c, false);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, O2);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c2, f50Var);
            waa.K(av8Var, m2, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            haa.b(jqkVar.d, null, qx9.p(bkh.d(utcVar, 1.0f), 1.7777778f), haa.t(2131232755, 0, av8Var), haa.t(2131232755, 0, av8Var), null, mp3.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 37296, 6, 31712);
            kq9.b(s6a.N(R.drawable.ic_highlights_white, 6, av8Var), null, kda.O(n12.a.a(bkh.l(utcVar, 24.0f), uxf.g), "play_button", av8Var), lz.D(R.color.on_color_primary, av8Var), av8Var, 48, 0);
            av8Var.s(true);
            if (1.0f <= 0.0d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            goa goaVar = new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            String str = jqkVar.b;
            yf8 yf8Var = xth.a;
            udj.c(str, goaVar, lz.D(R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.k(), av8Var, 0, 0, 131064);
            av8Var = av8Var;
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new mfh((Object) jqkVar, num, function1, i, 28);
        }
    }

    public static final void k(gv9 gv9Var, Integer num, Function1 function1, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-71275687);
        int i2 = i | (av8Var.g(gv9Var) ? 4 : 2) | (av8Var.g(num) ? 32 : 16) | (av8Var.i(function1) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var.T(i2 & 1, (i2 & 147) != 146)) {
            l98.b(gv9Var, l98.f0(bkh.d(utc.a, 1.0f), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10), null, null, null, null, yqo.H(-1532785378, av8Var, new rsh(10, num, function1)), av8Var, (i2 & 14) | 1572912, 60);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new mfh((Object) gv9Var, num, function1, i, 27);
        }
    }

    public static final void l(tc3 tc3Var, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1677843913);
        int i2 = (av8Var.i(tc3Var) ? 4 : 2) | i;
        if (av8Var.T(i2 & 1, (i2 & 3) != 2)) {
            tc3Var.invoke(av8Var, Integer.valueOf(i2 & 14));
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new b25(i, 6, tc3Var);
        }
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:96)
        */
    public static final void m(defpackage.gv9 r43, int r44, int r45, boolean r46, defpackage.of3 r47, int r48) {
        /*
            Method dump skipped, instructions count: 723
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q5a.m(gv9, int, int, boolean, of3, int):void");
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:96)
        */
    public static final void n(defpackage.gv9 r47, defpackage.gv9 r48, defpackage.of3 r49, int r50) {
        /*
            Method dump skipped, instructions count: 752
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q5a.n(gv9, gv9, of3, int):void");
    }

    public static final void o(Function2 function2, xtc xtcVar, ksa ksaVar, p3e p3eVar, Function1 function1, of3 of3Var, int i) {
        int i2;
        av8 av8Var;
        ksa ksaVar2;
        p3e p3eVar2;
        ksa a2;
        int i3;
        p3e t3eVar;
        function2.getClass();
        function1.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1366267400);
        int i4 = 3;
        if ((i & 6) == 0) {
            i2 = (av8Var2.e(3) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var2.i(function2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var2.g(xtcVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= 1024;
        }
        int i5 = i2 | 24576;
        if ((196608 & i) == 0) {
            i5 |= av8Var2.i(function1) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if (av8Var2.T(i5 & 1, (74899 & i5) != 74898)) {
            av8Var2.Y();
            if ((i & 1) == 0 || av8Var2.B()) {
                a2 = msa.a(0, 0, av8Var2, 0, 3);
                i3 = i5 & (-7169);
                t3eVar = new t3e(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            } else {
                av8Var2.W();
                i3 = i5 & (-7169);
                a2 = ksaVar;
                t3eVar = p3eVar;
            }
            av8Var2.t();
            int i6 = (i3 & 112) | ((i3 << 6) & 896);
            boolean g = ((((i6 & 896) ^ 384) > 256 && av8Var2.e(3)) || (i6 & 384) == 256) | av8Var2.g(a2);
            Object O = av8Var2.O();
            a99 a99Var = nf3.a;
            if (g || O == a99Var) {
                O = new o85(a2, function2);
                av8Var2.n0(O);
            }
            o85 o85Var = (o85) O;
            boolean i7 = av8Var2.i(o85Var) | av8Var2.g(a2);
            Object O2 = av8Var2.O();
            if (i7 || O2 == a99Var) {
                O2 = new gje(o85Var, a2, null, 18);
                av8Var2.n0(O2);
            }
            hz8.o(av8Var2, o85Var, (Function2) O2);
            xtc a3 = koi.a(xtcVar, o85Var, new m00(o85Var, i4));
            boolean i8 = av8Var2.i(o85Var) | ((458752 & i3) == 131072);
            Object O3 = av8Var2.O();
            if (i8 || O3 == a99Var) {
                O3 = new aaf(9, function1, o85Var);
                av8Var2.n0(O3);
            }
            p3e p3eVar3 = t3eVar;
            av8Var = av8Var2;
            ksa ksaVar3 = a2;
            v8a.a(a3, ksaVar3, p3eVar3, null, null, null, false, null, (Function1) O3, av8Var, (i3 >> 6) & 1008, PglCryptUtils.BASE64_FAILED);
            ksaVar2 = ksaVar3;
            p3eVar2 = p3eVar3;
        } else {
            av8Var = av8Var2;
            av8Var.W();
            ksaVar2 = ksaVar;
            p3eVar2 = p3eVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new s52(function2, xtcVar, ksaVar2, p3eVar2, function1, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void p(xtc xtcVar, Function2 function2, Function2 function22, Function2 function23, Function2 function24, int i, long j, long j2, w8l w8lVar, final tc3 tc3Var, of3 of3Var, final int i2, final int i3) {
        int i4;
        Function2 function25;
        int i5;
        Function2 function26;
        int i6;
        Function2 function27;
        int i7;
        Function2 function28;
        int i8;
        w8l w8lVar2;
        int i9;
        final xtc xtcVar2;
        final int i10;
        final Function2 function29;
        final Function2 function210;
        final Function2 function211;
        av8 av8Var;
        final Function2 function212;
        final w8l w8lVar3;
        final long j3;
        final long j4;
        eqf u;
        Function2 function213;
        Function2 function214;
        Function2 function215;
        Function2 function216;
        long j5;
        long b2;
        int i11;
        long j6;
        w8l w8lVar4;
        xtc xtcVar3;
        int i12;
        int i13;
        boolean z;
        Object O;
        boolean z2;
        boolean g;
        Object O2;
        int i14;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1211482744);
        int i15 = i3 & 1;
        if (i15 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (av8Var2.g(xtcVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i16 = i3 & 2;
        if (i16 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            function25 = function2;
            i4 |= av8Var2.i(function25) ? 32 : 16;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i2 & 384) == 0) {
                function26 = function22;
                i4 |= av8Var2.i(function26) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
                i6 = i3 & 8;
                if (i6 != 0) {
                    i4 |= 3072;
                } else if ((i2 & 3072) == 0) {
                    function27 = function23;
                    i4 |= av8Var2.i(function27) ? a.o : 1024;
                    i7 = i3 & 16;
                    if (i7 == 0) {
                        i4 |= 24576;
                    } else if ((i2 & 24576) == 0) {
                        function28 = function24;
                        i4 |= av8Var2.i(function28) ? 16384 : 8192;
                        i8 = i4 | 196608;
                        if ((1572864 & i2) == 0) {
                            i8 |= ((i3 & 64) == 0 && av8Var2.f(j)) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                        }
                        if ((i2 & 12582912) == 0) {
                            i8 |= 4194304;
                        }
                        if ((i2 & 100663296) == 0) {
                            if ((i3 & NotificationCompat.FLAG_LOCAL_ONLY) == 0) {
                                w8lVar2 = w8lVar;
                                if (av8Var2.g(w8lVar2)) {
                                    i14 = 67108864;
                                    i8 |= i14;
                                }
                            } else {
                                w8lVar2 = w8lVar;
                            }
                            i14 = 33554432;
                            i8 |= i14;
                        } else {
                            w8lVar2 = w8lVar;
                        }
                        if ((i2 & 805306368) == 0) {
                            i9 = i15;
                            i8 |= av8Var2.i(tc3Var) ? 536870912 : 268435456;
                        } else {
                            i9 = i15;
                        }
                        if (av8Var2.T(i8 & 1, (i8 & 306783379) != 306783378)) {
                            av8Var2.Y();
                            if ((i2 & 1) == 0 || av8Var2.B()) {
                                xtc xtcVar4 = i9 != 0 ? utc.a : xtcVar;
                                function213 = i16 != 0 ? vd3.a : function25;
                                function214 = i5 != 0 ? vd3.b : function26;
                                function215 = i6 != 0 ? vd3.c : function27;
                                function216 = i7 != 0 ? vd3.d : function28;
                                if ((i3 & 64) != 0) {
                                    j5 = ((g23) av8Var2.k(i23.a)).n;
                                    i8 &= -3670017;
                                } else {
                                    j5 = j;
                                }
                                b2 = i23.b(j5, av8Var2);
                                i11 = i8 & (-29360129);
                                if ((i3 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
                                    WeakHashMap weakHashMap = cal.w;
                                    xtcVar3 = xtcVar4;
                                    i11 = i8 & (-264241153);
                                    w8lVar4 = new jak(qea.p(av8Var2).g, qea.p(av8Var2).b);
                                    j6 = j5;
                                } else {
                                    j6 = j5;
                                    w8lVar4 = w8lVar2;
                                    xtcVar3 = xtcVar4;
                                }
                                i12 = 2;
                            } else {
                                av8Var2.W();
                                if ((i3 & 64) != 0) {
                                    i8 &= -3670017;
                                }
                                int i17 = i8 & (-29360129);
                                if ((i3 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
                                    i17 = i8 & (-264241153);
                                }
                                j6 = j;
                                i11 = i17;
                                function213 = function25;
                                function214 = function26;
                                function215 = function27;
                                function216 = function28;
                                w8lVar4 = w8lVar2;
                                xtcVar3 = xtcVar;
                                i12 = i;
                                b2 = j2;
                            }
                            av8Var2.t();
                            int i18 = (i11 & 234881024) ^ 100663296;
                            if (i18 <= 67108864 || !av8Var2.g(w8lVar4)) {
                                i13 = i12;
                                if ((i11 & 100663296) != 67108864) {
                                    z = false;
                                    O = av8Var2.O();
                                    z2 = z;
                                    a99 a99Var = nf3.a;
                                    if (!z2 || O == a99Var) {
                                        O = new l1d(w8lVar4);
                                        av8Var2.n0(O);
                                    }
                                    l1d l1dVar = (l1d) O;
                                    long j7 = j6;
                                    g = av8Var2.g(l1dVar) | ((i18 <= 67108864 && av8Var2.g(w8lVar4)) || (i11 & 100663296) == 67108864);
                                    O2 = av8Var2.O();
                                    if (!g || O2 == a99Var) {
                                        O2 = new aaf(10, l1dVar, w8lVar4);
                                        av8Var2.n0(O2);
                                    }
                                    Function2 function217 = function213;
                                    Function2 function218 = function214;
                                    Function2 function219 = function215;
                                    Function2 function220 = function216;
                                    long j8 = b2;
                                    w8l w8lVar5 = w8lVar4;
                                    uni.a(td4.m0(xtcVar3, (Function1) O2), null, j7, j8, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, yqo.H(848889571, av8Var2, new erg(i13, function217, tc3Var, function219, function220, l1dVar, function218)), av8Var2, ((i11 >> 12) & 896) | 12582912, Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE);
                                    j3 = j7;
                                    av8Var = av8Var2;
                                    xtcVar2 = xtcVar3;
                                    function29 = function217;
                                    function210 = function218;
                                    w8lVar3 = w8lVar5;
                                    i10 = i13;
                                    j4 = j8;
                                    function211 = function219;
                                    function212 = function220;
                                }
                            } else {
                                i13 = i12;
                            }
                            z = true;
                            O = av8Var2.O();
                            z2 = z;
                            a99 a99Var2 = nf3.a;
                            if (!z2) {
                            }
                            O = new l1d(w8lVar4);
                            av8Var2.n0(O);
                            l1d l1dVar2 = (l1d) O;
                            long j72 = j6;
                            g = av8Var2.g(l1dVar2) | ((i18 <= 67108864 && av8Var2.g(w8lVar4)) || (i11 & 100663296) == 67108864);
                            O2 = av8Var2.O();
                            if (!g) {
                            }
                            O2 = new aaf(10, l1dVar2, w8lVar4);
                            av8Var2.n0(O2);
                            Function2 function2172 = function213;
                            Function2 function2182 = function214;
                            Function2 function2192 = function215;
                            Function2 function2202 = function216;
                            long j82 = b2;
                            w8l w8lVar52 = w8lVar4;
                            uni.a(td4.m0(xtcVar3, (Function1) O2), null, j72, j82, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, yqo.H(848889571, av8Var2, new erg(i13, function2172, tc3Var, function2192, function2202, l1dVar2, function2182)), av8Var2, ((i11 >> 12) & 896) | 12582912, Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE);
                            j3 = j72;
                            av8Var = av8Var2;
                            xtcVar2 = xtcVar3;
                            function29 = function2172;
                            function210 = function2182;
                            w8lVar3 = w8lVar52;
                            i10 = i13;
                            j4 = j82;
                            function211 = function2192;
                            function212 = function2202;
                        } else {
                            av8Var2.W();
                            xtcVar2 = xtcVar;
                            i10 = i;
                            function29 = function25;
                            function210 = function26;
                            function211 = function27;
                            av8Var = av8Var2;
                            function212 = function28;
                            w8lVar3 = w8lVar2;
                            j3 = j;
                            j4 = j2;
                        }
                        u = av8Var.u();
                        if (u != null) {
                            u.d = new Function2() { // from class: crg
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    int K = aba.K(i2 | 1);
                                    q5a.p(xtc.this, function29, function210, function211, function212, i10, j3, j4, w8lVar3, tc3Var, (of3) obj, K, i3);
                                    return Unit.a;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    function28 = function24;
                    i8 = i4 | 196608;
                    if ((1572864 & i2) == 0) {
                    }
                    if ((i2 & 12582912) == 0) {
                    }
                    if ((i2 & 100663296) == 0) {
                    }
                    if ((i2 & 805306368) == 0) {
                    }
                    if (av8Var2.T(i8 & 1, (i8 & 306783379) != 306783378)) {
                    }
                    u = av8Var.u();
                    if (u != null) {
                    }
                }
                function27 = function23;
                i7 = i3 & 16;
                if (i7 == 0) {
                }
                function28 = function24;
                i8 = i4 | 196608;
                if ((1572864 & i2) == 0) {
                }
                if ((i2 & 12582912) == 0) {
                }
                if ((i2 & 100663296) == 0) {
                }
                if ((i2 & 805306368) == 0) {
                }
                if (av8Var2.T(i8 & 1, (i8 & 306783379) != 306783378)) {
                }
                u = av8Var.u();
                if (u != null) {
                }
            }
            function26 = function22;
            i6 = i3 & 8;
            if (i6 != 0) {
            }
            function27 = function23;
            i7 = i3 & 16;
            if (i7 == 0) {
            }
            function28 = function24;
            i8 = i4 | 196608;
            if ((1572864 & i2) == 0) {
            }
            if ((i2 & 12582912) == 0) {
            }
            if ((i2 & 100663296) == 0) {
            }
            if ((i2 & 805306368) == 0) {
            }
            if (av8Var2.T(i8 & 1, (i8 & 306783379) != 306783378)) {
            }
            u = av8Var.u();
            if (u != null) {
            }
        }
        function25 = function2;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        function26 = function22;
        i6 = i3 & 8;
        if (i6 != 0) {
        }
        function27 = function23;
        i7 = i3 & 16;
        if (i7 == 0) {
        }
        function28 = function24;
        i8 = i4 | 196608;
        if ((1572864 & i2) == 0) {
        }
        if ((i2 & 12582912) == 0) {
        }
        if ((i2 & 100663296) == 0) {
        }
        if ((i2 & 805306368) == 0) {
        }
        if (av8Var2.T(i8 & 1, (i8 & 306783379) != 306783378)) {
        }
        u = av8Var.u();
        if (u != null) {
        }
    }

    public static final void q(int i, Function2 function2, tc3 tc3Var, Function2 function22, Function2 function23, w8l w8lVar, Function2 function24, of3 of3Var, int i2) {
        int i3;
        boolean z;
        Object rc3Var;
        int i4;
        int i5;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-280287501);
        int i6 = i2 | (av8Var.e(i) ? 4 : 2) | (av8Var.i(function2) ? 32 : 16) | (av8Var.i(tc3Var) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.i(function22) ? 2048 : 1024) | (av8Var.i(function23) ? 16384 : 8192) | (av8Var.g(w8lVar) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE) | (av8Var.i(function24) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (av8Var.T(i6 & 1, (599187 & i6) != 599186)) {
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = new frg();
                av8Var.n0(O);
            }
            frg frgVar = (frg) O;
            boolean z2 = (i6 & 112) == 32;
            Object O2 = av8Var.O();
            if (z2 || O2 == a99Var) {
                O2 = new tc3(605195056, new vi4(6, function2), true);
                av8Var.n0(O2);
            }
            Function2 function25 = (Function2) O2;
            boolean z3 = (i6 & 7168) == 2048;
            Object O3 = av8Var.O();
            if (z3 || O3 == a99Var) {
                O3 = new tc3(418899191, new vi4(5, function22), true);
                av8Var.n0(O3);
            }
            Function2 function26 = (Function2) O3;
            boolean z4 = (57344 & i6) == 16384;
            Object O4 = av8Var.O();
            if (z4 || O4 == a99Var) {
                O4 = new tc3(338600263, new vi4(4, function23), true);
                av8Var.n0(O4);
            }
            Function2 function27 = (Function2) O4;
            boolean z5 = (i6 & 896) == 256;
            Object O5 = av8Var.O();
            if (z5 || O5 == a99Var) {
                i3 = i6;
                O5 = new tc3(-1776388365, new kp1(tc3Var, frgVar, false, 12), true);
                av8Var.n0(O5);
            } else {
                i3 = i6;
            }
            Function2 function28 = (Function2) O5;
            boolean z6 = (i3 & 3670016) == 1048576;
            Object O6 = av8Var.O();
            if (z6 || O6 == a99Var) {
                z = true;
                O6 = new tc3(-1731662488, new vi4(3, function24), true);
                av8Var.n0(O6);
            } else {
                z = true;
            }
            Function2 function29 = (Function2) O6;
            boolean g = ((i3 & 458752) == 131072 ? z : false) | av8Var.g(function25) | av8Var.g(function26) | av8Var.g(function27) | ((i3 & 14) == 4) | av8Var.g(function29) | av8Var.g(function28);
            Object O7 = av8Var.O();
            if (g || O7 == a99Var) {
                i4 = 0;
                i5 = 1;
                rc3Var = new rc3(w8lVar, function25, function26, function27, i, function29, frgVar, function28);
                av8Var.n0(rc3Var);
            } else {
                rc3Var = O7;
                i4 = 0;
                i5 = 1;
            }
            rz8.r(null, (Function2) rc3Var, av8Var, i4, i5);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new bi(i, function2, tc3Var, function22, function23, w8lVar, function24, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x060f  */
    /* JADX WARN: Removed duplicated region for block: B:169:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x05de  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x029f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void r(final String str, xtc xtcVar, xtc xtcVar2, final Function1 function1, Function0 function0, Function2 function2, Function2 function22, String str2, String str3, String str4, String str5, boolean z, q4a q4aVar, long j, int i, int i2, dfj dfjVar, long j2, long j3, int i3, boolean z2, boolean z3, boolean z4, of3 of3Var, final int i4, final int i5, final int i6, final int i7) {
        int i8;
        xtc xtcVar3;
        int i9;
        xtc xtcVar4;
        int i10;
        int i11;
        int i12;
        int i13;
        String str6;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        av8 av8Var;
        final Function0 function02;
        final Function2 function23;
        final Function2 function24;
        final String str7;
        final String str8;
        final long j4;
        final int i36;
        final int i37;
        final dfj dfjVar2;
        final long j5;
        final long j6;
        final int i38;
        final boolean z5;
        final boolean z6;
        final boolean z7;
        final String str9;
        final xtc xtcVar5;
        final xtc xtcVar6;
        final String str10;
        final boolean z8;
        final q4a q4aVar2;
        eqf u;
        xtc xtcVar7;
        final Function0 function03;
        Function2 function25;
        Function2 function26;
        String str11;
        String str12;
        String str13;
        boolean z9;
        q4a q4aVar3;
        long j7;
        dfj dfjVar3;
        long j8;
        long j9;
        boolean z10;
        boolean z11;
        dfj dfjVar4;
        int i39;
        int i40;
        int i41;
        long j10;
        boolean z12;
        Function2 function27;
        boolean z13;
        boolean z14;
        abj abjVar;
        int i42;
        int i43;
        str.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-471918100);
        if ((i4 & 6) == 0) {
            i8 = (av8Var2.g(str) ? 4 : 2) | i4;
        } else {
            i8 = i4;
        }
        int i44 = i7 & 2;
        if (i44 != 0) {
            i8 |= 48;
        } else if ((i4 & 48) == 0) {
            xtcVar3 = xtcVar;
            i8 |= av8Var2.g(xtcVar3) ? 32 : 16;
            i9 = i7 & 4;
            if (i9 == 0) {
                i8 |= 384;
            } else if ((i4 & 384) == 0) {
                xtcVar4 = xtcVar2;
                i8 |= av8Var2.g(xtcVar4) ? 256 : 128;
                if ((i4 & 3072) == 0) {
                    i8 |= av8Var2.i(function1) ? 2048 : 1024;
                }
                i10 = i8 | 24576;
                i11 = i7 & 32;
                if (i11 != 0) {
                    i10 = 221184 | i8;
                } else if ((196608 & i4) == 0) {
                    i10 |= av8Var2.i(function2) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
                    i12 = i7 & 64;
                    if (i12 == 0) {
                        i10 |= 1572864;
                    } else if ((i4 & 1572864) == 0) {
                        i10 |= av8Var2.i(function22) ? 1048576 : 524288;
                    }
                    i13 = i7 & 128;
                    if (i13 == 0) {
                        i10 |= 12582912;
                        str6 = str2;
                    } else {
                        str6 = str2;
                        if ((i4 & 12582912) == 0) {
                            i10 |= av8Var2.g(str6) ? 8388608 : 4194304;
                        }
                    }
                    i14 = i7 & NotificationCompat.FLAG_LOCAL_ONLY;
                    int i45 = 33554432;
                    if (i14 == 0) {
                        i10 |= 100663296;
                    } else if ((i4 & 100663296) == 0) {
                        i15 = i14;
                        i10 |= av8Var2.g(str3) ? 67108864 : 33554432;
                        i16 = i7 & 512;
                        int i46 = 268435456;
                        if (i16 != 0) {
                            i10 |= 805306368;
                        } else if ((i4 & 805306368) == 0) {
                            i17 = i16;
                            i10 |= av8Var2.g(str4) ? 536870912 : 268435456;
                            i18 = i7 & 1024;
                            if (i18 == 0) {
                                i20 = i5 | 6;
                                i19 = i18;
                            } else if ((i5 & 6) == 0) {
                                i19 = i18;
                                i20 = i5 | (av8Var2.g(str5) ? 4 : 2);
                            } else {
                                i19 = i18;
                                i20 = i5;
                            }
                            i21 = i7 & a.o;
                            if (i21 == 0) {
                                i20 |= 48;
                                i22 = i21;
                            } else if ((i5 & 48) == 0) {
                                i22 = i21;
                                i20 |= av8Var2.h(z) ? 32 : 16;
                            } else {
                                i22 = i21;
                            }
                            int i47 = i20;
                            i23 = i7 & 4096;
                            if (i23 == 0) {
                                i24 = i47 | 384;
                            } else {
                                int i48 = i47;
                                if ((i5 & 384) == 0) {
                                    i48 |= av8Var2.g(q4aVar) ? 256 : 128;
                                }
                                i24 = i48;
                            }
                            int i49 = i24 | 3072;
                            if ((i5 & 24576) != 0) {
                                if ((i7 & 16384) == 0) {
                                    i25 = i23;
                                    if (av8Var2.f(j)) {
                                        i43 = 16384;
                                        i49 |= i43;
                                    }
                                } else {
                                    i25 = i23;
                                }
                                i43 = 8192;
                                i49 |= i43;
                            } else {
                                i25 = i23;
                            }
                            i26 = i49 | 1769472;
                            if ((i5 & 12582912) != 0) {
                                if ((i7 & 131072) == 0) {
                                    i27 = i25;
                                    if (av8Var2.g(dfjVar)) {
                                        i42 = 8388608;
                                        i26 |= i42;
                                    }
                                } else {
                                    i27 = i25;
                                }
                                i42 = 4194304;
                                i26 |= i42;
                            } else {
                                i27 = i25;
                            }
                            if ((i5 & 100663296) == 0) {
                                if ((i7 & 262144) == 0 && av8Var2.f(j2)) {
                                    i45 = 67108864;
                                }
                                i26 |= i45;
                            }
                            if ((i5 & 805306368) == 0) {
                                if ((i7 & 524288) == 0 && av8Var2.f(j3)) {
                                    i46 = 536870912;
                                }
                                i26 |= i46;
                            }
                            i28 = i7 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                            if (i28 == 0) {
                                i29 = i6 | 6;
                            } else if ((i6 & 6) == 0) {
                                i29 = i6 | (av8Var2.e(i3) ? 4 : 2);
                            } else {
                                i29 = i6;
                            }
                            i30 = i7 & 2097152;
                            if (i30 == 0) {
                                i31 = i29 | 48;
                            } else {
                                i31 = i29 | (av8Var2.h(z2) ? 32 : 16);
                            }
                            int i50 = i31;
                            i32 = i7 & 4194304;
                            if (i32 == 0) {
                                i33 = i50 | 384;
                            } else if ((i6 & 384) == 0) {
                                i33 = i50 | (av8Var2.h(z3) ? 256 : 128);
                            } else {
                                i33 = i50;
                            }
                            i34 = i7 & 8388608;
                            if (i34 == 0) {
                                i35 = i33 | 3072;
                            } else {
                                int i51 = i33;
                                if ((i6 & 3072) == 0) {
                                    i51 |= av8Var2.h(z4) ? 2048 : 1024;
                                }
                                i35 = i51;
                            }
                            if (av8Var2.T(i10 & 1, ((i10 & 306783379) != 306783378 && (i26 & 306783379) == 306783378 && (i35 & 1171) == 1170) ? false : true)) {
                                av8Var = av8Var2;
                                av8Var.W();
                                function02 = function0;
                                function23 = function2;
                                function24 = function22;
                                str7 = str3;
                                str8 = str4;
                                j4 = j;
                                i36 = i;
                                i37 = i2;
                                dfjVar2 = dfjVar;
                                j5 = j2;
                                j6 = j3;
                                i38 = i3;
                                z5 = z2;
                                z6 = z3;
                                z7 = z4;
                                str9 = str6;
                                xtcVar5 = xtcVar4;
                                xtcVar6 = xtcVar3;
                                str10 = str5;
                                z8 = z;
                                q4aVar2 = q4aVar;
                            } else {
                                av8Var2.Y();
                                int i52 = i4 & 1;
                                a99 a99Var = nf3.a;
                                if (i52 == 0 || av8Var2.B()) {
                                    xtcVar7 = utc.a;
                                    if (i44 != 0) {
                                        xtcVar3 = xtcVar7;
                                    }
                                    if (i9 == 0) {
                                        xtcVar7 = xtcVar4;
                                    }
                                    Object O = av8Var2.O();
                                    if (O == a99Var) {
                                        O = new b7h(28);
                                        av8Var2.n0(O);
                                    }
                                    function03 = (Function0) O;
                                    function25 = i11 != 0 ? null : function2;
                                    function26 = i12 != 0 ? null : function22;
                                    if (i13 != 0) {
                                        str6 = null;
                                    }
                                    str11 = i15 != 0 ? null : str3;
                                    str12 = i17 != 0 ? null : str4;
                                    str13 = i19 != 0 ? null : str5;
                                    z9 = i22 != 0 ? false : z;
                                    q4aVar3 = i27 != 0 ? null : q4aVar;
                                    if ((i7 & 16384) != 0) {
                                        j7 = lz.D(R.color.surface_2, av8Var2);
                                        i26 &= -57345;
                                    } else {
                                        j7 = j;
                                    }
                                    if ((i7 & 131072) != 0) {
                                        yf8 yf8Var = xth.a;
                                        dfjVar3 = dfj.a(xth.d(), lz.D(R.color.n_lv_1, av8Var2), 0L, null, null, 0L, null, 0, 0, 0L, null, null, 0, 16777214);
                                        i26 &= -29360129;
                                    } else {
                                        dfjVar3 = dfjVar;
                                    }
                                    if ((i7 & 262144) != 0) {
                                        j8 = lz.D(R.color.n_lv_3, av8Var2);
                                        i26 &= -234881025;
                                    } else {
                                        j8 = j2;
                                    }
                                    if ((i7 & 524288) != 0) {
                                        j9 = lz.D(R.color.n_lv_3, av8Var2);
                                        i26 &= -1879048193;
                                    } else {
                                        j9 = j3;
                                    }
                                    int i53 = i28 != 0 ? 7 : i3;
                                    z10 = i30 != 0 ? true : z2;
                                    z11 = i32 != 0 ? true : z3;
                                    if (i34 != 0) {
                                        dfjVar4 = dfjVar3;
                                        i39 = i53;
                                        i40 = 1;
                                        z12 = true;
                                        i41 = -1;
                                        j10 = j9;
                                    } else {
                                        dfjVar4 = dfjVar3;
                                        i39 = i53;
                                        i40 = 1;
                                        i41 = -1;
                                        j10 = j9;
                                        z12 = z4;
                                    }
                                } else {
                                    av8Var2.W();
                                    if ((i7 & 16384) != 0) {
                                        i26 &= -57345;
                                    }
                                    if ((i7 & 131072) != 0) {
                                        i26 &= -29360129;
                                    }
                                    if ((i7 & 262144) != 0) {
                                        i26 &= -234881025;
                                    }
                                    if ((i7 & 524288) != 0) {
                                        i26 &= -1879048193;
                                    }
                                    function03 = function0;
                                    function26 = function22;
                                    str11 = str3;
                                    str12 = str4;
                                    str13 = str5;
                                    z9 = z;
                                    q4aVar3 = q4aVar;
                                    j7 = j;
                                    i40 = i;
                                    i41 = i2;
                                    dfjVar4 = dfjVar;
                                    j8 = j2;
                                    j10 = j3;
                                    i39 = i3;
                                    z10 = z2;
                                    z11 = z3;
                                    z12 = z4;
                                    xtcVar7 = xtcVar4;
                                    function25 = function2;
                                }
                                av8Var2.t();
                                final wd8 wd8Var = (wd8) av8Var2.k(dh3.i);
                                int i54 = i35;
                                int i55 = i10 & 14;
                                scj D = w1a.D(str, av8Var2, i55);
                                String str14 = str11;
                                String str15 = str6;
                                Object[] objArr = new Object[0];
                                Object O2 = av8Var2.O();
                                if (O2 == a99Var) {
                                    function27 = function25;
                                    O2 = new b7h(29);
                                    av8Var2.n0(O2);
                                } else {
                                    function27 = function25;
                                }
                                e1d e1dVar = (e1d) o3a.N(objArr, (Function0) O2, av8Var2, 48);
                                boolean z15 = !((Boolean) e1dVar.getValue()).booleanValue() && D.c().c.length() == 0 && str14 == null && str15 != null;
                                boolean z16 = D.c().c.length() == 0 && str14 != null;
                                yf8 yf8Var2 = xth.a;
                                dfj a2 = dfj.a(xth.d(), lz.D(R.color.n_lv_3, av8Var2), 0L, null, null, 0L, null, 0, 0, 0L, null, null, 0, 16777214);
                                e1d g = e.g(function1, av8Var2);
                                boolean g2 = av8Var2.g(D) | av8Var2.g(g);
                                Object O3 = av8Var2.O();
                                if (g2 || O3 == a99Var) {
                                    z13 = z15;
                                    z14 = z16;
                                    O3 = new big(D, g, null, 16);
                                    av8Var2.n0(O3);
                                } else {
                                    z13 = z15;
                                    z14 = z16;
                                }
                                hz8.o(av8Var2, D, (Function2) O3);
                                boolean g3 = (i55 == 4) | av8Var2.g(D);
                                Object O4 = av8Var2.O();
                                if (g3 || O4 == a99Var) {
                                    O4 = new m1f(str, D, null, 16);
                                    av8Var2.n0(O4);
                                }
                                hz8.o(av8Var2, str, (Function2) O4);
                                int i56 = i41;
                                final int i57 = i39;
                                kja kjaVar = new kja(i56, i40, i57, Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE);
                                boolean i58 = ((i10 & 57344) == 16384) | ((i54 & 14) == 4) | av8Var2.i(wd8Var);
                                Object O5 = av8Var2.O();
                                if (i58 || O5 == a99Var) {
                                    O5 = new fja() { // from class: rth
                                        @Override // defpackage.fja
                                        public final void a(y9j y9jVar) {
                                            Function0.this.invoke();
                                            int i59 = i57;
                                            wd8 wd8Var2 = wd8Var;
                                            if (i59 == 6) {
                                                ((yd8) wd8Var2).h(6, true);
                                            }
                                            if (i59 == 7) {
                                                wd8.a(wd8Var2);
                                            }
                                        }
                                    };
                                    av8Var2.n0(O5);
                                }
                                fja fjaVar = (fja) O5;
                                Function2 function28 = function26;
                                boolean z17 = z12;
                                tth tthVar = new tth(z14, str14, z13, xtcVar3, function27, function28, str15, str12, str13, z9, z10, j7, z11, z17, j8, e1dVar);
                                Function2 function29 = function27;
                                str9 = str15;
                                long j11 = j10;
                                pvh pvhVar = new pvh(j11);
                                dfj dfjVar5 = z10 ? dfjVar4 : a2;
                                if (z11) {
                                    abjVar = dti.h;
                                } else {
                                    abj.B7.getClass();
                                    abjVar = kpg.h;
                                }
                                xtc d2 = bkh.d(xtcVar7, 1.0f);
                                boolean g4 = av8Var2.g(e1dVar);
                                xtc xtcVar8 = xtcVar7;
                                Object O6 = av8Var2.O();
                                if (g4 || O6 == a99Var) {
                                    O6 = new eqh(2, e1dVar);
                                    av8Var2.n0(O6);
                                }
                                yo1.b(D, kik.L(d2, (Function1) O6), z10, q4aVar3, dfjVar5, kjaVar, fjaVar, abjVar, pvhVar, tthVar, null, av8Var2, ((i54 << 3) & 896) | ((i26 << 6) & 57344), (i26 >> 3) & 896, 17928);
                                av8Var = av8Var2;
                                i37 = i56;
                                i38 = i57;
                                xtcVar6 = xtcVar3;
                                function23 = function29;
                                z7 = z17;
                                z5 = z10;
                                z6 = z11;
                                str10 = str13;
                                xtcVar5 = xtcVar8;
                                q4aVar2 = q4aVar3;
                                z8 = z9;
                                str7 = str14;
                                j6 = j11;
                                function02 = function03;
                                dfjVar2 = dfjVar4;
                                str8 = str12;
                                j5 = j8;
                                i36 = i40;
                                function24 = function28;
                                j4 = j7;
                            }
                            u = av8Var.u();
                            if (u == null) {
                                u.d = new Function2() { // from class: sth
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        ((Integer) obj2).getClass();
                                        int K = aba.K(i4 | 1);
                                        int K2 = aba.K(i5);
                                        int K3 = aba.K(i6);
                                        q5a.r(str, xtcVar6, xtcVar5, function1, function02, function23, function24, str9, str7, str8, str10, z8, q4aVar2, j4, i36, i37, dfjVar2, j5, j6, i38, z5, z6, z7, (of3) obj, K, K2, K3, i7);
                                        return Unit.a;
                                    }
                                };
                                return;
                            }
                            return;
                        }
                        i17 = i16;
                        i18 = i7 & 1024;
                        if (i18 == 0) {
                        }
                        i21 = i7 & a.o;
                        if (i21 == 0) {
                        }
                        int i472 = i20;
                        i23 = i7 & 4096;
                        if (i23 == 0) {
                        }
                        int i492 = i24 | 3072;
                        if ((i5 & 24576) != 0) {
                        }
                        i26 = i492 | 1769472;
                        if ((i5 & 12582912) != 0) {
                        }
                        if ((i5 & 100663296) == 0) {
                        }
                        if ((i5 & 805306368) == 0) {
                        }
                        i28 = i7 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                        if (i28 == 0) {
                        }
                        i30 = i7 & 2097152;
                        if (i30 == 0) {
                        }
                        int i502 = i31;
                        i32 = i7 & 4194304;
                        if (i32 == 0) {
                        }
                        i34 = i7 & 8388608;
                        if (i34 == 0) {
                        }
                        if (av8Var2.T(i10 & 1, ((i10 & 306783379) != 306783378 && (i26 & 306783379) == 306783378 && (i35 & 1171) == 1170) ? false : true)) {
                        }
                        u = av8Var.u();
                        if (u == null) {
                        }
                    }
                    i15 = i14;
                    i16 = i7 & 512;
                    int i462 = 268435456;
                    if (i16 != 0) {
                    }
                    i17 = i16;
                    i18 = i7 & 1024;
                    if (i18 == 0) {
                    }
                    i21 = i7 & a.o;
                    if (i21 == 0) {
                    }
                    int i4722 = i20;
                    i23 = i7 & 4096;
                    if (i23 == 0) {
                    }
                    int i4922 = i24 | 3072;
                    if ((i5 & 24576) != 0) {
                    }
                    i26 = i4922 | 1769472;
                    if ((i5 & 12582912) != 0) {
                    }
                    if ((i5 & 100663296) == 0) {
                    }
                    if ((i5 & 805306368) == 0) {
                    }
                    i28 = i7 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    if (i28 == 0) {
                    }
                    i30 = i7 & 2097152;
                    if (i30 == 0) {
                    }
                    int i5022 = i31;
                    i32 = i7 & 4194304;
                    if (i32 == 0) {
                    }
                    i34 = i7 & 8388608;
                    if (i34 == 0) {
                    }
                    if (av8Var2.T(i10 & 1, ((i10 & 306783379) != 306783378 && (i26 & 306783379) == 306783378 && (i35 & 1171) == 1170) ? false : true)) {
                    }
                    u = av8Var.u();
                    if (u == null) {
                    }
                }
                i12 = i7 & 64;
                if (i12 == 0) {
                }
                i13 = i7 & 128;
                if (i13 == 0) {
                }
                i14 = i7 & NotificationCompat.FLAG_LOCAL_ONLY;
                int i452 = 33554432;
                if (i14 == 0) {
                }
                i15 = i14;
                i16 = i7 & 512;
                int i4622 = 268435456;
                if (i16 != 0) {
                }
                i17 = i16;
                i18 = i7 & 1024;
                if (i18 == 0) {
                }
                i21 = i7 & a.o;
                if (i21 == 0) {
                }
                int i47222 = i20;
                i23 = i7 & 4096;
                if (i23 == 0) {
                }
                int i49222 = i24 | 3072;
                if ((i5 & 24576) != 0) {
                }
                i26 = i49222 | 1769472;
                if ((i5 & 12582912) != 0) {
                }
                if ((i5 & 100663296) == 0) {
                }
                if ((i5 & 805306368) == 0) {
                }
                i28 = i7 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                if (i28 == 0) {
                }
                i30 = i7 & 2097152;
                if (i30 == 0) {
                }
                int i50222 = i31;
                i32 = i7 & 4194304;
                if (i32 == 0) {
                }
                i34 = i7 & 8388608;
                if (i34 == 0) {
                }
                if (av8Var2.T(i10 & 1, ((i10 & 306783379) != 306783378 && (i26 & 306783379) == 306783378 && (i35 & 1171) == 1170) ? false : true)) {
                }
                u = av8Var.u();
                if (u == null) {
                }
            }
            xtcVar4 = xtcVar2;
            if ((i4 & 3072) == 0) {
            }
            i10 = i8 | 24576;
            i11 = i7 & 32;
            if (i11 != 0) {
            }
            i12 = i7 & 64;
            if (i12 == 0) {
            }
            i13 = i7 & 128;
            if (i13 == 0) {
            }
            i14 = i7 & NotificationCompat.FLAG_LOCAL_ONLY;
            int i4522 = 33554432;
            if (i14 == 0) {
            }
            i15 = i14;
            i16 = i7 & 512;
            int i46222 = 268435456;
            if (i16 != 0) {
            }
            i17 = i16;
            i18 = i7 & 1024;
            if (i18 == 0) {
            }
            i21 = i7 & a.o;
            if (i21 == 0) {
            }
            int i472222 = i20;
            i23 = i7 & 4096;
            if (i23 == 0) {
            }
            int i492222 = i24 | 3072;
            if ((i5 & 24576) != 0) {
            }
            i26 = i492222 | 1769472;
            if ((i5 & 12582912) != 0) {
            }
            if ((i5 & 100663296) == 0) {
            }
            if ((i5 & 805306368) == 0) {
            }
            i28 = i7 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
            if (i28 == 0) {
            }
            i30 = i7 & 2097152;
            if (i30 == 0) {
            }
            int i502222 = i31;
            i32 = i7 & 4194304;
            if (i32 == 0) {
            }
            i34 = i7 & 8388608;
            if (i34 == 0) {
            }
            if (av8Var2.T(i10 & 1, ((i10 & 306783379) != 306783378 && (i26 & 306783379) == 306783378 && (i35 & 1171) == 1170) ? false : true)) {
            }
            u = av8Var.u();
            if (u == null) {
            }
        }
        xtcVar3 = xtcVar;
        i9 = i7 & 4;
        if (i9 == 0) {
        }
        xtcVar4 = xtcVar2;
        if ((i4 & 3072) == 0) {
        }
        i10 = i8 | 24576;
        i11 = i7 & 32;
        if (i11 != 0) {
        }
        i12 = i7 & 64;
        if (i12 == 0) {
        }
        i13 = i7 & 128;
        if (i13 == 0) {
        }
        i14 = i7 & NotificationCompat.FLAG_LOCAL_ONLY;
        int i45222 = 33554432;
        if (i14 == 0) {
        }
        i15 = i14;
        i16 = i7 & 512;
        int i462222 = 268435456;
        if (i16 != 0) {
        }
        i17 = i16;
        i18 = i7 & 1024;
        if (i18 == 0) {
        }
        i21 = i7 & a.o;
        if (i21 == 0) {
        }
        int i4722222 = i20;
        i23 = i7 & 4096;
        if (i23 == 0) {
        }
        int i4922222 = i24 | 3072;
        if ((i5 & 24576) != 0) {
        }
        i26 = i4922222 | 1769472;
        if ((i5 & 12582912) != 0) {
        }
        if ((i5 & 100663296) == 0) {
        }
        if ((i5 & 805306368) == 0) {
        }
        i28 = i7 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
        if (i28 == 0) {
        }
        i30 = i7 & 2097152;
        if (i30 == 0) {
        }
        int i5022222 = i31;
        i32 = i7 & 4194304;
        if (i32 == 0) {
        }
        i34 = i7 & 8388608;
        if (i34 == 0) {
        }
        if (av8Var2.T(i10 & 1, ((i10 & 306783379) != 306783378 && (i26 & 306783379) == 306783378 && (i35 & 1171) == 1170) ? false : true)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void s(final scj scjVar, xtc xtcVar, xtc xtcVar2, Function0 function0, String str, boolean z, String str2, q4a q4aVar, long j, long j2, int i, int i2, dfj dfjVar, int i3, boolean z2, boolean z3, of3 of3Var, final int i4, final int i5, final int i6) {
        int i7;
        xtc xtcVar3;
        int i8;
        int i9;
        int i10;
        boolean z4;
        int i11;
        String str3;
        int i12;
        q4a q4aVar2;
        int i13;
        int i14;
        int i15;
        int i16;
        av8 av8Var;
        final xtc xtcVar4;
        final Function0 function02;
        final long j3;
        final int i17;
        final int i18;
        final dfj dfjVar2;
        final int i19;
        final boolean z5;
        final boolean z6;
        final xtc xtcVar5;
        final boolean z7;
        final q4a q4aVar3;
        final long j4;
        final String str4;
        final String str5;
        eqf u;
        utc utcVar;
        String str6;
        long j5;
        long j6;
        dfj dfjVar3;
        int i20;
        int i21;
        boolean z8;
        boolean z9;
        int i22;
        int i23;
        Function0 function03;
        xtc xtcVar6;
        String str7;
        scjVar.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1159704713);
        if ((i4 & 6) == 0) {
            i7 = i4 | (av8Var2.g(scjVar) ? 4 : 2);
        } else {
            i7 = i4;
        }
        int i24 = i6 & 2;
        if (i24 != 0) {
            i7 |= 48;
        } else if ((i4 & 48) == 0) {
            xtcVar3 = xtcVar;
            i7 |= av8Var2.g(xtcVar3) ? 32 : 16;
            int i25 = 224640 | i7;
            i8 = i6 & 64;
            if (i8 == 0) {
                i25 = 1797504 | i7;
            } else if ((i4 & 1572864) == 0) {
                i25 |= av8Var2.g(str) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                i9 = 12582912 | i25;
                i10 = i6 & NotificationCompat.FLAG_LOCAL_ONLY;
                if (i10 != 0) {
                    i9 = 113246208 | i25;
                } else if ((i4 & 100663296) == 0) {
                    z4 = z;
                    i9 |= av8Var2.h(z4) ? 67108864 : 33554432;
                    i11 = i6 & 512;
                    if (i11 == 0) {
                        i9 |= 805306368;
                        str3 = str2;
                    } else {
                        str3 = str2;
                        if ((i4 & 805306368) == 0) {
                            i9 |= av8Var2.g(str3) ? 536870912 : 268435456;
                        }
                    }
                    int i26 = i5 | 6;
                    i12 = i6 & a.o;
                    if (i12 == 0) {
                        i13 = i5 | 54;
                        q4aVar2 = q4aVar;
                    } else {
                        q4aVar2 = q4aVar;
                        i13 = i26 | (av8Var2.g(q4aVar2) ? 32 : 16);
                    }
                    int i27 = i13 | 384 | (((i6 & 8192) == 0 || !av8Var2.f(j)) ? 1024 : a.o) | (((i6 & 16384) == 0 || !av8Var2.f(j2)) ? 8192 : 16384);
                    i14 = 32768 & i6;
                    if (i14 == 0) {
                        i27 |= 196608;
                    } else if ((i5 & 196608) == 0) {
                        i27 |= av8Var2.e(i) ? 131072 : 65536;
                    }
                    i15 = i6 & C.DEFAULT_BUFFER_SEGMENT_SIZE;
                    if (i15 == 0) {
                        i27 |= 1572864;
                    } else if ((i5 & 1572864) == 0) {
                        i27 |= av8Var2.e(i2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                    }
                    i16 = i27 | (((i6 & 131072) == 0 || !av8Var2.g(dfjVar)) ? 4194304 : 8388608) | 905969664;
                    if (av8Var2.T(i9 & 1, (i9 & 306783379) == 306783378 || (i16 & 306783379) != 306783378)) {
                        av8Var = av8Var2;
                        av8Var.W();
                        xtcVar4 = xtcVar2;
                        function02 = function0;
                        j3 = j2;
                        i17 = i;
                        i18 = i2;
                        dfjVar2 = dfjVar;
                        i19 = i3;
                        z5 = z2;
                        z6 = z3;
                        xtcVar5 = xtcVar3;
                        z7 = z4;
                        q4aVar3 = q4aVar2;
                        j4 = j;
                        str4 = str3;
                        str5 = str;
                    } else {
                        av8Var2.Y();
                        int i28 = i4 & 1;
                        Object obj = nf3.a;
                        if (i28 == 0 || av8Var2.B()) {
                            utc utcVar2 = utc.a;
                            if (i24 != 0) {
                                xtcVar3 = utcVar2;
                            }
                            Object O = av8Var2.O();
                            if (O == obj) {
                                utcVar = utcVar2;
                                O = new b7h(26);
                                av8Var2.n0(O);
                            } else {
                                utcVar = utcVar2;
                            }
                            Function0 function04 = (Function0) O;
                            str6 = i8 != 0 ? null : str;
                            if (i10 != 0) {
                                z4 = false;
                            }
                            if (i11 != 0) {
                                str3 = null;
                            }
                            if (i12 != 0) {
                                q4aVar2 = null;
                            }
                            if ((i6 & 8192) != 0) {
                                j5 = lz.D(R.color.surface_2, av8Var2);
                                i16 &= -7169;
                            } else {
                                j5 = j;
                            }
                            if ((i6 & 16384) != 0) {
                                j6 = lz.D(R.color.primary_default, av8Var2);
                                i16 &= -57345;
                            } else {
                                j6 = j2;
                            }
                            int i29 = i14 != 0 ? 1 : i;
                            int i30 = i15 != 0 ? -1 : i2;
                            if ((i6 & 131072) != 0) {
                                yf8 yf8Var = xth.a;
                                dfjVar3 = dfj.a(xth.d(), lz.D(R.color.n_lv_1, av8Var2), 0L, null, null, 0L, null, 0, 0, 0L, null, null, 0, 16777214);
                                i16 &= -29360129;
                            } else {
                                dfjVar3 = dfjVar;
                            }
                            i20 = i16;
                            i21 = 7;
                            z8 = true;
                            z9 = true;
                            i22 = i30;
                            i23 = i29;
                            function03 = function04;
                            xtcVar6 = utcVar;
                        } else {
                            av8Var2.W();
                            if ((i6 & 8192) != 0) {
                                i16 &= -7169;
                            }
                            if ((i6 & 16384) != 0) {
                                i16 &= -57345;
                            }
                            if ((i6 & 131072) != 0) {
                                i16 &= -29360129;
                            }
                            xtcVar6 = xtcVar2;
                            function03 = function0;
                            str6 = str;
                            j5 = j;
                            j6 = j2;
                            i23 = i;
                            dfjVar3 = dfjVar;
                            i21 = i3;
                            z8 = z2;
                            z9 = z3;
                            i20 = i16;
                            i22 = i2;
                        }
                        av8Var2.t();
                        String str8 = str3;
                        wd8 wd8Var = (wd8) av8Var2.k(dh3.i);
                        xtc xtcVar7 = xtcVar3;
                        boolean z10 = z4;
                        Object[] objArr = new Object[0];
                        Object O2 = av8Var2.O();
                        if (O2 == obj) {
                            str7 = str6;
                            O2 = new b7h(27);
                            av8Var2.n0(O2);
                        } else {
                            str7 = str6;
                        }
                        e1d e1dVar = (e1d) o3a.N(objArr, (Function0) O2, av8Var2, 48);
                        boolean z11 = (((Boolean) e1dVar.getValue()).booleanValue() || scjVar.c().c.length() != 0 || str7 == null) ? false : true;
                        scjVar.c().c.length();
                        yf8 yf8Var2 = xth.a;
                        dfj a2 = dfj.a(xth.d(), lz.D(R.color.n_lv_3, av8Var2), 0L, null, null, 0L, null, 0, 0, 0L, null, null, 0, 16777214);
                        kja kjaVar = new kja(i22, i23, i21, Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE);
                        int i31 = i21;
                        boolean i32 = ((i9 & 7168) == 2048) | av8Var2.i(wd8Var);
                        Object O3 = av8Var2.O();
                        if (i32 || O3 == obj) {
                            O3 = new hph(function03, wd8Var);
                            av8Var2.n0(O3);
                        }
                        fja fjaVar = (fja) O3;
                        long j7 = j5;
                        boolean z12 = z8;
                        boolean z13 = z9;
                        uth uthVar = new uth(false, z11, xtcVar7, str7, str8, z10, z12, j6, j7, z13, e1dVar);
                        String str9 = str7;
                        z5 = z12;
                        z6 = z13;
                        Function0 function05 = function03;
                        int i33 = i23;
                        pvh pvhVar = new pvh(lz.D(R.color.n_lv_3, av8Var2));
                        if (z5) {
                            a2 = dfjVar3;
                        }
                        dti dtiVar = dti.h;
                        xtc d2 = bkh.d(xtcVar6, 1.0f);
                        boolean g = av8Var2.g(e1dVar);
                        xtc xtcVar8 = xtcVar6;
                        Object O4 = av8Var2.O();
                        if (g || O4 == obj) {
                            O4 = new eqh(1, e1dVar);
                            av8Var2.n0(O4);
                        }
                        yo1.b(scjVar, kik.L(d2, (Function1) O4), z5, q4aVar2, a2, kjaVar, fjaVar, dtiVar, pvhVar, uthVar, null, av8Var2, (i9 & 14) | 384 | ((i20 << 9) & 57344), 384, 17928);
                        av8Var = av8Var2;
                        str5 = str9;
                        xtcVar5 = xtcVar7;
                        z7 = z10;
                        q4aVar3 = q4aVar2;
                        str4 = str8;
                        j4 = j7;
                        i19 = i31;
                        function02 = function05;
                        i17 = i33;
                        xtcVar4 = xtcVar8;
                        i18 = i22;
                        dfjVar2 = dfjVar3;
                        j3 = j6;
                    }
                    u = av8Var.u();
                    if (u == null) {
                        u.d = new Function2() { // from class: qth
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                ((Integer) obj3).getClass();
                                int K = aba.K(i4 | 1);
                                int K2 = aba.K(i5);
                                q5a.s(scj.this, xtcVar5, xtcVar4, function02, str5, z7, str4, q4aVar3, j4, j3, i17, i18, dfjVar2, i19, z5, z6, (of3) obj2, K, K2, i6);
                                return Unit.a;
                            }
                        };
                        return;
                    }
                    return;
                }
                z4 = z;
                i11 = i6 & 512;
                if (i11 == 0) {
                }
                int i262 = i5 | 6;
                i12 = i6 & a.o;
                if (i12 == 0) {
                }
                int i272 = i13 | 384 | (((i6 & 8192) == 0 || !av8Var2.f(j)) ? 1024 : a.o) | (((i6 & 16384) == 0 || !av8Var2.f(j2)) ? 8192 : 16384);
                i14 = 32768 & i6;
                if (i14 == 0) {
                }
                i15 = i6 & C.DEFAULT_BUFFER_SEGMENT_SIZE;
                if (i15 == 0) {
                }
                i16 = i272 | (((i6 & 131072) == 0 || !av8Var2.g(dfjVar)) ? 4194304 : 8388608) | 905969664;
                if (av8Var2.T(i9 & 1, (i9 & 306783379) == 306783378 || (i16 & 306783379) != 306783378)) {
                }
                u = av8Var.u();
                if (u == null) {
                }
            }
            i9 = 12582912 | i25;
            i10 = i6 & NotificationCompat.FLAG_LOCAL_ONLY;
            if (i10 != 0) {
            }
            z4 = z;
            i11 = i6 & 512;
            if (i11 == 0) {
            }
            int i2622 = i5 | 6;
            i12 = i6 & a.o;
            if (i12 == 0) {
            }
            int i2722 = i13 | 384 | (((i6 & 8192) == 0 || !av8Var2.f(j)) ? 1024 : a.o) | (((i6 & 16384) == 0 || !av8Var2.f(j2)) ? 8192 : 16384);
            i14 = 32768 & i6;
            if (i14 == 0) {
            }
            i15 = i6 & C.DEFAULT_BUFFER_SEGMENT_SIZE;
            if (i15 == 0) {
            }
            i16 = i2722 | (((i6 & 131072) == 0 || !av8Var2.g(dfjVar)) ? 4194304 : 8388608) | 905969664;
            if (av8Var2.T(i9 & 1, (i9 & 306783379) == 306783378 || (i16 & 306783379) != 306783378)) {
            }
            u = av8Var.u();
            if (u == null) {
            }
        }
        xtcVar3 = xtcVar;
        int i252 = 224640 | i7;
        i8 = i6 & 64;
        if (i8 == 0) {
        }
        i9 = 12582912 | i252;
        i10 = i6 & NotificationCompat.FLAG_LOCAL_ONLY;
        if (i10 != 0) {
        }
        z4 = z;
        i11 = i6 & 512;
        if (i11 == 0) {
        }
        int i26222 = i5 | 6;
        i12 = i6 & a.o;
        if (i12 == 0) {
        }
        int i27222 = i13 | 384 | (((i6 & 8192) == 0 || !av8Var2.f(j)) ? 1024 : a.o) | (((i6 & 16384) == 0 || !av8Var2.f(j2)) ? 8192 : 16384);
        i14 = 32768 & i6;
        if (i14 == 0) {
        }
        i15 = i6 & C.DEFAULT_BUFFER_SEGMENT_SIZE;
        if (i15 == 0) {
        }
        i16 = i27222 | (((i6 & 131072) == 0 || !av8Var2.g(dfjVar)) ? 4194304 : 8388608) | 905969664;
        if (av8Var2.T(i9 & 1, (i9 & 306783379) == 306783378 || (i16 & 306783379) != 306783378)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    public static final void t(final agl aglVar, gv9 gv9Var, final long j, boolean z, of3 of3Var, int i) {
        int i2;
        Object obj;
        Object obj2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-585856205);
        if ((i & 6) == 0) {
            i2 = (av8Var.g(aglVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.g(gv9Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var.f(j) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= av8Var.h(z) ? a.o : 1024;
        }
        if (av8Var.T(i2 & 1, (i2 & 1171) != 1170)) {
            final Context context = (Context) av8Var.k(nz.b);
            int i3 = i2 & 112;
            boolean z2 = i3 == 32;
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            Object obj3 = null;
            if (z2 || O == a99Var) {
                if (gv9Var != null) {
                    Iterator<E> it = gv9Var.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        } else {
                            obj = it.next();
                            if (((xel) obj).a.d()) {
                                break;
                            }
                        }
                    }
                    O = (xel) obj;
                } else {
                    O = null;
                }
                av8Var.n0(O);
            }
            final xel xelVar = (xel) O;
            boolean z3 = i3 == 32;
            Object O2 = av8Var.O();
            if (z3 || O2 == a99Var) {
                if (gv9Var != null) {
                    Iterator<E> it2 = gv9Var.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj2 = null;
                            break;
                        } else {
                            obj2 = it2.next();
                            if (((xel) obj2).a.c()) {
                                break;
                            }
                        }
                    }
                    O2 = (xel) obj2;
                } else {
                    O2 = null;
                }
                av8Var.n0(O2);
            }
            final xel xelVar2 = (xel) O2;
            boolean z4 = i3 == 32;
            Object O3 = av8Var.O();
            if (z4 || O3 == a99Var) {
                if (gv9Var != null) {
                    ListIterator listIterator = gv9Var.listIterator(gv9Var.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            break;
                        }
                        Object previous = listIterator.previous();
                        if (((xel) previous).a.b()) {
                            obj3 = previous;
                            break;
                        }
                    }
                    obj3 = (xel) obj3;
                }
                av8Var.n0(obj3);
                O3 = obj3;
            }
            final xel xelVar3 = (xel) O3;
            l98.b(Boolean.valueOf(z), null, null, null, null, null, yqo.H(-382361456, av8Var, new et8() { // from class: tfl
                @Override // defpackage.et8
                public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                    av8 av8Var2;
                    String a2;
                    String str;
                    boolean z5;
                    boolean z6;
                    boolean booleanValue = ((Boolean) obj5).booleanValue();
                    of3 of3Var2 = (of3) obj6;
                    ((Integer) obj7).getClass();
                    ((k60) obj4).getClass();
                    l8g a3 = k8g.a(ww9.b, uxf.m, of3Var2, 48);
                    av8 av8Var3 = (av8) of3Var2;
                    int hashCode = Long.hashCode(av8Var3.T);
                    aee m = av8Var3.m();
                    utc utcVar = utc.a;
                    xtc C = fqj.C(of3Var2, utcVar);
                    if3.k7.getClass();
                    zg3 zg3Var = hf3.b;
                    av8 av8Var4 = (av8) of3Var2;
                    av8Var4.h0();
                    if (av8Var4.S) {
                        av8Var4.l(zg3Var);
                    } else {
                        av8Var4.q0();
                    }
                    waa.K(of3Var2, a3, hf3.g);
                    waa.K(of3Var2, m, hf3.f);
                    waa.K(of3Var2, Integer.valueOf(hashCode), hf3.j);
                    waa.J(of3Var2, hf3.k);
                    waa.K(of3Var2, C, hf3.d);
                    xel xelVar4 = xel.this;
                    xel xelVar5 = xelVar;
                    xel xelVar6 = xelVar3;
                    agl aglVar2 = aglVar;
                    if (booleanValue) {
                        av8Var2 = av8Var4;
                        av8Var2.d0(97886324);
                        String a4 = aglVar2.d.a(of3Var2);
                        if (xelVar4 != null) {
                            xelVar5 = xelVar4;
                        } else if (xelVar5 == null) {
                            xelVar5 = xelVar6;
                        }
                        String str2 = null;
                        r9k r9kVar = xelVar5 != null ? xelVar5.c : null;
                        if (r9kVar == null) {
                            av8Var2.d0(98005859);
                            av8Var2.s(false);
                            a2 = null;
                        } else {
                            av8Var2.d0(-1382311842);
                            a2 = r9kVar.a(of3Var2);
                            av8Var2.s(false);
                        }
                        if (a2 != null && a2.length() > 0) {
                            str2 = a2;
                        }
                        String w = oea.w(R.string.number_place, new Object[]{yid.p(aglVar2.e)}, of3Var2);
                        int i4 = aglVar2.f;
                        String lowerCase = oea.v(R.string.points_short, of3Var2).toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                        String str3 = i4 + " " + lowerCase;
                        if (yaa.w() > j) {
                            if (str2 == null) {
                                a4 = a4 + " · " + w + " · " + str3;
                            } else {
                                str = str2;
                                xtc f0 = l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                                yf8 yf8Var = xth.a;
                                udj.c(str, f0, lz.D(R.color.on_color_secondary, of3Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), of3Var2, 48, 0, 131064);
                                av8Var2.s(false);
                            }
                        }
                        str = a4;
                        xtc f02 = l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                        yf8 yf8Var2 = xth.a;
                        udj.c(str, f02, lz.D(R.color.on_color_secondary, of3Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), of3Var2, 48, 0, 131064);
                        av8Var2.s(false);
                    } else {
                        av8Var4.d0(93679159);
                        if (xelVar4 != null) {
                            wn1 wn1Var = xelVar4.a;
                            av8Var4.d0(93652313);
                            kq9.b(s6a.N(R.drawable.ic_live_icon, 6, of3Var2), null, bkh.l(utcVar, 16.0f), lz.D(R.color.on_color_primary, of3Var2), of3Var2, 432, 0);
                            xtc f03 = l98.f0(utcVar, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
                            String v = oea.v(R.string.live_teams_score, of3Var2);
                            yf8 yf8Var3 = xth.a;
                            av8Var2 = av8Var4;
                            udj.c(v, f03, lz.D(R.color.on_color_primary, of3Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), of3Var2, 48, 0, 131064);
                            int i5 = wn1Var.b;
                            int i6 = wn1Var.c;
                            Integer num = wn1Var.j;
                            int intValue = num != null ? num.intValue() : 0;
                            Integer num2 = wn1Var.k;
                            rha.d(i5, i6, intValue, num2 != null ? num2.intValue() : 0, wn1Var.u, null, r13.h, lz.D(R.color.on_color_primary, of3Var2), lz.D(R.color.on_color_primary, of3Var2), 4.0f, 16.0f, of3Var2, 806879232, 6, 32);
                            Unit unit = Unit.a;
                            av8Var2.s(false);
                            z5 = false;
                        } else {
                            av8Var2 = av8Var4;
                            if (xelVar5 != null) {
                                av8Var2.d0(95063526);
                                wn1 wn1Var2 = xelVar5.a;
                                int i7 = wn1Var2.b;
                                long j2 = wn1Var2.p;
                                Integer num3 = aglVar2.a;
                                boolean z7 = num3 != null && i7 == num3.intValue();
                                String str4 = z7 ? wn1Var2.g : wn1Var2.d;
                                int i8 = z7 ? wn1Var2.c : wn1Var2.b;
                                if (z7 ? wn1Var2.o : wn1Var2.n) {
                                    av8Var2.d0(-920547031);
                                    boolean f2 = av8Var2.f(j2);
                                    Object O4 = av8Var2.O();
                                    if (f2 || O4 == nf3.a) {
                                        O4 = rik.j(context, j2, bi4.PATTERN_DMM, " · ");
                                        av8Var2.n0(O4);
                                    }
                                    String w2 = oea.w(R.string.next_match_date, new Object[]{(String) O4}, of3Var2);
                                    yf8 yf8Var4 = xth.a;
                                    z6 = false;
                                    udj.c(w2, null, lz.D(R.color.on_color_secondary, of3Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), of3Var2, 0, 0, 131066);
                                    av8Var2.s(false);
                                } else {
                                    z6 = false;
                                    av8Var2.d0(-919977251);
                                    String str5 = str4;
                                    goa goaVar = new goa(1.0f, false);
                                    String w3 = oea.w(R.string.football_next_opponent, new Object[]{str5}, of3Var2);
                                    yf8 yf8Var5 = xth.a;
                                    udj.c(w3, goaVar, lz.D(R.color.on_color_secondary, of3Var2), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), of3Var2, 0, 24960, 110584);
                                    td4.G(i8, bkh.l(l98.d0(utcVar, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), 16.0f), false, 0L, of3Var2, 48, 12);
                                    av8Var2.s(false);
                                }
                                Unit unit2 = Unit.a;
                                av8Var2.s(z6);
                                z5 = z6;
                            } else if (xelVar6 != null) {
                                av8Var2.d0(96902322);
                                wn1 wn1Var3 = xelVar6.a;
                                String v2 = oea.v(R.string.last_match_info, of3Var2);
                                yf8 yf8Var6 = xth.a;
                                udj.c(v2, null, lz.D(R.color.on_color_secondary, of3Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), of3Var2, 0, 0, 131066);
                                int i9 = wn1Var3.b;
                                int i10 = wn1Var3.c;
                                Integer num4 = wn1Var3.j;
                                int intValue2 = num4 != null ? num4.intValue() : 0;
                                Integer num5 = wn1Var3.k;
                                rha.d(i9, i10, intValue2, num5 != null ? num5.intValue() : 0, wn1Var3.u, null, r13.h, lz.D(R.color.on_color_primary, of3Var2), lz.D(R.color.on_color_secondary, of3Var2), 4.0f, 16.0f, of3Var2, 806879232, 6, 32);
                                Unit unit3 = Unit.a;
                                z5 = false;
                                av8Var2.s(false);
                            } else {
                                z5 = false;
                                av8Var2.d0(97838894);
                                av8Var2.s(false);
                            }
                        }
                        av8Var2.s(z5);
                    }
                    av8Var2.s(true);
                    return Unit.a;
                }
            }), av8Var, ((i2 >> 9) & 14) | 1572864, 62);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new x77(aglVar, gv9Var, j, z, i);
        }
    }

    public static final void u(ifl iflVar, Function1 function1, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1445921845);
        int i2 = (av8Var.g(iflVar) ? 4 : 2) | i | (av8Var.i(function1) ? 32 : 16);
        int i3 = 0;
        if (av8Var.T(i2 & 1, (i2 & 19) != 18)) {
            utc utcVar = utc.a;
            xtc q = n9e.q(wnn.A(l98.f0(bkh.d(utcVar, 1.0f), 8.0f, 16.0f, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8), o7g.a(16.0f)), lz.D(R.color.on_color_highlight_2, av8Var), oyn.e);
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object O = av8Var.O();
            if (z || O == nf3.a) {
                O = new ufl(i3, function1, iflVar);
                av8Var.n0(O);
            }
            xtc c0 = l98.c0(tol.y(q, false, false, false, 0L, null, (Function0) O, av8Var, 31), 16.0f, 8.0f);
            l8g a2 = k8g.a(ww9.b, uxf.m, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, c0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var, a2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            kq9.b(s6a.N(R.drawable.ic_cross, 6, av8Var), null, bkh.l(utcVar, 24.0f), lz.D(R.color.on_color_primary, av8Var), av8Var, 432, 0);
            xtc e2 = fn0.e(1.0f, l98.d0(utcVar, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), true);
            u23 a3 = t23.a(new ng0(4.0f, true, new a70(6)), uxf.o, av8Var, 6);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, e2);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, f50Var);
            waa.K(av8Var, m2, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            String v = oea.v(R.string.injuries_and_suspensions, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(v, null, lz.D(R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.l(), av8Var, 0, 0, 131066);
            String str = iflVar.b;
            if (str == null) {
                str = "";
            }
            udj.c(str, null, lz.D(R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var, 0, 0, 131066);
            av8Var = av8Var;
            av8Var.s(true);
            kq9.b(s6a.N(R.drawable.ic_chevron_right, 6, av8Var), null, bkh.l(utcVar, 16.0f), lz.D(R.color.on_color_primary, av8Var), av8Var, 432, 0);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new bmj(iflVar, function1, i, 17);
        }
    }

    public static final void v(int i, long j, of3 of3Var, xtc xtcVar, String str) {
        av8 av8Var;
        xtc xtcVar2;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-2021911258);
        int i2 = i | (av8Var2.g(str) ? 4 : 2) | (av8Var2.f(j) ? 32 : 16) | 384;
        if (av8Var2.T(i2 & 1, (i2 & 147) != 146)) {
            l8g a2 = k8g.a(ww9.b, uxf.m, av8Var2, 48);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m = av8Var2.m();
            utc utcVar = utc.a;
            xtc C = fqj.C(av8Var2, utcVar);
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
            waa.K(av8Var2, C, hf3.d);
            e12.a(0, av8Var2, n9e.q(bkh.e(bkh.p(utcVar, 8.0f), 2.0f), j, oyn.e));
            nq8.h(av8Var2, bkh.p(utcVar, 12.0f));
            yf8 yf8Var = xth.a;
            xtcVar2 = utcVar;
            udj.c(str, null, lz.D(R.color.n_lv_3, av8Var2), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var2, i2 & 14, 24960, 110586);
            av8Var = av8Var2;
            av8Var.s(true);
        } else {
            av8Var = av8Var2;
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new l67(str, j, xtcVar2, i, 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void w(final String str, xtc xtcVar, final long j, es0 es0Var, long j2, long j3, p7j p7jVar, long j4, int i, boolean z, int i2, int i3, final dfj dfjVar, of3 of3Var, final int i4, final int i5, final int i6) {
        int i7;
        final xtc xtcVar2;
        int i8;
        final es0 es0Var2;
        int i9;
        int i10;
        p7j p7jVar2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        final long j5;
        final long j6;
        final boolean z2;
        final int i21;
        final int i22;
        final p7j p7jVar3;
        final int i23;
        final long j7;
        eqf u;
        final boolean z3;
        final long j8;
        final long j9;
        str.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-254581139);
        if ((i4 & 6) == 0) {
            i7 = (av8Var.g(str) ? 4 : 2) | i4;
        } else {
            i7 = i4;
        }
        int i24 = i6 & 2;
        if (i24 != 0) {
            i7 |= 48;
        } else if ((i4 & 48) == 0) {
            xtcVar2 = xtcVar;
            i7 |= av8Var.g(xtcVar2) ? 32 : 16;
            if ((i4 & 384) == 0) {
                i7 |= av8Var.f(j) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
            }
            i8 = i6 & 8;
            int i25 = a.o;
            if (i8 == 0) {
                i7 |= 3072;
            } else if ((i4 & 3072) == 0) {
                es0Var2 = es0Var;
                i7 |= av8Var.i(es0Var2) ? 2048 : 1024;
                i9 = i7 | 920346624;
                i10 = i6 & 1024;
                if (i10 != 0) {
                    i12 = i5 | 6;
                    p7jVar2 = p7jVar;
                } else {
                    p7jVar2 = p7jVar;
                    if ((i5 & 6) == 0) {
                        i12 = i5 | (av8Var.g(p7jVar2) ? 4 : 2);
                    } else {
                        i11 = i5;
                        int i26 = i11 | 48;
                        i13 = i6 & 4096;
                        if (i13 == 0) {
                            i15 = i11 | 432;
                            i14 = i;
                        } else {
                            if ((i5 & 384) == 0) {
                                i14 = i;
                                i26 |= av8Var.e(i14) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
                            } else {
                                i14 = i;
                            }
                            i15 = i26;
                        }
                        i16 = i6 & 8192;
                        if (i16 == 0) {
                            i17 = i15 | 3072;
                        } else {
                            int i27 = i15;
                            if ((i5 & 3072) == 0) {
                                if (!av8Var.h(z)) {
                                    i25 = 1024;
                                }
                                i17 = i27 | i25;
                            } else {
                                i17 = i27;
                            }
                        }
                        i18 = i6 & 16384;
                        if (i18 == 0) {
                            i19 = i17 | 24576;
                        } else {
                            i19 = i17;
                            if ((i5 & 24576) == 0) {
                                i19 |= av8Var.e(i2) ? 16384 : 8192;
                                i20 = i19 | 1769472;
                                if ((i5 & 12582912) == 0) {
                                    i20 |= av8Var.g(dfjVar) ? 8388608 : 4194304;
                                }
                                if (av8Var.T(i9 & 1, (i9 & 306783379) == 306783378 || (i20 & 4793491) != 4793490)) {
                                    av8Var.Y();
                                    if ((i4 & 1) == 0 || av8Var.B()) {
                                        xtc xtcVar3 = i24 != 0 ? utc.a : xtcVar2;
                                        if (i8 != 0) {
                                            es0Var2 = null;
                                        }
                                        long j10 = lfj.c;
                                        if (i10 != 0) {
                                            p7jVar2 = null;
                                        }
                                        if (i13 != 0) {
                                            i14 = 1;
                                        }
                                        z3 = i16 != 0 ? true : z;
                                        i21 = i18 != 0 ? Integer.MAX_VALUE : i2;
                                        j8 = j10;
                                        j6 = j8;
                                        i22 = 1;
                                        xtcVar2 = xtcVar3;
                                        j9 = j6;
                                    } else {
                                        av8Var.W();
                                        j8 = j2;
                                        j6 = j3;
                                        j9 = j4;
                                        z3 = z;
                                        i21 = i2;
                                        i22 = i3;
                                    }
                                    final p7j p7jVar4 = p7jVar2;
                                    final int i28 = i14;
                                    final es0 es0Var3 = es0Var2;
                                    av8Var.t();
                                    ff5 ff5Var = dh3.h;
                                    tol.b(ff5Var.a(new nx4(((kx4) av8Var.k(ff5Var)).j(), 1.0f)), yqo.H(743246253, av8Var, new Function2() { // from class: mej
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            of3 of3Var2 = (of3) obj;
                                            int intValue = ((Integer) obj2).intValue();
                                            av8 av8Var2 = (av8) of3Var2;
                                            if (av8Var2.T(intValue & 1, (intValue & 3) != 2)) {
                                                udj.c(str, xtcVar2, j, es0Var3, j8, null, j6, null, p7jVar4, j9, i28, z3, i21, i22, null, dfjVar, av8Var2, 0, 0, 0);
                                            } else {
                                                av8Var2.W();
                                            }
                                            return Unit.a;
                                        }
                                    }), av8Var, 56);
                                    es0Var2 = es0Var3;
                                    j5 = j8;
                                    p7jVar3 = p7jVar4;
                                    j7 = j9;
                                    i23 = i28;
                                    z2 = z3;
                                } else {
                                    av8Var.W();
                                    j5 = j2;
                                    j6 = j3;
                                    z2 = z;
                                    i21 = i2;
                                    i22 = i3;
                                    p7jVar3 = p7jVar2;
                                    i23 = i14;
                                    j7 = j4;
                                }
                                u = av8Var.u();
                                if (u != null) {
                                    final xtc xtcVar4 = xtcVar2;
                                    final long j11 = j6;
                                    final int i29 = i21;
                                    final int i30 = i22;
                                    u.d = new Function2() { // from class: nej
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            ((Integer) obj2).getClass();
                                            int K = aba.K(i4 | 1);
                                            int K2 = aba.K(i5);
                                            q5a.w(str, xtcVar4, j, es0Var2, j5, j11, p7jVar3, j7, i23, z2, i29, i30, dfjVar, (of3) obj, K, K2, i6);
                                            return Unit.a;
                                        }
                                    };
                                    return;
                                }
                                return;
                            }
                        }
                        i20 = i19 | 1769472;
                        if ((i5 & 12582912) == 0) {
                        }
                        if (av8Var.T(i9 & 1, (i9 & 306783379) == 306783378 || (i20 & 4793491) != 4793490)) {
                        }
                        u = av8Var.u();
                        if (u != null) {
                        }
                    }
                }
                i11 = i12;
                int i262 = i11 | 48;
                i13 = i6 & 4096;
                if (i13 == 0) {
                }
                i16 = i6 & 8192;
                if (i16 == 0) {
                }
                i18 = i6 & 16384;
                if (i18 == 0) {
                }
                i20 = i19 | 1769472;
                if ((i5 & 12582912) == 0) {
                }
                if (av8Var.T(i9 & 1, (i9 & 306783379) == 306783378 || (i20 & 4793491) != 4793490)) {
                }
                u = av8Var.u();
                if (u != null) {
                }
            }
            es0Var2 = es0Var;
            i9 = i7 | 920346624;
            i10 = i6 & 1024;
            if (i10 != 0) {
            }
            i11 = i12;
            int i2622 = i11 | 48;
            i13 = i6 & 4096;
            if (i13 == 0) {
            }
            i16 = i6 & 8192;
            if (i16 == 0) {
            }
            i18 = i6 & 16384;
            if (i18 == 0) {
            }
            i20 = i19 | 1769472;
            if ((i5 & 12582912) == 0) {
            }
            if (av8Var.T(i9 & 1, (i9 & 306783379) == 306783378 || (i20 & 4793491) != 4793490)) {
            }
            u = av8Var.u();
            if (u != null) {
            }
        }
        xtcVar2 = xtcVar;
        if ((i4 & 384) == 0) {
        }
        i8 = i6 & 8;
        int i252 = a.o;
        if (i8 == 0) {
        }
        es0Var2 = es0Var;
        i9 = i7 | 920346624;
        i10 = i6 & 1024;
        if (i10 != 0) {
        }
        i11 = i12;
        int i26222 = i11 | 48;
        i13 = i6 & 4096;
        if (i13 == 0) {
        }
        i16 = i6 & 8192;
        if (i16 == 0) {
        }
        i18 = i6 & 16384;
        if (i18 == 0) {
        }
        i20 = i19 | 1769472;
        if ((i5 & 12582912) == 0) {
        }
        if (av8Var.T(i9 & 1, (i9 & 306783379) == 306783378 || (i20 & 4793491) != 4793490)) {
        }
        u = av8Var.u();
        if (u != null) {
        }
    }

    public static void x(Parcel parcel, Double d2) {
        parcel.writeInt(1);
        parcel.writeDouble(d2.doubleValue());
    }

    public static void y(String str) {
        if (lik.a >= 18) {
            Trace.beginSection(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean z(File file, Resources resources, int i) {
        FileOutputStream fileOutputStream;
        int read;
        InputStream inputStream = null;
        FileOutputStream fileOutputStream2 = null;
        ?? r0 = 0;
        try {
            InputStream openRawResource = resources.openRawResource(i);
            try {
                StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
                boolean z = false;
                try {
                    try {
                        fileOutputStream = new FileOutputStream(file, false);
                    } catch (Throwable th) {
                        th = th;
                    }
                } catch (IOException e2) {
                    e = e2;
                }
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        read = openRawResource.read(bArr);
                        if (read != -1) {
                            fileOutputStream.write(bArr, 0, read);
                        } else {
                            try {
                                break;
                            } catch (IOException unused) {
                            }
                        }
                    }
                    fileOutputStream.close();
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    z = true;
                    r0 = read;
                } catch (IOException e3) {
                    e = e3;
                    fileOutputStream2 = fileOutputStream;
                    e.getMessage();
                    if (fileOutputStream2 != null) {
                        try {
                            fileOutputStream2.close();
                        } catch (IOException unused2) {
                        }
                    }
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    r0 = fileOutputStream2;
                    if (openRawResource != null) {
                    }
                    return z;
                } catch (Throwable th2) {
                    th = th2;
                    r0 = fileOutputStream;
                    if (r0 != 0) {
                        try {
                            r0.close();
                        } catch (IOException unused3) {
                        }
                    }
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    throw th;
                }
                if (openRawResource != null) {
                    try {
                        openRawResource.close();
                    } catch (IOException unused4) {
                    }
                }
                return z;
            } catch (Throwable th3) {
                th = th3;
                inputStream = openRawResource;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused5) {
                    }
                }
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }
}
