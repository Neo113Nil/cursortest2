package com.vk.push.core.data.repository;

import android.content.Context;
import com.vk.push.core.filedatastore.FileDataSource;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;
import xsna.drm0;
import xsna.j5g;
import xsna.s3q0;
import xsna.spj;
import xsna.zcl;

/* compiled from: IssueKeyBlackListRepository.kt */
/* loaded from: classes.dex */
public final class IssueKeyBlackListRepository {

    @Deprecated
    public static final String FILE_NAME = "issue_keys_black_list.txt";
    public final FileDataSource a;

    /* compiled from: IssueKeyBlackListRepository.kt */
    @b6l(c = "com.vk.push.core.data.repository.IssueKeyBlackListRepository", f = "IssueKeyBlackListRepository.kt", l = {16}, m = "getBlackList")
    /* loaded from: classes5.dex */
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
            return IssueKeyBlackListRepository.this.getBlackList(this);
        }
    }

    /* compiled from: IssueKeyBlackListRepository.kt */
    @b6l(c = "com.vk.push.core.data.repository.IssueKeyBlackListRepository", f = "IssueKeyBlackListRepository.kt", l = {12}, m = "setBlackList")
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
            return IssueKeyBlackListRepository.this.setBlackList(null, this);
        }
    }

    public IssueKeyBlackListRepository(Context context, FileDataSource fileDataSource) {
        this.a = fileDataSource;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getBlackList(spj<? super List<String>> spjVar) {
        a aVar;
        int i;
        Object m99getDataIoAF18A;
        if (spjVar instanceof a) {
            aVar = (a) spjVar;
            int i2 = aVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.label = i2 - Integer.MIN_VALUE;
                Object obj = aVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = aVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    aVar.label = 1;
                    m99getDataIoAF18A = this.a.m99getDataIoAF18A(aVar);
                    if (m99getDataIoAF18A == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    m99getDataIoAF18A = ((Result) obj).d();
                }
                if (m99getDataIoAF18A instanceof Result.Failure) {
                    m99getDataIoAF18A = null;
                }
                String str = (String) m99getDataIoAF18A;
                return str == null ? drm0.c0(str, new String[]{StringUtils.COMMA}, 0, 6) : EmptyList.b;
            }
        }
        aVar = new a(spjVar);
        Object obj2 = aVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = aVar.label;
        if (i != 0) {
        }
        if (m99getDataIoAF18A instanceof Result.Failure) {
        }
        String str2 = (String) m99getDataIoAF18A;
        if (str2 == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object setBlackList(List<String> list, spj<? super s3q0> spjVar) {
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
                if (i != 0) {
                    kotlin.a.a(obj);
                    String g0 = j5g.g0(list, StringUtils.COMMA, null, null, 0, null, 62);
                    bVar.label = 1;
                    if (this.a.m100setDatagIAlus(g0, bVar) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    ((Result) obj).getClass();
                }
                return s3q0.a;
            }
        }
        bVar = new b(spjVar);
        Object obj2 = bVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bVar.label;
        if (i != 0) {
        }
        return s3q0.a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ IssueKeyBlackListRepository(Context context, FileDataSource fileDataSource, int i, zcl zclVar) {
        this(r1, fileDataSource);
        Context context2;
        if ((i & 2) != 0) {
            context2 = context;
            fileDataSource = new FileDataSource(context2, FILE_NAME, null, 4, null);
        } else {
            context2 = context;
        }
    }
}
