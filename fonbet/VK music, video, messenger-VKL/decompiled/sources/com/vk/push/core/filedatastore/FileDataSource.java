package com.vk.push.core.filedatastore;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import xsna.b6l;
import xsna.bdn;
import xsna.bpn0;
import xsna.emb;
import xsna.gzs;
import xsna.myc0;
import xsna.nbr;
import xsna.s3q0;
import xsna.spj;
import xsna.wgl;
import xsna.wzs;
import xsna.yvj;
import xsna.zcl;
import xsna.zvj;

/* compiled from: FileDataSource.kt */
/* loaded from: classes.dex */
public final class FileDataSource {

    @Deprecated
    public static final String FILE_DATASOURCE_DIR = "vkpns";
    public final Context a;
    public final String b;
    public final yvj c;
    public final bpn0 d;

    /* compiled from: FileDataSource.kt */
    public static final class a extends Lambda implements gzs<File> {
        public a() {
            super(0);
        }

        @Override // xsna.gzs
        public final File invoke() {
            return FileDataSource.access$getOrCreateFile(FileDataSource.this);
        }
    }

    /* compiled from: FileDataSource.kt */
    @b6l(c = "com.vk.push.core.filedatastore.FileDataSource", f = "FileDataSource.kt", l = {18}, m = "getData-IoAF18A")
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
            Object m99getDataIoAF18A = FileDataSource.this.m99getDataIoAF18A(this);
            return m99getDataIoAF18A == CoroutineSingletons.COROUTINE_SUSPENDED ? m99getDataIoAF18A : new Result(m99getDataIoAF18A);
        }
    }

    /* compiled from: FileDataSource.kt */
    @b6l(c = "com.vk.push.core.filedatastore.FileDataSource$getData$2", f = "FileDataSource.kt", l = {}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements wzs<yvj, spj<? super Result<? extends String>>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public c(spj<? super c> spjVar) {
            super(2, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            c cVar = FileDataSource.this.new c(spjVar);
            cVar.L$0 = obj;
            return cVar;
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super Result<? extends String>> spjVar) {
            return ((c) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object failure;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            try {
                failure = nbr.r(FileDataSource.access$getFileSource(FileDataSource.this), emb.b);
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            return new Result(failure);
        }
    }

    /* compiled from: FileDataSource.kt */
    @b6l(c = "com.vk.push.core.filedatastore.FileDataSource", f = "FileDataSource.kt", l = {25}, m = "setData-gIAlu-s")
    public static final class d extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public d(spj<? super d> spjVar) {
            super(spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object m100setDatagIAlus = FileDataSource.this.m100setDatagIAlus(null, this);
            return m100setDatagIAlus == CoroutineSingletons.COROUTINE_SUSPENDED ? m100setDatagIAlus : new Result(m100setDatagIAlus);
        }
    }

    /* compiled from: FileDataSource.kt */
    @b6l(c = "com.vk.push.core.filedatastore.FileDataSource$setData$2", f = "FileDataSource.kt", l = {}, m = "invokeSuspend")
    public static final class e extends SuspendLambda implements wzs<yvj, spj<? super Result<? extends s3q0>>, Object> {
        final /* synthetic */ String $data;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, spj<? super e> spjVar) {
            super(2, spjVar);
            this.$data = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            e eVar = FileDataSource.this.new e(this.$data, spjVar);
            eVar.L$0 = obj;
            return eVar;
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super Result<? extends s3q0>> spjVar) {
            return ((e) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object failure;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            FileDataSource fileDataSource = FileDataSource.this;
            try {
                nbr.w(FileDataSource.access$getFileSource(fileDataSource), this.$data, emb.b);
                failure = s3q0.a;
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            return new Result(failure);
        }
    }

    public FileDataSource(Context context, String str, yvj yvjVar) {
        this.a = context;
        this.b = str;
        this.c = yvjVar;
        this.d = new bpn0(new a());
    }

    public static void a(File file) {
        if (file.canRead() && file.canWrite()) {
            return;
        }
        throw new IOException("Can't access " + file.getPath());
    }

    public static final File access$getFileSource(FileDataSource fileDataSource) {
        return (File) fileDataSource.d.getValue();
    }

    public static final File access$getOrCreateFile(FileDataSource fileDataSource) {
        File file = new File(fileDataSource.a.getFilesDir().getPath() + "/vkpns");
        if (file.exists() && file.isDirectory()) {
            a(file);
        } else {
            if (!file.mkdir()) {
                throw new IOException("Can't create vkpns dir");
            }
            a(file);
        }
        File file2 = new File(file.getPath() + '/' + fileDataSource.b);
        if (file2.exists() && file2.isFile()) {
            a(file2);
            return file2;
        }
        boolean createNewFile = file2.createNewFile();
        String str = "Can't create " + file2.getPath() + " file";
        if (!createNewFile) {
            throw new IOException(str);
        }
        a(file2);
        return file2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: getData-IoAF18A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m99getDataIoAF18A(spj<? super Result<String>> spjVar) {
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
                    kotlin.coroutines.d coroutineContext = this.c.getCoroutineContext();
                    c cVar = new c(null);
                    bVar.label = 1;
                    obj = myc0.k(coroutineContext, cVar, bVar);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                return ((Result) obj).d();
            }
        }
        bVar = new b(spjVar);
        Object obj2 = bVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bVar.label;
        if (i != 0) {
        }
        return ((Result) obj2).d();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: setData-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m100setDatagIAlus(String str, spj<? super Result<s3q0>> spjVar) {
        d dVar;
        int i;
        if (spjVar instanceof d) {
            dVar = (d) spjVar;
            int i2 = dVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.label = i2 - Integer.MIN_VALUE;
                Object obj = dVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    kotlin.coroutines.d coroutineContext = this.c.getCoroutineContext();
                    e eVar = new e(str, null);
                    dVar.label = 1;
                    obj = myc0.k(coroutineContext, eVar, dVar);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                return ((Result) obj).d();
            }
        }
        dVar = new d(spjVar);
        Object obj2 = dVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dVar.label;
        if (i != 0) {
        }
        return ((Result) obj2).d();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FileDataSource(Context context, String str, yvj yvjVar, int i, zcl zclVar) {
        this(context, str, yvjVar);
        if ((i & 4) != 0) {
            bdn bdnVar = bdn.a;
            yvjVar = zvj.a(wgl.c);
        }
    }
}
