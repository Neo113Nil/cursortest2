package ru.ozon.uni.android.ds.compose.html;

import K1.AbstractC3429i;
import K1.C3422b;
import K1.D;
import K1.L;
import P1.A;
import P1.AbstractC3809p;
import P1.B;
import P1.F;
import R1.c;
import S0.InterfaceC3967k;
import V1.a;
import V1.i;
import V1.m;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l1.C7811b0;
import l1.H0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.ds.UniGlobalConfigKt;
import ru.ozon.uni.atoms.html.spans.CustomTypefaceSpan;
import ru.ozon.uni.atoms.html.spans.LineSpan;
import ru.ozon.uni.atoms.html.spans.OzonUrlSpan;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001d\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Landroid/text/Spanned;", "Ll1/Z;", "linkColor", "LK1/b;", "toAnnotateString-iJQMabo", "(Landroid/text/Spanned;JLS0/k;II)LK1/b;", "toAnnotateString", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SpannedAnnotateConvertorKt {
    @NotNull
    /* renamed from: toAnnotateString-iJQMabo, reason: not valid java name */
    public static final C3422b m1836toAnnotateStringiJQMabo(@NotNull Spanned toAnnotateString, long j11, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        F f7;
        int weight;
        i iVar;
        i iVar2;
        F f11;
        F f12;
        Intrinsics.checkNotNullParameter(toAnnotateString, "$this$toAnnotateString");
        interfaceC3967k.o(-655796062);
        long textAction = (i12 & 1) != 0 ? UniTheme.INSTANCE.getColors(interfaceC3967k, UniTheme.$stable).getTextAction() : j11;
        C3422b.a aVar = new C3422b.a();
        aVar.e(toAnnotateString.toString());
        interfaceC3967k.o(1083016916);
        Object[] spans = toAnnotateString.getSpans(0, toAnnotateString.length(), Object.class);
        Intrinsics.checkNotNullExpressionValue(spans, "getSpans(...)");
        for (Object obj : spans) {
            int spanStart = toAnnotateString.getSpanStart(obj);
            int spanEnd = toAnnotateString.getSpanEnd(obj);
            interfaceC3967k.o(1083020010);
            if (obj instanceof StyleSpan) {
                int style = ((StyleSpan) obj).getStyle();
                if (style == 1) {
                    f11 = F.f21512j;
                    aVar.b(new D(0L, 0L, f11, (A) null, (B) null, (AbstractC3809p) null, (String) null, 0L, (a) null, (m) null, (c) null, 0L, (i) null, (H0) null, 65531), spanStart, spanEnd);
                } else if (style == 2) {
                    aVar.b(new D(0L, 0L, (F) null, A.a(1), (B) null, (AbstractC3809p) null, (String) null, 0L, (a) null, (m) null, (c) null, 0L, (i) null, (H0) null, 65527), spanStart, spanEnd);
                } else if (style == 3) {
                    f12 = F.f21512j;
                    aVar.b(new D(0L, 0L, f12, A.a(1), (B) null, (AbstractC3809p) null, (String) null, 0L, (a) null, (m) null, (c) null, 0L, (i) null, (H0) null, 65523), spanStart, spanEnd);
                }
            } else if (obj instanceof UnderlineSpan) {
                iVar2 = i.f27916c;
                aVar.b(new D(0L, 0L, (F) null, (A) null, (B) null, (AbstractC3809p) null, (String) null, 0L, (a) null, (m) null, (c) null, 0L, iVar2, (H0) null, 61439), spanStart, spanEnd);
            } else if (obj instanceof LineSpan) {
                iVar = i.f27917d;
                aVar.b(new D(0L, 0L, (F) null, (A) null, (B) null, (AbstractC3809p) null, (String) null, 0L, (a) null, (m) null, (c) null, 0L, iVar, (H0) null, 61439), spanStart, spanEnd);
            } else {
                F f13 = null;
                if (obj instanceof CustomTypefaceSpan) {
                    Typeface typeface = ((CustomTypefaceSpan) obj).getTypeface();
                    F f14 = (typeface == null || !typeface.isBold()) ? null : F.f21512j;
                    A a11 = (typeface == null || !typeface.isItalic()) ? null : A.a(1);
                    if (Build.VERSION.SDK_INT >= 28) {
                        if (typeface != null) {
                            weight = typeface.getWeight();
                            f13 = new F(weight);
                        }
                        f7 = f13;
                    } else {
                        f7 = f14;
                    }
                    aVar.b(new D(0L, 0L, f7, a11, (B) null, (AbstractC3809p) null, (String) null, 0L, (a) null, (m) null, (c) null, 0L, (i) null, (H0) null, 65523), spanStart, spanEnd);
                } else if (obj instanceof ForegroundColorSpan) {
                    aVar.b(new D(C7811b0.b(((ForegroundColorSpan) obj).getForegroundColor()), 0L, (F) null, (A) null, (B) null, (AbstractC3809p) null, (String) null, 0L, (a) null, (m) null, (c) null, 0L, (i) null, (H0) null, 65534), spanStart, spanEnd);
                } else if (obj instanceof OzonUrlSpan) {
                    OzonUrlSpan ozonUrlSpan = (OzonUrlSpan) obj;
                    Integer linkColor = ozonUrlSpan.getLinkColor();
                    aVar.a(new AbstractC3429i.b(ozonUrlSpan.getUrl(), new L(new D(linkColor != null ? C7811b0.b(linkColor.intValue()) : textAction, 0L, (F) null, (A) null, (B) null, (AbstractC3809p) null, (String) null, 0L, (a) null, (m) null, (c) null, 0L, UniGlobalConfigKt.getUnderlineLinksFlag((Context) interfaceC3967k.m(AndroidCompositionLocals_androidKt.d())) ? i.f27916c : null, (H0) null, 61438), 14)), spanStart, spanEnd);
                }
            }
            interfaceC3967k.k();
        }
        interfaceC3967k.k();
        C3422b i13 = aVar.i();
        interfaceC3967k.k();
        return i13;
    }
}
