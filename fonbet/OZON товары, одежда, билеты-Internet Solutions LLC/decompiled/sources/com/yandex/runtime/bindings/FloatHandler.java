package com.yandex.runtime.bindings;

/* loaded from: classes9.dex */
public class FloatHandler implements ArchivingHandler<Float> {
    private final boolean isOptional;

    public FloatHandler() {
        this(false);
    }

    public FloatHandler(boolean z11) {
        this.isOptional = z11;
    }

    @Override // com.yandex.runtime.bindings.ArchivingHandler
    public Float add(Float f7, Archive archive) {
        return archive.add(f7, this.isOptional);
    }
}
