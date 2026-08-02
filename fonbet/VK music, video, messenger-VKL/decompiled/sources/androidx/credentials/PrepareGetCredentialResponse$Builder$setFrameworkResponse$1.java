package androidx.credentials;

import androidx.credentials.PrepareGetCredentialResponse;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.izs;

/* compiled from: PrepareGetCredentialResponse.kt */
/* loaded from: classes12.dex */
public /* synthetic */ class PrepareGetCredentialResponse$Builder$setFrameworkResponse$1 extends FunctionReferenceImpl implements izs<String, Boolean> {
    public PrepareGetCredentialResponse$Builder$setFrameworkResponse$1(Object obj) {
        super(1, obj, PrepareGetCredentialResponse.Builder.class, "hasCredentialType", "hasCredentialType(Ljava/lang/String;)Z", 0);
    }

    @Override // xsna.izs
    public final Boolean invoke(String str) {
        boolean hasCredentialType;
        hasCredentialType = ((PrepareGetCredentialResponse.Builder) this.receiver).hasCredentialType(str);
        return Boolean.valueOf(hasCredentialType);
    }
}
