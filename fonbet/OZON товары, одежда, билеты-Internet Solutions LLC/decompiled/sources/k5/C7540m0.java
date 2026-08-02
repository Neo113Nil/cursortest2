package k5;

import java.util.Arrays;
import java.util.HashSet;

/* renamed from: k5.m0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C7540m0 {
    @SafeVarargs
    public static HashSet a(Object... objArr) {
        HashSet hashSet = new HashSet(objArr.length);
        hashSet.addAll(Arrays.asList(objArr));
        return hashSet;
    }
}
