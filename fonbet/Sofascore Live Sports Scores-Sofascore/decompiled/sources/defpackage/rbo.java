package defpackage;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class rbo {
    public final ArrayList a = new ArrayList(0);
    public final TaskCompletionSource b = new TaskCompletionSource();
    public final TaskCompletionSource c = new TaskCompletionSource();
    public final Context d;
    public final b7p e;
    public final t6o f;
    public Integer g;

    public rbo(Context context, b7p b7pVar, t6o t6oVar) {
        this.d = context;
        this.e = b7pVar;
        this.f = t6oVar;
    }

    public static final ArrayList a(Task task) {
        List<Task> list = (List) task.getResult();
        ArrayList arrayList = new ArrayList(list.size());
        for (Task task2 : list) {
            if (task2.isSuccessful()) {
                arrayList.add(task2.getResult());
            }
        }
        return arrayList;
    }
}
