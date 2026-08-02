package io.appmetrica.analytics.coreutils.internal.toggle;

import d9.e;
import io.appmetrica.analytics.coreapi.internal.data.Savable;
import io.appmetrica.analytics.coreapi.internal.data.Updatable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u001d\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\r"}, d2 = {"Lio/appmetrica/analytics/coreutils/internal/toggle/SavableToggle;", "Lio/appmetrica/analytics/coreutils/internal/toggle/SimpleThreadSafeToggle;", "Lio/appmetrica/analytics/coreapi/internal/data/Updatable;", "", "value", "", "update", "", "subTag", "Lio/appmetrica/analytics/coreapi/internal/data/Savable;", "savable", "<init>", "(Ljava/lang/String;Lio/appmetrica/analytics/coreapi/internal/data/Savable;)V", "core-utils_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class SavableToggle extends SimpleThreadSafeToggle implements Updatable<Boolean> {

    /* renamed from: d, reason: collision with root package name */
    private final Savable f11762d;

    public SavableToggle(@NotNull String str, @NotNull Savable<Boolean> savable) {
        super(savable.getValue().booleanValue(), e.e(']', "[SavableToggle - ", str));
        this.f11762d = savable;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Updatable
    public /* bridge */ /* synthetic */ void update(Boolean bool) {
        update(bool.booleanValue());
    }

    public void update(boolean value) {
        updateState(value);
        this.f11762d.setValue(Boolean.valueOf(getActualState()));
    }
}
