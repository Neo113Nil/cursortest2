package io.appmetrica.analytics.networktasks.internal;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public interface ArgumentsMerger<I, O> {
    boolean compareWithOtherArguments(@NonNull I i5);

    @NonNull
    O mergeFrom(@NonNull I i5);
}
