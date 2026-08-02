package com.vk.push.core.data.repository;

import com.vk.push.common.Logger;
import java.util.List;
import java.util.Locale;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.bdn;
import xsna.myc0;
import xsna.s3q0;
import xsna.spj;
import xsna.wgl;
import xsna.wzs;
import xsna.yvj;
import xsna.zcl;
import xsna.zvj;

/* compiled from: CrashSenderImpl.kt */
/* loaded from: classes.dex */
public final class CrashSenderImpl implements CrashReporterRepository {
    public final CrashReporterRepository a;
    public final IssueKeyBlackListRepository b;
    public final yvj c;
    public final Logger d;

    /* compiled from: CrashSenderImpl.kt */
    @b6l(c = "com.vk.push.core.data.repository.CrashSenderImpl$nonFatalReport$1", f = "CrashSenderImpl.kt", l = {20}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ Throwable $error;
        final /* synthetic */ IssueKey $issueKey;
        Object L$0;
        int label;
        final /* synthetic */ CrashSenderImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(IssueKey issueKey, CrashSenderImpl crashSenderImpl, Throwable th, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$issueKey = issueKey;
            this.this$0 = crashSenderImpl;
            this.$error = th;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$issueKey, this.this$0, this.$error, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String str;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                String lowerCase = this.$issueKey.name().toLowerCase(Locale.ROOT);
                IssueKeyBlackListRepository issueKeyBlackListRepository = this.this$0.b;
                this.L$0 = lowerCase;
                this.label = 1;
                Object blackList = issueKeyBlackListRepository.getBlackList(this);
                if (blackList == coroutineSingletons) {
                    return coroutineSingletons;
                }
                str = lowerCase;
                obj = blackList;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) this.L$0;
                kotlin.a.a(obj);
            }
            if (!((List) obj).contains(str)) {
                Logger.DefaultImpls.error$default(this.this$0.d, "issueKey: " + this.$issueKey + ", error: " + this.$error, null, 2, null);
                this.this$0.a.nonFatalReport(this.$error, this.$issueKey);
            }
            return s3q0.a;
        }
    }

    public CrashSenderImpl(CrashReporterRepository crashReporterRepository, IssueKeyBlackListRepository issueKeyBlackListRepository, yvj yvjVar, Logger logger) {
        this.a = crashReporterRepository;
        this.b = issueKeyBlackListRepository;
        this.c = yvjVar;
        this.d = logger.createLogger("ErrorSender");
    }

    @Override // com.vk.push.core.data.repository.CrashReporterRepository
    public void nonFatalReport(Throwable th, IssueKey issueKey) {
        myc0.h(this.c, null, null, new a(issueKey, this, th, null), 3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CrashSenderImpl(CrashReporterRepository crashReporterRepository, IssueKeyBlackListRepository issueKeyBlackListRepository, yvj yvjVar, Logger logger, int i, zcl zclVar) {
        this(crashReporterRepository, issueKeyBlackListRepository, yvjVar, logger);
        if ((i & 4) != 0) {
            bdn bdnVar = bdn.a;
            yvjVar = zvj.a(wgl.c);
        }
    }
}
