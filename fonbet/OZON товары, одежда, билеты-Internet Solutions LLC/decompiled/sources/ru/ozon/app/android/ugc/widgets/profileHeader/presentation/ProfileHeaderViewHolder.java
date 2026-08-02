package ru.ozon.app.android.ugc.widgets.profileHeader.presentation;

import CG.a;
import CG.b;
import Dc0.n;
import Sc.o;
import Vg.c;
import WZ.l;
import WZ.m;
import WZ.t;
import android.view.View;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.common.actionHandlers.subscribeAuthorHandlers.updateKeys.SubscribeAuthorUpdateKey;
import ru.ozon.app.android.common.actionHandlers.subscribeAuthorHandlers.updateKeys.UnsubscribeAuthorUpdateKey;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.composer.widgets.base.WidgetViewHolderKt;
import ru.ozon.app.android.storage.subscribeAuthor.SubscribeAuthorsIdStorage;
import ru.ozon.app.android.ugc.databinding.WidgetProfileHeaderBinding;
import ru.ozon.app.android.ugc.widgets.profileHeader.ProfileHeaderVisibilityKey;
import ru.ozon.app.android.ugc.widgets.profileHeader.core.ProfileHeaderViewMapper;
import ru.ozon.app.android.ugc.widgets.profileHeader.presentation.ProfileHeaderVO;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 E2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001EB;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\u0010\u000b\u001a\u00060\tj\u0002`\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0015\u001a\u00020\u0014*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0019\u001a\u00020\u0014*\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001b\u001a\u00020\u0014*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001b\u0010\u0016J\u001b\u0010\u001c\u001a\u00020\u0014*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001c\u0010\u0016J\u001b\u0010\u001f\u001a\u00020\u0014*\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001b\u0010\"\u001a\u00020\u0014*\u00020\u00122\u0006\u0010!\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\"\u0010 J\u001b\u0010$\u001a\u00020\u0014*\u00020\u00122\u0006\u0010#\u001a\u00020\u001dH\u0002¢\u0006\u0004\b$\u0010 J\u000f\u0010%\u001a\u00020\u0014H\u0002¢\u0006\u0004\b%\u0010&J\u0019\u0010)\u001a\u00020\u00142\b\u0010(\u001a\u0004\u0018\u00010'H\u0002¢\u0006\u0004\b)\u0010*J)\u0010/\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010,\u001a\u00020+2\b\u0010.\u001a\u0004\u0018\u00010-H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0014H\u0016¢\u0006\u0004\b1\u0010&J\u001f\u00104\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u00103\u001a\u000202H\u0014¢\u0006\u0004\b4\u00105J'\u00104\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u00103\u001a\u0002022\u0006\u00107\u001a\u000206H\u0014¢\u0006\u0004\b4\u00108J\u000f\u00109\u001a\u00020\u0014H\u0016¢\u0006\u0004\b9\u0010&J\u000f\u0010:\u001a\u00020\u0014H\u0016¢\u0006\u0004\b:\u0010&R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010;R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010<R\u0018\u0010\u000b\u001a\u00060\tj\u0002`\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010=R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010>R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010?R \u0010A\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00140@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010C\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010D¨\u0006F"}, d2 = {"Lru/ozon/app/android/ugc/widgets/profileHeader/presentation/ProfileHeaderViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/ugc/widgets/profileHeader/presentation/ProfileHeaderVO;", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "Landroid/view/View;", "containerView", "LWZ/l;", "tokenizedAnalytics", "LVg/c;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStore;", "customActionHandlersStore", "Lru/ozon/app/android/storage/subscribeAuthor/SubscribeAuthorsIdStorage;", "subscribeAuthorsIdStorage", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "inhibitor", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;Landroid/view/View;LWZ/l;LVg/c;Lru/ozon/app/android/storage/subscribeAuthor/SubscribeAuthorsIdStorage;Lru/ozon/app/android/composer/throttle/HandlersInhibitor;)V", "Lru/ozon/app/android/ugc/databinding/WidgetProfileHeaderBinding;", "item", "", "bindHeader", "(Lru/ozon/app/android/ugc/databinding/WidgetProfileHeaderBinding;Lru/ozon/app/android/ugc/widgets/profileHeader/presentation/ProfileHeaderVO;)V", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "avatar", "bindAvatar", "(Lru/ozon/app/android/ugc/databinding/WidgetProfileHeaderBinding;Lru/ozon/uni/atoms/data/icon/IconDTO;)V", "bindCountBlocks", "bindSubscribeButton", "Lru/ozon/app/android/ugc/widgets/profileHeader/presentation/ProfileHeaderVO$ProfileHeaderStatVO;", "leftStat", "bindLeftCount", "(Lru/ozon/app/android/ugc/databinding/WidgetProfileHeaderBinding;Lru/ozon/app/android/ugc/widgets/profileHeader/presentation/ProfileHeaderVO$ProfileHeaderStatVO;)V", "middleStat", "bindMiddleCount", "rightStat", "bindRightCount", "setCountClickListeners", "()V", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "invokeAction", "(Lru/ozon/uni/atoms/af/AtomAction;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/ugc/widgets/profileHeader/presentation/ProfileHeaderVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "onAttach", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/ugc/widgets/profileHeader/presentation/ProfileHeaderVO;Ll20/d;)V", "", "payload", "(Lru/ozon/app/android/ugc/widgets/profileHeader/presentation/ProfileHeaderVO;Ll20/d;Ljava/lang/Object;)V", "onViewOutOfVisibleBounds", "onViewInVisibleBounds", "Lru/ozon/app/android/composer/ComposerReferences;", "LWZ/l;", "LVg/c;", "Lru/ozon/app/android/storage/subscribeAuthor/SubscribeAuthorsIdStorage;", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "Lkotlin/Function1;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "binding", "Lru/ozon/app/android/ugc/databinding/WidgetProfileHeaderBinding;", "Companion", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ProfileHeaderViewHolder extends k<ProfileHeaderVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetProfileHeaderBinding binding;

    @NotNull
    private final ComposerReferences composerReferences;

    @NotNull
    private final c customActionHandlersStore;

    @NotNull
    private final HandlersInhibitor inhibitor;

    @NotNull
    private final SubscribeAuthorsIdStorage subscribeAuthorsIdStorage;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/app/android/ugc/widgets/profileHeader/presentation/ProfileHeaderViewHolder$Companion;", "", "<init>", "()V", "PARAM_AUTHOR_ID", "", "CLICK_THROTTLE_TIME", "", "AVATAR_UPLOADED", "AVATAR_IS_NOT_LOADED", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileHeaderViewHolder(@NotNull ComposerReferences composerReferences, @NotNull View containerView, @NotNull l tokenizedAnalytics, @NotNull c customActionHandlersStore, @NotNull SubscribeAuthorsIdStorage subscribeAuthorsIdStorage, @NotNull HandlersInhibitor inhibitor) {
        super(containerView);
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(customActionHandlersStore, "customActionHandlersStore");
        Intrinsics.checkNotNullParameter(subscribeAuthorsIdStorage, "subscribeAuthorsIdStorage");
        Intrinsics.checkNotNullParameter(inhibitor, "inhibitor");
        this.composerReferences = composerReferences;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.customActionHandlersStore = customActionHandlersStore;
        this.subscribeAuthorsIdStorage = subscribeAuthorsIdStorage;
        this.inhibitor = inhibitor;
        this.actionHandler = new ActionHandler.Builder(composerReferences, this).customActionHandlers(new ProfileHeaderViewHolder$actionHandler$1(this)).buildHandler();
        WidgetProfileHeaderBinding bind = WidgetProfileHeaderBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        bind.profileIcon.setOnClickListener(new n(this, 13));
        setCountClickListeners();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(ProfileHeaderViewHolder profileHeaderViewHolder, View view) {
        t avatarTokenizedEvent;
        ProfileHeaderVO boundData = profileHeaderViewHolder.getBoundData();
        profileHeaderViewHolder.invokeAction(boundData != null ? boundData.getAvatarAction() : null);
        ProfileHeaderVO boundData2 = profileHeaderViewHolder.getBoundData();
        if (boundData2 == null || (avatarTokenizedEvent = boundData2.getAvatarTokenizedEvent()) == null) {
            return;
        }
        m.a(profileHeaderViewHolder.tokenizedAnalytics, avatarTokenizedEvent, null);
    }

    private final void bindAvatar(WidgetProfileHeaderBinding widgetProfileHeaderBinding, IconDTO iconDTO) {
        IconView profileIcon = widgetProfileHeaderBinding.profileIcon;
        Intrinsics.checkNotNullExpressionValue(profileIcon, "profileIcon");
        IconHolderKt.bind$default(profileIcon, iconDTO, null, 2, null);
        widgetProfileHeaderBinding.profileIcon.setContentDescription(iconDTO.getBackgroundImage() != null ? "icon.backgroundImageView" : "backgroundImageView");
    }

    private final void bindCountBlocks(WidgetProfileHeaderBinding widgetProfileHeaderBinding, ProfileHeaderVO profileHeaderVO) {
        bindLeftCount(widgetProfileHeaderBinding, profileHeaderVO.getLeftCount());
        bindMiddleCount(widgetProfileHeaderBinding, profileHeaderVO.getMiddleCount());
        bindRightCount(widgetProfileHeaderBinding, profileHeaderVO.getRightCount());
    }

    private final void bindHeader(WidgetProfileHeaderBinding widgetProfileHeaderBinding, ProfileHeaderVO profileHeaderVO) {
        bindAvatar(widgetProfileHeaderBinding, profileHeaderVO.getAvatar());
        bindCountBlocks(widgetProfileHeaderBinding, profileHeaderVO);
        bindSubscribeButton(widgetProfileHeaderBinding, profileHeaderVO);
        IconButtonV3View shareBtn = widgetProfileHeaderBinding.shareBtn;
        Intrinsics.checkNotNullExpressionValue(shareBtn, "shareBtn");
        IconButtonV3HolderKt.bind(shareBtn, profileHeaderVO.getShareButton(), new ProfileHeaderViewHolder$bindHeader$1(this));
        IconButtonV3View settingsBtn = widgetProfileHeaderBinding.settingsBtn;
        Intrinsics.checkNotNullExpressionValue(settingsBtn, "settingsBtn");
        IconButtonV3HolderKt.bindOrGone(settingsBtn, profileHeaderVO.getSettingsButton(), this.actionHandler);
    }

    private final void bindLeftCount(WidgetProfileHeaderBinding widgetProfileHeaderBinding, ProfileHeaderVO.ProfileHeaderStatVO profileHeaderStatVO) {
        TextAtomV2View leftCountBlockNumber = widgetProfileHeaderBinding.leftCountBlockNumber;
        Intrinsics.checkNotNullExpressionValue(leftCountBlockNumber, "leftCountBlockNumber");
        TextHolderKt.bind$default(leftCountBlockNumber, profileHeaderStatVO.getBlockNumber(), null, 2, null);
        TextAtomV2View leftCountBlockTitle = widgetProfileHeaderBinding.leftCountBlockTitle;
        Intrinsics.checkNotNullExpressionValue(leftCountBlockTitle, "leftCountBlockTitle");
        TextHolderKt.bind$default(leftCountBlockTitle, profileHeaderStatVO.getBlockTitle(), null, 2, null);
    }

    private final void bindMiddleCount(WidgetProfileHeaderBinding widgetProfileHeaderBinding, ProfileHeaderVO.ProfileHeaderStatVO profileHeaderStatVO) {
        TextAtomV2View middleCountBlockNumber = widgetProfileHeaderBinding.middleCountBlockNumber;
        Intrinsics.checkNotNullExpressionValue(middleCountBlockNumber, "middleCountBlockNumber");
        TextHolderKt.bind$default(middleCountBlockNumber, profileHeaderStatVO.getBlockNumber(), null, 2, null);
        TextAtomV2View middleCountBlockTitle = widgetProfileHeaderBinding.middleCountBlockTitle;
        Intrinsics.checkNotNullExpressionValue(middleCountBlockTitle, "middleCountBlockTitle");
        TextHolderKt.bind$default(middleCountBlockTitle, profileHeaderStatVO.getBlockTitle(), null, 2, null);
    }

    private final void bindRightCount(WidgetProfileHeaderBinding widgetProfileHeaderBinding, ProfileHeaderVO.ProfileHeaderStatVO profileHeaderStatVO) {
        TextAtomV2View rightCountBlockNumber = widgetProfileHeaderBinding.rightCountBlockNumber;
        Intrinsics.checkNotNullExpressionValue(rightCountBlockNumber, "rightCountBlockNumber");
        TextHolderKt.bind$default(rightCountBlockNumber, profileHeaderStatVO.getBlockNumber(), null, 2, null);
        TextAtomV2View rightCountBlockTitle = widgetProfileHeaderBinding.rightCountBlockTitle;
        Intrinsics.checkNotNullExpressionValue(rightCountBlockTitle, "rightCountBlockTitle");
        TextHolderKt.bind$default(rightCountBlockTitle, profileHeaderStatVO.getBlockTitle(), null, 2, null);
    }

    private final void bindSubscribeButton(WidgetProfileHeaderBinding widgetProfileHeaderBinding, ProfileHeaderVO profileHeaderVO) {
        ButtonV3View subscribeButton = widgetProfileHeaderBinding.subscribeButton;
        Intrinsics.checkNotNullExpressionValue(subscribeButton, "subscribeButton");
        ButtonV3HolderKt.bind(subscribeButton, profileHeaderVO.getIsSubscribeState() ? profileHeaderVO.getSubscribeButton() : profileHeaderVO.getUnsubscribeButton(), this.actionHandler);
    }

    private final void invokeAction(AtomAction action) {
        if (action != null) {
            this.actionHandler.invoke(action);
        }
    }

    private final void setCountClickListeners() {
        WidgetProfileHeaderBinding widgetProfileHeaderBinding = this.binding;
        widgetProfileHeaderBinding.leftClickArea.setOnClickListener(new a(this, 14));
        widgetProfileHeaderBinding.middleClickArea.setOnClickListener(new b(this, 15));
        widgetProfileHeaderBinding.rightClickArea.setOnClickListener(new CG.c(this, 10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setCountClickListeners$lambda$11$lambda$10(ProfileHeaderViewHolder profileHeaderViewHolder, View view) {
        ProfileHeaderVO.ProfileHeaderStatVO rightCount;
        ProfileHeaderVO boundData = profileHeaderViewHolder.getBoundData();
        profileHeaderViewHolder.invokeAction((boundData == null || (rightCount = boundData.getRightCount()) == null) ? null : rightCount.getBlockAction());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setCountClickListeners$lambda$11$lambda$8(ProfileHeaderViewHolder profileHeaderViewHolder, View view) {
        ProfileHeaderVO.ProfileHeaderStatVO leftCount;
        ProfileHeaderVO boundData = profileHeaderViewHolder.getBoundData();
        profileHeaderViewHolder.invokeAction((boundData == null || (leftCount = boundData.getLeftCount()) == null) ? null : leftCount.getBlockAction());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setCountClickListeners$lambda$11$lambda$9(ProfileHeaderViewHolder profileHeaderViewHolder, View view) {
        ProfileHeaderVO.ProfileHeaderStatVO middleCount;
        ProfileHeaderVO boundData = profileHeaderViewHolder.getBoundData();
        profileHeaderViewHolder.invokeAction((boundData == null || (middleCount = boundData.getMiddleCount()) == null) ? null : middleCount.getBlockAction());
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        ButtonV3DTO subscribeButton;
        CommonControlSettings common;
        AtomActionDTO action;
        Map<String, String> params;
        String str;
        super.onAttach();
        ProfileHeaderVO boundData = getBoundData();
        if (boundData == null || (subscribeButton = boundData.getSubscribeButton()) == null || (common = subscribeButton.getCommon()) == null || (action = common.getAction()) == null || (params = action.getParams()) == null || (str = params.get("authorId")) == null) {
            return;
        }
        Boolean isAuthorSubscribed = this.subscribeAuthorsIdStorage.isAuthorSubscribed(str);
        ProfileHeaderVO boundData2 = getBoundData();
        boolean isSubscribeState = boundData2 != null ? boundData2.getIsSubscribeState() : false;
        ProfileHeaderVO boundData3 = getBoundData();
        boolean isSubscribeState2 = boundData3 != null ? boundData3.getIsSubscribeState() : true;
        if (Intrinsics.d(isAuthorSubscribed, Boolean.TRUE) && !isSubscribeState) {
            this.composerReferences.getController().update(new SubscribeAuthorUpdateKey(str));
        } else if (Intrinsics.d(isAuthorSubscribed, Boolean.FALSE) && isSubscribeState2) {
            this.composerReferences.getController().update(new UnsubscribeAuthorUpdateKey(str));
        }
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        super.onViewInVisibleBounds();
        InterfaceC7851b controller = this.composerReferences.getController();
        ProfileHeaderVO boundData = getBoundData();
        controller.update(new ProfileHeaderVisibilityKey(true, boundData != null ? Boolean.valueOf(boundData.getIsSubscribeState()) : null));
    }

    @Override // jk0.j, lk0.b
    public void onViewOutOfVisibleBounds() {
        super.onViewOutOfVisibleBounds();
        InterfaceC7851b controller = this.composerReferences.getController();
        ProfileHeaderVO boundData = getBoundData();
        controller.update(new ProfileHeaderVisibilityKey(false, boundData != null ? Boolean.valueOf(boundData.getIsSubscribeState()) : null));
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull ProfileHeaderVO item, @NotNull W10.c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            m.c(this.tokenizedAnalytics, tokenizedEvent, null);
        }
        t avatarTokenizedEvent = item.getAvatarTokenizedEvent();
        if (avatarTokenizedEvent != null) {
            m.c(this.tokenizedAnalytics, avatarTokenizedEvent, null);
        }
        t tokenizedEvent2 = item.getLeftCount().getTokenizedEvent();
        if (tokenizedEvent2 != null) {
            m.c(this.tokenizedAnalytics, tokenizedEvent2, null);
        }
        t tokenizedEvent3 = item.getMiddleCount().getTokenizedEvent();
        if (tokenizedEvent3 != null) {
            m.c(this.tokenizedAnalytics, tokenizedEvent3, null);
        }
        t tokenizedEvent4 = item.getRightCount().getTokenizedEvent();
        if (tokenizedEvent4 != null) {
            m.c(this.tokenizedAnalytics, tokenizedEvent4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ProfileHeaderVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetViewHolderKt.getEMPTY_PAYLOAD();
        bind(item, info, (Object) Unit.f71690a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ProfileHeaderVO item, @NotNull d info, @NotNull Object payload) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(payload, "payload");
        WidgetProfileHeaderBinding widgetProfileHeaderBinding = this.binding;
        WidgetViewHolderKt.getEMPTY_PAYLOAD();
        if (Intrinsics.d(payload, Unit.f71690a)) {
            bindHeader(widgetProfileHeaderBinding, item);
            return;
        }
        for (ProfileHeaderViewMapper.ProfileHeaderPayload profileHeaderPayload : (List) payload) {
            if (profileHeaderPayload instanceof ProfileHeaderViewMapper.ProfileHeaderPayload.AvatarChanged) {
                bindAvatar(widgetProfileHeaderBinding, item.getAvatar());
            } else if (profileHeaderPayload instanceof ProfileHeaderViewMapper.ProfileHeaderPayload.LeftCountChanged) {
                bindLeftCount(widgetProfileHeaderBinding, item.getLeftCount());
            } else if (profileHeaderPayload instanceof ProfileHeaderViewMapper.ProfileHeaderPayload.MiddleCountChanged) {
                bindMiddleCount(widgetProfileHeaderBinding, item.getMiddleCount());
            } else if (profileHeaderPayload instanceof ProfileHeaderViewMapper.ProfileHeaderPayload.RightCountChanged) {
                bindRightCount(widgetProfileHeaderBinding, item.getRightCount());
            } else {
                if (!(profileHeaderPayload instanceof ProfileHeaderViewMapper.ProfileHeaderPayload.SubscribedStateChanged)) {
                    throw new o();
                }
                bindSubscribeButton(widgetProfileHeaderBinding, item);
            }
        }
    }
}
