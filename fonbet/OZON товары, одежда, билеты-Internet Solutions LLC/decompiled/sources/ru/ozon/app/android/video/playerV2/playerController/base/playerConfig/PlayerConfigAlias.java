package ru.ozon.app.android.video.playerV2.playerController.base.playerConfig;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\b\t\nB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/video/playerV2/playerController/base/playerConfig/PlayerConfigAlias;", "", "enableExperimentalBandwidth", "", "<init>", "(Z)V", "getEnableExperimentalBandwidth", "()Z", "Default", "ExperimentalBandwidth", "ReviewsOnly", "Lru/ozon/app/android/video/playerV2/playerController/base/playerConfig/PlayerConfigAlias$Default;", "Lru/ozon/app/android/video/playerV2/playerController/base/playerConfig/PlayerConfigAlias$ExperimentalBandwidth;", "Lru/ozon/app/android/video/playerV2/playerController/base/playerConfig/PlayerConfigAlias$ReviewsOnly;", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class PlayerConfigAlias {
    private final boolean enableExperimentalBandwidth;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/video/playerV2/playerController/base/playerConfig/PlayerConfigAlias$Default;", "Lru/ozon/app/android/video/playerV2/playerController/base/playerConfig/PlayerConfigAlias;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Default extends PlayerConfigAlias {

        @NotNull
        public static final Default INSTANCE = new Default();

        private Default() {
            super(false, null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Default);
        }

        public int hashCode() {
            return -1348493286;
        }

        @NotNull
        public String toString() {
            return "Default";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/video/playerV2/playerController/base/playerConfig/PlayerConfigAlias$ExperimentalBandwidth;", "Lru/ozon/app/android/video/playerV2/playerController/base/playerConfig/PlayerConfigAlias;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final /* data */ class ExperimentalBandwidth extends PlayerConfigAlias {

        @NotNull
        public static final ExperimentalBandwidth INSTANCE = new ExperimentalBandwidth();

        private ExperimentalBandwidth() {
            super(true, null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof ExperimentalBandwidth);
        }

        public int hashCode() {
            return -1910562110;
        }

        @NotNull
        public String toString() {
            return "ExperimentalBandwidth";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/video/playerV2/playerController/base/playerConfig/PlayerConfigAlias$ReviewsOnly;", "Lru/ozon/app/android/video/playerV2/playerController/base/playerConfig/PlayerConfigAlias;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final /* data */ class ReviewsOnly extends PlayerConfigAlias {

        @NotNull
        public static final ReviewsOnly INSTANCE = new ReviewsOnly();

        private ReviewsOnly() {
            super(false, null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof ReviewsOnly);
        }

        public int hashCode() {
            return 76101568;
        }

        @NotNull
        public String toString() {
            return "ReviewsOnly";
        }
    }

    public /* synthetic */ PlayerConfigAlias(boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
        this(z11);
    }

    public final boolean getEnableExperimentalBandwidth() {
        return this.enableExperimentalBandwidth;
    }

    private PlayerConfigAlias(boolean z11) {
        this.enableExperimentalBandwidth = z11;
    }
}
