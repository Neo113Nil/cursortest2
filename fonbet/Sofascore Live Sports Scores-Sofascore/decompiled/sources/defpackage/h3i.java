package defpackage;

import com.sofascore.results.R;
import com.sofascore.results.view.typeheader.TypeHeaderView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class h3i implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TypeHeaderView b;

    public /* synthetic */ h3i(TypeHeaderView typeHeaderView, int i) {
        this.a = i;
        this.b = typeHeaderView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        TypeHeaderView typeHeaderView = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                ta4 ta4Var = ta4.c;
                if (str.equals("time")) {
                    String string = typeHeaderView.getResources().getString(R.string.general_classification);
                    string.getClass();
                    return string;
                }
                if (str.equals("young")) {
                    String string2 = typeHeaderView.getResources().getString(R.string.young);
                    string2.getClass();
                    return string2;
                }
                if (str.equals("sprint")) {
                    String string3 = typeHeaderView.getResources().getString(R.string.sprint);
                    string3.getClass();
                    return string3;
                }
                if (!str.equals("climb")) {
                    ilg.c();
                    return null;
                }
                String string4 = typeHeaderView.getResources().getString(R.string.climb);
                string4.getClass();
                return string4;
            default:
                vt2 vt2Var = (vt2) obj;
                int i2 = TypeHeaderView.q;
                vt2Var.getClass();
                return Boolean.valueOf(Intrinsics.c(vt2Var.a, typeHeaderView.getSelectedItem()));
        }
    }
}
