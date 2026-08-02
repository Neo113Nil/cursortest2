package io.intercom.android.sdk.m5.components;

import android.content.Context;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.home.data.HomeCards;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.component.IntercomCardKt;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SearchBrowseCard.kt */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a;\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\u0010\f\u001a\r\u0010\r\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000e\u001a\r\u0010\u000f\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000e\u001a\r\u0010\u0010\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000e\u001a\r\u0010\u0011\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000e¨\u0006\u0012"}, d2 = {"SearchBrowseCard", "", "helpCenterData", "Lio/intercom/android/sdk/m5/home/data/HomeCards$HomeHelpCenterData;", "isSearchFirstEnabled", "", "avatars", "", "Lio/intercom/android/sdk/m5/components/avatar/AvatarWrapper;", "accessToTeammateEnabled", "metricTracker", "Lio/intercom/android/sdk/metrics/MetricTracker;", "(Lio/intercom/android/sdk/m5/home/data/HomeCards$HomeHelpCenterData;ZLjava/util/List;ZLio/intercom/android/sdk/metrics/MetricTracker;Landroidx/compose/runtime/Composer;I)V", "PreviewSearchBrowse", "(Landroidx/compose/runtime/Composer;I)V", "PreviewSearchBrowseNoSuggestions", "PreviewSearchBrowseNoSearchFirst", "PreviewSearchBrowseNoSuggestionsNoSearchFirst", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class SearchBrowseCardKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewSearchBrowse$lambda$1(int i, Composer composer, int i2) {
        PreviewSearchBrowse(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewSearchBrowseNoSearchFirst$lambda$3(int i, Composer composer, int i2) {
        PreviewSearchBrowseNoSearchFirst(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewSearchBrowseNoSuggestions$lambda$2(int i, Composer composer, int i2) {
        PreviewSearchBrowseNoSuggestions(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewSearchBrowseNoSuggestionsNoSearchFirst$lambda$4(int i, Composer composer, int i2) {
        PreviewSearchBrowseNoSuggestionsNoSearchFirst(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SearchBrowseCard$lambda$0(HomeCards.HomeHelpCenterData helpCenterData, boolean z, List avatars, boolean z2, MetricTracker metricTracker, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(helpCenterData, "$helpCenterData");
        Intrinsics.checkNotNullParameter(avatars, "$avatars");
        Intrinsics.checkNotNullParameter(metricTracker, "$metricTracker");
        SearchBrowseCard(helpCenterData, z, avatars, z2, metricTracker, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void SearchBrowseCard(final HomeCards.HomeHelpCenterData helpCenterData, final boolean z, final List<AvatarWrapper> avatars, final boolean z2, final MetricTracker metricTracker, Composer composer, final int i) {
        Intrinsics.checkNotNullParameter(helpCenterData, "helpCenterData");
        Intrinsics.checkNotNullParameter(avatars, "avatars");
        Intrinsics.checkNotNullParameter(metricTracker, "metricTracker");
        Composer startRestartGroup = composer.startRestartGroup(382156573);
        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = startRestartGroup.consume(localContext);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        IntercomCardKt.IntercomCard(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, ComposableLambdaKt.rememberComposableLambda(-1020132823, true, new SearchBrowseCardKt$SearchBrowseCard$1(z, helpCenterData, z2, avatars, metricTracker, (Context) consume), startRestartGroup, 54), startRestartGroup, 390, 2);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.components.SearchBrowseCardKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit SearchBrowseCard$lambda$0;
                    SearchBrowseCard$lambda$0 = SearchBrowseCardKt.SearchBrowseCard$lambda$0(HomeCards.HomeHelpCenterData.this, z, avatars, z2, metricTracker, i, (Composer) obj, ((Integer) obj2).intValue());
                    return SearchBrowseCard$lambda$0;
                }
            });
        }
    }

    @IntercomPreviews
    private static final void PreviewSearchBrowse(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1546858090);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$SearchBrowseCardKt.INSTANCE.m12083getLambda1$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.components.SearchBrowseCardKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit PreviewSearchBrowse$lambda$1;
                    PreviewSearchBrowse$lambda$1 = SearchBrowseCardKt.PreviewSearchBrowse$lambda$1(i, (Composer) obj, ((Integer) obj2).intValue());
                    return PreviewSearchBrowse$lambda$1;
                }
            });
        }
    }

    @IntercomPreviews
    private static final void PreviewSearchBrowseNoSuggestions(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1745562356);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$SearchBrowseCardKt.INSTANCE.m12084getLambda2$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.components.SearchBrowseCardKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit PreviewSearchBrowseNoSuggestions$lambda$2;
                    PreviewSearchBrowseNoSuggestions$lambda$2 = SearchBrowseCardKt.PreviewSearchBrowseNoSuggestions$lambda$2(i, (Composer) obj, ((Integer) obj2).intValue());
                    return PreviewSearchBrowseNoSuggestions$lambda$2;
                }
            });
        }
    }

    @IntercomPreviews
    private static final void PreviewSearchBrowseNoSearchFirst(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-678171621);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$SearchBrowseCardKt.INSTANCE.m12085getLambda3$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.components.SearchBrowseCardKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit PreviewSearchBrowseNoSearchFirst$lambda$3;
                    PreviewSearchBrowseNoSearchFirst$lambda$3 = SearchBrowseCardKt.PreviewSearchBrowseNoSearchFirst$lambda$3(i, (Composer) obj, ((Integer) obj2).intValue());
                    return PreviewSearchBrowseNoSearchFirst$lambda$3;
                }
            });
        }
    }

    @IntercomPreviews
    private static final void PreviewSearchBrowseNoSuggestionsNoSearchFirst(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(354688977);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$SearchBrowseCardKt.INSTANCE.m12086getLambda4$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.components.SearchBrowseCardKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit PreviewSearchBrowseNoSuggestionsNoSearchFirst$lambda$4;
                    PreviewSearchBrowseNoSuggestionsNoSearchFirst$lambda$4 = SearchBrowseCardKt.PreviewSearchBrowseNoSuggestionsNoSearchFirst$lambda$4(i, (Composer) obj, ((Integer) obj2).intValue());
                    return PreviewSearchBrowseNoSuggestionsNoSearchFirst$lambda$4;
                }
            });
        }
    }
}
