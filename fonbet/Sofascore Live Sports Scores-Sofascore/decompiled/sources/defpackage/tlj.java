package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.sofascore.model.Sports;
import com.sofascore.results.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class tlj extends g7 {
    public final String l;
    public final boolean m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tlj(Context context) {
        super(context);
        context.getClass();
        this.l = Sports.FOOTBALL;
        this.m = true;
    }

    @Override // defpackage.ysk
    public final boolean j(int i, Object obj) {
        if (i == 1 || i == 2 || i == 3) {
            return this.m;
        }
        return false;
    }

    @Override // defpackage.g7
    public final f3 u(ArrayList arrayList) {
        return null;
    }

    @Override // defpackage.g7
    public final int v(Object obj) {
        obj.getClass();
        if (obj instanceof fmj) {
            return 1;
        }
        if (obj instanceof noj) {
            return 2;
        }
        if (obj instanceof loj) {
            return 3;
        }
        throw new IllegalAccessException();
    }

    @Override // defpackage.g7
    public final p8 z(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        String str = this.l;
        Context context = this.b;
        if (i == 1) {
            View inflate = LayoutInflater.from(context).inflate(R.layout.image_labels_rating_layout, viewGroup, false);
            inflate.getClass();
            return new gai(inflate, str);
        }
        if (i == 2) {
            View inflate2 = LayoutInflater.from(context).inflate(R.layout.image_labels_rating_layout, viewGroup, false);
            inflate2.getClass();
            return new soj(inflate2, wyh.e(str));
        }
        if (i != 3) {
            ilg.c();
            return null;
        }
        View inflate3 = LayoutInflater.from(context).inflate(R.layout.image_labels_rating_layout, viewGroup, false);
        inflate3.getClass();
        return new j8i(inflate3);
    }
}
