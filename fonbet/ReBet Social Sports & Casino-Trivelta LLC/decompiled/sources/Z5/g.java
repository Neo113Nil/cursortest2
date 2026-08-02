package Z5;

import I5.p;
import Ph.AbstractC1455i;
import Ph.AbstractC1459k;
import Ph.C1452g0;
import Ph.P;
import android.net.Uri;
import ei.AbstractC4212b;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import s5.C6339a;
import t5.InterfaceC6443a;
import ti.C6478h;
import ti.InterfaceC6479i;
import ti.t;
import zendesk.core.Constants;

/* loaded from: classes2.dex */
public final class g implements h {

    /* renamed from: f, reason: collision with root package name */
    public static final a f14659f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final P f14660a;

    /* renamed from: b, reason: collision with root package name */
    public final OkHttpClient f14661b;

    /* renamed from: c, reason: collision with root package name */
    public final t5.b f14662c;

    /* renamed from: d, reason: collision with root package name */
    public final p f14663d;

    /* renamed from: e, reason: collision with root package name */
    public final b5.d f14664e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public static final class b extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public Object f14665n;

        /* renamed from: o, reason: collision with root package name */
        public Object f14666o;

        /* renamed from: p, reason: collision with root package name */
        public int f14667p;

        public b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return g.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((b) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            g gVar;
            Iterator it;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f14667p;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                List b10 = Z5.c.f14654a.b();
                gVar = g.this;
                it = b10.iterator();
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) this.f14666o;
                gVar = (g) this.f14665n;
                ResultKt.throwOnFailure(obj);
            }
            while (it.hasNext()) {
                Z5.b bVar = (Z5.b) it.next();
                p pVar = gVar.f14663d;
                this.f14665n = gVar;
                this.f14666o = it;
                this.f14667p = 1;
                if (gVar.j(bVar, pVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            Z5.c.f14654a.a();
            return Unit.INSTANCE;
        }
    }

    public static final class c extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f14669n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f14670o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ g f14671p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Request f14672q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i10, g gVar, Request request, Continuation continuation) {
            super(2, continuation);
            this.f14670o = i10;
            this.f14671p = gVar;
            this.f14672q = request;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new c(this.f14670o, this.f14671p, this.f14672q, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((c) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z10;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f14669n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            boolean z11 = false;
            try {
                int i10 = this.f14670o;
                String boxInt = i10 >= 0 ? Boxing.boxInt(i10) : "";
                E5.b bVar = E5.b.f3006a;
                bVar.a("Uploading chunk " + boxInt);
                Response execute = this.f14671p.f14661b.newCall(this.f14672q).execute();
                int i11 = this.f14670o;
                try {
                    if (execute.isSuccessful()) {
                        bVar.a("Chunk " + boxInt + " uploaded successfully with status code " + execute.code());
                        z10 = true;
                    } else {
                        bVar.b("Upload failed for chunk " + i11 + ": " + execute.code() + " - " + execute.message());
                        z10 = false;
                    }
                    CloseableKt.closeFinally(execute, null);
                    z11 = z10;
                } finally {
                }
            } catch (IOException e10) {
                E5.b.f3006a.c("Error uploading chunk " + this.f14670o, e10);
            }
            return Boxing.boxBoolean(z11);
        }
    }

    public static final class d extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f14673n;

        /* renamed from: o, reason: collision with root package name */
        public Object f14674o;

        /* renamed from: p, reason: collision with root package name */
        public Object f14675p;

        /* renamed from: q, reason: collision with root package name */
        public int f14676q;

        /* renamed from: r, reason: collision with root package name */
        public int f14677r;

        /* renamed from: s, reason: collision with root package name */
        public int f14678s;

        /* renamed from: t, reason: collision with root package name */
        public int f14679t;

        /* renamed from: u, reason: collision with root package name */
        public long f14680u;

        /* renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f14681v;

        /* renamed from: x, reason: collision with root package name */
        public int f14683x;

        public d(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f14681v = obj;
            this.f14683x |= Integer.MIN_VALUE;
            return g.this.a(null, null, 0, 0, 0L, this);
        }
    }

    public g(P scope, OkHttpClient httpClient, t5.b connectivityMonitor, p sessionConfiguration) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        Intrinsics.checkNotNullParameter(connectivityMonitor, "connectivityMonitor");
        Intrinsics.checkNotNullParameter(sessionConfiguration, "sessionConfiguration");
        this.f14660a = scope;
        this.f14661b = httpClient;
        this.f14662c = connectivityMonitor;
        this.f14663d = sessionConfiguration;
        b5.d dVar = new b5.d() { // from class: Z5.f
            @Override // b5.d
            public final void a(Object obj) {
                g.f(g.this, (InterfaceC6443a) obj);
            }
        };
        this.f14664e = dVar;
        connectivityMonitor.b(dVar);
    }

    public static final void f(g gVar, InterfaceC6443a state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (Intrinsics.areEqual(state, InterfaceC6443a.C0911a.f65678a)) {
            E5.b.f3006a.a("network available - sending cached chunks to server");
            AbstractC1459k.d(gVar.f14660a, null, null, gVar.new b(null), 3, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0107 -> B:10:0x010a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x011c -> B:16:0x0116). Please report as a decompilation issue!!! */
    @Override // Z5.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(File file, String str, int i10, int i11, long j10, Continuation continuation) {
        d dVar;
        g gVar;
        int i12;
        int length;
        int i13;
        String str2;
        int i14;
        long j11;
        byte[] bArr;
        g gVar2;
        int i15;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i16 = dVar.f14683x;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                dVar.f14683x = i16 - Integer.MIN_VALUE;
                gVar = this;
                Object obj = dVar.f14681v;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i12 = dVar.f14683x;
                int i17 = PKIFailureInfo.badCertTemplate;
                int i18 = 1;
                if (i12 != 0) {
                    ResultKt.throwOnFailure(obj);
                    byte[] readBytes = FilesKt.readBytes(file);
                    length = (readBytes.length + 1048575) / PKIFailureInfo.badCertTemplate;
                    i13 = 0;
                    str2 = str;
                    i14 = i11;
                    j11 = j10;
                    bArr = readBytes;
                    gVar2 = gVar;
                    i15 = i10;
                    if (i13 < length) {
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i13 = dVar.f14679t;
                    length = dVar.f14678s;
                    long j12 = dVar.f14680u;
                    i14 = dVar.f14677r;
                    int i19 = dVar.f14676q;
                    byte[] bArr2 = (byte[]) dVar.f14675p;
                    String str3 = (String) dVar.f14674o;
                    g gVar3 = (g) dVar.f14673n;
                    ResultKt.throwOnFailure(obj);
                    byte[] bArr3 = bArr2;
                    Object obj2 = coroutine_suspended;
                    String str4 = str3;
                    j11 = j12;
                    if (((Boolean) obj).booleanValue()) {
                        return Z5.d.f14656a;
                    }
                    i15 = i19;
                    str2 = str4;
                    bArr = bArr3;
                    i13++;
                    coroutine_suspended = obj2;
                    gVar2 = gVar3;
                    i18 = 1;
                    i17 = PKIFailureInfo.badCertTemplate;
                    if (i13 < length) {
                        int i20 = i13 * i17;
                        byte[] copyOfRange = ArraysKt.copyOfRange(bArr, i20, Math.min(i20 + i17, bArr.length));
                        int i21 = length == i18 ? -1 : i13;
                        g gVar4 = gVar2;
                        bArr3 = bArr;
                        Object obj3 = coroutine_suspended;
                        ChunkMetadata chunkMetadata = new ChunkMetadata(gVar2.f14663d.c().c(), i14, bArr.length, j11, gVar2.f14663d.d(), gVar2.f14663d.e(), i21, str2, String.valueOf(i15));
                        str4 = str2;
                        Z5.b bVar = new Z5.b(chunkMetadata, copyOfRange);
                        String boxInt = i21 >= 0 ? Boxing.boxInt(i21) : "";
                        if (gVar4.f14662c.isNetworkAvailable()) {
                            E5.b.f3006a.a("network available - uploading chunk " + boxInt);
                            p pVar = gVar4.f14663d;
                            dVar.f14673n = gVar4;
                            dVar.f14674o = str4;
                            dVar.f14675p = bArr3;
                            dVar.f14676q = i15;
                            dVar.f14677r = i14;
                            dVar.f14680u = j11;
                            dVar.f14678s = length;
                            dVar.f14679t = i13;
                            dVar.f14683x = 1;
                            Object j13 = gVar4.j(bVar, pVar, dVar);
                            obj2 = obj3;
                            if (j13 == obj2) {
                                return obj2;
                            }
                            i19 = i15;
                            obj = j13;
                            gVar3 = gVar4;
                            if (((Boolean) obj).booleanValue()) {
                            }
                        } else {
                            obj2 = obj3;
                            E5.b.f3006a.a("network unavailable - caching chunk " + boxInt);
                            Z5.c.f14654a.c(bVar);
                            gVar3 = gVar4;
                            str2 = str4;
                            bArr = bArr3;
                            i13++;
                            coroutine_suspended = obj2;
                            gVar2 = gVar3;
                            i18 = 1;
                            i17 = PKIFailureInfo.badCertTemplate;
                            if (i13 < length) {
                                return Z5.c.f14654a.d() == 0 ? e.f14657a : Z5.d.f14656a;
                            }
                        }
                    }
                }
            }
        }
        gVar = this;
        dVar = gVar.new d(continuation);
        Object obj4 = dVar.f14681v;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i12 = dVar.f14683x;
        int i172 = PKIFailureInfo.badCertTemplate;
        int i182 = 1;
        if (i12 != 0) {
        }
    }

    public final MultipartBody g(Z5.b bVar) {
        E5.b.f3006a.a("uploading metadata: " + bVar.b().getScreenshotId() + " at " + bVar.b().getFrameTimestamp() + " (page: " + bVar.b().getPage() + ", snapshotIndex: " + bVar.b().getFrameIndex() + ")");
        AbstractC4212b b10 = F5.b.b();
        ChunkMetadata b11 = bVar.b();
        b10.a();
        String b12 = b10.b(ChunkMetadata.INSTANCE.serializer(), b11);
        return new MultipartBody.Builder("Boundary-" + UUID.randomUUID()).setType(MultipartBody.FORM).addFormDataPart("metaData", null, i(b12)).addFormDataPart("chunk", "image.jpg", h(bVar.a())).build();
    }

    public final RequestBody h(byte[] bArr) {
        C6478h c6478h = new C6478h();
        InterfaceC6479i c10 = t.c(new ti.p(c6478h));
        try {
            c10.write(bArr);
            CloseableKt.closeFinally(c10, null);
            return RequestBody.Companion.create$default(RequestBody.INSTANCE, c6478h.W0(), MediaType.INSTANCE.get("application/gzip"), 0, 0, 6, (Object) null);
        } finally {
        }
    }

    public final RequestBody i(String str) {
        return RequestBody.INSTANCE.create(str, MediaType.INSTANCE.get("application/json; charset=utf-8"));
    }

    public final Object j(Z5.b bVar, p pVar, Continuation continuation) {
        Uri parse;
        Uri.Builder buildUpon;
        Uri.Builder appendQueryParameter;
        Uri build;
        String uri;
        MultipartBody g10 = g(bVar);
        int chunkIndex = bVar.b().getChunkIndex();
        Q5.c c10 = pVar.c();
        String str = c10.g().a() + "/browser/alpha/sessionrecording";
        String p10 = c10.p();
        if (p10 != null && (parse = Uri.parse(p10)) != null && (buildUpon = parse.buildUpon()) != null && (appendQueryParameter = buildUpon.appendQueryParameter("cxforward", str)) != null && (build = appendQueryParameter.build()) != null && (uri = build.toString()) != null) {
            str = uri;
        }
        return AbstractC1455i.g(C1452g0.b(), new c(chunkIndex, this, new Request.Builder().url(str).post(g10).addHeader(Constants.AUTHORIZATION_HEADER, "Bearer " + c10.q()).addHeader("Content-Type", "multipart/form-data; boundary=" + g10.boundary()).addHeader("X-Coralogix-Internal", "1").build(), null), continuation);
    }

    public /* synthetic */ g(P p10, OkHttpClient okHttpClient, t5.b bVar, p pVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? C6339a.f64787a.a() : p10, (i10 & 2) != 0 ? new OkHttpClient.Builder().build() : okHttpClient, (i10 & 4) != 0 ? t5.c.f65680a : bVar, pVar);
    }
}
