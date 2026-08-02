package eI;

import android.view.MotionEvent;
import android.view.View;
import ru.ozon.app.android.search.dialogsearchscreen.withTopFilters.DialogSearchTopFiltersFragment;
import ru.ozon.fintech.ui.toggleatom.ToggleAtomWrapperView;

/* loaded from: classes13.dex */
public final /* synthetic */ class e implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f62059a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f62060b;

    public /* synthetic */ e(Object obj, int i11) {
        this.f62059a = i11;
        this.f62060b = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z11;
        boolean _init_$lambda$2;
        switch (this.f62059a) {
            case 0:
                z11 = DialogSearchTopFiltersFragment.touchListener$lambda$1((DialogSearchTopFiltersFragment) this.f62060b, view, motionEvent);
                return z11;
            default:
                _init_$lambda$2 = ToggleAtomWrapperView._init_$lambda$2((ToggleAtomWrapperView) this.f62060b, view, motionEvent);
                return _init_$lambda$2;
        }
    }
}
