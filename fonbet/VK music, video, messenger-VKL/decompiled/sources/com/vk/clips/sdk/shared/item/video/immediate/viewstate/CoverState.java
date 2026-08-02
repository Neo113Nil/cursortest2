package com.vk.clips.sdk.shared.item.video.immediate.viewstate;

import xsna.asp;
import xsna.xq;
import xsna.zrp;

/* compiled from: CoverState.kt */
/* loaded from: classes17.dex */
public interface CoverState {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CoverState.kt */
    public static final class ColorFilterType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ColorFilterType[] $VALUES;
        public static final ColorFilterType ERROR;
        public static final ColorFilterType NONE;

        static {
            ColorFilterType colorFilterType = new ColorFilterType("NONE", 0);
            NONE = colorFilterType;
            ColorFilterType colorFilterType2 = new ColorFilterType("ERROR", 1);
            ERROR = colorFilterType2;
            ColorFilterType[] colorFilterTypeArr = {colorFilterType, colorFilterType2};
            $VALUES = colorFilterTypeArr;
            $ENTRIES = new asp(colorFilterTypeArr);
        }

        public ColorFilterType() {
            throw null;
        }

        public static ColorFilterType valueOf(String str) {
            return (ColorFilterType) Enum.valueOf(ColorFilterType.class, str);
        }

        public static ColorFilterType[] values() {
            return (ColorFilterType[]) $VALUES.clone();
        }
    }

    /* compiled from: CoverState.kt */
    public static final class a implements CoverState {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1007565839;
        }

        public final String toString() {
            return "Hidden";
        }
    }

    /* compiled from: CoverState.kt */
    public static final class b implements CoverState {
        public final ColorFilterType a;
        public final float b;

        public b(ColorFilterType colorFilterType, float f) {
            this.a = colorFilterType;
            this.b = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && Float.compare(this.b, bVar.b) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Visible(colorFilterType=");
            sb.append(this.a);
            sb.append(", videoRatioHW=");
            return xq.c(')', this.b, sb);
        }
    }
}
