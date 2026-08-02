package defpackage;

import android.content.Context;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class oxe extends o8 {
    public final wrh d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oxe(Context context) {
        super(context, null, 0);
        context.getClass();
        this.d = wrh.a(getRoot());
        setVisibility(8);
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.sofa_compose_view;
    }
}
