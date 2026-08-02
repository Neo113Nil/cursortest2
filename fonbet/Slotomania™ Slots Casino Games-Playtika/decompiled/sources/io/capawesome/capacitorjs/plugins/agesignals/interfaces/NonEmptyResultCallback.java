package io.capawesome.capacitorjs.plugins.agesignals.interfaces;

import io.capawesome.capacitorjs.plugins.agesignals.interfaces.Result;

/* loaded from: classes4.dex */
public interface NonEmptyResultCallback<T extends Result> extends Callback {
    void success(T t);
}
