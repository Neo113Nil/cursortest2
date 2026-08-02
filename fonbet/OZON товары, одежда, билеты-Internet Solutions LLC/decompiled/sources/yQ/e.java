package yQ;

import android.view.MotionEvent;
import android.view.View;
import ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v4.view.SearchFormV4View;

/* loaded from: classes4.dex */
public final /* synthetic */ class e implements View.OnTouchListener {
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean showLoader$lambda$17;
        showLoader$lambda$17 = SearchFormV4View.showLoader$lambda$17(view, motionEvent);
        return showLoader$lambda$17;
    }
}
