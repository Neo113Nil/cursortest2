package com.yandex.runtime.bindings;

/* loaded from: classes9.dex */
public class LongHandler implements ArchivingHandler<Long> {
    private final boolean isOptional;

    public LongHandler() {
        this(false);
    }

    public LongHandler(boolean z11) {
        this.isOptional = z11;
    }

    @Override // com.yandex.runtime.bindings.ArchivingHandler
    public Long add(Long l11, Archive archive) {
        return archive.add(l11, this.isOptional);
    }
}
