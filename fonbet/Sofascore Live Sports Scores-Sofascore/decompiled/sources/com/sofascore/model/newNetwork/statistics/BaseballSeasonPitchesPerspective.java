package com.sofascore.model.newNetwork.statistics;

import defpackage.gz8;
import defpackage.jp5;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/sofascore/model/newNetwork/statistics/BaseballSeasonPitchesPerspective;", "", "argument", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getArgument", "()Ljava/lang/String;", "Pitching", "Batting", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BaseballSeasonPitchesPerspective {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ BaseballSeasonPitchesPerspective[] $VALUES;

    @NotNull
    private final String argument;
    public static final BaseballSeasonPitchesPerspective Pitching = new BaseballSeasonPitchesPerspective("Pitching", 0, "pitching");
    public static final BaseballSeasonPitchesPerspective Batting = new BaseballSeasonPitchesPerspective("Batting", 1, "hitting");

    private static final /* synthetic */ BaseballSeasonPitchesPerspective[] $values() {
        return new BaseballSeasonPitchesPerspective[]{Pitching, Batting};
    }

    static {
        BaseballSeasonPitchesPerspective[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
    }

    private BaseballSeasonPitchesPerspective(String str, int i, String str2) {
        this.argument = str2;
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static BaseballSeasonPitchesPerspective valueOf(String str) {
        return (BaseballSeasonPitchesPerspective) Enum.valueOf(BaseballSeasonPitchesPerspective.class, str);
    }

    public static BaseballSeasonPitchesPerspective[] values() {
        return (BaseballSeasonPitchesPerspective[]) $VALUES.clone();
    }

    @NotNull
    public final String getArgument() {
        return this.argument;
    }
}
