package com.vungle.ads.internal.util;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.View;
import android.view.Window;
import com.vungle.ads.internal.executor.Executors;
import com.vungle.ads.internal.executor.VungleThreadPoolExecutor;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: BlackScreenDetector.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
final class BlackScreenDetector$captureViewWithPixelCopy$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ Lazy<Executors> $executors$delegate;
    final /* synthetic */ Function1<Bitmap, Unit> $onComplete;
    final /* synthetic */ View $view;
    final /* synthetic */ Window $window;
    final /* synthetic */ BlackScreenDetector this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    BlackScreenDetector$captureViewWithPixelCopy$1(View view, Lazy<? extends Executors> lazy, BlackScreenDetector blackScreenDetector, Window window, Function1<? super Bitmap, Unit> function1) {
        super(0);
        this.$view = view;
        this.$executors$delegate = lazy;
        this.this$0 = blackScreenDetector;
        this.$window = window;
        this.$onComplete = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Executors m10752captureViewWithPixelCopy$lambda0;
        final int width = this.$view.getWidth();
        final int height = this.$view.getHeight();
        int[] iArr = new int[2];
        this.$view.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        final Rect rect = new Rect(i, i2, i + width, i2 + height);
        m10752captureViewWithPixelCopy$lambda0 = BlackScreenDetector.m10752captureViewWithPixelCopy$lambda0(this.$executors$delegate);
        VungleThreadPoolExecutor job_executor = m10752captureViewWithPixelCopy$lambda0.getJOB_EXECUTOR();
        final BlackScreenDetector blackScreenDetector = this.this$0;
        final Window window = this.$window;
        final Function1<Bitmap, Unit> function1 = this.$onComplete;
        job_executor.execute(new Runnable() { // from class: com.vungle.ads.internal.util.BlackScreenDetector$captureViewWithPixelCopy$1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                BlackScreenDetector$captureViewWithPixelCopy$1.m10754invoke$lambda0(width, height, blackScreenDetector, window, rect, function1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invoke$lambda-0, reason: not valid java name */
    public static final void m10754invoke$lambda0(int i, int i2, BlackScreenDetector this$0, Window window, Rect rect, Function1 onComplete) {
        Bitmap bitmap;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(rect, "$rect");
        Intrinsics.checkNotNullParameter(onComplete, "$onComplete");
        try {
            bitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            try {
                this$0.executePixelCopyRequest(window, rect, bitmap, onComplete);
            } catch (Throwable th) {
                th = th;
                Logger.INSTANCE.e("BlackScreenDetector", "Bitmap creation failed", th);
                if (bitmap != null) {
                    bitmap.recycle();
                }
                onComplete.invoke(null);
            }
        } catch (Throwable th2) {
            th = th2;
            bitmap = null;
        }
    }
}
