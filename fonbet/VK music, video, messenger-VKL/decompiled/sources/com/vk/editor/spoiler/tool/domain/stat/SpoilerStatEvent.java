package com.vk.editor.spoiler.tool.domain.stat;

import xsna.asp;
import xsna.srk0;
import xsna.zrp;

/* compiled from: SpoilerStatEvent.kt */
/* loaded from: classes18.dex */
public interface SpoilerStatEvent extends srk0 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SpoilerStatEvent.kt */
    public static final class BlurType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ BlurType[] $VALUES;
        public static final BlurType FOR_ALL;
        public static final BlurType ONLY_FOR_DONUTS;

        static {
            BlurType blurType = new BlurType("FOR_ALL", 0);
            FOR_ALL = blurType;
            BlurType blurType2 = new BlurType("ONLY_FOR_DONUTS", 1);
            ONLY_FOR_DONUTS = blurType2;
            BlurType[] blurTypeArr = {blurType, blurType2};
            $VALUES = blurTypeArr;
            $ENTRIES = new asp(blurTypeArr);
        }

        public BlurType() {
            throw null;
        }

        public static BlurType valueOf(String str) {
            return (BlurType) Enum.valueOf(BlurType.class, str);
        }

        public static BlurType[] values() {
            return (BlurType[]) $VALUES.clone();
        }
    }

    /* compiled from: SpoilerStatEvent.kt */
    public static final class a implements SpoilerStatEvent {
        public static final a a = new a();
    }

    /* compiled from: SpoilerStatEvent.kt */
    public static final class b implements SpoilerStatEvent {
        public final BlurType a;

        public b(BlurType blurType) {
            this.a = blurType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(100) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Save(type=" + this.a + ", blurValue=100)";
        }
    }
}
