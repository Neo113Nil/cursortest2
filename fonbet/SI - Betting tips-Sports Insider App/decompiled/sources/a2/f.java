package a2;

import android.app.Application;
import android.content.Context;
import android.view.View;
import androidx.appcompat.app.v0;
import androidx.appcompat.widget.a0;
import androidx.appcompat.widget.c1;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k1;
import c1.i0;
import c1.p0;
import c1.s0;
import com.google.firebase.messaging.x;
import com.sports.insider.MyApp;
import com.sports.insider.R;
import com.sports.insider.ui.activities.BonusesInfo;
import com.sports.insider.ui.live.LiveFragment;
import com.sports.insider.ui.onboarding.BoardSiAcademyFragment;
import com.sports.insider.ui.viewpage.ViewPageEventFragment;
import gf.f0;
import io.appmetrica.analytics.impl.C0122e9;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k2.w;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.t;
import kotlin.collections.u;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.jvm.internal.TypeReference;
import kotlin.reflect.KTypeProjection;
import okio.ForwardingFileSystem;
import okio.Path;
import sg.e1;
import sg.r0;
import y1.b0;
import y1.d0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f31b;

    public /* synthetic */ f(int i5, Object obj) {
        this.f30a = i5;
        this.f31b = obj;
    }

    /* JADX WARN: Type inference failed for: r2v65, types: [java.lang.Object, qg.g] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object it) {
        RecyclerView recyclerView;
        int i5;
        CharSequence asString$lambda$0;
        qg.h d10;
        Path listRecursively$lambda$0;
        int i10 = 4;
        int i11 = 1;
        switch (this.f30a) {
            case 0:
                m mVar = (m) this.f31b;
                y1.l entry = (y1.l) it;
                Intrinsics.checkNotNullParameter(entry, "entry");
                return new g(r11, mVar, entry);
            case 1:
                b2.b bVar = (b2.b) this.f31b;
                Intrinsics.checkNotNullParameter(it, "it");
                return bVar.invoke();
            case 2:
                i0 i0Var = (i0) this.f31b;
                Throwable th2 = (Throwable) it;
                if (th2 != null) {
                    i0Var.f3408h.d(new s0(th2));
                }
                if (i0Var.j.f10037b != f0.f10021a) {
                    ((p0) i0Var.j.getValue()).close();
                }
                return Unit.f19194a;
            case 3:
                MyApp androidContext = (MyApp) this.f31b;
                yh.a startKoin = (yh.a) it;
                jg.d dVar = MyApp.f6830c;
                Intrinsics.checkNotNullParameter(startKoin, "$this$startKoin");
                Intrinsics.checkNotNullParameter(startKoin, "<this>");
                Intrinsics.checkNotNullParameter(androidContext, "androidContext");
                x xVar = startKoin.f25875a;
                boolean z5 = startKoin.f25876b;
                x xVar2 = startKoin.f25875a;
                io.sentry.config.a aVar = (io.sentry.config.a) xVar.f6182a;
                di.b bVar2 = di.b.f8382b;
                aVar.getClass();
                di.b level = di.b.f8385e;
                if (level.compareTo(bVar2) <= 0) {
                    io.sentry.config.a aVar2 = (io.sentry.config.a) xVar.f6182a;
                    aVar2.getClass();
                    Intrinsics.checkNotNullParameter("[init] declare Android Context", "msg");
                    aVar2.s(bVar2, "[init] declare Android Context");
                }
                xVar.C(t.c(u6.h.s(new f(25, androidContext))), true);
                Intrinsics.checkNotNullParameter(level, "level");
                di.c logger = new di.c();
                Intrinsics.checkNotNullParameter(logger, "logger");
                Intrinsics.checkNotNullParameter(logger, "logger");
                xVar.f6182a = logger;
                ei.a aVar3 = fc.c.f9562a;
                ei.a aVar4 = fc.b.f9551a;
                ArrayList arrayList = new ArrayList();
                arrayList.add(u6.h.s(new f1.a(i10)));
                ei.a aVar5 = fc.b.f9554d;
                ei.a module = fc.b.f9559i;
                aVar5.getClass();
                Intrinsics.checkNotNullParameter(module, "module");
                arrayList.addAll(CollectionsKt.O(CollectionsKt.O(u.f(aVar5, module), fc.b.f9556f), fc.b.f9557g));
                ei.a aVar6 = fc.b.f9558h;
                ei.a module2 = fc.b.j;
                aVar6.getClass();
                Intrinsics.checkNotNullParameter(module2, "module");
                arrayList.addAll(CollectionsKt.O(CollectionsKt.O(u.f(aVar6, module2), fc.b.f9553c), fc.b.f9561l));
                ei.a aVar7 = fc.b.f9560k;
                ei.a module3 = fc.b.f9555e;
                aVar7.getClass();
                Intrinsics.checkNotNullParameter(module3, "module");
                arrayList.addAll(CollectionsKt.O(CollectionsKt.O(u.f(aVar7, module3), fc.b.f9552b), fc.b.f9551a));
                arrayList.add(u6.h.s(new f1.a(5)));
                List modules = CollectionsKt.W(arrayList);
                aVar3.getClass();
                Intrinsics.checkNotNullParameter(modules, "modules");
                ArrayList modules2 = CollectionsKt.N(t.c(aVar3), modules);
                Intrinsics.checkNotNullParameter(modules2, "modules");
                ((io.sentry.config.a) xVar.f6182a).getClass();
                if (level.compareTo(bVar2) <= 0) {
                    cg.p.f3941a.getClass();
                    cg.n.f3939a.getClass();
                    long nanoTime = System.nanoTime() - cg.n.f3940b;
                    xVar2.C(modules2, z5);
                    long a7 = cg.o.a(nanoTime);
                    int size = ((ConcurrentHashMap) ((v0) xVar.f6185d).f365c).size();
                    io.sentry.config.a aVar8 = (io.sentry.config.a) xVar.f6182a;
                    StringBuilder r5 = c1.r(size, "Started ", " definitions in ");
                    cg.a aVar9 = cg.b.f3911b;
                    r5.append(cg.b.f(a7, cg.e.f3917c) / 1000.0d);
                    r5.append(" ms");
                    aVar8.i(bVar2, r5.toString());
                } else {
                    xVar2.C(modules2, z5);
                }
                return Unit.f19194a;
            case 4:
                ((e4.e) this.f31b).f8602l = true;
                return Unit.f19194a;
            case 5:
                a0 a0Var = ((LiveFragment) this.f31b).f6918i;
                if (a0Var != null && (recyclerView = (RecyclerView) a0Var.f684f) != null) {
                    k1 layoutManager = recyclerView.getLayoutManager();
                    LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                    if (linearLayoutManager != null) {
                        linearLayoutManager.smoothScrollToPosition(recyclerView, null, 0);
                    }
                }
                return Unit.f19194a;
            case 6:
                RecyclerView recyclerView2 = (RecyclerView) this.f31b;
                View it2 = (View) it;
                Intrinsics.checkNotNullParameter(it2, "it");
                return recyclerView2.findContainingViewHolder(it2);
            case 7:
                k2.r rVar = (k2.r) this.f31b;
                t2.a db2 = (t2.a) it;
                Intrinsics.checkNotNullParameter(db2, "db");
                rVar.f18754h = db2;
                return Unit.f19194a;
            case 8:
                w wVar = (w) this.f31b;
                k2.b config = (k2.b) it;
                Intrinsics.checkNotNullParameter(config, "config");
                wVar.getClass();
                Intrinsics.checkNotNullParameter(config, "config");
                throw new gf.n(null, 1, null);
            case 9:
                Function0 function0 = (Function0) this.f31b;
                Intrinsics.checkNotNullParameter((s2.a) it, "it");
                return function0.invoke();
            case 10:
                BoardSiAcademyFragment boardSiAcademyFragment = (BoardSiAcademyFragment) this.f31b;
                int i12 = boardSiAcademyFragment.f6930e;
                if (i12 >= 2) {
                    boardSiAcademyFragment.K(true);
                    ke.d dVar2 = boardSiAcademyFragment.f6929d;
                    if ((dVar2 != null ? dVar2.a() : 0) > 0) {
                        try {
                            if (boardSiAcademyFragment.J()) {
                                y1.r r6 = a.a.r(boardSiAcademyFragment);
                                d0 g10 = r6.f25625b.g();
                                if (g10 != null && (i5 = g10.f25543g.f3078a) == R.id.boardSiAcademyFragment && i5 != R.id.authScreenFragment) {
                                    g10.l(R.id.authScreenFragment);
                                }
                                b0 f6 = r6.f25625b.f();
                                if (f6 != null && f6.f25534b.f3017e == R.id.boardSiAcademyFragment) {
                                    y1.a aVar10 = new y1.a(R.id.action_boardSiAcademyFragment_to_authScreenFragment);
                                    Intrinsics.checkNotNullExpressionValue(aVar10, "actionBoardSiAcademyFrag…ToAuthScreenFragment(...)");
                                    r6.d(aVar10);
                                }
                            } else {
                                boardSiAcademyFragment.L("BoardSiAcademyFragmentToAuth");
                            }
                        } catch (Exception e7) {
                            zc.d.b(4, "BoardSiAcademyFragmentToAuth", e7);
                            boardSiAcademyFragment.I();
                        }
                    } else {
                        try {
                            if (boardSiAcademyFragment.J()) {
                                y1.r r10 = a.a.r(boardSiAcademyFragment);
                                d0 g11 = r10.f25625b.g();
                                if (g11 != null && g11.f25543g.f3078a != R.id.allPredictionsFragment) {
                                    g11.l(R.id.allPredictionsFragment);
                                }
                                b0 f10 = r10.f25625b.f();
                                Integer valueOf = f10 != null ? Integer.valueOf(f10.f25534b.f3017e) : null;
                                if (valueOf != null && valueOf.intValue() == R.id.boardSiAcademyFragment) {
                                    y1.a aVar11 = new y1.a(R.id.action_boardSiAcademyFragment_to_allPredictionsFragment);
                                    Intrinsics.checkNotNullExpressionValue(aVar11, "actionBoardSiAcademyFrag…lPredictionsFragment(...)");
                                    r10.d(aVar11);
                                }
                                y1.a b10 = com.google.android.play.core.appupdate.b.b();
                                Intrinsics.checkNotNullExpressionValue(b10, "actionGlobalAllPredictionsFragment(...)");
                                r10.d(b10);
                            } else {
                                boardSiAcademyFragment.L("BoardSiAcademyFragmentToStrip");
                            }
                        } catch (Exception e9) {
                            zc.d.b(4, "BoardSiAcademyFragmentToStrip", e9);
                            if (boardSiAcademyFragment.J()) {
                                boardSiAcademyFragment.I();
                            } else {
                                boardSiAcademyFragment.L("BoardSiAcademyFragmentToStrip");
                            }
                        }
                    }
                } else {
                    int i13 = i12 + 1;
                    boardSiAcademyFragment.f6930e = i13;
                    boardSiAcademyFragment.G(i13);
                }
                return Unit.f19194a;
            case 11:
                return it == ((kotlin.collections.a) this.f31b) ? "(this Collection)" : String.valueOf(it);
            case 12:
                asString$lambda$0 = TypeReference.asString$lambda$0((TypeReference) this.f31b, (KTypeProjection) it);
                return asString$lambda$0;
            case 13:
                ((ng.c) this.f31b).k(null);
                return Unit.f19194a;
            case 14:
                og.d dVar3 = (og.d) this.f31b;
                qg.a buildSerialDescriptor = (qg.a) it;
                Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
                ci.c.X(StringCompanionObject.INSTANCE);
                qg.a.a(buildSerialDescriptor, "type", e1.f23624b);
                d10 = y4.a.d("kotlinx.serialization.Polymorphic<" + dVar3.f21222a.getSimpleName() + '>', qg.i.f22176e, new qg.g[0], new k2.d0(16));
                qg.a.a(buildSerialDescriptor, "value", d10);
                e0 e0Var = dVar3.f21223b;
                Intrinsics.checkNotNullParameter(e0Var, "<set-?>");
                buildSerialDescriptor.f22146b = e0Var;
                return Unit.f19194a;
            case 15:
                listRecursively$lambda$0 = ForwardingFileSystem.listRecursively$lambda$0((ForwardingFileSystem) this.f31b, (Path) it);
                return listRecursively$lambda$0;
            case 16:
                BonusesInfo bonusesInfo = (BonusesInfo) this.f31b;
                da.d dVar4 = new da.d();
                dVar4.c("how_to_get_a_bonus");
                Intrinsics.checkNotNullExpressionValue(dVar4, "setDestination(...)");
                a.a.r(bonusesInfo).d(dVar4);
                return Unit.f19194a;
            case 17:
                Ref.IntRef intRef = (Ref.IntRef) this.f31b;
                StringBuilder sb2 = new StringBuilder();
                int i14 = intRef.element;
                intRef.element = i14 + 1;
                sb2.append(i14);
                sb2.append(':');
                sb2.append(((t4.b) it).a());
                return sb2.toString();
            case 18:
                ArrayList arrayList2 = (ArrayList) this.f31b;
                String it3 = (String) it;
                Intrinsics.checkNotNullParameter(it3, "it");
                arrayList2.add(it3);
                return Unit.f19194a;
            case 19:
                sd.b bVar3 = (sd.b) this.f31b;
                kf.f fVar = bVar3.f23473b;
                if (fVar != null) {
                    gf.o oVar = gf.q.f10031a;
                    fVar.resumeWith(new Pair(Boolean.FALSE, bVar3.f23474c));
                }
                bVar3.f23473b = null;
                bVar3.dismiss();
                return Unit.f19194a;
            case 20:
                sd.b bVar4 = (sd.b) this.f31b;
                kf.f fVar2 = bVar4.f23473b;
                if (fVar2 != null) {
                    gf.o oVar2 = gf.q.f10031a;
                    fVar2.resumeWith(new Pair(Boolean.FALSE, bVar4.f23474c));
                }
                bVar4.f23473b = null;
                bVar4.dismiss();
                return Unit.f19194a;
            case 21:
                r0 r0Var = (r0) this.f31b;
                qg.a buildSerialDescriptor2 = (qg.a) it;
                Intrinsics.checkNotNullParameter(buildSerialDescriptor2, "$this$buildSerialDescriptor");
                e0 e0Var2 = r0Var.f23681b;
                buildSerialDescriptor2.getClass();
                Intrinsics.checkNotNullParameter(e0Var2, "<set-?>");
                buildSerialDescriptor2.f22146b = e0Var2;
                return Unit.f19194a;
            case zg.g.DEBUGMODULES_FIELD_NUMBER /* 22 */:
                ?? r22 = this.f31b;
                int intValue = ((Integer) it).intValue();
                return r22.g(intValue) + ": " + r22.i(intValue).a();
            case zg.g.ISCRASH_FIELD_NUMBER /* 23 */:
                ((ViewPageEventFragment) this.f31b).f7080e.b();
                return Unit.f19194a;
            case zg.g.FORCEINGEST_FIELD_NUMBER /* 24 */:
                ((Function1) this.f31b).invoke((View) it);
                return Unit.f19194a;
            case C0122e9.F /* 25 */:
                Context context = (Context) this.f31b;
                ei.a module4 = (ei.a) it;
                Intrinsics.checkNotNullParameter(module4, "$this$module");
                if (context instanceof Application) {
                    xh.a aVar12 = new xh.a(r11, context);
                    gi.a aVar13 = hi.a.f10827c;
                    ai.a beanDefinition = new ai.a(aVar13, Reflection.getOrCreateKotlinClass(Application.class), null, aVar12, ai.b.f188a, e0.f19204a);
                    Intrinsics.checkNotNullParameter(beanDefinition, "beanDefinition");
                    ci.d factory = new ci.d(beanDefinition);
                    module4.a(factory);
                    ai.c cVar = new ai.c(module4, factory);
                    ag.c clazz = Reflection.getOrCreateKotlinClass(Context.class);
                    Intrinsics.checkNotNullParameter(cVar, "<this>");
                    Intrinsics.checkNotNullParameter(clazz, "clazz");
                    ArrayList O = CollectionsKt.O(beanDefinition.f187f, clazz);
                    Intrinsics.checkNotNullParameter(O, "<set-?>");
                    beanDefinition.f187f = O;
                    String mapping = li.a.a(clazz) + "::" + aVar13;
                    Intrinsics.checkNotNullParameter(mapping, "mapping");
                    Intrinsics.checkNotNullParameter(factory, "factory");
                    module4.f9260c.put(mapping, factory);
                } else {
                    ai.a beanDefinition2 = new ai.a(hi.a.f10827c, Reflection.getOrCreateKotlinClass(Context.class), null, new xh.a(i11, context), ai.b.f188a, e0.f19204a);
                    Intrinsics.checkNotNullParameter(beanDefinition2, "beanDefinition");
                    ci.d factory2 = new ci.d(beanDefinition2);
                    module4.a(factory2);
                    Intrinsics.checkNotNullParameter(module4, "module");
                    Intrinsics.checkNotNullParameter(factory2, "factory");
                }
                return Unit.f19194a;
            default:
                y8.g gVar = (y8.g) this.f31b;
                g1.a aVar14 = (g1.a) it;
                g1.c cVar2 = y8.g.f25732c;
                long j = 0;
                for (Map.Entry entry2 : aVar14.a().entrySet()) {
                    if (entry2.getValue() instanceof Set) {
                        g1.c cVar3 = (g1.c) entry2.getKey();
                        Set set = (Set) entry2.getValue();
                        String d11 = gVar.d(System.currentTimeMillis());
                        if (set.contains(d11)) {
                            Object[] objArr = {d11};
                            HashSet hashSet = new HashSet(1);
                            Object obj = objArr[0];
                            Objects.requireNonNull(obj);
                            if (!hashSet.add(obj)) {
                                throw new IllegalArgumentException("duplicate element: " + obj);
                            }
                            aVar14.e(cVar3, DesugarCollections.unmodifiableSet(hashSet));
                            j++;
                        } else {
                            aVar14.d(cVar3);
                        }
                    }
                }
                if (j == 0) {
                    aVar14.d(cVar2);
                } else {
                    aVar14.e(cVar2, Long.valueOf(j));
                }
                return null;
        }
    }

    public /* synthetic */ f(ng.c cVar, ng.b bVar) {
        this.f30a = 13;
        this.f31b = cVar;
    }
}
