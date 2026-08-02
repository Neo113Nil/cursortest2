package com.sofascore.model.newNetwork.commentary;

import com.ironsource.C4094gc;
import com.sofascore.model.newNetwork.FootballShotmapItem;
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
@r5h(with = SegmentEventTypeSerializer.class)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/sofascore/model/newNetwork/commentary/SegmentEventType;", "", "<init>", "(Ljava/lang/String;I)V", "PASS", "MOVEMENT", "GOAL", C4094gc.b, "SAVE", "MISSED_PENALTY", "SAVED_PENALTY", "Companion", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SegmentEventType {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ SegmentEventType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @q5h("pass")
    public static final SegmentEventType PASS = new SegmentEventType("PASS", 0);

    @q5h("ball-movement")
    public static final SegmentEventType MOVEMENT = new SegmentEventType("MOVEMENT", 1);

    @q5h("goal")
    public static final SegmentEventType GOAL = new SegmentEventType("GOAL", 2);

    @q5h(FootballShotmapItem.SHOT_TYPE_POST)
    public static final SegmentEventType POST = new SegmentEventType(C4094gc.b, 3);

    @q5h(FootballShotmapItem.SHOT_TYPE_SAVE)
    public static final SegmentEventType SAVE = new SegmentEventType("SAVE", 4);

    @q5h("penalty-miss")
    public static final SegmentEventType MISSED_PENALTY = new SegmentEventType("MISSED_PENALTY", 5);

    @q5h("penalty-save")
    public static final SegmentEventType SAVED_PENALTY = new SegmentEventType("SAVED_PENALTY", 6);

    private static final /* synthetic */ SegmentEventType[] $values() {
        return new SegmentEventType[]{PASS, MOVEMENT, GOAL, POST, SAVE, MISSED_PENALTY, SAVED_PENALTY};
    }

    static {
        SegmentEventType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
        INSTANCE = new Companion(null);
    }

    private SegmentEventType(String str, int i) {
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static SegmentEventType valueOf(String str) {
        return (SegmentEventType) Enum.valueOf(SegmentEventType.class, str);
    }

    public static SegmentEventType[] values() {
        return (SegmentEventType[]) $VALUES.clone();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/commentary/SegmentEventType$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/commentary/SegmentEventType;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return SegmentEventTypeSerializer.INSTANCE;
        }

        private Companion() {
        }
    }
}
