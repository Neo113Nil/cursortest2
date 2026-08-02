package io.intercom.android.sdk.helpcenter.component;

import io.intercom.android.sdk.R;
import io.intercom.android.sdk.helpcenter.articles.ArticleMetadata;
import io.intercom.android.sdk.helpcenter.articles.ArticleViewState;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.ActiveBot;
import io.intercom.android.sdk.models.TeamPresence;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TeammateHelp.kt */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a:\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0000¨\u0006\r"}, d2 = {"computeViewState", "Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$TeamPresenceState;", "articleMetadata", "Lio/intercom/android/sdk/helpcenter/articles/ArticleMetadata;", "currentState", "teamPresence", "Lio/intercom/android/sdk/models/TeamPresence;", "appConfig", "Lio/intercom/android/sdk/identity/AppConfig;", "metricPlace", "", "isFromSearchBrowse", "", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TeammateHelpKt {
    public static final ArticleViewState.TeamPresenceState computeViewState(ArticleMetadata articleMetadata, ArticleViewState.TeamPresenceState currentState, TeamPresence teamPresence, AppConfig appConfig, String metricPlace, boolean z) {
        String str;
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        Intrinsics.checkNotNullParameter(teamPresence, "teamPresence");
        Intrinsics.checkNotNullParameter(appConfig, "appConfig");
        Intrinsics.checkNotNullParameter(metricPlace, "metricPlace");
        int messageButtonText = currentState.getMessageButtonText();
        int messageButtonIcon = currentState.getMessageButtonIcon();
        Integer subtitleText = currentState.getSubtitleText();
        ActiveBot activeBot = teamPresence.getActiveBot();
        if (activeBot == null || !activeBot.getUseBotUx()) {
            str = MetricTracker.Context.STYLE_HUMAN;
        } else {
            messageButtonText = R.string.intercom_ask_a_question;
            messageButtonIcon = R.drawable.intercom_conversation_card_question;
            subtitleText = appConfig.isAccessToTeammateEnabled() ? Integer.valueOf(R.string.intercom_the_team_can_help_if_needed) : null;
            str = MetricTracker.Context.STYLE_BOT;
        }
        return ArticleViewState.TeamPresenceState.copy$default(currentState, articleMetadata, null, subtitleText, messageButtonText, messageButtonIcon, appConfig.getPrimaryColor(), metricPlace, str, z, null, 514, null);
    }
}
