package kotlin.collections;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7721c;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "", "b", "()Ljava/util/Iterator;"}, k = 3, mv = {1, 9, 0})
/* renamed from: kotlin.collections.s, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C7711s extends AbstractC7737t implements Function0<Iterator<Object>> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object[] f71758b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C7711s(Object[] objArr) {
        super(0);
        this.f71758b = objArr;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Iterator<Object> invoke() {
        return C7721c.a(this.f71758b);
    }
}
