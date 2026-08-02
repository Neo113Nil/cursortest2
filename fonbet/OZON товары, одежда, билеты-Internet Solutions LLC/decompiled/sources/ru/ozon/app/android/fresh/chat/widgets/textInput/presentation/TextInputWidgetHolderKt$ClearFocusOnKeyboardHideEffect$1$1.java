package ru.ozon.app.android.fresh.chat.widgets.textInput.presentation;

import S0.M;
import S0.N;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.core.view.C5336p0;
import androidx.core.view.C5353y0;
import androidx.core.view.Y;
import j1.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LS0/N;", "LS0/M;", "invoke", "(LS0/N;)LS0/M;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes12.dex */
final class TextInputWidgetHolderKt$ClearFocusOnKeyboardHideEffect$1$1 extends AbstractC7737t implements Function1<N, M> {
    final /* synthetic */ i $focusManager;
    final /* synthetic */ View $view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextInputWidgetHolderKt$ClearFocusOnKeyboardHideEffect$1$1(View view, i iVar) {
        super(1);
        this.$view = view;
        this.$focusManager = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final M invoke(N DisposableEffect) {
        final View view;
        Window window;
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        Context context = this.$view.getContext();
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity == null || (window = activity.getWindow()) == null || (view = window.getDecorView()) == null) {
            view = this.$view;
        }
        final View view2 = this.$view;
        final i iVar = this.$focusManager;
        Y.Q(view, new C5336p0.b() { // from class: ru.ozon.app.android.fresh.chat.widgets.textInput.presentation.TextInputWidgetHolderKt$ClearFocusOnKeyboardHideEffect$1$1$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // androidx.core.view.C5336p0.b
            public void onEnd(C5336p0 animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
            }

            @Override // androidx.core.view.C5336p0.b
            public void onPrepare(C5336p0 animation) {
                C5353y0 n11;
                Intrinsics.checkNotNullParameter(animation, "animation");
                if ((animation.c() & 8) == 0 || (n11 = Y.n(view2)) == null || !n11.p(8)) {
                    return;
                }
                iVar.g(false);
            }

            @Override // androidx.core.view.C5336p0.b
            public C5353y0 onProgress(C5353y0 insets, List<C5336p0> runningAnimations) {
                Intrinsics.checkNotNullParameter(insets, "insets");
                Intrinsics.checkNotNullParameter(runningAnimations, "runningAnimations");
                return insets;
            }
        });
        return new M() { // from class: ru.ozon.app.android.fresh.chat.widgets.textInput.presentation.TextInputWidgetHolderKt$ClearFocusOnKeyboardHideEffect$1$1$invoke$$inlined$onDispose$1
            @Override // S0.M
            public void dispose() {
                Y.Q(view, null);
            }
        };
    }
}
