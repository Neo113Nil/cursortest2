package com.blaze.blazesdk.data_source;

import androidx.annotation.Keep;
import com.ironsource.U3;
import defpackage.gz8;
import defpackage.jp5;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/blaze/blazesdk/data_source/BlazeOrderType;", "", U3.i.X, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "setValue", "(Ljava/lang/String;)V", "MANUAL", "RECENTLY_UPDATED_FIRST", "RECENTLY_UPDATED_LAST", "A_TO_Z", "Z_TO_A", "RECENTLY_CREATED_FIRST", "RECENTLY_CREATED_LAST", "RANDOM", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BlazeOrderType {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ BlazeOrderType[] $VALUES;

    @NotNull
    private String value;
    public static final BlazeOrderType MANUAL = new BlazeOrderType("MANUAL", 0, "Manual");
    public static final BlazeOrderType RECENTLY_UPDATED_FIRST = new BlazeOrderType("RECENTLY_UPDATED_FIRST", 1, "RecentlyUpdatedFirst");
    public static final BlazeOrderType RECENTLY_UPDATED_LAST = new BlazeOrderType("RECENTLY_UPDATED_LAST", 2, "RecentlyUpdatedLast");
    public static final BlazeOrderType A_TO_Z = new BlazeOrderType("A_TO_Z", 3, "AtoZ");
    public static final BlazeOrderType Z_TO_A = new BlazeOrderType("Z_TO_A", 4, "ZtoA");
    public static final BlazeOrderType RECENTLY_CREATED_FIRST = new BlazeOrderType("RECENTLY_CREATED_FIRST", 5, "RecentlyCreatedFirst");
    public static final BlazeOrderType RECENTLY_CREATED_LAST = new BlazeOrderType("RECENTLY_CREATED_LAST", 6, "RecentlyCreatedLast");
    public static final BlazeOrderType RANDOM = new BlazeOrderType("RANDOM", 7, "Random");

    private static final /* synthetic */ BlazeOrderType[] $values() {
        return new BlazeOrderType[]{MANUAL, RECENTLY_UPDATED_FIRST, RECENTLY_UPDATED_LAST, A_TO_Z, Z_TO_A, RECENTLY_CREATED_FIRST, RECENTLY_CREATED_LAST, RANDOM};
    }

    static {
        BlazeOrderType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
    }

    private BlazeOrderType(String str, int i, String str2) {
        this.value = str2;
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static BlazeOrderType valueOf(String str) {
        return (BlazeOrderType) Enum.valueOf(BlazeOrderType.class, str);
    }

    public static BlazeOrderType[] values() {
        return (BlazeOrderType[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    public final void setValue(@NotNull String str) {
        str.getClass();
        this.value = str;
    }
}
