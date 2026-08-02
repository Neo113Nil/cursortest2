package com.sofascore.model.crowdsourcing;

import com.sofascore.model.network.response.serializers.ScoringTeamSerializer;
import defpackage.bxi;
import defpackage.gz8;
import defpackage.joa;
import defpackage.jp5;
import defpackage.r5h;
import defpackage.ypa;
import defpackage.ysa;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h(with = ScoringTeamSerializer.class)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/crowdsourcing/TeamSide;", "", "<init>", "(Ljava/lang/String;I)V", "HOME", "AWAY", "Companion", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TeamSide {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ TeamSide[] $VALUES;

    @NotNull
    private static final joa $cachedSerializer$delegate;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final TeamSide HOME = new TeamSide("HOME", 0);
    public static final TeamSide AWAY = new TeamSide("AWAY", 1);

    private static final /* synthetic */ TeamSide[] $values() {
        return new TeamSide[]{HOME, AWAY};
    }

    static {
        TeamSide[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
        INSTANCE = new Companion(null);
        $cachedSerializer$delegate = ypa.a(ysa.b, new bxi(18));
    }

    private TeamSide(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return new ScoringTeamSerializer();
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static TeamSide valueOf(String str) {
        return (TeamSide) Enum.valueOf(TeamSide.class, str);
    }

    public static TeamSide[] values() {
        return (TeamSide[]) $VALUES.clone();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/crowdsourcing/TeamSide$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/crowdsourcing/TeamSide;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) TeamSide.$cachedSerializer$delegate.getValue();
        }

        @NotNull
        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }
}
