package ru.ozon.app.android.cml.delivery.widgets.input.presentation.keyboard;

import Sc.s;
import Wc.a;
import android.app.Activity;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ze.u;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lze/u;", "", "", "<anonymous>", "(Lze/u;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.cml.delivery.widgets.input.presentation.keyboard.KeyboardKt$keyboardVisibilityChanges$1", f = "Keyboard.kt", l = {20}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class KeyboardKt$keyboardVisibilityChanges$1 extends j implements Function2<u<? super Boolean>, d<? super Unit>, Object> {
    final /* synthetic */ Activity $activity;
    private /* synthetic */ Object L$0;
    int label;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.cml.delivery.widgets.input.presentation.keyboard.KeyboardKt$keyboardVisibilityChanges$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<Unit> {
        final /* synthetic */ KeyboardKt$onGlobalLayoutListener$1 $listener;
        final /* synthetic */ ViewGroup $rootView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ViewGroup viewGroup, KeyboardKt$onGlobalLayoutListener$1 keyboardKt$onGlobalLayoutListener$1) {
            super(0);
            this.$rootView = viewGroup;
            this.$listener = keyboardKt$onGlobalLayoutListener$1;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$rootView.getViewTreeObserver().removeOnGlobalLayoutListener(this.$listener);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    KeyboardKt$keyboardVisibilityChanges$1(Activity activity, d<? super KeyboardKt$keyboardVisibilityChanges$1> dVar) {
        super(2, dVar);
        this.$activity = activity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        KeyboardKt$keyboardVisibilityChanges$1 keyboardKt$keyboardVisibilityChanges$1 = new KeyboardKt$keyboardVisibilityChanges$1(this.$activity, dVar);
        keyboardKt$keyboardVisibilityChanges$1.L$0 = obj;
        return keyboardKt$keyboardVisibilityChanges$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        KeyboardKt$onGlobalLayoutListener$1 onGlobalLayoutListener;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            u uVar = (u) this.L$0;
            ViewGroup rootView = ContextExtKt.getRootView(this.$activity);
            if (rootView == null) {
                return Unit.f71690a;
            }
            onGlobalLayoutListener = KeyboardKt.onGlobalLayoutListener(uVar, rootView, new KeyboardKt$keyboardVisibilityChanges$1$listener$1(uVar));
            rootView.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(rootView, onGlobalLayoutListener);
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
        return ((KeyboardKt$keyboardVisibilityChanges$1) create(uVar, dVar)).invokeSuspend(Unit.f71690a);
    }
}
