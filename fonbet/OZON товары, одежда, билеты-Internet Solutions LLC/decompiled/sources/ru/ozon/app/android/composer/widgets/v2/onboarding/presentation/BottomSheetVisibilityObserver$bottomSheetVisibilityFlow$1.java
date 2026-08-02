package ru.ozon.app.android.composer.widgets.v2.onboarding.presentation;

import Sc.s;
import Wc.a;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.G;
import com.google.android.material.bottomsheet.b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ze.u;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lze/u;", "", "", "<anonymous>", "(Lze/u;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.BottomSheetVisibilityObserver$bottomSheetVisibilityFlow$1", f = "BottomSheetVisibilityObserver.kt", l = {60}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class BottomSheetVisibilityObserver$bottomSheetVisibilityFlow$1 extends j implements Function2<u<? super Boolean>, d<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BottomSheetVisibilityObserver this$0;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.BottomSheetVisibilityObserver$bottomSheetVisibilityFlow$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<Unit> {
        final /* synthetic */ BottomSheetVisibilityObserver$bottomSheetVisibilityFlow$1$callbacks$1 $callbacks;
        final /* synthetic */ G $fm;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(G g10, BottomSheetVisibilityObserver$bottomSheetVisibilityFlow$1$callbacks$1 bottomSheetVisibilityObserver$bottomSheetVisibilityFlow$1$callbacks$1) {
            super(0);
            this.$fm = g10;
            this.$callbacks = bottomSheetVisibilityObserver$bottomSheetVisibilityFlow$1$callbacks$1;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$fm.t1(this.$callbacks);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BottomSheetVisibilityObserver$bottomSheetVisibilityFlow$1(BottomSheetVisibilityObserver bottomSheetVisibilityObserver, d<? super BottomSheetVisibilityObserver$bottomSheetVisibilityFlow$1> dVar) {
        super(2, dVar);
        this.this$0 = bottomSheetVisibilityObserver;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        BottomSheetVisibilityObserver$bottomSheetVisibilityFlow$1 bottomSheetVisibilityObserver$bottomSheetVisibilityFlow$1 = new BottomSheetVisibilityObserver$bottomSheetVisibilityFlow$1(this.this$0, dVar);
        bottomSheetVisibilityObserver$bottomSheetVisibilityFlow$1.L$0 = obj;
        return bottomSheetVisibilityObserver$bottomSheetVisibilityFlow$1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.fragment.app.G$m, ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.BottomSheetVisibilityObserver$bottomSheetVisibilityFlow$1$callbacks$1] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Function0 function0;
        boolean isBottomSheetVisible;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            final u uVar = (u) this.L$0;
            function0 = this.this$0.fragmentManagerProvider;
            G g10 = (G) function0.invoke();
            if (g10 == 0) {
                uVar.b(Boolean.FALSE);
                uVar.l(null);
                return Unit.f71690a;
            }
            isBottomSheetVisible = this.this$0.isBottomSheetVisible();
            uVar.b(Boolean.valueOf(isBottomSheetVisible));
            final BottomSheetVisibilityObserver bottomSheetVisibilityObserver = this.this$0;
            ?? r32 = new G.m() { // from class: ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.BottomSheetVisibilityObserver$bottomSheetVisibilityFlow$1$callbacks$1
                @Override // androidx.fragment.app.G.m
                public void onFragmentDestroyed(G fm, ComponentCallbacksC5392m fragment) {
                    boolean isBottomSheetVisible2;
                    Intrinsics.checkNotNullParameter(fm, "fm");
                    Intrinsics.checkNotNullParameter(fragment, "fragment");
                    if (fragment instanceof b) {
                        u<Boolean> uVar2 = uVar;
                        isBottomSheetVisible2 = bottomSheetVisibilityObserver.isBottomSheetVisible();
                        uVar2.b(Boolean.valueOf(isBottomSheetVisible2));
                    }
                }

                @Override // androidx.fragment.app.G.m
                public void onFragmentStarted(G fm, ComponentCallbacksC5392m fragment) {
                    boolean isBottomSheetVisible2;
                    Intrinsics.checkNotNullParameter(fm, "fm");
                    Intrinsics.checkNotNullParameter(fragment, "fragment");
                    if (fragment instanceof b) {
                        u<Boolean> uVar2 = uVar;
                        isBottomSheetVisible2 = bottomSheetVisibilityObserver.isBottomSheetVisible();
                        uVar2.b(Boolean.valueOf(isBottomSheetVisible2));
                    }
                }
            };
            g10.Y0(r32, true);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(g10, r32);
            this.label = 1;
            if (ze.s.a(uVar, anonymousClass1, this) == aVar) {
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

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(u<? super Boolean> uVar, d<? super Unit> dVar) {
        return ((BottomSheetVisibilityObserver$bottomSheetVisibilityFlow$1) create(uVar, dVar)).invokeSuspend(Unit.f71690a);
    }
}
