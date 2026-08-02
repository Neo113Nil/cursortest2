package ru.ozon.app.android.cabinet.profileAvatar.presentation;

import CG.b;
import CG.c;
import Sc.o;
import WZ.t;
import WZ.x;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.J;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.account.orders.OrderChangePreferences;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.cabinet.databinding.WidgetProfileAvatarBinding;
import ru.ozon.app.android.cabinet.profileAvatar.core.ProfileAvatarViewMapper;
import ru.ozon.app.android.cabinet.profileAvatar.presentation.fragment.AvatarPickerFragment;
import ru.ozon.app.android.cabinet.profileAvatar.presentation.viewItem.ProfileAvatarVO;
import ru.ozon.app.android.cabinet.profileAvatar.presentation.viewmodel.AvatarViewModel;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.loader.data.LoaderSize;
import ru.ozon.uni.android.atom.loader.ui.LoaderView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationBarKt;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 D2\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u0001DB/\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0012J\u001b\u0010\u0017\u001a\u00020\u0010*\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u0010*\u00020\u0015H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001f\u0010\u001bJ\u0017\u0010\"\u001a\u00020\u00102\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u00102\u0006\u0010%\u001a\u00020$H\u0014¢\u0006\u0004\b&\u0010'J#\u0010+\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00022\n\u0010*\u001a\u00060(j\u0002`)H\u0014¢\u0006\u0004\b+\u0010,J+\u0010+\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00022\n\u0010*\u001a\u00060(j\u0002`)2\u0006\u0010.\u001a\u00020-H\u0014¢\u0006\u0004\b+\u0010/J)\u00104\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u00101\u001a\u0002002\b\u00103\u001a\u0004\u0018\u000102H\u0016¢\u0006\u0004\b4\u00105R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00106R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00107R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00108R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00109R\u0014\u0010:\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R \u0010>\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020\u00100<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010A\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010C\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010B¨\u0006E"}, d2 = {"Lru/ozon/app/android/cabinet/profileAvatar/presentation/ProfileAvatarViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/cabinet/profileAvatar/presentation/viewItem/ProfileAvatarVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/cabinet/profileAvatar/presentation/viewmodel/AvatarViewModel;", "viewModel", "Lru/ozon/app/android/account/orders/OrderChangePreferences;", "orderChangePreferences", "", "isSelect", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/cabinet/profileAvatar/presentation/viewmodel/AvatarViewModel;Lru/ozon/app/android/account/orders/OrderChangePreferences;Z)V", "", "setOriginalAvatar", "()V", "setLoadingAvatar", "addAvatarLocators", "Lru/ozon/app/android/cabinet/databinding/WidgetProfileAvatarBinding;", "item", "setWidgetBackgroundColor", "(Lru/ozon/app/android/cabinet/databinding/WidgetProfileAvatarBinding;Lru/ozon/app/android/cabinet/profileAvatar/presentation/viewItem/ProfileAvatarVO;)V", "isDefaultPhoto", "pickupAvatar", "(Z)V", "bindLoader", "(Lru/ozon/app/android/cabinet/databinding/WidgetProfileAvatarBinding;)V", "show", "showOverlayProgress", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "notification", "showErrorNotification", "(Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "Landroidx/lifecycle/J;", "lifecycle", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/cabinet/profileAvatar/presentation/viewItem/ProfileAvatarVO;Ll20/d;)V", "", "payload", "(Lru/ozon/app/android/cabinet/profileAvatar/presentation/viewItem/ProfileAvatarVO;Ll20/d;Ljava/lang/Object;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/cabinet/profileAvatar/presentation/viewItem/ProfileAvatarVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/cabinet/profileAvatar/presentation/viewmodel/AvatarViewModel;", "Lru/ozon/app/android/account/orders/OrderChangePreferences;", "Z", "binding", "Lru/ozon/app/android/cabinet/databinding/WidgetProfileAvatarBinding;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Landroid/view/View$OnClickListener;", "avatarOnClickListener", "Landroid/view/View$OnClickListener;", "titleOnClickListener", "Companion", "cabinet_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ProfileAvatarViewHolder extends k<ProfileAvatarVO> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final View.OnClickListener avatarOnClickListener;

    @NotNull
    private final WidgetProfileAvatarBinding binding;
    private final boolean isSelect;

    @NotNull
    private final OrderChangePreferences orderChangePreferences;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final View.OnClickListener titleOnClickListener;

    @NotNull
    private final AvatarViewModel viewModel;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/cabinet/profileAvatar/presentation/ProfileAvatarViewHolder$Companion;", "", "<init>", "()V", "AVATAR_UPLOADED", "", "AVATAR_IS_NOT_LOADED", "cabinet_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ProfileAvatarViewMapper.ProfileAvatarPayload.values().length];
            try {
                iArr[ProfileAvatarViewMapper.ProfileAvatarPayload.AVATAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProfileAvatarViewMapper.ProfileAvatarPayload.TITLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProfileAvatarViewMapper.ProfileAvatarPayload.BACKGROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileAvatarViewHolder(@NotNull View containerView, @NotNull ComposerReferences refs, @NotNull AvatarViewModel viewModel, @NotNull OrderChangePreferences orderChangePreferences, boolean z11) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(orderChangePreferences, "orderChangePreferences");
        this.refs = refs;
        this.viewModel = viewModel;
        this.orderChangePreferences = orderChangePreferences;
        this.isSelect = z11;
        WidgetProfileAvatarBinding bind = WidgetProfileAvatarBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.actionHandler = new ActionHandler.Builder(refs, this).buildHandler();
        b bVar = new b(this, 7);
        this.avatarOnClickListener = bVar;
        c cVar = new c(this, 5);
        this.titleOnClickListener = cVar;
        bind.profileAvatarIconView.setOnClickListener(bVar);
        TextAtomV2View textAtomV2View = bind.profileTitleView;
        textAtomV2View.setMovementMethod(null);
        textAtomV2View.setTextIsSelectable(false);
        textAtomV2View.setOnClickListener(cVar);
        bindLoader(bind);
    }

    private final void addAvatarLocators() {
        IconDTO avatarIcon;
        ProfileAvatarVO boundData = getBoundData();
        this.binding.profileAvatarIconView.setContentDescription((boundData == null || (avatarIcon = boundData.getAvatarIcon()) == null || avatarIcon.getBackgroundImage() == null) ? "backgroundImageView" : "icon.backgroundImageView");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void avatarOnClickListener$lambda$0(ProfileAvatarViewHolder profileAvatarViewHolder, View view) {
        ProfileAvatarVO boundedData = profileAvatarViewHolder.getBoundedData();
        if (boundedData == null) {
            return;
        }
        profileAvatarViewHolder.pickupAvatar(boundedData.getIsDefaultPhoto());
        t tokenizedEvent = boundedData.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processClickEvents$default(profileAvatarViewHolder.refs.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
        }
    }

    private final void bindLoader(WidgetProfileAvatarBinding widgetProfileAvatarBinding) {
        LoaderView loaderView = widgetProfileAvatarBinding.profileAvatarLoader;
        loaderView.setLoaderSize(LoaderSize.LOADER_400);
        loaderView.setColor(loaderView.getContext().getColor(UniColors.GRAPHIC_ACTION_PRIMARY.getResId()));
    }

    private final void pickupAvatar(boolean isDefaultPhoto) {
        ComponentCallbacksC5392m c11 = this.refs.getContainer().c();
        if (c11 == null) {
            return;
        }
        AvatarPickerFragment newInstance = AvatarPickerFragment.INSTANCE.newInstance(!isDefaultPhoto, this.isSelect);
        newInstance.setTargetFragment(c11, 64572);
        newInstance.show(c11.getParentFragmentManager(), (String) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setLoadingAvatar() {
        IconDTO loadingAvatarIcon;
        this.binding.profileAvatarIconView.setBackgroundImage(null);
        ProfileAvatarVO boundedData = getBoundedData();
        if (boundedData == null || (loadingAvatarIcon = boundedData.getLoadingAvatarIcon()) == null) {
            return;
        }
        IconHolderKt.bind$default(this.binding.profileAvatarIconView, loadingAvatarIcon, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setOriginalAvatar() {
        IconDTO avatarIcon;
        ProfileAvatarVO boundedData = getBoundedData();
        if (boundedData != null && (avatarIcon = boundedData.getAvatarIcon()) != null) {
            IconHolderKt.bind$default(this.binding.profileAvatarIconView, avatarIcon, null, 2, null);
        }
        addAvatarLocators();
    }

    private final void setWidgetBackgroundColor(WidgetProfileAvatarBinding widgetProfileAvatarBinding, ProfileAvatarVO profileAvatarVO) {
        widgetProfileAvatarBinding.getConstraintLayout().setBackgroundColor(StyleParser.INSTANCE.parseColor(getContext(), profileAvatarVO.getBackgroundColor(), UniColors.LAYER_FLOOR_1.getResId()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showErrorNotification(NotificationDTO notification) {
        ComponentCallbacksC5392m c11 = this.refs.getContainer().c();
        View view = c11 != null ? c11.getView() : null;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup == null) {
            return;
        }
        View composerNotificationBottomAnchor = ComposerViewExtensionKt.composerNotificationBottomAnchor(viewGroup, NotificationBarKt.isAboveBottomWidgets(notification));
        NotificationLayoutManager asNotificationLayoutManager = CoordinatorLayoutManagerKt.asNotificationLayoutManager(viewGroup, composerNotificationBottomAnchor != null ? Integer.valueOf(composerNotificationBottomAnchor.getId()) : null);
        if (asNotificationLayoutManager == null) {
            return;
        }
        NotificationBar.INSTANCE.make(asNotificationLayoutManager, notification, this.refs.getContainer().g(), this.actionHandler).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showOverlayProgress(boolean show) {
        LoaderView profileAvatarLoader = this.binding.profileAvatarLoader;
        Intrinsics.checkNotNullExpressionValue(profileAvatarLoader, "profileAvatarLoader");
        ViewExtKt.showOrGone(profileAvatarLoader, Boolean.valueOf(show));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void titleOnClickListener$lambda$3(ProfileAvatarViewHolder profileAvatarViewHolder, View view) {
        t tVar;
        ProfileAvatarVO boundedData = profileAvatarViewHolder.getBoundedData();
        if (boundedData == null) {
            return;
        }
        profileAvatarViewHolder.pickupAvatar(boundedData.getIsDefaultPhoto());
        Map<String, TokenizedTrackingInfo> trackingInfo = boundedData.getActionTitle().getTrackingInfo();
        if (trackingInfo != null) {
            Long valueOf = Long.valueOf(boundedData.getId());
            Intrinsics.checkNotNullParameter(trackingInfo, "<this>");
            tVar = x.b(trackingInfo, valueOf, null);
        } else {
            tVar = null;
        }
        if (tVar != null) {
            TokenizedAnalyticsExtensionsKt.processClickEvents$default(profileAvatarViewHolder.refs.getTokenizedAnalytics(), tVar, null, 2, null);
        }
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onAttachViewModel(@NotNull J lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        super.onAttachViewModel(lifecycle);
        this.viewModel.getSingleAction().observe(this.refs.getContainer().g(), new ProfileAvatarViewHolder$sam$androidx_lifecycle_Observer$0(new ProfileAvatarViewHolder$onAttachViewModel$1(this)));
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull ProfileAvatarVO item, @NotNull W10.c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.refs.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ProfileAvatarVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetProfileAvatarBinding widgetProfileAvatarBinding = this.binding;
        setWidgetBackgroundColor(widgetProfileAvatarBinding, item);
        setOriginalAvatar();
        TextAtomV2View profileTitleView = widgetProfileAvatarBinding.profileTitleView;
        Intrinsics.checkNotNullExpressionValue(profileTitleView, "profileTitleView");
        TextHolderKt.bind$default(profileTitleView, item.getActionTitle(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ProfileAvatarVO item, @NotNull d info, @NotNull Object payload) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(payload, "payload");
        List list = payload instanceof List ? (List) payload : null;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int i11 = WhenMappings.$EnumSwitchMapping$0[((ProfileAvatarViewMapper.ProfileAvatarPayload) it.next()).ordinal()];
                if (i11 == 1) {
                    setOriginalAvatar();
                } else if (i11 == 2) {
                    TextAtomV2View profileTitleView = this.binding.profileTitleView;
                    Intrinsics.checkNotNullExpressionValue(profileTitleView, "profileTitleView");
                    TextHolderKt.bind$default(profileTitleView, item.getActionTitle(), null, 2, null);
                } else if (i11 == 3) {
                    setWidgetBackgroundColor(this.binding, item);
                } else {
                    throw new o();
                }
            }
        }
    }
}
