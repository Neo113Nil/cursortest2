package org.chromium.net.apihelpers;

import org.chromium.net.UrlResponseInfo;

/* loaded from: classes10.dex */
public abstract class ByteArrayCronetCallback extends InMemoryTransformCronetCallback<byte[]> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.net.apihelpers.InMemoryTransformCronetCallback
    public final byte[] transformBodyBytes(UrlResponseInfo info, byte[] bodyBytes) {
        return bodyBytes;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.chromium.net.apihelpers.InMemoryTransformCronetCallback
    public ByteArrayCronetCallback addCompletionListener(CronetRequestCompletionListener<? super byte[]> listener) {
        super.addCompletionListener((CronetRequestCompletionListener) listener);
        return this;
    }
}
