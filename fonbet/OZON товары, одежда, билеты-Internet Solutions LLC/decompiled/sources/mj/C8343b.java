package mj;

import androidx.lifecycle.C5418g0;
import androidx.lifecycle.w0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.inAppUpdate.internal.ui.g;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lmj/b;", "Landroidx/lifecycle/w0;", "Landroidx/lifecycle/g0;", "savedStateHandle", "<init>", "(Landroidx/lifecycle/g0;)V", "in-app-update-sdk_googlePlayStoreRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: mj.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C8343b extends w0 {

    /* renamed from: a, reason: collision with root package name */
    private final g f76003a;

    public C8343b(@NotNull C5418g0 savedStateHandle) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.f76003a = (g) savedStateHandle.c("ru.ozon.android.inAppUpdate.internal.ui.CONFIG_KEY");
    }

    /* renamed from: d0, reason: from getter */
    public final g getF76003a() {
        return this.f76003a;
    }
}
