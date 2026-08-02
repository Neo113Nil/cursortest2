package com.vk.api.internal.exceptions;

import com.vk.api.sdk.a;
import com.vk.api.sdk.exceptions.VKApiException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import xsna.jj20;

/* compiled from: FrequentMethodCallException.kt */
/* loaded from: classes15.dex */
public final class FrequentMethodCallException extends VKApiException {
    private final Map<String, List<jj20>> calls;
    private final a method;

    public FrequentMethodCallException(a aVar, HashMap hashMap) {
        super("Cycle call detected " + hashMap.get(aVar.c));
        this.method = aVar;
        this.calls = hashMap;
    }
}
