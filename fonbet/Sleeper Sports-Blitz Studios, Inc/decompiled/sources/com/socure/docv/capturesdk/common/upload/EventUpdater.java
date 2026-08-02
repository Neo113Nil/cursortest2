package com.socure.docv.capturesdk.common.upload;

import com.socure.docv.capturesdk.common.analytics.model.EventData;
import kotlin.Metadata;

/* compiled from: EventUpdater.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/socure/docv/capturesdk/common/upload/EventUpdater;", "", "triggerEvent", "", "eventData", "Lcom/socure/docv/capturesdk/common/analytics/model/EventData;", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface EventUpdater {
    void triggerEvent(EventData eventData);
}
