package l40;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import B90.H;
import Sc.k;
import Sc.n;
import Sc.s;
import android.app.Activity;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import g30.InterfaceC6618a;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ze.u;

/* loaded from: classes3.dex */
public final class d implements InterfaceC7871a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final S80.b f72767a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final J7.c f72768b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Q90.c f72769c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC6618a f72770d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final l40.b f72771e;

    /* renamed from: f, reason: collision with root package name */
    private J7.b f72772f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final Object f72773g;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.appreview.service.GmsReviewService$needAppReview$1", f = "GmsReviewService.kt", l = {61}, m = "invokeSuspend")
    static final class a extends j implements Function2<u<? super Boolean>, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f72774d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f72775e;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = d.this.new a(dVar);
            aVar.f72775e = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(u<? super Boolean> uVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(uVar, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object a11;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f72774d;
            if (i11 == 0) {
                s.b(obj);
                u uVar = (u) this.f72775e;
                d dVar = d.this;
                dVar.f72768b.b().addOnSuccessListener(new H(new k60.b(1, dVar, uVar))).addOnFailureListener(new c(dVar, uVar));
                this.f72774d = 1;
                a11 = ze.s.a(uVar, new Q90.b(2), this);
                if (a11 == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.appreview.service.GmsReviewService$startReview$1", f = "GmsReviewService.kt", l = {95}, m = "invokeSuspend")
    static final class b extends j implements Function2<u<? super Boolean>, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f72777d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f72778e;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = d.this.new b(dVar);
            bVar.f72778e = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(u<? super Boolean> uVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(uVar, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object a11;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f72777d;
            if (i11 == 0) {
                s.b(obj);
                final u uVar = (u) this.f72778e;
                final d dVar = d.this;
                if (((Task) E30.g.a(new Function2() { // from class: l40.f
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        final d dVar2 = d.this;
                        Task<Void> a12 = dVar2.f72768b.a((Activity) obj2, (J7.b) obj3);
                        final u uVar2 = uVar;
                        return a12.addOnSuccessListener(new AW.d(new J90.b(uVar2, 1))).addOnFailureListener(new OnFailureListener() { // from class: l40.e
                            @Override // com.google.android.gms.tasks.OnFailureListener
                            public final void onFailure(Exception exc) {
                                d dVar3 = d.this;
                                dVar3.f72770d.n(dVar3.j().name(), exc.getMessage());
                                u uVar3 = uVar2;
                                if (uVar3.g()) {
                                    return;
                                }
                                uVar3.b(Boolean.FALSE);
                                uVar3.l(null);
                            }
                        });
                    }
                }, dVar.f72767a.c(), dVar.f72772f)) == null) {
                    dVar.f72770d.n(dVar.j().name(), "ReviewInfo it's null");
                    if (!uVar.g()) {
                        uVar.b(Boolean.FALSE);
                        uVar.l(null);
                    }
                    Unit unit = Unit.f71690a;
                }
                this.f72777d = 1;
                a11 = ze.s.a(uVar, new Q90.b(2), this);
                if (a11 == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    public d(@NotNull S80.b navigation, @NotNull J7.c manager, @NotNull Q90.c featureToggles, @NotNull InterfaceC6618a analyticInteractor) {
        Intrinsics.checkNotNullParameter(navigation, "navigation");
        Intrinsics.checkNotNullParameter(manager, "manager");
        Intrinsics.checkNotNullParameter(featureToggles, "featureToggles");
        Intrinsics.checkNotNullParameter(analyticInteractor, "analyticInteractor");
        this.f72767a = navigation;
        this.f72768b = manager;
        this.f72769c = featureToggles;
        this.f72770d = analyticInteractor;
        this.f72771e = l40.b.GOOGLE_PLAY;
        this.f72773g = k.a(n.PUBLICATION, new d70.f(this, 2));
    }

    public static boolean c(d dVar) {
        List<String> stringArrayData = dVar.f72769c.q(S90.c.MOB_SHOW_REVIEW_APP).b().getStringArrayData();
        if (stringArrayData != null) {
            return stringArrayData.contains(dVar.f72771e.name());
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Sc.j, java.lang.Object] */
    public static final boolean h(d dVar) {
        return ((Boolean) dVar.f72773g.getValue()).booleanValue();
    }

    @Override // l40.InterfaceC7871a
    @NotNull
    public final InterfaceC2395h<Boolean> a() {
        return C2399j.e(new b(null));
    }

    @Override // l40.InterfaceC7871a
    @NotNull
    public final InterfaceC2395h<Boolean> b() {
        return C2399j.e(new a(null));
    }

    @NotNull
    public final l40.b j() {
        return this.f72771e;
    }
}
