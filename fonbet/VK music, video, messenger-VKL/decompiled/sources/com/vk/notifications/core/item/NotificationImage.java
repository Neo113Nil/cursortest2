package com.vk.notifications.core.item;

import xsna.asp;
import xsna.bt;
import xsna.epx;
import xsna.snv;
import xsna.tlo0;
import xsna.zrp;

/* compiled from: NotificationImage.kt */
/* loaded from: classes4.dex */
public final class NotificationImage {
    public final String a;
    public final snv b;
    public final tlo0 c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NotificationImage.kt */
    public static final class Shape {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Shape[] $VALUES;
        public static final Shape HORIZONTAL;
        public static final Shape SQUARE;
        public static final Shape VERTICAL;
        private final int height;
        private final int width;

        static {
            Shape shape = new Shape("SQUARE", 0, 72, 72);
            SQUARE = shape;
            Shape shape2 = new Shape("VERTICAL", 1, 72, 120);
            VERTICAL = shape2;
            Shape shape3 = new Shape("HORIZONTAL", 2, 120, 72);
            HORIZONTAL = shape3;
            Shape[] shapeArr = {shape, shape2, shape3};
            $VALUES = shapeArr;
            $ENTRIES = new asp(shapeArr);
        }

        public Shape(String str, int i, int i2, int i3) {
            this.width = i2;
            this.height = i3;
        }

        public static zrp<Shape> h() {
            return $ENTRIES;
        }

        public static Shape valueOf(String str) {
            return (Shape) Enum.valueOf(Shape.class, str);
        }

        public static Shape[] values() {
            return (Shape[]) $VALUES.clone();
        }

        public final int getHeight() {
            return this.height;
        }

        public final int getWidth() {
            return this.width;
        }
    }

    public NotificationImage(String str, snv snvVar, tlo0 tlo0Var, int i) {
        snvVar = (i & 2) != 0 ? null : snvVar;
        tlo0Var = (i & 8) != 0 ? null : tlo0Var;
        this.a = str;
        this.b = snvVar;
        this.c = tlo0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationImage)) {
            return false;
        }
        NotificationImage notificationImage = (NotificationImage) obj;
        return epx.f(this.a, notificationImage.a) && epx.f(this.b, notificationImage.b) && epx.f(this.c, notificationImage.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        snv snvVar = this.b;
        int hashCode2 = (hashCode + (snvVar == null ? 0 : snvVar.hashCode())) * 961;
        tlo0 tlo0Var = this.c;
        return hashCode2 + (tlo0Var != null ? tlo0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotificationImage(url=");
        sb.append(this.a);
        sb.append(", action=");
        sb.append(this.b);
        sb.append(", decoration=null, contentDescription=");
        return bt.a(sb, this.c, ')');
    }
}
