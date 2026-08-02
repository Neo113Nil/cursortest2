package f4;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.appcompat.widget.c1;
import c4.b0;
import c4.p;
import com.google.android.gms.internal.measurement.d5;
import com.google.android.gms.internal.measurement.y3;
import d4.s;
import d4.t;
import f3.x;
import java.nio.charset.Charset;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import okio.Buffer;
import okio.Okio;
import org.xmlpull.v1.XmlPullParserException;
import q4.n;
import v4.r;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b implements h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9442a;

    /* renamed from: b, reason: collision with root package name */
    public final b0 f9443b;

    /* renamed from: c, reason: collision with root package name */
    public final n f9444c;

    public /* synthetic */ b(b0 b0Var, n nVar, int i5) {
        this.f9442a = i5;
        this.f9443b = b0Var;
        this.f9444c = nVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r24v4, types: [int] */
    /* JADX WARN: Type inference failed for: r24v5 */
    /* JADX WARN: Type inference failed for: r24v7 */
    @Override // f4.h
    public final Object a(Continuation continuation) {
        boolean z5;
        int i5;
        String str;
        ?? r24;
        int i10;
        boolean z7;
        char c2;
        int i11;
        Integer intOrNull;
        Drawable drawable;
        Drawable hVar;
        int i12 = this.f9442a;
        int i13 = 0;
        b0 b0Var = this.f9443b;
        n nVar = this.f9444c;
        switch (i12) {
            case 0:
                String J = CollectionsKt.J(CollectionsKt.B(p.h(b0Var)), "/", null, null, null, 62);
                return new l(new t(Okio.buffer(Okio.source(nVar.f22007a.getAssets().open(J))), nVar.f22012f, new d4.a(J)), x.d0(J), d4.h.f8130c);
            case 1:
                String str2 = b0Var.f3569a;
                String source = b0Var.f3569a;
                int G = StringsKt.G(str2, ";base64,", 0, false, 6);
                if (G == -1) {
                    throw new IllegalStateException(("invalid data uri: " + b0Var).toString());
                }
                int F = StringsKt.F(source, ':', 0, false, 6);
                if (F == -1) {
                    throw new IllegalStateException(("invalid data uri: " + b0Var).toString());
                }
                String substring = source.substring(F + 1, G);
                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                sf.a aVar = sf.c.f23600c;
                int i14 = G + 8;
                int length = source.length();
                aVar.getClass();
                boolean z10 = aVar.f23602b;
                Intrinsics.checkNotNullParameter(source, "source");
                int length2 = source.length();
                kotlin.collections.f.Companion.getClass();
                kotlin.collections.c.a(i14, length, length2);
                String substring2 = source.substring(i14, length);
                Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
                Charset charset = Charsets.f19241d;
                Intrinsics.checkNotNull(substring2, "null cannot be cast to non-null type java.lang.String");
                byte[] source2 = substring2.getBytes(charset);
                Intrinsics.checkNotNullExpressionValue(source2, "getBytes(...)");
                int length3 = source2.length;
                Intrinsics.checkNotNullParameter(source2, "source");
                int length4 = source2.length;
                kotlin.collections.f.Companion.getClass();
                kotlin.collections.c.a(0, length3, length4);
                Intrinsics.checkNotNullParameter(source2, "source");
                int i15 = -2;
                if (length3 == 0) {
                    r24 = 1;
                    str = substring;
                } else {
                    if (length3 == 1) {
                        throw new IllegalArgumentException(c1.i(length3, "Input should have at least 2 symbols for Base64 decoding, startIndex: 0, endIndex: "));
                    }
                    if (z10) {
                        int i16 = 0;
                        i5 = length3;
                        while (true) {
                            z5 = r2;
                            if (i16 < length3) {
                                int i17 = sf.d.f23603a[source2[i16] & 255];
                                if (i17 < 0) {
                                    if (i17 == -2) {
                                        i5 -= length3 - i16;
                                    } else {
                                        i5--;
                                    }
                                }
                                i16++;
                                r2 = z5 ? 1 : 0;
                            }
                        }
                    } else {
                        z5 = true;
                        if (source2[length3 - 1] == 61) {
                            i5 = length3 - 1;
                            if (source2[length3 - 2] == 61) {
                                i5 = length3 - 2;
                            }
                        } else {
                            i5 = length3;
                        }
                    }
                    str = substring;
                    i13 = (int) ((i5 * 6) / 8);
                    r24 = z5;
                }
                byte[] bArr = new byte[i13];
                int[] iArr = aVar.f23601a ? sf.d.f23604b : sf.d.f23603a;
                int i18 = -8;
                int i19 = -8;
                int i20 = 0;
                int i21 = 0;
                int i22 = 0;
                while (true) {
                    if (i21 < length3) {
                        if (i19 == i18 && (i11 = i21 + 3) < length3) {
                            int i23 = i21 + 4;
                            int i24 = (iArr[source2[i21 + 2] & 255] << 6) | (iArr[source2[i21] & 255] << 18) | (iArr[source2[i21 + 1] & 255] << 12) | iArr[source2[i11] & 255];
                            if (i24 >= 0) {
                                bArr[i20] = (byte) (i24 >> 16);
                                int i25 = i20 + 2;
                                bArr[i20 + 1] = (byte) (i24 >> 8);
                                i20 += 3;
                                bArr[i25] = (byte) i24;
                                i21 = i23;
                                i15 = -2;
                                i18 = -8;
                            }
                        }
                        int i26 = source2[i21] & 255;
                        int i27 = iArr[i26];
                        if (i27 >= 0) {
                            c2 = '=';
                            i21++;
                            i22 = (i22 << 6) | i27;
                            int i28 = i19 + 6;
                            if (i28 >= 0) {
                                bArr[i20] = (byte) (i22 >>> i28);
                                i22 &= (r24 << i28) - 1;
                                i19 -= 2;
                                i20++;
                                i15 = -2;
                                i18 = -8;
                            } else {
                                i19 = i28;
                            }
                        } else if (i27 != -2) {
                            c2 = '=';
                            if (!z10) {
                                StringBuilder sb2 = new StringBuilder("Invalid symbol '");
                                sb2.append((char) i26);
                                sb2.append("'(");
                                String num = Integer.toString(i26, CharsKt.checkRadix(8));
                                Intrinsics.checkNotNullExpressionValue(num, "toString(...)");
                                sb2.append(num);
                                sb2.append(") at index ");
                                sb2.append(i21);
                                throw new IllegalArgumentException(sb2.toString());
                            }
                            i21++;
                        } else {
                            if (i19 == -8) {
                                throw new IllegalArgumentException(c1.i(i21, "Redundant pad character at index "));
                            }
                            if (i19 == -6) {
                                sf.b[] bVarArr = sf.b.f23599a;
                            } else if (i19 == -4) {
                                sf.b[] bVarArr2 = sf.b.f23599a;
                                int i29 = i21 + 1;
                                if (z10) {
                                    while (i29 < length3) {
                                        if (sf.d.f23603a[source2[i29] & 255] == -1) {
                                            i29++;
                                        }
                                    }
                                }
                                if (i29 == length3 || source2[i29] != 61) {
                                    throw new IllegalArgumentException(c1.i(i29, "Missing one pad character at index "));
                                }
                                i21 = i29 + 1;
                                z7 = r24;
                                i10 = -2;
                            } else if (i19 != -2) {
                                throw new IllegalStateException("Unreachable");
                            }
                            i21++;
                            z7 = r24;
                            i10 = -2;
                        }
                        i15 = -2;
                        i18 = -8;
                    } else {
                        i10 = i15;
                        z7 = false;
                    }
                }
                if (i19 == i10) {
                    throw new IllegalArgumentException("The last unit of input does not have enough bits");
                }
                if (i19 != -8 && !z7) {
                    sf.b[] bVarArr3 = sf.b.f23599a;
                    throw new IllegalArgumentException("The padding option is set to PRESENT, but the input is not properly padded");
                }
                if (i22 != 0) {
                    throw new IllegalArgumentException("The pad bits must be zeros");
                }
                if (z10) {
                    while (i21 < length3) {
                        if (sf.d.f23603a[source2[i21] & 255] == -1) {
                            i21++;
                        }
                    }
                }
                if (i21 >= length3) {
                    if (i20 != i13) {
                        throw new IllegalStateException("Check failed.");
                    }
                    Buffer buffer = new Buffer();
                    buffer.write(bArr);
                    return new l(ci.c.b(buffer, nVar.f22012f), str, d4.h.f8129b);
                }
                int i30 = source2[i21] & 255;
                StringBuilder sb3 = new StringBuilder("Symbol '");
                sb3.append((char) i30);
                sb3.append("'(");
                String num2 = Integer.toString(i30, CharsKt.checkRadix(8));
                Intrinsics.checkNotNullExpressionValue(num2, "toString(...)");
                sb3.append(num2);
                sb3.append(") at index ");
                throw new IllegalArgumentException(r4.k.n(sb3, i21 - 1, " is prohibited after the pad character"));
            default:
                String str3 = b0Var.f3572d;
                if (str3 != null) {
                    if (StringsKt.H(str3)) {
                        str3 = null;
                    }
                    if (str3 != null) {
                        String str4 = (String) CollectionsKt.L(p.h(b0Var));
                        if (str4 == null || (intOrNull = StringsKt.toIntOrNull(str4)) == null) {
                            throw new IllegalStateException("Invalid android.resource URI: " + b0Var);
                        }
                        int intValue = intOrNull.intValue();
                        Context context = nVar.f22007a;
                        Resources resources = Intrinsics.areEqual(str3, context.getPackageName()) ? context.getResources() : context.getPackageManager().getResourcesForApplication(str3);
                        TypedValue typedValue = new TypedValue();
                        resources.getValue(intValue, typedValue, true);
                        String d02 = x.d0(typedValue.string.toString());
                        if (!Intrinsics.areEqual(d02, "text/xml")) {
                            return new l(new t(Okio.buffer(Okio.source(resources.openRawResource(intValue, new TypedValue()))), nVar.f22012f, new s(str3, intValue)), d02, d4.h.f8130c);
                        }
                        if (Intrinsics.areEqual(str3, context.getPackageName())) {
                            drawable = y3.o(context, intValue);
                        } else {
                            XmlResourceParser xml = resources.getXml(intValue);
                            int next = xml.next();
                            while (next != 2 && next != 1) {
                                next = xml.next();
                            }
                            if (next != 2) {
                                throw new XmlPullParserException("No start tag found.");
                            }
                            if (Build.VERSION.SDK_INT < 24) {
                                String name = xml.getName();
                                if (Intrinsics.areEqual(name, "vector")) {
                                    AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                                    Resources.Theme theme = context.getTheme();
                                    hVar = new androidx.vectordrawable.graphics.drawable.t();
                                    hVar.inflate(resources, xml, asAttributeSet, theme);
                                } else if (Intrinsics.areEqual(name, "animated-vector")) {
                                    AttributeSet asAttributeSet2 = Xml.asAttributeSet(xml);
                                    Resources.Theme theme2 = context.getTheme();
                                    hVar = new androidx.vectordrawable.graphics.drawable.h(context, 0);
                                    hVar.inflate(resources, xml, asAttributeSet2, theme2);
                                }
                                drawable = hVar;
                            }
                            Resources.Theme theme3 = context.getTheme();
                            ThreadLocal threadLocal = f0.l.f9293a;
                            drawable = resources.getDrawable(intValue, theme3);
                            if (drawable == null) {
                                throw new IllegalStateException(c1.i(intValue, "Invalid resource ID: ").toString());
                            }
                        }
                        Bitmap.Config[] configArr = r.f24431a;
                        boolean z11 = (drawable instanceof VectorDrawable) || (drawable instanceof androidx.vectordrawable.graphics.drawable.t);
                        if (z11) {
                            drawable = new BitmapDrawable(context.getResources(), d5.l(drawable, (Bitmap.Config) p.f(nVar, q4.j.f22000b), nVar.f22008b, nVar.f22009c, nVar.f22010d == r4.d.f22294b));
                        }
                        return new j(p.c(drawable), z11, d4.h.f8130c);
                    }
                }
                throw new IllegalStateException("Invalid android.resource URI: " + b0Var);
        }
    }
}
