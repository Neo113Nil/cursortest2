package m60;

import com.squareup.moshi.Moshi;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeResult;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.navigation.models.BxBadge;

/* renamed from: m60.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8097b extends V50.b<BxBadge> {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final T50.a f74505b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f74506c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8097b(@NotNull T50.a externalTabBadgeManager, @NotNull Moshi moshi) {
        super(moshi);
        Intrinsics.checkNotNullParameter(externalTabBadgeManager, "externalTabBadgeManager");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.f74505b = externalTabBadgeManager;
        this.f74506c = "change_bx_tab_badge";
    }

    @Override // V50.b
    @NotNull
    public final Class<BxBadge> a() {
        return BxBadge.class;
    }

    @Override // V50.b
    public final void c(WeakReference weakReference, Object obj, U50.j callback) {
        NativeResult.Success success;
        BxBadge value = (BxBadge) obj;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(callback, "callback");
        boolean active = value.getActive();
        this.f74505b.a(value.getItem(), active);
        NativeResult.Success.INSTANCE.getClass();
        success = NativeResult.Success.DEFAULT_WITH_SUCCESS;
        callback.invoke(success);
    }

    @Override // V50.b
    public final NativeResult d(WeakReference weakReference, BxBadge bxBadge, String parameterJson) {
        NativeResult.Success success;
        BxBadge value = bxBadge;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        boolean active = value.getActive();
        this.f74505b.a(value.getItem(), active);
        NativeResult.Success.INSTANCE.getClass();
        success = NativeResult.Success.DEFAULT_WITH_SUCCESS;
        return success;
    }

    @Override // U50.c
    @NotNull
    public final String getInterfaceName() {
        return this.f74506c;
    }
}
