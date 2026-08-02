package io.intercom.android.sdk.views.compose;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import androidx.media3.extractor.ts.PsExtractor;
import com.facebook.imageutils.JfifUtil;
import io.intercom.android.sdk.models.Attribute;
import io.intercom.android.sdk.models.AttributeType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* compiled from: AttributeCollectorCard.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ComposableSingletons$AttributeCollectorCardKt {
    public static final ComposableSingletons$AttributeCollectorCardKt INSTANCE = new ComposableSingletons$AttributeCollectorCardKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f416lambda1 = ComposableLambdaKt.composableLambdaInstance(188069514, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.views.compose.ComposableSingletons$AttributeCollectorCardKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                AttributeCollectorCardKt.AttributeCollectorCard(PaddingKt.m1157padding3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(8)), CollectionsKt.listOf(new Attribute("boolean", "Yes or no?", "boolean", false, null, null, null, null, PsExtractor.VIDEO_STREAM_MASK, null)), null, null, "", false, null, composer, 24646, 108);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f417lambda2 = ComposableLambdaKt.composableLambdaInstance(917707205, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.views.compose.ComposableSingletons$AttributeCollectorCardKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                SurfaceKt.m3729SurfaceT9BRK9s(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$AttributeCollectorCardKt.INSTANCE.m13195getLambda1$intercom_sdk_base_release(), composer, 12582912, 127);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: lambda-3, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f418lambda3 = ComposableLambdaKt.composableLambdaInstance(956990790, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.views.compose.ComposableSingletons$AttributeCollectorCardKt$lambda-3$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                AttributeCollectorCardKt.AttributeCollectorCard(PaddingKt.m1157padding3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(8)), CollectionsKt.listOf(new Attribute(AttributeType.LIST, "Choose one", "string", false, null, CollectionsKt.listOf((Object[]) new String[]{"Apple", "Orange", "Kiwi"}), null, null, JfifUtil.MARKER_RST0, null)), null, null, "", false, null, composer, 24646, 108);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: lambda-4, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f419lambda4 = ComposableLambdaKt.composableLambdaInstance(1472422891, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.views.compose.ComposableSingletons$AttributeCollectorCardKt$lambda-4$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                SurfaceKt.m3729SurfaceT9BRK9s(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$AttributeCollectorCardKt.INSTANCE.m13197getLambda3$intercom_sdk_base_release(), composer, 12582912, 127);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: lambda-5, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f420lambda5 = ComposableLambdaKt.composableLambdaInstance(-1430207147, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.views.compose.ComposableSingletons$AttributeCollectorCardKt$lambda-5$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                AttributeCollectorCardKt.AttributeCollectorCard(PaddingKt.m1157padding3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(8)), CollectionsKt.listOf(new Attribute("text", "Provide text", "string", false, null, null, null, null, PsExtractor.VIDEO_STREAM_MASK, null)), null, null, "", false, null, composer, 24646, 108);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: lambda-6, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f421lambda6 = ComposableLambdaKt.composableLambdaInstance(-914775046, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.views.compose.ComposableSingletons$AttributeCollectorCardKt$lambda-6$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                SurfaceKt.m3729SurfaceT9BRK9s(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$AttributeCollectorCardKt.INSTANCE.m13199getLambda5$intercom_sdk_base_release(), composer, 12582912, 127);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: lambda-7, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f422lambda7 = ComposableLambdaKt.composableLambdaInstance(544168504, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.views.compose.ComposableSingletons$AttributeCollectorCardKt$lambda-7$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                AttributeCollectorCardKt.AttributeCollectorCard(PaddingKt.m1157padding3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(8)), CollectionsKt.listOf((Object[]) new Attribute[]{new Attribute("string", "Provide text", "string", false, null, null, null, null, PsExtractor.VIDEO_STREAM_MASK, null), new Attribute("boolean", "Yes or no?", "boolean", true, null, null, null, "true", 112, null), new Attribute(AttributeType.LIST, "Choose one", "string", false, null, CollectionsKt.listOf((Object[]) new String[]{"Apple", "Orange", "Kiwi"}), null, null, JfifUtil.MARKER_RST0, null)}), null, null, "", false, null, composer, 24646, 108);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: lambda-8, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f423lambda8 = ComposableLambdaKt.composableLambdaInstance(1688100445, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.views.compose.ComposableSingletons$AttributeCollectorCardKt$lambda-8$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                SurfaceKt.m3729SurfaceT9BRK9s(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$AttributeCollectorCardKt.INSTANCE.m13201getLambda7$intercom_sdk_base_release(), composer, 12582912, 127);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m13195getLambda1$intercom_sdk_base_release() {
        return f416lambda1;
    }

    /* renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m13196getLambda2$intercom_sdk_base_release() {
        return f417lambda2;
    }

    /* renamed from: getLambda-3$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m13197getLambda3$intercom_sdk_base_release() {
        return f418lambda3;
    }

    /* renamed from: getLambda-4$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m13198getLambda4$intercom_sdk_base_release() {
        return f419lambda4;
    }

    /* renamed from: getLambda-5$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m13199getLambda5$intercom_sdk_base_release() {
        return f420lambda5;
    }

    /* renamed from: getLambda-6$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m13200getLambda6$intercom_sdk_base_release() {
        return f421lambda6;
    }

    /* renamed from: getLambda-7$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m13201getLambda7$intercom_sdk_base_release() {
        return f422lambda7;
    }

    /* renamed from: getLambda-8$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m13202getLambda8$intercom_sdk_base_release() {
        return f423lambda8;
    }
}
