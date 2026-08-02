package kotlin.reflect.jvm;

import com.sofascore.model.mvvm.model.PlayerKt;
import defpackage.dt8;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.reflect.KFunction;
import kotlin.reflect.jvm.internal.EmptyContainerForLocal;
import kotlin.reflect.jvm.internal.KFunctionImpl;
import kotlin.reflect.jvm.internal.UtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0003\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {PlayerKt.ICE_HOCKEY_RIGHT_WING, "Ldt8;", "Lkotlin/reflect/KFunction;", "reflect", "(Ldt8;)Lkotlin/reflect/KFunction;", "kotlin-reflection"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ReflectLambdaKt {
    @ExperimentalReflectionOnLambdas
    @Nullable
    public static final <R> KFunction<R> reflect(@NotNull dt8 dt8Var) {
        dt8Var.getClass();
        Metadata metadata = (Metadata) dt8Var.getClass().getAnnotation(Metadata.class);
        if (metadata == null) {
            return null;
        }
        String[] d1 = metadata.d1();
        if (d1.length == 0) {
            d1 = null;
        }
        if (d1 == null) {
            return null;
        }
        Pair<JvmNameResolver, ProtoBuf.Function> readFunctionDataFrom = JvmProtoBufUtil.readFunctionDataFrom(d1, metadata.d2());
        JvmNameResolver jvmNameResolver = (JvmNameResolver) readFunctionDataFrom.a;
        ProtoBuf.Function function = (ProtoBuf.Function) readFunctionDataFrom.b;
        JvmMetadataVersion jvmMetadataVersion = new JvmMetadataVersion(metadata.mv(), (metadata.xi() & 8) != 0);
        Class<?> cls = dt8Var.getClass();
        ProtoBuf.TypeTable typeTable = function.getTypeTable();
        typeTable.getClass();
        return new KFunctionImpl(EmptyContainerForLocal.INSTANCE, (SimpleFunctionDescriptor) UtilKt.deserializeToDescriptor(cls, function, jvmNameResolver, new TypeTable(typeTable), jvmMetadataVersion, ReflectLambdaKt$reflect$descriptor$1.INSTANCE));
    }
}
