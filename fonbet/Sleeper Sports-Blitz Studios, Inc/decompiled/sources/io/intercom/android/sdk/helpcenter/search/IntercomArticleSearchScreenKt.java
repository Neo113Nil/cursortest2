package io.intercom.android.sdk.helpcenter.search;

import android.content.Context;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: IntercomArticleSearchScreen.kt */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a7\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0001¢\u0006\u0002\u0010\t\u001a\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\bH\u0002¨\u0006\u000f"}, d2 = {"IntercomArticleSearchScreen", "", "state", "Lio/intercom/android/sdk/helpcenter/search/ArticleSearchState;", "onClearSearchClick", "Lkotlin/Function0;", "onArticleClicked", "Lkotlin/Function1;", "", "(Lio/intercom/android/sdk/helpcenter/search/ArticleSearchState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "getNoResultsMessage", "Landroidx/compose/ui/text/AnnotatedString;", "context", "Landroid/content/Context;", "searchTerm", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class IntercomArticleSearchScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IntercomArticleSearchScreen$lambda$0(ArticleSearchState state, Function0 onClearSearchClick, Function1 onArticleClicked, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(state, "$state");
        Intrinsics.checkNotNullParameter(onClearSearchClick, "$onClearSearchClick");
        Intrinsics.checkNotNullParameter(onArticleClicked, "$onArticleClicked");
        IntercomArticleSearchScreen(state, onClearSearchClick, onArticleClicked, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void IntercomArticleSearchScreen(final ArticleSearchState state, final Function0<Unit> onClearSearchClick, final Function1<? super String, Unit> onArticleClicked, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onClearSearchClick, "onClearSearchClick");
        Intrinsics.checkNotNullParameter(onArticleClicked, "onArticleClicked");
        Composer startRestartGroup = composer.startRestartGroup(-1211464960);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changedInstance(onClearSearchClick) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changedInstance(onArticleClicked) ? 256 : 128;
        }
        if ((i2 & 731) != 146 || !startRestartGroup.getSkipping()) {
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            SurfaceKt.m3729SurfaceT9BRK9s(null, null, IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13094getBackground0d7_KjU(), IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13116getPrimaryText0d7_KjU(), 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(1420291739, true, new IntercomArticleSearchScreenKt$IntercomArticleSearchScreen$1(state, onArticleClicked, onClearSearchClick, (Context) consume), startRestartGroup, 54), startRestartGroup, 12582912, 115);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.helpcenter.search.IntercomArticleSearchScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit IntercomArticleSearchScreen$lambda$0;
                    IntercomArticleSearchScreen$lambda$0 = IntercomArticleSearchScreenKt.IntercomArticleSearchScreen$lambda$0(ArticleSearchState.this, onClearSearchClick, onArticleClicked, i, (Composer) obj, ((Integer) obj2).intValue());
                    return IntercomArticleSearchScreen$lambda$0;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnnotatedString getNoResultsMessage(Context context, String str) {
        String str2 = "'" + str + '\'';
        String string = context.getString(R.string.intercom_no_results_for_searchterm);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String replace$default = StringsKt.replace$default(string, "{searchTerm}", str2, false, 4, (Object) null);
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        int indexOf$default = StringsKt.indexOf$default((CharSequence) replace$default, str2, 0, false, 6, (Object) null);
        String substring = replace$default.substring(0, indexOf$default);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        builder.append(substring);
        int pushStyle = builder.pushStyle(new SpanStyle(0L, 0L, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65531, (DefaultConstructorMarker) null));
        try {
            String substring2 = replace$default.substring(indexOf$default, str2.length() + indexOf$default);
            Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
            builder.append(substring2);
            Unit unit = Unit.INSTANCE;
            builder.pop(pushStyle);
            String substring3 = replace$default.substring(indexOf$default + str2.length());
            Intrinsics.checkNotNullExpressionValue(substring3, "substring(...)");
            builder.append(substring3);
            return builder.toAnnotatedString();
        } catch (Throwable th) {
            builder.pop(pushStyle);
            throw th;
        }
    }
}
