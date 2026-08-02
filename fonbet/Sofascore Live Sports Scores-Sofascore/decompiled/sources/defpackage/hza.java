package defpackage;

import android.content.Context;
import androidx.compose.runtime.e;
import com.sofascore.results.R;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class hza extends o8 {
    public final wrh d;
    public final e1d e;
    public final e1d f;
    public final znh g;
    public List h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hza(Context context) {
        super(context, null, 0);
        context.getClass();
        this.d = wrh.a(getRoot());
        this.e = e.f(rlh.b);
        this.f = e.f(sza.c);
        this.g = e.c(24);
        this.h = km5.a;
        setVisibility(8);
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.sofa_compose_view;
    }
}
