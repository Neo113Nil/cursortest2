package com.inmobi.media;

import com.inmobi.media.ads.network.inmobiJson.model.VideoExperience;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class S1 {
    public final boolean a;
    public final int b;
    public final int c;
    public final C3572lc d;
    public final int e;

    public S1(VideoExperience videoExperience, AdConfig.VideoPlayerAudioConfig videoPlayerAudioConfig) {
        C3572lc c3572lc;
        C3572lc c3572lc2;
        videoExperience.getClass();
        videoPlayerAudioConfig.getClass();
        Boolean startMuted = videoExperience.getAudio().getStartMuted();
        this.a = startMuted != null ? startMuted.booleanValue() : videoPlayerAudioConfig.getStartMuted();
        Integer muteIconWidth = videoExperience.getAudio().getMuteIconWidth();
        this.b = muteIconWidth != null ? muteIconWidth.intValue() : videoPlayerAudioConfig.getMuteIconWidth();
        Integer muteIconHeight = videoExperience.getAudio().getMuteIconHeight();
        this.c = muteIconHeight != null ? muteIconHeight.intValue() : videoPlayerAudioConfig.getMuteIconHeight();
        int[] muteIconMargin = videoExperience.getAudio().getMuteIconMargin();
        if (muteIconMargin == null) {
            List<Integer> muteIconMargin2 = videoPlayerAudioConfig.getMuteIconMargin();
            muteIconMargin2.getClass();
            if (muteIconMargin2.size() != 4) {
                c3572lc2 = new C3572lc(0, 0, 0, 0);
            } else {
                c3572lc = new C3572lc(muteIconMargin2.get(0).intValue(), muteIconMargin2.get(1).intValue(), muteIconMargin2.get(2).intValue(), muteIconMargin2.get(3).intValue());
                c3572lc2 = c3572lc;
            }
        } else if (muteIconMargin.length != 4) {
            c3572lc2 = new C3572lc(0, 0, 0, 0);
        } else {
            c3572lc = new C3572lc(muteIconMargin[0], muteIconMargin[1], muteIconMargin[2], muteIconMargin[3]);
            c3572lc2 = c3572lc;
        }
        this.d = c3572lc2;
        Integer muteIconPosition = videoExperience.getAudio().getMuteIconPosition();
        this.e = muteIconPosition != null ? muteIconPosition.intValue() : videoPlayerAudioConfig.getMuteIconPosition();
    }
}
