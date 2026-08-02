package com.vk.core.view.components.cell.slot;

import android.view.View;
import xsna.asp;
import xsna.too0;
import xsna.zrp;

/* compiled from: Slot.kt */
/* loaded from: classes17.dex */
public interface Slot<PARAMS> extends too0 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Slot.kt */
    public static final class Align {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Align[] $VALUES;
        public static final Align Middle;
        public static final Align Top;

        static {
            Align align = new Align("Top", 0);
            Top = align;
            Align align2 = new Align("Middle", 1);
            Middle = align2;
            Align[] alignArr = {align, align2};
            $VALUES = alignArr;
            $ENTRIES = new asp(alignArr);
        }

        public Align() {
            throw null;
        }

        public static Align valueOf(String str) {
            return (Align) Enum.valueOf(Align.class, str);
        }

        public static Align[] values() {
            return (Align[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Slot.kt */
    public static final class Size {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Size[] $VALUES;
        public static final Size L;
        public static final Size M;
        public static final Size S;

        static {
            Size size = new Size("S", 0);
            S = size;
            Size size2 = new Size("M", 1);
            M = size2;
            Size size3 = new Size("L", 2);
            L = size3;
            Size[] sizeArr = {size, size2, size3};
            $VALUES = sizeArr;
            $ENTRIES = new asp(sizeArr);
        }

        public Size() {
            throw null;
        }

        public static Size valueOf(String str) {
            return (Size) Enum.valueOf(Size.class, str);
        }

        public static Size[] values() {
            return (Size[]) $VALUES.clone();
        }
    }

    void Ad(Size size);

    View getView();
}
