package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.sofascore.model.newNetwork.ESportsGamePlayerStatisticsRowData;
import com.sofascore.results.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class fz5 extends g7 {
    public final mqi l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fz5(Context context) {
        super(context);
        context.getClass();
        this.l = ypa.b(new c6(context, 19));
    }

    @Override // defpackage.g7
    public final void F(List list) {
        list.getClass();
        String string = this.b.getString(R.string.lineups);
        if (list.isEmpty()) {
            string = null;
        }
        super.F(CollectionsKt.w0(list, b.k(string)));
    }

    @Override // defpackage.ysk
    public final boolean j(int i, Object obj) {
        return false;
    }

    @Override // defpackage.g7
    public final f3 u(ArrayList arrayList) {
        ArrayList arrayList2 = this.i;
        arrayList2.getClass();
        return new th(arrayList2, arrayList, 9);
    }

    @Override // defpackage.g7
    public final int v(Object obj) {
        obj.getClass();
        if (obj instanceof String) {
            return 0;
        }
        if (obj instanceof ESportsGamePlayerStatisticsRowData) {
            return ((ESportsGamePlayerStatisticsRowData) obj).getEsportCategoryId();
        }
        ilg.c();
        return 0;
    }

    @Override // defpackage.g7
    public final p8 z(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        mqi mqiVar = this.l;
        if (i == 0) {
            return new wh(kqb.d((LayoutInflater) mqiVar.getValue(), viewGroup, false));
        }
        switch (i) {
            case 1570:
                return new mb4(tq5.a((LayoutInflater) mqiVar.getValue(), viewGroup));
            case 1571:
                return new rka(tq5.a((LayoutInflater) mqiVar.getValue(), viewGroup));
            case 1572:
                return new md2(tq5.a((LayoutInflater) mqiVar.getValue(), viewGroup));
            default:
                ilg.c();
                return null;
        }
    }
}
