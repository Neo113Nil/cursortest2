package defpackage;

import android.content.Context;
import androidx.window.extensions.embedding.ActivityEmbeddingComponent;
import androidx.window.extensions.embedding.SplitInfo;
import androidx.window.reflection.Consumer2;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class jk5 implements kk5 {
    public final ActivityEmbeddingComponent a;
    public final ak5 b;
    public final hpo c;
    public final Context d;
    public final zid e;

    public jk5(ActivityEmbeddingComponent activityEmbeddingComponent, ak5 ak5Var, hpo hpoVar, Context context) {
        context.getClass();
        this.a = activityEmbeddingComponent;
        this.b = ak5Var;
        this.c = hpoVar;
        this.d = context;
        this.e = new zid();
    }

    public static final Unit c(dad dadVar, jk5 jk5Var, List list) {
        ArrayList k = me4.k(list);
        for (Object obj : list) {
            if (obj instanceof SplitInfo) {
                k.add(obj);
            }
        }
        dadVar.y(jk5Var.b.b(k));
        return Unit.a;
    }

    public final void a(final dad dadVar) {
        this.a.setSplitInfoCallback(new Consumer2() { // from class: gk5
            @Override // androidx.window.reflection.Consumer2
            public final void accept(Object obj) {
                dad dadVar2 = dad.this;
                jk5 jk5Var = this;
                List list = (List) obj;
                list.getClass();
                dadVar2.y(jk5Var.b.b(list));
            }
        });
    }

    public final void b(dad dadVar) {
        int i = this.e.b;
        if (i != 1) {
            if (2 <= i && i < 5) {
                a(dadVar);
                return;
            } else {
                if (5 > i || i > Integer.MAX_VALUE) {
                    return;
                }
                a(dadVar);
                this.a.registerActivityStackCallback(new hg0(1), new we(dadVar, this.b));
                return;
            }
        }
        ActivityEmbeddingComponent activityEmbeddingComponent = this.a;
        KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(List.class);
        r82 r82Var = new r82(20, dadVar, this);
        orCreateKotlinClass.getClass();
        Class<?> cls = activityEmbeddingComponent.getClass();
        hpo hpoVar = this.c;
        Method method = cls.getMethod("setSplitInfoCallback", hpoVar.J());
        Object newProxyInstance = Proxy.newProxyInstance((ClassLoader) hpoVar.a, new Class[]{hpoVar.J()}, new zn3(orCreateKotlinClass, r82Var, 0));
        newProxyInstance.getClass();
        method.invoke(activityEmbeddingComponent, newProxyInstance);
    }

    public final void d(Set set) {
        set.getClass();
        Iterator it = set.iterator();
        while (it.hasNext()) {
        }
        this.a.setEmbeddingRules(this.b.c(this.d, set));
    }
}
