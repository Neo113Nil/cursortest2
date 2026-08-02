package com.sofascore.model.newNetwork;

import androidx.core.app.NotificationCompat;
import com.ironsource.U3;
import com.ironsource.mediationsdk.metadata.a;
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
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u0000 D2\u00020\u0001:\u0002EDB\u007f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0010B\u0093\u0001\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0017J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0017J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0017J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0017J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0017J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0017J\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0017J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0017J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u0017J \u0001\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-J'\u00106\u001a\u0002032\u0006\u0010.\u001a\u00020\u00002\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u000201H\u0001¢\u0006\u0004\b4\u00105R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00107\u001a\u0004\b8\u0010\u0017R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00107\u001a\u0004\b9\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00107\u001a\u0004\b:\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00107\u001a\u0004\b;\u0010\u0017R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00107\u001a\u0004\b<\u0010\u0017R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u00107\u001a\u0004\b=\u0010\u0017R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u00107\u001a\u0004\b>\u0010\u0017R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u00107\u001a\u0004\b?\u0010\u0017R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00107\u001a\u0004\b@\u0010\u0017R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u00107\u001a\u0004\bA\u0010\u0017R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u00107\u001a\u0004\bB\u0010\u0017R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u00107\u001a\u0004\bC\u0010\u0017¨\u0006F"}, d2 = {"Lcom/sofascore/model/newNetwork/MmaStatisticArea;", "", "Lcom/sofascore/model/newNetwork/MmaStatisticClass;", U3.i.l, "head", "body", "legs", "distance", "clinch", "ground", "p1", "p3", "p4", "p5", "p6", "<init>", "(Lcom/sofascore/model/newNetwork/MmaStatisticClass;Lcom/sofascore/model/newNetwork/MmaStatisticClass;Lcom/sofascore/model/newNetwork/MmaStatisticClass;Lcom/sofascore/model/newNetwork/MmaStatisticClass;Lcom/sofascore/model/newNetwork/MmaStatisticClass;Lcom/sofascore/model/newNetwork/MmaStatisticClass;Lcom/sofascore/model/newNetwork/MmaStatisticClass;Lcom/sofascore/model/newNetwork/MmaStatisticClass;Lcom/sofascore/model/newNetwork/MmaStatisticClass;Lcom/sofascore/model/newNetwork/MmaStatisticClass;Lcom/sofascore/model/newNetwork/MmaStatisticClass;Lcom/sofascore/model/newNetwork/MmaStatisticClass;)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/newNetwork/MmaStatisticClass;Lcom/sofascore/model/newNetwork/MmaStatisticClass;Lcom/sofascore/model/newNetwork/MmaStatisticClass;Lcom/sofascore/model/newNetwork/MmaStatisticClass;Lcom/sofascore/model/newNetwork/MmaStatisticClass;Lcom/sofascore/model/newNetwork/MmaStatisticClass;Lcom/sofascore/model/newNetwork/MmaStatisticClass;Lcom/sofascore/model/newNetwork/MmaStatisticClass;Lcom/sofascore/model/newNetwork/MmaStatisticClass;Lcom/sofascore/model/newNetwork/MmaStatisticClass;Lcom/sofascore/model/newNetwork/MmaStatisticClass;Lcom/sofascore/model/newNetwork/MmaStatisticClass;Lt5h;)V", "component1", "()Lcom/sofascore/model/newNetwork/MmaStatisticClass;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Lcom/sofascore/model/newNetwork/MmaStatisticClass;Lcom/sofascore/model/newNetwork/MmaStatisticClass;Lcom/sofascore/model/newNetwork/MmaStatisticClass;Lcom/sofascore/model/newNetwork/MmaStatisticClass;Lcom/sofascore/model/newNetwork/MmaStatisticClass;Lcom/sofascore/model/newNetwork/MmaStatisticClass;Lcom/sofascore/model/newNetwork/MmaStatisticClass;Lcom/sofascore/model/newNetwork/MmaStatisticClass;Lcom/sofascore/model/newNetwork/MmaStatisticClass;Lcom/sofascore/model/newNetwork/MmaStatisticClass;Lcom/sofascore/model/newNetwork/MmaStatisticClass;Lcom/sofascore/model/newNetwork/MmaStatisticClass;)Lcom/sofascore/model/newNetwork/MmaStatisticArea;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/MmaStatisticArea;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/sofascore/model/newNetwork/MmaStatisticClass;", "getTotal", "getHead", "getBody", "getLegs", "getDistance", "getClinch", "getGround", "getP1", "getP3", "getP4", "getP5", "getP6", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class MmaStatisticArea {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final MmaStatisticClass body;

    @Nullable
    private final MmaStatisticClass clinch;

    @Nullable
    private final MmaStatisticClass distance;

    @Nullable
    private final MmaStatisticClass ground;

    @Nullable
    private final MmaStatisticClass head;

    @Nullable
    private final MmaStatisticClass legs;

    @Nullable
    private final MmaStatisticClass p1;

    @Nullable
    private final MmaStatisticClass p3;

    @Nullable
    private final MmaStatisticClass p4;

    @Nullable
    private final MmaStatisticClass p5;

    @Nullable
    private final MmaStatisticClass p6;

    @Nullable
    private final MmaStatisticClass total;

    public /* synthetic */ MmaStatisticArea(int i, MmaStatisticClass mmaStatisticClass, MmaStatisticClass mmaStatisticClass2, MmaStatisticClass mmaStatisticClass3, MmaStatisticClass mmaStatisticClass4, MmaStatisticClass mmaStatisticClass5, MmaStatisticClass mmaStatisticClass6, MmaStatisticClass mmaStatisticClass7, MmaStatisticClass mmaStatisticClass8, MmaStatisticClass mmaStatisticClass9, MmaStatisticClass mmaStatisticClass10, MmaStatisticClass mmaStatisticClass11, MmaStatisticClass mmaStatisticClass12, t5h t5hVar) {
        if (4095 != (i & 4095)) {
            oea.z(i, 4095, MmaStatisticArea$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.total = mmaStatisticClass;
        this.head = mmaStatisticClass2;
        this.body = mmaStatisticClass3;
        this.legs = mmaStatisticClass4;
        this.distance = mmaStatisticClass5;
        this.clinch = mmaStatisticClass6;
        this.ground = mmaStatisticClass7;
        this.p1 = mmaStatisticClass8;
        this.p3 = mmaStatisticClass9;
        this.p4 = mmaStatisticClass10;
        this.p5 = mmaStatisticClass11;
        this.p6 = mmaStatisticClass12;
    }

    public static /* synthetic */ MmaStatisticArea copy$default(MmaStatisticArea mmaStatisticArea, MmaStatisticClass mmaStatisticClass, MmaStatisticClass mmaStatisticClass2, MmaStatisticClass mmaStatisticClass3, MmaStatisticClass mmaStatisticClass4, MmaStatisticClass mmaStatisticClass5, MmaStatisticClass mmaStatisticClass6, MmaStatisticClass mmaStatisticClass7, MmaStatisticClass mmaStatisticClass8, MmaStatisticClass mmaStatisticClass9, MmaStatisticClass mmaStatisticClass10, MmaStatisticClass mmaStatisticClass11, MmaStatisticClass mmaStatisticClass12, int i, Object obj) {
        if ((i & 1) != 0) {
            mmaStatisticClass = mmaStatisticArea.total;
        }
        if ((i & 2) != 0) {
            mmaStatisticClass2 = mmaStatisticArea.head;
        }
        if ((i & 4) != 0) {
            mmaStatisticClass3 = mmaStatisticArea.body;
        }
        if ((i & 8) != 0) {
            mmaStatisticClass4 = mmaStatisticArea.legs;
        }
        if ((i & 16) != 0) {
            mmaStatisticClass5 = mmaStatisticArea.distance;
        }
        if ((i & 32) != 0) {
            mmaStatisticClass6 = mmaStatisticArea.clinch;
        }
        if ((i & 64) != 0) {
            mmaStatisticClass7 = mmaStatisticArea.ground;
        }
        if ((i & 128) != 0) {
            mmaStatisticClass8 = mmaStatisticArea.p1;
        }
        if ((i & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            mmaStatisticClass9 = mmaStatisticArea.p3;
        }
        if ((i & 512) != 0) {
            mmaStatisticClass10 = mmaStatisticArea.p4;
        }
        if ((i & 1024) != 0) {
            mmaStatisticClass11 = mmaStatisticArea.p5;
        }
        if ((i & a.o) != 0) {
            mmaStatisticClass12 = mmaStatisticArea.p6;
        }
        MmaStatisticClass mmaStatisticClass13 = mmaStatisticClass11;
        MmaStatisticClass mmaStatisticClass14 = mmaStatisticClass12;
        MmaStatisticClass mmaStatisticClass15 = mmaStatisticClass9;
        MmaStatisticClass mmaStatisticClass16 = mmaStatisticClass10;
        MmaStatisticClass mmaStatisticClass17 = mmaStatisticClass7;
        MmaStatisticClass mmaStatisticClass18 = mmaStatisticClass8;
        MmaStatisticClass mmaStatisticClass19 = mmaStatisticClass5;
        MmaStatisticClass mmaStatisticClass20 = mmaStatisticClass6;
        return mmaStatisticArea.copy(mmaStatisticClass, mmaStatisticClass2, mmaStatisticClass3, mmaStatisticClass4, mmaStatisticClass19, mmaStatisticClass20, mmaStatisticClass17, mmaStatisticClass18, mmaStatisticClass15, mmaStatisticClass16, mmaStatisticClass13, mmaStatisticClass14);
    }

    public static final /* synthetic */ void write$Self$model_release(MmaStatisticArea self, wf3 output, SerialDescriptor serialDesc) {
        MmaStatisticClass$$serializer mmaStatisticClass$$serializer = MmaStatisticClass$$serializer.INSTANCE;
        output.h(serialDesc, 0, mmaStatisticClass$$serializer, self.total);
        output.h(serialDesc, 1, mmaStatisticClass$$serializer, self.head);
        output.h(serialDesc, 2, mmaStatisticClass$$serializer, self.body);
        output.h(serialDesc, 3, mmaStatisticClass$$serializer, self.legs);
        output.h(serialDesc, 4, mmaStatisticClass$$serializer, self.distance);
        output.h(serialDesc, 5, mmaStatisticClass$$serializer, self.clinch);
        output.h(serialDesc, 6, mmaStatisticClass$$serializer, self.ground);
        output.h(serialDesc, 7, mmaStatisticClass$$serializer, self.p1);
        output.h(serialDesc, 8, mmaStatisticClass$$serializer, self.p3);
        output.h(serialDesc, 9, mmaStatisticClass$$serializer, self.p4);
        output.h(serialDesc, 10, mmaStatisticClass$$serializer, self.p5);
        output.h(serialDesc, 11, mmaStatisticClass$$serializer, self.p6);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final MmaStatisticClass getTotal() {
        return this.total;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final MmaStatisticClass getP4() {
        return this.p4;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final MmaStatisticClass getP5() {
        return this.p5;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final MmaStatisticClass getP6() {
        return this.p6;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final MmaStatisticClass getHead() {
        return this.head;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final MmaStatisticClass getBody() {
        return this.body;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final MmaStatisticClass getLegs() {
        return this.legs;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final MmaStatisticClass getDistance() {
        return this.distance;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final MmaStatisticClass getClinch() {
        return this.clinch;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final MmaStatisticClass getGround() {
        return this.ground;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final MmaStatisticClass getP1() {
        return this.p1;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final MmaStatisticClass getP3() {
        return this.p3;
    }

    @NotNull
    public final MmaStatisticArea copy(@Nullable MmaStatisticClass total, @Nullable MmaStatisticClass head, @Nullable MmaStatisticClass body, @Nullable MmaStatisticClass legs, @Nullable MmaStatisticClass distance, @Nullable MmaStatisticClass clinch, @Nullable MmaStatisticClass ground, @Nullable MmaStatisticClass p1, @Nullable MmaStatisticClass p3, @Nullable MmaStatisticClass p4, @Nullable MmaStatisticClass p5, @Nullable MmaStatisticClass p6) {
        return new MmaStatisticArea(total, head, body, legs, distance, clinch, ground, p1, p3, p4, p5, p6);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MmaStatisticArea)) {
            return false;
        }
        MmaStatisticArea mmaStatisticArea = (MmaStatisticArea) other;
        return Intrinsics.c(this.total, mmaStatisticArea.total) && Intrinsics.c(this.head, mmaStatisticArea.head) && Intrinsics.c(this.body, mmaStatisticArea.body) && Intrinsics.c(this.legs, mmaStatisticArea.legs) && Intrinsics.c(this.distance, mmaStatisticArea.distance) && Intrinsics.c(this.clinch, mmaStatisticArea.clinch) && Intrinsics.c(this.ground, mmaStatisticArea.ground) && Intrinsics.c(this.p1, mmaStatisticArea.p1) && Intrinsics.c(this.p3, mmaStatisticArea.p3) && Intrinsics.c(this.p4, mmaStatisticArea.p4) && Intrinsics.c(this.p5, mmaStatisticArea.p5) && Intrinsics.c(this.p6, mmaStatisticArea.p6);
    }

    @Nullable
    public final MmaStatisticClass getBody() {
        return this.body;
    }

    @Nullable
    public final MmaStatisticClass getClinch() {
        return this.clinch;
    }

    @Nullable
    public final MmaStatisticClass getDistance() {
        return this.distance;
    }

    @Nullable
    public final MmaStatisticClass getGround() {
        return this.ground;
    }

    @Nullable
    public final MmaStatisticClass getHead() {
        return this.head;
    }

    @Nullable
    public final MmaStatisticClass getLegs() {
        return this.legs;
    }

    @Nullable
    public final MmaStatisticClass getP1() {
        return this.p1;
    }

    @Nullable
    public final MmaStatisticClass getP3() {
        return this.p3;
    }

    @Nullable
    public final MmaStatisticClass getP4() {
        return this.p4;
    }

    @Nullable
    public final MmaStatisticClass getP5() {
        return this.p5;
    }

    @Nullable
    public final MmaStatisticClass getP6() {
        return this.p6;
    }

    @Nullable
    public final MmaStatisticClass getTotal() {
        return this.total;
    }

    public int hashCode() {
        MmaStatisticClass mmaStatisticClass = this.total;
        int hashCode = (mmaStatisticClass == null ? 0 : mmaStatisticClass.hashCode()) * 31;
        MmaStatisticClass mmaStatisticClass2 = this.head;
        int hashCode2 = (hashCode + (mmaStatisticClass2 == null ? 0 : mmaStatisticClass2.hashCode())) * 31;
        MmaStatisticClass mmaStatisticClass3 = this.body;
        int hashCode3 = (hashCode2 + (mmaStatisticClass3 == null ? 0 : mmaStatisticClass3.hashCode())) * 31;
        MmaStatisticClass mmaStatisticClass4 = this.legs;
        int hashCode4 = (hashCode3 + (mmaStatisticClass4 == null ? 0 : mmaStatisticClass4.hashCode())) * 31;
        MmaStatisticClass mmaStatisticClass5 = this.distance;
        int hashCode5 = (hashCode4 + (mmaStatisticClass5 == null ? 0 : mmaStatisticClass5.hashCode())) * 31;
        MmaStatisticClass mmaStatisticClass6 = this.clinch;
        int hashCode6 = (hashCode5 + (mmaStatisticClass6 == null ? 0 : mmaStatisticClass6.hashCode())) * 31;
        MmaStatisticClass mmaStatisticClass7 = this.ground;
        int hashCode7 = (hashCode6 + (mmaStatisticClass7 == null ? 0 : mmaStatisticClass7.hashCode())) * 31;
        MmaStatisticClass mmaStatisticClass8 = this.p1;
        int hashCode8 = (hashCode7 + (mmaStatisticClass8 == null ? 0 : mmaStatisticClass8.hashCode())) * 31;
        MmaStatisticClass mmaStatisticClass9 = this.p3;
        int hashCode9 = (hashCode8 + (mmaStatisticClass9 == null ? 0 : mmaStatisticClass9.hashCode())) * 31;
        MmaStatisticClass mmaStatisticClass10 = this.p4;
        int hashCode10 = (hashCode9 + (mmaStatisticClass10 == null ? 0 : mmaStatisticClass10.hashCode())) * 31;
        MmaStatisticClass mmaStatisticClass11 = this.p5;
        int hashCode11 = (hashCode10 + (mmaStatisticClass11 == null ? 0 : mmaStatisticClass11.hashCode())) * 31;
        MmaStatisticClass mmaStatisticClass12 = this.p6;
        return hashCode11 + (mmaStatisticClass12 != null ? mmaStatisticClass12.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MmaStatisticArea(total=" + this.total + ", head=" + this.head + ", body=" + this.body + ", legs=" + this.legs + ", distance=" + this.distance + ", clinch=" + this.clinch + ", ground=" + this.ground + ", p1=" + this.p1 + ", p3=" + this.p3 + ", p4=" + this.p4 + ", p5=" + this.p5 + ", p6=" + this.p6 + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/MmaStatisticArea$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/MmaStatisticArea;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return MmaStatisticArea$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public MmaStatisticArea(@Nullable MmaStatisticClass mmaStatisticClass, @Nullable MmaStatisticClass mmaStatisticClass2, @Nullable MmaStatisticClass mmaStatisticClass3, @Nullable MmaStatisticClass mmaStatisticClass4, @Nullable MmaStatisticClass mmaStatisticClass5, @Nullable MmaStatisticClass mmaStatisticClass6, @Nullable MmaStatisticClass mmaStatisticClass7, @Nullable MmaStatisticClass mmaStatisticClass8, @Nullable MmaStatisticClass mmaStatisticClass9, @Nullable MmaStatisticClass mmaStatisticClass10, @Nullable MmaStatisticClass mmaStatisticClass11, @Nullable MmaStatisticClass mmaStatisticClass12) {
        this.total = mmaStatisticClass;
        this.head = mmaStatisticClass2;
        this.body = mmaStatisticClass3;
        this.legs = mmaStatisticClass4;
        this.distance = mmaStatisticClass5;
        this.clinch = mmaStatisticClass6;
        this.ground = mmaStatisticClass7;
        this.p1 = mmaStatisticClass8;
        this.p3 = mmaStatisticClass9;
        this.p4 = mmaStatisticClass10;
        this.p5 = mmaStatisticClass11;
        this.p6 = mmaStatisticClass12;
    }
}
