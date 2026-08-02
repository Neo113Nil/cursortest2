package defpackage;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import androidx.compose.runtime.e;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class pah extends CharacterStyle implements UpdateAppearance {
    public final oah a;
    public final float b;
    public final e1d c = e.f(new njh(9205357640488583168L));
    public final ay4 d = goh.b(new e6g(this, 18));

    public pah(oah oahVar, float f) {
        this.a = oahVar;
        this.b = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        kik.Y(textPaint, this.b);
        textPaint.setShader((Shader) this.d.getValue());
    }
}
