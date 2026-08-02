package org.chromium.net;

import org.chromium.net.BidirectionalStream;

@Deprecated
/* loaded from: classes10.dex */
public abstract class ExperimentalBidirectionalStream extends BidirectionalStream {

    @Deprecated
    public static abstract class Builder extends BidirectionalStream.Builder {
        @Override // org.chromium.net.BidirectionalStream.Builder
        public abstract Builder addHeader(String header, String value);

        @Override // org.chromium.net.BidirectionalStream.Builder
        public Builder addRequestAnnotation(Object annotation) {
            return this;
        }

        @Override // org.chromium.net.BidirectionalStream.Builder
        public abstract ExperimentalBidirectionalStream build();

        @Override // org.chromium.net.BidirectionalStream.Builder
        public abstract Builder delayRequestHeadersUntilFirstFlush(boolean delayRequestHeadersUntilFirstFlush);

        @Override // org.chromium.net.BidirectionalStream.Builder
        public abstract Builder setHttpMethod(String method);

        @Override // org.chromium.net.BidirectionalStream.Builder
        public abstract Builder setPriority(int priority);

        @Override // org.chromium.net.BidirectionalStream.Builder
        public Builder setTrafficStatsTag(int tag) {
            return this;
        }

        @Override // org.chromium.net.BidirectionalStream.Builder
        public Builder setTrafficStatsUid(int uid) {
            return this;
        }
    }
}
