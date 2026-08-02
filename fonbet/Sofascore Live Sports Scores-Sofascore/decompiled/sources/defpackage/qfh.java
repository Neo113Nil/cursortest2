package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.u;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class qfh extends g7 {
    public final g6b l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qfh(Context context, g6b g6bVar) {
        super(context);
        context.getClass();
        g6bVar.getClass();
        this.l = g6bVar;
    }

    @Override // defpackage.ysk
    public final boolean j(int i, Object obj) {
        return true;
    }

    @Override // androidx.recyclerview.widget.l
    public final void onViewRecycled(u uVar) {
        p8 p8Var = (p8) uVar;
        p8Var.getClass();
        super.onViewRecycled(p8Var);
        if (p8Var instanceof pfh) {
            pfh pfhVar = (pfh) p8Var;
            pfhVar.c.b.b();
            pfhVar.d = null;
        }
    }

    @Override // defpackage.g7
    public final f3 u(ArrayList arrayList) {
        return null;
    }

    @Override // defpackage.g7
    public final int v(Object obj) {
        ((String) obj).getClass();
        return 1;
    }

    @Override // defpackage.g7
    public final p8 z(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        return new pfh(this, v4c.a(LayoutInflater.from(this.b), viewGroup));
    }
}
