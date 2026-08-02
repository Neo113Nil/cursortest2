package io.intercom.android.sdk.m5.helpcenter.ui.components;

import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: CollectionRowComponent.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ComposableSingletons$CollectionRowComponentKt {
    public static final ComposableSingletons$CollectionRowComponentKt INSTANCE = new ComposableSingletons$CollectionRowComponentKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f254lambda1 = ComposableLambdaKt.composableLambdaInstance(1519966260, false, ComposableSingletons$CollectionRowComponentKt$lambda1$1.INSTANCE);

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f255lambda2 = ComposableLambdaKt.composableLambdaInstance(-169073169, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.ComposableSingletons$CollectionRowComponentKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                SurfaceKt.m3729SurfaceT9BRK9s(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$CollectionRowComponentKt.INSTANCE.m12450getLambda1$intercom_sdk_base_release(), composer, 12582912, 127);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: lambda-3, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f256lambda3 = ComposableLambdaKt.composableLambdaInstance(2013190203, false, ComposableSingletons$CollectionRowComponentKt$lambda3$1.INSTANCE);

    /* renamed from: lambda-4, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f257lambda4 = ComposableLambdaKt.composableLambdaInstance(77551584, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.ComposableSingletons$CollectionRowComponentKt$lambda-4$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                SurfaceKt.m3729SurfaceT9BRK9s(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$CollectionRowComponentKt.INSTANCE.m12452getLambda3$intercom_sdk_base_release(), composer, 12582912, 127);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12450getLambda1$intercom_sdk_base_release() {
        return f254lambda1;
    }

    /* renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12451getLambda2$intercom_sdk_base_release() {
        return f255lambda2;
    }

    /* renamed from: getLambda-3$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12452getLambda3$intercom_sdk_base_release() {
        return f256lambda3;
    }

    /* renamed from: getLambda-4$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12453getLambda4$intercom_sdk_base_release() {
        return f257lambda4;
    }
}
