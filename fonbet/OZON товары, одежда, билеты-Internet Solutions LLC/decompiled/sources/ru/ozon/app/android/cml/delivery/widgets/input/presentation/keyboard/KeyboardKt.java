package ru.ozon.app.android.cml.delivery.widgets.input.presentation.keyboard;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import android.app.Activity;
import android.graphics.Rect;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import xe.M;
import xe.N;

@Metadata(d1 = {"\u0000/\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\b\u0004*\u0001\r\u001a\u001f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a3\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroid/app/Activity;", "activity", "LAe/h;", "", "keyboardVisibilityChanges", "(Landroid/app/Activity;)LAe/h;", "Lxe/M;", "scope", "Landroid/view/ViewGroup;", "rootView", "Lkotlin/Function1;", "", "emitter", "ru/ozon/app/android/cml/delivery/widgets/input/presentation/keyboard/KeyboardKt$onGlobalLayoutListener$1", "onGlobalLayoutListener", "(Lxe/M;Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function1;)Lru/ozon/app/android/cml/delivery/widgets/input/presentation/keyboard/KeyboardKt$onGlobalLayoutListener$1;", "delivery_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class KeyboardKt {
    @NotNull
    public static final InterfaceC2395h<Boolean> keyboardVisibilityChanges(Activity activity) {
        return C2399j.e(new KeyboardKt$keyboardVisibilityChanges$1(activity, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [ru.ozon.app.android.cml.delivery.widgets.input.presentation.keyboard.KeyboardKt$onGlobalLayoutListener$1] */
    public static final KeyboardKt$onGlobalLayoutListener$1 onGlobalLayoutListener(final M m11, final ViewGroup viewGroup, final Function1<? super Boolean, Unit> function1) {
        return new ViewTreeObserver.OnGlobalLayoutListener() { // from class: ru.ozon.app.android.cml.delivery.widgets.input.presentation.keyboard.KeyboardKt$onGlobalLayoutListener$1
            private int heightMax;

            /* JADX WARN: Multi-variable type inference failed */
            {
                calculateIsKeyboardVisible();
            }

            private final void calculateIsKeyboardVisible() {
                if (N.f(M.this)) {
                    Rect rect = new Rect();
                    viewGroup.getWindowVisibleDisplayFrame(rect);
                    int i11 = rect.bottom;
                    if (i11 > this.heightMax) {
                        this.heightMax = i11;
                    }
                    function1.invoke(Boolean.valueOf(this.heightMax - i11 > 0));
                }
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                calculateIsKeyboardVisible();
            }
        };
    }
}
