package com.blaze.blazesdk.style.players.moments;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.core.app.NotificationCompat;
import com.blaze.blazesdk.style.players.IPlayerCustomActionButton;
import com.blaze.blazesdk.style.players.IPlayerCustomStackButton;
import com.blaze.blazesdk.style.players.IPlayerItemButtonsStyle;
import com.blaze.blazesdk.utils.BlazeParcelable;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import defpackage.dmi;
import defpackage.fc6;
import defpackage.k13;
import defpackage.k1m;
import defpackage.km5;
import defpackage.lnb;
import defpackage.ogj;
import defpackage.vs1;
import defpackage.w4m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001dB\u007f\b\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u000f¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u001a\u001a\u00020\u00192\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00120\u000f¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001d\u001a\u00020\u00192\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f¢\u0006\u0004\b\u001d\u0010\u001bJ\u001d\u0010\"\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020 ¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b(\u0010'J\u0010\u0010)\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b)\u0010'J\u0010\u0010*\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b*\u0010'J\u0010\u0010+\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b+\u0010'J\u0010\u0010,\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b,\u0010'J\u0010\u0010-\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b-\u0010'J\u0010\u0010.\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b.\u0010'J\u0010\u0010/\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b/\u0010'J\u009a\u0001\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000fHÆ\u0001¢\u0006\u0004\b0\u00101J\u0010\u00103\u001a\u000202HÖ\u0001¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020 HÖ\u0001¢\u0006\u0004\b5\u0010%J\u001a\u00108\u001a\u0002072\b\u00106\u001a\u0004\u0018\u00010\u0003HÖ\u0003¢\u0006\u0004\b8\u00109J4\u0010=\u001a\u00020\u0019\"\n\b\u0000\u0010:*\u0004\u0018\u00010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u000f2\f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00030;H\u0096\u0001¢\u0006\u0004\b=\u0010>J\u001a\u0010@\u001a\u00020\u0019*\b\u0012\u0004\u0012\u00020?0\u000fH\u0096\u0001¢\u0006\u0004\b@\u0010\u001bJ:\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\"\n\b\u0000\u0010:*\u0004\u0018\u00010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u000f2\f\u0010A\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0096\u0001¢\u0006\u0004\bB\u0010CJF\u0010H\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\"\n\b\u0000\u0010:*\u0004\u0018\u00010\u00032\f\u0010D\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2\f\u0010E\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2\u0006\u0010G\u001a\u00020FH\u0096\u0001¢\u0006\u0004\bH\u0010IJ\u0016\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00040\u000fHÂ\u0003¢\u0006\u0004\bJ\u0010\u0017J\u0016\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00040\u000fHÂ\u0003¢\u0006\u0004\bK\u0010\u0017J\u0016\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00120\u000fHÂ\u0003¢\u0006\u0004\bL\u0010\u0017R\"\u0010\u0006\u001a\u00020\u00058\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010M\u001a\u0004\bN\u0010'\"\u0004\bO\u0010PR\"\u0010\u0007\u001a\u00020\u00058\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010M\u001a\u0004\bQ\u0010'\"\u0004\bR\u0010PR\"\u0010\b\u001a\u00020\u00058\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\b\u0010M\u001a\u0004\bS\u0010'\"\u0004\bT\u0010PR\"\u0010\t\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010M\u001a\u0004\bU\u0010'\"\u0004\bV\u0010PR\"\u0010\n\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010M\u001a\u0004\bW\u0010'\"\u0004\bX\u0010PR\"\u0010\u000b\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010M\u001a\u0004\bY\u0010'\"\u0004\bZ\u0010PR\"\u0010\f\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010M\u001a\u0004\b[\u0010'\"\u0004\b\\\u0010PR\"\u0010\r\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010M\u001a\u0004\b]\u0010'\"\u0004\b^\u0010PR\"\u0010\u000e\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010M\u001a\u0004\b_\u0010'\"\u0004\b`\u0010PR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010aR\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010aR\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010aR\u001a\u0010c\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bb\u0010\u0017¨\u0006e"}, d2 = {"Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerButtonsStyle;", "Lcom/blaze/blazesdk/style/players/IPlayerItemButtonsStyle;", "Lcom/blaze/blazesdk/utils/BlazeParcelable;", "", "Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerButtonsStyle$BottomStackButtons;", "Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerButtonStyle;", CampaignEx.JSON_NATIVE_VIDEO_MUTE, "exit", "share", "like", "play", "captions", "seekForward", "seekBackward", "search", "", "defaultBottomStackOrder", "bottomStackOrder", "Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerCustomActionButton;", "bottomStackCustomActionButtons", "<init>", "(Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerButtonStyle;Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerButtonStyle;Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerButtonStyle;Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerButtonStyle;Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerButtonStyle;Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerButtonStyle;Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerButtonStyle;Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerButtonStyle;Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerButtonStyle;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getBottomStackCustomActionButtons", "()Ljava/util/List;", "customActionButtons", "", "setBottomStackCustomActionButtons", "(Ljava/util/List;)V", "customOrder", "setBottomStackOrder", "Landroid/os/Parcel;", "dest", "", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerButtonStyle;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerButtonStyle;Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerButtonStyle;Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerButtonStyle;Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerButtonStyle;Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerButtonStyle;Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerButtonStyle;Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerButtonStyle;Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerButtonStyle;Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerButtonStyle;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerButtonsStyle;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "StackElement", "Lkotlin/Function0;", "lazyErrMessage", "validateNoDuplications", "(Ljava/util/List;Lkotlin/jvm/functions/Function0;)V", "Lcom/blaze/blazesdk/style/players/IPlayerCustomActionButton;", "validateUserInput", "defaultOrder", "mergeWithDefaultOrder", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "existingOrderStack", "allCustomStackButtons", "Lw4m;", "missingCustomButtonsInsertionsType", "getButtonsStackOrderMergedWithMissingCustomActionButtons", "(Ljava/util/List;Ljava/util/List;Lw4m;)Ljava/util/List;", "component10", "component11", "component12", "Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerButtonStyle;", "getMute", "setMute", "(Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerButtonStyle;)V", "getExit", "setExit", "getShare", "setShare", "getLike", "setLike", "getPlay", "setPlay", "getCaptions", "setCaptions", "getSeekForward", "setSeekForward", "getSeekBackward", "setSeekBackward", "getSearch", "setSearch", "Ljava/util/List;", "getBottomStackOrderMergedWithMissingCustomActionButtons$blazesdk_release", "bottomStackOrderMergedWithMissingCustomActionButtons", "BottomStackButtons", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BlazeMomentsPlayerButtonsStyle implements IPlayerItemButtonsStyle, BlazeParcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<BlazeMomentsPlayerButtonsStyle> CREATOR = new a();
    private final /* synthetic */ k1m $$delegate_0;

    @NotNull
    private List<BlazeMomentsPlayerCustomActionButton> bottomStackCustomActionButtons;

    @NotNull
    private List<? extends BottomStackButtons> bottomStackOrder;

    @NotNull
    private BlazeMomentsPlayerButtonStyle captions;

    @NotNull
    private final List<BottomStackButtons> defaultBottomStackOrder;

    @NotNull
    private BlazeMomentsPlayerButtonStyle exit;

    @NotNull
    private BlazeMomentsPlayerButtonStyle like;

    @NotNull
    private BlazeMomentsPlayerButtonStyle mute;

    @NotNull
    private BlazeMomentsPlayerButtonStyle play;

    @NotNull
    private BlazeMomentsPlayerButtonStyle search;

    @NotNull
    private BlazeMomentsPlayerButtonStyle seekBackward;

    @NotNull
    private BlazeMomentsPlayerButtonStyle seekForward;

    @NotNull
    private BlazeMomentsPlayerButtonStyle share;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Keep
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0004\b\t\n\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerButtonsStyle$BottomStackButtons;", "Lcom/blaze/blazesdk/utils/BlazeParcelable;", "Companion", "Like", "Share", "Captions", "Custom", "com/blaze/blazesdk/style/players/moments/a", "Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerButtonsStyle$BottomStackButtons$Captions;", "Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerButtonsStyle$BottomStackButtons$Custom;", "Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerButtonsStyle$BottomStackButtons$Like;", "Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerButtonsStyle$BottomStackButtons$Share;", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface BottomStackButtons extends BlazeParcelable {

        @NotNull
        public static final com.blaze.blazesdk.style.players.moments.a Companion = com.blaze.blazesdk.style.players.moments.a.a;

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Keep
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, d2 = {"Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerButtonsStyle$BottomStackButtons$Captions;", "Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerButtonsStyle$BottomStackButtons;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Captions implements BottomStackButtons {
            public static final int $stable = 0;

            @NotNull
            public static final Captions INSTANCE = new Captions();

            @NotNull
            public static final Parcelable.Creator<Captions> CREATOR = new a();

            /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    parcel.readInt();
                    return Captions.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Captions[i];
                }
            }

            private Captions() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof Captions);
            }

            public int hashCode() {
                return 2135461564;
            }

            @NotNull
            public String toString() {
                return "Captions";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                dest.getClass();
                dest.writeInt(1);
            }
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Keep
        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\fR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0018"}, d2 = {"Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerButtonsStyle$BottomStackButtons$Custom;", "Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerButtonsStyle$BottomStackButtons;", "Lcom/blaze/blazesdk/style/players/IPlayerCustomStackButton;", "id", "", "<init>", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Custom implements BottomStackButtons, IPlayerCustomStackButton {
            public static final int $stable = 0;

            @NotNull
            public static final Parcelable.Creator<Custom> CREATOR = new a();

            @NotNull
            private final String id;

            /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return new Custom(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Custom[i];
                }
            }

            public Custom(@NotNull String str) {
                str.getClass();
                this.id = str;
            }

            public static /* synthetic */ Custom copy$default(Custom custom, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = custom.id;
                }
                return custom.copy(str);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getId() {
                return this.id;
            }

            @NotNull
            public final Custom copy(@NotNull String id) {
                id.getClass();
                return new Custom(id);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Custom) && Intrinsics.c(this.id, ((Custom) other).id);
            }

            @Override // com.blaze.blazesdk.style.players.IPlayerCustomStackButton
            @NotNull
            public String getId() {
                return this.id;
            }

            public int hashCode() {
                return this.id.hashCode();
            }

            @NotNull
            public String toString() {
                return lnb.q(new StringBuilder("Custom(id="), this.id, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                dest.getClass();
                dest.writeString(this.id);
            }
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Keep
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, d2 = {"Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerButtonsStyle$BottomStackButtons$Like;", "Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerButtonsStyle$BottomStackButtons;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Like implements BottomStackButtons {
            public static final int $stable = 0;

            @NotNull
            public static final Like INSTANCE = new Like();

            @NotNull
            public static final Parcelable.Creator<Like> CREATOR = new a();

            /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    parcel.readInt();
                    return Like.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Like[i];
                }
            }

            private Like() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof Like);
            }

            public int hashCode() {
                return 786213510;
            }

            @NotNull
            public String toString() {
                return "Like";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                dest.getClass();
                dest.writeInt(1);
            }
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Keep
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, d2 = {"Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerButtonsStyle$BottomStackButtons$Share;", "Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerButtonsStyle$BottomStackButtons;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Share implements BottomStackButtons {
            public static final int $stable = 0;

            @NotNull
            public static final Share INSTANCE = new Share();

            @NotNull
            public static final Parcelable.Creator<Share> CREATOR = new a();

            /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    parcel.readInt();
                    return Share.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Share[i];
                }
            }

            private Share() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof Share);
            }

            public int hashCode() {
                return -1390759216;
            }

            @NotNull
            public String toString() {
                return "Share";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                dest.getClass();
                dest.writeInt(1);
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            Parcelable.Creator<BlazeMomentsPlayerButtonStyle> creator = BlazeMomentsPlayerButtonStyle.CREATOR;
            BlazeMomentsPlayerButtonStyle createFromParcel = creator.createFromParcel(parcel);
            BlazeMomentsPlayerButtonStyle createFromParcel2 = creator.createFromParcel(parcel);
            BlazeMomentsPlayerButtonStyle createFromParcel3 = creator.createFromParcel(parcel);
            BlazeMomentsPlayerButtonStyle createFromParcel4 = creator.createFromParcel(parcel);
            BlazeMomentsPlayerButtonStyle createFromParcel5 = creator.createFromParcel(parcel);
            BlazeMomentsPlayerButtonStyle createFromParcel6 = creator.createFromParcel(parcel);
            BlazeMomentsPlayerButtonStyle createFromParcel7 = creator.createFromParcel(parcel);
            BlazeMomentsPlayerButtonStyle createFromParcel8 = creator.createFromParcel(parcel);
            BlazeMomentsPlayerButtonStyle createFromParcel9 = creator.createFromParcel(parcel);
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(parcel.readParcelable(BlazeMomentsPlayerButtonsStyle.class.getClassLoader()));
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            for (int i2 = 0; i2 != readInt2; i2++) {
                arrayList2.add(parcel.readParcelable(BlazeMomentsPlayerButtonsStyle.class.getClassLoader()));
            }
            int readInt3 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(readInt3);
            for (int i3 = 0; i3 != readInt3; i3++) {
                arrayList3.add(BlazeMomentsPlayerCustomActionButton.CREATOR.createFromParcel(parcel));
            }
            return new BlazeMomentsPlayerButtonsStyle(createFromParcel, createFromParcel2, createFromParcel3, createFromParcel4, createFromParcel5, createFromParcel6, createFromParcel7, createFromParcel8, createFromParcel9, arrayList, arrayList2, arrayList3);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BlazeMomentsPlayerButtonsStyle[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BlazeMomentsPlayerButtonsStyle(@NotNull BlazeMomentsPlayerButtonStyle blazeMomentsPlayerButtonStyle, @NotNull BlazeMomentsPlayerButtonStyle blazeMomentsPlayerButtonStyle2, @NotNull BlazeMomentsPlayerButtonStyle blazeMomentsPlayerButtonStyle3, @NotNull BlazeMomentsPlayerButtonStyle blazeMomentsPlayerButtonStyle4, @NotNull BlazeMomentsPlayerButtonStyle blazeMomentsPlayerButtonStyle5, @NotNull BlazeMomentsPlayerButtonStyle blazeMomentsPlayerButtonStyle6, @NotNull BlazeMomentsPlayerButtonStyle blazeMomentsPlayerButtonStyle7, @NotNull BlazeMomentsPlayerButtonStyle blazeMomentsPlayerButtonStyle8, @NotNull BlazeMomentsPlayerButtonStyle blazeMomentsPlayerButtonStyle9, @NotNull List<? extends BottomStackButtons> list, @NotNull List<? extends BottomStackButtons> list2, @NotNull List<BlazeMomentsPlayerCustomActionButton> list3) {
        blazeMomentsPlayerButtonStyle.getClass();
        blazeMomentsPlayerButtonStyle2.getClass();
        blazeMomentsPlayerButtonStyle3.getClass();
        blazeMomentsPlayerButtonStyle4.getClass();
        blazeMomentsPlayerButtonStyle5.getClass();
        blazeMomentsPlayerButtonStyle6.getClass();
        blazeMomentsPlayerButtonStyle7.getClass();
        blazeMomentsPlayerButtonStyle8.getClass();
        blazeMomentsPlayerButtonStyle9.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.$$delegate_0 = new k1m();
        this.mute = blazeMomentsPlayerButtonStyle;
        this.exit = blazeMomentsPlayerButtonStyle2;
        this.share = blazeMomentsPlayerButtonStyle3;
        this.like = blazeMomentsPlayerButtonStyle4;
        this.play = blazeMomentsPlayerButtonStyle5;
        this.captions = blazeMomentsPlayerButtonStyle6;
        this.seekForward = blazeMomentsPlayerButtonStyle7;
        this.seekBackward = blazeMomentsPlayerButtonStyle8;
        this.search = blazeMomentsPlayerButtonStyle9;
        this.defaultBottomStackOrder = list;
        this.bottomStackOrder = list2;
        this.bottomStackCustomActionButtons = list3;
        validateNoDuplications(list, new vs1(14));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object _init_$lambda$0() {
        return "Moments default bottom stack order cannot contain duplicate buttons.";
    }

    private final List<BottomStackButtons> component10() {
        return this.defaultBottomStackOrder;
    }

    private final List<BottomStackButtons> component11() {
        return this.bottomStackOrder;
    }

    private final List<BlazeMomentsPlayerCustomActionButton> component12() {
        return this.bottomStackCustomActionButtons;
    }

    public static /* synthetic */ BlazeMomentsPlayerButtonsStyle copy$default(BlazeMomentsPlayerButtonsStyle blazeMomentsPlayerButtonsStyle, BlazeMomentsPlayerButtonStyle blazeMomentsPlayerButtonStyle, BlazeMomentsPlayerButtonStyle blazeMomentsPlayerButtonStyle2, BlazeMomentsPlayerButtonStyle blazeMomentsPlayerButtonStyle3, BlazeMomentsPlayerButtonStyle blazeMomentsPlayerButtonStyle4, BlazeMomentsPlayerButtonStyle blazeMomentsPlayerButtonStyle5, BlazeMomentsPlayerButtonStyle blazeMomentsPlayerButtonStyle6, BlazeMomentsPlayerButtonStyle blazeMomentsPlayerButtonStyle7, BlazeMomentsPlayerButtonStyle blazeMomentsPlayerButtonStyle8, BlazeMomentsPlayerButtonStyle blazeMomentsPlayerButtonStyle9, List list, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            blazeMomentsPlayerButtonStyle = blazeMomentsPlayerButtonsStyle.mute;
        }
        if ((i & 2) != 0) {
            blazeMomentsPlayerButtonStyle2 = blazeMomentsPlayerButtonsStyle.exit;
        }
        if ((i & 4) != 0) {
            blazeMomentsPlayerButtonStyle3 = blazeMomentsPlayerButtonsStyle.share;
        }
        if ((i & 8) != 0) {
            blazeMomentsPlayerButtonStyle4 = blazeMomentsPlayerButtonsStyle.like;
        }
        if ((i & 16) != 0) {
            blazeMomentsPlayerButtonStyle5 = blazeMomentsPlayerButtonsStyle.play;
        }
        if ((i & 32) != 0) {
            blazeMomentsPlayerButtonStyle6 = blazeMomentsPlayerButtonsStyle.captions;
        }
        if ((i & 64) != 0) {
            blazeMomentsPlayerButtonStyle7 = blazeMomentsPlayerButtonsStyle.seekForward;
        }
        if ((i & 128) != 0) {
            blazeMomentsPlayerButtonStyle8 = blazeMomentsPlayerButtonsStyle.seekBackward;
        }
        if ((i & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            blazeMomentsPlayerButtonStyle9 = blazeMomentsPlayerButtonsStyle.search;
        }
        if ((i & 512) != 0) {
            list = blazeMomentsPlayerButtonsStyle.defaultBottomStackOrder;
        }
        if ((i & 1024) != 0) {
            list2 = blazeMomentsPlayerButtonsStyle.bottomStackOrder;
        }
        if ((i & com.ironsource.mediationsdk.metadata.a.o) != 0) {
            list3 = blazeMomentsPlayerButtonsStyle.bottomStackCustomActionButtons;
        }
        List list4 = list2;
        List list5 = list3;
        BlazeMomentsPlayerButtonStyle blazeMomentsPlayerButtonStyle10 = blazeMomentsPlayerButtonStyle9;
        List list6 = list;
        BlazeMomentsPlayerButtonStyle blazeMomentsPlayerButtonStyle11 = blazeMomentsPlayerButtonStyle7;
        BlazeMomentsPlayerButtonStyle blazeMomentsPlayerButtonStyle12 = blazeMomentsPlayerButtonStyle8;
        BlazeMomentsPlayerButtonStyle blazeMomentsPlayerButtonStyle13 = blazeMomentsPlayerButtonStyle5;
        BlazeMomentsPlayerButtonStyle blazeMomentsPlayerButtonStyle14 = blazeMomentsPlayerButtonStyle6;
        return blazeMomentsPlayerButtonsStyle.copy(blazeMomentsPlayerButtonStyle, blazeMomentsPlayerButtonStyle2, blazeMomentsPlayerButtonStyle3, blazeMomentsPlayerButtonStyle4, blazeMomentsPlayerButtonStyle13, blazeMomentsPlayerButtonStyle14, blazeMomentsPlayerButtonStyle11, blazeMomentsPlayerButtonStyle12, blazeMomentsPlayerButtonStyle10, list6, list4, list5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object setBottomStackOrder$lambda$1() {
        return "Moments custom bottom stack order cannot contain duplicated elements.";
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final BlazeMomentsPlayerButtonStyle getMute() {
        return this.mute;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final BlazeMomentsPlayerButtonStyle getExit() {
        return this.exit;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final BlazeMomentsPlayerButtonStyle getShare() {
        return this.share;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final BlazeMomentsPlayerButtonStyle getLike() {
        return this.like;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final BlazeMomentsPlayerButtonStyle getPlay() {
        return this.play;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final BlazeMomentsPlayerButtonStyle getCaptions() {
        return this.captions;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final BlazeMomentsPlayerButtonStyle getSeekForward() {
        return this.seekForward;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final BlazeMomentsPlayerButtonStyle getSeekBackward() {
        return this.seekBackward;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final BlazeMomentsPlayerButtonStyle getSearch() {
        return this.search;
    }

    @NotNull
    public final BlazeMomentsPlayerButtonsStyle copy(@NotNull BlazeMomentsPlayerButtonStyle mute, @NotNull BlazeMomentsPlayerButtonStyle exit, @NotNull BlazeMomentsPlayerButtonStyle share, @NotNull BlazeMomentsPlayerButtonStyle like, @NotNull BlazeMomentsPlayerButtonStyle play, @NotNull BlazeMomentsPlayerButtonStyle captions, @NotNull BlazeMomentsPlayerButtonStyle seekForward, @NotNull BlazeMomentsPlayerButtonStyle seekBackward, @NotNull BlazeMomentsPlayerButtonStyle search, @NotNull List<? extends BottomStackButtons> defaultBottomStackOrder, @NotNull List<? extends BottomStackButtons> bottomStackOrder, @NotNull List<BlazeMomentsPlayerCustomActionButton> bottomStackCustomActionButtons) {
        mute.getClass();
        exit.getClass();
        share.getClass();
        like.getClass();
        play.getClass();
        captions.getClass();
        seekForward.getClass();
        seekBackward.getClass();
        search.getClass();
        defaultBottomStackOrder.getClass();
        bottomStackOrder.getClass();
        bottomStackCustomActionButtons.getClass();
        return new BlazeMomentsPlayerButtonsStyle(mute, exit, share, like, play, captions, seekForward, seekBackward, search, defaultBottomStackOrder, bottomStackOrder, bottomStackCustomActionButtons);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlazeMomentsPlayerButtonsStyle)) {
            return false;
        }
        BlazeMomentsPlayerButtonsStyle blazeMomentsPlayerButtonsStyle = (BlazeMomentsPlayerButtonsStyle) other;
        return Intrinsics.c(this.mute, blazeMomentsPlayerButtonsStyle.mute) && Intrinsics.c(this.exit, blazeMomentsPlayerButtonsStyle.exit) && Intrinsics.c(this.share, blazeMomentsPlayerButtonsStyle.share) && Intrinsics.c(this.like, blazeMomentsPlayerButtonsStyle.like) && Intrinsics.c(this.play, blazeMomentsPlayerButtonsStyle.play) && Intrinsics.c(this.captions, blazeMomentsPlayerButtonsStyle.captions) && Intrinsics.c(this.seekForward, blazeMomentsPlayerButtonsStyle.seekForward) && Intrinsics.c(this.seekBackward, blazeMomentsPlayerButtonsStyle.seekBackward) && Intrinsics.c(this.search, blazeMomentsPlayerButtonsStyle.search) && Intrinsics.c(this.defaultBottomStackOrder, blazeMomentsPlayerButtonsStyle.defaultBottomStackOrder) && Intrinsics.c(this.bottomStackOrder, blazeMomentsPlayerButtonsStyle.bottomStackOrder) && Intrinsics.c(this.bottomStackCustomActionButtons, blazeMomentsPlayerButtonsStyle.bottomStackCustomActionButtons);
    }

    @NotNull
    public final List<BlazeMomentsPlayerCustomActionButton> getBottomStackCustomActionButtons() {
        return this.bottomStackCustomActionButtons;
    }

    @NotNull
    public final List<BottomStackButtons> getBottomStackOrderMergedWithMissingCustomActionButtons$blazesdk_release() {
        List<? extends BottomStackButtons> list = this.bottomStackOrder;
        List<BlazeMomentsPlayerCustomActionButton> list2 = this.bottomStackCustomActionButtons;
        ArrayList arrayList = new ArrayList(k13.r(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((BlazeMomentsPlayerCustomActionButton) it.next()).asPlayerCustomStackButton());
        }
        return getButtonsStackOrderMergedWithMissingCustomActionButtons(list, arrayList, w4m.TOP);
    }

    @NotNull
    public <StackElement> List<StackElement> getButtonsStackOrderMergedWithMissingCustomActionButtons(@NotNull List<? extends StackElement> existingOrderStack, @NotNull List<? extends StackElement> allCustomStackButtons, @NotNull w4m missingCustomButtonsInsertionsType) {
        existingOrderStack.getClass();
        allCustomStackButtons.getClass();
        missingCustomButtonsInsertionsType.getClass();
        this.$$delegate_0.getClass();
        return k1m.a(existingOrderStack, allCustomStackButtons, missingCustomButtonsInsertionsType);
    }

    @NotNull
    public final BlazeMomentsPlayerButtonStyle getCaptions() {
        return this.captions;
    }

    @NotNull
    public final BlazeMomentsPlayerButtonStyle getLike() {
        return this.like;
    }

    @NotNull
    public final BlazeMomentsPlayerButtonStyle getPlay() {
        return this.play;
    }

    @NotNull
    public final BlazeMomentsPlayerButtonStyle getSearch() {
        return this.search;
    }

    @NotNull
    public final BlazeMomentsPlayerButtonStyle getSeekBackward() {
        return this.seekBackward;
    }

    @NotNull
    public final BlazeMomentsPlayerButtonStyle getSeekForward() {
        return this.seekForward;
    }

    public int hashCode() {
        return this.bottomStackCustomActionButtons.hashCode() + dmi.d(dmi.d((this.search.hashCode() + ((this.seekBackward.hashCode() + ((this.seekForward.hashCode() + ((this.captions.hashCode() + ((this.play.hashCode() + ((this.like.hashCode() + ((this.share.hashCode() + ((this.exit.hashCode() + (this.mute.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.defaultBottomStackOrder), 31, this.bottomStackOrder);
    }

    @NotNull
    public <StackElement> List<StackElement> mergeWithDefaultOrder(@NotNull List<? extends StackElement> list, @NotNull List<? extends StackElement> list2) {
        list.getClass();
        list2.getClass();
        this.$$delegate_0.getClass();
        ArrayList arrayList = new ArrayList(list);
        int i = 0;
        for (Object obj : list2) {
            int i2 = i + 1;
            if (i < 0) {
                b.q();
                throw null;
            }
            if (!arrayList.contains(obj)) {
                arrayList.add(i, obj);
            }
            i = i2;
        }
        return arrayList;
    }

    public final void setBottomStackCustomActionButtons(@NotNull List<BlazeMomentsPlayerCustomActionButton> customActionButtons) {
        customActionButtons.getClass();
        validateUserInput(customActionButtons);
        this.bottomStackCustomActionButtons = customActionButtons;
    }

    public final void setBottomStackOrder(@NotNull List<? extends BottomStackButtons> customOrder) {
        customOrder.getClass();
        validateNoDuplications(customOrder, new vs1(13));
        this.bottomStackOrder = mergeWithDefaultOrder(customOrder, this.defaultBottomStackOrder);
    }

    public final void setCaptions(@NotNull BlazeMomentsPlayerButtonStyle blazeMomentsPlayerButtonStyle) {
        blazeMomentsPlayerButtonStyle.getClass();
        this.captions = blazeMomentsPlayerButtonStyle;
    }

    public void setExit(@NotNull BlazeMomentsPlayerButtonStyle blazeMomentsPlayerButtonStyle) {
        blazeMomentsPlayerButtonStyle.getClass();
        this.exit = blazeMomentsPlayerButtonStyle;
    }

    public final void setLike(@NotNull BlazeMomentsPlayerButtonStyle blazeMomentsPlayerButtonStyle) {
        blazeMomentsPlayerButtonStyle.getClass();
        this.like = blazeMomentsPlayerButtonStyle;
    }

    public void setMute(@NotNull BlazeMomentsPlayerButtonStyle blazeMomentsPlayerButtonStyle) {
        blazeMomentsPlayerButtonStyle.getClass();
        this.mute = blazeMomentsPlayerButtonStyle;
    }

    public final void setPlay(@NotNull BlazeMomentsPlayerButtonStyle blazeMomentsPlayerButtonStyle) {
        blazeMomentsPlayerButtonStyle.getClass();
        this.play = blazeMomentsPlayerButtonStyle;
    }

    public final void setSearch(@NotNull BlazeMomentsPlayerButtonStyle blazeMomentsPlayerButtonStyle) {
        blazeMomentsPlayerButtonStyle.getClass();
        this.search = blazeMomentsPlayerButtonStyle;
    }

    public final void setSeekBackward(@NotNull BlazeMomentsPlayerButtonStyle blazeMomentsPlayerButtonStyle) {
        blazeMomentsPlayerButtonStyle.getClass();
        this.seekBackward = blazeMomentsPlayerButtonStyle;
    }

    public final void setSeekForward(@NotNull BlazeMomentsPlayerButtonStyle blazeMomentsPlayerButtonStyle) {
        blazeMomentsPlayerButtonStyle.getClass();
        this.seekForward = blazeMomentsPlayerButtonStyle;
    }

    public void setShare(@NotNull BlazeMomentsPlayerButtonStyle blazeMomentsPlayerButtonStyle) {
        blazeMomentsPlayerButtonStyle.getClass();
        this.share = blazeMomentsPlayerButtonStyle;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("BlazeMomentsPlayerButtonsStyle(mute=");
        sb.append(this.mute);
        sb.append(", exit=");
        sb.append(this.exit);
        sb.append(", share=");
        sb.append(this.share);
        sb.append(", like=");
        sb.append(this.like);
        sb.append(", play=");
        sb.append(this.play);
        sb.append(", captions=");
        sb.append(this.captions);
        sb.append(", seekForward=");
        sb.append(this.seekForward);
        sb.append(", seekBackward=");
        sb.append(this.seekBackward);
        sb.append(", search=");
        sb.append(this.search);
        sb.append(", defaultBottomStackOrder=");
        sb.append(this.defaultBottomStackOrder);
        sb.append(", bottomStackOrder=");
        sb.append(this.bottomStackOrder);
        sb.append(", bottomStackCustomActionButtons=");
        return fc6.p(sb, this.bottomStackCustomActionButtons, ')');
    }

    public <StackElement> void validateNoDuplications(@NotNull List<? extends StackElement> list, @NotNull Function0<? extends Object> function0) {
        list.getClass();
        function0.getClass();
        this.$$delegate_0.getClass();
        list.getClass();
        function0.getClass();
        list.getClass();
        if (CollectionsKt.W0(list).size() == list.size()) {
            return;
        }
        ogj.h(function0.invoke());
    }

    public void validateUserInput(@NotNull List<? extends IPlayerCustomActionButton> list) {
        list.getClass();
        this.$$delegate_0.getClass();
        k1m.b(list);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        this.mute.writeToParcel(dest, flags);
        this.exit.writeToParcel(dest, flags);
        this.share.writeToParcel(dest, flags);
        this.like.writeToParcel(dest, flags);
        this.play.writeToParcel(dest, flags);
        this.captions.writeToParcel(dest, flags);
        this.seekForward.writeToParcel(dest, flags);
        this.seekBackward.writeToParcel(dest, flags);
        this.search.writeToParcel(dest, flags);
        List<BottomStackButtons> list = this.defaultBottomStackOrder;
        dest.writeInt(list.size());
        Iterator<BottomStackButtons> it = list.iterator();
        while (it.hasNext()) {
            dest.writeParcelable(it.next(), flags);
        }
        List<? extends BottomStackButtons> list2 = this.bottomStackOrder;
        dest.writeInt(list2.size());
        Iterator<? extends BottomStackButtons> it2 = list2.iterator();
        while (it2.hasNext()) {
            dest.writeParcelable(it2.next(), flags);
        }
        List<BlazeMomentsPlayerCustomActionButton> list3 = this.bottomStackCustomActionButtons;
        dest.writeInt(list3.size());
        Iterator<BlazeMomentsPlayerCustomActionButton> it3 = list3.iterator();
        while (it3.hasNext()) {
            it3.next().writeToParcel(dest, flags);
        }
    }

    @Override // com.blaze.blazesdk.style.players.IPlayerItemButtonsStyle
    @NotNull
    public BlazeMomentsPlayerButtonStyle getExit() {
        return this.exit;
    }

    @Override // com.blaze.blazesdk.style.players.IPlayerItemButtonsStyle
    @NotNull
    public BlazeMomentsPlayerButtonStyle getMute() {
        return this.mute;
    }

    @Override // com.blaze.blazesdk.style.players.IPlayerItemButtonsStyle
    @NotNull
    public BlazeMomentsPlayerButtonStyle getShare() {
        return this.share;
    }

    public BlazeMomentsPlayerButtonsStyle(BlazeMomentsPlayerButtonStyle blazeMomentsPlayerButtonStyle, BlazeMomentsPlayerButtonStyle blazeMomentsPlayerButtonStyle2, BlazeMomentsPlayerButtonStyle blazeMomentsPlayerButtonStyle3, BlazeMomentsPlayerButtonStyle blazeMomentsPlayerButtonStyle4, BlazeMomentsPlayerButtonStyle blazeMomentsPlayerButtonStyle5, BlazeMomentsPlayerButtonStyle blazeMomentsPlayerButtonStyle6, BlazeMomentsPlayerButtonStyle blazeMomentsPlayerButtonStyle7, BlazeMomentsPlayerButtonStyle blazeMomentsPlayerButtonStyle8, BlazeMomentsPlayerButtonStyle blazeMomentsPlayerButtonStyle9, List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(blazeMomentsPlayerButtonStyle, blazeMomentsPlayerButtonStyle2, blazeMomentsPlayerButtonStyle3, blazeMomentsPlayerButtonStyle4, blazeMomentsPlayerButtonStyle5, blazeMomentsPlayerButtonStyle6, blazeMomentsPlayerButtonStyle7, blazeMomentsPlayerButtonStyle8, blazeMomentsPlayerButtonStyle9, list, (i & 1024) != 0 ? list : list2, (i & com.ironsource.mediationsdk.metadata.a.o) != 0 ? km5.a : list3);
    }
}
