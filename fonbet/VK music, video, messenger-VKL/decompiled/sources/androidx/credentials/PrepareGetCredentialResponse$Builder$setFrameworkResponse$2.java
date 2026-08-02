package androidx.credentials;

import androidx.credentials.PrepareGetCredentialResponse;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.gzs;

/* compiled from: PrepareGetCredentialResponse.kt */
/* loaded from: classes12.dex */
public /* synthetic */ class PrepareGetCredentialResponse$Builder$setFrameworkResponse$2 extends FunctionReferenceImpl implements gzs<Boolean> {
    public PrepareGetCredentialResponse$Builder$setFrameworkResponse$2(Object obj) {
        super(0, obj, PrepareGetCredentialResponse.Builder.class, "hasAuthenticationResults", "hasAuthenticationResults()Z", 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // xsna.gzs
    public final Boolean invoke() {
        boolean hasAuthenticationResults;
        hasAuthenticationResults = ((PrepareGetCredentialResponse.Builder) this.receiver).hasAuthenticationResults();
        return Boolean.valueOf(hasAuthenticationResults);
    }
}
