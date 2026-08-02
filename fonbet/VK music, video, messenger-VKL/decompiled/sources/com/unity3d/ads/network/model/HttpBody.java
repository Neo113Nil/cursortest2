package com.unity3d.ads.network.model;

/* compiled from: HttpBody.kt */
/* loaded from: classes14.dex */
public interface HttpBody {

    /* compiled from: HttpBody.kt */
    public static final class ByteArrayBody implements HttpBody {
        private final byte[] content;

        public ByteArrayBody(byte[] bArr) {
            this.content = bArr;
        }

        public final byte[] getContent() {
            return this.content;
        }
    }

    /* compiled from: HttpBody.kt */
    public static final class EmptyBody implements HttpBody {
        public static final EmptyBody INSTANCE = new EmptyBody();

        private EmptyBody() {
        }
    }

    /* compiled from: HttpBody.kt */
    public static final class StringBody implements HttpBody {
        private final String content;

        public StringBody(String str) {
            this.content = str;
        }

        public final String getContent() {
            return this.content;
        }
    }
}
