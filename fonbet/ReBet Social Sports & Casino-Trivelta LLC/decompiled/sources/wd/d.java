package wd;

import F4.k;
import L4.h;
import N4.a;
import Ph.AbstractC1455i;
import Ph.C1452g0;
import Ph.L;
import Ph.P;
import android.app.Activity;
import android.app.Application;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.webkit.MimeTypeMap;
import android.widget.ImageView;
import com.bumptech.glide.l;
import com.bumptech.glide.load.engine.j;
import com.bumptech.glide.load.engine.q;
import com.bumptech.glide.m;
import com.zoho.livechat.android.ZohoLiveChat;
import com.zoho.livechat.android.modules.core.domain.entities.Channel;
import com.zoho.livechat.android.provider.MobilistenInitProvider;
import com.zoho.livechat.android.utils.C3946o;
import com.zoho.livechat.android.utils.LiveChatUtil;
import com.zoho.livechat.android.utils.MobilistenUtil;
import ge.C4377a;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
import java.util.LinkedHashSet;
import java.util.Set;
import ke.C5252a;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import l0.AbstractC5339d;
import me.C5582a;
import od.AbstractC5886l;
import od.t;
import og.AbstractC5892d;
import og.i;
import rd.C6218a;
import xe.C6822a;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f67581a = new d();

    /* renamed from: b, reason: collision with root package name */
    public static N4.a f67582b;

    /* renamed from: c, reason: collision with root package name */
    public static long f67583c;

    /* renamed from: d, reason: collision with root package name */
    public static final Set f67584d;

    /* renamed from: e, reason: collision with root package name */
    public static final Set f67585e;

    /* renamed from: f, reason: collision with root package name */
    public static final Lazy f67586f;

    /* renamed from: g, reason: collision with root package name */
    public static final Lazy f67587g;

    public static final class a extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final a f67588d = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C4377a invoke() {
            return C4377a.f47235d.a(d.f67581a.m());
        }
    }

    public static final class b extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final b f67589d = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C5252a invoke() {
            return new C5252a(d.f67581a.q());
        }
    }

    public static final class c extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f67590n;

        /* renamed from: p, reason: collision with root package name */
        public int f67592p;

        public c(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f67590n = obj;
            this.f67592p |= Integer.MIN_VALUE;
            return d.this.n(this);
        }
    }

    /* renamed from: wd.d$d, reason: collision with other inner class name */
    public static final class C0959d extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f67593n;

        /* renamed from: p, reason: collision with root package name */
        public int f67595p;

        public C0959d(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f67593n = obj;
            this.f67595p |= Integer.MIN_VALUE;
            return d.this.t(null, null, this);
        }
    }

    public static final class e extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f67596n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Context f67597o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Object f67598p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Context context, Object obj, Continuation continuation) {
            super(2, continuation);
            this.f67597o = context;
            this.f67598p = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new e(this.f67597o, this.f67598p, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((e) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f67596n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Context context = this.f67597o;
            Intrinsics.checkNotNull(context);
            Object obj2 = ((l) ((l) com.bumptech.glide.c.u(context).k().f(j.f29824b)).c0(true)).A0(this.f67598p).G0().get();
            LiveChatUtil.log("GetCachedGlideImageAsBitmap: " + ((Bitmap) obj2));
            return obj2;
        }
    }

    public static final class f extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f67599n;

        /* renamed from: p, reason: collision with root package name */
        public int f67601p;

        public f(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f67599n = obj;
            this.f67601p |= Integer.MIN_VALUE;
            return d.this.B(null, this);
        }
    }

    public static final class g implements L4.g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef f67602a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef f67603b;

        public g(Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2) {
            this.f67602a = objectRef;
            this.f67603b = objectRef2;
        }

        @Override // L4.g
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean f(Drawable resource, Object model, M4.j jVar, com.bumptech.glide.load.a dataSource, boolean z10) {
            Intrinsics.checkNotNullParameter(resource, "resource");
            Intrinsics.checkNotNullParameter(model, "model");
            Intrinsics.checkNotNullParameter(dataSource, "dataSource");
            d.f67584d.add(this.f67603b.element);
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // L4.g
        public boolean k(q qVar, Object obj, M4.j target, boolean z10) {
            Intrinsics.checkNotNullParameter(target, "target");
            String str = (String) this.f67602a.element;
            if (str == null) {
                return false;
            }
            d.f67585e.add(str);
            return false;
        }
    }

    static {
        N4.a a10 = new a.C0159a().b(true).a();
        Intrinsics.checkNotNullExpressionValue(a10, "build(...)");
        f67582b = a10;
        f67583c = rd.b.f();
        f67584d = new LinkedHashSet();
        f67585e = new LinkedHashSet();
        f67586f = LazyKt.lazy(a.f67588d);
        f67587g = LazyKt.lazy(b.f67589d);
    }

    public static final void E(ImageView imageView, Object obj) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        K(imageView, obj, null, false, false, null, null, null, null, null, false, null, 4092, null);
    }

    public static final void F(ImageView imageView, Object obj, Float f10) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        K(imageView, obj, f10, false, false, null, null, null, null, null, false, null, 4088, null);
    }

    public static final void G(ImageView imageView, Object obj, Float f10, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        K(imageView, obj, f10, z10, z11, null, null, null, null, null, false, null, 4064, null);
    }

    public static final void H(ImageView imageView, Object obj, Float f10, boolean z10, boolean z11, L4.g gVar, Integer num) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        K(imageView, obj, f10, z10, z11, gVar, num, null, null, null, false, null, 3968, null);
    }

    public static final void I(ImageView imageView, Object obj, Float f10, boolean z10, boolean z11, L4.g gVar, Integer num, Drawable drawable, String str) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        K(imageView, obj, f10, z10, z11, gVar, num, drawable, str, null, false, null, 3584, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v15, types: [L4.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v3, types: [L4.a, com.bumptech.glide.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v3, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r4v0, types: [T, java.lang.Object] */
    public static final void J(ImageView imageView, Object obj, Float f10, boolean z10, boolean z11, L4.g gVar, Integer num, Drawable drawable, String str, Float f11, boolean z12, Object obj2) {
        ?? r13;
        L4.a a02;
        CharSequence charSequence;
        Object obj3;
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = str;
        d dVar = f67581a;
        h h10 = dVar.h(z11, f10, f11);
        Context L10 = L(imageView.getContext());
        if (L10 == null && (L10 = L(Uf.j.n())) == null) {
            L10 = MobilistenInitProvider.INSTANCE.e();
        }
        if (L10 == null) {
            LiveChatUtil.log("Context is null, cannot load image");
            return;
        }
        m u10 = com.bumptech.glide.c.u(L10);
        Intrinsics.checkNotNullExpressionValue(u10, "with(...)");
        ?? a10 = u10.v(obj).a(h10);
        Intrinsics.checkNotNullExpressionValue(a10, "apply(...)");
        if (gVar != null) {
            a10.j0(gVar);
        }
        if (obj2 != null) {
            a10.r0(obj2);
        }
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        boolean z13 = obj instanceof String;
        if ((z13 || i.f((String) objectRef.element)) && z13 && ((CharSequence) obj).length() > 0) {
            objectRef.element = obj;
            if (z10) {
                if (z12) {
                    r13 = String.valueOf((Object) obj);
                } else {
                    r13 = ((String) objectRef.element) + '_' + f67583c;
                }
                objectRef2.element = r13;
                a02 = a10.a0(new O4.c(r13));
                Intrinsics.checkNotNullExpressionValue(a02, "signature(...)");
                if (!f67584d.contains(objectRef2.element)) {
                    L4.a a03 = ((l) u10.w((String) obj).U(drawable)).a(h10).a0(new O4.c(((String) objectRef.element) + '_' + dVar.A()));
                    Intrinsics.checkNotNullExpressionValue(a03, "signature(...)");
                    l I02 = ((l) a02).I0((l) a03);
                    Intrinsics.checkNotNullExpressionValue(I02, "thumbnail(...)");
                    a02 = I02.j0(new g(objectRef, objectRef2));
                    Intrinsics.checkNotNullExpressionValue(a02, "addListener(...)");
                }
                charSequence = (CharSequence) objectRef2.element;
                if (charSequence != null && charSequence.length() != 0 && !f67584d.contains(objectRef2.element)) {
                    a02 = ((l) a02).U(drawable);
                    Intrinsics.checkNotNullExpressionValue(a02, "placeholder(...)");
                }
                obj3 = objectRef.element;
                if (obj3 == null && CollectionsKt.contains(f67585e, obj3)) {
                    return;
                }
                ((l) a02).J0(k.f(f67582b)).x0(imageView);
            }
        }
        if (z10) {
            a10 = a10.f(j.f29823a);
            Intrinsics.checkNotNullExpressionValue(a10, "diskCacheStrategy(...)");
        }
        a02 = ((l) a10).U(drawable);
        Intrinsics.checkNotNullExpressionValue(a02, "placeholder(...)");
        charSequence = (CharSequence) objectRef2.element;
        if (charSequence != null) {
            a02 = ((l) a02).U(drawable);
            Intrinsics.checkNotNullExpressionValue(a02, "placeholder(...)");
        }
        obj3 = objectRef.element;
        if (obj3 == null) {
        }
        ((l) a02).J0(k.f(f67582b)).x0(imageView);
    }

    public static /* synthetic */ void K(ImageView imageView, Object obj, Float f10, boolean z10, boolean z11, L4.g gVar, Integer num, Drawable drawable, String str, Float f11, boolean z12, Object obj2, int i10, Object obj3) {
        Drawable drawable2;
        if ((i10 & 4) != 0) {
            f10 = null;
        }
        if ((i10 & 8) != 0) {
            z10 = true;
        }
        boolean z13 = (i10 & 16) != 0 ? false : z11;
        L4.g gVar2 = (i10 & 32) != 0 ? null : gVar;
        Integer num2 = (i10 & 64) != 0 ? null : num;
        if ((i10 & 128) != 0) {
            d dVar = f67581a;
            Context context = imageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            drawable2 = dVar.r(context, num2);
        } else {
            drawable2 = drawable;
        }
        J(imageView, obj, f10, z10, z13, gVar2, num2, drawable2, (i10 & 256) != 0 ? null : str, (i10 & 512) != 0 ? null : f11, (i10 & 1024) == 0 ? z12 : false, (i10 & 2048) != 0 ? null : obj2);
    }

    public static final Context L(Context context) {
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity == null || activity.isDestroyed()) {
            return null;
        }
        return context;
    }

    public static final void M(Context context, String str, String outputFileName) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(outputFileName, "outputFileName");
        O(context, str, outputFileName, null, 8, null);
    }

    public static final void N(final Context context, final String str, final String outputFileName, final File file) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(outputFileName, "outputFileName");
        new Thread(new Runnable() { // from class: wd.a
            @Override // java.lang.Runnable
            public final void run() {
                d.P(file, str, outputFileName, context);
            }
        }).start();
    }

    public static /* synthetic */ void O(Context context, String str, String str2, File file, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            file = null;
        }
        N(context, str, str2, file);
    }

    public static final void P(File file, String str, String outputFileName, Context context) {
        Intrinsics.checkNotNullParameter(outputFileName, "$outputFileName");
        Intrinsics.checkNotNullParameter(context, "$context");
        if (file == null) {
            file = str != null ? f67581a.p(context, str) : null;
        }
        d dVar = f67581a;
        String z10 = dVar.z(file != null ? file.getAbsolutePath() : null);
        if (file == null || !file.exists() || z10 == null) {
            return;
        }
        dVar.Q(file, outputFileName, z10);
    }

    public static final void R(Context context, String fileName, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        T(context, fileName, str, null, 8, null);
    }

    public static final void S(final Context context, final String fileName, final String str, final File file) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        new Thread(new Runnable() { // from class: wd.c
            @Override // java.lang.Runnable
            public final void run() {
                d.U(file, str, context, fileName);
            }
        }).start();
    }

    public static /* synthetic */ void T(Context context, String str, String str2, File file, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        if ((i10 & 8) != 0) {
            file = null;
        }
        S(context, str, str2, file);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [T, java.io.File] */
    public static final void U(File file, String str, Context context, String fileName) {
        Object m147constructorimpl;
        Uri fromFile;
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(fileName, "$fileName");
        d dVar = f67581a;
        try {
            Result.Companion companion = Result.INSTANCE;
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            Unit unit = null;
            T t10 = file;
            if (file == null) {
                t10 = str != null ? dVar.p(context, str) : 0;
            }
            objectRef.element = t10;
            if (t10 != 0) {
                Intent intent = new Intent("android.intent.action.SEND");
                File file2 = (File) objectRef.element;
                intent.setType(dVar.z(file2 != null ? file2.getAbsolutePath() : null));
                ?? file3 = new File(new C3946o(context).e().getAbsolutePath() + '/' + (fileName + '.' + MimeTypeMap.getSingleton().getExtensionFromMimeType(intent.getType())));
                if (str != null) {
                    dVar.l((File) objectRef.element, file3);
                    objectRef.element = file3;
                }
                File file4 = (File) objectRef.element;
                if (file4 != null && file4.exists()) {
                    if (ZohoLiveChat.getApplicationManager() != null) {
                        intent.setFlags(1);
                        String str2 = MobilistenUtil.f() + ".siqfileprovider";
                        T t11 = objectRef.element;
                        Intrinsics.checkNotNull(t11);
                        fromFile = AbstractC5339d.getUriForFile(context, str2, (File) t11);
                        Intrinsics.checkNotNullExpressionValue(fromFile, "getUriForFile(...)");
                    } else {
                        fromFile = Uri.fromFile((File) objectRef.element);
                        Intrinsics.checkNotNullExpressionValue(fromFile, "fromFile(...)");
                    }
                    intent.putExtra("android.intent.extra.STREAM", fromFile);
                    context.startActivity(Intent.createChooser(intent, context.getResources().getString(t.f61115t1)));
                }
                unit = Unit.INSTANCE;
            }
            m147constructorimpl = Result.m147constructorimpl(unit);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
        if (m150exceptionOrNullimpl != null) {
            LiveChatUtil.log(m150exceptionOrNullimpl);
        }
    }

    public static final void i() {
        SharedPreferences M10 = C6218a.M();
        if (M10 != null) {
            SharedPreferences.Editor edit = M10.edit();
            edit.putString("current_image_cache_time", String.valueOf(f67583c));
            edit.putString("previous_image_cache_time", M10.getString("current_image_cache_time", "0"));
            edit.apply();
        }
    }

    public static final void j(final Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        new Thread(new Runnable() { // from class: wd.b
            @Override // java.lang.Runnable
            public final void run() {
                d.k(context);
            }
        }).start();
    }

    public static final void k(Context context) {
        Intrinsics.checkNotNullParameter(context, "$context");
        com.bumptech.glide.c.d(context).b();
    }

    public static final void u(Context context, Object model, L4.g gVar, boolean z10) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(model, "model");
        w(context, model, gVar, z10, null, 16, null);
    }

    public static final void v(Context context, Object model, L4.g gVar, boolean z10, Integer num) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(model, "model");
        l A02 = ((l) com.bumptech.glide.c.u(context).l().c()).A0(model);
        Intrinsics.checkNotNullExpressionValue(A02, "load(...)");
        if (num != null) {
            A02.a(h.l0(num.intValue()));
        }
        L4.a aVar = A02;
        aVar = A02;
        if ((model instanceof String) && z10) {
            L4.a a02 = A02.a0(new O4.c(((String) model) + '_' + f67583c));
            Intrinsics.checkNotNullExpressionValue(a02, "signature(...)");
            aVar = a02;
        }
        ((l) aVar).z0(gVar).G0();
    }

    public static /* synthetic */ void w(Context context, Object obj, L4.g gVar, boolean z10, Integer num, int i10, Object obj2) {
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        if ((i10 & 16) != 0) {
            num = null;
        }
        v(context, obj, gVar, z10, num);
    }

    public final String A() {
        SharedPreferences M10 = C6218a.M();
        String string = M10 != null ? M10.getString("previous_image_cache_time", "0") : null;
        return string == null ? "0" : string;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object B(String str, Continuation continuation) {
        f fVar;
        int i10;
        if (continuation instanceof f) {
            fVar = (f) continuation;
            int i11 = fVar.f67601p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                fVar.f67601p = i11 - Integer.MIN_VALUE;
                Object obj = fVar.f67599n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = fVar.f67601p;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (str == null) {
                        return null;
                    }
                    d dVar = f67581a;
                    C5252a s10 = dVar.s();
                    String b10 = sd.d.b(str, false);
                    Intrinsics.checkNotNullExpressionValue(b10, "getOperatorImageUrl(...)");
                    String D10 = dVar.D(str);
                    fVar.f67601p = 1;
                    obj = s10.a(b10, D10, fVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return (File) ((C5582a) obj).b();
            }
        }
        fVar = new f(continuation);
        Object obj2 = fVar.f67599n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = fVar.f67601p;
        if (i10 != 0) {
        }
        return (File) ((C5582a) obj2).b();
    }

    public final File C(String str) {
        File file = new File(D(str));
        if (file.length() > 0) {
            return file;
        }
        return null;
    }

    public final String D(String str) {
        return new C3946o(m()).e().getAbsolutePath() + "/users/" + str + ".jpg";
    }

    /* JADX WARN: Finally extract failed */
    public final void Q(File file, String str, String str2) {
        Object m147constructorimpl;
        OutputStream fileOutputStream;
        int i10;
        Application e10;
        ContentResolver contentResolver;
        ContentResolver contentResolver2;
        try {
            Result.Companion companion = Result.INSTANCE;
            if (Build.VERSION.SDK_INT < 29 || ZohoLiveChat.getApplicationManager() == null) {
                File file2 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).getPath() + "/Mobilisten Images");
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(str2);
                File file3 = new File(file2, str);
                if (file3.exists()) {
                    File[] listFiles = file2.listFiles();
                    if (listFiles != null) {
                        int i11 = 0;
                        for (File file4 : listFiles) {
                            String name = file4.getName();
                            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                            if (!StringsKt.contains$default((CharSequence) name, (CharSequence) str, false, 2, (Object) null)) {
                                if (i11 > 0) {
                                    break;
                                }
                            } else {
                                i11++;
                            }
                        }
                        i10 = i11;
                    } else {
                        i10 = 0;
                    }
                    int lastIndexOf$default = StringsKt.contains$default((CharSequence) str, (CharSequence) ".", false, 2, (Object) null) ? StringsKt.lastIndexOf$default((CharSequence) str, ".", 0, false, 6, (Object) null) : str.length();
                    StringBuilder sb2 = new StringBuilder();
                    String substring = str.substring(0, lastIndexOf$default);
                    Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                    sb2.append(substring);
                    sb2.append('(');
                    sb2.append(i10);
                    sb2.append(").");
                    sb2.append(extensionFromMimeType);
                    file3 = new File(file2, sb2.toString());
                }
                file3.createNewFile();
                fileOutputStream = new FileOutputStream(file3);
            } else {
                ContentValues contentValues = new ContentValues();
                contentValues.put("_display_name", str);
                contentValues.put("mime_type", str2);
                contentValues.put("relative_path", Environment.DIRECTORY_PICTURES + "/Mobilisten Images");
                MobilistenInitProvider.Companion companion2 = MobilistenInitProvider.INSTANCE;
                Application e11 = companion2.e();
                Uri insert = (e11 == null || (contentResolver2 = e11.getContentResolver()) == null) ? null : contentResolver2.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
                fileOutputStream = (insert == null || (e10 = companion2.e()) == null || (contentResolver = e10.getContentResolver()) == null) ? null : contentResolver.openOutputStream(insert);
            }
            OutputStream outputStream = fileOutputStream;
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = fileInputStream.read(bArr);
                        if (read <= 0) {
                            break;
                        } else if (outputStream != null) {
                            outputStream.write(bArr, 0, read);
                        }
                    }
                    MobilistenUtil.z(t.f61082o0, 0, 2, null);
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(fileInputStream, null);
                    CloseableKt.closeFinally(outputStream, null);
                    m147constructorimpl = Result.m147constructorimpl(Unit.INSTANCE);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        CloseableKt.closeFinally(fileInputStream, th2);
                        throw th3;
                    }
                }
            } finally {
            }
        } catch (Throwable th4) {
            Result.Companion companion3 = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th4));
        }
        Throwable m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
        if (m150exceptionOrNullimpl != null) {
            LiveChatUtil.log(m150exceptionOrNullimpl);
        }
    }

    public final h h(boolean z10, Float f10, Float f11) {
        L4.a f12 = new h().f(j.f29823a);
        Intrinsics.checkNotNullExpressionValue(f12, "diskCacheStrategy(...)");
        if (z10) {
            f12 = ((h) f12).c();
            Intrinsics.checkNotNullExpressionValue(f12, "circleCrop(...)");
        }
        if (f10 != null || f11 != null) {
            if (f10 != null) {
                float c10 = og.k.c(f10.floatValue());
            }
            if (f11 != null) {
            }
        }
        return (h) f12;
    }

    public final void l(File file, File destFile) {
        File parentFile;
        Intrinsics.checkNotNullParameter(destFile, "destFile");
        File parentFile2 = destFile.getParentFile();
        if (parentFile2 != null && !parentFile2.exists() && (parentFile = destFile.getParentFile()) != null) {
            parentFile.mkdirs();
        }
        if (!destFile.exists()) {
            destFile.createNewFile();
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            FileChannel channel = new FileInputStream(file).getChannel();
            try {
                FileChannel channel2 = new FileOutputStream(destFile).getChannel();
                try {
                    long transferFrom = channel2.transferFrom(channel, 0L, channel.size());
                    CloseableKt.closeFinally(channel2, null);
                    CloseableKt.closeFinally(channel, null);
                    Result.m147constructorimpl(Long.valueOf(transferFrom));
                } finally {
                }
            } finally {
            }
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m147constructorimpl(ResultKt.createFailure(th2));
        }
    }

    public final Application m() {
        Application e10 = MobilistenInitProvider.INSTANCE.e();
        Intrinsics.checkNotNull(e10);
        return e10;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(Continuation continuation) {
        c cVar;
        int i10;
        String brandLogoUrlIfAllowed;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i11 = cVar.f67592p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar.f67592p = i11 - Integer.MIN_VALUE;
                Object obj = cVar.f67590n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = cVar.f67592p;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Channel m10 = C6822a.m();
                    if (m10 == null || (brandLogoUrlIfAllowed = m10.getBrandLogoUrlIfAllowed()) == null) {
                        return null;
                    }
                    d dVar = f67581a;
                    C5252a s10 = dVar.s();
                    String y10 = dVar.y("/brand/logo.jpg");
                    cVar.f67592p = 1;
                    obj = s10.a(brandLogoUrlIfAllowed, y10, cVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return (File) ((C5582a) obj).b();
            }
        }
        cVar = new c(continuation);
        Object obj2 = cVar.f67590n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = cVar.f67592p;
        if (i10 != 0) {
        }
        return (File) ((C5582a) obj2).b();
    }

    public final File o() {
        String y10 = y("/brand/logo.jpg");
        Channel m10 = C6822a.m();
        if (m10 == null || m10.getBrandLogoUrlIfAllowed() == null) {
            return null;
        }
        return f67581a.x(y10);
    }

    public final File p(Context context, Object model) {
        Object m147constructorimpl;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(model, "model");
        try {
            Result.Companion companion = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl((File) com.bumptech.glide.c.u(context).o().A0(model).G0().get());
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
        if (m150exceptionOrNullimpl != null) {
            LiveChatUtil.log(m150exceptionOrNullimpl);
        }
        if (Result.m153isFailureimpl(m147constructorimpl)) {
            m147constructorimpl = null;
        }
        return (File) m147constructorimpl;
    }

    public final C4377a q() {
        return (C4377a) f67586f.getValue();
    }

    public final Drawable r(Context context, Integer num) {
        androidx.swiperefreshlayout.widget.b bVar = new androidx.swiperefreshlayout.widget.b(context);
        bVar.l(og.k.d(2));
        bVar.f(og.k.d(16));
        bVar.h(0.5f);
        bVar.g(num != null ? num.intValue() : AbstractC5892d.h(context, Integer.valueOf(AbstractC5886l.f59710E0), 0.0f, 2, null));
        bVar.start();
        return bVar;
    }

    public final C5252a s() {
        return (C5252a) f67587g.getValue();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(1:10)(2:19|20))(3:21|22|(1:24))|11|12|(1:14)|15|16))|27|6|7|(0)(0)|11|12|(0)|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0029, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0052, code lost:
    
        r7 = kotlin.Result.INSTANCE;
        r6 = kotlin.Result.m147constructorimpl(kotlin.ResultKt.createFailure(r6));
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object t(Context context, Object obj, Continuation continuation) {
        C0959d c0959d;
        int i10;
        Throwable m150exceptionOrNullimpl;
        if (continuation instanceof C0959d) {
            c0959d = (C0959d) continuation;
            int i11 = c0959d.f67595p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c0959d.f67595p = i11 - Integer.MIN_VALUE;
                Object obj2 = c0959d.f67593n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = c0959d.f67595p;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj2);
                    Result.Companion companion = Result.INSTANCE;
                    L b10 = C1452g0.b();
                    e eVar = new e(context, obj, null);
                    c0959d.f67595p = 1;
                    obj2 = AbstractC1455i.g(b10, eVar, c0959d);
                    if (obj2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj2);
                }
                Object m147constructorimpl = Result.m147constructorimpl((Bitmap) obj2);
                m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                if (m150exceptionOrNullimpl != null) {
                    LiveChatUtil.log(m150exceptionOrNullimpl);
                }
                return me.b.a(m147constructorimpl);
            }
        }
        c0959d = new C0959d(continuation);
        Object obj22 = c0959d.f67593n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = c0959d.f67595p;
        if (i10 != 0) {
        }
        Object m147constructorimpl2 = Result.m147constructorimpl((Bitmap) obj22);
        m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl2);
        if (m150exceptionOrNullimpl != null) {
        }
        return me.b.a(m147constructorimpl2);
    }

    public final File x(String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        File file = new File(path);
        if (file.length() > 0) {
            return file;
        }
        return null;
    }

    public final String y(String suffix) {
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        return new C3946o(m()).e().getAbsolutePath() + suffix;
    }

    public final String z(String str) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        return options.outMimeType;
    }
}
