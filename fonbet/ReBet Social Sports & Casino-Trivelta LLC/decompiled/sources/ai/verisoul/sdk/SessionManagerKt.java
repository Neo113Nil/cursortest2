package ai.verisoul.sdk;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u001a\u0014\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0002¨\u0006\u0004"}, d2 = {"findVerisoulException", "Lai/verisoul/sdk/VerisoulException;", "throwable", "", "sdk_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SessionManagerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final VerisoulException findVerisoulException(Throwable th2) {
        while (th2 != null) {
            if (th2 instanceof VerisoulException) {
                return (VerisoulException) th2;
            }
            th2 = th2.getCause();
        }
        return null;
    }
}
