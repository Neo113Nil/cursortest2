package ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.photos.viewModel;

import H3.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.photos.recycler.PhotoItem;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/photos/viewModel/PhotosViewState;", "", "Disclaimer", "EmptyState", "Photos", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/photos/viewModel/PhotosViewState$Disclaimer;", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/photos/viewModel/PhotosViewState$EmptyState;", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/photos/viewModel/PhotosViewState$Photos;", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface PhotosViewState {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/photos/viewModel/PhotosViewState$Disclaimer;", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/photos/viewModel/PhotosViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Disclaimer implements PhotosViewState {

        @NotNull
        public static final Disclaimer INSTANCE = new Disclaimer();

        private Disclaimer() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Disclaimer);
        }

        public int hashCode() {
            return -803026387;
        }

        @NotNull
        public String toString() {
            return "Disclaimer";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/photos/viewModel/PhotosViewState$EmptyState;", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/photos/viewModel/PhotosViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class EmptyState implements PhotosViewState {

        @NotNull
        public static final EmptyState INSTANCE = new EmptyState();

        private EmptyState() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof EmptyState);
        }

        public int hashCode() {
            return 1989340118;
        }

        @NotNull
        public String toString() {
            return "EmptyState";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/photos/viewModel/PhotosViewState$Photos;", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/photos/viewModel/PhotosViewState;", "", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/photos/recycler/PhotoItem;", "photos", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getPhotos", "()Ljava/util/List;", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Photos implements PhotosViewState {

        @NotNull
        private final List<PhotoItem> photos;

        public Photos(@NotNull List<PhotoItem> photos) {
            Intrinsics.checkNotNullParameter(photos, "photos");
            this.photos = photos;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Photos) && Intrinsics.d(this.photos, ((Photos) other).photos);
        }

        @NotNull
        public final List<PhotoItem> getPhotos() {
            return this.photos;
        }

        public int hashCode() {
            return this.photos.hashCode();
        }

        @NotNull
        public String toString() {
            return c.a("Photos(photos=", ")", this.photos);
        }
    }
}
