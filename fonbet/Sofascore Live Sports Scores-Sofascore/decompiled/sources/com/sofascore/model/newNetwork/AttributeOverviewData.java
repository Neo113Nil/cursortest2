package com.sofascore.model.newNetwork;

import defpackage.a7a;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0018\b\u0007\u0018\u0000 12\u00020\u0001:\u000221By\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011B\u008f\u0001\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0010\u0010\u0015J'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b%\u0010$R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b&\u0010$R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b'\u0010$R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b(\u0010$R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b)\u0010$R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b*\u0010$R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b+\u0010$R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\"\u001a\u0004\b,\u0010$R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001f\u001a\u0004\b0\u0010!¨\u00063"}, d2 = {"Lcom/sofascore/model/newNetwork/AttributeOverviewData;", "Ljava/io/Serializable;", "", "id", "attacking", "technical", "tactical", "defending", "creativity", "saves", "anticipation", "ballDistribution", "aerial", "", "position", "yearShift", "<init>", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;I)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ILt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/AttributeOverviewData;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "I", "getId", "()I", "Ljava/lang/Integer;", "getAttacking", "()Ljava/lang/Integer;", "getTechnical", "getTactical", "getDefending", "getCreativity", "getSaves", "getAnticipation", "getBallDistribution", "getAerial", "Ljava/lang/String;", "getPosition", "()Ljava/lang/String;", "getYearShift", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AttributeOverviewData implements Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Integer aerial;

    @Nullable
    private final Integer anticipation;

    @Nullable
    private final Integer attacking;

    @Nullable
    private final Integer ballDistribution;

    @Nullable
    private final Integer creativity;

    @Nullable
    private final Integer defending;
    private final int id;

    @NotNull
    private final String position;

    @Nullable
    private final Integer saves;

    @Nullable
    private final Integer tactical;

    @Nullable
    private final Integer technical;
    private final int yearShift;

    public /* synthetic */ AttributeOverviewData(int i, int i2, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, String str, int i3, t5h t5hVar) {
        if (4095 != (i & 4095)) {
            oea.z(i, 4095, AttributeOverviewData$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = i2;
        this.attacking = num;
        this.technical = num2;
        this.tactical = num3;
        this.defending = num4;
        this.creativity = num5;
        this.saves = num6;
        this.anticipation = num7;
        this.ballDistribution = num8;
        this.aerial = num9;
        this.position = str;
        this.yearShift = i3;
    }

    public static final /* synthetic */ void write$Self$model_release(AttributeOverviewData self, wf3 output, SerialDescriptor serialDesc) {
        output.u(0, self.id, serialDesc);
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 1, a7aVar, self.attacking);
        output.h(serialDesc, 2, a7aVar, self.technical);
        output.h(serialDesc, 3, a7aVar, self.tactical);
        output.h(serialDesc, 4, a7aVar, self.defending);
        output.h(serialDesc, 5, a7aVar, self.creativity);
        output.h(serialDesc, 6, a7aVar, self.saves);
        output.h(serialDesc, 7, a7aVar, self.anticipation);
        output.h(serialDesc, 8, a7aVar, self.ballDistribution);
        output.h(serialDesc, 9, a7aVar, self.aerial);
        output.y(serialDesc, 10, self.position);
        output.u(11, self.yearShift, serialDesc);
    }

    @Nullable
    public final Integer getAerial() {
        return this.aerial;
    }

    @Nullable
    public final Integer getAnticipation() {
        return this.anticipation;
    }

    @Nullable
    public final Integer getAttacking() {
        return this.attacking;
    }

    @Nullable
    public final Integer getBallDistribution() {
        return this.ballDistribution;
    }

    @Nullable
    public final Integer getCreativity() {
        return this.creativity;
    }

    @Nullable
    public final Integer getDefending() {
        return this.defending;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final String getPosition() {
        return this.position;
    }

    @Nullable
    public final Integer getSaves() {
        return this.saves;
    }

    @Nullable
    public final Integer getTactical() {
        return this.tactical;
    }

    @Nullable
    public final Integer getTechnical() {
        return this.technical;
    }

    public final int getYearShift() {
        return this.yearShift;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/AttributeOverviewData$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/AttributeOverviewData;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return AttributeOverviewData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public AttributeOverviewData(int i, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6, @Nullable Integer num7, @Nullable Integer num8, @Nullable Integer num9, @NotNull String str, int i2) {
        str.getClass();
        this.id = i;
        this.attacking = num;
        this.technical = num2;
        this.tactical = num3;
        this.defending = num4;
        this.creativity = num5;
        this.saves = num6;
        this.anticipation = num7;
        this.ballDistribution = num8;
        this.aerial = num9;
        this.position = str;
        this.yearShift = i2;
    }
}
