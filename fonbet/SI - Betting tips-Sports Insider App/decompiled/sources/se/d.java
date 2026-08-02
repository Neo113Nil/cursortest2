package se;

import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import com.google.android.gms.internal.measurement.y3;
import com.sports.insider.R;
import com.sports.insider.ui.subs.ListSubsFragment;
import eg.c0;
import eg.m0;
import eg.z;
import gf.t;
import jg.q;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import me.y;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f23523b;

    /* renamed from: c, reason: collision with root package name */
    public int f23524c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ListSubsFragment f23525d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(ListSubsFragment listSubsFragment, Continuation continuation, int i5) {
        super(2, continuation);
        this.f23523b = i5;
        this.f23525d = listSubsFragment;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f23523b) {
            case 0:
                return new d(this.f23525d, continuation, 0);
            case 1:
                return new d(this.f23525d, continuation, 1);
            case 2:
                return new d(this.f23525d, continuation, 2);
            case 3:
                return new d(this.f23525d, continuation, 3);
            case 4:
                return new d(this.f23525d, continuation, 4);
            case 5:
                return new d(this.f23525d, continuation, 5);
            case 6:
                return new d(this.f23525d, continuation, 6);
            default:
                return new d(this.f23525d, continuation, 7);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f23523b) {
        }
        return ((d) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        int i5 = this.f23523b;
        ListSubsFragment listSubsFragment = this.f23525d;
        Continuation continuation = null;
        switch (i5) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                int i10 = this.f23524c;
                if (i10 == 0) {
                    h8.b.B(obj);
                    p G = listSubsFragment.G();
                    this.f23524c = 1;
                    obj = G.A.f25113d.j(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        return Unit.f19194a;
                    }
                    h8.b.B(obj);
                }
                lg.e eVar = m0.f9201a;
                fg.e eVar2 = q.f18523a;
                c cVar = new c(listSubsFragment, (CharSequence) obj, null, 0);
                this.f23524c = 2;
                if (c0.A(eVar2, cVar, this) == aVar) {
                    return aVar;
                }
                return Unit.f19194a;
            case 1:
                lf.a aVar2 = lf.a.f20034a;
                int i11 = this.f23524c;
                if (i11 == 0) {
                    h8.b.B(obj);
                    p G2 = listSubsFragment.G();
                    this.f23524c = 1;
                    obj = G2.A.f25113d.k(this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        return Unit.f19194a;
                    }
                    h8.b.B(obj);
                }
                lg.e eVar3 = m0.f9201a;
                fg.e eVar4 = q.f18523a;
                c cVar2 = new c(listSubsFragment, (CharSequence) obj, null, 1);
                this.f23524c = 2;
                if (c0.A(eVar4, cVar2, this) == aVar2) {
                    return aVar2;
                }
                return Unit.f19194a;
            case 2:
                lf.a aVar3 = lf.a.f20034a;
                int i12 = this.f23524c;
                if (i12 == 0) {
                    h8.b.B(obj);
                    p G3 = listSubsFragment.G();
                    this.f23524c = 1;
                    obj = G3.A.f25113d.n(this);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        return Unit.f19194a;
                    }
                    h8.b.B(obj);
                }
                lg.e eVar5 = m0.f9201a;
                fg.e eVar6 = q.f18523a;
                c cVar3 = new c(listSubsFragment, (CharSequence) obj, null, 2);
                this.f23524c = 2;
                if (c0.A(eVar6, cVar3, this) == aVar3) {
                    return aVar3;
                }
                return Unit.f19194a;
            case 3:
                lf.a aVar4 = lf.a.f20034a;
                int i13 = this.f23524c;
                if (i13 == 0) {
                    h8.b.B(obj);
                    p G4 = listSubsFragment.G();
                    this.f23524c = 1;
                    obj = G4.A.f25113d.l(this);
                    if (obj == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i13 != 1) {
                        if (i13 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        return Unit.f19194a;
                    }
                    h8.b.B(obj);
                }
                lg.e eVar7 = m0.f9201a;
                fg.e eVar8 = q.f18523a;
                c cVar4 = new c(listSubsFragment, (CharSequence) obj, null, 3);
                this.f23524c = 2;
                if (c0.A(eVar8, cVar4, this) == aVar4) {
                    return aVar4;
                }
                return Unit.f19194a;
            case 4:
                lf.a aVar5 = lf.a.f20034a;
                int i14 = this.f23524c;
                if (i14 == 0) {
                    h8.b.B(obj);
                    p G5 = listSubsFragment.G();
                    this.f23524c = 1;
                    obj = G5.A.f25113d.m(this);
                    if (obj == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i14 != 1) {
                        if (i14 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        return Unit.f19194a;
                    }
                    h8.b.B(obj);
                }
                lg.e eVar9 = m0.f9201a;
                fg.e eVar10 = q.f18523a;
                c cVar5 = new c(listSubsFragment, (CharSequence) obj, null, 4);
                this.f23524c = 2;
                if (c0.A(eVar10, cVar5, this) == aVar5) {
                    return aVar5;
                }
                return Unit.f19194a;
            case 5:
                lf.a aVar6 = lf.a.f20034a;
                int i15 = this.f23524c;
                if (i15 == 0) {
                    h8.b.B(obj);
                    listSubsFragment.G().A.getClass();
                    l1.a aVar7 = new l1.a(22);
                    ((zc.k) ((t) aVar7.f19314b).getValue()).getClass();
                    String h10 = zc.k.h(R.string.lk_store_desc);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(h10);
                    spannableStringBuilder.setSpan((hd.f) aVar7.f19315c, 0, h10.length(), 33);
                    SpannableString valueOf = SpannableString.valueOf(spannableStringBuilder);
                    lg.e eVar11 = m0.f9201a;
                    fg.e eVar12 = q.f18523a;
                    c cVar6 = new c(listSubsFragment, valueOf, null, 5);
                    this.f23524c = 1;
                    if (c0.A(eVar12, cVar6, this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 6:
                lf.a aVar8 = lf.a.f20034a;
                int i16 = this.f23524c;
                if (i16 == 0) {
                    h8.b.B(obj);
                    MovementMethod linkMovementMethod = LinkMovementMethod.getInstance();
                    lg.e eVar13 = m0.f9201a;
                    fg.e eVar14 = q.f18523a;
                    y yVar = new y(listSubsFragment, linkMovementMethod, continuation, 24);
                    this.f23524c = 1;
                    if (c0.A(eVar14, yVar, this) == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            default:
                lf.a aVar9 = lf.a.f20034a;
                int i17 = this.f23524c;
                if (i17 != 0) {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                Typeface a7 = ((za.i) ((nc.g) y3.m(nc.g.class, null, 6))).a();
                Typeface b10 = ((za.i) ((nc.g) y3.m(nc.g.class, null, 6))).b();
                lg.e eVar15 = m0.f9201a;
                fg.e eVar16 = q.f18523a;
                ge.f fVar = new ge.f(a7, b10, this.f23525d, (Continuation) null, 15);
                this.f23524c = 1;
                Object A = c0.A(eVar16, fVar, this);
                return A == aVar9 ? aVar9 : A;
        }
    }
}
