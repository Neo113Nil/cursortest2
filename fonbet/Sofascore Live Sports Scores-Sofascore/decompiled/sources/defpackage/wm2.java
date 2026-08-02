package defpackage;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class wm2 implements kli, Continuation {
    public final List a;

    public wm2(ArrayList arrayList) {
        this.a = Collections.unmodifiableList(arrayList);
    }

    @Override // defpackage.kli
    public List getCues(long j) {
        return j >= 0 ? this.a : Collections.EMPTY_LIST;
    }

    @Override // defpackage.kli
    public long getEventTime(int i) {
        qx9.r(i == 0);
        return 0L;
    }

    @Override // defpackage.kli
    public int getEventTimeCount() {
        return 1;
    }

    @Override // defpackage.kli
    public int getNextEventTimeIndex(long j) {
        return j < 0 ? 0 : -1;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public /* synthetic */ Object then(Task task) {
        return this.a;
    }

    public /* synthetic */ wm2(List list, boolean z) {
        this.a = list;
    }

    public wm2(List list) {
        list.getClass();
        this.a = list;
    }
}
