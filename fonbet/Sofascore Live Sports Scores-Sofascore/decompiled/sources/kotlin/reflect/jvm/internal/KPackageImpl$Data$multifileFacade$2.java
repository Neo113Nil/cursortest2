package kotlin.reflect.jvm.internal;

import defpackage.xka;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.KPackageImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/lang/Class;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class KPackageImpl$Data$multifileFacade$2 extends xka implements Function0<Class<?>> {
    final /* synthetic */ KPackageImpl.Data this$0;
    final /* synthetic */ KPackageImpl this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KPackageImpl$Data$multifileFacade$2(KPackageImpl.Data data, KPackageImpl kPackageImpl) {
        super(0);
        this.this$0 = data;
        this.this$1 = kPackageImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    @Nullable
    public final Class<?> invoke() {
        ReflectKotlinClass kotlinClass;
        KotlinClassHeader classHeader;
        kotlinClass = this.this$0.getKotlinClass();
        String multifileClassName = (kotlinClass == null || (classHeader = kotlinClass.getClassHeader()) == null) ? null : classHeader.getMultifileClassName();
        if (multifileClassName == null || multifileClassName.length() <= 0) {
            return null;
        }
        ClassLoader classLoader = this.this$1.getJClass().getClassLoader();
        String replace = multifileClassName.replace('/', '.');
        replace.getClass();
        return classLoader.loadClass(replace);
    }
}
