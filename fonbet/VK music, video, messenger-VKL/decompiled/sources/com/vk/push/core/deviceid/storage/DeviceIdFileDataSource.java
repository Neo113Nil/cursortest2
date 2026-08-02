package com.vk.push.core.deviceid.storage;

import com.vk.push.core.deviceid.DeviceIdDataSource;
import com.vk.push.core.filedatastore.FileDataSource;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;
import xsna.s3q0;
import xsna.spj;
import xsna.zcl;

/* compiled from: DeviceIdFileDataSource.kt */
/* loaded from: classes.dex */
public final class DeviceIdFileDataSource implements DeviceIdDataSource {
    public static final Companion Companion = new Companion(null);
    public static final String DEVICE_ID_FILE_NAME = "device_id.txt";
    public final FileDataSource a;

    /* compiled from: DeviceIdFileDataSource.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public Companion() {
        }
    }

    /* compiled from: DeviceIdFileDataSource.kt */
    @b6l(c = "com.vk.push.core.deviceid.storage.DeviceIdFileDataSource", f = "DeviceIdFileDataSource.kt", l = {10}, m = "getDeviceId-IoAF18A")
    public static final class a extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public a(spj<? super a> spjVar) {
            super(spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object mo96getDeviceIdIoAF18A = DeviceIdFileDataSource.this.mo96getDeviceIdIoAF18A(this);
            return mo96getDeviceIdIoAF18A == CoroutineSingletons.COROUTINE_SUSPENDED ? mo96getDeviceIdIoAF18A : new Result(mo96getDeviceIdIoAF18A);
        }
    }

    /* compiled from: DeviceIdFileDataSource.kt */
    @b6l(c = "com.vk.push.core.deviceid.storage.DeviceIdFileDataSource", f = "DeviceIdFileDataSource.kt", l = {12}, m = "setDeviceId-gIAlu-s")
    /* loaded from: classes5.dex */
    public static final class b extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public b(spj<? super b> spjVar) {
            super(spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object mo95setDeviceIdgIAlus = DeviceIdFileDataSource.this.mo95setDeviceIdgIAlus(null, this);
            return mo95setDeviceIdgIAlus == CoroutineSingletons.COROUTINE_SUSPENDED ? mo95setDeviceIdgIAlus : new Result(mo95setDeviceIdgIAlus);
        }
    }

    public DeviceIdFileDataSource(FileDataSource fileDataSource) {
        this.a = fileDataSource;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.vk.push.core.deviceid.DeviceIdReadOnlyDataSource
    /* renamed from: getDeviceId-IoAF18A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo96getDeviceIdIoAF18A(spj<? super Result<String>> spjVar) {
        a aVar;
        int i;
        if (spjVar instanceof a) {
            aVar = (a) spjVar;
            int i2 = aVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.label = i2 - Integer.MIN_VALUE;
                Object obj = aVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = aVar.label;
                if (i == 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    return ((Result) obj).d();
                }
                kotlin.a.a(obj);
                aVar.label = 1;
                Object m99getDataIoAF18A = this.a.m99getDataIoAF18A(aVar);
                return m99getDataIoAF18A == coroutineSingletons ? coroutineSingletons : m99getDataIoAF18A;
            }
        }
        aVar = new a(spjVar);
        Object obj2 = aVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = aVar.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.vk.push.core.deviceid.DeviceIdDataSource
    /* renamed from: setDeviceId-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo95setDeviceIdgIAlus(String str, spj<? super Result<s3q0>> spjVar) {
        b bVar;
        int i;
        if (spjVar instanceof b) {
            bVar = (b) spjVar;
            int i2 = bVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.label = i2 - Integer.MIN_VALUE;
                Object obj = bVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bVar.label;
                if (i == 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    return ((Result) obj).d();
                }
                kotlin.a.a(obj);
                bVar.label = 1;
                Object m100setDatagIAlus = this.a.m100setDatagIAlus(str, bVar);
                return m100setDatagIAlus == coroutineSingletons ? coroutineSingletons : m100setDatagIAlus;
            }
        }
        bVar = new b(spjVar);
        Object obj2 = bVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bVar.label;
        if (i == 0) {
        }
    }
}
