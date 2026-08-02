package com.fyber.inneractive.sdk.external;

import com.fyber.inneractive.sdk.flow.i;
import com.fyber.inneractive.sdk.network.t;
import java.util.ArrayList;

/* loaded from: classes12.dex */
public class InneractiveInfrastructureError extends InneractiveError {
    public final InneractiveErrorCode a;
    public final i b;
    public final Throwable c;
    public Exception d;
    public final ArrayList e;

    public InneractiveInfrastructureError(InneractiveErrorCode inneractiveErrorCode, i iVar) {
        this(inneractiveErrorCode, iVar, null);
    }

    public void addReportedError(t tVar) {
        this.e.add(tVar);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveError
    public String description() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        if (this.c != null) {
            sb.append(" : ");
            sb.append(this.c);
        }
        return sb.toString();
    }

    public Throwable getCause() {
        Exception exc = this.d;
        return exc == null ? this.c : exc;
    }

    public InneractiveErrorCode getErrorCode() {
        return this.a;
    }

    public i getFyberMarketplaceAdLoadFailureReason() {
        return this.b;
    }

    public boolean isErrorAlreadyReported(t tVar) {
        return this.e.contains(tVar);
    }

    public void setCause(Exception exc) {
        this.d = exc;
    }

    public InneractiveInfrastructureError(InneractiveErrorCode inneractiveErrorCode, i iVar, Throwable th) {
        this.e = new ArrayList();
        this.a = inneractiveErrorCode;
        this.b = iVar;
        this.c = th;
    }
}
