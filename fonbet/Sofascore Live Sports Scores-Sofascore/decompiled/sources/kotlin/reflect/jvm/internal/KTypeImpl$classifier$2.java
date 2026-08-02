package kotlin.reflect.jvm.internal;

import defpackage.xka;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KClassifier;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lkotlin/reflect/KClassifier;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class KTypeImpl$classifier$2 extends xka implements Function0<KClassifier> {
    final /* synthetic */ KTypeImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KTypeImpl$classifier$2(KTypeImpl kTypeImpl) {
        super(0);
        this.this$0 = kTypeImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    @Nullable
    public final KClassifier invoke() {
        KClassifier convert;
        KTypeImpl kTypeImpl = this.this$0;
        convert = kTypeImpl.convert(kTypeImpl.getType());
        return convert;
    }
}
