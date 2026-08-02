package com.google.common.base;

@ElementTypesAreNonnullByDefault
/* loaded from: classes5.dex */
interface PatternCompiler {
    CommonPattern compile(String str);

    boolean isPcreLike();
}
