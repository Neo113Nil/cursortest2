package com.unity3d.ads.core.data.datasource;

import kotlin.Result;

/* compiled from: AndroidFIdExistenceDataSource.kt */
/* loaded from: classes14.dex */
public final class AndroidFIdExistenceDataSource implements FIdExistenceDataSource {
    private final String className;

    public AndroidFIdExistenceDataSource(String str) {
        this.className = str;
    }

    @Override // com.unity3d.ads.core.data.datasource.FIdExistenceDataSource
    public boolean invoke() {
        Object failure;
        try {
            failure = Class.forName(this.className);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        return !(failure instanceof Result.Failure);
    }
}
