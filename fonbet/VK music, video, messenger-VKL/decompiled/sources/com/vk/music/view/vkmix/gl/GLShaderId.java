package com.vk.music.view.vkmix.gl;

import com.vkontakte.android.R;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GLShaderId.kt */
/* loaded from: classes3.dex */
public final class GLShaderId {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GLShaderId[] $VALUES;
    public static final GLShaderId Aberration;
    public static final GLShaderId Blur;
    public static final GLShaderId Main;
    public static final GLShaderId Music;
    public static final GLShaderId Vertex;
    private final int resId;

    static {
        GLShaderId gLShaderId = new GLShaderId("Vertex", 0, R.raw.vert);
        Vertex = gLShaderId;
        GLShaderId gLShaderId2 = new GLShaderId("Main", 1, R.raw.main_frag);
        Main = gLShaderId2;
        GLShaderId gLShaderId3 = new GLShaderId("Music", 2, R.raw.music_mix_frag);
        Music = gLShaderId3;
        GLShaderId gLShaderId4 = new GLShaderId("Blur", 3, R.raw.blur_frag);
        Blur = gLShaderId4;
        GLShaderId gLShaderId5 = new GLShaderId("Aberration", 4, R.raw.aberration_frag);
        Aberration = gLShaderId5;
        GLShaderId[] gLShaderIdArr = {gLShaderId, gLShaderId2, gLShaderId3, gLShaderId4, gLShaderId5};
        $VALUES = gLShaderIdArr;
        $ENTRIES = new asp(gLShaderIdArr);
    }

    public GLShaderId(String str, int i, int i2) {
        this.resId = i2;
    }

    public static GLShaderId valueOf(String str) {
        return (GLShaderId) Enum.valueOf(GLShaderId.class, str);
    }

    public static GLShaderId[] values() {
        return (GLShaderId[]) $VALUES.clone();
    }

    public final int h() {
        return this.resId;
    }
}
