package com.yandex.runtime.bindings;

/* loaded from: classes9.dex */
public class BytesHandler implements ArchivingHandler<byte[]> {
    private final boolean isOptional;

    public BytesHandler() {
        this(false);
    }

    public BytesHandler(boolean z11) {
        this.isOptional = z11;
    }

    @Override // com.yandex.runtime.bindings.ArchivingHandler
    public byte[] add(byte[] bArr, Archive archive) {
        return archive.add(bArr, this.isOptional);
    }
}
