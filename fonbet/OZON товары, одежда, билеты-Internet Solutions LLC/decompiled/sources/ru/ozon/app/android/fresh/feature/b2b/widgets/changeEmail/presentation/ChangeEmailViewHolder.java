package ru.ozon.app.android.fresh.feature.b2b.widgets.changeEmail.presentation;

import A00.a;
import Ae.C2399j;
import Ae.C2408n0;
import FY.e;
import Ql.c;
import WZ.l;
import WZ.t;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.core.view.C5353y0;
import androidx.core.view.D;
import androidx.core.view.Y;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.fresh.feature.b2b.widgets.changeEmail.presentation.ChangeEmailVO;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 72\b\u0012\u0004\u0012\u00020\u00020\u0001:\u000278B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001c\u0010\u0017J\u0017\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001dH\u0014¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010#\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!H\u0014¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0010H\u0016¢\u0006\u0004\b%\u0010\u0017J)\u0010*\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010'\u001a\u00020&2\b\u0010)\u001a\u0004\u0018\u00010(H\u0016¢\u0006\u0004\b*\u0010+R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010,R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010-R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010.R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010/R \u00102\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u0010008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106¨\u00069"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/presentation/ChangeEmailViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/presentation/ChangeEmailVO;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/presentation/ChangeEmailView;", "view", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/presentation/ChangeEmailViewModel;", "viewModel", "<init>", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/presentation/ChangeEmailView;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/presentation/ChangeEmailViewModel;)V", "item", "", "otpValue", "", "handleOtpCompleted", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/presentation/ChangeEmailVO;Ljava/lang/String;)V", "", "isCheckboxSelected", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/presentation/ChangeEmailVO;)Z", "initKeyboardListener", "()V", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "notification", "showNotificationBar", "(Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "onAttach", "Landroidx/lifecycle/J;", "lifecycle", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/presentation/ChangeEmailVO;Ll20/d;)V", "onDetach", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/presentation/ChangeEmailVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/presentation/ChangeEmailView;", "Lru/ozon/app/android/composer/ComposerReferences;", "LWZ/l;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/presentation/ChangeEmailViewModel;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Landroidx/core/view/D;", "insetsListener", "Landroidx/core/view/D;", "Companion", "CommsSelectionUpdate", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChangeEmailViewHolder extends k<ChangeEmailVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final ComposerReferences composerReferences;

    @NotNull
    private final D insetsListener;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final ChangeEmailView view;

    @NotNull
    private final ChangeEmailViewModel viewModel;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/presentation/ChangeEmailViewHolder$CommsSelectionUpdate;", "LA00/a$J$a;", "<init>", "()V", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CommsSelectionUpdate implements a.J.InterfaceC0007a {
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/presentation/ChangeEmailViewHolder$Companion;", "", "<init>", "()V", "INPUT_NAME_EMAIL", "", "INPUT_NAME_OTP", "ACTION_NAME_FROM_CONTRACT", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChangeEmailViewHolder(@NotNull ChangeEmailView view, @NotNull ComposerReferences composerReferences, @NotNull l tokenizedAnalytics, @NotNull ChangeEmailViewModel viewModel) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.view = view;
        this.composerReferences = composerReferences;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.viewModel = viewModel;
        this.actionHandler = new ActionHandler.Builder(composerReferences, this).onPreProcess(new ChangeEmailViewHolder$actionHandler$1(this)).onComposerAction(new ChangeEmailViewHolder$actionHandler$2(this)).buildHandler();
        this.insetsListener = new e(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleOtpCompleted(ChangeEmailVO item, String otpValue) {
        ChangeEmailVO.InputVO inputVO;
        String str;
        CommonControlSettings common;
        CommonControlSettings common2;
        AtomActionDTO action;
        Map<String, String> params;
        CommonControlSettings common3;
        AtomActionDTO action2;
        Object obj;
        List<ChangeEmailVO.InputVO> inputs = item.getInputs();
        Map<String, TokenizedTrackingInfo> map = null;
        if (inputs != null) {
            Iterator<T> it = inputs.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (Intrinsics.d(((ChangeEmailVO.InputVO) obj).getName(), "otp")) {
                        break;
                    }
                }
            }
            inputVO = (ChangeEmailVO.InputVO) obj;
        } else {
            inputVO = null;
        }
        if (inputVO == null || (common3 = inputVO.getCommon()) == null || (action2 = common3.getAction()) == null || (str = action2.getId()) == null) {
            str = "b2bChangeEmail";
        }
        String str2 = str;
        LinkedHashMap linkedHashMap = (inputVO == null || (common2 = inputVO.getCommon()) == null || (action = common2.getAction()) == null || (params = action.getParams()) == null) ? new LinkedHashMap() : U.u(params);
        linkedHashMap.put("otpValue", otpValue);
        if (inputVO != null && (common = inputVO.getCommon()) != null) {
            map = common.getTrackingInfo();
        }
        this.viewModel.onComposerAction(new AtomAction.ComposerAction(str2, str2, linkedHashMap, map, null, 16, null), inputVO, new ChangeEmailViewHolder$handleOtpCompleted$1(this));
    }

    private final void initKeyboardListener() {
        Window window;
        r a11 = this.composerReferences.getContainer().a();
        if (a11 == null || (window = a11.getWindow()) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 30) {
            window.setSoftInputMode(16);
        }
        Y.J(window.getDecorView(), this.insetsListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5353y0 insetsListener$lambda$1(ChangeEmailViewHolder changeEmailViewHolder, View view, C5353y0 c5353y0) {
        View view2;
        ViewGroup composerContainer;
        int i11 = c.a(view, "view", c5353y0, "windowInsetsCompat", 8).f42129d - c5353y0.f(2).f42129d;
        if (i11 < 0) {
            i11 = 0;
        }
        ComponentCallbacksC5392m c11 = changeEmailViewHolder.composerReferences.getContainer().c();
        if (c11 != null && (view2 = c11.getView()) != null && (composerContainer = ComposerViewExtensionKt.composerContainer(view2)) != null) {
            ViewGroup.LayoutParams layoutParams = composerContainer.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = i11;
            composerContainer.setLayoutParams(marginLayoutParams);
        }
        return Y.u(view, c5353y0);
    }

    private final boolean isCheckboxSelected(ChangeEmailVO item) {
        CellDTO.LeftBlock leftBlock;
        CellDTO cell = item.getCell();
        AtomDTO control = (cell == null || (leftBlock = cell.getLeftBlock()) == null) ? null : leftBlock.getControl();
        CheckBoxDTO checkBoxDTO = control instanceof CheckBoxDTO ? (CheckBoxDTO) control : null;
        return (checkBoxDTO != null ? checkBoxDTO.getStatus() : null) == CheckBoxDTO.CheckboxStatus.SELECTED;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showNotificationBar(NotificationDTO notification) {
        ViewGroup rootView;
        ViewGroup composerContainer;
        NotificationLayoutManager asNotificationLayoutManager$default;
        r a11 = this.composerReferences.getContainer().a();
        if (a11 == null || (rootView = ContextExtKt.getRootView(a11)) == null || (composerContainer = ComposerViewExtensionKt.composerContainer(rootView)) == null || (asNotificationLayoutManager$default = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(composerContainer, null, 1, null)) == null) {
            return;
        }
        NotificationBar.INSTANCE.make(asNotificationLayoutManager$default, notification, this.composerReferences.getContainer().i(), this.actionHandler).show();
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        initKeyboardListener();
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onAttachViewModel(@NotNull J lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        super.onAttachViewModel(lifecycle);
        C2399j.C(new C2408n0(this.viewModel.getTimer(), new ChangeEmailViewHolder$onAttachViewModel$1(this, null)), K.a(lifecycle));
        C2399j.C(new C2408n0(this.viewModel.getActions(), new ChangeEmailViewHolder$onAttachViewModel$2(this, null)), K.a(lifecycle));
        C2399j.C(new C2408n0(this.viewModel.getEmailSet(), new ChangeEmailViewHolder$onAttachViewModel$3(this, null)), K.a(lifecycle));
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        ViewGroup rootView;
        super.onDetach();
        r a11 = this.composerReferences.getContainer().a();
        if (a11 == null || (rootView = ContextExtKt.getRootView(a11)) == null) {
            return;
        }
        Y.J(rootView, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ChangeEmailVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.viewModel.initCommsPermission(isCheckboxSelected(item));
        this.view.bind(item, this.viewModel.getTimerState(), this.actionHandler, new ChangeEmailViewHolder$bind$1(this, item), new ChangeEmailViewHolder$bind$2(item, this));
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull ChangeEmailVO item, @NotNull W10.c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((ChangeEmailViewHolder) item, trackingData, viewedPond);
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
        }
    }
}
