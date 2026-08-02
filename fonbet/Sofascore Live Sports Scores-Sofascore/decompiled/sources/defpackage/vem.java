package defpackage;

import android.view.View;
import com.google.android.material.tabs.TabLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class vem implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zgm b;

    public /* synthetic */ vem(zgm zgmVar, int i) {
        this.a = i;
        this.b = zgmVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        zgm zgmVar = this.b;
        switch (i) {
            case 0:
                eum eumVar = zgmVar.c;
                TabLayout tabLayout = eumVar.c;
                tabLayout.getClass();
                tabLayout.setVisibility(0);
                View view = eumVar.d;
                view.getClass();
                view.setVisibility(0);
                if (!zgmVar.i) {
                    eumVar.b.setUserInputEnabled(true);
                }
                return Unit.a;
            case 1:
                eum eumVar2 = zgmVar.c;
                TabLayout tabLayout2 = eumVar2.c;
                tabLayout2.getClass();
                tabLayout2.setVisibility(4);
                View view2 = eumVar2.d;
                view2.getClass();
                view2.setVisibility(4);
                return Unit.a;
            default:
                ttk ttkVar = zgmVar.b;
                String str = zgmVar.h;
                if (str == null) {
                    str = "";
                }
                ttkVar.getClass();
                stk viewModelStore = ttkVar.getViewModelStore();
                qtk s = ufa.s(ttkVar);
                ly3 r = ufa.r(ttkVar);
                viewModelStore.getClass();
                s.getClass();
                r.getClass();
                return (yim) new g7h(viewModelStore, s, r).u(str, duf.a.getOrCreateKotlinClass(yim.class));
        }
    }
}
