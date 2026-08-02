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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/blaze/blazesdk/widgets/models/AdvancedOrderTypeRemoteDto;", "", "<init>", "(Ljava/lang/String;I)V", "LIVE_FIRST", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AdvancedOrderTypeRemoteDto {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ AdvancedOrderTypeRemoteDto[] $VALUES;

    @b6h("liveFirst")
    public static final AdvancedOrderTypeRemoteDto LIVE_FIRST = new AdvancedOrderTypeRemoteDto("LIVE_FIRST", 0);

    private static final /* synthetic */ AdvancedOrderTypeRemoteDto[] $values() {
        return new AdvancedOrderTypeRemoteDto[]{LIVE_FIRST};
    }

    static {
        AdvancedOrderTypeRemoteDto[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
    }

    private AdvancedOrderTypeRemoteDto(String str, int i) {
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static AdvancedOrderTypeRemoteDto valueOf(String str) {
        return (AdvancedOrderTypeRemoteDto) Enum.valueOf(AdvancedOrderTypeRemoteDto.class, str);
    }

    public static AdvancedOrderTypeRemoteDto[] values() {
        return (AdvancedOrderTypeRemoteDto[]) $VALUES.clone();
    }
}
