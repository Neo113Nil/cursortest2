package com.sofascore.model.newNetwork;

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
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002('B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00042\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0019¨\u0006)"}, d2 = {"Lcom/sofascore/model/newNetwork/TvChannelVoteBody;", "Ljava/io/Serializable;", "", "country", "", "approve", "<init>", "(Ljava/lang/String;Z)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/String;ZLt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/TvChannelVoteBody;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Z", "copy", "(Ljava/lang/String;Z)Lcom/sofascore/model/newNetwork/TvChannelVoteBody;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCountry", "Z", "getApprove", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class TvChannelVoteBody implements Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final boolean approve;

    @NotNull
    private final String country;

    public /* synthetic */ TvChannelVoteBody(int i, String str, boolean z, t5h t5hVar) {
        if (3 != (i & 3)) {
            oea.z(i, 3, TvChannelVoteBody$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.country = str;
        this.approve = z;
    }

    public static /* synthetic */ TvChannelVoteBody copy$default(TvChannelVoteBody tvChannelVoteBody, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tvChannelVoteBody.country;
        }
        if ((i & 2) != 0) {
            z = tvChannelVoteBody.approve;
        }
        return tvChannelVoteBody.copy(str, z);
    }

    public static final /* synthetic */ void write$Self$model_release(TvChannelVoteBody self, wf3 output, SerialDescriptor serialDesc) {
        output.y(serialDesc, 0, self.country);
        output.x(serialDesc, 1, self.approve);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getApprove() {
        return this.approve;
    }

    @NotNull
    public final TvChannelVoteBody copy(@NotNull String country, boolean approve) {
        country.getClass();
        return new TvChannelVoteBody(country, approve);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TvChannelVoteBody)) {
            return false;
        }
        TvChannelVoteBody tvChannelVoteBody = (TvChannelVoteBody) other;
        return Intrinsics.c(this.country, tvChannelVoteBody.country) && this.approve == tvChannelVoteBody.approve;
    }

    public final boolean getApprove() {
        return this.approve;
    }

    @NotNull
    public final String getCountry() {
        return this.country;
    }

    public int hashCode() {
        return Boolean.hashCode(this.approve) + (this.country.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "TvChannelVoteBody(country=" + this.country + ", approve=" + this.approve + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/TvChannelVoteBody$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/TvChannelVoteBody;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return TvChannelVoteBody$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public TvChannelVoteBody(@NotNull String str, boolean z) {
        str.getClass();
        this.country = str;
        this.approve = z;
    }
}
