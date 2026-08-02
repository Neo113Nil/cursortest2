package ru.ozon.app.android.fresh.cart.widgets.cartControls.presentation;

import android.content.SharedPreferences;
import h20.InterfaceC6786a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u00132\u00060\u0001j\u0002`\u0002:\u0001\u0013B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0012¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/cartControls/presentation/CartControlsViewModel;", "Lh20/a;", "Lru/ozon/app/android/composer/viewmodel/ComposerWidgetViewModel;", "Landroid/content/SharedPreferences;", "sharedPreferences", "<init>", "(Landroid/content/SharedPreferences;)V", "", "key", "Lorg/joda/time/DateTime;", "timeStamp", "", "updateTimeStamp", "(Ljava/lang/String;Lorg/joda/time/DateTime;)V", "Lkotlin/Function0;", "onSuccess", "validateTooltip", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lkotlin/jvm/functions/Function0;)V", "Landroid/content/SharedPreferences;", "Companion", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CartControlsViewModel implements InterfaceC6786a {

    @NotNull
    private final SharedPreferences sharedPreferences;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/cartControls/presentation/CartControlsViewModel$Companion;", "", "<init>", "()V", "EMPTY_TIMESTAMP", "", "UPDATE_PERIOD_MILLIS", "", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public CartControlsViewModel(@NotNull SharedPreferences sharedPreferences) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        this.sharedPreferences = sharedPreferences;
    }

    private final void updateTimeStamp(String key, DateTime timeStamp) {
        SharedPreferences.Editor edit = this.sharedPreferences.edit();
        edit.putString(key, timeStamp.toString());
        edit.apply();
    }

    @Override // h20.InterfaceC6786a
    public void onCleared() {
    }

    public final void validateTooltip(@NotNull String key, @NotNull DateTime timeStamp, @NotNull Function0<Unit> onSuccess) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(timeStamp, "timeStamp");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        String string = this.sharedPreferences.getString(key, "");
        if (Intrinsics.d(string, "")) {
            updateTimeStamp(key, timeStamp);
            onSuccess.invoke();
            return;
        }
        if (timeStamp.getMillis() - DateTime.i(string).getMillis() < 259200000) {
            return;
        }
        updateTimeStamp(key, timeStamp);
        onSuccess.invoke();
    }
}
