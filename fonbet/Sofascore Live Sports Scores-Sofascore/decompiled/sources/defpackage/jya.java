package defpackage;

import android.content.Context;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Round;
import com.sofascore.results.R;
import kotlin.text.Regex;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class jya extends kya {
    public final String b;
    public final int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jya(Round round, String str) {
        super(round);
        round.getClass();
        str.getClass();
        this.b = str;
        this.c = str.equals(Sports.AMERICAN_FOOTBALL) ? R.string.select_week : R.string.select_round;
    }

    @Override // defpackage.kya
    public final String a(Context context) {
        Regex regex = d7g.a;
        return d7g.b(context, (Round) this.a, false, this.b);
    }

    @Override // defpackage.kya
    public final int b() {
        return this.c;
    }
}
