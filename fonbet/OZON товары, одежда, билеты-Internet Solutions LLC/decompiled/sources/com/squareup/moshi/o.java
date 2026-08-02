package com.squareup.moshi;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class o {
    @NotNull
    public static final String a(int i11, @NotNull int[] stack, @NotNull String[] pathNames, @NotNull int[] pathIndices) {
        Intrinsics.checkNotNullParameter(stack, "stack");
        Intrinsics.checkNotNullParameter(pathNames, "pathNames");
        Intrinsics.checkNotNullParameter(pathIndices, "pathIndices");
        StringBuilder sb2 = new StringBuilder("$");
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = stack[i12];
            if (i13 == 1 || i13 == 2) {
                sb2.append('[');
                sb2.append(pathIndices[i12]);
                sb2.append(']');
            } else if (i13 == 3 || i13 == 4 || i13 == 5) {
                sb2.append('.');
                String str = pathNames[i12];
                if (str != null) {
                    sb2.append(str);
                }
            }
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
