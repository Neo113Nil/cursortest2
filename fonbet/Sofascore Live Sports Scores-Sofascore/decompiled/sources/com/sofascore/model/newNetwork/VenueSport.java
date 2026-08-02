package com.sofascore.model.newNetwork;

import com.sofascore.model.mvvm.model.Sport;
import com.sofascore.model.mvvm.model.Sport$$serializer;
import com.sofascore.model.network.response.SearchResponseKt;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)(B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J$\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0018¨\u0006*"}, d2 = {"Lcom/sofascore/model/newNetwork/VenueSport;", "Ljava/io/Serializable;", "Lcom/sofascore/model/mvvm/model/Sport;", SearchResponseKt.SPORT_ENTITY, "", "matchCount", "<init>", "(Lcom/sofascore/model/mvvm/model/Sport;I)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/mvvm/model/Sport;ILt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/VenueSport;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/sofascore/model/mvvm/model/Sport;", "component2", "()I", "copy", "(Lcom/sofascore/model/mvvm/model/Sport;I)Lcom/sofascore/model/newNetwork/VenueSport;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/sofascore/model/mvvm/model/Sport;", "getSport", "I", "getMatchCount", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class VenueSport implements Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int matchCount;

    @NotNull
    private final Sport sport;

    public /* synthetic */ VenueSport(int i, Sport sport, int i2, t5h t5hVar) {
        if (3 != (i & 3)) {
            oea.z(i, 3, VenueSport$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.sport = sport;
        this.matchCount = i2;
    }

    public static /* synthetic */ VenueSport copy$default(VenueSport venueSport, Sport sport, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            sport = venueSport.sport;
        }
        if ((i2 & 2) != 0) {
            i = venueSport.matchCount;
        }
        return venueSport.copy(sport, i);
    }

    public static final /* synthetic */ void write$Self$model_release(VenueSport self, wf3 output, SerialDescriptor serialDesc) {
        output.f(serialDesc, 0, Sport$$serializer.INSTANCE, self.sport);
        output.u(1, self.matchCount, serialDesc);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Sport getSport() {
        return this.sport;
    }

    /* renamed from: component2, reason: from getter */
    public final int getMatchCount() {
        return this.matchCount;
    }

    @NotNull
    public final VenueSport copy(@NotNull Sport sport, int matchCount) {
        sport.getClass();
        return new VenueSport(sport, matchCount);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VenueSport)) {
            return false;
        }
        VenueSport venueSport = (VenueSport) other;
        return Intrinsics.c(this.sport, venueSport.sport) && this.matchCount == venueSport.matchCount;
    }

    public final int getMatchCount() {
        return this.matchCount;
    }

    @NotNull
    public final Sport getSport() {
        return this.sport;
    }

    public int hashCode() {
        return Integer.hashCode(this.matchCount) + (this.sport.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "VenueSport(sport=" + this.sport + ", matchCount=" + this.matchCount + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/VenueSport$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/VenueSport;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return VenueSport$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public VenueSport(@NotNull Sport sport, int i) {
        sport.getClass();
        this.sport = sport;
        this.matchCount = i;
    }
}
