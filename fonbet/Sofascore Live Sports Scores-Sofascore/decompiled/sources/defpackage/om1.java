package defpackage;

import android.content.Context;
import androidx.compose.runtime.e;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class om1 extends o8 {
    public final e1d d;
    public Event e;
    public final wrh f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public om1(Context context) {
        super(context, null, 0);
        context.getClass();
        setVisibility(8);
        this.d = e.f(null);
        this.f = wrh.a(getRoot());
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.sofa_compose_view;
    }
}
