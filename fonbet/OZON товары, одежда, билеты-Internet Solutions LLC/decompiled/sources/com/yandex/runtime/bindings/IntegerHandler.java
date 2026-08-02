package com.yandex.runtime.bindings;

/* loaded from: classes9.dex */
public class IntegerHandler implements ArchivingHandler<Integer> {
    private final boolean isOptional;

    public IntegerHandler() {
        this(false);
    }

    public IntegerHandler(boolean z11) {
        this.isOptional = z11;
    }

    @Override // com.yandex.runtime.bindings.ArchivingHandler
    public Integer add(Integer num, Archive archive) {
        return archive.add(num, this.isOptional);
    }
}
