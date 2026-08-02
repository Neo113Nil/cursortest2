package com.vk.search.params.api;

import com.vk.core.serialize.Serializer;

/* compiled from: SearchParams.kt */
/* loaded from: classes5.dex */
public interface SearchParams extends Serializer.StreamParcelable {
    boolean I();

    SearchParams copy();

    <T extends SearchParams> void h5(T t);

    void reset();
}
