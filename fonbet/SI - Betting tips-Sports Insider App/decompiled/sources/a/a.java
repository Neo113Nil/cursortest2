package a;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Log;
import android.util.Size;
import android.util.SizeF;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.c1;
import androidx.dynamicanimation.animation.g;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.p0;
import androidx.fragment.app.y;
import androidx.lifecycle.o1;
import androidx.navigation.fragment.NavHostFragment;
import c4.i;
import c4.m;
import c4.p;
import com.google.android.gms.internal.measurement.d5;
import com.google.android.gms.internal.measurement.y3;
import com.google.firebase.messaging.x;
import d9.e;
import e3.d0;
import e3.l;
import eg.c0;
import h8.b;
import io.sentry.d4;
import io.sentry.i1;
import io.sentry.instrumentation.file.f;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.t;
import kotlin.collections.v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import mf.c;
import org.xmlpull.v1.XmlPullParserException;
import p1.o;
import pe.s;
import q4.h;
import q4.j;
import q4.n;
import r4.d;
import r4.k;
import y1.q0;
import y1.r;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f3b = true;

    /* renamed from: c, reason: collision with root package name */
    public static Field f4c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f5d;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6a;

    public /* synthetic */ a(int i5) {
        this.f6a = i5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0084, code lost:
    
        if (kotlin.collections.p.p(v4.r.f24431a, r6) != false) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x00dd -> B:10:0x00e5). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object B(i4.a aVar, h hVar, n nVar, i iVar, c cVar) {
        i4.i iVar2;
        int i5;
        int i10;
        Bitmap l6;
        Bitmap bitmap;
        i4.i iVar3;
        i iVar4;
        n nVar2;
        h hVar2;
        i4.a aVar2;
        int size;
        List list;
        int i11;
        if (cVar instanceof i4.i) {
            iVar2 = (i4.i) cVar;
            int i12 = iVar2.j;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                iVar2.j = i12 - Integer.MIN_VALUE;
                Object obj = iVar2.f10986i;
                lf.a aVar3 = lf.a.f20034a;
                i5 = iVar2.j;
                if (i5 != 0) {
                    b.B(obj);
                    List list2 = (List) p.e(hVar, q4.i.f21995a);
                    if (list2.isEmpty()) {
                        return aVar;
                    }
                    m mVar = aVar.f10923a;
                    boolean z5 = mVar instanceof c4.a;
                    if (!z5 && !((Boolean) p.e(hVar, q4.i.f21998d)).booleanValue()) {
                        return aVar;
                    }
                    i10 = 0;
                    if (z5) {
                        l6 = ((c4.a) mVar).f3564a;
                        Bitmap.Config config = l6.getConfig();
                        if (config == null) {
                            config = Bitmap.Config.ARGB_8888;
                        }
                    }
                    l6 = d5.l(p.b(mVar, nVar.f22007a.getResources()), (Bitmap.Config) p.f(nVar, j.f22000b), nVar.f22008b, nVar.f22009c, nVar.f22010d == d.f22294b);
                    iVar.getClass();
                    bitmap = l6;
                    iVar3 = iVar2;
                    iVar4 = iVar;
                    nVar2 = nVar;
                    hVar2 = hVar;
                    aVar2 = aVar;
                    size = list2.size();
                    list = list2;
                    i11 = 0;
                    if (i10 < size) {
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    size = iVar2.f10985h;
                    int i13 = iVar2.f10984g;
                    int i14 = iVar2.f10983f;
                    List list3 = iVar2.f10982e;
                    i iVar5 = iVar2.f10981d;
                    n nVar3 = iVar2.f10980c;
                    h hVar3 = iVar2.f10979b;
                    i4.a aVar4 = iVar2.f10978a;
                    b.B(obj);
                    i4.i iVar6 = iVar2;
                    int i15 = i14;
                    hVar2 = hVar3;
                    i4.i iVar7 = iVar6;
                    List list4 = list3;
                    nVar2 = nVar3;
                    c0.k(iVar7.getContext());
                    i4.i iVar8 = iVar7;
                    i10 = i13 + 1;
                    aVar2 = aVar4;
                    bitmap = (Bitmap) obj;
                    i11 = i15;
                    iVar4 = iVar5;
                    list = list4;
                    iVar3 = iVar8;
                    if (i10 < size) {
                        t4.b bVar = (t4.b) list.get(i10);
                        r4.i iVar9 = nVar2.f22008b;
                        iVar3.f10978a = aVar2;
                        iVar3.f10979b = hVar2;
                        iVar3.f10980c = nVar2;
                        iVar3.f10981d = iVar4;
                        iVar3.f10982e = list;
                        iVar3.f10983f = i11;
                        iVar3.f10984g = i10;
                        iVar3.f10985h = size;
                        iVar3.j = 1;
                        Bitmap b10 = bVar.b(bitmap);
                        if (b10 == aVar3) {
                            return aVar3;
                        }
                        aVar4 = aVar2;
                        i13 = i10;
                        iVar7 = iVar3;
                        list4 = list;
                        iVar5 = iVar4;
                        i15 = i11;
                        obj = b10;
                        c0.k(iVar7.getContext());
                        i4.i iVar82 = iVar7;
                        i10 = i13 + 1;
                        aVar2 = aVar4;
                        bitmap = (Bitmap) obj;
                        i11 = i15;
                        iVar4 = iVar5;
                        list = list4;
                        iVar3 = iVar82;
                        if (i10 < size) {
                            iVar4.getClass();
                            return new i4.a(new c4.a(bitmap), aVar2.f10924b, aVar2.f10925c, aVar2.f10926d);
                        }
                    }
                }
            }
        }
        iVar2 = new i4.i(cVar);
        Object obj2 = iVar2.f10986i;
        lf.a aVar32 = lf.a.f20034a;
        i5 = iVar2.j;
        if (i5 != 0) {
        }
    }

    public static s C(p0 owner) {
        Intrinsics.checkNotNullParameter(owner, "fragmentActivity");
        ge.n factory = s.H;
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(factory, "factory");
        o1 store = owner.getViewModelStore();
        Intrinsics.checkNotNullParameter(owner, "owner");
        t1.c defaultCreationExtras = owner.getDefaultViewModelCreationExtras();
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        x xVar = new x(store, factory, defaultCreationExtras);
        Intrinsics.checkNotNullParameter(s.class, "modelClass");
        Intrinsics.checkNotNullParameter(s.class, "<this>");
        ag.c modelClass = Reflection.getOrCreateKotlinClass(s.class);
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        String r5 = d5.r(modelClass);
        if (r5 != null) {
            return (s) xVar.x(modelClass, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r5));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public static int D(int i5) {
        if (i5 == 0) {
            return 1;
        }
        if (i5 == 1) {
            return 2;
        }
        if (i5 == 2) {
            return 3;
        }
        if (i5 != 3) {
            return i5 != 4 ? 0 : 5;
        }
        return 4;
    }

    public static String E(String str, Object... objArr) {
        int length;
        int indexOf;
        StringBuilder sb2 = new StringBuilder(str.length() + (objArr.length * 16));
        int i5 = 0;
        int i10 = 0;
        while (true) {
            length = objArr.length;
            if (i5 >= length || (indexOf = str.indexOf("%s", i10)) == -1) {
                break;
            }
            sb2.append((CharSequence) str, i10, indexOf);
            sb2.append(G(objArr[i5]));
            i10 = indexOf + 2;
            i5++;
        }
        sb2.append((CharSequence) str, i10, str.length());
        if (i5 < length) {
            String str2 = " [";
            while (i5 < objArr.length) {
                sb2.append(str2);
                sb2.append(G(objArr[i5]));
                i5++;
                str2 = ", ";
            }
            sb2.append(']');
        }
        return sb2.toString();
    }

    public static String F(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String sb2;
        int i5 = 0;
        int i10 = 0;
        while (true) {
            length = objArr.length;
            if (i10 >= length) {
                break;
            }
            Object obj = objArr[i10];
            if (obj == null) {
                sb2 = "null";
            } else {
                try {
                    sb2 = obj.toString();
                } catch (Exception e7) {
                    String name = obj.getClass().getName();
                    String hexString = Integer.toHexString(System.identityHashCode(obj));
                    String m6 = e.m(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(m6), (Throwable) e7);
                    String name2 = e7.getClass().getName();
                    StringBuilder sb3 = new StringBuilder(name2.length() + m6.length() + 8 + 1);
                    sb3.append("<");
                    sb3.append(m6);
                    sb3.append(" threw ");
                    sb3.append(name2);
                    sb3.append(">");
                    sb2 = sb3.toString();
                }
            }
            objArr[i10] = sb2;
            i10++;
        }
        StringBuilder sb4 = new StringBuilder(str.length() + (length * 16));
        int i11 = 0;
        while (true) {
            length2 = objArr.length;
            if (i5 >= length2 || (indexOf = str.indexOf("%s", i11)) == -1) {
                break;
            }
            sb4.append((CharSequence) str, i11, indexOf);
            sb4.append(objArr[i5]);
            i5++;
            i11 = indexOf + 2;
        }
        sb4.append((CharSequence) str, i11, str.length());
        if (i5 < length2) {
            sb4.append(" [");
            sb4.append(objArr[i5]);
            for (int i12 = i5 + 1; i12 < objArr.length; i12++) {
                sb4.append(", ");
                sb4.append(objArr[i12]);
            }
            sb4.append(']');
        }
        return sb4.toString();
    }

    public static String G(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e7) {
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            String m6 = e.m(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(m6), (Throwable) e7);
            String name2 = e7.getClass().getName();
            StringBuilder sb2 = new StringBuilder(m6.length() + 8 + name2.length() + 1);
            k.s(sb2, "<", m6, " threw ", name2);
            sb2.append(">");
            return sb2.toString();
        }
    }

    public static final Exception a(v0.a aVar, String str, u0.e eVar) {
        return new u0.e(aVar, str);
    }

    public static final Bundle b(Pair... pairArr) {
        Bundle bundle = new Bundle(pairArr.length);
        for (Pair pair : pairArr) {
            String str = (String) pair.f19192a;
            Object obj = pair.f19193b;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                Intrinsics.checkNotNull(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<android.os.Parcelable>");
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.CharSequence>");
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                    }
                    bundle.putSerializable(str, (Serializable) obj);
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                l0.c.a(bundle, str, (Size) obj);
            } else {
                if (!(obj instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str + '\"');
                }
                l0.c.b(bundle, str, (SizeF) obj);
            }
        }
        return bundle;
    }

    public static q0 f(TypedValue value, q0 q0Var, q0 expectedNavType, String str, String foundType) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(expectedNavType, "expectedNavType");
        Intrinsics.checkNotNullParameter(foundType, "foundType");
        if (q0Var == null || q0Var == expectedNavType) {
            return q0Var == null ? expectedNavType : q0Var;
        }
        StringBuilder q = k.q("Type is ", str, " but found ", foundType, ": ");
        q.append(value.data);
        throw new XmlPullParserException(q.toString());
    }

    public static boolean g(String str, List list) {
        if (list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (str.contains(str2)) {
                return true;
            }
            if (str.matches(str2)) {
                return true;
            }
        }
        return false;
    }

    public static FileOutputStream h(File file, FileOutputStream fileOutputStream, boolean z5) {
        return d4.d().m().isTracingEnabled() ? new f(f.c(file, fileOutputStream, z5)) : fileOutputStream;
    }

    public static FileOutputStream i(FileOutputStream fileOutputStream, File file) {
        return d4.d().m().isTracingEnabled() ? new f(f.c(file, fileOutputStream, false)) : fileOutputStream;
    }

    public static FileOutputStream j(FileOutputStream fileOutputStream, FileDescriptor fileDescriptor) {
        if (!d4.d().m().isTracingEnabled()) {
            return fileOutputStream;
        }
        i1 n9 = io.sentry.util.h.f17164a ? d4.d().n() : d4.d().i();
        return new f(new x(null, n9 != null ? n9.r("file.write") : null, fileOutputStream, d4.d().m()), fileDescriptor);
    }

    public static final void p(View view) {
        k2.x.s(view).a();
    }

    public static final r r(Fragment fragment) {
        Dialog dialog;
        Window window;
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        for (Fragment fragment2 = fragment; fragment2 != null; fragment2 = fragment2.getParentFragment()) {
            if (fragment2 instanceof NavHostFragment) {
                return ((NavHostFragment) fragment2).F();
            }
            Fragment fragment3 = fragment2.getParentFragmentManager().f1986z;
            if (fragment3 instanceof NavHostFragment) {
                return ((NavHostFragment) fragment3).F();
            }
        }
        View view = fragment.getView();
        if (view != null) {
            return y3.k(view);
        }
        View view2 = null;
        y yVar = fragment instanceof y ? (y) fragment : null;
        if (yVar != null && (dialog = yVar.getDialog()) != null && (window = dialog.getWindow()) != null) {
            view2 = window.getDecorView();
        }
        if (view2 != null) {
            return y3.k(view2);
        }
        throw new IllegalStateException(c1.l("Fragment ", fragment, " does not have a NavController set"));
    }

    public static final l t(l tracer, String label, Executor executor, Function0 block) {
        Intrinsics.checkNotNullParameter(tracer, "tracer");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(block, "block");
        androidx.lifecycle.p0 state = new androidx.lifecycle.p0(l.f8538d);
        u.k future = ci.c.s(new d0(executor, tracer, label, block, state));
        Intrinsics.checkNotNullExpressionValue(future, "getFuture(...)");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(future, "future");
        return new l();
    }

    public static p1.j u(g measurer, o polygon) {
        List list;
        Intrinsics.checkNotNullParameter(measurer, "measurer");
        Intrinsics.checkNotNullParameter(polygon, "polygon");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = polygon.f21439a.size();
        for (int i5 = 0; i5 < size; i5++) {
            p1.g gVar = (p1.g) polygon.f21439a.get(i5);
            List list2 = gVar.f21416a;
            int size2 = list2.size();
            for (int i10 = 0; i10 < size2; i10++) {
                if ((gVar instanceof p1.e) && i10 == list2.size() / 2) {
                    arrayList2.add(new Pair(gVar, Integer.valueOf(arrayList.size())));
                }
                arrayList.add(list2.get(i10));
            }
        }
        Float valueOf = Float.valueOf(0.0f);
        int k6 = v.k(arrayList, 9);
        if (k6 == 0) {
            list = t.c(valueOf);
        } else {
            ArrayList arrayList3 = new ArrayList(k6 + 1);
            arrayList3.add(valueOf);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                p1.c cVar = (p1.c) it.next();
                float floatValue = valueOf.floatValue();
                float a7 = measurer.a(cVar);
                if (a7 < 0.0f) {
                    throw new IllegalArgumentException("Measured cubic is expected to be greater or equal to zero");
                }
                Unit unit = Unit.f19194a;
                valueOf = Float.valueOf(floatValue + a7);
                arrayList3.add(valueOf);
            }
            list = arrayList3;
        }
        float floatValue2 = ((Number) CollectionsKt.K(list)).floatValue();
        s.m mVar = new s.m(list.size());
        int size3 = list.size();
        for (int i11 = 0; i11 < size3; i11++) {
            mVar.c(((Number) list.get(i11)).floatValue() / floatValue2);
        }
        hf.e b10 = t.b();
        int size4 = arrayList2.size();
        for (int i12 = 0; i12 < size4; i12++) {
            int intValue = ((Number) ((Pair) arrayList2.get(i12)).f19193b).intValue();
            b10.add(new p1.m((mVar.a(intValue + 1) + mVar.a(intValue)) / 2, (p1.g) ((Pair) arrayList2.get(i12)).f19192a));
        }
        return new p1.j(measurer, t.a(b10), arrayList, mVar);
    }

    public static final gi.a v(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new gi.a(name);
    }

    public static void y(Window window, boolean z5) {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 35) {
            aa.b.m(window, z5);
        } else {
            if (i5 >= 30) {
                aa.b.l(window, z5);
                return;
            }
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z5 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    public void A(View view, int i5) {
        if (!f5d) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f4c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            f5d = true;
        }
        Field field = f4c;
        if (field != null) {
            try {
                f4c.setInt(view, i5 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public abstract boolean c(u.g gVar, u.c cVar, u.c cVar2);

    public abstract boolean d(u.g gVar, Object obj, Object obj2);

    public abstract boolean e(u.g gVar, u.f fVar, u.f fVar2);

    public int hashCode() {
        switch (this.f6a) {
            case 17:
                return toString().hashCode();
            default:
                return super.hashCode();
        }
    }

    public abstract Typeface k(Context context, f0.e eVar, Resources resources, int i5);

    public abstract Typeface l(Context context, m0.i[] iVarArr, int i5);

    public Typeface m(Context context, List list, int i5) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface n(Context context, InputStream inputStream) {
        File x10 = ci.c.x(context);
        if (x10 == null) {
            return null;
        }
        try {
            if (ci.c.k(x10, inputStream)) {
                return Typeface.createFromFile(x10.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            x10.delete();
        }
    }

    public Typeface o(Context context, Resources resources, int i5, String str, int i10) {
        File x10 = ci.c.x(context);
        if (x10 == null) {
            return null;
        }
        try {
            if (ci.c.j(x10, resources, i5)) {
                return Typeface.createFromFile(x10.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            x10.delete();
        }
    }

    public m0.i q(m0.i[] iVarArr, int i5) {
        int i10 = (i5 & 1) == 0 ? 400 : 700;
        boolean z5 = (i5 & 2) != 0;
        m0.i iVar = null;
        int i11 = Integer.MAX_VALUE;
        for (m0.i iVar2 : iVarArr) {
            int abs = (Math.abs(iVar2.f20132c - i10) * 2) + (iVar2.f20133d == z5 ? 0 : 1);
            if (iVar == null || i11 > abs) {
                iVar = iVar2;
                i11 = abs;
            }
        }
        return iVar;
    }

    public float s(View view) {
        if (f3b) {
            try {
                return androidx.transition.q0.a(view);
            } catch (NoSuchMethodError unused) {
                f3b = false;
            }
        }
        return view.getAlpha();
    }

    public String toString() {
        switch (this.f6a) {
            case 17:
                String simpleName = Reflection.getOrCreateKotlinClass(getClass()).getSimpleName();
                Intrinsics.checkNotNull(simpleName);
                return simpleName;
            default:
                return super.toString();
        }
    }

    public abstract void w(u.f fVar, u.f fVar2);

    public abstract void x(u.f fVar, Thread thread);

    public void z(View view, float f6) {
        if (f3b) {
            try {
                androidx.transition.q0.b(view, f6);
                return;
            } catch (NoSuchMethodError unused) {
                f3b = false;
            }
        }
        view.setAlpha(f6);
    }

    public a() {
        this.f6a = 7;
        new ConcurrentHashMap();
    }
}
