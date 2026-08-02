package defpackage;

import android.view.View;
import com.sofascore.results.view.FeatureMatchCardView;
import com.sofascore.results.view.InformationView;
import com.sofascore.results.view.SuggestEditView;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class s61 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function0 b;

    public /* synthetic */ s61(int i, Function0 function0) {
        this.a = i;
        this.b = function0;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Function0 function0 = this.b;
        switch (i) {
            case 0:
                function0.invoke();
                break;
            case 1:
                function0.invoke();
                break;
            case 2:
                int i2 = FeatureMatchCardView.l;
                function0.invoke();
                break;
            case 3:
                int i3 = FeatureMatchCardView.l;
                function0.invoke();
                break;
            case 4:
                function0.invoke();
                break;
            case 5:
                int i4 = InformationView.e;
                function0.invoke();
                break;
            case 6:
                function0.invoke();
                break;
            case 7:
                if (function0 != null) {
                    function0.invoke();
                    break;
                }
                break;
            case 8:
                function0.invoke();
                break;
            case 9:
                int i5 = SuggestEditView.e;
                function0.invoke();
                break;
            case 10:
                function0.invoke();
                break;
            case 11:
                function0.invoke();
                break;
            default:
                function0.invoke();
                break;
        }
    }
}
