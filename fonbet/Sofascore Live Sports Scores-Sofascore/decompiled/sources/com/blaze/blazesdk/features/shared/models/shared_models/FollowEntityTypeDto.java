package com.blaze.blazesdk.features.shared.models.shared_models;

import androidx.annotation.Keep;
import defpackage.b6h;
import defpackage.gz8;
import defpackage.jp5;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0081\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/blaze/blazesdk/features/shared/models/shared_models/FollowEntityTypeDto;", "", "<init>", "(Ljava/lang/String;I)V", "TEAM", "PLAYER", "PROPERTY", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FollowEntityTypeDto {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ FollowEntityTypeDto[] $VALUES;

    @b6h("Team")
    public static final FollowEntityTypeDto TEAM = new FollowEntityTypeDto("TEAM", 0);

    @b6h("Player")
    public static final FollowEntityTypeDto PLAYER = new FollowEntityTypeDto("PLAYER", 1);

    @b6h("Property")
    public static final FollowEntityTypeDto PROPERTY = new FollowEntityTypeDto("PROPERTY", 2);

    private static final /* synthetic */ FollowEntityTypeDto[] $values() {
        return new FollowEntityTypeDto[]{TEAM, PLAYER, PROPERTY};
    }

    static {
        FollowEntityTypeDto[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
    }

    private FollowEntityTypeDto(String str, int i) {
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static FollowEntityTypeDto valueOf(String str) {
        return (FollowEntityTypeDto) Enum.valueOf(FollowEntityTypeDto.class, str);
    }

    public static FollowEntityTypeDto[] values() {
        return (FollowEntityTypeDto[]) $VALUES.clone();
    }
}
