package ru.ozon.uni.atoms.utils;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class OzTrace$beginTrace$fullName$1 extends AbstractC7737t implements Function1<Pair<? extends Object, ? extends Object>, CharSequence> {
    public static final OzTrace$beginTrace$fullName$1 INSTANCE = new OzTrace$beginTrace$fullName$1();

    OzTrace$beginTrace$fullName$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final CharSequence invoke(Pair<? extends Object, ? extends Object> it) {
        String transformValue;
        Intrinsics.checkNotNullParameter(it, "it");
        Object e11 = it.e();
        transformValue = OzTrace.INSTANCE.transformValue(it.f());
        return e11 + " : " + transformValue;
    }
}
