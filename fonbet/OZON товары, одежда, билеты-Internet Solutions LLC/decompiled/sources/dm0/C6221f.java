package dm0;

import android.content.ComponentName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: dm0.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6221f extends AbstractC7737t implements Function1<String, ComponentName> {

    /* renamed from: b, reason: collision with root package name */
    public static final C6221f f61674b = new C6221f(1);

    @Override // kotlin.jvm.functions.Function1
    public final ComponentName invoke(String str) {
        String packageName = str;
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        return new ComponentName(packageName, "com.vk.push.pushsdk.ipc.PushService");
    }
}
