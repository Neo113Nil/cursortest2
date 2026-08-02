package ge;

import java.io.InputStream;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7734p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.g;

/* renamed from: ge.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final /* synthetic */ class C6719b extends C7734p implements Function1<String, InputStream> {
    @Override // kotlin.jvm.internal.AbstractC7724f, kotlin.reflect.c
    public final String getName() {
        return "loadResource";
    }

    @Override // kotlin.jvm.internal.AbstractC7724f
    public final g getOwner() {
        return N.b(C6722e.class);
    }

    @Override // kotlin.jvm.internal.AbstractC7724f
    public final String getSignature() {
        return "loadResource(Ljava/lang/String;)Ljava/io/InputStream;";
    }

    @Override // kotlin.jvm.functions.Function1
    public final InputStream invoke(String str) {
        String p02 = str;
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((C6722e) this.receiver).getClass();
        return C6722e.a(p02);
    }
}
