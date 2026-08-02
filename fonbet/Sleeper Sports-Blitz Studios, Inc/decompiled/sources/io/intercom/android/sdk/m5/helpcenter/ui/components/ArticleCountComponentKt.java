package io.intercom.android.sdk.m5.helpcenter.ui.components;

import android.content.Context;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.Phrase;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: ArticleCountComponent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u001a\u001f\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006\u001a\r\u0010\u0007\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\b\u001a\r\u0010\t\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\b¨\u0006\n"}, d2 = {"ArticleCountComponent", "", "modifier", "Landroidx/compose/ui/Modifier;", "count", "", "(Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;II)V", "ArticleCountComponentPreview", "(Landroidx/compose/runtime/Composer;I)V", "SingleArticleCountComponentPreview", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ArticleCountComponentKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ArticleCountComponent$lambda$0(Modifier modifier, int i, int i2, int i3, Composer composer, int i4) {
        ArticleCountComponent(modifier, i, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ArticleCountComponentPreview$lambda$1(int i, Composer composer, int i2) {
        ArticleCountComponentPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SingleArticleCountComponentPreview$lambda$2(int i, Composer composer, int i2) {
        SingleArticleCountComponentPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void ArticleCountComponent(Modifier modifier, final int i, Composer composer, final int i2, final int i3) {
        final Modifier modifier2;
        int i4;
        CharSequence format;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-731744304);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 14) == 0) {
            modifier2 = modifier;
            i4 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            i4 |= startRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i4 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (i5 != 0) {
                modifier2 = Modifier.INSTANCE;
            }
            if (i == 1) {
                startRestartGroup.startReplaceGroup(1038713318);
                ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object consume = startRestartGroup.consume(localContext);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                format = Phrase.from((Context) consume, R.string.intercom_single_article).format();
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(1038811929);
                ProvidableCompositionLocal<Context> localContext2 = AndroidCompositionLocals_androidKt.getLocalContext();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object consume2 = startRestartGroup.consume(localContext2);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                format = Phrase.from((Context) consume2, R.string.intercom_multiple_articles).put("total_articles", i).format();
                startRestartGroup.endReplaceGroup();
            }
            composer2 = startRestartGroup;
            TextKt.m3901TextNvy7gAk(format.toString(), modifier2, ColorKt.Color(4285887861L), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(startRestartGroup, IntercomTheme.$stable).getType04Point5(), composer2, ((i4 << 3) & 112) | 384, 0, 131064);
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.ArticleCountComponentKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ArticleCountComponent$lambda$0;
                    ArticleCountComponent$lambda$0 = ArticleCountComponentKt.ArticleCountComponent$lambda$0(Modifier.this, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    return ArticleCountComponent$lambda$0;
                }
            });
        }
    }

    @IntercomPreviews
    public static final void ArticleCountComponentPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1155458330);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ArticleCountComponentKt.INSTANCE.m12441getLambda1$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.ArticleCountComponentKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ArticleCountComponentPreview$lambda$1;
                    ArticleCountComponentPreview$lambda$1 = ArticleCountComponentKt.ArticleCountComponentPreview$lambda$1(i, (Composer) obj, ((Integer) obj2).intValue());
                    return ArticleCountComponentPreview$lambda$1;
                }
            });
        }
    }

    @IntercomPreviews
    public static final void SingleArticleCountComponentPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1795936462);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ArticleCountComponentKt.INSTANCE.m12442getLambda2$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.ArticleCountComponentKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit SingleArticleCountComponentPreview$lambda$2;
                    SingleArticleCountComponentPreview$lambda$2 = ArticleCountComponentKt.SingleArticleCountComponentPreview$lambda$2(i, (Composer) obj, ((Integer) obj2).intValue());
                    return SingleArticleCountComponentPreview$lambda$2;
                }
            });
        }
    }
}
