package com.moloco.sdk.internal.publisher.nativead.ui;

import android.content.Context;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.MaterialThemeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.ComposeView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class b {

    public static final class a implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ Function3<Modifier, Composer, Integer, Unit> a;

        /* renamed from: com.moloco.sdk.internal.publisher.nativead.ui.b$a$a, reason: collision with other inner class name */
        public static final class C0260a implements Function2<Composer, Integer, Unit> {
            public final /* synthetic */ Function3<Modifier, Composer, Integer, Unit> a;

            /* JADX WARN: Multi-variable type inference failed */
            public C0260a(Function3<? super Modifier, ? super Composer, ? super Integer, Unit> function3) {
                this.a = function3;
            }

            public final void a(Composer composer, int i) {
                if ((i & 3) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-964093233, i, -1, "com.moloco.sdk.internal.publisher.nativead.ui.NativeAdComposeViewWrapper.<anonymous>.<anonymous>.<anonymous> (NativeAdComposeViewWrapper.kt:15)");
                }
                this.a.invoke(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), composer, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                a(composer, num.intValue());
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(Function3<? super Modifier, ? super Composer, ? super Integer, Unit> function3) {
            this.a = function3;
        }

        public final void a(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1870157091, i, -1, "com.moloco.sdk.internal.publisher.nativead.ui.NativeAdComposeViewWrapper.<anonymous>.<anonymous> (NativeAdComposeViewWrapper.kt:14)");
            }
            MaterialThemeKt.MaterialTheme(null, null, null, ComposableLambdaKt.composableLambda(composer, -964093233, true, new C0260a(this.a)), composer, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.INSTANCE;
        }
    }

    public static final ComposeView a(Context context, Function3<? super Modifier, ? super Composer, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(content, "content");
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(1870157091, true, new a(content)));
        return composeView;
    }
}
