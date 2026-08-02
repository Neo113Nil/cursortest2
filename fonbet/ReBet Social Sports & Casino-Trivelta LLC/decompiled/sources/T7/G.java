package T7;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes2.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    public static final G f10987a = new G();

    /* renamed from: b, reason: collision with root package name */
    public static volatile String f10988b;

    public static final String a() {
        return f10988b;
    }

    public static final boolean b() {
        String str = f10988b;
        return Intrinsics.areEqual(str != null ? Boolean.valueOf(StringsKt.startsWith$default(str, "Unity.", false, 2, (Object) null)) : null, Boolean.TRUE);
    }
}
