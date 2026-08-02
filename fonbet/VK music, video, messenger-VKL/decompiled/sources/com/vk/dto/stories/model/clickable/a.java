package com.vk.dto.stories.model.clickable;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.common.links.AwayLink;
import com.vk.core.serialize.Serializer;
import com.vk.dto.attachments.SnippetAttachment;
import com.vk.dto.common.Good;
import com.vk.dto.common.Image;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.data.ApiApplication;
import com.vk.dto.common.id.UserId;
import com.vk.dto.geo.GeoPlace;
import com.vk.dto.group.Group;
import com.vk.dto.music.MusicDynamicRestriction;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.PlaylistLink;
import com.vk.dto.music.PlaylistOwner;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.photo.Photo;
import com.vk.dto.polls.Poll;
import com.vk.dto.stories.model.actions.ActionPoll;
import com.vk.dto.stories.model.clickable.ClickableMention;
import com.vk.dto.stories.model.clickable.ClickableSituationalTemplate;
import com.vk.dto.stories.model.clickable.ClickableSticker;
import com.vk.dto.user.UserProfile;
import com.vk.log.L;
import com.vk.superapp.api.dto.story.WebClickablePoint;
import com.vk.superapp.api.dto.story.WebStickerType;
import com.vk.superapp.api.dto.story.actions.WebActionQuestion;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.f370;
import xsna.fkq0;
import xsna.q500;

/* compiled from: ClickableStickerFactory.kt */
/* loaded from: classes18.dex */
public final class a {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v26, types: [com.vk.dto.user.UserProfile] */
    /* JADX WARN: Type inference failed for: r2v43, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v45, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v46, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r2v47 */
    /* JADX WARN: Type inference failed for: r2v51, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v7, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r45v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v58, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r7v59, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v60, types: [java.util.ArrayList] */
    public static ClickableSticker a(JSONObject jSONObject, Map map, Map map2) {
        UserProfile userProfile;
        Iterable<UserId> iterable;
        List list;
        String str;
        Group group;
        UserProfile userProfile2;
        ClickableSticker clickableClip;
        ActionPoll actionPoll;
        Set<Map.Entry> entrySet;
        Set<Map.Entry> entrySet2;
        UserProfile userProfile3;
        String str2;
        String str3;
        Group group2;
        ClickableSticker clickableChannelPost;
        ?? r2;
        ?? r22;
        AwayLink awayLink;
        UserId userId;
        Group group3;
        UserProfile userProfile4;
        String string = jSONObject.has("type") ? jSONObject.getString("type") : "";
        if (string.equals(WebStickerType.HASHTAG.i())) {
            Serializer.c<ClickableHashtag> cVar = ClickableHashtag.CREATOR;
            return new ClickableHashtag(jSONObject.getLong("id"), ClickableSticker.a.a(jSONObject), ClickableSticker.a.b(jSONObject), jSONObject.has("hashtag") ? jSONObject.getString("hashtag") : "", jSONObject.optString(TtmlNode.TAG_STYLE));
        }
        r8 = null;
        String str4 = null;
        r8 = null;
        q500 q500Var = null;
        VerifyInfo verifyInfo = null;
        if (string.equals(WebStickerType.MENTION.i())) {
            Serializer.c<ClickableMention> cVar2 = ClickableMention.CREATOR;
            try {
                return ClickableMention.a.a(jSONObject.has("mention") ? jSONObject.getString("mention") : "", jSONObject.optString(TtmlNode.TAG_STYLE), ClickableSticker.a.a(jSONObject), map, map2, ClickableSticker.a.b(jSONObject), jSONObject.getLong("id"));
            } catch (Throwable th) {
                L.g("Can't parse mention", th);
                return null;
            }
        }
        if (!string.equals(WebStickerType.QUESTION.i())) {
            if (string.equals(WebStickerType.GEO.i())) {
                long j = jSONObject.getLong("id");
                List a = ClickableSticker.a.a(jSONObject);
                q500 b = ClickableSticker.a.b(jSONObject);
                int i = jSONObject.getInt("place_id");
                String optString = jSONObject.optString(TtmlNode.TAG_STYLE);
                JSONObject optJSONObject = jSONObject.optJSONObject("place_info");
                return new ClickableGeo(j, a, b, i, optString, optJSONObject != null ? new GeoPlace(optJSONObject) : null, null, null, PsExtractor.AUDIO_STREAM, null);
            }
            try {
                if (string.equals(WebStickerType.MUSIC_PLAYLIST.i())) {
                    Serializer.c<ClickableMusicPlaylist> cVar3 = ClickableMusicPlaylist.CREATOR;
                    long j2 = jSONObject.getLong("id");
                    Playlist playlist = new Playlist(jSONObject.getJSONObject("playlist"));
                    PlaylistLink playlistLink = playlist.f;
                    if (playlistLink == null || (userId = playlistLink.c) == null) {
                        userId = playlist.c;
                    }
                    UserId a2 = fkq0.a(userId);
                    if (map != 0 && (userProfile4 = (UserProfile) map.get(a2)) != null) {
                        new PlaylistOwner(userProfile4);
                    } else if (map2 != null && (group3 = (Group) map2.get(a2)) != null) {
                        new PlaylistOwner(group3);
                    }
                    JSONObject optJSONObject2 = jSONObject.optJSONObject("audio_restrictions");
                    clickableClip = new ClickableMusicPlaylist(j2, ClickableSticker.a.a(jSONObject), ClickableSticker.a.b(jSONObject), playlist, optJSONObject2 != null ? new MusicDynamicRestriction(optJSONObject2) : null);
                } else if (string.equals(WebStickerType.MUSIC.i())) {
                    Serializer.c<ClickableMusic> cVar4 = ClickableMusic.CREATOR;
                    long j3 = jSONObject.getLong("id");
                    MusicTrack musicTrack = new MusicTrack(jSONObject.optJSONObject("audio"));
                    JSONObject optJSONObject3 = jSONObject.optJSONObject("audio_restrictions");
                    clickableClip = new ClickableMusic(j3, ClickableSticker.a.a(jSONObject), ClickableSticker.a.b(jSONObject), musicTrack, optJSONObject3 != null ? new MusicDynamicRestriction(optJSONObject3) : null, jSONObject.optInt("audio_start_time"), jSONObject.optString(TtmlNode.TAG_STYLE), jSONObject.optBoolean("is_cover"));
                } else {
                    int i2 = 0;
                    if (string.equals(WebStickerType.MARKET_ITEM.i())) {
                        Serializer.c<ClickableMarketItem> cVar5 = ClickableMarketItem.CREATOR;
                        JSONArray optJSONArray = jSONObject.optJSONArray("clickable_area");
                        if (optJSONArray != null) {
                            r22 = new ArrayList(optJSONArray.length());
                            int length = optJSONArray.length();
                            while (i2 < length) {
                                JSONObject jSONObject2 = optJSONArray.getJSONObject(i2);
                                Serializer.c<WebClickablePoint> cVar6 = WebClickablePoint.CREATOR;
                                r22.add(WebClickablePoint.a.a(jSONObject2));
                                i2++;
                            }
                        } else {
                            r22 = EmptyList.b;
                        }
                        List list2 = r22;
                        JSONObject optJSONObject4 = jSONObject.optJSONObject("market_item");
                        Good good = optJSONObject4 != null ? new Good(optJSONObject4, null) : null;
                        JSONObject optJSONObject5 = jSONObject.optJSONObject("link_object");
                        SnippetAttachment Ib = optJSONObject5 != null ? SnippetAttachment.Ib(optJSONObject5, null) : null;
                        Image image = good != null ? good.n : null;
                        Photo photo = Ib != null ? Ib.p : null;
                        q500 q500Var2 = (jSONObject.has("start_time") && jSONObject.has("duration")) ? new q500(jSONObject.getLong("start_time"), jSONObject.getLong("duration") + jSONObject.getLong("start_time")) : null;
                        String A = f370.A(TtmlNode.TAG_STYLE, jSONObject);
                        long j4 = jSONObject.getLong("id");
                        Long valueOf = good != null ? Long.valueOf(good.b) : null;
                        UserId userId2 = good != null ? good.c : null;
                        if (Ib != null && (awayLink = Ib.f) != null) {
                            str4 = awayLink.b;
                        }
                        return new ClickableMarketItem(j4, list2, q500Var2, valueOf, userId2, str4, image, photo, good, Ib, f370.D(jSONObject, "ads_label"), A);
                    }
                    if (string.equals(WebStickerType.SERVICE_YC_ITEM.i())) {
                        Serializer.c<ClickableServiceYcItem> cVar7 = ClickableServiceYcItem.CREATOR;
                        JSONArray optJSONArray2 = jSONObject.optJSONArray("clickable_area");
                        if (optJSONArray2 != null) {
                            r2 = new ArrayList(optJSONArray2.length());
                            int length2 = optJSONArray2.length();
                            while (i2 < length2) {
                                JSONObject jSONObject3 = optJSONArray2.getJSONObject(i2);
                                Serializer.c<WebClickablePoint> cVar8 = WebClickablePoint.CREATOR;
                                r2.add(WebClickablePoint.a.a(jSONObject3));
                                i2++;
                            }
                        } else {
                            r2 = EmptyList.b;
                        }
                        List list3 = r2;
                        JSONObject optJSONObject6 = jSONObject.optJSONObject("link_object");
                        SnippetAttachment Ib2 = optJSONObject6 != null ? SnippetAttachment.Ib(optJSONObject6, null) : null;
                        if (jSONObject.has("start_time") && jSONObject.has("duration")) {
                            q500Var = new q500(jSONObject.getLong("start_time"), jSONObject.getLong("duration") + jSONObject.getLong("start_time"));
                        }
                        return new ClickableServiceYcItem(jSONObject.getLong("id"), list3, q500Var, null, null, jSONObject.optString(TtmlNode.TAG_STYLE), Ib2, 24, null);
                    }
                    if (string.equals(WebStickerType.LINK.i())) {
                        Serializer.c<ClickableLink> cVar9 = ClickableLink.CREATOR;
                        long j5 = jSONObject.getLong("id");
                        SnippetAttachment Ib3 = SnippetAttachment.Ib(jSONObject.optJSONObject("link_object"), null);
                        return new ClickableLink(j5, ClickableSticker.a.a(jSONObject), ClickableSticker.a.b(jSONObject), Ib3.f.b, null, jSONObject.optString("tooltip_text", null), Ib3, jSONObject.optString(TtmlNode.TAG_STYLE, null), null, 256, null);
                    }
                    if (string.equals(WebStickerType.OWNER.i())) {
                        Serializer.c<ClickableOwner> cVar10 = ClickableOwner.CREATOR;
                        UserId userId3 = new UserId(jSONObject.optLong("owner_id"));
                        if (!fkq0.c(userId3)) {
                            return null;
                        }
                        clickableClip = new ClickableOwner(jSONObject.getLong("id"), ClickableSticker.a.a(jSONObject), ClickableSticker.a.b(jSONObject), userId3);
                    } else {
                        if (string.equals(WebStickerType.REPLY.i())) {
                            Serializer.c<ClickableReply> cVar11 = ClickableReply.CREATOR;
                            UserId userId4 = new UserId(jSONObject.optLong("owner_id"));
                            int optInt = jSONObject.optInt("story_id");
                            if (fkq0.c(userId4) && optInt != 0) {
                                clickableClip = new ClickableReply(jSONObject.getLong("id"), ClickableSticker.a.a(jSONObject), ClickableSticker.a.b(jSONObject), userId4, optInt, jSONObject.optString(TtmlNode.TAG_STYLE));
                            }
                            return null;
                        }
                        if (string.equals(WebStickerType.POST.i())) {
                            return new ClickablePost(jSONObject.getLong("id"), ClickableSticker.a.a(jSONObject), ClickableSticker.a.b(jSONObject), jSONObject.getInt("post_id"), new UserId(jSONObject.optLong("post_owner_id")), jSONObject.optString(TtmlNode.TAG_STYLE));
                        }
                        if (string.equals(WebStickerType.VK_VIDEO.i())) {
                            Serializer.c<ClickableVideo> cVar12 = ClickableVideo.CREATOR;
                            try {
                                UserId userId5 = new UserId(jSONObject.optLong("owner_id"));
                                int i3 = jSONObject.getInt("video_id");
                                String optString2 = jSONObject.optString(TtmlNode.TAG_STYLE);
                                if (!fkq0.c(userId5)) {
                                    return null;
                                }
                                clickableClip = new ClickableVideo(jSONObject.getLong("id"), ClickableSticker.a.a(jSONObject), ClickableSticker.a.b(jSONObject), userId5, i3, optString2);
                            } catch (JSONException e) {
                                L.j(e, "Invalid data from clickable video sticker!");
                                return null;
                            }
                        } else {
                            if (!string.equals(WebStickerType.CHANNEL_POST.i())) {
                                if (string.equals(WebStickerType.STICKER.i())) {
                                    long j6 = jSONObject.getLong("id");
                                    List a3 = ClickableSticker.a.a(jSONObject);
                                    q500 b2 = ClickableSticker.a.b(jSONObject);
                                    int i4 = jSONObject.getInt("sticker_id");
                                    int i5 = jSONObject.getInt("sticker_pack_id");
                                    JSONObject optJSONObject7 = jSONObject.optJSONObject("vmoji");
                                    return new ClickablePackSticker(j6, a3, b2, i4, i5, optJSONObject7 != null ? optJSONObject7.optString("character_id") : null);
                                }
                                if (string.equals(WebStickerType.POLL.i())) {
                                    long j7 = jSONObject.getLong("id");
                                    List a4 = ClickableSticker.a.a(jSONObject);
                                    q500 b3 = ClickableSticker.a.b(jSONObject);
                                    Serializer.c<ActionPoll> cVar13 = ActionPoll.CREATOR;
                                    JSONObject optJSONObject8 = jSONObject.optJSONObject("poll");
                                    try {
                                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                                        if (map != 0 && (entrySet2 = map.entrySet()) != null) {
                                            for (Map.Entry entry : entrySet2) {
                                                UserId userId6 = (UserId) entry.getKey();
                                                UserProfile userProfile5 = (UserProfile) entry.getValue();
                                                linkedHashMap.put(userId6, new Owner(userProfile5.c, userProfile5.e, userProfile5.h, null, null, null, null, null, null, null, null, null, null, false, false, false, false, null, 0, null, null, false, 4194296, null));
                                            }
                                        }
                                        if (map2 != null && (entrySet = map2.entrySet()) != null) {
                                            for (Map.Entry entry2 : entrySet) {
                                                UserId userId7 = (UserId) entry2.getKey();
                                                Group group4 = (Group) entry2.getValue();
                                                linkedHashMap.put(userId7, new Owner(group4.c, group4.d, group4.e, null, null, null, null, null, null, null, null, null, null, false, false, false, false, null, 0, null, null, false, 4194296, null));
                                            }
                                        }
                                        Serializer.c<Poll> cVar14 = Poll.CREATOR;
                                        actionPoll = new ActionPoll(Poll.a.a(optJSONObject8, linkedHashMap));
                                    } catch (JSONException unused) {
                                        actionPoll = new ActionPoll(null);
                                    }
                                    return new ClickablePoll(j7, a4, b3, actionPoll);
                                }
                                if (string.equals(WebStickerType.APP.i())) {
                                    Serializer.c<ClickableApp> cVar15 = ClickableApp.CREATOR;
                                    ApiApplication.b bVar = ApiApplication.k0;
                                    JSONObject jSONObject4 = jSONObject.getJSONObject(MBridgeConstans.DYNAMIC_VIEW_WX_APP);
                                    bVar.getClass();
                                    return new ClickableApp(jSONObject.getLong("id"), ClickableSticker.a.a(jSONObject), ClickableSticker.a.b(jSONObject), null, new ApiApplication(jSONObject4), jSONObject.optBoolean("has_new_interactions"), 8, null);
                                }
                                if (string.equals(WebStickerType.SITUATIONAL_THEME.i())) {
                                    Serializer.c<ClickableSituationalTheme> cVar16 = ClickableSituationalTheme.CREATOR;
                                    return new ClickableSituationalTheme(jSONObject.getLong("id"), ClickableSticker.a.a(jSONObject), ClickableSticker.a.b(jSONObject), Integer.valueOf(jSONObject.optInt("situational_theme_id")), jSONObject.optString("situational_app_url"));
                                }
                                if (string.equals(WebStickerType.CLIP.i())) {
                                    Serializer.c<ClickableClip> cVar17 = ClickableClip.CREATOR;
                                    UserId userId8 = new UserId(jSONObject.optLong("owner_id"));
                                    int optInt2 = jSONObject.optInt("clip_id");
                                    if (fkq0.c(userId8) && optInt2 != 0) {
                                        clickableClip = new ClickableClip(jSONObject.getLong("id"), ClickableSticker.a.a(jSONObject), ClickableSticker.a.b(jSONObject), userId8, optInt2, jSONObject.optString(TtmlNode.TAG_STYLE));
                                    }
                                    return null;
                                }
                                if (!string.equals(WebStickerType.SITUATIONAL_TEMPLATE.i())) {
                                    if (string.equals(WebStickerType.PHOTO.i())) {
                                        Serializer.c<ClickablePhoto> cVar18 = ClickablePhoto.CREATOR;
                                        UserId userId9 = new UserId(jSONObject.getLong("photo_owner_id"));
                                        if (map == 0 || (userProfile = (UserProfile) map.get(userId9)) == null) {
                                            userProfile = map2 != null ? (Group) map2.get(fkq0.a(userId9)) : null;
                                            if (userProfile == null) {
                                                return null;
                                            }
                                        }
                                        boolean z = userProfile instanceof UserProfile;
                                        String D = z ? userProfile.D() : userProfile instanceof Group ? userProfile.d : "";
                                        String str5 = D == null ? "" : D;
                                        if (z) {
                                            verifyInfo = userProfile.B;
                                        } else if (userProfile instanceof Group) {
                                            verifyInfo = ((Group) userProfile).y;
                                        }
                                        return new ClickablePhoto(jSONObject.getLong("id"), ClickableSticker.a.a(jSONObject), ClickableSticker.a.b(jSONObject), str5, jSONObject.getLong("photo_owner_id"), jSONObject.getInt("photo_id"), jSONObject.optString(TtmlNode.TAG_STYLE), verifyInfo);
                                    }
                                    if (string.equals(WebStickerType.PHOTO_ALBUM.i())) {
                                        return new ClickablePhotoAlbum(jSONObject.getLong("id"), ClickableSticker.a.a(jSONObject), ClickableSticker.a.b(jSONObject), jSONObject.optLong("album_owner_id"), jSONObject.optInt("album_id"), jSONObject.optString(TtmlNode.TAG_STYLE));
                                    }
                                    if (!string.equals(WebStickerType.TICKET.i())) {
                                        L.l("Can't parse clickable stickers with type: ".concat(string));
                                        return null;
                                    }
                                    Serializer.c<ClickableVkTicket> cVar19 = ClickableVkTicket.CREATOR;
                                    JSONObject jSONObject5 = jSONObject.getJSONObject("ticket");
                                    JSONObject optJSONObject9 = jSONObject5.optJSONObject("image");
                                    String optString3 = optJSONObject9 != null ? optJSONObject9.optString("url") : null;
                                    long j8 = jSONObject.getLong("id");
                                    List a5 = ClickableSticker.a.a(jSONObject);
                                    q500 b4 = ClickableSticker.a.b(jSONObject);
                                    String D2 = f370.D(jSONObject5, "id");
                                    String D3 = f370.D(jSONObject5, "title");
                                    String D4 = f370.D(jSONObject5, "url");
                                    Serializer.c<SeanceInfo> cVar20 = SeanceInfo.CREATOR;
                                    JSONObject optJSONObject10 = jSONObject5.optJSONObject("seance");
                                    return new ClickableVkTicket(j8, a5, b4, D2, D3, optString3, D4, optJSONObject10 != null ? new SeanceInfo(optJSONObject10.optString("id"), optJSONObject10.optString("city_alias"), optJSONObject10.optString("city"), optJSONObject10.optString("date")) : null);
                                }
                                ClickableSituationalTemplate.RepliedUsersInfo repliedUsersInfo = ClickableSituationalTemplate.h;
                                int optInt3 = jSONObject.optInt("situational_theme_id");
                                JSONObject jSONObject6 = jSONObject.getJSONObject("situational_replied_users");
                                JSONArray optJSONArray3 = jSONObject.optJSONArray("items");
                                if (optJSONArray3 != null) {
                                    iterable = new ArrayList(optJSONArray3.length());
                                    int length3 = optJSONArray3.length();
                                    for (int i6 = 0; i6 < length3; i6++) {
                                        iterable.add(new UserId(optJSONArray3.getLong(i6)));
                                    }
                                } else {
                                    iterable = EmptyList.b;
                                }
                                int optInt4 = jSONObject6.optInt("count", 0);
                                int optInt5 = jSONObject6.optInt("friends_count");
                                ArrayList arrayList = new ArrayList();
                                for (UserId userId10 : iterable) {
                                    if (map == 0 || (userProfile2 = (UserProfile) map.get(userId10)) == null || (str = userProfile2.h) == null) {
                                        str = (map2 == null || (group = (Group) map2.get(userId10)) == null) ? null : group.e;
                                    }
                                    if (str != null) {
                                        arrayList.add(str);
                                    }
                                }
                                ClickableSituationalTemplate.RepliedUsersInfo repliedUsersInfo2 = new ClickableSituationalTemplate.RepliedUsersInfo(optInt4, iterable, arrayList, optInt5);
                                long j9 = jSONObject.getLong("id");
                                JSONArray optJSONArray4 = jSONObject.optJSONArray("clickable_area");
                                if (optJSONArray4 != null) {
                                    list = new ArrayList(optJSONArray4.length());
                                    int length4 = optJSONArray4.length();
                                    while (i2 < length4) {
                                        JSONObject jSONObject7 = optJSONArray4.getJSONObject(i2);
                                        Serializer.c<WebClickablePoint> cVar21 = WebClickablePoint.CREATOR;
                                        list.add(WebClickablePoint.a.a(jSONObject7));
                                        i2++;
                                    }
                                } else {
                                    list = EmptyList.b;
                                }
                                return new ClickableSituationalTemplate(j9, list, null, Integer.valueOf(optInt3), repliedUsersInfo2, 4, null);
                            }
                            Serializer.c<ClickableChannelPost> cVar22 = ClickableChannelPost.CREATOR;
                            try {
                                UserId userId11 = new UserId(jSONObject.optLong("channel_owner_id"));
                                UserId userId12 = new UserId(jSONObject.optLong("channel_post_owner_id"));
                                int i7 = jSONObject.getInt("channel_post_id");
                                String optString4 = jSONObject.optString(TtmlNode.TAG_STYLE);
                                if (!fkq0.c(userId11)) {
                                    return null;
                                }
                                long j10 = jSONObject.getLong("id");
                                List a6 = ClickableSticker.a.a(jSONObject);
                                q500 b5 = ClickableSticker.a.b(jSONObject);
                                if (jSONObject.has("channel_name")) {
                                    str2 = jSONObject.optString("channel_name");
                                } else {
                                    if (fkq0.b(userId11)) {
                                        if (map2 != null && (group2 = (Group) map2.get(fkq0.a(userId11))) != null) {
                                            str2 = group2.d;
                                        }
                                        str3 = null;
                                    } else {
                                        if (map != 0 && (userProfile3 = (UserProfile) map.get(userId11)) != null) {
                                            str2 = userProfile3.e;
                                        }
                                        str3 = null;
                                    }
                                    clickableChannelPost = new ClickableChannelPost(j10, a6, b5, userId11, userId12, i7, optString4, str3);
                                }
                                str3 = str2;
                                clickableChannelPost = new ClickableChannelPost(j10, a6, b5, userId11, userId12, i7, optString4, str3);
                            } catch (JSONException e2) {
                                L.j(e2, "Invalid data from clickable channel post sticker!");
                                return null;
                            }
                        }
                    }
                }
                return clickableClip;
            } catch (JSONException unused2) {
                return null;
            }
        }
        Serializer.c<ClickableQuestion> cVar23 = ClickableQuestion.CREATOR;
        try {
            long j11 = jSONObject.getLong("id");
            Serializer.c<WebActionQuestion> cVar24 = WebActionQuestion.CREATOR;
            clickableChannelPost = new ClickableQuestion(j11, ClickableSticker.a.a(jSONObject), ClickableSticker.a.b(jSONObject), WebActionQuestion.a.a(jSONObject), true);
        } catch (Throwable th2) {
            L.g("Can't parse question", th2);
            return null;
        }
        return clickableChannelPost;
    }
}
