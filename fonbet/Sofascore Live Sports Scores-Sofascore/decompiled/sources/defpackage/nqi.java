package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class nqi extends View {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ pqi b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nqi(pqi pqiVar, Context context, ViewGroup viewGroup) {
        super(context);
        this.b = pqiVar;
        this.a = viewGroup;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        pqi pqiVar = this.b;
        ArrayList arrayList = pqiVar.b;
        Drawable background = this.a.getBackground();
        int color = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        if (pqiVar.e != color) {
            pqiVar.e = color;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((vef) arrayList.get(size)).b(color);
            }
        }
    }
}
