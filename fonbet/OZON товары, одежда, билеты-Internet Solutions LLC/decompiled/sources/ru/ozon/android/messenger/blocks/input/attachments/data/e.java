package ru.ozon.android.messenger.blocks.input.attachments.data;

import Sc.s;
import We.C;
import We.D;
import We.H;
import We.K;
import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.protobuf.DescriptorProtos$FileOptions;
import fd.InterfaceC6511n;
import java.io.File;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import retrofit2.HttpException;
import retrofit2.Response;
import ru.ozon.android.messenger.framework.data.m;
import ru.ozon.android.messenger.framework.data.remote.FileApi;
import ru.ozon.android.messenger.framework.data.remote.UploadFileResponse;
import ru.ozon.android.messenger.utils.i;

/* loaded from: classes10.dex */
public final class e implements c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final FileApi f85363a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Context f85364b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final m f85365c;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.blocks.input.attachments.data.FileUploaderImpl$uploadFile$2", f = "FileUploader.kt", l = {42}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements InterfaceC6511n<String, D.c, kotlin.coroutines.d<? super Response<UploadFileResponse>>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f85366d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ String f85367e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ D.c f85368f;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(3, dVar);
        }

        @Override // fd.InterfaceC6511n
        public final Object invoke(String str, D.c cVar, kotlin.coroutines.d<? super Response<UploadFileResponse>> dVar) {
            a aVar = e.this.new a(dVar);
            aVar.f85367e = str;
            aVar.f85368f = cVar;
            return aVar.invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f85366d;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return obj;
            }
            s.b(obj);
            String str = this.f85367e;
            D.c cVar = this.f85368f;
            FileApi fileApi = e.this.f85363a;
            this.f85367e = null;
            this.f85366d = 1;
            Object uploadFile = fileApi.uploadFile(str, cVar, this);
            return uploadFile == aVar ? aVar : uploadFile;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.blocks.input.attachments.data.FileUploaderImpl$uploadImage$2", f = "FileUploader.kt", l = {DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.j implements InterfaceC6511n<String, D.c, kotlin.coroutines.d<? super Response<UploadFileResponse>>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f85370d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ String f85371e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ D.c f85372f;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(3, dVar);
        }

        @Override // fd.InterfaceC6511n
        public final Object invoke(String str, D.c cVar, kotlin.coroutines.d<? super Response<UploadFileResponse>> dVar) {
            b bVar = e.this.new b(dVar);
            bVar.f85371e = str;
            bVar.f85372f = cVar;
            return bVar.invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f85370d;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return obj;
            }
            s.b(obj);
            String str = this.f85371e;
            D.c cVar = this.f85372f;
            FileApi fileApi = e.this.f85363a;
            this.f85371e = null;
            this.f85370d = 1;
            Object uploadImage = fileApi.uploadImage(str, cVar, this);
            return uploadImage == aVar ? aVar : uploadImage;
        }
    }

    public e(@NotNull FileApi fileApi, @NotNull Context context, @NotNull m errorLogger) {
        Intrinsics.checkNotNullParameter(fileApi, "fileApi");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(errorLogger, "errorLogger");
        this.f85363a = fileApi;
        this.f85364b = context;
        this.f85365c = errorLogger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x012e A[Catch: Exception -> 0x003c, TRY_LEAVE, TryCatch #1 {Exception -> 0x003c, blocks: (B:11:0x0037, B:12:0x0110, B:15:0x0120, B:18:0x0126, B:20:0x012e), top: B:10:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(l lVar, InterfaceC6511n interfaceC6511n, kotlin.coroutines.jvm.internal.c cVar) {
        d dVar;
        int i11;
        C c11;
        e eVar;
        Response response;
        l lVar2 = lVar;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i12 = dVar.f85362h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                dVar.f85362h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = dVar.f85360f;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = dVar.f85362h;
                if (i11 != 0) {
                    s.b(obj);
                    String a11 = lVar2.a();
                    if (a11 != null) {
                        C.f33536g.getClass();
                        c11 = C.a.b(a11);
                    } else {
                        c11 = null;
                    }
                    if (lVar2.b() == null) {
                        return new i.a.C1724a(2, null, "Failed to upload file => mediaUri must not be null " + lVar2);
                    }
                    String path = lVar2.b().getPath();
                    if (path == null) {
                        return new i.a.C1724a(2, null, "Failed to upload file " + lVar2);
                    }
                    File file = new File(path);
                    try {
                        String canonicalPath = file.getCanonicalFile().getCanonicalPath();
                        Intrinsics.checkNotNullExpressionValue(canonicalPath, "getCanonicalPath(...)");
                        if (!kotlin.text.h.e0(canonicalPath, this.f85364b.getCacheDir().getCanonicalPath() + File.separator, false)) {
                            return new i.a.C1724a(2, null, "Failed to upload file => other dir " + lVar2);
                        }
                        D.c.a aVar2 = D.c.f33553c;
                        String name = file.getName();
                        K.INSTANCE.getClass();
                        H a12 = K.Companion.a(file, c11);
                        aVar2.getClass();
                        D.c b11 = D.c.a.b("uploadfile", name, a12);
                        try {
                            if (lVar2.c() == null) {
                                return new i.a.C1724a(2, null, "Failed to upload file => uploadUrl must not be null " + lVar2);
                            }
                            String c12 = lVar2.c();
                            dVar.f85358d = this;
                            dVar.f85359e = lVar2;
                            dVar.f85362h = 1;
                            obj = interfaceC6511n.invoke(c12, b11, dVar);
                            if (obj == aVar) {
                                return aVar;
                            }
                            eVar = this;
                        } catch (Exception e11) {
                            e = e11;
                            eVar = this;
                            m mVar = eVar.f85365c;
                            String c13 = lVar2.c();
                            mVar.b(c13 != null ? c13 : "", e);
                            return new i.a.C1724a("Failed to upload file " + lVar2, e);
                        }
                    } catch (IOException e12) {
                        String c14 = lVar2.c();
                        this.f85365c.b(c14 != null ? c14 : "", e12);
                        return new i.a.C1724a("Failed to upload file " + lVar2, e12);
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    lVar2 = dVar.f85359e;
                    eVar = dVar.f85358d;
                    try {
                        s.b(obj);
                    } catch (Exception e13) {
                        e = e13;
                        m mVar2 = eVar.f85365c;
                        String c132 = lVar2.c();
                        mVar2.b(c132 != null ? c132 : "", e);
                        return new i.a.C1724a("Failed to upload file " + lVar2, e);
                    }
                }
                response = (Response) obj;
                UploadFileResponse uploadFileResponse = (UploadFileResponse) response.body();
                if (!response.isSuccessful()) {
                    return uploadFileResponse != null ? new i.b(uploadFileResponse) : new i.a.C1724a(2, null, "Failed to upload file => response body must not be null");
                }
                eVar.f85365c.c(response.code(), lVar2.c());
                return new i.a.C1724a(1, new HttpException(response), null);
            }
        }
        dVar = new d(this, cVar);
        Object obj2 = dVar.f85360f;
        Wc.a aVar3 = Wc.a.COROUTINE_SUSPENDED;
        i11 = dVar.f85362h;
        if (i11 != 0) {
        }
        response = (Response) obj2;
        UploadFileResponse uploadFileResponse2 = (UploadFileResponse) response.body();
        if (!response.isSuccessful()) {
        }
    }

    @Override // ru.ozon.android.messenger.blocks.input.attachments.data.c
    public final Object a(@NotNull l lVar, @NotNull kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<UploadFileResponse>> dVar) {
        return e(lVar, new b(null), (kotlin.coroutines.jvm.internal.c) dVar);
    }

    @Override // ru.ozon.android.messenger.blocks.input.attachments.data.c
    public final Object b(@NotNull l lVar, @NotNull kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<UploadFileResponse>> dVar) {
        return e(lVar, new a(null), (kotlin.coroutines.jvm.internal.c) dVar);
    }
}
