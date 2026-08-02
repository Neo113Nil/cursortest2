package defpackage;

import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public enum jj7 {
    d("NOT_STARTED", StatusKt.STATUS_NOT_STARTED, R.drawable.ic_timer),
    e("IN_PROGRESS", StatusKt.STATUS_IN_PROGRESS, R.drawable.ic_live_icon),
    f("FINISHED", StatusKt.STATUS_FINISHED, R.drawable.ic_full_time);

    public final int a;
    public final String b;
    public final int c;

    jj7(String str, String str2, int i) {
        this.a = r2;
        this.b = str2;
        this.c = i;
    }
}
