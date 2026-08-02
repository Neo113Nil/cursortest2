package ru.ozon.app.android.select.feature.entry.splash.view;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.select.feature.entry.splash.view.SelectSplashScreenView", f = "SelectSplashScreenView.kt", l = {136, 143}, m = "startAnimation")
/* loaded from: classes13.dex */
final class SelectSplashScreenView$startAnimation$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SelectSplashScreenView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SelectSplashScreenView$startAnimation$1(SelectSplashScreenView selectSplashScreenView, d<? super SelectSplashScreenView$startAnimation$1> dVar) {
        super(dVar);
        this.this$0 = selectSplashScreenView;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object startAnimation;
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        startAnimation = this.this$0.startAnimation((d<? super Unit>) this);
        return startAnimation;
    }
}
