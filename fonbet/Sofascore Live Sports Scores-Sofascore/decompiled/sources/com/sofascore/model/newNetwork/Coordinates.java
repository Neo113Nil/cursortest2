package com.sofascore.model.newNetwork;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.sofascore.model.mvvm.model.Point2D;
import com.sofascore.model.mvvm.model.Point2D$$serializer;
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
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002.-B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J>\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0018R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b+\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b,\u0010\u0018¨\u0006/"}, d2 = {"Lcom/sofascore/model/newNetwork/Coordinates;", "Ljava/io/Serializable;", "Lcom/sofascore/model/mvvm/model/Point2D;", "start", TtmlNode.END, "goal", "block", "<init>", "(Lcom/sofascore/model/mvvm/model/Point2D;Lcom/sofascore/model/mvvm/model/Point2D;Lcom/sofascore/model/mvvm/model/Point2D;Lcom/sofascore/model/mvvm/model/Point2D;)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/mvvm/model/Point2D;Lcom/sofascore/model/mvvm/model/Point2D;Lcom/sofascore/model/mvvm/model/Point2D;Lcom/sofascore/model/mvvm/model/Point2D;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/Coordinates;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/sofascore/model/mvvm/model/Point2D;", "component2", "component3", "component4", "copy", "(Lcom/sofascore/model/mvvm/model/Point2D;Lcom/sofascore/model/mvvm/model/Point2D;Lcom/sofascore/model/mvvm/model/Point2D;Lcom/sofascore/model/mvvm/model/Point2D;)Lcom/sofascore/model/newNetwork/Coordinates;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/sofascore/model/mvvm/model/Point2D;", "getStart", "getEnd", "getGoal", "getBlock", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Coordinates implements Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Point2D block;

    @Nullable
    private final Point2D end;

    @Nullable
    private final Point2D goal;

    @NotNull
    private final Point2D start;

    public /* synthetic */ Coordinates(int i, Point2D point2D, Point2D point2D2, Point2D point2D3, Point2D point2D4, t5h t5hVar) {
        if (15 != (i & 15)) {
            oea.z(i, 15, Coordinates$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.start = point2D;
        this.end = point2D2;
        this.goal = point2D3;
        this.block = point2D4;
    }

    public static /* synthetic */ Coordinates copy$default(Coordinates coordinates, Point2D point2D, Point2D point2D2, Point2D point2D3, Point2D point2D4, int i, Object obj) {
        if ((i & 1) != 0) {
            point2D = coordinates.start;
        }
        if ((i & 2) != 0) {
            point2D2 = coordinates.end;
        }
        if ((i & 4) != 0) {
            point2D3 = coordinates.goal;
        }
        if ((i & 8) != 0) {
            point2D4 = coordinates.block;
        }
        return coordinates.copy(point2D, point2D2, point2D3, point2D4);
    }

    public static final /* synthetic */ void write$Self$model_release(Coordinates self, wf3 output, SerialDescriptor serialDesc) {
        Point2D$$serializer point2D$$serializer = Point2D$$serializer.INSTANCE;
        output.f(serialDesc, 0, point2D$$serializer, self.start);
        output.h(serialDesc, 1, point2D$$serializer, self.end);
        output.h(serialDesc, 2, point2D$$serializer, self.goal);
        output.h(serialDesc, 3, point2D$$serializer, self.block);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Point2D getStart() {
        return this.start;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Point2D getEnd() {
        return this.end;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Point2D getGoal() {
        return this.goal;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Point2D getBlock() {
        return this.block;
    }

    @NotNull
    public final Coordinates copy(@NotNull Point2D start, @Nullable Point2D end, @Nullable Point2D goal, @Nullable Point2D block) {
        start.getClass();
        return new Coordinates(start, end, goal, block);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Coordinates)) {
            return false;
        }
        Coordinates coordinates = (Coordinates) other;
        return Intrinsics.c(this.start, coordinates.start) && Intrinsics.c(this.end, coordinates.end) && Intrinsics.c(this.goal, coordinates.goal) && Intrinsics.c(this.block, coordinates.block);
    }

    @Nullable
    public final Point2D getBlock() {
        return this.block;
    }

    @Nullable
    public final Point2D getEnd() {
        return this.end;
    }

    @Nullable
    public final Point2D getGoal() {
        return this.goal;
    }

    @NotNull
    public final Point2D getStart() {
        return this.start;
    }

    public int hashCode() {
        int hashCode = this.start.hashCode() * 31;
        Point2D point2D = this.end;
        int hashCode2 = (hashCode + (point2D == null ? 0 : point2D.hashCode())) * 31;
        Point2D point2D2 = this.goal;
        int hashCode3 = (hashCode2 + (point2D2 == null ? 0 : point2D2.hashCode())) * 31;
        Point2D point2D3 = this.block;
        return hashCode3 + (point2D3 != null ? point2D3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Coordinates(start=" + this.start + ", end=" + this.end + ", goal=" + this.goal + ", block=" + this.block + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/Coordinates$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/Coordinates;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return Coordinates$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public Coordinates(@NotNull Point2D point2D, @Nullable Point2D point2D2, @Nullable Point2D point2D3, @Nullable Point2D point2D4) {
        point2D.getClass();
        this.start = point2D;
        this.end = point2D2;
        this.goal = point2D3;
        this.block = point2D4;
    }
}
