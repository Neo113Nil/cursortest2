package com.facebook.soloader.observer;

import com.facebook.soloader.SoFileLoader;
import com.facebook.soloader.SoSource;
import com.facebook.soloader.recovery.RecoveryStrategy;

/* loaded from: classes12.dex */
public interface Observer {
    void onGetDependenciesEnd(Throwable th);

    void onGetDependenciesStart();

    void onLoadDependencyEnd(Throwable th, boolean z);

    void onLoadDependencyStart(String str, int i);

    void onLoadLibraryEnd(Throwable th, boolean z);

    void onLoadLibraryStart(String str, String str2, int i);

    void onRecoveryEnd(Throwable th);

    void onRecoveryStart(RecoveryStrategy recoveryStrategy);

    void onSoFileLoaderLoadEnd(Throwable th);

    void onSoFileLoaderLoadStart(SoFileLoader soFileLoader, String str, int i);

    void onSoSourceLoadLibraryEnd(Throwable th);

    void onSoSourceLoadLibraryStart(SoSource soSource);
}
