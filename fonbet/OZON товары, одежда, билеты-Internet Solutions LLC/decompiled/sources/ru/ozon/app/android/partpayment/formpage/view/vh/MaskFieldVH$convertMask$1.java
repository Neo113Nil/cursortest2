package ru.ozon.app.android.partpayment.formpage.view.vh;

import Dm0.a;
import Dm0.b;
import Dm0.e;
import Dm0.f;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchGroup;
import kotlin.text.MatchResult;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/text/MatchResult;", "matchResult", "LDm0/b;", "invoke", "(Lkotlin/text/MatchResult;)LDm0/b;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes13.dex */
final class MaskFieldVH$convertMask$1 extends AbstractC7737t implements Function1<MatchResult, b> {
    public static final MaskFieldVH$convertMask$1 INSTANCE = new MaskFieldVH$convertMask$1();

    MaskFieldVH$convertMask$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final b invoke(MatchResult matchResult) {
        String f71945a;
        Intrinsics.checkNotNullParameter(matchResult, "matchResult");
        MatchGroup b11 = matchResult.b().b(0);
        if (b11 == null || (f71945a = b11.getF71945a()) == null) {
            return null;
        }
        int hashCode = f71945a.hashCode();
        if (hashCode != 2898) {
            if (hashCode != 2949) {
                if (hashCode == 2952 && f71945a.equals("\\d")) {
                    return a.a();
                }
            } else if (f71945a.equals("\\a")) {
                return new b(new f());
            }
        } else if (f71945a.equals("\\.")) {
            int i11 = a.f6754a;
            return new b(new e());
        }
        char[] charArray = f71945a.toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
        Intrinsics.checkNotNullParameter(charArray, "<this>");
        if (charArray.length != 0) {
            return a.b(charArray[0]);
        }
        throw new NoSuchElementException("Array is empty.");
    }
}
