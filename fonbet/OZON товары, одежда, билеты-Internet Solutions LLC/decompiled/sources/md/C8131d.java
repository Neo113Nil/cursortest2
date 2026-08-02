package md;

import Nd.h;
import fe.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7734p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.g;
import td.c0;

/* renamed from: md.d, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final /* synthetic */ class C8131d extends C7734p implements Function2<K, h, c0> {

    /* renamed from: a, reason: collision with root package name */
    public static final C8131d f74727a = new C8131d(2);

    @Override // kotlin.jvm.internal.AbstractC7724f, kotlin.reflect.c
    public final String getName() {
        return "loadFunction";
    }

    @Override // kotlin.jvm.internal.AbstractC7724f
    public final g getOwner() {
        return N.b(K.class);
    }

    @Override // kotlin.jvm.internal.AbstractC7724f
    public final String getSignature() {
        return "loadFunction(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Function;)Lorg/jetbrains/kotlin/descriptors/SimpleFunctionDescriptor;";
    }

    @Override // kotlin.jvm.functions.Function2
    public final c0 invoke(K k11, h hVar) {
        K p02 = k11;
        h p12 = hVar;
        Intrinsics.checkNotNullParameter(p02, "p0");
        Intrinsics.checkNotNullParameter(p12, "p1");
        return p02.m(p12);
    }
}
