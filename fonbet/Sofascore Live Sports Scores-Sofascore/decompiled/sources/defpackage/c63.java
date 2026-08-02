package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.u;
import com.sofascore.model.mvvm.IRecent;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.results.R;
import com.sofascore.results.redesign.emptystateblocks.GraphicLarge;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class c63 extends y6 {
    public final k43 f;
    public final k43 g;
    public final int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c63(Context context, k43 k43Var, k43 k43Var2) {
        super(context, new jaf(1));
        context.getClass();
        this.f = k43Var;
        this.g = k43Var2;
        this.h = ao2.s(16, context);
        this.d.d = new kr1(this, 22);
    }

    @Override // defpackage.ysk
    public final boolean j(int i, Object obj) {
        return obj instanceof IRecent;
    }

    @Override // androidx.recyclerview.widget.l
    public final u onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        LayoutInflater layoutInflater = this.e;
        if (i == 1) {
            return new a63(this, z82.i(layoutInflater, viewGroup), 0);
        }
        if (i == 2) {
            return new a63(this, z82.i(layoutInflater, viewGroup), 1);
        }
        if (i == 3) {
            return new b63(dk2.d(layoutInflater, viewGroup), 0);
        }
        if (i != 4) {
            Context context = viewGroup.getContext();
            context.getClass();
            return new r71(context);
        }
        GraphicLarge graphicLarge = ddd.a(layoutInflater, viewGroup).b;
        r71 r71Var = new r71(3, graphicLarge);
        String string = r71Var.b.getString(R.string.empty_adjust_search_text);
        string.getClass();
        graphicLarge.setSubtitleResource(string);
        return r71Var;
    }

    @Override // defpackage.y6
    public final int q(Object obj) {
        if (Intrinsics.c(obj, 13)) {
            return 4;
        }
        if (obj instanceof String) {
            return 3;
        }
        if (obj instanceof Team) {
            return 2;
        }
        if (obj instanceof Player) {
            return 1;
        }
        s38.a().c(new IllegalArgumentException(bf3.k("Illegal item=", obj != null ? obj.getClass().getSimpleName() : null, " in ", c63.class.getSimpleName(), ".")));
        return -1;
    }
}
