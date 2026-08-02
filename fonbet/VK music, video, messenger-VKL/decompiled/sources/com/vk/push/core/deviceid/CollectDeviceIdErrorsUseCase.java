package com.vk.push.core.deviceid;

import com.vk.push.common.Logger;
import com.vk.push.core.DeviceIdRepository;
import com.vk.push.core.data.repository.CrashReporterRepository;
import com.vk.push.core.data.repository.IssueKey;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.bdn;
import xsna.fw3;
import xsna.ksr;
import xsna.lsr;
import xsna.myc0;
import xsna.s3q0;
import xsna.spj;
import xsna.wgl;
import xsna.wzs;
import xsna.yvj;

/* compiled from: CollectDeviceIdErrorsUseCase.kt */
/* loaded from: classes5.dex */
public final class CollectDeviceIdErrorsUseCase {
    public final DeviceIdRepository a;
    public final CrashReporterRepository b;
    public final Logger c;
    public final yvj d;

    /* compiled from: CollectDeviceIdErrorsUseCase.kt */
    @b6l(c = "com.vk.push.core.deviceid.CollectDeviceIdErrorsUseCase$invoke$1", f = "CollectDeviceIdErrorsUseCase.kt", l = {19, 20}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        Object L$0;
        Object L$1;
        int label;

        /* compiled from: CollectDeviceIdErrorsUseCase.kt */
        /* renamed from: com.vk.push.core.deviceid.CollectDeviceIdErrorsUseCase$a$a, reason: collision with other inner class name */
        public static final class C1730a<T> implements lsr {
            public final /* synthetic */ CollectDeviceIdErrorsUseCase b;

            public C1730a(CollectDeviceIdErrorsUseCase collectDeviceIdErrorsUseCase) {
                this.b = collectDeviceIdErrorsUseCase;
            }

            @Override // xsna.lsr
            public final Object emit(Object obj, spj spjVar) {
                this.b.b.nonFatalReport(((DeviceIdRepository.DeviceIdError) obj).getException(), IssueKey.DEVICE_ID_ERROR);
                return s3q0.a;
            }
        }

        public a(spj<? super a> spjVar) {
            super(2, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return CollectDeviceIdErrorsUseCase.this.new a(spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0071, code lost:
        
            if (r7.collect(r2, r6) == r0) goto L16;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            StringBuilder e;
            Logger logger;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                Logger logger2 = CollectDeviceIdErrorsUseCase.this.c;
                e = fw3.e("Device ID = ");
                DeviceIdRepository deviceIdRepository = CollectDeviceIdErrorsUseCase.this.a;
                this.L$0 = logger2;
                this.L$1 = e;
                this.label = 1;
                Object deviceId = deviceIdRepository.getDeviceId(this);
                if (deviceId != coroutineSingletons) {
                    logger = logger2;
                    obj = deviceId;
                }
                return coroutineSingletons;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                return s3q0.a;
            }
            e = (StringBuilder) this.L$1;
            logger = (Logger) this.L$0;
            kotlin.a.a(obj);
            e.append((String) obj);
            Logger.DefaultImpls.info$default(logger, e.toString(), null, 2, null);
            ksr<DeviceIdRepository.DeviceIdError> errorsFlow = CollectDeviceIdErrorsUseCase.this.a.getErrorsFlow();
            C1730a c1730a = new C1730a(CollectDeviceIdErrorsUseCase.this);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
        }
    }

    public CollectDeviceIdErrorsUseCase(DeviceIdRepository deviceIdRepository, CrashReporterRepository crashReporterRepository, Logger logger, yvj yvjVar) {
        this.a = deviceIdRepository;
        this.b = crashReporterRepository;
        this.c = logger;
        this.d = yvjVar;
    }

    public final void invoke() {
        bdn bdnVar = bdn.a;
        myc0.h(this.d, wgl.c, null, new a(null), 2);
    }
}
