package com.blaze.blazesdk.shared.models;

import androidx.annotation.Keep;
import com.blaze.blazesdk.utils.parsing.EnumWithValue;
import com.ironsource.U3;
import com.unity3d.ads.core.domain.AndroidGetAdPlayerContext;
import defpackage.gz8;
import defpackage.jp5;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0010\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0012"}, d2 = {"Lcom/blaze/blazesdk/shared/models/BlazeExtraInfoKeyPreset;", "Lcom/blaze/blazesdk/utils/parsing/EnumWithValue;", "", U3.i.X, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "GAME_ID", "TEAM_ID", "PLAYER_ID", "ROUND_ID", "SEASON_ID", "IS_CURRENTLY_LIVE", "ACTIVE_LABELS", U3.i.W, "getKey", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BlazeExtraInfoKeyPreset implements EnumWithValue {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ BlazeExtraInfoKeyPreset[] $VALUES;

    @NotNull
    private final String value;
    public static final BlazeExtraInfoKeyPreset GAME_ID = new BlazeExtraInfoKeyPreset("GAME_ID", 0, AndroidGetAdPlayerContext.KEY_GAME_ID);
    public static final BlazeExtraInfoKeyPreset TEAM_ID = new BlazeExtraInfoKeyPreset("TEAM_ID", 1, "teamId");
    public static final BlazeExtraInfoKeyPreset PLAYER_ID = new BlazeExtraInfoKeyPreset("PLAYER_ID", 2, "playerId");
    public static final BlazeExtraInfoKeyPreset ROUND_ID = new BlazeExtraInfoKeyPreset("ROUND_ID", 3, "roundId");
    public static final BlazeExtraInfoKeyPreset SEASON_ID = new BlazeExtraInfoKeyPreset("SEASON_ID", 4, "seasonId");
    public static final BlazeExtraInfoKeyPreset IS_CURRENTLY_LIVE = new BlazeExtraInfoKeyPreset("IS_CURRENTLY_LIVE", 5, "isCurrentlyLive");
    public static final BlazeExtraInfoKeyPreset ACTIVE_LABELS = new BlazeExtraInfoKeyPreset("ACTIVE_LABELS", 6, "activeLabels");

    private static final /* synthetic */ BlazeExtraInfoKeyPreset[] $values() {
        return new BlazeExtraInfoKeyPreset[]{GAME_ID, TEAM_ID, PLAYER_ID, ROUND_ID, SEASON_ID, IS_CURRENTLY_LIVE, ACTIVE_LABELS};
    }

    static {
        BlazeExtraInfoKeyPreset[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
    }

    private BlazeExtraInfoKeyPreset(String str, int i, String str2) {
        this.value = str2;
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static BlazeExtraInfoKeyPreset valueOf(String str) {
        return (BlazeExtraInfoKeyPreset) Enum.valueOf(BlazeExtraInfoKeyPreset.class, str);
    }

    public static BlazeExtraInfoKeyPreset[] values() {
        return (BlazeExtraInfoKeyPreset[]) $VALUES.clone();
    }

    @NotNull
    public final String getKey() {
        return getValue();
    }

    @Override // com.blaze.blazesdk.utils.parsing.EnumWithValue
    @NotNull
    public String getValue() {
        return this.value;
    }
}
