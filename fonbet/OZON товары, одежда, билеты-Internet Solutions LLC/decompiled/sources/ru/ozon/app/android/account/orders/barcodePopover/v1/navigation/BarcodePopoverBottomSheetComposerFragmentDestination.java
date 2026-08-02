package ru.ozon.app.android.account.orders.barcodePopover.v1.navigation;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.navigations.destinations.ComposerScreenContainer;
import ru.ozon.app.android.composer.universalscreen.view.BottomSheetComposerFragment;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import sZ.c;
import uZ.C9992d;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002BQ\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR%\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/account/orders/barcodePopover/v1/navigation/BarcodePopoverBottomSheetComposerFragmentDestination;", "LuZ/d;", "Lru/ozon/app/android/composer/navigations/destinations/ComposerScreenContainer;", "", "deeplink", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "screenConfig", "LuZ/d$b;", "navigationMode", "Lru/ozon/app/android/composer/universalscreen/view/BottomSheetComposerFragment$OverrideDisplayMode;", "overrideDisplayMode", "", "requestCode", "Lkotlin/Function1;", "Landroid/os/Bundle;", "", "additionalArgsProvider", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;LuZ/d$b;Lru/ozon/app/android/composer/universalscreen/view/BottomSheetComposerFragment$OverrideDisplayMode;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;)V", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getDeeplink", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "getScreenConfig", "()Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "Ljava/lang/Integer;", "getRequestCode", "()Ljava/lang/Integer;", "Lkotlin/jvm/functions/Function1;", "getAdditionalArgsProvider", "()Lkotlin/jvm/functions/Function1;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BarcodePopoverBottomSheetComposerFragmentDestination extends C9992d implements ComposerScreenContainer {
    public static final int $stable = ComposerScreenConfig.$stable;
    private final Function1<Bundle, Unit> additionalArgsProvider;

    @NotNull
    private final String deeplink;
    private final Integer requestCode;

    @NotNull
    private final ComposerScreenConfig screenConfig;

    public /* synthetic */ BarcodePopoverBottomSheetComposerFragmentDestination(String str, ComposerScreenConfig composerScreenConfig, C9992d.b bVar, BottomSheetComposerFragment.OverrideDisplayMode overrideDisplayMode, Integer num, Function1 function1, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, composerScreenConfig, (i11 & 4) != 0 ? C9992d.b.a.f100436a : bVar, (i11 & 8) != 0 ? null : overrideDisplayMode, (i11 & 16) != 0 ? null : num, (i11 & 32) != 0 ? null : function1);
    }

    @Override // ru.ozon.app.android.composer.navigations.destinations.ComposerScreenContainer
    @NotNull
    public ComposerScreenConfig getScreenConfig() {
        return this.screenConfig;
    }

    @Override // uZ.C9992d
    @NotNull
    public String toString() {
        return "BarcodePopoverBottomSheetComposerFragmentDestination(deeplink='" + this.deeplink + "', screenConfig=" + getScreenConfig() + ") and parent: " + super.toString();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BarcodePopoverBottomSheetComposerFragmentDestination(@NotNull String deeplink, @NotNull ComposerScreenConfig screenConfig, @NotNull C9992d.b navigationMode, BottomSheetComposerFragment.OverrideDisplayMode overrideDisplayMode, Integer num, Function1<? super Bundle, Unit> function1) {
        super(new c(deeplink, BarcodePopoverBottomSheetComposerFragment.INSTANCE.newInstance(screenConfig, overrideDisplayMode, navigationMode, function1), num, false, false, null, false, false, false, 504, null), navigationMode);
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(screenConfig, "screenConfig");
        Intrinsics.checkNotNullParameter(navigationMode, "navigationMode");
        this.deeplink = deeplink;
        this.screenConfig = screenConfig;
        this.requestCode = num;
        this.additionalArgsProvider = function1;
    }
}
