package com.sofascore.model.newNetwork;

import com.sofascore.model.mvvm.model.PlayerKt;
import defpackage.gz8;
import defpackage.jp5;
import defpackage.q5h;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/sofascore/model/newNetwork/TyreType;", "", "<init>", "(Ljava/lang/String;I)V", "HARD", "MEDIUM", "SOFT", "INTERMEDIATE", "WET", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TyreType {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ TyreType[] $VALUES;

    @q5h("H")
    public static final TyreType HARD = new TyreType("HARD", 0);

    @q5h(PlayerKt.FOOTBALL_MIDFIELDER)
    public static final TyreType MEDIUM = new TyreType("MEDIUM", 1);

    @q5h(PlayerKt.VOLLEYBALL_SETTER)
    public static final TyreType SOFT = new TyreType("SOFT", 2);

    @q5h("I")
    public static final TyreType INTERMEDIATE = new TyreType("INTERMEDIATE", 3);

    @q5h("W")
    public static final TyreType WET = new TyreType("WET", 4);

    private static final /* synthetic */ TyreType[] $values() {
        return new TyreType[]{HARD, MEDIUM, SOFT, INTERMEDIATE, WET};
    }

    static {
        TyreType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
    }

    private TyreType(String str, int i) {
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static TyreType valueOf(String str) {
        return (TyreType) Enum.valueOf(TyreType.class, str);
    }

    public static TyreType[] values() {
        return (TyreType[]) $VALUES.clone();
    }
}
