package ru.ozon.app.android.storage.extraHeaders;

import Sc.InterfaceC4008j;
import Sc.k;
import android.content.Context;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pf0.InterfaceC8918a;
import xe.C10727i;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0006R\u001b\u0010\f\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR<\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\r2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\r8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/storage/extraHeaders/ExtraHeadersDataSourceImpl;", "Lru/ozon/app/android/storage/extraHeaders/ExtraHeadersDataSource;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/content/Context;", "Lpf0/a;", "extraHeadersRepository$delegate", "LSc/j;", "getExtraHeadersRepository", "()Lpf0/a;", "extraHeadersRepository", "", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "getExtraHeaders", "()Ljava/util/Map;", "setExtraHeaders", "(Ljava/util/Map;)V", "extraHeaders", "storage_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ExtraHeadersDataSourceImpl implements ExtraHeadersDataSource {

    @NotNull
    private final Context context;

    /* renamed from: extraHeadersRepository$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j extraHeadersRepository;

    public ExtraHeadersDataSourceImpl(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.extraHeadersRepository = k.b(new ExtraHeadersDataSourceImpl$extraHeadersRepository$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC8918a getExtraHeadersRepository() {
        return (InterfaceC8918a) this.extraHeadersRepository.getValue();
    }

    @Override // ru.ozon.app.android.storage.extraHeaders.ExtraHeadersDataSource
    @NotNull
    public Map<String, String> getExtraHeaders() {
        return (Map) C10727i.d(g.f71771a, new ExtraHeadersDataSourceImpl$extraHeaders$1(this, null));
    }

    @Override // ru.ozon.app.android.storage.extraHeaders.ExtraHeadersDataSource
    public void setExtraHeaders(@NotNull Map<String, String> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        C10727i.d(g.f71771a, new ExtraHeadersDataSourceImpl$extraHeaders$2(this, value, null));
    }
}
