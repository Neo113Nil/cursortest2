package com.vk.push.core.filedatastore;

import android.content.Context;
import com.vk.push.core.data.repository.CrashReporterRepository;
import com.vk.push.core.data.repository.IssueKey;
import com.vk.push.core.filedatastore.JsonSerializer;
import com.vk.push.core.filedatastore.migration.Migration;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.b6l;
import xsna.bay;
import xsna.drm0;
import xsna.fo8;
import xsna.izs;
import xsna.myc0;
import xsna.pay;
import xsna.qay;
import xsna.ray;
import xsna.s3q0;
import xsna.say;
import xsna.spj;
import xsna.ui50;
import xsna.wi50;
import xsna.wzs;
import xsna.yvj;
import xsna.zcl;

/* compiled from: JsonSerializableFileDataStoreImpl.kt */
/* loaded from: classes.dex */
public final class JsonSerializableFileDataStoreImpl<T extends JsonSerializer> implements FileDataStore<T> {
    public final String a;
    public final JsonDeserializer<T> b;
    public final Migration<T> c;
    public final CrashReporterRepository d;
    public final boolean e;
    public final boolean f;
    public final yvj g;
    public final FileDataSource h;
    public final wi50 i;
    public volatile T j;

    /* compiled from: JsonSerializableFileDataStoreImpl.kt */
    @b6l(c = "com.vk.push.core.filedatastore.JsonSerializableFileDataStoreImpl$clear$2", f = "JsonSerializableFileDataStoreImpl.kt", l = {237, 144}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super Boolean>, Object> {
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ JsonSerializableFileDataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(JsonSerializableFileDataStoreImpl<T> jsonSerializableFileDataStoreImpl, spj<? super a> spjVar) {
            super(2, spjVar);
            this.this$0 = jsonSerializableFileDataStoreImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.this$0, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super Boolean> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x0047, code lost:
        
            if (r8.b(r7) == r0) goto L19;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            ui50 ui50Var;
            JsonSerializableFileDataStoreImpl<T> jsonSerializableFileDataStoreImpl;
            ui50 ui50Var2;
            Throwable th;
            Object obj2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            try {
                if (i == 0) {
                    kotlin.a.a(obj);
                    ui50Var = this.this$0.i;
                    jsonSerializableFileDataStoreImpl = this.this$0;
                    this.L$0 = ui50Var;
                    this.L$1 = jsonSerializableFileDataStoreImpl;
                    this.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ui50Var2 = (ui50) this.L$0;
                        try {
                            kotlin.a.a(obj);
                            obj2 = ((Result) obj).d();
                            Boolean valueOf = Boolean.valueOf(!(obj2 instanceof Result.Failure));
                            ui50Var2.c(null);
                            return valueOf;
                        } catch (Throwable th2) {
                            th = th2;
                            ui50Var2.c(null);
                            throw th;
                        }
                    }
                    jsonSerializableFileDataStoreImpl = (JsonSerializableFileDataStoreImpl) this.L$1;
                    ui50 ui50Var3 = (ui50) this.L$0;
                    kotlin.a.a(obj);
                    ui50Var = ui50Var3;
                }
                jsonSerializableFileDataStoreImpl.j = null;
                FileDataSource fileDataSource = jsonSerializableFileDataStoreImpl.h;
                String str = new String();
                this.L$0 = ui50Var;
                this.L$1 = null;
                this.label = 2;
                Object m100setDatagIAlus = fileDataSource.m100setDatagIAlus(str, this);
                if (m100setDatagIAlus != coroutineSingletons) {
                    ui50Var2 = ui50Var;
                    obj2 = m100setDatagIAlus;
                    Boolean valueOf2 = Boolean.valueOf(!(obj2 instanceof Result.Failure));
                    ui50Var2.c(null);
                    return valueOf2;
                }
                return coroutineSingletons;
            } catch (Throwable th3) {
                ui50Var2 = ui50Var;
                th = th3;
                ui50Var2.c(null);
                throw th;
            }
        }
    }

    /* compiled from: JsonSerializableFileDataStoreImpl.kt */
    @b6l(c = "com.vk.push.core.filedatastore.JsonSerializableFileDataStoreImpl$edit$2", f = "JsonSerializableFileDataStoreImpl.kt", l = {237, 66, 69}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super Boolean>, Object> {
        final /* synthetic */ izs<T, T> $transform;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ JsonSerializableFileDataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(JsonSerializableFileDataStoreImpl<T> jsonSerializableFileDataStoreImpl, izs<? super T, ? extends T> izsVar, spj<? super b> spjVar) {
            super(2, spjVar);
            this.this$0 = jsonSerializableFileDataStoreImpl;
            this.$transform = izsVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new b(this.this$0, this.$transform, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super Boolean> spjVar) {
            return ((b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x00ab  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x008c  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0097 A[Catch: all -> 0x0041, TRY_LEAVE, TryCatch #1 {all -> 0x0041, blocks: (B:24:0x0037, B:25:0x0088, B:28:0x008d, B:30:0x0097), top: B:23:0x0037 }] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00ad  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            ui50 ui50Var;
            JsonSerializableFileDataStoreImpl<T> jsonSerializableFileDataStoreImpl;
            izs izsVar;
            ui50 ui50Var2;
            Throwable th;
            ui50 ui50Var3;
            Object obj2;
            JsonSerializableFileDataStoreImpl<T> jsonSerializableFileDataStoreImpl2;
            JsonSerializer jsonSerializer;
            Object m102access$writeUnsafegIAlus;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            boolean z = false;
            try {
                if (i == 0) {
                    kotlin.a.a(obj);
                    ui50Var = this.this$0.i;
                    JsonSerializableFileDataStoreImpl<T> jsonSerializableFileDataStoreImpl3 = this.this$0;
                    izs<T, T> izsVar2 = this.$transform;
                    this.L$0 = ui50Var;
                    this.L$1 = jsonSerializableFileDataStoreImpl3;
                    this.L$2 = izsVar2;
                    this.label = 1;
                    if (ui50Var.b(this) != coroutineSingletons) {
                        jsonSerializableFileDataStoreImpl = jsonSerializableFileDataStoreImpl3;
                        izsVar = izsVar2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ui50Var2 = (ui50) this.L$0;
                        try {
                            kotlin.a.a(obj);
                            m102access$writeUnsafegIAlus = ((Result) obj).d();
                            if (!(m102access$writeUnsafegIAlus instanceof Result.Failure)) {
                                z = true;
                            }
                            Boolean valueOf = Boolean.valueOf(z);
                            ui50Var2.c(null);
                            return valueOf;
                        } catch (Throwable th2) {
                            th = th2;
                            ui50Var2.c(null);
                            throw th;
                        }
                    }
                    izsVar = (izs) this.L$2;
                    jsonSerializableFileDataStoreImpl2 = (JsonSerializableFileDataStoreImpl) this.L$1;
                    ui50Var3 = (ui50) this.L$0;
                    try {
                        kotlin.a.a(obj);
                        obj2 = ((Result) obj).d();
                        if (obj2 instanceof Result.Failure) {
                            obj2 = null;
                        }
                        jsonSerializer = (JsonSerializer) izsVar.invoke((JsonSerializer) obj2);
                        if (jsonSerializer != null) {
                            ui50Var2 = ui50Var3;
                            Boolean valueOf2 = Boolean.valueOf(z);
                            ui50Var2.c(null);
                            return valueOf2;
                        }
                        this.L$0 = ui50Var3;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 3;
                        m102access$writeUnsafegIAlus = JsonSerializableFileDataStoreImpl.m102access$writeUnsafegIAlus(jsonSerializableFileDataStoreImpl2, jsonSerializer, this);
                        if (m102access$writeUnsafegIAlus != coroutineSingletons) {
                            ui50Var2 = ui50Var3;
                            if (!(m102access$writeUnsafegIAlus instanceof Result.Failure)) {
                            }
                            Boolean valueOf22 = Boolean.valueOf(z);
                            ui50Var2.c(null);
                            return valueOf22;
                        }
                        return coroutineSingletons;
                    } catch (Throwable th3) {
                        th = th3;
                        ui50Var2 = ui50Var3;
                        ui50Var2.c(null);
                        throw th;
                    }
                }
                izsVar = (izs) this.L$2;
                jsonSerializableFileDataStoreImpl = (JsonSerializableFileDataStoreImpl) this.L$1;
                ui50 ui50Var4 = (ui50) this.L$0;
                kotlin.a.a(obj);
                ui50Var = ui50Var4;
                this.L$0 = ui50Var;
                this.L$1 = jsonSerializableFileDataStoreImpl;
                this.L$2 = izsVar;
                this.label = 2;
                Object m101access$readUnsafeIoAF18A = JsonSerializableFileDataStoreImpl.m101access$readUnsafeIoAF18A(jsonSerializableFileDataStoreImpl, this);
                if (m101access$readUnsafeIoAF18A != coroutineSingletons) {
                    JsonSerializableFileDataStoreImpl<T> jsonSerializableFileDataStoreImpl4 = jsonSerializableFileDataStoreImpl;
                    ui50Var3 = ui50Var;
                    obj2 = m101access$readUnsafeIoAF18A;
                    jsonSerializableFileDataStoreImpl2 = jsonSerializableFileDataStoreImpl4;
                    if (obj2 instanceof Result.Failure) {
                    }
                    jsonSerializer = (JsonSerializer) izsVar.invoke((JsonSerializer) obj2);
                    if (jsonSerializer != null) {
                    }
                }
                return coroutineSingletons;
            } catch (Throwable th4) {
                ui50Var2 = ui50Var;
                th = th4;
                ui50Var2.c(null);
                throw th;
            }
        }
    }

    /* compiled from: JsonSerializableFileDataStoreImpl.kt */
    @b6l(c = "com.vk.push.core.filedatastore.JsonSerializableFileDataStoreImpl$read$2", f = "JsonSerializableFileDataStoreImpl.kt", l = {237, 59}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements wzs<yvj, spj<? super T>, Object> {
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ JsonSerializableFileDataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(JsonSerializableFileDataStoreImpl<T> jsonSerializableFileDataStoreImpl, spj<? super c> spjVar) {
            super(2, spjVar);
            this.this$0 = jsonSerializableFileDataStoreImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new c(this.this$0, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, Object obj) {
            return ((c) create(yvjVar, (spj) obj)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:31:0x0047, code lost:
        
            if (r7.b(r6) == r0) goto L19;
         */
        /* JADX WARN: Removed duplicated region for block: B:10:0x005e  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            ui50 ui50Var;
            JsonSerializableFileDataStoreImpl<T> jsonSerializableFileDataStoreImpl;
            ui50 ui50Var2;
            Throwable th;
            Object obj2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            try {
                if (i == 0) {
                    kotlin.a.a(obj);
                    ui50Var = this.this$0.i;
                    jsonSerializableFileDataStoreImpl = this.this$0;
                    this.L$0 = ui50Var;
                    this.L$1 = jsonSerializableFileDataStoreImpl;
                    this.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ui50Var2 = (ui50) this.L$0;
                        try {
                            kotlin.a.a(obj);
                            obj2 = ((Result) obj).d();
                            if (obj2 instanceof Result.Failure) {
                                obj2 = null;
                            }
                            JsonSerializer jsonSerializer = (JsonSerializer) obj2;
                            ui50Var2.c(null);
                            return jsonSerializer;
                        } catch (Throwable th2) {
                            th = th2;
                            ui50Var2.c(null);
                            throw th;
                        }
                    }
                    jsonSerializableFileDataStoreImpl = (JsonSerializableFileDataStoreImpl) this.L$1;
                    ui50 ui50Var3 = (ui50) this.L$0;
                    kotlin.a.a(obj);
                    ui50Var = ui50Var3;
                }
                this.L$0 = ui50Var;
                this.L$1 = null;
                this.label = 2;
                Object m101access$readUnsafeIoAF18A = JsonSerializableFileDataStoreImpl.m101access$readUnsafeIoAF18A(jsonSerializableFileDataStoreImpl, this);
                if (m101access$readUnsafeIoAF18A != coroutineSingletons) {
                    ui50Var2 = ui50Var;
                    obj2 = m101access$readUnsafeIoAF18A;
                    if (obj2 instanceof Result.Failure) {
                    }
                    JsonSerializer jsonSerializer2 = (JsonSerializer) obj2;
                    ui50Var2.c(null);
                    return jsonSerializer2;
                }
                return coroutineSingletons;
            } catch (Throwable th3) {
                ui50Var2 = ui50Var;
                th = th3;
                ui50Var2.c(null);
                throw th;
            }
        }
    }

    /* compiled from: JsonSerializableFileDataStoreImpl.kt */
    @b6l(c = "com.vk.push.core.filedatastore.JsonSerializableFileDataStoreImpl$write$2", f = "JsonSerializableFileDataStoreImpl.kt", l = {237, 51}, m = "invokeSuspend")
    public static final class d extends SuspendLambda implements wzs<yvj, spj<? super Boolean>, Object> {
        final /* synthetic */ T $data;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ JsonSerializableFileDataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(JsonSerializableFileDataStoreImpl<T> jsonSerializableFileDataStoreImpl, T t, spj<? super d> spjVar) {
            super(2, spjVar);
            this.this$0 = jsonSerializableFileDataStoreImpl;
            this.$data = t;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new d(this.this$0, this.$data, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super Boolean> spjVar) {
            return ((d) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:31:0x004f, code lost:
        
            if (r9.b(r8) == r0) goto L24;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            ui50 ui50Var;
            JsonSerializableFileDataStoreImpl<T> jsonSerializableFileDataStoreImpl;
            JsonSerializer jsonSerializer;
            ui50 ui50Var2;
            Throwable th;
            Object obj2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            try {
                if (i == 0) {
                    kotlin.a.a(obj);
                    ui50Var = this.this$0.i;
                    jsonSerializableFileDataStoreImpl = this.this$0;
                    jsonSerializer = this.$data;
                    this.L$0 = ui50Var;
                    this.L$1 = jsonSerializableFileDataStoreImpl;
                    this.L$2 = jsonSerializer;
                    this.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ui50Var2 = (ui50) this.L$0;
                        try {
                            kotlin.a.a(obj);
                            obj2 = ((Result) obj).d();
                            Boolean valueOf = Boolean.valueOf(!(obj2 instanceof Result.Failure));
                            ui50Var2.c(null);
                            return valueOf;
                        } catch (Throwable th2) {
                            th = th2;
                            ui50Var2.c(null);
                            throw th;
                        }
                    }
                    jsonSerializer = (JsonSerializer) this.L$2;
                    jsonSerializableFileDataStoreImpl = (JsonSerializableFileDataStoreImpl) this.L$1;
                    ui50 ui50Var3 = (ui50) this.L$0;
                    kotlin.a.a(obj);
                    ui50Var = ui50Var3;
                }
                if (jsonSerializableFileDataStoreImpl.e) {
                    jsonSerializableFileDataStoreImpl.j = jsonSerializer;
                }
                this.L$0 = ui50Var;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 2;
                Object m102access$writeUnsafegIAlus = JsonSerializableFileDataStoreImpl.m102access$writeUnsafegIAlus(jsonSerializableFileDataStoreImpl, jsonSerializer, this);
                if (m102access$writeUnsafegIAlus != coroutineSingletons) {
                    ui50Var2 = ui50Var;
                    obj2 = m102access$writeUnsafegIAlus;
                    Boolean valueOf2 = Boolean.valueOf(!(obj2 instanceof Result.Failure));
                    ui50Var2.c(null);
                    return valueOf2;
                }
                return coroutineSingletons;
            } catch (Throwable th3) {
                ui50Var2 = ui50Var;
                th = th3;
                ui50Var2.c(null);
                throw th;
            }
        }
    }

    public JsonSerializableFileDataStoreImpl(Context context, String str, JsonDeserializer<T> jsonDeserializer, Migration<T> migration, CrashReporterRepository crashReporterRepository, boolean z, boolean z2, yvj yvjVar, FileDataSource fileDataSource) {
        this.a = str;
        this.b = jsonDeserializer;
        this.c = migration;
        this.d = crashReporterRepository;
        this.e = z;
        this.f = z2;
        this.g = yvjVar;
        this.h = fileDataSource;
        this.i = bay.a();
        myc0.h(yvjVar, null, null, new ray(this, context.getApplicationContext(), null), 3);
    }

    public static void a(JsonSerializableFileDataStoreImpl jsonSerializableFileDataStoreImpl, Object obj, IssueKey issueKey) {
        if (!(obj instanceof Result.Failure)) {
            jsonSerializableFileDataStoreImpl.getClass();
            return;
        }
        jsonSerializableFileDataStoreImpl.d.nonFatalReport((Throwable) say.i.invoke(Result.a(obj)), issueKey);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: access$readUnsafe-IoAF18A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m101access$readUnsafeIoAF18A(JsonSerializableFileDataStoreImpl jsonSerializableFileDataStoreImpl, spj spjVar) {
        com.vk.push.core.filedatastore.a aVar;
        int i;
        Object m99getDataIoAF18A;
        JsonSerializableFileDataStoreImpl jsonSerializableFileDataStoreImpl2;
        Throwable a2;
        T failure;
        jsonSerializableFileDataStoreImpl.getClass();
        if (spjVar instanceof com.vk.push.core.filedatastore.a) {
            aVar = (com.vk.push.core.filedatastore.a) spjVar;
            int i2 = aVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.label = i2 - Integer.MIN_VALUE;
                Object obj = aVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = aVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    T t = jsonSerializableFileDataStoreImpl.j;
                    if (t != null) {
                        return t;
                    }
                    FileDataSource fileDataSource = jsonSerializableFileDataStoreImpl.h;
                    aVar.L$0 = jsonSerializableFileDataStoreImpl;
                    aVar.L$1 = jsonSerializableFileDataStoreImpl;
                    aVar.label = 1;
                    m99getDataIoAF18A = fileDataSource.m99getDataIoAF18A(aVar);
                    if (m99getDataIoAF18A == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    jsonSerializableFileDataStoreImpl2 = jsonSerializableFileDataStoreImpl;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jsonSerializableFileDataStoreImpl = (JsonSerializableFileDataStoreImpl) aVar.L$1;
                    jsonSerializableFileDataStoreImpl2 = (JsonSerializableFileDataStoreImpl) aVar.L$0;
                    kotlin.a.a(obj);
                    m99getDataIoAF18A = ((Result) obj).d();
                }
                a(jsonSerializableFileDataStoreImpl, m99getDataIoAF18A, IssueKey.FILE_DATA_STORE_READ_ERROR);
                a2 = Result.a(m99getDataIoAF18A);
                if (a2 == null) {
                    return new Result.Failure(new ReadException(a2, null, 2, null));
                }
                String str = (String) m99getDataIoAF18A;
                jsonSerializableFileDataStoreImpl2.getClass();
                if (drm0.N(str)) {
                    return new Result.Failure(new NoValueException(null, 1, null));
                }
                try {
                    T fromJson = jsonSerializableFileDataStoreImpl2.b.fromJson(new JSONObject(str));
                    jsonSerializableFileDataStoreImpl2.j = fromJson;
                    failure = fromJson;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                IssueKey issueKey = IssueKey.FILE_DATA_STORE_PARSE_ERROR;
                pay payVar = new pay(jsonSerializableFileDataStoreImpl2);
                if (failure instanceof Result.Failure) {
                    jsonSerializableFileDataStoreImpl2.d.nonFatalReport((Throwable) payVar.invoke(Result.a(failure)), issueKey);
                }
                Throwable a3 = Result.a(failure);
                if (a3 != null && jsonSerializableFileDataStoreImpl2.f && (a3 instanceof JSONException)) {
                    myc0.h(jsonSerializableFileDataStoreImpl2.g, null, null, new qay(jsonSerializableFileDataStoreImpl2, null), 3);
                }
                return failure;
            }
        }
        aVar = new com.vk.push.core.filedatastore.a(jsonSerializableFileDataStoreImpl, spjVar);
        Object obj2 = aVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = aVar.label;
        if (i != 0) {
        }
        a(jsonSerializableFileDataStoreImpl, m99getDataIoAF18A, IssueKey.FILE_DATA_STORE_READ_ERROR);
        a2 = Result.a(m99getDataIoAF18A);
        if (a2 == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: access$writeUnsafe-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m102access$writeUnsafegIAlus(JsonSerializableFileDataStoreImpl jsonSerializableFileDataStoreImpl, JsonSerializer jsonSerializer, spj spjVar) {
        com.vk.push.core.filedatastore.b bVar;
        int i;
        Object failure;
        Object m100setDatagIAlus;
        JsonSerializableFileDataStoreImpl jsonSerializableFileDataStoreImpl2;
        jsonSerializableFileDataStoreImpl.getClass();
        if (spjVar instanceof com.vk.push.core.filedatastore.b) {
            bVar = (com.vk.push.core.filedatastore.b) spjVar;
            int i2 = bVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.label = i2 - Integer.MIN_VALUE;
                Object obj = bVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    try {
                        failure = jsonSerializer.toJson();
                    } catch (Throwable th) {
                        failure = new Result.Failure(th);
                    }
                    Throwable a2 = Result.a(failure);
                    if (a2 != null) {
                        return new Result.Failure(new WriteException(a2, null, 2, null));
                    }
                    FileDataSource fileDataSource = jsonSerializableFileDataStoreImpl.h;
                    String jSONObject = ((JSONObject) failure).toString();
                    bVar.L$0 = jsonSerializableFileDataStoreImpl;
                    bVar.L$1 = jsonSerializer;
                    bVar.L$2 = jsonSerializableFileDataStoreImpl;
                    bVar.label = 1;
                    m100setDatagIAlus = fileDataSource.m100setDatagIAlus(jSONObject, bVar);
                    if (m100setDatagIAlus == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    jsonSerializableFileDataStoreImpl2 = jsonSerializableFileDataStoreImpl;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jsonSerializableFileDataStoreImpl = (JsonSerializableFileDataStoreImpl) bVar.L$2;
                    jsonSerializer = (T) bVar.L$1;
                    jsonSerializableFileDataStoreImpl2 = (JsonSerializableFileDataStoreImpl) bVar.L$0;
                    kotlin.a.a(obj);
                    m100setDatagIAlus = ((Result) obj).d();
                }
                a(jsonSerializableFileDataStoreImpl, m100setDatagIAlus, IssueKey.FILE_DATA_STORE_WRITE_ERROR);
                if (!(m100setDatagIAlus instanceof Result.Failure)) {
                    jsonSerializableFileDataStoreImpl2.j = (T) jsonSerializer;
                }
                return m100setDatagIAlus;
            }
        }
        bVar = new com.vk.push.core.filedatastore.b(jsonSerializableFileDataStoreImpl, spjVar);
        Object obj2 = bVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bVar.label;
        if (i != 0) {
        }
        a(jsonSerializableFileDataStoreImpl, m100setDatagIAlus, IssueKey.FILE_DATA_STORE_WRITE_ERROR);
        if (!(m100setDatagIAlus instanceof Result.Failure)) {
        }
        return m100setDatagIAlus;
    }

    @Override // com.vk.push.core.filedatastore.FileDataStore
    public Object clear(spj<? super Boolean> spjVar) {
        return myc0.k(this.g.getCoroutineContext(), new a(this, null), spjVar);
    }

    @Override // com.vk.push.core.filedatastore.FileDataStore
    public Object edit(izs<? super T, ? extends T> izsVar, spj<? super Boolean> spjVar) {
        return myc0.k(this.g.getCoroutineContext(), new b(this, izsVar, null), spjVar);
    }

    @Override // com.vk.push.core.filedatastore.FileDataStore
    public Object read(spj<? super T> spjVar) {
        return myc0.k(this.g.getCoroutineContext(), new c(this, null), spjVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.push.core.filedatastore.FileDataStore
    public /* bridge */ /* synthetic */ Object write(Object obj, spj spjVar) {
        return write((JsonSerializableFileDataStoreImpl<T>) obj, (spj<? super Boolean>) spjVar);
    }

    public Object write(T t, spj<? super Boolean> spjVar) {
        return myc0.k(this.g.getCoroutineContext(), new d(this, t, null), spjVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ JsonSerializableFileDataStoreImpl(Context context, String str, JsonDeserializer jsonDeserializer, Migration migration, CrashReporterRepository crashReporterRepository, boolean z, boolean z2, yvj yvjVar, FileDataSource fileDataSource, int i, zcl zclVar) {
        this(context, str, jsonDeserializer, migration, crashReporterRepository, z, z2, r11, r12);
        yvj yvjVar2;
        FileDataSource fileDataSource2;
        if ((i & 256) != 0) {
            yvjVar2 = yvjVar;
            fileDataSource2 = new FileDataSource(context.getApplicationContext(), fo8.a(str, ".json"), yvjVar2);
        } else {
            yvjVar2 = yvjVar;
            fileDataSource2 = fileDataSource;
        }
    }
}
