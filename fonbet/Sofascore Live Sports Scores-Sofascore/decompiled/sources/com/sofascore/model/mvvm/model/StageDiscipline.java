package com.sofascore.model.mvvm.model;

import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.vxd;
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
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002.-B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B7\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ$\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0018J\u0010\u0010\u001e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001aJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u001aR$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u0006/"}, d2 = {"Lcom/sofascore/model/mvvm/model/StageDiscipline;", "Ljava/io/Serializable;", "", "description", "", "id", "<init>", "(Ljava/lang/String;I)V", "seen0", "Lcom/sofascore/model/mvvm/model/StageSeason;", "stageSeason", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/String;ILcom/sofascore/model/mvvm/model/StageSeason;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/mvvm/model/StageDiscipline;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()I", "copy", "(Ljava/lang/String;I)Lcom/sofascore/model/mvvm/model/StageDiscipline;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDescription", "I", "getId", "Lcom/sofascore/model/mvvm/model/StageSeason;", "getStageSeason", "()Lcom/sofascore/model/mvvm/model/StageSeason;", "setStageSeason", "(Lcom/sofascore/model/mvvm/model/StageSeason;)V", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class StageDiscipline implements Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String description;
    private final int id;

    @Nullable
    private StageSeason stageSeason;

    public /* synthetic */ StageDiscipline(int i, String str, int i2, StageSeason stageSeason, t5h t5hVar) {
        if (3 != (i & 3)) {
            oea.z(i, 3, StageDiscipline$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.description = str;
        this.id = i2;
        if ((i & 4) == 0) {
            this.stageSeason = null;
        } else {
            this.stageSeason = stageSeason;
        }
    }

    public static /* synthetic */ StageDiscipline copy$default(StageDiscipline stageDiscipline, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = stageDiscipline.description;
        }
        if ((i2 & 2) != 0) {
            i = stageDiscipline.id;
        }
        return stageDiscipline.copy(str, i);
    }

    public static final /* synthetic */ void write$Self$model_release(StageDiscipline self, wf3 output, SerialDescriptor serialDesc) {
        output.y(serialDesc, 0, self.description);
        output.u(1, self.id, serialDesc);
        if (!output.o(serialDesc) && self.stageSeason == null) {
            return;
        }
        output.h(serialDesc, 2, StageSeason$$serializer.INSTANCE, self.stageSeason);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component2, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    public final StageDiscipline copy(@NotNull String description, int id) {
        description.getClass();
        return new StageDiscipline(description, id);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StageDiscipline)) {
            return false;
        }
        StageDiscipline stageDiscipline = (StageDiscipline) other;
        return Intrinsics.c(this.description, stageDiscipline.description) && this.id == stageDiscipline.id;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    public final int getId() {
        return this.id;
    }

    @Nullable
    public final StageSeason getStageSeason() {
        return this.stageSeason;
    }

    public int hashCode() {
        return Integer.hashCode(this.id) + (this.description.hashCode() * 31);
    }

    public final void setStageSeason(@Nullable StageSeason stageSeason) {
        this.stageSeason = stageSeason;
    }

    @NotNull
    public String toString() {
        return vxd.k(this.id, "StageDiscipline(description=", this.description, ", id=", ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/mvvm/model/StageDiscipline$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/mvvm/model/StageDiscipline;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return StageDiscipline$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public StageDiscipline(@NotNull String str, int i) {
        str.getClass();
        this.description = str;
        this.id = i;
    }
}
