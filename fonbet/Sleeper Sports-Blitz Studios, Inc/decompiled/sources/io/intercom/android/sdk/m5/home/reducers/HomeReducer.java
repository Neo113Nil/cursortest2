package io.intercom.android.sdk.m5.home.reducers;

import com.socure.docv.capturesdk.common.analytics.AnalyticsConstantsKt;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.m5.home.data.HomeCardType;
import io.intercom.android.sdk.m5.home.data.HomeCards;
import io.intercom.android.sdk.m5.home.data.HomeV2Response;
import io.intercom.android.sdk.m5.home.states.HomeClientState;
import io.intercom.android.sdk.m5.home.states.HomeUiState;
import io.intercom.android.sdk.models.ActiveBot;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import io.intercom.android.sdk.models.Participant;
import io.intercom.android.sdk.models.PoweredBy;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HomeReducer.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B!\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003H\u0000¢\u0006\u0002\b\u000fJ&\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lio/intercom/android/sdk/m5/home/reducers/HomeReducer;", "", AnalyticsConstantsKt.KEY_CONFIG, "Lkotlin/Function0;", "Lio/intercom/android/sdk/identity/AppConfig;", "intercomDataLayer", "Lio/intercom/android/sdk/m5/data/IntercomDataLayer;", "<init>", "(Lkotlin/jvm/functions/Function0;Lio/intercom/android/sdk/m5/data/IntercomDataLayer;)V", "computeUiState", "Lio/intercom/android/sdk/m5/home/states/HomeUiState;", "homeClientState", "Lio/intercom/android/sdk/m5/home/states/HomeClientState;", "onRetryClicked", "", "computeUiState$intercom_sdk_base_release", "reduceHomeCards", "", "Lio/intercom/android/sdk/m5/home/data/HomeCards;", "homeCards", "newConversationCta", "Lio/intercom/android/sdk/models/OpenMessengerResponse$NewConversationData;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class HomeReducer {
    public static final int $stable = 8;
    private final Function0<AppConfig> config;
    private final IntercomDataLayer intercomDataLayer;

    /* JADX WARN: Multi-variable type inference failed */
    public HomeReducer() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public HomeReducer(Function0<AppConfig> config, IntercomDataLayer intercomDataLayer) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(intercomDataLayer, "intercomDataLayer");
        this.config = config;
        this.intercomDataLayer = intercomDataLayer;
    }

    public /* synthetic */ HomeReducer(Function0 function0, IntercomDataLayer intercomDataLayer, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Function0() { // from class: io.intercom.android.sdk.m5.home.reducers.HomeReducer$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AppConfig _init_$lambda$0;
                _init_$lambda$0 = HomeReducer._init_$lambda$0();
                return _init_$lambda$0;
            }
        } : function0, (i & 2) != 0 ? Injector.get().getDataLayer() : intercomDataLayer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AppConfig _init_$lambda$0() {
        return Injector.get().getAppConfigProvider().get();
    }

    public final HomeUiState computeUiState$intercom_sdk_base_release(HomeClientState homeClientState, Function0<Unit> onRetryClicked) {
        Participant.Builder participant;
        Participant build;
        Intrinsics.checkNotNullParameter(homeClientState, "homeClientState");
        Intrinsics.checkNotNullParameter(onRetryClicked, "onRetryClicked");
        OpenMessengerResponse openMessengerResponseData = homeClientState.getOpenMessengerResponseData();
        AvatarWrapper avatarWrapper = null;
        OpenMessengerResponse.NewConversationData newConversationData = openMessengerResponseData != null ? openMessengerResponseData.getNewConversationData() : null;
        NetworkResponse<HomeV2Response> homeResponse = homeClientState.getHomeResponse();
        if ((homeResponse instanceof NetworkResponse.ClientError) || (homeResponse instanceof NetworkResponse.ServerError)) {
            return new HomeUiState.Error(null, new ErrorState.WithoutCTA(0, 0, null, 7, null), HomeHeaderStateReducerKt.computeErrorHeader(this.config.invoke().getConfigModules()));
        }
        if (homeResponse instanceof NetworkResponse.NetworkError) {
            return new HomeUiState.Error(null, new ErrorState.WithCTA(0, 0, null, 0, onRetryClicked, 15, null), HomeHeaderStateReducerKt.computeErrorHeader(this.config.invoke().getConfigModules()));
        }
        if (!(homeResponse instanceof NetworkResponse.Success)) {
            if (homeResponse != null) {
                throw new NoWhenBranchMatchedException();
            }
            return new HomeUiState.Loading(null);
        }
        OpenMessengerResponse openMessengerResponseData2 = homeClientState.getOpenMessengerResponseData();
        PoweredBy poweredBy = openMessengerResponseData2 != null ? openMessengerResponseData2.getPoweredBy() : null;
        List<HomeCards> reduceHomeCards = reduceHomeCards(((HomeV2Response) ((NetworkResponse.Success) homeResponse).getBody()).getCards(), newConversationData);
        ArrayList arrayList = new ArrayList();
        for (Object obj : reduceHomeCards) {
            HomeCards homeCards = (HomeCards) obj;
            if (homeCards instanceof HomeCards.HomeNewConversationData) {
                HomeCards.HomeNewConversationData homeNewConversationData = (HomeCards.HomeNewConversationData) homeCards;
                if (homeNewConversationData.getPreventMultipleInboundConversationsEnabled() && !homeNewConversationData.getOpenInboundConversationsIds().isEmpty()) {
                }
            }
            arrayList.add(obj);
        }
        ArrayList arrayList2 = arrayList;
        List<Participant> builtActiveAdmins = this.intercomDataLayer.getTeamPresence().getValue().getBuiltActiveAdmins();
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(builtActiveAdmins, 10));
        for (Participant participant2 : builtActiveAdmins) {
            Avatar avatar = participant2.getAvatar();
            Intrinsics.checkNotNullExpressionValue(avatar, "getAvatar(...)");
            Boolean isBot = participant2.isBot();
            Intrinsics.checkNotNullExpressionValue(isBot, "isBot(...)");
            arrayList3.add(new AvatarWrapper(avatar, isBot.booleanValue()));
        }
        ArrayList arrayList4 = arrayList3;
        ActiveBot activeBot = this.intercomDataLayer.getTeamPresence().getValue().getActiveBot();
        if (activeBot != null && (participant = activeBot.getParticipant()) != null && (build = participant.build()) != null) {
            Avatar avatar2 = build.getAvatar();
            Intrinsics.checkNotNullExpressionValue(avatar2, "getAvatar(...)");
            Boolean isBot2 = build.isBot();
            Intrinsics.checkNotNullExpressionValue(isBot2, "isBot(...)");
            avatarWrapper = new AvatarWrapper(avatar2, isBot2.booleanValue());
        }
        return new HomeUiState.Content(poweredBy, arrayList2, arrayList4, avatarWrapper, this.config.invoke().isAccessToTeammateEnabled(), HomeHeaderStateReducerKt.computeContentHeader(this.config.invoke().getConfigModules(), this.intercomDataLayer.getTeamPresence().getValue(), homeClientState.isHeaderImageLoaded()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final List<HomeCards> reduceHomeCards(List<? extends HomeCards> homeCards, OpenMessengerResponse.NewConversationData newConversationCta) {
        if (newConversationCta == null) {
            return homeCards;
        }
        List<? extends HomeCards> list = homeCards;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (HomeCards.HomeNewConversationData homeNewConversationData : list) {
            if (homeNewConversationData instanceof HomeCards.HomeNewConversationData) {
                HomeCards.HomeNewConversationData homeNewConversationData2 = (HomeCards.HomeNewConversationData) homeNewConversationData;
                homeNewConversationData = new HomeCards.HomeNewConversationData("", HomeCardType.NEW_CONVERSATION, homeNewConversationData2.getAction(), homeNewConversationData2.getPreventMultipleInboundConversationsEnabled(), homeNewConversationData2.getOpenInboundConversationsIds(), homeNewConversationData2.getShowFinAvatar(), homeNewConversationData2.getShowTeammateExpectations(), newConversationCta.getHomeCard());
            }
            arrayList.add(homeNewConversationData);
        }
        return arrayList;
    }
}
