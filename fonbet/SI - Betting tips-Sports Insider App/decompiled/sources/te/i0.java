package te;

import android.content.ContentResolver;
import android.net.Uri;
import androidx.appcompat.widget.c1;
import com.google.android.gms.internal.measurement.d5;
import com.sports.insider.MyApp;
import eg.m0;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i0 extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f23884b = 0;

    /* renamed from: c, reason: collision with root package name */
    public String f23885c;

    /* renamed from: d, reason: collision with root package name */
    public int f23886d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l0 f23887e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Uri f23888f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(l0 l0Var, Uri uri, String str, Continuation continuation) {
        super(2, continuation);
        this.f23887e = l0Var;
        this.f23888f = uri;
        this.f23885c = str;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f23884b) {
            case 0:
                return new i0(this.f23887e, this.f23888f, this.f23885c, continuation);
            default:
                return new i0(this.f23887e, this.f23888f, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        eg.z zVar = (eg.z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f23884b) {
        }
        return ((i0) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        String uri;
        String m6;
        String str;
        String str2;
        int i5 = this.f23884b;
        l0 l0Var = this.f23887e;
        Uri uri2 = this.f23888f;
        File file = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        switch (i5) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                int i10 = this.f23886d;
                if (i10 == 0) {
                    h8.b.B(obj);
                    lg.e eVar = m0.f9201a;
                    fg.e eVar2 = jg.q.f18523a;
                    h0 h0Var = new h0(l0Var, objArr == true ? 1 : 0, 0);
                    this.f23886d = 1;
                    if (eg.c0.A(eVar2, h0Var, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                md.m mVar = l0Var.f23900d;
                String str3 = this.f23885c;
                mVar.getClass();
                Intrinsics.checkNotNullParameter(uri2, "uri");
                gf.t b10 = gf.k.b(new id.a(13));
                gf.k.b(new id.a(14));
                Intrinsics.checkNotNullParameter(uri2, "uri");
                try {
                    String format = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss", Locale.getDefault()).format(new Date());
                    Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                    String m10 = (str3 == null || (m6 = kotlin.text.z.m(str3, "image/", ".")) == null) ? null : kotlin.text.z.m(m6, "application/", ".");
                    ((zc.k) b10.getValue()).getClass();
                    File cacheDir = ((za.i) zc.k.e()).f25901a.getCacheDir();
                    Intrinsics.checkNotNullExpressionValue(cacheDir, "getCacheDir(...)");
                    file = File.createTempFile(format, m10, cacheDir);
                } catch (IOException ex) {
                    Intrinsics.checkNotNullParameter(ex, "ex");
                    jg.d dVar = MyApp.f6830c;
                    lg.e eVar3 = m0.f9201a;
                    eg.c0.t(dVar, lg.d.f20063c, null, new q4.r(ex, objArr2 == true ? 1 : 0, 18), 2);
                }
                if (file == null) {
                    uri = uri2.toString();
                    Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
                } else {
                    try {
                        ((zc.k) b10.getValue()).getClass();
                        ContentResolver contentResolver = ((za.i) zc.k.e()).f25901a.getContentResolver();
                        Intrinsics.checkNotNullExpressionValue(contentResolver, "getContentResolver(...)");
                        InputStream openInputStream = contentResolver.openInputStream(uri2);
                        if (openInputStream != null) {
                            try {
                                FileOutputStream i11 = a.a.i(new FileOutputStream(file), file);
                                try {
                                    d5.m(openInputStream, i11);
                                    i11.close();
                                    openInputStream.close();
                                } finally {
                                }
                            } finally {
                            }
                        }
                        List list = lc.d.f19671a;
                        String absolutePath = file.getAbsolutePath();
                        Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
                        Intrinsics.checkNotNullParameter(absolutePath, "<this>");
                        uri = c1.m("file://", absolutePath);
                    } catch (Exception unused) {
                        uri = uri2.toString();
                        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
                    }
                }
                l0Var.f23903g = uri;
                return Unit.f19194a;
            default:
                lf.a aVar2 = lf.a.f20034a;
                int i12 = this.f23886d;
                if (i12 == 0) {
                    h8.b.B(obj);
                    lg.e eVar4 = m0.f9201a;
                    lg.d dVar2 = lg.d.f20063c;
                    me.y yVar = new me.y(l0Var, uri2, objArr3 == true ? 1 : 0, 28);
                    this.f23886d = 1;
                    obj = eg.c0.A(dVar2, yVar, this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i12 != 1) {
                        if (i12 == 2) {
                            str2 = this.f23885c;
                            h8.b.B(obj);
                            l0.e(l0Var, str2);
                            return Unit.f19194a;
                        }
                        if (i12 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        str = this.f23885c;
                        h8.b.B(obj);
                        l0.e(l0Var, str);
                        return Unit.f19194a;
                    }
                    h8.b.B(obj);
                }
                String str4 = (String) obj;
                if (CollectionsKt.A(lc.d.f19672b, str4)) {
                    this.f23885c = str4;
                    this.f23886d = 2;
                    lg.e eVar5 = m0.f9201a;
                    Object A = eg.c0.A(lg.d.f20063c, new i0(l0Var, uri2, str4, null), this);
                    if (A != aVar2) {
                        A = Unit.f19194a;
                    }
                    if (A == aVar2) {
                        return aVar2;
                    }
                    str2 = str4;
                    l0.e(l0Var, str2);
                    return Unit.f19194a;
                }
                if (!CollectionsKt.A(lc.d.f19671a, str4)) {
                    l0Var.p();
                    return Unit.f19194a;
                }
                this.f23885c = str4;
                this.f23886d = 3;
                lg.e eVar6 = m0.f9201a;
                Object A2 = eg.c0.A(lg.d.f20063c, new i0(l0Var, uri2, str4, null), this);
                if (A2 != aVar2) {
                    A2 = Unit.f19194a;
                }
                if (A2 == aVar2) {
                    return aVar2;
                }
                str = str4;
                l0.e(l0Var, str);
                return Unit.f19194a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(l0 l0Var, Uri uri, Continuation continuation) {
        super(2, continuation);
        this.f23887e = l0Var;
        this.f23888f = uri;
    }
}
