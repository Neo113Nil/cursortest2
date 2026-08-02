package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.results.R;
import com.sofascore.results.event.overs.EventOversFragment;
import com.sofascore.results.event.overs.dialog.CricketPlayByPlayDescriptionModal;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class s46 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ EventOversFragment b;

    public /* synthetic */ s46(EventOversFragment eventOversFragment, int i) {
        this.a = i;
        this.b = eventOversFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        EventOversFragment eventOversFragment = this.b;
        switch (i) {
            case 0:
                Context requireContext = eventOversFragment.requireContext();
                requireContext.getClass();
                break;
            case 1:
                Context requireContext2 = eventOversFragment.requireContext();
                requireContext2.getClass();
                break;
            case 2:
                LayoutInflater layoutInflater = eventOversFragment.getLayoutInflater();
                krk krkVar = eventOversFragment.l;
                krkVar.getClass();
                lqb a = lqb.a(layoutInflater.inflate(R.layout.main_section_left_with_icon, (ViewGroup) ((xq8) krkVar).c, false));
                ConstraintLayout constraintLayout = a.a;
                constraintLayout.getClass();
                aba.G(constraintLayout);
                a.c.setText(eventOversFragment.requireContext().getString(R.string.cricket_play_by_play));
                ImageView imageView = a.b;
                imageView.setVisibility(0);
                Integer valueOf = Integer.valueOf(R.drawable.ic_info);
                apf a2 = ajh.a(imageView.getContext());
                ht9 ht9Var = new ht9(imageView.getContext());
                ht9Var.c = valueOf;
                vt9.f(ht9Var, imageView);
                a2.a(ht9Var.a());
                imageView.setColorFilter(eventOversFragment.requireContext().getColor(R.color.n_lv_1));
                z8e.a0(imageView, 1000L, new s46(eventOversFragment, 4));
                break;
            case 3:
                eventOversFragment.n();
                break;
            default:
                Context requireContext3 = eventOversFragment.requireContext();
                requireContext3.getClass();
                CricketPlayByPlayDescriptionModal cricketPlayByPlayDescriptionModal = new CricketPlayByPlayDescriptionModal();
                if (requireContext3 instanceof csk) {
                    requireContext3 = ((csk) requireContext3).getBaseContext();
                }
                AppCompatActivity appCompatActivity = requireContext3 instanceof AppCompatActivity ? (AppCompatActivity) requireContext3 : null;
                if (appCompatActivity != null) {
                    wca.x(appCompatActivity.getLifecycle()).b(new r1(cricketPlayByPlayDescriptionModal, appCompatActivity, null, 3));
                }
                break;
        }
        return Unit.a;
    }
}
