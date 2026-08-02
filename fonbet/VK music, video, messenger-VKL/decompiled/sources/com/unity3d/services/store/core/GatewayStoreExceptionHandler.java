package com.unity3d.services.store.core;

import com.unity3d.services.store.StoreEvent;

/* compiled from: GatewayStoreExceptionHandler.kt */
/* loaded from: classes14.dex */
public final class GatewayStoreExceptionHandler implements StoreExceptionHandler {
    @Override // com.unity3d.services.store.core.StoreExceptionHandler
    public void handleStoreException(StoreEvent storeEvent, int i, Exception exc) {
        throw exc;
    }
}
