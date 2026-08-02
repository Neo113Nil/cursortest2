package defpackage;

import com.google.android.gms.cast.framework.zzr;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumSet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class n1p implements OnCompleteListener, zzr, icp {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n1p(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public /* synthetic */ void onComplete(Task task) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                l1p l1pVar = (l1p) obj;
                if (!task.isCanceled()) {
                    if (!task.isSuccessful()) {
                        Exception exception = task.getException();
                        if (exception == null) {
                            zzl.s();
                            break;
                        } else {
                            l1pVar.e(exception);
                            break;
                        }
                    } else {
                        l1pVar.d(task.getResult());
                        break;
                    }
                } else {
                    l1pVar.cancel(false);
                    break;
                }
            default:
                ((x7p) obj).a.m("launchApplication", task);
                break;
        }
    }

    @Override // defpackage.icp
    public Object zza() {
        Type type = (Type) this.b;
        if (!(type instanceof ParameterizedType)) {
            throw new o9p("Invalid EnumSet type: ".concat(String.valueOf(type)), 16);
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return EnumSet.noneOf((Class) type2);
        }
        throw new o9p("Invalid EnumSet type: ".concat(String.valueOf(type)), 16);
    }
}
