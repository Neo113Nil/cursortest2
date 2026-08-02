package com.vk.clips.design.view.sidecontrols;

import com.vk.clips.design.view.sidecontrols.b;
import com.vkontakte.android.R;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ClipFeedSideControlsStatic.kt */
/* loaded from: classes16.dex */
public final class ClipFeedSideControlsStatic {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ClipFeedSideControlsStatic[] $VALUES;
    public static final ClipFeedSideControlsStatic COMMENTS;
    public static final ClipFeedSideControlsStatic DISLIKES;
    public static final ClipFeedSideControlsStatic FAVORITES;
    public static final ClipFeedSideControlsStatic LIKES;
    public static final ClipFeedSideControlsStatic MORE;
    public static final ClipFeedSideControlsStatic SHARE;
    private final int descriptionResId;
    private final b.a viewIds;

    static {
        ClipFeedSideControlsStatic clipFeedSideControlsStatic = new ClipFeedSideControlsStatic("LIKES", 0, new b.a(R.id.fullscreen_clip_overlay_like_container, R.id.fullscreen_clip_overlay_like_image, R.id.fullscreen_clip_overlay_like_text), R.string.clips_accessibility_side_like);
        LIKES = clipFeedSideControlsStatic;
        ClipFeedSideControlsStatic clipFeedSideControlsStatic2 = new ClipFeedSideControlsStatic("COMMENTS", 1, new b.a(R.id.fullscreen_clip_overlay_comment_container, R.id.fullscreen_clip_overlay_comment_image, R.id.fullscreen_clip_overlay_comment_text), R.string.clips_accessibility_side_comment);
        COMMENTS = clipFeedSideControlsStatic2;
        ClipFeedSideControlsStatic clipFeedSideControlsStatic3 = new ClipFeedSideControlsStatic("SHARE", 2, new b.a(R.id.fullscreen_clip_overlay_share_container, R.id.fullscreen_clip_overlay_share_image, R.id.fullscreen_clip_overlay_share_text), R.string.clips_accessibility_side_share);
        SHARE = clipFeedSideControlsStatic3;
        ClipFeedSideControlsStatic clipFeedSideControlsStatic4 = new ClipFeedSideControlsStatic("FAVORITES", 3, new b.a(R.id.fullscreen_clip_overlay_favorites_container, R.id.fullscreen_clip_overlay_favorites_image, R.id.fullscreen_clip_overlay_favorites_text), R.string.clips_accessibility_side_add_to_favorites);
        FAVORITES = clipFeedSideControlsStatic4;
        ClipFeedSideControlsStatic clipFeedSideControlsStatic5 = new ClipFeedSideControlsStatic("DISLIKES", 4, new b.a(R.id.fullscreen_clip_overlay_dislike_container, R.id.fullscreen_clip_overlay_dislike_image, R.id.fullscreen_clip_overlay_dislike_text), R.string.clips_accessibility_side_dislike);
        DISLIKES = clipFeedSideControlsStatic5;
        ClipFeedSideControlsStatic clipFeedSideControlsStatic6 = new ClipFeedSideControlsStatic("MORE", 5, new b.a(R.id.fullscreen_clip_overlay_more_container, R.id.fullscreen_clip_overlay_more_image, R.id.fullscreen_clip_overlay_more_text), R.string.clips_accessibility_side_more);
        MORE = clipFeedSideControlsStatic6;
        ClipFeedSideControlsStatic[] clipFeedSideControlsStaticArr = {clipFeedSideControlsStatic, clipFeedSideControlsStatic2, clipFeedSideControlsStatic3, clipFeedSideControlsStatic4, clipFeedSideControlsStatic5, clipFeedSideControlsStatic6};
        $VALUES = clipFeedSideControlsStaticArr;
        $ENTRIES = new asp(clipFeedSideControlsStaticArr);
    }

    public ClipFeedSideControlsStatic(String str, int i, b.a aVar, int i2) {
        this.viewIds = aVar;
        this.descriptionResId = i2;
    }

    public static ClipFeedSideControlsStatic valueOf(String str) {
        return (ClipFeedSideControlsStatic) Enum.valueOf(ClipFeedSideControlsStatic.class, str);
    }

    public static ClipFeedSideControlsStatic[] values() {
        return (ClipFeedSideControlsStatic[]) $VALUES.clone();
    }

    public final int h() {
        return this.descriptionResId;
    }

    public final b.a i() {
        return this.viewIds;
    }
}
