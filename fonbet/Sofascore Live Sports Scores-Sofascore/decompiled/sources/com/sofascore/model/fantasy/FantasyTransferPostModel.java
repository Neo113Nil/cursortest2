package com.sofascore.model.fantasy;

import defpackage.lnb;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%$B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0005\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J$\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0015J\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\u0015¨\u0006&"}, d2 = {"Lcom/sofascore/model/fantasy/FantasyTransferPostModel;", "", "", "fantasyPlayerInId", "fantasyPlayerOutId", "<init>", "(II)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IIILt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/fantasy/FantasyTransferPostModel;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "copy", "(II)Lcom/sofascore/model/fantasy/FantasyTransferPostModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getFantasyPlayerInId", "getFantasyPlayerOutId", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FantasyTransferPostModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int fantasyPlayerInId;
    private final int fantasyPlayerOutId;

    public /* synthetic */ FantasyTransferPostModel(int i, int i2, int i3, t5h t5hVar) {
        if (3 != (i & 3)) {
            oea.z(i, 3, FantasyTransferPostModel$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.fantasyPlayerInId = i2;
        this.fantasyPlayerOutId = i3;
    }

    public static /* synthetic */ FantasyTransferPostModel copy$default(FantasyTransferPostModel fantasyTransferPostModel, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = fantasyTransferPostModel.fantasyPlayerInId;
        }
        if ((i3 & 2) != 0) {
            i2 = fantasyTransferPostModel.fantasyPlayerOutId;
        }
        return fantasyTransferPostModel.copy(i, i2);
    }

    public static final /* synthetic */ void write$Self$model_release(FantasyTransferPostModel self, wf3 output, SerialDescriptor serialDesc) {
        output.u(0, self.fantasyPlayerInId, serialDesc);
        output.u(1, self.fantasyPlayerOutId, serialDesc);
    }

    /* renamed from: component1, reason: from getter */
    public final int getFantasyPlayerInId() {
        return this.fantasyPlayerInId;
    }

    /* renamed from: component2, reason: from getter */
    public final int getFantasyPlayerOutId() {
        return this.fantasyPlayerOutId;
    }

    @NotNull
    public final FantasyTransferPostModel copy(int fantasyPlayerInId, int fantasyPlayerOutId) {
        return new FantasyTransferPostModel(fantasyPlayerInId, fantasyPlayerOutId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FantasyTransferPostModel)) {
            return false;
        }
        FantasyTransferPostModel fantasyTransferPostModel = (FantasyTransferPostModel) other;
        return this.fantasyPlayerInId == fantasyTransferPostModel.fantasyPlayerInId && this.fantasyPlayerOutId == fantasyTransferPostModel.fantasyPlayerOutId;
    }

    public final int getFantasyPlayerInId() {
        return this.fantasyPlayerInId;
    }

    public final int getFantasyPlayerOutId() {
        return this.fantasyPlayerOutId;
    }

    public int hashCode() {
        return Integer.hashCode(this.fantasyPlayerOutId) + (Integer.hashCode(this.fantasyPlayerInId) * 31);
    }

    @NotNull
    public String toString() {
        return lnb.j(this.fantasyPlayerInId, this.fantasyPlayerOutId, "FantasyTransferPostModel(fantasyPlayerInId=", ", fantasyPlayerOutId=", ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/fantasy/FantasyTransferPostModel$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/fantasy/FantasyTransferPostModel;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return FantasyTransferPostModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public FantasyTransferPostModel(int i, int i2) {
        this.fantasyPlayerInId = i;
        this.fantasyPlayerOutId = i2;
    }
}
