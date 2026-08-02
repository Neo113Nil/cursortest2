package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: TabRow.kt */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$TabRowKt {
    public static final ComposableSingletons$TabRowKt INSTANCE = new ComposableSingletons$TabRowKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f13lambda1 = ComposableLambdaKt.composableLambdaInstance(182187156, false, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ComposableSingletons$TabRowKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C141@6946L9:TabRow.kt#jmzs0o");
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
            } else {
                TabRowDefaults.INSTANCE.m1548Divider9IZ8Weo(null, 0.0f, 0L, composer, 3072, 7);
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f14lambda2 = ComposableLambdaKt.composableLambdaInstance(-1480449365, false, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ComposableSingletons$TabRowKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C236@11642L9:TabRow.kt#jmzs0o");
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
            } else {
                TabRowDefaults.INSTANCE.m1548Divider9IZ8Weo(null, 0.0f, 0L, composer, 3072, 7);
            }
        }
    });

    /* renamed from: getLambda-1$material_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m1355getLambda1$material_release() {
        return f13lambda1;
    }

    /* renamed from: getLambda-2$material_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m1356getLambda2$material_release() {
        return f14lambda2;
    }
}
