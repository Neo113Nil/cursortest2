package l0;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes.dex */
final class E extends AbstractC7737t implements Function2<O, O, Boolean> {

    /* renamed from: b, reason: collision with root package name */
    public static final E f72013b = new E(2);

    @Override // kotlin.jvm.functions.Function2
    public final Boolean invoke(O o11, O o12) {
        O o13 = o12;
        return Boolean.valueOf(o11 == o13 && o13 == O.PostExit);
    }
}
