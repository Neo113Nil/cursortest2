package ru.ozon.android.messenger.framework.presentation.messenger;

import Ae.M0;
import Ae.O0;
import androidx.lifecycle.C5418g0;
import androidx.lifecycle.w0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/android/messenger/framework/presentation/messenger/b;", "Landroidx/lifecycle/w0;", "Landroidx/lifecycle/g0;", "stateHandle", "<init>", "(Landroidx/lifecycle/g0;)V", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b extends w0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C5418g0 f91313a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private M0<String> f91314b;

    public b(@NotNull C5418g0 stateHandle) {
        Intrinsics.checkNotNullParameter(stateHandle, "stateHandle");
        this.f91313a = stateHandle;
        this.f91314b = O0.a(null);
    }

    public static final String d0(b bVar, String str) {
        String value = bVar.f91314b.getValue();
        if (value != null) {
            return U7.d.e(value, str);
        }
        return null;
    }

    @NotNull
    public final a f0() {
        return new a(this);
    }

    public final void g0(@NotNull M0<String> m02) {
        Intrinsics.checkNotNullParameter(m02, "<set-?>");
        this.f91314b = m02;
    }
}
