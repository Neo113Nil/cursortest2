package com.sofascore.model;

import com.appsflyer.internal.i;
import com.ironsource.Fc;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import defpackage.dmi;
import defpackage.gz8;
import defpackage.hz8;
import defpackage.joa;
import defpackage.jp5;
import defpackage.ljg;
import defpackage.lkb;
import defpackage.lnb;
import defpackage.oea;
import defpackage.q5h;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.us9;
import defpackage.wf3;
import defpackage.ypa;
import defpackage.ysa;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u0000 C2\u00020\u0001:\u0004DEFCBM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010Be\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000f\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0010\u0010#\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b'\u0010$J\u0012\u0010(\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b*\u0010+Jf\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b.\u0010!J\u0010\u0010/\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b/\u0010\u001fJ\u001a\u00103\u001a\u0002022\b\u00101\u001a\u0004\u0018\u000100HÖ\u0003¢\u0006\u0004\b3\u00104R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00105\u001a\u0004\b6\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00107\u001a\u0004\b8\u0010!R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00107\u001a\u0004\b9\u0010!R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010:\u001a\u0004\b;\u0010$R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010<\u001a\u0004\b=\u0010&R\u0017\u0010\n\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\n\u0010:\u001a\u0004\b>\u0010$R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010?\u001a\u0004\b@\u0010)R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010A\u001a\u0004\bB\u0010+¨\u0006G"}, d2 = {"Lcom/sofascore/model/Injury;", "Ljava/io/Serializable;", "", "id", "", "status", "reason", "", "startDateTimestamp", "endDateTimestamp", "updateDateTimestamp", "Lcom/sofascore/model/Injury$ExpectedReturn;", "expectedReturn", "Lcom/sofascore/model/Injury$ExpectedReturnDateData;", "expectedReturnDateData", "<init>", "(ILjava/lang/String;Ljava/lang/String;JLjava/lang/Long;JLcom/sofascore/model/Injury$ExpectedReturn;Lcom/sofascore/model/Injury$ExpectedReturnDateData;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/String;JLjava/lang/Long;JLcom/sofascore/model/Injury$ExpectedReturn;Lcom/sofascore/model/Injury$ExpectedReturnDateData;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/Injury;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "component4", "()J", "component5", "()Ljava/lang/Long;", "component6", "component7", "()Lcom/sofascore/model/Injury$ExpectedReturn;", "component8", "()Lcom/sofascore/model/Injury$ExpectedReturnDateData;", "copy", "(ILjava/lang/String;Ljava/lang/String;JLjava/lang/Long;JLcom/sofascore/model/Injury$ExpectedReturn;Lcom/sofascore/model/Injury$ExpectedReturnDateData;)Lcom/sofascore/model/Injury;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Ljava/lang/String;", "getStatus", "getReason", "J", "getStartDateTimestamp", "Ljava/lang/Long;", "getEndDateTimestamp", "getUpdateDateTimestamp", "Lcom/sofascore/model/Injury$ExpectedReturn;", "getExpectedReturn", "Lcom/sofascore/model/Injury$ExpectedReturnDateData;", "getExpectedReturnDateData", "Companion", "ExpectedReturn", "ExpectedReturnDateData", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Injury implements Serializable {

    @Nullable
    private final Long endDateTimestamp;

    @Nullable
    private final ExpectedReturn expectedReturn;

    @Nullable
    private final ExpectedReturnDateData expectedReturnDateData;
    private final int id;

    @NotNull
    private final String reason;
    private final long startDateTimestamp;

    @NotNull
    private final String status;
    private final long updateDateTimestamp;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {null, null, null, null, null, null, ypa.a(ysa.b, new us9(13)), null};

    public /* synthetic */ Injury(int i, int i2, String str, String str2, long j, Long l, long j2, ExpectedReturn expectedReturn, ExpectedReturnDateData expectedReturnDateData, t5h t5hVar) {
        if (255 != (i & 255)) {
            oea.z(i, 255, Injury$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = i2;
        this.status = str;
        this.reason = str2;
        this.startDateTimestamp = j;
        this.endDateTimestamp = l;
        this.updateDateTimestamp = j2;
        this.expectedReturn = expectedReturn;
        this.expectedReturnDateData = expectedReturnDateData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return ExpectedReturn.INSTANCE.serializer();
    }

    public static /* synthetic */ Injury copy$default(Injury injury, int i, String str, String str2, long j, Long l, long j2, ExpectedReturn expectedReturn, ExpectedReturnDateData expectedReturnDateData, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = injury.id;
        }
        if ((i2 & 2) != 0) {
            str = injury.status;
        }
        if ((i2 & 4) != 0) {
            str2 = injury.reason;
        }
        if ((i2 & 8) != 0) {
            j = injury.startDateTimestamp;
        }
        if ((i2 & 16) != 0) {
            l = injury.endDateTimestamp;
        }
        if ((i2 & 32) != 0) {
            j2 = injury.updateDateTimestamp;
        }
        if ((i2 & 64) != 0) {
            expectedReturn = injury.expectedReturn;
        }
        if ((i2 & 128) != 0) {
            expectedReturnDateData = injury.expectedReturnDateData;
        }
        Long l2 = l;
        long j3 = j;
        String str3 = str2;
        return injury.copy(i, str, str3, j3, l2, j2, expectedReturn, expectedReturnDateData);
    }

    public static final /* synthetic */ void write$Self$model_release(Injury self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.u(0, self.id, serialDesc);
        output.y(serialDesc, 1, self.status);
        output.y(serialDesc, 2, self.reason);
        output.E(serialDesc, 3, self.startDateTimestamp);
        output.h(serialDesc, 4, lkb.a, self.endDateTimestamp);
        output.E(serialDesc, 5, self.updateDateTimestamp);
        output.h(serialDesc, 6, (KSerializer) joaVarArr[6].getValue(), self.expectedReturn);
        output.h(serialDesc, 7, Injury$ExpectedReturnDateData$$serializer.INSTANCE, self.expectedReturnDateData);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    /* renamed from: component4, reason: from getter */
    public final long getStartDateTimestamp() {
        return this.startDateTimestamp;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Long getEndDateTimestamp() {
        return this.endDateTimestamp;
    }

    /* renamed from: component6, reason: from getter */
    public final long getUpdateDateTimestamp() {
        return this.updateDateTimestamp;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final ExpectedReturn getExpectedReturn() {
        return this.expectedReturn;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final ExpectedReturnDateData getExpectedReturnDateData() {
        return this.expectedReturnDateData;
    }

    @NotNull
    public final Injury copy(int id, @NotNull String status, @NotNull String reason, long startDateTimestamp, @Nullable Long endDateTimestamp, long updateDateTimestamp, @Nullable ExpectedReturn expectedReturn, @Nullable ExpectedReturnDateData expectedReturnDateData) {
        status.getClass();
        reason.getClass();
        return new Injury(id, status, reason, startDateTimestamp, endDateTimestamp, updateDateTimestamp, expectedReturn, expectedReturnDateData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Injury)) {
            return false;
        }
        Injury injury = (Injury) other;
        return this.id == injury.id && Intrinsics.c(this.status, injury.status) && Intrinsics.c(this.reason, injury.reason) && this.startDateTimestamp == injury.startDateTimestamp && Intrinsics.c(this.endDateTimestamp, injury.endDateTimestamp) && this.updateDateTimestamp == injury.updateDateTimestamp && this.expectedReturn == injury.expectedReturn && Intrinsics.c(this.expectedReturnDateData, injury.expectedReturnDateData);
    }

    @Nullable
    public final Long getEndDateTimestamp() {
        return this.endDateTimestamp;
    }

    @Nullable
    public final ExpectedReturn getExpectedReturn() {
        return this.expectedReturn;
    }

    @Nullable
    public final ExpectedReturnDateData getExpectedReturnDateData() {
        return this.expectedReturnDateData;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final String getReason() {
        return this.reason;
    }

    public final long getStartDateTimestamp() {
        return this.startDateTimestamp;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    public final long getUpdateDateTimestamp() {
        return this.updateDateTimestamp;
    }

    public int hashCode() {
        int c = ljg.c(dmi.c(dmi.c(Integer.hashCode(this.id) * 31, 31, this.status), 31, this.reason), 31, this.startDateTimestamp);
        Long l = this.endDateTimestamp;
        int c2 = ljg.c((c + (l == null ? 0 : l.hashCode())) * 31, 31, this.updateDateTimestamp);
        ExpectedReturn expectedReturn = this.expectedReturn;
        int hashCode = (c2 + (expectedReturn == null ? 0 : expectedReturn.hashCode())) * 31;
        ExpectedReturnDateData expectedReturnDateData = this.expectedReturnDateData;
        return hashCode + (expectedReturnDateData != null ? expectedReturnDateData.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i = this.id;
        String str = this.status;
        String str2 = this.reason;
        long j = this.startDateTimestamp;
        Long l = this.endDateTimestamp;
        long j2 = this.updateDateTimestamp;
        ExpectedReturn expectedReturn = this.expectedReturn;
        ExpectedReturnDateData expectedReturnDateData = this.expectedReturnDateData;
        StringBuilder t = dmi.t(i, "Injury(id=", ", status=", str, ", reason=");
        i.n(j, str2, ", startDateTimestamp=", t);
        t.append(", endDateTimestamp=");
        t.append(l);
        t.append(", updateDateTimestamp=");
        t.append(j2);
        t.append(", expectedReturn=");
        t.append(expectedReturn);
        t.append(", expectedReturnDateData=");
        t.append(expectedReturnDateData);
        t.append(")");
        return t.toString();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @r5h
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0011\b\u0087\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0011B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0012"}, d2 = {"Lcom/sofascore/model/Injury$ExpectedReturn;", "", "<init>", "(Ljava/lang/String;I)V", "AFewDays", "DayToDay", "Unknown", "OutForSeason", "EarlyMonthYear", "MidMonthYear", "LateMonthYear", "NotActive", "Doubtful", "BackInTraining", "AFewWeeks", "AboutAWeek", "AboutOneOrTwoWeeks", "Companion", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ExpectedReturn {
        private static final /* synthetic */ jp5 $ENTRIES;
        private static final /* synthetic */ ExpectedReturn[] $VALUES;

        @NotNull
        private static final joa $cachedSerializer$delegate;

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE;

        @q5h("1")
        public static final ExpectedReturn AFewDays = new ExpectedReturn("AFewDays", 0);

        @q5h("2")
        public static final ExpectedReturn DayToDay = new ExpectedReturn("DayToDay", 1);

        @q5h("3")
        public static final ExpectedReturn Unknown = new ExpectedReturn("Unknown", 2);

        @q5h("4")
        public static final ExpectedReturn OutForSeason = new ExpectedReturn("OutForSeason", 3);

        @q5h(CampaignEx.CLICKMODE_ON)
        public static final ExpectedReturn EarlyMonthYear = new ExpectedReturn("EarlyMonthYear", 4);

        @q5h("6")
        public static final ExpectedReturn MidMonthYear = new ExpectedReturn("MidMonthYear", 5);

        @q5h(Fc.e)
        public static final ExpectedReturn LateMonthYear = new ExpectedReturn("LateMonthYear", 6);

        @q5h("8")
        public static final ExpectedReturn NotActive = new ExpectedReturn("NotActive", 7);

        @q5h("9")
        public static final ExpectedReturn Doubtful = new ExpectedReturn("Doubtful", 8);

        @q5h("10")
        public static final ExpectedReturn BackInTraining = new ExpectedReturn("BackInTraining", 9);

        @q5h("11")
        public static final ExpectedReturn AFewWeeks = new ExpectedReturn("AFewWeeks", 10);

        @q5h("12")
        public static final ExpectedReturn AboutAWeek = new ExpectedReturn("AboutAWeek", 11);

        @q5h("13")
        public static final ExpectedReturn AboutOneOrTwoWeeks = new ExpectedReturn("AboutOneOrTwoWeeks", 12);

        private static final /* synthetic */ ExpectedReturn[] $values() {
            return new ExpectedReturn[]{AFewDays, DayToDay, Unknown, OutForSeason, EarlyMonthYear, MidMonthYear, LateMonthYear, NotActive, Doubtful, BackInTraining, AFewWeeks, AboutAWeek, AboutOneOrTwoWeeks};
        }

        static {
            ExpectedReturn[] $values = $values();
            $VALUES = $values;
            $ENTRIES = gz8.G($values);
            INSTANCE = new Companion(null);
            $cachedSerializer$delegate = ypa.a(ysa.b, new us9(14));
        }

        private ExpectedReturn(String str, int i) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return hz8.F("com.sofascore.model.Injury.ExpectedReturn", values(), new String[]{"1", "2", "3", "4", CampaignEx.CLICKMODE_ON, "6", Fc.e, "8", "9", "10", "11", "12", "13"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null, null});
        }

        @NotNull
        public static jp5 getEntries() {
            return $ENTRIES;
        }

        public static ExpectedReturn valueOf(String str) {
            return (ExpectedReturn) Enum.valueOf(ExpectedReturn.class, str);
        }

        public static ExpectedReturn[] values() {
            return (ExpectedReturn[]) $VALUES.clone();
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/Injury$ExpectedReturn$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/Injury$ExpectedReturn;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final /* synthetic */ KSerializer get$cachedSerializer() {
                return (KSerializer) ExpectedReturn.$cachedSerializer$delegate.getValue();
            }

            @NotNull
            public final KSerializer serializer() {
                return get$cachedSerializer();
            }

            private Companion() {
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @r5h
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&%B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0005\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J$\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0015J\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u0015¨\u0006'"}, d2 = {"Lcom/sofascore/model/Injury$ExpectedReturnDateData;", "Ljava/io/Serializable;", "", "month", "year", "<init>", "(II)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IIILt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/Injury$ExpectedReturnDateData;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "copy", "(II)Lcom/sofascore/model/Injury$ExpectedReturnDateData;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getMonth", "getYear", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ExpectedReturnDateData implements Serializable {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        private final int month;
        private final int year;

        public /* synthetic */ ExpectedReturnDateData(int i, int i2, int i3, t5h t5hVar) {
            if (3 != (i & 3)) {
                oea.z(i, 3, Injury$ExpectedReturnDateData$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.month = i2;
            this.year = i3;
        }

        public static /* synthetic */ ExpectedReturnDateData copy$default(ExpectedReturnDateData expectedReturnDateData, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = expectedReturnDateData.month;
            }
            if ((i3 & 2) != 0) {
                i2 = expectedReturnDateData.year;
            }
            return expectedReturnDateData.copy(i, i2);
        }

        public static final /* synthetic */ void write$Self$model_release(ExpectedReturnDateData self, wf3 output, SerialDescriptor serialDesc) {
            output.u(0, self.month, serialDesc);
            output.u(1, self.year, serialDesc);
        }

        /* renamed from: component1, reason: from getter */
        public final int getMonth() {
            return this.month;
        }

        /* renamed from: component2, reason: from getter */
        public final int getYear() {
            return this.year;
        }

        @NotNull
        public final ExpectedReturnDateData copy(int month, int year) {
            return new ExpectedReturnDateData(month, year);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ExpectedReturnDateData)) {
                return false;
            }
            ExpectedReturnDateData expectedReturnDateData = (ExpectedReturnDateData) other;
            return this.month == expectedReturnDateData.month && this.year == expectedReturnDateData.year;
        }

        public final int getMonth() {
            return this.month;
        }

        public final int getYear() {
            return this.year;
        }

        public int hashCode() {
            return Integer.hashCode(this.year) + (Integer.hashCode(this.month) * 31);
        }

        @NotNull
        public String toString() {
            return lnb.j(this.month, this.year, "ExpectedReturnDateData(month=", ", year=", ")");
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/Injury$ExpectedReturnDateData$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/Injury$ExpectedReturnDateData;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return Injury$ExpectedReturnDateData$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public ExpectedReturnDateData(int i, int i2) {
            this.month = i;
            this.year = i2;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/Injury$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/Injury;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return Injury$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public Injury(int i, @NotNull String str, @NotNull String str2, long j, @Nullable Long l, long j2, @Nullable ExpectedReturn expectedReturn, @Nullable ExpectedReturnDateData expectedReturnDateData) {
        str.getClass();
        str2.getClass();
        this.id = i;
        this.status = str;
        this.reason = str2;
        this.startDateTimestamp = j;
        this.endDateTimestamp = l;
        this.updateDateTimestamp = j2;
        this.expectedReturn = expectedReturn;
        this.expectedReturnDateData = expectedReturnDateData;
    }
}
