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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/blaze/blazesdk/interactions/models/dto/InteractionObjectXPositionDto;", "", "<init>", "(Ljava/lang/String;I)V", "START_TO_START", "START_TO_END", "CENTER_X", "END_TO_START", "END_TO_END", "CENTER_TO_START", "CENTER_TO_END", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class InteractionObjectXPositionDto {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ InteractionObjectXPositionDto[] $VALUES;

    @b6h("StartToStart")
    public static final InteractionObjectXPositionDto START_TO_START = new InteractionObjectXPositionDto("START_TO_START", 0);

    @b6h("StartToEnd")
    public static final InteractionObjectXPositionDto START_TO_END = new InteractionObjectXPositionDto("START_TO_END", 1);

    @b6h("CenterX")
    public static final InteractionObjectXPositionDto CENTER_X = new InteractionObjectXPositionDto("CENTER_X", 2);

    @b6h("EndToStart")
    public static final InteractionObjectXPositionDto END_TO_START = new InteractionObjectXPositionDto("END_TO_START", 3);

    @b6h("EndToEnd")
    public static final InteractionObjectXPositionDto END_TO_END = new InteractionObjectXPositionDto("END_TO_END", 4);

    @b6h("CenterToStart")
    public static final InteractionObjectXPositionDto CENTER_TO_START = new InteractionObjectXPositionDto("CENTER_TO_START", 5);

    @b6h("CenterToEnd")
    public static final InteractionObjectXPositionDto CENTER_TO_END = new InteractionObjectXPositionDto("CENTER_TO_END", 6);

    private static final /* synthetic */ InteractionObjectXPositionDto[] $values() {
        return new InteractionObjectXPositionDto[]{START_TO_START, START_TO_END, CENTER_X, END_TO_START, END_TO_END, CENTER_TO_START, CENTER_TO_END};
    }

    static {
        InteractionObjectXPositionDto[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
    }

    private InteractionObjectXPositionDto(String str, int i) {
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static InteractionObjectXPositionDto valueOf(String str) {
        return (InteractionObjectXPositionDto) Enum.valueOf(InteractionObjectXPositionDto.class, str);
    }

    public static InteractionObjectXPositionDto[] values() {
        return (InteractionObjectXPositionDto[]) $VALUES.clone();
    }
}
