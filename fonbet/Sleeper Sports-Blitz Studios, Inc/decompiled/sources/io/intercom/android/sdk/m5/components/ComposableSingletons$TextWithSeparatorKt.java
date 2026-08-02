package io.intercom.android.sdk.m5.components;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: TextWithSeparator.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ComposableSingletons$TextWithSeparatorKt {
    public static final ComposableSingletons$TextWithSeparatorKt INSTANCE = new ComposableSingletons$TextWithSeparatorKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f125lambda1 = ComposableLambdaKt.composableLambdaInstance(1120207922, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.components.ComposableSingletons$TextWithSeparatorKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
            } else {
                TextWithSeparatorKt.m12128TextWithSeparatorwV1YYcM("Dale", "Yesterday", null, null, null, 0L, 0, 0, null, composer, 54, TypedValues.PositionType.TYPE_CURVE_FIT);
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f126lambda2 = ComposableLambdaKt.composableLambdaInstance(-292743827, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.components.ComposableSingletons$TextWithSeparatorKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
            } else {
                TextWithSeparatorKt.m12128TextWithSeparatorwV1YYcM("", "Yesterday", null, null, null, 0L, 0, 0, null, composer, 54, TypedValues.PositionType.TYPE_CURVE_FIT);
            }
        }
    });

    /* renamed from: lambda-3, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f127lambda3 = ComposableLambdaKt.composableLambdaInstance(-1724965451, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.components.ComposableSingletons$TextWithSeparatorKt$lambda-3$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
            } else {
                TextWithSeparatorKt.m12128TextWithSeparatorwV1YYcM("Dale", "", null, null, null, 0L, 0, 0, null, composer, 54, TypedValues.PositionType.TYPE_CURVE_FIT);
            }
        }
    });

    /* renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12089getLambda1$intercom_sdk_base_release() {
        return f125lambda1;
    }

    /* renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12090getLambda2$intercom_sdk_base_release() {
        return f126lambda2;
    }

    /* renamed from: getLambda-3$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12091getLambda3$intercom_sdk_base_release() {
        return f127lambda3;
    }
}
