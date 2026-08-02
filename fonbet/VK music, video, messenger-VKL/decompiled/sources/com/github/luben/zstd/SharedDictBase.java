package com.github.luben.zstd;

/* loaded from: classes12.dex */
abstract class SharedDictBase extends AutoCloseBase {
    public void finalize() {
        close();
    }
}
