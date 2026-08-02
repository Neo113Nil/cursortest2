package com.sofascore.model.mvvm.model;

import defpackage.gz8;
import defpackage.jp5;
import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/sofascore/model/mvvm/model/CategoryType;", "Ljava/io/Serializable;", "", "<init>", "(Ljava/lang/String;I)V", "ATP_RANK", "WTA_RANK", "FIFA_RANK", "UEFA_COUNTRY_RANK", "UEFA_CLUB_RANK", "RUGBY_LEAGUE", "RUGBY_UNION", "PLAYER_TRANSFERS", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CategoryType implements Serializable {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ CategoryType[] $VALUES;
    public static final CategoryType ATP_RANK = new CategoryType("ATP_RANK", 0);
    public static final CategoryType WTA_RANK = new CategoryType("WTA_RANK", 1);
    public static final CategoryType FIFA_RANK = new CategoryType("FIFA_RANK", 2);
    public static final CategoryType UEFA_COUNTRY_RANK = new CategoryType("UEFA_COUNTRY_RANK", 3);
    public static final CategoryType UEFA_CLUB_RANK = new CategoryType("UEFA_CLUB_RANK", 4);
    public static final CategoryType RUGBY_LEAGUE = new CategoryType("RUGBY_LEAGUE", 5);
    public static final CategoryType RUGBY_UNION = new CategoryType("RUGBY_UNION", 6);
    public static final CategoryType PLAYER_TRANSFERS = new CategoryType("PLAYER_TRANSFERS", 7);

    private static final /* synthetic */ CategoryType[] $values() {
        return new CategoryType[]{ATP_RANK, WTA_RANK, FIFA_RANK, UEFA_COUNTRY_RANK, UEFA_CLUB_RANK, RUGBY_LEAGUE, RUGBY_UNION, PLAYER_TRANSFERS};
    }

    static {
        CategoryType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
    }

    private CategoryType(String str, int i) {
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static CategoryType valueOf(String str) {
        return (CategoryType) Enum.valueOf(CategoryType.class, str);
    }

    public static CategoryType[] values() {
        return (CategoryType[]) $VALUES.clone();
    }
}
