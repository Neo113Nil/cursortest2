package u6;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.drm.DrmManagerClient;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.VectorDrawable;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.o1;
import com.android.billingclient.api.l0;
import com.android.billingclient.api.t0;
import com.google.android.gms.internal.measurement.d5;
import com.google.android.gms.internal.play_billing.p1;
import com.google.firebase.messaging.u;
import com.google.firebase.messaging.x;
import com.sports.insider.R;
import eg.a0;
import gh.i0;
import gh.k0;
import gh.m0;
import gh.o0;
import gh.r0;
import gh.v;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.sentry.ILogger;
import io.sentry.android.core.w0;
import io.sentry.b5;
import io.sentry.b6;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;
import kotlin.collections.n0;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.ClassBasedDeclarationContainer;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import m4.p;
import m4.q;
import m4.r;
import m4.s;
import okhttp3.Headers;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import sg.a1;
import y1.t;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static ClassLoader f24067a;

    /* renamed from: b, reason: collision with root package name */
    public static Thread f24068b;

    public static void A(int i5, Object[] objArr) {
        for (int i10 = 0; i10 < i5; i10++) {
            if (objArr[i10] == null) {
                throw new NullPointerException(r4.k.o(new StringBuilder(String.valueOf(i10).length() + 9), "at index ", i10));
            }
        }
    }

    public static final p1.c a(float f6, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        return new p1.c(new float[]{f6, f10, f11, f12, f13, f14, f15, f16});
    }

    public static final r b(o0 o0Var) {
        BufferedSource m02;
        int i5 = o0Var.f10276d;
        long j = o0Var.f10283l;
        long j6 = o0Var.f10284m;
        Headers headers = o0Var.f10278f;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Pair<? extends String, ? extends String>> it = headers.iterator();
        while (it.hasNext()) {
            Pair<? extends String, ? extends String> next = it.next();
            String str = (String) next.f19192a;
            String str2 = (String) next.f19193b;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            Object obj = linkedHashMap.get(lowerCase);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(lowerCase, obj);
            }
            ((List) obj).add(str2);
        }
        p pVar = new p(n0.i(linkedHashMap));
        r0 r0Var = o0Var.f10279g;
        return new r(i5, j, j6, pVar, (r0Var == null || (m02 = r0Var.m0()) == null) ? null : new s(m02), o0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final i0 c(q qVar, mf.c cVar) {
        p4.d dVar;
        int i5;
        c4.d dVar2;
        String str;
        c4.d dVar3;
        q qVar2;
        k0 k0Var;
        if (cVar instanceof p4.d) {
            dVar = (p4.d) cVar;
            int i10 = dVar.f21517b;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar.f21517b = i10 - Integer.MIN_VALUE;
                Object obj = dVar.f21516a;
                lf.a aVar = lf.a.f20034a;
                i5 = dVar.f21517b;
                c4.d dVar4 = null;
                if (i5 != 0) {
                    h8.b.B(obj);
                    dVar2 = new c4.d(5);
                    dVar2.q(qVar.f20415a);
                    str = qVar.f20416b;
                    dVar3 = dVar2;
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    ByteString byteString = (ByteString) obj;
                    if (byteString != null) {
                        int i11 = m0.f10243a;
                        Intrinsics.checkNotNullParameter(byteString, "<this>");
                        k0Var = new k0(null, byteString);
                        qVar2 = null;
                        dVar3 = null;
                        str = null;
                        dVar4.j(str, k0Var);
                        p pVar = qVar2.f20417c;
                        v vVar = new v();
                        for (Map.Entry entry : pVar.f20414a.entrySet()) {
                            String str2 = (String) entry.getKey();
                            Iterator it = ((List) entry.getValue()).iterator();
                            while (it.hasNext()) {
                                vVar.c(str2, (String) it.next());
                            }
                        }
                        Headers headers = vVar.d();
                        dVar3.getClass();
                        Intrinsics.checkNotNullParameter(headers, "headers");
                        dVar3.f3579d = headers.newBuilder();
                        return new i0(dVar3);
                    }
                    qVar = null;
                    dVar2 = null;
                    dVar3 = null;
                    str = null;
                }
                c4.d dVar5 = dVar2;
                qVar2 = qVar;
                k0Var = null;
                dVar4 = dVar5;
                dVar4.j(str, k0Var);
                p pVar2 = qVar2.f20417c;
                v vVar2 = new v();
                while (r5.hasNext()) {
                }
                Headers headers2 = vVar2.d();
                dVar3.getClass();
                Intrinsics.checkNotNullParameter(headers2, "headers");
                dVar3.f3579d = headers2.newBuilder();
                return new i0(dVar3);
            }
        }
        dVar = new p4.d(cVar);
        Object obj2 = dVar.f21516a;
        lf.a aVar2 = lf.a.f20034a;
        i5 = dVar.f21517b;
        c4.d dVar42 = null;
        if (i5 != 0) {
        }
        c4.d dVar52 = dVar2;
        qVar2 = qVar;
        k0Var = null;
        dVar42 = dVar52;
        dVar42.j(str, k0Var);
        p pVar22 = qVar2.f20417c;
        v vVar22 = new v();
        while (r5.hasNext()) {
        }
        Headers headers22 = vVar22.d();
        dVar3.getClass();
        Intrinsics.checkNotNullParameter(headers22, "headers");
        dVar3.f3579d = headers22.newBuilder();
        return new i0(dVar3);
    }

    public static ArrayList d(Object obj, ArrayList arrayList) {
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        if (!arrayList.contains(obj)) {
            arrayList.add(obj);
        }
        return arrayList;
    }

    public static void e(StringBuilder sb2, String key) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        sb2.append('\"');
        int length = key.length();
        for (int i5 = 0; i5 < length; i5++) {
            char charAt = key.charAt(i5);
            if (charAt == '\n') {
                sb2.append("%0A");
            } else if (charAt == '\r') {
                sb2.append("%0D");
            } else if (charAt != '\"') {
                sb2.append(charAt);
            } else {
                sb2.append("%22");
            }
        }
        sb2.append('\"');
    }

    public static void f(int i5, Object[] objArr) {
        for (int i10 = 0; i10 < i5; i10++) {
            if (objArr[i10] == null) {
                StringBuilder sb2 = new StringBuilder(20);
                sb2.append("at index ");
                sb2.append(i10);
                throw new NullPointerException(sb2.toString());
            }
        }
    }

    public static final void g(AutoCloseable autoCloseable, Throwable th2) {
        if (autoCloseable != null) {
            if (th2 != null) {
                try {
                    r4.k.r(autoCloseable);
                    return;
                } catch (Throwable th3) {
                    gf.d.a(th2, th3);
                    return;
                }
            }
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
                return;
            }
            if (autoCloseable instanceof ExecutorService) {
                com.appsflyer.internal.h.h((ExecutorService) autoCloseable);
                return;
            }
            if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
                return;
            }
            if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
                return;
            }
            if (autoCloseable instanceof MediaDrm) {
                ((MediaDrm) autoCloseable).release();
            } else if (autoCloseable instanceof DrmManagerClient) {
                ((DrmManagerClient) autoCloseable).release();
            } else {
                if (!(autoCloseable instanceof ContentProviderClient)) {
                    throw new IllegalArgumentException();
                }
                ((ContentProviderClient) autoCloseable).release();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0041, code lost:
    
        if (kotlin.text.StringsKt.A(r1, "sentry-unmask", false) == true) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0075, code lost:
    
        if (kotlin.text.StringsKt.A(r5, "sentry-mask", false) == true) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static io.sentry.android.replay.viewhierarchy.f h(View view, io.sentry.android.replay.viewhierarchy.f fVar, b6 options) {
        boolean z5;
        boolean z7;
        boolean z10;
        Bitmap bitmap;
        int extendedPaddingTop;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(options, "options");
        Pair g10 = u.g(view);
        boolean booleanValue = ((Boolean) g10.f19192a).booleanValue();
        Rect rect = (Rect) g10.f19193b;
        if (booleanValue) {
            Object tag = view.getTag();
            String str = tag instanceof String ? (String) tag : null;
            if (str != null) {
                String lowerCase = str.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                if (lowerCase != null) {
                }
            }
            if (!Intrinsics.areEqual(view.getTag(R.id.sentry_privacy), "unmask")) {
                Object tag2 = view.getTag();
                String str2 = tag2 instanceof String ? (String) tag2 : null;
                if (str2 != null) {
                    String lowerCase2 = str2.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                    if (lowerCase2 != null) {
                    }
                }
                if (!Intrinsics.areEqual(view.getTag(R.id.sentry_privacy), "mask")) {
                    options.getSessionReplay().getClass();
                    if (view.getParent() != null) {
                        Intrinsics.checkNotNullExpressionValue(view.getParent(), "getParent(...)");
                        options.getSessionReplay().getClass();
                    }
                    Class<?> cls = view.getClass();
                    CopyOnWriteArraySet copyOnWriteArraySet = options.getSessionReplay().f16403d;
                    Intrinsics.checkNotNullExpressionValue(copyOnWriteArraySet, "getUnmaskViewClasses(...)");
                    while (true) {
                        if (cls == null) {
                            CopyOnWriteArraySet copyOnWriteArraySet2 = options.getSessionReplay().f16402c;
                            Intrinsics.checkNotNullExpressionValue(copyOnWriteArraySet2, "getMaskViewClasses(...)");
                            for (Class<?> cls2 = view.getClass(); cls2 != null; cls2 = cls2.getSuperclass()) {
                                if (!copyOnWriteArraySet2.contains(cls2.getName())) {
                                }
                            }
                        } else {
                            if (copyOnWriteArraySet.contains(cls.getName())) {
                                break;
                            }
                            cls = cls.getSuperclass();
                        }
                    }
                }
                z5 = true;
                if (!(view instanceof TextView)) {
                    TextView textView = (TextView) view;
                    Layout layout = textView.getLayout();
                    i2.d dVar = layout != null ? new i2.d(layout) : null;
                    int currentTextColor = textView.getCurrentTextColor() | (-16777216);
                    int totalPaddingLeft = textView.getTotalPaddingLeft();
                    Intrinsics.checkNotNullParameter(textView, "<this>");
                    try {
                        extendedPaddingTop = textView.getTotalPaddingTop();
                    } catch (NullPointerException unused) {
                        extendedPaddingTop = textView.getExtendedPaddingTop();
                    }
                    int i5 = extendedPaddingTop;
                    textView.getX();
                    textView.getY();
                    return new io.sentry.android.replay.viewhierarchy.e(dVar, Integer.valueOf(currentTextColor), totalPaddingLeft, i5, textView.getWidth(), textView.getHeight(), textView.getElevation() + (fVar != null ? fVar.f16164c : 0.0f), fVar, z5, rect);
                }
                boolean z11 = z5;
                if (!(view instanceof ImageView)) {
                    view.getX();
                    view.getY();
                    return new io.sentry.android.replay.viewhierarchy.c(view.getWidth(), view.getHeight(), view.getElevation() + (fVar != null ? fVar.f16164c : 0.0f), fVar, z11, rect);
                }
                ImageView imageView = (ImageView) view;
                imageView.getX();
                imageView.getY();
                int width = imageView.getWidth();
                int height = imageView.getHeight();
                float elevation = imageView.getElevation() + (fVar != null ? fVar.f16164c : 0.0f);
                if (z11) {
                    Drawable drawable = imageView.getDrawable();
                    if (drawable != null) {
                        if (!(drawable instanceof InsetDrawable ? true : drawable instanceof ColorDrawable ? true : drawable instanceof VectorDrawable ? true : drawable instanceof GradientDrawable) && (!(drawable instanceof BitmapDrawable) || ((bitmap = ((BitmapDrawable) drawable).getBitmap()) != null && !bitmap.isRecycled() && bitmap.getHeight() > 10 && bitmap.getWidth() > 10))) {
                            z10 = true;
                            if (z10) {
                                z7 = true;
                                return new io.sentry.android.replay.viewhierarchy.d(width, height, elevation, fVar, z7, rect);
                            }
                        }
                    }
                    z10 = false;
                    if (z10) {
                    }
                }
                z7 = false;
                return new io.sentry.android.replay.viewhierarchy.d(width, height, elevation, fVar, z7, rect);
            }
        }
        z5 = false;
        if (!(view instanceof TextView)) {
        }
    }

    public static final ag.c i(qg.g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        if (gVar instanceof qg.b) {
            return ((qg.b) gVar).f22153b;
        }
        if (gVar instanceof a1) {
            return i(((a1) gVar).f23606a);
        }
        return null;
    }

    public static y1.s j(o1 store) {
        Intrinsics.checkNotNullParameter(store, "viewModelStore");
        t1.d factory = t.f25633a;
        t1.a defaultCreationExtras = t1.a.f23739b;
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "extras");
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        x xVar = new x(store, factory, defaultCreationExtras);
        ag.c modelClass = Reflection.getOrCreateKotlinClass(y1.s.class);
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        String r5 = d5.r(modelClass);
        if (r5 != null) {
            return (y1.s) xVar.x(modelClass, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r5));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public static final Class k(ag.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Class<?> jClass = ((ClassBasedDeclarationContainer) cVar).getJClass();
        Intrinsics.checkNotNull(jClass, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return jClass;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class l(ag.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Class<?> jClass = ((ClassBasedDeclarationContainer) cVar).getJClass();
        if (!jClass.isPrimitive()) {
            Intrinsics.checkNotNull(jClass, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
            return jClass;
        }
        String name = jClass.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    jClass = Double.class;
                    break;
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    jClass = Integer.class;
                    break;
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    jClass = Byte.class;
                    break;
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    jClass = Character.class;
                    break;
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    jClass = Long.class;
                    break;
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    jClass = Void.class;
                    break;
                }
                break;
            case 64711720:
                if (name.equals("boolean")) {
                    jClass = Boolean.class;
                    break;
                }
                break;
            case 97526364:
                if (name.equals("float")) {
                    jClass = Float.class;
                    break;
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    jClass = Short.class;
                    break;
                }
                break;
        }
        Intrinsics.checkNotNull(jClass, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
        return jClass;
    }

    public static final ag.c m(Class cls) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        return Reflection.getOrCreateKotlinClass(cls);
    }

    public static char n(int i5) {
        switch (i5 / 10) {
            case 0:
                return '0';
            case 1:
                return '1';
            case 2:
                return '2';
            case 3:
                return '3';
            case 4:
                return '4';
            case 5:
                return '5';
            case 6:
                return '6';
            case 7:
                return '7';
            case 8:
                return '8';
            default:
                return '9';
        }
    }

    public static char o(int i5) {
        switch (i5 % 10) {
            case 0:
                return '0';
            case 1:
                return '1';
            case 2:
                return '2';
            case 3:
                return '3';
            case 4:
                return '4';
            case 5:
                return '5';
            case 6:
                return '6';
            case 7:
                return '7';
            case 8:
                return '8';
            default:
                return '9';
        }
    }

    public static boolean p(MotionEvent motionEvent, int i5) {
        return (motionEvent.getSource() & i5) == i5;
    }

    public static u.k q(CoroutineContext context, Function2 block) {
        a0 start = a0.f9136a;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(block, "block");
        u.k s8 = ci.c.s(new com.google.firebase.messaging.g(context, block));
        Intrinsics.checkNotNullExpressionValue(s8, "getFuture(...)");
        return s8;
    }

    public static void r(Class cls, Object obj, ILogger iLogger) {
        iLogger.h(b5.DEBUG, "%s is not %s", obj != null ? obj.getClass().getCanonicalName() : "Hint", cls.getCanonicalName());
    }

    public static ei.a s(Function1 moduleDeclaration) {
        Intrinsics.checkNotNullParameter(moduleDeclaration, "moduleDeclaration");
        ei.a aVar = new ei.a();
        moduleDeclaration.invoke(aVar);
        return aVar;
    }

    public static r t(BufferedSource bufferedSource) {
        int parseInt = Integer.parseInt(bufferedSource.readUtf8LineStrict());
        long parseLong = Long.parseLong(bufferedSource.readUtf8LineStrict());
        long parseLong2 = Long.parseLong(bufferedSource.readUtf8LineStrict());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int parseInt2 = Integer.parseInt(bufferedSource.readUtf8LineStrict());
        for (int i5 = 0; i5 < parseInt2; i5++) {
            String readUtf8LineStrict = bufferedSource.readUtf8LineStrict();
            int F = StringsKt.F(readUtf8LineStrict, ':', 0, false, 6);
            if (F == -1) {
                throw new IllegalArgumentException("Unexpected header: ".concat(readUtf8LineStrict).toString());
            }
            String substring = readUtf8LineStrict.substring(0, F);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            String obj = StringsKt.Z(substring).toString();
            String substring2 = readUtf8LineStrict.substring(F + 1);
            Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
            String lowerCase = obj.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            Object obj2 = linkedHashMap.get(lowerCase);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(lowerCase, obj2);
            }
            ((List) obj2).add(substring2);
        }
        return new r(parseInt, parseLong, parseLong2, new p(n0.i(linkedHashMap)), null, null);
    }

    public static ArrayList u(Object obj, ArrayList arrayList) {
        if (arrayList != null) {
            arrayList.remove(obj);
            if (arrayList.isEmpty()) {
                return null;
            }
        }
        return arrayList;
    }

    public static boolean v(WeakReference weakReference, String str, String str2) {
        Context context = (Context) weakReference.get();
        if (context == null) {
            return false;
        }
        try {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.SUBJECT", "Sharing URL");
            if (str != null) {
                intent.setType(str);
            }
            intent.putExtra("android.intent.extra.TEXT", str2);
            Intent createChooser = Intent.createChooser(intent, "Share URL");
            int i5 = Build.VERSION.SDK_INT;
            if (i5 < 24 || i5 >= 28) {
                createChooser.addFlags(268435456);
            }
            context.startActivity(createChooser);
            return true;
        } catch (Exception e7) {
            zc.d.b(6, null, e7);
            return false;
        }
    }

    public static final o0 w(o0 o0Var) {
        Intrinsics.checkNotNullParameter(o0Var, "<this>");
        gh.n0 k6 = o0Var.k();
        r0 r0Var = o0Var.f10279g;
        hh.c body = new hh.c(r0Var.n(), r0Var.k());
        Intrinsics.checkNotNullParameter(body, "body");
        k6.f10263g = body;
        return k6.a();
    }

    public static void x(r rVar, BufferedSink bufferedSink) {
        bufferedSink.writeDecimalLong(rVar.f20419a).writeByte(10);
        bufferedSink.writeDecimalLong(rVar.f20420b).writeByte(10);
        bufferedSink.writeDecimalLong(rVar.f20421c).writeByte(10);
        Set<Map.Entry> entrySet = rVar.f20422d.f20414a.entrySet();
        Iterator it = entrySet.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            i5 += ((List) ((Map.Entry) it.next()).getValue()).size();
        }
        bufferedSink.writeDecimalLong(i5).writeByte(10);
        for (Map.Entry entry : entrySet) {
            Iterator it2 = ((List) entry.getValue()).iterator();
            while (it2.hasNext()) {
                bufferedSink.writeUtf8((String) entry.getKey()).writeUtf8(StringUtils.PROCESS_POSTFIX_DELIMITER).writeUtf8((String) it2.next()).writeByte(10);
            }
        }
    }

    public static l0 y(Bundle bundle, String str) {
        com.android.billingclient.api.k kVar = t0.j;
        if (bundle == null) {
            p1.g("BillingClient", str.concat(" got null owned items list"));
            return new l0(54, 1, kVar);
        }
        int a7 = p1.a(bundle, "BillingClient");
        String e7 = p1.e(bundle, "BillingClient");
        com.android.billingclient.api.j a10 = com.android.billingclient.api.k.a();
        a10.f4033a = a7;
        a10.f4034b = e7;
        com.android.billingclient.api.k a11 = a10.a();
        if (a7 != 0) {
            p1.g("BillingClient", str + " failed. Response code: " + a7);
            return new l0(23, 1, a11);
        }
        if (!bundle.containsKey("INAPP_PURCHASE_ITEM_LIST") || !bundle.containsKey("INAPP_PURCHASE_DATA_LIST") || !bundle.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
            p1.g("BillingClient", "Bundle returned from " + str + " doesn't contain required fields.");
            return new l0(55, 1, kVar);
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList3 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        if (stringArrayList == null) {
            p1.g("BillingClient", "Bundle returned from " + str + " contains null SKUs list.");
            return new l0(56, 1, kVar);
        }
        if (stringArrayList2 == null) {
            p1.g("BillingClient", "Bundle returned from " + str + " contains null purchases list.");
            return new l0(57, 1, kVar);
        }
        if (stringArrayList3 != null) {
            return new l0(1, 1, t0.f4089k);
        }
        p1.g("BillingClient", "Bundle returned from " + str + " contains null signatures list.");
        return new l0(58, 1, kVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00b0, code lost:
    
        if (r2 == null) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static synchronized ClassLoader z() {
        ClassLoader classLoader;
        SecurityException e7;
        Thread thread;
        ThreadGroup threadGroup;
        synchronized (h.class) {
            if (f24067a == null) {
                Thread thread2 = f24068b;
                ClassLoader classLoader2 = null;
                if (thread2 == null) {
                    ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
                    if (threadGroup2 == null) {
                        thread2 = null;
                    } else {
                        synchronized (Void.class) {
                            try {
                                try {
                                    int activeGroupCount = threadGroup2.activeGroupCount();
                                    ThreadGroup[] threadGroupArr = new ThreadGroup[activeGroupCount];
                                    threadGroup2.enumerate(threadGroupArr);
                                    int i5 = 0;
                                    int i10 = 0;
                                    while (true) {
                                        if (i10 >= activeGroupCount) {
                                            threadGroup = null;
                                            break;
                                        }
                                        threadGroup = threadGroupArr[i10];
                                        if ("dynamiteLoader".equals(threadGroup.getName())) {
                                            break;
                                        }
                                        i10++;
                                    }
                                    if (threadGroup == null) {
                                        threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                                    }
                                    int activeCount = threadGroup.activeCount();
                                    Thread[] threadArr = new Thread[activeCount];
                                    threadGroup.enumerate(threadArr);
                                    while (true) {
                                        if (i5 >= activeCount) {
                                            thread = null;
                                            break;
                                        }
                                        thread = threadArr[i5];
                                        if ("GmsDynamite".equals(thread.getName())) {
                                            break;
                                        }
                                        i5++;
                                    }
                                    if (thread == null) {
                                        try {
                                            g gVar = new g(threadGroup, "GmsDynamite");
                                            try {
                                                gVar.setContextClassLoader(null);
                                                gVar.start();
                                                thread = gVar;
                                            } catch (SecurityException e9) {
                                                e7 = e9;
                                                thread = gVar;
                                                String message = e7.getMessage();
                                                StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 39);
                                                sb2.append("Failed to enumerate thread/threadgroup ");
                                                sb2.append(message);
                                                w0.m("DynamiteLoaderV2CL", sb2.toString());
                                                thread2 = thread;
                                                f24068b = thread2;
                                            }
                                        } catch (SecurityException e10) {
                                            e7 = e10;
                                        }
                                    }
                                } finally {
                                }
                            } catch (SecurityException e11) {
                                e7 = e11;
                                thread = null;
                            }
                        }
                        thread2 = thread;
                    }
                    f24068b = thread2;
                }
                synchronized (thread2) {
                    try {
                        classLoader2 = f24068b.getContextClassLoader();
                    } catch (SecurityException e12) {
                        String message2 = e12.getMessage();
                        StringBuilder sb3 = new StringBuilder(String.valueOf(message2).length() + 41);
                        sb3.append("Failed to get thread context classloader ");
                        sb3.append(message2);
                        w0.m("DynamiteLoaderV2CL", sb3.toString());
                    }
                }
                f24067a = classLoader2;
            }
            classLoader = f24067a;
        }
        return classLoader;
    }
}
