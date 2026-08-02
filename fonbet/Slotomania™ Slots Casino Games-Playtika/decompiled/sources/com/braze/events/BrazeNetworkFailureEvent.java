package com.braze.events;

import bo.app.a2;
import bo.app.c0;
import bo.app.j0;
import bo.app.x3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\"B\u001b\u0012\n\u0010\u0007\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b \u0010!J\r\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003HÂ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÂ\u0003J!\u0010\t\u001a\u00020\u00002\f\b\u0002\u0010\u0007\u001a\u00060\u0002j\u0002`\u00032\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0018\u0010\u0007\u001a\u00060\u0002j\u0002`\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"Lcom/braze/events/BrazeNetworkFailureEvent;", "", "Ljava/lang/Exception;", "Lkotlin/Exception;", "component1", "Lbo/app/a2;", "component2", "originalException", "brazeRequest", "copy", "", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/Exception;", "networkExceptionMessage", "Ljava/lang/String;", "getNetworkExceptionMessage", "()Ljava/lang/String;", "", "requestInitiationTime", "Ljava/lang/Long;", "getRequestInitiationTime", "()Ljava/lang/Long;", "Lcom/braze/events/BrazeNetworkFailureEvent$RequestType;", "requestType", "Lcom/braze/events/BrazeNetworkFailureEvent$RequestType;", "getRequestType", "()Lcom/braze/events/BrazeNetworkFailureEvent$RequestType;", "<init>", "(Ljava/lang/Exception;Lbo/app/a2;)V", "RequestType", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes7.dex */
public final /* data */ class BrazeNetworkFailureEvent {
    private final a2 brazeRequest;
    private final String networkExceptionMessage;
    private final Exception originalException;
    private final Long requestInitiationTime;
    private final RequestType requestType;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/braze/events/BrazeNetworkFailureEvent$RequestType;", "", "(Ljava/lang/String;I)V", "CONTENT_CARDS_SYNC", "NEWS_FEED_SYNC", "OTHER", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public enum RequestType {
        CONTENT_CARDS_SYNC,
        NEWS_FEED_SYNC,
        OTHER
    }

    public BrazeNetworkFailureEvent(Exception originalException, a2 brazeRequest) {
        RequestType requestType;
        Intrinsics.checkNotNullParameter(originalException, "originalException");
        Intrinsics.checkNotNullParameter(brazeRequest, "brazeRequest");
        this.originalException = originalException;
        this.brazeRequest = brazeRequest;
        this.networkExceptionMessage = originalException.getMessage();
        this.requestInitiationTime = brazeRequest.getC();
        if (brazeRequest instanceof c0) {
            requestType = RequestType.CONTENT_CARDS_SYNC;
        } else if (brazeRequest instanceof j0) {
            x3 s = brazeRequest.getS();
            requestType = (s != null && s.x()) ? RequestType.NEWS_FEED_SYNC : RequestType.OTHER;
        } else {
            requestType = RequestType.OTHER;
        }
        this.requestType = requestType;
    }

    /* renamed from: component1, reason: from getter */
    private final Exception getOriginalException() {
        return this.originalException;
    }

    /* renamed from: component2, reason: from getter */
    private final a2 getBrazeRequest() {
        return this.brazeRequest;
    }

    public static /* synthetic */ BrazeNetworkFailureEvent copy$default(BrazeNetworkFailureEvent brazeNetworkFailureEvent, Exception exc, a2 a2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            exc = brazeNetworkFailureEvent.originalException;
        }
        if ((i & 2) != 0) {
            a2Var = brazeNetworkFailureEvent.brazeRequest;
        }
        return brazeNetworkFailureEvent.copy(exc, a2Var);
    }

    public final BrazeNetworkFailureEvent copy(Exception originalException, a2 brazeRequest) {
        Intrinsics.checkNotNullParameter(originalException, "originalException");
        Intrinsics.checkNotNullParameter(brazeRequest, "brazeRequest");
        return new BrazeNetworkFailureEvent(originalException, brazeRequest);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BrazeNetworkFailureEvent)) {
            return false;
        }
        BrazeNetworkFailureEvent brazeNetworkFailureEvent = (BrazeNetworkFailureEvent) other;
        return Intrinsics.areEqual(this.originalException, brazeNetworkFailureEvent.originalException) && Intrinsics.areEqual(this.brazeRequest, brazeNetworkFailureEvent.brazeRequest);
    }

    public final String getNetworkExceptionMessage() {
        return this.networkExceptionMessage;
    }

    public final Long getRequestInitiationTime() {
        return this.requestInitiationTime;
    }

    public final RequestType getRequestType() {
        return this.requestType;
    }

    public int hashCode() {
        return (this.originalException.hashCode() * 31) + this.brazeRequest.hashCode();
    }

    public String toString() {
        return "BrazeNetworkFailureEvent(originalException=" + this.originalException + ", brazeRequest=" + this.brazeRequest + ')';
    }
}
