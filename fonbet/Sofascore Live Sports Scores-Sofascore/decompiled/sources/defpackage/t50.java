package defpackage;

import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class t50 implements z50, g49 {
    public final /* synthetic */ int a;
    public final ArrayList b;

    public t50() {
        this.a = 3;
        this.b = new ArrayList();
    }

    @Override // defpackage.g49
    public Object a(Object obj) {
        switch (this.a) {
            case 1:
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

    public synchronized m1g b(Class cls) {
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            n1g n1gVar = (n1g) this.b.get(i);
            if (n1gVar.a.isAssignableFrom(cls)) {
                return n1gVar.b;
            }
        }
        return null;
    }

    @Override // defpackage.z50
    public o41 g() {
        ArrayList arrayList = this.b;
        return ((nja) arrayList.get(0)).c() ? new y19(arrayList, 1) : new cbe(arrayList);
    }

    @Override // defpackage.z50
    public List h() {
        return this.b;
    }

    @Override // defpackage.z50
    public boolean isStatic() {
        ArrayList arrayList = this.b;
        return arrayList.size() == 1 && ((nja) arrayList.get(0)).c();
    }

    @Override // defpackage.g49
    public Iterator l() {
        int i = this.a;
        ArrayList arrayList = this.b;
        switch (i) {
        }
        return arrayList.iterator();
    }

    public /* synthetic */ t50(ArrayList arrayList, int i) {
        this.a = i;
        this.b = arrayList;
    }
}
