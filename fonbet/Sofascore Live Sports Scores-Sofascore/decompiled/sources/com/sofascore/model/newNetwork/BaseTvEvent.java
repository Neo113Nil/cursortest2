package com.sofascore.model.newNetwork;

import com.sofascore.model.mvvm.model.TvChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0003R#\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\t0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/sofascore/model/newNetwork/BaseTvEvent;", "", "tvChannel", "Lcom/sofascore/model/mvvm/model/TvChannel;", "<init>", "(Lcom/sofascore/model/mvvm/model/TvChannel;)V", "channels", "", "", "", "getChannels", "()Ljava/util/Map;", "showCountryFlag", "", "getShowCountryFlag", "()Z", "setShowCountryFlag", "(Z)V", "addChannel", "", "channel", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public class BaseTvEvent {

    @NotNull
    private final Map<String, List<TvChannel>> channels;
    private boolean showCountryFlag;

    public BaseTvEvent(@NotNull TvChannel tvChannel) {
        tvChannel.getClass();
        this.channels = new TreeMap();
        addChannel(tvChannel);
    }

    public final void addChannel(@NotNull TvChannel channel) {
        channel.getClass();
        List<TvChannel> list = this.channels.get(channel.getCountryCode());
        if (list == null) {
            list = new ArrayList<>();
        }
        list.add(channel);
        this.channels.put(channel.getCountryCode(), list);
    }

    @NotNull
    public final Map<String, List<TvChannel>> getChannels() {
        return this.channels;
    }

    public final boolean getShowCountryFlag() {
        return this.showCountryFlag;
    }

    public final void setShowCountryFlag(boolean z) {
        this.showCountryFlag = z;
    }
}
