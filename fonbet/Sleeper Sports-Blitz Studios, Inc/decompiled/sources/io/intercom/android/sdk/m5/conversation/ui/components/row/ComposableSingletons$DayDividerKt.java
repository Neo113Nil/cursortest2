package io.intercom.android.sdk.m5.conversation.ui.components.row;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: DayDivider.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ComposableSingletons$DayDividerKt {
    public static final ComposableSingletons$DayDividerKt INSTANCE = new ComposableSingletons$DayDividerKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f206lambda1 = ComposableLambdaKt.composableLambdaInstance(355794253, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.ComposableSingletons$DayDividerKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                DayDividerKt.DayDivider("23 August", null, composer, 6, 2);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12340getLambda1$intercom_sdk_base_release() {
        return f206lambda1;
    }
}
