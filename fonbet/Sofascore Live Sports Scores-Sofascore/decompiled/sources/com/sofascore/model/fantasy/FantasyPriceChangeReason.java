package com.sofascore.model.fantasy;

import defpackage.gz8;
import defpackage.jp5;
import defpackage.q5h;
import defpackage.r5h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h(with = FantasyPriceChangeReasonSerializer.class)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/sofascore/model/fantasy/FantasyPriceChangeReason;", "", "<init>", "(Ljava/lang/String;I)V", "GOOD_PERFORMANCE", "BAD_PERFORMANCE", "TOP_FORM", "GOOD_FORM", "BAD_FORM", "TRANSFERS_IN", "TRANSFERS_OUT", "UNKNOWN", "Companion", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FantasyPriceChangeReason {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ FantasyPriceChangeReason[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @q5h("bestPerformer")
    public static final FantasyPriceChangeReason GOOD_PERFORMANCE = new FantasyPriceChangeReason("GOOD_PERFORMANCE", 0);

    @q5h("worstPerformer")
    public static final FantasyPriceChangeReason BAD_PERFORMANCE = new FantasyPriceChangeReason("BAD_PERFORMANCE", 1);

    @q5h("topForm")
    public static final FantasyPriceChangeReason TOP_FORM = new FantasyPriceChangeReason("TOP_FORM", 2);

    @q5h("goodForm")
    public static final FantasyPriceChangeReason GOOD_FORM = new FantasyPriceChangeReason("GOOD_FORM", 3);

    @q5h("badForm")
    public static final FantasyPriceChangeReason BAD_FORM = new FantasyPriceChangeReason("BAD_FORM", 4);

    @q5h("mostTransferAdds")
    public static final FantasyPriceChangeReason TRANSFERS_IN = new FantasyPriceChangeReason("TRANSFERS_IN", 5);

    @q5h("mostTransferDrops")
    public static final FantasyPriceChangeReason TRANSFERS_OUT = new FantasyPriceChangeReason("TRANSFERS_OUT", 6);
    public static final FantasyPriceChangeReason UNKNOWN = new FantasyPriceChangeReason("UNKNOWN", 7);

    private static final /* synthetic */ FantasyPriceChangeReason[] $values() {
        return new FantasyPriceChangeReason[]{GOOD_PERFORMANCE, BAD_PERFORMANCE, TOP_FORM, GOOD_FORM, BAD_FORM, TRANSFERS_IN, TRANSFERS_OUT, UNKNOWN};
    }

    static {
        FantasyPriceChangeReason[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
        INSTANCE = new Companion(null);
    }

    private FantasyPriceChangeReason(String str, int i) {
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static FantasyPriceChangeReason valueOf(String str) {
        return (FantasyPriceChangeReason) Enum.valueOf(FantasyPriceChangeReason.class, str);
    }

    public static FantasyPriceChangeReason[] values() {
        return (FantasyPriceChangeReason[]) $VALUES.clone();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/fantasy/FantasyPriceChangeReason$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/fantasy/FantasyPriceChangeReason;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return FantasyPriceChangeReasonSerializer.INSTANCE;
        }

        private Companion() {
        }
    }
}
