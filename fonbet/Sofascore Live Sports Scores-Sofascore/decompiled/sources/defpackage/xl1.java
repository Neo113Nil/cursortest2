package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class xl1 implements g49 {
    public final /* synthetic */ int a;
    public final ArrayList b;

    public xl1(int i) {
        this.a = i;
        switch (i) {
            case 3:
                this.b = new ArrayList();
                break;
            default:
                this.b = new ArrayList();
                break;
        }
    }

    @Override // defpackage.g49
    public Object a(Object obj) {
        switch (this.a) {
            case 0:
                l91 l91Var = ((wl1) obj).b;
                if (l91Var != null) {
                    return l91Var.name();
                }
                return null;
            default:
                FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel = (FantasyRoundPlayerUiModel) obj;
                return new Pair(Integer.valueOf(fantasyRoundPlayerUiModel.h), fantasyRoundPlayerUiModel.i);
        }
    }

    public void b(Path path) {
        ArrayList arrayList = this.b;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            k1k k1kVar = (k1k) arrayList.get(size);
            Matrix matrix = vik.a;
            if (k1kVar != null && !k1kVar.a) {
                vik.a(path, k1kVar.d.l() / 100.0f, k1kVar.e.l() / 100.0f, k1kVar.f.l() / 360.0f);
            }
        }
    }

    public synchronized ArrayList c(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            bvj bvjVar = (bvj) it.next();
            if ((bvjVar.a.isAssignableFrom(cls) && cls2.isAssignableFrom(bvjVar.b)) && !arrayList.contains(bvjVar.b)) {
                arrayList.add(bvjVar.b);
            }
        }
        return arrayList;
    }

    @Override // defpackage.g49
    public Iterator l() {
        int i = this.a;
        ArrayList arrayList = this.b;
        switch (i) {
        }
        return arrayList.iterator();
    }

    public /* synthetic */ xl1(ArrayList arrayList, int i) {
        this.a = i;
        this.b = arrayList;
    }
}
