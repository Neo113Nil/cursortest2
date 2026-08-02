package ru.ozon.app.android.marketing.widgets.notificationssettings.presentation.cell;

import WZ.t;
import android.content.Intent;
import android.view.ViewGroup;
import fd.InterfaceC6511n;
import i10.h;
import i10.l;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.atoms.data.deprecated.Cell;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.R$id;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.composer.universalscreen.view.ComposerFragment;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.marketing.databinding.WidgetNotificationsSettingsCellBinding;
import ru.ozon.app.android.marketing.widgets.notificationssettings.core.cell.NotificationsSettingsCellViewMapper;
import ru.ozon.app.android.marketing.widgets.notificationssettings.data.NotificationsSettingsDTO;
import ru.ozon.app.android.marketing.widgets.notificationssettings.dialog.NotificationsSettingsDialogFragment;
import ru.ozon.app.android.marketing.widgets.notificationssettings.presentation.NotificationsSettingsBottomSheetConfigurator;
import ru.ozon.app.android.marketing.widgets.notificationssettings.presentation.NotificationsSettingsConfigurator;
import ru.ozon.app.android.marketing.widgets.notificationssettings.presentation.cell.NotificationsSettingsCellVO;
import ru.ozon.app.android.uikit.R$string;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.utils.PermissionExtKt;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.deprecated.Button;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 B2\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\u00020\u0004:\u0001BB\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010\"\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u00022\n\u0010!\u001a\u00060\u001fj\u0002` H\u0014¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u001f\u0010)\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020$2\u0006\u0010(\u001a\u00020\u000fH\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u001bH\u0016¢\u0006\u0004\b+\u0010\u001dJ\u000f\u0010,\u001a\u00020\u001bH\u0016¢\u0006\u0004\b,\u0010\u001dJ\u0017\u0010-\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b-\u0010'J\u0017\u0010.\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b.\u0010'R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010/R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00100R<\u00103\u001a\u001c\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u001b\u0018\u0001018\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R$\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001e\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R \u0010@\u001a\u000e\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020\u001b0>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010A¨\u0006C"}, d2 = {"Lru/ozon/app/android/marketing/widgets/notificationssettings/presentation/cell/NotificationsSettingsCellViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/marketing/widgets/notificationssettings/presentation/cell/NotificationsSettingsCellVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/marketing/widgets/notificationssettings/presentation/cell/NotificationsSettingsCellView;", "Lru/ozon/app/android/marketing/databinding/WidgetNotificationsSettingsCellBinding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "<init>", "(Lru/ozon/app/android/marketing/databinding/WidgetNotificationsSettingsCellBinding;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/composer/throttle/HandlersInhibitor;)V", "Lru/ozon/app/android/marketing/widgets/notificationssettings/data/NotificationsSettingsDTO$NotificationSource$Dialog;", "dialog", "", "openDialog", "(Lru/ozon/app/android/marketing/widgets/notificationssettings/data/NotificationsSettingsDTO$NotificationSource$Dialog;)Z", "vo", "Lru/ozon/app/android/atoms/data/deprecated/Cell$CellToggle;", "cell", "toggleSetting", "(Lru/ozon/app/android/marketing/widgets/notificationssettings/presentation/cell/NotificationsSettingsCellVO;Lru/ozon/app/android/atoms/data/deprecated/Cell$CellToggle;)Z", "Lru/ozon/app/android/atoms/data/deprecated/Cell$CellDefault;", "atom", "openBottomSheet", "(Lru/ozon/app/android/atoms/data/deprecated/Cell$CellDefault;)Z", "", "setUpRoot", "()V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/marketing/widgets/notificationssettings/presentation/cell/NotificationsSettingsCellVO;Ll20/d;)V", "", "id", "onToggleChanged", "(J)V", "selected", "onSettingSaved", "(JZ)V", "onShowProgress", "onHideProgress", "onDialogResult", "onError", "Lru/ozon/app/android/marketing/databinding/WidgetNotificationsSettingsCellBinding;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lkotlin/Function3;", "Lru/ozon/app/android/marketing/widgets/notificationssettings/data/NotificationsSettingsDTO$NotificationSource$SettingInfo;", "onSettingChanged", "Lfd/n;", "getOnSettingChanged", "()Lfd/n;", "setOnSettingChanged", "(Lfd/n;)V", "Lru/ozon/app/android/marketing/widgets/notificationssettings/presentation/cell/NotificationsSettingsCellVO;", "getItem", "()Lru/ozon/app/android/marketing/widgets/notificationssettings/presentation/cell/NotificationsSettingsCellVO;", "setItem", "(Lru/ozon/app/android/marketing/widgets/notificationssettings/presentation/cell/NotificationsSettingsCellVO;)V", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Companion", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class NotificationsSettingsCellViewHolder extends k<NotificationsSettingsCellVO> implements NotificationsSettingsCellView {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetNotificationsSettingsCellBinding binding;
    private NotificationsSettingsCellVO item;
    private InterfaceC6511n<? super Long, ? super NotificationsSettingsDTO.NotificationSource.SettingInfo, ? super Boolean, Unit> onSettingChanged;

    @NotNull
    private final ComposerReferences refs;
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AtomActionDTO.Behavior.values().length];
            try {
                iArr[AtomActionDTO.Behavior.CUSTOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AtomActionDTO.Behavior.REDIRECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public NotificationsSettingsCellViewHolder(@NotNull WidgetNotificationsSettingsCellBinding binding, @NotNull ComposerReferences refs, @NotNull HandlersInhibitor handlersInhibitor) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(handlersInhibitor, "handlersInhibitor");
        VerticalAtomsLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.refs = refs;
        this.actionHandler = new ActionHandler.Builder(refs, this).enableClickThrottling(handlersInhibitor).configureBottomSheetWrapContent(true).onPreProcess(new NotificationsSettingsCellViewHolder$actionHandler$1(this)).buildHandler();
        setUpRoot();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean openBottomSheet(Cell.CellDefault atom) {
        String link;
        String str;
        AtomActionDTO action = atom.getAction();
        if (action == null || (link = action.getLink()) == null) {
            return false;
        }
        Map<String, String> nestedPages = getNestedPages();
        if (nestedPages == null || (str = nestedPages.get(link)) == null) {
            return true;
        }
        ComposerNavigator navigator = this.refs.getNavigator();
        h.c.b bVar = new h.c.b(str);
        ComposerScreenConfig.ToolbarConfig toolbarConfig = new ComposerScreenConfig.ToolbarConfig(null, 0, 2, null);
        Class[] elements = {NotificationsSettingsConfigurator.class, NotificationsSettingsBottomSheetConfigurator.class};
        Intrinsics.checkNotNullParameter(elements, "elements");
        ComposerNavigator.DefaultImpls.openBottomSheet$default(navigator, link, new ComposerScreenConfig(bVar, toolbarConfig, false, new ComposerScreenConfig.BottomSheetConfig(ComposerFragment.DisplayMode.BOTTOM_SHEET_WRAP, false, false, null, 0, false, false, false, false, false, false, 2046, null), false, false, false, false, null, false, false, false, C7705l.j0(elements), null, null, null, false, null, null, null, false, false, null, null, 16773044, null), Integer.valueOf(link.hashCode()), null, null, 24, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean openDialog(NotificationsSettingsDTO.NotificationSource.Dialog dialog) {
        NotificationsSettingsDialogFragment.Companion companion = NotificationsSettingsDialogFragment.INSTANCE;
        NotificationsSettingsDialogFragment.Params params = new NotificationsSettingsDialogFragment.Params(dialog.getMessage(), dialog.getTitle(), dialog.getConfirmButton().getText(), StringProvider.getString(R$string.common_action_cancel));
        Intent intent = new Intent();
        NotificationsSettingsCellVO item = getItem();
        intent.putExtra("extra_id", item != null ? Long.valueOf(item.getId()) : null);
        Unit unit = Unit.f71690a;
        NotificationsSettingsDialogFragment newInstance = companion.newInstance(params, intent);
        newInstance.setTargetFragment(this.refs.getContainer().j(), 3991);
        newInstance.show(this.refs.getContainer().k(), (String) null);
        return true;
    }

    private final void setUpRoot() {
        this.binding.getConstraintLayout().setTag(R$id.skip_composer_default_widget_background, Unit.f71690a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean toggleSetting(NotificationsSettingsCellVO vo, Cell.CellToggle cell) {
        NotificationsSettingsDTO.NotificationSource.SettingInfo settingInfo = vo.getSettingInfo();
        if (settingInfo == null) {
            return false;
        }
        InterfaceC6511n<Long, NotificationsSettingsDTO.NotificationSource.SettingInfo, Boolean, Unit> onSettingChanged = getOnSettingChanged();
        if (onSettingChanged == null) {
            return true;
        }
        onSettingChanged.invoke(Long.valueOf(vo.getId()), settingInfo, Boolean.valueOf(cell.isSelected()));
        return true;
    }

    @Override // ru.ozon.app.android.marketing.widgets.notificationssettings.presentation.cell.NotificationsSettingsCellView
    public NotificationsSettingsCellVO getItem() {
        return this.item;
    }

    public InterfaceC6511n<Long, NotificationsSettingsDTO.NotificationSource.SettingInfo, Boolean, Unit> getOnSettingChanged() {
        return this.onSettingChanged;
    }

    @Override // ru.ozon.app.android.marketing.widgets.notificationssettings.presentation.cell.NotificationsSettingsCellView
    public void onDialogResult(long id2) {
        String link;
        NotificationsSettingsDTO.NotificationSource.Dialog dialog;
        Button confirmButton;
        NotificationsSettingsCellVO item = getItem();
        AtomActionDTO action = (item == null || (dialog = item.getDialog()) == null || (confirmButton = dialog.getConfirmButton()) == null) ? null : confirmButton.getAction();
        AtomActionDTO.Behavior behavior = action != null ? action.getBehavior() : null;
        int i11 = behavior == null ? -1 : WhenMappings.$EnumSwitchMapping$0[behavior.ordinal()];
        if (i11 == 1) {
            if (Intrinsics.d(action.getId(), "enablePushNotifications")) {
                PermissionExtKt.openAppNotificationsSettings(this.refs.getContainer().i());
            }
        } else if (i11 == 2 && (link = action.getLink()) != null) {
            ComposerNavigator.DefaultImpls.openDeeplink$default(this.refs.getNavigator(), link, null, 2, null);
        }
    }

    @Override // ru.ozon.app.android.marketing.widgets.notificationssettings.presentation.cell.NotificationsSettingsCellView
    public void onError(long id2) {
        ViewGroup rootView = ContextExtKt.getRootView(this.refs.getContainer().j());
        if (rootView != null) {
            FlashbarFactory.createDefaultError$default(FlashbarFactory.INSTANCE, rootView, null, null, null, null, null, this.refs.getContainer().g(), 62, null).show();
        }
    }

    @Override // ru.ozon.app.android.marketing.widgets.notificationssettings.presentation.cell.NotificationsSettingsCellView
    public void onHideProgress() {
        this.refs.getController().hideLoader();
    }

    @Override // ru.ozon.app.android.marketing.widgets.notificationssettings.presentation.cell.NotificationsSettingsCellView
    public void onSettingSaved(long id2, boolean selected) {
        NotificationsSettingsCellVO.TrackingInfo trackingInfo;
        t unselected;
        NotificationsSettingsCellVO.TrackingInfo trackingInfo2;
        NotificationsSettingsCellVO item = getItem();
        if (item == null || item.getId() != id2) {
            return;
        }
        if (selected) {
            NotificationsSettingsCellVO item2 = getItem();
            if (item2 != null && (trackingInfo2 = item2.getTrackingInfo()) != null) {
                unselected = trackingInfo2.getSelected();
            }
            unselected = null;
        } else {
            NotificationsSettingsCellVO item3 = getItem();
            if (item3 != null && (trackingInfo = item3.getTrackingInfo()) != null) {
                unselected = trackingInfo.getUnselected();
            }
            unselected = null;
        }
        if (unselected != null) {
            TokenizedAnalyticsExtensionsKt.processComposerEvents$default(this.refs.getTokenizedAnalytics(), unselected, null, 2, null);
        }
    }

    @Override // ru.ozon.app.android.marketing.widgets.notificationssettings.presentation.cell.NotificationsSettingsCellView
    public void onShowProgress() {
        this.refs.getController().e(new l.a.C1079a(0L, null, 3));
    }

    @Override // ru.ozon.app.android.marketing.widgets.notificationssettings.presentation.cell.NotificationsSettingsCellView
    public void onToggleChanged(long id2) {
        this.refs.getController().update(new NotificationsSettingsCellViewMapper.ToggleUpdate(id2));
    }

    public void setItem(NotificationsSettingsCellVO notificationsSettingsCellVO) {
        this.item = notificationsSettingsCellVO;
    }

    @Override // ru.ozon.app.android.marketing.widgets.notificationssettings.presentation.cell.NotificationsSettingsCellView
    public void setOnSettingChanged(InterfaceC6511n<? super Long, ? super NotificationsSettingsDTO.NotificationSource.SettingInfo, ? super Boolean, Unit> interfaceC6511n) {
        this.onSettingChanged = interfaceC6511n;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull NotificationsSettingsCellVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        setItem(item);
        AtomsAdapter atomsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        atomsAdapter.setOnAction(this.actionHandler);
        this.binding.atomsVAL.setAdapter(atomsAdapter);
        atomsAdapter.bind(getContext(), C7714v.a0(item.getCell()));
    }
}
