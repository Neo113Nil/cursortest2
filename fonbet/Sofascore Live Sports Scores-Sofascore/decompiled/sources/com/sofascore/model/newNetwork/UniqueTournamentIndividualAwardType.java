package com.sofascore.model.newNetwork;

import defpackage.gz8;
import defpackage.jp5;
import defpackage.q5h;
import defpackage.r5h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h(with = UniqueTournamentIndividualAwardTypeSerializer.class)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0010\b\u0087\u0081\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, d2 = {"Lcom/sofascore/model/newNetwork/UniqueTournamentIndividualAwardType;", "", "<init>", "(Ljava/lang/String;I)V", "MostValuablePlayer", "FinalsMostValuablePlayer", "DefensivePlayerOfTheYear", "MostImprovedPlayer", "RookieOfTheYear", "SixthManOfTheYear", "ClutchPlayerOfTheYear", "Sportsmanship", "TeammateOfTheYear", "Hustle", "SocialJusticeChampion", "CoachOfTheYear", "Companion", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class UniqueTournamentIndividualAwardType {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ UniqueTournamentIndividualAwardType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @q5h("most-valuable-player")
    public static final UniqueTournamentIndividualAwardType MostValuablePlayer = new UniqueTournamentIndividualAwardType("MostValuablePlayer", 0);

    @q5h("finals-most-valuable-player")
    public static final UniqueTournamentIndividualAwardType FinalsMostValuablePlayer = new UniqueTournamentIndividualAwardType("FinalsMostValuablePlayer", 1);

    @q5h("defensive-player-of-the-year")
    public static final UniqueTournamentIndividualAwardType DefensivePlayerOfTheYear = new UniqueTournamentIndividualAwardType("DefensivePlayerOfTheYear", 2);

    @q5h("most-improved-player")
    public static final UniqueTournamentIndividualAwardType MostImprovedPlayer = new UniqueTournamentIndividualAwardType("MostImprovedPlayer", 3);

    @q5h("rookie-of-the-year")
    public static final UniqueTournamentIndividualAwardType RookieOfTheYear = new UniqueTournamentIndividualAwardType("RookieOfTheYear", 4);

    @q5h("sixth-man-of-the-year")
    public static final UniqueTournamentIndividualAwardType SixthManOfTheYear = new UniqueTournamentIndividualAwardType("SixthManOfTheYear", 5);

    @q5h("clutch-player-of-the-year")
    public static final UniqueTournamentIndividualAwardType ClutchPlayerOfTheYear = new UniqueTournamentIndividualAwardType("ClutchPlayerOfTheYear", 6);

    @q5h("sportsmanship")
    public static final UniqueTournamentIndividualAwardType Sportsmanship = new UniqueTournamentIndividualAwardType("Sportsmanship", 7);

    @q5h("teammate-of-the-year")
    public static final UniqueTournamentIndividualAwardType TeammateOfTheYear = new UniqueTournamentIndividualAwardType("TeammateOfTheYear", 8);

    @q5h("hustle")
    public static final UniqueTournamentIndividualAwardType Hustle = new UniqueTournamentIndividualAwardType("Hustle", 9);

    @q5h("social-justice-champion")
    public static final UniqueTournamentIndividualAwardType SocialJusticeChampion = new UniqueTournamentIndividualAwardType("SocialJusticeChampion", 10);

    @q5h("coach-of-the-year")
    public static final UniqueTournamentIndividualAwardType CoachOfTheYear = new UniqueTournamentIndividualAwardType("CoachOfTheYear", 11);

    private static final /* synthetic */ UniqueTournamentIndividualAwardType[] $values() {
        return new UniqueTournamentIndividualAwardType[]{MostValuablePlayer, FinalsMostValuablePlayer, DefensivePlayerOfTheYear, MostImprovedPlayer, RookieOfTheYear, SixthManOfTheYear, ClutchPlayerOfTheYear, Sportsmanship, TeammateOfTheYear, Hustle, SocialJusticeChampion, CoachOfTheYear};
    }

    static {
        UniqueTournamentIndividualAwardType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
        INSTANCE = new Companion(null);
    }

    private UniqueTournamentIndividualAwardType(String str, int i) {
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static UniqueTournamentIndividualAwardType valueOf(String str) {
        return (UniqueTournamentIndividualAwardType) Enum.valueOf(UniqueTournamentIndividualAwardType.class, str);
    }

    public static UniqueTournamentIndividualAwardType[] values() {
        return (UniqueTournamentIndividualAwardType[]) $VALUES.clone();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/UniqueTournamentIndividualAwardType$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/UniqueTournamentIndividualAwardType;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return UniqueTournamentIndividualAwardTypeSerializer.INSTANCE;
        }

        private Companion() {
        }
    }
}
