package com.blaze.blazesdk.style.players.videos;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.core.app.NotificationCompat;
import com.blaze.blazesdk.utils.BlazeParcelable;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import defpackage.h5a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0087\b\u0018\u0000 F2\u00020\u0001:\u0001GBY\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019J\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0019J\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0019J\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0019J\u0010\u0010\"\u001a\u00020\u0002HÀ\u0003¢\u0006\u0004\b!\u0010\u0019J\u0010\u0010$\u001a\u00020\u0002HÀ\u0003¢\u0006\u0004\b#\u0010\u0019Jt\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b*\u0010\u0017J\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b.\u0010/R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u0019\"\u0004\b2\u00103R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u00100\u001a\u0004\b4\u0010\u0019\"\u0004\b5\u00103R\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u00100\u001a\u0004\b6\u0010\u0019\"\u0004\b7\u00103R\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u00100\u001a\u0004\b8\u0010\u0019\"\u0004\b9\u00103R\"\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u00100\u001a\u0004\b:\u0010\u0019\"\u0004\b;\u00103R\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u00100\u001a\u0004\b<\u0010\u0019\"\u0004\b=\u00103R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u00100\u001a\u0004\b>\u0010\u0019\"\u0004\b?\u00103R\"\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u00100\u001a\u0004\b@\u0010\u0019\"\u0004\bA\u00103R\"\u0010\u000b\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000b\u00100\u001a\u0004\bB\u0010\u0019\"\u0004\bC\u00103R\"\u0010\f\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u00100\u001a\u0004\bD\u0010\u0019\"\u0004\bE\u00103¨\u0006H"}, d2 = {"Lcom/blaze/blazesdk/style/players/videos/BlazeVideosInlineInteractivePlayerButtonsStyle;", "Lcom/blaze/blazesdk/utils/BlazeParcelable;", "Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerButtonStyle;", CampaignEx.JSON_NATIVE_VIDEO_MUTE, "share", "like", "playPause", "previous", "next", "fullScreen", "replay", "captions", "settings", "<init>", "(Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerButtonStyle;Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerButtonStyle;Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerButtonStyle;Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerButtonStyle;Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerButtonStyle;Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerButtonStyle;Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerButtonStyle;Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerButtonStyle;Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerButtonStyle;Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerButtonStyle;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerButtonStyle;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9$blazesdk_release", "component9", "component10$blazesdk_release", "component10", "copy", "(Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerButtonStyle;Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerButtonStyle;Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerButtonStyle;Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerButtonStyle;Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerButtonStyle;Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerButtonStyle;Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerButtonStyle;Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerButtonStyle;Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerButtonStyle;Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerButtonStyle;)Lcom/blaze/blazesdk/style/players/videos/BlazeVideosInlineInteractivePlayerButtonsStyle;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerButtonStyle;", "getMute", "setMute", "(Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerButtonStyle;)V", "getShare", "setShare", "getLike", "setLike", "getPlayPause", "setPlayPause", "getPrevious", "setPrevious", "getNext", "setNext", "getFullScreen", "setFullScreen", "getReplay", "setReplay", "getCaptions$blazesdk_release", "setCaptions$blazesdk_release", "getSettings$blazesdk_release", "setSettings$blazesdk_release", "Companion", "a", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BlazeVideosInlineInteractivePlayerButtonsStyle implements BlazeParcelable {

    @NotNull
    private BlazeVideosPlayerButtonStyle captions;

    @NotNull
    private BlazeVideosPlayerButtonStyle fullScreen;

    @NotNull
    private BlazeVideosPlayerButtonStyle like;

    @NotNull
    private BlazeVideosPlayerButtonStyle mute;

    @NotNull
    private BlazeVideosPlayerButtonStyle next;

    @NotNull
    private BlazeVideosPlayerButtonStyle playPause;

    @NotNull
    private BlazeVideosPlayerButtonStyle previous;

    @NotNull
    private BlazeVideosPlayerButtonStyle replay;

    @NotNull
    private BlazeVideosPlayerButtonStyle settings;

    @NotNull
    private BlazeVideosPlayerButtonStyle share;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<BlazeVideosInlineInteractivePlayerButtonsStyle> CREATOR = new b();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.blaze.blazesdk.style.players.videos.BlazeVideosInlineInteractivePlayerButtonsStyle$a, reason: from kotlin metadata */
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            Parcelable.Creator<BlazeVideosPlayerButtonStyle> creator = BlazeVideosPlayerButtonStyle.CREATOR;
            return new BlazeVideosInlineInteractivePlayerButtonsStyle(creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BlazeVideosInlineInteractivePlayerButtonsStyle[i];
        }
    }

    public BlazeVideosInlineInteractivePlayerButtonsStyle(@NotNull BlazeVideosPlayerButtonStyle blazeVideosPlayerButtonStyle, @NotNull BlazeVideosPlayerButtonStyle blazeVideosPlayerButtonStyle2, @NotNull BlazeVideosPlayerButtonStyle blazeVideosPlayerButtonStyle3, @NotNull BlazeVideosPlayerButtonStyle blazeVideosPlayerButtonStyle4, @NotNull BlazeVideosPlayerButtonStyle blazeVideosPlayerButtonStyle5, @NotNull BlazeVideosPlayerButtonStyle blazeVideosPlayerButtonStyle6, @NotNull BlazeVideosPlayerButtonStyle blazeVideosPlayerButtonStyle7, @NotNull BlazeVideosPlayerButtonStyle blazeVideosPlayerButtonStyle8, @NotNull BlazeVideosPlayerButtonStyle blazeVideosPlayerButtonStyle9, @NotNull BlazeVideosPlayerButtonStyle blazeVideosPlayerButtonStyle10) {
        blazeVideosPlayerButtonStyle.getClass();
        blazeVideosPlayerButtonStyle2.getClass();
        blazeVideosPlayerButtonStyle3.getClass();
        blazeVideosPlayerButtonStyle4.getClass();
        blazeVideosPlayerButtonStyle5.getClass();
        blazeVideosPlayerButtonStyle6.getClass();
        blazeVideosPlayerButtonStyle7.getClass();
        blazeVideosPlayerButtonStyle8.getClass();
        blazeVideosPlayerButtonStyle9.getClass();
        blazeVideosPlayerButtonStyle10.getClass();
        this.mute = blazeVideosPlayerButtonStyle;
        this.share = blazeVideosPlayerButtonStyle2;
        this.like = blazeVideosPlayerButtonStyle3;
        this.playPause = blazeVideosPlayerButtonStyle4;
        this.previous = blazeVideosPlayerButtonStyle5;
        this.next = blazeVideosPlayerButtonStyle6;
        this.fullScreen = blazeVideosPlayerButtonStyle7;
        this.replay = blazeVideosPlayerButtonStyle8;
        this.captions = blazeVideosPlayerButtonStyle9;
        this.settings = blazeVideosPlayerButtonStyle10;
    }

    public static /* synthetic */ BlazeVideosInlineInteractivePlayerButtonsStyle copy$default(BlazeVideosInlineInteractivePlayerButtonsStyle blazeVideosInlineInteractivePlayerButtonsStyle, BlazeVideosPlayerButtonStyle blazeVideosPlayerButtonStyle, BlazeVideosPlayerButtonStyle blazeVideosPlayerButtonStyle2, BlazeVideosPlayerButtonStyle blazeVideosPlayerButtonStyle3, BlazeVideosPlayerButtonStyle blazeVideosPlayerButtonStyle4, BlazeVideosPlayerButtonStyle blazeVideosPlayerButtonStyle5, BlazeVideosPlayerButtonStyle blazeVideosPlayerButtonStyle6, BlazeVideosPlayerButtonStyle blazeVideosPlayerButtonStyle7, BlazeVideosPlayerButtonStyle blazeVideosPlayerButtonStyle8, BlazeVideosPlayerButtonStyle blazeVideosPlayerButtonStyle9, BlazeVideosPlayerButtonStyle blazeVideosPlayerButtonStyle10, int i, Object obj) {
        if ((i & 1) != 0) {
            blazeVideosPlayerButtonStyle = blazeVideosInlineInteractivePlayerButtonsStyle.mute;
        }
        if ((i & 2) != 0) {
            blazeVideosPlayerButtonStyle2 = blazeVideosInlineInteractivePlayerButtonsStyle.share;
        }
        if ((i & 4) != 0) {
            blazeVideosPlayerButtonStyle3 = blazeVideosInlineInteractivePlayerButtonsStyle.like;
        }
        if ((i & 8) != 0) {
            blazeVideosPlayerButtonStyle4 = blazeVideosInlineInteractivePlayerButtonsStyle.playPause;
        }
        if ((i & 16) != 0) {
            blazeVideosPlayerButtonStyle5 = blazeVideosInlineInteractivePlayerButtonsStyle.previous;
        }
        if ((i & 32) != 0) {
            blazeVideosPlayerButtonStyle6 = blazeVideosInlineInteractivePlayerButtonsStyle.next;
        }
        if ((i & 64) != 0) {
            blazeVideosPlayerButtonStyle7 = blazeVideosInlineInteractivePlayerButtonsStyle.fullScreen;
        }
        if ((i & 128) != 0) {
            blazeVideosPlayerButtonStyle8 = blazeVideosInlineInteractivePlayerButtonsStyle.replay;
        }
        if ((i & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            blazeVideosPlayerButtonStyle9 = blazeVideosInlineInteractivePlayerButtonsStyle.captions;
        }
        if ((i & 512) != 0) {
            blazeVideosPlayerButtonStyle10 = blazeVideosInlineInteractivePlayerButtonsStyle.settings;
        }
        BlazeVideosPlayerButtonStyle blazeVideosPlayerButtonStyle11 = blazeVideosPlayerButtonStyle9;
        BlazeVideosPlayerButtonStyle blazeVideosPlayerButtonStyle12 = blazeVideosPlayerButtonStyle10;
        BlazeVideosPlayerButtonStyle blazeVideosPlayerButtonStyle13 = blazeVideosPlayerButtonStyle7;
        BlazeVideosPlayerButtonStyle blazeVideosPlayerButtonStyle14 = blazeVideosPlayerButtonStyle8;
        BlazeVideosPlayerButtonStyle blazeVideosPlayerButtonStyle15 = blazeVideosPlayerButtonStyle5;
        BlazeVideosPlayerButtonStyle blazeVideosPlayerButtonStyle16 = blazeVideosPlayerButtonStyle6;
        return blazeVideosInlineInteractivePlayerButtonsStyle.copy(blazeVideosPlayerButtonStyle, blazeVideosPlayerButtonStyle2, blazeVideosPlayerButtonStyle3, blazeVideosPlayerButtonStyle4, blazeVideosPlayerButtonStyle15, blazeVideosPlayerButtonStyle16, blazeVideosPlayerButtonStyle13, blazeVideosPlayerButtonStyle14, blazeVideosPlayerButtonStyle11, blazeVideosPlayerButtonStyle12);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final BlazeVideosPlayerButtonStyle getMute() {
        return this.mute;
    }

    @NotNull
    /* renamed from: component10$blazesdk_release, reason: from getter */
    public final BlazeVideosPlayerButtonStyle getSettings() {
        return this.settings;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final BlazeVideosPlayerButtonStyle getShare() {
        return this.share;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final BlazeVideosPlayerButtonStyle getLike() {
        return this.like;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final BlazeVideosPlayerButtonStyle getPlayPause() {
        return this.playPause;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final BlazeVideosPlayerButtonStyle getPrevious() {
        return this.previous;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final BlazeVideosPlayerButtonStyle getNext() {
        return this.next;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final BlazeVideosPlayerButtonStyle getFullScreen() {
        return this.fullScreen;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final BlazeVideosPlayerButtonStyle getReplay() {
        return this.replay;
    }

    @NotNull
    /* renamed from: component9$blazesdk_release, reason: from getter */
    public final BlazeVideosPlayerButtonStyle getCaptions() {
        return this.captions;
    }

    @NotNull
    public final BlazeVideosInlineInteractivePlayerButtonsStyle copy(@NotNull BlazeVideosPlayerButtonStyle mute, @NotNull BlazeVideosPlayerButtonStyle share, @NotNull BlazeVideosPlayerButtonStyle like, @NotNull BlazeVideosPlayerButtonStyle playPause, @NotNull BlazeVideosPlayerButtonStyle previous, @NotNull BlazeVideosPlayerButtonStyle next, @NotNull BlazeVideosPlayerButtonStyle fullScreen, @NotNull BlazeVideosPlayerButtonStyle replay, @NotNull BlazeVideosPlayerButtonStyle captions, @NotNull BlazeVideosPlayerButtonStyle settings) {
        mute.getClass();
        share.getClass();
        like.getClass();
        playPause.getClass();
        previous.getClass();
        next.getClass();
        fullScreen.getClass();
        replay.getClass();
        captions.getClass();
        settings.getClass();
        return new BlazeVideosInlineInteractivePlayerButtonsStyle(mute, share, like, playPause, previous, next, fullScreen, replay, captions, settings);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlazeVideosInlineInteractivePlayerButtonsStyle)) {
            return false;
        }
        BlazeVideosInlineInteractivePlayerButtonsStyle blazeVideosInlineInteractivePlayerButtonsStyle = (BlazeVideosInlineInteractivePlayerButtonsStyle) other;
        return Intrinsics.c(this.mute, blazeVideosInlineInteractivePlayerButtonsStyle.mute) && Intrinsics.c(this.share, blazeVideosInlineInteractivePlayerButtonsStyle.share) && Intrinsics.c(this.like, blazeVideosInlineInteractivePlayerButtonsStyle.like) && Intrinsics.c(this.playPause, blazeVideosInlineInteractivePlayerButtonsStyle.playPause) && Intrinsics.c(this.previous, blazeVideosInlineInteractivePlayerButtonsStyle.previous) && Intrinsics.c(this.next, blazeVideosInlineInteractivePlayerButtonsStyle.next) && Intrinsics.c(this.fullScreen, blazeVideosInlineInteractivePlayerButtonsStyle.fullScreen) && Intrinsics.c(this.replay, blazeVideosInlineInteractivePlayerButtonsStyle.replay) && Intrinsics.c(this.captions, blazeVideosInlineInteractivePlayerButtonsStyle.captions) && Intrinsics.c(this.settings, blazeVideosInlineInteractivePlayerButtonsStyle.settings);
    }

    @NotNull
    public final BlazeVideosPlayerButtonStyle getCaptions$blazesdk_release() {
        return this.captions;
    }

    @NotNull
    public final BlazeVideosPlayerButtonStyle getFullScreen() {
        return this.fullScreen;
    }

    @NotNull
    public final BlazeVideosPlayerButtonStyle getLike() {
        return this.like;
    }

    @NotNull
    public final BlazeVideosPlayerButtonStyle getMute() {
        return this.mute;
    }

    @NotNull
    public final BlazeVideosPlayerButtonStyle getNext() {
        return this.next;
    }

    @NotNull
    public final BlazeVideosPlayerButtonStyle getPlayPause() {
        return this.playPause;
    }

    @NotNull
    public final BlazeVideosPlayerButtonStyle getPrevious() {
        return this.previous;
    }

    @NotNull
    public final BlazeVideosPlayerButtonStyle getReplay() {
        return this.replay;
    }

    @NotNull
    public final BlazeVideosPlayerButtonStyle getSettings$blazesdk_release() {
        return this.settings;
    }

    @NotNull
    public final BlazeVideosPlayerButtonStyle getShare() {
        return this.share;
    }

    public int hashCode() {
        return this.settings.hashCode() + h5a.D(this.captions, h5a.D(this.replay, h5a.D(this.fullScreen, h5a.D(this.next, h5a.D(this.previous, h5a.D(this.playPause, h5a.D(this.like, h5a.D(this.share, this.mute.hashCode() * 31))))))));
    }

    public final void setCaptions$blazesdk_release(@NotNull BlazeVideosPlayerButtonStyle blazeVideosPlayerButtonStyle) {
        blazeVideosPlayerButtonStyle.getClass();
        this.captions = blazeVideosPlayerButtonStyle;
    }

    public final void setFullScreen(@NotNull BlazeVideosPlayerButtonStyle blazeVideosPlayerButtonStyle) {
        blazeVideosPlayerButtonStyle.getClass();
        this.fullScreen = blazeVideosPlayerButtonStyle;
    }

    public final void setLike(@NotNull BlazeVideosPlayerButtonStyle blazeVideosPlayerButtonStyle) {
        blazeVideosPlayerButtonStyle.getClass();
        this.like = blazeVideosPlayerButtonStyle;
    }

    public final void setMute(@NotNull BlazeVideosPlayerButtonStyle blazeVideosPlayerButtonStyle) {
        blazeVideosPlayerButtonStyle.getClass();
        this.mute = blazeVideosPlayerButtonStyle;
    }

    public final void setNext(@NotNull BlazeVideosPlayerButtonStyle blazeVideosPlayerButtonStyle) {
        blazeVideosPlayerButtonStyle.getClass();
        this.next = blazeVideosPlayerButtonStyle;
    }

    public final void setPlayPause(@NotNull BlazeVideosPlayerButtonStyle blazeVideosPlayerButtonStyle) {
        blazeVideosPlayerButtonStyle.getClass();
        this.playPause = blazeVideosPlayerButtonStyle;
    }

    public final void setPrevious(@NotNull BlazeVideosPlayerButtonStyle blazeVideosPlayerButtonStyle) {
        blazeVideosPlayerButtonStyle.getClass();
        this.previous = blazeVideosPlayerButtonStyle;
    }

    public final void setReplay(@NotNull BlazeVideosPlayerButtonStyle blazeVideosPlayerButtonStyle) {
        blazeVideosPlayerButtonStyle.getClass();
        this.replay = blazeVideosPlayerButtonStyle;
    }

    public final void setSettings$blazesdk_release(@NotNull BlazeVideosPlayerButtonStyle blazeVideosPlayerButtonStyle) {
        blazeVideosPlayerButtonStyle.getClass();
        this.settings = blazeVideosPlayerButtonStyle;
    }

    public final void setShare(@NotNull BlazeVideosPlayerButtonStyle blazeVideosPlayerButtonStyle) {
        blazeVideosPlayerButtonStyle.getClass();
        this.share = blazeVideosPlayerButtonStyle;
    }

    @NotNull
    public String toString() {
        return "BlazeVideosInlineInteractivePlayerButtonsStyle(mute=" + this.mute + ", share=" + this.share + ", like=" + this.like + ", playPause=" + this.playPause + ", previous=" + this.previous + ", next=" + this.next + ", fullScreen=" + this.fullScreen + ", replay=" + this.replay + ", captions=" + this.captions + ", settings=" + this.settings + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        this.mute.writeToParcel(dest, flags);
        this.share.writeToParcel(dest, flags);
        this.like.writeToParcel(dest, flags);
        this.playPause.writeToParcel(dest, flags);
        this.previous.writeToParcel(dest, flags);
        this.next.writeToParcel(dest, flags);
        this.fullScreen.writeToParcel(dest, flags);
        this.replay.writeToParcel(dest, flags);
        this.captions.writeToParcel(dest, flags);
        this.settings.writeToParcel(dest, flags);
    }
}
