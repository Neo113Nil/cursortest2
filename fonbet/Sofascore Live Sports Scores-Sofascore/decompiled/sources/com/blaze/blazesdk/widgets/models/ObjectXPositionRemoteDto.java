package com.blaze.blazesdk.widgets.models;

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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/blaze/blazesdk/widgets/models/ObjectXPositionRemoteDto;", "", "<init>", "(Ljava/lang/String;I)V", "START_TO_START", "START_TO_END", "CENTER_X", "END_TO_START", "END_TO_END", "CENTER_TO_START", "CENTER_TO_END", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ObjectXPositionRemoteDto {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ ObjectXPositionRemoteDto[] $VALUES;

    @b6h("StartToStart")
    public static final ObjectXPositionRemoteDto START_TO_START = new ObjectXPositionRemoteDto("START_TO_START", 0);

    @b6h("StartToEnd")
    public static final ObjectXPositionRemoteDto START_TO_END = new ObjectXPositionRemoteDto("START_TO_END", 1);

    @b6h("CenterX")
    public static final ObjectXPositionRemoteDto CENTER_X = new ObjectXPositionRemoteDto("CENTER_X", 2);

    @b6h("EndToStart")
    public static final ObjectXPositionRemoteDto END_TO_START = new ObjectXPositionRemoteDto("END_TO_START", 3);

    @b6h("EndToEnd")
    public static final ObjectXPositionRemoteDto END_TO_END = new ObjectXPositionRemoteDto("END_TO_END", 4);

    @b6h("CenterToStart")
    public static final ObjectXPositionRemoteDto CENTER_TO_START = new ObjectXPositionRemoteDto("CENTER_TO_START", 5);

    @b6h("CenterToEnd")
    public static final ObjectXPositionRemoteDto CENTER_TO_END = new ObjectXPositionRemoteDto("CENTER_TO_END", 6);

    private static final /* synthetic */ ObjectXPositionRemoteDto[] $values() {
        return new ObjectXPositionRemoteDto[]{START_TO_START, START_TO_END, CENTER_X, END_TO_START, END_TO_END, CENTER_TO_START, CENTER_TO_END};
    }

    static {
        ObjectXPositionRemoteDto[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
    }

    private ObjectXPositionRemoteDto(String str, int i) {
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static ObjectXPositionRemoteDto valueOf(String str) {
        return (ObjectXPositionRemoteDto) Enum.valueOf(ObjectXPositionRemoteDto.class, str);
    }

    public static ObjectXPositionRemoteDto[] values() {
        return (ObjectXPositionRemoteDto[]) $VALUES.clone();
    }
}
