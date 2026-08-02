package ru.ozon.fintech.features.camera.scanners.mlkit.utils.bankcard;

import c9.C5769a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\f\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J3\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0019\u0010\u0011J\u0017\u0010\u001a\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/fintech/features/camera/scanners/mlkit/utils/bankcard/BankCardNumberDetector;", "", "<init>", "()V", "Lc9/a;", "visionText", "", "Lru/ozon/fintech/features/camera/scanners/mlkit/utils/bankcard/DetectedLine;", "extractDigitLines", "(Lc9/a;)Ljava/util/List;", "lines", "", "buildCandidate", "(Ljava/util/List;)Ljava/lang/String;", "number", "", "isValidCandidate", "(Ljava/lang/String;)Z", "text", "normalize", "(Ljava/lang/String;)Ljava/lang/String;", "", "thresholdPx", "groupByHorizontalZones", "(Ljava/util/List;I)Ljava/util/List;", "checkWithLuhnAlg", "detect", "(Lc9/a;)Ljava/lang/String;", "", "", "ocrDigitSubstitutions", "Ljava/util/Map;", "camera-scanners-mlkit_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BankCardNumberDetector {

    @NotNull
    private final Map<Character, Character> ocrDigitSubstitutions = U.j(new Pair('O', '0'), new Pair('o', '0'), new Pair('D', '0'), new Pair('I', '1'), new Pair('l', '1'), new Pair('|', '1'), new Pair('Z', '2'), new Pair('z', '2'), new Pair('b', '6'), new Pair('G', '6'), new Pair('B', '8'));

    private final String buildCandidate(List<DetectedLine> lines) {
        final Comparator comparator = new Comparator() { // from class: ru.ozon.fintech.features.camera.scanners.mlkit.utils.bankcard.BankCardNumberDetector$buildCandidate$$inlined$compareBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t2, T t11) {
                return Vc.a.b(Integer.valueOf(((DetectedLine) t2).getCenterY()), Integer.valueOf(((DetectedLine) t11).getCenterY()));
            }
        };
        return C7714v.V(C7714v.I0(new Comparator() { // from class: ru.ozon.fintech.features.camera.scanners.mlkit.utils.bankcard.BankCardNumberDetector$buildCandidate$$inlined$thenBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t2, T t11) {
                int compare = comparator.compare(t2, t11);
                return compare != 0 ? compare : Vc.a.b(Integer.valueOf(((DetectedLine) t2).getLeft()), Integer.valueOf(((DetectedLine) t11).getLeft()));
            }
        }, lines), "", null, null, new a(0), 30);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence buildCandidate$lambda$3(DetectedLine it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getText();
    }

    private final boolean checkWithLuhnAlg(String number) {
        int i11 = 0;
        boolean z11 = false;
        for (int length = number.length() - 1; -1 < length; length--) {
            int b11 = CharsKt.b(number.charAt(length));
            if (z11 && (b11 = b11 * 2) > 9) {
                b11 -= 9;
            }
            i11 += b11;
            z11 = !z11;
        }
        return i11 % 10 == 0;
    }

    private final List<DetectedLine> extractDigitLines(C5769a visionText) {
        ArrayList arrayList = new ArrayList();
        Iterator<C5769a.e> it = visionText.a().iterator();
        while (it.hasNext()) {
            for (C5769a.b bVar : it.next().d()) {
                String c11 = bVar.c();
                Intrinsics.checkNotNullExpressionValue(c11, "getText(...)");
                int i11 = 0;
                String X9 = h.X(h.X(c11, " ", "", false), "-", "", false);
                int length = X9.length();
                if (4 <= length && length < 20) {
                    while (true) {
                        if (i11 >= X9.length()) {
                            break;
                        }
                        if (Character.isDigit(X9.charAt(i11))) {
                            arrayList.add(new DetectedLine(X9, bVar.a()));
                            break;
                        }
                        i11++;
                    }
                }
            }
        }
        return arrayList;
    }

    private final List<List<DetectedLine>> groupByHorizontalZones(List<DetectedLine> lines, int thresholdPx) {
        List<DetectedLine> I02 = C7714v.I0(new Comparator() { // from class: ru.ozon.fintech.features.camera.scanners.mlkit.utils.bankcard.BankCardNumberDetector$groupByHorizontalZones$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t2, T t11) {
                return Vc.a.b(Integer.valueOf(((DetectedLine) t2).getCenterY()), Integer.valueOf(((DetectedLine) t11).getCenterY()));
            }
        }, lines);
        ArrayList arrayList = new ArrayList();
        for (DetectedLine detectedLine : I02) {
            List list = (List) C7714v.Z(arrayList);
            if (list == null) {
                arrayList.add(C7714v.m0(detectedLine));
            } else {
                if (Math.abs(detectedLine.getCenterY() - ((DetectedLine) C7714v.X(list)).getCenterY()) <= thresholdPx) {
                    list.add(detectedLine);
                } else {
                    arrayList.add(C7714v.m0(detectedLine));
                }
            }
        }
        return arrayList;
    }

    static /* synthetic */ List groupByHorizontalZones$default(BankCardNumberDetector bankCardNumberDetector, List list, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 45;
        }
        return bankCardNumberDetector.groupByHorizontalZones(list, i11);
    }

    private final boolean isValidCandidate(String number) {
        int length = number.length();
        if (13 <= length && length < 20) {
            int i11 = 0;
            while (true) {
                if (i11 < number.length()) {
                    if (!Character.isDigit(number.charAt(i11))) {
                        break;
                    }
                    i11++;
                } else if (checkWithLuhnAlg(number)) {
                    return true;
                }
            }
        }
        return false;
    }

    private final String normalize(String text) {
        StringBuilder sb2 = new StringBuilder(text.length());
        int length = text.length();
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = text.charAt(i11);
            if (Character.isDigit(charAt)) {
                sb2.append(charAt);
            } else if (this.ocrDigitSubstitutions.containsKey(Character.valueOf(charAt))) {
                sb2.append(this.ocrDigitSubstitutions.get(Character.valueOf(charAt)));
            } else {
                Unit unit = Unit.f71690a;
            }
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }

    public final String detect(@NotNull C5769a visionText) {
        Intrinsics.checkNotNullParameter(visionText, "visionText");
        List<DetectedLine> extractDigitLines = extractDigitLines(visionText);
        if (!extractDigitLines.isEmpty()) {
            List<DetectedLine> list = extractDigitLines;
            ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
            for (DetectedLine detectedLine : list) {
                arrayList.add(DetectedLine.copy$default(detectedLine, normalize(detectedLine.getText()), null, 2, null));
            }
            int i11 = 0;
            List groupByHorizontalZones$default = groupByHorizontalZones$default(this, arrayList, 0, 2, null);
            Iterator it = groupByHorizontalZones$default.iterator();
            while (it.hasNext()) {
                String buildCandidate = buildCandidate((List) it.next());
                if (isValidCandidate(buildCandidate)) {
                    return buildCandidate;
                }
            }
            int size = groupByHorizontalZones$default.size() - 1;
            while (i11 < size) {
                Collection collection = (Collection) groupByHorizontalZones$default.get(i11);
                i11++;
                String buildCandidate2 = buildCandidate(C7714v.p0((Iterable) groupByHorizontalZones$default.get(i11), collection));
                if (isValidCandidate(buildCandidate2)) {
                    return buildCandidate2;
                }
            }
        }
        return null;
    }
}
