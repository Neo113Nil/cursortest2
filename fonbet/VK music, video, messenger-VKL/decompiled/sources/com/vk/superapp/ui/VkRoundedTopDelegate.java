package com.vk.superapp.ui;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import java.util.Collections;
import java.util.Set;
import xsna.asp;
import xsna.bpn0;
import xsna.iah0;
import xsna.icn0;
import xsna.qjo0;
import xsna.x4q;
import xsna.x9;
import xsna.zrp;

/* compiled from: VkRoundedTopDelegate.kt */
/* loaded from: classes6.dex */
public final class VkRoundedTopDelegate {
    public static final float i = iah0.a(20);
    public final icn0 a;
    public final qjo0 b;
    public Path d;
    public Path e;
    public Path f;
    public final Paint h;
    public Set<? extends CornerSide> c = Collections.singleton(CornerSide.TOP);
    public final bpn0 g = new bpn0(new x4q(0, this, VkRoundedTopDelegate.class, "getLeftCornerPath", "getLeftCornerPath()Landroid/graphics/Path;", 0));

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkRoundedTopDelegate.kt */
    public static final class CornerSide {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ CornerSide[] $VALUES;
        public static final CornerSide BOTTOM;
        public static final CornerSide TOP;

        static {
            CornerSide cornerSide = new CornerSide("TOP", 0);
            TOP = cornerSide;
            CornerSide cornerSide2 = new CornerSide("BOTTOM", 1);
            BOTTOM = cornerSide2;
            CornerSide[] cornerSideArr = {cornerSide, cornerSide2};
            $VALUES = cornerSideArr;
            $ENTRIES = new asp(cornerSideArr);
        }

        public CornerSide() {
            throw null;
        }

        public static CornerSide valueOf(String str) {
            return (CornerSide) Enum.valueOf(CornerSide.class, str);
        }

        public static CornerSide[] values() {
            return (CornerSide[]) $VALUES.clone();
        }
    }

    public VkRoundedTopDelegate(icn0 icn0Var, qjo0 qjo0Var) {
        this.a = icn0Var;
        this.b = qjo0Var;
        Paint c = x9.c(true);
        c.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        c.setColor(0);
        this.h = c;
    }
}
