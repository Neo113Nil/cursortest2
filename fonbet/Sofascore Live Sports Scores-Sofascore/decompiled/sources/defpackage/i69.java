package defpackage;

import android.content.Context;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.StatusTime;
import com.sofascore.model.mvvm.model.Time;
import com.sofascore.results.R;
import kotlin.text.c;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class i69 extends es1 {
    public final int q;
    public final String r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i69(Context context) {
        super(context);
        context.getClass();
        this.q = 5;
        this.r = Sports.HANDBALL;
    }

    @Override // defpackage.es1, defpackage.q7
    @NotNull
    public String getCurrentTimeText() {
        Time time;
        Event event = getEvent();
        if (event == null || (time = event.getTime()) == null) {
            return "";
        }
        if (!c.o(event.getStatusDescription(), "HT", true)) {
            StatusTime statusTime = time.getStatusTime();
            return statusTime != null ? z8e.H(statusTime, xe6.c().b) : pd0.t(event.getTime(), event.getStatus().getCode());
        }
        String string = getContext().getResources().getString(R.string.status_halftime_short);
        string.getClass();
        return string;
    }

    @Override // defpackage.es1, defpackage.q7
    public int getDefaultDiffValue() {
        return this.q;
    }

    @Override // defpackage.es1, defpackage.q7
    @NotNull
    public String getSport() {
        return this.r;
    }
}
