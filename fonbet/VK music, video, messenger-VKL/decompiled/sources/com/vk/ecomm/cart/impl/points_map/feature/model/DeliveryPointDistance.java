package com.vk.ecomm.cart.impl.points_map.feature.model;

import defpackage.q0;
import io.reactivex.rxjava3.subjects.b;
import xsna.asp;
import xsna.zrp;

/* compiled from: DeliveryPointDistance.kt */
/* loaded from: classes18.dex */
public final class DeliveryPointDistance {
    public final int a;
    public final float b;
    public final Unit c;
    public final boolean d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DeliveryPointDistance.kt */
    public static final class Unit {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Unit[] $VALUES;
        public static final Unit KILOMETERS;
        public static final Unit METERS;

        static {
            Unit unit = new Unit("METERS", 0);
            METERS = unit;
            Unit unit2 = new Unit("KILOMETERS", 1);
            KILOMETERS = unit2;
            Unit[] unitArr = {unit, unit2};
            $VALUES = unitArr;
            $ENTRIES = new asp(unitArr);
        }

        public Unit() {
            throw null;
        }

        public static Unit valueOf(String str) {
            return (Unit) Enum.valueOf(Unit.class, str);
        }

        public static Unit[] values() {
            return (Unit[]) $VALUES.clone();
        }
    }

    public DeliveryPointDistance(int i, float f, Unit unit, boolean z) {
        this.a = i;
        this.b = f;
        this.c = unit;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeliveryPointDistance)) {
            return false;
        }
        DeliveryPointDistance deliveryPointDistance = (DeliveryPointDistance) obj;
        return this.a == deliveryPointDistance.a && Float.compare(this.b, deliveryPointDistance.b) == 0 && this.c == deliveryPointDistance.c && this.d == deliveryPointDistance.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + b.a(this.b, Integer.hashCode(this.a) * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeliveryPointDistance(distanceInM=");
        sb.append(this.a);
        sb.append(", distance=");
        sb.append(this.b);
        sb.append(", units=");
        sb.append(this.c);
        sb.append(", isVisible=");
        return q0.a(sb, this.d, ')');
    }
}
