package com.sofascore.model.mvvm.model;

import defpackage.gz8;
import defpackage.jp5;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/sofascore/model/mvvm/model/TeamSides;", "", "<init>", "(Ljava/lang/String;I)V", "ORIGINAL", "REVERSIBLE", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TeamSides {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ TeamSides[] $VALUES;
    public static final TeamSides ORIGINAL = new TeamSides("ORIGINAL", 0);
    public static final TeamSides REVERSIBLE = new TeamSides("REVERSIBLE", 1);

    private static final /* synthetic */ TeamSides[] $values() {
        return new TeamSides[]{ORIGINAL, REVERSIBLE};
    }

    static {
        TeamSides[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
    }

    private TeamSides(String str, int i) {
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static TeamSides valueOf(String str) {
        return (TeamSides) Enum.valueOf(TeamSides.class, str);
    }

    public static TeamSides[] values() {
        return (TeamSides[]) $VALUES.clone();
    }
}
