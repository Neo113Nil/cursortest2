package com.sofascore.model.firebase;

import com.ironsource.U3;
import defpackage.gz8;
import defpackage.jp5;
import defpackage.r5h;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h(with = AdTypeSerializer.class)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \b2\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0006\t\n\u000b\f\r\u000e¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lcom/sofascore/model/firebase/AdType;", "", "Banner", "Interstitial", "RewardedInterstitial", "Preroll", "Native", "Unknown", "Companion", "Lcom/sofascore/model/firebase/AdType$Banner;", "Lcom/sofascore/model/firebase/AdType$Interstitial;", "Lcom/sofascore/model/firebase/AdType$Native;", "Lcom/sofascore/model/firebase/AdType$Preroll;", "Lcom/sofascore/model/firebase/AdType$RewardedInterstitial;", "Lcom/sofascore/model/firebase/AdType$Unknown;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface AdType {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/sofascore/model/firebase/AdType$Banner;", "Lcom/sofascore/model/firebase/AdType;", "", "label", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getLabel", "()Ljava/lang/String;", "DefaultSticky", "BelowOdds", "MainScreenSmall", "MainScreenBig", "FeaturedTournamentSmall", "FeaturedTournamentBig", "StreamVideoOverlay", "FantasySmall", "FantasyBig", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Banner implements AdType {
        private static final /* synthetic */ jp5 $ENTRIES;
        private static final /* synthetic */ Banner[] $VALUES;

        @NotNull
        private final String label;
        public static final Banner DefaultSticky = new Banner("DefaultSticky", 0, "regular");
        public static final Banner BelowOdds = new Banner("BelowOdds", 1, "below_odds");
        public static final Banner MainScreenSmall = new Banner("MainScreenSmall", 2, "main_small");
        public static final Banner MainScreenBig = new Banner("MainScreenBig", 3, "main_big");
        public static final Banner FeaturedTournamentSmall = new Banner("FeaturedTournamentSmall", 4, "main_featured_tournament_small");
        public static final Banner FeaturedTournamentBig = new Banner("FeaturedTournamentBig", 5, "main_featured_tournament_big");
        public static final Banner StreamVideoOverlay = new Banner("StreamVideoOverlay", 6, "stream_overlay");
        public static final Banner FantasySmall = new Banner("FantasySmall", 7, "fantasy_small");
        public static final Banner FantasyBig = new Banner("FantasyBig", 8, "fantasy_big");

        private static final /* synthetic */ Banner[] $values() {
            return new Banner[]{DefaultSticky, BelowOdds, MainScreenSmall, MainScreenBig, FeaturedTournamentSmall, FeaturedTournamentBig, StreamVideoOverlay, FantasySmall, FantasyBig};
        }

        static {
            Banner[] $values = $values();
            $VALUES = $values;
            $ENTRIES = gz8.G($values);
        }

        private Banner(String str, int i, String str2) {
            this.label = str2;
        }

        @NotNull
        public static jp5 getEntries() {
            return $ENTRIES;
        }

        public static Banner valueOf(String str) {
            return (Banner) Enum.valueOf(Banner.class, str);
        }

        public static Banner[] values() {
            return (Banner[]) $VALUES.clone();
        }

        @NotNull
        public final String getLabel() {
            return this.label;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/firebase/AdType$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/firebase/AdType;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return AdTypeSerializer.INSTANCE;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/sofascore/model/firebase/AdType$Interstitial;", "Lcom/sofascore/model/firebase/AdType;", "", "analyticsString", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getAnalyticsString", "()Ljava/lang/String;", "Media", "Fantasy", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Interstitial implements AdType {
        private static final /* synthetic */ jp5 $ENTRIES;
        private static final /* synthetic */ Interstitial[] $VALUES;

        @NotNull
        private final String analyticsString;
        public static final Interstitial Media = new Interstitial("Media", 0, U3.i.I0);
        public static final Interstitial Fantasy = new Interstitial("Fantasy", 1, "fantasy");

        private static final /* synthetic */ Interstitial[] $values() {
            return new Interstitial[]{Media, Fantasy};
        }

        static {
            Interstitial[] $values = $values();
            $VALUES = $values;
            $ENTRIES = gz8.G($values);
        }

        private Interstitial(String str, int i, String str2) {
            this.analyticsString = str2;
        }

        @NotNull
        public static jp5 getEntries() {
            return $ENTRIES;
        }

        public static Interstitial valueOf(String str) {
            return (Interstitial) Enum.valueOf(Interstitial.class, str);
        }

        public static Interstitial[] values() {
            return (Interstitial[]) $VALUES.clone();
        }

        @NotNull
        public final String getAnalyticsString() {
            return this.analyticsString;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/sofascore/model/firebase/AdType$Native;", "Lcom/sofascore/model/firebase/AdType;", "", "<init>", "(Ljava/lang/String;I)V", "Media", "TrendingGridMedium", "TrendingGridLarge", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Native implements AdType {
        private static final /* synthetic */ jp5 $ENTRIES;
        private static final /* synthetic */ Native[] $VALUES;
        public static final Native Media = new Native("Media", 0);
        public static final Native TrendingGridMedium = new Native("TrendingGridMedium", 1);
        public static final Native TrendingGridLarge = new Native("TrendingGridLarge", 2);

        private static final /* synthetic */ Native[] $values() {
            return new Native[]{Media, TrendingGridMedium, TrendingGridLarge};
        }

        static {
            Native[] $values = $values();
            $VALUES = $values;
            $ENTRIES = gz8.G($values);
        }

        private Native(String str, int i) {
        }

        @NotNull
        public static jp5 getEntries() {
            return $ENTRIES;
        }

        public static Native valueOf(String str) {
            return (Native) Enum.valueOf(Native.class, str);
        }

        public static Native[] values() {
            return (Native[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/firebase/AdType$Preroll;", "Lcom/sofascore/model/firebase/AdType;", "", "<init>", "(Ljava/lang/String;I)V", "EventLiveStream", "LiveActionWidget", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Preroll implements AdType {
        private static final /* synthetic */ jp5 $ENTRIES;
        private static final /* synthetic */ Preroll[] $VALUES;
        public static final Preroll EventLiveStream = new Preroll("EventLiveStream", 0);
        public static final Preroll LiveActionWidget = new Preroll("LiveActionWidget", 1);

        private static final /* synthetic */ Preroll[] $values() {
            return new Preroll[]{EventLiveStream, LiveActionWidget};
        }

        static {
            Preroll[] $values = $values();
            $VALUES = $values;
            $ENTRIES = gz8.G($values);
        }

        private Preroll(String str, int i) {
        }

        @NotNull
        public static jp5 getEntries() {
            return $ENTRIES;
        }

        public static Preroll valueOf(String str) {
            return (Preroll) Enum.valueOf(Preroll.class, str);
        }

        public static Preroll[] values() {
            return (Preroll[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/sofascore/model/firebase/AdType$RewardedInterstitial;", "Lcom/sofascore/model/firebase/AdType;", "", "analyticsString", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getAnalyticsString", "()Ljava/lang/String;", "EventWhoWillWin", "ProfileWhoWillWin", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class RewardedInterstitial implements AdType {
        private static final /* synthetic */ jp5 $ENTRIES;
        private static final /* synthetic */ RewardedInterstitial[] $VALUES;
        public static final RewardedInterstitial EventWhoWillWin = new RewardedInterstitial("EventWhoWillWin", 0, "who_will_win_event_details");
        public static final RewardedInterstitial ProfileWhoWillWin = new RewardedInterstitial("ProfileWhoWillWin", 1, "who_will_win_profile");

        @NotNull
        private final String analyticsString;

        private static final /* synthetic */ RewardedInterstitial[] $values() {
            return new RewardedInterstitial[]{EventWhoWillWin, ProfileWhoWillWin};
        }

        static {
            RewardedInterstitial[] $values = $values();
            $VALUES = $values;
            $ENTRIES = gz8.G($values);
        }

        private RewardedInterstitial(String str, int i, String str2) {
            this.analyticsString = str2;
        }

        @NotNull
        public static jp5 getEntries() {
            return $ENTRIES;
        }

        public static RewardedInterstitial valueOf(String str) {
            return (RewardedInterstitial) Enum.valueOf(RewardedInterstitial.class, str);
        }

        public static RewardedInterstitial[] values() {
            return (RewardedInterstitial[]) $VALUES.clone();
        }

        @NotNull
        public final String getAnalyticsString() {
            return this.analyticsString;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/model/firebase/AdType$Unknown;", "Lcom/sofascore/model/firebase/AdType;", "<init>", "()V", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Unknown implements AdType {

        @NotNull
        public static final Unknown INSTANCE = new Unknown();

        private Unknown() {
        }
    }
}
