package com.vk.push.core.utils;

import android.os.Parcelable;
import com.vk.push.common.exception.SdkIsNotInitializedException;
import com.vk.push.core.base.AidlException;
import com.vk.push.core.base.AidlResult;
import com.vk.push.core.base.exception.HostIsNotMasterException;
import com.vk.push.core.base.exception.TransferredIpcDataException;
import kotlin.Result;
import kotlin.a;
import xsna.drm0;
import xsna.gzs;
import xsna.izs;

/* compiled from: ResultExtensions.kt */
/* loaded from: classes5.dex */
public final class ResultExtensionsKt {
    public static final <R, T extends Parcelable> R fold(AidlResult<T> aidlResult, izs<? super T, ? extends R> izsVar, izs<? super Exception, ? extends R> izsVar2) {
        Exception exceptionOrNull = aidlResult.exceptionOrNull();
        return exceptionOrNull == null ? izsVar.invoke(aidlResult.getData()) : izsVar2.invoke(exceptionOrNull);
    }

    public static final boolean isValid(Object obj) {
        boolean z = obj instanceof Result.Failure;
        if (z) {
            return false;
        }
        if (z) {
            obj = null;
        }
        CharSequence charSequence = (CharSequence) obj;
        return (charSequence == null || drm0.N(charSequence)) ? false : true;
    }

    public static final <T extends Parcelable> AidlResult<?> runCatchingResult(gzs<? extends T> gzsVar) {
        try {
            return AidlResult.Companion.success(gzsVar.invoke());
        } catch (Exception e) {
            return AidlResult.Companion.failure(e);
        }
    }

    public static final AidlException toAidlException(Throwable th) {
        String valueOf = String.valueOf(th.getMessage());
        return th instanceof HostIsNotMasterException ? new AidlException(103, valueOf) : th instanceof SdkIsNotInitializedException ? new AidlException(104, valueOf) : th instanceof TransferredIpcDataException ? new AidlException(105, valueOf) : th instanceof IllegalStateException ? new AidlException(102, valueOf) : th instanceof IllegalArgumentException ? new AidlException(101, valueOf) : th instanceof RuntimeException ? new AidlException(100, valueOf) : new AidlException(0, valueOf);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends Parcelable> AidlResult<?> toAidlResult(Object obj) {
        try {
            AidlResult.Companion companion = AidlResult.Companion;
            a.a(obj);
            return companion.success((Parcelable) obj);
        } catch (Exception e) {
            return AidlResult.Companion.failure(e);
        }
    }
}
