package com.vk.push.core.deviceid;

import com.vk.push.common.Logger;
import com.vk.push.core.DeviceIdRepository;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.bay;
import xsna.bdn;
import xsna.caj0;
import xsna.drm0;
import xsna.epx;
import xsna.go9;
import xsna.ksr;
import xsna.lyd;
import xsna.myc0;
import xsna.ovj;
import xsna.s3q0;
import xsna.sh50;
import xsna.spj;
import xsna.ui50;
import xsna.wgl;
import xsna.wi50;
import xsna.wzs;
import xsna.yvj;
import xsna.zcl;

/* compiled from: DeviceIdRepositoryImpl.kt */
/* loaded from: classes.dex */
public final class DeviceIdRepositoryImpl implements DeviceIdRepository {

    @Deprecated
    public static final String DEFAULT_DEVICE_ID = "default_device_id";

    @Deprecated
    public static final int ERROR_BUFFER_SIZE = 5;
    public final DeviceIdDataSource a;
    public final DeviceIdReadOnlyDataSource b;
    public final DeviceIdGenerator c;
    public final ovj d;
    public final Logger e;
    public volatile String f;
    public final wi50 g;
    public final caj0 h;
    public final caj0 i;

    /* compiled from: DeviceIdRepositoryImpl.kt */
    @b6l(c = "com.vk.push.core.deviceid.DeviceIdRepositoryImpl$getDeviceId$2", f = "DeviceIdRepositoryImpl.kt", l = {Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, 40, 47, 51, 55, 59, 64, 65}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super String>, Object> {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        public a(spj<? super a> spjVar) {
            super(2, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return DeviceIdRepositoryImpl.this.new a(spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super String> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0201, code lost:
        
            if (com.vk.push.core.deviceid.DeviceIdRepositoryImpl.access$saveToLocal(r1, r0, r12) != r3) goto L95;
         */
        /* JADX WARN: Code restructure failed: missing block: B:90:0x00cc, code lost:
        
            if (r13.b(r12) == r3) goto L94;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Not initialized variable reg: 7, insn: 0x0085: MOVE (r2 I:??[OBJECT, ARRAY]) = (r7 I:??[OBJECT, ARRAY]) (LINE:134), block:B:92:0x0085 */
        /* JADX WARN: Removed duplicated region for block: B:25:0x01ef  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x016c A[Catch: all -> 0x0028, TryCatch #1 {all -> 0x0028, blocks: (B:8:0x0023, B:9:0x0204, B:13:0x0034, B:15:0x01f0, B:23:0x01d5, B:32:0x005b, B:33:0x0191, B:37:0x0068, B:38:0x0168, B:40:0x016c, B:42:0x0175, B:46:0x0199, B:48:0x019f, B:55:0x0150), top: B:2:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:48:0x019f A[Catch: all -> 0x0028, TRY_LEAVE, TryCatch #1 {all -> 0x0028, blocks: (B:8:0x0023, B:9:0x0204, B:13:0x0034, B:15:0x01f0, B:23:0x01d5, B:32:0x005b, B:33:0x0191, B:37:0x0068, B:38:0x0168, B:40:0x016c, B:42:0x0175, B:46:0x0199, B:48:0x019f, B:55:0x0150), top: B:2:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:57:0x0165  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0167  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x00fc A[Catch: all -> 0x0084, TryCatch #0 {all -> 0x0084, blocks: (B:52:0x007f, B:53:0x013c, B:60:0x0090, B:61:0x00f8, B:63:0x00fc, B:65:0x0105, B:68:0x0118, B:70:0x011e), top: B:2:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:70:0x011e A[Catch: all -> 0x0084, TryCatch #0 {all -> 0x0084, blocks: (B:52:0x007f, B:53:0x013c, B:60:0x0090, B:61:0x00f8, B:63:0x00fc, B:65:0x0105, B:68:0x0118, B:70:0x011e), top: B:2:0x000c }] */
        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r2v1 */
        /* JADX WARN: Type inference failed for: r2v12 */
        /* JADX WARN: Type inference failed for: r2v2, types: [xsna.ui50] */
        /* JADX WARN: Type inference failed for: r2v3 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            ui50 ui50Var;
            DeviceIdRepositoryImpl deviceIdRepositoryImpl;
            ui50 ui50Var2;
            Object obj3;
            Throwable a;
            ui50 ui50Var3;
            Object mo96getDeviceIdIoAF18A;
            DeviceIdRepositoryImpl deviceIdRepositoryImpl2;
            Throwable a2;
            DeviceIdRepositoryImpl deviceIdRepositoryImpl3;
            Throwable th;
            ui50 ui50Var4;
            DeviceIdRepositoryImpl deviceIdRepositoryImpl4;
            String str;
            DeviceIdRepositoryImpl deviceIdRepositoryImpl5;
            String str2;
            ?? r2 = "Failed to read device id from local, error = ";
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            try {
                try {
                    switch (this.label) {
                        case 0:
                            kotlin.a.a(obj);
                            if (!DeviceIdRepositoryImpl.access$canUseCache(DeviceIdRepositoryImpl.this)) {
                                ui50Var = DeviceIdRepositoryImpl.this.g;
                                deviceIdRepositoryImpl = DeviceIdRepositoryImpl.this;
                                this.L$0 = ui50Var;
                                this.L$1 = deviceIdRepositoryImpl;
                                this.label = 1;
                                break;
                            } else {
                                return DeviceIdRepositoryImpl.this.f;
                            }
                        case 1:
                            deviceIdRepositoryImpl = (DeviceIdRepositoryImpl) this.L$1;
                            ui50 ui50Var5 = (ui50) this.L$0;
                            kotlin.a.a(obj);
                            ui50Var = ui50Var5;
                            try {
                                if (DeviceIdRepositoryImpl.access$canUseCache(deviceIdRepositoryImpl)) {
                                    String str3 = deviceIdRepositoryImpl.f;
                                    ui50Var.c(null);
                                    return str3;
                                }
                                DeviceIdDataSource deviceIdDataSource = deviceIdRepositoryImpl.a;
                                this.L$0 = ui50Var;
                                this.L$1 = deviceIdRepositoryImpl;
                                this.label = 2;
                                Object mo96getDeviceIdIoAF18A2 = deviceIdDataSource.mo96getDeviceIdIoAF18A(this);
                                if (mo96getDeviceIdIoAF18A2 != coroutineSingletons) {
                                    ui50Var2 = ui50Var;
                                    obj3 = mo96getDeviceIdIoAF18A2;
                                    if (!(obj3 instanceof Result.Failure)) {
                                        String str4 = (String) obj3;
                                        if (!drm0.N(str4)) {
                                            Logger.DefaultImpls.info$default(deviceIdRepositoryImpl.e, "Device id from local storage is used, value = ".concat(str4), null, 2, null);
                                            String str5 = deviceIdRepositoryImpl.f = str4;
                                            ui50Var2.c(null);
                                            return str5;
                                        }
                                    }
                                    a = Result.a(obj3);
                                    if (a != null) {
                                        sh50 sh50Var = deviceIdRepositoryImpl.h;
                                        DeviceIdRepository.DeviceIdError deviceIdError = new DeviceIdRepository.DeviceIdError(a, "DeviceId: failed to read from local");
                                        this.L$0 = ui50Var2;
                                        this.L$1 = deviceIdRepositoryImpl;
                                        this.L$2 = obj3;
                                        this.L$3 = a;
                                        this.label = 3;
                                        if (sh50Var.emit(deviceIdError, this) == coroutineSingletons) {
                                        }
                                        Logger.DefaultImpls.info$default(deviceIdRepositoryImpl.e, "Failed to read device id from local, error = " + a, null, 2, null);
                                    }
                                    ui50Var3 = ui50Var2;
                                    DeviceIdReadOnlyDataSource deviceIdReadOnlyDataSource = deviceIdRepositoryImpl.b;
                                    this.L$0 = ui50Var3;
                                    this.L$1 = deviceIdRepositoryImpl;
                                    this.L$2 = null;
                                    this.L$3 = null;
                                    this.label = 4;
                                    mo96getDeviceIdIoAF18A = deviceIdReadOnlyDataSource.mo96getDeviceIdIoAF18A(this);
                                    if (mo96getDeviceIdIoAF18A != coroutineSingletons) {
                                        deviceIdRepositoryImpl2 = deviceIdRepositoryImpl;
                                        if (!(mo96getDeviceIdIoAF18A instanceof Result.Failure)) {
                                            String str6 = (String) mo96getDeviceIdIoAF18A;
                                            if (!drm0.N(str6)) {
                                                Logger.DefaultImpls.info$default(deviceIdRepositoryImpl2.e, "Device id from remote is used", null, 2, null);
                                                this.L$0 = ui50Var3;
                                                this.L$1 = deviceIdRepositoryImpl2;
                                                this.L$2 = str6;
                                                this.label = 5;
                                                if (DeviceIdRepositoryImpl.access$saveToLocal(deviceIdRepositoryImpl2, str6, this) != coroutineSingletons) {
                                                    deviceIdRepositoryImpl4 = deviceIdRepositoryImpl2;
                                                    str = str6;
                                                    String str7 = deviceIdRepositoryImpl4.f = str;
                                                    ui50Var3.c(null);
                                                    return str7;
                                                }
                                            }
                                        }
                                        a2 = Result.a(mo96getDeviceIdIoAF18A);
                                        if (a2 != null) {
                                            sh50 sh50Var2 = deviceIdRepositoryImpl2.h;
                                            DeviceIdRepository.DeviceIdError deviceIdError2 = new DeviceIdRepository.DeviceIdError(a2, "DeviceId: failed to read from remote");
                                            this.L$0 = ui50Var3;
                                            this.L$1 = deviceIdRepositoryImpl2;
                                            this.L$2 = mo96getDeviceIdIoAF18A;
                                            this.L$3 = a2;
                                            this.label = 6;
                                            if (sh50Var2.emit(deviceIdError2, this) != coroutineSingletons) {
                                                ui50 ui50Var6 = ui50Var3;
                                                deviceIdRepositoryImpl3 = deviceIdRepositoryImpl2;
                                                th = a2;
                                                ui50Var4 = ui50Var6;
                                                Logger.DefaultImpls.info$default(deviceIdRepositoryImpl3.e, "Failed to receive device id from remote providers, error = " + th, null, 2, null);
                                                deviceIdRepositoryImpl2 = deviceIdRepositoryImpl3;
                                                ui50Var3 = ui50Var4;
                                            }
                                        }
                                        Logger.DefaultImpls.info$default(deviceIdRepositoryImpl2.e, "Device id will be generated", null, 2, null);
                                        this.L$0 = ui50Var3;
                                        this.L$1 = deviceIdRepositoryImpl2;
                                        this.L$2 = null;
                                        this.L$3 = null;
                                        this.label = 7;
                                        obj = DeviceIdRepositoryImpl.access$generateDeviceId(deviceIdRepositoryImpl2, this);
                                        if (obj == coroutineSingletons) {
                                        }
                                        deviceIdRepositoryImpl5 = deviceIdRepositoryImpl2;
                                        str2 = (String) obj;
                                        this.L$0 = ui50Var3;
                                        this.L$1 = deviceIdRepositoryImpl5;
                                        this.L$2 = str2;
                                        this.label = 8;
                                        break;
                                    }
                                }
                                return coroutineSingletons;
                            } catch (Throwable th2) {
                                r2 = ui50Var;
                                th = th2;
                                r2.c(null);
                                throw th;
                            }
                        case 2:
                            deviceIdRepositoryImpl = (DeviceIdRepositoryImpl) this.L$1;
                            ui50Var2 = (ui50) this.L$0;
                            kotlin.a.a(obj);
                            obj3 = ((Result) obj).d();
                            if (!(obj3 instanceof Result.Failure)) {
                            }
                            a = Result.a(obj3);
                            if (a != null) {
                            }
                            ui50Var3 = ui50Var2;
                            DeviceIdReadOnlyDataSource deviceIdReadOnlyDataSource2 = deviceIdRepositoryImpl.b;
                            this.L$0 = ui50Var3;
                            this.L$1 = deviceIdRepositoryImpl;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.label = 4;
                            mo96getDeviceIdIoAF18A = deviceIdReadOnlyDataSource2.mo96getDeviceIdIoAF18A(this);
                            if (mo96getDeviceIdIoAF18A != coroutineSingletons) {
                            }
                            break;
                        case 3:
                            a = (Throwable) this.L$3;
                            deviceIdRepositoryImpl = (DeviceIdRepositoryImpl) this.L$1;
                            ui50Var2 = (ui50) this.L$0;
                            kotlin.a.a(obj);
                            Logger.DefaultImpls.info$default(deviceIdRepositoryImpl.e, "Failed to read device id from local, error = " + a, null, 2, null);
                            ui50Var3 = ui50Var2;
                            DeviceIdReadOnlyDataSource deviceIdReadOnlyDataSource22 = deviceIdRepositoryImpl.b;
                            this.L$0 = ui50Var3;
                            this.L$1 = deviceIdRepositoryImpl;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.label = 4;
                            mo96getDeviceIdIoAF18A = deviceIdReadOnlyDataSource22.mo96getDeviceIdIoAF18A(this);
                            if (mo96getDeviceIdIoAF18A != coroutineSingletons) {
                            }
                            break;
                        case 4:
                            deviceIdRepositoryImpl2 = (DeviceIdRepositoryImpl) this.L$1;
                            ui50Var3 = (ui50) this.L$0;
                            kotlin.a.a(obj);
                            mo96getDeviceIdIoAF18A = ((Result) obj).d();
                            if (!(mo96getDeviceIdIoAF18A instanceof Result.Failure)) {
                            }
                            a2 = Result.a(mo96getDeviceIdIoAF18A);
                            if (a2 != null) {
                            }
                            Logger.DefaultImpls.info$default(deviceIdRepositoryImpl2.e, "Device id will be generated", null, 2, null);
                            this.L$0 = ui50Var3;
                            this.L$1 = deviceIdRepositoryImpl2;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.label = 7;
                            obj = DeviceIdRepositoryImpl.access$generateDeviceId(deviceIdRepositoryImpl2, this);
                            if (obj == coroutineSingletons) {
                            }
                            deviceIdRepositoryImpl5 = deviceIdRepositoryImpl2;
                            str2 = (String) obj;
                            this.L$0 = ui50Var3;
                            this.L$1 = deviceIdRepositoryImpl5;
                            this.L$2 = str2;
                            this.label = 8;
                            break;
                        case 5:
                            str = (String) this.L$2;
                            deviceIdRepositoryImpl4 = (DeviceIdRepositoryImpl) this.L$1;
                            ui50Var3 = (ui50) this.L$0;
                            kotlin.a.a(obj);
                            String str72 = deviceIdRepositoryImpl4.f = str;
                            ui50Var3.c(null);
                            return str72;
                        case 6:
                            th = (Throwable) this.L$3;
                            deviceIdRepositoryImpl3 = (DeviceIdRepositoryImpl) this.L$1;
                            ui50Var4 = (ui50) this.L$0;
                            try {
                                kotlin.a.a(obj);
                                Logger.DefaultImpls.info$default(deviceIdRepositoryImpl3.e, "Failed to receive device id from remote providers, error = " + th, null, 2, null);
                                deviceIdRepositoryImpl2 = deviceIdRepositoryImpl3;
                                ui50Var3 = ui50Var4;
                                Logger.DefaultImpls.info$default(deviceIdRepositoryImpl2.e, "Device id will be generated", null, 2, null);
                                this.L$0 = ui50Var3;
                                this.L$1 = deviceIdRepositoryImpl2;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.label = 7;
                                obj = DeviceIdRepositoryImpl.access$generateDeviceId(deviceIdRepositoryImpl2, this);
                                if (obj == coroutineSingletons) {
                                }
                                deviceIdRepositoryImpl5 = deviceIdRepositoryImpl2;
                                str2 = (String) obj;
                                this.L$0 = ui50Var3;
                                this.L$1 = deviceIdRepositoryImpl5;
                                this.L$2 = str2;
                                this.label = 8;
                                break;
                            } catch (Throwable th3) {
                                th = th3;
                                r2 = ui50Var4;
                                r2.c(null);
                                throw th;
                            }
                            break;
                        case 7:
                            deviceIdRepositoryImpl2 = (DeviceIdRepositoryImpl) this.L$1;
                            ui50Var3 = (ui50) this.L$0;
                            kotlin.a.a(obj);
                            deviceIdRepositoryImpl5 = deviceIdRepositoryImpl2;
                            str2 = (String) obj;
                            this.L$0 = ui50Var3;
                            this.L$1 = deviceIdRepositoryImpl5;
                            this.L$2 = str2;
                            this.label = 8;
                            break;
                        case 8:
                            str2 = (String) this.L$2;
                            deviceIdRepositoryImpl5 = (DeviceIdRepositoryImpl) this.L$1;
                            ui50Var3 = (ui50) this.L$0;
                            kotlin.a.a(obj);
                            String str8 = deviceIdRepositoryImpl5.f = str2;
                            ui50Var3.c(null);
                            return str8;
                        default:
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } catch (Throwable th4) {
                    th = th4;
                    r2 = obj2;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        }
    }

    /* compiled from: DeviceIdRepositoryImpl.kt */
    @b6l(c = "com.vk.push.core.deviceid.DeviceIdRepositoryImpl$getDeviceIdBlocking$1", f = "DeviceIdRepositoryImpl.kt", l = {72}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super String>, Object> {
        int label;

        public b(spj<? super b> spjVar) {
            super(2, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return DeviceIdRepositoryImpl.this.new b(spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super String> spjVar) {
            return ((b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                return obj;
            }
            kotlin.a.a(obj);
            DeviceIdRepositoryImpl deviceIdRepositoryImpl = DeviceIdRepositoryImpl.this;
            this.label = 1;
            Object deviceId = deviceIdRepositoryImpl.getDeviceId(this);
            return deviceId == coroutineSingletons ? coroutineSingletons : deviceId;
        }
    }

    public DeviceIdRepositoryImpl(DeviceIdDataSource deviceIdDataSource, DeviceIdReadOnlyDataSource deviceIdReadOnlyDataSource, DeviceIdGenerator deviceIdGenerator, ovj ovjVar, Logger logger) {
        this.a = deviceIdDataSource;
        this.b = deviceIdReadOnlyDataSource;
        this.c = deviceIdGenerator;
        this.d = ovjVar;
        this.e = logger.createLogger("DeviceIdRepository");
        this.f = DEFAULT_DEVICE_ID;
        this.g = bay.a();
        caj0 b2 = lyd.b(5, 0, null, 6);
        this.h = b2;
        this.i = b2;
    }

    public static final boolean access$canUseCache(DeviceIdRepositoryImpl deviceIdRepositoryImpl) {
        return !epx.f(deviceIdRepositoryImpl.f, DEFAULT_DEVICE_ID);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$generateDeviceId(DeviceIdRepositoryImpl deviceIdRepositoryImpl, spj spjVar) {
        com.vk.push.core.deviceid.a aVar;
        int i;
        Collection collection;
        deviceIdRepositoryImpl.getClass();
        if (spjVar instanceof com.vk.push.core.deviceid.a) {
            aVar = (com.vk.push.core.deviceid.a) spjVar;
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
                    String str = (String) aVar.L$0;
                    kotlin.a.a(obj);
                    return str;
                }
                kotlin.a.a(obj);
                String generateDeviceId = deviceIdRepositoryImpl.c.generateDeviceId();
                caj0 caj0Var = deviceIdRepositoryImpl.h;
                synchronized (caj0Var) {
                    int o = (int) ((caj0Var.o() + caj0Var.l) - caj0Var.j);
                    if (o == 0) {
                        collection = EmptyList.b;
                    } else {
                        ArrayList arrayList = new ArrayList(o);
                        Object[] objArr = caj0Var.i;
                        for (int i3 = 0; i3 < o; i3++) {
                            arrayList.add(lyd.c(objArr, caj0Var.j + i3));
                        }
                        collection = arrayList;
                    }
                }
                if (!collection.isEmpty()) {
                    caj0 caj0Var2 = deviceIdRepositoryImpl.h;
                    DeviceIdRepository.DeviceIdError deviceIdError = new DeviceIdRepository.DeviceIdError(new Exception(go9.b("Device id new value ", generateDeviceId)), "DeviceId: corrupted, generating new");
                    aVar.L$0 = generateDeviceId;
                    aVar.label = 1;
                    if (caj0Var2.emit(deviceIdError, aVar) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return generateDeviceId;
            }
        }
        aVar = new com.vk.push.core.deviceid.a(deviceIdRepositoryImpl, spjVar);
        Object obj2 = aVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = aVar.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0095, code lost:
    
        if (r10.emit(r2, r0) == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0097, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
    
        if (r10 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$saveToLocal(DeviceIdRepositoryImpl deviceIdRepositoryImpl, String str, spj spjVar) {
        com.vk.push.core.deviceid.b bVar;
        int i;
        Object mo95setDeviceIdgIAlus;
        DeviceIdRepositoryImpl deviceIdRepositoryImpl2;
        Object obj;
        deviceIdRepositoryImpl.getClass();
        if (spjVar instanceof com.vk.push.core.deviceid.b) {
            bVar = (com.vk.push.core.deviceid.b) spjVar;
            int i2 = bVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.label = i2 - Integer.MIN_VALUE;
                Object obj2 = bVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bVar.label;
                if (i != 0) {
                    kotlin.a.a(obj2);
                    DeviceIdDataSource deviceIdDataSource = deviceIdRepositoryImpl.a;
                    bVar.L$0 = deviceIdRepositoryImpl;
                    bVar.L$1 = str;
                    bVar.label = 1;
                    mo95setDeviceIdgIAlus = deviceIdDataSource.mo95setDeviceIdgIAlus(str, bVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        obj = bVar.L$1;
                        deviceIdRepositoryImpl2 = (DeviceIdRepositoryImpl) bVar.L$0;
                        kotlin.a.a(obj2);
                        Logger.DefaultImpls.info$default(deviceIdRepositoryImpl2.e, "Device id cannot be saved locally, error = " + Result.a(obj), null, 2, null);
                        return s3q0.a;
                    }
                    str = (String) bVar.L$1;
                    deviceIdRepositoryImpl = (DeviceIdRepositoryImpl) bVar.L$0;
                    kotlin.a.a(obj2);
                    mo95setDeviceIdgIAlus = ((Result) obj2).d();
                }
                String str2 = str;
                deviceIdRepositoryImpl2 = deviceIdRepositoryImpl;
                obj = mo95setDeviceIdgIAlus;
                if (obj instanceof Result.Failure) {
                    Logger.DefaultImpls.info$default(deviceIdRepositoryImpl2.e, go9.b("Device id saved, value = ", str2), null, 2, null);
                    return s3q0.a;
                }
                caj0 caj0Var = deviceIdRepositoryImpl2.h;
                Throwable a2 = Result.a(obj);
                if (a2 == null) {
                    a2 = new Exception("Unknown exception");
                }
                DeviceIdRepository.DeviceIdError deviceIdError = new DeviceIdRepository.DeviceIdError(a2, "DeviceId: failed to save to local");
                bVar.L$0 = deviceIdRepositoryImpl2;
                bVar.L$1 = obj;
                bVar.label = 2;
            }
        }
        bVar = new com.vk.push.core.deviceid.b(deviceIdRepositoryImpl, spjVar);
        Object obj22 = bVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bVar.label;
        if (i != 0) {
        }
        String str22 = str;
        deviceIdRepositoryImpl2 = deviceIdRepositoryImpl;
        obj = mo95setDeviceIdgIAlus;
        if (obj instanceof Result.Failure) {
        }
    }

    @Override // com.vk.push.core.DeviceIdRepository
    public Object getDeviceId(spj<? super String> spjVar) {
        return myc0.k(this.d, new a(null), spjVar);
    }

    @Override // com.vk.push.core.DeviceIdRepository
    public String getDeviceIdBlocking() {
        return (String) myc0.i(EmptyCoroutineContext.b, new b(null));
    }

    @Override // com.vk.push.core.DeviceIdRepository
    public ksr<DeviceIdRepository.DeviceIdError> getErrorsFlow() {
        return this.i;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DeviceIdRepositoryImpl(DeviceIdDataSource deviceIdDataSource, DeviceIdReadOnlyDataSource deviceIdReadOnlyDataSource, DeviceIdGenerator deviceIdGenerator, ovj ovjVar, Logger logger, int i, zcl zclVar) {
        this(deviceIdDataSource, deviceIdReadOnlyDataSource, deviceIdGenerator, ovjVar, logger);
        if ((i & 8) != 0) {
            bdn bdnVar = bdn.a;
            ovjVar = wgl.c;
        }
    }
}
