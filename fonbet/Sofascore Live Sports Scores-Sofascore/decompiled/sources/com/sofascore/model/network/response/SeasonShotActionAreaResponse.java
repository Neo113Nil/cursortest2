package com.sofascore.model.network.response;

import com.appsflyer.internal.i;
import com.sofascore.model.newNetwork.ShotActionArea;
import com.sofascore.model.newNetwork.ShotActionArea$$serializer;
import defpackage.dtg;
import defpackage.joa;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
import defpackage.xg0;
import defpackage.ypa;
import defpackage.ysa;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)(B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B?\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0005\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\u001a\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b'\u0010\u0019¨\u0006*"}, d2 = {"Lcom/sofascore/model/network/response/SeasonShotActionAreaResponse;", "Lcom/sofascore/model/network/response/AbstractNetworkResponse;", "", "Lcom/sofascore/model/newNetwork/ShotActionArea;", "shotActionAreas", "<init>", "(Ljava/util/List;)V", "", "seen0", "Lcom/sofascore/model/network/response/HeadResponse;", "head", "error", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/network/response/HeadResponse;Lcom/sofascore/model/network/response/HeadResponse;Ljava/util/List;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/network/response/SeasonShotActionAreaResponse;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/sofascore/model/network/response/SeasonShotActionAreaResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getShotActionAreas", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SeasonShotActionAreaResponse extends AbstractNetworkResponse {

    @NotNull
    private final List<ShotActionArea> shotActionAreas;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {null, null, ypa.a(ysa.b, new dtg(24))};

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SeasonShotActionAreaResponse(int i, HeadResponse headResponse, HeadResponse headResponse2, List list, t5h t5hVar) {
        super(i, headResponse, headResponse2, t5hVar);
        if (4 != (i & 4)) {
            oea.z(i, 4, SeasonShotActionAreaResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.shotActionAreas = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(ShotActionArea$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SeasonShotActionAreaResponse copy$default(SeasonShotActionAreaResponse seasonShotActionAreaResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = seasonShotActionAreaResponse.shotActionAreas;
        }
        return seasonShotActionAreaResponse.copy(list);
    }

    public static final /* synthetic */ void write$Self$model_release(SeasonShotActionAreaResponse self, wf3 output, SerialDescriptor serialDesc) {
        AbstractNetworkResponse.write$Self(self, output, serialDesc);
        output.f(serialDesc, 2, (KSerializer) $childSerializers[2].getValue(), self.shotActionAreas);
    }

    @NotNull
    public final List<ShotActionArea> component1() {
        return this.shotActionAreas;
    }

    @NotNull
    public final SeasonShotActionAreaResponse copy(@NotNull List<ShotActionArea> shotActionAreas) {
        shotActionAreas.getClass();
        return new SeasonShotActionAreaResponse(shotActionAreas);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SeasonShotActionAreaResponse) && Intrinsics.c(this.shotActionAreas, ((SeasonShotActionAreaResponse) other).shotActionAreas);
    }

    @NotNull
    public final List<ShotActionArea> getShotActionAreas() {
        return this.shotActionAreas;
    }

    public int hashCode() {
        return this.shotActionAreas.hashCode();
    }

    @NotNull
    public String toString() {
        return i.i("SeasonShotActionAreaResponse(shotActionAreas=", ")", this.shotActionAreas);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/network/response/SeasonShotActionAreaResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/network/response/SeasonShotActionAreaResponse;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return SeasonShotActionAreaResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SeasonShotActionAreaResponse(@NotNull List<ShotActionArea> list) {
        super((HeadResponse) null, (HeadResponse) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        list.getClass();
        this.shotActionAreas = list;
    }
}
