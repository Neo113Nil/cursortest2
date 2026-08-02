package com.sofascore.model.newNetwork.statistics;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.logger.IronSourceError;
import defpackage.a7a;
import defpackage.bf3;
import defpackage.gz1;
import defpackage.me4;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.wf3;
import defpackage.wv8;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b(\b\u0087\b\u0018\u0000 @2\u00020\u0001:\u0002A@Bk\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010B\u007f\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000f\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0012\u0010#\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b#\u0010!J\u0012\u0010$\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b$\u0010!J\u0012\u0010%\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b%\u0010!J\u0012\u0010&\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b&\u0010!J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001fJ\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u001fJ\u0012\u0010)\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0088\u0001\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b-\u0010!J\u0010\u0010.\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00101\u001a\u00020\r2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b1\u00102R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010\u001fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\b6\u0010!R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00105\u001a\u0004\b7\u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u00105\u001a\u0004\b8\u0010!R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u00105\u001a\u0004\b9\u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b:\u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\n\u00105\u001a\u0004\b;\u0010!R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00103\u001a\u0004\b<\u0010\u001fR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u00103\u001a\u0004\b=\u0010\u001fR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010>\u001a\u0004\b?\u0010*¨\u0006B"}, d2 = {"Lcom/sofascore/model/newNetwork/statistics/BaseballRunner;", "", "", "id", "", "firstName", "lastName", "jerseyNumber", "position", "outcomeId", "description", "startingBase", "endingBase", "", "out", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/statistics/BaseballRunner;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/Integer;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;)Lcom/sofascore/model/newNetwork/statistics/BaseballRunner;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getId", "Ljava/lang/String;", "getFirstName", "getLastName", "getJerseyNumber", "getPosition", "getOutcomeId", "getDescription", "getStartingBase", "getEndingBase", "Ljava/lang/Boolean;", "getOut", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class BaseballRunner {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final String description;

    @Nullable
    private final Integer endingBase;

    @Nullable
    private final String firstName;

    @Nullable
    private final Integer id;

    @Nullable
    private final String jerseyNumber;

    @Nullable
    private final String lastName;

    @Nullable
    private final Boolean out;

    @Nullable
    private final String outcomeId;

    @Nullable
    private final String position;

    @Nullable
    private final Integer startingBase;

    public /* synthetic */ BaseballRunner(int i, Integer num, String str, String str2, String str3, String str4, String str5, String str6, Integer num2, Integer num3, Boolean bool, t5h t5hVar) {
        if (1023 != (i & IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE)) {
            oea.z(i, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, BaseballRunner$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = num;
        this.firstName = str;
        this.lastName = str2;
        this.jerseyNumber = str3;
        this.position = str4;
        this.outcomeId = str5;
        this.description = str6;
        this.startingBase = num2;
        this.endingBase = num3;
        this.out = bool;
    }

    public static /* synthetic */ BaseballRunner copy$default(BaseballRunner baseballRunner, Integer num, String str, String str2, String str3, String str4, String str5, String str6, Integer num2, Integer num3, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            num = baseballRunner.id;
        }
        if ((i & 2) != 0) {
            str = baseballRunner.firstName;
        }
        if ((i & 4) != 0) {
            str2 = baseballRunner.lastName;
        }
        if ((i & 8) != 0) {
            str3 = baseballRunner.jerseyNumber;
        }
        if ((i & 16) != 0) {
            str4 = baseballRunner.position;
        }
        if ((i & 32) != 0) {
            str5 = baseballRunner.outcomeId;
        }
        if ((i & 64) != 0) {
            str6 = baseballRunner.description;
        }
        if ((i & 128) != 0) {
            num2 = baseballRunner.startingBase;
        }
        if ((i & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            num3 = baseballRunner.endingBase;
        }
        if ((i & 512) != 0) {
            bool = baseballRunner.out;
        }
        Integer num4 = num3;
        Boolean bool2 = bool;
        String str7 = str6;
        Integer num5 = num2;
        String str8 = str4;
        String str9 = str5;
        return baseballRunner.copy(num, str, str2, str3, str8, str9, str7, num5, num4, bool2);
    }

    public static final /* synthetic */ void write$Self$model_release(BaseballRunner self, wf3 output, SerialDescriptor serialDesc) {
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 0, a7aVar, self.id);
        uhi uhiVar = uhi.a;
        output.h(serialDesc, 1, uhiVar, self.firstName);
        output.h(serialDesc, 2, uhiVar, self.lastName);
        output.h(serialDesc, 3, uhiVar, self.jerseyNumber);
        output.h(serialDesc, 4, uhiVar, self.position);
        output.h(serialDesc, 5, uhiVar, self.outcomeId);
        output.h(serialDesc, 6, uhiVar, self.description);
        output.h(serialDesc, 7, a7aVar, self.startingBase);
        output.h(serialDesc, 8, a7aVar, self.endingBase);
        output.h(serialDesc, 9, gz1.a, self.out);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Integer getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final Boolean getOut() {
        return this.out;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getJerseyNumber() {
        return this.jerseyNumber;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getPosition() {
        return this.position;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getOutcomeId() {
        return this.outcomeId;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Integer getStartingBase() {
        return this.startingBase;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Integer getEndingBase() {
        return this.endingBase;
    }

    @NotNull
    public final BaseballRunner copy(@Nullable Integer id, @Nullable String firstName, @Nullable String lastName, @Nullable String jerseyNumber, @Nullable String position, @Nullable String outcomeId, @Nullable String description, @Nullable Integer startingBase, @Nullable Integer endingBase, @Nullable Boolean out) {
        return new BaseballRunner(id, firstName, lastName, jerseyNumber, position, outcomeId, description, startingBase, endingBase, out);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BaseballRunner)) {
            return false;
        }
        BaseballRunner baseballRunner = (BaseballRunner) other;
        return Intrinsics.c(this.id, baseballRunner.id) && Intrinsics.c(this.firstName, baseballRunner.firstName) && Intrinsics.c(this.lastName, baseballRunner.lastName) && Intrinsics.c(this.jerseyNumber, baseballRunner.jerseyNumber) && Intrinsics.c(this.position, baseballRunner.position) && Intrinsics.c(this.outcomeId, baseballRunner.outcomeId) && Intrinsics.c(this.description, baseballRunner.description) && Intrinsics.c(this.startingBase, baseballRunner.startingBase) && Intrinsics.c(this.endingBase, baseballRunner.endingBase) && Intrinsics.c(this.out, baseballRunner.out);
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    public final Integer getEndingBase() {
        return this.endingBase;
    }

    @Nullable
    public final String getFirstName() {
        return this.firstName;
    }

    @Nullable
    public final Integer getId() {
        return this.id;
    }

    @Nullable
    public final String getJerseyNumber() {
        return this.jerseyNumber;
    }

    @Nullable
    public final String getLastName() {
        return this.lastName;
    }

    @Nullable
    public final Boolean getOut() {
        return this.out;
    }

    @Nullable
    public final String getOutcomeId() {
        return this.outcomeId;
    }

    @Nullable
    public final String getPosition() {
        return this.position;
    }

    @Nullable
    public final Integer getStartingBase() {
        return this.startingBase;
    }

    public int hashCode() {
        Integer num = this.id;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.firstName;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.lastName;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.jerseyNumber;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.position;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.outcomeId;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.description;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num2 = this.startingBase;
        int hashCode8 = (hashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.endingBase;
        int hashCode9 = (hashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool = this.out;
        return hashCode9 + (bool != null ? bool.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Integer num = this.id;
        String str = this.firstName;
        String str2 = this.lastName;
        String str3 = this.jerseyNumber;
        String str4 = this.position;
        String str5 = this.outcomeId;
        String str6 = this.description;
        Integer num2 = this.startingBase;
        Integer num3 = this.endingBase;
        Boolean bool = this.out;
        StringBuilder m = wv8.m("BaseballRunner(id=", num, ", firstName=", str, ", lastName=");
        bf3.v(m, str2, ", jerseyNumber=", str3, ", position=");
        bf3.v(m, str4, ", outcomeId=", str5, ", description=");
        me4.o(num2, str6, ", startingBase=", ", endingBase=", m);
        m.append(num3);
        m.append(", out=");
        m.append(bool);
        m.append(")");
        return m.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/statistics/BaseballRunner$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/statistics/BaseballRunner;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return BaseballRunner$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public BaseballRunner(@Nullable Integer num, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Integer num2, @Nullable Integer num3, @Nullable Boolean bool) {
        this.id = num;
        this.firstName = str;
        this.lastName = str2;
        this.jerseyNumber = str3;
        this.position = str4;
        this.outcomeId = str5;
        this.description = str6;
        this.startingBase = num2;
        this.endingBase = num3;
        this.out = bool;
    }
}
