package io.intercom.android.sdk.blocks;

import io.intercom.android.sdk.blocks.lib.VideoProvider;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: VideoUrlUtil.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"getEmbedUrl", "", "provider", "Lio/intercom/android/sdk/blocks/lib/VideoProvider;", "joinedIds", "ID_SEPARATOR", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class VideoUrlUtilKt {
    private static final String ID_SEPARATOR = "|";

    /* compiled from: VideoUrlUtil.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoProvider.values().length];
            try {
                iArr[VideoProvider.YOUTUBE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoProvider.VIMEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VideoProvider.WISTIA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VideoProvider.LOOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[VideoProvider.VIDYARD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[VideoProvider.BRIGHTCOVE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[VideoProvider.JWPLAYER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[VideoProvider.MICROSOFTSTREAM.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[VideoProvider.SYNTHESIA.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[VideoProvider.GUIDDE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[VideoProvider.DESCRIPT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[VideoProvider.UNKNOWN.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String getEmbedUrl(VideoProvider provider, String joinedIds) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(joinedIds, "joinedIds");
        List split$default = StringsKt.split$default((CharSequence) joinedIds, new String[]{ID_SEPARATOR}, false, 0, 6, (Object) null);
        String str = (String) CollectionsKt.first(split$default);
        List drop = CollectionsKt.drop(split$default, 1);
        switch (WhenMappings.$EnumSwitchMapping$0[provider.ordinal()]) {
            case 1:
                return "https://www.youtube.com/embed/" + str + "?rel=0";
            case 2:
                if (drop.isEmpty()) {
                    return "https://player.vimeo.com/video/" + str;
                }
                return "https://player.vimeo.com/video/" + str + "?h=" + ((String) drop.get(0));
            case 3:
                return "https://fast.wistia.net/embed/iframe/" + str;
            case 4:
                return "https://www.loom.com/embed/" + str;
            case 5:
                return "https://play.vidyard.com/" + str;
            case 6:
                return "https://players.brightcove.net/" + str + "/default_default/index.html?videoId=" + ((String) drop.get(0));
            case 7:
                return "https://content.jwplatform.com/players/" + str + ".html";
            case 8:
                if (drop.isEmpty()) {
                    return "https://web.microsoftstream.com/embed/video/" + str;
                }
                return "https://" + str + ".sharepoint.com/:v:/" + ((String) drop.get(0));
            case 9:
                return "https://share.synthesia.io/embeds/videos/" + str;
            case 10:
                return "https://embed.app.guidde.com/playbooks/" + str;
            case 11:
                return "https://share.descript.com/embed/" + str;
            case 12:
                return "";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
