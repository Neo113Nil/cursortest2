package androidx.credentials.playservices;

import io.sentry.android.core.w0;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import t0.i;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CredentialProviderPlayServicesImpl$onClearCredential$5$1$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ i $callback;
    final /* synthetic */ Exception $e;
    final /* synthetic */ Executor $executor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderPlayServicesImpl$onClearCredential$5$1$1(Exception exc, Executor executor, i iVar) {
        super(0);
        this.$e = exc;
        this.$executor = executor;
        this.$callback = iVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(i iVar, Exception exc) {
        iVar.a(new u0.a(exc.getMessage()));
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m9invoke();
        return Unit.f19194a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m9invoke() {
        w0.m("PlayServicesImpl", "During clear credential sign out failed with " + this.$e);
        this.$executor.execute(new e(this.$callback, this.$e, 1));
    }
}
