package com.sofascore.model;

import defpackage.dmi;
import defpackage.me4;
import defpackage.mz1;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
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
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,+B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tBA\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0018J8\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0018J\u0010\u0010 \u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b \u0010\u001bJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b*\u0010\u0018¨\u0006-"}, d2 = {"Lcom/sofascore/model/AnalystOfferRemoteConfig;", "", "", "startDate", "endDate", "", "offerLength", "offerId", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/AnalystOfferRemoteConfig;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()I", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Lcom/sofascore/model/AnalystOfferRemoteConfig;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getStartDate", "getEndDate", "I", "getOfferLength", "getOfferId", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AnalystOfferRemoteConfig {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String endDate;

    @NotNull
    private final String offerId;
    private final int offerLength;

    @NotNull
    private final String startDate;

    public /* synthetic */ AnalystOfferRemoteConfig(int i, String str, String str2, int i2, String str3, t5h t5hVar) {
        if (15 != (i & 15)) {
            oea.z(i, 15, AnalystOfferRemoteConfig$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.startDate = str;
        this.endDate = str2;
        this.offerLength = i2;
        this.offerId = str3;
    }

    public static /* synthetic */ AnalystOfferRemoteConfig copy$default(AnalystOfferRemoteConfig analystOfferRemoteConfig, String str, String str2, int i, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = analystOfferRemoteConfig.startDate;
        }
        if ((i2 & 2) != 0) {
            str2 = analystOfferRemoteConfig.endDate;
        }
        if ((i2 & 4) != 0) {
            i = analystOfferRemoteConfig.offerLength;
        }
        if ((i2 & 8) != 0) {
            str3 = analystOfferRemoteConfig.offerId;
        }
        return analystOfferRemoteConfig.copy(str, str2, i, str3);
    }

    public static final /* synthetic */ void write$Self$model_release(AnalystOfferRemoteConfig self, wf3 output, SerialDescriptor serialDesc) {
        output.y(serialDesc, 0, self.startDate);
        output.y(serialDesc, 1, self.endDate);
        output.u(2, self.offerLength, serialDesc);
        output.y(serialDesc, 3, self.offerId);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getStartDate() {
        return this.startDate;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getEndDate() {
        return this.endDate;
    }

    /* renamed from: component3, reason: from getter */
    public final int getOfferLength() {
        return this.offerLength;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getOfferId() {
        return this.offerId;
    }

    @NotNull
    public final AnalystOfferRemoteConfig copy(@NotNull String startDate, @NotNull String endDate, int offerLength, @NotNull String offerId) {
        startDate.getClass();
        endDate.getClass();
        offerId.getClass();
        return new AnalystOfferRemoteConfig(startDate, endDate, offerLength, offerId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnalystOfferRemoteConfig)) {
            return false;
        }
        AnalystOfferRemoteConfig analystOfferRemoteConfig = (AnalystOfferRemoteConfig) other;
        return Intrinsics.c(this.startDate, analystOfferRemoteConfig.startDate) && Intrinsics.c(this.endDate, analystOfferRemoteConfig.endDate) && this.offerLength == analystOfferRemoteConfig.offerLength && Intrinsics.c(this.offerId, analystOfferRemoteConfig.offerId);
    }

    @NotNull
    public final String getEndDate() {
        return this.endDate;
    }

    @NotNull
    public final String getOfferId() {
        return this.offerId;
    }

    public final int getOfferLength() {
        return this.offerLength;
    }

    @NotNull
    public final String getStartDate() {
        return this.startDate;
    }

    public int hashCode() {
        return this.offerId.hashCode() + wv8.a(this.offerLength, dmi.c(this.startDate.hashCode() * 31, 31, this.endDate), 31);
    }

    @NotNull
    public String toString() {
        String str = this.startDate;
        String str2 = this.endDate;
        int i = this.offerLength;
        String str3 = this.offerId;
        StringBuilder s = mz1.s("AnalystOfferRemoteConfig(startDate=", str, ", endDate=", str2, ", offerLength=");
        s.append(i);
        s.append(", offerId=");
        s.append(str3);
        s.append(")");
        return s.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/AnalystOfferRemoteConfig$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/AnalystOfferRemoteConfig;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return AnalystOfferRemoteConfig$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public AnalystOfferRemoteConfig(@NotNull String str, @NotNull String str2, int i, @NotNull String str3) {
        me4.p(str, str2, str3);
        this.startDate = str;
        this.endDate = str2;
        this.offerLength = i;
        this.offerId = str3;
    }
}
