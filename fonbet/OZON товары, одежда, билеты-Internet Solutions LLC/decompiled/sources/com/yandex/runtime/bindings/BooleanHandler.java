package com.yandex.runtime.bindings;

/* loaded from: classes9.dex */
public class BooleanHandler implements ArchivingHandler<Boolean> {
    private final boolean isOptional;

    public BooleanHandler() {
        this(false);
    }

    public BooleanHandler(boolean z11) {
        this.isOptional = z11;
    }

    @Override // com.yandex.runtime.bindings.ArchivingHandler
    public Boolean add(Boolean bool, Archive archive) {
        return archive.add(bool, this.isOptional);
    }
}
