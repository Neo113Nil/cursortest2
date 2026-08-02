package com.sofascore.model.database;

import com.ironsource.Fc;
import com.ironsource.U3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import defpackage.gz8;
import defpackage.hz8;
import defpackage.joa;
import defpackage.jp5;
import defpackage.pxk;
import defpackage.q5h;
import defpackage.r5h;
import defpackage.ypa;
import defpackage.ysa;
import java.lang.annotation.Annotation;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, d2 = {"Lcom/sofascore/model/database/VoteType;", "", U3.i.X, "", "serializedValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "getValue", "()Ljava/lang/String;", "getSerializedValue", "()I", "WHO_WILL_WIN", "WILL_BOTH_TEAMS_SCORE", "FIRST_TEAM_TO_SCORE", "MMA_POST_MATCH_VOTING", "Companion", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class VoteType {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ VoteType[] $VALUES;

    @NotNull
    private static final joa $cachedSerializer$delegate;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    private final int serializedValue;

    @NotNull
    private final String value;

    @q5h("1")
    public static final VoteType WHO_WILL_WIN = new VoteType("WHO_WILL_WIN", 0, "Full time", 1);

    @q5h(CampaignEx.CLICKMODE_ON)
    public static final VoteType WILL_BOTH_TEAMS_SCORE = new VoteType("WILL_BOTH_TEAMS_SCORE", 1, "Both teams to score", 5);

    @q5h("6")
    public static final VoteType FIRST_TEAM_TO_SCORE = new VoteType("FIRST_TEAM_TO_SCORE", 2, "First team to score", 6);

    @q5h(Fc.e)
    public static final VoteType MMA_POST_MATCH_VOTING = new VoteType("MMA_POST_MATCH_VOTING", 3, "Mma post match voting", 7);

    private static final /* synthetic */ VoteType[] $values() {
        return new VoteType[]{WHO_WILL_WIN, WILL_BOTH_TEAMS_SCORE, FIRST_TEAM_TO_SCORE, MMA_POST_MATCH_VOTING};
    }

    static {
        VoteType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
        INSTANCE = new Companion(null);
        $cachedSerializer$delegate = ypa.a(ysa.b, new pxk(23));
    }

    private VoteType(String str, int i, String str2, int i2) {
        this.value = str2;
        this.serializedValue = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return hz8.F("com.sofascore.model.database.VoteType", values(), new String[]{"1", CampaignEx.CLICKMODE_ON, "6", Fc.e}, new Annotation[][]{null, null, null, null});
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static VoteType valueOf(String str) {
        return (VoteType) Enum.valueOf(VoteType.class, str);
    }

    public static VoteType[] values() {
        return (VoteType[]) $VALUES.clone();
    }

    public final int getSerializedValue() {
        return this.serializedValue;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\nJ\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\f¨\u0006\r"}, d2 = {"Lcom/sofascore/model/database/VoteType$Companion;", "", "<init>", "()V", "getFromValue", "Lcom/sofascore/model/database/VoteType;", U3.i.X, "", "getFromOrdinal", "ordinalValue", "", "serializer", "Lkotlinx/serialization/KSerializer;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) VoteType.$cachedSerializer$delegate.getValue();
        }

        @Nullable
        public final VoteType getFromOrdinal(int ordinalValue) {
            Object obj;
            Iterator<E> it = VoteType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((VoteType) obj).ordinal() == ordinalValue) {
                    break;
                }
            }
            return (VoteType) obj;
        }

        @NotNull
        public final VoteType getFromValue(@NotNull String value) {
            Object obj;
            value.getClass();
            Iterator<E> it = VoteType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.c(((VoteType) obj).getValue(), value)) {
                    break;
                }
            }
            VoteType voteType = (VoteType) obj;
            return voteType == null ? VoteType.WHO_WILL_WIN : voteType;
        }

        @NotNull
        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }
}
