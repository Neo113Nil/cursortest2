package com.vungle.ads.internal.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.internal.executor.Executors;
import com.vungle.ads.internal.executor.VungleThreadPoolExecutor;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: BlackScreenDetector.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "bitmap", "Landroid/graphics/Bitmap;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
final class BlackScreenDetector$start$1 extends Lambda implements Function1<Bitmap, Unit> {
    final /* synthetic */ int $samplingFactor;
    final /* synthetic */ View $view;
    final /* synthetic */ BlackScreenDetector this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BlackScreenDetector$start$1(View view, BlackScreenDetector blackScreenDetector, int i) {
        super(1);
        this.$view = view;
        this.this$0 = blackScreenDetector;
        this.$samplingFactor = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Bitmap bitmap) {
        invoke2(bitmap);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke$lambda-0, reason: not valid java name */
    private static final Executors m10756invoke$lambda0(Lazy<? extends Executors> lazy) {
        return lazy.getValue();
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(final Bitmap bitmap) {
        ServiceLocator.Companion companion = ServiceLocator.INSTANCE;
        final Context context = this.$view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "view.context");
        VungleThreadPoolExecutor job_executor = m10756invoke$lambda0(LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<Executors>() { // from class: com.vungle.ads.internal.util.BlackScreenDetector$start$1$invoke$$inlined$inject$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.executor.Executors, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final Executors invoke() {
                return ServiceLocator.INSTANCE.getInstance(context).getService(Executors.class);
            }
        })).getJOB_EXECUTOR();
        final BlackScreenDetector blackScreenDetector = this.this$0;
        final int i = this.$samplingFactor;
        job_executor.execute(new Runnable() { // from class: com.vungle.ads.internal.util.BlackScreenDetector$start$1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                BlackScreenDetector$start$1.m10757invoke$lambda1(BlackScreenDetector.this, bitmap, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invoke$lambda-1, reason: not valid java name */
    public static final void m10757invoke$lambda1(BlackScreenDetector this$0, Bitmap bitmap, int i) {
        Function2 function2;
        Function2 function22;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            Pair<Integer, String> processBitmapForBlackScreen$vungle_ads_release = this$0.processBitmapForBlackScreen$vungle_ads_release(bitmap, i);
            int intValue = processBitmapForBlackScreen$vungle_ads_release.component1().intValue();
            String component2 = processBitmapForBlackScreen$vungle_ads_release.component2();
            function22 = this$0.callback;
            if (function22 != null) {
                function22.invoke(Integer.valueOf(intValue), component2);
            }
        } catch (Throwable th) {
            try {
                Logger.INSTANCE.e("BlackScreenDetector", "Black screen detection failed", th);
                function2 = this$0.callback;
                if (function2 != null) {
                    function2.invoke(-1, "Internal calculation error: " + th.getMessage());
                }
                if (bitmap != null) {
                    bitmap.recycle();
                }
                this$0.callback = null;
            } finally {
                if (bitmap != null) {
                    bitmap.recycle();
                }
                this$0.callback = null;
            }
        }
    }
}
