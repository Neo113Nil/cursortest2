package ru.ozon.app.android.fresh.feature.b2b.widgets.edodatepicker.presentation;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/edodatepicker/presentation/EdoDateSingleEvent;", "", "OpenStartDatePicker", "OpenEndDatePicker", "Lru/ozon/app/android/fresh/feature/b2b/widgets/edodatepicker/presentation/EdoDateSingleEvent$OpenEndDatePicker;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/edodatepicker/presentation/EdoDateSingleEvent$OpenStartDatePicker;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface EdoDateSingleEvent {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/edodatepicker/presentation/EdoDateSingleEvent$OpenEndDatePicker;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/edodatepicker/presentation/EdoDateSingleEvent;", "<init>", "()V", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OpenEndDatePicker implements EdoDateSingleEvent {

        @NotNull
        public static final OpenEndDatePicker INSTANCE = new OpenEndDatePicker();

        private OpenEndDatePicker() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/edodatepicker/presentation/EdoDateSingleEvent$OpenStartDatePicker;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/edodatepicker/presentation/EdoDateSingleEvent;", "<init>", "()V", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OpenStartDatePicker implements EdoDateSingleEvent {

        @NotNull
        public static final OpenStartDatePicker INSTANCE = new OpenStartDatePicker();

        private OpenStartDatePicker() {
        }
    }
}
