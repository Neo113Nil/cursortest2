package com.sofascore.model.network.response;

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
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB=\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ8\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u0019J\u0010\u0010\"\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\"\u0010\u001bJ\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b+\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b-\u0010\u001e¨\u00060"}, d2 = {"Lcom/sofascore/model/network/response/Odds;", "", "", "fractionalValue", "", "expected", "actual", "", "id", "<init>", "(Ljava/lang/String;IIJ)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/String;IIJLt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/network/response/Odds;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "component4", "()J", "copy", "(Ljava/lang/String;IIJ)Lcom/sofascore/model/network/response/Odds;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getFractionalValue", "I", "getExpected", "getActual", "J", "getId", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Odds {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int actual;
    private final int expected;

    @NotNull
    private final String fractionalValue;
    private final long id;

    public /* synthetic */ Odds(int i, String str, int i2, int i3, long j, t5h t5hVar) {
        if (15 != (i & 15)) {
            oea.z(i, 15, Odds$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.fractionalValue = str;
        this.expected = i2;
        this.actual = i3;
        this.id = j;
    }

    public static /* synthetic */ Odds copy$default(Odds odds, String str, int i, int i2, long j, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = odds.fractionalValue;
        }
        if ((i3 & 2) != 0) {
            i = odds.expected;
        }
        if ((i3 & 4) != 0) {
            i2 = odds.actual;
        }
        if ((i3 & 8) != 0) {
            j = odds.id;
        }
        int i4 = i2;
        return odds.copy(str, i, i4, j);
    }

    public static final /* synthetic */ void write$Self$model_release(Odds self, wf3 output, SerialDescriptor serialDesc) {
        output.y(serialDesc, 0, self.fractionalValue);
        output.u(1, self.expected, serialDesc);
        output.u(2, self.actual, serialDesc);
        output.E(serialDesc, 3, self.id);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getFractionalValue() {
        return this.fractionalValue;
    }

    /* renamed from: component2, reason: from getter */
    public final int getExpected() {
        return this.expected;
    }

    /* renamed from: component3, reason: from getter */
    public final int getActual() {
        return this.actual;
    }

    /* renamed from: component4, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @NotNull
    public final Odds copy(@NotNull String fractionalValue, int expected, int actual, long id) {
        fractionalValue.getClass();
        return new Odds(fractionalValue, expected, actual, id);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Odds)) {
            return false;
        }
        Odds odds = (Odds) other;
        return Intrinsics.c(this.fractionalValue, odds.fractionalValue) && this.expected == odds.expected && this.actual == odds.actual && this.id == odds.id;
    }

    public final int getActual() {
        return this.actual;
    }

    public final int getExpected() {
        return this.expected;
    }

    @NotNull
    public final String getFractionalValue() {
        return this.fractionalValue;
    }

    public final long getId() {
        return this.id;
    }

    public int hashCode() {
        return Long.hashCode(this.id) + wv8.a(this.actual, wv8.a(this.expected, this.fractionalValue.hashCode() * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        String str = this.fractionalValue;
        int i = this.expected;
        int i2 = this.actual;
        long j = this.id;
        StringBuilder q = mz1.q(i, "Odds(fractionalValue=", str, ", expected=", ", actual=");
        q.append(i2);
        q.append(", id=");
        q.append(j);
        q.append(")");
        return q.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/network/response/Odds$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/network/response/Odds;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return Odds$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public Odds(@NotNull String str, int i, int i2, long j) {
        str.getClass();
        this.fractionalValue = str;
        this.expected = i;
        this.actual = i2;
        this.id = j;
    }
}
