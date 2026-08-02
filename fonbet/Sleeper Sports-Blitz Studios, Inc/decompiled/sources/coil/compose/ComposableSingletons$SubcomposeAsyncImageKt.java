package coil.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* compiled from: SubcomposeAsyncImage.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ComposableSingletons$SubcomposeAsyncImageKt {
    public static final ComposableSingletons$SubcomposeAsyncImageKt INSTANCE = new ComposableSingletons$SubcomposeAsyncImageKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function3<SubcomposeAsyncImageScope, Composer, Integer, Unit> f55lambda1 = ComposableLambdaKt.composableLambdaInstance(-1783408023, false, new Function3<SubcomposeAsyncImageScope, Composer, Integer, Unit>() { // from class: coil.compose.ComposableSingletons$SubcomposeAsyncImageKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(SubcomposeAsyncImageScope subcomposeAsyncImageScope, Composer composer, Integer num) {
            invoke(subcomposeAsyncImageScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(SubcomposeAsyncImageScope subcomposeAsyncImageScope, Composer composer, int i) {
            int i2;
            if ((i & 14) == 0) {
                i2 = i | (composer.changed(subcomposeAsyncImageScope) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 91) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
            } else {
                SubcomposeAsyncImageKt.SubcomposeAsyncImageContent(subcomposeAsyncImageScope, null, null, null, null, null, 0.0f, null, false, composer, i2 & 14, 255);
            }
        }
    });

    /* renamed from: getLambda-1$coil_compose_base_release, reason: not valid java name */
    public final Function3<SubcomposeAsyncImageScope, Composer, Integer, Unit> m10083getLambda1$coil_compose_base_release() {
        return f55lambda1;
    }
}
