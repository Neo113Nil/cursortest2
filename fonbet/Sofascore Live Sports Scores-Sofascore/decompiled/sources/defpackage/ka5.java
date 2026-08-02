package defpackage;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ka5 extends CharacterStyle implements UpdateAppearance {
    public final ja5 a;

    public ka5(ja5 ja5Var) {
        this.a = ja5Var;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            e28 e28Var = e28.a;
            ja5 ja5Var = this.a;
            if (Intrinsics.c(ja5Var, e28Var)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (!(ja5Var instanceof jii)) {
                zzl.b();
                return;
            }
            textPaint.setStyle(Paint.Style.STROKE);
            jii jiiVar = (jii) ja5Var;
            textPaint.setStrokeWidth(jiiVar.a);
            textPaint.setStrokeMiter(jiiVar.b);
            int i = jiiVar.d;
            textPaint.setStrokeJoin(i == 0 ? Paint.Join.MITER : i == 1 ? Paint.Join.ROUND : i == 2 ? Paint.Join.BEVEL : Paint.Join.MITER);
            int i2 = jiiVar.c;
            textPaint.setStrokeCap(i2 == 0 ? Paint.Cap.BUTT : i2 == 1 ? Paint.Cap.ROUND : i2 == 2 ? Paint.Cap.SQUARE : Paint.Cap.BUTT);
            c20 c20Var = jiiVar.e;
            textPaint.setPathEffect(c20Var != null ? c20Var.a : null);
        }
    }
}
