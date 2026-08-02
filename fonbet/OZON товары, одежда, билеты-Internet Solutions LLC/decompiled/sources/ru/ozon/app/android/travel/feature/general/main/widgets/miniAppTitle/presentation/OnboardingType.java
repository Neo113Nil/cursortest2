package ru.ozon.app.android.travel.feature.general.main.widgets.miniAppTitle.presentation;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/miniAppTitle/presentation/OnboardingType;", "", "Miles", "Top", "Lru/ozon/app/android/travel/feature/general/main/widgets/miniAppTitle/presentation/OnboardingType$Miles;", "Lru/ozon/app/android/travel/feature/general/main/widgets/miniAppTitle/presentation/OnboardingType$Top;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface OnboardingType {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/miniAppTitle/presentation/OnboardingType$Miles;", "Lru/ozon/app/android/travel/feature/general/main/widgets/miniAppTitle/presentation/OnboardingType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Miles implements OnboardingType {

        @NotNull
        public static final Miles INSTANCE = new Miles();

        private Miles() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Miles);
        }

        public int hashCode() {
            return -1398217600;
        }

        @NotNull
        public String toString() {
            return "Miles";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/miniAppTitle/presentation/OnboardingType$Top;", "Lru/ozon/app/android/travel/feature/general/main/widgets/miniAppTitle/presentation/OnboardingType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Top implements OnboardingType {

        @NotNull
        public static final Top INSTANCE = new Top();

        private Top() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Top);
        }

        public int hashCode() {
            return 977321815;
        }

        @NotNull
        public String toString() {
            return "Top";
        }
    }
}
