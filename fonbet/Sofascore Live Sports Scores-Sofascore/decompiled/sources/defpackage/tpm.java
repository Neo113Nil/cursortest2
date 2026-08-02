package defpackage;

import com.blaze.blazesdk.data_source.BlazeDataSourceType;
import com.blaze.blazesdk.shared.results.BlazeResult;
import com.blaze.blazesdk.shared.results.u0;
import com.blaze.blazesdk.shared.results.v0;
import com.blaze.blazesdk.shared.results.w0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final /* synthetic */ class tpm implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ BlazeDataSourceType b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ tpm(BlazeDataSourceType blazeDataSourceType, Function1 function1, int i) {
        this.a = i;
        this.b = blazeDataSourceType;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object success;
        BlazeResult success2;
        Object success3;
        Object success4;
        Object success5;
        Object success6;
        int i = this.a;
        Function1 function1 = this.c;
        BlazeDataSourceType blazeDataSourceType = this.b;
        BlazeResult blazeResult = (BlazeResult) obj;
        switch (i) {
            case 0:
                if (!(blazeResult instanceof BlazeResult.Error)) {
                    if (!(blazeResult instanceof BlazeResult.Success)) {
                        zzl.b();
                        break;
                    } else {
                        success = new BlazeResult.Success(Unit.a);
                    }
                } else {
                    j1m j1mVar = j1m.a;
                    u0 u0Var = new u0();
                    BlazeResult.Error error = (BlazeResult.Error) blazeResult;
                    u0Var.f = error.getCause();
                    u0Var.g = fn0.p("dataSource", blazeDataSourceType.getStringRepresentation$blazesdk_release());
                    u0Var.b(error.getMessage());
                    j1m.a(u0Var);
                    success = u0Var.d();
                }
                function1.invoke(success);
                break;
            case 1:
                if (!(blazeResult instanceof BlazeResult.Error)) {
                    if (!(blazeResult instanceof BlazeResult.Success)) {
                        zzl.b();
                        break;
                    } else {
                        success2 = new BlazeResult.Success(Unit.a);
                    }
                } else {
                    j1m j1mVar2 = j1m.a;
                    u0 u0Var2 = new u0();
                    BlazeResult.Error error2 = (BlazeResult.Error) blazeResult;
                    u0Var2.f = error2.getCause();
                    u0Var2.g = fn0.p("dataSource", blazeDataSourceType.getStringRepresentation$blazesdk_release());
                    u0Var2.b(error2.getMessage());
                    j1m.a(u0Var2);
                    success2 = u0Var2.d();
                }
                evl.l(success2, function1);
                break;
            case 2:
                if (!(blazeResult instanceof BlazeResult.Error)) {
                    if (!(blazeResult instanceof BlazeResult.Success)) {
                        zzl.b();
                        break;
                    } else {
                        success3 = new BlazeResult.Success(Unit.a);
                    }
                } else {
                    j1m j1mVar3 = j1m.a;
                    v0 v0Var = new v0();
                    BlazeResult.Error error3 = (BlazeResult.Error) blazeResult;
                    v0Var.f = error3.getCause();
                    v0Var.g = fn0.p("dataSource", blazeDataSourceType.getStringRepresentation$blazesdk_release());
                    v0Var.b(error3.getMessage());
                    j1m.a(v0Var);
                    success3 = v0Var.d();
                }
                function1.invoke(success3);
                break;
            case 3:
                if (!(blazeResult instanceof BlazeResult.Error)) {
                    if (!(blazeResult instanceof BlazeResult.Success)) {
                        zzl.b();
                        break;
                    } else {
                        success4 = new BlazeResult.Success(Unit.a);
                    }
                } else {
                    j1m j1mVar4 = j1m.a;
                    v0 v0Var2 = new v0();
                    BlazeResult.Error error4 = (BlazeResult.Error) blazeResult;
                    v0Var2.f = error4.getCause();
                    v0Var2.g = fn0.p("dataSource", blazeDataSourceType.getStringRepresentation$blazesdk_release());
                    v0Var2.b(error4.getMessage());
                    j1m.a(v0Var2);
                    success4 = v0Var2.d();
                }
                function1.invoke(success4);
                break;
            case 4:
                if (!(blazeResult instanceof BlazeResult.Error)) {
                    if (!(blazeResult instanceof BlazeResult.Success)) {
                        zzl.b();
                        break;
                    } else {
                        success5 = new BlazeResult.Success(Unit.a);
                    }
                } else {
                    j1m j1mVar5 = j1m.a;
                    w0 w0Var = new w0();
                    BlazeResult.Error error5 = (BlazeResult.Error) blazeResult;
                    w0Var.f = error5.getCause();
                    w0Var.g = fn0.p("dataSource", blazeDataSourceType.getStringRepresentation$blazesdk_release());
                    w0Var.b(error5.getMessage());
                    j1m.a(w0Var);
                    success5 = w0Var.d();
                }
                function1.invoke(success5);
                break;
            default:
                if (!(blazeResult instanceof BlazeResult.Error)) {
                    if (!(blazeResult instanceof BlazeResult.Success)) {
                        zzl.b();
                        break;
                    } else {
                        success6 = new BlazeResult.Success(Unit.a);
                    }
                } else {
                    j1m j1mVar6 = j1m.a;
                    w0 w0Var2 = new w0();
                    BlazeResult.Error error6 = (BlazeResult.Error) blazeResult;
                    w0Var2.f = error6.getCause();
                    w0Var2.g = fn0.p("dataSource", blazeDataSourceType.getStringRepresentation$blazesdk_release());
                    w0Var2.b(error6.getMessage());
                    j1m.a(w0Var2);
                    success6 = w0Var2.d();
                }
                function1.invoke(success6);
                break;
        }
        return null;
    }
}
