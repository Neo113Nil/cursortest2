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
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000232BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nBW\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJX\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001aR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b-\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b.\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b/\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b0\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b1\u0010\u001a¨\u00064"}, d2 = {"Lcom/sofascore/model/newNetwork/MmaStatisticClass;", "", "Lcom/sofascore/model/newNetwork/MmaStatisticValues;", "attempted", "landed", "defended", "succeeded", "general", "control", "<init>", "(Lcom/sofascore/model/newNetwork/MmaStatisticValues;Lcom/sofascore/model/newNetwork/MmaStatisticValues;Lcom/sofascore/model/newNetwork/MmaStatisticValues;Lcom/sofascore/model/newNetwork/MmaStatisticValues;Lcom/sofascore/model/newNetwork/MmaStatisticValues;Lcom/sofascore/model/newNetwork/MmaStatisticValues;)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/newNetwork/MmaStatisticValues;Lcom/sofascore/model/newNetwork/MmaStatisticValues;Lcom/sofascore/model/newNetwork/MmaStatisticValues;Lcom/sofascore/model/newNetwork/MmaStatisticValues;Lcom/sofascore/model/newNetwork/MmaStatisticValues;Lcom/sofascore/model/newNetwork/MmaStatisticValues;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/MmaStatisticClass;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/sofascore/model/newNetwork/MmaStatisticValues;", "component2", "component3", "component4", "component5", "component6", "copy", "(Lcom/sofascore/model/newNetwork/MmaStatisticValues;Lcom/sofascore/model/newNetwork/MmaStatisticValues;Lcom/sofascore/model/newNetwork/MmaStatisticValues;Lcom/sofascore/model/newNetwork/MmaStatisticValues;Lcom/sofascore/model/newNetwork/MmaStatisticValues;Lcom/sofascore/model/newNetwork/MmaStatisticValues;)Lcom/sofascore/model/newNetwork/MmaStatisticClass;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/sofascore/model/newNetwork/MmaStatisticValues;", "getAttempted", "getLanded", "getDefended", "getSucceeded", "getGeneral", "getControl", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class MmaStatisticClass {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final MmaStatisticValues attempted;

    @Nullable
    private final MmaStatisticValues control;

    @Nullable
    private final MmaStatisticValues defended;

    @Nullable
    private final MmaStatisticValues general;

    @Nullable
    private final MmaStatisticValues landed;

    @Nullable
    private final MmaStatisticValues succeeded;

    public /* synthetic */ MmaStatisticClass(int i, MmaStatisticValues mmaStatisticValues, MmaStatisticValues mmaStatisticValues2, MmaStatisticValues mmaStatisticValues3, MmaStatisticValues mmaStatisticValues4, MmaStatisticValues mmaStatisticValues5, MmaStatisticValues mmaStatisticValues6, t5h t5hVar) {
        if (63 != (i & 63)) {
            oea.z(i, 63, MmaStatisticClass$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.attempted = mmaStatisticValues;
        this.landed = mmaStatisticValues2;
        this.defended = mmaStatisticValues3;
        this.succeeded = mmaStatisticValues4;
        this.general = mmaStatisticValues5;
        this.control = mmaStatisticValues6;
    }

    public static /* synthetic */ MmaStatisticClass copy$default(MmaStatisticClass mmaStatisticClass, MmaStatisticValues mmaStatisticValues, MmaStatisticValues mmaStatisticValues2, MmaStatisticValues mmaStatisticValues3, MmaStatisticValues mmaStatisticValues4, MmaStatisticValues mmaStatisticValues5, MmaStatisticValues mmaStatisticValues6, int i, Object obj) {
        if ((i & 1) != 0) {
            mmaStatisticValues = mmaStatisticClass.attempted;
        }
        if ((i & 2) != 0) {
            mmaStatisticValues2 = mmaStatisticClass.landed;
        }
        if ((i & 4) != 0) {
            mmaStatisticValues3 = mmaStatisticClass.defended;
        }
        if ((i & 8) != 0) {
            mmaStatisticValues4 = mmaStatisticClass.succeeded;
        }
        if ((i & 16) != 0) {
            mmaStatisticValues5 = mmaStatisticClass.general;
        }
        if ((i & 32) != 0) {
            mmaStatisticValues6 = mmaStatisticClass.control;
        }
        MmaStatisticValues mmaStatisticValues7 = mmaStatisticValues5;
        MmaStatisticValues mmaStatisticValues8 = mmaStatisticValues6;
        return mmaStatisticClass.copy(mmaStatisticValues, mmaStatisticValues2, mmaStatisticValues3, mmaStatisticValues4, mmaStatisticValues7, mmaStatisticValues8);
    }

    public static final /* synthetic */ void write$Self$model_release(MmaStatisticClass self, wf3 output, SerialDescriptor serialDesc) {
        MmaStatisticValues$$serializer mmaStatisticValues$$serializer = MmaStatisticValues$$serializer.INSTANCE;
        output.h(serialDesc, 0, mmaStatisticValues$$serializer, self.attempted);
        output.h(serialDesc, 1, mmaStatisticValues$$serializer, self.landed);
        output.h(serialDesc, 2, mmaStatisticValues$$serializer, self.defended);
        output.h(serialDesc, 3, mmaStatisticValues$$serializer, self.succeeded);
        output.h(serialDesc, 4, mmaStatisticValues$$serializer, self.general);
        output.h(serialDesc, 5, mmaStatisticValues$$serializer, self.control);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final MmaStatisticValues getAttempted() {
        return this.attempted;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final MmaStatisticValues getLanded() {
        return this.landed;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final MmaStatisticValues getDefended() {
        return this.defended;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final MmaStatisticValues getSucceeded() {
        return this.succeeded;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final MmaStatisticValues getGeneral() {
        return this.general;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final MmaStatisticValues getControl() {
        return this.control;
    }

    @NotNull
    public final MmaStatisticClass copy(@Nullable MmaStatisticValues attempted, @Nullable MmaStatisticValues landed, @Nullable MmaStatisticValues defended, @Nullable MmaStatisticValues succeeded, @Nullable MmaStatisticValues general, @Nullable MmaStatisticValues control) {
        return new MmaStatisticClass(attempted, landed, defended, succeeded, general, control);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MmaStatisticClass)) {
            return false;
        }
        MmaStatisticClass mmaStatisticClass = (MmaStatisticClass) other;
        return Intrinsics.c(this.attempted, mmaStatisticClass.attempted) && Intrinsics.c(this.landed, mmaStatisticClass.landed) && Intrinsics.c(this.defended, mmaStatisticClass.defended) && Intrinsics.c(this.succeeded, mmaStatisticClass.succeeded) && Intrinsics.c(this.general, mmaStatisticClass.general) && Intrinsics.c(this.control, mmaStatisticClass.control);
    }

    @Nullable
    public final MmaStatisticValues getAttempted() {
        return this.attempted;
    }

    @Nullable
    public final MmaStatisticValues getControl() {
        return this.control;
    }

    @Nullable
    public final MmaStatisticValues getDefended() {
        return this.defended;
    }

    @Nullable
    public final MmaStatisticValues getGeneral() {
        return this.general;
    }

    @Nullable
    public final MmaStatisticValues getLanded() {
        return this.landed;
    }

    @Nullable
    public final MmaStatisticValues getSucceeded() {
        return this.succeeded;
    }

    public int hashCode() {
        MmaStatisticValues mmaStatisticValues = this.attempted;
        int hashCode = (mmaStatisticValues == null ? 0 : mmaStatisticValues.hashCode()) * 31;
        MmaStatisticValues mmaStatisticValues2 = this.landed;
        int hashCode2 = (hashCode + (mmaStatisticValues2 == null ? 0 : mmaStatisticValues2.hashCode())) * 31;
        MmaStatisticValues mmaStatisticValues3 = this.defended;
        int hashCode3 = (hashCode2 + (mmaStatisticValues3 == null ? 0 : mmaStatisticValues3.hashCode())) * 31;
        MmaStatisticValues mmaStatisticValues4 = this.succeeded;
        int hashCode4 = (hashCode3 + (mmaStatisticValues4 == null ? 0 : mmaStatisticValues4.hashCode())) * 31;
        MmaStatisticValues mmaStatisticValues5 = this.general;
        int hashCode5 = (hashCode4 + (mmaStatisticValues5 == null ? 0 : mmaStatisticValues5.hashCode())) * 31;
        MmaStatisticValues mmaStatisticValues6 = this.control;
        return hashCode5 + (mmaStatisticValues6 != null ? mmaStatisticValues6.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MmaStatisticClass(attempted=" + this.attempted + ", landed=" + this.landed + ", defended=" + this.defended + ", succeeded=" + this.succeeded + ", general=" + this.general + ", control=" + this.control + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/MmaStatisticClass$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/MmaStatisticClass;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return MmaStatisticClass$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public MmaStatisticClass(@Nullable MmaStatisticValues mmaStatisticValues, @Nullable MmaStatisticValues mmaStatisticValues2, @Nullable MmaStatisticValues mmaStatisticValues3, @Nullable MmaStatisticValues mmaStatisticValues4, @Nullable MmaStatisticValues mmaStatisticValues5, @Nullable MmaStatisticValues mmaStatisticValues6) {
        this.attempted = mmaStatisticValues;
        this.landed = mmaStatisticValues2;
        this.defended = mmaStatisticValues3;
        this.succeeded = mmaStatisticValues4;
        this.general = mmaStatisticValues5;
        this.control = mmaStatisticValues6;
    }
}
