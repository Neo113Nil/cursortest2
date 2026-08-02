package com.vk.im.ui.views.msg.bubble;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FloatingBubbleFluidLayout.kt */
/* loaded from: classes2.dex */
public final class a {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a BOTTOM_CENTER;
    public static final a BOTTOM_END;
    public static final a BOTTOM_LEFT;
    public static final a BOTTOM_RIGHT;
    public static final a BOTTOM_START;
    public static final C1183a Companion;
    private final int value;

    /* compiled from: FloatingBubbleFluidLayout.kt */
    /* renamed from: com.vk.im.ui.views.msg.bubble.a$a, reason: collision with other inner class name */
    public static final class C1183a {
    }

    static {
        a aVar = new a("BOTTOM_LEFT", 0, 0);
        BOTTOM_LEFT = aVar;
        a aVar2 = new a("BOTTOM_CENTER", 1, 1);
        BOTTOM_CENTER = aVar2;
        a aVar3 = new a("BOTTOM_RIGHT", 2, 2);
        BOTTOM_RIGHT = aVar3;
        a aVar4 = new a("BOTTOM_START", 3, 3);
        BOTTOM_START = aVar4;
        a aVar5 = new a("BOTTOM_END", 4, 4);
        BOTTOM_END = aVar5;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5};
        $VALUES = aVarArr;
        $ENTRIES = new asp(aVarArr);
        Companion = new C1183a();
    }

    public a(String str, int i, int i2) {
        this.value = i2;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    public final int h() {
        return this.value;
    }
}
