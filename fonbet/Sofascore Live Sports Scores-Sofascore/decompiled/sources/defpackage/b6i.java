package defpackage;

import com.sofascore.model.mvvm.model.ServerType;
import java.util.List;
import kotlin.collections.a;
import kotlin.collections.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public enum b6i {
    c("Practice", b.j(ServerType.PRACTICE, ServerType.PRACTICE_PART)),
    d("Qualifying", b.j(ServerType.QUALIFYING, ServerType.QUALIFYING_PART)),
    e("Race", a.c(ServerType.RACE)),
    f("Season", a.c(ServerType.SEASON));

    public final int a;
    public final List b;

    b6i(String str, List list) {
        this.a = r2;
        this.b = list;
    }
}
