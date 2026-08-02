package com.facebook.soloader;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes12.dex */
public abstract class NativeLibrary {
    private static final String TAG = "com.facebook.soloader.NativeLibrary";
    private List<String> mLibraryNames;
    private final Object mLock = new Object();
    private Boolean mLoadLibraries = Boolean.TRUE;
    private boolean mLibrariesLoaded = false;
    private volatile UnsatisfiedLinkError mLinkError = null;

    public NativeLibrary(List<String> list) {
        this.mLibraryNames = list;
    }

    public void ensureLoaded() throws UnsatisfiedLinkError {
        if (!loadLibraries()) {
            throw this.mLinkError;
        }
    }

    public UnsatisfiedLinkError getError() {
        return this.mLinkError;
    }

    public boolean loadLibraries() {
        synchronized (this.mLock) {
            if (!this.mLoadLibraries.booleanValue()) {
                return this.mLibrariesLoaded;
            }
            try {
                List<String> list = this.mLibraryNames;
                if (list != null) {
                    Iterator<String> it = list.iterator();
                    while (it.hasNext()) {
                        SoLoader.loadLibrary(it.next());
                    }
                }
                initialNativeCheck();
                this.mLibrariesLoaded = true;
                this.mLibraryNames = null;
            } catch (UnsatisfiedLinkError e) {
                LogUtil.e(TAG, "Failed to load native lib (initial check): ", e);
                this.mLinkError = e;
                this.mLibrariesLoaded = false;
            } catch (Throwable th) {
                LogUtil.e(TAG, "Failed to load native lib (other error): ", th);
                this.mLinkError = new UnsatisfiedLinkError("Failed loading libraries");
                this.mLinkError.initCause(th);
                this.mLibrariesLoaded = false;
            }
            this.mLoadLibraries = Boolean.FALSE;
            return this.mLibrariesLoaded;
        }
    }

    public void initialNativeCheck() throws UnsatisfiedLinkError {
    }
}
