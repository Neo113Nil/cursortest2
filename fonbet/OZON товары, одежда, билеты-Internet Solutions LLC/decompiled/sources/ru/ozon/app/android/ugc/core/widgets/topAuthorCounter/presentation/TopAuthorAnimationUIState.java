package ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.presentation;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/presentation/TopAuthorAnimationUIState;", "", "Initial", "Animating", "Final", "Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/presentation/TopAuthorAnimationUIState$Animating;", "Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/presentation/TopAuthorAnimationUIState$Final;", "Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/presentation/TopAuthorAnimationUIState$Initial;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface TopAuthorAnimationUIState {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/presentation/TopAuthorAnimationUIState$Animating;", "Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/presentation/TopAuthorAnimationUIState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Animating implements TopAuthorAnimationUIState {

        @NotNull
        public static final Animating INSTANCE = new Animating();

        private Animating() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Animating);
        }

        public int hashCode() {
            return -116308261;
        }

        @NotNull
        public String toString() {
            return "Animating";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/presentation/TopAuthorAnimationUIState$Final;", "Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/presentation/TopAuthorAnimationUIState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Final implements TopAuthorAnimationUIState {

        @NotNull
        public static final Final INSTANCE = new Final();

        private Final() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Final);
        }

        public int hashCode() {
            return 1785213811;
        }

        @NotNull
        public String toString() {
            return "Final";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/presentation/TopAuthorAnimationUIState$Initial;", "Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/presentation/TopAuthorAnimationUIState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Initial implements TopAuthorAnimationUIState {

        @NotNull
        public static final Initial INSTANCE = new Initial();

        private Initial() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Initial);
        }

        public int hashCode() {
            return 405159425;
        }

        @NotNull
        public String toString() {
            return "Initial";
        }
    }
}
