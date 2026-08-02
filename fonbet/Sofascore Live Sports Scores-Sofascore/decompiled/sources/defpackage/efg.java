package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class efg {
    public final Integer a;
    public ViewGroup b = null;
    public final Integer c;
    public final Integer d;
    public final Integer e;
    public final Integer f;
    public final Integer g;
    public final Integer h;
    public final Integer i;

    public efg(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8) {
        this.a = num;
        this.c = num2;
        this.d = num3;
        this.e = num4;
        this.f = num5;
        this.g = num6;
        this.h = num7;
        this.i = num8;
    }

    public final ViewGroup a(Context context) {
        context.getClass();
        ViewGroup viewGroup = this.b;
        if (viewGroup != null) {
            return viewGroup;
        }
        Object systemService = context.getSystemService("layout_inflater");
        systemService.getClass();
        View inflate = ((LayoutInflater) systemService).inflate(this.a.intValue(), (ViewGroup) null, false);
        inflate.getClass();
        ViewGroup viewGroup2 = (ViewGroup) inflate;
        this.b = viewGroup2;
        return viewGroup2;
    }
}
