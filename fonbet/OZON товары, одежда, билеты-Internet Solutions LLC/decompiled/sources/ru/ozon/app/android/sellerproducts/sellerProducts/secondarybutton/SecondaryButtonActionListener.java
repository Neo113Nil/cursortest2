package ru.ozon.app.android.sellerproducts.sellerProducts.secondarybutton;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.favorites.domain.bottomsheet.ActionListener;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.bottomsheet.MessagesProcessor;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J=\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0002\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/sellerproducts/sellerProducts/secondarybutton/SecondaryButtonActionListener;", "Lru/ozon/app/android/favorites/domain/bottomsheet/ActionListener;", "references", "Lru/ozon/app/android/composer/ComposerReferences;", "messagesProcessor", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/bottomsheet/MessagesProcessor;", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/bottomsheet/MessagesProcessor;)V", "onMessageReceived", "", "message", "", "duration", "", "icon", "", "actionTitle", "actionDeeplink", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "onErrorReceived", "errorMessage", "sellerproducts_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SecondaryButtonActionListener implements ActionListener {

    @NotNull
    private final MessagesProcessor messagesProcessor;

    @NotNull
    private final ComposerReferences references;

    public SecondaryButtonActionListener(@NotNull ComposerReferences references, @NotNull MessagesProcessor messagesProcessor) {
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(messagesProcessor, "messagesProcessor");
        this.references = references;
        this.messagesProcessor = messagesProcessor;
    }

    @Override // ru.ozon.app.android.favorites.domain.bottomsheet.ActionListener
    public void onErrorReceived(@NotNull String errorMessage) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        this.messagesProcessor.showError(this.references.getContainer().g(), this.references.getContainer().i(), errorMessage);
    }

    @Override // ru.ozon.app.android.favorites.domain.bottomsheet.ActionListener
    public void onMessageReceived(@NotNull String message, Long duration, Integer icon, String actionTitle, String actionDeeplink) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.messagesProcessor.showMessage(this.references.getContainer().g(), this.references.getContainer().i(), message, duration, icon, actionTitle, actionDeeplink);
    }
}
