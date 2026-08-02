package com.vk.im.engine.models.lp_events;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ReactionsLpEvent.kt */
/* loaded from: classes2.dex */
public final class ReactionsLpEventSubType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ReactionsLpEventSubType[] $VALUES;
    public static final a Companion;
    public static final ReactionsLpEventSubType I_ADDED_REACTION;
    public static final ReactionsLpEventSubType I_DELETED_REACTION;
    public static final ReactionsLpEventSubType SOMEBODY_ADDED_REACTION;
    public static final ReactionsLpEventSubType SOMEBODY_DELETED_REACTION;
    private final int subtype;

    /* compiled from: ReactionsLpEvent.kt */
    public static final class a {
    }

    static {
        ReactionsLpEventSubType reactionsLpEventSubType = new ReactionsLpEventSubType("I_ADDED_REACTION", 0, 1);
        I_ADDED_REACTION = reactionsLpEventSubType;
        ReactionsLpEventSubType reactionsLpEventSubType2 = new ReactionsLpEventSubType("SOMEBODY_ADDED_REACTION", 1, 2);
        SOMEBODY_ADDED_REACTION = reactionsLpEventSubType2;
        ReactionsLpEventSubType reactionsLpEventSubType3 = new ReactionsLpEventSubType("I_DELETED_REACTION", 2, 3);
        I_DELETED_REACTION = reactionsLpEventSubType3;
        ReactionsLpEventSubType reactionsLpEventSubType4 = new ReactionsLpEventSubType("SOMEBODY_DELETED_REACTION", 3, 4);
        SOMEBODY_DELETED_REACTION = reactionsLpEventSubType4;
        ReactionsLpEventSubType[] reactionsLpEventSubTypeArr = {reactionsLpEventSubType, reactionsLpEventSubType2, reactionsLpEventSubType3, reactionsLpEventSubType4};
        $VALUES = reactionsLpEventSubTypeArr;
        $ENTRIES = new asp(reactionsLpEventSubTypeArr);
        Companion = new a();
    }

    public ReactionsLpEventSubType(String str, int i, int i2) {
        this.subtype = i2;
    }

    public static ReactionsLpEventSubType valueOf(String str) {
        return (ReactionsLpEventSubType) Enum.valueOf(ReactionsLpEventSubType.class, str);
    }

    public static ReactionsLpEventSubType[] values() {
        return (ReactionsLpEventSubType[]) $VALUES.clone();
    }

    public final int h() {
        return this.subtype;
    }
}
