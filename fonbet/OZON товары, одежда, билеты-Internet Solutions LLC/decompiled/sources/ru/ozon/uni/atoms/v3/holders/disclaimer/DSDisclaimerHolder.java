package ru.ozon.uni.atoms.v3.holders.disclaimer;

import AS.a;
import Ey.ViewOnClickListenerC2975b;
import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.atom.disclaimer.DisclaimerStyle;
import ru.ozon.uni.android.atom.disclaimer.DisclaimerView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.disclaimer.DisclaimerDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringExtKt;
import ru.ozon.uni.atoms.v3.AtomV3;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\u000bJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u0014J\u0012\u0010\u0014\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0002J\u0012\u0010\u0017\u001a\u00020\u00122\b\u0010\u0018\u001a\u0004\u0018\u00010\u0016H\u0002J\u0010\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\rH\u0002R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lru/ozon/uni/atoms/v3/holders/disclaimer/DSDisclaimerHolder;", "Lru/ozon/uni/atoms/v3/AtomV3;", "Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", "Lru/ozon/uni/android/atom/disclaimer/DisclaimerView;", "view", "atomContext", "", "<init>", "(Lru/ozon/uni/android/atom/disclaimer/DisclaimerView;Ljava/lang/String;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Ljava/lang/String;)V", "rootCommonSettings", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "mainButtonCommonSettings", "additionalButtonCommonSettings", "closeIconCommonSettings", "onBind", "", "item", "setTitle", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "setSubtitle", "subtitle", "handleAction", "common", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DSDisclaimerHolder extends AtomV3<DisclaimerDTO, DisclaimerView> {
    private CommonControlSettings additionalButtonCommonSettings;
    private CommonControlSettings closeIconCommonSettings;
    private CommonControlSettings mainButtonCommonSettings;
    private CommonControlSettings rootCommonSettings;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DSDisclaimerHolder(@NotNull DisclaimerView view, String str) {
        super(view, str);
        Intrinsics.checkNotNullParameter(view, "view");
        view.setOnClickListener(new a(this, 10));
        view.getMainButtonView().setOnClickListener(new ViewOnClickListenerC2975b(this, 9));
        view.getAdditionalButtonView().setOnClickListener(new AU.a(this, 7));
        view.getCloseIconView().setOnClickListener(new Nt.a(this, 8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(DSDisclaimerHolder dSDisclaimerHolder, View view) {
        CommonControlSettings commonControlSettings = dSDisclaimerHolder.rootCommonSettings;
        if (commonControlSettings != null) {
            dSDisclaimerHolder.handleAction(commonControlSettings);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$3(DSDisclaimerHolder dSDisclaimerHolder, View view) {
        CommonControlSettings commonControlSettings = dSDisclaimerHolder.mainButtonCommonSettings;
        if (commonControlSettings != null) {
            dSDisclaimerHolder.handleAction(commonControlSettings);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$5(DSDisclaimerHolder dSDisclaimerHolder, View view) {
        CommonControlSettings commonControlSettings = dSDisclaimerHolder.additionalButtonCommonSettings;
        if (commonControlSettings != null) {
            dSDisclaimerHolder.handleAction(commonControlSettings);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$7(DSDisclaimerHolder dSDisclaimerHolder, View view) {
        CommonControlSettings commonControlSettings = dSDisclaimerHolder.closeIconCommonSettings;
        if (commonControlSettings != null) {
            dSDisclaimerHolder.handleAction(commonControlSettings);
        }
    }

    private final void handleAction(CommonControlSettings common) {
        AtomAction atomAction;
        AtomActionDTO action = common.getAction();
        if (action != null && (atomAction = AtomActionMapperKt.toAtomAction(action, common.getTrackingInfo())) != null) {
            handleAction(atomAction);
            return;
        }
        Object parent = getContainerView().getParent();
        View view = parent instanceof View ? (View) parent : null;
        if (view != null) {
            view.callOnClick();
        }
    }

    private final void setSubtitle(OzonSpannableString subtitle) {
        getContainerView().getSubtitleView().setVisibility(subtitle == null || subtitle.length() == 0 ? 8 : 0);
        TextAtomV2View subtitleView = getContainerView().getSubtitleView();
        if (subtitle != null) {
            OzonSpannableStringExtKt.applyUnderlineFlag(subtitle, getContext());
        } else {
            subtitle = null;
        }
        subtitleView.setText(subtitle);
        getContainerView().getSubtitleView().setMovementMethod(LinkMovementMethod.getInstance());
    }

    private final void setTitle(OzonSpannableString title) {
        getContainerView().getTitleView().setVisibility(title == null || title.length() == 0 ? 8 : 0);
        TextAtomV2View titleView = getContainerView().getTitleView();
        if (title != null) {
            OzonSpannableStringExtKt.applyUnderlineFlag(title, getContext());
        } else {
            title = null;
        }
        titleView.setText(title);
        getContainerView().getTitleView().setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00bc, code lost:
    
        if (r1 == null) goto L38;
     */
    @Override // ru.ozon.uni.atoms.v3.AtomV3, ru.ozon.uni.atoms.af.Atom
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onBind(@NotNull DisclaimerDTO item) {
        DisclaimerView.ButtonsStyle buttonsStyle;
        DisclaimerDTO.ButtonTheme theme;
        OzonSpannableString title;
        Intrinsics.checkNotNullParameter(item, "item");
        super.onBind((DSDisclaimerHolder) item);
        DisclaimerView containerView = getContainerView();
        DisclaimerStyle.Companion companion = DisclaimerStyle.INSTANCE;
        Context context = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        containerView.setStyle(companion.disclaimerThemeToStyle(context, item.getTheme(), item.getIcon()));
        containerView.getIconView().setVisibility(!Intrinsics.d(item.getHideIcon(), Boolean.TRUE) ? 0 : 8);
        setTitle(item.getTitle());
        setSubtitle(item.getSubtitle());
        CommonControlSettings common = item.getCommon();
        containerView.setDisclaimerClickable((common != null ? common.getAction() : null) != null);
        containerView.getCloseIconView().setVisibility(item.getCloseButton() != null && !containerView.getIsDisclaimerClickable() ? 0 : 8);
        containerView.getChevronView().setVisibility((!containerView.getIsDisclaimerClickable() || (title = item.getTitle()) == null || title.length() == 0) ? false : true ? 0 : 8);
        DisclaimerDTO.MainButton mainButton = item.getMainButton();
        if (mainButton != null && (theme = mainButton.getTheme()) != null) {
            Context context2 = containerView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            buttonsStyle = DSDisclaimerHolderKt.toUiButtonStyle(theme, context2, item.getMainButton().getCustomTheme());
        }
        buttonsStyle = DisclaimerView.ButtonsStyle.Base.INSTANCE;
        DisclaimerDTO.MainButton mainButton2 = item.getMainButton();
        containerView.setMainButton(mainButton2 != null ? mainButton2.getTitle() : null, buttonsStyle);
        DisclaimerDTO.AdditionalButton additionalButton = item.getAdditionalButton();
        containerView.setAdditionalTitleButton(additionalButton != null ? additionalButton.getTitle() : null);
        this.rootCommonSettings = item.getCommon();
        this.closeIconCommonSettings = item.getCloseButton();
        DisclaimerDTO.MainButton mainButton3 = item.getMainButton();
        this.mainButtonCommonSettings = mainButton3 != null ? mainButton3.getCommon() : null;
        DisclaimerDTO.AdditionalButton additionalButton2 = item.getAdditionalButton();
        this.additionalButtonCommonSettings = additionalButton2 != null ? additionalButton2.getCommon() : null;
        containerView.setConstraints$uni_release();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DSDisclaimerHolder(@NotNull Context context, String str) {
        this(new DisclaimerView(context, null, 0, 0, 14, null), str);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
