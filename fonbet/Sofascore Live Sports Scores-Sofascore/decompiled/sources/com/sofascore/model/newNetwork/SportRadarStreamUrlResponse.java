package com.sofascore.model.newNetwork;

import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002('B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0019¨\u0006)"}, d2 = {"Lcom/sofascore/model/newNetwork/SportRadarStreamUrlResponse;", "", "", "status", "Lcom/sofascore/model/newNetwork/StreamData;", "data", "<init>", "(Ljava/lang/String;Lcom/sofascore/model/newNetwork/StreamData;)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/sofascore/model/newNetwork/StreamData;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/SportRadarStreamUrlResponse;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/sofascore/model/newNetwork/StreamData;", "copy", "(Ljava/lang/String;Lcom/sofascore/model/newNetwork/StreamData;)Lcom/sofascore/model/newNetwork/SportRadarStreamUrlResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getStatus", "Lcom/sofascore/model/newNetwork/StreamData;", "getData", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SportRadarStreamUrlResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final StreamData data;

    @NotNull
    private final String status;

    public /* synthetic */ SportRadarStreamUrlResponse(int i, String str, StreamData streamData, t5h t5hVar) {
        if (3 != (i & 3)) {
            oea.z(i, 3, SportRadarStreamUrlResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.status = str;
        this.data = streamData;
    }

    public static /* synthetic */ SportRadarStreamUrlResponse copy$default(SportRadarStreamUrlResponse sportRadarStreamUrlResponse, String str, StreamData streamData, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sportRadarStreamUrlResponse.status;
        }
        if ((i & 2) != 0) {
            streamData = sportRadarStreamUrlResponse.data;
        }
        return sportRadarStreamUrlResponse.copy(str, streamData);
    }

    public static final /* synthetic */ void write$Self$model_release(SportRadarStreamUrlResponse self, wf3 output, SerialDescriptor serialDesc) {
        output.y(serialDesc, 0, self.status);
        output.f(serialDesc, 1, StreamData$$serializer.INSTANCE, self.data);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final StreamData getData() {
        return this.data;
    }

    @NotNull
    public final SportRadarStreamUrlResponse copy(@NotNull String status, @NotNull StreamData data) {
        status.getClass();
        data.getClass();
        return new SportRadarStreamUrlResponse(status, data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SportRadarStreamUrlResponse)) {
            return false;
        }
        SportRadarStreamUrlResponse sportRadarStreamUrlResponse = (SportRadarStreamUrlResponse) other;
        return Intrinsics.c(this.status, sportRadarStreamUrlResponse.status) && Intrinsics.c(this.data, sportRadarStreamUrlResponse.data);
    }

    @NotNull
    public final StreamData getData() {
        return this.data;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return this.data.hashCode() + (this.status.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "SportRadarStreamUrlResponse(status=" + this.status + ", data=" + this.data + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/SportRadarStreamUrlResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/SportRadarStreamUrlResponse;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return SportRadarStreamUrlResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public SportRadarStreamUrlResponse(@NotNull String str, @NotNull StreamData streamData) {
        str.getClass();
        streamData.getClass();
        this.status = str;
        this.data = streamData;
    }
}
