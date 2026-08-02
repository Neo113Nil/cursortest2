package com.google.common.collect;

/* renamed from: com.google.common.collect.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5877v {
    static int a(int i11) {
        return (int) (Integer.rotateLeft((int) (i11 * (-862048943)), 15) * 461845907);
    }

    static int b(Object obj) {
        return a(obj == null ? 0 : obj.hashCode());
    }
}
