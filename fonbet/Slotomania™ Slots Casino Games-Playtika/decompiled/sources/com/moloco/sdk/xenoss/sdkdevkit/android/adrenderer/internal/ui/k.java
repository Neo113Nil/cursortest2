package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import coil.compose.SingletonAsyncImageKt;
import coil.request.ImageRequest;
import com.google.android.exoplayer2.RendererCapabilities;
import com.moloco.sdk.acm.CountEvent;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.service_locator.a;
import io.sentry.protocol.Device;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class k {
    public static final AtomicBoolean a = new AtomicBoolean(false);

    public static final Unit a(String str, ContentScale contentScale, Modifier modifier, int i, Composer composer, int i2) {
        a(str, contentScale, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void a(final String str, final ContentScale contentScale, final Modifier modifier, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(contentScale, "contentScale");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Composer startRestartGroup = composer.startRestartGroup(481470006);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(contentScale) ? 32 : 16;
        }
        if ((i & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i2 |= startRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(481470006, i2, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.CoilAsyncImage (CoilAsyncImage.kt:31)");
            }
            final boolean isHardwareAccelerated = ((View) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView())).isHardwareAccelerated();
            startRestartGroup.startReplaceableGroup(313990270);
            boolean changed = startRestartGroup.changed(isHardwareAccelerated);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.k$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return k.a(isHardwareAccelerated);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            EffectsKt.SideEffect((Function0) rememberedValue, startRestartGroup, 0);
            SingletonAsyncImageKt.m4814AsyncImagegl8XCv8(new ImageRequest.Builder((Context) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).data(str).allowHardware(isHardwareAccelerated).build(), null, modifier, null, null, null, contentScale, 0.0f, null, 0, false, null, startRestartGroup, (i2 & 896) | 48 | ((i2 << 15) & 3670016), 0, 4024);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.k$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return k.a(str, contentScale, modifier, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final Unit a(boolean z) {
        if (!z) {
            a();
        }
        return Unit.INSTANCE;
    }

    public static final void a() {
        if (a.compareAndSet(false, true)) {
            com.moloco.sdk.internal.services.x b = a.e.a.l().b();
            MetricsRecorder.INSTANCE.withNoMediation().recordCountEvent(new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.b0.c()).withTag(Device.JsonKeys.MANUFACTURER, b.t()).withTag("model", b.v()).withTag("os_version", b.x()).withTag("api_level", String.valueOf(b.n())));
        }
    }
}
