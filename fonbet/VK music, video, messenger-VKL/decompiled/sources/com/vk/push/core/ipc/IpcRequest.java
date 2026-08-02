package com.vk.push.core.ipc;

import android.os.RemoteException;
import com.vk.push.common.AppInfo;
import com.vk.push.common.Logger;
import com.vk.push.core.base.AidlResult;
import com.vk.push.core.base.AsyncCallback;
import com.vk.push.core.ipc.IpcRequest;
import com.vk.push.core.utils.CoroutineExtensionsKt;
import kotlin.jvm.internal.Lambda;
import xsna.izs;
import xsna.kq9;
import xsna.s3q0;
import xsna.wzs;
import xsna.zcl;

/* compiled from: IpcRequest.kt */
/* loaded from: classes5.dex */
public abstract class IpcRequest<T, V> {
    public final izs<Exception, V> a;
    public final kq9<V> b;
    public final String c;

    /* compiled from: IpcRequest.kt */
    public static final class AsyncRequest<T, V> extends IpcRequest<T, V> {
        public final wzs<T, AsyncCallback, s3q0> d;
        public final String e;
        public final wzs<AidlResult<?>, AppInfo, V> f;
        public final Logger g;

        /* JADX WARN: Multi-variable type inference failed */
        public AsyncRequest(wzs<? super T, ? super AsyncCallback, s3q0> wzsVar, String str, wzs<? super AidlResult<?>, ? super AppInfo, ? extends V> wzsVar2, Logger logger, izs<? super Exception, ? extends V> izsVar, kq9<? super V> kq9Var) {
            super(izsVar, kq9Var, str, null);
            this.d = wzsVar;
            this.e = str;
            this.f = wzsVar2;
            this.g = logger;
        }

        @Override // com.vk.push.core.ipc.IpcRequest
        public void execute(T t, final AppInfo appInfo, final izs<? super IpcRequest<T, V>, s3q0> izsVar) {
            Logger.DefaultImpls.info$default(this.g, getIpcCallName() + " ipc request is starting", null, 2, null);
            this.d.invoke(t, new AsyncCallback.Stub(this) { // from class: com.vk.push.core.ipc.IpcRequest$AsyncRequest$execute$1
                public final /* synthetic */ IpcRequest.AsyncRequest<T, V> a;

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.a = this;
                }

                @Override // com.vk.push.core.base.AsyncCallback
                public void onResult(AidlResult<?> aidlResult) {
                    Object invoke;
                    Exception exceptionOrNull = aidlResult.exceptionOrNull();
                    IpcRequest.AsyncRequest<T, V> asyncRequest = this.a;
                    if (exceptionOrNull == null) {
                        aidlResult.getData();
                        Logger.DefaultImpls.info$default(asyncRequest.getLogger(), asyncRequest.getIpcCallName() + " ipc request is success", null, 2, null);
                        invoke = asyncRequest.getTransformSuccessResult().invoke(aidlResult, appInfo);
                    } else {
                        Logger.DefaultImpls.info$default(asyncRequest.getLogger(), asyncRequest.getIpcCallName() + " ipc request is failure", null, 2, null);
                        invoke = asyncRequest.getTransformErrorResult().invoke(exceptionOrNull);
                    }
                    CoroutineExtensionsKt.safeResume(asyncRequest.getContinuation(), invoke);
                    izsVar.invoke(asyncRequest);
                }
            });
        }

        public final wzs<T, AsyncCallback, s3q0> getIpcCall() {
            return this.d;
        }

        @Override // com.vk.push.core.ipc.IpcRequest
        public String getIpcCallName() {
            return this.e;
        }

        public final Logger getLogger() {
            return this.g;
        }

        public final wzs<AidlResult<?>, AppInfo, V> getTransformSuccessResult() {
            return this.f;
        }
    }

    /* compiled from: IpcRequest.kt */
    public static final class SimpleRequest<T, V> extends IpcRequest<T, V> {
        public final wzs<T, AppInfo, V> d;
        public final String e;
        public final Logger f;

        /* JADX WARN: Multi-variable type inference failed */
        public SimpleRequest(wzs<? super T, ? super AppInfo, ? extends V> wzsVar, String str, Logger logger, izs<? super Exception, ? extends V> izsVar, kq9<? super V> kq9Var) {
            super(izsVar, kq9Var, str, null);
            this.d = wzsVar;
            this.e = str;
            this.f = logger;
        }

        @Override // com.vk.push.core.ipc.IpcRequest
        public void execute(T t, AppInfo appInfo, izs<? super IpcRequest<T, V>, s3q0> izsVar) {
            Logger.DefaultImpls.info$default(this.f, getIpcCallName() + " ipc request is starting", null, 2, null);
            CoroutineExtensionsKt.safeResume(getContinuation(), this.d.invoke(t, appInfo));
            izsVar.invoke(this);
        }

        public final wzs<T, AppInfo, V> getIpcCall() {
            return this.d;
        }

        @Override // com.vk.push.core.ipc.IpcRequest
        public String getIpcCallName() {
            return this.e;
        }

        public final Logger getLogger() {
            return this.f;
        }
    }

    /* compiled from: IpcRequest.kt */
    public static final class a extends Lambda implements izs<IpcRequest<T, V>, s3q0> {
        public static final a i = new a(1);

        @Override // xsna.izs
        public final /* bridge */ /* synthetic */ s3q0 invoke(Object obj) {
            return s3q0.a;
        }
    }

    public IpcRequest() {
        throw null;
    }

    public IpcRequest(izs izsVar, kq9 kq9Var, String str, zcl zclVar) {
        this.a = izsVar;
        this.b = kq9Var;
        this.c = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void execute$default(IpcRequest ipcRequest, Object obj, AppInfo appInfo, izs izsVar, int i, Object obj2) throws RemoteException {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: execute");
        }
        if ((i & 4) != 0) {
            izsVar = a.i;
        }
        ipcRequest.execute(obj, appInfo, izsVar);
    }

    public abstract void execute(T t, AppInfo appInfo, izs<? super IpcRequest<T, V>, s3q0> izsVar) throws RemoteException;

    public final kq9<V> getContinuation() {
        return this.b;
    }

    public String getIpcCallName() {
        return this.c;
    }

    public final izs<Exception, V> getTransformErrorResult() {
        return this.a;
    }

    public final void onError(Exception exc) {
        CoroutineExtensionsKt.safeResume(this.b, this.a.invoke(exc));
    }
}
