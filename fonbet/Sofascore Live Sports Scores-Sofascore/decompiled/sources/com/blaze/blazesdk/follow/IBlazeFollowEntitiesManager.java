package com.blaze.blazesdk.follow;

import androidx.annotation.Keep;
import com.blaze.blazesdk.delegates.BlazeFollowEntitiesDelegate;
import com.blaze.blazesdk.follow.models.BlazeFollowEntity;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0016\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH&J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH&J\u0016\u0010\u000e\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH&J\u0016\u0010\u000f\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH&R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Lcom/blaze/blazesdk/follow/IBlazeFollowEntitiesManager;", "", "delegate", "Lcom/blaze/blazesdk/delegates/BlazeFollowEntitiesDelegate;", "getDelegate", "()Lcom/blaze/blazesdk/delegates/BlazeFollowEntitiesDelegate;", "setDelegate", "(Lcom/blaze/blazesdk/delegates/BlazeFollowEntitiesDelegate;)V", "setFollowedEntities", "", "followedEntities", "", "Lcom/blaze/blazesdk/follow/models/BlazeFollowEntity;", "getFollowedEntities", "insertFollowedEntities", "removeFollowedEntities", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface IBlazeFollowEntitiesManager {
    @Nullable
    BlazeFollowEntitiesDelegate getDelegate();

    @NotNull
    Set<BlazeFollowEntity> getFollowedEntities();

    void insertFollowedEntities(@NotNull Set<BlazeFollowEntity> followedEntities);

    void removeFollowedEntities(@NotNull Set<BlazeFollowEntity> followedEntities);

    void setDelegate(@Nullable BlazeFollowEntitiesDelegate blazeFollowEntitiesDelegate);

    void setFollowedEntities(@NotNull Set<BlazeFollowEntity> followedEntities);
}
