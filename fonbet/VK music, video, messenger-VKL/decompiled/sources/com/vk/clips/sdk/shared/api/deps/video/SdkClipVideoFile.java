package com.vk.clips.sdk.shared.api.deps.video;

import com.vk.clips.sdk.models.SdkCoOwnerItem;
import com.vk.clips.sdk.models.SdkCompilation;
import com.vk.clips.sdk.models.SdkDuetMeta;
import com.vk.clips.sdk.models.SdkImages;
import com.vk.clips.sdk.models.SdkMask;
import com.vk.clips.sdk.models.SdkMusicTrack;
import com.vk.clips.sdk.models.SdkTrendingHashtag;
import com.vk.clips.sdk.models.ads.SdkClipsAdsFeaturesParams;
import com.vk.clips.sdk.shared.api.deps.SdkOriginalSoundStatus;
import com.vk.clips.sdk.shared.api.deps.dtos.SdkGeoPlace;
import com.vk.clips.sdk.shared.api.playlist.SdkClipsDraftablePlaylist;
import com.vk.clips.sdk.shared.clips.SdkClipAudioTemplate;
import com.vk.clips.sdk.shared.clips.SdkNewsMonotheme;
import com.vk.clips.sdk.stats.pixels.models.AdStatPixel;
import com.vk.clips.viewer.impl.adapters.ClipVideoFileAdapter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import xsna.njh0;

/* compiled from: SdkVideoFile.kt */
/* loaded from: classes17.dex */
public interface SdkClipVideoFile extends SdkVideoFile {
    SdkGeoPlace A5();

    List<njh0> G1();

    List<SdkMask> H2();

    List<SdkCompilation> H4();

    ArrayList K3();

    CharSequence L5();

    SdkImages M0();

    ClipVideoFileAdapter M1(ArrayList arrayList);

    ArrayList Ma();

    List<SdkCoOwnerItem> P1();

    List<SdkTrendingHashtag> R0();

    void R4(CharSequence charSequence);

    CharSequence S6();

    CharSequence U6();

    SdkMusicTrack V();

    SdkClipAudioTemplate a5();

    ClipVideoFileAdapter c2(Integer num, LinkedHashMap linkedHashMap, Map map, List list);

    @Override // com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile
    ClipVideoFileAdapter copy();

    List<SdkClipsDraftablePlaylist> d0();

    SdkClipsAdsFeaturesParams d3();

    void ea(CharSequence charSequence);

    Map<AdStatPixel.Type, List<AdStatPixel>> f6();

    boolean f7();

    SdkVideoFileModeration j6();

    boolean k0();

    Integer n7();

    boolean o9();

    SdkDuetMeta oa();

    SdkNewsMonotheme v1();

    ArrayList w6();

    SdkOriginalSoundStatus y8();

    ClipVideoFileAdapter z4(ArrayList arrayList);

    void z5(CharSequence charSequence);
}
