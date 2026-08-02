package zQ;

import android.view.MotionEvent;
import android.view.View;
import ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v5.view.SearchFormV5View;

/* loaded from: classes4.dex */
public final /* synthetic */ class c implements View.OnTouchListener {
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean showLoader$lambda$18;
        showLoader$lambda$18 = SearchFormV5View.showLoader$lambda$18(view, motionEvent);
        return showLoader$lambda$18;
    }
}
