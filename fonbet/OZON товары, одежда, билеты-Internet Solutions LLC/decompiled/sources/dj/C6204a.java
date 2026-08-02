package dj;

import S0.InterfaceC3978p0;
import g.C6589a;
import g.InterfaceC6590b;
import kotlin.jvm.functions.Function1;

/* renamed from: dj.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final /* synthetic */ class C6204a implements InterfaceC6590b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f61635a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f61636b;

    public /* synthetic */ C6204a(Object obj, int i11) {
        this.f61635a = i11;
        this.f61636b = obj;
    }

    @Override // g.InterfaceC6590b
    public final void onActivityResult(Object obj) {
        switch (this.f61635a) {
            case 0:
                C6205b.a((C6205b) this.f61636b, (C6589a) obj);
                break;
            default:
                ((Function1) ((InterfaceC3978p0) this.f61636b).getValue()).invoke(obj);
                break;
        }
    }
}
