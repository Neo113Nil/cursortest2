package com.sofascore.model.newNetwork;

import com.sofascore.model.mvvm.model.PlayerKt;
import defpackage.a7a;
import defpackage.hz8;
import defpackage.joa;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uzj;
import defpackage.wf3;
import defpackage.ypa;
import defpackage.ysa;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)(B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J&\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0018¨\u0006*"}, d2 = {"Lcom/sofascore/model/newNetwork/TyrePeriod;", "", "Lcom/sofascore/model/newNetwork/TyreType;", "type", "", "laps", "<init>", "(Lcom/sofascore/model/newNetwork/TyreType;Ljava/lang/Integer;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/newNetwork/TyreType;Ljava/lang/Integer;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/TyrePeriod;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/sofascore/model/newNetwork/TyreType;", "component2", "()Ljava/lang/Integer;", "copy", "(Lcom/sofascore/model/newNetwork/TyreType;Ljava/lang/Integer;)Lcom/sofascore/model/newNetwork/TyrePeriod;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/sofascore/model/newNetwork/TyreType;", "getType", "Ljava/lang/Integer;", "getLaps", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class TyrePeriod {

    @Nullable
    private final Integer laps;

    @NotNull
    private final TyreType type;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {ypa.a(ysa.b, new uzj(17)), null};

    public /* synthetic */ TyrePeriod(int i, TyreType tyreType, Integer num, t5h t5hVar) {
        if (2 != (i & 2)) {
            oea.z(i, 2, TyrePeriod$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.type = TyreType.SOFT;
        } else {
            this.type = tyreType;
        }
        this.laps = num;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return hz8.F("com.sofascore.model.newNetwork.TyreType", TyreType.values(), new String[]{"H", PlayerKt.FOOTBALL_MIDFIELDER, PlayerKt.VOLLEYBALL_SETTER, "I", "W"}, new Annotation[][]{null, null, null, null, null});
    }

    public static /* synthetic */ TyrePeriod copy$default(TyrePeriod tyrePeriod, TyreType tyreType, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            tyreType = tyrePeriod.type;
        }
        if ((i & 2) != 0) {
            num = tyrePeriod.laps;
        }
        return tyrePeriod.copy(tyreType, num);
    }

    public static final /* synthetic */ void write$Self$model_release(TyrePeriod self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        if (output.o(serialDesc) || self.type != TyreType.SOFT) {
            output.f(serialDesc, 0, (KSerializer) joaVarArr[0].getValue(), self.type);
        }
        output.h(serialDesc, 1, a7a.a, self.laps);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TyreType getType() {
        return this.type;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Integer getLaps() {
        return this.laps;
    }

    @NotNull
    public final TyrePeriod copy(@NotNull TyreType type, @Nullable Integer laps) {
        type.getClass();
        return new TyrePeriod(type, laps);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TyrePeriod)) {
            return false;
        }
        TyrePeriod tyrePeriod = (TyrePeriod) other;
        return this.type == tyrePeriod.type && Intrinsics.c(this.laps, tyrePeriod.laps);
    }

    @Nullable
    public final Integer getLaps() {
        return this.laps;
    }

    @NotNull
    public final TyreType getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        Integer num = this.laps;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    @NotNull
    public String toString() {
        return "TyrePeriod(type=" + this.type + ", laps=" + this.laps + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/TyrePeriod$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/TyrePeriod;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return TyrePeriod$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public TyrePeriod(@NotNull TyreType tyreType, @Nullable Integer num) {
        tyreType.getClass();
        this.type = tyreType;
        this.laps = num;
    }

    public /* synthetic */ TyrePeriod(TyreType tyreType, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? TyreType.SOFT : tyreType, num);
    }
}
