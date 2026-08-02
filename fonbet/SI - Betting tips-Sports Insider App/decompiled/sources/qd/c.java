package qd;

import android.content.Context;
import android.os.CancellationSignal;
import com.sports.insider.R;
import eg.c0;
import eg.l;
import eg.m0;
import eg.z;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import me.y;
import mf.i;
import oi.w;
import t0.k;
import t0.p;
import t0.q;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c extends i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22099b;

    /* renamed from: c, reason: collision with root package name */
    public int f22100c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f22101d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(e eVar, Continuation continuation, int i5) {
        super(2, continuation);
        this.f22099b = i5;
        this.f22101d = eVar;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f22099b) {
            case 0:
                return new c(this.f22101d, continuation, 0);
            default:
                return new c(this.f22101d, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f22099b) {
        }
        return ((c) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        int i5 = this.f22099b;
        e eVar = this.f22101d;
        switch (i5) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                int i10 = this.f22100c;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                Context context = eVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(context, "context");
                Context context2 = eVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(context2, "requireContext(...)");
                ArrayList arrayList = new ArrayList();
                String serverClientId = eVar.getString(R.string.default_web_client_id);
                Intrinsics.checkNotNullExpressionValue(serverClientId, "getString(...)");
                Intrinsics.checkNotNullParameter(serverClientId, "serverClientId");
                x7.b credentialOption = new x7.b(serverClientId);
                Intrinsics.checkNotNullParameter(credentialOption, "credentialOption");
                arrayList.add(credentialOption);
                p request = new p(CollectionsKt.W(arrayList));
                this.f22100c = 1;
                l lVar = new l(1, lf.d.b(this));
                lVar.s();
                CancellationSignal cancellationSignal = new CancellationSignal();
                lVar.u(new t0.h(cancellationSignal, 1));
                w callback = new w(lVar, 4);
                o.a executor = new o.a(1);
                Intrinsics.checkNotNullParameter(context2, "context");
                Intrinsics.checkNotNullParameter(request, "request");
                Intrinsics.checkNotNullParameter(executor, "executor");
                Intrinsics.checkNotNullParameter(callback, "callback");
                k c2 = b2.e.c(new b2.e(context2, 6), request);
                if (c2 == null) {
                    callback.a(new u0.e(2, "getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
                } else {
                    c2.onGetCredential(context2, request, cancellationSignal, executor, callback);
                }
                Object r5 = lVar.r();
                if (r5 == aVar) {
                    Intrinsics.checkNotNullParameter(this, "frame");
                }
                return r5 == aVar ? aVar : r5;
            default:
                String str = eVar.f22106b;
                lf.a aVar2 = lf.a.f20034a;
                int i11 = this.f22100c;
                Continuation continuation = null;
                try {
                } catch (u0.d unused) {
                    eVar.H(str);
                } catch (u0.i ex) {
                    zc.d.b(4, "NoCredentialException", ex);
                    Intrinsics.checkNotNullParameter(ex, "ex");
                    eVar.H(str);
                } catch (u0.f ex2) {
                    zc.d.b(4, "GetCredentialException", ex2);
                    Intrinsics.checkNotNullParameter(ex2, "ex");
                    eVar.H(str);
                } catch (x7.d ex3) {
                    zc.d.b(4, "GoogleIdTokenParsingException", ex3);
                    Intrinsics.checkNotNullParameter(ex3, "ex");
                    eVar.H(str);
                } catch (Exception ex4) {
                    zc.d.b(4, "otherCredentialException", ex4);
                    Intrinsics.checkNotNullParameter(ex4, "ex");
                    eVar.H(str);
                }
                if (i11 == 0) {
                    h8.b.B(obj);
                    lg.e eVar2 = m0.f9201a;
                    lg.d dVar = lg.d.f20063c;
                    c cVar = new c(eVar, continuation, 0);
                    this.f22100c = 1;
                    obj = c0.A(dVar, cVar, this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        eVar.H((String) obj);
                        return Unit.f19194a;
                    }
                    h8.b.B(obj);
                }
                lg.e eVar3 = m0.f9201a;
                lg.d dVar2 = lg.d.f20063c;
                y yVar = new y(eVar, (q) obj, null, 17);
                this.f22100c = 2;
                obj = c0.A(dVar2, yVar, this);
                if (obj == aVar2) {
                    return aVar2;
                }
                eVar.H((String) obj);
                return Unit.f19194a;
        }
    }
}
