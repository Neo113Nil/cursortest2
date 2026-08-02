package ru.ozon.android.messenger.framework.presentation.common.keyboard;

import Sc.s;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.presentation.common.keyboard.b;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import xe.M;
import xe.Y;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.common.keyboard.Keyboard$Default$show$1", f = "Keyboard.kt", l = {79}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f90766d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ b.a f90767e;

    /* renamed from: ru.ozon.android.messenger.framework.presentation.common.keyboard.a$a, reason: collision with other inner class name */
    public static final class ViewOnLayoutChangeListenerC1685a implements View.OnLayoutChangeListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ b.a f90768a;

        public ViewOnLayoutChangeListenerC1685a(b.a aVar) {
            this.f90768a = aVar;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(@NotNull View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
            View view2;
            View view3;
            View view4;
            View view5;
            View view6;
            view.removeOnLayoutChangeListener(this);
            b.a aVar = this.f90768a;
            view2 = aVar.f90769a;
            if (view2 instanceof EditText) {
                view5 = aVar.f90769a;
                view6 = aVar.f90769a;
                ((EditText) view5).setSelection(((EditText) view6).length());
            }
            view3 = aVar.f90769a;
            if (view3 instanceof TextInputLayout) {
                view4 = aVar.f90769a;
                EditText s11 = ((TextInputLayout) view4).s();
                if (s11 != null) {
                    s11.setSelection(s11.length());
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(b.a aVar, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f90767e = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new a(this.f90767e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        View view;
        View view2;
        View view3;
        View view4;
        View view5;
        View view6;
        View view7;
        View view8;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f90766d;
        b.a aVar2 = this.f90767e;
        if (i11 == 0) {
            s.b(obj);
            view = aVar2.f90769a;
            view.requestFocus();
            view2 = aVar2.f90769a;
            if (!view2.isLaidOut() || view2.isLayoutRequested()) {
                view2.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC1685a(aVar2));
            } else {
                view3 = aVar2.f90769a;
                if (view3 instanceof EditText) {
                    view6 = aVar2.f90769a;
                    view7 = aVar2.f90769a;
                    ((EditText) view6).setSelection(((EditText) view7).length());
                }
                view4 = aVar2.f90769a;
                if (view4 instanceof TextInputLayout) {
                    view5 = aVar2.f90769a;
                    EditText s11 = ((TextInputLayout) view5).s();
                    if (s11 != null) {
                        s11.setSelection(s11.length());
                    }
                }
            }
            this.f90766d = 1;
            if (Y.b(300L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        view8 = aVar2.f90769a;
        ViewExtKt.showKeyboard(view8);
        return Unit.f71690a;
    }
}
