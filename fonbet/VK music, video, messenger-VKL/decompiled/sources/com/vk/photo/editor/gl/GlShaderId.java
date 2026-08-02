package com.vk.photo.editor.gl;

import com.vkontakte.android.R;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GlShaderId.kt */
/* loaded from: classes4.dex */
public final class GlShaderId {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GlShaderId[] $VALUES;
    public static final GlShaderId CollageSlot;
    public static final GlShaderId CollageSlotSharpness;
    public static final GlShaderId ColorGrading;
    public static final GlShaderId Filter;
    public static final GlShaderId Grain;
    public static final GlShaderId Main;
    public static final GlShaderId SolidColor;
    public static final GlShaderId Vertext;
    private final int resId;

    static {
        GlShaderId glShaderId = new GlShaderId("Vertext", 0, R.raw.vert);
        Vertext = glShaderId;
        GlShaderId glShaderId2 = new GlShaderId("CollageSlot", 1, R.raw.slot_frag);
        CollageSlot = glShaderId2;
        GlShaderId glShaderId3 = new GlShaderId("CollageSlotSharpness", 2, R.raw.slot_sharpness_frag);
        CollageSlotSharpness = glShaderId3;
        GlShaderId glShaderId4 = new GlShaderId("Grain", 3, R.raw.grain_frag);
        Grain = glShaderId4;
        GlShaderId glShaderId5 = new GlShaderId("ColorGrading", 4, R.raw.cg_frag);
        ColorGrading = glShaderId5;
        GlShaderId glShaderId6 = new GlShaderId("Filter", 5, R.raw.filter_frag);
        Filter = glShaderId6;
        GlShaderId glShaderId7 = new GlShaderId("Main", 6, R.raw.main_frag);
        Main = glShaderId7;
        GlShaderId glShaderId8 = new GlShaderId("SolidColor", 7, R.raw.color_frag);
        SolidColor = glShaderId8;
        GlShaderId[] glShaderIdArr = {glShaderId, glShaderId2, glShaderId3, glShaderId4, glShaderId5, glShaderId6, glShaderId7, glShaderId8};
        $VALUES = glShaderIdArr;
        $ENTRIES = new asp(glShaderIdArr);
    }

    public GlShaderId(String str, int i, int i2) {
        this.resId = i2;
    }

    public static GlShaderId valueOf(String str) {
        return (GlShaderId) Enum.valueOf(GlShaderId.class, str);
    }

    public static GlShaderId[] values() {
        return (GlShaderId[]) $VALUES.clone();
    }

    public final int h() {
        return this.resId;
    }
}
