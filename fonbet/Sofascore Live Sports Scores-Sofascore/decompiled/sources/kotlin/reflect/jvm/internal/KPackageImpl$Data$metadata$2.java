package kotlin.reflect.jvm.internal;

import defpackage.n1k;
import defpackage.xka;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.KPackageImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ln1k;", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/JvmNameResolver;", "Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Package;", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/JvmMetadataVersion;", "invoke", "()Ln1k;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class KPackageImpl$Data$metadata$2 extends xka implements Function0<n1k> {
    final /* synthetic */ KPackageImpl.Data this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KPackageImpl$Data$metadata$2(KPackageImpl.Data data) {
        super(0);
        this.this$0 = data;
    }

    @Override // kotlin.jvm.functions.Function0
    @Nullable
    public final n1k invoke() {
        ReflectKotlinClass kotlinClass;
        KotlinClassHeader classHeader;
        kotlinClass = this.this$0.getKotlinClass();
        if (kotlinClass != null && (classHeader = kotlinClass.getClassHeader()) != null) {
            String[] data = classHeader.getData();
            String[] strings = classHeader.getStrings();
            if (data != null && strings != null) {
                Pair<JvmNameResolver, ProtoBuf.Package> readPackageDataFrom = JvmProtoBufUtil.readPackageDataFrom(data, strings);
                return new n1k((JvmNameResolver) readPackageDataFrom.a, (ProtoBuf.Package) readPackageDataFrom.b, classHeader.getMetadataVersion());
            }
        }
        return null;
    }
}
