package com.sofascore.model.buzzer;

import com.ironsource.U3;
import defpackage.dmi;
import defpackage.mz1;
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
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB7\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ.\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u001b¨\u0006,"}, d2 = {"Lcom/sofascore/model/buzzer/InterestingStatisticsItem;", "", "", U3.i.W, "name", "", U3.i.X, "<init>", "(Ljava/lang/String;Ljava/lang/String;D)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;DLt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/buzzer/InterestingStatisticsItem;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()D", "copy", "(Ljava/lang/String;Ljava/lang/String;D)Lcom/sofascore/model/buzzer/InterestingStatisticsItem;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getKey", "getName", "D", "getValue", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class InterestingStatisticsItem {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String key;

    @NotNull
    private final String name;
    private final double value;

    public /* synthetic */ InterestingStatisticsItem(int i, String str, String str2, double d, t5h t5hVar) {
        if (7 != (i & 7)) {
            oea.z(i, 7, InterestingStatisticsItem$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.key = str;
        this.name = str2;
        this.value = d;
    }

    public static /* synthetic */ InterestingStatisticsItem copy$default(InterestingStatisticsItem interestingStatisticsItem, String str, String str2, double d, int i, Object obj) {
        if ((i & 1) != 0) {
            str = interestingStatisticsItem.key;
        }
        if ((i & 2) != 0) {
            str2 = interestingStatisticsItem.name;
        }
        if ((i & 4) != 0) {
            d = interestingStatisticsItem.value;
        }
        return interestingStatisticsItem.copy(str, str2, d);
    }

    public static final /* synthetic */ void write$Self$model_release(InterestingStatisticsItem self, wf3 output, SerialDescriptor serialDesc) {
        output.y(serialDesc, 0, self.key);
        output.y(serialDesc, 1, self.name);
        output.D(serialDesc, 2, self.value);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final double getValue() {
        return this.value;
    }

    @NotNull
    public final InterestingStatisticsItem copy(@NotNull String key, @NotNull String name, double value) {
        key.getClass();
        name.getClass();
        return new InterestingStatisticsItem(key, name, value);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InterestingStatisticsItem)) {
            return false;
        }
        InterestingStatisticsItem interestingStatisticsItem = (InterestingStatisticsItem) other;
        return Intrinsics.c(this.key, interestingStatisticsItem.key) && Intrinsics.c(this.name, interestingStatisticsItem.name) && Double.compare(this.value, interestingStatisticsItem.value) == 0;
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final double getValue() {
        return this.value;
    }

    public int hashCode() {
        return Double.hashCode(this.value) + dmi.c(this.key.hashCode() * 31, 31, this.name);
    }

    @NotNull
    public String toString() {
        String str = this.key;
        String str2 = this.name;
        double d = this.value;
        StringBuilder s = mz1.s("InterestingStatisticsItem(key=", str, ", name=", str2, ", value=");
        s.append(d);
        s.append(")");
        return s.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/buzzer/InterestingStatisticsItem$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/buzzer/InterestingStatisticsItem;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return InterestingStatisticsItem$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public InterestingStatisticsItem(@NotNull String str, @NotNull String str2, double d) {
        str.getClass();
        str2.getClass();
        this.key = str;
        this.name = str2;
        this.value = d;
    }
}
