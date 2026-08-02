package ru.ozon.android.messenger.blocks.messagetext.compose;

import K1.AbstractC3429i;
import K1.C3422b;
import K1.D;
import K1.InterfaceC3430j;
import K1.L;
import P1.A;
import P1.AbstractC3809p;
import P1.B;
import P1.F;
import S0.InterfaceC3967k;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l1.H0;
import ru.ozon.android.messenger.framework.presentation.models.p;
import ru.ozon.android.messenger.framework.presentation.models.s;
import ru.ozon.uni.android.ds.compose.html.SpannedAnnotateConvertorKt;
import ru.ozon.uni.core.repository.UniTheme;

/* loaded from: classes10.dex */
final class c extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.blocks.messagetext.f f85825b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.core.d f85826c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ p f85827d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(ru.ozon.android.messenger.blocks.messagetext.f fVar, ru.ozon.android.messenger.framework.core.d dVar, p pVar) {
        super(2);
        this.f85825b = fVar;
        this.f85826c = dVar;
        this.f85827d = pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00f2 A[LOOP:0: B:15:0x00f0->B:16:0x00f2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x013c  */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        SpannableStringBuilder toMessengerAnnotateString;
        ru.ozon.android.messenger.utils.spans.a[] aVarArr;
        V1.i iVar;
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            Spannable d11 = this.f85825b.d();
            Intrinsics.checkNotNullParameter(d11, "<this>");
            int i11 = 0;
            ru.ozon.android.messenger.utils.spans.c[] cVarArr = (ru.ozon.android.messenger.utils.spans.c[]) d11.getSpans(0, d11.length(), ru.ozon.android.messenger.utils.spans.c.class);
            ru.ozon.android.messenger.utils.spans.b[] bVarArr = (ru.ozon.android.messenger.utils.spans.b[]) d11.getSpans(0, d11.length(), ru.ozon.android.messenger.utils.spans.b.class);
            Intrinsics.f(cVarArr);
            if (cVarArr.length == 0) {
                Intrinsics.f(bVarArr);
                if (bVarArr.length == 0) {
                    toMessengerAnnotateString = new SpannableStringBuilder(d11);
                    Intrinsics.checkNotNullParameter(toMessengerAnnotateString, "<this>");
                    ru.ozon.android.messenger.framework.core.d references = this.f85826c;
                    Intrinsics.checkNotNullParameter(references, "references");
                    Object[] spans = toMessengerAnnotateString.getSpans(0, toMessengerAnnotateString.length(), ru.ozon.android.messenger.utils.spans.a.class);
                    Intrinsics.checkNotNullExpressionValue(spans, "getSpans(...)");
                    for (Object obj : spans) {
                        ru.ozon.android.messenger.utils.spans.a aVar = (ru.ozon.android.messenger.utils.spans.a) obj;
                        aVar.c(new i(references));
                        aVar.b(new j(references));
                    }
                    long textPrimary = UniTheme.INSTANCE.getColors(interfaceC3967k2, UniTheme.$stable).getTextPrimary();
                    Intrinsics.checkNotNullParameter(toMessengerAnnotateString, "$this$toMessengerAnnotateString");
                    interfaceC3967k2.o(-594681035);
                    C3422b m1836toAnnotateStringiJQMabo = SpannedAnnotateConvertorKt.m1836toAnnotateStringiJQMabo(toMessengerAnnotateString, textPrimary, interfaceC3967k2, 0, 0);
                    aVarArr = (ru.ozon.android.messenger.utils.spans.a[]) toMessengerAnnotateString.getSpans(0, toMessengerAnnotateString.length(), ru.ozon.android.messenger.utils.spans.a.class);
                    Intrinsics.f(aVarArr);
                    if (aVarArr.length != 0) {
                        interfaceC3967k2.k();
                    } else {
                        C3422b.a aVar2 = new C3422b.a();
                        aVar2.d(m1836toAnnotateStringiJQMabo);
                        interfaceC3967k2.o(-1959874597);
                        int length = aVarArr.length;
                        while (i11 < length) {
                            final ru.ozon.android.messenger.utils.spans.a aVar3 = aVarArr[i11];
                            int spanStart = toMessengerAnnotateString.getSpanStart(aVar3);
                            int spanEnd = toMessengerAnnotateString.getSpanEnd(aVar3);
                            String url = aVar3.getURL();
                            Intrinsics.checkNotNullExpressionValue(url, "getURL(...)");
                            iVar = V1.i.f27916c;
                            SpannableStringBuilder spannableStringBuilder = toMessengerAnnotateString;
                            ru.ozon.android.messenger.utils.spans.a[] aVarArr2 = aVarArr;
                            int i12 = length;
                            long j11 = textPrimary;
                            L l11 = new L(new D(j11, 0L, (F) null, (A) null, (B) null, (AbstractC3809p) null, (String) null, 0L, (V1.a) null, (V1.m) null, (R1.c) null, 0L, iVar, (H0) null, 61438), 14);
                            interfaceC3967k2.o(-82220130);
                            boolean F11 = interfaceC3967k2.F(aVar3);
                            Object C11 = interfaceC3967k2.C();
                            if (F11 || C11 == InterfaceC3967k.a.a()) {
                                C11 = new InterfaceC3430j() { // from class: ru.ozon.android.messenger.blocks.messagetext.compose.f
                                    @Override // K1.InterfaceC3430j
                                    public final void a(AbstractC3429i it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        ru.ozon.android.messenger.utils.spans.a.this.a();
                                    }
                                };
                                interfaceC3967k2.x(C11);
                            }
                            interfaceC3967k2.k();
                            aVar2.a(new AbstractC3429i.b(url, l11, (InterfaceC3430j) C11), spanStart, spanEnd);
                            i11++;
                            toMessengerAnnotateString = spannableStringBuilder;
                            aVarArr = aVarArr2;
                            textPrimary = j11;
                            length = i12;
                        }
                        interfaceC3967k2.k();
                        m1836toAnnotateStringiJQMabo = aVar2.i();
                        interfaceC3967k2.k();
                    }
                    C3422b c3422b = m1836toAnnotateStringiJQMabo;
                    p pVar = this.f85827d;
                    s sVar = !(pVar instanceof s) ? (s) pVar : null;
                    n.a(null, c3422b, UniTheme.INSTANCE.getColors(interfaceC3967k2, UniTheme.$stable).getTextPrimary(), (sVar == null && sVar.p()) ? UniTheme.INSTANCE.getTypography().getBodyControl400Small() : UniTheme.INSTANCE.getTypography().getBody400Small(), null, interfaceC3967k2, 1794048);
                }
            }
            Tc.b builder = C7714v.B();
            for (ru.ozon.android.messenger.utils.spans.c cVar : cVarArr) {
                builder.add(new h(d11.getSpanStart(cVar), cVar.a() + ". "));
            }
            Intrinsics.f(bVarArr);
            for (ru.ozon.android.messenger.utils.spans.b bVar : bVarArr) {
                builder.add(new h(d11.getSpanStart(bVar), "• "));
            }
            Intrinsics.checkNotNullParameter(builder, "builder");
            List<h> I02 = C7714v.I0(new g(), builder.B());
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(d11);
            for (h hVar : I02) {
                spannableStringBuilder2.insert(hVar.a(), (CharSequence) hVar.b());
            }
            toMessengerAnnotateString = spannableStringBuilder2;
            Intrinsics.checkNotNullParameter(toMessengerAnnotateString, "<this>");
            ru.ozon.android.messenger.framework.core.d references2 = this.f85826c;
            Intrinsics.checkNotNullParameter(references2, "references");
            Object[] spans2 = toMessengerAnnotateString.getSpans(0, toMessengerAnnotateString.length(), ru.ozon.android.messenger.utils.spans.a.class);
            Intrinsics.checkNotNullExpressionValue(spans2, "getSpans(...)");
            while (r6 < r5) {
            }
            long textPrimary2 = UniTheme.INSTANCE.getColors(interfaceC3967k2, UniTheme.$stable).getTextPrimary();
            Intrinsics.checkNotNullParameter(toMessengerAnnotateString, "$this$toMessengerAnnotateString");
            interfaceC3967k2.o(-594681035);
            C3422b m1836toAnnotateStringiJQMabo2 = SpannedAnnotateConvertorKt.m1836toAnnotateStringiJQMabo(toMessengerAnnotateString, textPrimary2, interfaceC3967k2, 0, 0);
            aVarArr = (ru.ozon.android.messenger.utils.spans.a[]) toMessengerAnnotateString.getSpans(0, toMessengerAnnotateString.length(), ru.ozon.android.messenger.utils.spans.a.class);
            Intrinsics.f(aVarArr);
            if (aVarArr.length != 0) {
            }
            C3422b c3422b2 = m1836toAnnotateStringiJQMabo2;
            p pVar2 = this.f85827d;
            if (!(pVar2 instanceof s)) {
            }
            n.a(null, c3422b2, UniTheme.INSTANCE.getColors(interfaceC3967k2, UniTheme.$stable).getTextPrimary(), (sVar == null && sVar.p()) ? UniTheme.INSTANCE.getTypography().getBodyControl400Small() : UniTheme.INSTANCE.getTypography().getBody400Small(), null, interfaceC3967k2, 1794048);
        }
        return Unit.f71690a;
    }
}
