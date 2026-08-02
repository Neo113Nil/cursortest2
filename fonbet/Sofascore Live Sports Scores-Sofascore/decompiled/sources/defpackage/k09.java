package defpackage;

import android.text.TextUtils;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class k09 implements Continuation, k3f {
    public final /* synthetic */ String a;

    public /* synthetic */ k09(String str) {
        this.a = str;
    }

    @Override // defpackage.k3f
    public boolean test(Object obj) {
        yi2 yi2Var = (yi2) obj;
        String str = this.a;
        if (str.equals("ON_FOREGROUND") && yi2Var.k()) {
            return true;
        }
        for (i53 i53Var : yi2Var.n()) {
            if (i53Var.i().toString().equals(str) || i53Var.h().getName().equals(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        if (!task.isSuccessful()) {
            throw new ExecutionException(task.getException());
        }
        String str = (String) task.getResult();
        if (!TextUtils.isEmpty(str)) {
            String str2 = this.a;
            if (str.endsWith(str2)) {
                return str2;
            }
        }
        throw new ExecutionException(new IllegalArgumentException("Unexpected Error: FID NOT matching!"));
    }
}
