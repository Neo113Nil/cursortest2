package com.sofascore.model.mvvm.model;

import defpackage.gz8;
import defpackage.jp5;
import defpackage.q5h;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/sofascore/model/mvvm/model/TimeoutType;", "", "<init>", "(Ljava/lang/String;I)V", "TEAM", "TV", "CHALLENGE", "OFFICIAL", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TimeoutType {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ TimeoutType[] $VALUES;

    @q5h("teamTimeout")
    public static final TimeoutType TEAM = new TimeoutType("TEAM", 0);

    @q5h("tvTimeout")
    public static final TimeoutType TV = new TimeoutType("TV", 1);

    @q5h("challengeTimeout")
    public static final TimeoutType CHALLENGE = new TimeoutType("CHALLENGE", 2);

    @q5h("officialTimeout")
    public static final TimeoutType OFFICIAL = new TimeoutType("OFFICIAL", 3);

    private static final /* synthetic */ TimeoutType[] $values() {
        return new TimeoutType[]{TEAM, TV, CHALLENGE, OFFICIAL};
    }

    static {
        TimeoutType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
    }

    private TimeoutType(String str, int i) {
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static TimeoutType valueOf(String str) {
        return (TimeoutType) Enum.valueOf(TimeoutType.class, str);
    }

    public static TimeoutType[] values() {
        return (TimeoutType[]) $VALUES.clone();
    }
}
