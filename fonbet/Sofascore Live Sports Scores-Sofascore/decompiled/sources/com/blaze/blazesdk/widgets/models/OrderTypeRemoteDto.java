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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/blaze/blazesdk/widgets/models/OrderTypeRemoteDto;", "", "<init>", "(Ljava/lang/String;I)V", "MANUAL", "RECENTLY_UPDATED_FIRST", "RECENTLY_UPDATED_LAST", "A_TO_Z", "Z_TO_A", "RECENTLY_CREATED_FIRST", "RECENTLY_CREATED_LAST", "RANDOM", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OrderTypeRemoteDto {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ OrderTypeRemoteDto[] $VALUES;

    @b6h("Manual")
    public static final OrderTypeRemoteDto MANUAL = new OrderTypeRemoteDto("MANUAL", 0);

    @b6h("RecentlyUpdatedFirst")
    public static final OrderTypeRemoteDto RECENTLY_UPDATED_FIRST = new OrderTypeRemoteDto("RECENTLY_UPDATED_FIRST", 1);

    @b6h("RecentlyUpdatedLast")
    public static final OrderTypeRemoteDto RECENTLY_UPDATED_LAST = new OrderTypeRemoteDto("RECENTLY_UPDATED_LAST", 2);

    @b6h("AtoZ")
    public static final OrderTypeRemoteDto A_TO_Z = new OrderTypeRemoteDto("A_TO_Z", 3);

    @b6h("ZtoA")
    public static final OrderTypeRemoteDto Z_TO_A = new OrderTypeRemoteDto("Z_TO_A", 4);

    @b6h("RecentlyCreatedFirst")
    public static final OrderTypeRemoteDto RECENTLY_CREATED_FIRST = new OrderTypeRemoteDto("RECENTLY_CREATED_FIRST", 5);

    @b6h("RecentlyCreatedLast")
    public static final OrderTypeRemoteDto RECENTLY_CREATED_LAST = new OrderTypeRemoteDto("RECENTLY_CREATED_LAST", 6);

    @b6h("Random")
    public static final OrderTypeRemoteDto RANDOM = new OrderTypeRemoteDto("RANDOM", 7);

    private static final /* synthetic */ OrderTypeRemoteDto[] $values() {
        return new OrderTypeRemoteDto[]{MANUAL, RECENTLY_UPDATED_FIRST, RECENTLY_UPDATED_LAST, A_TO_Z, Z_TO_A, RECENTLY_CREATED_FIRST, RECENTLY_CREATED_LAST, RANDOM};
    }

    static {
        OrderTypeRemoteDto[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
    }

    private OrderTypeRemoteDto(String str, int i) {
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static OrderTypeRemoteDto valueOf(String str) {
        return (OrderTypeRemoteDto) Enum.valueOf(OrderTypeRemoteDto.class, str);
    }

    public static OrderTypeRemoteDto[] values() {
        return (OrderTypeRemoteDto[]) $VALUES.clone();
    }
}
