package androidx.fragment.app;

import android.util.Log;
import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class o extends Lambda implements Function0 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p f2014e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f2015f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f2016g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f2017h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, ViewGroup viewGroup, Object obj, Ref.ObjectRef objectRef) {
        super(0);
        this.f2014e = pVar;
        this.f2015f = viewGroup;
        this.f2016g = obj;
        this.f2017h = objectRef;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [T, androidx.fragment.app.n] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if (j1.L(2)) {
            Log.v("FragmentManager", "Attempting to create TransitionSeekController");
        }
        p pVar = this.f2014e;
        a2 a2Var = pVar.f2023f;
        ViewGroup viewGroup = this.f2015f;
        Object obj = this.f2016g;
        Object i5 = a2Var.i(viewGroup, obj);
        pVar.q = i5;
        if (i5 == null) {
            if (j1.L(2)) {
                Log.v("FragmentManager", "TransitionSeekController was not created.");
            }
            pVar.f2033r = true;
        } else {
            this.f2017h.element = new n(pVar, obj, viewGroup);
            if (j1.L(2)) {
                Log.v("FragmentManager", "Started executing operations from " + pVar.f2021d + " to " + pVar.f2022e);
            }
        }
        return Unit.f19194a;
    }
}
