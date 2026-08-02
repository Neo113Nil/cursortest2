package k2;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import com.google.android.gms.internal.play_billing.e1;
import com.sports.insider.R;
import com.sports.insider.domain.entity.CustomTypefaceSpan;
import io.sentry.android.core.r0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.TypeIntrinsics;
import okio.Segment;
import sg.s0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class x {
    public static final Object A(Function2 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Thread.interrupted();
        return eg.c0.w(kotlin.coroutines.g.f19227a, new ab.b(block, null));
    }

    public static void B(SpannableStringBuilder spannableStringBuilder, int i5, int i10, CustomTypefaceSpan typefaceSpan) {
        Intrinsics.checkNotNullParameter(spannableStringBuilder, "<this>");
        Intrinsics.checkNotNullParameter(typefaceSpan, "typefaceSpan");
        try {
            spannableStringBuilder.setSpan(typefaceSpan, i5, i10, 18);
        } catch (Exception unused) {
        }
    }

    public static boolean D(io.sentry.h0 h0Var) {
        return !(io.sentry.hints.d.class.isInstance(h0Var.b("sentry:typeCheckHint")) || io.sentry.hints.b.class.isInstance(h0Var.b("sentry:typeCheckHint"))) || r0.class.isInstance(h0Var.b("sentry:typeCheckHint"));
    }

    public static byte[] E(com.google.firebase.messaging.d dVar) {
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int min = Math.min(Segment.SIZE, Math.max(128, Integer.highestOneBit(0) * 2));
        int i5 = 0;
        while (i5 < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i5);
            byte[] bArr = new byte[min2];
            arrayDeque.add(bArr);
            int i10 = 0;
            while (i10 < min2) {
                int read = dVar.read(bArr, i10, min2 - i10);
                if (read == -1) {
                    return i(arrayDeque, i5);
                }
                i10 += read;
                i5 += read;
            }
            long j = min * (min < 4096 ? 4 : 2);
            min = j > 2147483647L ? Integer.MAX_VALUE : j < -2147483648L ? Integer.MIN_VALUE : (int) j;
        }
        if (dVar.read() == -1) {
            return i(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    public static int F(int i5) {
        int[] iArr = {1, 2, 3, 4, 5, 6};
        for (int i10 = 0; i10 < 6; i10++) {
            int i11 = iArr[i10];
            int i12 = i11 - 1;
            if (i11 == 0) {
                throw null;
            }
            if (i12 == i5) {
                return i11;
            }
        }
        return 1;
    }

    public static gg.h a(int i5, int i10, gg.a aVar) {
        if ((i10 & 2) != 0) {
            aVar = gg.a.f10048a;
        }
        if (i5 == -2) {
            if (aVar != gg.a.f10048a) {
                return new gg.s(1, aVar);
            }
            gg.l.e0.getClass();
            return new gg.h(gg.k.f10092b);
        }
        if (i5 != -1) {
            return i5 != 0 ? i5 != Integer.MAX_VALUE ? aVar == gg.a.f10048a ? new gg.h(i5) : new gg.s(i5, aVar) : new gg.h(Integer.MAX_VALUE) : aVar == gg.a.f10048a ? new gg.h(0) : new gg.s(1, aVar);
        }
        if (aVar == gg.a.f10048a) {
            return new gg.s(1, gg.a.f10049b);
        }
        throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
    }

    public static boolean b(xg.p pVar, v9.o oVar) {
        String str = oVar.f24529a;
        String str2 = oVar.f24530b;
        String str3 = oVar.f24531c;
        if (str != null) {
            String v5 = pVar.v();
            if (v5.isEmpty() || !str.equals(v5)) {
                return false;
            }
        }
        if (str2 != null) {
            String u10 = pVar.u();
            if (u10.isEmpty() || !str2.equals(u10)) {
                return false;
            }
        }
        if (str3 != null) {
            return pVar.t() > 0 && str3.equalsIgnoreCase(pVar.s());
        }
        return true;
    }

    public static final Context d(ji.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        try {
            return (Context) aVar.a(Reflection.getOrCreateKotlinClass(Context.class), null);
        } catch (bi.a unused) {
            Intrinsics.checkNotNullParameter("Can't resolve Context instance. Please use androidContext() function in your KoinApplication configuration.", "s");
            throw new e1("Can't resolve Context instance. Please use androidContext() function in your KoinApplication configuration.", 5);
        }
    }

    public static void e(Object obj, Object obj2) {
        if (obj == null) {
            String valueOf = String.valueOf(obj2);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 24);
            sb2.append("null key in entry: null=");
            sb2.append(valueOf);
            throw new NullPointerException(sb2.toString());
        }
        if (obj2 != null) {
            return;
        }
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb3 = new StringBuilder(valueOf2.length() + 26);
        sb3.append("null value in entry: ");
        sb3.append(valueOf2);
        sb3.append("=null");
        throw new NullPointerException(sb3.toString());
    }

    public static void f(int i5, String str) {
        if (i5 >= 0) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 40);
        sb2.append(str);
        sb2.append(" cannot be negative but was: ");
        sb2.append(i5);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static final int g(s2.c cVar, String name) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        int h10 = h(cVar, name);
        if (h10 >= 0) {
            return h10;
        }
        int h11 = h(cVar, "`" + name + '`');
        if (h11 >= 0) {
            return h11;
        }
        if (Build.VERSION.SDK_INT > 25 || name.length() == 0) {
            return -1;
        }
        int columnCount = cVar.getColumnCount();
        String concat = ".".concat(name);
        String e7 = d9.e.e('`', ".", name);
        for (int i5 = 0; i5 < columnCount; i5++) {
            String columnName = cVar.getColumnName(i5);
            if (columnName.length() >= name.length() + 2 && (kotlin.text.z.i(columnName, concat, false) || (columnName.charAt(0) == '`' && kotlin.text.z.i(columnName, e7, false)))) {
                return i5;
            }
        }
        return -1;
    }

    public static final int h(s2.c cVar, String name) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        int columnCount = cVar.getColumnCount();
        for (int i5 = 0; i5 < columnCount; i5++) {
            if (Intrinsics.areEqual(name, cVar.getColumnName(i5))) {
                return i5;
            }
        }
        return -1;
    }

    public static byte[] i(ArrayDeque arrayDeque, int i5) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i5) {
            return bArr;
        }
        int length = i5 - bArr.length;
        byte[] copyOf = Arrays.copyOf(bArr, i5);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int min = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, copyOf, i5 - length, min);
            length -= min;
        }
        return copyOf;
    }

    public static o8.b j(String str, String str2) {
        h9.a aVar = new h9.a(str, str2);
        o8.a a7 = o8.b.a(h9.a.class);
        a7.f21099e = 1;
        a7.f21100f = new io.sentry.android.core.internal.gestures.c(13, aVar);
        return a7.b();
    }

    public static io.sentry.h0 k(Object obj) {
        io.sentry.h0 h0Var = new io.sentry.h0();
        h0Var.d(obj, "sentry:typeCheckHint");
        return h0Var;
    }

    public static void l(com.logrocket.core.graphics.n nVar, View view, Paint paint) {
        int i5;
        if (paint != null) {
            int i10 = u9.g.f24105b[paint.getStyle().ordinal()];
            char c2 = i10 != 1 ? i10 != 2 ? (char) 2 : (char) 3 : (char) 4;
            int i11 = 1;
            if (c2 != 2) {
                i11 = 3;
                if (c2 == 3) {
                    i11 = 2;
                } else if (c2 != 4) {
                    throw null;
                }
            }
            nVar.e(com.logrocket.core.graphics.c.paintStyle, Integer.valueOf(i11));
            nVar.e(com.logrocket.core.graphics.c.color, Integer.valueOf(paint.getColor()));
            nVar.e(com.logrocket.core.graphics.c.strokeWidth, Integer.valueOf((int) paint.getStrokeWidth()));
            int i12 = u9.g.f24104a[paint.getTextAlign().ordinal()];
            switch (i12 != 1 ? i12 != 2 ? 3 : 4 : 2) {
                case true:
                    i5 = 0;
                    break;
                case true:
                    i5 = 1;
                    break;
                case true:
                    i5 = 2;
                    break;
                case true:
                    i5 = 3;
                    break;
                case true:
                    i5 = 4;
                    break;
                case true:
                    i5 = -1;
                    break;
                default:
                    throw null;
            }
            nVar.e(com.logrocket.core.graphics.c.textAlign, Integer.valueOf(i5));
            nVar.e(com.logrocket.core.graphics.c.textSize, Float.valueOf(paint.getTextSize()));
            androidx.core.view.k.c(nVar, paint.getTypeface());
            Shader shader = paint.getShader();
            if (shader != null) {
                boolean z5 = shader instanceof LinearGradient;
                com.logrocket.core.graphics.c cVar = com.logrocket.core.graphics.c.tileMode;
                com.logrocket.core.graphics.c cVar2 = com.logrocket.core.graphics.c.pts;
                com.logrocket.core.graphics.c cVar3 = com.logrocket.core.graphics.c.gradientY0;
                com.logrocket.core.graphics.c cVar4 = com.logrocket.core.graphics.c.gradientX0;
                com.logrocket.core.graphics.c cVar5 = com.logrocket.core.graphics.c.gradientType;
                com.logrocket.core.graphics.c cVar6 = com.logrocket.core.graphics.c.colors;
                try {
                    if (z5) {
                        LinearGradient linearGradient = (LinearGradient) shader;
                        if (u9.d.f24084k) {
                            nVar.e(cVar5, Integer.valueOf(r4.k.g(2)));
                            nVar.e(cVar4, Integer.valueOf((int) u9.d.f24075a.getFloat(linearGradient)));
                            nVar.e(cVar3, Integer.valueOf((int) u9.d.f24076b.getFloat(linearGradient)));
                            nVar.e(com.logrocket.core.graphics.c.gradientX1, Integer.valueOf((int) u9.d.f24077c.getFloat(linearGradient)));
                            nVar.e(com.logrocket.core.graphics.c.gradientY1, Integer.valueOf((int) u9.d.f24078d.getFloat(linearGradient)));
                            float[] fArr = (float[]) u9.d.f24079e.get(linearGradient);
                            if (fArr != null) {
                                nVar.e(cVar2, fArr);
                            }
                            Shader.TileMode tileMode = (Shader.TileMode) u9.d.f24080f.get(linearGradient);
                            if (tileMode != null) {
                                nVar.e(cVar, Integer.valueOf(rh.g.i(tileMode)));
                            }
                            int[] r5 = s6.a.r(linearGradient, u9.d.f24081g, u9.d.j);
                            if (r5 == null) {
                                nVar.e(cVar6, new int[]{u9.d.f24082h.getInt(linearGradient), u9.d.f24083i.getInt(linearGradient)});
                            } else {
                                nVar.e(cVar6, r5);
                            }
                        }
                    } else if (shader instanceof RadialGradient) {
                        RadialGradient radialGradient = (RadialGradient) shader;
                        if (u9.i.j) {
                            nVar.e(cVar5, Integer.valueOf(r4.k.g(3)));
                            nVar.e(cVar4, Integer.valueOf((int) u9.i.f24107a.getFloat(radialGradient)));
                            nVar.e(cVar3, Integer.valueOf((int) u9.i.f24108b.getFloat(radialGradient)));
                            nVar.e(com.logrocket.core.graphics.c.radialGradientRadius, Float.valueOf(u9.i.f24109c.getFloat(radialGradient)));
                            float[] fArr2 = (float[]) u9.i.f24110d.get(radialGradient);
                            if (fArr2 != null) {
                                nVar.e(cVar2, fArr2);
                            }
                            Shader.TileMode tileMode2 = (Shader.TileMode) u9.i.f24111e.get(radialGradient);
                            if (tileMode2 != null) {
                                nVar.e(cVar, Integer.valueOf(rh.g.i(tileMode2)));
                            }
                            int[] r6 = s6.a.r(radialGradient, u9.i.f24112f, u9.i.f24115i);
                            if (r6 == null) {
                                nVar.e(cVar6, new int[]{u9.i.f24113g.getInt(radialGradient), u9.i.f24114h.getInt(radialGradient)});
                            } else {
                                nVar.e(cVar6, r6);
                            }
                        }
                    } else if (shader instanceof SweepGradient) {
                        SweepGradient sweepGradient = (SweepGradient) shader;
                        if (u9.j.f24123h) {
                            nVar.e(cVar5, Integer.valueOf(r4.k.g(4)));
                            nVar.e(cVar4, Integer.valueOf((int) u9.j.f24116a.getFloat(sweepGradient)));
                            nVar.e(cVar3, Integer.valueOf((int) u9.j.f24117b.getFloat(sweepGradient)));
                            float[] fArr3 = (float[]) u9.j.f24118c.get(sweepGradient);
                            if (fArr3 != null) {
                                nVar.e(cVar2, fArr3);
                            }
                            int[] r10 = s6.a.r(sweepGradient, u9.j.f24119d, u9.j.f24122g);
                            if (r10 == null) {
                                nVar.e(cVar6, new int[]{u9.j.f24120e.getInt(sweepGradient), u9.j.f24121f.getInt(sweepGradient)});
                            } else {
                                nVar.e(cVar6, r10);
                            }
                        }
                    }
                } catch (IllegalAccessException unused) {
                }
            }
            u9.c.a(view, nVar, paint.getColorFilter());
        }
    }

    public static final Object m(p pVar, String str, mf.c cVar) {
        Object c2 = pVar.c(str, new d0(0), cVar);
        return c2 == lf.a.f20034a ? c2 : Unit.f19194a;
    }

    public static final og.a n(sg.b bVar, rg.a decoder, String str) {
        og.a aVar;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        bVar.getClass();
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        c4.d n9 = decoder.n();
        ag.c baseClass = ((og.d) bVar).f21222a;
        n9.getClass();
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Map map = (Map) ((Map) n9.f3580e).get(baseClass);
        og.a aVar2 = map != null ? (og.a) map.get(str) : null;
        if (!(aVar2 instanceof og.a)) {
            aVar2 = null;
        }
        if (aVar2 != null) {
            aVar = aVar2;
        } else {
            Object obj = ((Map) n9.f3581f).get(baseClass);
            Function1 function1 = TypeIntrinsics.isFunctionOfArity(obj, 1) ? (Function1) obj : null;
            aVar = function1 != null ? (og.a) function1.invoke(str) : null;
        }
        if (aVar != null) {
            return aVar;
        }
        s0.g(baseClass, str);
        throw null;
    }

    public static final og.a o(sg.b bVar, ug.s encoder, Object value) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        bVar.getClass();
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        c4.d u10 = encoder.u();
        ag.c baseClass = ((og.d) bVar).f21222a;
        og.a h10 = u10.h(baseClass, value);
        if (h10 != null) {
            return h10;
        }
        ag.c subClass = Reflection.getOrCreateKotlinClass(value.getClass());
        Intrinsics.checkNotNullParameter(subClass, "subClass");
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        String simpleName = subClass.getSimpleName();
        if (simpleName == null) {
            simpleName = String.valueOf(subClass);
        }
        s0.g(baseClass, simpleName);
        throw null;
    }

    public static o8.b p(String str, com.google.firebase.messaging.k kVar) {
        o8.a a7 = o8.b.a(h9.a.class);
        a7.f21099e = 1;
        a7.a(o8.h.a(Context.class));
        a7.f21100f = new com.google.firebase.messaging.g(5, str, kVar);
        return a7.b();
    }

    public static String q(KeyEvent.Callback callback) {
        if (callback == null) {
            return null;
        }
        String canonicalName = callback.getClass().getCanonicalName();
        return canonicalName != null ? canonicalName : callback.getClass().getSimpleName();
    }

    public static final int r(s2.c stmt, String name) {
        Intrinsics.checkNotNullParameter(stmt, "stmt");
        Intrinsics.checkNotNullParameter(name, "name");
        int g10 = g(stmt, name);
        if (g10 >= 0) {
            return g10;
        }
        int columnCount = stmt.getColumnCount();
        ArrayList arrayList = new ArrayList(columnCount);
        for (int i5 = 0; i5 < columnCount; i5++) {
            arrayList.add(stmt.getColumnName(i5));
        }
        throw new IllegalArgumentException("Column '" + name + "' does not exist. Available columns: [" + CollectionsKt.J(arrayList, null, null, null, null, 63) + ']');
    }

    public static final q4.s s(View view) {
        q4.s sVar;
        Object tag = view.getTag(R.id.coil3_request_manager);
        q4.s sVar2 = tag instanceof q4.s ? (q4.s) tag : null;
        if (sVar2 != null) {
            return sVar2;
        }
        synchronized (view) {
            try {
                Object tag2 = view.getTag(R.id.coil3_request_manager);
                sVar = tag2 instanceof q4.s ? (q4.s) tag2 : null;
                if (sVar == null) {
                    sVar = new q4.s();
                    view.addOnAttachStateChangeListener(sVar);
                    view.setTag(R.id.coil3_request_manager, sVar);
                }
            } finally {
            }
        }
        return sVar;
    }

    public static boolean t(io.sentry.h0 h0Var, Class cls) {
        return cls.isInstance(h0Var.b("sentry:typeCheckHint"));
    }

    public static boolean u(io.sentry.h0 h0Var) {
        return Boolean.TRUE.equals(h0Var.c(Boolean.class, "sentry:isFromHybridSdk"));
    }

    public static boolean v(byte b10) {
        return b10 > -65;
    }

    public static boolean w(byte b10) {
        return b10 > -65;
    }

    public static void x(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    public abstract void C(e.f0 f0Var, e.f0 f0Var2, Window window, View view, boolean z5, boolean z7);

    public void c(Window window) {
        Intrinsics.checkNotNullParameter(window, "window");
    }

    public abstract void y(Throwable th2);

    public abstract void z(com.google.firebase.messaging.x xVar);
}
