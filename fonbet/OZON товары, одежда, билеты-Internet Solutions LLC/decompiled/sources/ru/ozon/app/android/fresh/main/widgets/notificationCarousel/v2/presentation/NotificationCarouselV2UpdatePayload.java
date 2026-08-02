package ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.presentation;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/presentation/NotificationCarouselV2UpdatePayload;", "", "RemoveWidget", "ItemsChanged", "PaddingsChanged", "ScheduleTimeChanged", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/presentation/NotificationCarouselV2UpdatePayload$ItemsChanged;", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/presentation/NotificationCarouselV2UpdatePayload$PaddingsChanged;", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/presentation/NotificationCarouselV2UpdatePayload$RemoveWidget;", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/presentation/NotificationCarouselV2UpdatePayload$ScheduleTimeChanged;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface NotificationCarouselV2UpdatePayload {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/presentation/NotificationCarouselV2UpdatePayload$ItemsChanged;", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/presentation/NotificationCarouselV2UpdatePayload;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ItemsChanged implements NotificationCarouselV2UpdatePayload {

        @NotNull
        public static final ItemsChanged INSTANCE = new ItemsChanged();

        private ItemsChanged() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof ItemsChanged);
        }

        public int hashCode() {
            return 2039811482;
        }

        @NotNull
        public String toString() {
            return "ItemsChanged";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/presentation/NotificationCarouselV2UpdatePayload$PaddingsChanged;", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/presentation/NotificationCarouselV2UpdatePayload;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PaddingsChanged implements NotificationCarouselV2UpdatePayload {

        @NotNull
        public static final PaddingsChanged INSTANCE = new PaddingsChanged();

        private PaddingsChanged() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof PaddingsChanged);
        }

        public int hashCode() {
            return 907038028;
        }

        @NotNull
        public String toString() {
            return "PaddingsChanged";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/presentation/NotificationCarouselV2UpdatePayload$RemoveWidget;", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/presentation/NotificationCarouselV2UpdatePayload;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RemoveWidget implements NotificationCarouselV2UpdatePayload {

        @NotNull
        public static final RemoveWidget INSTANCE = new RemoveWidget();

        private RemoveWidget() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof RemoveWidget);
        }

        public int hashCode() {
            return -236781906;
        }

        @NotNull
        public String toString() {
            return "RemoveWidget";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/presentation/NotificationCarouselV2UpdatePayload$ScheduleTimeChanged;", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/presentation/NotificationCarouselV2UpdatePayload;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ScheduleTimeChanged implements NotificationCarouselV2UpdatePayload {

        @NotNull
        public static final ScheduleTimeChanged INSTANCE = new ScheduleTimeChanged();

        private ScheduleTimeChanged() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof ScheduleTimeChanged);
        }

        public int hashCode() {
            return 1725430410;
        }

        @NotNull
        public String toString() {
            return "ScheduleTimeChanged";
        }
    }
}
