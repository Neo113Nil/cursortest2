package com.vk.donut.design.compose.banner;

import xsna.asp;
import xsna.zrp;

/* compiled from: DonutBannerSkeleton.kt */
/* loaded from: classes18.dex */
public interface DonutBannerSkeletonContent {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DonutBannerSkeleton.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type Goals;
        public static final Type Regular;

        static {
            Type type = new Type("Regular", 0);
            Regular = type;
            Type type2 = new Type("Goals", 1);
            Goals = type2;
            Type[] typeArr = {type, type2};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    /* compiled from: DonutBannerSkeleton.kt */
    public static final class a implements DonutBannerSkeletonContent {
        public final Type a;

        public a(Type type) {
            this.a = type;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Single(type=" + this.a + ')';
        }
    }

    /* compiled from: DonutBannerSkeleton.kt */
    public static final class b implements DonutBannerSkeletonContent {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -230574439;
        }

        public final String toString() {
            return "TwoCards";
        }
    }
}
