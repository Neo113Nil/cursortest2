package ru.ozon.app.android.product.molecules.countbutton.presentation;

import Ae.InterfaceC2395h;
import h20.InterfaceC6786a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.sheet.DisposableActionHandler;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00060\u0001j\u0002`\u0002J\u0019\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H&¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/product/molecules/countbutton/presentation/CountButtonViewModel;", "Lh20/a;", "Lru/ozon/app/android/composer/viewmodel/ComposerWidgetViewModel;", "Lru/ozon/app/android/product/molecules/countbutton/presentation/CountButtonVO;", "vo", "", "attach", "(Lru/ozon/app/android/product/molecules/countbutton/presentation/CountButtonVO;)V", "detach", "()V", "Lru/ozon/app/android/action/sheet/DisposableActionHandler;", "actionHandler", "onButtonClicked", "(Lru/ozon/app/android/action/sheet/DisposableActionHandler;)V", "LAe/h;", "Lru/ozon/app/android/product/molecules/countbutton/presentation/ButtonState;", "getButtonState", "()LAe/h;", "buttonState", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface CountButtonViewModel extends InterfaceC6786a {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void onCleared(@NotNull CountButtonViewModel countButtonViewModel) {
        }
    }

    void attach(CountButtonVO vo);

    void detach();

    @NotNull
    InterfaceC2395h<ButtonState> getButtonState();

    void onButtonClicked(DisposableActionHandler actionHandler);
}
