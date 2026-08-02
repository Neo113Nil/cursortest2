package kotlin.reflect.jvm.internal;

import com.sofascore.model.mvvm.model.PlayerKt;
import defpackage.xka;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\u0006\b\u0000\u0010\u0003 \u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/KTypeImpl;", "kotlin.jvm.PlatformType", PlayerKt.ICE_HOCKEY_RIGHT_WING, "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class KCallableImpl$_returnType$1 extends xka implements Function0<KTypeImpl> {
    final /* synthetic */ KCallableImpl<R> this$0;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002 \u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Ljava/lang/reflect/Type;", PlayerKt.ICE_HOCKEY_RIGHT_WING, "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.reflect.jvm.internal.KCallableImpl$_returnType$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends xka implements Function0<Type> {
        final /* synthetic */ KCallableImpl<R> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(KCallableImpl<? extends R> kCallableImpl) {
            super(0);
            this.this$0 = kCallableImpl;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Type invoke() {
            Type extractContinuationArgument;
            extractContinuationArgument = this.this$0.extractContinuationArgument();
            return extractContinuationArgument == null ? this.this$0.getCaller().getReturnType() : extractContinuationArgument;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KCallableImpl$_returnType$1(KCallableImpl<? extends R> kCallableImpl) {
        super(0);
        this.this$0 = kCallableImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final KTypeImpl invoke() {
        KotlinType returnType = this.this$0.getDescriptor().getReturnType();
        returnType.getClass();
        return new KTypeImpl(returnType, new AnonymousClass1(this.this$0));
    }
}
