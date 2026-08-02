package com.vk.masks;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vk.cachecontrol.api.CacheComponent;
import com.vk.cachecontrol.api.CacheTarget;
import com.vk.core.files.PrivateFiles;
import com.vk.core.files.PrivateSubdir;
import com.vk.core.preference.Preference;
import com.vk.dto.masks.Mask;
import com.vk.dto.masks.SmartMasksGetModelResponse;
import com.vk.masks.MasksController;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.core.t;
import io.reactivex.rxjava3.disposables.c;
import io.reactivex.rxjava3.functions.f;
import io.reactivex.rxjava3.functions.l;
import io.reactivex.rxjava3.functions.n;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.operators.observable.b0;
import io.reactivex.rxjava3.internal.operators.observable.c0;
import io.reactivex.rxjava3.internal.operators.observable.g0;
import io.reactivex.rxjava3.internal.operators.observable.j1;
import io.reactivex.rxjava3.internal.operators.observable.m1;
import io.reactivex.rxjava3.internal.operators.observable.s0;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.text.Regex;
import ru.ok.gleffects.impl.EffectNativeSink;
import xsna.a0a;
import xsna.afs;
import xsna.asu0;
import xsna.b8v;
import xsna.bh10;
import xsna.bi10;
import xsna.bl;
import xsna.cfz;
import xsna.cs2;
import xsna.dug0;
import xsna.e43;
import xsna.e8r;
import xsna.eq;
import xsna.f9t;
import xsna.fh10;
import xsna.fq;
import xsna.g620;
import xsna.gx8;
import xsna.hi10;
import xsna.i0q0;
import xsna.i5s;
import xsna.ih10;
import xsna.io9;
import xsna.j6i;
import xsna.j8w;
import xsna.kh10;
import xsna.kl6;
import xsna.lh10;
import xsna.lq;
import xsna.m7m;
import xsna.o25;
import xsna.peq0;
import xsna.pro0;
import xsna.qj4;
import xsna.rsg0;
import xsna.sh10;
import xsna.t5k0;
import xsna.th10;
import xsna.uh10;
import xsna.v71;
import xsna.w8i;
import xsna.wmi0;
import xsna.y8g0;
import xsna.yha;

/* loaded from: classes.dex */
public final class MasksController implements gx8.a {
    public static volatile MasksController q;
    public static final bh10 r = new bh10();
    public final hi10 c;
    public final HashSet<Mask> d;
    public final HashSet<Mask> e;
    public final PrivateFiles f;
    public m1 h;
    public c i;

    @Nullable
    public volatile qj4 j;
    public volatile boolean k;
    public final ArrayList<bi10> b = new ArrayList<>();
    public final int g = com.vk.media.ok.b.W0;
    public volatile boolean l = true;
    public volatile boolean m = false;
    public final b n = new b();
    public final fh10 o = new fh10(this, 0);
    public final kh10 p = new kh10();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes3.dex */
    public static final class MasksCatalogType {
        private static final /* synthetic */ MasksCatalogType[] $VALUES;
        public static final MasksCatalogType DEFAULT;
        public static final MasksCatalogType VOIP_MASKS;
        public static final MasksCatalogType VOIP_VIRTUAL_BACKGROUND;

        static {
            MasksCatalogType masksCatalogType = new MasksCatalogType("DEFAULT", 0);
            DEFAULT = masksCatalogType;
            MasksCatalogType masksCatalogType2 = new MasksCatalogType("VOIP_MASKS", 1);
            VOIP_MASKS = masksCatalogType2;
            MasksCatalogType masksCatalogType3 = new MasksCatalogType("VOIP_VIRTUAL_BACKGROUND", 2);
            VOIP_VIRTUAL_BACKGROUND = masksCatalogType3;
            $VALUES = new MasksCatalogType[]{masksCatalogType, masksCatalogType2, masksCatalogType3};
        }

        public MasksCatalogType() {
            throw null;
        }

        public static MasksCatalogType valueOf(String str) {
            return (MasksCatalogType) Enum.valueOf(MasksCatalogType.class, str);
        }

        public static MasksCatalogType[] values() {
            return (MasksCatalogType[]) $VALUES.clone();
        }
    }

    public class a implements w8i {
    }

    public class b implements l<SmartMasksGetModelResponse, t<dug0.c>> {
        public b() {
        }

        public final b0 a(final float f, final int i, @Nullable String str) {
            PrivateFiles privateFiles = MasksController.this.f;
            PrivateSubdir privateSubdir = PrivateSubdir.MASKS;
            privateFiles.getClass();
            File e = PrivateFiles.e(privateFiles, privateSubdir, "masks_assets.zip", null, 28);
            File i2 = f9t.i();
            com.vk.core.files.a.D(e);
            j1 U = dug0.a(e, str).U(new cfz(i2, 2)).U(new l() { // from class: xsna.oh10
                @Override // io.reactivex.rxjava3.functions.l
                public final Object apply(Object obj) {
                    dug0.c cVar = (dug0.c) obj;
                    cVar.b *= f;
                    return cVar;
                }
            });
            f fVar = new f() { // from class: xsna.ph10
                @Override // io.reactivex.rxjava3.functions.f
                public final void accept(Object obj) {
                    hi10 hi10Var = MasksController.this.c;
                    if (((dug0.c) obj).c()) {
                        hi10Var.getClass();
                        Preference.F(i, "masks", "asset_version");
                        int q = f9t.q();
                        hi10Var.getClass();
                        Preference.F(q, "masks", "engine_model_files_count");
                    }
                }
            };
            a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
            a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
            return U.E(fVar, lVar, kVar, kVar);
        }

        @Override // io.reactivex.rxjava3.functions.l
        public final t<dug0.c> apply(SmartMasksGetModelResponse smartMasksGetModelResponse) throws Throwable {
            final SmartMasksGetModelResponse smartMasksGetModelResponse2 = smartMasksGetModelResponse;
            return new io.reactivex.rxjava3.internal.operators.observable.t(new n() { // from class: xsna.mh10
                /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
                /* JADX WARN: Removed duplicated region for block: B:28:0x005b  */
                /* JADX WARN: Removed duplicated region for block: B:29:0x0056  */
                @Override // io.reactivex.rxjava3.functions.n
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object get() {
                    boolean z;
                    File p;
                    final MasksController.b bVar = MasksController.b.this;
                    MasksController masksController = MasksController.this;
                    hi10 hi10Var = masksController.c;
                    hi10Var.getClass();
                    int m = (int) Preference.m(0L, "masks", "engine_model_version");
                    hi10Var.getClass();
                    int m2 = (int) Preference.m(0L, "masks", "asset_version");
                    SmartMasksGetModelResponse smartMasksGetModelResponse3 = smartMasksGetModelResponse2;
                    final int i = smartMasksGetModelResponse3.b;
                    final int i2 = smartMasksGetModelResponse3.c;
                    String str = smartMasksGetModelResponse3.d;
                    final String str2 = smartMasksGetModelResponse3.e;
                    int q = f9t.q();
                    if (q > 0) {
                        bpn0 bpn0Var = i0q0.a;
                        File p2 = f9t.p();
                        File[] listFiles = p2.listFiles();
                        if (p2.exists() && listFiles != null && listFiles.length > 0 && q == ((int) Preference.m(0L, "masks", "engine_model_files_count"))) {
                            z = true;
                            boolean z2 = m != i;
                            boolean z3 = m2 != i2;
                            p = f9t.p();
                            if (!z && z2 && z3) {
                                return io.reactivex.rxjava3.core.q.T(dug0.c.a(p));
                            }
                            if (!z && z2) {
                                return bVar.a(1.0f, i2, str2);
                            }
                            com.vk.core.files.a.D(p);
                            PrivateFiles privateFiles = masksController.f;
                            PrivateSubdir privateSubdir = PrivateSubdir.MASKS;
                            privateFiles.getClass();
                            return dug0.a(PrivateFiles.e(privateFiles, privateSubdir, "masks_model.zip", null, 28), str).U(new cfz(p, 2)).L(new io.reactivex.rxjava3.functions.l() { // from class: xsna.nh10
                                @Override // io.reactivex.rxjava3.functions.l
                                public final Object apply(Object obj) {
                                    dug0.c cVar = (dug0.c) obj;
                                    MasksController.b bVar2 = MasksController.b.this;
                                    hi10 hi10Var2 = MasksController.this.c;
                                    String str3 = str2;
                                    if (TextUtils.isEmpty(str3)) {
                                        return io.reactivex.rxjava3.core.q.T(cVar);
                                    }
                                    if (!cVar.c()) {
                                        if (!cVar.d()) {
                                            return io.reactivex.rxjava3.core.q.T(cVar);
                                        }
                                        cVar.b *= 0.5f;
                                        return io.reactivex.rxjava3.core.q.T(cVar);
                                    }
                                    hi10Var2.getClass();
                                    Preference.F(i, "masks", "engine_model_version");
                                    int q2 = f9t.q();
                                    hi10Var2.getClass();
                                    Preference.F(q2, "masks", "engine_model_files_count");
                                    return bVar2.a(0.5f, i2, str3);
                                }
                            }, false);
                        }
                    }
                    z = false;
                    if (m != i) {
                    }
                    if (m2 != i2) {
                    }
                    p = f9t.p();
                    if (!z) {
                    }
                    if (!z) {
                    }
                    com.vk.core.files.a.D(p);
                    PrivateFiles privateFiles2 = masksController.f;
                    PrivateSubdir privateSubdir2 = PrivateSubdir.MASKS;
                    privateFiles2.getClass();
                    return dug0.a(PrivateFiles.e(privateFiles2, privateSubdir2, "masks_model.zip", null, 28), str).U(new cfz(p, 2)).L(new io.reactivex.rxjava3.functions.l() { // from class: xsna.nh10
                        @Override // io.reactivex.rxjava3.functions.l
                        public final Object apply(Object obj) {
                            dug0.c cVar = (dug0.c) obj;
                            MasksController.b bVar2 = MasksController.b.this;
                            hi10 hi10Var2 = MasksController.this.c;
                            String str3 = str2;
                            if (TextUtils.isEmpty(str3)) {
                                return io.reactivex.rxjava3.core.q.T(cVar);
                            }
                            if (!cVar.c()) {
                                if (!cVar.d()) {
                                    return io.reactivex.rxjava3.core.q.T(cVar);
                                }
                                cVar.b *= 0.5f;
                                return io.reactivex.rxjava3.core.q.T(cVar);
                            }
                            hi10Var2.getClass();
                            Preference.F(i, "masks", "engine_model_version");
                            int q2 = f9t.q();
                            hi10Var2.getClass();
                            Preference.F(q2, "masks", "engine_model_files_count");
                            return bVar2.a(0.5f, i2, str3);
                        }
                    }, false);
                }
            }).r0(asu0.a.c());
        }
    }

    public MasksController() {
        io9.f(e43.a);
        this.c = new hi10();
        this.d = new HashSet<>();
        this.e = new HashSet<>();
        this.f = e8r.a;
        ((CacheComponent) j6i.b(m7m.f(new a()), CacheComponent.class)).yc().c(this);
    }

    public static void d() {
        if (q == null || !q.m) {
            return;
        }
        if (!i0q0.b()) {
            q.j();
            return;
        }
        asu0.a.getClass();
        ExecutorService n = asu0.n();
        MasksController masksController = q;
        Objects.requireNonNull(masksController);
        n.execute(new cs2(masksController, 12));
    }

    public static MasksController f() {
        if (q == null) {
            synchronized (MasksController.class) {
                try {
                    if (q == null) {
                        q = new MasksController();
                    }
                } finally {
                }
            }
        }
        return q;
    }

    @Override // xsna.gx8.a
    @NonNull
    public final CacheTarget a() {
        return CacheTarget.OTHER;
    }

    public final m1 b(q qVar) {
        return new c0(qVar.d0(SmartMasksGetModelResponse.f).L(this.n, false).U(r).g0().M0(1, new afs(this, 5)).F(new kl6(this, 24)), io.reactivex.rxjava3.internal.functions.a.d, new v71(this, 4)).C(new j8w(this, 1)).r0(io.reactivex.rxjava3.schedulers.a.b()).a0(io.reactivex.rxjava3.android.schedulers.a.b());
    }

    public final synchronized void c() {
        wmi0 wmi0Var = wmi0.a;
        wmi0Var.c("masks_catalog");
        wmi0Var.c("ok_effects_catalog");
        this.c.a();
        synchronized (this) {
            c cVar = this.i;
            if (cVar != null) {
                cVar.dispose();
                this.h = null;
            }
        }
        this.h = null;
    }

    @Override // xsna.gx8.a
    public final void dispose() {
        c();
    }

    public final b0 e(boolean z) {
        q s0Var;
        m1 a0;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        if (this.l && o25.a().b()) {
            j1 U = wmi0.a.e("masks_catalog").U(new fq(20));
            fh10 fh10Var = this.o;
            q U2 = U.U(fh10Var);
            if (!z) {
                U2 = q.q(U2.c0(g0.b), rsg0.T(new sh10(this.g)).E(new ih10(), lVar, kVar, kVar).U(fh10Var));
            }
            s0Var = U2.a0(io.reactivex.rxjava3.android.schedulers.a.b());
        } else {
            s0Var = new s0(new Callable() { // from class: xsna.hh10
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new ArrayList();
                }
            });
        }
        if (g620.f().getExperiments().g()) {
            wmi0 wmi0Var = wmi0.a;
            j1 U3 = wmi0Var.e("ok_effects_catalog").U(new eq(21)).U(this.o);
            if (z) {
                wmi0Var.getClass();
                ConcurrentHashMap concurrentHashMap = wmi0.e;
                if (concurrentHashMap == null) {
                    concurrentHashMap = null;
                }
                if (concurrentHashMap.get(wmi0.p("ok_effects_catalog")) != null) {
                    a0 = U3.a0(io.reactivex.rxjava3.android.schedulers.a.b());
                    s0Var = q.I0(a0, s0Var, new bl(this, 28));
                }
            }
            a0 = q.q(U3.c0(g0.b), rsg0.T(o25.a().b() ? new th10(EffectNativeSink.getLibVersionCode(), y8g0.e(R.string.ok_effect_section_name), i5s.a(new StringBuilder("https://"), a0a.d, "/images/masks/sections/effects.png")) : new uh10(EffectNativeSink.getLibVersionCode(), y8g0.e(R.string.ok_effect_section_name), i5s.a(new StringBuilder("https://"), a0a.d, "/images/masks/sections/effects.png"))).E(new b8v(this, 5), lVar, kVar, kVar).U(this.o)).a0(io.reactivex.rxjava3.android.schedulers.a.b());
            s0Var = q.I0(a0, s0Var, new bl(this, 28));
        }
        return s0Var.E(new yha(), lVar, kVar, kVar);
    }

    public final m1 g(Mask mask) {
        q L;
        m1 m1Var;
        if (o25.a().b()) {
            t L2 = q.T(mask).r0(io.reactivex.rxjava3.schedulers.a.b()).L(new lh10(this, mask), false);
            synchronized (this) {
                try {
                    if (this.h == null) {
                        this.h = b(new t5k0(com.vk.media.ok.b.W0).a());
                    }
                    m1Var = this.h;
                } catch (Throwable th) {
                    throw th;
                }
            }
            L = q.m(L2, m1Var, new lq(22));
        } else {
            L = q.T(mask).r0(io.reactivex.rxjava3.schedulers.a.b()).L(new lh10(this, mask), false);
        }
        return L.r0(asu0.a.c()).a0(io.reactivex.rxjava3.android.schedulers.a.b());
    }

    @Override // xsna.gx8.a
    @Nullable
    public final String getDescription() {
        return "MasksController";
    }

    public final boolean h(Mask mask) {
        if (!mask.Fb()) {
            return true;
        }
        Iterator<Mask> it = this.e.iterator();
        while (it.hasNext()) {
            if (mask.getId() == it.next().getId()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c6, code lost:
    
        if (r0.b(2) == r11.b(2)) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00cb, code lost:
    
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c9, code lost:
    
        if (r0 == r11) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i(Mask mask) {
        boolean z;
        int d;
        hi10 hi10Var = this.c;
        boolean containsKey = hi10Var.c.containsKey(mask.Db());
        int o = f9t.o(mask.Db());
        if (o > 0) {
            Integer num = hi10Var.c.get(mask.Db());
            if (o == (num != null ? num.intValue() : -1) && (d = hi10Var.d(mask)) >= 0) {
                Mask mask2 = (Mask) hi10Var.a.get(d);
                Long l = hi10Var.b.get(mask2.Db());
                boolean z2 = l == null || TimeUnit.MILLISECONDS.toDays(System.currentTimeMillis() - l.longValue()) > 14;
                boolean z3 = mask2.Eb() < mask.Eb();
                if (!z2 && !z3) {
                    String url = mask2.getUrl();
                    String url2 = mask.getUrl();
                    if (url != null && url2 != null) {
                        peq0 e = new peq0(Uri.parse(url)).e();
                        peq0 e2 = new peq0(Uri.parse(url2)).e();
                        Regex regex = new Regex("/doc([-0-9]+)_([0-9]+)");
                        if (e.n(regex, regex, null, 0)) {
                            if (e2.n(regex, regex, null, 0)) {
                                if (e.b(1) == e2.b(1)) {
                                }
                            }
                        }
                    }
                    return !containsKey && z;
                }
            }
        }
        z = false;
        if (containsKey) {
        }
    }

    public final synchronized void j() {
        if (this.m) {
            this.m = false;
            c();
        }
    }

    @Override // xsna.gx8.a
    public final long u() {
        this.c.getClass();
        pro0.b();
        return com.vk.core.files.a.J(f9t.g()) + com.vk.core.files.a.J(f9t.p());
    }
}
