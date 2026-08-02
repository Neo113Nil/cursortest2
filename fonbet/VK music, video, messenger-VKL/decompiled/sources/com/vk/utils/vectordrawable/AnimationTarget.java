package com.vk.utils.vectordrawable;

import android.animation.PropertyValuesHolder;
import androidx.annotation.Keep;
import xsna.asp;
import xsna.lq2;
import xsna.mq2;
import xsna.nq2;
import xsna.oq2;
import xsna.s3q0;
import xsna.wzs;
import xsna.zrp;

/* compiled from: AnimationTarget.kt */
@Keep
/* loaded from: classes6.dex */
public interface AnimationTarget {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AnimationTarget.kt */
    public static final class Property {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Property[] $VALUES;
        public static final Property FILL_COLOR;
        public static final Property STROKE_ALPHA;
        public static final Property STROKE_COLOR;
        public static final Property STROKE_WIDTH;
        private final String tag;
        private final wzs<PropertyValuesHolder, Object[], s3q0> valueSetter;

        static {
            Property property = new Property("FILL_COLOR", 0, "fillColor", new lq2(0));
            FILL_COLOR = property;
            Property property2 = new Property("STROKE_COLOR", 1, "strokeColor", new mq2(0));
            STROKE_COLOR = property2;
            Property property3 = new Property("STROKE_WIDTH", 2, "strokeWidth", new nq2((byte) 0, 0));
            STROKE_WIDTH = property3;
            Property property4 = new Property("STROKE_ALPHA", 3, "strokeAlpha", new oq2((byte) 0, 0));
            STROKE_ALPHA = property4;
            Property[] propertyArr = {property, property2, property3, property4};
            $VALUES = propertyArr;
            $ENTRIES = new asp(propertyArr);
        }

        public Property(String str, int i, String str2, wzs wzsVar) {
            this.tag = str2;
            this.valueSetter = wzsVar;
        }

        public static Property valueOf(String str) {
            return (Property) Enum.valueOf(Property.class, str);
        }

        public static Property[] values() {
            return (Property[]) $VALUES.clone();
        }

        public final String h() {
            return this.tag;
        }

        public final void i(PropertyValuesHolder propertyValuesHolder, Object... objArr) {
            this.valueSetter.invoke(propertyValuesHolder, objArr);
        }
    }
}
