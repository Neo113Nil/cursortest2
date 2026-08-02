package io.intercom.android.sdk.survey.ui.questiontype.files;

import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: FileUploadProgressComponent.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ComposableSingletons$FileUploadProgressComponentKt {
    public static final ComposableSingletons$FileUploadProgressComponentKt INSTANCE = new ComposableSingletons$FileUploadProgressComponentKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f344lambda1 = ComposableLambdaKt.composableLambdaInstance(394689098, false, ComposableSingletons$FileUploadProgressComponentKt$lambda1$1.INSTANCE);

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f345lambda2 = ComposableLambdaKt.composableLambdaInstance(-1444983099, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.ComposableSingletons$FileUploadProgressComponentKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                SurfaceKt.m3729SurfaceT9BRK9s(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$FileUploadProgressComponentKt.INSTANCE.m12758getLambda1$intercom_sdk_base_release(), composer, 12582912, 127);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12758getLambda1$intercom_sdk_base_release() {
        return f344lambda1;
    }

    /* renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12759getLambda2$intercom_sdk_base_release() {
        return f345lambda2;
    }
}
