package kotlin.text;

import K1.C3422b;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010(\n\u0002\u0010\f\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "", "b", "()Ljava/util/Iterator;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class z extends AbstractC7737t implements Function0<Iterator<? extends Character>> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C3422b f71981b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    z(C3422b c3422b) {
        super(0);
        this.f71981b = c3422b;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Iterator<Character> invoke() {
        return h.L(this.f71981b);
    }
}
