package e;

import android.content.Intent;
import android.content.IntentSender;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8412a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8413b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f8414c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f8415d;

    public /* synthetic */ h(int i5, int i10, Object obj, Object obj2) {
        this.f8412a = i10;
        this.f8413b = obj;
        this.f8414c = i5;
        this.f8415d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8412a) {
            case 0:
                i iVar = (i) this.f8413b;
                Object obj = ((c4.k) this.f8415d).f3593a;
                String str = (String) iVar.f9640a.get(Integer.valueOf(this.f8414c));
                if (str != null) {
                    g.d dVar = (g.d) iVar.f9644e.get(str);
                    if ((dVar != null ? dVar.f9632a : null) != null) {
                        g.a aVar = dVar.f9632a;
                        Intrinsics.checkNotNull(aVar, "null cannot be cast to non-null type androidx.activity.result.ActivityResultCallback<O of androidx.activity.result.ActivityResultRegistry.dispatchResult>");
                        if (iVar.f9643d.remove(str)) {
                            aVar.a(obj);
                            break;
                        }
                    } else {
                        iVar.f9646g.remove(str);
                        iVar.f9645f.put(str, obj);
                        break;
                    }
                }
                break;
            case 1:
                ((i) this.f8413b).a(this.f8414c, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) this.f8415d));
                break;
            default:
                ((i2.b) this.f8413b).f10865b.k(this.f8414c, this.f8415d);
                break;
        }
    }
}
