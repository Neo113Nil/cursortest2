package com.blaze.blazesdk.style.players.videos;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.blaze.blazesdk.style.players.IPlayerItemButtonsStyle;
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
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0017\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b%\b\u0087\b\u0018\u0000 Z2\u00020\u00012\u00020\u0002:\u0001[B\u0081\u0001\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0010\u0010!\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b!\u0010\u001fJ\u0010\u0010\"\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\"\u0010\u001fJ\u0010\u0010#\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b#\u0010\u001fJ\u0010\u0010$\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b$\u0010\u001fJ\u0010\u0010%\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b%\u0010\u001fJ\u0010\u0010&\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b&\u0010\u001fJ\u0010\u0010'\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b'\u0010\u001fJ\u0010\u0010(\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b(\u0010\u001fJ\u0010\u0010*\u001a\u00020\u0003HÀ\u0003¢\u0006\u0004\b)\u0010\u001fJ\u0010\u0010+\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b+\u0010\u001fJ\u0010\u0010,\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b,\u0010\u001fJ\u0010\u0010-\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b-\u0010\u001fJ\u0010\u0010.\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b.\u0010\u001fJ¦\u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00102\u001a\u000201HÖ\u0001¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b4\u0010\u001dJ\u001a\u00108\u001a\u0002072\b\u00106\u001a\u0004\u0018\u000105HÖ\u0003¢\u0006\u0004\b8\u00109R\"\u0010\u0004\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010:\u001a\u0004\b;\u0010\u001f\"\u0004\b<\u0010=R\"\u0010\u0005\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010:\u001a\u0004\b>\u0010\u001f\"\u0004\b?\u0010=R\"\u0010\u0006\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010:\u001a\u0004\b@\u0010\u001f\"\u0004\bA\u0010=R\"\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010:\u001a\u0004\bB\u0010\u001f\"\u0004\bC\u0010=R\"\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010:\u001a\u0004\bD\u0010\u001f\"\u0004\bE\u0010=R\"\u0010\t\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010:\u001a\u0004\bF\u0010\u001f\"\u0004\bG\u0010=R\"\u0010\n\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010:\u001a\u0004\bH\u0010\u001f\"\u0004\bI\u0010=R\"\u0010\u000b\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010:\u001a\u0004\bJ\u0010\u001f\"\u0004\bK\u0010=R\"\u0010\f\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010:\u001a\u0004\bL\u0010\u001f\"\u0004\bM\u0010=R\"\u0010\r\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010:\u001a\u0004\bN\u0010\u001f\"\u0004\bO\u0010=R\"\u0010\u000e\u001a\u00020\u00038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010:\u001a\u0004\bP\u0010\u001f\"\u0004\bQ\u0010=R\"\u0010\u000f\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010:\u001a\u0004\bR\u0010\u001f\"\u0004\bS\u0010=R\"\u0010\u0010\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010:\u001a\u0004\bT\u0010\u001f\"\u0004\bU\u0010=R\"\u0010\u0011\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010:\u001a\u0004\bV\u0010\u001f\"\u0004\bW\u0010=R\"\u0010\u0012\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010:\u001a\u0004\bX\u0010\u001f\"\u0004\bY\u0010=¨\u0006\\"}, d2 = {"Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerButtonsStyle;", "Lcom/blaze/blazesdk/style/players/IPlayerItemButtonsStyle;", "Lcom/blaze/blazesdk/utils/BlazeParcelable;", "Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerButtonStyle;", CampaignEx.JSON_NATIVE_VIDEO_MUTE, "exit", "share", "like", "playPause", "previous", "next", "fullScreen", "replay", "captions", "settings", "forceRotation", "seekForward", "seekBackward", "pip", "<init>", "(Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerButtonStyle;Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerButtonStyle;Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerButtonStyle;Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerButtonStyle;Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerButtonStyle;Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerButtonStyle;Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerButtonStyle;Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerButtonStyle;Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerButtonStyle;Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerButtonStyle;Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerButtonStyle;Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerButtonStyle;Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerButtonStyle;Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerButtonStyle;Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerButtonStyle;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerButtonStyle;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11$blazesdk_release", "component11", "component12", "component13", "component14", "component15", "copy", "(Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerButtonStyle;Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerButtonStyle;Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerButtonStyle;Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerButtonStyle;Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerButtonStyle;Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerButtonStyle;Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerButtonStyle;Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerButtonStyle;Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerButtonStyle;Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerButtonStyle;Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerButtonStyle;Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerButtonStyle;Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerButtonStyle;Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerButtonStyle;Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerButtonStyle;)Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerButtonsStyle;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerButtonStyle;", "getMute", "setMute", "(Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerButtonStyle;)V", "getExit", "setExit", "getShare", "setShare", "getLike", "setLike", "getPlayPause", "setPlayPause", "getPrevious", "setPrevious", "getNext", "setNext", "getFullScreen", "setFullScreen", "getReplay", "setReplay", "getCaptions", "setCaptions", "getSettings$blazesdk_release", "setSettings$blazesdk_release", "getForceRotation", "setForceRotation", "getSeekForward", "setSeekForward", "getSeekBackward", "setSeekBackward", "getPip", "setPip", "Companion", "a", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BlazeVideosPlayerButtonsStyle implements IPlayerItemButtonsStyle, BlazeParcelable {

    @NotNull
    private BlazeVideosPlayerButtonStyle captions;

    @NotNull
    private BlazeVideosPlayerButtonStyle exit;

    @NotNull
    private BlazeVideosPlayerButtonStyle forceRotation;

    @NotNull
    private BlazeVideosPlayerButtonStyle fullScreen;

    @NotNull
    private BlazeVideosPlayerButtonStyle like;

    @NotNull
    private BlazeVideosPlayerButtonStyle mute;

    @NotNull
    private BlazeVideosPlayerButtonStyle next;

    @NotNull
    private BlazeVideosPlayerButtonStyle pip;

    @NotNull
    private BlazeVideosPlayerButtonStyle playPause;

    @NotNull
    private BlazeVideosPlayerButtonStyle previous;

    @NotNull
    private BlazeVideosPlayerButtonStyle replay;

    @NotNull
    private BlazeVideosPlayerButtonStyle seekBackward;

    @NotNull
    private BlazeVideosPlayerButtonStyle seekForward;

    @NotNull
    private BlazeVideosPlayerButtonStyle settings;

    @NotNull
    private BlazeVideosPlayerButtonStyle share;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<BlazeVideosPlayerButtonsStyle> CREATOR = new b();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.blaze.blazesdk.style.players.videos.BlazeVideosPlayerButtonsStyle$a, reason: from kotlin metadata */
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
            return new BlazeVideosPlayerButtonsStyle(creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BlazeVideosPlayerButtonsStyle[i];
        }
    }

    public BlazeVideosPlayerButtonsStyle(@NotNull BlazeVideosPlayerButtonStyle blazeVideosPlayerButtonStyle, @NotNull BlazeVideosPlayerButtonStyle blazeVideosPlayerButtonStyle2, @NotNull BlazeVideosPlayerButtonStyle blazeVideosPlayerButtonStyle3, @NotNull BlazeVideosPlayerButtonStyle blazeVideosPlayerButtonStyle4, @NotNull BlazeVideosPlayerButtonStyle blazeVideosPlayerButtonStyle5, @NotNull BlazeVideosPlayerButtonStyle blazeVideosPlayerButtonStyle6, @NotNull BlazeVideosPlayerButtonStyle blazeVideosPlayerButtonStyle7, @NotNull BlazeVideosPlayerButtonStyle blazeVideosPlayerButtonStyle8, @NotNull BlazeVideosPlayerButtonStyle blazeVideosPlayerButtonStyle9, @NotNull BlazeVideosPlayerButtonStyle blazeVideosPlayerButtonStyle10, @NotNull BlazeVideosPlayerButtonStyle blazeVideosPlayerButtonStyle11, @NotNull BlazeVideosPlayerButtonStyle blazeVideosPlayerButtonStyle12, @NotNull BlazeVideosPlayerButtonStyle blazeVideosPlayerButtonStyle13, @NotNull BlazeVideosPlayerButtonStyle blazeVideosPlayerButtonStyle14, @NotNull BlazeVideosPlayerButtonStyle blazeVideosPlayerButtonStyle15) {
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
        blazeVideosPlayerButtonStyle11.getClass();
        blazeVideosPlayerButtonStyle12.getClass();
        blazeVideosPlayerButtonStyle13.getClass();
        blazeVideosPlayerButtonStyle14.getClass();
        blazeVideosPlayerButtonStyle15.getClass();
        this.mute = blazeVideosPlayerButtonStyle;
        this.exit = blazeVideosPlayerButtonStyle2;
        this.share = blazeVideosPlayerButtonStyle3;
        this.like = blazeVideosPlayerButtonStyle4;
        this.playPause = blazeVideosPlayerButtonStyle5;
        this.previous = blazeVideosPlayerButtonStyle6;
        this.next = blazeVideosPlayerButtonStyle7;
        this.fullScreen = blazeVideosPlayerButtonStyle8;
        this.replay = blazeVideosPlayerButtonStyle9;
        this.captions = blazeVideosPlayerButtonStyle10;
        this.settings = blazeVideosPlayerButtonStyle11;
        this.forceRotation = blazeVideosPlayerButtonStyle12;
        this.seekForward = blazeVideosPlayerButtonStyle13;
        this.seekBackward = blazeVideosPlayerButtonStyle14;
        this.pip = blazeVideosPlayerButtonStyle15;
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final BlazeVideosPlayerButtonStyle getMute() {
        return this.mute;
    }

    @NotNull
    /* renamed from: component10, reason: from getter */
    public final BlazeVideosPlayerButtonStyle getCaptions() {
        return this.captions;
    }

    @NotNull
    /* renamed from: component11$blazesdk_release, reason: from getter */
    public final BlazeVideosPlayerButtonStyle getSettings() {
        return this.settings;
    }

    @NotNull
    /* renamed from: component12, reason: from getter */
    public final BlazeVideosPlayerButtonStyle getForceRotation() {
        return this.forceRotation;
    }

    @NotNull
    /* renamed from: component13, reason: from getter */
    public final BlazeVideosPlayerButtonStyle getSeekForward() {
        return this.seekForward;
    }

    @NotNull
    /* renamed from: component14, reason: from getter */
    public final BlazeVideosPlayerButtonStyle getSeekBackward() {
        return this.seekBackward;
    }

    @NotNull
    /* renamed from: component15, reason: from getter */
    public final BlazeVideosPlayerButtonStyle getPip() {
        return this.pip;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final BlazeVideosPlayerButtonStyle getExit() {
        return this.exit;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final BlazeVideosPlayerButtonStyle getShare() {
        return this.share;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final BlazeVideosPlayerButtonStyle getLike() {
        return this.like;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final BlazeVideosPlayerButtonStyle getPlayPause() {
        return this.playPause;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final BlazeVideosPlayerButtonStyle getPrevious() {
        return this.previous;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final BlazeVideosPlayerButtonStyle getNext() {
        return this.next;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final BlazeVideosPlayerButtonStyle getFullScreen() {
        return this.fullScreen;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final BlazeVideosPlayerButtonStyle getReplay() {
        return this.replay;
    }

    @NotNull
    public final BlazeVideosPlayerButtonsStyle copy(@NotNull BlazeVideosPlayerButtonStyle mute, @NotNull BlazeVideosPlayerButtonStyle exit, @NotNull BlazeVideosPlayerButtonStyle share, @NotNull BlazeVideosPlayerButtonStyle like, @NotNull BlazeVideosPlayerButtonStyle playPause, @NotNull BlazeVideosPlayerButtonStyle previous, @NotNull BlazeVideosPlayerButtonStyle next, @NotNull BlazeVideosPlayerButtonStyle fullScreen, @NotNull BlazeVideosPlayerButtonStyle replay, @NotNull BlazeVideosPlayerButtonStyle captions, @NotNull BlazeVideosPlayerButtonStyle settings, @NotNull BlazeVideosPlayerButtonStyle forceRotation, @NotNull BlazeVideosPlayerButtonStyle seekForward, @NotNull BlazeVideosPlayerButtonStyle seekBackward, @NotNull BlazeVideosPlayerButtonStyle pip) {
        mute.getClass();
        exit.getClass();
        share.getClass();
        like.getClass();
        playPause.getClass();
        previous.getClass();
        next.getClass();
        fullScreen.getClass();
        replay.getClass();
        captions.getClass();
        settings.getClass();
        forceRotation.getClass();
        seekForward.getClass();
        seekBackward.getClass();
        pip.getClass();
        return new BlazeVideosPlayerButtonsStyle(mute, exit, share, like, playPause, previous, next, fullScreen, replay, captions, settings, forceRotation, seekForward, seekBackward, pip);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlazeVideosPlayerButtonsStyle)) {
            return false;
        }
        BlazeVideosPlayerButtonsStyle blazeVideosPlayerButtonsStyle = (BlazeVideosPlayerButtonsStyle) other;
        return Intrinsics.c(this.mute, blazeVideosPlayerButtonsStyle.mute) && Intrinsics.c(this.exit, blazeVideosPlayerButtonsStyle.exit) && Intrinsics.c(this.share, blazeVideosPlayerButtonsStyle.share) && Intrinsics.c(this.like, blazeVideosPlayerButtonsStyle.like) && Intrinsics.c(this.playPause, blazeVideosPlayerButtonsStyle.playPause) && Intrinsics.c(this.previous, blazeVideosPlayerButtonsStyle.previous) && Intrinsics.c(this.next, blazeVideosPlayerButtonsStyle.next) && Intrinsics.c(this.fullScreen, blazeVideosPlayerButtonsStyle.fullScreen) && Intrinsics.c(this.replay, blazeVideosPlayerButtonsStyle.replay) && Intrinsics.c(this.captions, blazeVideosPlayerButtonsStyle.captions) && Intrinsics.c(this.settings, blazeVideosPlayerButtonsStyle.settings) && Intrinsics.c(this.forceRotation, blazeVideosPlayerButtonsStyle.forceRotation) && Intrinsics.c(this.seekForward, blazeVideosPlayerButtonsStyle.seekForward) && Intrinsics.c(this.seekBackward, blazeVideosPlayerButtonsStyle.seekBackward) && Intrinsics.c(this.pip, blazeVideosPlayerButtonsStyle.pip);
    }

    @NotNull
    public final BlazeVideosPlayerButtonStyle getCaptions() {
        return this.captions;
    }

    @NotNull
    public final BlazeVideosPlayerButtonStyle getForceRotation() {
        return this.forceRotation;
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
    public final BlazeVideosPlayerButtonStyle getNext() {
        return this.next;
    }

    @NotNull
    public final BlazeVideosPlayerButtonStyle getPip() {
        return this.pip;
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
    public final BlazeVideosPlayerButtonStyle getSeekBackward() {
        return this.seekBackward;
    }

    @NotNull
    public final BlazeVideosPlayerButtonStyle getSeekForward() {
        return this.seekForward;
    }

    @NotNull
    public final BlazeVideosPlayerButtonStyle getSettings$blazesdk_release() {
        return this.settings;
    }

    public int hashCode() {
        return this.pip.hashCode() + h5a.D(this.seekBackward, h5a.D(this.seekForward, h5a.D(this.forceRotation, h5a.D(this.settings, h5a.D(this.captions, h5a.D(this.replay, h5a.D(this.fullScreen, h5a.D(this.next, h5a.D(this.previous, h5a.D(this.playPause, h5a.D(this.like, h5a.D(this.share, h5a.D(this.exit, this.mute.hashCode() * 31)))))))))))));
    }

    public final void setCaptions(@NotNull BlazeVideosPlayerButtonStyle blazeVideosPlayerButtonStyle) {
        blazeVideosPlayerButtonStyle.getClass();
        this.captions = blazeVideosPlayerButtonStyle;
    }

    public void setExit(@NotNull BlazeVideosPlayerButtonStyle blazeVideosPlayerButtonStyle) {
        blazeVideosPlayerButtonStyle.getClass();
        this.exit = blazeVideosPlayerButtonStyle;
    }

    public final void setForceRotation(@NotNull BlazeVideosPlayerButtonStyle blazeVideosPlayerButtonStyle) {
        blazeVideosPlayerButtonStyle.getClass();
        this.forceRotation = blazeVideosPlayerButtonStyle;
    }

    public final void setFullScreen(@NotNull BlazeVideosPlayerButtonStyle blazeVideosPlayerButtonStyle) {
        blazeVideosPlayerButtonStyle.getClass();
        this.fullScreen = blazeVideosPlayerButtonStyle;
    }

    public final void setLike(@NotNull BlazeVideosPlayerButtonStyle blazeVideosPlayerButtonStyle) {
        blazeVideosPlayerButtonStyle.getClass();
        this.like = blazeVideosPlayerButtonStyle;
    }

    public void setMute(@NotNull BlazeVideosPlayerButtonStyle blazeVideosPlayerButtonStyle) {
        blazeVideosPlayerButtonStyle.getClass();
        this.mute = blazeVideosPlayerButtonStyle;
    }

    public final void setNext(@NotNull BlazeVideosPlayerButtonStyle blazeVideosPlayerButtonStyle) {
        blazeVideosPlayerButtonStyle.getClass();
        this.next = blazeVideosPlayerButtonStyle;
    }

    public final void setPip(@NotNull BlazeVideosPlayerButtonStyle blazeVideosPlayerButtonStyle) {
        blazeVideosPlayerButtonStyle.getClass();
        this.pip = blazeVideosPlayerButtonStyle;
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

    public final void setSeekBackward(@NotNull BlazeVideosPlayerButtonStyle blazeVideosPlayerButtonStyle) {
        blazeVideosPlayerButtonStyle.getClass();
        this.seekBackward = blazeVideosPlayerButtonStyle;
    }

    public final void setSeekForward(@NotNull BlazeVideosPlayerButtonStyle blazeVideosPlayerButtonStyle) {
        blazeVideosPlayerButtonStyle.getClass();
        this.seekForward = blazeVideosPlayerButtonStyle;
    }

    public final void setSettings$blazesdk_release(@NotNull BlazeVideosPlayerButtonStyle blazeVideosPlayerButtonStyle) {
        blazeVideosPlayerButtonStyle.getClass();
        this.settings = blazeVideosPlayerButtonStyle;
    }

    public void setShare(@NotNull BlazeVideosPlayerButtonStyle blazeVideosPlayerButtonStyle) {
        blazeVideosPlayerButtonStyle.getClass();
        this.share = blazeVideosPlayerButtonStyle;
    }

    @NotNull
    public String toString() {
        return "BlazeVideosPlayerButtonsStyle(mute=" + this.mute + ", exit=" + this.exit + ", share=" + this.share + ", like=" + this.like + ", playPause=" + this.playPause + ", previous=" + this.previous + ", next=" + this.next + ", fullScreen=" + this.fullScreen + ", replay=" + this.replay + ", captions=" + this.captions + ", settings=" + this.settings + ", forceRotation=" + this.forceRotation + ", seekForward=" + this.seekForward + ", seekBackward=" + this.seekBackward + ", pip=" + this.pip + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        this.mute.writeToParcel(dest, flags);
        this.exit.writeToParcel(dest, flags);
        this.share.writeToParcel(dest, flags);
        this.like.writeToParcel(dest, flags);
        this.playPause.writeToParcel(dest, flags);
        this.previous.writeToParcel(dest, flags);
        this.next.writeToParcel(dest, flags);
        this.fullScreen.writeToParcel(dest, flags);
        this.replay.writeToParcel(dest, flags);
        this.captions.writeToParcel(dest, flags);
        this.settings.writeToParcel(dest, flags);
        this.forceRotation.writeToParcel(dest, flags);
        this.seekForward.writeToParcel(dest, flags);
        this.seekBackward.writeToParcel(dest, flags);
        this.pip.writeToParcel(dest, flags);
    }

    @Override // com.blaze.blazesdk.style.players.IPlayerItemButtonsStyle
    @NotNull
    public BlazeVideosPlayerButtonStyle getExit() {
        return this.exit;
    }

    @Override // com.blaze.blazesdk.style.players.IPlayerItemButtonsStyle
    @NotNull
    public BlazeVideosPlayerButtonStyle getMute() {
        return this.mute;
    }

    @Override // com.blaze.blazesdk.style.players.IPlayerItemButtonsStyle
    @NotNull
    public BlazeVideosPlayerButtonStyle getShare() {
        return this.share;
    }
}
