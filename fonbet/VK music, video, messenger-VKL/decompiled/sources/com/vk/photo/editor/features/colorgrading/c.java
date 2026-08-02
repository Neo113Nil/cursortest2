package com.vk.photo.editor.features.colorgrading;

import android.widget.TextView;
import com.vk.photo.editor.features.colorgrading.ColorGradingTool;
import com.vk.photo.editor.ivm.EditorMessage;
import com.vk.photo.editor.views.ToolButton;
import java.util.HashMap;
import xsna.lb80;
import xsna.v3p;

/* compiled from: ColorGradingTool.kt */
/* loaded from: classes4.dex */
public final class c implements lb80 {
    public final /* synthetic */ ColorGradingTool b;
    public final /* synthetic */ TextView c;
    public final /* synthetic */ HashMap<Integer, ToolButton> d;

    public c(ColorGradingTool colorGradingTool, TextView textView, HashMap<Integer, ToolButton> hashMap) {
        this.b = colorGradingTool;
        this.c = textView;
        this.d = hashMap;
    }

    @Override // xsna.lb80
    public final void b() {
        ColorGradingTool.a aVar;
        ColorGradingTool colorGradingTool = this.b;
        a H = ColorGradingTool.H(colorGradingTool.c.d());
        if (H == null || (aVar = colorGradingTool.g) == null) {
            return;
        }
        ToolButton toolButton = this.d.get(Integer.valueOf(aVar.a));
        if (toolButton != null) {
            toolButton.setIndicatorActive(aVar.c.invoke(H).booleanValue());
        }
    }

    @Override // xsna.lb80
    public final void c(float f) {
        ColorGradingTool.a aVar;
        ColorGradingTool colorGradingTool = this.b;
        v3p v3pVar = colorGradingTool.c;
        a H = ColorGradingTool.H(v3pVar.d());
        if (H == null || (aVar = colorGradingTool.g) == null) {
            return;
        }
        float floatValue = aVar.g.invoke(Float.valueOf(f)).floatValue();
        this.c.setText(String.valueOf(aVar.h.invoke(Float.valueOf(floatValue)).intValue()));
        v3pVar.d().a(new EditorMessage.i(aVar.e.invoke(H, Float.valueOf(floatValue)), EditorMessage.Source.UserInput, 4));
    }

    @Override // xsna.lb80
    public final void g() {
        ColorGradingTool.a aVar;
        ColorGradingTool colorGradingTool = this.b;
        a H = ColorGradingTool.H(colorGradingTool.c.d());
        if (H == null || (aVar = colorGradingTool.g) == null) {
            return;
        }
        ToolButton toolButton = this.d.get(Integer.valueOf(aVar.a));
        if (toolButton != null) {
            toolButton.setIndicatorActive(aVar.c.invoke(H).booleanValue());
        }
    }
}
