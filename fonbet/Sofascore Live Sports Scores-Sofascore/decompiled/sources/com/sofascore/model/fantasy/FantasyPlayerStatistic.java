package com.sofascore.model.fantasy;

import com.ironsource.U3;
import defpackage.a7a;
import defpackage.dmi;
import defpackage.mz1;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.vxd;
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
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*)B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ0\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J\u0010\u0010\u001e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u001a¨\u0006+"}, d2 = {"Lcom/sofascore/model/fantasy/FantasyPlayerStatistic;", "", "", U3.i.W, U3.i.X, "", "points", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/fantasy/FantasyPlayerStatistic;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Integer;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/sofascore/model/fantasy/FantasyPlayerStatistic;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getKey", "getValue", "Ljava/lang/Integer;", "getPoints", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FantasyPlayerStatistic {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String key;

    @Nullable
    private final Integer points;

    @NotNull
    private final String value;

    public /* synthetic */ FantasyPlayerStatistic(int i, String str, String str2, Integer num, t5h t5hVar) {
        if (7 != (i & 7)) {
            oea.z(i, 7, FantasyPlayerStatistic$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.key = str;
        this.value = str2;
        this.points = num;
    }

    public static /* synthetic */ FantasyPlayerStatistic copy$default(FantasyPlayerStatistic fantasyPlayerStatistic, String str, String str2, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fantasyPlayerStatistic.key;
        }
        if ((i & 2) != 0) {
            str2 = fantasyPlayerStatistic.value;
        }
        if ((i & 4) != 0) {
            num = fantasyPlayerStatistic.points;
        }
        return fantasyPlayerStatistic.copy(str, str2, num);
    }

    public static final /* synthetic */ void write$Self$model_release(FantasyPlayerStatistic self, wf3 output, SerialDescriptor serialDesc) {
        output.y(serialDesc, 0, self.key);
        output.y(serialDesc, 1, self.value);
        output.h(serialDesc, 2, a7a.a, self.points);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Integer getPoints() {
        return this.points;
    }

    @NotNull
    public final FantasyPlayerStatistic copy(@NotNull String key, @NotNull String value, @Nullable Integer points) {
        key.getClass();
        value.getClass();
        return new FantasyPlayerStatistic(key, value, points);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FantasyPlayerStatistic)) {
            return false;
        }
        FantasyPlayerStatistic fantasyPlayerStatistic = (FantasyPlayerStatistic) other;
        return Intrinsics.c(this.key, fantasyPlayerStatistic.key) && Intrinsics.c(this.value, fantasyPlayerStatistic.value) && Intrinsics.c(this.points, fantasyPlayerStatistic.points);
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    @Nullable
    public final Integer getPoints() {
        return this.points;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int c = dmi.c(this.key.hashCode() * 31, 31, this.value);
        Integer num = this.points;
        return c + (num == null ? 0 : num.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.key;
        String str2 = this.value;
        return vxd.n(mz1.s("FantasyPlayerStatistic(key=", str, ", value=", str2, ", points="), this.points, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/fantasy/FantasyPlayerStatistic$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/fantasy/FantasyPlayerStatistic;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return FantasyPlayerStatistic$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public FantasyPlayerStatistic(@NotNull String str, @NotNull String str2, @Nullable Integer num) {
        str.getClass();
        str2.getClass();
        this.key = str;
        this.value = str2;
        this.points = num;
    }
}
