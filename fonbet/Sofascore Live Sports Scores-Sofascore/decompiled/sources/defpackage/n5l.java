package defpackage;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.sofascore.results.weeklyChallenge.predictions.WeeklyPredictionsFragment;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class n5l extends s8 {
    @Override // defpackage.d41
    public final Fragment C(Enum r3) {
        m5l m5lVar = (m5l) r3;
        m5lVar.getClass();
        WeeklyPredictionsFragment weeklyPredictionsFragment = new WeeklyPredictionsFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("PREDICTION_TYPE", m5lVar);
        bundle.putSerializable("PAGING_TYPE", m5lVar == m5l.c ? t6e.a : t6e.b);
        weeklyPredictionsFragment.setArguments(bundle);
        return weeklyPredictionsFragment;
    }

    @Override // defpackage.s8
    public final String H(Enum r1) {
        m5l m5lVar = (m5l) r1;
        m5lVar.getClass();
        String string = y().getString(m5lVar.a);
        string.getClass();
        return string;
    }
}
