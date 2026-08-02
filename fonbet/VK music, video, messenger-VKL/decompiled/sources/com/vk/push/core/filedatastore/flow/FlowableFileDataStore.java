package com.vk.push.core.filedatastore.flow;

import com.vk.push.core.filedatastore.FileDataStore;
import xsna.ksr;

/* compiled from: FlowableFileDataStore.kt */
/* loaded from: classes.dex */
public interface FlowableFileDataStore<T> extends FileDataStore<T> {
    ksr<T> flow();
}
