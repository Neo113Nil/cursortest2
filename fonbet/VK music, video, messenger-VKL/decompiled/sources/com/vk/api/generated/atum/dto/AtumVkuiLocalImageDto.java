package com.vk.api.generated.atum.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.zxing.pdf417.PDF417Common;
import com.ironsource.InterfaceC4319fe;
import com.ironsource.InterfaceC4413l1;
import com.ironsource.Z3;
import com.ironsource.mediationsdk.demandOnly.e;
import com.ironsource.mediationsdk.demandOnly.j;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import org.chromium.base.version_info.VersionConstants;
import org.chromium.net.telemetry.CronetStatsLog;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.commons.http.Http;
import ru.ok.android.webrtc.PeerVideoSettings;
import ru.ok.android.webrtc.mediarecord.VideoRecord;
import ru.ok.gl.tf.Tensorflow;
import ru.ok.proto.PublisherConfiguration;
import xsna.atv0;
import xsna.e370;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AtumVkuiLocalImageDto.kt */
/* loaded from: classes14.dex */
public final class AtumVkuiLocalImageDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AtumVkuiLocalImageDto[] $VALUES;
    public static final Parcelable.Creator<AtumVkuiLocalImageDto> CREATOR;
    private final String value;

    @pmi0("16_circle_outline_56")
    public static final AtumVkuiLocalImageDto TYPE_16_CIRCLE_OUTLINE_56 = new AtumVkuiLocalImageDto("TYPE_16_CIRCLE_OUTLINE_56", 0, "16_circle_outline_56");

    @pmi0("18_circle_outline_28")
    public static final AtumVkuiLocalImageDto TYPE_18_CIRCLE_OUTLINE_28 = new AtumVkuiLocalImageDto("TYPE_18_CIRCLE_OUTLINE_28", 1, "18_circle_outline_28");

    @pmi0("18_circle_outline_56")
    public static final AtumVkuiLocalImageDto TYPE_18_CIRCLE_OUTLINE_56 = new AtumVkuiLocalImageDto("TYPE_18_CIRCLE_OUTLINE_56", 2, "18_circle_outline_56");

    @pmi0("3_square_20")
    public static final AtumVkuiLocalImageDto TYPE_3_SQUARE_20 = new AtumVkuiLocalImageDto("TYPE_3_SQUARE_20", 3, "3_square_20");

    @pmi0("4_square_20")
    public static final AtumVkuiLocalImageDto TYPE_4_SQUARE_20 = new AtumVkuiLocalImageDto("TYPE_4_SQUARE_20", 4, "4_square_20");

    @pmi0("add_12")
    public static final AtumVkuiLocalImageDto ADD_12 = new AtumVkuiLocalImageDto("ADD_12", 5, "add_12");

    @pmi0("add_16")
    public static final AtumVkuiLocalImageDto ADD_16 = new AtumVkuiLocalImageDto("ADD_16", 6, "add_16");

    @pmi0("add_24")
    public static final AtumVkuiLocalImageDto ADD_24 = new AtumVkuiLocalImageDto("ADD_24", 7, "add_24");

    @pmi0("add_36")
    public static final AtumVkuiLocalImageDto ADD_36 = new AtumVkuiLocalImageDto("ADD_36", 8, "add_36");

    @pmi0("add_alt_20")
    public static final AtumVkuiLocalImageDto ADD_ALT_20 = new AtumVkuiLocalImageDto("ADD_ALT_20", 9, "add_alt_20");

    @pmi0("add_awards_outline_24")
    public static final AtumVkuiLocalImageDto ADD_AWARDS_OUTLINE_24 = new AtumVkuiLocalImageDto("ADD_AWARDS_OUTLINE_24", 10, "add_awards_outline_24");

    @pmi0("add_circle_20")
    public static final AtumVkuiLocalImageDto ADD_CIRCLE_20 = new AtumVkuiLocalImageDto("ADD_CIRCLE_20", 11, "add_circle_20");

    @pmi0("add_circle_24")
    public static final AtumVkuiLocalImageDto ADD_CIRCLE_24 = new AtumVkuiLocalImageDto("ADD_CIRCLE_24", 12, "add_circle_24");

    @pmi0("add_circle_fill_20")
    public static final AtumVkuiLocalImageDto ADD_CIRCLE_FILL_20 = new AtumVkuiLocalImageDto("ADD_CIRCLE_FILL_20", 13, "add_circle_fill_20");

    @pmi0("add_circle_fill_blue_16")
    public static final AtumVkuiLocalImageDto ADD_CIRCLE_FILL_BLUE_16 = new AtumVkuiLocalImageDto("ADD_CIRCLE_FILL_BLUE_16", 14, "add_circle_fill_blue_16");

    @pmi0("add_circle_fill_light_20")
    public static final AtumVkuiLocalImageDto ADD_CIRCLE_FILL_LIGHT_20 = new AtumVkuiLocalImageDto("ADD_CIRCLE_FILL_LIGHT_20", 15, "add_circle_fill_light_20");

    @pmi0("add_circle_fill_white_16")
    public static final AtumVkuiLocalImageDto ADD_CIRCLE_FILL_WHITE_16 = new AtumVkuiLocalImageDto("ADD_CIRCLE_FILL_WHITE_16", 16, "add_circle_fill_white_16");

    @pmi0("add_circle_outline_24")
    public static final AtumVkuiLocalImageDto ADD_CIRCLE_OUTLINE_24 = new AtumVkuiLocalImageDto("ADD_CIRCLE_OUTLINE_24", 17, "add_circle_outline_24");

    @pmi0("add_circle_outline_28")
    public static final AtumVkuiLocalImageDto ADD_CIRCLE_OUTLINE_28 = new AtumVkuiLocalImageDto("ADD_CIRCLE_OUTLINE_28", 18, "add_circle_outline_28");

    @pmi0("add_outline_24")
    public static final AtumVkuiLocalImageDto ADD_OUTLINE_24 = new AtumVkuiLocalImageDto("ADD_OUTLINE_24", 19, "add_outline_24");

    @pmi0("add_outline_28")
    public static final AtumVkuiLocalImageDto ADD_OUTLINE_28 = new AtumVkuiLocalImageDto("ADD_OUTLINE_28", 20, "add_outline_28");

    @pmi0("add_part_16")
    public static final AtumVkuiLocalImageDto ADD_PART_16 = new AtumVkuiLocalImageDto("ADD_PART_16", 21, "add_part_16");

    @pmi0("add_square_outline_20")
    public static final AtumVkuiLocalImageDto ADD_SQUARE_OUTLINE_20 = new AtumVkuiLocalImageDto("ADD_SQUARE_OUTLINE_20", 22, "add_square_outline_20");

    @pmi0("add_square_outline_24")
    public static final AtumVkuiLocalImageDto ADD_SQUARE_OUTLINE_24 = new AtumVkuiLocalImageDto("ADD_SQUARE_OUTLINE_24", 23, "add_square_outline_24");

    @pmi0("add_square_outline_28")
    public static final AtumVkuiLocalImageDto ADD_SQUARE_OUTLINE_28 = new AtumVkuiLocalImageDto("ADD_SQUARE_OUTLINE_28", 24, "add_square_outline_28");

    @pmi0("advertising_24")
    public static final AtumVkuiLocalImageDto ADVERTISING_24 = new AtumVkuiLocalImageDto("ADVERTISING_24", 25, "advertising_24");

    @pmi0("advertising_check_outline_24")
    public static final AtumVkuiLocalImageDto ADVERTISING_CHECK_OUTLINE_24 = new AtumVkuiLocalImageDto("ADVERTISING_CHECK_OUTLINE_24", 26, "advertising_check_outline_24");

    @pmi0("advertising_outline_24")
    public static final AtumVkuiLocalImageDto ADVERTISING_OUTLINE_24 = new AtumVkuiLocalImageDto("ADVERTISING_OUTLINE_24", 27, "advertising_outline_24");

    @pmi0("advertising_outline_28")
    public static final AtumVkuiLocalImageDto ADVERTISING_OUTLINE_28 = new AtumVkuiLocalImageDto("ADVERTISING_OUTLINE_28", 28, "advertising_outline_28");

    @pmi0("advertising_outline_background_opacity_48")
    public static final AtumVkuiLocalImageDto ADVERTISING_OUTLINE_BACKGROUND_OPACITY_48 = new AtumVkuiLocalImageDto("ADVERTISING_OUTLINE_BACKGROUND_OPACITY_48", 29, "advertising_outline_background_opacity_48");

    @pmi0("airplay_audio_outline_28")
    public static final AtumVkuiLocalImageDto AIRPLAY_AUDIO_OUTLINE_28 = new AtumVkuiLocalImageDto("AIRPLAY_AUDIO_OUTLINE_28", 30, "airplay_audio_outline_28");

    @pmi0("airplay_video_outline_28")
    public static final AtumVkuiLocalImageDto AIRPLAY_VIDEO_OUTLINE_28 = new AtumVkuiLocalImageDto("AIRPLAY_VIDEO_OUTLINE_28", 31, "airplay_video_outline_28");

    @pmi0("album_filled_12")
    public static final AtumVkuiLocalImageDto ALBUM_FILLED_12 = new AtumVkuiLocalImageDto("ALBUM_FILLED_12", 32, "album_filled_12");

    @pmi0("all_categories_outline_28")
    public static final AtumVkuiLocalImageDto ALL_CATEGORIES_OUTLINE_28 = new AtumVkuiLocalImageDto("ALL_CATEGORIES_OUTLINE_28", 33, "all_categories_outline_28");

    @pmi0("angry_persik_150")
    public static final AtumVkuiLocalImageDto ANGRY_PERSIK_150 = new AtumVkuiLocalImageDto("ANGRY_PERSIK_150", 34, "angry_persik_150");

    @pmi0("app_badge_outline_28")
    public static final AtumVkuiLocalImageDto APP_BADGE_OUTLINE_28 = new AtumVkuiLocalImageDto("APP_BADGE_OUTLINE_28", 35, "app_badge_outline_28");

    @pmi0("archive_outline_16")
    public static final AtumVkuiLocalImageDto ARCHIVE_OUTLINE_16 = new AtumVkuiLocalImageDto("ARCHIVE_OUTLINE_16", 36, "archive_outline_16");

    @pmi0("archive_outline_24")
    public static final AtumVkuiLocalImageDto ARCHIVE_OUTLINE_24 = new AtumVkuiLocalImageDto("ARCHIVE_OUTLINE_24", 37, "archive_outline_24");

    @pmi0("archive_outline_28")
    public static final AtumVkuiLocalImageDto ARCHIVE_OUTLINE_28 = new AtumVkuiLocalImageDto("ARCHIVE_OUTLINE_28", 38, "archive_outline_28");

    @pmi0("archive_outline_56")
    public static final AtumVkuiLocalImageDto ARCHIVE_OUTLINE_56 = new AtumVkuiLocalImageDto("ARCHIVE_OUTLINE_56", 39, "archive_outline_56");

    @pmi0("arrow_down_12")
    public static final AtumVkuiLocalImageDto ARROW_DOWN_12 = new AtumVkuiLocalImageDto("ARROW_DOWN_12", 40, "arrow_down_12");

    @pmi0("arrow_down_circle_12")
    public static final AtumVkuiLocalImageDto ARROW_DOWN_CIRCLE_12 = new AtumVkuiLocalImageDto("ARROW_DOWN_CIRCLE_12", 41, "arrow_down_circle_12");

    @pmi0("arrow_down_circle_16")
    public static final AtumVkuiLocalImageDto ARROW_DOWN_CIRCLE_16 = new AtumVkuiLocalImageDto("ARROW_DOWN_CIRCLE_16", 42, "arrow_down_circle_16");

    @pmi0("arrow_down_left_12")
    public static final AtumVkuiLocalImageDto ARROW_DOWN_LEFT_12 = new AtumVkuiLocalImageDto("ARROW_DOWN_LEFT_12", 43, "arrow_down_left_12");

    @pmi0("arrow_down_outline_20")
    public static final AtumVkuiLocalImageDto ARROW_DOWN_OUTLINE_20 = new AtumVkuiLocalImageDto("ARROW_DOWN_OUTLINE_20", 44, "arrow_down_outline_20");

    @pmi0("arrow_down_outline_24")
    public static final AtumVkuiLocalImageDto ARROW_DOWN_OUTLINE_24 = new AtumVkuiLocalImageDto("ARROW_DOWN_OUTLINE_24", 45, "arrow_down_outline_24");

    @pmi0("arrow_left_outline_16")
    public static final AtumVkuiLocalImageDto ARROW_LEFT_OUTLINE_16 = new AtumVkuiLocalImageDto("ARROW_LEFT_OUTLINE_16", 46, "arrow_left_outline_16");

    @pmi0("arrow_left_outline_28")
    public static final AtumVkuiLocalImageDto ARROW_LEFT_OUTLINE_28 = new AtumVkuiLocalImageDto("ARROW_LEFT_OUTLINE_28", 47, "arrow_left_outline_28");

    @pmi0("arrow_right_circle_outline_28")
    public static final AtumVkuiLocalImageDto ARROW_RIGHT_CIRCLE_OUTLINE_28 = new AtumVkuiLocalImageDto("ARROW_RIGHT_CIRCLE_OUTLINE_28", 48, "arrow_right_circle_outline_28");

    @pmi0("arrow_right_outline_16")
    public static final AtumVkuiLocalImageDto ARROW_RIGHT_OUTLINE_16 = new AtumVkuiLocalImageDto("ARROW_RIGHT_OUTLINE_16", 49, "arrow_right_outline_16");

    @pmi0("arrow_right_outline_20")
    public static final AtumVkuiLocalImageDto ARROW_RIGHT_OUTLINE_20 = new AtumVkuiLocalImageDto("ARROW_RIGHT_OUTLINE_20", 50, "arrow_right_outline_20");

    @pmi0("arrow_right_outline_24")
    public static final AtumVkuiLocalImageDto ARROW_RIGHT_OUTLINE_24 = new AtumVkuiLocalImageDto("ARROW_RIGHT_OUTLINE_24", 51, "arrow_right_outline_24");

    @pmi0("arrow_right_outline_28")
    public static final AtumVkuiLocalImageDto ARROW_RIGHT_OUTLINE_28 = new AtumVkuiLocalImageDto("ARROW_RIGHT_OUTLINE_28", 52, "arrow_right_outline_28");

    @pmi0("arrow_right_square_outline_24")
    public static final AtumVkuiLocalImageDto ARROW_RIGHT_SQUARE_OUTLINE_24 = new AtumVkuiLocalImageDto("ARROW_RIGHT_SQUARE_OUTLINE_24", 53, "arrow_right_square_outline_24");

    @pmi0("arrow_triangle_down_16")
    public static final AtumVkuiLocalImageDto ARROW_TRIANGLE_DOWN_16 = new AtumVkuiLocalImageDto("ARROW_TRIANGLE_DOWN_16", 54, "arrow_triangle_down_16");

    @pmi0("arrow_triangle_up_16")
    public static final AtumVkuiLocalImageDto ARROW_TRIANGLE_UP_16 = new AtumVkuiLocalImageDto("ARROW_TRIANGLE_UP_16", 55, "arrow_triangle_up_16");

    @pmi0("arrow_up_circle_outline_28")
    public static final AtumVkuiLocalImageDto ARROW_UP_CIRCLE_OUTLINE_28 = new AtumVkuiLocalImageDto("ARROW_UP_CIRCLE_OUTLINE_28", 56, "arrow_up_circle_outline_28");

    @pmi0("arrow_up_down_corners_outline_24")
    public static final AtumVkuiLocalImageDto ARROW_UP_DOWN_CORNERS_OUTLINE_24 = new AtumVkuiLocalImageDto("ARROW_UP_DOWN_CORNERS_OUTLINE_24", 57, "arrow_up_down_corners_outline_24");

    @pmi0("arrow_up_outline_20")
    public static final AtumVkuiLocalImageDto ARROW_UP_OUTLINE_20 = new AtumVkuiLocalImageDto("ARROW_UP_OUTLINE_20", 58, "arrow_up_outline_20");

    @pmi0("arrow_up_outline_24")
    public static final AtumVkuiLocalImageDto ARROW_UP_OUTLINE_24 = new AtumVkuiLocalImageDto("ARROW_UP_OUTLINE_24", 59, "arrow_up_outline_24");

    @pmi0("arrow_up_rectangle_16")
    public static final AtumVkuiLocalImageDto ARROW_UP_RECTANGLE_16 = new AtumVkuiLocalImageDto("ARROW_UP_RECTANGLE_16", 60, "arrow_up_rectangle_16");

    @pmi0("arrow_up_rectangle_28")
    public static final AtumVkuiLocalImageDto ARROW_UP_RECTANGLE_28 = new AtumVkuiLocalImageDto("ARROW_UP_RECTANGLE_28", 61, "arrow_up_rectangle_28");

    @pmi0("arrow_up_rectangle_outline_28")
    public static final AtumVkuiLocalImageDto ARROW_UP_RECTANGLE_OUTLINE_28 = new AtumVkuiLocalImageDto("ARROW_UP_RECTANGLE_OUTLINE_28", 62, "arrow_up_rectangle_outline_28");

    @pmi0("arrow_up_rectangle_slash_outline_28")
    public static final AtumVkuiLocalImageDto ARROW_UP_RECTANGLE_SLASH_OUTLINE_28 = new AtumVkuiLocalImageDto("ARROW_UP_RECTANGLE_SLASH_OUTLINE_28", 63, "arrow_up_rectangle_slash_outline_28");

    @pmi0("arrow_up_right_12")
    public static final AtumVkuiLocalImageDto ARROW_UP_RIGHT_12 = new AtumVkuiLocalImageDto("ARROW_UP_RIGHT_12", 64, "arrow_up_right_12");

    @pmi0("arrow_up_right_out_square_outline_12")
    public static final AtumVkuiLocalImageDto ARROW_UP_RIGHT_OUT_SQUARE_OUTLINE_12 = new AtumVkuiLocalImageDto("ARROW_UP_RIGHT_OUT_SQUARE_OUTLINE_12", 65, "arrow_up_right_out_square_outline_12");

    @pmi0("arrow_up_right_outline_24")
    public static final AtumVkuiLocalImageDto ARROW_UP_RIGHT_OUTLINE_24 = new AtumVkuiLocalImageDto("ARROW_UP_RIGHT_OUTLINE_24", 66, "arrow_up_right_outline_24");

    @pmi0("arrow_uturn_left_outline_20")
    public static final AtumVkuiLocalImageDto ARROW_UTURN_LEFT_OUTLINE_20 = new AtumVkuiLocalImageDto("ARROW_UTURN_LEFT_OUTLINE_20", 67, "arrow_uturn_left_outline_20");

    @pmi0("arrow_uturn_left_outline_28")
    public static final AtumVkuiLocalImageDto ARROW_UTURN_LEFT_OUTLINE_28 = new AtumVkuiLocalImageDto("ARROW_UTURN_LEFT_OUTLINE_28", 68, "arrow_uturn_left_outline_28");

    @pmi0("arrow_uturn_right_12")
    public static final AtumVkuiLocalImageDto ARROW_UTURN_RIGHT_12 = new AtumVkuiLocalImageDto("ARROW_UTURN_RIGHT_12", 69, "arrow_uturn_right_12");

    @pmi0("arrow_uturn_right_outline_28")
    public static final AtumVkuiLocalImageDto ARROW_UTURN_RIGHT_OUTLINE_28 = new AtumVkuiLocalImageDto("ARROW_UTURN_RIGHT_OUTLINE_28", 70, "arrow_uturn_right_outline_28");

    @pmi0("article_24")
    public static final AtumVkuiLocalImageDto ARTICLE_24 = new AtumVkuiLocalImageDto("ARTICLE_24", 71, "article_24");

    @pmi0("article_box_outline_20")
    public static final AtumVkuiLocalImageDto ARTICLE_BOX_OUTLINE_20 = new AtumVkuiLocalImageDto("ARTICLE_BOX_OUTLINE_20", 72, "article_box_outline_20");

    @pmi0("article_box_outline_24")
    public static final AtumVkuiLocalImageDto ARTICLE_BOX_OUTLINE_24 = new AtumVkuiLocalImageDto("ARTICLE_BOX_OUTLINE_24", 73, "article_box_outline_24");

    @pmi0("article_outline_20")
    public static final AtumVkuiLocalImageDto ARTICLE_OUTLINE_20 = new AtumVkuiLocalImageDto("ARTICLE_OUTLINE_20", 74, "article_outline_20");

    @pmi0("article_outline_24")
    public static final AtumVkuiLocalImageDto ARTICLE_OUTLINE_24 = new AtumVkuiLocalImageDto("ARTICLE_OUTLINE_24", 75, "article_outline_24");

    @pmi0("article_outline_28")
    public static final AtumVkuiLocalImageDto ARTICLE_OUTLINE_28 = new AtumVkuiLocalImageDto("ARTICLE_OUTLINE_28", 76, "article_outline_28");

    @pmi0("article_outline_56")
    public static final AtumVkuiLocalImageDto ARTICLE_OUTLINE_56 = new AtumVkuiLocalImageDto("ARTICLE_OUTLINE_56", 77, "article_outline_56");

    @pmi0("articles_12")
    public static final AtumVkuiLocalImageDto ARTICLES_12 = new AtumVkuiLocalImageDto("ARTICLES_12", 78, "articles_12");

    @pmi0("articles_20")
    public static final AtumVkuiLocalImageDto ARTICLES_20 = new AtumVkuiLocalImageDto("ARTICLES_20", 79, "articles_20");

    @pmi0("articles_outline_20")
    public static final AtumVkuiLocalImageDto ARTICLES_OUTLINE_20 = new AtumVkuiLocalImageDto("ARTICLES_OUTLINE_20", 80, "articles_outline_20");

    @pmi0("articles_outline_24")
    public static final AtumVkuiLocalImageDto ARTICLES_OUTLINE_24 = new AtumVkuiLocalImageDto("ARTICLES_OUTLINE_24", 81, "articles_outline_24");

    @pmi0("articles_outline_28")
    public static final AtumVkuiLocalImageDto ARTICLES_OUTLINE_28 = new AtumVkuiLocalImageDto("ARTICLES_OUTLINE_28", 82, "articles_outline_28");

    @pmi0("articles_outline_56")
    public static final AtumVkuiLocalImageDto ARTICLES_OUTLINE_56 = new AtumVkuiLocalImageDto("ARTICLES_OUTLINE_56", 83, "articles_outline_56");

    @pmi0("artist_24")
    public static final AtumVkuiLocalImageDto ARTIST_24 = new AtumVkuiLocalImageDto("ARTIST_24", 84, "artist_24");

    @pmi0("attach_16")
    public static final AtumVkuiLocalImageDto ATTACH_16 = new AtumVkuiLocalImageDto("ATTACH_16", 85, "attach_16");

    @pmi0("attach_20")
    public static final AtumVkuiLocalImageDto ATTACH_20 = new AtumVkuiLocalImageDto("ATTACH_20", 86, "attach_20");

    @pmi0("attach_24")
    public static final AtumVkuiLocalImageDto ATTACH_24 = new AtumVkuiLocalImageDto("ATTACH_24", 87, "attach_24");

    @pmi0("attach_outline_28")
    public static final AtumVkuiLocalImageDto ATTACH_OUTLINE_28 = new AtumVkuiLocalImageDto("ATTACH_OUTLINE_28", 88, "attach_outline_28");

    @pmi0("attach_outline_large_48")
    public static final AtumVkuiLocalImageDto ATTACH_OUTLINE_LARGE_48 = new AtumVkuiLocalImageDto("ATTACH_OUTLINE_LARGE_48", 89, "attach_outline_large_48");

    @pmi0("attach_substract_outline_large_48")
    public static final AtumVkuiLocalImageDto ATTACH_SUBSTRACT_OUTLINE_LARGE_48 = new AtumVkuiLocalImageDto("ATTACH_SUBSTRACT_OUTLINE_LARGE_48", 90, "attach_substract_outline_large_48");

    @pmi0("avatar_placeholder_anonim_150")
    public static final AtumVkuiLocalImageDto AVATAR_PLACEHOLDER_ANONIM_150 = new AtumVkuiLocalImageDto("AVATAR_PLACEHOLDER_ANONIM_150", 91, "avatar_placeholder_anonim_150");

    @pmi0("avatar_placeholder_bunny_150")
    public static final AtumVkuiLocalImageDto AVATAR_PLACEHOLDER_BUNNY_150 = new AtumVkuiLocalImageDto("AVATAR_PLACEHOLDER_BUNNY_150", 92, "avatar_placeholder_bunny_150");

    @pmi0("avatar_placeholder_sad_persik_alt_150")
    public static final AtumVkuiLocalImageDto AVATAR_PLACEHOLDER_SAD_PERSIK_ALT_150 = new AtumVkuiLocalImageDto("AVATAR_PLACEHOLDER_SAD_PERSIK_ALT_150", 93, "avatar_placeholder_sad_persik_alt_150");

    @pmi0("badge_vk_music_color_ru_36")
    public static final AtumVkuiLocalImageDto BADGE_VK_MUSIC_COLOR_RU_36 = new AtumVkuiLocalImageDto("BADGE_VK_MUSIC_COLOR_RU_36", 94, "badge_vk_music_color_ru_36");

    @pmi0("ball_outline_24")
    public static final AtumVkuiLocalImageDto BALL_OUTLINE_24 = new AtumVkuiLocalImageDto("BALL_OUTLINE_24", 95, "ball_outline_24");

    @pmi0("bank_outline_24")
    public static final AtumVkuiLocalImageDto BANK_OUTLINE_24 = new AtumVkuiLocalImageDto("BANK_OUTLINE_24", 96, "bank_outline_24");

    @pmi0("bank_outline_28")
    public static final AtumVkuiLocalImageDto BANK_OUTLINE_28 = new AtumVkuiLocalImageDto("BANK_OUTLINE_28", 97, "bank_outline_28");

    @pmi0("block_16")
    public static final AtumVkuiLocalImageDto BLOCK_16 = new AtumVkuiLocalImageDto("BLOCK_16", 98, "block_16");

    @pmi0("block_outline_20")
    public static final AtumVkuiLocalImageDto BLOCK_OUTLINE_20 = new AtumVkuiLocalImageDto("BLOCK_OUTLINE_20", 99, "block_outline_20");

    @pmi0("block_outline_24")
    public static final AtumVkuiLocalImageDto BLOCK_OUTLINE_24 = new AtumVkuiLocalImageDto("BLOCK_OUTLINE_24", 100, "block_outline_24");

    @pmi0("block_outline_48")
    public static final AtumVkuiLocalImageDto BLOCK_OUTLINE_48 = new AtumVkuiLocalImageDto("BLOCK_OUTLINE_48", 101, "block_outline_48");

    @pmi0("block_outline_56")
    public static final AtumVkuiLocalImageDto BLOCK_OUTLINE_56 = new AtumVkuiLocalImageDto("BLOCK_OUTLINE_56", 102, "block_outline_56");

    @pmi0("blogger_mark_10k_outline_20")
    public static final AtumVkuiLocalImageDto BLOGGER_MARK_10K_OUTLINE_20 = new AtumVkuiLocalImageDto("BLOGGER_MARK_10K_OUTLINE_20", 103, "blogger_mark_10k_outline_20");

    @pmi0("blogger_mark_10k_outline_56")
    public static final AtumVkuiLocalImageDto BLOGGER_MARK_10K_OUTLINE_56 = new AtumVkuiLocalImageDto("BLOGGER_MARK_10K_OUTLINE_56", 104, "blogger_mark_10k_outline_56");

    @pmi0("bluetooth_outline_28")
    public static final AtumVkuiLocalImageDto BLUETOOTH_OUTLINE_28 = new AtumVkuiLocalImageDto("BLUETOOTH_OUTLINE_28", 105, "bluetooth_outline_28");

    @pmi0("bomb_12")
    public static final AtumVkuiLocalImageDto BOMB_12 = new AtumVkuiLocalImageDto("BOMB_12", Sdk.SDKError.Reason.INVALID_REQUEST_BUILDER_ERROR_VALUE, "bomb_12");

    @pmi0("bomb_16")
    public static final AtumVkuiLocalImageDto BOMB_16 = new AtumVkuiLocalImageDto("BOMB_16", ApiInvocationException.ErrorCodes.PARAM_SESSION_KEY_CHANGED, "bomb_16");

    @pmi0("bomb_outline_20")
    public static final AtumVkuiLocalImageDto BOMB_OUTLINE_20 = new AtumVkuiLocalImageDto("BOMB_OUTLINE_20", 108, "bomb_outline_20");

    @pmi0("bomb_outline_28")
    public static final AtumVkuiLocalImageDto BOMB_OUTLINE_28 = new AtumVkuiLocalImageDto("BOMB_OUTLINE_28", 109, "bomb_outline_28");

    @pmi0("book_spread_16")
    public static final AtumVkuiLocalImageDto BOOK_SPREAD_16 = new AtumVkuiLocalImageDto("BOOK_SPREAD_16", 110, "book_spread_16");

    @pmi0("book_spread_outline_24")
    public static final AtumVkuiLocalImageDto BOOK_SPREAD_OUTLINE_24 = new AtumVkuiLocalImageDto("BOOK_SPREAD_OUTLINE_24", 111, "book_spread_outline_24");

    @pmi0("book_spread_outline_28")
    public static final AtumVkuiLocalImageDto BOOK_SPREAD_OUTLINE_28 = new AtumVkuiLocalImageDto("BOOK_SPREAD_OUTLINE_28", 112, "book_spread_outline_28");

    @pmi0("bookmark_16")
    public static final AtumVkuiLocalImageDto BOOKMARK_16 = new AtumVkuiLocalImageDto("BOOKMARK_16", 113, "bookmark_16");

    @pmi0("bookmark_24")
    public static final AtumVkuiLocalImageDto BOOKMARK_24 = new AtumVkuiLocalImageDto("BOOKMARK_24", Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE, "bookmark_24");

    @pmi0("bookmark_28")
    public static final AtumVkuiLocalImageDto BOOKMARK_28 = new AtumVkuiLocalImageDto("BOOKMARK_28", Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE, "bookmark_28");

    @pmi0("bookmark_add_outline_28")
    public static final AtumVkuiLocalImageDto BOOKMARK_ADD_OUTLINE_28 = new AtumVkuiLocalImageDto("BOOKMARK_ADD_OUTLINE_28", 116, "bookmark_add_outline_28");

    @pmi0("bookmark_check_28")
    public static final AtumVkuiLocalImageDto BOOKMARK_CHECK_28 = new AtumVkuiLocalImageDto("BOOKMARK_CHECK_28", Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, "bookmark_check_28");

    @pmi0("bookmark_check_outline_28")
    public static final AtumVkuiLocalImageDto BOOKMARK_CHECK_OUTLINE_28 = new AtumVkuiLocalImageDto("BOOKMARK_CHECK_OUTLINE_28", Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, "bookmark_check_outline_28");

    @pmi0("bookmark_outline_24")
    public static final AtumVkuiLocalImageDto BOOKMARK_OUTLINE_24 = new AtumVkuiLocalImageDto("BOOKMARK_OUTLINE_24", Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, "bookmark_outline_24");

    @pmi0("bookmark_outline_28")
    public static final AtumVkuiLocalImageDto BOOKMARK_OUTLINE_28 = new AtumVkuiLocalImageDto("BOOKMARK_OUTLINE_28", 120, "bookmark_outline_28");

    @pmi0("bookmark_outline_shadow_medium_48")
    public static final AtumVkuiLocalImageDto BOOKMARK_OUTLINE_SHADOW_MEDIUM_48 = new AtumVkuiLocalImageDto("BOOKMARK_OUTLINE_SHADOW_MEDIUM_48", Sdk.SDKError.Reason.TPAT_ERROR_VALUE, "bookmark_outline_shadow_medium_48");

    @pmi0("bookmark_shadow_medium_48")
    public static final AtumVkuiLocalImageDto BOOKMARK_SHADOW_MEDIUM_48 = new AtumVkuiLocalImageDto("BOOKMARK_SHADOW_MEDIUM_48", Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, "bookmark_shadow_medium_48");

    @pmi0("bookmark_slash_outline_24")
    public static final AtumVkuiLocalImageDto BOOKMARK_SLASH_OUTLINE_24 = new AtumVkuiLocalImageDto("BOOKMARK_SLASH_OUTLINE_24", 123, "bookmark_slash_outline_24");

    @pmi0("bookmark_slash_outline_28")
    public static final AtumVkuiLocalImageDto BOOKMARK_SLASH_OUTLINE_28 = new AtumVkuiLocalImageDto("BOOKMARK_SLASH_OUTLINE_28", Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, "bookmark_slash_outline_28");

    @pmi0("briefcase_outline_24")
    public static final AtumVkuiLocalImageDto BRIEFCASE_OUTLINE_24 = new AtumVkuiLocalImageDto("BRIEFCASE_OUTLINE_24", 125, "briefcase_outline_24");

    @pmi0("briefcase_outline_28")
    public static final AtumVkuiLocalImageDto BRIEFCASE_OUTLINE_28 = new AtumVkuiLocalImageDto("BRIEFCASE_OUTLINE_28", Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, "briefcase_outline_28");

    @pmi0("brush_outline_24")
    public static final AtumVkuiLocalImageDto BRUSH_OUTLINE_24 = new AtumVkuiLocalImageDto("BRUSH_OUTLINE_24", 127, "brush_outline_24");

    @pmi0("brush_outline_28")
    public static final AtumVkuiLocalImageDto BRUSH_OUTLINE_28 = new AtumVkuiLocalImageDto("BRUSH_OUTLINE_28", 128, "brush_outline_28");

    @pmi0("bug_outline_24")
    public static final AtumVkuiLocalImageDto BUG_OUTLINE_24 = new AtumVkuiLocalImageDto("BUG_OUTLINE_24", 129, "bug_outline_24");

    @pmi0("bug_outline_28")
    public static final AtumVkuiLocalImageDto BUG_OUTLINE_28 = new AtumVkuiLocalImageDto("BUG_OUTLINE_28", 130, "bug_outline_28");

    @pmi0("cake_12")
    public static final AtumVkuiLocalImageDto CAKE_12 = new AtumVkuiLocalImageDto("CAKE_12", Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, "cake_12");

    @pmi0("cake_circle_fill_purple_16")
    public static final AtumVkuiLocalImageDto CAKE_CIRCLE_FILL_PURPLE_16 = new AtumVkuiLocalImageDto("CAKE_CIRCLE_FILL_PURPLE_16", Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, "cake_circle_fill_purple_16");

    @pmi0("cake_circle_fill_purple_20")
    public static final AtumVkuiLocalImageDto CAKE_CIRCLE_FILL_PURPLE_20 = new AtumVkuiLocalImageDto("CAKE_CIRCLE_FILL_PURPLE_20", Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, "cake_circle_fill_purple_20");

    @pmi0("cake_circle_fill_purple_32")
    public static final AtumVkuiLocalImageDto CAKE_CIRCLE_FILL_PURPLE_32 = new AtumVkuiLocalImageDto("CAKE_CIRCLE_FILL_PURPLE_32", 134, "cake_circle_fill_purple_32");

    @pmi0("cake_outline_20")
    public static final AtumVkuiLocalImageDto CAKE_OUTLINE_20 = new AtumVkuiLocalImageDto("CAKE_OUTLINE_20", 135, "cake_outline_20");

    @pmi0("calendar_add_outline_24")
    public static final AtumVkuiLocalImageDto CALENDAR_ADD_OUTLINE_24 = new AtumVkuiLocalImageDto("CALENDAR_ADD_OUTLINE_24", Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE, "calendar_add_outline_24");

    @pmi0("calendar_add_outline_28")
    public static final AtumVkuiLocalImageDto CALENDAR_ADD_OUTLINE_28 = new AtumVkuiLocalImageDto("CALENDAR_ADD_OUTLINE_28", Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, "calendar_add_outline_28");

    @pmi0("calendar_outline_20")
    public static final AtumVkuiLocalImageDto CALENDAR_OUTLINE_20 = new AtumVkuiLocalImageDto("CALENDAR_OUTLINE_20", 138, "calendar_outline_20");

    @pmi0("calendar_outline_24")
    public static final AtumVkuiLocalImageDto CALENDAR_OUTLINE_24 = new AtumVkuiLocalImageDto("CALENDAR_OUTLINE_24", 139, "calendar_outline_24");

    @pmi0("calendar_outline_28")
    public static final AtumVkuiLocalImageDto CALENDAR_OUTLINE_28 = new AtumVkuiLocalImageDto("CALENDAR_OUTLINE_28", VersionConstants.PRODUCT_MAJOR_VERSION, "calendar_outline_28");

    @pmi0("calendar_outline_56")
    public static final AtumVkuiLocalImageDto CALENDAR_OUTLINE_56 = new AtumVkuiLocalImageDto("CALENDAR_OUTLINE_56", 141, "calendar_outline_56");

    @pmi0("cam_slash_16")
    public static final AtumVkuiLocalImageDto CAM_SLASH_16 = new AtumVkuiLocalImageDto("CAM_SLASH_16", 142, "cam_slash_16");

    @pmi0("camera_off_outline_56")
    public static final AtumVkuiLocalImageDto CAMERA_OFF_OUTLINE_56 = new AtumVkuiLocalImageDto("CAMERA_OFF_OUTLINE_56", 143, "camera_off_outline_56");

    @pmi0("camera_outline_24")
    public static final AtumVkuiLocalImageDto CAMERA_OUTLINE_24 = new AtumVkuiLocalImageDto("CAMERA_OUTLINE_24", 144, "camera_outline_24");

    @pmi0("camera_outline_28")
    public static final AtumVkuiLocalImageDto CAMERA_OUTLINE_28 = new AtumVkuiLocalImageDto("CAMERA_OUTLINE_28", 145, "camera_outline_28");

    @pmi0("camera_outline_36")
    public static final AtumVkuiLocalImageDto CAMERA_OUTLINE_36 = new AtumVkuiLocalImageDto("CAMERA_OUTLINE_36", 146, "camera_outline_36");

    @pmi0("camera_outline_48")
    public static final AtumVkuiLocalImageDto CAMERA_OUTLINE_48 = new AtumVkuiLocalImageDto("CAMERA_OUTLINE_48", 147, "camera_outline_48");

    @pmi0("camera_outline_56")
    public static final AtumVkuiLocalImageDto CAMERA_OUTLINE_56 = new AtumVkuiLocalImageDto("CAMERA_OUTLINE_56", 148, "camera_outline_56");

    @pmi0("cancel_16")
    public static final AtumVkuiLocalImageDto CANCEL_16 = new AtumVkuiLocalImageDto("CANCEL_16", 149, "cancel_16");

    @pmi0("cancel_20")
    public static final AtumVkuiLocalImageDto CANCEL_20 = new AtumVkuiLocalImageDto("CANCEL_20", 150, "cancel_20");

    @pmi0("cancel_24")
    public static final AtumVkuiLocalImageDto CANCEL_24 = new AtumVkuiLocalImageDto("CANCEL_24", 151, "cancel_24");

    @pmi0("cancel_28")
    public static final AtumVkuiLocalImageDto CANCEL_28 = new AtumVkuiLocalImageDto("CANCEL_28", 152, "cancel_28");

    @pmi0("cancel_circle_16")
    public static final AtumVkuiLocalImageDto CANCEL_CIRCLE_16 = new AtumVkuiLocalImageDto("CANCEL_CIRCLE_16", 153, "cancel_circle_16");

    @pmi0("cancel_circle_outline_28")
    public static final AtumVkuiLocalImageDto CANCEL_CIRCLE_OUTLINE_28 = new AtumVkuiLocalImageDto("CANCEL_CIRCLE_OUTLINE_28", 154, "cancel_circle_outline_28");

    @pmi0("cancel_circle_outline_56")
    public static final AtumVkuiLocalImageDto CANCEL_CIRCLE_OUTLINE_56 = new AtumVkuiLocalImageDto("CANCEL_CIRCLE_OUTLINE_56", 155, "cancel_circle_outline_56");

    @pmi0("cancel_outline_24")
    public static final AtumVkuiLocalImageDto CANCEL_OUTLINE_24 = new AtumVkuiLocalImageDto("CANCEL_OUTLINE_24", 156, "cancel_outline_24");

    @pmi0("cancel_outline_28")
    public static final AtumVkuiLocalImageDto CANCEL_OUTLINE_28 = new AtumVkuiLocalImageDto("CANCEL_OUTLINE_28", 157, "cancel_outline_28");

    @pmi0("cancel_outline_36")
    public static final AtumVkuiLocalImageDto CANCEL_OUTLINE_36 = new AtumVkuiLocalImageDto("CANCEL_OUTLINE_36", 158, "cancel_outline_36");

    @pmi0("car_outline_28")
    public static final AtumVkuiLocalImageDto CAR_OUTLINE_28 = new AtumVkuiLocalImageDto("CAR_OUTLINE_28", 159, "car_outline_28");

    @pmi0("cards_2_outline_28")
    public static final AtumVkuiLocalImageDto CARDS_2_OUTLINE_28 = new AtumVkuiLocalImageDto("CARDS_2_OUTLINE_28", 160, "cards_2_outline_28");

    @pmi0("carousel_outline_16")
    public static final AtumVkuiLocalImageDto CAROUSEL_OUTLINE_16 = new AtumVkuiLocalImageDto("CAROUSEL_OUTLINE_16", 161, "carousel_outline_16");

    @pmi0("carousel_outline_20")
    public static final AtumVkuiLocalImageDto CAROUSEL_OUTLINE_20 = new AtumVkuiLocalImageDto("CAROUSEL_OUTLINE_20", 162, "carousel_outline_20");

    @pmi0("chain_20")
    public static final AtumVkuiLocalImageDto CHAIN_20 = new AtumVkuiLocalImageDto("CHAIN_20", 163, "chain_20");

    @pmi0("chain_outline_16")
    public static final AtumVkuiLocalImageDto CHAIN_OUTLINE_16 = new AtumVkuiLocalImageDto("CHAIN_OUTLINE_16", 164, "chain_outline_16");

    @pmi0("chain_outline_24")
    public static final AtumVkuiLocalImageDto CHAIN_OUTLINE_24 = new AtumVkuiLocalImageDto("CHAIN_OUTLINE_24", 165, "chain_outline_24");

    @pmi0("chain_outline_28")
    public static final AtumVkuiLocalImageDto CHAIN_OUTLINE_28 = new AtumVkuiLocalImageDto("CHAIN_OUTLINE_28", 166, "chain_outline_28");

    @pmi0("chain_outline_56")
    public static final AtumVkuiLocalImageDto CHAIN_OUTLINE_56 = new AtumVkuiLocalImageDto("CHAIN_OUTLINE_56", 167, "chain_outline_56");

    @pmi0("check_12")
    public static final AtumVkuiLocalImageDto CHECK_12 = new AtumVkuiLocalImageDto("CHECK_12", 168, "check_12");

    @pmi0("check_20")
    public static final AtumVkuiLocalImageDto CHECK_20 = new AtumVkuiLocalImageDto("CHECK_20", 169, "check_20");

    @pmi0("check_alt_20")
    public static final AtumVkuiLocalImageDto CHECK_ALT_20 = new AtumVkuiLocalImageDto("CHECK_ALT_20", 170, "check_alt_20");

    @pmi0("check_box_indetermanate_20")
    public static final AtumVkuiLocalImageDto CHECK_BOX_INDETERMANATE_20 = new AtumVkuiLocalImageDto("CHECK_BOX_INDETERMANATE_20", 171, "check_box_indetermanate_20");

    @pmi0("check_box_indeterminate_24")
    public static final AtumVkuiLocalImageDto CHECK_BOX_INDETERMINATE_24 = new AtumVkuiLocalImageDto("CHECK_BOX_INDETERMINATE_24", 172, "check_box_indeterminate_24");

    @pmi0("check_box_off_20")
    public static final AtumVkuiLocalImageDto CHECK_BOX_OFF_20 = new AtumVkuiLocalImageDto("CHECK_BOX_OFF_20", 173, "check_box_off_20");

    @pmi0("check_box_off_24")
    public static final AtumVkuiLocalImageDto CHECK_BOX_OFF_24 = new AtumVkuiLocalImageDto("CHECK_BOX_OFF_24", 174, "check_box_off_24");

    @pmi0("check_box_on_20")
    public static final AtumVkuiLocalImageDto CHECK_BOX_ON_20 = new AtumVkuiLocalImageDto("CHECK_BOX_ON_20", 175, "check_box_on_20");

    @pmi0("check_box_on_24")
    public static final AtumVkuiLocalImageDto CHECK_BOX_ON_24 = new AtumVkuiLocalImageDto("CHECK_BOX_ON_24", 176, "check_box_on_24");

    @pmi0("check_circle_12")
    public static final AtumVkuiLocalImageDto CHECK_CIRCLE_12 = new AtumVkuiLocalImageDto("CHECK_CIRCLE_12", 177, "check_circle_12");

    @pmi0("check_circle_fill_28")
    public static final AtumVkuiLocalImageDto CHECK_CIRCLE_FILL_28 = new AtumVkuiLocalImageDto("CHECK_CIRCLE_FILL_28", 178, "check_circle_fill_28");

    @pmi0("check_circle_fill_dark_16")
    public static final AtumVkuiLocalImageDto CHECK_CIRCLE_FILL_DARK_16 = new AtumVkuiLocalImageDto("CHECK_CIRCLE_FILL_DARK_16", 179, "check_circle_fill_dark_16");

    @pmi0("check_circle_filled_blue_shadow_medium_48")
    public static final AtumVkuiLocalImageDto CHECK_CIRCLE_FILLED_BLUE_SHADOW_MEDIUM_48 = new AtumVkuiLocalImageDto("CHECK_CIRCLE_FILLED_BLUE_SHADOW_MEDIUM_48", 180, "check_circle_filled_blue_shadow_medium_48");

    @pmi0("check_circle_off_24")
    public static final AtumVkuiLocalImageDto CHECK_CIRCLE_OFF_24 = new AtumVkuiLocalImageDto("CHECK_CIRCLE_OFF_24", 181, "check_circle_off_24");

    @pmi0("check_circle_on_24")
    public static final AtumVkuiLocalImageDto CHECK_CIRCLE_ON_24 = new AtumVkuiLocalImageDto("CHECK_CIRCLE_ON_24", 182, "check_circle_on_24");

    @pmi0("check_circle_on_28")
    public static final AtumVkuiLocalImageDto CHECK_CIRCLE_ON_28 = new AtumVkuiLocalImageDto("CHECK_CIRCLE_ON_28", 183, "check_circle_on_28");

    @pmi0("check_circle_outline_24")
    public static final AtumVkuiLocalImageDto CHECK_CIRCLE_OUTLINE_24 = new AtumVkuiLocalImageDto("CHECK_CIRCLE_OUTLINE_24", 184, "check_circle_outline_24");

    @pmi0("check_circle_outline_28")
    public static final AtumVkuiLocalImageDto CHECK_CIRCLE_OUTLINE_28 = new AtumVkuiLocalImageDto("CHECK_CIRCLE_OUTLINE_28", 185, "check_circle_outline_28");

    @pmi0("check_circle_outline_56")
    public static final AtumVkuiLocalImageDto CHECK_CIRCLE_OUTLINE_56 = new AtumVkuiLocalImageDto("CHECK_CIRCLE_OUTLINE_56", 186, "check_circle_outline_56");

    @pmi0("check_circle_shadow_40")
    public static final AtumVkuiLocalImageDto CHECK_CIRCLE_SHADOW_40 = new AtumVkuiLocalImageDto("CHECK_CIRCLE_SHADOW_40", 187, "check_circle_shadow_40");

    @pmi0("check_circle_shadow_large_48")
    public static final AtumVkuiLocalImageDto CHECK_CIRCLE_SHADOW_LARGE_48 = new AtumVkuiLocalImageDto("CHECK_CIRCLE_SHADOW_LARGE_48", 188, "check_circle_shadow_large_48");

    @pmi0("check_outline_16")
    public static final AtumVkuiLocalImageDto CHECK_OUTLINE_16 = new AtumVkuiLocalImageDto("CHECK_OUTLINE_16", PsExtractor.PRIVATE_STREAM_1, "check_outline_16");

    @pmi0("check_part_16")
    public static final AtumVkuiLocalImageDto CHECK_PART_16 = new AtumVkuiLocalImageDto("CHECK_PART_16", 190, "check_part_16");

    @pmi0("check_shield_outline_20")
    public static final AtumVkuiLocalImageDto CHECK_SHIELD_OUTLINE_20 = new AtumVkuiLocalImageDto("CHECK_SHIELD_OUTLINE_20", 191, "check_shield_outline_20");

    @pmi0("check_shield_outline_28")
    public static final AtumVkuiLocalImageDto CHECK_SHIELD_OUTLINE_28 = new AtumVkuiLocalImageDto("CHECK_SHIELD_OUTLINE_28", PsExtractor.AUDIO_STREAM, "check_shield_outline_28");

    @pmi0("check_shield_outline_56")
    public static final AtumVkuiLocalImageDto CHECK_SHIELD_OUTLINE_56 = new AtumVkuiLocalImageDto("CHECK_SHIELD_OUTLINE_56", 193, "check_shield_outline_56");

    @pmi0("check_small_outline_20")
    public static final AtumVkuiLocalImageDto CHECK_SMALL_OUTLINE_20 = new AtumVkuiLocalImageDto("CHECK_SMALL_OUTLINE_20", 194, "check_small_outline_20");

    @pmi0("check_square_outline_24")
    public static final AtumVkuiLocalImageDto CHECK_SQUARE_OUTLINE_24 = new AtumVkuiLocalImageDto("CHECK_SQUARE_OUTLINE_24", 195, "check_square_outline_24");

    @pmi0("check_square_outline_28")
    public static final AtumVkuiLocalImageDto CHECK_SQUARE_OUTLINE_28 = new AtumVkuiLocalImageDto("CHECK_SQUARE_OUTLINE_28", 196, "check_square_outline_28");

    @pmi0("checks_outline_28")
    public static final AtumVkuiLocalImageDto CHECKS_OUTLINE_28 = new AtumVkuiLocalImageDto("CHECKS_OUTLINE_28", 197, "checks_outline_28");

    @pmi0("checks_small_outline_20")
    public static final AtumVkuiLocalImageDto CHECKS_SMALL_OUTLINE_20 = new AtumVkuiLocalImageDto("CHECKS_SMALL_OUTLINE_20", 198, "checks_small_outline_20");

    @pmi0("chef_hat_outline_28")
    public static final AtumVkuiLocalImageDto CHEF_HAT_OUTLINE_28 = new AtumVkuiLocalImageDto("CHEF_HAT_OUTLINE_28", 199, "chef_hat_outline_28");

    @pmi0("chevron_16")
    public static final AtumVkuiLocalImageDto CHEVRON_16 = new AtumVkuiLocalImageDto("CHEVRON_16", 200, "chevron_16");

    @pmi0("chevron_24")
    public static final AtumVkuiLocalImageDto CHEVRON_24 = new AtumVkuiLocalImageDto("CHEVRON_24", 201, "chevron_24");

    @pmi0("chevron_circle_outline_20")
    public static final AtumVkuiLocalImageDto CHEVRON_CIRCLE_OUTLINE_20 = new AtumVkuiLocalImageDto("CHEVRON_CIRCLE_OUTLINE_20", 202, "chevron_circle_outline_20");

    @pmi0("chevron_compact_right_24")
    public static final AtumVkuiLocalImageDto CHEVRON_COMPACT_RIGHT_24 = new AtumVkuiLocalImageDto("CHEVRON_COMPACT_RIGHT_24", 203, "chevron_compact_right_24");

    @pmi0("chevron_down_24")
    public static final AtumVkuiLocalImageDto CHEVRON_DOWN_24 = new AtumVkuiLocalImageDto("CHEVRON_DOWN_24", 204, "chevron_down_24");

    @pmi0("chevron_down_outline_28")
    public static final AtumVkuiLocalImageDto CHEVRON_DOWN_OUTLINE_28 = new AtumVkuiLocalImageDto("CHEVRON_DOWN_OUTLINE_28", 205, "chevron_down_outline_28");

    @pmi0("chevron_down_small_24")
    public static final AtumVkuiLocalImageDto CHEVRON_DOWN_SMALL_24 = new AtumVkuiLocalImageDto("CHEVRON_DOWN_SMALL_24", 206, "chevron_down_small_24");

    @pmi0("chevron_left_16")
    public static final AtumVkuiLocalImageDto CHEVRON_LEFT_16 = new AtumVkuiLocalImageDto("CHEVRON_LEFT_16", 207, "chevron_left_16");

    @pmi0("chevron_left_28")
    public static final AtumVkuiLocalImageDto CHEVRON_LEFT_28 = new AtumVkuiLocalImageDto("CHEVRON_LEFT_28", Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE, "chevron_left_28");

    @pmi0("chevron_left_2_20")
    public static final AtumVkuiLocalImageDto CHEVRON_LEFT_2_20 = new AtumVkuiLocalImageDto("CHEVRON_LEFT_2_20", Sdk.SDKError.Reason.INVALID_JSON_BID_PAYLOAD_VALUE, "chevron_left_2_20");

    @pmi0("chevron_left_outline_28")
    public static final AtumVkuiLocalImageDto CHEVRON_LEFT_OUTLINE_28 = new AtumVkuiLocalImageDto("CHEVRON_LEFT_OUTLINE_28", Sdk.SDKError.Reason.AD_NOT_LOADED_VALUE, "chevron_left_outline_28");

    @pmi0("chevron_left_outline_36")
    public static final AtumVkuiLocalImageDto CHEVRON_LEFT_OUTLINE_36 = new AtumVkuiLocalImageDto("CHEVRON_LEFT_OUTLINE_36", 211, "chevron_left_outline_36");

    @pmi0("chevron_left_small_outline_24")
    public static final AtumVkuiLocalImageDto CHEVRON_LEFT_SMALL_OUTLINE_24 = new AtumVkuiLocalImageDto("CHEVRON_LEFT_SMALL_OUTLINE_24", Sdk.SDKError.Reason.PLACEMENT_SLEEP_VALUE, "chevron_left_small_outline_24");

    @pmi0("chevron_outline_16")
    public static final AtumVkuiLocalImageDto CHEVRON_OUTLINE_16 = new AtumVkuiLocalImageDto("CHEVRON_OUTLINE_16", Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE, "chevron_outline_16");

    @pmi0("chevron_outline_shadow_large_48")
    public static final AtumVkuiLocalImageDto CHEVRON_OUTLINE_SHADOW_LARGE_48 = new AtumVkuiLocalImageDto("CHEVRON_OUTLINE_SHADOW_LARGE_48", Sdk.SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE, "chevron_outline_shadow_large_48");

    @pmi0("chevron_right_24")
    public static final AtumVkuiLocalImageDto CHEVRON_RIGHT_24 = new AtumVkuiLocalImageDto("CHEVRON_RIGHT_24", Sdk.SDKError.Reason.AD_RESPONSE_EMPTY_VALUE, "chevron_right_24");

    @pmi0("chevron_right_2_20")
    public static final AtumVkuiLocalImageDto CHEVRON_RIGHT_2_20 = new AtumVkuiLocalImageDto("CHEVRON_RIGHT_2_20", Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, "chevron_right_2_20");

    @pmi0("chevron_right_circle_24")
    public static final AtumVkuiLocalImageDto CHEVRON_RIGHT_CIRCLE_24 = new AtumVkuiLocalImageDto("CHEVRON_RIGHT_CIRCLE_24", Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE, "chevron_right_circle_24");

    @pmi0("chevron_right_circle_28")
    public static final AtumVkuiLocalImageDto CHEVRON_RIGHT_CIRCLE_28 = new AtumVkuiLocalImageDto("CHEVRON_RIGHT_CIRCLE_28", Sdk.SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE, "chevron_right_circle_28");

    @pmi0("chevron_right_circle_outline_28")
    public static final AtumVkuiLocalImageDto CHEVRON_RIGHT_CIRCLE_OUTLINE_28 = new AtumVkuiLocalImageDto("CHEVRON_RIGHT_CIRCLE_OUTLINE_28", Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, "chevron_right_circle_outline_28");

    @pmi0("chevron_right_outline_20")
    public static final AtumVkuiLocalImageDto CHEVRON_RIGHT_OUTLINE_20 = new AtumVkuiLocalImageDto("CHEVRON_RIGHT_OUTLINE_20", Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, "chevron_right_outline_20");

    @pmi0("chevron_right_outline_28")
    public static final AtumVkuiLocalImageDto CHEVRON_RIGHT_OUTLINE_28 = new AtumVkuiLocalImageDto("CHEVRON_RIGHT_OUTLINE_28", Sdk.SDKError.Reason.AD_LOAD_FAIL_RETRY_AFTER_VALUE, "chevron_right_outline_28");

    @pmi0("chevron_right_outline_36")
    public static final AtumVkuiLocalImageDto CHEVRON_RIGHT_OUTLINE_36 = new AtumVkuiLocalImageDto("CHEVRON_RIGHT_OUTLINE_36", Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE, "chevron_right_outline_36");

    @pmi0("chevron_right_outline_48")
    public static final AtumVkuiLocalImageDto CHEVRON_RIGHT_OUTLINE_48 = new AtumVkuiLocalImageDto("CHEVRON_RIGHT_OUTLINE_48", Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, "chevron_right_outline_48");

    @pmi0("chevron_right_small_outline_24")
    public static final AtumVkuiLocalImageDto CHEVRON_RIGHT_SMALL_OUTLINE_24 = new AtumVkuiLocalImageDto("CHEVRON_RIGHT_SMALL_OUTLINE_24", 224, "chevron_right_small_outline_24");

    @pmi0("chevron_up_20")
    public static final AtumVkuiLocalImageDto CHEVRON_UP_20 = new AtumVkuiLocalImageDto("CHEVRON_UP_20", Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE, "chevron_up_20");

    @pmi0("chevron_up_24")
    public static final AtumVkuiLocalImageDto CHEVRON_UP_24 = new AtumVkuiLocalImageDto("CHEVRON_UP_24", Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE, "chevron_up_24");

    @pmi0("chevron_up_outline_28")
    public static final AtumVkuiLocalImageDto CHEVRON_UP_OUTLINE_28 = new AtumVkuiLocalImageDto("CHEVRON_UP_OUTLINE_28", Sdk.SDKError.Reason.INVALID_CSB_DATA_VALUE, "chevron_up_outline_28");

    @pmi0("circle_outline_shadow_40")
    public static final AtumVkuiLocalImageDto CIRCLE_OUTLINE_SHADOW_40 = new AtumVkuiLocalImageDto("CIRCLE_OUTLINE_SHADOW_40", 228, "circle_outline_shadow_40");

    @pmi0("circle_outline_shadow_large_48")
    public static final AtumVkuiLocalImageDto CIRCLE_OUTLINE_SHADOW_LARGE_48 = new AtumVkuiLocalImageDto("CIRCLE_OUTLINE_SHADOW_LARGE_48", 229, "circle_outline_shadow_large_48");

    @pmi0("circle_outline_shadow_medium_48")
    public static final AtumVkuiLocalImageDto CIRCLE_OUTLINE_SHADOW_MEDIUM_48 = new AtumVkuiLocalImageDto("CIRCLE_OUTLINE_SHADOW_MEDIUM_48", 230, "circle_outline_shadow_medium_48");

    @pmi0("clear_16")
    public static final AtumVkuiLocalImageDto CLEAR_16 = new AtumVkuiLocalImageDto("CLEAR_16", 231, "clear_16");

    @pmi0("clear_20")
    public static final AtumVkuiLocalImageDto CLEAR_20 = new AtumVkuiLocalImageDto("CLEAR_20", 232, "clear_20");

    @pmi0("clear_data_outline_28")
    public static final AtumVkuiLocalImageDto CLEAR_DATA_OUTLINE_28 = new AtumVkuiLocalImageDto("CLEAR_DATA_OUTLINE_28", 233, "clear_data_outline_28");

    @pmi0("clip_outline_28")
    public static final AtumVkuiLocalImageDto CLIP_OUTLINE_28 = new AtumVkuiLocalImageDto("CLIP_OUTLINE_28", 234, "clip_outline_28");

    @pmi0("clock_12")
    public static final AtumVkuiLocalImageDto CLOCK_12 = new AtumVkuiLocalImageDto("CLOCK_12", 235, "clock_12");

    @pmi0("clock_circle_dashed_outline_24")
    public static final AtumVkuiLocalImageDto CLOCK_CIRCLE_DASHED_OUTLINE_24 = new AtumVkuiLocalImageDto("CLOCK_CIRCLE_DASHED_OUTLINE_24", 236, "clock_circle_dashed_outline_24");

    @pmi0("clock_outline_12")
    public static final AtumVkuiLocalImageDto CLOCK_OUTLINE_12 = new AtumVkuiLocalImageDto("CLOCK_OUTLINE_12", 237, "clock_outline_12");

    @pmi0("clock_outline_16")
    public static final AtumVkuiLocalImageDto CLOCK_OUTLINE_16 = new AtumVkuiLocalImageDto("CLOCK_OUTLINE_16", 238, "clock_outline_16");

    @pmi0("clock_outline_20")
    public static final AtumVkuiLocalImageDto CLOCK_OUTLINE_20 = new AtumVkuiLocalImageDto("CLOCK_OUTLINE_20", 239, "clock_outline_20");

    @pmi0("clock_outline_24")
    public static final AtumVkuiLocalImageDto CLOCK_OUTLINE_24 = new AtumVkuiLocalImageDto("CLOCK_OUTLINE_24", PsExtractor.VIDEO_STREAM_MASK, "clock_outline_24");

    @pmi0("clock_outline_28")
    public static final AtumVkuiLocalImageDto CLOCK_OUTLINE_28 = new AtumVkuiLocalImageDto("CLOCK_OUTLINE_28", 241, "clock_outline_28");

    @pmi0("clock_shadow_48")
    public static final AtumVkuiLocalImageDto CLOCK_SHADOW_48 = new AtumVkuiLocalImageDto("CLOCK_SHADOW_48", 242, "clock_shadow_48");

    @pmi0("cloud_outline_28")
    public static final AtumVkuiLocalImageDto CLOUD_OUTLINE_28 = new AtumVkuiLocalImageDto("CLOUD_OUTLINE_28", 243, "cloud_outline_28");

    @pmi0("cloud_shadow_24")
    public static final AtumVkuiLocalImageDto CLOUD_SHADOW_24 = new AtumVkuiLocalImageDto("CLOUD_SHADOW_24", 244, "cloud_shadow_24");

    @pmi0("color_picker_outline_20")
    public static final AtumVkuiLocalImageDto COLOR_PICKER_OUTLINE_20 = new AtumVkuiLocalImageDto("COLOR_PICKER_OUTLINE_20", 245, "color_picker_outline_20");

    @pmi0("comment_outline_16")
    public static final AtumVkuiLocalImageDto COMMENT_OUTLINE_16 = new AtumVkuiLocalImageDto("COMMENT_OUTLINE_16", 246, "comment_outline_16");

    @pmi0("comment_outline_20")
    public static final AtumVkuiLocalImageDto COMMENT_OUTLINE_20 = new AtumVkuiLocalImageDto("COMMENT_OUTLINE_20", 247, "comment_outline_20");

    @pmi0("comment_outline_24")
    public static final AtumVkuiLocalImageDto COMMENT_OUTLINE_24 = new AtumVkuiLocalImageDto("COMMENT_OUTLINE_24", 248, "comment_outline_24");

    @pmi0("comment_outline_28")
    public static final AtumVkuiLocalImageDto COMMENT_OUTLINE_28 = new AtumVkuiLocalImageDto("COMMENT_OUTLINE_28", 249, "comment_outline_28");

    @pmi0("comment_outline_56")
    public static final AtumVkuiLocalImageDto COMMENT_OUTLINE_56 = new AtumVkuiLocalImageDto("COMMENT_OUTLINE_56", 250, "comment_outline_56");

    @pmi0("comment_slash_outline_24")
    public static final AtumVkuiLocalImageDto COMMENT_SLASH_OUTLINE_24 = new AtumVkuiLocalImageDto("COMMENT_SLASH_OUTLINE_24", 251, "comment_slash_outline_24");

    @pmi0("community_name_20")
    public static final AtumVkuiLocalImageDto COMMUNITY_NAME_20 = new AtumVkuiLocalImageDto("COMMUNITY_NAME_20", 252, "community_name_20");

    @pmi0("compass_48")
    public static final AtumVkuiLocalImageDto COMPASS_48 = new AtumVkuiLocalImageDto("COMPASS_48", 253, "compass_48");

    @pmi0("compass_circle_fill_purple_28")
    public static final AtumVkuiLocalImageDto COMPASS_CIRCLE_FILL_PURPLE_28 = new AtumVkuiLocalImageDto("COMPASS_CIRCLE_FILL_PURPLE_28", 254, "compass_circle_fill_purple_28");

    @pmi0("compass_circle_fill_purple_72")
    public static final AtumVkuiLocalImageDto COMPASS_CIRCLE_FILL_PURPLE_72 = new AtumVkuiLocalImageDto("COMPASS_CIRCLE_FILL_PURPLE_72", 255, "compass_circle_fill_purple_72");

    @pmi0("compass_outline_28")
    public static final AtumVkuiLocalImageDto COMPASS_OUTLINE_28 = new AtumVkuiLocalImageDto("COMPASS_OUTLINE_28", 256, "compass_outline_28");

    @pmi0("connection_16")
    public static final AtumVkuiLocalImageDto CONNECTION_16 = new AtumVkuiLocalImageDto("CONNECTION_16", 257, "connection_16");

    @pmi0("copy_outline_20")
    public static final AtumVkuiLocalImageDto COPY_OUTLINE_20 = new AtumVkuiLocalImageDto("COPY_OUTLINE_20", 258, "copy_outline_20");

    @pmi0("copy_outline_24")
    public static final AtumVkuiLocalImageDto COPY_OUTLINE_24 = new AtumVkuiLocalImageDto("COPY_OUTLINE_24", 259, "copy_outline_24");

    @pmi0("copy_outline_28")
    public static final AtumVkuiLocalImageDto COPY_OUTLINE_28 = new AtumVkuiLocalImageDto("COPY_OUTLINE_28", 260, "copy_outline_28");

    @pmi0("crop_24")
    public static final AtumVkuiLocalImageDto CROP_24 = new AtumVkuiLocalImageDto("CROP_24", 261, "crop_24");

    @pmi0("crop_outline_16")
    public static final AtumVkuiLocalImageDto CROP_OUTLINE_16 = new AtumVkuiLocalImageDto("CROP_OUTLINE_16", 262, "crop_outline_16");

    @pmi0("cross_circle_40")
    public static final AtumVkuiLocalImageDto CROSS_CIRCLE_40 = new AtumVkuiLocalImageDto("CROSS_CIRCLE_40", 263, "cross_circle_40");

    @pmi0("crown_16")
    public static final AtumVkuiLocalImageDto CROWN_16 = new AtumVkuiLocalImageDto("CROWN_16", 264, "crown_16");

    @pmi0("crown_outline_28")
    public static final AtumVkuiLocalImageDto CROWN_OUTLINE_28 = new AtumVkuiLocalImageDto("CROWN_OUTLINE_28", 265, "crown_outline_28");

    @pmi0("crown_verified_16")
    public static final AtumVkuiLocalImageDto CROWN_VERIFIED_16 = new AtumVkuiLocalImageDto("CROWN_VERIFIED_16", 266, "crown_verified_16");

    @pmi0("crown_verified_20")
    public static final AtumVkuiLocalImageDto CROWN_VERIFIED_20 = new AtumVkuiLocalImageDto("CROWN_VERIFIED_20", 267, "crown_verified_20");

    @pmi0("crown_verified_56")
    public static final AtumVkuiLocalImageDto CROWN_VERIFIED_56 = new AtumVkuiLocalImageDto("CROWN_VERIFIED_56", 268, "crown_verified_56");

    @pmi0("cube_box_outline_16")
    public static final AtumVkuiLocalImageDto CUBE_BOX_OUTLINE_16 = new AtumVkuiLocalImageDto("CUBE_BOX_OUTLINE_16", 269, "cube_box_outline_16");

    @pmi0("cube_box_outline_20")
    public static final AtumVkuiLocalImageDto CUBE_BOX_OUTLINE_20 = new AtumVkuiLocalImageDto("CUBE_BOX_OUTLINE_20", atv0.b, "cube_box_outline_20");

    @pmi0("cube_box_outline_28")
    public static final AtumVkuiLocalImageDto CUBE_BOX_OUTLINE_28 = new AtumVkuiLocalImageDto("CUBE_BOX_OUTLINE_28", 271, "cube_box_outline_28");

    @pmi0("cup_outline_24")
    public static final AtumVkuiLocalImageDto CUP_OUTLINE_24 = new AtumVkuiLocalImageDto("CUP_OUTLINE_24", 272, "cup_outline_24");

    @pmi0("cup_outline_28")
    public static final AtumVkuiLocalImageDto CUP_OUTLINE_28 = new AtumVkuiLocalImageDto("CUP_OUTLINE_28", 273, "cup_outline_28");

    @pmi0("cutout_square_part_20")
    public static final AtumVkuiLocalImageDto CUTOUT_SQUARE_PART_20 = new AtumVkuiLocalImageDto("CUTOUT_SQUARE_PART_20", 274, "cutout_square_part_20");

    @pmi0("delete_clock_outline_28")
    public static final AtumVkuiLocalImageDto DELETE_CLOCK_OUTLINE_28 = new AtumVkuiLocalImageDto("DELETE_CLOCK_OUTLINE_28", 275, "delete_clock_outline_28");

    @pmi0("delete_outline_20")
    public static final AtumVkuiLocalImageDto DELETE_OUTLINE_20 = new AtumVkuiLocalImageDto("DELETE_OUTLINE_20", 276, "delete_outline_20");

    @pmi0("delete_outline_24")
    public static final AtumVkuiLocalImageDto DELETE_OUTLINE_24 = new AtumVkuiLocalImageDto("DELETE_OUTLINE_24", 277, "delete_outline_24");

    @pmi0("delete_outline_28")
    public static final AtumVkuiLocalImageDto DELETE_OUTLINE_28 = new AtumVkuiLocalImageDto("DELETE_OUTLINE_28", 278, "delete_outline_28");

    @pmi0("delete_outline_56")
    public static final AtumVkuiLocalImageDto DELETE_OUTLINE_56 = new AtumVkuiLocalImageDto("DELETE_OUTLINE_56", 279, "delete_outline_56");

    @pmi0("delete_saved_outline_28")
    public static final AtumVkuiLocalImageDto DELETE_SAVED_OUTLINE_28 = new AtumVkuiLocalImageDto("DELETE_SAVED_OUTLINE_28", 280, "delete_saved_outline_28");

    @pmi0("diamond_outline_28")
    public static final AtumVkuiLocalImageDto DIAMOND_OUTLINE_28 = new AtumVkuiLocalImageDto("DIAMOND_OUTLINE_28", 281, "diamond_outline_28");

    @pmi0("discount_outline_28")
    public static final AtumVkuiLocalImageDto DISCOUNT_OUTLINE_28 = new AtumVkuiLocalImageDto("DISCOUNT_OUTLINE_28", 282, "discount_outline_28");

    @pmi0("discussions_24")
    public static final AtumVkuiLocalImageDto DISCUSSIONS_24 = new AtumVkuiLocalImageDto("DISCUSSIONS_24", 283, "discussions_24");

    @pmi0("dismiss_24")
    public static final AtumVkuiLocalImageDto DISMISS_24 = new AtumVkuiLocalImageDto("DISMISS_24", 284, "dismiss_24");

    @pmi0("dismiss_28")
    public static final AtumVkuiLocalImageDto DISMISS_28 = new AtumVkuiLocalImageDto("DISMISS_28", 285, "dismiss_28");

    @pmi0("dismiss_dark_24")
    public static final AtumVkuiLocalImageDto DISMISS_DARK_24 = new AtumVkuiLocalImageDto("DISMISS_DARK_24", 286, "dismiss_dark_24");

    @pmi0("dismiss_overlay_24")
    public static final AtumVkuiLocalImageDto DISMISS_OVERLAY_24 = new AtumVkuiLocalImageDto("DISMISS_OVERLAY_24", MBSupportMuteAdType.INTERSTITIAL_VIDEO, "dismiss_overlay_24");

    @pmi0("dismiss_substract_24")
    public static final AtumVkuiLocalImageDto DISMISS_SUBSTRACT_24 = new AtumVkuiLocalImageDto("DISMISS_SUBSTRACT_24", 288, "dismiss_substract_24");

    @pmi0("do_not_disturb_24")
    public static final AtumVkuiLocalImageDto DO_NOT_DISTURB_24 = new AtumVkuiLocalImageDto("DO_NOT_DISTURB_24", 289, "do_not_disturb_24");

    @pmi0("do_not_disturb_outline_56")
    public static final AtumVkuiLocalImageDto DO_NOT_DISTURB_OUTLINE_56 = new AtumVkuiLocalImageDto("DO_NOT_DISTURB_OUTLINE_56", 290, "do_not_disturb_outline_56");

    @pmi0("document_24")
    public static final AtumVkuiLocalImageDto DOCUMENT_24 = new AtumVkuiLocalImageDto("DOCUMENT_24", 291, "document_24");

    @pmi0("document_outline_20")
    public static final AtumVkuiLocalImageDto DOCUMENT_OUTLINE_20 = new AtumVkuiLocalImageDto("DOCUMENT_OUTLINE_20", 292, "document_outline_20");

    @pmi0("document_outline_24")
    public static final AtumVkuiLocalImageDto DOCUMENT_OUTLINE_24 = new AtumVkuiLocalImageDto("DOCUMENT_OUTLINE_24", 293, "document_outline_24");

    @pmi0("document_outline_28")
    public static final AtumVkuiLocalImageDto DOCUMENT_OUTLINE_28 = new AtumVkuiLocalImageDto("DOCUMENT_OUTLINE_28", 294, "document_outline_28");

    @pmi0("document_text_outline_28")
    public static final AtumVkuiLocalImageDto DOCUMENT_TEXT_OUTLINE_28 = new AtumVkuiLocalImageDto("DOCUMENT_TEXT_OUTLINE_28", 295, "document_text_outline_28");

    @pmi0("donate_outline_16")
    public static final AtumVkuiLocalImageDto DONATE_OUTLINE_16 = new AtumVkuiLocalImageDto("DONATE_OUTLINE_16", 296, "donate_outline_16");

    @pmi0("donate_outline_20")
    public static final AtumVkuiLocalImageDto DONATE_OUTLINE_20 = new AtumVkuiLocalImageDto("DONATE_OUTLINE_20", 297, "donate_outline_20");

    @pmi0("donate_outline_24")
    public static final AtumVkuiLocalImageDto DONATE_OUTLINE_24 = new AtumVkuiLocalImageDto("DONATE_OUTLINE_24", 298, "donate_outline_24");

    @pmi0("donate_outline_48")
    public static final AtumVkuiLocalImageDto DONATE_OUTLINE_48 = new AtumVkuiLocalImageDto("DONATE_OUTLINE_48", 299, "donate_outline_48");

    @pmi0("donate_outline_56")
    public static final AtumVkuiLocalImageDto DONATE_OUTLINE_56 = new AtumVkuiLocalImageDto("DONATE_OUTLINE_56", 300, "donate_outline_56");

    @pmi0("done_16")
    public static final AtumVkuiLocalImageDto DONE_16 = new AtumVkuiLocalImageDto("DONE_16", 301, "done_16");

    @pmi0("done_24")
    public static final AtumVkuiLocalImageDto DONE_24 = new AtumVkuiLocalImageDto("DONE_24", 302, "done_24");

    @pmi0("done_36")
    public static final AtumVkuiLocalImageDto DONE_36 = new AtumVkuiLocalImageDto("DONE_36", Http.StatusCode.SEE_OTHER, "done_36");

    @pmi0("done_outline_24")
    public static final AtumVkuiLocalImageDto DONE_OUTLINE_24 = new AtumVkuiLocalImageDto("DONE_OUTLINE_24", Sdk.SDKError.Reason.AD_EXPIRED_VALUE, "done_outline_24");

    @pmi0("done_outline_28")
    public static final AtumVkuiLocalImageDto DONE_OUTLINE_28 = new AtumVkuiLocalImageDto("DONE_OUTLINE_28", Sdk.SDKError.Reason.MRAID_BRIDGE_ERROR_VALUE, "done_outline_28");

    @pmi0("done_shadow_medium_48")
    public static final AtumVkuiLocalImageDto DONE_SHADOW_MEDIUM_48 = new AtumVkuiLocalImageDto("DONE_SHADOW_MEDIUM_48", 306, "done_shadow_medium_48");

    @pmi0("donut_circle_fill_yellow_20")
    public static final AtumVkuiLocalImageDto DONUT_CIRCLE_FILL_YELLOW_20 = new AtumVkuiLocalImageDto("DONUT_CIRCLE_FILL_YELLOW_20", 307, "donut_circle_fill_yellow_20");

    @pmi0("donut_circle_fill_yellow_32")
    public static final AtumVkuiLocalImageDto DONUT_CIRCLE_FILL_YELLOW_32 = new AtumVkuiLocalImageDto("DONUT_CIRCLE_FILL_YELLOW_32", Sdk.SDKError.Reason.AD_WIN_NOTIFICATION_ERROR_VALUE, "donut_circle_fill_yellow_32");

    @pmi0("door_arrow_left_outline_28")
    public static final AtumVkuiLocalImageDto DOOR_ARROW_LEFT_OUTLINE_28 = new AtumVkuiLocalImageDto("DOOR_ARROW_LEFT_OUTLINE_28", Sdk.SDKError.Reason.ASSET_FAILED_TO_DELETE_VALUE, "door_arrow_left_outline_28");

    @pmi0("door_arrow_right_outline_24")
    public static final AtumVkuiLocalImageDto DOOR_ARROW_RIGHT_OUTLINE_24 = new AtumVkuiLocalImageDto("DOOR_ARROW_RIGHT_OUTLINE_24", Sdk.SDKError.Reason.AD_HTML_FAILED_TO_LOAD_VALUE, "door_arrow_right_outline_24");

    @pmi0("door_arrow_right_outline_28")
    public static final AtumVkuiLocalImageDto DOOR_ARROW_RIGHT_OUTLINE_28 = new AtumVkuiLocalImageDto("DOOR_ARROW_RIGHT_OUTLINE_28", Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY_VALUE, "door_arrow_right_outline_28");

    @pmi0("door_arrow_right_outline_56")
    public static final AtumVkuiLocalImageDto DOOR_ARROW_RIGHT_OUTLINE_56 = new AtumVkuiLocalImageDto("DOOR_ARROW_RIGHT_OUTLINE_56", Sdk.SDKError.Reason.DEEPLINK_OPEN_FAILED_VALUE, "door_arrow_right_outline_56");

    @pmi0("door_enter_arrow_right_outline_16")
    public static final AtumVkuiLocalImageDto DOOR_ENTER_ARROW_RIGHT_OUTLINE_16 = new AtumVkuiLocalImageDto("DOOR_ENTER_ARROW_RIGHT_OUTLINE_16", Sdk.SDKError.Reason.EVALUATE_JAVASCRIPT_FAILED_VALUE, "door_enter_arrow_right_outline_16");

    @pmi0("download_24")
    public static final AtumVkuiLocalImageDto DOWNLOAD_24 = new AtumVkuiLocalImageDto("DOWNLOAD_24", Sdk.SDKError.Reason.LINK_COMMAND_OPEN_FAILED_VALUE, "download_24");

    @pmi0("download_cancel_outline_28")
    public static final AtumVkuiLocalImageDto DOWNLOAD_CANCEL_OUTLINE_28 = new AtumVkuiLocalImageDto("DOWNLOAD_CANCEL_OUTLINE_28", Sdk.SDKError.Reason.JSON_PARAMS_ENCODE_ERROR_VALUE, "download_cancel_outline_28");

    @pmi0("download_check_outline_24")
    public static final AtumVkuiLocalImageDto DOWNLOAD_CHECK_OUTLINE_24 = new AtumVkuiLocalImageDto("DOWNLOAD_CHECK_OUTLINE_24", Sdk.SDKError.Reason.GENERATE_JSON_DATA_ERROR_VALUE, "download_check_outline_24");

    @pmi0("download_check_outline_28")
    public static final AtumVkuiLocalImageDto DOWNLOAD_CHECK_OUTLINE_28 = new AtumVkuiLocalImageDto("DOWNLOAD_CHECK_OUTLINE_28", Sdk.SDKError.Reason.AD_CLOSED_TEMPLATE_ERROR_VALUE, "download_check_outline_28");

    @pmi0("download_circle_40")
    public static final AtumVkuiLocalImageDto DOWNLOAD_CIRCLE_40 = new AtumVkuiLocalImageDto("DOWNLOAD_CIRCLE_40", Sdk.SDKError.Reason.AD_CLOSED_MISSING_HEARTBEAT_VALUE, "download_circle_40");

    @pmi0("download_cross_badge_outline_24")
    public static final AtumVkuiLocalImageDto DOWNLOAD_CROSS_BADGE_OUTLINE_24 = new AtumVkuiLocalImageDto("DOWNLOAD_CROSS_BADGE_OUTLINE_24", Sdk.SDKError.Reason.SILENT_MODE_MONITOR_ERROR_VALUE, "download_cross_badge_outline_24");

    @pmi0("download_dashed_outline_16")
    public static final AtumVkuiLocalImageDto DOWNLOAD_DASHED_OUTLINE_16 = new AtumVkuiLocalImageDto("DOWNLOAD_DASHED_OUTLINE_16", 320, "download_dashed_outline_16");

    @pmi0("download_dashed_outline_24")
    public static final AtumVkuiLocalImageDto DOWNLOAD_DASHED_OUTLINE_24 = new AtumVkuiLocalImageDto("DOWNLOAD_DASHED_OUTLINE_24", Sdk.SDKError.Reason.BLACK_SCREEN_DETECTION_ERROR_VALUE, "download_dashed_outline_24");

    @pmi0("download_error_outline_24")
    public static final AtumVkuiLocalImageDto DOWNLOAD_ERROR_OUTLINE_24 = new AtumVkuiLocalImageDto("DOWNLOAD_ERROR_OUTLINE_24", Sdk.SDKError.Reason.MRAID_UNRECOGNIZED_COMMAND_VALUE, "download_error_outline_24");

    @pmi0("download_outline_16")
    public static final AtumVkuiLocalImageDto DOWNLOAD_OUTLINE_16 = new AtumVkuiLocalImageDto("DOWNLOAD_OUTLINE_16", 323, "download_outline_16");

    @pmi0("download_outline_24")
    public static final AtumVkuiLocalImageDto DOWNLOAD_OUTLINE_24 = new AtumVkuiLocalImageDto("DOWNLOAD_OUTLINE_24", 324, "download_outline_24");

    @pmi0("download_outline_28")
    public static final AtumVkuiLocalImageDto DOWNLOAD_OUTLINE_28 = new AtumVkuiLocalImageDto("DOWNLOAD_OUTLINE_28", 325, "download_outline_28");

    @pmi0("download_outline_56")
    public static final AtumVkuiLocalImageDto DOWNLOAD_OUTLINE_56 = new AtumVkuiLocalImageDto("DOWNLOAD_OUTLINE_56", 326, "download_outline_56");

    @pmi0("drill_outline_28")
    public static final AtumVkuiLocalImageDto DRILL_OUTLINE_28 = new AtumVkuiLocalImageDto("DRILL_OUTLINE_28", 327, "drill_outline_28");

    @pmi0("dropdown_12")
    public static final AtumVkuiLocalImageDto DROPDOWN_12 = new AtumVkuiLocalImageDto("DROPDOWN_12", 328, "dropdown_12");

    @pmi0("dropdown_16")
    public static final AtumVkuiLocalImageDto DROPDOWN_16 = new AtumVkuiLocalImageDto("DROPDOWN_16", 329, "dropdown_16");

    @pmi0("dropdown_20")
    public static final AtumVkuiLocalImageDto DROPDOWN_20 = new AtumVkuiLocalImageDto("DROPDOWN_20", 330, "dropdown_20");

    @pmi0("dropdown_flipped_16")
    public static final AtumVkuiLocalImageDto DROPDOWN_FLIPPED_16 = new AtumVkuiLocalImageDto("DROPDOWN_FLIPPED_16", 331, "dropdown_flipped_16");

    @pmi0("dropdown_outline_16")
    public static final AtumVkuiLocalImageDto DROPDOWN_OUTLINE_16 = new AtumVkuiLocalImageDto("DROPDOWN_OUTLINE_16", 332, "dropdown_outline_16");

    @pmi0("edit_outline_28")
    public static final AtumVkuiLocalImageDto EDIT_OUTLINE_28 = new AtumVkuiLocalImageDto("EDIT_OUTLINE_28", 333, "edit_outline_28");

    @pmi0("education_12")
    public static final AtumVkuiLocalImageDto EDUCATION_12 = new AtumVkuiLocalImageDto("EDUCATION_12", 334, "education_12");

    @pmi0("education_16")
    public static final AtumVkuiLocalImageDto EDUCATION_16 = new AtumVkuiLocalImageDto("EDUCATION_16", 335, "education_16");

    @pmi0("education_outline_16")
    public static final AtumVkuiLocalImageDto EDUCATION_OUTLINE_16 = new AtumVkuiLocalImageDto("EDUCATION_OUTLINE_16", 336, "education_outline_16");

    @pmi0("education_outline_20")
    public static final AtumVkuiLocalImageDto EDUCATION_OUTLINE_20 = new AtumVkuiLocalImageDto("EDUCATION_OUTLINE_20", 337, "education_outline_20");

    @pmi0("education_outline_24")
    public static final AtumVkuiLocalImageDto EDUCATION_OUTLINE_24 = new AtumVkuiLocalImageDto("EDUCATION_OUTLINE_24", 338, "education_outline_24");

    @pmi0("education_outline_28")
    public static final AtumVkuiLocalImageDto EDUCATION_OUTLINE_28 = new AtumVkuiLocalImageDto("EDUCATION_OUTLINE_28", 339, "education_outline_28");

    @pmi0("error_circle_16")
    public static final AtumVkuiLocalImageDto ERROR_CIRCLE_16 = new AtumVkuiLocalImageDto("ERROR_CIRCLE_16", 340, "error_circle_16");

    @pmi0("error_circle_24")
    public static final AtumVkuiLocalImageDto ERROR_CIRCLE_24 = new AtumVkuiLocalImageDto("ERROR_CIRCLE_24", 341, "error_circle_24");

    @pmi0("error_circle_fill_12")
    public static final AtumVkuiLocalImageDto ERROR_CIRCLE_FILL_12 = new AtumVkuiLocalImageDto("ERROR_CIRCLE_FILL_12", 342, "error_circle_fill_12");

    @pmi0("error_circle_fill_16")
    public static final AtumVkuiLocalImageDto ERROR_CIRCLE_FILL_16 = new AtumVkuiLocalImageDto("ERROR_CIRCLE_FILL_16", 343, "error_circle_fill_16");

    @pmi0("error_circle_fill_gray_12")
    public static final AtumVkuiLocalImageDto ERROR_CIRCLE_FILL_GRAY_12 = new AtumVkuiLocalImageDto("ERROR_CIRCLE_FILL_GRAY_12", 344, "error_circle_fill_gray_12");

    @pmi0("error_circle_fill_overlay_12")
    public static final AtumVkuiLocalImageDto ERROR_CIRCLE_FILL_OVERLAY_12 = new AtumVkuiLocalImageDto("ERROR_CIRCLE_FILL_OVERLAY_12", 345, "error_circle_fill_overlay_12");

    @pmi0("error_circle_fill_overlay_16")
    public static final AtumVkuiLocalImageDto ERROR_CIRCLE_FILL_OVERLAY_16 = new AtumVkuiLocalImageDto("ERROR_CIRCLE_FILL_OVERLAY_16", 346, "error_circle_fill_overlay_16");

    @pmi0("error_circle_fill_red_20")
    public static final AtumVkuiLocalImageDto ERROR_CIRCLE_FILL_RED_20 = new AtumVkuiLocalImageDto("ERROR_CIRCLE_FILL_RED_20", 347, "error_circle_fill_red_20");

    @pmi0("error_circle_fill_red_24")
    public static final AtumVkuiLocalImageDto ERROR_CIRCLE_FILL_RED_24 = new AtumVkuiLocalImageDto("ERROR_CIRCLE_FILL_RED_24", 348, "error_circle_fill_red_24");

    @pmi0("error_circle_outline_16")
    public static final AtumVkuiLocalImageDto ERROR_CIRCLE_OUTLINE_16 = new AtumVkuiLocalImageDto("ERROR_CIRCLE_OUTLINE_16", 349, "error_circle_outline_16");

    @pmi0("error_circle_outline_20")
    public static final AtumVkuiLocalImageDto ERROR_CIRCLE_OUTLINE_20 = new AtumVkuiLocalImageDto("ERROR_CIRCLE_OUTLINE_20", 350, "error_circle_outline_20");

    @pmi0("error_circle_outline_28")
    public static final AtumVkuiLocalImageDto ERROR_CIRCLE_OUTLINE_28 = new AtumVkuiLocalImageDto("ERROR_CIRCLE_OUTLINE_28", 351, "error_circle_outline_28");

    @pmi0("error_outline_28")
    public static final AtumVkuiLocalImageDto ERROR_OUTLINE_28 = new AtumVkuiLocalImageDto("ERROR_OUTLINE_28", 352, "error_outline_28");

    @pmi0("error_outline_56")
    public static final AtumVkuiLocalImageDto ERROR_OUTLINE_56 = new AtumVkuiLocalImageDto("ERROR_OUTLINE_56", 353, "error_outline_56");

    @pmi0("error_triangle_outline_56")
    public static final AtumVkuiLocalImageDto ERROR_TRIANGLE_OUTLINE_56 = new AtumVkuiLocalImageDto("ERROR_TRIANGLE_OUTLINE_56", 354, "error_triangle_outline_56");

    @pmi0("explicit_16")
    public static final AtumVkuiLocalImageDto EXPLICIT_16 = new AtumVkuiLocalImageDto("EXPLICIT_16", 355, "explicit_16");

    @pmi0("explicit_24")
    public static final AtumVkuiLocalImageDto EXPLICIT_24 = new AtumVkuiLocalImageDto("EXPLICIT_24", 356, "explicit_24");

    @pmi0("external_link_outline_24")
    public static final AtumVkuiLocalImageDto EXTERNAL_LINK_OUTLINE_24 = new AtumVkuiLocalImageDto("EXTERNAL_LINK_OUTLINE_24", 357, "external_link_outline_24");

    @pmi0("face_arrows_oultline_large_48")
    public static final AtumVkuiLocalImageDto FACE_ARROWS_OULTLINE_LARGE_48 = new AtumVkuiLocalImageDto("FACE_ARROWS_OULTLINE_LARGE_48", 358, "face_arrows_oultline_large_48");

    @pmi0("favorite_12")
    public static final AtumVkuiLocalImageDto FAVORITE_12 = new AtumVkuiLocalImageDto("FAVORITE_12", 359, "favorite_12");

    @pmi0("favorite_16")
    public static final AtumVkuiLocalImageDto FAVORITE_16 = new AtumVkuiLocalImageDto("FAVORITE_16", 360, "favorite_16");

    @pmi0("favorite_20")
    public static final AtumVkuiLocalImageDto FAVORITE_20 = new AtumVkuiLocalImageDto("FAVORITE_20", 361, "favorite_20");

    @pmi0("favorite_28")
    public static final AtumVkuiLocalImageDto FAVORITE_28 = new AtumVkuiLocalImageDto("FAVORITE_28", 362, "favorite_28");

    @pmi0("favorite_36")
    public static final AtumVkuiLocalImageDto FAVORITE_36 = new AtumVkuiLocalImageDto("FAVORITE_36", 363, "favorite_36");

    @pmi0("favorite_circle_fill_green_20")
    public static final AtumVkuiLocalImageDto FAVORITE_CIRCLE_FILL_GREEN_20 = new AtumVkuiLocalImageDto("FAVORITE_CIRCLE_FILL_GREEN_20", 364, "favorite_circle_fill_green_20");

    @pmi0("favorite_circle_fill_green_32")
    public static final AtumVkuiLocalImageDto FAVORITE_CIRCLE_FILL_GREEN_32 = new AtumVkuiLocalImageDto("FAVORITE_CIRCLE_FILL_GREEN_32", 365, "favorite_circle_fill_green_32");

    @pmi0("favorite_outline_16")
    public static final AtumVkuiLocalImageDto FAVORITE_OUTLINE_16 = new AtumVkuiLocalImageDto("FAVORITE_OUTLINE_16", 366, "favorite_outline_16");

    @pmi0("favorite_outline_20")
    public static final AtumVkuiLocalImageDto FAVORITE_OUTLINE_20 = new AtumVkuiLocalImageDto("FAVORITE_OUTLINE_20", 367, "favorite_outline_20");

    @pmi0("favorite_outline_28")
    public static final AtumVkuiLocalImageDto FAVORITE_OUTLINE_28 = new AtumVkuiLocalImageDto("FAVORITE_OUTLINE_28", 368, "favorite_outline_28");

    @pmi0("favorite_outline_36")
    public static final AtumVkuiLocalImageDto FAVORITE_OUTLINE_36 = new AtumVkuiLocalImageDto("FAVORITE_OUTLINE_36", 369, "favorite_outline_36");

    @pmi0("favorite_outline_56")
    public static final AtumVkuiLocalImageDto FAVORITE_OUTLINE_56 = new AtumVkuiLocalImageDto("FAVORITE_OUTLINE_56", 370, "favorite_outline_56");

    @pmi0("film_strip_add_outline_28")
    public static final AtumVkuiLocalImageDto FILM_STRIP_ADD_OUTLINE_28 = new AtumVkuiLocalImageDto("FILM_STRIP_ADD_OUTLINE_28", 371, "film_strip_add_outline_28");

    @pmi0("filter_24")
    public static final AtumVkuiLocalImageDto FILTER_24 = new AtumVkuiLocalImageDto("FILTER_24", 372, "filter_24");

    @pmi0("fire_12")
    public static final AtumVkuiLocalImageDto FIRE_12 = new AtumVkuiLocalImageDto("FIRE_12", 373, "fire_12");

    @pmi0("fire_16")
    public static final AtumVkuiLocalImageDto FIRE_16 = new AtumVkuiLocalImageDto("FIRE_16", 374, "fire_16");

    @pmi0("fire_small_16")
    public static final AtumVkuiLocalImageDto FIRE_SMALL_16 = new AtumVkuiLocalImageDto("FIRE_SMALL_16", 375, "fire_small_16");

    @pmi0("fire_verified_16")
    public static final AtumVkuiLocalImageDto FIRE_VERIFIED_16 = new AtumVkuiLocalImageDto("FIRE_VERIFIED_16", 376, "fire_verified_16");

    @pmi0("flag_12")
    public static final AtumVkuiLocalImageDto FLAG_12 = new AtumVkuiLocalImageDto("FLAG_12", 377, "flag_12");

    @pmi0("flag_16")
    public static final AtumVkuiLocalImageDto FLAG_16 = new AtumVkuiLocalImageDto("FLAG_16", 378, "flag_16");

    @pmi0("flapper_20")
    public static final AtumVkuiLocalImageDto FLAPPER_20 = new AtumVkuiLocalImageDto("FLAPPER_20", 379, "flapper_20");

    @pmi0("flash_16")
    public static final AtumVkuiLocalImageDto FLASH_16 = new AtumVkuiLocalImageDto("FLASH_16", 380, "flash_16");

    @pmi0("flash_circle_12")
    public static final AtumVkuiLocalImageDto FLASH_CIRCLE_12 = new AtumVkuiLocalImageDto("FLASH_CIRCLE_12", 381, "flash_circle_12");

    @pmi0("flash_outline_24")
    public static final AtumVkuiLocalImageDto FLASH_OUTLINE_24 = new AtumVkuiLocalImageDto("FLASH_OUTLINE_24", 382, "flash_outline_24");

    @pmi0("folder_outline_24")
    public static final AtumVkuiLocalImageDto FOLDER_OUTLINE_24 = new AtumVkuiLocalImageDto("FOLDER_OUTLINE_24", 383, "folder_outline_24");

    @pmi0("folder_outline_28")
    public static final AtumVkuiLocalImageDto FOLDER_OUTLINE_28 = new AtumVkuiLocalImageDto("FOLDER_OUTLINE_28", 384, "folder_outline_28");

    @pmi0("folder_plus_badge_outline_56")
    public static final AtumVkuiLocalImageDto FOLDER_PLUS_BADGE_OUTLINE_56 = new AtumVkuiLocalImageDto("FOLDER_PLUS_BADGE_OUTLINE_56", 385, "folder_plus_badge_outline_56");

    @pmi0("followers_outline_20")
    public static final AtumVkuiLocalImageDto FOLLOWERS_OUTLINE_20 = new AtumVkuiLocalImageDto("FOLLOWERS_OUTLINE_20", 386, "followers_outline_20");

    @pmi0("fullscreen_exit_24")
    public static final AtumVkuiLocalImageDto FULLSCREEN_EXIT_24 = new AtumVkuiLocalImageDto("FULLSCREEN_EXIT_24", 387, "fullscreen_exit_24");

    @pmi0("fullscreen_outline_20")
    public static final AtumVkuiLocalImageDto FULLSCREEN_OUTLINE_20 = new AtumVkuiLocalImageDto("FULLSCREEN_OUTLINE_20", 388, "fullscreen_outline_20");

    @pmi0("fullscreen_outline_28")
    public static final AtumVkuiLocalImageDto FULLSCREEN_OUTLINE_28 = new AtumVkuiLocalImageDto("FULLSCREEN_OUTLINE_28", 389, "fullscreen_outline_28");

    @pmi0("gallery_24")
    public static final AtumVkuiLocalImageDto GALLERY_24 = new AtumVkuiLocalImageDto("GALLERY_24", 390, "gallery_24");

    @pmi0("gallery_outline_56")
    public static final AtumVkuiLocalImageDto GALLERY_OUTLINE_56 = new AtumVkuiLocalImageDto("GALLERY_OUTLINE_56", 391, "gallery_outline_56");

    @pmi0("game_16")
    public static final AtumVkuiLocalImageDto GAME_16 = new AtumVkuiLocalImageDto("GAME_16", 392, "game_16");

    @pmi0("game_outline_24")
    public static final AtumVkuiLocalImageDto GAME_OUTLINE_24 = new AtumVkuiLocalImageDto("GAME_OUTLINE_24", 393, "game_outline_24");

    @pmi0("game_outline_28")
    public static final AtumVkuiLocalImageDto GAME_OUTLINE_28 = new AtumVkuiLocalImageDto("GAME_OUTLINE_28", 394, "game_outline_28");

    @pmi0("game_outline_56")
    public static final AtumVkuiLocalImageDto GAME_OUTLINE_56 = new AtumVkuiLocalImageDto("GAME_OUTLINE_56", 395, "game_outline_56");

    @pmi0("gear_outline_20")
    public static final AtumVkuiLocalImageDto GEAR_OUTLINE_20 = new AtumVkuiLocalImageDto("GEAR_OUTLINE_20", 396, "gear_outline_20");

    @pmi0("gear_outline_24")
    public static final AtumVkuiLocalImageDto GEAR_OUTLINE_24 = new AtumVkuiLocalImageDto("GEAR_OUTLINE_24", 397, "gear_outline_24");

    @pmi0("ghost_16")
    public static final AtumVkuiLocalImageDto GHOST_16 = new AtumVkuiLocalImageDto("GHOST_16", 398, "ghost_16");

    @pmi0("ghost_20")
    public static final AtumVkuiLocalImageDto GHOST_20 = new AtumVkuiLocalImageDto("GHOST_20", 399, "ghost_20");

    @pmi0("ghost_outline_28")
    public static final AtumVkuiLocalImageDto GHOST_OUTLINE_28 = new AtumVkuiLocalImageDto("GHOST_OUTLINE_28", 400, "ghost_outline_28");

    @pmi0("ghost_outline_56")
    public static final AtumVkuiLocalImageDto GHOST_OUTLINE_56 = new AtumVkuiLocalImageDto("GHOST_OUTLINE_56", 401, "ghost_outline_56");

    @pmi0("gif_outline_24")
    public static final AtumVkuiLocalImageDto GIF_OUTLINE_24 = new AtumVkuiLocalImageDto("GIF_OUTLINE_24", 402, "gif_outline_24");

    @pmi0("gift_16")
    public static final AtumVkuiLocalImageDto GIFT_16 = new AtumVkuiLocalImageDto("GIFT_16", 403, "gift_16");

    @pmi0("gift_24")
    public static final AtumVkuiLocalImageDto GIFT_24 = new AtumVkuiLocalImageDto("GIFT_24", 404, "gift_24");

    @pmi0("gift_circe_filled_36")
    public static final AtumVkuiLocalImageDto GIFT_CIRCE_FILLED_36 = new AtumVkuiLocalImageDto("GIFT_CIRCE_FILLED_36", InterfaceC4413l1.a.b.e, "gift_circe_filled_36");

    @pmi0("gift_outline_20")
    public static final AtumVkuiLocalImageDto GIFT_OUTLINE_20 = new AtumVkuiLocalImageDto("GIFT_OUTLINE_20", InterfaceC4413l1.a.b.f, "gift_outline_20");

    @pmi0("gift_outline_24")
    public static final AtumVkuiLocalImageDto GIFT_OUTLINE_24 = new AtumVkuiLocalImageDto("GIFT_OUTLINE_24", InterfaceC4413l1.a.b.g, "gift_outline_24");

    @pmi0("gift_outline_28")
    public static final AtumVkuiLocalImageDto GIFT_OUTLINE_28 = new AtumVkuiLocalImageDto("GIFT_OUTLINE_28", InterfaceC4413l1.a.b.h, "gift_outline_28");

    @pmi0("gift_outline_56")
    public static final AtumVkuiLocalImageDto GIFT_OUTLINE_56 = new AtumVkuiLocalImageDto("GIFT_OUTLINE_56", InterfaceC4413l1.a.b.i, "gift_outline_56");

    @pmi0("globe_circle_fill_blue_28")
    public static final AtumVkuiLocalImageDto GLOBE_CIRCLE_FILL_BLUE_28 = new AtumVkuiLocalImageDto("GLOBE_CIRCLE_FILL_BLUE_28", 410, "globe_circle_fill_blue_28");

    @pmi0("globe_cross_outline_20")
    public static final AtumVkuiLocalImageDto GLOBE_CROSS_OUTLINE_20 = new AtumVkuiLocalImageDto("GLOBE_CROSS_OUTLINE_20", InterfaceC4413l1.a.b.k, "globe_cross_outline_20");

    @pmi0("globe_cross_outline_28")
    public static final AtumVkuiLocalImageDto GLOBE_CROSS_OUTLINE_28 = new AtumVkuiLocalImageDto("GLOBE_CROSS_OUTLINE_28", 412, "globe_cross_outline_28");

    @pmi0("globe_cross_outline_56")
    public static final AtumVkuiLocalImageDto GLOBE_CROSS_OUTLINE_56 = new AtumVkuiLocalImageDto("GLOBE_CROSS_OUTLINE_56", 413, "globe_cross_outline_56");

    @pmi0("globe_outline_16")
    public static final AtumVkuiLocalImageDto GLOBE_OUTLINE_16 = new AtumVkuiLocalImageDto("GLOBE_OUTLINE_16", 414, "globe_outline_16");

    @pmi0("globe_outline_20")
    public static final AtumVkuiLocalImageDto GLOBE_OUTLINE_20 = new AtumVkuiLocalImageDto("GLOBE_OUTLINE_20", 415, "globe_outline_20");

    @pmi0("globe_outline_24")
    public static final AtumVkuiLocalImageDto GLOBE_OUTLINE_24 = new AtumVkuiLocalImageDto("GLOBE_OUTLINE_24", Http.StatusCode.RANGE_NOT_SATISFIABLE, "globe_outline_24");

    @pmi0("globe_outline_28")
    public static final AtumVkuiLocalImageDto GLOBE_OUTLINE_28 = new AtumVkuiLocalImageDto("GLOBE_OUTLINE_28", 417, "globe_outline_28");

    @pmi0("goods_collection_56")
    public static final AtumVkuiLocalImageDto GOODS_COLLECTION_56 = new AtumVkuiLocalImageDto("GOODS_COLLECTION_56", 418, "goods_collection_56");

    @pmi0("gradient_28")
    public static final AtumVkuiLocalImageDto GRADIENT_28 = new AtumVkuiLocalImageDto("GRADIENT_28", 419, "gradient_28");

    @pmi0("graph_outline_20")
    public static final AtumVkuiLocalImageDto GRAPH_OUTLINE_20 = new AtumVkuiLocalImageDto("GRAPH_OUTLINE_20", 420, "graph_outline_20");

    @pmi0("graph_outline_24")
    public static final AtumVkuiLocalImageDto GRAPH_OUTLINE_24 = new AtumVkuiLocalImageDto("GRAPH_OUTLINE_24", 421, "graph_outline_24");

    @pmi0("grid_layout_outline_28")
    public static final AtumVkuiLocalImageDto GRID_LAYOUT_OUTLINE_28 = new AtumVkuiLocalImageDto("GRID_LAYOUT_OUTLINE_28", 422, "grid_layout_outline_28");

    @pmi0("grid_outline_16")
    public static final AtumVkuiLocalImageDto GRID_OUTLINE_16 = new AtumVkuiLocalImageDto("GRID_OUTLINE_16", 423, "grid_outline_16");

    @pmi0("hand_12")
    public static final AtumVkuiLocalImageDto HAND_12 = new AtumVkuiLocalImageDto("HAND_12", 424, "hand_12");

    @pmi0("hand_16")
    public static final AtumVkuiLocalImageDto HAND_16 = new AtumVkuiLocalImageDto("HAND_16", 425, "hand_16");

    @pmi0("hand_2_slash_outline_28")
    public static final AtumVkuiLocalImageDto HAND_2_SLASH_OUTLINE_28 = new AtumVkuiLocalImageDto("HAND_2_SLASH_OUTLINE_28", 426, "hand_2_slash_outline_28");

    @pmi0("hand_heart_filled_28")
    public static final AtumVkuiLocalImageDto HAND_HEART_FILLED_28 = new AtumVkuiLocalImageDto("HAND_HEART_FILLED_28", 427, "hand_heart_filled_28");

    @pmi0("hand_heart_outline_28")
    public static final AtumVkuiLocalImageDto HAND_HEART_OUTLINE_28 = new AtumVkuiLocalImageDto("HAND_HEART_OUTLINE_28", 428, "hand_heart_outline_28");

    @pmi0("hand_outline_24")
    public static final AtumVkuiLocalImageDto HAND_OUTLINE_24 = new AtumVkuiLocalImageDto("HAND_OUTLINE_24", CommonGatewayClient.CODE_TOO_MANY_REQUESTS, "hand_outline_24");

    @pmi0("hand_point_up_12")
    public static final AtumVkuiLocalImageDto HAND_POINT_UP_12 = new AtumVkuiLocalImageDto("HAND_POINT_UP_12", 430, "hand_point_up_12");

    @pmi0("hand_point_up_left_outline_56")
    public static final AtumVkuiLocalImageDto HAND_POINT_UP_LEFT_OUTLINE_56 = new AtumVkuiLocalImageDto("HAND_POINT_UP_LEFT_OUTLINE_56", 431, "hand_point_up_left_outline_56");

    @pmi0("hand_point_up_outline_24")
    public static final AtumVkuiLocalImageDto HAND_POINT_UP_OUTLINE_24 = new AtumVkuiLocalImageDto("HAND_POINT_UP_OUTLINE_24", Tensorflow.FRAME_WIDTH, "hand_point_up_outline_24");

    @pmi0("hand_slash_outline_28")
    public static final AtumVkuiLocalImageDto HAND_SLASH_OUTLINE_28 = new AtumVkuiLocalImageDto("HAND_SLASH_OUTLINE_28", 433, "hand_slash_outline_28");

    @pmi0("hanger_outline_24")
    public static final AtumVkuiLocalImageDto HANGER_OUTLINE_24 = new AtumVkuiLocalImageDto("HANGER_OUTLINE_24", 434, "hanger_outline_24");

    @pmi0("hashtag_16")
    public static final AtumVkuiLocalImageDto HASHTAG_16 = new AtumVkuiLocalImageDto("HASHTAG_16", 435, "hashtag_16");

    @pmi0("hashtag_outline_24")
    public static final AtumVkuiLocalImageDto HASHTAG_OUTLINE_24 = new AtumVkuiLocalImageDto("HASHTAG_OUTLINE_24", 436, "hashtag_outline_24");

    @pmi0("headphones_16")
    public static final AtumVkuiLocalImageDto HEADPHONES_16 = new AtumVkuiLocalImageDto("HEADPHONES_16", 437, "headphones_16");

    @pmi0("headphones_outline_28")
    public static final AtumVkuiLocalImageDto HEADPHONES_OUTLINE_28 = new AtumVkuiLocalImageDto("HEADPHONES_OUTLINE_28", 438, "headphones_outline_28");

    @pmi0("headphones_wave_outline_24")
    public static final AtumVkuiLocalImageDto HEADPHONES_WAVE_OUTLINE_24 = new AtumVkuiLocalImageDto("HEADPHONES_WAVE_OUTLINE_24", 439, "headphones_wave_outline_24");

    @pmi0("headphones_wave_outline_56")
    public static final AtumVkuiLocalImageDto HEADPHONES_WAVE_OUTLINE_56 = new AtumVkuiLocalImageDto("HEADPHONES_WAVE_OUTLINE_56", 440, "headphones_wave_outline_56");

    @pmi0("heart_circle_outline_28")
    public static final AtumVkuiLocalImageDto HEART_CIRCLE_OUTLINE_28 = new AtumVkuiLocalImageDto("HEART_CIRCLE_OUTLINE_28", 441, "heart_circle_outline_28");

    @pmi0("heart_settings_outline_20")
    public static final AtumVkuiLocalImageDto HEART_SETTINGS_OUTLINE_20 = new AtumVkuiLocalImageDto("HEART_SETTINGS_OUTLINE_20", 442, "heart_settings_outline_20");

    @pmi0("help_circle_outline_28")
    public static final AtumVkuiLocalImageDto HELP_CIRCLE_OUTLINE_28 = new AtumVkuiLocalImageDto("HELP_CIRCLE_OUTLINE_28", 443, "help_circle_outline_28");

    @pmi0("help_outline_16")
    public static final AtumVkuiLocalImageDto HELP_OUTLINE_16 = new AtumVkuiLocalImageDto("HELP_OUTLINE_16", 444, "help_outline_16");

    @pmi0("help_outline_20")
    public static final AtumVkuiLocalImageDto HELP_OUTLINE_20 = new AtumVkuiLocalImageDto("HELP_OUTLINE_20", 445, "help_outline_20");

    @pmi0("help_outline_24")
    public static final AtumVkuiLocalImageDto HELP_OUTLINE_24 = new AtumVkuiLocalImageDto("HELP_OUTLINE_24", 446, "help_outline_24");

    @pmi0("help_outline_56")
    public static final AtumVkuiLocalImageDto HELP_OUTLINE_56 = new AtumVkuiLocalImageDto("HELP_OUTLINE_56", 447, "help_outline_56");

    @pmi0("help_outline_shadow_large_48")
    public static final AtumVkuiLocalImageDto HELP_OUTLINE_SHADOW_LARGE_48 = new AtumVkuiLocalImageDto("HELP_OUTLINE_SHADOW_LARGE_48", 448, "help_outline_shadow_large_48");

    @pmi0("hide_outline_20")
    public static final AtumVkuiLocalImageDto HIDE_OUTLINE_20 = new AtumVkuiLocalImageDto("HIDE_OUTLINE_20", 449, "hide_outline_20");

    @pmi0("hide_outline_24")
    public static final AtumVkuiLocalImageDto HIDE_OUTLINE_24 = new AtumVkuiLocalImageDto("HIDE_OUTLINE_24", 450, "hide_outline_24");

    @pmi0("hide_outline_28")
    public static final AtumVkuiLocalImageDto HIDE_OUTLINE_28 = new AtumVkuiLocalImageDto("HIDE_OUTLINE_28", 451, "hide_outline_28");

    @pmi0("hide_outline_48")
    public static final AtumVkuiLocalImageDto HIDE_OUTLINE_48 = new AtumVkuiLocalImageDto("HIDE_OUTLINE_48", 452, "hide_outline_48");

    @pmi0("hide_outline_shadow_medium_48")
    public static final AtumVkuiLocalImageDto HIDE_OUTLINE_SHADOW_MEDIUM_48 = new AtumVkuiLocalImageDto("HIDE_OUTLINE_SHADOW_MEDIUM_48", ApiInvocationException.ErrorCodes.SESSION_REQUIRED, "hide_outline_shadow_medium_48");

    @pmi0("hieroglyph_character_outline_12")
    public static final AtumVkuiLocalImageDto HIEROGLYPH_CHARACTER_OUTLINE_12 = new AtumVkuiLocalImageDto("HIEROGLYPH_CHARACTER_OUTLINE_12", ApiInvocationException.ErrorCodes.CENSOR_MATCH, "hieroglyph_character_outline_12");

    @pmi0("hieroglyph_character_outline_24")
    public static final AtumVkuiLocalImageDto HIEROGLYPH_CHARACTER_OUTLINE_24 = new AtumVkuiLocalImageDto("HIEROGLYPH_CHARACTER_OUTLINE_24", ApiInvocationException.ErrorCodes.FRIEND_RESTRICTION, "hieroglyph_character_outline_24");

    @pmi0("hieroglyph_character_outline_28")
    public static final AtumVkuiLocalImageDto HIEROGLYPH_CHARACTER_OUTLINE_28 = new AtumVkuiLocalImageDto("HIEROGLYPH_CHARACTER_OUTLINE_28", ApiInvocationException.ErrorCodes.GROUP_RESTRICTION, "hieroglyph_character_outline_28");

    @pmi0("history_backward_outline_20")
    public static final AtumVkuiLocalImageDto HISTORY_BACKWARD_OUTLINE_20 = new AtumVkuiLocalImageDto("HISTORY_BACKWARD_OUTLINE_20", ApiInvocationException.ErrorCodes.UNAUTHORIZED_RESTRICTION, "history_backward_outline_20");

    @pmi0("history_backward_outline_24")
    public static final AtumVkuiLocalImageDto HISTORY_BACKWARD_OUTLINE_24 = new AtumVkuiLocalImageDto("HISTORY_BACKWARD_OUTLINE_24", ApiInvocationException.ErrorCodes.PRIVACY_RESTRICTION, "history_backward_outline_24");

    @pmi0("history_backward_outline_28")
    public static final AtumVkuiLocalImageDto HISTORY_BACKWARD_OUTLINE_28 = new AtumVkuiLocalImageDto("HISTORY_BACKWARD_OUTLINE_28", 459, "history_backward_outline_28");

    @pmi0("history_forward_outline_28")
    public static final AtumVkuiLocalImageDto HISTORY_FORWARD_OUTLINE_28 = new AtumVkuiLocalImageDto("HISTORY_FORWARD_OUTLINE_28", 460, "history_forward_outline_28");

    @pmi0("history_forward_substract_outline_28")
    public static final AtumVkuiLocalImageDto HISTORY_FORWARD_SUBSTRACT_OUTLINE_28 = new AtumVkuiLocalImageDto("HISTORY_FORWARD_SUBSTRACT_OUTLINE_28", 461, "history_forward_substract_outline_28");

    @pmi0("home_heart_outline_24")
    public static final AtumVkuiLocalImageDto HOME_HEART_OUTLINE_24 = new AtumVkuiLocalImageDto("HOME_HEART_OUTLINE_24", 462, "home_heart_outline_24");

    @pmi0("home_outline_20")
    public static final AtumVkuiLocalImageDto HOME_OUTLINE_20 = new AtumVkuiLocalImageDto("HOME_OUTLINE_20", 463, "home_outline_20");

    @pmi0("home_outline_28")
    public static final AtumVkuiLocalImageDto HOME_OUTLINE_28 = new AtumVkuiLocalImageDto("HOME_OUTLINE_28", 464, "home_outline_28");

    @pmi0("horizontal_rectangle_16x9_outline_20")
    public static final AtumVkuiLocalImageDto HORIZONTAL_RECTANGLE_16X9_OUTLINE_20 = new AtumVkuiLocalImageDto("HORIZONTAL_RECTANGLE_16X9_OUTLINE_20", 465, "horizontal_rectangle_16x9_outline_20");

    @pmi0("horizontal_rectangle_outline_20")
    public static final AtumVkuiLocalImageDto HORIZONTAL_RECTANGLE_OUTLINE_20 = new AtumVkuiLocalImageDto("HORIZONTAL_RECTANGLE_OUTLINE_20", 466, "horizontal_rectangle_outline_20");

    @pmi0("horse_toy_outline_28")
    public static final AtumVkuiLocalImageDto HORSE_TOY_OUTLINE_28 = new AtumVkuiLocalImageDto("HORSE_TOY_OUTLINE_28", 467, "horse_toy_outline_28");

    @pmi0("illustration_access_120h")
    public static final AtumVkuiLocalImageDto ILLUSTRATION_ACCESS_120H = new AtumVkuiLocalImageDto("ILLUSTRATION_ACCESS_120H", 468, "illustration_access_120h");

    @pmi0("illustration_age_limit_112h")
    public static final AtumVkuiLocalImageDto ILLUSTRATION_AGE_LIMIT_112H = new AtumVkuiLocalImageDto("ILLUSTRATION_AGE_LIMIT_112H", 469, "illustration_age_limit_112h");

    @pmi0("illustration_albums_64h")
    public static final AtumVkuiLocalImageDto ILLUSTRATION_ALBUMS_64H = new AtumVkuiLocalImageDto("ILLUSTRATION_ALBUMS_64H", 470, "illustration_albums_64h");

    @pmi0("illustration_antenna_dark_56")
    public static final AtumVkuiLocalImageDto ILLUSTRATION_ANTENNA_DARK_56 = new AtumVkuiLocalImageDto("ILLUSTRATION_ANTENNA_DARK_56", 471, "illustration_antenna_dark_56");

    @pmi0("illustration_antenna_light_56")
    public static final AtumVkuiLocalImageDto ILLUSTRATION_ANTENNA_LIGHT_56 = new AtumVkuiLocalImageDto("ILLUSTRATION_ANTENNA_LIGHT_56", 472, "illustration_antenna_light_56");

    @pmi0("illustration_archive_64h")
    public static final AtumVkuiLocalImageDto ILLUSTRATION_ARCHIVE_64H = new AtumVkuiLocalImageDto("ILLUSTRATION_ARCHIVE_64H", 473, "illustration_archive_64h");

    @pmi0("illustration_bad_26h")
    public static final AtumVkuiLocalImageDto ILLUSTRATION_BAD_26H = new AtumVkuiLocalImageDto("ILLUSTRATION_BAD_26H", 474, "illustration_bad_26h");

    @pmi0("illustration_call_48")
    public static final AtumVkuiLocalImageDto ILLUSTRATION_CALL_48 = new AtumVkuiLocalImageDto("ILLUSTRATION_CALL_48", 475, "illustration_call_48");

    @pmi0("illustration_call_56")
    public static final AtumVkuiLocalImageDto ILLUSTRATION_CALL_56 = new AtumVkuiLocalImageDto("ILLUSTRATION_CALL_56", 476, "illustration_call_56");

    @pmi0("illustration_call_to_action_200h")
    public static final AtumVkuiLocalImageDto ILLUSTRATION_CALL_TO_ACTION_200H = new AtumVkuiLocalImageDto("ILLUSTRATION_CALL_TO_ACTION_200H", 477, "illustration_call_to_action_200h");

    @pmi0("illustration_cat_closed_wall_78h")
    public static final AtumVkuiLocalImageDto ILLUSTRATION_CAT_CLOSED_WALL_78H = new AtumVkuiLocalImageDto("ILLUSTRATION_CAT_CLOSED_WALL_78H", 478, "illustration_cat_closed_wall_78h");

    @pmi0("illustration_channel_120")
    public static final AtumVkuiLocalImageDto ILLUSTRATION_CHANNEL_120 = new AtumVkuiLocalImageDto("ILLUSTRATION_CHANNEL_120", 479, "illustration_channel_120");

    @pmi0("illustration_channel_142")
    public static final AtumVkuiLocalImageDto ILLUSTRATION_CHANNEL_142 = new AtumVkuiLocalImageDto("ILLUSTRATION_CHANNEL_142", 480, "illustration_channel_142");

    @pmi0("illustration_comments_120h")
    public static final AtumVkuiLocalImageDto ILLUSTRATION_COMMENTS_120H = new AtumVkuiLocalImageDto("ILLUSTRATION_COMMENTS_120H", 481, "illustration_comments_120h");

    @pmi0("illustration_comments_share_120h")
    public static final AtumVkuiLocalImageDto ILLUSTRATION_COMMENTS_SHARE_120H = new AtumVkuiLocalImageDto("ILLUSTRATION_COMMENTS_SHARE_120H", 482, "illustration_comments_share_120h");

    @pmi0("illustration_communities_120h")
    public static final AtumVkuiLocalImageDto ILLUSTRATION_COMMUNITIES_120H = new AtumVkuiLocalImageDto("ILLUSTRATION_COMMUNITIES_120H", 483, "illustration_communities_120h");

    @pmi0("illustration_contraindications_26h")
    public static final AtumVkuiLocalImageDto ILLUSTRATION_CONTRAINDICATIONS_26H = new AtumVkuiLocalImageDto("ILLUSTRATION_CONTRAINDICATIONS_26H", 484, "illustration_contraindications_26h");

    @pmi0("illustration_donut_cup_light_36")
    public static final AtumVkuiLocalImageDto ILLUSTRATION_DONUT_CUP_LIGHT_36 = new AtumVkuiLocalImageDto("ILLUSTRATION_DONUT_CUP_LIGHT_36", 485, "illustration_donut_cup_light_36");

    @pmi0("illustration_download_video_64h")
    public static final AtumVkuiLocalImageDto ILLUSTRATION_DOWNLOAD_VIDEO_64H = new AtumVkuiLocalImageDto("ILLUSTRATION_DOWNLOAD_VIDEO_64H", 486, "illustration_download_video_64h");

    @pmi0("illustration_evaluation_96h")
    public static final AtumVkuiLocalImageDto ILLUSTRATION_EVALUATION_96H = new AtumVkuiLocalImageDto("ILLUSTRATION_EVALUATION_96H", 487, "illustration_evaluation_96h");

    @pmi0("illustration_exceeding_limit_120h")
    public static final AtumVkuiLocalImageDto ILLUSTRATION_EXCEEDING_LIMIT_120H = new AtumVkuiLocalImageDto("ILLUSTRATION_EXCEEDING_LIMIT_120H", 488, "illustration_exceeding_limit_120h");

    @pmi0("illustration_heart_80")
    public static final AtumVkuiLocalImageDto ILLUSTRATION_HEART_80 = new AtumVkuiLocalImageDto("ILLUSTRATION_HEART_80", 489, "illustration_heart_80");

    @pmi0("illustration_interactive_map_200h")
    public static final AtumVkuiLocalImageDto ILLUSTRATION_INTERACTIVE_MAP_200H = new AtumVkuiLocalImageDto("ILLUSTRATION_INTERACTIVE_MAP_200H", 490, "illustration_interactive_map_200h");

    @pmi0("illustration_interactive_restart_200h")
    public static final AtumVkuiLocalImageDto ILLUSTRATION_INTERACTIVE_RESTART_200H = new AtumVkuiLocalImageDto("ILLUSTRATION_INTERACTIVE_RESTART_200H", 491, "illustration_interactive_restart_200h");

    @pmi0("illustration_interactive_video_200h")
    public static final AtumVkuiLocalImageDto ILLUSTRATION_INTERACTIVE_VIDEO_200H = new AtumVkuiLocalImageDto("ILLUSTRATION_INTERACTIVE_VIDEO_200H", 492, "illustration_interactive_video_200h");

    @pmi0("illustration_lgbt_112h")
    public static final AtumVkuiLocalImageDto ILLUSTRATION_LGBT_112H = new AtumVkuiLocalImageDto("ILLUSTRATION_LGBT_112H", 493, "illustration_lgbt_112h");

    @pmi0("illustration_lyrics_56h")
    public static final AtumVkuiLocalImageDto ILLUSTRATION_LYRICS_56H = new AtumVkuiLocalImageDto("ILLUSTRATION_LYRICS_56H", 494, "illustration_lyrics_56h");

    @pmi0("illustration_magnifier_96h")
    public static final AtumVkuiLocalImageDto ILLUSTRATION_MAGNIFIER_96H = new AtumVkuiLocalImageDto("ILLUSTRATION_MAGNIFIER_96H", 495, "illustration_magnifier_96h");

    @pmi0("illustration_mini_widget_dark")
    public static final AtumVkuiLocalImageDto ILLUSTRATION_MINI_WIDGET_DARK = new AtumVkuiLocalImageDto("ILLUSTRATION_MINI_WIDGET_DARK", 496, "illustration_mini_widget_dark");

    @pmi0("illustration_mini_widget_light")
    public static final AtumVkuiLocalImageDto ILLUSTRATION_MINI_WIDGET_LIGHT = new AtumVkuiLocalImageDto("ILLUSTRATION_MINI_WIDGET_LIGHT", 497, "illustration_mini_widget_light");

    @pmi0("illustration_notification_bell_dark_96")
    public static final AtumVkuiLocalImageDto ILLUSTRATION_NOTIFICATION_BELL_DARK_96 = new AtumVkuiLocalImageDto("ILLUSTRATION_NOTIFICATION_BELL_DARK_96", 498, "illustration_notification_bell_dark_96");

    @pmi0("illustration_notification_bell_light_96")
    public static final AtumVkuiLocalImageDto ILLUSTRATION_NOTIFICATION_BELL_LIGHT_96 = new AtumVkuiLocalImageDto("ILLUSTRATION_NOTIFICATION_BELL_LIGHT_96", 499, "illustration_notification_bell_light_96");

    @pmi0("illustration_notifications_sferum_180")
    public static final AtumVkuiLocalImageDto ILLUSTRATION_NOTIFICATIONS_SFERUM_180 = new AtumVkuiLocalImageDto("ILLUSTRATION_NOTIFICATIONS_SFERUM_180", 500, "illustration_notifications_sferum_180");

    @pmi0("illustration_persik_downtime_210h")
    public static final AtumVkuiLocalImageDto ILLUSTRATION_PERSIK_DOWNTIME_210H = new AtumVkuiLocalImageDto("ILLUSTRATION_PERSIK_DOWNTIME_210H", 501, "illustration_persik_downtime_210h");

    @pmi0("illustration_photos_64h")
    public static final AtumVkuiLocalImageDto ILLUSTRATION_PHOTOS_64H = new AtumVkuiLocalImageDto("ILLUSTRATION_PHOTOS_64H", 502, "illustration_photos_64h");

    @pmi0("illustration_placeholder_kid_llama_150")
    public static final AtumVkuiLocalImageDto ILLUSTRATION_PLACEHOLDER_KID_LLAMA_150 = new AtumVkuiLocalImageDto("ILLUSTRATION_PLACEHOLDER_KID_LLAMA_150", 503, "illustration_placeholder_kid_llama_150");

    @pmi0("illustration_rating_and_review_light_120h")
    public static final AtumVkuiLocalImageDto ILLUSTRATION_RATING_AND_REVIEW_LIGHT_120H = new AtumVkuiLocalImageDto("ILLUSTRATION_RATING_AND_REVIEW_LIGHT_120H", ApiInvocationException.ErrorCodes.PHOTO_IMAGE_CORRUPTED, "illustration_rating_and_review_light_120h");

    @pmi0("illustration_services_people_120h")
    public static final AtumVkuiLocalImageDto ILLUSTRATION_SERVICES_PEOPLE_120H = new AtumVkuiLocalImageDto("ILLUSTRATION_SERVICES_PEOPLE_120H", 505, "illustration_services_people_120h");

    @pmi0("illustration_skip_previous_200h")
    public static final AtumVkuiLocalImageDto ILLUSTRATION_SKIP_PREVIOUS_200H = new AtumVkuiLocalImageDto("ILLUSTRATION_SKIP_PREVIOUS_200H", IronSourceError.ERROR_CODE_INVALID_KEY_VALUE, "illustration_skip_previous_200h");

    @pmi0("illustration_snowball_192h")
    public static final AtumVkuiLocalImageDto ILLUSTRATION_SNOWBALL_192H = new AtumVkuiLocalImageDto("ILLUSTRATION_SNOWBALL_192H", 507, "illustration_snowball_192h");

    @pmi0("illustration_snowball_50")
    public static final AtumVkuiLocalImageDto ILLUSTRATION_SNOWBALL_50 = new AtumVkuiLocalImageDto("ILLUSTRATION_SNOWBALL_50", IronSourceError.ERROR_CODE_INIT_FAILED, "illustration_snowball_50");

    @pmi0("illustration_strike_120h")
    public static final AtumVkuiLocalImageDto ILLUSTRATION_STRIKE_120H = new AtumVkuiLocalImageDto("ILLUSTRATION_STRIKE_120H", IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, "illustration_strike_120h");

    @pmi0("illustration_three_people_64h")
    public static final AtumVkuiLocalImageDto ILLUSTRATION_THREE_PEOPLE_64H = new AtumVkuiLocalImageDto("ILLUSTRATION_THREE_PEOPLE_64H", 510, "illustration_three_people_64h");

    @pmi0("illustration_ufo_96")
    public static final AtumVkuiLocalImageDto ILLUSTRATION_UFO_96 = new AtumVkuiLocalImageDto("ILLUSTRATION_UFO_96", ApiInvocationException.ErrorCodes.IDS_BLOCKED, "illustration_ufo_96");

    @pmi0("illustration_unreliable_112h")
    public static final AtumVkuiLocalImageDto ILLUSTRATION_UNRELIABLE_112H = new AtumVkuiLocalImageDto("ILLUSTRATION_UNRELIABLE_112H", 512, "illustration_unreliable_112h");

    @pmi0("illustration_vk_donut_16")
    public static final AtumVkuiLocalImageDto ILLUSTRATION_VK_DONUT_16 = new AtumVkuiLocalImageDto("ILLUSTRATION_VK_DONUT_16", 513, "illustration_vk_donut_16");

    @pmi0("image_format_outline_20")
    public static final AtumVkuiLocalImageDto IMAGE_FORMAT_OUTLINE_20 = new AtumVkuiLocalImageDto("IMAGE_FORMAT_OUTLINE_20", 514, "image_format_outline_20");

    @pmi0("inbox_outline_28")
    public static final AtumVkuiLocalImageDto INBOX_OUTLINE_28 = new AtumVkuiLocalImageDto("INBOX_OUTLINE_28", 515, "inbox_outline_28");

    @pmi0("inbox_outline_56")
    public static final AtumVkuiLocalImageDto INBOX_OUTLINE_56 = new AtumVkuiLocalImageDto("INBOX_OUTLINE_56", 516, "inbox_outline_56");

    @pmi0("info_20")
    public static final AtumVkuiLocalImageDto INFO_20 = new AtumVkuiLocalImageDto("INFO_20", 517, "info_20");

    @pmi0("info_circle_16")
    public static final AtumVkuiLocalImageDto INFO_CIRCLE_16 = new AtumVkuiLocalImageDto("INFO_CIRCLE_16", 518, "info_circle_16");

    @pmi0("info_circle_outline_20")
    public static final AtumVkuiLocalImageDto INFO_CIRCLE_OUTLINE_20 = new AtumVkuiLocalImageDto("INFO_CIRCLE_OUTLINE_20", 519, "info_circle_outline_20");

    @pmi0("info_circle_outline_24")
    public static final AtumVkuiLocalImageDto INFO_CIRCLE_OUTLINE_24 = new AtumVkuiLocalImageDto("INFO_CIRCLE_OUTLINE_24", IronSourceError.ERROR_NO_INTERNET_CONNECTION, "info_circle_outline_24");

    @pmi0("info_outline_16")
    public static final AtumVkuiLocalImageDto INFO_OUTLINE_16 = new AtumVkuiLocalImageDto("INFO_OUTLINE_16", 521, "info_outline_16");

    @pmi0("key_outline_28")
    public static final AtumVkuiLocalImageDto KEY_OUTLINE_28 = new AtumVkuiLocalImageDto("KEY_OUTLINE_28", 522, "key_outline_28");

    @pmi0("keyboard_outline_28")
    public static final AtumVkuiLocalImageDto KEYBOARD_OUTLINE_28 = new AtumVkuiLocalImageDto("KEYBOARD_OUTLINE_28", 523, "keyboard_outline_28");

    @pmi0("knife_outline_24")
    public static final AtumVkuiLocalImageDto KNIFE_OUTLINE_24 = new AtumVkuiLocalImageDto("KNIFE_OUTLINE_24", IronSourceError.ERROR_PLACEMENT_CAPPED, "knife_outline_24");

    @pmi0("lifebuoy_outline_24")
    public static final AtumVkuiLocalImageDto LIFEBUOY_OUTLINE_24 = new AtumVkuiLocalImageDto("LIFEBUOY_OUTLINE_24", IronSourceError.ERROR_AD_FORMAT_CAPPED, "lifebuoy_outline_24");

    @pmi0("lifebuoy_outline_28")
    public static final AtumVkuiLocalImageDto LIFEBUOY_OUTLINE_28 = new AtumVkuiLocalImageDto("LIFEBUOY_OUTLINE_28", IronSourceError.ERROR_CAPPED_PER_SESSION, "lifebuoy_outline_28");

    @pmi0("lightbulb_outline_28")
    public static final AtumVkuiLocalImageDto LIGHTBULB_OUTLINE_28 = new AtumVkuiLocalImageDto("LIGHTBULB_OUTLINE_28", IronSourceError.ERROR_NON_EXISTENT_INSTANCE, "lightbulb_outline_28");

    @pmi0("lightbulb_star_outline_28")
    public static final AtumVkuiLocalImageDto LIGHTBULB_STAR_OUTLINE_28 = new AtumVkuiLocalImageDto("LIGHTBULB_STAR_OUTLINE_28", 528, "lightbulb_star_outline_28");

    @pmi0("like_16")
    public static final AtumVkuiLocalImageDto LIKE_16 = new AtumVkuiLocalImageDto("LIKE_16", 529, "like_16");

    @pmi0("like_24")
    public static final AtumVkuiLocalImageDto LIKE_24 = new AtumVkuiLocalImageDto("LIKE_24", IronSourceError.ERROR_AD_UNIT_CAPPED, "like_24");

    @pmi0("like_28")
    public static final AtumVkuiLocalImageDto LIKE_28 = new AtumVkuiLocalImageDto("LIKE_28", 531, "like_28");

    @pmi0("like_36")
    public static final AtumVkuiLocalImageDto LIKE_36 = new AtumVkuiLocalImageDto("LIKE_36", 532, "like_36");

    @pmi0("like_48")
    public static final AtumVkuiLocalImageDto LIKE_48 = new AtumVkuiLocalImageDto("LIKE_48", PeerVideoSettings.IDEAL_BITS_PER_MACROBLOCK, "like_48");

    @pmi0("like_circle_fill_red_20")
    public static final AtumVkuiLocalImageDto LIKE_CIRCLE_FILL_RED_20 = new AtumVkuiLocalImageDto("LIKE_CIRCLE_FILL_RED_20", 534, "like_circle_fill_red_20");

    @pmi0("like_fill_red_28")
    public static final AtumVkuiLocalImageDto LIKE_FILL_RED_28 = new AtumVkuiLocalImageDto("LIKE_FILL_RED_28", 535, "like_fill_red_28");

    @pmi0("like_outline_16")
    public static final AtumVkuiLocalImageDto LIKE_OUTLINE_16 = new AtumVkuiLocalImageDto("LIKE_OUTLINE_16", 536, "like_outline_16");

    @pmi0("like_outline_20")
    public static final AtumVkuiLocalImageDto LIKE_OUTLINE_20 = new AtumVkuiLocalImageDto("LIKE_OUTLINE_20", 537, "like_outline_20");

    @pmi0("like_outline_24")
    public static final AtumVkuiLocalImageDto LIKE_OUTLINE_24 = new AtumVkuiLocalImageDto("LIKE_OUTLINE_24", 538, "like_outline_24");

    @pmi0("like_outline_28")
    public static final AtumVkuiLocalImageDto LIKE_OUTLINE_28 = new AtumVkuiLocalImageDto("LIKE_OUTLINE_28", 539, "like_outline_28");

    @pmi0("like_outline_56")
    public static final AtumVkuiLocalImageDto LIKE_OUTLINE_56 = new AtumVkuiLocalImageDto("LIKE_OUTLINE_56", 540, "like_outline_56");

    @pmi0("like_outline_shadow_medium_48")
    public static final AtumVkuiLocalImageDto LIKE_OUTLINE_SHADOW_MEDIUM_48 = new AtumVkuiLocalImageDto("LIKE_OUTLINE_SHADOW_MEDIUM_48", 541, "like_outline_shadow_medium_48");

    @pmi0("like_shadow_24")
    public static final AtumVkuiLocalImageDto LIKE_SHADOW_24 = new AtumVkuiLocalImageDto("LIKE_SHADOW_24", 542, "like_shadow_24");

    @pmi0("like_shadow_medium_red_48")
    public static final AtumVkuiLocalImageDto LIKE_SHADOW_MEDIUM_RED_48 = new AtumVkuiLocalImageDto("LIKE_SHADOW_MEDIUM_RED_48", 543, "like_shadow_medium_red_48");

    @pmi0("like_with_stroke_18")
    public static final AtumVkuiLocalImageDto LIKE_WITH_STROKE_18 = new AtumVkuiLocalImageDto("LIKE_WITH_STROKE_18", 544, "like_with_stroke_18");

    @pmi0("link_16")
    public static final AtumVkuiLocalImageDto LINK_16 = new AtumVkuiLocalImageDto("LINK_16", 545, "link_16");

    @pmi0("link_24")
    public static final AtumVkuiLocalImageDto LINK_24 = new AtumVkuiLocalImageDto("LINK_24", 546, "link_24");

    @pmi0("link_circle_24")
    public static final AtumVkuiLocalImageDto LINK_CIRCLE_24 = new AtumVkuiLocalImageDto("LINK_CIRCLE_24", 547, "link_circle_24");

    @pmi0("link_circle_outline_20")
    public static final AtumVkuiLocalImageDto LINK_CIRCLE_OUTLINE_20 = new AtumVkuiLocalImageDto("LINK_CIRCLE_OUTLINE_20", 548, "link_circle_outline_20");

    @pmi0("link_circle_outline_28")
    public static final AtumVkuiLocalImageDto LINK_CIRCLE_OUTLINE_28 = new AtumVkuiLocalImageDto("LINK_CIRCLE_OUTLINE_28", 549, "link_circle_outline_28");

    @pmi0("link_circle_outline_56")
    public static final AtumVkuiLocalImageDto LINK_CIRCLE_OUTLINE_56 = new AtumVkuiLocalImageDto("LINK_CIRCLE_OUTLINE_56", 550, "link_circle_outline_56");

    @pmi0("link_outline_28")
    public static final AtumVkuiLocalImageDto LINK_OUTLINE_28 = new AtumVkuiLocalImageDto("LINK_OUTLINE_28", 551, "link_outline_28");

    @pmi0("linked_16")
    public static final AtumVkuiLocalImageDto LINKED_16 = new AtumVkuiLocalImageDto("LINKED_16", 552, "linked_16");

    @pmi0("list_add_outline_24")
    public static final AtumVkuiLocalImageDto LIST_ADD_OUTLINE_24 = new AtumVkuiLocalImageDto("LIST_ADD_OUTLINE_24", 553, "list_add_outline_24");

    @pmi0("list_add_outline_28")
    public static final AtumVkuiLocalImageDto LIST_ADD_OUTLINE_28 = new AtumVkuiLocalImageDto("LIST_ADD_OUTLINE_28", 554, "list_add_outline_28");

    @pmi0("list_bullet_square_outline_24")
    public static final AtumVkuiLocalImageDto LIST_BULLET_SQUARE_OUTLINE_24 = new AtumVkuiLocalImageDto("LIST_BULLET_SQUARE_OUTLINE_24", 555, "list_bullet_square_outline_24");

    @pmi0("list_bullet_square_outline_56")
    public static final AtumVkuiLocalImageDto LIST_BULLET_SQUARE_OUTLINE_56 = new AtumVkuiLocalImageDto("LIST_BULLET_SQUARE_OUTLINE_56", 556, "list_bullet_square_outline_56");

    @pmi0("list_insert_first_outline_20")
    public static final AtumVkuiLocalImageDto LIST_INSERT_FIRST_OUTLINE_20 = new AtumVkuiLocalImageDto("LIST_INSERT_FIRST_OUTLINE_20", 557, "list_insert_first_outline_20");

    @pmi0("list_insert_first_outline_28")
    public static final AtumVkuiLocalImageDto LIST_INSERT_FIRST_OUTLINE_28 = new AtumVkuiLocalImageDto("LIST_INSERT_FIRST_OUTLINE_28", 558, "list_insert_first_outline_28");

    @pmi0("list_like_fill_24")
    public static final AtumVkuiLocalImageDto LIST_LIKE_FILL_24 = new AtumVkuiLocalImageDto("LIST_LIKE_FILL_24", 559, "list_like_fill_24");

    @pmi0("list_like_outline_24")
    public static final AtumVkuiLocalImageDto LIST_LIKE_OUTLINE_24 = new AtumVkuiLocalImageDto("LIST_LIKE_OUTLINE_24", 560, "list_like_outline_24");

    @pmi0("list_like_outline_28")
    public static final AtumVkuiLocalImageDto LIST_LIKE_OUTLINE_28 = new AtumVkuiLocalImageDto("LIST_LIKE_OUTLINE_28", 561, "list_like_outline_28");

    @pmi0("list_like_slash_outline_24")
    public static final AtumVkuiLocalImageDto LIST_LIKE_SLASH_OUTLINE_24 = new AtumVkuiLocalImageDto("LIST_LIKE_SLASH_OUTLINE_24", 562, "list_like_slash_outline_24");

    @pmi0("list_outline_28")
    public static final AtumVkuiLocalImageDto LIST_OUTLINE_28 = new AtumVkuiLocalImageDto("LIST_OUTLINE_28", 563, "list_outline_28");

    @pmi0("list_play_outline_20")
    public static final AtumVkuiLocalImageDto LIST_PLAY_OUTLINE_20 = new AtumVkuiLocalImageDto("LIST_PLAY_OUTLINE_20", 564, "list_play_outline_20");

    @pmi0("list_play_outline_28")
    public static final AtumVkuiLocalImageDto LIST_PLAY_OUTLINE_28 = new AtumVkuiLocalImageDto("LIST_PLAY_OUTLINE_28", 565, "list_play_outline_28");

    @pmi0("list_play_outline_56")
    public static final AtumVkuiLocalImageDto LIST_PLAY_OUTLINE_56 = new AtumVkuiLocalImageDto("LIST_PLAY_OUTLINE_56", 566, "list_play_outline_56");

    @pmi0("live_24")
    public static final AtumVkuiLocalImageDto LIVE_24 = new AtumVkuiLocalImageDto("LIVE_24", 567, "live_24");

    @pmi0("live_add_outline_28")
    public static final AtumVkuiLocalImageDto LIVE_ADD_OUTLINE_28 = new AtumVkuiLocalImageDto("LIVE_ADD_OUTLINE_28", 568, "live_add_outline_28");

    @pmi0("live_badge_12")
    public static final AtumVkuiLocalImageDto LIVE_BADGE_12 = new AtumVkuiLocalImageDto("LIVE_BADGE_12", 569, "live_badge_12");

    @pmi0("live_badge_16")
    public static final AtumVkuiLocalImageDto LIVE_BADGE_16 = new AtumVkuiLocalImageDto("LIVE_BADGE_16", 570, "live_badge_16");

    @pmi0("live_badge_18")
    public static final AtumVkuiLocalImageDto LIVE_BADGE_18 = new AtumVkuiLocalImageDto("LIVE_BADGE_18", 571, "live_badge_18");

    @pmi0("live_badge_20")
    public static final AtumVkuiLocalImageDto LIVE_BADGE_20 = new AtumVkuiLocalImageDto("LIVE_BADGE_20", 572, "live_badge_20");

    @pmi0("live_outline_24")
    public static final AtumVkuiLocalImageDto LIVE_OUTLINE_24 = new AtumVkuiLocalImageDto("LIVE_OUTLINE_24", 573, "live_outline_24");

    @pmi0("live_outline_28")
    public static final AtumVkuiLocalImageDto LIVE_OUTLINE_28 = new AtumVkuiLocalImageDto("LIVE_OUTLINE_28", 574, "live_outline_28");

    @pmi0("live_text_20h")
    public static final AtumVkuiLocalImageDto LIVE_TEXT_20H = new AtumVkuiLocalImageDto("LIVE_TEXT_20H", 575, "live_text_20h");

    @pmi0("location_24")
    public static final AtumVkuiLocalImageDto LOCATION_24 = new AtumVkuiLocalImageDto("LOCATION_24", 576, "location_24");

    @pmi0("location_map_outline_24")
    public static final AtumVkuiLocalImageDto LOCATION_MAP_OUTLINE_24 = new AtumVkuiLocalImageDto("LOCATION_MAP_OUTLINE_24", 577, "location_map_outline_24");

    @pmi0("location_map_outline_28")
    public static final AtumVkuiLocalImageDto LOCATION_MAP_OUTLINE_28 = new AtumVkuiLocalImageDto("LOCATION_MAP_OUTLINE_28", 578, "location_map_outline_28");

    @pmi0("location_outline_24")
    public static final AtumVkuiLocalImageDto LOCATION_OUTLINE_24 = new AtumVkuiLocalImageDto("LOCATION_OUTLINE_24", 579, "location_outline_24");

    @pmi0("location_outline_28")
    public static final AtumVkuiLocalImageDto LOCATION_OUTLINE_28 = new AtumVkuiLocalImageDto("LOCATION_OUTLINE_28", 580, "location_outline_28");

    @pmi0("location_pin_56")
    public static final AtumVkuiLocalImageDto LOCATION_PIN_56 = new AtumVkuiLocalImageDto("LOCATION_PIN_56", 581, "location_pin_56");

    @pmi0("lock_12")
    public static final AtumVkuiLocalImageDto LOCK_12 = new AtumVkuiLocalImageDto("LOCK_12", 582, "lock_12");

    @pmi0("lock_16")
    public static final AtumVkuiLocalImageDto LOCK_16 = new AtumVkuiLocalImageDto("LOCK_16", 583, "lock_16");

    @pmi0("lock_open_16")
    public static final AtumVkuiLocalImageDto LOCK_OPEN_16 = new AtumVkuiLocalImageDto("LOCK_OPEN_16", 584, "lock_open_16");

    @pmi0("lock_open_outline_24")
    public static final AtumVkuiLocalImageDto LOCK_OPEN_OUTLINE_24 = new AtumVkuiLocalImageDto("LOCK_OPEN_OUTLINE_24", 585, "lock_open_outline_24");

    @pmi0("lock_outline_16")
    public static final AtumVkuiLocalImageDto LOCK_OUTLINE_16 = new AtumVkuiLocalImageDto("LOCK_OUTLINE_16", 586, "lock_outline_16");

    @pmi0("lock_outline_20")
    public static final AtumVkuiLocalImageDto LOCK_OUTLINE_20 = new AtumVkuiLocalImageDto("LOCK_OUTLINE_20", 587, "lock_outline_20");

    @pmi0("lock_outline_24")
    public static final AtumVkuiLocalImageDto LOCK_OUTLINE_24 = new AtumVkuiLocalImageDto("LOCK_OUTLINE_24", 588, "lock_outline_24");

    @pmi0("lock_outline_28")
    public static final AtumVkuiLocalImageDto LOCK_OUTLINE_28 = new AtumVkuiLocalImageDto("LOCK_OUTLINE_28", 589, "lock_outline_28");

    @pmi0("lock_outline_56")
    public static final AtumVkuiLocalImageDto LOCK_OUTLINE_56 = new AtumVkuiLocalImageDto("LOCK_OUTLINE_56", 590, "lock_outline_56");

    @pmi0("lock_shadow_24")
    public static final AtumVkuiLocalImageDto LOCK_SHADOW_24 = new AtumVkuiLocalImageDto("LOCK_SHADOW_24", 591, "lock_shadow_24");

    @pmi0("logo_achievements_100")
    public static final AtumVkuiLocalImageDto LOGO_ACHIEVEMENTS_100 = new AtumVkuiLocalImageDto("LOGO_ACHIEVEMENTS_100", 592, "logo_achievements_100");

    @pmi0("logo_adchoices_16")
    public static final AtumVkuiLocalImageDto LOGO_ADCHOICES_16 = new AtumVkuiLocalImageDto("LOGO_ADCHOICES_16", 593, "logo_adchoices_16");

    @pmi0("logo_alfa_bank_color_28")
    public static final AtumVkuiLocalImageDto LOGO_ALFA_BANK_COLOR_28 = new AtumVkuiLocalImageDto("LOGO_ALFA_BANK_COLOR_28", 594, "logo_alfa_bank_color_28");

    @pmi0("logo_apple_24")
    public static final AtumVkuiLocalImageDto LOGO_APPLE_24 = new AtumVkuiLocalImageDto("LOGO_APPLE_24", 595, "logo_apple_24");

    @pmi0("logo_avito_16")
    public static final AtumVkuiLocalImageDto LOGO_AVITO_16 = new AtumVkuiLocalImageDto("LOGO_AVITO_16", 596, "logo_avito_16");

    @pmi0("logo_clips_12")
    public static final AtumVkuiLocalImageDto LOGO_CLIPS_12 = new AtumVkuiLocalImageDto("LOGO_CLIPS_12", 597, "logo_clips_12");

    @pmi0("logo_clips_32")
    public static final AtumVkuiLocalImageDto LOGO_CLIPS_32 = new AtumVkuiLocalImageDto("LOGO_CLIPS_32", 598, "logo_clips_32");

    @pmi0("logo_clips_outline_20")
    public static final AtumVkuiLocalImageDto LOGO_CLIPS_OUTLINE_20 = new AtumVkuiLocalImageDto("LOGO_CLIPS_OUTLINE_20", CommonGatewayClient.CODE_599, "logo_clips_outline_20");

    @pmi0("logo_clips_outline_24")
    public static final AtumVkuiLocalImageDto LOGO_CLIPS_OUTLINE_24 = new AtumVkuiLocalImageDto("LOGO_CLIPS_OUTLINE_24", 600, "logo_clips_outline_24");

    @pmi0("logo_clips_outline_28")
    public static final AtumVkuiLocalImageDto LOGO_CLIPS_OUTLINE_28 = new AtumVkuiLocalImageDto("LOGO_CLIPS_OUTLINE_28", 601, "logo_clips_outline_28");

    @pmi0("logo_clips_outline_56")
    public static final AtumVkuiLocalImageDto LOGO_CLIPS_OUTLINE_56 = new AtumVkuiLocalImageDto("LOGO_CLIPS_OUTLINE_56", 602, "logo_clips_outline_56");

    @pmi0("logo_clips_outline_shadow_20")
    public static final AtumVkuiLocalImageDto LOGO_CLIPS_OUTLINE_SHADOW_20 = new AtumVkuiLocalImageDto("LOGO_CLIPS_OUTLINE_SHADOW_20", 603, "logo_clips_outline_shadow_20");

    @pmi0("logo_donut_48")
    public static final AtumVkuiLocalImageDto LOGO_DONUT_48 = new AtumVkuiLocalImageDto("LOGO_DONUT_48", 604, "logo_donut_48");

    @pmi0("logo_gazprombank_color_28")
    public static final AtumVkuiLocalImageDto LOGO_GAZPROMBANK_COLOR_28 = new AtumVkuiLocalImageDto("LOGO_GAZPROMBANK_COLOR_28", 605, "logo_gazprombank_color_28");

    @pmi0("logo_gosuslugi_color_28")
    public static final AtumVkuiLocalImageDto LOGO_GOSUSLUGI_COLOR_28 = new AtumVkuiLocalImageDto("LOGO_GOSUSLUGI_COLOR_28", 606, "logo_gosuslugi_color_28");

    @pmi0("logo_icq_outline_24")
    public static final AtumVkuiLocalImageDto LOGO_ICQ_OUTLINE_24 = new AtumVkuiLocalImageDto("LOGO_ICQ_OUTLINE_24", IronSourceError.ERROR_BN_INSTANCE_INIT_TIMEOUT, "logo_icq_outline_24");

    @pmi0("logo_instagram_28")
    public static final AtumVkuiLocalImageDto LOGO_INSTAGRAM_28 = new AtumVkuiLocalImageDto("LOGO_INSTAGRAM_28", 608, "logo_instagram_28");

    @pmi0("logo_max_color_56")
    public static final AtumVkuiLocalImageDto LOGO_MAX_COLOR_56 = new AtumVkuiLocalImageDto("LOGO_MAX_COLOR_56", IronSourceError.ERROR_BN_INSTANCE_RELOAD_TIMEOUT, "logo_max_color_56");

    @pmi0("logo_openbank_color_28")
    public static final AtumVkuiLocalImageDto LOGO_OPENBANK_COLOR_28 = new AtumVkuiLocalImageDto("LOGO_OPENBANK_COLOR_28", 610, "logo_openbank_color_28");

    @pmi0("logo_ozon_14h")
    public static final AtumVkuiLocalImageDto LOGO_OZON_14H = new AtumVkuiLocalImageDto("LOGO_OZON_14H", 611, "logo_ozon_14h");

    @pmi0("logo_raiffeisen_color_28")
    public static final AtumVkuiLocalImageDto LOGO_RAIFFEISEN_COLOR_28 = new AtumVkuiLocalImageDto("LOGO_RAIFFEISEN_COLOR_28", 612, "logo_raiffeisen_color_28");

    @pmi0("logo_rossia_color_28")
    public static final AtumVkuiLocalImageDto LOGO_ROSSIA_COLOR_28 = new AtumVkuiLocalImageDto("LOGO_ROSSIA_COLOR_28", IronSourceError.ERROR_BN_RELOAD_SKIP_INVISIBLE, "logo_rossia_color_28");

    @pmi0("logo_sber_color_28")
    public static final AtumVkuiLocalImageDto LOGO_SBER_COLOR_28 = new AtumVkuiLocalImageDto("LOGO_SBER_COLOR_28", IronSourceError.ERROR_BN_RELOAD_SKIP_BACKGROUND, "logo_sber_color_28");

    @pmi0("logo_sferum_color_16")
    public static final AtumVkuiLocalImageDto LOGO_SFERUM_COLOR_16 = new AtumVkuiLocalImageDto("LOGO_SFERUM_COLOR_16", IronSourceError.ERROR_BN_LOAD_NO_CONFIG, "logo_sferum_color_16");

    @pmi0("logo_sferum_color_28")
    public static final AtumVkuiLocalImageDto LOGO_SFERUM_COLOR_28 = new AtumVkuiLocalImageDto("LOGO_SFERUM_COLOR_28", IronSourceError.ERROR_BN_UNSUPPORTED_SIZE, "logo_sferum_color_28");

    @pmi0("logo_skype_28")
    public static final AtumVkuiLocalImageDto LOGO_SKYPE_28 = new AtumVkuiLocalImageDto("LOGO_SKYPE_28", IronSourceError.ERROR_BN_BANNER_CONTAINER_IS_NULL, "logo_skype_28");

    @pmi0("logo_spb_color_28")
    public static final AtumVkuiLocalImageDto LOGO_SPB_COLOR_28 = new AtumVkuiLocalImageDto("LOGO_SPB_COLOR_28", 618, "logo_spb_color_28");

    @pmi0("logo_telegram_color_56")
    public static final AtumVkuiLocalImageDto LOGO_TELEGRAM_COLOR_56 = new AtumVkuiLocalImageDto("LOGO_TELEGRAM_COLOR_56", 619, "logo_telegram_color_56");

    @pmi0("logo_tinkoff_color_28")
    public static final AtumVkuiLocalImageDto LOGO_TINKOFF_COLOR_28 = new AtumVkuiLocalImageDto("LOGO_TINKOFF_COLOR_28", IronSourceError.ERROR_DO_BN_LOAD_DURING_SHOW, "logo_tinkoff_color_28");

    @pmi0("logo_vk_calls_outline_28")
    public static final AtumVkuiLocalImageDto LOGO_VK_CALLS_OUTLINE_28 = new AtumVkuiLocalImageDto("LOGO_VK_CALLS_OUTLINE_28", 621, "logo_vk_calls_outline_28");

    @pmi0("logo_vk_clips_color_24")
    public static final AtumVkuiLocalImageDto LOGO_VK_CLIPS_COLOR_24 = new AtumVkuiLocalImageDto("LOGO_VK_CLIPS_COLOR_24", IronSourceError.ERROR_BN_RELOAD_SKIP_BANNER_LAYOUT_IS_NULL, "logo_vk_clips_color_24");

    @pmi0("logo_vk_me_color_16")
    public static final AtumVkuiLocalImageDto LOGO_VK_ME_COLOR_16 = new AtumVkuiLocalImageDto("LOGO_VK_ME_COLOR_16", IronSourceError.ERROR_BN_BINDING_SKIP_INVISIBLE, "logo_vk_me_color_16");

    @pmi0("logo_vk_me_color_24")
    public static final AtumVkuiLocalImageDto LOGO_VK_ME_COLOR_24 = new AtumVkuiLocalImageDto("LOGO_VK_ME_COLOR_24", LevelPlayAdError.ERROR_CODE_NO_AD_UNIT_ID_SPECIFIED, "logo_vk_me_color_24");

    @pmi0("logo_vk_music_16")
    public static final AtumVkuiLocalImageDto LOGO_VK_MUSIC_16 = new AtumVkuiLocalImageDto("LOGO_VK_MUSIC_16", LevelPlayAdError.ERROR_CODE_LOAD_BEFORE_INIT_SUCCESS_CALLBACK, "logo_vk_music_16");

    @pmi0("logo_vk_music_outline_28")
    public static final AtumVkuiLocalImageDto LOGO_VK_MUSIC_OUTLINE_28 = new AtumVkuiLocalImageDto("LOGO_VK_MUSIC_OUTLINE_28", LevelPlayAdError.ERROR_CODE_INVALID_AD_UNIT_ID, "logo_vk_music_outline_28");

    @pmi0("logo_vk_outline_24")
    public static final AtumVkuiLocalImageDto LOGO_VK_OUTLINE_24 = new AtumVkuiLocalImageDto("LOGO_VK_OUTLINE_24", LevelPlayAdError.ERROR_CODE_LOAD_FAILED_ALREADY_CALLED, "logo_vk_outline_24");

    @pmi0("logo_vk_outline_28")
    public static final AtumVkuiLocalImageDto LOGO_VK_OUTLINE_28 = new AtumVkuiLocalImageDto("LOGO_VK_OUTLINE_28", LevelPlayAdError.ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK, "logo_vk_outline_28");

    @pmi0("logo_vk_shadow_48")
    public static final AtumVkuiLocalImageDto LOGO_VK_SHADOW_48 = new AtumVkuiLocalImageDto("LOGO_VK_SHADOW_48", LevelPlayAdError.ERROR_CODE_LOAD_WHILE_SHOW, "logo_vk_shadow_48");

    @pmi0("logo_vk_video_16")
    public static final AtumVkuiLocalImageDto LOGO_VK_VIDEO_16 = new AtumVkuiLocalImageDto("LOGO_VK_VIDEO_16", LevelPlayAdError.ERROR_CODE_SHOW_WHILE_SHOW, "logo_vk_video_16");

    @pmi0("logo_vk_video_color_24")
    public static final AtumVkuiLocalImageDto LOGO_VK_VIDEO_COLOR_24 = new AtumVkuiLocalImageDto("LOGO_VK_VIDEO_COLOR_24", LevelPlayAdError.ERROR_CODE_SHOW_WHILE_LOAD, "logo_vk_video_color_24");

    @pmi0("logo_vk_video_color_28")
    public static final AtumVkuiLocalImageDto LOGO_VK_VIDEO_COLOR_28 = new AtumVkuiLocalImageDto("LOGO_VK_VIDEO_COLOR_28", 632, "logo_vk_video_color_28");

    @pmi0("logo_vk_video_color_56")
    public static final AtumVkuiLocalImageDto LOGO_VK_VIDEO_COLOR_56 = new AtumVkuiLocalImageDto("LOGO_VK_VIDEO_COLOR_56", 633, "logo_vk_video_color_56");

    @pmi0("logo_vk_video_outline_20")
    public static final AtumVkuiLocalImageDto LOGO_VK_VIDEO_OUTLINE_20 = new AtumVkuiLocalImageDto("LOGO_VK_VIDEO_OUTLINE_20", 634, "logo_vk_video_outline_20");

    @pmi0("logo_vk_video_outline_28")
    public static final AtumVkuiLocalImageDto LOGO_VK_VIDEO_OUTLINE_28 = new AtumVkuiLocalImageDto("LOGO_VK_VIDEO_OUTLINE_28", 635, "logo_vk_video_outline_28");

    @pmi0("logo_vk_video_outline_shadow_28")
    public static final AtumVkuiLocalImageDto LOGO_VK_VIDEO_OUTLINE_SHADOW_28 = new AtumVkuiLocalImageDto("LOGO_VK_VIDEO_OUTLINE_SHADOW_28", 636, "logo_vk_video_outline_shadow_28");

    @pmi0("logo_vk_video_slash_outline_28")
    public static final AtumVkuiLocalImageDto LOGO_VK_VIDEO_SLASH_OUTLINE_28 = new AtumVkuiLocalImageDto("LOGO_VK_VIDEO_SLASH_OUTLINE_28", 637, "logo_vk_video_slash_outline_28");

    @pmi0("logo_vtb_color_28")
    public static final AtumVkuiLocalImageDto LOGO_VTB_COLOR_28 = new AtumVkuiLocalImageDto("LOGO_VTB_COLOR_28", 638, "logo_vtb_color_28");

    @pmi0("logo_whatsapp_color_56")
    public static final AtumVkuiLocalImageDto LOGO_WHATSAPP_COLOR_56 = new AtumVkuiLocalImageDto("LOGO_WHATSAPP_COLOR_56", 639, "logo_whatsapp_color_56");

    @pmi0("lotus_outline_28")
    public static final AtumVkuiLocalImageDto LOTUS_OUTLINE_28 = new AtumVkuiLocalImageDto("LOTUS_OUTLINE_28", 640, "lotus_outline_28");

    @pmi0("loudspeaker_slash_outline_28")
    public static final AtumVkuiLocalImageDto LOUDSPEAKER_SLASH_OUTLINE_28 = new AtumVkuiLocalImageDto("LOUDSPEAKER_SLASH_OUTLINE_28", 641, "loudspeaker_slash_outline_28");

    @pmi0("magic_wand_outline_24")
    public static final AtumVkuiLocalImageDto MAGIC_WAND_OUTLINE_24 = new AtumVkuiLocalImageDto("MAGIC_WAND_OUTLINE_24", 642, "magic_wand_outline_24");

    @pmi0("magic_wand_outline_28")
    public static final AtumVkuiLocalImageDto MAGIC_WAND_OUTLINE_28 = new AtumVkuiLocalImageDto("MAGIC_WAND_OUTLINE_28", 643, "magic_wand_outline_28");

    @pmi0("mail_outline_20")
    public static final AtumVkuiLocalImageDto MAIL_OUTLINE_20 = new AtumVkuiLocalImageDto("MAIL_OUTLINE_20", 644, "mail_outline_20");

    @pmi0("mail_outline_24")
    public static final AtumVkuiLocalImageDto MAIL_OUTLINE_24 = new AtumVkuiLocalImageDto("MAIL_OUTLINE_24", 645, "mail_outline_24");

    @pmi0("mail_outline_28")
    public static final AtumVkuiLocalImageDto MAIL_OUTLINE_28 = new AtumVkuiLocalImageDto("MAIL_OUTLINE_28", 646, "mail_outline_28");

    @pmi0("mail_outline_56")
    public static final AtumVkuiLocalImageDto MAIL_OUTLINE_56 = new AtumVkuiLocalImageDto("MAIL_OUTLINE_56", 647, "mail_outline_56");

    @pmi0("map_pin_shadow_26h")
    public static final AtumVkuiLocalImageDto MAP_PIN_SHADOW_26H = new AtumVkuiLocalImageDto("MAP_PIN_SHADOW_26H", 648, "map_pin_shadow_26h");

    @pmi0("map_pin_shadow_48h")
    public static final AtumVkuiLocalImageDto MAP_PIN_SHADOW_48H = new AtumVkuiLocalImageDto("MAP_PIN_SHADOW_48H", 649, "map_pin_shadow_48h");

    @pmi0("market_16")
    public static final AtumVkuiLocalImageDto MARKET_16 = new AtumVkuiLocalImageDto("MARKET_16", 650, "market_16");

    @pmi0("market_24")
    public static final AtumVkuiLocalImageDto MARKET_24 = new AtumVkuiLocalImageDto("MARKET_24", 651, "market_24");

    @pmi0("market_add_badge_outline_28")
    public static final AtumVkuiLocalImageDto MARKET_ADD_BADGE_OUTLINE_28 = new AtumVkuiLocalImageDto("MARKET_ADD_BADGE_OUTLINE_28", 652, "market_add_badge_outline_28");

    @pmi0("market_circle_fill_blue_28")
    public static final AtumVkuiLocalImageDto MARKET_CIRCLE_FILL_BLUE_28 = new AtumVkuiLocalImageDto("MARKET_CIRCLE_FILL_BLUE_28", 653, "market_circle_fill_blue_28");

    @pmi0("market_outline_16")
    public static final AtumVkuiLocalImageDto MARKET_OUTLINE_16 = new AtumVkuiLocalImageDto("MARKET_OUTLINE_16", 654, "market_outline_16");

    @pmi0("market_outline_20")
    public static final AtumVkuiLocalImageDto MARKET_OUTLINE_20 = new AtumVkuiLocalImageDto("MARKET_OUTLINE_20", 655, "market_outline_20");

    @pmi0("market_outline_24")
    public static final AtumVkuiLocalImageDto MARKET_OUTLINE_24 = new AtumVkuiLocalImageDto("MARKET_OUTLINE_24", 656, "market_outline_24");

    @pmi0("market_outline_28")
    public static final AtumVkuiLocalImageDto MARKET_OUTLINE_28 = new AtumVkuiLocalImageDto("MARKET_OUTLINE_28", 657, "market_outline_28");

    @pmi0("market_outline_36")
    public static final AtumVkuiLocalImageDto MARKET_OUTLINE_36 = new AtumVkuiLocalImageDto("MARKET_OUTLINE_36", 658, "market_outline_36");

    @pmi0("market_outline_56")
    public static final AtumVkuiLocalImageDto MARKET_OUTLINE_56 = new AtumVkuiLocalImageDto("MARKET_OUTLINE_56", 659, "market_outline_56");

    @pmi0("mask_16")
    public static final AtumVkuiLocalImageDto MASK_16 = new AtumVkuiLocalImageDto("MASK_16", 660, "mask_16");

    @pmi0("mask_live_80")
    public static final AtumVkuiLocalImageDto MASK_LIVE_80 = new AtumVkuiLocalImageDto("MASK_LIVE_80", 661, "mask_live_80");

    @pmi0("mask_live_88")
    public static final AtumVkuiLocalImageDto MASK_LIVE_88 = new AtumVkuiLocalImageDto("MASK_LIVE_88", 662, "mask_live_88");

    @pmi0("mask_stream_ended_80")
    public static final AtumVkuiLocalImageDto MASK_STREAM_ENDED_80 = new AtumVkuiLocalImageDto("MASK_STREAM_ENDED_80", 663, "mask_stream_ended_80");

    @pmi0("mask_stream_ended_88")
    public static final AtumVkuiLocalImageDto MASK_STREAM_ENDED_88 = new AtumVkuiLocalImageDto("MASK_STREAM_ENDED_88", 664, "mask_stream_ended_88");

    @pmi0("masks_outline_28")
    public static final AtumVkuiLocalImageDto MASKS_OUTLINE_28 = new AtumVkuiLocalImageDto("MASKS_OUTLINE_28", 665, "masks_outline_28");

    @pmi0("megaphone_outline_28")
    public static final AtumVkuiLocalImageDto MEGAPHONE_OUTLINE_28 = new AtumVkuiLocalImageDto("MEGAPHONE_OUTLINE_28", 666, "megaphone_outline_28");

    @pmi0("mention_12")
    public static final AtumVkuiLocalImageDto MENTION_12 = new AtumVkuiLocalImageDto("MENTION_12", 667, "mention_12");

    @pmi0("mention_16")
    public static final AtumVkuiLocalImageDto MENTION_16 = new AtumVkuiLocalImageDto("MENTION_16", 668, "mention_16");

    @pmi0("mention_outline_20")
    public static final AtumVkuiLocalImageDto MENTION_OUTLINE_20 = new AtumVkuiLocalImageDto("MENTION_OUTLINE_20", 669, "mention_outline_20");

    @pmi0("mention_outline_24")
    public static final AtumVkuiLocalImageDto MENTION_OUTLINE_24 = new AtumVkuiLocalImageDto("MENTION_OUTLINE_24", 670, "mention_outline_24");

    @pmi0("mention_outline_28")
    public static final AtumVkuiLocalImageDto MENTION_OUTLINE_28 = new AtumVkuiLocalImageDto("MENTION_OUTLINE_28", 671, "mention_outline_28");

    @pmi0("menu_outline_16")
    public static final AtumVkuiLocalImageDto MENU_OUTLINE_16 = new AtumVkuiLocalImageDto("MENU_OUTLINE_16", 672, "menu_outline_16");

    @pmi0("menu_outline_28")
    public static final AtumVkuiLocalImageDto MENU_OUTLINE_28 = new AtumVkuiLocalImageDto("MENU_OUTLINE_28", 673, "menu_outline_28");

    @pmi0("message_24")
    public static final AtumVkuiLocalImageDto MESSAGE_24 = new AtumVkuiLocalImageDto("MESSAGE_24", 674, "message_24");

    @pmi0("message_28")
    public static final AtumVkuiLocalImageDto MESSAGE_28 = new AtumVkuiLocalImageDto("MESSAGE_28", 675, "message_28");

    @pmi0("message_add_badge_outline_28")
    public static final AtumVkuiLocalImageDto MESSAGE_ADD_BADGE_OUTLINE_28 = new AtumVkuiLocalImageDto("MESSAGE_ADD_BADGE_OUTLINE_28", 676, "message_add_badge_outline_28");

    @pmi0("message_arrow_right_outline_20")
    public static final AtumVkuiLocalImageDto MESSAGE_ARROW_RIGHT_OUTLINE_20 = new AtumVkuiLocalImageDto("MESSAGE_ARROW_RIGHT_OUTLINE_20", 677, "message_arrow_right_outline_20");

    @pmi0("message_arrow_right_outline_24")
    public static final AtumVkuiLocalImageDto MESSAGE_ARROW_RIGHT_OUTLINE_24 = new AtumVkuiLocalImageDto("MESSAGE_ARROW_RIGHT_OUTLINE_24", 678, "message_arrow_right_outline_24");

    @pmi0("message_arrow_right_outline_28")
    public static final AtumVkuiLocalImageDto MESSAGE_ARROW_RIGHT_OUTLINE_28 = new AtumVkuiLocalImageDto("MESSAGE_ARROW_RIGHT_OUTLINE_28", 679, "message_arrow_right_outline_28");

    @pmi0("message_check_outline_28")
    public static final AtumVkuiLocalImageDto MESSAGE_CHECK_OUTLINE_28 = new AtumVkuiLocalImageDto("MESSAGE_CHECK_OUTLINE_28", 680, "message_check_outline_28");

    @pmi0("message_cross_12")
    public static final AtumVkuiLocalImageDto MESSAGE_CROSS_12 = new AtumVkuiLocalImageDto("MESSAGE_CROSS_12", 681, "message_cross_12");

    @pmi0("message_cross_16")
    public static final AtumVkuiLocalImageDto MESSAGE_CROSS_16 = new AtumVkuiLocalImageDto("MESSAGE_CROSS_16", 682, "message_cross_16");

    @pmi0("message_cross_outline_28")
    public static final AtumVkuiLocalImageDto MESSAGE_CROSS_OUTLINE_28 = new AtumVkuiLocalImageDto("MESSAGE_CROSS_OUTLINE_28", 683, "message_cross_outline_28");

    @pmi0("message_forward_outline_24")
    public static final AtumVkuiLocalImageDto MESSAGE_FORWARD_OUTLINE_24 = new AtumVkuiLocalImageDto("MESSAGE_FORWARD_OUTLINE_24", 684, "message_forward_outline_24");

    @pmi0("message_outline_20")
    public static final AtumVkuiLocalImageDto MESSAGE_OUTLINE_20 = new AtumVkuiLocalImageDto("MESSAGE_OUTLINE_20", 685, "message_outline_20");

    @pmi0("message_outline_24")
    public static final AtumVkuiLocalImageDto MESSAGE_OUTLINE_24 = new AtumVkuiLocalImageDto("MESSAGE_OUTLINE_24", 686, "message_outline_24");

    @pmi0("message_outline_28")
    public static final AtumVkuiLocalImageDto MESSAGE_OUTLINE_28 = new AtumVkuiLocalImageDto("MESSAGE_OUTLINE_28", 687, "message_outline_28");

    @pmi0("message_outline_shadow_28")
    public static final AtumVkuiLocalImageDto MESSAGE_OUTLINE_SHADOW_28 = new AtumVkuiLocalImageDto("MESSAGE_OUTLINE_SHADOW_28", 688, "message_outline_shadow_28");

    @pmi0("message_pin_outline_28")
    public static final AtumVkuiLocalImageDto MESSAGE_PIN_OUTLINE_28 = new AtumVkuiLocalImageDto("MESSAGE_PIN_OUTLINE_28", 689, "message_pin_outline_28");

    @pmi0("message_reaction_404_46")
    public static final AtumVkuiLocalImageDto MESSAGE_REACTION_404_46 = new AtumVkuiLocalImageDto("MESSAGE_REACTION_404_46", 690, "message_reaction_404_46");

    @pmi0("message_reaction_angry_512")
    public static final AtumVkuiLocalImageDto MESSAGE_REACTION_ANGRY_512 = new AtumVkuiLocalImageDto("MESSAGE_REACTION_ANGRY_512", 691, "message_reaction_angry_512");

    @pmi0("message_reaction_cry_512")
    public static final AtumVkuiLocalImageDto MESSAGE_REACTION_CRY_512 = new AtumVkuiLocalImageDto("MESSAGE_REACTION_CRY_512", 692, "message_reaction_cry_512");

    @pmi0("message_reaction_fire_512")
    public static final AtumVkuiLocalImageDto MESSAGE_REACTION_FIRE_512 = new AtumVkuiLocalImageDto("MESSAGE_REACTION_FIRE_512", 693, "message_reaction_fire_512");

    @pmi0("message_reaction_heart_512")
    public static final AtumVkuiLocalImageDto MESSAGE_REACTION_HEART_512 = new AtumVkuiLocalImageDto("MESSAGE_REACTION_HEART_512", 694, "message_reaction_heart_512");

    @pmi0("message_reaction_laugh_512")
    public static final AtumVkuiLocalImageDto MESSAGE_REACTION_LAUGH_512 = new AtumVkuiLocalImageDto("MESSAGE_REACTION_LAUGH_512", 695, "message_reaction_laugh_512");

    @pmi0("message_reaction_like_512")
    public static final AtumVkuiLocalImageDto MESSAGE_REACTION_LIKE_512 = new AtumVkuiLocalImageDto("MESSAGE_REACTION_LIKE_512", 696, "message_reaction_like_512");

    @pmi0("message_reaction_poop_512")
    public static final AtumVkuiLocalImageDto MESSAGE_REACTION_POOP_512 = new AtumVkuiLocalImageDto("MESSAGE_REACTION_POOP_512", 697, "message_reaction_poop_512");

    @pmi0("message_reaction_questions_512")
    public static final AtumVkuiLocalImageDto MESSAGE_REACTION_QUESTIONS_512 = new AtumVkuiLocalImageDto("MESSAGE_REACTION_QUESTIONS_512", 698, "message_reaction_questions_512");

    @pmi0("message_reply_outline_28")
    public static final AtumVkuiLocalImageDto MESSAGE_REPLY_OUTLINE_28 = new AtumVkuiLocalImageDto("MESSAGE_REPLY_OUTLINE_28", 699, "message_reply_outline_28");

    @pmi0("message_text_outline_20")
    public static final AtumVkuiLocalImageDto MESSAGE_TEXT_OUTLINE_20 = new AtumVkuiLocalImageDto("MESSAGE_TEXT_OUTLINE_20", IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED, "message_text_outline_20");

    @pmi0("message_text_outline_28")
    public static final AtumVkuiLocalImageDto MESSAGE_TEXT_OUTLINE_28 = new AtumVkuiLocalImageDto("MESSAGE_TEXT_OUTLINE_28", IronSourceError.ERROR_NT_LOAD_AFTER_LONG_INITIATION, "message_text_outline_28");

    @pmi0("message_unread_circle_fill_red_28")
    public static final AtumVkuiLocalImageDto MESSAGE_UNREAD_CIRCLE_FILL_RED_28 = new AtumVkuiLocalImageDto("MESSAGE_UNREAD_CIRCLE_FILL_RED_28", IronSourceError.ERROR_NT_INIT_FAILED_AFTER_LOAD, "message_unread_circle_fill_red_28");

    @pmi0("message_unread_outline_24")
    public static final AtumVkuiLocalImageDto MESSAGE_UNREAD_OUTLINE_24 = new AtumVkuiLocalImageDto("MESSAGE_UNREAD_OUTLINE_24", 703, "message_unread_outline_24");

    @pmi0("message_unread_top_outline_20")
    public static final AtumVkuiLocalImageDto MESSAGE_UNREAD_TOP_OUTLINE_20 = new AtumVkuiLocalImageDto("MESSAGE_UNREAD_TOP_OUTLINE_20", 704, "message_unread_top_outline_20");

    @pmi0("message_unread_top_outline_24")
    public static final AtumVkuiLocalImageDto MESSAGE_UNREAD_TOP_OUTLINE_24 = new AtumVkuiLocalImageDto("MESSAGE_UNREAD_TOP_OUTLINE_24", IronSourceError.ERROR_NT_LOAD_EXCEPTION, "message_unread_top_outline_24");

    @pmi0("messages_outline_20")
    public static final AtumVkuiLocalImageDto MESSAGES_OUTLINE_20 = new AtumVkuiLocalImageDto("MESSAGES_OUTLINE_20", IronSourceError.ERROR_NT_LOAD_NO_FILL, "messages_outline_20");

    @pmi0("messages_outline_24")
    public static final AtumVkuiLocalImageDto MESSAGES_OUTLINE_24 = new AtumVkuiLocalImageDto("MESSAGES_OUTLINE_24", IronSourceError.ERROR_NT_INSTANCE_INIT_TIMEOUT, "messages_outline_24");

    @pmi0("messages_outline_28")
    public static final AtumVkuiLocalImageDto MESSAGES_OUTLINE_28 = new AtumVkuiLocalImageDto("MESSAGES_OUTLINE_28", 708, "messages_outline_28");

    @pmi0("messages_outline_56")
    public static final AtumVkuiLocalImageDto MESSAGES_OUTLINE_56 = new AtumVkuiLocalImageDto("MESSAGES_OUTLINE_56", 709, "messages_outline_56");

    @pmi0("mic_slash_outline_28")
    public static final AtumVkuiLocalImageDto MIC_SLASH_OUTLINE_28 = new AtumVkuiLocalImageDto("MIC_SLASH_OUTLINE_28", 710, "mic_slash_outline_28");

    @pmi0("microphone_16")
    public static final AtumVkuiLocalImageDto MICROPHONE_16 = new AtumVkuiLocalImageDto("MICROPHONE_16", IronSourceError.ERROR_NT_INSTANCE_LOAD_EMPTY_ADAPTER, "microphone_16");

    @pmi0("microphone_2_slash_outline_28")
    public static final AtumVkuiLocalImageDto MICROPHONE_2_SLASH_OUTLINE_28 = new AtumVkuiLocalImageDto("MICROPHONE_2_SLASH_OUTLINE_28", IronSourceError.ERROR_NT_INSTANCE_INIT_EXCEPTION, "microphone_2_slash_outline_28");

    @pmi0("microphone_outline_56")
    public static final AtumVkuiLocalImageDto MICROPHONE_OUTLINE_56 = new AtumVkuiLocalImageDto("MICROPHONE_OUTLINE_56", 713, "microphone_outline_56");

    @pmi0("microphone_part_outline_28")
    public static final AtumVkuiLocalImageDto MICROPHONE_PART_OUTLINE_28 = new AtumVkuiLocalImageDto("MICROPHONE_PART_OUTLINE_28", 714, "microphone_part_outline_28");

    @pmi0("microphone_slash_16")
    public static final AtumVkuiLocalImageDto MICROPHONE_SLASH_16 = new AtumVkuiLocalImageDto("MICROPHONE_SLASH_16", IronSourceError.ERROR_NT_LOAD_NO_CONFIG, "microphone_slash_16");

    @pmi0("microphone_slash_24")
    public static final AtumVkuiLocalImageDto MICROPHONE_SLASH_24 = new AtumVkuiLocalImageDto("MICROPHONE_SLASH_24", 716, "microphone_slash_24");

    @pmi0("microphone_slash_outline_24")
    public static final AtumVkuiLocalImageDto MICROPHONE_SLASH_OUTLINE_24 = new AtumVkuiLocalImageDto("MICROPHONE_SLASH_OUTLINE_24", 717, "microphone_slash_outline_24");

    @pmi0("microphone_slash_outline_28")
    public static final AtumVkuiLocalImageDto MICROPHONE_SLASH_OUTLINE_28 = new AtumVkuiLocalImageDto("MICROPHONE_SLASH_OUTLINE_28", IronSourceError.ERROR_NT_INSTANCE_LOAD_EMPTY_SERVER_DATA, "microphone_slash_outline_28");

    @pmi0("microphone_slash_outline_color_28")
    public static final AtumVkuiLocalImageDto MICROPHONE_SLASH_OUTLINE_COLOR_28 = new AtumVkuiLocalImageDto("MICROPHONE_SLASH_OUTLINE_COLOR_28", 719, "microphone_slash_outline_color_28");

    @pmi0("microphone_videocam_outline_28")
    public static final AtumVkuiLocalImageDto MICROPHONE_VIDEOCAM_OUTLINE_28 = new AtumVkuiLocalImageDto("MICROPHONE_VIDEOCAM_OUTLINE_28", PublisherConfiguration.DEFAULT_MAX_RES, "microphone_videocam_outline_28");

    @pmi0("microphone_videocam_slash_outline_28")
    public static final AtumVkuiLocalImageDto MICROPHONE_VIDEOCAM_SLASH_OUTLINE_28 = new AtumVkuiLocalImageDto("MICROPHONE_VIDEOCAM_SLASH_OUTLINE_28", 721, "microphone_videocam_slash_outline_28");

    @pmi0("minus_16")
    public static final AtumVkuiLocalImageDto MINUS_16 = new AtumVkuiLocalImageDto("MINUS_16", 722, "minus_16");

    @pmi0("minus_square_outline_28")
    public static final AtumVkuiLocalImageDto MINUS_SQUARE_OUTLINE_28 = new AtumVkuiLocalImageDto("MINUS_SQUARE_OUTLINE_28", 723, "minus_square_outline_28");

    @pmi0("money_circle_outline_24")
    public static final AtumVkuiLocalImageDto MONEY_CIRCLE_OUTLINE_24 = new AtumVkuiLocalImageDto("MONEY_CIRCLE_OUTLINE_24", 724, "money_circle_outline_24");

    @pmi0("money_transfer_outline_24")
    public static final AtumVkuiLocalImageDto MONEY_TRANSFER_OUTLINE_24 = new AtumVkuiLocalImageDto("MONEY_TRANSFER_OUTLINE_24", 725, "money_transfer_outline_24");

    @pmi0("money_transfer_outline_32")
    public static final AtumVkuiLocalImageDto MONEY_TRANSFER_OUTLINE_32 = new AtumVkuiLocalImageDto("MONEY_TRANSFER_OUTLINE_32", 726, "money_transfer_outline_32");

    @pmi0("money_wad_outline_28")
    public static final AtumVkuiLocalImageDto MONEY_WAD_OUTLINE_28 = new AtumVkuiLocalImageDto("MONEY_WAD_OUTLINE_28", 727, "money_wad_outline_28");

    @pmi0("moon_24")
    public static final AtumVkuiLocalImageDto MOON_24 = new AtumVkuiLocalImageDto("MOON_24", 728, "moon_24");

    @pmi0("moon_outline_28")
    public static final AtumVkuiLocalImageDto MOON_OUTLINE_28 = new AtumVkuiLocalImageDto("MOON_OUTLINE_28", 729, "moon_outline_28");

    @pmi0("more_20")
    public static final AtumVkuiLocalImageDto MORE_20 = new AtumVkuiLocalImageDto("MORE_20", 730, "more_20");

    @pmi0("more_horizontal_24")
    public static final AtumVkuiLocalImageDto MORE_HORIZONTAL_24 = new AtumVkuiLocalImageDto("MORE_HORIZONTAL_24", 731, "more_horizontal_24");

    @pmi0("more_horizontal_28")
    public static final AtumVkuiLocalImageDto MORE_HORIZONTAL_28 = new AtumVkuiLocalImageDto("MORE_HORIZONTAL_28", 732, "more_horizontal_28");

    @pmi0("more_horizontal_shadow_medium_48")
    public static final AtumVkuiLocalImageDto MORE_HORIZONTAL_SHADOW_MEDIUM_48 = new AtumVkuiLocalImageDto("MORE_HORIZONTAL_SHADOW_MEDIUM_48", 733, "more_horizontal_shadow_medium_48");

    @pmi0("more_vertical_16")
    public static final AtumVkuiLocalImageDto MORE_VERTICAL_16 = new AtumVkuiLocalImageDto("MORE_VERTICAL_16", 734, "more_vertical_16");

    @pmi0("more_vertical_24")
    public static final AtumVkuiLocalImageDto MORE_VERTICAL_24 = new AtumVkuiLocalImageDto("MORE_VERTICAL_24", 735, "more_vertical_24");

    @pmi0("motorcycle_outline_24")
    public static final AtumVkuiLocalImageDto MOTORCYCLE_OUTLINE_24 = new AtumVkuiLocalImageDto("MOTORCYCLE_OUTLINE_24", 736, "motorcycle_outline_24");

    @pmi0("music_16")
    public static final AtumVkuiLocalImageDto MUSIC_16 = new AtumVkuiLocalImageDto("MUSIC_16", 737, "music_16");

    @pmi0("music_mic_outline_24")
    public static final AtumVkuiLocalImageDto MUSIC_MIC_OUTLINE_24 = new AtumVkuiLocalImageDto("MUSIC_MIC_OUTLINE_24", 738, "music_mic_outline_24");

    @pmi0("music_mic_outline_28")
    public static final AtumVkuiLocalImageDto MUSIC_MIC_OUTLINE_28 = new AtumVkuiLocalImageDto("MUSIC_MIC_OUTLINE_28", 739, "music_mic_outline_28");

    @pmi0("music_mic_outline_36")
    public static final AtumVkuiLocalImageDto MUSIC_MIC_OUTLINE_36 = new AtumVkuiLocalImageDto("MUSIC_MIC_OUTLINE_36", 740, "music_mic_outline_36");

    @pmi0("music_mic_outline_56")
    public static final AtumVkuiLocalImageDto MUSIC_MIC_OUTLINE_56 = new AtumVkuiLocalImageDto("MUSIC_MIC_OUTLINE_56", 741, "music_mic_outline_56");

    @pmi0("music_note_12")
    public static final AtumVkuiLocalImageDto MUSIC_NOTE_12 = new AtumVkuiLocalImageDto("MUSIC_NOTE_12", 742, "music_note_12");

    @pmi0("music_note_wave_outline_24")
    public static final AtumVkuiLocalImageDto MUSIC_NOTE_WAVE_OUTLINE_24 = new AtumVkuiLocalImageDto("MUSIC_NOTE_WAVE_OUTLINE_24", 743, "music_note_wave_outline_24");

    @pmi0("music_note_wave_outline_28")
    public static final AtumVkuiLocalImageDto MUSIC_NOTE_WAVE_OUTLINE_28 = new AtumVkuiLocalImageDto("MUSIC_NOTE_WAVE_OUTLINE_28", 744, "music_note_wave_outline_28");

    @pmi0("music_outline_16")
    public static final AtumVkuiLocalImageDto MUSIC_OUTLINE_16 = new AtumVkuiLocalImageDto("MUSIC_OUTLINE_16", 745, "music_outline_16");

    @pmi0("music_outline_20")
    public static final AtumVkuiLocalImageDto MUSIC_OUTLINE_20 = new AtumVkuiLocalImageDto("MUSIC_OUTLINE_20", 746, "music_outline_20");

    @pmi0("music_outline_24")
    public static final AtumVkuiLocalImageDto MUSIC_OUTLINE_24 = new AtumVkuiLocalImageDto("MUSIC_OUTLINE_24", 747, "music_outline_24");

    @pmi0("music_outline_28")
    public static final AtumVkuiLocalImageDto MUSIC_OUTLINE_28 = new AtumVkuiLocalImageDto("MUSIC_OUTLINE_28", 748, "music_outline_28");

    @pmi0("music_outline_56")
    public static final AtumVkuiLocalImageDto MUSIC_OUTLINE_56 = new AtumVkuiLocalImageDto("MUSIC_OUTLINE_56", 749, "music_outline_56");

    @pmi0("music_outline_shadow_28")
    public static final AtumVkuiLocalImageDto MUSIC_OUTLINE_SHADOW_28 = new AtumVkuiLocalImageDto("MUSIC_OUTLINE_SHADOW_28", UnityAdsConstants.AdOperations.GET_TOKEN_TIMEOUT_MS, "music_outline_shadow_28");

    @pmi0("mute_cross_16")
    public static final AtumVkuiLocalImageDto MUTE_CROSS_16 = new AtumVkuiLocalImageDto("MUTE_CROSS_16", 751, "mute_cross_16");

    @pmi0("mute_outline_24")
    public static final AtumVkuiLocalImageDto MUTE_OUTLINE_24 = new AtumVkuiLocalImageDto("MUTE_OUTLINE_24", 752, "mute_outline_24");

    @pmi0("mute_outline_28")
    public static final AtumVkuiLocalImageDto MUTE_OUTLINE_28 = new AtumVkuiLocalImageDto("MUTE_OUTLINE_28", 753, "mute_outline_28");

    @pmi0("muted_16")
    public static final AtumVkuiLocalImageDto MUTED_16 = new AtumVkuiLocalImageDto("MUTED_16", 754, "muted_16");

    @pmi0("narrative_active_outline_12")
    public static final AtumVkuiLocalImageDto NARRATIVE_ACTIVE_OUTLINE_12 = new AtumVkuiLocalImageDto("NARRATIVE_ACTIVE_OUTLINE_12", 755, "narrative_active_outline_12");

    @pmi0("narrative_active_outline_28")
    public static final AtumVkuiLocalImageDto NARRATIVE_ACTIVE_OUTLINE_28 = new AtumVkuiLocalImageDto("NARRATIVE_ACTIVE_OUTLINE_28", 756, "narrative_active_outline_28");

    @pmi0("narrative_outline_20")
    public static final AtumVkuiLocalImageDto NARRATIVE_OUTLINE_20 = new AtumVkuiLocalImageDto("NARRATIVE_OUTLINE_20", 757, "narrative_outline_20");

    @pmi0("narrative_outline_24")
    public static final AtumVkuiLocalImageDto NARRATIVE_OUTLINE_24 = new AtumVkuiLocalImageDto("NARRATIVE_OUTLINE_24", 758, "narrative_outline_24");

    @pmi0("narrative_outline_28")
    public static final AtumVkuiLocalImageDto NARRATIVE_OUTLINE_28 = new AtumVkuiLocalImageDto("NARRATIVE_OUTLINE_28", 759, "narrative_outline_28");

    @pmi0("new_16")
    public static final AtumVkuiLocalImageDto NEW_16 = new AtumVkuiLocalImageDto("NEW_16", 760, "new_16");

    @pmi0("new_badge_rounded_24")
    public static final AtumVkuiLocalImageDto NEW_BADGE_ROUNDED_24 = new AtumVkuiLocalImageDto("NEW_BADGE_ROUNDED_24", 761, "new_badge_rounded_24");

    @pmi0("new_logo_vk_16")
    public static final AtumVkuiLocalImageDto NEW_LOGO_VK_16 = new AtumVkuiLocalImageDto("NEW_LOGO_VK_16", CronetStatsLog.CRONET_ENGINE_BUILDER_INITIALIZED, "new_logo_vk_16");

    @pmi0("news_color_28")
    public static final AtumVkuiLocalImageDto NEWS_COLOR_28 = new AtumVkuiLocalImageDto("NEWS_COLOR_28", 763, "news_color_28");

    @pmi0("newsfeed_24")
    public static final AtumVkuiLocalImageDto NEWSFEED_24 = new AtumVkuiLocalImageDto("NEWSFEED_24", CronetStatsLog.CRONET_INITIALIZED, "newsfeed_24");

    @pmi0("newsfeed_music_note_outline_28")
    public static final AtumVkuiLocalImageDto NEWSFEED_MUSIC_NOTE_OUTLINE_28 = new AtumVkuiLocalImageDto("NEWSFEED_MUSIC_NOTE_OUTLINE_28", 765, "newsfeed_music_note_outline_28");

    @pmi0("newsfeed_outline_24")
    public static final AtumVkuiLocalImageDto NEWSFEED_OUTLINE_24 = new AtumVkuiLocalImageDto("NEWSFEED_OUTLINE_24", 766, "newsfeed_outline_24");

    @pmi0("newsfeed_outline_28")
    public static final AtumVkuiLocalImageDto NEWSFEED_OUTLINE_28 = new AtumVkuiLocalImageDto("NEWSFEED_OUTLINE_28", 767, "newsfeed_outline_28");

    @pmi0("newsfeed_outline_56")
    public static final AtumVkuiLocalImageDto NEWSFEED_OUTLINE_56 = new AtumVkuiLocalImageDto("NEWSFEED_OUTLINE_56", Tensorflow.FRAME_HEIGHT, "newsfeed_outline_56");

    @pmi0("note_24")
    public static final AtumVkuiLocalImageDto NOTE_24 = new AtumVkuiLocalImageDto("NOTE_24", 769, "note_24");

    @pmi0("note_pen_outline_56")
    public static final AtumVkuiLocalImageDto NOTE_PEN_OUTLINE_56 = new AtumVkuiLocalImageDto("NOTE_PEN_OUTLINE_56", 770, "note_pen_outline_56");

    @pmi0("notebook_16")
    public static final AtumVkuiLocalImageDto NOTEBOOK_16 = new AtumVkuiLocalImageDto("NOTEBOOK_16", 771, "notebook_16");

    @pmi0("notebook_add_badge_outline_28")
    public static final AtumVkuiLocalImageDto NOTEBOOK_ADD_BADGE_OUTLINE_28 = new AtumVkuiLocalImageDto("NOTEBOOK_ADD_BADGE_OUTLINE_28", 772, "notebook_add_badge_outline_28");

    @pmi0("notebook_check_outline_20")
    public static final AtumVkuiLocalImageDto NOTEBOOK_CHECK_OUTLINE_20 = new AtumVkuiLocalImageDto("NOTEBOOK_CHECK_OUTLINE_20", 773, "notebook_check_outline_20");

    @pmi0("notebook_check_outline_24")
    public static final AtumVkuiLocalImageDto NOTEBOOK_CHECK_OUTLINE_24 = new AtumVkuiLocalImageDto("NOTEBOOK_CHECK_OUTLINE_24", 774, "notebook_check_outline_24");

    @pmi0("notebook_check_outline_28")
    public static final AtumVkuiLocalImageDto NOTEBOOK_CHECK_OUTLINE_28 = new AtumVkuiLocalImageDto("NOTEBOOK_CHECK_OUTLINE_28", 775, "notebook_check_outline_28");

    @pmi0("notebook_check_outline_36")
    public static final AtumVkuiLocalImageDto NOTEBOOK_CHECK_OUTLINE_36 = new AtumVkuiLocalImageDto("NOTEBOOK_CHECK_OUTLINE_36", 776, "notebook_check_outline_36");

    @pmi0("notebook_check_outline_56")
    public static final AtumVkuiLocalImageDto NOTEBOOK_CHECK_OUTLINE_56 = new AtumVkuiLocalImageDto("NOTEBOOK_CHECK_OUTLINE_56", 777, "notebook_check_outline_56");

    @pmi0("notification_add_outline_28")
    public static final AtumVkuiLocalImageDto NOTIFICATION_ADD_OUTLINE_28 = new AtumVkuiLocalImageDto("NOTIFICATION_ADD_OUTLINE_28", 778, "notification_add_outline_28");

    @pmi0("notification_check_outline_28")
    public static final AtumVkuiLocalImageDto NOTIFICATION_CHECK_OUTLINE_28 = new AtumVkuiLocalImageDto("NOTIFICATION_CHECK_OUTLINE_28", 779, "notification_check_outline_28");

    @pmi0("notification_disable_outline_28")
    public static final AtumVkuiLocalImageDto NOTIFICATION_DISABLE_OUTLINE_28 = new AtumVkuiLocalImageDto("NOTIFICATION_DISABLE_OUTLINE_28", 780, "notification_disable_outline_28");

    @pmi0("notification_outline_20")
    public static final AtumVkuiLocalImageDto NOTIFICATION_OUTLINE_20 = new AtumVkuiLocalImageDto("NOTIFICATION_OUTLINE_20", 781, "notification_outline_20");

    @pmi0("notification_outline_24")
    public static final AtumVkuiLocalImageDto NOTIFICATION_OUTLINE_24 = new AtumVkuiLocalImageDto("NOTIFICATION_OUTLINE_24", 782, "notification_outline_24");

    @pmi0("notification_outline_56")
    public static final AtumVkuiLocalImageDto NOTIFICATION_OUTLINE_56 = new AtumVkuiLocalImageDto("NOTIFICATION_OUTLINE_56", 783, "notification_outline_56");

    @pmi0("notification_slash_outline_20")
    public static final AtumVkuiLocalImageDto NOTIFICATION_SLASH_OUTLINE_20 = new AtumVkuiLocalImageDto("NOTIFICATION_SLASH_OUTLINE_20", 784, "notification_slash_outline_20");

    @pmi0("notification_slash_outline_24")
    public static final AtumVkuiLocalImageDto NOTIFICATION_SLASH_OUTLINE_24 = new AtumVkuiLocalImageDto("NOTIFICATION_SLASH_OUTLINE_24", 785, "notification_slash_outline_24");

    @pmi0("notification_waves_16")
    public static final AtumVkuiLocalImageDto NOTIFICATION_WAVES_16 = new AtumVkuiLocalImageDto("NOTIFICATION_WAVES_16", 786, "notification_waves_16");

    @pmi0("notification_waves_20")
    public static final AtumVkuiLocalImageDto NOTIFICATION_WAVES_20 = new AtumVkuiLocalImageDto("NOTIFICATION_WAVES_20", 787, "notification_waves_20");

    @pmi0("notification_waves_28")
    public static final AtumVkuiLocalImageDto NOTIFICATION_WAVES_28 = new AtumVkuiLocalImageDto("NOTIFICATION_WAVES_28", 788, "notification_waves_28");

    @pmi0("notifications_28")
    public static final AtumVkuiLocalImageDto NOTIFICATIONS_28 = new AtumVkuiLocalImageDto("NOTIFICATIONS_28", 789, "notifications_28");

    @pmi0("onboarding_awards_banner_78h")
    public static final AtumVkuiLocalImageDto ONBOARDING_AWARDS_BANNER_78H = new AtumVkuiLocalImageDto("ONBOARDING_AWARDS_BANNER_78H", 790, "onboarding_awards_banner_78h");

    @pmi0("onboarding_awards_modal_160h")
    public static final AtumVkuiLocalImageDto ONBOARDING_AWARDS_MODAL_160H = new AtumVkuiLocalImageDto("ONBOARDING_AWARDS_MODAL_160H", 791, "onboarding_awards_modal_160h");

    @pmi0("online_mobile_12")
    public static final AtumVkuiLocalImageDto ONLINE_MOBILE_12 = new AtumVkuiLocalImageDto("ONLINE_MOBILE_12", 792, "online_mobile_12");

    @pmi0("online_mobile_16")
    public static final AtumVkuiLocalImageDto ONLINE_MOBILE_16 = new AtumVkuiLocalImageDto("ONLINE_MOBILE_16", 793, "online_mobile_16");

    @pmi0("palette_outline_24")
    public static final AtumVkuiLocalImageDto PALETTE_OUTLINE_24 = new AtumVkuiLocalImageDto("PALETTE_OUTLINE_24", 794, "palette_outline_24");

    @pmi0("palette_outline_56")
    public static final AtumVkuiLocalImageDto PALETTE_OUTLINE_56 = new AtumVkuiLocalImageDto("PALETTE_OUTLINE_56", 795, "palette_outline_56");

    @pmi0("pause_16")
    public static final AtumVkuiLocalImageDto PAUSE_16 = new AtumVkuiLocalImageDto("PAUSE_16", 796, "pause_16");

    @pmi0("pause_20")
    public static final AtumVkuiLocalImageDto PAUSE_20 = new AtumVkuiLocalImageDto("PAUSE_20", 797, "pause_20");

    @pmi0("pause_24")
    public static final AtumVkuiLocalImageDto PAUSE_24 = new AtumVkuiLocalImageDto("PAUSE_24", 798, "pause_24");

    @pmi0("pause_28")
    public static final AtumVkuiLocalImageDto PAUSE_28 = new AtumVkuiLocalImageDto("PAUSE_28", 799, "pause_28");

    @pmi0("pause_32")
    public static final AtumVkuiLocalImageDto PAUSE_32 = new AtumVkuiLocalImageDto("PAUSE_32", 800, "pause_32");

    @pmi0("pause_36")
    public static final AtumVkuiLocalImageDto PAUSE_36 = new AtumVkuiLocalImageDto("PAUSE_36", ApiInvocationException.ErrorCodes.CHAT_PARTICIPANTS_EMPTY_BLOCKED_USERS, "pause_36");

    @pmi0("pause_button_64")
    public static final AtumVkuiLocalImageDto PAUSE_BUTTON_64 = new AtumVkuiLocalImageDto("PAUSE_BUTTON_64", 802, "pause_button_64");

    @pmi0("pause_outline_28")
    public static final AtumVkuiLocalImageDto PAUSE_OUTLINE_28 = new AtumVkuiLocalImageDto("PAUSE_OUTLINE_28", 803, "pause_outline_28");

    @pmi0("paw_outline_28")
    public static final AtumVkuiLocalImageDto PAW_OUTLINE_28 = new AtumVkuiLocalImageDto("PAW_OUTLINE_28", 804, "paw_outline_28");

    @pmi0("payment_card_outline_16")
    public static final AtumVkuiLocalImageDto PAYMENT_CARD_OUTLINE_16 = new AtumVkuiLocalImageDto("PAYMENT_CARD_OUTLINE_16", 805, "payment_card_outline_16");

    @pmi0("payment_card_outline_20")
    public static final AtumVkuiLocalImageDto PAYMENT_CARD_OUTLINE_20 = new AtumVkuiLocalImageDto("PAYMENT_CARD_OUTLINE_20", 806, "payment_card_outline_20");

    @pmi0("payment_card_outline_24")
    public static final AtumVkuiLocalImageDto PAYMENT_CARD_OUTLINE_24 = new AtumVkuiLocalImageDto("PAYMENT_CARD_OUTLINE_24", 807, "payment_card_outline_24");

    @pmi0("payment_card_outline_28")
    public static final AtumVkuiLocalImageDto PAYMENT_CARD_OUTLINE_28 = new AtumVkuiLocalImageDto("PAYMENT_CARD_OUTLINE_28", 808, "payment_card_outline_28");

    @pmi0("pen_outline_24")
    public static final AtumVkuiLocalImageDto PEN_OUTLINE_24 = new AtumVkuiLocalImageDto("PEN_OUTLINE_24", 809, "pen_outline_24");

    @pmi0("pen_stack_outline_28")
    public static final AtumVkuiLocalImageDto PEN_STACK_OUTLINE_28 = new AtumVkuiLocalImageDto("PEN_STACK_OUTLINE_28", 810, "pen_stack_outline_28");

    @pmi0("pencil_12")
    public static final AtumVkuiLocalImageDto PENCIL_12 = new AtumVkuiLocalImageDto("PENCIL_12", 811, "pencil_12");

    @pmi0("phone_16")
    public static final AtumVkuiLocalImageDto PHONE_16 = new AtumVkuiLocalImageDto("PHONE_16", 812, "phone_16");

    @pmi0("phone_24")
    public static final AtumVkuiLocalImageDto PHONE_24 = new AtumVkuiLocalImageDto("PHONE_24", 813, "phone_24");

    @pmi0("phone_add_outline_28")
    public static final AtumVkuiLocalImageDto PHONE_ADD_OUTLINE_28 = new AtumVkuiLocalImageDto("PHONE_ADD_OUTLINE_28", 814, "phone_add_outline_28");

    @pmi0("phone_circle_fill_green_20")
    public static final AtumVkuiLocalImageDto PHONE_CIRCLE_FILL_GREEN_20 = new AtumVkuiLocalImageDto("PHONE_CIRCLE_FILL_GREEN_20", 815, "phone_circle_fill_green_20");

    @pmi0("phone_cross_outline_28")
    public static final AtumVkuiLocalImageDto PHONE_CROSS_OUTLINE_28 = new AtumVkuiLocalImageDto("PHONE_CROSS_OUTLINE_28", 816, "phone_cross_outline_28");

    @pmi0("phone_down_20")
    public static final AtumVkuiLocalImageDto PHONE_DOWN_20 = new AtumVkuiLocalImageDto("PHONE_DOWN_20", 817, "phone_down_20");

    @pmi0("phone_down_filled_28")
    public static final AtumVkuiLocalImageDto PHONE_DOWN_FILLED_28 = new AtumVkuiLocalImageDto("PHONE_DOWN_FILLED_28", 818, "phone_down_filled_28");

    @pmi0("phone_down_outline_56")
    public static final AtumVkuiLocalImageDto PHONE_DOWN_OUTLINE_56 = new AtumVkuiLocalImageDto("PHONE_DOWN_OUTLINE_56", 819, "phone_down_outline_56");

    @pmi0("phone_outline_20")
    public static final AtumVkuiLocalImageDto PHONE_OUTLINE_20 = new AtumVkuiLocalImageDto("PHONE_OUTLINE_20", 820, "phone_outline_20");

    @pmi0("phone_outline_24")
    public static final AtumVkuiLocalImageDto PHONE_OUTLINE_24 = new AtumVkuiLocalImageDto("PHONE_OUTLINE_24", 821, "phone_outline_24");

    @pmi0("phone_outline_28")
    public static final AtumVkuiLocalImageDto PHONE_OUTLINE_28 = new AtumVkuiLocalImageDto("PHONE_OUTLINE_28", 822, "phone_outline_28");

    @pmi0("phone_outline_56")
    public static final AtumVkuiLocalImageDto PHONE_OUTLINE_56 = new AtumVkuiLocalImageDto("PHONE_OUTLINE_56", 823, "phone_outline_56");

    @pmi0("phone_wave_outline_28")
    public static final AtumVkuiLocalImageDto PHONE_WAVE_OUTLINE_28 = new AtumVkuiLocalImageDto("PHONE_WAVE_OUTLINE_28", 824, "phone_wave_outline_28");

    @pmi0("photos_stack_outline_24")
    public static final AtumVkuiLocalImageDto PHOTOS_STACK_OUTLINE_24 = new AtumVkuiLocalImageDto("PHOTOS_STACK_OUTLINE_24", 825, "photos_stack_outline_24");

    @pmi0("picture_36")
    public static final AtumVkuiLocalImageDto PICTURE_36 = new AtumVkuiLocalImageDto("PICTURE_36", 826, "picture_36");

    @pmi0("picture_on_square_outline_20")
    public static final AtumVkuiLocalImageDto PICTURE_ON_SQUARE_OUTLINE_20 = new AtumVkuiLocalImageDto("PICTURE_ON_SQUARE_OUTLINE_20", 827, "picture_on_square_outline_20");

    @pmi0("picture_on_square_outline_shadow_28")
    public static final AtumVkuiLocalImageDto PICTURE_ON_SQUARE_OUTLINE_SHADOW_28 = new AtumVkuiLocalImageDto("PICTURE_ON_SQUARE_OUTLINE_SHADOW_28", 828, "picture_on_square_outline_shadow_28");

    @pmi0("picture_outline_20")
    public static final AtumVkuiLocalImageDto PICTURE_OUTLINE_20 = new AtumVkuiLocalImageDto("PICTURE_OUTLINE_20", 829, "picture_outline_20");

    @pmi0("picture_outline_24")
    public static final AtumVkuiLocalImageDto PICTURE_OUTLINE_24 = new AtumVkuiLocalImageDto("PICTURE_OUTLINE_24", 830, "picture_outline_24");

    @pmi0("picture_outline_28")
    public static final AtumVkuiLocalImageDto PICTURE_OUTLINE_28 = new AtumVkuiLocalImageDto("PICTURE_OUTLINE_28", 831, "picture_outline_28");

    @pmi0("picture_outline_32")
    public static final AtumVkuiLocalImageDto PICTURE_OUTLINE_32 = new AtumVkuiLocalImageDto("PICTURE_OUTLINE_32", 832, "picture_outline_32");

    @pmi0("picture_outline_48")
    public static final AtumVkuiLocalImageDto PICTURE_OUTLINE_48 = new AtumVkuiLocalImageDto("PICTURE_OUTLINE_48", 833, "picture_outline_48");

    @pmi0("picture_stack_outline_20")
    public static final AtumVkuiLocalImageDto PICTURE_STACK_OUTLINE_20 = new AtumVkuiLocalImageDto("PICTURE_STACK_OUTLINE_20", 834, "picture_stack_outline_20");

    @pmi0("picture_stack_outline_28")
    public static final AtumVkuiLocalImageDto PICTURE_STACK_OUTLINE_28 = new AtumVkuiLocalImageDto("PICTURE_STACK_OUTLINE_28", 835, "picture_stack_outline_28");

    @pmi0("pin_12")
    public static final AtumVkuiLocalImageDto PIN_12 = new AtumVkuiLocalImageDto("PIN_12", 836, "pin_12");

    @pmi0("pin_16")
    public static final AtumVkuiLocalImageDto PIN_16 = new AtumVkuiLocalImageDto("PIN_16", 837, "pin_16");

    @pmi0("pin_20")
    public static final AtumVkuiLocalImageDto PIN_20 = new AtumVkuiLocalImageDto("PIN_20", 838, "pin_20");

    @pmi0("pin_dot_16")
    public static final AtumVkuiLocalImageDto PIN_DOT_16 = new AtumVkuiLocalImageDto("PIN_DOT_16", 839, "pin_dot_16");

    @pmi0("pin_dot_outline_28")
    public static final AtumVkuiLocalImageDto PIN_DOT_OUTLINE_28 = new AtumVkuiLocalImageDto("PIN_DOT_OUTLINE_28", 840, "pin_dot_outline_28");

    @pmi0("pin_dot_slash_outline_28")
    public static final AtumVkuiLocalImageDto PIN_DOT_SLASH_OUTLINE_28 = new AtumVkuiLocalImageDto("PIN_DOT_SLASH_OUTLINE_28", 841, "pin_dot_slash_outline_28");

    @pmi0("pin_outline_20")
    public static final AtumVkuiLocalImageDto PIN_OUTLINE_20 = new AtumVkuiLocalImageDto("PIN_OUTLINE_20", 842, "pin_outline_20");

    @pmi0("pin_outline_24")
    public static final AtumVkuiLocalImageDto PIN_OUTLINE_24 = new AtumVkuiLocalImageDto("PIN_OUTLINE_24", 843, "pin_outline_24");

    @pmi0("pin_outline_28")
    public static final AtumVkuiLocalImageDto PIN_OUTLINE_28 = new AtumVkuiLocalImageDto("PIN_OUTLINE_28", 844, "pin_outline_28");

    @pmi0("pin_outline_shadow_28")
    public static final AtumVkuiLocalImageDto PIN_OUTLINE_SHADOW_28 = new AtumVkuiLocalImageDto("PIN_OUTLINE_SHADOW_28", 845, "pin_outline_shadow_28");

    @pmi0("pin_shadow_24")
    public static final AtumVkuiLocalImageDto PIN_SHADOW_24 = new AtumVkuiLocalImageDto("PIN_SHADOW_24", 846, "pin_shadow_24");

    @pmi0("pin_slash_outline_24")
    public static final AtumVkuiLocalImageDto PIN_SLASH_OUTLINE_24 = new AtumVkuiLocalImageDto("PIN_SLASH_OUTLINE_24", 847, "pin_slash_outline_24");

    @pmi0("place_12")
    public static final AtumVkuiLocalImageDto PLACE_12 = new AtumVkuiLocalImageDto("PLACE_12", 848, "place_12");

    @pmi0("place_16")
    public static final AtumVkuiLocalImageDto PLACE_16 = new AtumVkuiLocalImageDto("PLACE_16", 849, "place_16");

    @pmi0("place_24")
    public static final AtumVkuiLocalImageDto PLACE_24 = new AtumVkuiLocalImageDto("PLACE_24", 850, "place_24");

    @pmi0("place_outline_16")
    public static final AtumVkuiLocalImageDto PLACE_OUTLINE_16 = new AtumVkuiLocalImageDto("PLACE_OUTLINE_16", 851, "place_outline_16");

    @pmi0("place_outline_20")
    public static final AtumVkuiLocalImageDto PLACE_OUTLINE_20 = new AtumVkuiLocalImageDto("PLACE_OUTLINE_20", 852, "place_outline_20");

    @pmi0("place_outline_24")
    public static final AtumVkuiLocalImageDto PLACE_OUTLINE_24 = new AtumVkuiLocalImageDto("PLACE_OUTLINE_24", 853, "place_outline_24");

    @pmi0("place_outline_28")
    public static final AtumVkuiLocalImageDto PLACE_OUTLINE_28 = new AtumVkuiLocalImageDto("PLACE_OUTLINE_28", 854, "place_outline_28");

    @pmi0("place_outline_56")
    public static final AtumVkuiLocalImageDto PLACE_OUTLINE_56 = new AtumVkuiLocalImageDto("PLACE_OUTLINE_56", 855, "place_outline_56");

    @pmi0("plane_outline_28")
    public static final AtumVkuiLocalImageDto PLANE_OUTLINE_28 = new AtumVkuiLocalImageDto("PLANE_OUTLINE_28", 856, "plane_outline_28");

    @pmi0("play_12")
    public static final AtumVkuiLocalImageDto PLAY_12 = new AtumVkuiLocalImageDto("PLAY_12", 857, "play_12");

    @pmi0("play_16")
    public static final AtumVkuiLocalImageDto PLAY_16 = new AtumVkuiLocalImageDto("PLAY_16", 858, "play_16");

    @pmi0("play_20")
    public static final AtumVkuiLocalImageDto PLAY_20 = new AtumVkuiLocalImageDto("PLAY_20", 859, "play_20");

    @pmi0("play_24")
    public static final AtumVkuiLocalImageDto PLAY_24 = new AtumVkuiLocalImageDto("PLAY_24", 860, "play_24");

    @pmi0("play_28")
    public static final AtumVkuiLocalImageDto PLAY_28 = new AtumVkuiLocalImageDto("PLAY_28", 861, "play_28");

    @pmi0("play_32")
    public static final AtumVkuiLocalImageDto PLAY_32 = new AtumVkuiLocalImageDto("PLAY_32", 862, "play_32");

    @pmi0("play_36")
    public static final AtumVkuiLocalImageDto PLAY_36 = new AtumVkuiLocalImageDto("PLAY_36", 863, "play_36");

    @pmi0("play_button_56")
    public static final AtumVkuiLocalImageDto PLAY_BUTTON_56 = new AtumVkuiLocalImageDto("PLAY_BUTTON_56", 864, "play_button_56");

    @pmi0("play_button_64")
    public static final AtumVkuiLocalImageDto PLAY_BUTTON_64 = new AtumVkuiLocalImageDto("PLAY_BUTTON_64", 865, "play_button_64");

    @pmi0("play_circle_fill_gray_16")
    public static final AtumVkuiLocalImageDto PLAY_CIRCLE_FILL_GRAY_16 = new AtumVkuiLocalImageDto("PLAY_CIRCLE_FILL_GRAY_16", 866, "play_circle_fill_gray_16");

    @pmi0("play_circle_fill_red_28")
    public static final AtumVkuiLocalImageDto PLAY_CIRCLE_FILL_RED_28 = new AtumVkuiLocalImageDto("PLAY_CIRCLE_FILL_RED_28", 867, "play_circle_fill_red_28");

    @pmi0("play_circle_fill_steel_gray_20")
    public static final AtumVkuiLocalImageDto PLAY_CIRCLE_FILL_STEEL_GRAY_20 = new AtumVkuiLocalImageDto("PLAY_CIRCLE_FILL_STEEL_GRAY_20", 868, "play_circle_fill_steel_gray_20");

    @pmi0("play_next_24")
    public static final AtumVkuiLocalImageDto PLAY_NEXT_24 = new AtumVkuiLocalImageDto("PLAY_NEXT_24", 869, "play_next_24");

    @pmi0("play_next_outline_24")
    public static final AtumVkuiLocalImageDto PLAY_NEXT_OUTLINE_24 = new AtumVkuiLocalImageDto("PLAY_NEXT_OUTLINE_24", 870, "play_next_outline_24");

    @pmi0("play_rectangle_stack_outline_28")
    public static final AtumVkuiLocalImageDto PLAY_RECTANGLE_STACK_OUTLINE_28 = new AtumVkuiLocalImageDto("PLAY_RECTANGLE_STACK_OUTLINE_28", 871, "play_rectangle_stack_outline_28");

    @pmi0("play_speed_outline_28")
    public static final AtumVkuiLocalImageDto PLAY_SPEED_OUTLINE_28 = new AtumVkuiLocalImageDto("PLAY_SPEED_OUTLINE_28", 872, "play_speed_outline_28");

    @pmi0("playlist_24")
    public static final AtumVkuiLocalImageDto PLAYLIST_24 = new AtumVkuiLocalImageDto("PLAYLIST_24", 873, "playlist_24");

    @pmi0("playlist_outline_20")
    public static final AtumVkuiLocalImageDto PLAYLIST_OUTLINE_20 = new AtumVkuiLocalImageDto("PLAYLIST_OUTLINE_20", 874, "playlist_outline_20");

    @pmi0("playlist_outline_24")
    public static final AtumVkuiLocalImageDto PLAYLIST_OUTLINE_24 = new AtumVkuiLocalImageDto("PLAYLIST_OUTLINE_24", 875, "playlist_outline_24");

    @pmi0("playlist_outline_28")
    public static final AtumVkuiLocalImageDto PLAYLIST_OUTLINE_28 = new AtumVkuiLocalImageDto("PLAYLIST_OUTLINE_28", 876, "playlist_outline_28");

    @pmi0("playlist_outline_36")
    public static final AtumVkuiLocalImageDto PLAYLIST_OUTLINE_36 = new AtumVkuiLocalImageDto("PLAYLIST_OUTLINE_36", 877, "playlist_outline_36");

    @pmi0("playlist_outline_56")
    public static final AtumVkuiLocalImageDto PLAYLIST_OUTLINE_56 = new AtumVkuiLocalImageDto("PLAYLIST_OUTLINE_56", 878, "playlist_outline_56");

    @pmi0("podcast_24")
    public static final AtumVkuiLocalImageDto PODCAST_24 = new AtumVkuiLocalImageDto("PODCAST_24", 879, "podcast_24");

    @pmi0("podcast_outline_20")
    public static final AtumVkuiLocalImageDto PODCAST_OUTLINE_20 = new AtumVkuiLocalImageDto("PODCAST_OUTLINE_20", 880, "podcast_outline_20");

    @pmi0("podcast_outline_28")
    public static final AtumVkuiLocalImageDto PODCAST_OUTLINE_28 = new AtumVkuiLocalImageDto("PODCAST_OUTLINE_28", 881, "podcast_outline_28");

    @pmi0("podcast_outline_shadow_28")
    public static final AtumVkuiLocalImageDto PODCAST_OUTLINE_SHADOW_28 = new AtumVkuiLocalImageDto("PODCAST_OUTLINE_SHADOW_28", 882, "podcast_outline_shadow_28");

    @pmi0("podcasts_outline_36")
    public static final AtumVkuiLocalImageDto PODCASTS_OUTLINE_36 = new AtumVkuiLocalImageDto("PODCASTS_OUTLINE_36", 883, "podcasts_outline_36");

    @pmi0("poll_16")
    public static final AtumVkuiLocalImageDto POLL_16 = new AtumVkuiLocalImageDto("POLL_16", 884, "poll_16");

    @pmi0("poll_32")
    public static final AtumVkuiLocalImageDto POLL_32 = new AtumVkuiLocalImageDto("POLL_32", 885, "poll_32");

    @pmi0("poll_outline_20")
    public static final AtumVkuiLocalImageDto POLL_OUTLINE_20 = new AtumVkuiLocalImageDto("POLL_OUTLINE_20", 886, "poll_outline_20");

    @pmi0("poll_outline_24")
    public static final AtumVkuiLocalImageDto POLL_OUTLINE_24 = new AtumVkuiLocalImageDto("POLL_OUTLINE_24", 887, "poll_outline_24");

    @pmi0("poll_square_outline_28")
    public static final AtumVkuiLocalImageDto POLL_SQUARE_OUTLINE_28 = new AtumVkuiLocalImageDto("POLL_SQUARE_OUTLINE_28", 888, "poll_square_outline_28");

    @pmi0("pop_up_sticker_circle_fill_red_16")
    public static final AtumVkuiLocalImageDto POP_UP_STICKER_CIRCLE_FILL_RED_16 = new AtumVkuiLocalImageDto("POP_UP_STICKER_CIRCLE_FILL_RED_16", 889, "pop_up_sticker_circle_fill_red_16");

    @pmi0("pop_up_sticker_circle_fill_red_24")
    public static final AtumVkuiLocalImageDto POP_UP_STICKER_CIRCLE_FILL_RED_24 = new AtumVkuiLocalImageDto("POP_UP_STICKER_CIRCLE_FILL_RED_24", 890, "pop_up_sticker_circle_fill_red_24");

    @pmi0("pop_up_sticker_circle_fill_red_28")
    public static final AtumVkuiLocalImageDto POP_UP_STICKER_CIRCLE_FILL_RED_28 = new AtumVkuiLocalImageDto("POP_UP_STICKER_CIRCLE_FILL_RED_28", 891, "pop_up_sticker_circle_fill_red_28");

    @pmi0("privacy_24")
    public static final AtumVkuiLocalImageDto PRIVACY_24 = new AtumVkuiLocalImageDto("PRIVACY_24", 892, "privacy_24");

    @pmi0("privacy_circle_fill_red_20")
    public static final AtumVkuiLocalImageDto PRIVACY_CIRCLE_FILL_RED_20 = new AtumVkuiLocalImageDto("PRIVACY_CIRCLE_FILL_RED_20", 893, "privacy_circle_fill_red_20");

    @pmi0("privacy_outline_56")
    public static final AtumVkuiLocalImageDto PRIVACY_OUTLINE_56 = new AtumVkuiLocalImageDto("PRIVACY_OUTLINE_56", 894, "privacy_outline_56");

    @pmi0("prometey_circle_fill_red_20")
    public static final AtumVkuiLocalImageDto PROMETEY_CIRCLE_FILL_RED_20 = new AtumVkuiLocalImageDto("PROMETEY_CIRCLE_FILL_RED_20", 895, "prometey_circle_fill_red_20");

    @pmi0("prometey_circle_fill_red_32")
    public static final AtumVkuiLocalImageDto PROMETEY_CIRCLE_FILL_RED_32 = new AtumVkuiLocalImageDto("PROMETEY_CIRCLE_FILL_RED_32", 896, "prometey_circle_fill_red_32");

    @pmi0("qr_24")
    public static final AtumVkuiLocalImageDto QR_24 = new AtumVkuiLocalImageDto("QR_24", 897, "qr_24");

    @pmi0("qr_code_outline_28")
    public static final AtumVkuiLocalImageDto QR_CODE_OUTLINE_28 = new AtumVkuiLocalImageDto("QR_CODE_OUTLINE_28", 898, "qr_code_outline_28");

    @pmi0("question_12")
    public static final AtumVkuiLocalImageDto QUESTION_12 = new AtumVkuiLocalImageDto("QUESTION_12", 899, "question_12");

    @pmi0("question_24")
    public static final AtumVkuiLocalImageDto QUESTION_24 = new AtumVkuiLocalImageDto("QUESTION_24", 900, "question_24");

    @pmi0("question_outline_28")
    public static final AtumVkuiLocalImageDto QUESTION_OUTLINE_28 = new AtumVkuiLocalImageDto("QUESTION_OUTLINE_28", 901, "question_outline_28");

    @pmi0("question_outline_56")
    public static final AtumVkuiLocalImageDto QUESTION_OUTLINE_56 = new AtumVkuiLocalImageDto("QUESTION_OUTLINE_56", 902, "question_outline_56");

    @pmi0("radio_off_24")
    public static final AtumVkuiLocalImageDto RADIO_OFF_24 = new AtumVkuiLocalImageDto("RADIO_OFF_24", 903, "radio_off_24");

    @pmi0("radio_on_24")
    public static final AtumVkuiLocalImageDto RADIO_ON_24 = new AtumVkuiLocalImageDto("RADIO_ON_24", 904, "radio_on_24");

    @pmi0("radiowaves_around_outline_28")
    public static final AtumVkuiLocalImageDto RADIOWAVES_AROUND_OUTLINE_28 = new AtumVkuiLocalImageDto("RADIOWAVES_AROUND_OUTLINE_28", 905, "radiowaves_around_outline_28");

    @pmi0("radiowaves_around_outline_96")
    public static final AtumVkuiLocalImageDto RADIOWAVES_AROUND_OUTLINE_96 = new AtumVkuiLocalImageDto("RADIOWAVES_AROUND_OUTLINE_96", 906, "radiowaves_around_outline_96");

    @pmi0("radiowaves_left_and_right_outline_28")
    public static final AtumVkuiLocalImageDto RADIOWAVES_LEFT_AND_RIGHT_OUTLINE_28 = new AtumVkuiLocalImageDto("RADIOWAVES_LEFT_AND_RIGHT_OUTLINE_28", 907, "radiowaves_left_and_right_outline_28");

    @pmi0("reaction_like_color_16")
    public static final AtumVkuiLocalImageDto REACTION_LIKE_COLOR_16 = new AtumVkuiLocalImageDto("REACTION_LIKE_COLOR_16", 908, "reaction_like_color_16");

    @pmi0("recent_outline_20")
    public static final AtumVkuiLocalImageDto RECENT_OUTLINE_20 = new AtumVkuiLocalImageDto("RECENT_OUTLINE_20", 909, "recent_outline_20");

    @pmi0("recent_outline_28")
    public static final AtumVkuiLocalImageDto RECENT_OUTLINE_28 = new AtumVkuiLocalImageDto("RECENT_OUTLINE_28", 910, "recent_outline_28");

    @pmi0("recent_outline_56")
    public static final AtumVkuiLocalImageDto RECENT_OUTLINE_56 = new AtumVkuiLocalImageDto("RECENT_OUTLINE_56", 911, "recent_outline_56");

    @pmi0("recorder_tape_outline_28")
    public static final AtumVkuiLocalImageDto RECORDER_TAPE_OUTLINE_28 = new AtumVkuiLocalImageDto("RECORDER_TAPE_OUTLINE_28", 912, "recorder_tape_outline_28");

    @pmi0("recording_circle_fill_16")
    public static final AtumVkuiLocalImageDto RECORDING_CIRCLE_FILL_16 = new AtumVkuiLocalImageDto("RECORDING_CIRCLE_FILL_16", 913, "recording_circle_fill_16");

    @pmi0("recording_circle_fill_20")
    public static final AtumVkuiLocalImageDto RECORDING_CIRCLE_FILL_20 = new AtumVkuiLocalImageDto("RECORDING_CIRCLE_FILL_20", 914, "recording_circle_fill_20");

    @pmi0("rectangle_split_4_uneven_outline_28")
    public static final AtumVkuiLocalImageDto RECTANGLE_SPLIT_4_UNEVEN_OUTLINE_28 = new AtumVkuiLocalImageDto("RECTANGLE_SPLIT_4_UNEVEN_OUTLINE_28", 915, "rectangle_split_4_uneven_outline_28");

    @pmi0("rectangles_2_outline_24")
    public static final AtumVkuiLocalImageDto RECTANGLES_2_OUTLINE_24 = new AtumVkuiLocalImageDto("RECTANGLES_2_OUTLINE_24", 916, "rectangles_2_outline_24");

    @pmi0("rectrangle_hand_point_up_28")
    public static final AtumVkuiLocalImageDto RECTRANGLE_HAND_POINT_UP_28 = new AtumVkuiLocalImageDto("RECTRANGLE_HAND_POINT_UP_28", 917, "rectrangle_hand_point_up_28");

    @pmi0("refresh_outline_24")
    public static final AtumVkuiLocalImageDto REFRESH_OUTLINE_24 = new AtumVkuiLocalImageDto("REFRESH_OUTLINE_24", 918, "refresh_outline_24");

    @pmi0("refresh_outline_28")
    public static final AtumVkuiLocalImageDto REFRESH_OUTLINE_28 = new AtumVkuiLocalImageDto("REFRESH_OUTLINE_28", 919, "refresh_outline_28");

    @pmi0("remove_circle_24")
    public static final AtumVkuiLocalImageDto REMOVE_CIRCLE_24 = new AtumVkuiLocalImageDto("REMOVE_CIRCLE_24", 920, "remove_circle_24");

    @pmi0("remove_circle_outline_20")
    public static final AtumVkuiLocalImageDto REMOVE_CIRCLE_OUTLINE_20 = new AtumVkuiLocalImageDto("REMOVE_CIRCLE_OUTLINE_20", 921, "remove_circle_outline_20");

    @pmi0("remove_circle_outline_28")
    public static final AtumVkuiLocalImageDto REMOVE_CIRCLE_OUTLINE_28 = new AtumVkuiLocalImageDto("REMOVE_CIRCLE_OUTLINE_28", 922, "remove_circle_outline_28");

    @pmi0("repeat_1_outline_dot_24")
    public static final AtumVkuiLocalImageDto REPEAT_1_OUTLINE_DOT_24 = new AtumVkuiLocalImageDto("REPEAT_1_OUTLINE_DOT_24", 923, "repeat_1_outline_dot_24");

    @pmi0("repeat_outline_24")
    public static final AtumVkuiLocalImageDto REPEAT_OUTLINE_24 = new AtumVkuiLocalImageDto("REPEAT_OUTLINE_24", 924, "repeat_outline_24");

    @pmi0("repeat_outline_dot_24")
    public static final AtumVkuiLocalImageDto REPEAT_OUTLINE_DOT_24 = new AtumVkuiLocalImageDto("REPEAT_OUTLINE_DOT_24", 925, "repeat_outline_dot_24");

    @pmi0("replay_36")
    public static final AtumVkuiLocalImageDto REPLAY_36 = new AtumVkuiLocalImageDto("REPLAY_36", 926, "replay_36");

    @pmi0("reply_outline_24")
    public static final AtumVkuiLocalImageDto REPLY_OUTLINE_24 = new AtumVkuiLocalImageDto("REPLY_OUTLINE_24", 927, "reply_outline_24");

    @pmi0("reply_outline_28")
    public static final AtumVkuiLocalImageDto REPLY_OUTLINE_28 = new AtumVkuiLocalImageDto("REPLY_OUTLINE_28", PDF417Common.MAX_CODEWORDS_IN_BARCODE, "reply_outline_28");

    @pmi0("report_24")
    public static final AtumVkuiLocalImageDto REPORT_24 = new AtumVkuiLocalImageDto("REPORT_24", PDF417Common.NUMBER_OF_CODEWORDS, "report_24");

    @pmi0("report_outline_20")
    public static final AtumVkuiLocalImageDto REPORT_OUTLINE_20 = new AtumVkuiLocalImageDto("REPORT_OUTLINE_20", 930, "report_outline_20");

    @pmi0("report_outline_24")
    public static final AtumVkuiLocalImageDto REPORT_OUTLINE_24 = new AtumVkuiLocalImageDto("REPORT_OUTLINE_24", 931, "report_outline_24");

    @pmi0("report_outline_28")
    public static final AtumVkuiLocalImageDto REPORT_OUTLINE_28 = new AtumVkuiLocalImageDto("REPORT_OUTLINE_28", 932, "report_outline_28");

    @pmi0("repost_12")
    public static final AtumVkuiLocalImageDto REPOST_12 = new AtumVkuiLocalImageDto("REPOST_12", 933, "repost_12");

    @pmi0("repost_16")
    public static final AtumVkuiLocalImageDto REPOST_16 = new AtumVkuiLocalImageDto("REPOST_16", 934, "repost_16");

    @pmi0("repost_outline_16")
    public static final AtumVkuiLocalImageDto REPOST_OUTLINE_16 = new AtumVkuiLocalImageDto("REPOST_OUTLINE_16", 935, "repost_outline_16");

    @pmi0("robot_outline_24")
    public static final AtumVkuiLocalImageDto ROBOT_OUTLINE_24 = new AtumVkuiLocalImageDto("ROBOT_OUTLINE_24", 936, "robot_outline_24");

    @pmi0("rooms_pattern")
    public static final AtumVkuiLocalImageDto ROOMS_PATTERN = new AtumVkuiLocalImageDto("ROOMS_PATTERN", 937, "rooms_pattern");

    @pmi0("rss_feed_outline_28")
    public static final AtumVkuiLocalImageDto RSS_FEED_OUTLINE_28 = new AtumVkuiLocalImageDto("RSS_FEED_OUTLINE_28", 938, "rss_feed_outline_28");

    @pmi0("rude_message_outline_56")
    public static final AtumVkuiLocalImageDto RUDE_MESSAGE_OUTLINE_56 = new AtumVkuiLocalImageDto("RUDE_MESSAGE_OUTLINE_56", 939, "rude_message_outline_56");

    @pmi0("sad_face_outline_24")
    public static final AtumVkuiLocalImageDto SAD_FACE_OUTLINE_24 = new AtumVkuiLocalImageDto("SAD_FACE_OUTLINE_24", 940, "sad_face_outline_24");

    @pmi0("scan_viewfinder_outline_24")
    public static final AtumVkuiLocalImageDto SCAN_VIEWFINDER_OUTLINE_24 = new AtumVkuiLocalImageDto("SCAN_VIEWFINDER_OUTLINE_24", 941, "scan_viewfinder_outline_24");

    @pmi0("scan_viewfinder_outline_28")
    public static final AtumVkuiLocalImageDto SCAN_VIEWFINDER_OUTLINE_28 = new AtumVkuiLocalImageDto("SCAN_VIEWFINDER_OUTLINE_28", 942, "scan_viewfinder_outline_28");

    @pmi0("search_16")
    public static final AtumVkuiLocalImageDto SEARCH_16 = new AtumVkuiLocalImageDto("SEARCH_16", 943, "search_16");

    @pmi0("search_20")
    public static final AtumVkuiLocalImageDto SEARCH_20 = new AtumVkuiLocalImageDto("SEARCH_20", 944, "search_20");

    @pmi0("search_outline_16")
    public static final AtumVkuiLocalImageDto SEARCH_OUTLINE_16 = new AtumVkuiLocalImageDto("SEARCH_OUTLINE_16", 945, "search_outline_16");

    @pmi0("search_outline_24")
    public static final AtumVkuiLocalImageDto SEARCH_OUTLINE_24 = new AtumVkuiLocalImageDto("SEARCH_OUTLINE_24", 946, "search_outline_24");

    @pmi0("search_outline_28")
    public static final AtumVkuiLocalImageDto SEARCH_OUTLINE_28 = new AtumVkuiLocalImageDto("SEARCH_OUTLINE_28", 947, "search_outline_28");

    @pmi0("search_stars_outline_28")
    public static final AtumVkuiLocalImageDto SEARCH_STARS_OUTLINE_28 = new AtumVkuiLocalImageDto("SEARCH_STARS_OUTLINE_28", 948, "search_stars_outline_28");

    @pmi0("send_circle_32")
    public static final AtumVkuiLocalImageDto SEND_CIRCLE_32 = new AtumVkuiLocalImageDto("SEND_CIRCLE_32", 949, "send_circle_32");

    @pmi0("send_circle_clock_32")
    public static final AtumVkuiLocalImageDto SEND_CIRCLE_CLOCK_32 = new AtumVkuiLocalImageDto("SEND_CIRCLE_CLOCK_32", 950, "send_circle_clock_32");

    @pmi0("services_16")
    public static final AtumVkuiLocalImageDto SERVICES_16 = new AtumVkuiLocalImageDto("SERVICES_16", 951, "services_16");

    @pmi0("services_24")
    public static final AtumVkuiLocalImageDto SERVICES_24 = new AtumVkuiLocalImageDto("SERVICES_24", 952, "services_24");

    @pmi0("services_48")
    public static final AtumVkuiLocalImageDto SERVICES_48 = new AtumVkuiLocalImageDto("SERVICES_48", 953, "services_48");

    @pmi0("services_outline_24")
    public static final AtumVkuiLocalImageDto SERVICES_OUTLINE_24 = new AtumVkuiLocalImageDto("SERVICES_OUTLINE_24", 954, "services_outline_24");

    @pmi0("services_outline_28")
    public static final AtumVkuiLocalImageDto SERVICES_OUTLINE_28 = new AtumVkuiLocalImageDto("SERVICES_OUTLINE_28", 955, "services_outline_28");

    @pmi0("share_24")
    public static final AtumVkuiLocalImageDto SHARE_24 = new AtumVkuiLocalImageDto("SHARE_24", 956, "share_24");

    @pmi0("share_external_28")
    public static final AtumVkuiLocalImageDto SHARE_EXTERNAL_28 = new AtumVkuiLocalImageDto("SHARE_EXTERNAL_28", 957, "share_external_28");

    @pmi0("share_outline_16")
    public static final AtumVkuiLocalImageDto SHARE_OUTLINE_16 = new AtumVkuiLocalImageDto("SHARE_OUTLINE_16", 958, "share_outline_16");

    @pmi0("share_outline_20")
    public static final AtumVkuiLocalImageDto SHARE_OUTLINE_20 = new AtumVkuiLocalImageDto("SHARE_OUTLINE_20", 959, "share_outline_20");

    @pmi0("share_outline_24")
    public static final AtumVkuiLocalImageDto SHARE_OUTLINE_24 = new AtumVkuiLocalImageDto("SHARE_OUTLINE_24", VideoRecord.DEFAULT_MAX_DIMENSION, "share_outline_24");

    @pmi0("share_outline_28")
    public static final AtumVkuiLocalImageDto SHARE_OUTLINE_28 = new AtumVkuiLocalImageDto("SHARE_OUTLINE_28", 961, "share_outline_28");

    @pmi0("shopping_cart_outline_16")
    public static final AtumVkuiLocalImageDto SHOPPING_CART_OUTLINE_16 = new AtumVkuiLocalImageDto("SHOPPING_CART_OUTLINE_16", 962, "shopping_cart_outline_16");

    @pmi0("shopping_cart_outline_20")
    public static final AtumVkuiLocalImageDto SHOPPING_CART_OUTLINE_20 = new AtumVkuiLocalImageDto("SHOPPING_CART_OUTLINE_20", 963, "shopping_cart_outline_20");

    @pmi0("shopping_cart_outline_28")
    public static final AtumVkuiLocalImageDto SHOPPING_CART_OUTLINE_28 = new AtumVkuiLocalImageDto("SHOPPING_CART_OUTLINE_28", 964, "shopping_cart_outline_28");

    @pmi0("shuffle_outline_20")
    public static final AtumVkuiLocalImageDto SHUFFLE_OUTLINE_20 = new AtumVkuiLocalImageDto("SHUFFLE_OUTLINE_20", 965, "shuffle_outline_20");

    @pmi0("shuffle_outline_24")
    public static final AtumVkuiLocalImageDto SHUFFLE_OUTLINE_24 = new AtumVkuiLocalImageDto("SHUFFLE_OUTLINE_24", 966, "shuffle_outline_24");

    @pmi0("shuffle_outline_28")
    public static final AtumVkuiLocalImageDto SHUFFLE_OUTLINE_28 = new AtumVkuiLocalImageDto("SHUFFLE_OUTLINE_28", 967, "shuffle_outline_28");

    @pmi0("shuffle_outline_56")
    public static final AtumVkuiLocalImageDto SHUFFLE_OUTLINE_56 = new AtumVkuiLocalImageDto("SHUFFLE_OUTLINE_56", 968, "shuffle_outline_56");

    @pmi0("skip_back_24")
    public static final AtumVkuiLocalImageDto SKIP_BACK_24 = new AtumVkuiLocalImageDto("SKIP_BACK_24", 969, "skip_back_24");

    @pmi0("skip_forward_24")
    public static final AtumVkuiLocalImageDto SKIP_FORWARD_24 = new AtumVkuiLocalImageDto("SKIP_FORWARD_24", 970, "skip_forward_24");

    @pmi0("skip_next_28")
    public static final AtumVkuiLocalImageDto SKIP_NEXT_28 = new AtumVkuiLocalImageDto("SKIP_NEXT_28", 971, "skip_next_28");

    @pmi0("skip_previous_28")
    public static final AtumVkuiLocalImageDto SKIP_PREVIOUS_28 = new AtumVkuiLocalImageDto("SKIP_PREVIOUS_28", 972, "skip_previous_28");

    @pmi0("skull_outline_24")
    public static final AtumVkuiLocalImageDto SKULL_OUTLINE_24 = new AtumVkuiLocalImageDto("SKULL_OUTLINE_24", 973, "skull_outline_24");

    @pmi0("sliders_outline_16")
    public static final AtumVkuiLocalImageDto SLIDERS_OUTLINE_16 = new AtumVkuiLocalImageDto("SLIDERS_OUTLINE_16", 974, "sliders_outline_16");

    @pmi0("sliders_outline_28")
    public static final AtumVkuiLocalImageDto SLIDERS_OUTLINE_28 = new AtumVkuiLocalImageDto("SLIDERS_OUTLINE_28", 975, "sliders_outline_28");

    @pmi0("smartphone_outline_24")
    public static final AtumVkuiLocalImageDto SMARTPHONE_OUTLINE_24 = new AtumVkuiLocalImageDto("SMARTPHONE_OUTLINE_24", 976, "smartphone_outline_24");

    @pmi0("smartphone_outline_28")
    public static final AtumVkuiLocalImageDto SMARTPHONE_OUTLINE_28 = new AtumVkuiLocalImageDto("SMARTPHONE_OUTLINE_28", 977, "smartphone_outline_28");

    @pmi0("smartphone_outline_56")
    public static final AtumVkuiLocalImageDto SMARTPHONE_OUTLINE_56 = new AtumVkuiLocalImageDto("SMARTPHONE_OUTLINE_56", 978, "smartphone_outline_56");

    @pmi0("smartphone_stars_outline_28")
    public static final AtumVkuiLocalImageDto SMARTPHONE_STARS_OUTLINE_28 = new AtumVkuiLocalImageDto("SMARTPHONE_STARS_OUTLINE_28", 979, "smartphone_stars_outline_28");

    @pmi0("smile_24")
    public static final AtumVkuiLocalImageDto SMILE_24 = new AtumVkuiLocalImageDto("SMILE_24", 980, "smile_24");

    @pmi0("smile_add_outline_20")
    public static final AtumVkuiLocalImageDto SMILE_ADD_OUTLINE_20 = new AtumVkuiLocalImageDto("SMILE_ADD_OUTLINE_20", 981, "smile_add_outline_20");

    @pmi0("smile_outline_24")
    public static final AtumVkuiLocalImageDto SMILE_OUTLINE_24 = new AtumVkuiLocalImageDto("SMILE_OUTLINE_24", 982, "smile_outline_24");

    @pmi0("smile_outline_28")
    public static final AtumVkuiLocalImageDto SMILE_OUTLINE_28 = new AtumVkuiLocalImageDto("SMILE_OUTLINE_28", 983, "smile_outline_28");

    @pmi0("smiles_2_outline_28")
    public static final AtumVkuiLocalImageDto SMILES_2_OUTLINE_28 = new AtumVkuiLocalImageDto("SMILES_2_OUTLINE_28", 984, "smiles_2_outline_28");

    @pmi0("sneaker_outline_28")
    public static final AtumVkuiLocalImageDto SNEAKER_OUTLINE_28 = new AtumVkuiLocalImageDto("SNEAKER_OUTLINE_28", 985, "sneaker_outline_28");

    @pmi0("song_outline_20")
    public static final AtumVkuiLocalImageDto SONG_OUTLINE_20 = new AtumVkuiLocalImageDto("SONG_OUTLINE_20", 986, "song_outline_20");

    @pmi0("song_outline_24")
    public static final AtumVkuiLocalImageDto SONG_OUTLINE_24 = new AtumVkuiLocalImageDto("SONG_OUTLINE_24", 987, "song_outline_24");

    @pmi0("song_outline_28")
    public static final AtumVkuiLocalImageDto SONG_OUTLINE_28 = new AtumVkuiLocalImageDto("SONG_OUTLINE_28", 988, "song_outline_28");

    @pmi0("song_outline_32")
    public static final AtumVkuiLocalImageDto SONG_OUTLINE_32 = new AtumVkuiLocalImageDto("SONG_OUTLINE_32", 989, "song_outline_32");

    @pmi0("song_outline_56")
    public static final AtumVkuiLocalImageDto SONG_OUTLINE_56 = new AtumVkuiLocalImageDto("SONG_OUTLINE_56", 990, "song_outline_56");

    @pmi0("sort_horizontal_outline_28")
    public static final AtumVkuiLocalImageDto SORT_HORIZONTAL_OUTLINE_28 = new AtumVkuiLocalImageDto("SORT_HORIZONTAL_OUTLINE_28", 991, "sort_horizontal_outline_28");

    @pmi0("sort_outline_16")
    public static final AtumVkuiLocalImageDto SORT_OUTLINE_16 = new AtumVkuiLocalImageDto("SORT_OUTLINE_16", 992, "sort_outline_16");

    @pmi0("sort_outline_24")
    public static final AtumVkuiLocalImageDto SORT_OUTLINE_24 = new AtumVkuiLocalImageDto("SORT_OUTLINE_24", 993, "sort_outline_24");

    @pmi0("sound_wave_outline_28")
    public static final AtumVkuiLocalImageDto SOUND_WAVE_OUTLINE_28 = new AtumVkuiLocalImageDto("SOUND_WAVE_OUTLINE_28", 994, "sound_wave_outline_28");

    @pmi0("sound_wave_slash_outline_28")
    public static final AtumVkuiLocalImageDto SOUND_WAVE_SLASH_OUTLINE_28 = new AtumVkuiLocalImageDto("SOUND_WAVE_SLASH_OUTLINE_28", 995, "sound_wave_slash_outline_28");

    @pmi0("speedometer_max_outline_28")
    public static final AtumVkuiLocalImageDto SPEEDOMETER_MAX_OUTLINE_28 = new AtumVkuiLocalImageDto("SPEEDOMETER_MAX_OUTLINE_28", 996, "speedometer_max_outline_28");

    @pmi0("spinner_24")
    public static final AtumVkuiLocalImageDto SPINNER_24 = new AtumVkuiLocalImageDto("SPINNER_24", 997, "spinner_24");

    @pmi0("square_4_outline_20")
    public static final AtumVkuiLocalImageDto SQUARE_4_OUTLINE_20 = new AtumVkuiLocalImageDto("SQUARE_4_OUTLINE_20", 998, "square_4_outline_20");

    @pmi0("square_4_outline_24")
    public static final AtumVkuiLocalImageDto SQUARE_4_OUTLINE_24 = new AtumVkuiLocalImageDto("SQUARE_4_OUTLINE_24", 999, "square_4_outline_24");

    @pmi0("square_4_outline_28")
    public static final AtumVkuiLocalImageDto SQUARE_4_OUTLINE_28 = new AtumVkuiLocalImageDto("SQUARE_4_OUTLINE_28", 1000, "square_4_outline_28");

    @pmi0("square_outline_20")
    public static final AtumVkuiLocalImageDto SQUARE_OUTLINE_20 = new AtumVkuiLocalImageDto("SQUARE_OUTLINE_20", 1001, "square_outline_20");

    @pmi0("square_part_16")
    public static final AtumVkuiLocalImageDto SQUARE_PART_16 = new AtumVkuiLocalImageDto("SQUARE_PART_16", 1002, "square_part_16");

    @pmi0("square_split_4_outline_20")
    public static final AtumVkuiLocalImageDto SQUARE_SPLIT_4_OUTLINE_20 = new AtumVkuiLocalImageDto("SQUARE_SPLIT_4_OUTLINE_20", 1003, "square_split_4_outline_20");

    @pmi0("star_circle_16")
    public static final AtumVkuiLocalImageDto STAR_CIRCLE_16 = new AtumVkuiLocalImageDto("STAR_CIRCLE_16", 1004, "star_circle_16");

    @pmi0("star_circle_fill_blue_16")
    public static final AtumVkuiLocalImageDto STAR_CIRCLE_FILL_BLUE_16 = new AtumVkuiLocalImageDto("STAR_CIRCLE_FILL_BLUE_16", 1005, "star_circle_fill_blue_16");

    @pmi0("star_circle_fill_blue_20")
    public static final AtumVkuiLocalImageDto STAR_CIRCLE_FILL_BLUE_20 = new AtumVkuiLocalImageDto("STAR_CIRCLE_FILL_BLUE_20", 1006, "star_circle_fill_blue_20");

    @pmi0("star_circle_fill_gray_20")
    public static final AtumVkuiLocalImageDto STAR_CIRCLE_FILL_GRAY_20 = new AtumVkuiLocalImageDto("STAR_CIRCLE_FILL_GRAY_20", 1007, "star_circle_fill_gray_20");

    @pmi0("star_circle_fill_yellow_16")
    public static final AtumVkuiLocalImageDto STAR_CIRCLE_FILL_YELLOW_16 = new AtumVkuiLocalImageDto("STAR_CIRCLE_FILL_YELLOW_16", 1008, "star_circle_fill_yellow_16");

    @pmi0("stars_16")
    public static final AtumVkuiLocalImageDto STARS_16 = new AtumVkuiLocalImageDto("STARS_16", 1009, "stars_16");

    @pmi0("stars_20")
    public static final AtumVkuiLocalImageDto STARS_20 = new AtumVkuiLocalImageDto("STARS_20", 1010, "stars_20");

    @pmi0("stars_3_outline_56")
    public static final AtumVkuiLocalImageDto STARS_3_OUTLINE_56 = new AtumVkuiLocalImageDto("STARS_3_OUTLINE_56", 1011, "stars_3_outline_56");

    @pmi0("stars_outline_24")
    public static final AtumVkuiLocalImageDto STARS_OUTLINE_24 = new AtumVkuiLocalImageDto("STARS_OUTLINE_24", 1012, "stars_outline_24");

    @pmi0("stars_outline_28")
    public static final AtumVkuiLocalImageDto STARS_OUTLINE_28 = new AtumVkuiLocalImageDto("STARS_OUTLINE_28", Z3.i, "stars_outline_28");

    @pmi0("statistic_circle_fill_blue_28")
    public static final AtumVkuiLocalImageDto STATISTIC_CIRCLE_FILL_BLUE_28 = new AtumVkuiLocalImageDto("STATISTIC_CIRCLE_FILL_BLUE_28", Z3.j, "statistic_circle_fill_blue_28");

    @pmi0("statistics_outline_20")
    public static final AtumVkuiLocalImageDto STATISTICS_OUTLINE_20 = new AtumVkuiLocalImageDto("STATISTICS_OUTLINE_20", 1015, "statistics_outline_20");

    @pmi0("statistics_outline_24")
    public static final AtumVkuiLocalImageDto STATISTICS_OUTLINE_24 = new AtumVkuiLocalImageDto("STATISTICS_OUTLINE_24", Z3.l, "statistics_outline_24");

    @pmi0("statistics_outline_28")
    public static final AtumVkuiLocalImageDto STATISTICS_OUTLINE_28 = new AtumVkuiLocalImageDto("STATISTICS_OUTLINE_28", 1017, "statistics_outline_28");

    @pmi0("sticker_outline_24")
    public static final AtumVkuiLocalImageDto STICKER_OUTLINE_24 = new AtumVkuiLocalImageDto("STICKER_OUTLINE_24", 1018, "sticker_outline_24");

    @pmi0("sticker_outline_28")
    public static final AtumVkuiLocalImageDto STICKER_OUTLINE_28 = new AtumVkuiLocalImageDto("STICKER_OUTLINE_28", 1019, "sticker_outline_28");

    @pmi0("sticker_smile_outline_20")
    public static final AtumVkuiLocalImageDto STICKER_SMILE_OUTLINE_20 = new AtumVkuiLocalImageDto("STICKER_SMILE_OUTLINE_20", 1020, "sticker_smile_outline_20");

    @pmi0("sticker_smile_outline_28")
    public static final AtumVkuiLocalImageDto STICKER_SMILE_OUTLINE_28 = new AtumVkuiLocalImageDto("STICKER_SMILE_OUTLINE_28", IronSourceError.ERROR_RV_EMPTY_DEFAULT_PLACEMENT, "sticker_smile_outline_28");

    @pmi0("stopwatch_outline_28")
    public static final AtumVkuiLocalImageDto STOPWATCH_OUTLINE_28 = new AtumVkuiLocalImageDto("STOPWATCH_OUTLINE_28", IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW, "stopwatch_outline_28");

    @pmi0("storefront_outline_16")
    public static final AtumVkuiLocalImageDto STOREFRONT_OUTLINE_16 = new AtumVkuiLocalImageDto("STOREFRONT_OUTLINE_16", IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, "storefront_outline_16");

    @pmi0("storefront_outline_24")
    public static final AtumVkuiLocalImageDto STOREFRONT_OUTLINE_24 = new AtumVkuiLocalImageDto("STOREFRONT_OUTLINE_24", 1024, "storefront_outline_24");

    @pmi0("storefront_outline_28")
    public static final AtumVkuiLocalImageDto STOREFRONT_OUTLINE_28 = new AtumVkuiLocalImageDto("STOREFRONT_OUTLINE_28", IronSourceError.ERROR_LOAD_FAILED_TIMEOUT, "storefront_outline_28");

    @pmi0("stories_advertising_32")
    public static final AtumVkuiLocalImageDto STORIES_ADVERTISING_32 = new AtumVkuiLocalImageDto("STORIES_ADVERTISING_32", IronSourceError.ERROR_RV_LOAD_DURING_LOAD, "stories_advertising_32");

    @pmi0("story_24")
    public static final AtumVkuiLocalImageDto STORY_24 = new AtumVkuiLocalImageDto("STORY_24", IronSourceError.ERROR_RV_LOAD_DURING_SHOW, "story_24");

    @pmi0("story_28")
    public static final AtumVkuiLocalImageDto STORY_28 = new AtumVkuiLocalImageDto("STORY_28", IronSourceError.ERROR_RV_LOAD_SUCCESS_UNEXPECTED, "story_28");

    @pmi0("story_36")
    public static final AtumVkuiLocalImageDto STORY_36 = new AtumVkuiLocalImageDto("STORY_36", IronSourceError.ERROR_RV_LOAD_SUCCESS_WRONG_AUCTION_ID, "story_36");

    @pmi0("story_48")
    public static final AtumVkuiLocalImageDto STORY_48 = new AtumVkuiLocalImageDto("STORY_48", IronSourceError.ERROR_RV_LOAD_FAIL_UNEXPECTED, "story_48");

    @pmi0("story_add_outline_28")
    public static final AtumVkuiLocalImageDto STORY_ADD_OUTLINE_28 = new AtumVkuiLocalImageDto("STORY_ADD_OUTLINE_28", IronSourceError.ERROR_RV_LOAD_FAIL_WRONG_AUCTION_ID, "story_add_outline_28");

    @pmi0("story_circle_fill_yellow_72")
    public static final AtumVkuiLocalImageDto STORY_CIRCLE_FILL_YELLOW_72 = new AtumVkuiLocalImageDto("STORY_CIRCLE_FILL_YELLOW_72", IronSourceError.ERROR_RV_INIT_FAILED_TIMEOUT, "story_circle_fill_yellow_72");

    @pmi0("story_outline_16")
    public static final AtumVkuiLocalImageDto STORY_OUTLINE_16 = new AtumVkuiLocalImageDto("STORY_OUTLINE_16", IronSourceError.ERROR_RV_LOAD_FAIL_DUE_TO_INIT, "story_outline_16");

    @pmi0("story_outline_24")
    public static final AtumVkuiLocalImageDto STORY_OUTLINE_24 = new AtumVkuiLocalImageDto("STORY_OUTLINE_24", IronSourceError.ERROR_RV_LOAD_UNEXPECTED_CALLBACK, "story_outline_24");

    @pmi0("story_outline_28")
    public static final AtumVkuiLocalImageDto STORY_OUTLINE_28 = new AtumVkuiLocalImageDto("STORY_OUTLINE_28", IronSourceError.ERROR_IS_LOAD_FAILED_NO_CANDIDATES, "story_outline_28");

    @pmi0("story_outline_56")
    public static final AtumVkuiLocalImageDto STORY_OUTLINE_56 = new AtumVkuiLocalImageDto("STORY_OUTLINE_56", IronSourceError.ERROR_IS_SHOW_CALLED_DURING_SHOW, "story_outline_56");

    @pmi0("story_outline_shadow_28")
    public static final AtumVkuiLocalImageDto STORY_OUTLINE_SHADOW_28 = new AtumVkuiLocalImageDto("STORY_OUTLINE_SHADOW_28", IronSourceError.ERROR_IS_LOAD_DURING_SHOW, "story_outline_shadow_28");

    @pmi0("story_reply_outline_24")
    public static final AtumVkuiLocalImageDto STORY_REPLY_OUTLINE_24 = new AtumVkuiLocalImageDto("STORY_REPLY_OUTLINE_24", IronSourceError.ERROR_RV_SHOW_EXCEPTION, "story_reply_outline_24");

    @pmi0("subscriptions_outline_20")
    public static final AtumVkuiLocalImageDto SUBSCRIPTIONS_OUTLINE_20 = new AtumVkuiLocalImageDto("SUBSCRIPTIONS_OUTLINE_20", IronSourceError.ERROR_IS_SHOW_EXCEPTION, "subscriptions_outline_20");

    @pmi0("subtitles_outline_28")
    public static final AtumVkuiLocalImageDto SUBTITLES_OUTLINE_28 = new AtumVkuiLocalImageDto("SUBTITLES_OUTLINE_28", IronSourceError.ERROR_RV_INSTANCE_INIT_EXCEPTION, "subtitles_outline_28");

    @pmi0("sun_outline_28")
    public static final AtumVkuiLocalImageDto SUN_OUTLINE_28 = new AtumVkuiLocalImageDto("SUN_OUTLINE_28", IronSourceError.ERROR_IS_INSTANCE_INIT_EXCEPTION, "sun_outline_28");

    @pmi0("sunglasses_circle_fill_gray_48")
    public static final AtumVkuiLocalImageDto SUNGLASSES_CIRCLE_FILL_GRAY_48 = new AtumVkuiLocalImageDto("SUNGLASSES_CIRCLE_FILL_GRAY_48", IronSourceError.ERROR_RV_ALL_SMASHES_SESSION_CAPPED, "sunglasses_circle_fill_gray_48");

    @pmi0("swipe_dismiss_48")
    public static final AtumVkuiLocalImageDto SWIPE_DISMISS_48 = new AtumVkuiLocalImageDto("SWIPE_DISMISS_48", IronSourceError.ERROR_IS_ALL_SMASHES_SESSION_CAPPED, "swipe_dismiss_48");

    @pmi0("switch_12")
    public static final AtumVkuiLocalImageDto SWITCH_12 = new AtumVkuiLocalImageDto("SWITCH_12", IronSourceError.ERROR_BN_LOAD_FAILED_NO_CANDIDATES, "switch_12");

    @pmi0("switch_24")
    public static final AtumVkuiLocalImageDto SWITCH_24 = new AtumVkuiLocalImageDto("SWITCH_24", IronSourceError.ERROR_NT_LOAD_FAILED_NO_CANDIDATES, "switch_24");

    @pmi0("switch_outline_28")
    public static final AtumVkuiLocalImageDto SWITCH_OUTLINE_28 = new AtumVkuiLocalImageDto("SWITCH_OUTLINE_28", 1046, "switch_outline_28");

    @pmi0("sync_16")
    public static final AtumVkuiLocalImageDto SYNC_16 = new AtumVkuiLocalImageDto("SYNC_16", 1047, "sync_16");

    @pmi0("sync_outline_28")
    public static final AtumVkuiLocalImageDto SYNC_OUTLINE_28 = new AtumVkuiLocalImageDto("SYNC_OUTLINE_28", 1048, "sync_outline_28");

    @pmi0("tag_12")
    public static final AtumVkuiLocalImageDto TAG_12 = new AtumVkuiLocalImageDto("TAG_12", 1049, "tag_12");

    @pmi0("tag_outline_28")
    public static final AtumVkuiLocalImageDto TAG_OUTLINE_28 = new AtumVkuiLocalImageDto("TAG_OUTLINE_28", 1050, "tag_outline_28");

    @pmi0("target_outline_24")
    public static final AtumVkuiLocalImageDto TARGET_OUTLINE_24 = new AtumVkuiLocalImageDto("TARGET_OUTLINE_24", IronSourceError.ERROR_DO_IS_CALL_LOAD_BEFORE_SHOW, "target_outline_24");

    @pmi0("tear_off_flyer_outline_28")
    public static final AtumVkuiLocalImageDto TEAR_OFF_FLYER_OUTLINE_28 = new AtumVkuiLocalImageDto("TEAR_OFF_FLYER_OUTLINE_28", 1052, "tear_off_flyer_outline_28");

    @pmi0("tear_off_flyer_outline_56")
    public static final AtumVkuiLocalImageDto TEAR_OFF_FLYER_OUTLINE_56 = new AtumVkuiLocalImageDto("TEAR_OFF_FLYER_OUTLINE_56", 1053, "tear_off_flyer_outline_56");

    @pmi0("text_live_outline_24")
    public static final AtumVkuiLocalImageDto TEXT_LIVE_OUTLINE_24 = new AtumVkuiLocalImageDto("TEXT_LIVE_OUTLINE_24", IronSourceError.ERROR_DO_RV_CALL_LOAD_BEFORE_SHOW, "text_live_outline_24");

    @pmi0("text_live_outline_28")
    public static final AtumVkuiLocalImageDto TEXT_LIVE_OUTLINE_28 = new AtumVkuiLocalImageDto("TEXT_LIVE_OUTLINE_28", 1055, "text_live_outline_28");

    @pmi0("text_live_outline_56")
    public static final AtumVkuiLocalImageDto TEXT_LIVE_OUTLINE_56 = new AtumVkuiLocalImageDto("TEXT_LIVE_OUTLINE_56", IronSourceError.ERROR_DO_RV_LOAD_DURING_SHOW, "text_live_outline_56");

    @pmi0("text_outline_24")
    public static final AtumVkuiLocalImageDto TEXT_OUTLINE_24 = new AtumVkuiLocalImageDto("TEXT_OUTLINE_24", IronSourceError.ERROR_RV_EXPIRED_ADS, "text_outline_24");

    @pmi0("text_outline_28")
    public static final AtumVkuiLocalImageDto TEXT_OUTLINE_28 = new AtumVkuiLocalImageDto("TEXT_OUTLINE_28", 1058, "text_outline_28");

    @pmi0("thumbs_down_24")
    public static final AtumVkuiLocalImageDto THUMBS_DOWN_24 = new AtumVkuiLocalImageDto("THUMBS_DOWN_24", 1059, "thumbs_down_24");

    @pmi0("thumbs_down_28")
    public static final AtumVkuiLocalImageDto THUMBS_DOWN_28 = new AtumVkuiLocalImageDto("THUMBS_DOWN_28", 1060, "thumbs_down_28");

    @pmi0("thumbs_down_outline_24")
    public static final AtumVkuiLocalImageDto THUMBS_DOWN_OUTLINE_24 = new AtumVkuiLocalImageDto("THUMBS_DOWN_OUTLINE_24", IronSourceError.ERROR_DO_IS_LOAD_MISSING_ACTIVITY, "thumbs_down_outline_24");

    @pmi0("thumbs_down_outline_28")
    public static final AtumVkuiLocalImageDto THUMBS_DOWN_OUTLINE_28 = new AtumVkuiLocalImageDto("THUMBS_DOWN_OUTLINE_28", 1062, "thumbs_down_outline_28");

    @pmi0("thumbs_up_outline_28")
    public static final AtumVkuiLocalImageDto THUMBS_UP_OUTLINE_28 = new AtumVkuiLocalImageDto("THUMBS_UP_OUTLINE_28", 1063, "thumbs_up_outline_28");

    @pmi0("ticket_outline_28")
    public static final AtumVkuiLocalImageDto TICKET_OUTLINE_28 = new AtumVkuiLocalImageDto("TICKET_OUTLINE_28", 1064, "ticket_outline_28");

    @pmi0("truck_outline_16")
    public static final AtumVkuiLocalImageDto TRUCK_OUTLINE_16 = new AtumVkuiLocalImageDto("TRUCK_OUTLINE_16", 1065, "truck_outline_16");

    @pmi0("truck_outline_20")
    public static final AtumVkuiLocalImageDto TRUCK_OUTLINE_20 = new AtumVkuiLocalImageDto("TRUCK_OUTLINE_20", 1066, "truck_outline_20");

    @pmi0("ugc_chat_sticker_fill_16")
    public static final AtumVkuiLocalImageDto UGC_CHAT_STICKER_FILL_16 = new AtumVkuiLocalImageDto("UGC_CHAT_STICKER_FILL_16", 1067, "ugc_chat_sticker_fill_16");

    @pmi0("ugc_chat_sticker_outline_28")
    public static final AtumVkuiLocalImageDto UGC_CHAT_STICKER_OUTLINE_28 = new AtumVkuiLocalImageDto("UGC_CHAT_STICKER_OUTLINE_28", 1068, "ugc_chat_sticker_outline_28");

    @pmi0("ugc_chat_sticker_outline_56")
    public static final AtumVkuiLocalImageDto UGC_CHAT_STICKER_OUTLINE_56 = new AtumVkuiLocalImageDto("UGC_CHAT_STICKER_OUTLINE_56", 1069, "ugc_chat_sticker_outline_56");

    @pmi0("ugc_sticker_outline_24")
    public static final AtumVkuiLocalImageDto UGC_STICKER_OUTLINE_24 = new AtumVkuiLocalImageDto("UGC_STICKER_OUTLINE_24", j.a.j, "ugc_sticker_outline_24");

    @pmi0("unarchive_outline_24")
    public static final AtumVkuiLocalImageDto UNARCHIVE_OUTLINE_24 = new AtumVkuiLocalImageDto("UNARCHIVE_OUTLINE_24", j.a.k, "unarchive_outline_24");

    @pmi0("unarchive_outline_28")
    public static final AtumVkuiLocalImageDto UNARCHIVE_OUTLINE_28 = new AtumVkuiLocalImageDto("UNARCHIVE_OUTLINE_28", 1072, "unarchive_outline_28");

    @pmi0("unavailable_call_circle_fill_red_16")
    public static final AtumVkuiLocalImageDto UNAVAILABLE_CALL_CIRCLE_FILL_RED_16 = new AtumVkuiLocalImageDto("UNAVAILABLE_CALL_CIRCLE_FILL_RED_16", 1073, "unavailable_call_circle_fill_red_16");

    @pmi0("unblock_outline_24")
    public static final AtumVkuiLocalImageDto UNBLOCK_OUTLINE_24 = new AtumVkuiLocalImageDto("UNBLOCK_OUTLINE_24", 1074, "unblock_outline_24");

    @pmi0("unfavorite_outline_28")
    public static final AtumVkuiLocalImageDto UNFAVORITE_OUTLINE_28 = new AtumVkuiLocalImageDto("UNFAVORITE_OUTLINE_28", 1075, "unfavorite_outline_28");

    @pmi0("unlock_outline_20")
    public static final AtumVkuiLocalImageDto UNLOCK_OUTLINE_20 = new AtumVkuiLocalImageDto("UNLOCK_OUTLINE_20", 1076, "unlock_outline_20");

    @pmi0("unnamed_device_outline_56")
    public static final AtumVkuiLocalImageDto UNNAMED_DEVICE_OUTLINE_56 = new AtumVkuiLocalImageDto("UNNAMED_DEVICE_OUTLINE_56", 1077, "unnamed_device_outline_56");

    @pmi0("unpin_outline_28")
    public static final AtumVkuiLocalImageDto UNPIN_OUTLINE_28 = new AtumVkuiLocalImageDto("UNPIN_OUTLINE_28", 1078, "unpin_outline_28");

    @pmi0("upload_outline_16")
    public static final AtumVkuiLocalImageDto UPLOAD_OUTLINE_16 = new AtumVkuiLocalImageDto("UPLOAD_OUTLINE_16", 1079, "upload_outline_16");

    @pmi0("upload_outline_24")
    public static final AtumVkuiLocalImageDto UPLOAD_OUTLINE_24 = new AtumVkuiLocalImageDto("UPLOAD_OUTLINE_24", 1080, "upload_outline_24");

    @pmi0("upload_outline_28")
    public static final AtumVkuiLocalImageDto UPLOAD_OUTLINE_28 = new AtumVkuiLocalImageDto("UPLOAD_OUTLINE_28", 1081, "upload_outline_28");

    @pmi0("user_12")
    public static final AtumVkuiLocalImageDto USER_12 = new AtumVkuiLocalImageDto("USER_12", 1082, "user_12");

    @pmi0("user_16")
    public static final AtumVkuiLocalImageDto USER_16 = new AtumVkuiLocalImageDto("USER_16", 1083, "user_16");

    @pmi0("user_24")
    public static final AtumVkuiLocalImageDto USER_24 = new AtumVkuiLocalImageDto("USER_24", 1084, "user_24");

    @pmi0("user_add_24")
    public static final AtumVkuiLocalImageDto USER_ADD_24 = new AtumVkuiLocalImageDto("USER_ADD_24", 1085, "user_add_24");

    @pmi0("user_add_badge_outline_28")
    public static final AtumVkuiLocalImageDto USER_ADD_BADGE_OUTLINE_28 = new AtumVkuiLocalImageDto("USER_ADD_BADGE_OUTLINE_28", 1086, "user_add_badge_outline_28");

    @pmi0("user_add_badge_outline_56")
    public static final AtumVkuiLocalImageDto USER_ADD_BADGE_OUTLINE_56 = new AtumVkuiLocalImageDto("USER_ADD_BADGE_OUTLINE_56", 1087, "user_add_badge_outline_56");

    @pmi0("user_add_outline_24")
    public static final AtumVkuiLocalImageDto USER_ADD_OUTLINE_24 = new AtumVkuiLocalImageDto("USER_ADD_OUTLINE_24", 1088, "user_add_outline_24");

    @pmi0("user_add_outline_28")
    public static final AtumVkuiLocalImageDto USER_ADD_OUTLINE_28 = new AtumVkuiLocalImageDto("USER_ADD_OUTLINE_28", 1089, "user_add_outline_28");

    @pmi0("user_add_outline_56")
    public static final AtumVkuiLocalImageDto USER_ADD_OUTLINE_56 = new AtumVkuiLocalImageDto("USER_ADD_OUTLINE_56", 1090, "user_add_outline_56");

    @pmi0("user_added_outline_24")
    public static final AtumVkuiLocalImageDto USER_ADDED_OUTLINE_24 = new AtumVkuiLocalImageDto("USER_ADDED_OUTLINE_24", 1091, "user_added_outline_24");

    @pmi0("user_added_outline_28")
    public static final AtumVkuiLocalImageDto USER_ADDED_OUTLINE_28 = new AtumVkuiLocalImageDto("USER_ADDED_OUTLINE_28", 1092, "user_added_outline_28");

    @pmi0("user_background_outline_24")
    public static final AtumVkuiLocalImageDto USER_BACKGROUND_OUTLINE_24 = new AtumVkuiLocalImageDto("USER_BACKGROUND_OUTLINE_24", 1093, "user_background_outline_24");

    @pmi0("user_background_outline_28")
    public static final AtumVkuiLocalImageDto USER_BACKGROUND_OUTLINE_28 = new AtumVkuiLocalImageDto("USER_BACKGROUND_OUTLINE_28", 1094, "user_background_outline_28");

    @pmi0("user_book_outline_56")
    public static final AtumVkuiLocalImageDto USER_BOOK_OUTLINE_56 = new AtumVkuiLocalImageDto("USER_BOOK_OUTLINE_56", 1095, "user_book_outline_56");

    @pmi0("user_circle_alt_outline_16")
    public static final AtumVkuiLocalImageDto USER_CIRCLE_ALT_OUTLINE_16 = new AtumVkuiLocalImageDto("USER_CIRCLE_ALT_OUTLINE_16", 1096, "user_circle_alt_outline_16");

    @pmi0("user_circle_fill_blue_28")
    public static final AtumVkuiLocalImageDto USER_CIRCLE_FILL_BLUE_28 = new AtumVkuiLocalImageDto("USER_CIRCLE_FILL_BLUE_28", 1097, "user_circle_fill_blue_28");

    @pmi0("user_circle_outline_24")
    public static final AtumVkuiLocalImageDto USER_CIRCLE_OUTLINE_24 = new AtumVkuiLocalImageDto("USER_CIRCLE_OUTLINE_24", 1098, "user_circle_outline_24");

    @pmi0("user_circle_outline_28")
    public static final AtumVkuiLocalImageDto USER_CIRCLE_OUTLINE_28 = new AtumVkuiLocalImageDto("USER_CIRCLE_OUTLINE_28", 1099, "user_circle_outline_28");

    @pmi0("user_incoming_outline_28")
    public static final AtumVkuiLocalImageDto USER_INCOMING_OUTLINE_28 = new AtumVkuiLocalImageDto("USER_INCOMING_OUTLINE_28", 1100, "user_incoming_outline_28");

    @pmi0("user_microphone_badge_outline_28")
    public static final AtumVkuiLocalImageDto USER_MICROPHONE_BADGE_OUTLINE_28 = new AtumVkuiLocalImageDto("USER_MICROPHONE_BADGE_OUTLINE_28", 1101, "user_microphone_badge_outline_28");

    @pmi0("user_microphone_badge_outline_56")
    public static final AtumVkuiLocalImageDto USER_MICROPHONE_BADGE_OUTLINE_56 = new AtumVkuiLocalImageDto("USER_MICROPHONE_BADGE_OUTLINE_56", 1102, "user_microphone_badge_outline_56");

    @pmi0("user_microphone_badge_slash_outline_28")
    public static final AtumVkuiLocalImageDto USER_MICROPHONE_BADGE_SLASH_OUTLINE_28 = new AtumVkuiLocalImageDto("USER_MICROPHONE_BADGE_SLASH_OUTLINE_28", ApiInvocationException.ErrorCodes.FRIENDSHIP_REQUIRED, "user_microphone_badge_slash_outline_28");

    @pmi0("user_minus_outline_28")
    public static final AtumVkuiLocalImageDto USER_MINUS_OUTLINE_28 = new AtumVkuiLocalImageDto("USER_MINUS_OUTLINE_28", 1104, "user_minus_outline_28");

    @pmi0("user_outgoing_outline_28")
    public static final AtumVkuiLocalImageDto USER_OUTGOING_OUTLINE_28 = new AtumVkuiLocalImageDto("USER_OUTGOING_OUTLINE_28", 1105, "user_outgoing_outline_28");

    @pmi0("user_outline_16")
    public static final AtumVkuiLocalImageDto USER_OUTLINE_16 = new AtumVkuiLocalImageDto("USER_OUTLINE_16", 1106, "user_outline_16");

    @pmi0("user_outline_20")
    public static final AtumVkuiLocalImageDto USER_OUTLINE_20 = new AtumVkuiLocalImageDto("USER_OUTLINE_20", 1107, "user_outline_20");

    @pmi0("user_outline_24")
    public static final AtumVkuiLocalImageDto USER_OUTLINE_24 = new AtumVkuiLocalImageDto("USER_OUTLINE_24", 1108, "user_outline_24");

    @pmi0("user_pen_outline_28")
    public static final AtumVkuiLocalImageDto USER_PEN_OUTLINE_28 = new AtumVkuiLocalImageDto("USER_PEN_OUTLINE_28", 1109, "user_pen_outline_28");

    @pmi0("user_rectangle_20")
    public static final AtumVkuiLocalImageDto USER_RECTANGLE_20 = new AtumVkuiLocalImageDto("USER_RECTANGLE_20", 1110, "user_rectangle_20");

    @pmi0("user_slash_outline_20")
    public static final AtumVkuiLocalImageDto USER_SLASH_OUTLINE_20 = new AtumVkuiLocalImageDto("USER_SLASH_OUTLINE_20", 1111, "user_slash_outline_20");

    @pmi0("user_slash_outline_28")
    public static final AtumVkuiLocalImageDto USER_SLASH_OUTLINE_28 = new AtumVkuiLocalImageDto("USER_SLASH_OUTLINE_28", 1112, "user_slash_outline_28");

    @pmi0("user_square_on_square_28")
    public static final AtumVkuiLocalImageDto USER_SQUARE_ON_SQUARE_28 = new AtumVkuiLocalImageDto("USER_SQUARE_ON_SQUARE_28", 1113, "user_square_on_square_28");

    @pmi0("user_square_on_square_outline_28")
    public static final AtumVkuiLocalImageDto USER_SQUARE_ON_SQUARE_OUTLINE_28 = new AtumVkuiLocalImageDto("USER_SQUARE_ON_SQUARE_OUTLINE_28", 1114, "user_square_on_square_outline_28");

    @pmi0("user_square_on_square_outline_32")
    public static final AtumVkuiLocalImageDto USER_SQUARE_ON_SQUARE_OUTLINE_32 = new AtumVkuiLocalImageDto("USER_SQUARE_ON_SQUARE_OUTLINE_32", 1115, "user_square_on_square_outline_32");

    @pmi0("user_square_on_square_outline_56")
    public static final AtumVkuiLocalImageDto USER_SQUARE_ON_SQUARE_OUTLINE_56 = new AtumVkuiLocalImageDto("USER_SQUARE_ON_SQUARE_OUTLINE_56", 1116, "user_square_on_square_outline_56");

    @pmi0("user_square_outline_28")
    public static final AtumVkuiLocalImageDto USER_SQUARE_OUTLINE_28 = new AtumVkuiLocalImageDto("USER_SQUARE_OUTLINE_28", 1117, "user_square_outline_28");

    @pmi0("user_square_outline_56")
    public static final AtumVkuiLocalImageDto USER_SQUARE_OUTLINE_56 = new AtumVkuiLocalImageDto("USER_SQUARE_OUTLINE_56", 1118, "user_square_outline_56");

    @pmi0("user_star_badge_outline_28")
    public static final AtumVkuiLocalImageDto USER_STAR_BADGE_OUTLINE_28 = new AtumVkuiLocalImageDto("USER_STAR_BADGE_OUTLINE_28", 1119, "user_star_badge_outline_28");

    @pmi0("user_star_badge_slash_outline_28")
    public static final AtumVkuiLocalImageDto USER_STAR_BADGE_SLASH_OUTLINE_28 = new AtumVkuiLocalImageDto("USER_STAR_BADGE_SLASH_OUTLINE_28", 1120, "user_star_badge_slash_outline_28");

    @pmi0("user_star_outline_28")
    public static final AtumVkuiLocalImageDto USER_STAR_OUTLINE_28 = new AtumVkuiLocalImageDto("USER_STAR_OUTLINE_28", 1121, "user_star_outline_28");

    @pmi0("user_star_slash_outline_28")
    public static final AtumVkuiLocalImageDto USER_STAR_SLASH_OUTLINE_28 = new AtumVkuiLocalImageDto("USER_STAR_SLASH_OUTLINE_28", 1122, "user_star_slash_outline_28");

    @pmi0("users_12")
    public static final AtumVkuiLocalImageDto USERS_12 = new AtumVkuiLocalImageDto("USERS_12", 1123, "users_12");

    @pmi0("users_16")
    public static final AtumVkuiLocalImageDto USERS_16 = new AtumVkuiLocalImageDto("USERS_16", 1124, "users_16");

    @pmi0("users_20")
    public static final AtumVkuiLocalImageDto USERS_20 = new AtumVkuiLocalImageDto("USERS_20", 1125, "users_20");

    @pmi0("users_24")
    public static final AtumVkuiLocalImageDto USERS_24 = new AtumVkuiLocalImageDto("USERS_24", 1126, "users_24");

    @pmi0("users_28")
    public static final AtumVkuiLocalImageDto USERS_28 = new AtumVkuiLocalImageDto("USERS_28", 1127, "users_28");

    @pmi0("users_2_outline_16")
    public static final AtumVkuiLocalImageDto USERS_2_OUTLINE_16 = new AtumVkuiLocalImageDto("USERS_2_OUTLINE_16", 1128, "users_2_outline_16");

    @pmi0("users_3_outline_24")
    public static final AtumVkuiLocalImageDto USERS_3_OUTLINE_24 = new AtumVkuiLocalImageDto("USERS_3_OUTLINE_24", 1129, "users_3_outline_24");

    @pmi0("users_3_outline_28")
    public static final AtumVkuiLocalImageDto USERS_3_OUTLINE_28 = new AtumVkuiLocalImageDto("USERS_3_OUTLINE_28", 1130, "users_3_outline_28");

    @pmi0("users_3_outline_56")
    public static final AtumVkuiLocalImageDto USERS_3_OUTLINE_56 = new AtumVkuiLocalImageDto("USERS_3_OUTLINE_56", 1131, "users_3_outline_56");

    @pmi0("users_circle_fill_blue_20")
    public static final AtumVkuiLocalImageDto USERS_CIRCLE_FILL_BLUE_20 = new AtumVkuiLocalImageDto("USERS_CIRCLE_FILL_BLUE_20", 1132, "users_circle_fill_blue_20");

    @pmi0("users_circle_fill_blue_28")
    public static final AtumVkuiLocalImageDto USERS_CIRCLE_FILL_BLUE_28 = new AtumVkuiLocalImageDto("USERS_CIRCLE_FILL_BLUE_28", 1133, "users_circle_fill_blue_28");

    @pmi0("users_circle_fill_blue_32")
    public static final AtumVkuiLocalImageDto USERS_CIRCLE_FILL_BLUE_32 = new AtumVkuiLocalImageDto("USERS_CIRCLE_FILL_BLUE_32", 1134, "users_circle_fill_blue_32");

    @pmi0("users_outline_20")
    public static final AtumVkuiLocalImageDto USERS_OUTLINE_20 = new AtumVkuiLocalImageDto("USERS_OUTLINE_20", 1135, "users_outline_20");

    @pmi0("users_outline_24")
    public static final AtumVkuiLocalImageDto USERS_OUTLINE_24 = new AtumVkuiLocalImageDto("USERS_OUTLINE_24", 1136, "users_outline_24");

    @pmi0("users_outline_28")
    public static final AtumVkuiLocalImageDto USERS_OUTLINE_28 = new AtumVkuiLocalImageDto("USERS_OUTLINE_28", 1137, "users_outline_28");

    @pmi0("users_outline_56")
    public static final AtumVkuiLocalImageDto USERS_OUTLINE_56 = new AtumVkuiLocalImageDto("USERS_OUTLINE_56", 1138, "users_outline_56");

    @pmi0("verified_20")
    public static final AtumVkuiLocalImageDto VERIFIED_20 = new AtumVkuiLocalImageDto("VERIFIED_20", 1139, "verified_20");

    @pmi0("verified_dark_24")
    public static final AtumVkuiLocalImageDto VERIFIED_DARK_24 = new AtumVkuiLocalImageDto("VERIFIED_DARK_24", 1140, "verified_dark_24");

    @pmi0("verified_dark_48")
    public static final AtumVkuiLocalImageDto VERIFIED_DARK_48 = new AtumVkuiLocalImageDto("VERIFIED_DARK_48", 1141, "verified_dark_48");

    @pmi0("verified_light_24")
    public static final AtumVkuiLocalImageDto VERIFIED_LIGHT_24 = new AtumVkuiLocalImageDto("VERIFIED_LIGHT_24", 1142, "verified_light_24");

    @pmi0("verified_light_48")
    public static final AtumVkuiLocalImageDto VERIFIED_LIGHT_48 = new AtumVkuiLocalImageDto("VERIFIED_LIGHT_48", 1143, "verified_light_48");

    @pmi0("vertical_rectangle_9x16_outline_24")
    public static final AtumVkuiLocalImageDto VERTICAL_RECTANGLE_9X16_OUTLINE_24 = new AtumVkuiLocalImageDto("VERTICAL_RECTANGLE_9X16_OUTLINE_24", 1144, "vertical_rectangle_9x16_outline_24");

    @pmi0("vertical_rectangle_outline_20")
    public static final AtumVkuiLocalImageDto VERTICAL_RECTANGLE_OUTLINE_20 = new AtumVkuiLocalImageDto("VERTICAL_RECTANGLE_OUTLINE_20", 1145, "vertical_rectangle_outline_20");

    @pmi0("video_24")
    public static final AtumVkuiLocalImageDto VIDEO_24 = new AtumVkuiLocalImageDto("VIDEO_24", 1146, "video_24");

    @pmi0("video_36")
    public static final AtumVkuiLocalImageDto VIDEO_36 = new AtumVkuiLocalImageDto("VIDEO_36", 1147, "video_36");

    @pmi0("video_advertisement_16")
    public static final AtumVkuiLocalImageDto VIDEO_ADVERTISEMENT_16 = new AtumVkuiLocalImageDto("VIDEO_ADVERTISEMENT_16", 1148, "video_advertisement_16");

    @pmi0("video_advertisement_24")
    public static final AtumVkuiLocalImageDto VIDEO_ADVERTISEMENT_24 = new AtumVkuiLocalImageDto("VIDEO_ADVERTISEMENT_24", 1149, "video_advertisement_24");

    @pmi0("video_arrow_square_outline_shadow_medium_48")
    public static final AtumVkuiLocalImageDto VIDEO_ARROW_SQUARE_OUTLINE_SHADOW_MEDIUM_48 = new AtumVkuiLocalImageDto("VIDEO_ARROW_SQUARE_OUTLINE_SHADOW_MEDIUM_48", 1150, "video_arrow_square_outline_shadow_medium_48");

    @pmi0("video_circle_outline_28")
    public static final AtumVkuiLocalImageDto VIDEO_CIRCLE_OUTLINE_28 = new AtumVkuiLocalImageDto("VIDEO_CIRCLE_OUTLINE_28", 1151, "video_circle_outline_28");

    @pmi0("video_circle_outline_56")
    public static final AtumVkuiLocalImageDto VIDEO_CIRCLE_OUTLINE_56 = new AtumVkuiLocalImageDto("VIDEO_CIRCLE_OUTLINE_56", 1152, "video_circle_outline_56");

    @pmi0("video_outline_24")
    public static final AtumVkuiLocalImageDto VIDEO_OUTLINE_24 = new AtumVkuiLocalImageDto("VIDEO_OUTLINE_24", 1153, "video_outline_24");

    @pmi0("video_outline_28")
    public static final AtumVkuiLocalImageDto VIDEO_OUTLINE_28 = new AtumVkuiLocalImageDto("VIDEO_OUTLINE_28", 1154, "video_outline_28");

    @pmi0("video_square_outline_20")
    public static final AtumVkuiLocalImageDto VIDEO_SQUARE_OUTLINE_20 = new AtumVkuiLocalImageDto("VIDEO_SQUARE_OUTLINE_20", 1155, "video_square_outline_20");

    @pmi0("video_square_outline_24")
    public static final AtumVkuiLocalImageDto VIDEO_SQUARE_OUTLINE_24 = new AtumVkuiLocalImageDto("VIDEO_SQUARE_OUTLINE_24", 1156, "video_square_outline_24");

    @pmi0("video_square_outline_28")
    public static final AtumVkuiLocalImageDto VIDEO_SQUARE_OUTLINE_28 = new AtumVkuiLocalImageDto("VIDEO_SQUARE_OUTLINE_28", 1157, "video_square_outline_28");

    @pmi0("video_square_outline_shadow_28")
    public static final AtumVkuiLocalImageDto VIDEO_SQUARE_OUTLINE_SHADOW_28 = new AtumVkuiLocalImageDto("VIDEO_SQUARE_OUTLINE_SHADOW_28", 1158, "video_square_outline_shadow_28");

    @pmi0("videocam_16")
    public static final AtumVkuiLocalImageDto VIDEOCAM_16 = new AtumVkuiLocalImageDto("VIDEOCAM_16", 1159, "videocam_16");

    @pmi0("videocam_24")
    public static final AtumVkuiLocalImageDto VIDEOCAM_24 = new AtumVkuiLocalImageDto("VIDEOCAM_24", 1160, "videocam_24");

    @pmi0("videocam_2_slash_outline_28")
    public static final AtumVkuiLocalImageDto VIDEOCAM_2_SLASH_OUTLINE_28 = new AtumVkuiLocalImageDto("VIDEOCAM_2_SLASH_OUTLINE_28", 1161, "videocam_2_slash_outline_28");

    @pmi0("videocam_outline_28")
    public static final AtumVkuiLocalImageDto VIDEOCAM_OUTLINE_28 = new AtumVkuiLocalImageDto("VIDEOCAM_OUTLINE_28", e.a.i, "videocam_outline_28");

    @pmi0("videocam_outline_56")
    public static final AtumVkuiLocalImageDto VIDEOCAM_OUTLINE_56 = new AtumVkuiLocalImageDto("VIDEOCAM_OUTLINE_56", 1163, "videocam_outline_56");

    @pmi0("videocam_part_outline_28")
    public static final AtumVkuiLocalImageDto VIDEOCAM_PART_OUTLINE_28 = new AtumVkuiLocalImageDto("VIDEOCAM_PART_OUTLINE_28", e.a.j, "videocam_part_outline_28");

    @pmi0("videocam_slash_24")
    public static final AtumVkuiLocalImageDto VIDEOCAM_SLASH_24 = new AtumVkuiLocalImageDto("VIDEOCAM_SLASH_24", 1165, "videocam_slash_24");

    @pmi0("videocam_slash_outline_28")
    public static final AtumVkuiLocalImageDto VIDEOCAM_SLASH_OUTLINE_28 = new AtumVkuiLocalImageDto("VIDEOCAM_SLASH_OUTLINE_28", 1166, "videocam_slash_outline_28");

    @pmi0("videocam_slash_outline_56")
    public static final AtumVkuiLocalImageDto VIDEOCAM_SLASH_OUTLINE_56 = new AtumVkuiLocalImageDto("VIDEOCAM_SLASH_OUTLINE_56", 1167, "videocam_slash_outline_56");

    @pmi0("videocam_slash_outline_color_28")
    public static final AtumVkuiLocalImageDto VIDEOCAM_SLASH_OUTLINE_COLOR_28 = new AtumVkuiLocalImageDto("VIDEOCAM_SLASH_OUTLINE_COLOR_28", 1168, "videocam_slash_outline_color_28");

    @pmi0("view_12")
    public static final AtumVkuiLocalImageDto VIEW_12 = new AtumVkuiLocalImageDto("VIEW_12", 1169, "view_12");

    @pmi0("view_16")
    public static final AtumVkuiLocalImageDto VIEW_16 = new AtumVkuiLocalImageDto("VIEW_16", 1170, "view_16");

    @pmi0("view_20")
    public static final AtumVkuiLocalImageDto VIEW_20 = new AtumVkuiLocalImageDto("VIEW_20", 1171, "view_20");

    @pmi0("view_outline_20")
    public static final AtumVkuiLocalImageDto VIEW_OUTLINE_20 = new AtumVkuiLocalImageDto("VIEW_OUTLINE_20", 1172, "view_outline_20");

    @pmi0("view_outline_24")
    public static final AtumVkuiLocalImageDto VIEW_OUTLINE_24 = new AtumVkuiLocalImageDto("VIEW_OUTLINE_24", 1173, "view_outline_24");

    @pmi0("view_outline_28")
    public static final AtumVkuiLocalImageDto VIEW_OUTLINE_28 = new AtumVkuiLocalImageDto("VIEW_OUTLINE_28", 1174, "view_outline_28");

    @pmi0("view_outline_56")
    public static final AtumVkuiLocalImageDto VIEW_OUTLINE_56 = new AtumVkuiLocalImageDto("VIEW_OUTLINE_56", 1175, "view_outline_56");

    @pmi0("vinyl_outline_24")
    public static final AtumVkuiLocalImageDto VINYL_OUTLINE_24 = new AtumVkuiLocalImageDto("VINYL_OUTLINE_24", 1176, "vinyl_outline_24");

    @pmi0("vinyl_outline_28")
    public static final AtumVkuiLocalImageDto VINYL_OUTLINE_28 = new AtumVkuiLocalImageDto("VINYL_OUTLINE_28", 1177, "vinyl_outline_28");

    @pmi0("vk_logo_monochrome_circle_blue_56")
    public static final AtumVkuiLocalImageDto VK_LOGO_MONOCHROME_CIRCLE_BLUE_56 = new AtumVkuiLocalImageDto("VK_LOGO_MONOCHROME_CIRCLE_BLUE_56", 1178, "vk_logo_monochrome_circle_blue_56");

    @pmi0("vk_video_logo_40")
    public static final AtumVkuiLocalImageDto VK_VIDEO_LOGO_40 = new AtumVkuiLocalImageDto("VK_VIDEO_LOGO_40", 1179, "vk_video_logo_40");

    @pmi0("vmoji_outline_24")
    public static final AtumVkuiLocalImageDto VMOJI_OUTLINE_24 = new AtumVkuiLocalImageDto("VMOJI_OUTLINE_24", 1180, "vmoji_outline_24");

    @pmi0("voice_24")
    public static final AtumVkuiLocalImageDto VOICE_24 = new AtumVkuiLocalImageDto("VOICE_24", 1181, "voice_24");

    @pmi0("voice_outline_24")
    public static final AtumVkuiLocalImageDto VOICE_OUTLINE_24 = new AtumVkuiLocalImageDto("VOICE_OUTLINE_24", 1182, "voice_outline_24");

    @pmi0("voice_outline_28")
    public static final AtumVkuiLocalImageDto VOICE_OUTLINE_28 = new AtumVkuiLocalImageDto("VOICE_OUTLINE_28", 1183, "voice_outline_28");

    @pmi0("volume_16")
    public static final AtumVkuiLocalImageDto VOLUME_16 = new AtumVkuiLocalImageDto("VOLUME_16", 1184, "volume_16");

    @pmi0("volume_24")
    public static final AtumVkuiLocalImageDto VOLUME_24 = new AtumVkuiLocalImageDto("VOLUME_24", 1185, "volume_24");

    @pmi0("volume_centered_outline_20")
    public static final AtumVkuiLocalImageDto VOLUME_CENTERED_OUTLINE_20 = new AtumVkuiLocalImageDto("VOLUME_CENTERED_OUTLINE_20", 1186, "volume_centered_outline_20");

    @pmi0("volume_outline_24")
    public static final AtumVkuiLocalImageDto VOLUME_OUTLINE_24 = new AtumVkuiLocalImageDto("VOLUME_OUTLINE_24", 1187, "volume_outline_24");

    @pmi0("volume_outline_28")
    public static final AtumVkuiLocalImageDto VOLUME_OUTLINE_28 = new AtumVkuiLocalImageDto("VOLUME_OUTLINE_28", 1188, "volume_outline_28");

    @pmi0("warning_triangle_outline_28")
    public static final AtumVkuiLocalImageDto WARNING_TRIANGLE_OUTLINE_28 = new AtumVkuiLocalImageDto("WARNING_TRIANGLE_OUTLINE_28", 1189, "warning_triangle_outline_28");

    @pmi0("wifi_outline_16")
    public static final AtumVkuiLocalImageDto WIFI_OUTLINE_16 = new AtumVkuiLocalImageDto("WIFI_OUTLINE_16", 1190, "wifi_outline_16");

    @pmi0("wifi_slash_outline_16")
    public static final AtumVkuiLocalImageDto WIFI_SLASH_OUTLINE_16 = new AtumVkuiLocalImageDto("WIFI_SLASH_OUTLINE_16", 1191, "wifi_slash_outline_16");

    @pmi0("work_outline_16")
    public static final AtumVkuiLocalImageDto WORK_OUTLINE_16 = new AtumVkuiLocalImageDto("WORK_OUTLINE_16", 1192, "work_outline_16");

    @pmi0("work_outline_20")
    public static final AtumVkuiLocalImageDto WORK_OUTLINE_20 = new AtumVkuiLocalImageDto("WORK_OUTLINE_20", 1193, "work_outline_20");

    @pmi0("work_outline_24")
    public static final AtumVkuiLocalImageDto WORK_OUTLINE_24 = new AtumVkuiLocalImageDto("WORK_OUTLINE_24", 1194, "work_outline_24");

    @pmi0("work_outline_28")
    public static final AtumVkuiLocalImageDto WORK_OUTLINE_28 = new AtumVkuiLocalImageDto("WORK_OUTLINE_28", 1195, "work_outline_28");

    @pmi0("write_24")
    public static final AtumVkuiLocalImageDto WRITE_24 = new AtumVkuiLocalImageDto("WRITE_24", 1196, "write_24");

    @pmi0("write_28")
    public static final AtumVkuiLocalImageDto WRITE_28 = new AtumVkuiLocalImageDto("WRITE_28", 1197, "write_28");

    @pmi0("write_outline_20")
    public static final AtumVkuiLocalImageDto WRITE_OUTLINE_20 = new AtumVkuiLocalImageDto("WRITE_OUTLINE_20", 1198, "write_outline_20");

    @pmi0("write_outline_24")
    public static final AtumVkuiLocalImageDto WRITE_OUTLINE_24 = new AtumVkuiLocalImageDto("WRITE_OUTLINE_24", 1199, "write_outline_24");

    @pmi0("writebar_done_48")
    public static final AtumVkuiLocalImageDto WRITEBAR_DONE_48 = new AtumVkuiLocalImageDto("WRITEBAR_DONE_48", 1200, "writebar_done_48");

    @pmi0("writebar_send_48")
    public static final AtumVkuiLocalImageDto WRITEBAR_SEND_48 = new AtumVkuiLocalImageDto("WRITEBAR_SEND_48", InterfaceC4319fe.a.b, "writebar_send_48");

    @pmi0("zip_outline_28")
    public static final AtumVkuiLocalImageDto ZIP_OUTLINE_28 = new AtumVkuiLocalImageDto("ZIP_OUTLINE_28", InterfaceC4319fe.a.c, "zip_outline_28");

    @pmi0("illustration_phone_actual_number_100h")
    public static final AtumVkuiLocalImageDto ILLUSTRATION_PHONE_ACTUAL_NUMBER_100H = new AtumVkuiLocalImageDto("ILLUSTRATION_PHONE_ACTUAL_NUMBER_100H", InterfaceC4319fe.a.g, "illustration_phone_actual_number_100h");

    static {
        AtumVkuiLocalImageDto[] i = i();
        $VALUES = i;
        $ENTRIES = e370.d(i);
        CREATOR = new Parcelable.Creator<AtumVkuiLocalImageDto>() { // from class: com.vk.api.generated.atum.dto.AtumVkuiLocalImageDto.a
            @Override // android.os.Parcelable.Creator
            public final AtumVkuiLocalImageDto createFromParcel(Parcel parcel) {
                return AtumVkuiLocalImageDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final AtumVkuiLocalImageDto[] newArray(int i2) {
                return new AtumVkuiLocalImageDto[i2];
            }
        };
    }

    private AtumVkuiLocalImageDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static final /* synthetic */ AtumVkuiLocalImageDto[] i() {
        return new AtumVkuiLocalImageDto[]{TYPE_16_CIRCLE_OUTLINE_56, TYPE_18_CIRCLE_OUTLINE_28, TYPE_18_CIRCLE_OUTLINE_56, TYPE_3_SQUARE_20, TYPE_4_SQUARE_20, ADD_12, ADD_16, ADD_24, ADD_36, ADD_ALT_20, ADD_AWARDS_OUTLINE_24, ADD_CIRCLE_20, ADD_CIRCLE_24, ADD_CIRCLE_FILL_20, ADD_CIRCLE_FILL_BLUE_16, ADD_CIRCLE_FILL_LIGHT_20, ADD_CIRCLE_FILL_WHITE_16, ADD_CIRCLE_OUTLINE_24, ADD_CIRCLE_OUTLINE_28, ADD_OUTLINE_24, ADD_OUTLINE_28, ADD_PART_16, ADD_SQUARE_OUTLINE_20, ADD_SQUARE_OUTLINE_24, ADD_SQUARE_OUTLINE_28, ADVERTISING_24, ADVERTISING_CHECK_OUTLINE_24, ADVERTISING_OUTLINE_24, ADVERTISING_OUTLINE_28, ADVERTISING_OUTLINE_BACKGROUND_OPACITY_48, AIRPLAY_AUDIO_OUTLINE_28, AIRPLAY_VIDEO_OUTLINE_28, ALBUM_FILLED_12, ALL_CATEGORIES_OUTLINE_28, ANGRY_PERSIK_150, APP_BADGE_OUTLINE_28, ARCHIVE_OUTLINE_16, ARCHIVE_OUTLINE_24, ARCHIVE_OUTLINE_28, ARCHIVE_OUTLINE_56, ARROW_DOWN_12, ARROW_DOWN_CIRCLE_12, ARROW_DOWN_CIRCLE_16, ARROW_DOWN_LEFT_12, ARROW_DOWN_OUTLINE_20, ARROW_DOWN_OUTLINE_24, ARROW_LEFT_OUTLINE_16, ARROW_LEFT_OUTLINE_28, ARROW_RIGHT_CIRCLE_OUTLINE_28, ARROW_RIGHT_OUTLINE_16, ARROW_RIGHT_OUTLINE_20, ARROW_RIGHT_OUTLINE_24, ARROW_RIGHT_OUTLINE_28, ARROW_RIGHT_SQUARE_OUTLINE_24, ARROW_TRIANGLE_DOWN_16, ARROW_TRIANGLE_UP_16, ARROW_UP_CIRCLE_OUTLINE_28, ARROW_UP_DOWN_CORNERS_OUTLINE_24, ARROW_UP_OUTLINE_20, ARROW_UP_OUTLINE_24, ARROW_UP_RECTANGLE_16, ARROW_UP_RECTANGLE_28, ARROW_UP_RECTANGLE_OUTLINE_28, ARROW_UP_RECTANGLE_SLASH_OUTLINE_28, ARROW_UP_RIGHT_12, ARROW_UP_RIGHT_OUT_SQUARE_OUTLINE_12, ARROW_UP_RIGHT_OUTLINE_24, ARROW_UTURN_LEFT_OUTLINE_20, ARROW_UTURN_LEFT_OUTLINE_28, ARROW_UTURN_RIGHT_12, ARROW_UTURN_RIGHT_OUTLINE_28, ARTICLE_24, ARTICLE_BOX_OUTLINE_20, ARTICLE_BOX_OUTLINE_24, ARTICLE_OUTLINE_20, ARTICLE_OUTLINE_24, ARTICLE_OUTLINE_28, ARTICLE_OUTLINE_56, ARTICLES_12, ARTICLES_20, ARTICLES_OUTLINE_20, ARTICLES_OUTLINE_24, ARTICLES_OUTLINE_28, ARTICLES_OUTLINE_56, ARTIST_24, ATTACH_16, ATTACH_20, ATTACH_24, ATTACH_OUTLINE_28, ATTACH_OUTLINE_LARGE_48, ATTACH_SUBSTRACT_OUTLINE_LARGE_48, AVATAR_PLACEHOLDER_ANONIM_150, AVATAR_PLACEHOLDER_BUNNY_150, AVATAR_PLACEHOLDER_SAD_PERSIK_ALT_150, BADGE_VK_MUSIC_COLOR_RU_36, BALL_OUTLINE_24, BANK_OUTLINE_24, BANK_OUTLINE_28, BLOCK_16, BLOCK_OUTLINE_20, BLOCK_OUTLINE_24, BLOCK_OUTLINE_48, BLOCK_OUTLINE_56, BLOGGER_MARK_10K_OUTLINE_20, BLOGGER_MARK_10K_OUTLINE_56, BLUETOOTH_OUTLINE_28, BOMB_12, BOMB_16, BOMB_OUTLINE_20, BOMB_OUTLINE_28, BOOK_SPREAD_16, BOOK_SPREAD_OUTLINE_24, BOOK_SPREAD_OUTLINE_28, BOOKMARK_16, BOOKMARK_24, BOOKMARK_28, BOOKMARK_ADD_OUTLINE_28, BOOKMARK_CHECK_28, BOOKMARK_CHECK_OUTLINE_28, BOOKMARK_OUTLINE_24, BOOKMARK_OUTLINE_28, BOOKMARK_OUTLINE_SHADOW_MEDIUM_48, BOOKMARK_SHADOW_MEDIUM_48, BOOKMARK_SLASH_OUTLINE_24, BOOKMARK_SLASH_OUTLINE_28, BRIEFCASE_OUTLINE_24, BRIEFCASE_OUTLINE_28, BRUSH_OUTLINE_24, BRUSH_OUTLINE_28, BUG_OUTLINE_24, BUG_OUTLINE_28, CAKE_12, CAKE_CIRCLE_FILL_PURPLE_16, CAKE_CIRCLE_FILL_PURPLE_20, CAKE_CIRCLE_FILL_PURPLE_32, CAKE_OUTLINE_20, CALENDAR_ADD_OUTLINE_24, CALENDAR_ADD_OUTLINE_28, CALENDAR_OUTLINE_20, CALENDAR_OUTLINE_24, CALENDAR_OUTLINE_28, CALENDAR_OUTLINE_56, CAM_SLASH_16, CAMERA_OFF_OUTLINE_56, CAMERA_OUTLINE_24, CAMERA_OUTLINE_28, CAMERA_OUTLINE_36, CAMERA_OUTLINE_48, CAMERA_OUTLINE_56, CANCEL_16, CANCEL_20, CANCEL_24, CANCEL_28, CANCEL_CIRCLE_16, CANCEL_CIRCLE_OUTLINE_28, CANCEL_CIRCLE_OUTLINE_56, CANCEL_OUTLINE_24, CANCEL_OUTLINE_28, CANCEL_OUTLINE_36, CAR_OUTLINE_28, CARDS_2_OUTLINE_28, CAROUSEL_OUTLINE_16, CAROUSEL_OUTLINE_20, CHAIN_20, CHAIN_OUTLINE_16, CHAIN_OUTLINE_24, CHAIN_OUTLINE_28, CHAIN_OUTLINE_56, CHECK_12, CHECK_20, CHECK_ALT_20, CHECK_BOX_INDETERMANATE_20, CHECK_BOX_INDETERMINATE_24, CHECK_BOX_OFF_20, CHECK_BOX_OFF_24, CHECK_BOX_ON_20, CHECK_BOX_ON_24, CHECK_CIRCLE_12, CHECK_CIRCLE_FILL_28, CHECK_CIRCLE_FILL_DARK_16, CHECK_CIRCLE_FILLED_BLUE_SHADOW_MEDIUM_48, CHECK_CIRCLE_OFF_24, CHECK_CIRCLE_ON_24, CHECK_CIRCLE_ON_28, CHECK_CIRCLE_OUTLINE_24, CHECK_CIRCLE_OUTLINE_28, CHECK_CIRCLE_OUTLINE_56, CHECK_CIRCLE_SHADOW_40, CHECK_CIRCLE_SHADOW_LARGE_48, CHECK_OUTLINE_16, CHECK_PART_16, CHECK_SHIELD_OUTLINE_20, CHECK_SHIELD_OUTLINE_28, CHECK_SHIELD_OUTLINE_56, CHECK_SMALL_OUTLINE_20, CHECK_SQUARE_OUTLINE_24, CHECK_SQUARE_OUTLINE_28, CHECKS_OUTLINE_28, CHECKS_SMALL_OUTLINE_20, CHEF_HAT_OUTLINE_28, CHEVRON_16, CHEVRON_24, CHEVRON_CIRCLE_OUTLINE_20, CHEVRON_COMPACT_RIGHT_24, CHEVRON_DOWN_24, CHEVRON_DOWN_OUTLINE_28, CHEVRON_DOWN_SMALL_24, CHEVRON_LEFT_16, CHEVRON_LEFT_28, CHEVRON_LEFT_2_20, CHEVRON_LEFT_OUTLINE_28, CHEVRON_LEFT_OUTLINE_36, CHEVRON_LEFT_SMALL_OUTLINE_24, CHEVRON_OUTLINE_16, CHEVRON_OUTLINE_SHADOW_LARGE_48, CHEVRON_RIGHT_24, CHEVRON_RIGHT_2_20, CHEVRON_RIGHT_CIRCLE_24, CHEVRON_RIGHT_CIRCLE_28, CHEVRON_RIGHT_CIRCLE_OUTLINE_28, CHEVRON_RIGHT_OUTLINE_20, CHEVRON_RIGHT_OUTLINE_28, CHEVRON_RIGHT_OUTLINE_36, CHEVRON_RIGHT_OUTLINE_48, CHEVRON_RIGHT_SMALL_OUTLINE_24, CHEVRON_UP_20, CHEVRON_UP_24, CHEVRON_UP_OUTLINE_28, CIRCLE_OUTLINE_SHADOW_40, CIRCLE_OUTLINE_SHADOW_LARGE_48, CIRCLE_OUTLINE_SHADOW_MEDIUM_48, CLEAR_16, CLEAR_20, CLEAR_DATA_OUTLINE_28, CLIP_OUTLINE_28, CLOCK_12, CLOCK_CIRCLE_DASHED_OUTLINE_24, CLOCK_OUTLINE_12, CLOCK_OUTLINE_16, CLOCK_OUTLINE_20, CLOCK_OUTLINE_24, CLOCK_OUTLINE_28, CLOCK_SHADOW_48, CLOUD_OUTLINE_28, CLOUD_SHADOW_24, COLOR_PICKER_OUTLINE_20, COMMENT_OUTLINE_16, COMMENT_OUTLINE_20, COMMENT_OUTLINE_24, COMMENT_OUTLINE_28, COMMENT_OUTLINE_56, COMMENT_SLASH_OUTLINE_24, COMMUNITY_NAME_20, COMPASS_48, COMPASS_CIRCLE_FILL_PURPLE_28, COMPASS_CIRCLE_FILL_PURPLE_72, COMPASS_OUTLINE_28, CONNECTION_16, COPY_OUTLINE_20, COPY_OUTLINE_24, COPY_OUTLINE_28, CROP_24, CROP_OUTLINE_16, CROSS_CIRCLE_40, CROWN_16, CROWN_OUTLINE_28, CROWN_VERIFIED_16, CROWN_VERIFIED_20, CROWN_VERIFIED_56, CUBE_BOX_OUTLINE_16, CUBE_BOX_OUTLINE_20, CUBE_BOX_OUTLINE_28, CUP_OUTLINE_24, CUP_OUTLINE_28, CUTOUT_SQUARE_PART_20, DELETE_CLOCK_OUTLINE_28, DELETE_OUTLINE_20, DELETE_OUTLINE_24, DELETE_OUTLINE_28, DELETE_OUTLINE_56, DELETE_SAVED_OUTLINE_28, DIAMOND_OUTLINE_28, DISCOUNT_OUTLINE_28, DISCUSSIONS_24, DISMISS_24, DISMISS_28, DISMISS_DARK_24, DISMISS_OVERLAY_24, DISMISS_SUBSTRACT_24, DO_NOT_DISTURB_24, DO_NOT_DISTURB_OUTLINE_56, DOCUMENT_24, DOCUMENT_OUTLINE_20, DOCUMENT_OUTLINE_24, DOCUMENT_OUTLINE_28, DOCUMENT_TEXT_OUTLINE_28, DONATE_OUTLINE_16, DONATE_OUTLINE_20, DONATE_OUTLINE_24, DONATE_OUTLINE_48, DONATE_OUTLINE_56, DONE_16, DONE_24, DONE_36, DONE_OUTLINE_24, DONE_OUTLINE_28, DONE_SHADOW_MEDIUM_48, DONUT_CIRCLE_FILL_YELLOW_20, DONUT_CIRCLE_FILL_YELLOW_32, DOOR_ARROW_LEFT_OUTLINE_28, DOOR_ARROW_RIGHT_OUTLINE_24, DOOR_ARROW_RIGHT_OUTLINE_28, DOOR_ARROW_RIGHT_OUTLINE_56, DOOR_ENTER_ARROW_RIGHT_OUTLINE_16, DOWNLOAD_24, DOWNLOAD_CANCEL_OUTLINE_28, DOWNLOAD_CHECK_OUTLINE_24, DOWNLOAD_CHECK_OUTLINE_28, DOWNLOAD_CIRCLE_40, DOWNLOAD_CROSS_BADGE_OUTLINE_24, DOWNLOAD_DASHED_OUTLINE_16, DOWNLOAD_DASHED_OUTLINE_24, DOWNLOAD_ERROR_OUTLINE_24, DOWNLOAD_OUTLINE_16, DOWNLOAD_OUTLINE_24, DOWNLOAD_OUTLINE_28, DOWNLOAD_OUTLINE_56, DRILL_OUTLINE_28, DROPDOWN_12, DROPDOWN_16, DROPDOWN_20, DROPDOWN_FLIPPED_16, DROPDOWN_OUTLINE_16, EDIT_OUTLINE_28, EDUCATION_12, EDUCATION_16, EDUCATION_OUTLINE_16, EDUCATION_OUTLINE_20, EDUCATION_OUTLINE_24, EDUCATION_OUTLINE_28, ERROR_CIRCLE_16, ERROR_CIRCLE_24, ERROR_CIRCLE_FILL_12, ERROR_CIRCLE_FILL_16, ERROR_CIRCLE_FILL_GRAY_12, ERROR_CIRCLE_FILL_OVERLAY_12, ERROR_CIRCLE_FILL_OVERLAY_16, ERROR_CIRCLE_FILL_RED_20, ERROR_CIRCLE_FILL_RED_24, ERROR_CIRCLE_OUTLINE_16, ERROR_CIRCLE_OUTLINE_20, ERROR_CIRCLE_OUTLINE_28, ERROR_OUTLINE_28, ERROR_OUTLINE_56, ERROR_TRIANGLE_OUTLINE_56, EXPLICIT_16, EXPLICIT_24, EXTERNAL_LINK_OUTLINE_24, FACE_ARROWS_OULTLINE_LARGE_48, FAVORITE_12, FAVORITE_16, FAVORITE_20, FAVORITE_28, FAVORITE_36, FAVORITE_CIRCLE_FILL_GREEN_20, FAVORITE_CIRCLE_FILL_GREEN_32, FAVORITE_OUTLINE_16, FAVORITE_OUTLINE_20, FAVORITE_OUTLINE_28, FAVORITE_OUTLINE_36, FAVORITE_OUTLINE_56, FILM_STRIP_ADD_OUTLINE_28, FILTER_24, FIRE_12, FIRE_16, FIRE_SMALL_16, FIRE_VERIFIED_16, FLAG_12, FLAG_16, FLAPPER_20, FLASH_16, FLASH_CIRCLE_12, FLASH_OUTLINE_24, FOLDER_OUTLINE_24, FOLDER_OUTLINE_28, FOLDER_PLUS_BADGE_OUTLINE_56, FOLLOWERS_OUTLINE_20, FULLSCREEN_EXIT_24, FULLSCREEN_OUTLINE_20, FULLSCREEN_OUTLINE_28, GALLERY_24, GALLERY_OUTLINE_56, GAME_16, GAME_OUTLINE_24, GAME_OUTLINE_28, GAME_OUTLINE_56, GEAR_OUTLINE_20, GEAR_OUTLINE_24, GHOST_16, GHOST_20, GHOST_OUTLINE_28, GHOST_OUTLINE_56, GIF_OUTLINE_24, GIFT_16, GIFT_24, GIFT_CIRCE_FILLED_36, GIFT_OUTLINE_20, GIFT_OUTLINE_24, GIFT_OUTLINE_28, GIFT_OUTLINE_56, GLOBE_CIRCLE_FILL_BLUE_28, GLOBE_CROSS_OUTLINE_20, GLOBE_CROSS_OUTLINE_28, GLOBE_CROSS_OUTLINE_56, GLOBE_OUTLINE_16, GLOBE_OUTLINE_20, GLOBE_OUTLINE_24, GLOBE_OUTLINE_28, GOODS_COLLECTION_56, GRADIENT_28, GRAPH_OUTLINE_20, GRAPH_OUTLINE_24, GRID_LAYOUT_OUTLINE_28, GRID_OUTLINE_16, HAND_12, HAND_16, HAND_2_SLASH_OUTLINE_28, HAND_HEART_FILLED_28, HAND_HEART_OUTLINE_28, HAND_OUTLINE_24, HAND_POINT_UP_12, HAND_POINT_UP_LEFT_OUTLINE_56, HAND_POINT_UP_OUTLINE_24, HAND_SLASH_OUTLINE_28, HANGER_OUTLINE_24, HASHTAG_16, HASHTAG_OUTLINE_24, HEADPHONES_16, HEADPHONES_OUTLINE_28, HEADPHONES_WAVE_OUTLINE_24, HEADPHONES_WAVE_OUTLINE_56, HEART_CIRCLE_OUTLINE_28, HEART_SETTINGS_OUTLINE_20, HELP_CIRCLE_OUTLINE_28, HELP_OUTLINE_16, HELP_OUTLINE_20, HELP_OUTLINE_24, HELP_OUTLINE_56, HELP_OUTLINE_SHADOW_LARGE_48, HIDE_OUTLINE_20, HIDE_OUTLINE_24, HIDE_OUTLINE_28, HIDE_OUTLINE_48, HIDE_OUTLINE_SHADOW_MEDIUM_48, HIEROGLYPH_CHARACTER_OUTLINE_12, HIEROGLYPH_CHARACTER_OUTLINE_24, HIEROGLYPH_CHARACTER_OUTLINE_28, HISTORY_BACKWARD_OUTLINE_20, HISTORY_BACKWARD_OUTLINE_24, HISTORY_BACKWARD_OUTLINE_28, HISTORY_FORWARD_OUTLINE_28, HISTORY_FORWARD_SUBSTRACT_OUTLINE_28, HOME_HEART_OUTLINE_24, HOME_OUTLINE_20, HOME_OUTLINE_28, HORIZONTAL_RECTANGLE_16X9_OUTLINE_20, HORIZONTAL_RECTANGLE_OUTLINE_20, HORSE_TOY_OUTLINE_28, ILLUSTRATION_ACCESS_120H, ILLUSTRATION_AGE_LIMIT_112H, ILLUSTRATION_ALBUMS_64H, ILLUSTRATION_ANTENNA_DARK_56, ILLUSTRATION_ANTENNA_LIGHT_56, ILLUSTRATION_ARCHIVE_64H, ILLUSTRATION_BAD_26H, ILLUSTRATION_CALL_48, ILLUSTRATION_CALL_56, ILLUSTRATION_CALL_TO_ACTION_200H, ILLUSTRATION_CAT_CLOSED_WALL_78H, ILLUSTRATION_CHANNEL_120, ILLUSTRATION_CHANNEL_142, ILLUSTRATION_COMMENTS_120H, ILLUSTRATION_COMMENTS_SHARE_120H, ILLUSTRATION_COMMUNITIES_120H, ILLUSTRATION_CONTRAINDICATIONS_26H, ILLUSTRATION_DONUT_CUP_LIGHT_36, ILLUSTRATION_DOWNLOAD_VIDEO_64H, ILLUSTRATION_EVALUATION_96H, ILLUSTRATION_EXCEEDING_LIMIT_120H, ILLUSTRATION_HEART_80, ILLUSTRATION_INTERACTIVE_MAP_200H, ILLUSTRATION_INTERACTIVE_RESTART_200H, ILLUSTRATION_INTERACTIVE_VIDEO_200H, ILLUSTRATION_LGBT_112H, ILLUSTRATION_LYRICS_56H, ILLUSTRATION_MAGNIFIER_96H, ILLUSTRATION_MINI_WIDGET_DARK, ILLUSTRATION_MINI_WIDGET_LIGHT, ILLUSTRATION_NOTIFICATION_BELL_DARK_96, ILLUSTRATION_NOTIFICATION_BELL_LIGHT_96, ILLUSTRATION_NOTIFICATIONS_SFERUM_180, ILLUSTRATION_PERSIK_DOWNTIME_210H, ILLUSTRATION_PHOTOS_64H, ILLUSTRATION_PLACEHOLDER_KID_LLAMA_150, ILLUSTRATION_RATING_AND_REVIEW_LIGHT_120H, ILLUSTRATION_SERVICES_PEOPLE_120H, ILLUSTRATION_SKIP_PREVIOUS_200H, ILLUSTRATION_SNOWBALL_192H, ILLUSTRATION_SNOWBALL_50, ILLUSTRATION_STRIKE_120H, ILLUSTRATION_THREE_PEOPLE_64H, ILLUSTRATION_UFO_96, ILLUSTRATION_UNRELIABLE_112H, ILLUSTRATION_VK_DONUT_16, IMAGE_FORMAT_OUTLINE_20, INBOX_OUTLINE_28, INBOX_OUTLINE_56, INFO_20, INFO_CIRCLE_16, INFO_CIRCLE_OUTLINE_20, INFO_CIRCLE_OUTLINE_24, INFO_OUTLINE_16, KEY_OUTLINE_28, KEYBOARD_OUTLINE_28, KNIFE_OUTLINE_24, LIFEBUOY_OUTLINE_24, LIFEBUOY_OUTLINE_28, LIGHTBULB_OUTLINE_28, LIGHTBULB_STAR_OUTLINE_28, LIKE_16, LIKE_24, LIKE_28, LIKE_36, LIKE_48, LIKE_CIRCLE_FILL_RED_20, LIKE_FILL_RED_28, LIKE_OUTLINE_16, LIKE_OUTLINE_20, LIKE_OUTLINE_24, LIKE_OUTLINE_28, LIKE_OUTLINE_56, LIKE_OUTLINE_SHADOW_MEDIUM_48, LIKE_SHADOW_24, LIKE_SHADOW_MEDIUM_RED_48, LIKE_WITH_STROKE_18, LINK_16, LINK_24, LINK_CIRCLE_24, LINK_CIRCLE_OUTLINE_20, LINK_CIRCLE_OUTLINE_28, LINK_CIRCLE_OUTLINE_56, LINK_OUTLINE_28, LINKED_16, LIST_ADD_OUTLINE_24, LIST_ADD_OUTLINE_28, LIST_BULLET_SQUARE_OUTLINE_24, LIST_BULLET_SQUARE_OUTLINE_56, LIST_INSERT_FIRST_OUTLINE_20, LIST_INSERT_FIRST_OUTLINE_28, LIST_LIKE_FILL_24, LIST_LIKE_OUTLINE_24, LIST_LIKE_OUTLINE_28, LIST_LIKE_SLASH_OUTLINE_24, LIST_OUTLINE_28, LIST_PLAY_OUTLINE_20, LIST_PLAY_OUTLINE_28, LIST_PLAY_OUTLINE_56, LIVE_24, LIVE_ADD_OUTLINE_28, LIVE_BADGE_12, LIVE_BADGE_16, LIVE_BADGE_18, LIVE_BADGE_20, LIVE_OUTLINE_24, LIVE_OUTLINE_28, LIVE_TEXT_20H, LOCATION_24, LOCATION_MAP_OUTLINE_24, LOCATION_MAP_OUTLINE_28, LOCATION_OUTLINE_24, LOCATION_OUTLINE_28, LOCATION_PIN_56, LOCK_12, LOCK_16, LOCK_OPEN_16, LOCK_OPEN_OUTLINE_24, LOCK_OUTLINE_16, LOCK_OUTLINE_20, LOCK_OUTLINE_24, LOCK_OUTLINE_28, LOCK_OUTLINE_56, LOCK_SHADOW_24, LOGO_ACHIEVEMENTS_100, LOGO_ADCHOICES_16, LOGO_ALFA_BANK_COLOR_28, LOGO_APPLE_24, LOGO_AVITO_16, LOGO_CLIPS_12, LOGO_CLIPS_32, LOGO_CLIPS_OUTLINE_20, LOGO_CLIPS_OUTLINE_24, LOGO_CLIPS_OUTLINE_28, LOGO_CLIPS_OUTLINE_56, LOGO_CLIPS_OUTLINE_SHADOW_20, LOGO_DONUT_48, LOGO_GAZPROMBANK_COLOR_28, LOGO_GOSUSLUGI_COLOR_28, LOGO_ICQ_OUTLINE_24, LOGO_INSTAGRAM_28, LOGO_MAX_COLOR_56, LOGO_OPENBANK_COLOR_28, LOGO_OZON_14H, LOGO_RAIFFEISEN_COLOR_28, LOGO_ROSSIA_COLOR_28, LOGO_SBER_COLOR_28, LOGO_SFERUM_COLOR_16, LOGO_SFERUM_COLOR_28, LOGO_SKYPE_28, LOGO_SPB_COLOR_28, LOGO_TELEGRAM_COLOR_56, LOGO_TINKOFF_COLOR_28, LOGO_VK_CALLS_OUTLINE_28, LOGO_VK_CLIPS_COLOR_24, LOGO_VK_ME_COLOR_16, LOGO_VK_ME_COLOR_24, LOGO_VK_MUSIC_16, LOGO_VK_MUSIC_OUTLINE_28, LOGO_VK_OUTLINE_24, LOGO_VK_OUTLINE_28, LOGO_VK_SHADOW_48, LOGO_VK_VIDEO_16, LOGO_VK_VIDEO_COLOR_24, LOGO_VK_VIDEO_COLOR_28, LOGO_VK_VIDEO_COLOR_56, LOGO_VK_VIDEO_OUTLINE_20, LOGO_VK_VIDEO_OUTLINE_28, LOGO_VK_VIDEO_OUTLINE_SHADOW_28, LOGO_VK_VIDEO_SLASH_OUTLINE_28, LOGO_VTB_COLOR_28, LOGO_WHATSAPP_COLOR_56, LOTUS_OUTLINE_28, LOUDSPEAKER_SLASH_OUTLINE_28, MAGIC_WAND_OUTLINE_24, MAGIC_WAND_OUTLINE_28, MAIL_OUTLINE_20, MAIL_OUTLINE_24, MAIL_OUTLINE_28, MAIL_OUTLINE_56, MAP_PIN_SHADOW_26H, MAP_PIN_SHADOW_48H, MARKET_16, MARKET_24, MARKET_ADD_BADGE_OUTLINE_28, MARKET_CIRCLE_FILL_BLUE_28, MARKET_OUTLINE_16, MARKET_OUTLINE_20, MARKET_OUTLINE_24, MARKET_OUTLINE_28, MARKET_OUTLINE_36, MARKET_OUTLINE_56, MASK_16, MASK_LIVE_80, MASK_LIVE_88, MASK_STREAM_ENDED_80, MASK_STREAM_ENDED_88, MASKS_OUTLINE_28, MEGAPHONE_OUTLINE_28, MENTION_12, MENTION_16, MENTION_OUTLINE_20, MENTION_OUTLINE_24, MENTION_OUTLINE_28, MENU_OUTLINE_16, MENU_OUTLINE_28, MESSAGE_24, MESSAGE_28, MESSAGE_ADD_BADGE_OUTLINE_28, MESSAGE_ARROW_RIGHT_OUTLINE_20, MESSAGE_ARROW_RIGHT_OUTLINE_24, MESSAGE_ARROW_RIGHT_OUTLINE_28, MESSAGE_CHECK_OUTLINE_28, MESSAGE_CROSS_12, MESSAGE_CROSS_16, MESSAGE_CROSS_OUTLINE_28, MESSAGE_FORWARD_OUTLINE_24, MESSAGE_OUTLINE_20, MESSAGE_OUTLINE_24, MESSAGE_OUTLINE_28, MESSAGE_OUTLINE_SHADOW_28, MESSAGE_PIN_OUTLINE_28, MESSAGE_REACTION_404_46, MESSAGE_REACTION_ANGRY_512, MESSAGE_REACTION_CRY_512, MESSAGE_REACTION_FIRE_512, MESSAGE_REACTION_HEART_512, MESSAGE_REACTION_LAUGH_512, MESSAGE_REACTION_LIKE_512, MESSAGE_REACTION_POOP_512, MESSAGE_REACTION_QUESTIONS_512, MESSAGE_REPLY_OUTLINE_28, MESSAGE_TEXT_OUTLINE_20, MESSAGE_TEXT_OUTLINE_28, MESSAGE_UNREAD_CIRCLE_FILL_RED_28, MESSAGE_UNREAD_OUTLINE_24, MESSAGE_UNREAD_TOP_OUTLINE_20, MESSAGE_UNREAD_TOP_OUTLINE_24, MESSAGES_OUTLINE_20, MESSAGES_OUTLINE_24, MESSAGES_OUTLINE_28, MESSAGES_OUTLINE_56, MIC_SLASH_OUTLINE_28, MICROPHONE_16, MICROPHONE_2_SLASH_OUTLINE_28, MICROPHONE_OUTLINE_56, MICROPHONE_PART_OUTLINE_28, MICROPHONE_SLASH_16, MICROPHONE_SLASH_24, MICROPHONE_SLASH_OUTLINE_24, MICROPHONE_SLASH_OUTLINE_28, MICROPHONE_SLASH_OUTLINE_COLOR_28, MICROPHONE_VIDEOCAM_OUTLINE_28, MICROPHONE_VIDEOCAM_SLASH_OUTLINE_28, MINUS_16, MINUS_SQUARE_OUTLINE_28, MONEY_CIRCLE_OUTLINE_24, MONEY_TRANSFER_OUTLINE_24, MONEY_TRANSFER_OUTLINE_32, MONEY_WAD_OUTLINE_28, MOON_24, MOON_OUTLINE_28, MORE_20, MORE_HORIZONTAL_24, MORE_HORIZONTAL_28, MORE_HORIZONTAL_SHADOW_MEDIUM_48, MORE_VERTICAL_16, MORE_VERTICAL_24, MOTORCYCLE_OUTLINE_24, MUSIC_16, MUSIC_MIC_OUTLINE_24, MUSIC_MIC_OUTLINE_28, MUSIC_MIC_OUTLINE_36, MUSIC_MIC_OUTLINE_56, MUSIC_NOTE_12, MUSIC_NOTE_WAVE_OUTLINE_24, MUSIC_NOTE_WAVE_OUTLINE_28, MUSIC_OUTLINE_16, MUSIC_OUTLINE_20, MUSIC_OUTLINE_24, MUSIC_OUTLINE_28, MUSIC_OUTLINE_56, MUSIC_OUTLINE_SHADOW_28, MUTE_CROSS_16, MUTE_OUTLINE_24, MUTE_OUTLINE_28, MUTED_16, NARRATIVE_ACTIVE_OUTLINE_12, NARRATIVE_ACTIVE_OUTLINE_28, NARRATIVE_OUTLINE_20, NARRATIVE_OUTLINE_24, NARRATIVE_OUTLINE_28, NEW_16, NEW_BADGE_ROUNDED_24, NEW_LOGO_VK_16, NEWS_COLOR_28, NEWSFEED_24, NEWSFEED_MUSIC_NOTE_OUTLINE_28, NEWSFEED_OUTLINE_24, NEWSFEED_OUTLINE_28, NEWSFEED_OUTLINE_56, NOTE_24, NOTE_PEN_OUTLINE_56, NOTEBOOK_16, NOTEBOOK_ADD_BADGE_OUTLINE_28, NOTEBOOK_CHECK_OUTLINE_20, NOTEBOOK_CHECK_OUTLINE_24, NOTEBOOK_CHECK_OUTLINE_28, NOTEBOOK_CHECK_OUTLINE_36, NOTEBOOK_CHECK_OUTLINE_56, NOTIFICATION_ADD_OUTLINE_28, NOTIFICATION_CHECK_OUTLINE_28, NOTIFICATION_DISABLE_OUTLINE_28, NOTIFICATION_OUTLINE_20, NOTIFICATION_OUTLINE_24, NOTIFICATION_OUTLINE_56, NOTIFICATION_SLASH_OUTLINE_20, NOTIFICATION_SLASH_OUTLINE_24, NOTIFICATION_WAVES_16, NOTIFICATION_WAVES_20, NOTIFICATION_WAVES_28, NOTIFICATIONS_28, ONBOARDING_AWARDS_BANNER_78H, ONBOARDING_AWARDS_MODAL_160H, ONLINE_MOBILE_12, ONLINE_MOBILE_16, PALETTE_OUTLINE_24, PALETTE_OUTLINE_56, PAUSE_16, PAUSE_20, PAUSE_24, PAUSE_28, PAUSE_32, PAUSE_36, PAUSE_BUTTON_64, PAUSE_OUTLINE_28, PAW_OUTLINE_28, PAYMENT_CARD_OUTLINE_16, PAYMENT_CARD_OUTLINE_20, PAYMENT_CARD_OUTLINE_24, PAYMENT_CARD_OUTLINE_28, PEN_OUTLINE_24, PEN_STACK_OUTLINE_28, PENCIL_12, PHONE_16, PHONE_24, PHONE_ADD_OUTLINE_28, PHONE_CIRCLE_FILL_GREEN_20, PHONE_CROSS_OUTLINE_28, PHONE_DOWN_20, PHONE_DOWN_FILLED_28, PHONE_DOWN_OUTLINE_56, PHONE_OUTLINE_20, PHONE_OUTLINE_24, PHONE_OUTLINE_28, PHONE_OUTLINE_56, PHONE_WAVE_OUTLINE_28, PHOTOS_STACK_OUTLINE_24, PICTURE_36, PICTURE_ON_SQUARE_OUTLINE_20, PICTURE_ON_SQUARE_OUTLINE_SHADOW_28, PICTURE_OUTLINE_20, PICTURE_OUTLINE_24, PICTURE_OUTLINE_28, PICTURE_OUTLINE_32, PICTURE_OUTLINE_48, PICTURE_STACK_OUTLINE_20, PICTURE_STACK_OUTLINE_28, PIN_12, PIN_16, PIN_20, PIN_DOT_16, PIN_DOT_OUTLINE_28, PIN_DOT_SLASH_OUTLINE_28, PIN_OUTLINE_20, PIN_OUTLINE_24, PIN_OUTLINE_28, PIN_OUTLINE_SHADOW_28, PIN_SHADOW_24, PIN_SLASH_OUTLINE_24, PLACE_12, PLACE_16, PLACE_24, PLACE_OUTLINE_16, PLACE_OUTLINE_20, PLACE_OUTLINE_24, PLACE_OUTLINE_28, PLACE_OUTLINE_56, PLANE_OUTLINE_28, PLAY_12, PLAY_16, PLAY_20, PLAY_24, PLAY_28, PLAY_32, PLAY_36, PLAY_BUTTON_56, PLAY_BUTTON_64, PLAY_CIRCLE_FILL_GRAY_16, PLAY_CIRCLE_FILL_RED_28, PLAY_CIRCLE_FILL_STEEL_GRAY_20, PLAY_NEXT_24, PLAY_NEXT_OUTLINE_24, PLAY_RECTANGLE_STACK_OUTLINE_28, PLAY_SPEED_OUTLINE_28, PLAYLIST_24, PLAYLIST_OUTLINE_20, PLAYLIST_OUTLINE_24, PLAYLIST_OUTLINE_28, PLAYLIST_OUTLINE_36, PLAYLIST_OUTLINE_56, PODCAST_24, PODCAST_OUTLINE_20, PODCAST_OUTLINE_28, PODCAST_OUTLINE_SHADOW_28, PODCASTS_OUTLINE_36, POLL_16, POLL_32, POLL_OUTLINE_20, POLL_OUTLINE_24, POLL_SQUARE_OUTLINE_28, POP_UP_STICKER_CIRCLE_FILL_RED_16, POP_UP_STICKER_CIRCLE_FILL_RED_24, POP_UP_STICKER_CIRCLE_FILL_RED_28, PRIVACY_24, PRIVACY_CIRCLE_FILL_RED_20, PRIVACY_OUTLINE_56, PROMETEY_CIRCLE_FILL_RED_20, PROMETEY_CIRCLE_FILL_RED_32, QR_24, QR_CODE_OUTLINE_28, QUESTION_12, QUESTION_24, QUESTION_OUTLINE_28, QUESTION_OUTLINE_56, RADIO_OFF_24, RADIO_ON_24, RADIOWAVES_AROUND_OUTLINE_28, RADIOWAVES_AROUND_OUTLINE_96, RADIOWAVES_LEFT_AND_RIGHT_OUTLINE_28, REACTION_LIKE_COLOR_16, RECENT_OUTLINE_20, RECENT_OUTLINE_28, RECENT_OUTLINE_56, RECORDER_TAPE_OUTLINE_28, RECORDING_CIRCLE_FILL_16, RECORDING_CIRCLE_FILL_20, RECTANGLE_SPLIT_4_UNEVEN_OUTLINE_28, RECTANGLES_2_OUTLINE_24, RECTRANGLE_HAND_POINT_UP_28, REFRESH_OUTLINE_24, REFRESH_OUTLINE_28, REMOVE_CIRCLE_24, REMOVE_CIRCLE_OUTLINE_20, REMOVE_CIRCLE_OUTLINE_28, REPEAT_1_OUTLINE_DOT_24, REPEAT_OUTLINE_24, REPEAT_OUTLINE_DOT_24, REPLAY_36, REPLY_OUTLINE_24, REPLY_OUTLINE_28, REPORT_24, REPORT_OUTLINE_20, REPORT_OUTLINE_24, REPORT_OUTLINE_28, REPOST_12, REPOST_16, REPOST_OUTLINE_16, ROBOT_OUTLINE_24, ROOMS_PATTERN, RSS_FEED_OUTLINE_28, RUDE_MESSAGE_OUTLINE_56, SAD_FACE_OUTLINE_24, SCAN_VIEWFINDER_OUTLINE_24, SCAN_VIEWFINDER_OUTLINE_28, SEARCH_16, SEARCH_20, SEARCH_OUTLINE_16, SEARCH_OUTLINE_24, SEARCH_OUTLINE_28, SEARCH_STARS_OUTLINE_28, SEND_CIRCLE_32, SEND_CIRCLE_CLOCK_32, SERVICES_16, SERVICES_24, SERVICES_48, SERVICES_OUTLINE_24, SERVICES_OUTLINE_28, SHARE_24, SHARE_EXTERNAL_28, SHARE_OUTLINE_16, SHARE_OUTLINE_20, SHARE_OUTLINE_24, SHARE_OUTLINE_28, SHOPPING_CART_OUTLINE_16, SHOPPING_CART_OUTLINE_20, SHOPPING_CART_OUTLINE_28, SHUFFLE_OUTLINE_20, SHUFFLE_OUTLINE_24, SHUFFLE_OUTLINE_28, SHUFFLE_OUTLINE_56, SKIP_BACK_24, SKIP_FORWARD_24, SKIP_NEXT_28, SKIP_PREVIOUS_28, SKULL_OUTLINE_24, SLIDERS_OUTLINE_16, SLIDERS_OUTLINE_28, SMARTPHONE_OUTLINE_24, SMARTPHONE_OUTLINE_28, SMARTPHONE_OUTLINE_56, SMARTPHONE_STARS_OUTLINE_28, SMILE_24, SMILE_ADD_OUTLINE_20, SMILE_OUTLINE_24, SMILE_OUTLINE_28, SMILES_2_OUTLINE_28, SNEAKER_OUTLINE_28, SONG_OUTLINE_20, SONG_OUTLINE_24, SONG_OUTLINE_28, SONG_OUTLINE_32, SONG_OUTLINE_56, SORT_HORIZONTAL_OUTLINE_28, SORT_OUTLINE_16, SORT_OUTLINE_24, SOUND_WAVE_OUTLINE_28, SOUND_WAVE_SLASH_OUTLINE_28, SPEEDOMETER_MAX_OUTLINE_28, SPINNER_24, SQUARE_4_OUTLINE_20, SQUARE_4_OUTLINE_24, 
        SQUARE_4_OUTLINE_28, SQUARE_OUTLINE_20, SQUARE_PART_16, SQUARE_SPLIT_4_OUTLINE_20, STAR_CIRCLE_16, STAR_CIRCLE_FILL_BLUE_16, STAR_CIRCLE_FILL_BLUE_20, STAR_CIRCLE_FILL_GRAY_20, STAR_CIRCLE_FILL_YELLOW_16, STARS_16, STARS_20, STARS_3_OUTLINE_56, STARS_OUTLINE_24, STARS_OUTLINE_28, STATISTIC_CIRCLE_FILL_BLUE_28, STATISTICS_OUTLINE_20, STATISTICS_OUTLINE_24, STATISTICS_OUTLINE_28, STICKER_OUTLINE_24, STICKER_OUTLINE_28, STICKER_SMILE_OUTLINE_20, STICKER_SMILE_OUTLINE_28, STOPWATCH_OUTLINE_28, STOREFRONT_OUTLINE_16, STOREFRONT_OUTLINE_24, STOREFRONT_OUTLINE_28, STORIES_ADVERTISING_32, STORY_24, STORY_28, STORY_36, STORY_48, STORY_ADD_OUTLINE_28, STORY_CIRCLE_FILL_YELLOW_72, STORY_OUTLINE_16, STORY_OUTLINE_24, STORY_OUTLINE_28, STORY_OUTLINE_56, STORY_OUTLINE_SHADOW_28, STORY_REPLY_OUTLINE_24, SUBSCRIPTIONS_OUTLINE_20, SUBTITLES_OUTLINE_28, SUN_OUTLINE_28, SUNGLASSES_CIRCLE_FILL_GRAY_48, SWIPE_DISMISS_48, SWITCH_12, SWITCH_24, SWITCH_OUTLINE_28, SYNC_16, SYNC_OUTLINE_28, TAG_12, TAG_OUTLINE_28, TARGET_OUTLINE_24, TEAR_OFF_FLYER_OUTLINE_28, TEAR_OFF_FLYER_OUTLINE_56, TEXT_LIVE_OUTLINE_24, TEXT_LIVE_OUTLINE_28, TEXT_LIVE_OUTLINE_56, TEXT_OUTLINE_24, TEXT_OUTLINE_28, THUMBS_DOWN_24, THUMBS_DOWN_28, THUMBS_DOWN_OUTLINE_24, THUMBS_DOWN_OUTLINE_28, THUMBS_UP_OUTLINE_28, TICKET_OUTLINE_28, TRUCK_OUTLINE_16, TRUCK_OUTLINE_20, UGC_CHAT_STICKER_FILL_16, UGC_CHAT_STICKER_OUTLINE_28, UGC_CHAT_STICKER_OUTLINE_56, UGC_STICKER_OUTLINE_24, UNARCHIVE_OUTLINE_24, UNARCHIVE_OUTLINE_28, UNAVAILABLE_CALL_CIRCLE_FILL_RED_16, UNBLOCK_OUTLINE_24, UNFAVORITE_OUTLINE_28, UNLOCK_OUTLINE_20, UNNAMED_DEVICE_OUTLINE_56, UNPIN_OUTLINE_28, UPLOAD_OUTLINE_16, UPLOAD_OUTLINE_24, UPLOAD_OUTLINE_28, USER_12, USER_16, USER_24, USER_ADD_24, USER_ADD_BADGE_OUTLINE_28, USER_ADD_BADGE_OUTLINE_56, USER_ADD_OUTLINE_24, USER_ADD_OUTLINE_28, USER_ADD_OUTLINE_56, USER_ADDED_OUTLINE_24, USER_ADDED_OUTLINE_28, USER_BACKGROUND_OUTLINE_24, USER_BACKGROUND_OUTLINE_28, USER_BOOK_OUTLINE_56, USER_CIRCLE_ALT_OUTLINE_16, USER_CIRCLE_FILL_BLUE_28, USER_CIRCLE_OUTLINE_24, USER_CIRCLE_OUTLINE_28, USER_INCOMING_OUTLINE_28, USER_MICROPHONE_BADGE_OUTLINE_28, USER_MICROPHONE_BADGE_OUTLINE_56, USER_MICROPHONE_BADGE_SLASH_OUTLINE_28, USER_MINUS_OUTLINE_28, USER_OUTGOING_OUTLINE_28, USER_OUTLINE_16, USER_OUTLINE_20, USER_OUTLINE_24, USER_PEN_OUTLINE_28, USER_RECTANGLE_20, USER_SLASH_OUTLINE_20, USER_SLASH_OUTLINE_28, USER_SQUARE_ON_SQUARE_28, USER_SQUARE_ON_SQUARE_OUTLINE_28, USER_SQUARE_ON_SQUARE_OUTLINE_32, USER_SQUARE_ON_SQUARE_OUTLINE_56, USER_SQUARE_OUTLINE_28, USER_SQUARE_OUTLINE_56, USER_STAR_BADGE_OUTLINE_28, USER_STAR_BADGE_SLASH_OUTLINE_28, USER_STAR_OUTLINE_28, USER_STAR_SLASH_OUTLINE_28, USERS_12, USERS_16, USERS_20, USERS_24, USERS_28, USERS_2_OUTLINE_16, USERS_3_OUTLINE_24, USERS_3_OUTLINE_28, USERS_3_OUTLINE_56, USERS_CIRCLE_FILL_BLUE_20, USERS_CIRCLE_FILL_BLUE_28, USERS_CIRCLE_FILL_BLUE_32, USERS_OUTLINE_20, USERS_OUTLINE_24, USERS_OUTLINE_28, USERS_OUTLINE_56, VERIFIED_20, VERIFIED_DARK_24, VERIFIED_DARK_48, VERIFIED_LIGHT_24, VERIFIED_LIGHT_48, VERTICAL_RECTANGLE_9X16_OUTLINE_24, VERTICAL_RECTANGLE_OUTLINE_20, VIDEO_24, VIDEO_36, VIDEO_ADVERTISEMENT_16, VIDEO_ADVERTISEMENT_24, VIDEO_ARROW_SQUARE_OUTLINE_SHADOW_MEDIUM_48, VIDEO_CIRCLE_OUTLINE_28, VIDEO_CIRCLE_OUTLINE_56, VIDEO_OUTLINE_24, VIDEO_OUTLINE_28, VIDEO_SQUARE_OUTLINE_20, VIDEO_SQUARE_OUTLINE_24, VIDEO_SQUARE_OUTLINE_28, VIDEO_SQUARE_OUTLINE_SHADOW_28, VIDEOCAM_16, VIDEOCAM_24, VIDEOCAM_2_SLASH_OUTLINE_28, VIDEOCAM_OUTLINE_28, VIDEOCAM_OUTLINE_56, VIDEOCAM_PART_OUTLINE_28, VIDEOCAM_SLASH_24, VIDEOCAM_SLASH_OUTLINE_28, VIDEOCAM_SLASH_OUTLINE_56, VIDEOCAM_SLASH_OUTLINE_COLOR_28, VIEW_12, VIEW_16, VIEW_20, VIEW_OUTLINE_20, VIEW_OUTLINE_24, VIEW_OUTLINE_28, VIEW_OUTLINE_56, VINYL_OUTLINE_24, VINYL_OUTLINE_28, VK_LOGO_MONOCHROME_CIRCLE_BLUE_56, VK_VIDEO_LOGO_40, VMOJI_OUTLINE_24, VOICE_24, VOICE_OUTLINE_24, VOICE_OUTLINE_28, VOLUME_16, VOLUME_24, VOLUME_CENTERED_OUTLINE_20, VOLUME_OUTLINE_24, VOLUME_OUTLINE_28, WARNING_TRIANGLE_OUTLINE_28, WIFI_OUTLINE_16, WIFI_SLASH_OUTLINE_16, WORK_OUTLINE_16, WORK_OUTLINE_20, WORK_OUTLINE_24, WORK_OUTLINE_28, WRITE_24, WRITE_28, WRITE_OUTLINE_20, WRITE_OUTLINE_24, WRITEBAR_DONE_48, WRITEBAR_SEND_48, ZIP_OUTLINE_28, ILLUSTRATION_PHONE_ACTUAL_NUMBER_100H};
    }

    public static AtumVkuiLocalImageDto valueOf(String str) {
        return (AtumVkuiLocalImageDto) Enum.valueOf(AtumVkuiLocalImageDto.class, str);
    }

    public static AtumVkuiLocalImageDto[] values() {
        return (AtumVkuiLocalImageDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
