package com.yandex.runtime.bindings;

/* loaded from: classes9.dex */
public class DoubleHandler implements ArchivingHandler<Double> {
    private final boolean isOptional;

    public DoubleHandler() {
        this(false);
    }

    public DoubleHandler(boolean z11) {
        this.isOptional = z11;
    }

    @Override // com.yandex.runtime.bindings.ArchivingHandler
    public Double add(Double d11, Archive archive) {
        return archive.add(d11, this.isOptional);
    }
}
