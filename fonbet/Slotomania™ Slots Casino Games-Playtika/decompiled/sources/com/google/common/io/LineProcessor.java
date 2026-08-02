package com.google.common.io;

import java.io.IOException;

@ElementTypesAreNonnullByDefault
/* loaded from: classes8.dex */
public interface LineProcessor<T> {
    @ParametricNullness
    T getResult();

    boolean processLine(String str) throws IOException;
}
