package ru.ozon.app.android.session.security.presentation;

import EJ.a;
import Sc.o;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;
import androidx.lifecycle.J;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.material.switchmaterial.SwitchMaterial;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.session.databinding.UserAuthBiometrySettingBinding;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@Metadata(d1 = {"\u0000\u007f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003*\u00018\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B)\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001c\u001a\u00020\u001b*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010\u001e\u001a\u00020\u001b*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001e\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u001bH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\"\u0010!J#\u0010'\u001a\u00020\u0010*\u00020#2\u0006\u0010$\u001a\u00020\u00192\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\u00102\u0006\u0010)\u001a\u00020\nH\u0014¢\u0006\u0004\b*\u0010+J#\u00100\u001a\u00020\u00102\u0006\u0010,\u001a\u00020\u00022\n\u0010/\u001a\u00060-j\u0002`.H\u0014¢\u0006\u0004\b0\u00101R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00102R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00103R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010&\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u00109¨\u0006:"}, d2 = {"Lru/ozon/app/android/session/security/presentation/UserAuthBiometryViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/session/security/presentation/UserAuthBiometrySettingsVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/session/security/presentation/UserAuthBiometryViewModel;", "viewModel", "Landroid/view/ViewGroup;", "rootView", "Landroidx/lifecycle/J;", "viewOwner", "<init>", "(Landroid/view/View;Lru/ozon/app/android/session/security/presentation/UserAuthBiometryViewModel;Landroid/view/ViewGroup;Landroidx/lifecycle/J;)V", "Lru/ozon/app/android/session/security/presentation/UserAuthBiometryEvent;", "event", "", "onEvent", "(Lru/ozon/app/android/session/security/presentation/UserAuthBiometryEvent;)V", "Lru/ozon/app/android/session/security/presentation/Success;", "onSuccessEvent", "(Lru/ozon/app/android/session/security/presentation/Success;)V", "Lru/ozon/app/android/session/security/presentation/Failure;", "onFailureEvent", "(Lru/ozon/app/android/session/security/presentation/Failure;)V", "", "biometryEnabled", "", "getFailureMessage", "(Lru/ozon/app/android/session/security/presentation/UserAuthBiometrySettingsVO;Z)Ljava/lang/String;", "getSuccessMessage", "message", "showSuccess", "(Ljava/lang/String;)V", "showError", "Landroidx/appcompat/widget/SwitchCompat;", "isChecked", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "preformSetChecked", "(Landroidx/appcompat/widget/SwitchCompat;ZLandroid/widget/CompoundButton$OnCheckedChangeListener;)V", "lifecycle", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/session/security/presentation/UserAuthBiometrySettingsVO;Ll20/d;)V", "Lru/ozon/app/android/session/security/presentation/UserAuthBiometryViewModel;", "Landroid/view/ViewGroup;", "Landroidx/lifecycle/J;", "Lru/ozon/app/android/session/databinding/UserAuthBiometrySettingBinding;", "binding", "Lru/ozon/app/android/session/databinding/UserAuthBiometrySettingBinding;", "ru/ozon/app/android/session/security/presentation/UserAuthBiometryViewHolder$listener$1", "Lru/ozon/app/android/session/security/presentation/UserAuthBiometryViewHolder$listener$1;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UserAuthBiometryViewHolder extends k<UserAuthBiometrySettingsVO> {

    @NotNull
    private final UserAuthBiometrySettingBinding binding;

    @NotNull
    private final UserAuthBiometryViewHolder$listener$1 listener;
    private final ViewGroup rootView;

    @NotNull
    private final UserAuthBiometryViewModel viewModel;

    @NotNull
    private final J viewOwner;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v2, types: [ru.ozon.app.android.session.security.presentation.UserAuthBiometryViewHolder$listener$1] */
    public UserAuthBiometryViewHolder(@NotNull View containerView, @NotNull UserAuthBiometryViewModel viewModel, ViewGroup viewGroup, @NotNull J viewOwner) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(viewOwner, "viewOwner");
        this.viewModel = viewModel;
        this.rootView = viewGroup;
        this.viewOwner = viewOwner;
        UserAuthBiometrySettingBinding bind = UserAuthBiometrySettingBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.listener = new CompoundButton.OnCheckedChangeListener() { // from class: ru.ozon.app.android.session.security.presentation.UserAuthBiometryViewHolder$listener$1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                UserAuthBiometryViewModel userAuthBiometryViewModel;
                UserAuthBiometrySettingsVO boundedData = UserAuthBiometryViewHolder.this.getBoundedData();
                if (boundedData == null) {
                    return;
                }
                userAuthBiometryViewModel = UserAuthBiometryViewHolder.this.viewModel;
                userAuthBiometryViewModel.onToggleChecked(isChecked, boundedData.getAnalyticTag());
            }
        };
        this.itemView.setOnClickListener(new a(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(UserAuthBiometryViewHolder userAuthBiometryViewHolder, View view) {
        userAuthBiometryViewHolder.binding.toggleSw.toggle();
    }

    private final String getFailureMessage(UserAuthBiometrySettingsVO userAuthBiometrySettingsVO, boolean z11) {
        ToggleSettingVO toggle = userAuthBiometrySettingsVO.getToggle();
        return z11 ? toggle.getFailureOff() : toggle.getFailureOn();
    }

    private final String getSuccessMessage(UserAuthBiometrySettingsVO userAuthBiometrySettingsVO, boolean z11) {
        ToggleSettingVO toggle = userAuthBiometrySettingsVO.getToggle();
        return z11 ? toggle.getSuccessOn() : toggle.getSuccessOff();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onEvent(UserAuthBiometryEvent event) {
        if (event instanceof Success) {
            onSuccessEvent((Success) event);
        } else {
            if (!(event instanceof Failure)) {
                throw new o();
            }
            onFailureEvent((Failure) event);
        }
    }

    private final void onFailureEvent(Failure event) {
        boolean biometryEnabled = event.getBiometryEnabled();
        SwitchMaterial toggleSw = this.binding.toggleSw;
        Intrinsics.checkNotNullExpressionValue(toggleSw, "toggleSw");
        preformSetChecked(toggleSw, biometryEnabled, this.listener);
        UserAuthBiometrySettingsVO boundedData = getBoundedData();
        if (boundedData == null) {
            return;
        }
        showError(getFailureMessage(boundedData, biometryEnabled));
    }

    private final void onSuccessEvent(Success event) {
        UserAuthBiometrySettingsVO boundedData = getBoundedData();
        if (boundedData == null) {
            return;
        }
        showSuccess(getSuccessMessage(boundedData, event.getBiometryEnabled()));
    }

    private final void preformSetChecked(SwitchCompat switchCompat, boolean z11, CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        switchCompat.setOnCheckedChangeListener(null);
        switchCompat.setChecked(z11);
        switchCompat.setOnCheckedChangeListener(onCheckedChangeListener);
    }

    private final void showError(String message) {
        ViewGroup viewGroup = this.rootView;
        if (viewGroup != null) {
            FlashbarFactory.createDefaultError$default(FlashbarFactory.INSTANCE, viewGroup, null, message, null, 3000L, null, this.viewOwner, 42, null).show();
        }
    }

    private final void showSuccess(String message) {
        ViewGroup viewGroup = this.rootView;
        if (viewGroup != null) {
            FlashbarFactory.create$default(FlashbarFactory.INSTANCE, viewGroup, null, OzonSpannableStringKt.toOzonSpannableString(message), null, null, Integer.valueOf(R$drawable.ic_check_green), null, null, null, null, null, null, null, 3000L, null, null, this.viewOwner, 57306, null).show();
        }
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onAttachViewModel(@NotNull J lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        this.viewModel.getEventsLiveData().observe(lifecycle, new UserAuthBiometryViewHolder$sam$androidx_lifecycle_Observer$0(new UserAuthBiometryViewHolder$onAttachViewModel$1(this)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull UserAuthBiometrySettingsVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        UserAuthBiometrySettingBinding userAuthBiometrySettingBinding = this.binding;
        userAuthBiometrySettingBinding.titleTav.setText(item.getTitle());
        userAuthBiometrySettingBinding.subtitleTav.setText(item.getSubtitle());
        TextAtomView subtitleTav = userAuthBiometrySettingBinding.subtitleTav;
        Intrinsics.checkNotNullExpressionValue(subtitleTav, "subtitleTav");
        subtitleTav.setVisibility(item.getSubtitle() != null ? 0 : 8);
        SwitchMaterial toggleSw = userAuthBiometrySettingBinding.toggleSw;
        Intrinsics.checkNotNullExpressionValue(toggleSw, "toggleSw");
        preformSetChecked(toggleSw, item.getIsSelected(), this.listener);
    }
}
