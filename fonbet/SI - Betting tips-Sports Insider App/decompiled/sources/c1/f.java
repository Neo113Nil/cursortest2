package c1;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.google.android.gms.internal.measurement.h4;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f extends mf.i implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3370b;

    /* renamed from: c, reason: collision with root package name */
    public int f3371c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3372d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj, Continuation continuation, int i5) {
        super(1, continuation);
        this.f3370b = i5;
        this.f3372d = obj;
    }

    @Override // mf.a
    public final Continuation create(Continuation continuation) {
        switch (this.f3370b) {
            case 0:
                return new f((e1.b) this.f3372d, continuation, 0);
            default:
                return new f((e0) this.f3372d, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.f3370b) {
        }
        return ((f) create(continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        Context context;
        String str;
        switch (this.f3370b) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                int i5 = this.f3371c;
                if (i5 == 0) {
                    h8.b.B(obj);
                    e1.b bVar = (e1.b) this.f3372d;
                    this.f3371c = 1;
                    SharedPreferences.Editor edit = ((SharedPreferences) bVar.f8464e.getValue()).edit();
                    LinkedHashSet linkedHashSet = bVar.f8465f;
                    if (linkedHashSet == null) {
                        edit.clear();
                    } else {
                        Iterator it = linkedHashSet.iterator();
                        while (it.hasNext()) {
                            edit.remove((String) it.next());
                        }
                    }
                    if (!edit.commit()) {
                        throw new IOException("Unable to delete migrated keys from SharedPreferences.");
                    }
                    if (((SharedPreferences) bVar.f8464e.getValue()).getAll().isEmpty() && (context = bVar.f8462c) != null && (str = bVar.f8463d) != null) {
                        if (Build.VERSION.SDK_INT >= 24) {
                            h4.d(context, str);
                        } else {
                            File file = new File(new File(context.getApplicationInfo().dataDir, "shared_prefs"), str.concat(".xml"));
                            File file2 = new File(file.getPath() + ".bak");
                            file.delete();
                            file2.delete();
                        }
                    }
                    if (linkedHashSet != null) {
                        linkedHashSet.clear();
                    }
                    if (Unit.f19194a == aVar) {
                        return aVar;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            default:
                lf.a aVar2 = lf.a.f20034a;
                int i10 = this.f3371c;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                e0 e0Var = (e0) this.f3372d;
                this.f3371c = 1;
                Object invoke = e0Var.invoke(this);
                return invoke == aVar2 ? aVar2 : invoke;
        }
    }
}
