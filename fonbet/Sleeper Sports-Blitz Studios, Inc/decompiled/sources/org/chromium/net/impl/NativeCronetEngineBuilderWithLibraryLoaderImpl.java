package org.chromium.net.impl;

import android.content.Context;
import org.chromium.net.CronetEngine;
import org.chromium.net.impl.VersionSafeCallbacks;

/* loaded from: classes10.dex */
public class NativeCronetEngineBuilderWithLibraryLoaderImpl extends NativeCronetEngineBuilderImpl {
    private VersionSafeCallbacks.LibraryLoader mLibraryLoader;

    public NativeCronetEngineBuilderWithLibraryLoaderImpl(Context context) {
        super(context);
    }

    @Override // org.chromium.net.impl.NativeCronetEngineBuilderImpl, org.chromium.net.impl.CronetEngineBuilderImpl, org.chromium.net.ICronetEngineBuilder
    public CronetEngineBuilderImpl setLibraryLoader(CronetEngine.Builder.LibraryLoader loader) {
        this.mLibraryLoader = new VersionSafeCallbacks.LibraryLoader(loader);
        return this;
    }

    @Override // org.chromium.net.impl.CronetEngineBuilderImpl
    VersionSafeCallbacks.LibraryLoader libraryLoader() {
        return this.mLibraryLoader;
    }
}
