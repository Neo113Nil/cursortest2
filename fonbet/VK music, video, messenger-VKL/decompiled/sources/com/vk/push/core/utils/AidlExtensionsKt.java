package com.vk.push.core.utils;

import android.os.Parcelable;
import android.os.RemoteException;
import com.vk.push.common.Logger;
import com.vk.push.core.base.AidlResult;
import com.vk.push.core.base.AsyncCallback;
import xsna.izs;
import xsna.s3q0;

/* compiled from: AidlExtensions.kt */
/* loaded from: classes5.dex */
public final class AidlExtensionsKt {
    public static final <T extends Parcelable> void safeOnResult(AsyncCallback asyncCallback, AidlResult<T> aidlResult, izs<? super RemoteException, s3q0> izsVar) {
        try {
            asyncCallback.onResult(aidlResult);
        } catch (RemoteException e) {
            izsVar.invoke(e);
        }
    }

    public static final void safeOnResult(AsyncCallback asyncCallback, Exception exc, Logger logger) {
        try {
            asyncCallback.onResult(AidlResult.Companion.failure(exc));
        } catch (RemoteException e) {
            logger.error("Error with message \"" + exc.getMessage() + "\" could not be returned by ipc", e);
        }
    }
}
