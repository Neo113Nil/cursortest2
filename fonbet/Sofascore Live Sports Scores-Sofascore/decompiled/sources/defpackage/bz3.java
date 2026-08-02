package defpackage;

import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class bz3 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Executor b;
    public final /* synthetic */ oy3 c;

    public /* synthetic */ bz3(Executor executor, oy3 oy3Var, int i) {
        this.a = i;
        this.b = executor;
        this.c = oy3Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit onClearCredential$lambda$4$0;
        Unit runFallbackClearCredFlow$lambda$0$0;
        Unit onClearCredential$lambda$1$0;
        switch (this.a) {
            case 0:
                onClearCredential$lambda$4$0 = CredentialProviderPlayServicesImpl.onClearCredential$lambda$4$0(this.b, this.c);
                return onClearCredential$lambda$4$0;
            case 1:
                runFallbackClearCredFlow$lambda$0$0 = CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$0$0(this.b, this.c);
                return runFallbackClearCredFlow$lambda$0$0;
            default:
                onClearCredential$lambda$1$0 = CredentialProviderPlayServicesImpl.onClearCredential$lambda$1$0(this.b, this.c);
                return onClearCredential$lambda$1$0;
        }
    }
}
