package io.intercom.android.sdk.m5.components;

import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: PoweredByBadge.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ComposableSingletons$PoweredByBadgeKt {
    public static final ComposableSingletons$PoweredByBadgeKt INSTANCE = new ComposableSingletons$PoweredByBadgeKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f115lambda1 = ComposableLambdaKt.composableLambdaInstance(-979615037, false, ComposableSingletons$PoweredByBadgeKt$lambda1$1.INSTANCE);

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f116lambda2 = ComposableLambdaKt.composableLambdaInstance(250625000, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.components.ComposableSingletons$PoweredByBadgeKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                SurfaceKt.m3729SurfaceT9BRK9s(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$PoweredByBadgeKt.INSTANCE.m12079getLambda1$intercom_sdk_base_release(), composer, 12582912, 127);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: lambda-3, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f117lambda3 = ComposableLambdaKt.composableLambdaInstance(1783930351, false, ComposableSingletons$PoweredByBadgeKt$lambda3$1.INSTANCE);

    /* renamed from: lambda-4, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f118lambda4 = ComposableLambdaKt.composableLambdaInstance(94890922, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.components.ComposableSingletons$PoweredByBadgeKt$lambda-4$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                SurfaceKt.m3729SurfaceT9BRK9s(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$PoweredByBadgeKt.INSTANCE.m12081getLambda3$intercom_sdk_base_release(), composer, 12582912, 127);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12079getLambda1$intercom_sdk_base_release() {
        return f115lambda1;
    }

    /* renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12080getLambda2$intercom_sdk_base_release() {
        return f116lambda2;
    }

    /* renamed from: getLambda-3$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12081getLambda3$intercom_sdk_base_release() {
        return f117lambda3;
    }

    /* renamed from: getLambda-4$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12082getLambda4$intercom_sdk_base_release() {
        return f118lambda4;
    }
}
