package com.sofascore.model.util;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\bH&¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/sofascore/model/util/EventInterface;", "Lcom/sofascore/model/util/ChatInterface;", "hasExtraInfo", "", "tvChannelString", "", "hasBet365LiveStream", "countriesWithBlockedBet365Stream", "", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface EventInterface extends ChatInterface {
    @Nullable
    List<String> countriesWithBlockedBet365Stream();

    boolean hasBet365LiveStream();

    boolean hasExtraInfo();

    @Nullable
    String tvChannelString();
}
