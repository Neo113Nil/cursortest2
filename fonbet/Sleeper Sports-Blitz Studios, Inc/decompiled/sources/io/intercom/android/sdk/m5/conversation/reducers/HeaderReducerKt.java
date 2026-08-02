package io.intercom.android.sdk.m5.conversation.reducers;

import androidx.compose.ui.graphics.Color;
import com.socure.docv.capturesdk.common.analytics.AnalyticsConstantsKt;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.conversation.states.HeaderMenuItem;
import io.intercom.android.sdk.m5.conversation.states.LaunchMode;
import io.intercom.android.sdk.m5.conversation.states.PushNotificationsBannerState;
import io.intercom.android.sdk.m5.conversation.states.TicketProgressRowState;
import io.intercom.android.sdk.m5.conversation.states.TopAppBarUiState;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.AvatarDetails;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.Header;
import io.intercom.android.sdk.models.Space;
import io.intercom.android.sdk.ui.common.StringProvider;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import io.intercom.android.sdk.utilities.extensions.AppConfigExtensionsKt;
import io.intercom.android.sdk.utilities.extensions.ConversationExtensionsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HeaderReducer.kt */
@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001aV\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0000\u001a6\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\fH\u0000\u001a\u0010\u0010\u0015\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002\u001a\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fH\u0002¨\u0006\u0019"}, d2 = {"reduceTopAppBarUiState", "Lio/intercom/android/sdk/m5/conversation/states/TopAppBarUiState;", "isNewConversation", "", "hasPendingMessages", "conversation", "Lio/intercom/android/sdk/models/Conversation;", "openResponseHeader", "Lio/intercom/android/sdk/models/Header;", AnalyticsConstantsKt.KEY_CONFIG, "Lio/intercom/android/sdk/identity/AppConfig;", "unreadConversationsCount", "", "unreadTicketsCount", "launchMode", "Lio/intercom/android/sdk/m5/conversation/states/LaunchMode;", "pushNotificationsBannerState", "Lio/intercom/android/sdk/m5/conversation/states/PushNotificationsBannerState;", "reduceHeaderMenuItems", "", "Lio/intercom/android/sdk/m5/conversation/states/HeaderMenuItem;", "getNavIcon", "getCappedUnreadCountString", "", "unreadCount", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class HeaderReducerKt {

    /* compiled from: HeaderReducer.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Header.Collapsed.HeaderIconType.values().length];
            try {
                iArr[Header.Collapsed.HeaderIconType.CLOCK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Header.Collapsed.HeaderIconType.AI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final TopAppBarUiState reduceTopAppBarUiState(boolean z, boolean z2, Conversation conversation, Header header, AppConfig config, int i, int i2, LaunchMode launchMode, PushNotificationsBannerState pushNotificationsBannerState) {
        Header header2;
        TopAppBarUiState m12149copyN4y9b34;
        Header header3;
        Integer num;
        TicketProgressRowState ticketProgressRowState;
        Integer num2;
        ArrayList emptyList;
        List<Avatar.Builder> avatars;
        int i3;
        TopAppBarUiState m12149copyN4y9b342;
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(launchMode, "launchMode");
        List<HeaderMenuItem> reduceHeaderMenuItems = reduceHeaderMenuItems(config, i, z, launchMode, i2);
        if (z && header == null) {
            m12149copyN4y9b342 = r1.m12149copyN4y9b34((r32 & 1) != 0 ? r1.title : null, (r32 & 2) != 0 ? r1.navIcon : Integer.valueOf(getNavIcon(launchMode)), (r32 & 4) != 0 ? r1.subTitle : null, (r32 & 8) != 0 ? r1.subTitleLeadingIcon : null, (r32 & 16) != 0 ? r1.avatars : null, (r32 & 32) != 0 ? r1.displayActiveIndicator : false, (r32 & 64) != 0 ? r1.ticketStatusState : null, (r32 & 128) != 0 ? r1.headerMenuItems : reduceHeaderMenuItems, (r32 & 256) != 0 ? r1.backgroundColor : null, (r32 & 512) != 0 ? r1.backgroundColorDark : null, (r32 & 1024) != 0 ? r1.contentColor : null, (r32 & 2048) != 0 ? r1.contentColorDark : null, (r32 & 4096) != 0 ? r1.subTitleColor : null, (r32 & 8192) != 0 ? r1.subTitleColorDark : null, (r32 & 16384) != 0 ? TopAppBarUiState.INSTANCE.getDefault().pushNotificationsBannerState : pushNotificationsBannerState);
            return m12149copyN4y9b342;
        }
        if (conversation == null || (header2 = conversation.getHeader()) == null) {
            if (header == null) {
                m12149copyN4y9b34 = r1.m12149copyN4y9b34((r32 & 1) != 0 ? r1.title : null, (r32 & 2) != 0 ? r1.navIcon : Integer.valueOf(getNavIcon(launchMode)), (r32 & 4) != 0 ? r1.subTitle : null, (r32 & 8) != 0 ? r1.subTitleLeadingIcon : null, (r32 & 16) != 0 ? r1.avatars : null, (r32 & 32) != 0 ? r1.displayActiveIndicator : false, (r32 & 64) != 0 ? r1.ticketStatusState : null, (r32 & 128) != 0 ? r1.headerMenuItems : reduceHeaderMenuItems, (r32 & 256) != 0 ? r1.backgroundColor : null, (r32 & 512) != 0 ? r1.backgroundColorDark : null, (r32 & 1024) != 0 ? r1.contentColor : null, (r32 & 2048) != 0 ? r1.contentColorDark : null, (r32 & 4096) != 0 ? r1.subTitleColor : null, (r32 & 8192) != 0 ? r1.subTitleColorDark : null, (r32 & 16384) != 0 ? TopAppBarUiState.INSTANCE.getDefault().pushNotificationsBannerState : pushNotificationsBannerState);
                return m12149copyN4y9b34;
            }
            header2 = header;
        }
        long composeColor$default = ColorExtensionsKt.toComposeColor$default(header2.getBackgroundColor(), 0.0f, 1, null);
        long composeColor$default2 = ColorExtensionsKt.toComposeColor$default(header2.getBackgroundColorDark(), 0.0f, 1, null);
        long composeColor$default3 = ColorExtensionsKt.toComposeColor$default(header2.getForegroundPrimaryColor(), 0.0f, 1, null);
        long composeColor$default4 = ColorExtensionsKt.toComposeColor$default(header2.getForegroundPrimaryColorDark(), 0.0f, 1, null);
        long composeColor$default5 = ColorExtensionsKt.toComposeColor$default(header2.getForegroundSecondaryColor(), 0.0f, 1, null);
        long composeColor$default6 = ColorExtensionsKt.toComposeColor$default(header2.getForegroundSecondaryColorDark(), 0.0f, 1, null);
        TicketProgressRowState ticketProgressRowState2 = ((conversation != null ? conversation.getTicket() : null) == null || (!ConversationExtensionsKt.hasNonTicketParts(conversation) && !z2)) ? null : new TicketProgressRowState(conversation.getTicket().getTitle(), conversation.getTicket().getCurrentStatus().getTitle());
        Header.Collapsed collapsed = header2.getCollapsed();
        StringProvider.ActualString actualString = new StringProvider.ActualString(collapsed.getTitle());
        Integer valueOf = Integer.valueOf(getNavIcon(launchMode));
        String subtitle = collapsed.getSubtitle();
        StringProvider.ActualString actualString2 = subtitle != null ? new StringProvider.ActualString(subtitle) : null;
        Header.Collapsed.HeaderIconType icon = collapsed.getIcon();
        if (icon != null) {
            int i4 = WhenMappings.$EnumSwitchMapping$0[icon.ordinal()];
            header3 = header2;
            if (i4 == 1) {
                i3 = R.drawable.intercom_clock;
            } else {
                if (i4 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i3 = R.drawable.intercom_ic_ai;
            }
            num = Integer.valueOf(i3);
        } else {
            header3 = header2;
            num = null;
        }
        AvatarDetails avatarDetails = collapsed.getAvatarDetails();
        if (avatarDetails == null || (avatars = avatarDetails.getAvatars()) == null) {
            ticketProgressRowState = ticketProgressRowState2;
            num2 = valueOf;
            emptyList = CollectionsKt.emptyList();
        } else {
            List<Avatar.Builder> list = avatars;
            ticketProgressRowState = ticketProgressRowState2;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Avatar build = ((Avatar.Builder) it.next()).build();
                Intrinsics.checkNotNullExpressionValue(build, "build(...)");
                arrayList.add(new AvatarWrapper(build, header3.getUseBotHeader()));
                it = it;
                valueOf = valueOf;
            }
            num2 = valueOf;
            emptyList = arrayList;
        }
        return new TopAppBarUiState(actualString, num2, actualString2, num, emptyList, header3.getDisplayActiveIndicator(), ticketProgressRowState, reduceHeaderMenuItems, Color.m6029boximpl(composeColor$default), Color.m6029boximpl(composeColor$default2), Color.m6029boximpl(composeColor$default3), Color.m6029boximpl(composeColor$default4), Color.m6029boximpl(composeColor$default5), Color.m6029boximpl(composeColor$default6), pushNotificationsBannerState, null);
    }

    public static final List<HeaderMenuItem> reduceHeaderMenuItems(AppConfig config, int i, boolean z, LaunchMode launchMode, int i2) {
        HeaderMenuItem.TotalCountIndicator.NoIndicator noIndicator;
        StringProvider.StringRes stringRes;
        StringProvider.StringRes stringRes2;
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(launchMode, "launchMode");
        List createListBuilder = CollectionsKt.createListBuilder();
        if (launchMode == LaunchMode.PROGRAMMATIC) {
            String cappedUnreadCountString = getCappedUnreadCountString(i);
            if (i == 0 && i2 > 0) {
                noIndicator = HeaderMenuItem.TotalCountIndicator.UnreadDotIndicator.INSTANCE;
            } else if (i > 0) {
                noIndicator = new HeaderMenuItem.TotalCountIndicator.UnreadCountIndicator(cappedUnreadCountString);
            } else {
                noIndicator = HeaderMenuItem.TotalCountIndicator.NoIndicator.INSTANCE;
            }
            HeaderMenuItem.TotalCountIndicator totalCountIndicator = noIndicator;
            String spaceLabelIfExists = config.getSpaceLabelIfExists(Space.Type.MESSAGES);
            if (spaceLabelIfExists != null) {
                stringRes = new StringProvider.ActualString(spaceLabelIfExists);
            } else {
                stringRes = new StringProvider.StringRes(R.string.intercom_messages_space_title, null, 2, null);
            }
            createListBuilder.add(new HeaderMenuItem.Messages(totalCountIndicator, cappedUnreadCountString, false, stringRes, 4, null));
            if (AppConfigExtensionsKt.canStartNewConversation(config)) {
                createListBuilder.add(new HeaderMenuItem.StartNewConversation(!z, new StringProvider.StringRes(R.string.intercom_new_conversation, null, 2, null)));
            }
            if (config.isSpaceEnabled(Space.Type.HELP)) {
                createListBuilder.add(new HeaderMenuItem.Help(true, new StringProvider.StringRes(R.string.intercom_help_space_title, null, 2, null)));
            }
            if (config.isSpaceEnabled(Space.Type.TICKETS)) {
                boolean z2 = i2 > 0;
                String spaceLabelIfExists2 = config.getSpaceLabelIfExists(Space.Type.TICKETS);
                if (spaceLabelIfExists2 != null) {
                    stringRes2 = new StringProvider.ActualString(spaceLabelIfExists2);
                } else {
                    stringRes2 = new StringProvider.StringRes(R.string.intercom_tickets_space_title, null, 2, null);
                }
                createListBuilder.add(new HeaderMenuItem.Tickets(z2, true, stringRes2));
            }
        }
        return CollectionsKt.build(createListBuilder);
    }

    private static final int getNavIcon(LaunchMode launchMode) {
        if (launchMode == LaunchMode.PROGRAMMATIC) {
            return io.intercom.android.sdk.ui.R.drawable.intercom_ic_close;
        }
        return io.intercom.android.sdk.ui.R.drawable.intercom_ic_back;
    }

    private static final String getCappedUnreadCountString(int i) {
        if (i > 9) {
            return "9+";
        }
        if (i == 0) {
            return "";
        }
        return String.valueOf(i);
    }
}
