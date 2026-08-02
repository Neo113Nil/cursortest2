package com.vk.push.core.filedatastore.flow;

import com.vk.push.core.filedatastore.FileDataStore;
import xsna.bdn;
import xsna.wgl;
import xsna.yvj;
import xsna.zvj;

/* compiled from: FlowableFileDataStoreImpl.kt */
/* loaded from: classes.dex */
public final class FlowableFileDataStoreImplKt {
    public static final <T> FlowableFileDataStore<T> flowableFileDataStore(FileDataStore<T> fileDataStore, yvj yvjVar) {
        return new FlowableFileDataStoreImpl(fileDataStore, yvjVar);
    }

    public static FlowableFileDataStore flowableFileDataStore$default(FileDataStore fileDataStore, yvj yvjVar, int i, Object obj) {
        if ((i & 1) != 0) {
            bdn bdnVar = bdn.a;
            yvjVar = zvj.a(wgl.c);
        }
        return flowableFileDataStore(fileDataStore, yvjVar);
    }
}
