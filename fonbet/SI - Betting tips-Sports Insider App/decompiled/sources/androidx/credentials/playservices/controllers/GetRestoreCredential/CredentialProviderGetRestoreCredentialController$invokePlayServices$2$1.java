package androidx.credentials.playservices.controllers.GetRestoreCredential;

import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import t0.i;
import u0.f;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CredentialProviderGetRestoreCredentialController$invokePlayServices$2$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ i $callback;
    final /* synthetic */ Executor $executor;
    final /* synthetic */ Ref.ObjectRef<f> $getException;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderGetRestoreCredentialController$invokePlayServices$2$1(Executor executor, i iVar, Ref.ObjectRef<f> objectRef) {
        super(0);
        this.$executor = executor;
        this.$callback = iVar;
        this.$getException = objectRef;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(i iVar, Ref.ObjectRef objectRef) {
        iVar.a(objectRef.element);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m58invoke();
        return Unit.f19194a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m58invoke() {
        this.$executor.execute(new d(4, this.$callback, this.$getException));
    }
}
