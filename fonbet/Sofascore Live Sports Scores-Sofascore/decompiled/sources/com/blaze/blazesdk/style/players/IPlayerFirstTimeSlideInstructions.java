package com.blaze.blazesdk.style.players;

import androidx.annotation.Keep;
import com.blaze.blazesdk.utils.BlazeParcelable;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001R\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lcom/blaze/blazesdk/style/players/IPlayerFirstTimeSlideInstructions;", "Lcom/blaze/blazesdk/utils/BlazeParcelable;", "customs", "", "Lcom/blaze/blazesdk/style/players/BlazeFirstTimeSlideInstructionStyle;", "getCustoms", "()Ljava/util/List;", "setCustoms", "(Ljava/util/List;)V", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface IPlayerFirstTimeSlideInstructions extends BlazeParcelable {
    @NotNull
    List<BlazeFirstTimeSlideInstructionStyle> getCustoms();

    void setCustoms(@NotNull List<BlazeFirstTimeSlideInstructionStyle> list);
}
