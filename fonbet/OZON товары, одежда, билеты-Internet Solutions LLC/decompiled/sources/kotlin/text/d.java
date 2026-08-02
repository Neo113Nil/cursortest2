package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/text/MatchResult;", "b", "()Lkotlin/text/MatchResult;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class d extends AbstractC7737t implements Function0<MatchResult> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Regex f71969b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f71970c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(Regex regex, String str) {
        super(0);
        this.f71969b = regex;
        this.f71970c = str;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final MatchResult invoke() {
        return this.f71969b.b(0, this.f71970c);
    }
}
