package com.sofascore.model.fantasy;

import com.sofascore.model.newNetwork.TeamOfTheWeekRoundsResponseKt;
import defpackage.au6;
import defpackage.gz8;
import defpackage.hz8;
import defpackage.joa;
import defpackage.jp5;
import defpackage.q5h;
import defpackage.r5h;
import defpackage.ypa;
import defpackage.ysa;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, d2 = {"Lcom/sofascore/model/fantasy/FantasyCompetitionType;", "", "code", "", "analyticsName", "", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "getCode", "()I", "getAnalyticsName", "()Ljava/lang/String;", "SEASON", "WEEKLY", "Companion", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FantasyCompetitionType {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ FantasyCompetitionType[] $VALUES;

    @NotNull
    private static final joa $cachedSerializer$delegate;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @q5h("1")
    public static final FantasyCompetitionType SEASON = new FantasyCompetitionType("SEASON", 0, 1, TeamOfTheWeekRoundsResponseKt.TOTW_SEASON);

    @q5h("2")
    public static final FantasyCompetitionType WEEKLY = new FantasyCompetitionType("WEEKLY", 1, 2, "faceoff");

    @NotNull
    private final String analyticsName;
    private final int code;

    private static final /* synthetic */ FantasyCompetitionType[] $values() {
        return new FantasyCompetitionType[]{SEASON, WEEKLY};
    }

    static {
        FantasyCompetitionType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
        INSTANCE = new Companion(null);
        $cachedSerializer$delegate = ypa.a(ysa.b, new au6(6));
    }

    private FantasyCompetitionType(String str, int i, int i2, String str2) {
        this.code = i2;
        this.analyticsName = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return hz8.F("com.sofascore.model.fantasy.FantasyCompetitionType", values(), new String[]{"1", "2"}, new Annotation[][]{null, null});
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static FantasyCompetitionType valueOf(String str) {
        return (FantasyCompetitionType) Enum.valueOf(FantasyCompetitionType.class, str);
    }

    public static FantasyCompetitionType[] values() {
        return (FantasyCompetitionType[]) $VALUES.clone();
    }

    @NotNull
    public final String getAnalyticsName() {
        return this.analyticsName;
    }

    public final int getCode() {
        return this.code;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/fantasy/FantasyCompetitionType$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/fantasy/FantasyCompetitionType;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) FantasyCompetitionType.$cachedSerializer$delegate.getValue();
        }

        @NotNull
        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }
}
