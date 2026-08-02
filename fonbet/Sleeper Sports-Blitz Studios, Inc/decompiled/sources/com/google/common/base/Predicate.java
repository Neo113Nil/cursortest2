package com.google.common.base;

import javax.annotation.CheckForNull;

@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public interface Predicate<T> {
    boolean apply(@ParametricNullness T input);

    boolean equals(@CheckForNull Object object);
}
