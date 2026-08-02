package androidx.transition;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import androidx.appcompat.widget.c1;
import com.google.android.gms.common.ConnectionResult;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2732a;

    /* renamed from: b, reason: collision with root package name */
    public int f2733b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2734c;

    /* renamed from: d, reason: collision with root package name */
    public Object f2735d;

    public /* synthetic */ n0(byte b10, int i5) {
        this.f2732a = i5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01e2, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01da, code lost:
    
        if (r13.size() <= 0) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01dc, code lost:
    
        r0 = new l1.a(r13, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01e3, code lost:
    
        if (r0 == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01f5, code lost:
    
        if (r11 == 1) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01f8, code lost:
    
        if (r11 == 2) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01fa, code lost:
    
        r16 = (int[]) r0.f19314b;
        r17 = (float[]) r0.f19315c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0208, code lost:
    
        if (r10 == 1) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x020a, code lost:
    
        if (r10 == 2) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x020c, code lost:
    
        r0 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x021f, code lost:
    
        r11 = new android.graphics.LinearGradient(r21, r22, r26, r27, r16, r17, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0268, code lost:
    
        return new androidx.transition.n0(r11, (android.content.res.ColorStateList) null, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0219, code lost:
    
        r0 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x021c, code lost:
    
        r0 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0223, code lost:
    
        r11 = new android.graphics.SweepGradient(r8, r9, (int[]) r0.f19314b, (float[]) r0.f19315c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0235, code lost:
    
        if (r25 <= 0.0f) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0237, code lost:
    
        r20 = (int[]) r0.f19314b;
        r21 = (float[]) r0.f19315c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0246, code lost:
    
        if (r10 == 1) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0249, code lost:
    
        if (r10 == 2) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x024b, code lost:
    
        r0 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x025c, code lost:
    
        r11 = new android.graphics.RadialGradient(r8, r9, r25, r20, r21, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0256, code lost:
    
        r0 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0259, code lost:
    
        r0 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0270, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01e7, code lost:
    
        if (r20 == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01e9, code lost:
    
        r0 = new l1.a(r6, r5, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01ef, code lost:
    
        r0 = new l1.a(r6, r12);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static n0 b(Resources resources, int i5, Resources.Theme theme) {
        int next;
        float f6;
        int i10;
        float f10;
        int i11;
        float f11;
        XmlResourceParser xml = resources.getXml(i5);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.getClass();
        if (!name.equals("gradient")) {
            if (name.equals("selector")) {
                ColorStateList b10 = f0.c.b(resources, xml, asAttributeSet, theme);
                return new n0((Shader) null, b10, b10.getDefaultColor());
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        TypedArray f12 = f0.b.f(resources, theme, asAttributeSet, b0.a.f2950e);
        float f13 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startX") != null ? f12.getFloat(8, 0.0f) : 0.0f;
        float f14 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startY") != null ? f12.getFloat(9, 0.0f) : 0.0f;
        float f15 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endX") != null ? f12.getFloat(10, 0.0f) : 0.0f;
        float f16 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endY") != null ? f12.getFloat(11, 0.0f) : 0.0f;
        float f17 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerX") != null ? f12.getFloat(3, 0.0f) : 0.0f;
        float f18 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerY") != null ? f12.getFloat(4, 0.0f) : 0.0f;
        int i12 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "type") != null ? f12.getInt(2, 0) : 0;
        int color = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startColor") != null ? f12.getColor(0, 0) : 0;
        boolean z5 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null;
        int color2 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null ? f12.getColor(7, 0) : 0;
        if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endColor") != null) {
            f6 = f13;
            i10 = f12.getColor(1, 0);
        } else {
            f6 = f13;
            i10 = 0;
        }
        if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "tileMode") != null) {
            f10 = f14;
            i11 = f12.getInt(6, 0);
        } else {
            f10 = f14;
            i11 = 0;
        }
        float f19 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "gradientRadius") != null ? f12.getFloat(5, 0.0f) : 0.0f;
        f12.recycle();
        int depth = xml.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        float f20 = f19;
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next2 = xml.next();
            float f21 = f15;
            if (next2 == 1) {
                f11 = f16;
                break;
            }
            int depth2 = xml.getDepth();
            f11 = f16;
            if (depth2 < depth && next2 == 3) {
                break;
            }
            if (next2 == 2 && depth2 <= depth && xml.getName().equals("item")) {
                TypedArray f22 = f0.b.f(resources, theme, asAttributeSet, b0.a.f2951f);
                boolean hasValue = f22.hasValue(0);
                boolean hasValue2 = f22.hasValue(1);
                if (!hasValue || !hasValue2) {
                    break;
                }
                int color3 = f22.getColor(0, 0);
                float f23 = f22.getFloat(1, 0.0f);
                f22.recycle();
                arrayList2.add(Integer.valueOf(color3));
                arrayList.add(Float.valueOf(f23));
            }
            f15 = f21;
            f16 = f11;
        }
        throw new XmlPullParserException(xml.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
    }

    public f8.q a() {
        f8.f fVar = (f8.f) this.f2735d;
        if (fVar != null) {
            throw fVar.a();
        }
        f8.q c2 = f8.q.c(this.f2733b, (Object[]) this.f2734c, this);
        f8.f fVar2 = (f8.f) this.f2735d;
        if (fVar2 == null) {
            return c2;
        }
        throw fVar2.a();
    }

    public void c(String str, Object... objArr) {
        if (this.f2733b <= 3) {
            String str2 = (String) this.f2734c;
            if (objArr.length > 0) {
                str = String.format(Locale.US, str, objArr);
            }
            Log.d(str2, ((String) this.f2735d).concat(str));
        }
    }

    public String d() {
        StringBuilder sb2 = new StringBuilder("$");
        int i5 = this.f2733b + 1;
        for (int i10 = 0; i10 < i5; i10++) {
            Object obj = ((Object[]) this.f2734c)[i10];
            if (obj instanceof qg.g) {
                qg.g gVar = (qg.g) obj;
                if (!Intrinsics.areEqual(gVar.e(), qg.k.f22179f)) {
                    int i11 = ((int[]) this.f2735d)[i10];
                    if (i11 >= 0) {
                        sb2.append(".");
                        sb2.append(gVar.g(i11));
                    }
                } else if (((int[]) this.f2735d)[i10] != -1) {
                    sb2.append("[");
                    sb2.append(((int[]) this.f2735d)[i10]);
                    sb2.append("]");
                }
            } else if (obj != ug.k.f24276a) {
                sb2.append("['");
                sb2.append(obj);
                sb2.append("']");
            }
        }
        return sb2.toString();
    }

    public boolean e() {
        ColorStateList colorStateList;
        return ((Shader) this.f2734c) == null && (colorStateList = (ColorStateList) this.f2735d) != null && colorStateList.isStateful();
    }

    public void f(Object obj, Object obj2) {
        int i5 = (this.f2733b + 1) * 2;
        Object[] objArr = (Object[]) this.f2734c;
        if (i5 > objArr.length) {
            this.f2734c = Arrays.copyOf(objArr, rh.g.j(objArr.length, i5));
        }
        k2.x.e(obj, obj2);
        Object[] objArr2 = (Object[]) this.f2734c;
        int i10 = this.f2733b;
        int i11 = i10 * 2;
        objArr2[i11] = obj;
        objArr2[i11 + 1] = obj2;
        this.f2733b = i10 + 1;
    }

    public void g(Collection collection) {
        if (c1.v(collection)) {
            int size = (collection.size() + this.f2733b) * 2;
            Object[] objArr = (Object[]) this.f2734c;
            if (size > objArr.length) {
                this.f2734c = Arrays.copyOf(objArr, rh.g.j(objArr.length, size));
            }
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            f(entry.getKey(), entry.getValue());
        }
    }

    public void h() {
        int i5 = this.f2733b * 2;
        Object[] copyOf = Arrays.copyOf((Object[]) this.f2734c, i5);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        this.f2734c = copyOf;
        int[] iArr = new int[i5];
        for (int i10 = 0; i10 < i5; i10++) {
            iArr[i10] = -1;
        }
        kotlin.collections.o.h(0, 14, (int[]) this.f2735d, iArr);
        this.f2735d = iArr;
    }

    public void i(e6.n nVar) {
        Map map = (Map) this.f2734c;
        if (map.containsKey("ConnectionlessLifecycleHelper")) {
            StringBuilder sb2 = new StringBuilder("ConnectionlessLifecycleHelper".length() + 59);
            sb2.append("LifecycleCallback with tag ConnectionlessLifecycleHelper already added to this fragment.");
            throw new IllegalArgumentException(sb2.toString());
        }
        map.put("ConnectionlessLifecycleHelper", nVar);
        if (this.f2733b > 0) {
            new com.google.android.gms.internal.measurement.h0(Looper.getMainLooper(), 3).post(new g8.a(19, this, nVar, false));
        }
    }

    public void j(Bundle bundle) {
        this.f2733b = 1;
        this.f2735d = bundle;
        for (Map.Entry entry : ((Map) this.f2734c).entrySet()) {
            ((e6.n) entry.getValue()).b(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0086 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x000c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void k(int i5, int i10, Intent intent) {
        for (e6.n nVar : ((Map) this.f2734c).values()) {
            AtomicReference atomicReference = nVar.f8729c;
            e6.e eVar = nVar.f8733g;
            AtomicReference atomicReference2 = nVar.f8729c;
            e6.f0 f0Var = (e6.f0) atomicReference.get();
            if (i5 != 1) {
                if (i5 == 2) {
                    int b10 = nVar.f8731e.b(nVar.a(), c6.d.f3659a);
                    if (b10 == 0) {
                        atomicReference2.set(null);
                        com.google.android.gms.internal.measurement.h0 h0Var = eVar.f8705n;
                        h0Var.sendMessage(h0Var.obtainMessage(3));
                    } else if (f0Var != null) {
                        if (f0Var.f8709b.f4441b == 18 && b10 == 18) {
                        }
                    }
                }
                if (f0Var == null) {
                    nVar.d(f0Var.f8709b, f0Var.f8708a);
                }
            } else if (i10 == -1) {
                atomicReference2.set(null);
                com.google.android.gms.internal.measurement.h0 h0Var2 = eVar.f8705n;
                h0Var2.sendMessage(h0Var2.obtainMessage(3));
            } else if (i10 == 0) {
                if (f0Var != null) {
                    nVar.d(new ConnectionResult(intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, f0Var.f8709b.toString()), f0Var.f8708a);
                }
            } else if (f0Var == null) {
            }
        }
    }

    public void l(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : ((Map) this.f2734c).entrySet()) {
            Bundle bundle2 = new Bundle();
            e6.f0 f0Var = (e6.f0) ((e6.n) entry.getValue()).f8729c.get();
            if (f0Var != null) {
                ConnectionResult connectionResult = f0Var.f8709b;
                bundle2.putBoolean("resolving_error", true);
                bundle2.putInt("failed_client_id", f0Var.f8708a);
                bundle2.putInt("failed_status", connectionResult.f4441b);
                bundle2.putParcelable("failed_resolution", connectionResult.f4442c);
            }
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    public String toString() {
        switch (this.f2732a) {
            case 8:
                StringBuilder sb2 = new StringBuilder();
                if (((gh.h0) this.f2734c) == gh.h0.f10198c) {
                    sb2.append("HTTP/1.0");
                } else {
                    sb2.append("HTTP/1.1");
                }
                sb2.append(' ');
                sb2.append(this.f2733b);
                sb2.append(' ');
                sb2.append((String) this.f2735d);
                return sb2.toString();
            case 9:
                return d();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ n0(int i5, int i10, String str, ArrayList arrayList) {
        this.f2732a = i10;
        this.f2733b = i5;
        this.f2735d = str;
        this.f2734c = arrayList;
    }

    public n0() {
        this.f2732a = 4;
        this.f2734c = DesugarCollections.synchronizedMap(new s.e(0));
        this.f2733b = 0;
    }

    public n0(String str, String[] strArr) {
        String sb2;
        this.f2732a = 7;
        if (strArr.length == 0) {
            sb2 = "";
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append('[');
            for (String str2 : strArr) {
                if (sb3.length() > 1) {
                    sb3.append(StringUtils.COMMA);
                }
                sb3.append(str2);
            }
            sb3.append("] ");
            sb2 = sb3.toString();
        }
        this.f2735d = sb2;
        this.f2734c = str;
        int i5 = 2;
        g6.v.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        while (i5 <= 7 && !Log.isLoggable((String) this.f2734c, i5)) {
            i5++;
        }
        this.f2733b = i5;
    }

    public n0(gh.h0 protocol, int i5, String message) {
        this.f2732a = 8;
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(message, "message");
        this.f2734c = protocol;
        this.f2733b = i5;
        this.f2735d = message;
    }

    public n0(Shader shader, ColorStateList colorStateList, int i5) {
        this.f2732a = 5;
        this.f2734c = shader;
        this.f2735d = colorStateList;
        this.f2733b = i5;
    }

    public n0(int i5) {
        this.f2732a = 6;
        this.f2734c = new Object[i5 * 2];
        this.f2733b = 0;
    }
}
