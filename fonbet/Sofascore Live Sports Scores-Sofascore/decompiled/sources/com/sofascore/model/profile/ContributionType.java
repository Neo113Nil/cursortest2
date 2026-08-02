package com.sofascore.model.profile;

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
@r5h(with = ContributionTypeSerializer.class)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, d2 = {"Lcom/sofascore/model/profile/ContributionType;", "", "<init>", "(Ljava/lang/String;I)V", "EVENT_START_DATE", "EVENT_SCORE", "EVENT_STATUS", "GOAL_SCORER", "GOAL_ASSISTANT", "Companion", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ContributionType {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ ContributionType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @q5h("eventStartDate")
    public static final ContributionType EVENT_START_DATE = new ContributionType("EVENT_START_DATE", 0);

    @q5h("eventScore")
    public static final ContributionType EVENT_SCORE = new ContributionType("EVENT_SCORE", 1);

    @q5h("eventStatus")
    public static final ContributionType EVENT_STATUS = new ContributionType("EVENT_STATUS", 2);

    @q5h("goalScorer")
    public static final ContributionType GOAL_SCORER = new ContributionType("GOAL_SCORER", 3);

    @q5h("goalAssistant")
    public static final ContributionType GOAL_ASSISTANT = new ContributionType("GOAL_ASSISTANT", 4);

    private static final /* synthetic */ ContributionType[] $values() {
        return new ContributionType[]{EVENT_START_DATE, EVENT_SCORE, EVENT_STATUS, GOAL_SCORER, GOAL_ASSISTANT};
    }

    static {
        ContributionType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
        INSTANCE = new Companion(null);
    }

    private ContributionType(String str, int i) {
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static ContributionType valueOf(String str) {
        return (ContributionType) Enum.valueOf(ContributionType.class, str);
    }

    public static ContributionType[] values() {
        return (ContributionType[]) $VALUES.clone();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/profile/ContributionType$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/profile/ContributionType;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return ContributionTypeSerializer.INSTANCE;
        }

        private Companion() {
        }
    }
}
