package com.vk.camera.editor.common.cadre;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CadreTarget.kt */
/* loaded from: classes16.dex */
public final class CadreTarget {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CadreTarget[] $VALUES;
    public static final CadreTarget EDITOR;
    public static final CadreTarget VIEWER;
    public static final CadreTarget VIEWFINDER;

    static {
        CadreTarget cadreTarget = new CadreTarget("VIEWER", 0);
        VIEWER = cadreTarget;
        CadreTarget cadreTarget2 = new CadreTarget("VIEWFINDER", 1);
        VIEWFINDER = cadreTarget2;
        CadreTarget cadreTarget3 = new CadreTarget("EDITOR", 2);
        EDITOR = cadreTarget3;
        CadreTarget[] cadreTargetArr = {cadreTarget, cadreTarget2, cadreTarget3};
        $VALUES = cadreTargetArr;
        $ENTRIES = new asp(cadreTargetArr);
    }

    public CadreTarget() {
        throw null;
    }

    public static CadreTarget valueOf(String str) {
        return (CadreTarget) Enum.valueOf(CadreTarget.class, str);
    }

    public static CadreTarget[] values() {
        return (CadreTarget[]) $VALUES.clone();
    }
}
