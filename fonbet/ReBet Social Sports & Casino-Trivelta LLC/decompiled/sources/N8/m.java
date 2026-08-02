package N8;

import com.giphy.sdk.analytics.models.enums.EventType;
import java.util.List;

/* loaded from: classes2.dex */
public interface m {
    String getAnalyticsResponsePayload();

    List getBottleDataTags();

    EventType getEventType();

    String getId();

    List getInjectedPixels();

    Integer getPosition();

    String getResponseId();

    String getTid();
}
