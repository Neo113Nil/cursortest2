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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/blaze/blazesdk/interactions/models/dto/InteractionObjectYPositionDto;", "", "<init>", "(Ljava/lang/String;I)V", "BOTTOM_TO_TOP", "TOP_TO_TOP", "BOTTOM_TO_BOTTOM", "TOP_TO_BOTTOM", "CENTER_TO_TOP", "CENTER_Y", "CENTER_TO_BOTTOM", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class InteractionObjectYPositionDto {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ InteractionObjectYPositionDto[] $VALUES;

    @b6h("BottomToTop")
    public static final InteractionObjectYPositionDto BOTTOM_TO_TOP = new InteractionObjectYPositionDto("BOTTOM_TO_TOP", 0);

    @b6h("TopToTop")
    public static final InteractionObjectYPositionDto TOP_TO_TOP = new InteractionObjectYPositionDto("TOP_TO_TOP", 1);

    @b6h("BottomToBottom")
    public static final InteractionObjectYPositionDto BOTTOM_TO_BOTTOM = new InteractionObjectYPositionDto("BOTTOM_TO_BOTTOM", 2);

    @b6h("TopToBottom")
    public static final InteractionObjectYPositionDto TOP_TO_BOTTOM = new InteractionObjectYPositionDto("TOP_TO_BOTTOM", 3);

    @b6h("CenterToTop")
    public static final InteractionObjectYPositionDto CENTER_TO_TOP = new InteractionObjectYPositionDto("CENTER_TO_TOP", 4);

    @b6h("CenterY")
    public static final InteractionObjectYPositionDto CENTER_Y = new InteractionObjectYPositionDto("CENTER_Y", 5);

    @b6h("CenterToBottom")
    public static final InteractionObjectYPositionDto CENTER_TO_BOTTOM = new InteractionObjectYPositionDto("CENTER_TO_BOTTOM", 6);

    private static final /* synthetic */ InteractionObjectYPositionDto[] $values() {
        return new InteractionObjectYPositionDto[]{BOTTOM_TO_TOP, TOP_TO_TOP, BOTTOM_TO_BOTTOM, TOP_TO_BOTTOM, CENTER_TO_TOP, CENTER_Y, CENTER_TO_BOTTOM};
    }

    static {
        InteractionObjectYPositionDto[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
    }

    private InteractionObjectYPositionDto(String str, int i) {
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static InteractionObjectYPositionDto valueOf(String str) {
        return (InteractionObjectYPositionDto) Enum.valueOf(InteractionObjectYPositionDto.class, str);
    }

    public static InteractionObjectYPositionDto[] values() {
        return (InteractionObjectYPositionDto[]) $VALUES.clone();
    }
}
