package ru.ozon.android.messenger.framework.data;

import android.app.Activity;
import android.content.Context;
import java.util.ArrayList;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final ArrayList f87376a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f87377b = 0;

    public static void a(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        f87376a.add(activity);
    }

    public static void b(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        f87376a.remove(activity);
    }

    @NotNull
    public static Context c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Activity activity = (Activity) C7714v.Z(f87376a);
        return activity != null ? activity : context;
    }
}
