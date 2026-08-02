package com.sofascore.model.newNetwork;

import defpackage.fc6;
import defpackage.mz1;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.wf3;
import defpackage.wv8;
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
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 62\u00020\u00012\u00020\u0002:\u000276B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fBE\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000b\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001bJ\u0012\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b \u0010!JD\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b$\u0010!J\u0010\u0010%\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b%\u0010\u001bJ\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b,\u0010\u001bR\"\u0010\u0006\u001a\u00020\u00058\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010-\u001a\u0004\b.\u0010\u001d\"\u0004\b/\u00100R\"\u0010\u0007\u001a\u00020\u00058\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010-\u001a\u0004\b1\u0010\u001d\"\u0004\b2\u00100R\u001a\u0010\b\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b3\u0010\u001bR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b5\u0010!¨\u00068"}, d2 = {"Lcom/sofascore/model/newNetwork/HockeyShotmapItem;", "Lcom/sofascore/model/newNetwork/BaseHockeyShotmapItem;", "Ljava/io/Serializable;", "", "id", "", "x", "y", "type", "", "period", "<init>", "(IFFILjava/lang/String;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IIFFILjava/lang/String;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/HockeyShotmapItem;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "()F", "component3", "component4", "component5", "()Ljava/lang/String;", "copy", "(IFFILjava/lang/String;)Lcom/sofascore/model/newNetwork/HockeyShotmapItem;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "F", "getX", "setX", "(F)V", "getY", "setY", "getType", "Ljava/lang/String;", "getPeriod", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class HockeyShotmapItem extends BaseHockeyShotmapItem implements Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int id;

    @Nullable
    private final String period;
    private final int type;
    private float x;
    private float y;

    public /* synthetic */ HockeyShotmapItem(int i, int i2, float f, float f2, int i3, String str, t5h t5hVar) {
        if (31 != (i & 31)) {
            oea.z(i, 31, HockeyShotmapItem$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = i2;
        this.x = f;
        this.y = f2;
        this.type = i3;
        this.period = str;
    }

    public static /* synthetic */ HockeyShotmapItem copy$default(HockeyShotmapItem hockeyShotmapItem, int i, float f, float f2, int i2, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = hockeyShotmapItem.id;
        }
        if ((i3 & 2) != 0) {
            f = hockeyShotmapItem.x;
        }
        if ((i3 & 4) != 0) {
            f2 = hockeyShotmapItem.y;
        }
        if ((i3 & 8) != 0) {
            i2 = hockeyShotmapItem.type;
        }
        if ((i3 & 16) != 0) {
            str = hockeyShotmapItem.period;
        }
        String str2 = str;
        float f3 = f2;
        return hockeyShotmapItem.copy(i, f, f3, i2, str2);
    }

    public static final /* synthetic */ void write$Self$model_release(HockeyShotmapItem self, wf3 output, SerialDescriptor serialDesc) {
        output.u(0, self.getId(), serialDesc);
        output.t(serialDesc, 1, self.getX());
        output.t(serialDesc, 2, self.getY());
        output.u(3, self.getType(), serialDesc);
        output.h(serialDesc, 4, uhi.a, self.getPeriod());
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final float getX() {
        return this.x;
    }

    /* renamed from: component3, reason: from getter */
    public final float getY() {
        return this.y;
    }

    /* renamed from: component4, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getPeriod() {
        return this.period;
    }

    @NotNull
    public final HockeyShotmapItem copy(int id, float x, float y, int type, @Nullable String period) {
        return new HockeyShotmapItem(id, x, y, type, period);
    }

    @Override // com.sofascore.model.newNetwork.BaseHockeyShotmapItem
    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HockeyShotmapItem)) {
            return false;
        }
        HockeyShotmapItem hockeyShotmapItem = (HockeyShotmapItem) other;
        return this.id == hockeyShotmapItem.id && Float.compare(this.x, hockeyShotmapItem.x) == 0 && Float.compare(this.y, hockeyShotmapItem.y) == 0 && this.type == hockeyShotmapItem.type && Intrinsics.c(this.period, hockeyShotmapItem.period);
    }

    @Override // com.sofascore.model.newNetwork.BaseHockeyShotmapItem
    public int getId() {
        return this.id;
    }

    @Override // com.sofascore.model.newNetwork.BaseHockeyShotmapItem
    @Nullable
    public String getPeriod() {
        return this.period;
    }

    @Override // com.sofascore.model.newNetwork.BaseHockeyShotmapItem
    public int getType() {
        return this.type;
    }

    @Override // com.sofascore.model.newNetwork.BaseHockeyShotmapItem
    public float getX() {
        return this.x;
    }

    @Override // com.sofascore.model.newNetwork.BaseHockeyShotmapItem
    public float getY() {
        return this.y;
    }

    @Override // com.sofascore.model.newNetwork.BaseHockeyShotmapItem
    public int hashCode() {
        int a = wv8.a(this.type, fc6.a(this.y, fc6.a(this.x, Integer.hashCode(this.id) * 31, 31), 31), 31);
        String str = this.period;
        return a + (str == null ? 0 : str.hashCode());
    }

    @Override // com.sofascore.model.newNetwork.BaseHockeyShotmapItem
    public void setX(float f) {
        this.x = f;
    }

    @Override // com.sofascore.model.newNetwork.BaseHockeyShotmapItem
    public void setY(float f) {
        this.y = f;
    }

    @NotNull
    public String toString() {
        int i = this.id;
        float f = this.x;
        float f2 = this.y;
        int i2 = this.type;
        String str = this.period;
        StringBuilder sb = new StringBuilder("HockeyShotmapItem(id=");
        sb.append(i);
        sb.append(", x=");
        sb.append(f);
        sb.append(", y=");
        sb.append(f2);
        sb.append(", type=");
        sb.append(i2);
        sb.append(", period=");
        return mz1.o(sb, str, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/HockeyShotmapItem$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/HockeyShotmapItem;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return HockeyShotmapItem$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public HockeyShotmapItem(int i, float f, float f2, int i2, @Nullable String str) {
        this.id = i;
        this.x = f;
        this.y = f2;
        this.type = i2;
        this.period = str;
    }
}
