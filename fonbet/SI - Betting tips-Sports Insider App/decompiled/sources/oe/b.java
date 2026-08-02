package oe;

import com.sports.insider.R;
import eg.z;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f21166b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f21167c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(g gVar, Continuation continuation, int i5) {
        super(2, continuation);
        this.f21166b = i5;
        this.f21167c = gVar;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f21166b) {
            case 0:
                return new b(this.f21167c, continuation, 0);
            case 1:
                return new b(this.f21167c, continuation, 1);
            case 2:
                return new b(this.f21167c, continuation, 2);
            case 3:
                return new b(this.f21167c, continuation, 3);
            case 4:
                return new b(this.f21167c, continuation, 4);
            case 5:
                return new b(this.f21167c, continuation, 5);
            case 6:
                return new b(this.f21167c, continuation, 6);
            case 7:
                return new b(this.f21167c, continuation, 7);
            case 8:
                return new b(this.f21167c, continuation, 8);
            case 9:
                return new b(this.f21167c, continuation, 9);
            default:
                return new b(this.f21167c, continuation, 10);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f21166b) {
        }
        return ((b) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        int i5 = this.f21166b;
        g gVar = this.f21167c;
        switch (i5) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                h8.b.B(obj);
                try {
                    ((zc.k) gVar.f21183b.getValue()).getClass();
                    return zc.k.c();
                } catch (Exception unused) {
                    return null;
                }
            case 1:
                lf.a aVar2 = lf.a.f20034a;
                h8.b.B(obj);
                try {
                    ((zc.k) gVar.f21183b.getValue()).getClass();
                    return zc.k.f(R.string.check_dot);
                } catch (Exception unused2) {
                    return "Test …";
                }
            case 2:
                lf.a aVar3 = lf.a.f20034a;
                h8.b.B(obj);
                try {
                    ((zc.k) gVar.f21183b.getValue()).getClass();
                    return zc.k.f(R.string.check_state_server);
                } catch (Exception unused3) {
                    return "Check server availability";
                }
            case 3:
                lf.a aVar4 = lf.a.f20034a;
                h8.b.B(obj);
                try {
                    ((zc.k) gVar.f21183b.getValue()).getClass();
                    return zc.k.f(R.string.check_update);
                } catch (Exception unused4) {
                    return "Check the update";
                }
            case 4:
                lf.a aVar5 = lf.a.f20034a;
                h8.b.B(obj);
                try {
                    ((zc.k) gVar.f21183b.getValue()).getClass();
                    return zc.k.f(R.string.no_ethernet_btn_text);
                } catch (Exception unused5) {
                    return "Retry";
                }
            case 5:
                lf.a aVar6 = lf.a.f20034a;
                h8.b.B(obj);
                try {
                    ((zc.k) gVar.f21183b.getValue()).getClass();
                    return zc.k.f(R.string.no_ethernet_text);
                } catch (Exception unused6) {
                    return "The application requires an Internet connection";
                }
            case 6:
                lf.a aVar7 = lf.a.f20034a;
                h8.b.B(obj);
                try {
                    ((zc.k) gVar.f21183b.getValue()).getClass();
                    return zc.k.f(R.string.state_no_ethernet);
                } catch (Exception unused7) {
                    return "There is no internet connection";
                }
            case 7:
                lf.a aVar8 = lf.a.f20034a;
                h8.b.B(obj);
                try {
                    ((zc.k) gVar.f21183b.getValue()).getClass();
                    return zc.k.f(R.string.state_no_server);
                } catch (Exception unused8) {
                    return "The server is temporarily unavailable";
                }
            case 8:
                lf.a aVar9 = lf.a.f20034a;
                h8.b.B(obj);
                try {
                    ((zc.k) gVar.f21183b.getValue()).getClass();
                    return zc.k.f(R.string.state_on_server);
                } catch (Exception unused9) {
                    return "The server is available";
                }
            case 9:
                lf.a aVar10 = lf.a.f20034a;
                h8.b.B(obj);
                try {
                    ((zc.k) gVar.f21183b.getValue()).getClass();
                    return zc.k.f(R.string.state_ssl_error);
                } catch (Exception unused10) {
                    return "SSL connection error";
                }
            default:
                lf.a aVar11 = lf.a.f20034a;
                h8.b.B(obj);
                try {
                    ((zc.k) gVar.f21183b.getValue()).getClass();
                    return zc.k.f(R.string.technical_support);
                } catch (Exception unused11) {
                    return "Technical support";
                }
        }
    }
}
