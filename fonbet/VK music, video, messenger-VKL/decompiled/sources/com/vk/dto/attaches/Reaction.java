package com.vk.dto.attaches;

import xsna.asp;
import xsna.lhg;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Reaction.kt */
/* loaded from: classes18.dex */
public final class Reaction {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ Reaction[] $VALUES;
    public static final a Companion;
    public static final Reaction DISLIKE;
    public static final Reaction LIKE;
    private static final Reaction[] VALUES;
    private final int id;

    /* compiled from: Reaction.kt */
    public static final class a {
        public static Reaction a(int i) {
            Reaction reaction;
            Reaction[] reactionArr = Reaction.VALUES;
            int length = reactionArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    reaction = null;
                    break;
                }
                reaction = reactionArr[i2];
                if (reaction.i() == i) {
                    break;
                }
                i2++;
            }
            if (reaction != null) {
                return reaction;
            }
            throw new IllegalArgumentException(lhg.a(i, "Unknown id: "));
        }
    }

    static {
        Reaction reaction = new Reaction("LIKE", 0, 1);
        LIKE = reaction;
        Reaction reaction2 = new Reaction("DISLIKE", 1, 2);
        DISLIKE = reaction2;
        Reaction[] reactionArr = {reaction, reaction2};
        $VALUES = reactionArr;
        $ENTRIES = new asp(reactionArr);
        Companion = new a();
        VALUES = values();
    }

    public Reaction(String str, int i, int i2) {
        this.id = i2;
    }

    public static Reaction valueOf(String str) {
        return (Reaction) Enum.valueOf(Reaction.class, str);
    }

    public static Reaction[] values() {
        return (Reaction[]) $VALUES.clone();
    }

    public final int i() {
        return this.id;
    }
}
