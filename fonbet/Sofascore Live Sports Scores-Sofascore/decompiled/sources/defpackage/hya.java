package defpackage;

import android.content.Context;
import com.sofascore.model.mvvm.model.Venue;
import com.sofascore.results.R;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class hya extends kya {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hya(Venue venue) {
        super(venue);
        venue.getClass();
    }

    @Override // defpackage.kya
    public final String a(Context context) {
        Venue venue = (Venue) this.a;
        String name = venue.getName();
        if (name == null) {
            name = venue.getStadium().getName();
        }
        if (!c.v(name, "Court ", false)) {
            return name;
        }
        String string = context.getString(R.string.tennis_court_number, StringsKt.V(name, "Court "));
        string.getClass();
        return string;
    }

    @Override // defpackage.kya
    public final int b() {
        return R.string.select_tennis_court;
    }
}
