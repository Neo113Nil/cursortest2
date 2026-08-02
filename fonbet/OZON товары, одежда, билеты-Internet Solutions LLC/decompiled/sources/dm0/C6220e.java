package dm0;

import Sc.r;
import Sc.s;
import em0.C6382a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: dm0.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6220e extends AbstractC7737t implements Function1<Exception, r<? extends C6382a>> {

    /* renamed from: b, reason: collision with root package name */
    public static final C6220e f61673b = new C6220e(1);

    @Override // kotlin.jvm.functions.Function1
    public final r<? extends C6382a> invoke(Exception exc) {
        Exception it = exc;
        Intrinsics.checkNotNullParameter(it, "it");
        r.Companion companion = r.INSTANCE;
        return r.a(s.a(it));
    }
}
