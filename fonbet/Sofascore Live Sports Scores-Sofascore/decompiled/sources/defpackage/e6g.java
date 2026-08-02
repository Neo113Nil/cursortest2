package defpackage;

import android.content.Context;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import com.equativ.displaysdk.adadapter.SASMediationBannerAdapterWrapper;
import com.equativ.displaysdk.adadapter.SASParallaxBannerAdapter;
import com.sofascore.common.widget.ScrollInterceptorHorizontalScrollView;
import com.sofascore.localPersistence.database.AppDatabase;
import com.sofascore.network.api.NetworkCoroutineAPI;
import com.sofascore.results.R;
import com.sofascore.results.ads.UpgradeSofascoreActivity;
import com.sofascore.results.event.aiInsights.SofascoreAnalystWorldCupOfferBottomSheet;
import com.sofascore.results.helper.SofaBackupAgent;
import com.sofascore.results.service.RegistrationWorker;
import com.sofascore.results.settings.SettingsActivity;
import com.sofascore.results.settings.SettingsFragment;
import com.sofascore.results.sofaSeason.SofaSeasonActivity;
import com.unity3d.services.UnityAdsConstants;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class e6g implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e6g(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean z;
        boolean z2;
        Object[] objArr;
        char c = 7;
        boolean z3 = true;
        boolean z4 = false;
        int i = 0;
        switch (this.a) {
            case 0:
                return ((Callable) this.b).call();
            case 1:
                xag xagVar = ((SASMediationBannerAdapterWrapper) this.b).e;
                if (xagVar != null) {
                    ((zag) xagVar).h();
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 2:
                xag xagVar2 = ((dfg) this.b).h;
                if (xagVar2 != null) {
                    ((zag) xagVar2).h();
                    z2 = true;
                } else {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            case 3:
                return new xfg((SASParallaxBannerAdapter) this.b, 0);
            case 4:
                ClassLoader classLoader = (ClassLoader) ((cqa) this.b).a;
                Class<?> loadClass = classLoader.loadClass("androidx.window.extensions.WindowExtensionsProvider");
                loadClass.getClass();
                Method declaredMethod = loadClass.getDeclaredMethod("getWindowExtensions", null);
                Class<?> loadClass2 = classLoader.loadClass("androidx.window.extensions.WindowExtensions");
                loadClass2.getClass();
                declaredMethod.getClass();
                return Boolean.valueOf(declaredMethod.getReturnType().equals(loadClass2) && Modifier.isPublic(declaredMethod.getModifiers()));
            case 5:
                lpg lpgVar = (lpg) this.b;
                uqg uqgVar = lpgVar.a;
                Object obj = lpgVar.d;
                if (obj != null) {
                    return uqgVar.g(lpgVar, obj);
                }
                a70.p("Value should be initialized");
                return null;
            case 6:
                oqg oqgVar = ((vpg) this.b).c;
                if (oqgVar == null) {
                    return null;
                }
                lm5.a.getClass();
                Bundle E = hz8.E((Pair[]) Arrays.copyOf(new Pair[0], 0));
                oqgVar.b(E);
                if (E.isEmpty()) {
                    return null;
                }
                return E;
            case 7:
                return yso.E((ttk) this.b);
            case 8:
                qqg qqgVar = (qqg) this.b;
                qqgVar.getLifecycle().a(new nqf(qqgVar, 0));
                return Unit.a;
            case 9:
                jtg jtgVar = (jtg) this.b;
                Path path = new Path();
                p7g p7gVar = new p7g();
                p7g p7gVar2 = new p7g();
                p7g p7gVar3 = new p7g();
                p7g p7gVar4 = new p7g();
                ug5 ug5Var = new ug5();
                ug5 ug5Var2 = new ug5();
                ug5 ug5Var3 = new ug5();
                ug5 ug5Var4 = new ug5();
                float f = jtgVar.c;
                q0 q0Var = new q0(f);
                q0 q0Var2 = new q0(f);
                q0 q0Var3 = new q0(f);
                q0 q0Var4 = new q0(f);
                xah xahVar = new xah();
                xahVar.a = p7gVar;
                xahVar.b = p7gVar2;
                xahVar.c = p7gVar3;
                xahVar.d = p7gVar4;
                xahVar.e = q0Var;
                xahVar.f = q0Var2;
                xahVar.g = q0Var3;
                xahVar.h = q0Var4;
                xahVar.i = ug5Var;
                xahVar.j = ug5Var2;
                xahVar.k = ug5Var3;
                xahVar.l = ug5Var4;
                float f2 = jtgVar.b;
                new qn2(3).c(xahVar, null, 1.0f, new RectF(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, jtgVar.getBounds().right - f2, jtgVar.getBounds().bottom), null, path);
                return path;
            case 10:
                vug vugVar = (vug) this.b;
                o00 o00Var = (o00) tgj.x(vugVar, nyd.a);
                vugVar.A = o00Var;
                vugVar.B = o00Var != null ? new n00(o00Var.a, o00Var.b, o00Var.c, o00Var.d) : null;
                return Unit.a;
            case 11:
                View view = (View) this.b;
                int i2 = R.id.horizontal_scroll;
                if (((ScrollInterceptorHorizontalScrollView) nq8.B(R.id.horizontal_scroll, view)) != null) {
                    i2 = R.id.type_header_divider;
                    View B = nq8.B(R.id.type_header_divider, view);
                    if (B != null) {
                        i2 = R.id.types_holder;
                        LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.types_holder, view);
                        if (linearLayout != null) {
                            return new mvg((LinearLayout) view, B, linearLayout);
                        }
                    }
                }
                yhk.s("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
                return null;
            case 12:
                return Float.valueOf(((xnh) this.b).h());
            case 13:
                o0h o0hVar = (o0h) this.b;
                axj axjVar = o0hVar.f;
                o0hVar.g = axjVar != null ? axjVar.h() : 0L;
                return Unit.a;
            case 14:
                return this.b;
            case 15:
                m5h m5hVar = (m5h) this.b;
                return Integer.valueOf(pea.w(m5hVar, m5hVar.k));
            case 16:
                SettingsActivity settingsActivity = (SettingsActivity) this.b;
                int i3 = SettingsActivity.L;
                return ue.a(settingsActivity.getLayoutInflater());
            case 17:
                SettingsFragment settingsFragment = (SettingsFragment) this.b;
                qfg qfgVar = new qfg(settingsFragment, 15);
                e6b e6bVar = e6b.a;
                ad2 ad2Var = qv5.a;
                u6b viewLifecycleOwner = settingsFragment.getViewLifecycleOwner();
                viewLifecycleOwner.getClass();
                LinkedHashMap linkedHashMap = qv5.b;
                fuf fufVar = duf.a;
                KClass orCreateKotlinClass = fufVar.getOrCreateKotlinClass(o42.class);
                Object obj2 = linkedHashMap.get(orCreateKotlinClass);
                Object obj3 = obj2;
                if (obj2 == null) {
                    aeh b = beh.b(0, 0, null, 7);
                    linkedHashMap.put(orCreateKotlinClass, b);
                    obj3 = b;
                }
                xw3.L(wca.x(viewLifecycleOwner.getLifecycle()), null, null, new jah(viewLifecycleOwner, (b1d) obj3, settingsFragment, null, qfgVar, 0), 3);
                u6b viewLifecycleOwner2 = settingsFragment.getViewLifecycleOwner();
                viewLifecycleOwner2.getClass();
                KClass orCreateKotlinClass2 = fufVar.getOrCreateKotlinClass(n42.class);
                Object obj4 = linkedHashMap.get(orCreateKotlinClass2);
                Object obj5 = obj4;
                if (obj4 == null) {
                    aeh b2 = beh.b(0, 0, null, 7);
                    linkedHashMap.put(orCreateKotlinClass2, b2);
                    obj5 = b2;
                }
                xw3.L(wca.x(viewLifecycleOwner2.getLifecycle()), null, null, new jah(viewLifecycleOwner2, (b1d) obj5, settingsFragment, null, qfgVar, 1), 3);
                Context requireContext = settingsFragment.requireContext();
                Pair[] pairArr = {wv8.t(requireContext, "ACTION", "LOGOUT")};
                hpo hpoVar = new hpo(18);
                Pair pair = pairArr[0];
                hpoVar.B(pair.b, (String) pair.a);
                md4 l = hpoVar.l();
                vxd.h(requireContext).b("RegistrationWorker-".concat(mha.o(l)), nf6.a, (ltd) vxd.g(RegistrationWorker.class, l).a());
                xw3.L(wca.x(settingsFragment.getLifecycle()), null, null, new w9g(settingsFragment, z4 ? 1 : 0, 10), 3);
                return Unit.a;
            case 18:
                pah pahVar = (pah) this.b;
                e1d e1dVar = pahVar.c;
                if (((njh) ((eoh) e1dVar).getValue()).a == 9205357640488583168L || njh.g(((njh) ((eoh) e1dVar).getValue()).a)) {
                    return null;
                }
                return pahVar.a.b(((njh) ((eoh) e1dVar).getValue()).a);
            case 19:
                y0 y0Var = (y0) this.b;
                return ((k6g) y0Var.a).compileStatement(y0Var.c());
            case 20:
                return ((dfh) this.b).c;
            case 21:
                ((gmh) this.b).a();
                return Boolean.TRUE;
            case 22:
                a5f a5fVar = (a5f) this.b;
                while (true) {
                    synchronized (a5fVar.h) {
                        try {
                            if (!a5fVar.a) {
                                a5fVar.a = z3;
                                try {
                                    i1d i1dVar = (i1d) a5fVar.g;
                                    Object[] objArr2 = i1dVar.a;
                                    int i4 = i1dVar.c;
                                    int i5 = i;
                                    while (i5 < i4) {
                                        loh lohVar = (loh) objArr2[i5];
                                        y0d y0dVar = lohVar.g;
                                        Function1 function1 = lohVar.a;
                                        Object[] objArr3 = y0dVar.b;
                                        long[] jArr = y0dVar.a;
                                        int length = jArr.length - 2;
                                        if (length >= 0) {
                                            int i6 = i;
                                            while (true) {
                                                long j = jArr[i6];
                                                objArr = objArr2;
                                                if ((((~j) << c) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i7 = 8 - ((~(i6 - length)) >>> 31);
                                                    for (int i8 = i; i8 < i7; i8++) {
                                                        if ((j & 255) < 128) {
                                                            function1.invoke(objArr3[(i6 << 3) + i8]);
                                                        }
                                                        j >>= 8;
                                                    }
                                                    if (i7 != 8) {
                                                    }
                                                }
                                                if (i6 != length) {
                                                    i6++;
                                                    objArr2 = objArr;
                                                    c = 7;
                                                    i = 0;
                                                }
                                            }
                                        } else {
                                            objArr = objArr2;
                                        }
                                        y0dVar.b();
                                        i5++;
                                        objArr2 = objArr;
                                        c = 7;
                                        i = 0;
                                    }
                                    a5fVar.a = i;
                                } catch (Throwable th) {
                                    a5fVar.a = false;
                                    throw th;
                                }
                            }
                            Unit unit = Unit.a;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    if (!a5fVar.c()) {
                        return Unit.a;
                    }
                    c = 7;
                    z3 = true;
                    i = 0;
                }
            case 23:
                SofaBackupAgent sofaBackupAgent = (SofaBackupAgent) this.b;
                Map map = SofaBackupAgent.b;
                lzf lzfVar = (lzf) fz8.Q(lzf.class, sofaBackupAgent.getApplicationContext());
                lzfVar.getClass();
                mc4 mc4Var = (mc4) lzfVar;
                return new gzh(((AppDatabase) mc4Var.z.get()).q(), (NetworkCoroutineAPI) mc4Var.G.get());
            case 24:
                Object obj6 = ((y65) this.b).get();
                obj6.getClass();
                return (yg2) obj6;
            case 25:
                SofaSeasonActivity sofaSeasonActivity = (SofaSeasonActivity) this.b;
                int i9 = SofaSeasonActivity.L;
                sofaSeasonActivity.finish();
                return Unit.a;
            case 26:
                return iuh.l((iuh) this.b);
            case 27:
                SofascoreAnalystWorldCupOfferBottomSheet sofascoreAnalystWorldCupOfferBottomSheet = (SofascoreAnalystWorldCupOfferBottomSheet) this.b;
                Context requireContext2 = sofascoreAnalystWorldCupOfferBottomSheet.requireContext();
                requireContext2.getClass();
                nv.z0(requireContext2, kv.CLICK, "check_offer_world_cup2026", "event_details");
                int i10 = UpgradeSofascoreActivity.M;
                Context requireContext3 = sofascoreAnalystWorldCupOfferBottomSheet.requireContext();
                requireContext3.getClass();
                e2f.k(requireContext3, false);
                sofascoreAnalystWorldCupOfferBottomSheet.j();
                return Unit.a;
            case 28:
                return new uhd(((vuh) this.b).b, 1, "Notifications");
            default:
                r1i r1iVar = (r1i) this.b;
                Calendar calendar = ke0.a;
                return ke0.b(r1iVar.i());
        }
    }
}
