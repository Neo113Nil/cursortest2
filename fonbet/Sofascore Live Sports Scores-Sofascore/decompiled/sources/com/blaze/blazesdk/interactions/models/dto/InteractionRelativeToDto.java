package com.blaze.blazesdk.interactions.models.dto;

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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/blaze/blazesdk/interactions/models/dto/InteractionRelativeToDto;", "", "<init>", "(Ljava/lang/String;I)V", "PLAYER", "SCREEN", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class InteractionRelativeToDto {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ InteractionRelativeToDto[] $VALUES;

    @b6h("Player")
    public static final InteractionRelativeToDto PLAYER = new InteractionRelativeToDto("PLAYER", 0);

    @b6h("Screen")
    public static final InteractionRelativeToDto SCREEN = new InteractionRelativeToDto("SCREEN", 1);

    private static final /* synthetic */ InteractionRelativeToDto[] $values() {
        return new InteractionRelativeToDto[]{PLAYER, SCREEN};
    }

    static {
        InteractionRelativeToDto[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
    }

    private InteractionRelativeToDto(String str, int i) {
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static InteractionRelativeToDto valueOf(String str) {
        return (InteractionRelativeToDto) Enum.valueOf(InteractionRelativeToDto.class, str);
    }

    public static InteractionRelativeToDto[] values() {
        return (InteractionRelativeToDto[]) $VALUES.clone();
    }
}
