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
@r5h(with = UniqueTournamentTeamAwardTypeSerializer.class)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/sofascore/model/newNetwork/UniqueTournamentTeamAwardType;", "", "<init>", "(Ljava/lang/String;I)V", "BestFirst", "BestSecond", "BestThird", "BestDefensiveFirst", "BestDefensiveSecond", "BestRookieFirst", "BestRookieSecond", "Companion", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class UniqueTournamentTeamAwardType {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ UniqueTournamentTeamAwardType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @q5h("best-first")
    public static final UniqueTournamentTeamAwardType BestFirst = new UniqueTournamentTeamAwardType("BestFirst", 0);

    @q5h("best-second")
    public static final UniqueTournamentTeamAwardType BestSecond = new UniqueTournamentTeamAwardType("BestSecond", 1);

    @q5h("best-third")
    public static final UniqueTournamentTeamAwardType BestThird = new UniqueTournamentTeamAwardType("BestThird", 2);

    @q5h("best-defensive-first")
    public static final UniqueTournamentTeamAwardType BestDefensiveFirst = new UniqueTournamentTeamAwardType("BestDefensiveFirst", 3);

    @q5h("best-defensive-second")
    public static final UniqueTournamentTeamAwardType BestDefensiveSecond = new UniqueTournamentTeamAwardType("BestDefensiveSecond", 4);

    @q5h("best-rookie-first")
    public static final UniqueTournamentTeamAwardType BestRookieFirst = new UniqueTournamentTeamAwardType("BestRookieFirst", 5);

    @q5h("best-rookie-second")
    public static final UniqueTournamentTeamAwardType BestRookieSecond = new UniqueTournamentTeamAwardType("BestRookieSecond", 6);

    private static final /* synthetic */ UniqueTournamentTeamAwardType[] $values() {
        return new UniqueTournamentTeamAwardType[]{BestFirst, BestSecond, BestThird, BestDefensiveFirst, BestDefensiveSecond, BestRookieFirst, BestRookieSecond};
    }

    static {
        UniqueTournamentTeamAwardType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
        INSTANCE = new Companion(null);
    }

    private UniqueTournamentTeamAwardType(String str, int i) {
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static UniqueTournamentTeamAwardType valueOf(String str) {
        return (UniqueTournamentTeamAwardType) Enum.valueOf(UniqueTournamentTeamAwardType.class, str);
    }

    public static UniqueTournamentTeamAwardType[] values() {
        return (UniqueTournamentTeamAwardType[]) $VALUES.clone();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/UniqueTournamentTeamAwardType$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/UniqueTournamentTeamAwardType;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return UniqueTournamentTeamAwardTypeSerializer.INSTANCE;
        }

        private Companion() {
        }
    }
}
