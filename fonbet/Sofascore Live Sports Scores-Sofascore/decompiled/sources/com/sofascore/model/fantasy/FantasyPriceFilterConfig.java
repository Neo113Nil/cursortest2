package com.sofascore.model.fantasy;

import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import defpackage.fc6;
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
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*)B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B3\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J.\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b(\u0010\u0017¨\u0006+"}, d2 = {"Lcom/sofascore/model/fantasy/FantasyPriceFilterConfig;", "", "", "min", InneractiveMediationNameConsts.MAX, "step", "<init>", "(FFF)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(IFFFLt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/fantasy/FantasyPriceFilterConfig;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()F", "component2", "component3", "copy", "(FFF)Lcom/sofascore/model/fantasy/FantasyPriceFilterConfig;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getMin", "getMax", "getStep", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FantasyPriceFilterConfig {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final float max;
    private final float min;
    private final float step;

    public /* synthetic */ FantasyPriceFilterConfig(int i, float f, float f2, float f3, t5h t5hVar) {
        if (7 != (i & 7)) {
            oea.z(i, 7, FantasyPriceFilterConfig$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.min = f;
        this.max = f2;
        this.step = f3;
    }

    public static /* synthetic */ FantasyPriceFilterConfig copy$default(FantasyPriceFilterConfig fantasyPriceFilterConfig, float f, float f2, float f3, int i, Object obj) {
        if ((i & 1) != 0) {
            f = fantasyPriceFilterConfig.min;
        }
        if ((i & 2) != 0) {
            f2 = fantasyPriceFilterConfig.max;
        }
        if ((i & 4) != 0) {
            f3 = fantasyPriceFilterConfig.step;
        }
        return fantasyPriceFilterConfig.copy(f, f2, f3);
    }

    public static final /* synthetic */ void write$Self$model_release(FantasyPriceFilterConfig self, wf3 output, SerialDescriptor serialDesc) {
        output.t(serialDesc, 0, self.min);
        output.t(serialDesc, 1, self.max);
        output.t(serialDesc, 2, self.step);
    }

    /* renamed from: component1, reason: from getter */
    public final float getMin() {
        return this.min;
    }

    /* renamed from: component2, reason: from getter */
    public final float getMax() {
        return this.max;
    }

    /* renamed from: component3, reason: from getter */
    public final float getStep() {
        return this.step;
    }

    @NotNull
    public final FantasyPriceFilterConfig copy(float min, float max, float step) {
        return new FantasyPriceFilterConfig(min, max, step);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FantasyPriceFilterConfig)) {
            return false;
        }
        FantasyPriceFilterConfig fantasyPriceFilterConfig = (FantasyPriceFilterConfig) other;
        return Float.compare(this.min, fantasyPriceFilterConfig.min) == 0 && Float.compare(this.max, fantasyPriceFilterConfig.max) == 0 && Float.compare(this.step, fantasyPriceFilterConfig.step) == 0;
    }

    public final float getMax() {
        return this.max;
    }

    public final float getMin() {
        return this.min;
    }

    public final float getStep() {
        return this.step;
    }

    public int hashCode() {
        return Float.hashCode(this.step) + fc6.a(this.max, Float.hashCode(this.min) * 31, 31);
    }

    @NotNull
    public String toString() {
        return "FantasyPriceFilterConfig(min=" + this.min + ", max=" + this.max + ", step=" + this.step + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/fantasy/FantasyPriceFilterConfig$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/fantasy/FantasyPriceFilterConfig;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return FantasyPriceFilterConfig$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public FantasyPriceFilterConfig(float f, float f2, float f3) {
        this.min = f;
        this.max = f2;
        this.step = f3;
    }
}
