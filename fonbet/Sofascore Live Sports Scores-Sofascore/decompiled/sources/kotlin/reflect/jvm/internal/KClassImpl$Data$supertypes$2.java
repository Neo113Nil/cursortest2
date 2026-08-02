package kotlin.reflect.jvm.internal;

import defpackage.xka;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0004*\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lkotlin/reflect/jvm/internal/KTypeImpl;", "kotlin.jvm.PlatformType", "T", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class KClassImpl$Data$supertypes$2 extends xka implements Function0<List<? extends KTypeImpl>> {
    final /* synthetic */ KClassImpl<T>.Data this$0;
    final /* synthetic */ KClassImpl<T> this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KClassImpl$Data$supertypes$2(KClassImpl<T>.Data data, KClassImpl<T> kClassImpl) {
        super(0);
        this.this$0 = data;
        this.this$1 = kClassImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<KTypeImpl> invoke() {
        Collection<KotlinType> mo894getSupertypes = this.this$0.getDescriptor().getTypeConstructor().mo894getSupertypes();
        mo894getSupertypes.getClass();
        ArrayList arrayList = new ArrayList(mo894getSupertypes.size());
        KClassImpl<T>.Data data = this.this$0;
        KClassImpl<T> kClassImpl = this.this$1;
        for (KotlinType kotlinType : mo894getSupertypes) {
            kotlinType.getClass();
            arrayList.add(new KTypeImpl(kotlinType, new KClassImpl$Data$supertypes$2$1$1(kotlinType, data, kClassImpl)));
        }
        if (!KotlinBuiltIns.isSpecialClassWithNoSupertypes(this.this$0.getDescriptor())) {
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ClassKind kind = DescriptorUtils.getClassDescriptorForType(((KTypeImpl) it.next()).getType()).getKind();
                    kind.getClass();
                    if (kind != ClassKind.INTERFACE && kind != ClassKind.ANNOTATION_CLASS) {
                        break;
                    }
                }
            }
            SimpleType anyType = DescriptorUtilsKt.getBuiltIns(this.this$0.getDescriptor()).getAnyType();
            anyType.getClass();
            arrayList.add(new KTypeImpl(anyType, AnonymousClass3.INSTANCE));
        }
        return CollectionsKt.compact(arrayList);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Ljava/lang/reflect/Type;", "T", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.reflect.jvm.internal.KClassImpl$Data$supertypes$2$3, reason: invalid class name */
    public static final class AnonymousClass3 extends xka implements Function0<Type> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        public AnonymousClass3() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Type invoke() {
            return Object.class;
        }
    }
}
