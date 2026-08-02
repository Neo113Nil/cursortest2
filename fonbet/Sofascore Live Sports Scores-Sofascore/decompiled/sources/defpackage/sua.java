package defpackage;

import android.content.Context;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class sua extends o8 {
    public final mqi d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sua(Context context) {
        super(context, null, 0);
        context.getClass();
        this.d = ypa.b(new sr8(this, 20));
    }

    @Override // defpackage.o8
    public final int getLayoutId() {
        return R.layout.league_details_footer_row;
    }

    public final rua j() {
        return (rua) this.d.getValue();
    }
}
