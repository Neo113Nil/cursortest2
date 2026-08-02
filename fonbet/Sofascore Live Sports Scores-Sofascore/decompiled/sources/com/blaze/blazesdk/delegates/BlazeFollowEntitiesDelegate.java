package com.blaze.blazesdk.delegates;

import androidx.annotation.Keep;
import com.blaze.blazesdk.delegates.models.BlazeFollowEntityClickedParams;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lcom/blaze/blazesdk/delegates/BlazeFollowEntitiesDelegate;", "", "onFollowEntityClicked", "", "followEntityParams", "Lcom/blaze/blazesdk/delegates/models/BlazeFollowEntityClickedParams;", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface BlazeFollowEntitiesDelegate {
    void onFollowEntityClicked(@NotNull BlazeFollowEntityClickedParams followEntityParams);
}
