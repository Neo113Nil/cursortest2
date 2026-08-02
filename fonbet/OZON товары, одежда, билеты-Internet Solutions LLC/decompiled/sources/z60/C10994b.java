package z60;

import Sc.s;
import android.net.Uri;
import android.os.Build;
import android.util.Base64InputStream;
import androidx.fragment.app.r;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.ByteArrayInputStream;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import r90.f;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.share.file.ShareFileRequest;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.share.file.ShareFileBridgeInterface$handleShareFileResult$1", f = "ShareFileBridgeInterface.kt", l = {UserVerificationMethods.USER_VERIFY_PATTERN, 131}, m = "invokeSuspend")
/* renamed from: z60.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C10994b extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f107275d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ ShareFileRequest f107276e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ e f107277f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ U30.d f107278g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ r f107279h;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.share.file.ShareFileBridgeInterface$handleShareFileResult$1$1", f = "ShareFileBridgeInterface.kt", l = {124}, m = "invokeSuspend")
    /* renamed from: z60.b$a */
    static final class a extends j implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f107280d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ e f107281e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Base64InputStream f107282f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f107283g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ U30.d f107284h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ ShareFileRequest f107285i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(e eVar, Base64InputStream base64InputStream, String str, U30.d dVar, ShareFileRequest shareFileRequest, kotlin.coroutines.d<? super a> dVar2) {
            super(1, dVar2);
            this.f107281e = eVar;
            this.f107282f = base64InputStream;
            this.f107283g = str;
            this.f107284h = dVar;
            this.f107285i = shareFileRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return new a(this.f107281e, this.f107282f, this.f107283g, this.f107284h, this.f107285i, dVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f107280d;
            if (i11 == 0) {
                s.b(obj);
                String base64 = this.f107285i.getBase64();
                this.f107280d = 1;
                if (e.e(this.f107281e, this.f107282f, this.f107283g, this.f107284h, base64, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10994b(ShareFileRequest shareFileRequest, e eVar, U30.d dVar, r rVar, kotlin.coroutines.d dVar2) {
        super(2, dVar2);
        this.f107276e = shareFileRequest;
        this.f107277f = eVar;
        this.f107278g = dVar;
        this.f107279h = rVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C10994b(this.f107276e, this.f107277f, this.f107278g, this.f107279h, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C10994b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x007c, code lost:
    
        r2 = r8.f107298f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a1, code lost:
    
        if (r2 == r0) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        e eVar;
        U30.a aVar;
        boolean z11;
        e eVar2;
        Object k11;
        f fVar;
        U30.a aVar2;
        S80.b bVar;
        Wc.a aVar3 = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f107275d;
        ShareFileRequest shareFileRequest = this.f107276e;
        e eVar3 = this.f107277f;
        boolean z12 = true;
        U30.d dVar = this.f107278g;
        try {
            try {
            } catch (Exception e11) {
                e = e11;
                eVar = eVar3;
                L80.a.c("ShareFileBridgeInterface", null, e);
                eVar.f107305m = null;
                e.m(eVar, false, dVar, shareFileRequest.getBase64());
                return Unit.f71690a;
            }
        } catch (Exception e12) {
            e = e12;
            eVar = i11;
            L80.a.c("ShareFileBridgeInterface", null, e);
            eVar.f107305m = null;
            e.m(eVar, false, dVar, shareFileRequest.getBase64());
            return Unit.f71690a;
        }
        if (i11 != 0) {
            if (i11 == 1) {
                s.b(obj);
                return Unit.f71690a;
            }
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            k11 = obj;
            eVar2 = eVar3;
            Uri uri = (Uri) k11;
            if (uri != null) {
                bVar = eVar2.f107295c;
                bVar.H(uri, dVar.d());
            }
            if (uri == null) {
                z12 = false;
            }
            e.m(eVar2, z12, dVar, shareFileRequest.getBase64());
            return Unit.f71690a;
        }
        s.b(obj);
        byte[] bytes = shareFileRequest.getBase64().getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        Base64InputStream base64InputStream = new Base64InputStream(new ByteArrayInputStream(bytes), 2);
        String filename = shareFileRequest.getFilename();
        if (filename == null) {
            aVar2 = eVar3.f107296d;
            filename = aVar2.e();
        }
        aVar = eVar3.f107296d;
        String p11 = aVar.p(filename, dVar);
        z11 = eVar3.f107304l;
        if (z11) {
            if (Build.VERSION.SDK_INT < 29) {
                eVar3.f107305m = new a(eVar3, base64InputStream, p11, this.f107278g, shareFileRequest, null);
                r rVar = this.f107279h;
                if (rVar != null && fVar != null) {
                    fVar.g(rVar);
                }
            } else {
                U30.d dVar2 = this.f107278g;
                String base64 = shareFileRequest.getBase64();
                this.f107275d = 1;
                if (e.e(eVar3, base64InputStream, p11, dVar2, base64, this) == aVar3) {
                }
            }
            return Unit.f71690a;
        }
        eVar2 = eVar3;
        this.f107275d = 2;
        k11 = e.k(eVar2, base64InputStream, p11, dVar, this);
        return aVar3;
    }
}
