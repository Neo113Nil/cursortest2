package com.blaze.blazesdk.widgets.contracts;

import androidx.annotation.Keep;
import com.blaze.blazesdk.data_source.BlazeDataSourceType;
import com.blaze.blazesdk.style.widgets.BlazeWidgetItemCustomMapping;
import com.blaze.blazesdk.style.widgets.BlazeWidgetItemStyleOverrides;
import com.blaze.blazesdk.style.widgets.BlazeWidgetLayout;
import com.blaze.blazesdk.widgets.models.BlazeWidgetPlayFrom;
import defpackage.a70;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H&J\u001a\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u0004\u001a\u00020\u0005H&J(\u0010\t\u001a\u00020\u00032\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u0005H&J\b\u0010\u000f\u001a\u00020\u0003H&J\b\u0010\u0010\u001a\u00020\u0003H&J\b\u0010\u0011\u001a\u00020\u0003H&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013H&J\n\u0010\u0014\u001a\u0004\u0018\u00010\u0015H&J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0015H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0018À\u0006\u0001"}, d2 = {"Lcom/blaze/blazesdk/widgets/contracts/BaseWidgetContract;", "", "reloadData", "", "isSilentRefresh", "", "updateDataSource", "dataSourceType", "Lcom/blaze/blazesdk/data_source/BlazeDataSourceType;", "updateOverrideStyles", "perItemStyleOverrides", "", "Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemCustomMapping;", "Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemStyleOverrides;", "shouldUpdateUi", "resetOverriddenStyles", "updateWidgetsUi", "play", "from", "Lcom/blaze/blazesdk/widgets/models/BlazeWidgetPlayFrom;", "getCurrentWidgetLayout", "Lcom/blaze/blazesdk/style/widgets/BlazeWidgetLayout;", "updateWidgetLayout", "blazeWidgetLayout", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface BaseWidgetContract {
    static /* synthetic */ void reloadData$default(BaseWidgetContract baseWidgetContract, boolean z, int i, Object obj) {
        if (obj != null) {
            a70.m("Super calls with default arguments not supported in this target, function: reloadData");
            return;
        }
        if ((i & 1) != 0) {
            z = false;
        }
        baseWidgetContract.reloadData(z);
    }

    static /* synthetic */ void updateDataSource$default(BaseWidgetContract baseWidgetContract, BlazeDataSourceType blazeDataSourceType, boolean z, int i, Object obj) {
        if (obj != null) {
            a70.m("Super calls with default arguments not supported in this target, function: updateDataSource");
            return;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        baseWidgetContract.updateDataSource(blazeDataSourceType, z);
    }

    static /* synthetic */ void updateOverrideStyles$default(BaseWidgetContract baseWidgetContract, Map map, boolean z, int i, Object obj) {
        if (obj != null) {
            a70.m("Super calls with default arguments not supported in this target, function: updateOverrideStyles");
            return;
        }
        if ((i & 2) != 0) {
            z = true;
        }
        baseWidgetContract.updateOverrideStyles(map, z);
    }

    @Nullable
    BlazeWidgetLayout getCurrentWidgetLayout();

    void play();

    void play(@NotNull BlazeWidgetPlayFrom from);

    void reloadData(boolean isSilentRefresh);

    void resetOverriddenStyles();

    void updateDataSource(@NotNull BlazeDataSourceType dataSourceType, boolean isSilentRefresh);

    void updateOverrideStyles(@NotNull Map<BlazeWidgetItemCustomMapping, BlazeWidgetItemStyleOverrides> perItemStyleOverrides, boolean shouldUpdateUi);

    void updateWidgetLayout(@NotNull BlazeWidgetLayout blazeWidgetLayout);

    void updateWidgetsUi();
}
