package com.sofascore.model.newNetwork;

import com.vungle.ads.internal.protos.Sdk;
import defpackage.dmi;
import defpackage.fn0;
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
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000276B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fBS\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000b\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u0010\u0010!\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\u001dJ\u0010\u0010\"\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010\u001dJV\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u001bJ\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b1\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b2\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b3\u0010\u001dR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b4\u0010\u001dR\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b5\u0010\u001d¨\u00068"}, d2 = {"Lcom/sofascore/model/newNetwork/ShotActionArea;", "", "", "area", "", "p1", "p2", "p3", "p4", "p5", "average", "<init>", "(IDDDDDD)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IIDDDDDDLt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/ShotActionArea;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "()D", "component3", "component4", "component5", "component6", "component7", "copy", "(IDDDDDD)Lcom/sofascore/model/newNetwork/ShotActionArea;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getArea", "D", "getP1", "getP2", "getP3", "getP4", "getP5", "getAverage", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ShotActionArea {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int area;
    private final double average;
    private final double p1;
    private final double p2;
    private final double p3;
    private final double p4;
    private final double p5;

    public /* synthetic */ ShotActionArea(int i, int i2, double d, double d2, double d3, double d4, double d5, double d6, t5h t5hVar) {
        if (127 != (i & Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE)) {
            oea.z(i, Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, ShotActionArea$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.area = i2;
        this.p1 = d;
        this.p2 = d2;
        this.p3 = d3;
        this.p4 = d4;
        this.p5 = d5;
        this.average = d6;
    }

    public static /* synthetic */ ShotActionArea copy$default(ShotActionArea shotActionArea, int i, double d, double d2, double d3, double d4, double d5, double d6, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = shotActionArea.area;
        }
        return shotActionArea.copy(i, (i2 & 2) != 0 ? shotActionArea.p1 : d, (i2 & 4) != 0 ? shotActionArea.p2 : d2, (i2 & 8) != 0 ? shotActionArea.p3 : d3, (i2 & 16) != 0 ? shotActionArea.p4 : d4, (i2 & 32) != 0 ? shotActionArea.p5 : d5, (i2 & 64) != 0 ? shotActionArea.average : d6);
    }

    public static final /* synthetic */ void write$Self$model_release(ShotActionArea self, wf3 output, SerialDescriptor serialDesc) {
        output.u(0, self.area, serialDesc);
        output.D(serialDesc, 1, self.p1);
        output.D(serialDesc, 2, self.p2);
        output.D(serialDesc, 3, self.p3);
        output.D(serialDesc, 4, self.p4);
        output.D(serialDesc, 5, self.p5);
        output.D(serialDesc, 6, self.average);
    }

    /* renamed from: component1, reason: from getter */
    public final int getArea() {
        return this.area;
    }

    /* renamed from: component2, reason: from getter */
    public final double getP1() {
        return this.p1;
    }

    /* renamed from: component3, reason: from getter */
    public final double getP2() {
        return this.p2;
    }

    /* renamed from: component4, reason: from getter */
    public final double getP3() {
        return this.p3;
    }

    /* renamed from: component5, reason: from getter */
    public final double getP4() {
        return this.p4;
    }

    /* renamed from: component6, reason: from getter */
    public final double getP5() {
        return this.p5;
    }

    /* renamed from: component7, reason: from getter */
    public final double getAverage() {
        return this.average;
    }

    @NotNull
    public final ShotActionArea copy(int area, double p1, double p2, double p3, double p4, double p5, double average) {
        return new ShotActionArea(area, p1, p2, p3, p4, p5, average);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShotActionArea)) {
            return false;
        }
        ShotActionArea shotActionArea = (ShotActionArea) other;
        return this.area == shotActionArea.area && Double.compare(this.p1, shotActionArea.p1) == 0 && Double.compare(this.p2, shotActionArea.p2) == 0 && Double.compare(this.p3, shotActionArea.p3) == 0 && Double.compare(this.p4, shotActionArea.p4) == 0 && Double.compare(this.p5, shotActionArea.p5) == 0 && Double.compare(this.average, shotActionArea.average) == 0;
    }

    public final int getArea() {
        return this.area;
    }

    public final double getAverage() {
        return this.average;
    }

    public final double getP1() {
        return this.p1;
    }

    public final double getP2() {
        return this.p2;
    }

    public final double getP3() {
        return this.p3;
    }

    public final double getP4() {
        return this.p4;
    }

    public final double getP5() {
        return this.p5;
    }

    public int hashCode() {
        return Double.hashCode(this.average) + dmi.b(dmi.b(dmi.b(dmi.b(dmi.b(Integer.hashCode(this.area) * 31, 31, this.p1), 31, this.p2), 31, this.p3), 31, this.p4), 31, this.p5);
    }

    @NotNull
    public String toString() {
        int i = this.area;
        double d = this.p1;
        double d2 = this.p2;
        double d3 = this.p3;
        double d4 = this.p4;
        double d5 = this.p5;
        double d6 = this.average;
        StringBuilder sb = new StringBuilder("ShotActionArea(area=");
        sb.append(i);
        sb.append(", p1=");
        sb.append(d);
        fn0.A(sb, ", p2=", d2, ", p3=");
        sb.append(d3);
        fn0.A(sb, ", p4=", d4, ", p5=");
        sb.append(d5);
        sb.append(", average=");
        sb.append(d6);
        sb.append(")");
        return sb.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/ShotActionArea$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/ShotActionArea;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return ShotActionArea$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public ShotActionArea(int i, double d, double d2, double d3, double d4, double d5, double d6) {
        this.area = i;
        this.p1 = d;
        this.p2 = d2;
        this.p3 = d3;
        this.p4 = d4;
        this.p5 = d5;
        this.average = d6;
    }
}
