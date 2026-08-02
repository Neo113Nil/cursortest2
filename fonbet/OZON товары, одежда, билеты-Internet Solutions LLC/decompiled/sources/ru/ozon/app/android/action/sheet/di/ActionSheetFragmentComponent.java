package ru.ozon.app.android.action.sheet.di;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.action.sheet.ActionSheetFragment;
import ru.ozon.app.android.composer.di.ComposerComponentApi;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/action/sheet/di/ActionSheetFragmentComponent;", "", "inject", "", "screen", "Lru/ozon/app/android/action/sheet/ActionSheetFragment;", "Factory", "action_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface ActionSheetFragmentComponent {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lru/ozon/app/android/action/sheet/di/ActionSheetFragmentComponent$Factory;", "", "create", "Lru/ozon/app/android/action/sheet/di/ActionSheetFragmentComponent;", "composerComponentApi", "Lru/ozon/app/android/composer/di/ComposerComponentApi;", "actionComponentApi", "Lru/ozon/app/android/action/di/ActionComponentApi;", "action_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Factory {
        @NotNull
        ActionSheetFragmentComponent create(@NotNull ComposerComponentApi composerComponentApi, @NotNull ActionComponentApi actionComponentApi);
    }

    void inject(@NotNull ActionSheetFragment screen);
}
