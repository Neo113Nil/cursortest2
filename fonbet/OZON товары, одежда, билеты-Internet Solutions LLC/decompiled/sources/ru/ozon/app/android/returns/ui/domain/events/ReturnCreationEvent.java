package ru.ozon.app.android.returns.ui.domain.events;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/returns/ui/domain/events/ReturnCreationEvent;", "", "ItemRemoved", "PhotoUpdated", "Lru/ozon/app/android/returns/ui/domain/events/ReturnCreationEvent$ItemRemoved;", "Lru/ozon/app/android/returns/ui/domain/events/ReturnCreationEvent$PhotoUpdated;", "returns_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface ReturnCreationEvent {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/returns/ui/domain/events/ReturnCreationEvent$ItemRemoved;", "Lru/ozon/app/android/returns/ui/domain/events/ReturnCreationEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "returns_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ItemRemoved implements ReturnCreationEvent {

        @NotNull
        public static final ItemRemoved INSTANCE = new ItemRemoved();

        private ItemRemoved() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof ItemRemoved);
        }

        public int hashCode() {
            return -1760498667;
        }

        @NotNull
        public String toString() {
            return "ItemRemoved";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/returns/ui/domain/events/ReturnCreationEvent$PhotoUpdated;", "Lru/ozon/app/android/returns/ui/domain/events/ReturnCreationEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "returns_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PhotoUpdated implements ReturnCreationEvent {

        @NotNull
        public static final PhotoUpdated INSTANCE = new PhotoUpdated();

        private PhotoUpdated() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof PhotoUpdated);
        }

        public int hashCode() {
            return -1719286559;
        }

        @NotNull
        public String toString() {
            return "PhotoUpdated";
        }
    }
}
