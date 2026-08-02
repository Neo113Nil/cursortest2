package io.intercom.android.sdk.m5.helpcenter.ui.components;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BrowseAllHelpTopicsComponent.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ComposableSingletons$BrowseAllHelpTopicsComponentKt {
    public static final ComposableSingletons$BrowseAllHelpTopicsComponentKt INSTANCE = new ComposableSingletons$BrowseAllHelpTopicsComponentKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function3<RowScope, Composer, Integer, Unit> f251lambda1 = ComposableLambdaKt.composableLambdaInstance(1224833391, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.ComposableSingletons$BrowseAllHelpTopicsComponentKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            invoke(rowScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(RowScope OutlinedButton, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(OutlinedButton, "$this$OutlinedButton");
            if ((i & 81) != 16 || !composer.getSkipping()) {
                IconKt.m3194Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.intercom_article_book_icon, composer, 0), (String) null, (Modifier) null, 0L, composer, 56, 12);
                SpacerKt.Spacer(SizeKt.m1214width3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(6)), composer, 6);
                TextKt.m3901TextNvy7gAk(StringResources_androidKt.stringResource(R.string.intercom_browse_all_help_topics, composer, 0), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.m8245copyp1EtxEg$default(IntercomTheme.INSTANCE.getTypography(composer, IntercomTheme.$stable).getType04Point5(), IntercomTheme.INSTANCE.getColors(composer, IntercomTheme.$stable).m13116getPrimaryText0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), composer, 0, 0, 131070);
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f252lambda2 = ComposableLambdaKt.composableLambdaInstance(-1938885306, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.ComposableSingletons$BrowseAllHelpTopicsComponentKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
            } else {
                BrowseAllHelpTopicsComponentKt.BrowseAllHelpTopicsComponent(null, composer, 0, 1);
            }
        }
    });

    /* renamed from: lambda-3, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f253lambda3 = ComposableLambdaKt.composableLambdaInstance(612498774, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.ComposableSingletons$BrowseAllHelpTopicsComponentKt$lambda-3$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
            } else {
                BrowseAllHelpTopicsComponentKt.BrowseAllHelpTopicsAsItem(null, composer, 0, 1);
            }
        }
    });

    /* renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m12447getLambda1$intercom_sdk_base_release() {
        return f251lambda1;
    }

    /* renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12448getLambda2$intercom_sdk_base_release() {
        return f252lambda2;
    }

    /* renamed from: getLambda-3$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12449getLambda3$intercom_sdk_base_release() {
        return f253lambda3;
    }
}
