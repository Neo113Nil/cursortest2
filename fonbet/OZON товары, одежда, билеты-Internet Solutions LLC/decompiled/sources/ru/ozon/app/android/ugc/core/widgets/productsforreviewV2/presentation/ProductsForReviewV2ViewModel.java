package ru.ozon.app.android.ugc.core.widgets.productsforreviewV2.presentation;

import Ae.C2399j;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import C.C2702w;
import android.content.SharedPreferences;
import androidx.lifecycle.w0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.uikit.R$string;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import xe.C10727i;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 $2\u00020\u0001:\u0001$B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0010J7\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00142\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e0\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\b0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\b0\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/productsforreviewV2/presentation/ProductsForReviewV2ViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "Landroid/content/SharedPreferences;", "sharedPreferences", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;Landroid/content/SharedPreferences;)V", "", "showOnboardingIfNeeded", "()Z", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "createComposerActionError", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "", "bind", "()V", "onOnboardingShown", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "action", "Lkotlin/Function0;", "onSuccess", "Lkotlin/Function1;", "onError", "onComposerAction", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "Landroid/content/SharedPreferences;", "LAe/x0;", "_shouldShowOnboarding", "LAe/x0;", "LAe/M0;", "shouldShowOnboarding", "LAe/M0;", "getShouldShowOnboarding", "()LAe/M0;", "Companion", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ProductsForReviewV2ViewModel extends w0 {

    @NotNull
    private final x0<Boolean> _shouldShowOnboarding;

    @NotNull
    private final ActionV2Repository actionV2Repository;

    @NotNull
    private final SharedPreferences sharedPreferences;

    @NotNull
    private final M0<Boolean> shouldShowOnboarding;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/productsforreviewV2/presentation/ProductsForReviewV2ViewModel$Companion;", "", "<init>", "()V", "SWIPE_ONBOARDING_KEY", "", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public ProductsForReviewV2ViewModel(@NotNull ActionV2Repository actionV2Repository, @NotNull SharedPreferences sharedPreferences) {
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        this.actionV2Repository = actionV2Repository;
        this.sharedPreferences = sharedPreferences;
        x0<Boolean> a11 = O0.a(Boolean.FALSE);
        this._shouldShowOnboarding = a11;
        this.shouldShowOnboarding = C2399j.b(a11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NotificationDTO createComposerActionError() {
        return new NotificationDTO(StringProvider.getString(R$string.error_common_error_technical_error_title), StringProvider.getString(ru.ozon.app.android.common.actionHandlers.R$string.common_try_again_android), null, null, null, new NotificationDTO.RightContent(NotificationDTO.RightContent.ButtonType.CLOSE, null, null, null, 14, null), null, null, null, NotificationDTO.Preset.WARNING, 476, null);
    }

    private final boolean showOnboardingIfNeeded() {
        boolean z11 = this.sharedPreferences.getBoolean("PFRV2_SWIPE_ONBOARDING", true);
        if (z11) {
            C2702w.e(this.sharedPreferences, "PFRV2_SWIPE_ONBOARDING", false);
        }
        return z11;
    }

    public final void bind() {
        this._shouldShowOnboarding.setValue(Boolean.valueOf(showOnboardingIfNeeded()));
    }

    @NotNull
    public final M0<Boolean> getShouldShowOnboarding() {
        return this.shouldShowOnboarding;
    }

    public final void onComposerAction(@NotNull AtomAction.ComposerAction action, @NotNull Function0<Unit> onSuccess, @NotNull Function1<? super NotificationDTO, Unit> onError) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new ProductsForReviewV2ViewModel$onComposerAction$1(this, action, onSuccess, onError, null), 3);
    }

    public final void onOnboardingShown() {
        this._shouldShowOnboarding.setValue(Boolean.FALSE);
    }
}
