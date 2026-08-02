package ru.ozon.app.android.fresh.unsorted.widgets.recShelf.presentation;

import B0.A0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.product.skuthinscroll.data.SkuThinScrollDTO;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\b\tB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/recShelf/presentation/RecShelfState;", "", "shelfId", "", "<init>", "(Ljava/lang/String;)V", "getShelfId", "()Ljava/lang/String;", "Close", "ShowSkus", "Lru/ozon/app/android/fresh/unsorted/widgets/recShelf/presentation/RecShelfState$Close;", "Lru/ozon/app/android/fresh/unsorted/widgets/recShelf/presentation/RecShelfState$ShowSkus;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class RecShelfState {

    @NotNull
    private final String shelfId;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/recShelf/presentation/RecShelfState$Close;", "Lru/ozon/app/android/fresh/unsorted/widgets/recShelf/presentation/RecShelfState;", "", "shelfId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getShelfId", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Close extends RecShelfState {

        @NotNull
        private final String shelfId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Close(@NotNull String shelfId) {
            super(shelfId, null);
            Intrinsics.checkNotNullParameter(shelfId, "shelfId");
            this.shelfId = shelfId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Close) && Intrinsics.d(this.shelfId, ((Close) other).shelfId);
        }

        @Override // ru.ozon.app.android.fresh.unsorted.widgets.recShelf.presentation.RecShelfState
        @NotNull
        public String getShelfId() {
            return this.shelfId;
        }

        public int hashCode() {
            return this.shelfId.hashCode();
        }

        @NotNull
        public String toString() {
            return A0.b("Close(shelfId=", this.shelfId, ")");
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/recShelf/presentation/RecShelfState$ShowSkus;", "Lru/ozon/app/android/fresh/unsorted/widgets/recShelf/presentation/RecShelfState;", "", "shelfId", "Lru/ozon/app/android/product/skuthinscroll/data/SkuThinScrollDTO;", "shelf", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/product/skuthinscroll/data/SkuThinScrollDTO;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getShelfId", "Lru/ozon/app/android/product/skuthinscroll/data/SkuThinScrollDTO;", "getShelf", "()Lru/ozon/app/android/product/skuthinscroll/data/SkuThinScrollDTO;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ShowSkus extends RecShelfState {

        @NotNull
        private final SkuThinScrollDTO shelf;

        @NotNull
        private final String shelfId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowSkus(@NotNull String shelfId, @NotNull SkuThinScrollDTO shelf) {
            super(shelfId, null);
            Intrinsics.checkNotNullParameter(shelfId, "shelfId");
            Intrinsics.checkNotNullParameter(shelf, "shelf");
            this.shelfId = shelfId;
            this.shelf = shelf;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShowSkus)) {
                return false;
            }
            ShowSkus showSkus = (ShowSkus) other;
            return Intrinsics.d(this.shelfId, showSkus.shelfId) && Intrinsics.d(this.shelf, showSkus.shelf);
        }

        @NotNull
        public final SkuThinScrollDTO getShelf() {
            return this.shelf;
        }

        @Override // ru.ozon.app.android.fresh.unsorted.widgets.recShelf.presentation.RecShelfState
        @NotNull
        public String getShelfId() {
            return this.shelfId;
        }

        public int hashCode() {
            return this.shelf.hashCode() + (this.shelfId.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "ShowSkus(shelfId=" + this.shelfId + ", shelf=" + this.shelf + ")";
        }
    }

    public /* synthetic */ RecShelfState(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @NotNull
    public String getShelfId() {
        return this.shelfId;
    }

    private RecShelfState(String str) {
        this.shelfId = str;
    }
}
