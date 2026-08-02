package com.vk.catalog2.common.dto.api;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.actions.ActionOpenEditMarketAlbum;
import com.vk.dto.common.actions.ActionOpenUrl;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.aay;
import xsna.bxx;
import xsna.cqm0;
import xsna.epx;
import xsna.f370;
import xsna.rdi;
import xsna.s3q0;
import xsna.zcl;

/* compiled from: CatalogButton.kt */
/* loaded from: classes16.dex */
public abstract class CatalogButton extends Serializer.StreamParcelableAdapter implements bxx {
    public static final b b = new b();

    /* compiled from: CatalogButton.kt */
    public static final class a {
    }

    /* compiled from: JsonParser.kt */
    public static final class b extends aay<CatalogButton> {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r9v67 */
        /* JADX WARN: Type inference failed for: r9v68, types: [java.lang.String, xsna.zcl] */
        /* JADX WARN: Type inference failed for: r9v70 */
        @Override // xsna.aay
        public final CatalogButton a(JSONObject jSONObject) {
            ArrayList arrayList;
            String str;
            ArrayList arrayList2;
            ArrayList arrayList3;
            int i;
            ?? r9;
            Image image;
            ArrayList arrayList4;
            ArrayList arrayList5;
            ArrayList arrayList6;
            ArrayList arrayList7;
            JSONObject optJSONObject = jSONObject.optJSONObject("action");
            String string = optJSONObject != 0 ? optJSONObject.getString("type") : null;
            String a = cqm0.a(optJSONObject != 0 ? optJSONObject.optString("consume_reason") : null);
            if (epx.f(string, "edit_items")) {
                return new CatalogButtonDragAndRemove(string);
            }
            if (epx.f(string, "reorder_items")) {
                return new CatalogButtonReorder(string);
            }
            if (epx.f(string, "open_section") || epx.f(string, "open_section_slider_cell")) {
                String str2 = null;
                Object[] objArr = 0;
                String optString = jSONObject.optString("hint_id", null);
                String optString2 = jSONObject.optString("title");
                String optString3 = jSONObject.optString("section_id");
                String optString4 = jSONObject.optString("track_code", null);
                String optString5 = jSONObject.optString("icon", null);
                JSONArray optJSONArray = jSONObject.optJSONArray("images");
                return new CatalogButtonOpenSection(string, optString, optString2, optString3, optString4, a, optString5, optJSONArray != null ? new Image(optJSONArray, str2, 2, objArr == true ? 1 : 0) : null, jSONObject.optString("ref_layout_name", null), jSONObject.optString(TtmlNode.TAG_STYLE, null), jSONObject.optString("options_title", null));
            }
            if (epx.f(string, "switch_section")) {
                String str3 = string;
                String str4 = null;
                Object[] objArr2 = 0;
                String optString6 = jSONObject.optString("hint_id", null);
                String optString7 = jSONObject.optString("title");
                String optString8 = jSONObject.optString("section_id");
                String optString9 = jSONObject.optString("block_id", null);
                String optString10 = jSONObject.optString("click_event_type");
                JSONArray optJSONArray2 = jSONObject.optJSONArray("images");
                Image image2 = optJSONArray2 != null ? new Image(optJSONArray2, str4, 2, objArr2 == true ? 1 : 0) : null;
                String optString11 = optJSONObject.optString(TtmlNode.TAG_STYLE, null);
                JSONObject optJSONObject2 = jSONObject.optJSONObject("action");
                return new CatalogButtonSwitchSection(str3, optString6, optString7, optString8, optString9, a, optString10, image2, optString11, optJSONObject2 != null ? f370.D(optJSONObject2, "url") : null, jSONObject.optString("track_code", null), jSONObject.optString("icon", null));
            }
            String str5 = string;
            if (epx.f(str5, "enter_edit_mode")) {
                return new CatalogButtonEnterEditMode(str5, jSONObject.optString("hint_id", null), jSONObject.optString("block_id", null), a);
            }
            if (epx.f(str5, "search_mode")) {
                return new CatalogButtonSearchMode(str5, jSONObject.optString("hint_id", null), jSONObject.optString("block_id", null), jSONObject.optString("search_type", null), jSONObject.optString("section_id", null), a, jSONObject.optString("placeholder", null), new UserId(jSONObject.optLong("owner_id")), optJSONObject.optString(TtmlNode.TAG_STYLE));
            }
            if (epx.f(str5, "friends_lists") || epx.f(str5, "friends_sort_modes") || epx.f(str5, "playlists_lists") || epx.f(str5, "live_categories") || epx.f(str5, "movie_categories") || epx.f(str5, "select_sorting") || epx.f(str5, "groups_my_groups_tabs") || epx.f(str5, "podcasts_subsection_tabs") || epx.f(str5, "my_music_subsection_tabs") || epx.f(str5, "block_filter") || epx.f(str5, "video_seasons_block_filter") || epx.f(str5, "section_filter")) {
                if (jSONObject.has(SignalingProtocol.KEY_OPTIONS)) {
                    JSONArray optJSONArray3 = jSONObject.optJSONArray(SignalingProtocol.KEY_OPTIONS);
                    if (optJSONArray3 != null) {
                        arrayList = new ArrayList(optJSONArray3.length());
                        int length = optJSONArray3.length();
                        for (int i2 = 0; i2 < length; i2++) {
                            JSONObject optJSONObject3 = optJSONArray3.optJSONObject(i2);
                            if (optJSONObject3 != null) {
                                arrayList.add((CatalogFilterData) CatalogFilterData.k.a(optJSONObject3));
                            }
                        }
                        str = a;
                        arrayList2 = arrayList;
                    }
                    str = a;
                    arrayList2 = null;
                } else {
                    JSONArray optJSONArray4 = jSONObject.optJSONArray("friends_lists");
                    if (optJSONArray4 != null) {
                        arrayList = new ArrayList(optJSONArray4.length());
                        int length2 = optJSONArray4.length();
                        for (int i3 = 0; i3 < length2; i3++) {
                            JSONObject optJSONObject4 = optJSONArray4.optJSONObject(i3);
                            if (optJSONObject4 != null) {
                                arrayList.add((CatalogFilterData) CatalogFilterData.k.a(optJSONObject4));
                            }
                        }
                        str = a;
                        arrayList2 = arrayList;
                    }
                    str = a;
                    arrayList2 = null;
                }
                return new CatalogButtonFilters(str5, jSONObject.optString("hint_id", null), jSONObject.optString("block_id"), jSONObject.optString("title"), arrayList2, jSONObject.optString("options_title", null), str);
            }
            if (epx.f(str5, "show_filters")) {
                String optString12 = jSONObject.optString("hint_id", null);
                String optString13 = jSONObject.optString("block_id");
                String optString14 = jSONObject.optString("title");
                JSONArray optJSONArray5 = jSONObject.optJSONArray(SignalingProtocol.KEY_OPTIONS);
                if (optJSONArray5 != null) {
                    ArrayList arrayList8 = new ArrayList(optJSONArray5.length());
                    int length3 = optJSONArray5.length();
                    for (int i4 = 0; i4 < length3; i4++) {
                        arrayList8.add((CatalogFilterData) CatalogFilterData.k.a(optJSONArray5.getJSONObject(i4)));
                    }
                    arrayList7 = arrayList8;
                } else {
                    arrayList7 = null;
                }
                return new CatalogShowFiltersButton(str5, optString12, optString13, optString14, arrayList7, jSONObject.optString("id"), a);
            }
            if (epx.f(str5, "open_url") || epx.f(str5, "open_url_video_discover") || epx.f(str5, "open_url_bottom_button") || epx.f(str5, "open_url_slider_cell")) {
                b bVar = CatalogButton.b;
                ActionOpenUrl.a aVar = ActionOpenUrl.e;
                JSONObject optJSONObject5 = jSONObject.optJSONObject("action");
                if (optJSONObject5 == null) {
                    optJSONObject5 = new JSONObject();
                }
                return new CatalogButtonOpenUrl(str5, jSONObject.optString("hint_id", null), jSONObject.optString("title"), ActionOpenUrl.a.a(optJSONObject5), a, jSONObject.optString("icon", null), jSONObject.optString("click_event_type", null), jSONObject.optString("track_code", null), jSONObject.optString(TtmlNode.TAG_STYLE, null));
            }
            if (epx.f(str5, "close_notification") || epx.f(str5, "close_catalog_banner")) {
                return new CatalogButtonCloseNotification("close_catalog_banner", jSONObject.optString("hint_id", null), a);
            }
            if (epx.f(str5, "owner_button")) {
                return new CatalogButtonGoToOwner(str5, jSONObject.optString("hint_id", null), new UserId(jSONObject.optLong("owner_id")), a);
            }
            if (epx.f(str5, "login")) {
                return new CatalogButtonLogin(str5, jSONObject.optString("hint_id", null), jSONObject.optString("title"), a);
            }
            if (epx.f(str5, "upload_video")) {
                return new CatalogButtonUploadVideo(str5, jSONObject.optString("hint_id", null), jSONObject.optString("title"), new UserId(jSONObject.optLong("owner_id")), a, jSONObject.optInt("album_id"));
            }
            if (epx.f(str5, "upload_clip")) {
                return new CatalogButtonUploadVideo(str5, jSONObject.optString("hint_id", null), jSONObject.optString("title"), new UserId(jSONObject.optLong("owner_id")), a, jSONObject.optInt("album_id"));
            }
            if (epx.f(str5, "owner_groups")) {
                return new CatalogButtonProfileOwnerGroupsVideo(str5, jSONObject.optString("hint_id", null), jSONObject.optString("title"), new UserId(jSONObject.optLong("owner_id")), a);
            }
            if (epx.f(str5, "goto_author")) {
                return new CatalogButtonGoToAuthor(str5, jSONObject.optString("hint_id", null), jSONObject.optString("title"), new UserId(jSONObject.optLong("owner_id")), a);
            }
            if (epx.f(str5, "become_author_howto")) {
                return new CatalogButtonProfileBecomeAuthorVideo(str5, jSONObject.optString("hint_id", null), jSONObject.optString("title"), new UserId(jSONObject.optLong("owner_id")), a);
            }
            if (epx.f(str5, "author_page")) {
                return new CatalogButtonProfileAuthorCabinetVideo(str5, jSONObject.optString("hint_id", null), jSONObject.optString("title"), new UserId(jSONObject.optLong("owner_id")), a);
            }
            if (epx.f(str5, "change_profile")) {
                return new CatalogButtonProfileChangeProfileVideo(str5, jSONObject.optString("hint_id", null), jSONObject.optString("title"), new UserId(jSONObject.optLong("owner_id")), a);
            }
            if (epx.f(str5, "child_mode")) {
                return new CatalogButtonProfileChildModeVideo(str5, jSONObject.optString("hint_id", null), jSONObject.optString("title"), new UserId(jSONObject.optLong("owner_id")), a);
            }
            if (epx.f(str5, "create_album")) {
                return new CatalogButtonCreateVideoAlbum(str5, jSONObject.optString("hint_id", null), jSONObject.optString("title"), new UserId(jSONObject.optLong("owner_id")), a);
            }
            if (epx.f(str5, "follow")) {
                return new CatalogButtonFollowUser(str5, jSONObject.optString("hint_id", null), new UserId(jSONObject.optLong("owner_id")), a, f370.A("track_code", jSONObject));
            }
            if (epx.f(str5, "play_videos_from_block")) {
                return new CatalogButtonPlayVideosFromBlock(str5, jSONObject.optString("hint_id", null), jSONObject.optString("title"), jSONObject.optString("block_id", null), optJSONObject.optString(TtmlNode.TAG_STYLE, null), a, null, 64, null);
            }
            if (epx.f(str5, CatalogViewType.SYNTHETIC_ACTION_TOGGLE_PLAYLIST_SUBSCRIPTION.getId()) || epx.f(str5, "toggle_album_subscription")) {
                return new CatalogButtonToggleAlbumSubscription(str5, jSONObject.optString("hint_id", null), jSONObject.optString("title"), a, jSONObject.optInt("album_id"));
            }
            if (epx.f(str5, "add_videos")) {
                return new CatalogButtonAddVideos(str5, jSONObject.optString("hint_id", null), jSONObject.optString("title"), a, jSONObject.optInt("album_id"));
            }
            if (epx.f(str5, "toggle_album_shuffle")) {
                return new CatalogButtonToggleAlbumShuffle(str5, jSONObject.optString("hint_id", null), null, jSONObject.optLong("owner_id"), 4, null);
            }
            if (epx.f(str5, "clear_video_history")) {
                return new CatalogButtonClearSection(str5, jSONObject.optString("hint_id", null), a, "videos_history_remove");
            }
            if (epx.f(str5, "onboarding")) {
                String optString15 = jSONObject.optString("hint_id", null);
                String optString16 = jSONObject.optString("block_id");
                String optString17 = jSONObject.optString("title");
                JSONArray optJSONArray6 = jSONObject.optJSONArray(SignalingProtocol.KEY_OPTIONS);
                if (optJSONArray6 != null) {
                    ArrayList arrayList9 = new ArrayList(optJSONArray6.length());
                    int length4 = optJSONArray6.length();
                    for (int i5 = 0; i5 < length4; i5++) {
                        JSONObject optJSONObject6 = optJSONArray6.optJSONObject(i5);
                        if (optJSONObject6 != null) {
                            arrayList9.add((CatalogFilterData) CatalogFilterData.k.a(optJSONObject6));
                        }
                    }
                    arrayList6 = arrayList9;
                } else {
                    arrayList6 = null;
                }
                return new CatalogButtonOnboarding(str5, optString15, optString16, optString17, arrayList6, a);
            }
            if (epx.f(str5, "start_live")) {
                return new CatalogButtonStartLiveStream(str5, jSONObject.optString("hint_id", null), jSONObject.optString("title"), a);
            }
            if (epx.f(str5, "open_qoe_survey")) {
                return new CatalogButtonOpenQoeSurvey(str5, null, null, jSONObject.optInt("entity_id"), 6, null);
            }
            if (epx.f(str5, "qr_camera")) {
                return new CatalogButtonOpenQr(str5, jSONObject.optString("hint_id", null), a);
            }
            if (epx.f(str5, "add_friend")) {
                return new CatalogButtonAddFriend(str5, jSONObject.optString("hint_id", null), jSONObject.optString("title"), a);
            }
            if (epx.f(str5, "add_friends")) {
                return new CatalogButtonAddFriends(str5, jSONObject.optString("hint_id", null), a);
            }
            if (epx.f(str5, "friends_cleanup")) {
                return new CatalogButtonFriendsCleanup(str5, jSONObject.optString("hint_id", null), a);
            }
            if (epx.f(str5, "friends_remove")) {
                return new CatalogButtonRemoveFriend(str5, jSONObject.optString("hint_id", null), jSONObject.optString("track_code"), jSONObject.optBoolean("enabled", true), a);
            }
            if (epx.f(str5, "import_contacts")) {
                return new CatalogButtonImportContacts(str5, jSONObject.optString("hint_id", null), a, null, 8, null);
            }
            if (epx.f(str5, "open_screen")) {
                return new CatalogButtonOpenScreen(str5, jSONObject.optString("hint_id", null), jSONObject.optString("title"), jSONObject.optString("app_screen"), a, jSONObject.optString("icon"));
            }
            if (epx.f(str5, "open_screen_large")) {
                return new CatalogButtonOpenScreenLarge(str5, jSONObject.optString("hint_id", null), jSONObject.optString("title"), jSONObject.optString("app_screen"), a);
            }
            if (epx.f(str5, "open_search_tab")) {
                return new CatalogButtonOpenSearchTab(str5, jSONObject.optString("hint_id", null), jSONObject.optString("title"), jSONObject.optString("search_tab"), jSONObject.optString("track_code", null), jSONObject.optString("icon", null), a);
            }
            if (epx.f(str5, "groups_advertisement")) {
                b bVar2 = CatalogButton.b;
                ActionOpenUrl.a aVar2 = ActionOpenUrl.e;
                JSONObject optJSONObject7 = jSONObject.optJSONObject("action");
                if (optJSONObject7 == null) {
                    optJSONObject7 = new JSONObject();
                }
                return new CatalogButtonOpenGroupsAdvertisement(str5, jSONObject.optString("hint_id", null), jSONObject.optString("title"), new UserId(jSONObject.optLong("owner_id")), ActionOpenUrl.a.a(optJSONObject7), a, jSONObject.optString("click_event_type", null));
            }
            if (epx.f(str5, "friends_message")) {
                return new CatalogButtonOpenDialog(str5, jSONObject.optString("hint_id", null), jSONObject.optString("track_code"), jSONObject.optBoolean("enabled", true), a);
            }
            if (epx.f(str5, "friends_call")) {
                return new CatalogButtonMakeCall(str5, jSONObject.optString("hint_id", null), jSONObject.optString("track_code"), jSONObject.optBoolean("enabled", true), a);
            }
            if (epx.f(str5, "create_playlist")) {
                return new CatalogButtonCreatePlaylist(str5, jSONObject.optString("hint_id", null), jSONObject.optString("title"), new UserId(jSONObject.optLong("owner_id")), a);
            }
            if (epx.f(str5, "play_audios_from_block") || epx.f(str5, "play_shuffled_audios_from_block")) {
                return new CatalogButtonPlayAudioFromBlock(str5, jSONObject.optString("hint_id", null), jSONObject.optString("title"), jSONObject.optString("block_id", null), null, epx.f(str5, "play_shuffled_audios_from_block"), a, 16, null);
            }
            if (epx.f(str5, "save_as_playlist") || epx.f(str5, "my_music_filter_save_as_playlist")) {
                return new CatalogButtonSaveAsPlaylist(str5, jSONObject.optString("hint_id", null), jSONObject.optString("title"), jSONObject.optString("block_id", null), new UserId(jSONObject.optLong("owner_id")), jSONObject.optString("artist_id"), a, jSONObject.optString("search_type"));
            }
            if (epx.f(str5, "clear_recent_groups")) {
                String optString18 = jSONObject.optString("hint_id", null);
                JSONArray optJSONArray7 = jSONObject.optJSONArray("target_block_ids");
                if (optJSONArray7 != null) {
                    int length5 = optJSONArray7.length();
                    arrayList5 = new ArrayList(length5);
                    for (int i6 = 0; i6 < length5; i6++) {
                        String optString19 = optJSONArray7.optString(i6);
                        if (optString19 != null) {
                            arrayList5.add(optString19);
                        }
                    }
                } else {
                    arrayList5 = null;
                }
                return new CatalogButtonClearRecent(str5, optString18, "", arrayList5 != null ? rdi.H(arrayList5) : EmptyList.b, a, null, 32, null);
            }
            if (epx.f(str5, "create_group")) {
                return new CatalogButtonCreateGroup(str5, jSONObject.optString("hint_id", null), jSONObject.optString("title"), new UserId(jSONObject.optLong("owner_id")), a);
            }
            if (epx.f(str5, "unfollow_artist")) {
                return new CatalogButtonUnfollowArtist(str5, jSONObject.optString("hint_id", null), jSONObject.optString("title"), jSONObject.optString("artist_id"), a);
            }
            if (epx.f(str5, "unfollow_curator")) {
                return new CatalogButtonUnfollowCurator(str5, jSONObject.optString("hint_id", null), jSONObject.optString("title"), jSONObject.optString("curator_id"), a);
            }
            if (epx.f(str5, "toggle_curator_subscription")) {
                return new CatalogButtonToggleSubscriptionCurator(str5, jSONObject.optString("hint_id", null), jSONObject.optString("curator_id"), jSONObject.optBoolean("is_following"), a);
            }
            if (epx.f(str5, "music_follow_owner")) {
                return new CatalogButtonMusicFollowOwner(str5, jSONObject.optString("hint_id"), new UserId(jSONObject.optLong("owner_id")), jSONObject.optBoolean("is_following"), a);
            }
            if (epx.f(str5, "unfollow_music_owner")) {
                return new CatalogButtonMusicUnfollowOwner(str5, jSONObject.optString("hint_id"), jSONObject.optString("title"), new UserId(jSONObject.optLong("owner_id")), a);
            }
            if (epx.f(str5, "hide_block")) {
                String optString20 = jSONObject.optString("hint_id");
                String optString21 = jSONObject.optString("title");
                String optString22 = jSONObject.optString("block_id");
                UserId userId = new UserId(jSONObject.optLong("owner_id"));
                JSONArray optJSONArray8 = jSONObject.optJSONArray("target_block_ids");
                if (optJSONArray8 != null) {
                    int length6 = optJSONArray8.length();
                    ArrayList arrayList10 = new ArrayList(length6);
                    for (int i7 = 0; i7 < length6; i7++) {
                        String optString23 = optJSONArray8.optString(i7);
                        if (optString23 != null) {
                            arrayList10.add(optString23);
                        }
                    }
                    arrayList4 = arrayList10;
                } else {
                    arrayList4 = null;
                }
                return new CatalogButtonHideBlock(str5, optString20, optString21, optString22, userId, arrayList4 != null ? rdi.H(arrayList4) : EmptyList.b, jSONObject.optString("ref_layout_name"));
            }
            if (epx.f(str5, "play_audio")) {
                return new CatalogButtonPlayAudio(str5, jSONObject.optString("hint_id"), jSONObject.optString("block_id"), jSONObject.optInt("audio_id"), new UserId(jSONObject.optLong("owner_id")), null, 32, null);
            }
            if (epx.f(str5, "play_vk_mix")) {
                String optString24 = jSONObject.optString("hint_id");
                String optString25 = jSONObject.optString("ref_layout_name");
                JSONArray optJSONArray9 = jSONObject.optJSONArray("images");
                if (optJSONArray9 != null) {
                    i = 2;
                    r9 = 0;
                    image = new Image(optJSONArray9, 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
                } else {
                    i = 2;
                    r9 = 0;
                    image = null;
                }
                JSONArray optJSONArray10 = jSONObject.optJSONArray("foreground_images");
                return new CatalogButtonPlayMix(str5, optString24, optString25, image, optJSONArray10 != null ? new Image(optJSONArray10, r9, i, r9) : r9, jSONObject.optString("entity_id"), jSONObject.optString("id"), jSONObject.optString("mix_id"), jSONObject.optString("mix_options"), jSONObject.optString("title"), jSONObject.optString("description"), optJSONObject.optString(TtmlNode.TAG_STYLE, r9), a);
            }
            if (epx.f(str5, "open_challenge")) {
                return new CatalogButtonOpenChallenge(str5, jSONObject.optString("hint_id"), jSONObject.optString("block_id"), jSONObject.optString("hashtag"), null, 16, null);
            }
            if (epx.f(str5, "market_options")) {
                String optString26 = jSONObject.optString("hint_id");
                UserId userId2 = new UserId(jSONObject.optLong("owner_id"));
                int optInt = jSONObject.optInt("album_id");
                JSONArray optJSONArray11 = jSONObject.optJSONArray("option_ids");
                if (optJSONArray11 != null) {
                    int length7 = optJSONArray11.length();
                    arrayList3 = new ArrayList(length7);
                    for (int i8 = 0; i8 < length7; i8++) {
                        String optString27 = optJSONArray11.optString(i8);
                        if (optString27 != null) {
                            arrayList3.add(optString27);
                        }
                    }
                } else {
                    arrayList3 = null;
                }
                return new CatalogButtonMarketOptions(str5, optString26, userId2, optInt, arrayList3 != null ? rdi.H(arrayList3) : EmptyList.b);
            }
            if (epx.f(str5, "expand_block_local")) {
                return new CatalogButtonExpandBlock(str5, jSONObject.optString("hint_id"), jSONObject.optString("block_id"), jSONObject.optString("title"), jSONObject.optString("track_code"), jSONObject.optInt("collapsed_amount", 3));
            }
            if (epx.f(str5, "market_edit_album")) {
                String optString28 = jSONObject.optString("hint_id");
                String optString29 = jSONObject.optString("title");
                Serializer.c<ActionOpenEditMarketAlbum> cVar = ActionOpenEditMarketAlbum.CREATOR;
                JSONObject optJSONObject8 = jSONObject.optJSONObject("action");
                if (optJSONObject8 == null) {
                    optJSONObject8 = new JSONObject();
                }
                JSONObject optJSONObject9 = optJSONObject8.optJSONObject("market_edit_album_info");
                return new CatalogButtonMarketEditAlbum(str5, optString28, optString29, new ActionOpenEditMarketAlbum(new UserId(optJSONObject9.optLong("owner_id")), optJSONObject9.optInt("album_id")));
            }
            if (epx.f(str5, "open_modal")) {
                return new CatalogButtonOpenModal(str5, jSONObject.optString("hint_id"), jSONObject.optString("title"), new UserId(jSONObject.optLong("owner_id")));
            }
            if (epx.f(str5, "my_audios_section_options")) {
                return new CatalogButtonMyAudiosSectionOptions(str5);
            }
            if (epx.f(str5, "open_search_filters")) {
                return new CatalogButtonOpenSearchFilters(str5, jSONObject.optBoolean("enabled", true), jSONObject.optString("track_code"));
            }
            if (epx.f(str5, "reset_search_filters")) {
                return new CatalogButtonResetFilters(str5, jSONObject.optString("hint_id"), jSONObject.optString("track_code"), Boolean.valueOf(jSONObject.optBoolean("enabled", true)));
            }
            if (epx.f(str5, "download_all")) {
                return new CatalogButtonDownloadAll(str5, jSONObject.optString("hint_id", null), jSONObject.optString("block_id", null));
            }
            if (epx.f(str5, "clear_download_history")) {
                return new CatalogButtonClearDownloadsHistory(str5, jSONObject.optString("hint_id", null), jSONObject.optString("block_id", null), Integer.valueOf(jSONObject.optInt("ref_items_count")));
            }
            if (!epx.f(str5, "open_info_popup")) {
                return null;
            }
            String optString30 = jSONObject.optString("title");
            String optString31 = jSONObject.optString("description");
            String optString32 = optJSONObject.optString("action_title");
            String optString33 = jSONObject.optString("icon");
            JSONArray optJSONArray12 = jSONObject.optJSONArray("images");
            return new CatalogButtonOpenInfoPopup(str5, optString30, optString31, optString32, optString33, optJSONArray12 != null ? new Image(optJSONArray12, null, 2, 0 == true ? 1 : 0) : null);
        }
    }

    public /* synthetic */ CatalogButton(zcl zclVar) {
        this();
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        JSONObject jSONObject = new JSONObject();
        if (this instanceof CatalogButtonOpenSection) {
            JSONObject jSONObject2 = new JSONObject();
            CatalogButtonOpenSection catalogButtonOpenSection = (CatalogButtonOpenSection) this;
            jSONObject2.put("type", catalogButtonOpenSection.c);
            s3q0 s3q0Var = s3q0.a;
            jSONObject.put("action", jSONObject2);
            jSONObject.put("hint_id", catalogButtonOpenSection.d);
            jSONObject.put("title", catalogButtonOpenSection.e);
            jSONObject.put("section_id", catalogButtonOpenSection.f);
            return jSONObject;
        }
        if (this instanceof CatalogButtonSwitchSection) {
            JSONObject jSONObject3 = new JSONObject();
            CatalogButtonSwitchSection catalogButtonSwitchSection = (CatalogButtonSwitchSection) this;
            jSONObject3.put("type", catalogButtonSwitchSection.c);
            s3q0 s3q0Var2 = s3q0.a;
            jSONObject.put("action", jSONObject3);
            jSONObject.put("hint_id", catalogButtonSwitchSection.d);
            jSONObject.put("title", catalogButtonSwitchSection.e);
            jSONObject.put("section_id", catalogButtonSwitchSection.f);
            jSONObject.put("block_id", catalogButtonSwitchSection.g);
            jSONObject.put("track_code", catalogButtonSwitchSection.m);
            return jSONObject;
        }
        if (this instanceof CatalogButtonEnterEditMode) {
            JSONObject jSONObject4 = new JSONObject();
            CatalogButtonEnterEditMode catalogButtonEnterEditMode = (CatalogButtonEnterEditMode) this;
            jSONObject4.put("type", catalogButtonEnterEditMode.c);
            s3q0 s3q0Var3 = s3q0.a;
            jSONObject.put("action", jSONObject4);
            jSONObject.put("hint_id", catalogButtonEnterEditMode.d);
            jSONObject.put("block_id", catalogButtonEnterEditMode.e);
            return jSONObject;
        }
        if (this instanceof CatalogButtonFilters) {
            JSONObject jSONObject5 = new JSONObject();
            CatalogButtonFilters catalogButtonFilters = (CatalogButtonFilters) this;
            jSONObject5.put("type", catalogButtonFilters.c);
            s3q0 s3q0Var4 = s3q0.a;
            jSONObject.put("action", jSONObject5);
            jSONObject.put("hint_id", catalogButtonFilters.d);
            jSONObject.put("title", catalogButtonFilters.f);
            jSONObject.put("block_id", catalogButtonFilters.e);
            return jSONObject;
        }
        if (this instanceof CatalogButtonUploadVideo) {
            JSONObject jSONObject6 = new JSONObject();
            CatalogButtonUploadVideo catalogButtonUploadVideo = (CatalogButtonUploadVideo) this;
            jSONObject6.put("type", catalogButtonUploadVideo.c);
            s3q0 s3q0Var5 = s3q0.a;
            jSONObject.put("action", jSONObject6);
            jSONObject.put("hint_id", catalogButtonUploadVideo.d);
            jSONObject.put("title", catalogButtonUploadVideo.e);
            jSONObject.put("owner_id", catalogButtonUploadVideo.f.b);
            jSONObject.put("album_id", catalogButtonUploadVideo.h);
            return jSONObject;
        }
        if (this instanceof CatalogButtonCreateVideoAlbum) {
            JSONObject jSONObject7 = new JSONObject();
            CatalogButtonCreateVideoAlbum catalogButtonCreateVideoAlbum = (CatalogButtonCreateVideoAlbum) this;
            jSONObject7.put("type", catalogButtonCreateVideoAlbum.c);
            s3q0 s3q0Var6 = s3q0.a;
            jSONObject.put("action", jSONObject7);
            jSONObject.put("hint_id", catalogButtonCreateVideoAlbum.d);
            jSONObject.put("title", catalogButtonCreateVideoAlbum.e);
            jSONObject.put("owner_id", catalogButtonCreateVideoAlbum.f.b);
            return jSONObject;
        }
        if (this instanceof CatalogButtonStartLiveStream) {
            JSONObject jSONObject8 = new JSONObject();
            CatalogButtonStartLiveStream catalogButtonStartLiveStream = (CatalogButtonStartLiveStream) this;
            jSONObject8.put("type", catalogButtonStartLiveStream.c);
            s3q0 s3q0Var7 = s3q0.a;
            jSONObject.put("action", jSONObject8);
            jSONObject.put("hint_id", catalogButtonStartLiveStream.d);
            jSONObject.put("title", catalogButtonStartLiveStream.e);
            return jSONObject;
        }
        if (this instanceof CatalogButtonFollowUser) {
            JSONObject jSONObject9 = new JSONObject();
            CatalogButtonFollowUser catalogButtonFollowUser = (CatalogButtonFollowUser) this;
            jSONObject9.put("type", catalogButtonFollowUser.c);
            s3q0 s3q0Var8 = s3q0.a;
            jSONObject.put("action", jSONObject9);
            jSONObject.put("hint_id", catalogButtonFollowUser.d);
            jSONObject.put("owner_id", catalogButtonFollowUser.e.b);
            jSONObject.put("track_code", catalogButtonFollowUser.g);
            return jSONObject;
        }
        if (this instanceof CatalogButtonOpenQr) {
            JSONObject jSONObject10 = new JSONObject();
            CatalogButtonOpenQr catalogButtonOpenQr = (CatalogButtonOpenQr) this;
            jSONObject10.put("type", catalogButtonOpenQr.c);
            s3q0 s3q0Var9 = s3q0.a;
            jSONObject.put("action", jSONObject10);
            jSONObject.put("hint_id", catalogButtonOpenQr.d);
            return jSONObject;
        }
        if (this instanceof CatalogButtonAddFriend) {
            JSONObject jSONObject11 = new JSONObject();
            CatalogButtonAddFriend catalogButtonAddFriend = (CatalogButtonAddFriend) this;
            jSONObject11.put("type", catalogButtonAddFriend.c);
            s3q0 s3q0Var10 = s3q0.a;
            jSONObject.put("action", jSONObject11);
            jSONObject.put("hint_id", catalogButtonAddFriend.d);
            jSONObject.put("title", catalogButtonAddFriend.e);
            return jSONObject;
        }
        if (this instanceof CatalogButtonOpenScreen) {
            JSONObject jSONObject12 = new JSONObject();
            CatalogButtonOpenScreen catalogButtonOpenScreen = (CatalogButtonOpenScreen) this;
            jSONObject12.put("type", catalogButtonOpenScreen.c);
            s3q0 s3q0Var11 = s3q0.a;
            jSONObject.put("action", jSONObject12);
            jSONObject.put("hint_id", catalogButtonOpenScreen.d);
            jSONObject.put("title", catalogButtonOpenScreen.e);
            jSONObject.put("app_screen", catalogButtonOpenScreen.f);
            return jSONObject;
        }
        if (this instanceof CatalogButtonOpenScreenLarge) {
            JSONObject jSONObject13 = new JSONObject();
            CatalogButtonOpenScreenLarge catalogButtonOpenScreenLarge = (CatalogButtonOpenScreenLarge) this;
            jSONObject13.put("type", catalogButtonOpenScreenLarge.c);
            s3q0 s3q0Var12 = s3q0.a;
            jSONObject.put("action", jSONObject13);
            jSONObject.put("hint_id", catalogButtonOpenScreenLarge.d);
            jSONObject.put("title", catalogButtonOpenScreenLarge.e);
            jSONObject.put("app_screen", catalogButtonOpenScreenLarge.f);
            return jSONObject;
        }
        if (this instanceof CatalogButtonPlayAudioFromBlock) {
            JSONObject jSONObject14 = new JSONObject();
            CatalogButtonPlayAudioFromBlock catalogButtonPlayAudioFromBlock = (CatalogButtonPlayAudioFromBlock) this;
            jSONObject14.put("type", catalogButtonPlayAudioFromBlock.c);
            s3q0 s3q0Var13 = s3q0.a;
            jSONObject.put("action", jSONObject14);
            jSONObject.put("hint_id", catalogButtonPlayAudioFromBlock.d);
            jSONObject.put("block_id", catalogButtonPlayAudioFromBlock.f);
            return jSONObject;
        }
        if (this instanceof CatalogButtonSaveAsPlaylist) {
            JSONObject jSONObject15 = new JSONObject();
            CatalogButtonSaveAsPlaylist catalogButtonSaveAsPlaylist = (CatalogButtonSaveAsPlaylist) this;
            jSONObject15.put("type", catalogButtonSaveAsPlaylist.c);
            s3q0 s3q0Var14 = s3q0.a;
            jSONObject.put("action", jSONObject15);
            jSONObject.put("hint_id", catalogButtonSaveAsPlaylist.d);
            jSONObject.put("owner_id", catalogButtonSaveAsPlaylist.g.b);
            jSONObject.put("artist_id", catalogButtonSaveAsPlaylist.h);
            return jSONObject;
        }
        if (this instanceof CatalogButtonCreatePlaylist) {
            JSONObject jSONObject16 = new JSONObject();
            CatalogButtonCreatePlaylist catalogButtonCreatePlaylist = (CatalogButtonCreatePlaylist) this;
            jSONObject16.put("type", catalogButtonCreatePlaylist.c);
            s3q0 s3q0Var15 = s3q0.a;
            jSONObject.put("action", jSONObject16);
            jSONObject.put("hint_id", catalogButtonCreatePlaylist.d);
            jSONObject.put("title", catalogButtonCreatePlaylist.e);
            jSONObject.put("owner_id", catalogButtonCreatePlaylist.f.b);
            return jSONObject;
        }
        if (this instanceof CatalogButtonClearRecent) {
            JSONObject jSONObject17 = new JSONObject();
            CatalogButtonClearRecent catalogButtonClearRecent = (CatalogButtonClearRecent) this;
            jSONObject17.put("type", catalogButtonClearRecent.c);
            s3q0 s3q0Var16 = s3q0.a;
            jSONObject.put("action", jSONObject17);
            jSONObject.put("hint_id", catalogButtonClearRecent.d);
            jSONObject.put("title", catalogButtonClearRecent.e);
            JSONArray jSONArray = new JSONArray();
            Iterator<T> it = catalogButtonClearRecent.f.iterator();
            while (it.hasNext()) {
                jSONArray.put((String) it.next());
            }
            jSONObject.put("target_block_ids", jSONArray);
            return jSONObject;
        }
        if (this instanceof CatalogButtonOpenGroupsAdvertisement) {
            JSONObject jSONObject18 = new JSONObject();
            CatalogButtonOpenGroupsAdvertisement catalogButtonOpenGroupsAdvertisement = (CatalogButtonOpenGroupsAdvertisement) this;
            jSONObject18.put("type", catalogButtonOpenGroupsAdvertisement.c);
            s3q0 s3q0Var17 = s3q0.a;
            jSONObject.put("action", jSONObject18);
            jSONObject.put("hint_id", catalogButtonOpenGroupsAdvertisement.d);
            jSONObject.put("title", catalogButtonOpenGroupsAdvertisement.e);
            jSONObject.put("owner_id", catalogButtonOpenGroupsAdvertisement.f.b);
            ActionOpenUrl actionOpenUrl = catalogButtonOpenGroupsAdvertisement.g;
            jSONObject.put("action", actionOpenUrl != null ? actionOpenUrl.e5() : null);
            return jSONObject;
        }
        if (this instanceof CatalogButtonCreateGroup) {
            JSONObject jSONObject19 = new JSONObject();
            CatalogButtonCreateGroup catalogButtonCreateGroup = (CatalogButtonCreateGroup) this;
            jSONObject19.put("type", catalogButtonCreateGroup.c);
            s3q0 s3q0Var18 = s3q0.a;
            jSONObject.put("action", jSONObject19);
            jSONObject.put("hint_id", catalogButtonCreateGroup.d);
            jSONObject.put("title", catalogButtonCreateGroup.e);
            jSONObject.put("owner_id", catalogButtonCreateGroup.f.b);
            return jSONObject;
        }
        if (this instanceof CatalogButtonOpenUrl) {
            JSONObject jSONObject20 = new JSONObject();
            CatalogButtonOpenUrl catalogButtonOpenUrl = (CatalogButtonOpenUrl) this;
            jSONObject20.put("type", catalogButtonOpenUrl.c);
            s3q0 s3q0Var19 = s3q0.a;
            jSONObject.put("action", jSONObject20);
            jSONObject.put("hint_id", catalogButtonOpenUrl.d);
            jSONObject.put("title", catalogButtonOpenUrl.e);
            ActionOpenUrl actionOpenUrl2 = catalogButtonOpenUrl.f;
            jSONObject.put("action", actionOpenUrl2 != null ? actionOpenUrl2.e5() : null);
            return jSONObject;
        }
        if (this instanceof CatalogButtonCloseNotification) {
            JSONObject jSONObject21 = new JSONObject();
            CatalogButtonCloseNotification catalogButtonCloseNotification = (CatalogButtonCloseNotification) this;
            jSONObject21.put("type", catalogButtonCloseNotification.c);
            s3q0 s3q0Var20 = s3q0.a;
            jSONObject.put("action", jSONObject21);
            jSONObject.put("hint_id", catalogButtonCloseNotification.d);
            return jSONObject;
        }
        if (this instanceof CatalogButtonGoToOwner) {
            JSONObject jSONObject22 = new JSONObject();
            CatalogButtonGoToOwner catalogButtonGoToOwner = (CatalogButtonGoToOwner) this;
            jSONObject22.put("type", catalogButtonGoToOwner.c);
            s3q0 s3q0Var21 = s3q0.a;
            jSONObject.put("action", jSONObject22);
            jSONObject.put("hint_id", catalogButtonGoToOwner.d);
            jSONObject.put("owner_id", catalogButtonGoToOwner.e.b);
            return jSONObject;
        }
        if (this instanceof CatalogButtonUnfollowArtist) {
            JSONObject jSONObject23 = new JSONObject();
            CatalogButtonUnfollowArtist catalogButtonUnfollowArtist = (CatalogButtonUnfollowArtist) this;
            jSONObject23.put("type", catalogButtonUnfollowArtist.c);
            s3q0 s3q0Var22 = s3q0.a;
            jSONObject.put("action", jSONObject23);
            jSONObject.put("hint_id", catalogButtonUnfollowArtist.d);
            jSONObject.put("title", catalogButtonUnfollowArtist.e);
            jSONObject.put("artist_id", catalogButtonUnfollowArtist.f);
            return jSONObject;
        }
        if (this instanceof CatalogButtonMusicFollowOwner) {
            JSONObject jSONObject24 = new JSONObject();
            CatalogButtonMusicFollowOwner catalogButtonMusicFollowOwner = (CatalogButtonMusicFollowOwner) this;
            jSONObject24.put("type", catalogButtonMusicFollowOwner.c);
            s3q0 s3q0Var23 = s3q0.a;
            jSONObject.put("action", jSONObject24);
            jSONObject.put("hint_id", catalogButtonMusicFollowOwner.d);
            jSONObject.put("owner_id", catalogButtonMusicFollowOwner.e);
            jSONObject.put("is_following", catalogButtonMusicFollowOwner.f);
            return jSONObject;
        }
        if (this instanceof CatalogButtonHideBlock) {
            JSONObject jSONObject25 = new JSONObject();
            CatalogButtonHideBlock catalogButtonHideBlock = (CatalogButtonHideBlock) this;
            jSONObject25.put("type", catalogButtonHideBlock.c);
            s3q0 s3q0Var24 = s3q0.a;
            jSONObject.put("action", jSONObject25);
            jSONObject.put("hint_id", catalogButtonHideBlock.d);
            jSONObject.put("block_id", catalogButtonHideBlock.f);
            jSONObject.put("owner_id", catalogButtonHideBlock.g);
            return jSONObject;
        }
        if (this instanceof CatalogButtonOpenChallenge) {
            JSONObject jSONObject26 = new JSONObject();
            CatalogButtonOpenChallenge catalogButtonOpenChallenge = (CatalogButtonOpenChallenge) this;
            jSONObject26.put("type", catalogButtonOpenChallenge.c);
            s3q0 s3q0Var25 = s3q0.a;
            jSONObject.put("action", jSONObject26);
            jSONObject.put("hint_id", catalogButtonOpenChallenge.d);
            jSONObject.put("block_id", catalogButtonOpenChallenge.e);
            jSONObject.put("hashtag", catalogButtonOpenChallenge.f);
            return jSONObject;
        }
        if (!(this instanceof CatalogButtonPlayAudio)) {
            s3q0 s3q0Var26 = s3q0.a;
            return jSONObject;
        }
        JSONObject jSONObject27 = new JSONObject();
        CatalogButtonPlayAudio catalogButtonPlayAudio = (CatalogButtonPlayAudio) this;
        jSONObject27.put("type", catalogButtonPlayAudio.c);
        s3q0 s3q0Var27 = s3q0.a;
        jSONObject.put("action", jSONObject27);
        jSONObject.put("hint_id", catalogButtonPlayAudio.d);
        jSONObject.put("block_id", catalogButtonPlayAudio.e);
        jSONObject.put("audio_id", catalogButtonPlayAudio.f);
        jSONObject.put("owner_id", catalogButtonPlayAudio.g);
        return jSONObject;
    }

    public abstract String getType();

    public abstract String zb();

    public CatalogButton() {
    }
}
