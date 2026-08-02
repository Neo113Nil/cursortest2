package ru.ozon.app.android.returns.creation.widgets.photoPicker.repository;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/Error;", "", "FlashBar", "DefaultFlashbar", "Disclaimer", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/Error$DefaultFlashbar;", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/Error$Disclaimer;", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/Error$FlashBar;", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface Error {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/Error$DefaultFlashbar;", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/Error;", "<init>", "()V", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultFlashbar implements Error {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/Error$Disclaimer;", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/Error;", "<init>", "()V", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Disclaimer implements Error {
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/Error$FlashBar;", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/Error;", "message", "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FlashBar implements Error {

        @NotNull
        private final String message;

        public FlashBar(@NotNull String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
        }

        @NotNull
        public final String getMessage() {
            return this.message;
        }
    }
}
