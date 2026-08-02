package kotlin.reflect.jvm.internal;

import defpackage.joa;
import defpackage.k13;
import defpackage.km5;
import defpackage.xka;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.zzl;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "Lkotlin/reflect/KTypeProjection;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class KTypeImpl$arguments$2 extends xka implements Function0<List<? extends KTypeProjection>> {
    final /* synthetic */ Function0<Type> $computeJavaType;
    final /* synthetic */ KTypeImpl this$0;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Variance.values().length];
            try {
                iArr[Variance.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Variance.IN_VARIANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Variance.OUT_VARIANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KTypeImpl$arguments$2(KTypeImpl kTypeImpl, Function0<? extends Type> function0) {
        super(0);
        this.this$0 = kTypeImpl;
        this.$computeJavaType = function0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Type> invoke$lambda$0(joa joaVar) {
        return (List) joaVar.getValue();
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<KTypeProjection> invoke() {
        KTypeProjection invariant;
        List<TypeProjection> arguments = this.this$0.getType().getArguments();
        if (arguments.isEmpty()) {
            return km5.a;
        }
        joa a = ypa.a(ysa.b, new KTypeImpl$arguments$2$parameterizedTypeArguments$2(this.this$0));
        Function0<Type> function0 = this.$computeJavaType;
        KTypeImpl kTypeImpl = this.this$0;
        ArrayList arrayList = new ArrayList(k13.r(arguments, 10));
        int i = 0;
        for (Object obj : arguments) {
            int i2 = i + 1;
            if (i < 0) {
                b.q();
                throw null;
            }
            TypeProjection typeProjection = (TypeProjection) obj;
            if (typeProjection.isStarProjection()) {
                invariant = KTypeProjection.INSTANCE.getSTAR();
            } else {
                KotlinType type = typeProjection.getType();
                type.getClass();
                KTypeImpl kTypeImpl2 = new KTypeImpl(type, function0 == null ? null : new KTypeImpl$arguments$2$1$type$1(kTypeImpl, i, a));
                int i3 = WhenMappings.$EnumSwitchMapping$0[typeProjection.getProjectionKind().ordinal()];
                if (i3 == 1) {
                    invariant = KTypeProjection.INSTANCE.invariant(kTypeImpl2);
                } else if (i3 == 2) {
                    invariant = KTypeProjection.INSTANCE.contravariant(kTypeImpl2);
                } else {
                    if (i3 != 3) {
                        zzl.b();
                        return null;
                    }
                    invariant = KTypeProjection.INSTANCE.covariant(kTypeImpl2);
                }
            }
            arrayList.add(invariant);
            i = i2;
        }
        return arrayList;
    }
}
