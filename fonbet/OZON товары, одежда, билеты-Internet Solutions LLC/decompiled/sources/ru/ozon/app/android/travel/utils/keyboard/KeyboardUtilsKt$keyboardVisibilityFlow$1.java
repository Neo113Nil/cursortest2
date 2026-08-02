package ru.ozon.app.android.travel.utils.keyboard;

import Sc.s;
import android.app.Activity;
import android.view.View;
import androidx.core.view.C5353y0;
import androidx.core.view.D;
import androidx.core.view.Y;
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
@e(c = "ru.ozon.app.android.travel.utils.keyboard.KeyboardUtilsKt$keyboardVisibilityFlow$1", f = "KeyboardUtils.kt", l = {23}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class KeyboardUtilsKt$keyboardVisibilityFlow$1 extends j implements Function2<u<? super Boolean>, d<? super Unit>, Object> {
    final /* synthetic */ Activity $this_keyboardVisibilityFlow;
    private /* synthetic */ Object L$0;
    int label;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.utils.keyboard.KeyboardUtilsKt$keyboardVisibilityFlow$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<Unit> {
        final /* synthetic */ Activity $this_keyboardVisibilityFlow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Activity activity) {
            super(0);
            this.$this_keyboardVisibilityFlow = activity;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Y.J(this.$this_keyboardVisibilityFlow.getWindow().getDecorView(), null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    KeyboardUtilsKt$keyboardVisibilityFlow$1(Activity activity, d<? super KeyboardUtilsKt$keyboardVisibilityFlow$1> dVar) {
        super(2, dVar);
        this.$this_keyboardVisibilityFlow = activity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5353y0 invokeSuspend$lambda$0(u uVar, View view, C5353y0 c5353y0) {
        C5353y0 u11 = Y.u(view, c5353y0);
        Intrinsics.checkNotNullExpressionValue(u11, "onApplyWindowInsets(...)");
        uVar.b(Boolean.valueOf(u11.p(8)));
        return Y.u(view, c5353y0);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        KeyboardUtilsKt$keyboardVisibilityFlow$1 keyboardUtilsKt$keyboardVisibilityFlow$1 = new KeyboardUtilsKt$keyboardVisibilityFlow$1(this.$this_keyboardVisibilityFlow, dVar);
        keyboardUtilsKt$keyboardVisibilityFlow$1.L$0 = obj;
        return keyboardUtilsKt$keyboardVisibilityFlow$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            final u uVar = (u) this.L$0;
            if (this.$this_keyboardVisibilityFlow.getWindow() == null) {
                return Unit.f71690a;
            }
            Y.J(this.$this_keyboardVisibilityFlow.getWindow().getDecorView(), new D() { // from class: ru.ozon.app.android.travel.utils.keyboard.a
                @Override // androidx.core.view.D
                public final C5353y0 onApplyWindowInsets(View view, C5353y0 c5353y0) {
                    C5353y0 invokeSuspend$lambda$0;
                    invokeSuspend$lambda$0 = KeyboardUtilsKt$keyboardVisibilityFlow$1.invokeSuspend$lambda$0(u.this, view, c5353y0);
                    return invokeSuspend$lambda$0;
                }
            });
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_keyboardVisibilityFlow);
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
        return ((KeyboardUtilsKt$keyboardVisibilityFlow$1) create(uVar, dVar)).invokeSuspend(Unit.f71690a);
    }
}
