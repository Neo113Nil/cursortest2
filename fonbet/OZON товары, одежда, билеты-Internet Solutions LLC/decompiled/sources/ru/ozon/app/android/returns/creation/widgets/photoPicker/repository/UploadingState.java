package ru.ozon.app.android.returns.creation.widgets.photoPicker.repository;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/UploadingState;", "", "Uploaded", "Loading", "Error", "Pending", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/UploadingState$Error;", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/UploadingState$Loading;", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/UploadingState$Pending;", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/UploadingState$Uploaded;", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface UploadingState {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/UploadingState$Error;", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/UploadingState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Error implements UploadingState {

        @NotNull
        public static final Error INSTANCE = new Error();

        private Error() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Error);
        }

        public int hashCode() {
            return 441805122;
        }

        @NotNull
        public String toString() {
            return "Error";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/UploadingState$Loading;", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/UploadingState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Loading implements UploadingState {

        @NotNull
        public static final Loading INSTANCE = new Loading();

        private Loading() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return 1188598262;
        }

        @NotNull
        public String toString() {
            return "Loading";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/UploadingState$Pending;", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/UploadingState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Pending implements UploadingState {

        @NotNull
        public static final Pending INSTANCE = new Pending();

        private Pending() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Pending);
        }

        public int hashCode() {
            return 169359953;
        }

        @NotNull
        public String toString() {
            return "Pending";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/UploadingState$Uploaded;", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/UploadingState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Uploaded implements UploadingState {

        @NotNull
        public static final Uploaded INSTANCE = new Uploaded();

        private Uploaded() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Uploaded);
        }

        public int hashCode() {
            return -2090400538;
        }

        @NotNull
        public String toString() {
            return "Uploaded";
        }
    }
}
