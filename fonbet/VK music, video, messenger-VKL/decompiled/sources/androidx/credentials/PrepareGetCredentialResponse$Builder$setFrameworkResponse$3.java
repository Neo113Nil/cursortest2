package androidx.credentials;

import androidx.credentials.PrepareGetCredentialResponse;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.gzs;

/* compiled from: PrepareGetCredentialResponse.kt */
/* loaded from: classes12.dex */
public /* synthetic */ class PrepareGetCredentialResponse$Builder$setFrameworkResponse$3 extends FunctionReferenceImpl implements gzs<Boolean> {
    public PrepareGetCredentialResponse$Builder$setFrameworkResponse$3(Object obj) {
        super(0, obj, PrepareGetCredentialResponse.Builder.class, "hasRemoteResults", "hasRemoteResults()Z", 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // xsna.gzs
    public final Boolean invoke() {
        boolean hasRemoteResults;
        hasRemoteResults = ((PrepareGetCredentialResponse.Builder) this.receiver).hasRemoteResults();
        return Boolean.valueOf(hasRemoteResults);
    }
}
