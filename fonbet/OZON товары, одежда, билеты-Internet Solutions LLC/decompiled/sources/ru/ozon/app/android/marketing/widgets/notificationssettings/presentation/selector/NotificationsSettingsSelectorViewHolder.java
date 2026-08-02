package ru.ozon.app.android.marketing.widgets.notificationssettings.presentation.selector;

import WZ.t;
import android.content.Intent;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import fd.InterfaceC6512o;
import i10.l;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.marketing.databinding.WidgetNotificationsSettingsSelectorBinding;
import ru.ozon.app.android.marketing.widgets.notificationssettings.core.selector.NotificationsSettingsSelectorViewMapper;
import ru.ozon.app.android.marketing.widgets.notificationssettings.data.NotificationsSettingsDTO;
import ru.ozon.app.android.marketing.widgets.notificationssettings.dialog.NotificationsSettingsDialogFragment;
import ru.ozon.app.android.marketing.widgets.notificationssettings.presentation.selector.NotificationsSettingsSelectorVO;
import ru.ozon.app.android.uikit.R$string;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.utils.PermissionExtKt;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.deprecated.Button;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\u00020\u0004B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000b\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010\"\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u00022\n\u0010!\u001a\u00060\u001fj\u0002` H\u0014¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\fH\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\fH\u0016¢\u0006\u0004\b&\u0010%J\u001f\u0010(\u001a\u00020\f2\u0006\u0010'\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\f2\u0006\u0010'\u001a\u00020\u0014H\u0016¢\u0006\u0004\b*\u0010\u0017J\u0017\u0010+\u001a\u00020\f2\u0006\u0010'\u001a\u00020\u0014H\u0016¢\u0006\u0004\b+\u0010\u0017R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010,R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010-R$\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u0010\u000eRB\u00103\u001a\"\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\f\u0018\u0001028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\f098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006<"}, d2 = {"Lru/ozon/app/android/marketing/widgets/notificationssettings/presentation/selector/NotificationsSettingsSelectorViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/marketing/widgets/notificationssettings/presentation/selector/NotificationsSettingsSelectorVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/marketing/widgets/notificationssettings/presentation/selector/NotificationsSettingsSelectorView;", "Lru/ozon/app/android/marketing/databinding/WidgetNotificationsSettingsSelectorBinding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "<init>", "(Lru/ozon/app/android/marketing/databinding/WidgetNotificationsSettingsSelectorBinding;Lru/ozon/app/android/composer/ComposerReferences;)V", "item", "", "bindTitle", "(Lru/ozon/app/android/marketing/widgets/notificationssettings/presentation/selector/NotificationsSettingsSelectorVO;)V", "bindVariants", "Lru/ozon/app/android/marketing/widgets/notificationssettings/data/NotificationsSettingsDTO$NotificationSource$Dialog;", "dialog", "openDialog", "(Lru/ozon/app/android/marketing/widgets/notificationssettings/data/NotificationsSettingsDTO$NotificationSource$Dialog;)V", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "sendAnalytics", "(J)V", "Lru/ozon/app/android/marketing/widgets/notificationssettings/presentation/selector/NotificationsSettingsSelectorVO$Variant;", "Lru/ozon/app/android/marketing/widgets/notificationssettings/presentation/selector/NotificationsSettingsSelectorVariantView;", "createVariantView", "(Lru/ozon/app/android/marketing/widgets/notificationssettings/presentation/selector/NotificationsSettingsSelectorVO$Variant;)Lru/ozon/app/android/marketing/widgets/notificationssettings/presentation/selector/NotificationsSettingsSelectorVariantView;", "Lru/ozon/app/android/marketing/widgets/notificationssettings/presentation/selector/NotificationsSettingsSelectorDividerView;", "createDividerView", "()Lru/ozon/app/android/marketing/widgets/notificationssettings/presentation/selector/NotificationsSettingsSelectorDividerView;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/marketing/widgets/notificationssettings/presentation/selector/NotificationsSettingsSelectorVO;Ll20/d;)V", "onShowProgress", "()V", "onHideProgress", "id", "onSelectorChanged", "(JJ)V", "onDialogResult", "onError", "Lru/ozon/app/android/marketing/databinding/WidgetNotificationsSettingsSelectorBinding;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/marketing/widgets/notificationssettings/presentation/selector/NotificationsSettingsSelectorVO;", "getItem", "()Lru/ozon/app/android/marketing/widgets/notificationssettings/presentation/selector/NotificationsSettingsSelectorVO;", "setItem", "Lkotlin/Function4;", "onSettingChanged", "Lfd/o;", "getOnSettingChanged", "()Lfd/o;", "setOnSettingChanged", "(Lfd/o;)V", "Lkotlin/Function1;", "onClickListener", "Lkotlin/jvm/functions/Function1;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class NotificationsSettingsSelectorViewHolder extends k<NotificationsSettingsSelectorVO> implements NotificationsSettingsSelectorView {

    @NotNull
    private final WidgetNotificationsSettingsSelectorBinding binding;
    private NotificationsSettingsSelectorVO item;

    @NotNull
    private Function1<? super Long, Unit> onClickListener;
    private InterfaceC6512o<? super Long, ? super Long, ? super Long, ? super Long, Unit> onSettingChanged;

    @NotNull
    private final ComposerReferences refs;

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
    public NotificationsSettingsSelectorViewHolder(@NotNull WidgetNotificationsSettingsSelectorBinding binding, @NotNull ComposerReferences refs) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(refs, "refs");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.refs = refs;
        this.onClickListener = new NotificationsSettingsSelectorViewHolder$onClickListener$1(this);
    }

    private final void bindTitle(NotificationsSettingsSelectorVO item) {
        this.binding.titleTv.setText(item.getTitle());
    }

    private final void bindVariants(NotificationsSettingsSelectorVO item) {
        LinearLayout linearLayout = this.binding.variantsLl;
        linearLayout.removeAllViews();
        int i11 = 0;
        for (Object obj : item.getVariants()) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            linearLayout.addView(createVariantView((NotificationsSettingsSelectorVO.Variant) obj));
            if (i11 != C7714v.P(item.getVariants())) {
                linearLayout.addView(createDividerView());
            }
            i11 = i12;
        }
    }

    private final NotificationsSettingsSelectorDividerView createDividerView() {
        return new NotificationsSettingsSelectorDividerView(getContext(), null, 0, 6, null);
    }

    private final NotificationsSettingsSelectorVariantView createVariantView(NotificationsSettingsSelectorVO.Variant item) {
        NotificationsSettingsSelectorVariantView notificationsSettingsSelectorVariantView = new NotificationsSettingsSelectorVariantView(getContext(), null, 0, 6, null);
        notificationsSettingsSelectorVariantView.bind(item, this.onClickListener);
        return notificationsSettingsSelectorVariantView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openDialog(NotificationsSettingsDTO.NotificationSource.Dialog dialog) {
        NotificationsSettingsDialogFragment.Companion companion = NotificationsSettingsDialogFragment.INSTANCE;
        NotificationsSettingsDialogFragment.Params params = new NotificationsSettingsDialogFragment.Params(dialog.getMessage(), dialog.getTitle(), dialog.getConfirmButton().getText(), StringProvider.getString(R$string.common_action_cancel));
        Intent intent = new Intent();
        NotificationsSettingsSelectorVO item = getItem();
        intent.putExtra("extra_id", item != null ? Long.valueOf(item.getId()) : null);
        Unit unit = Unit.f71690a;
        companion.newInstance(params, intent).show(this.refs.getContainer().k(), (String) null);
    }

    private final void sendAnalytics(long value) {
        List<NotificationsSettingsSelectorVO.Variant> variants;
        Object obj;
        t trackingInfo;
        NotificationsSettingsSelectorVO item = getItem();
        if (item == null || (variants = item.getVariants()) == null) {
            return;
        }
        Iterator<T> it = variants.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((NotificationsSettingsSelectorVO.Variant) obj).getValue() == value) {
                    break;
                }
            }
        }
        NotificationsSettingsSelectorVO.Variant variant = (NotificationsSettingsSelectorVO.Variant) obj;
        if (variant == null || (trackingInfo = variant.getTrackingInfo()) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processClickEvents$default(this.refs.getTokenizedAnalytics(), trackingInfo, null, 2, null);
    }

    @Override // ru.ozon.app.android.marketing.widgets.notificationssettings.presentation.selector.NotificationsSettingsSelectorView
    public NotificationsSettingsSelectorVO getItem() {
        return this.item;
    }

    public InterfaceC6512o<Long, Long, Long, Long, Unit> getOnSettingChanged() {
        return this.onSettingChanged;
    }

    @Override // ru.ozon.app.android.marketing.widgets.notificationssettings.presentation.selector.NotificationsSettingsSelectorView
    public void onDialogResult(long id2) {
        String link;
        NotificationsSettingsDTO.NotificationSource.Dialog dialog;
        Button confirmButton;
        NotificationsSettingsSelectorVO item = getItem();
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

    @Override // ru.ozon.app.android.marketing.widgets.notificationssettings.presentation.selector.NotificationsSettingsSelectorView
    public void onError(long id2) {
        ViewGroup rootView = ContextExtKt.getRootView(this.refs.getContainer().j());
        if (rootView != null) {
            FlashbarFactory.createDefaultError$default(FlashbarFactory.INSTANCE, rootView, null, null, null, null, null, this.refs.getContainer().g(), 62, null).show();
        }
    }

    @Override // ru.ozon.app.android.marketing.widgets.notificationssettings.presentation.selector.NotificationsSettingsSelectorView
    public void onHideProgress() {
        this.refs.getController().hideLoader();
    }

    @Override // ru.ozon.app.android.marketing.widgets.notificationssettings.presentation.selector.NotificationsSettingsSelectorView
    public void onSelectorChanged(long id2, long value) {
        this.refs.getController().update(new NotificationsSettingsSelectorViewMapper.SelectorItemUpdate(id2, value));
        sendAnalytics(value);
    }

    @Override // ru.ozon.app.android.marketing.widgets.notificationssettings.presentation.selector.NotificationsSettingsSelectorView
    public void onShowProgress() {
        this.refs.getController().e(new l.a.C1079a(0L, null, 3));
    }

    public void setItem(NotificationsSettingsSelectorVO notificationsSettingsSelectorVO) {
        this.item = notificationsSettingsSelectorVO;
    }

    @Override // ru.ozon.app.android.marketing.widgets.notificationssettings.presentation.selector.NotificationsSettingsSelectorView
    public void setOnSettingChanged(InterfaceC6512o<? super Long, ? super Long, ? super Long, ? super Long, Unit> interfaceC6512o) {
        this.onSettingChanged = interfaceC6512o;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull NotificationsSettingsSelectorVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        setItem(item);
        bindTitle(item);
        bindVariants(item);
    }
}
