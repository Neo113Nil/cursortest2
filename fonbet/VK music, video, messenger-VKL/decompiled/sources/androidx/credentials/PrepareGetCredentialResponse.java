package androidx.credentials;

import android.annotation.SuppressLint;
import android.credentials.PrepareGetCredentialResponse;
import xsna.gzs;
import xsna.izs;
import xsna.zcl;

/* compiled from: PrepareGetCredentialResponse.kt */
@SuppressLint({"MissingGetterMatchingBuilder"})
/* loaded from: classes12.dex */
public final class PrepareGetCredentialResponse {
    private final izs<String, Boolean> credentialTypeDelegate;
    private final gzs<Boolean> hasAuthResultsDelegate;
    private final gzs<Boolean> hasRemoteResultsDelegate;
    private final boolean isNullHandlesForTest;
    private final PendingGetCredentialHandle pendingGetCredentialHandle;

    /* compiled from: PrepareGetCredentialResponse.kt */
    public static final class Builder {
        private android.credentials.PrepareGetCredentialResponse frameworkResponse;
        private gzs<Boolean> hasAuthResultsDelegate;
        private izs<? super String, Boolean> hasCredentialResultsDelegate;
        private gzs<Boolean> hasRemoteResultsDelegate;
        private PendingGetCredentialHandle pendingGetCredentialHandle;

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean hasAuthenticationResults() {
            boolean hasAuthenticationResults;
            hasAuthenticationResults = this.frameworkResponse.hasAuthenticationResults();
            return hasAuthenticationResults;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean hasCredentialType(String str) {
            boolean hasCredentialResults;
            hasCredentialResults = this.frameworkResponse.hasCredentialResults(str);
            return hasCredentialResults;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean hasRemoteResults() {
            boolean hasRemoteResults;
            hasRemoteResults = this.frameworkResponse.hasRemoteResults();
            return hasRemoteResults;
        }

        public final PrepareGetCredentialResponse build() {
            return new PrepareGetCredentialResponse(this.pendingGetCredentialHandle, this.hasRemoteResultsDelegate, this.hasAuthResultsDelegate, this.hasCredentialResultsDelegate, false, null);
        }

        public final Builder setFrameworkResponse(android.credentials.PrepareGetCredentialResponse prepareGetCredentialResponse) {
            this.frameworkResponse = prepareGetCredentialResponse;
            if (prepareGetCredentialResponse != null) {
                this.hasCredentialResultsDelegate = new PrepareGetCredentialResponse$Builder$setFrameworkResponse$1(this);
                this.hasAuthResultsDelegate = new PrepareGetCredentialResponse$Builder$setFrameworkResponse$2(this);
                this.hasRemoteResultsDelegate = new PrepareGetCredentialResponse$Builder$setFrameworkResponse$3(this);
            }
            return this;
        }

        public final Builder setPendingGetCredentialHandle(PendingGetCredentialHandle pendingGetCredentialHandle) {
            this.pendingGetCredentialHandle = pendingGetCredentialHandle;
            return this;
        }
    }

    /* compiled from: PrepareGetCredentialResponse.kt */
    public static final class PendingGetCredentialHandle {
        private final PrepareGetCredentialResponse.PendingGetCredentialHandle frameworkHandle;

        public PendingGetCredentialHandle(PrepareGetCredentialResponse.PendingGetCredentialHandle pendingGetCredentialHandle) {
            this.frameworkHandle = pendingGetCredentialHandle;
        }

        public final PrepareGetCredentialResponse.PendingGetCredentialHandle getFrameworkHandle() {
            return this.frameworkHandle;
        }
    }

    /* compiled from: PrepareGetCredentialResponse.kt */
    public static final class TestBuilder {
        private gzs<Boolean> hasAuthResultsDelegate;
        private izs<? super String, Boolean> hasCredentialResultsDelegate;
        private gzs<Boolean> hasRemoteResultsDelegate;

        public final PrepareGetCredentialResponse build() {
            return new PrepareGetCredentialResponse(null, this.hasRemoteResultsDelegate, this.hasAuthResultsDelegate, this.hasCredentialResultsDelegate, true, null);
        }

        public final TestBuilder setCredentialTypeDelegate(izs<? super String, Boolean> izsVar) {
            this.hasCredentialResultsDelegate = izsVar;
            return this;
        }

        public final TestBuilder setHasAuthResultsDelegate(gzs<Boolean> gzsVar) {
            this.hasAuthResultsDelegate = gzsVar;
            return this;
        }

        public final TestBuilder setHasRemoteResultsDelegate(gzs<Boolean> gzsVar) {
            this.hasRemoteResultsDelegate = gzsVar;
            return this;
        }
    }

    public /* synthetic */ PrepareGetCredentialResponse(PendingGetCredentialHandle pendingGetCredentialHandle, gzs gzsVar, gzs gzsVar2, izs izsVar, boolean z, zcl zclVar) {
        this(pendingGetCredentialHandle, gzsVar, gzsVar2, izsVar, z);
    }

    public final izs<String, Boolean> getCredentialTypeDelegate() {
        return this.credentialTypeDelegate;
    }

    public final gzs<Boolean> getHasAuthResultsDelegate() {
        return this.hasAuthResultsDelegate;
    }

    public final gzs<Boolean> getHasRemoteResultsDelegate() {
        return this.hasRemoteResultsDelegate;
    }

    public final PendingGetCredentialHandle getPendingGetCredentialHandle() {
        return this.pendingGetCredentialHandle;
    }

    public final boolean hasAuthenticationResults() {
        gzs<Boolean> gzsVar = this.hasAuthResultsDelegate;
        if (gzsVar != null) {
            return gzsVar.invoke().booleanValue();
        }
        return false;
    }

    public final boolean hasCredentialResults(String str) {
        izs<String, Boolean> izsVar = this.credentialTypeDelegate;
        if (izsVar != null) {
            return izsVar.invoke(str).booleanValue();
        }
        return false;
    }

    public final boolean hasRemoteResults() {
        gzs<Boolean> gzsVar = this.hasRemoteResultsDelegate;
        if (gzsVar != null) {
            return gzsVar.invoke().booleanValue();
        }
        return false;
    }

    public final boolean isNullHandlesForTest() {
        return this.isNullHandlesForTest;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private PrepareGetCredentialResponse(PendingGetCredentialHandle pendingGetCredentialHandle, gzs<Boolean> gzsVar, gzs<Boolean> gzsVar2, izs<? super String, Boolean> izsVar, boolean z) {
        this.pendingGetCredentialHandle = pendingGetCredentialHandle;
        this.hasRemoteResultsDelegate = gzsVar;
        this.hasAuthResultsDelegate = gzsVar2;
        this.credentialTypeDelegate = izsVar;
        this.isNullHandlesForTest = z;
    }
}
