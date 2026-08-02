package defpackage;

import android.content.Context;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class r6j extends o8 {
    public final cva d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r6j(Context context) {
        super(context, null, 0);
        context.getClass();
        this.d = cva.a(getRoot());
        setVisibility(8);
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.league_details_view;
    }
}
