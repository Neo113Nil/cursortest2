package com.sofascore.model.odds;

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
@r5h(with = FeaturedOddsDisplayAreaSerializer.class)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/odds/FeaturedOddsDisplayArea;", "", "<init>", "(Ljava/lang/String;I)V", "TOURNAMENT", "TOURNAMENT_AND_EVENTS", "Companion", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FeaturedOddsDisplayArea {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ FeaturedOddsDisplayArea[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @q5h("tournament")
    public static final FeaturedOddsDisplayArea TOURNAMENT = new FeaturedOddsDisplayArea("TOURNAMENT", 0);

    @q5h("tournamentAndEvents")
    public static final FeaturedOddsDisplayArea TOURNAMENT_AND_EVENTS = new FeaturedOddsDisplayArea("TOURNAMENT_AND_EVENTS", 1);

    private static final /* synthetic */ FeaturedOddsDisplayArea[] $values() {
        return new FeaturedOddsDisplayArea[]{TOURNAMENT, TOURNAMENT_AND_EVENTS};
    }

    static {
        FeaturedOddsDisplayArea[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
        INSTANCE = new Companion(null);
    }

    private FeaturedOddsDisplayArea(String str, int i) {
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static FeaturedOddsDisplayArea valueOf(String str) {
        return (FeaturedOddsDisplayArea) Enum.valueOf(FeaturedOddsDisplayArea.class, str);
    }

    public static FeaturedOddsDisplayArea[] values() {
        return (FeaturedOddsDisplayArea[]) $VALUES.clone();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/odds/FeaturedOddsDisplayArea$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/odds/FeaturedOddsDisplayArea;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return FeaturedOddsDisplayAreaSerializer.INSTANCE;
        }

        private Companion() {
        }
    }
}
