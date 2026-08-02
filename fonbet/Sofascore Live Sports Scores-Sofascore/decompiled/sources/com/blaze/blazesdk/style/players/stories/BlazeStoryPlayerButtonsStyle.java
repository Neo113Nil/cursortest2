package com.blaze.blazesdk.style.players.stories;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
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
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001PBW\b\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\n\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\n¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0015\u001a\u00020\u00142\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\n¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0018\u001a\u00020\u00142\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\n¢\u0006\u0004\b\u0018\u0010\u0016J\u001d\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u001b¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0010\u0010$\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b$\u0010\"J\u0010\u0010%\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b%\u0010\"Jh\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\nHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010)\u001a\u00020(HÖ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b+\u0010 J\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010\u0003HÖ\u0003¢\u0006\u0004\b.\u0010/J4\u00103\u001a\u00020\u0014\"\n\b\u0000\u00100*\u0004\u0018\u00010\u0003*\b\u0012\u0004\u0012\u00028\u00000\n2\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u000301H\u0096\u0001¢\u0006\u0004\b3\u00104J\u001a\u00106\u001a\u00020\u0014*\b\u0012\u0004\u0012\u0002050\nH\u0096\u0001¢\u0006\u0004\b6\u0010\u0016J:\u00108\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\n\b\u0000\u00100*\u0004\u0018\u00010\u0003*\b\u0012\u0004\u0012\u00028\u00000\n2\f\u00107\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0096\u0001¢\u0006\u0004\b8\u00109JF\u0010>\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\n\b\u0000\u00100*\u0004\u0018\u00010\u00032\f\u0010:\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\f\u0010;\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010=\u001a\u00020<H\u0096\u0001¢\u0006\u0004\b>\u0010?J\u0016\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00040\nHÂ\u0003¢\u0006\u0004\b@\u0010\u0012J\u0016\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00040\nHÂ\u0003¢\u0006\u0004\bA\u0010\u0012J\u0016\u0010B\u001a\b\u0012\u0004\u0012\u00020\r0\nHÂ\u0003¢\u0006\u0004\bB\u0010\u0012R\"\u0010\u0006\u001a\u00020\u00058\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010C\u001a\u0004\bD\u0010\"\"\u0004\bE\u0010FR\"\u0010\u0007\u001a\u00020\u00058\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010C\u001a\u0004\bG\u0010\"\"\u0004\bH\u0010FR\"\u0010\b\u001a\u00020\u00058\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\b\u0010C\u001a\u0004\bI\u0010\"\"\u0004\bJ\u0010FR\"\u0010\t\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010C\u001a\u0004\bK\u0010\"\"\u0004\bL\u0010FR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010MR\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010MR\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010MR\u001a\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00040\n8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bN\u0010\u0012¨\u0006Q"}, d2 = {"Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerButtonsStyle;", "Lcom/blaze/blazesdk/style/players/IPlayerItemButtonsStyle;", "Lcom/blaze/blazesdk/utils/BlazeParcelable;", "", "Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerButtonsStyle$TopStackButtons;", "Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerButtonStyle;", CampaignEx.JSON_NATIVE_VIDEO_MUTE, "exit", "share", "captions", "", "defaultTopStackOrder", "topStackOrder", "Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerCustomActionButton;", "topStackCustomActionButtons", "<init>", "(Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerButtonStyle;Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerButtonStyle;Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerButtonStyle;Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerButtonStyle;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getTopStackCustomActionButtons", "()Ljava/util/List;", "customButtons", "", "setTopStackCustomActionButtons", "(Ljava/util/List;)V", "customOrder", "setTopStackOrder", "Landroid/os/Parcel;", "dest", "", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerButtonStyle;", "component2", "component3", "component4", "copy", "(Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerButtonStyle;Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerButtonStyle;Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerButtonStyle;Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerButtonStyle;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerButtonsStyle;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "StackElement", "Lkotlin/Function0;", "lazyErrMessage", "validateNoDuplications", "(Ljava/util/List;Lkotlin/jvm/functions/Function0;)V", "Lcom/blaze/blazesdk/style/players/IPlayerCustomActionButton;", "validateUserInput", "defaultOrder", "mergeWithDefaultOrder", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "existingOrderStack", "allCustomStackButtons", "Lw4m;", "missingCustomButtonsInsertionsType", "getButtonsStackOrderMergedWithMissingCustomActionButtons", "(Ljava/util/List;Ljava/util/List;Lw4m;)Ljava/util/List;", "component5", "component6", "component7", "Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerButtonStyle;", "getMute", "setMute", "(Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerButtonStyle;)V", "getExit", "setExit", "getShare", "setShare", "getCaptions", "setCaptions", "Ljava/util/List;", "getTopStackOrderMergedWithMissingCustomActionButtons$blazesdk_release", "topStackOrderMergedWithMissingCustomActionButtons", "TopStackButtons", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BlazeStoryPlayerButtonsStyle implements IPlayerItemButtonsStyle, BlazeParcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<BlazeStoryPlayerButtonsStyle> CREATOR = new a();
    private final /* synthetic */ k1m $$delegate_0;

    @NotNull
    private BlazeStoryPlayerButtonStyle captions;

    @NotNull
    private final List<TopStackButtons> defaultTopStackOrder;

    @NotNull
    private BlazeStoryPlayerButtonStyle exit;

    @NotNull
    private BlazeStoryPlayerButtonStyle mute;

    @NotNull
    private BlazeStoryPlayerButtonStyle share;

    @NotNull
    private List<BlazeStoryPlayerCustomActionButton> topStackCustomActionButtons;

    @NotNull
    private List<? extends TopStackButtons> topStackOrder;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Keep
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0005\t\n\u000b\f\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerButtonsStyle$TopStackButtons;", "Lcom/blaze/blazesdk/utils/BlazeParcelable;", "Companion", "Exit", "Mute", "Share", "Captions", "Custom", "com/blaze/blazesdk/style/players/stories/a", "Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerButtonsStyle$TopStackButtons$Captions;", "Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerButtonsStyle$TopStackButtons$Custom;", "Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerButtonsStyle$TopStackButtons$Exit;", "Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerButtonsStyle$TopStackButtons$Mute;", "Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerButtonsStyle$TopStackButtons$Share;", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface TopStackButtons extends BlazeParcelable {

        @NotNull
        public static final com.blaze.blazesdk.style.players.stories.a Companion = com.blaze.blazesdk.style.players.stories.a.a;

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Keep
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, d2 = {"Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerButtonsStyle$TopStackButtons$Captions;", "Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerButtonsStyle$TopStackButtons;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Captions implements TopStackButtons {
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
                return 2072496582;
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
        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\fR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0018"}, d2 = {"Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerButtonsStyle$TopStackButtons$Custom;", "Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerButtonsStyle$TopStackButtons;", "Lcom/blaze/blazesdk/style/players/IPlayerCustomStackButton;", "id", "", "<init>", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Custom implements TopStackButtons, IPlayerCustomStackButton {
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
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, d2 = {"Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerButtonsStyle$TopStackButtons$Exit;", "Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerButtonsStyle$TopStackButtons;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Exit implements TopStackButtons {
            public static final int $stable = 0;

            @NotNull
            public static final Exit INSTANCE = new Exit();

            @NotNull
            public static final Parcelable.Creator<Exit> CREATOR = new a();

            /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    parcel.readInt();
                    return Exit.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Exit[i];
                }
            }

            private Exit() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof Exit);
            }

            public int hashCode() {
                return 3408919;
            }

            @NotNull
            public String toString() {
                return "Exit";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                dest.getClass();
                dest.writeInt(1);
            }
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Keep
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, d2 = {"Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerButtonsStyle$TopStackButtons$Mute;", "Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerButtonsStyle$TopStackButtons;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Mute implements TopStackButtons {
            public static final int $stable = 0;

            @NotNull
            public static final Mute INSTANCE = new Mute();

            @NotNull
            public static final Parcelable.Creator<Mute> CREATOR = new a();

            /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    parcel.readInt();
                    return Mute.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Mute[i];
                }
            }

            private Mute() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof Mute);
            }

            public int hashCode() {
                return 3644690;
            }

            @NotNull
            public String toString() {
                return "Mute";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                dest.getClass();
                dest.writeInt(1);
            }
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Keep
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, d2 = {"Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerButtonsStyle$TopStackButtons$Share;", "Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerButtonsStyle$TopStackButtons;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Share implements TopStackButtons {
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
                return 118121478;
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
            Parcelable.Creator<BlazeStoryPlayerButtonStyle> creator = BlazeStoryPlayerButtonStyle.CREATOR;
            BlazeStoryPlayerButtonStyle createFromParcel = creator.createFromParcel(parcel);
            BlazeStoryPlayerButtonStyle createFromParcel2 = creator.createFromParcel(parcel);
            BlazeStoryPlayerButtonStyle createFromParcel3 = creator.createFromParcel(parcel);
            BlazeStoryPlayerButtonStyle createFromParcel4 = creator.createFromParcel(parcel);
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(parcel.readParcelable(BlazeStoryPlayerButtonsStyle.class.getClassLoader()));
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            for (int i2 = 0; i2 != readInt2; i2++) {
                arrayList2.add(parcel.readParcelable(BlazeStoryPlayerButtonsStyle.class.getClassLoader()));
            }
            int readInt3 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(readInt3);
            for (int i3 = 0; i3 != readInt3; i3++) {
                arrayList3.add(BlazeStoryPlayerCustomActionButton.CREATOR.createFromParcel(parcel));
            }
            return new BlazeStoryPlayerButtonsStyle(createFromParcel, createFromParcel2, createFromParcel3, createFromParcel4, arrayList, arrayList2, arrayList3);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BlazeStoryPlayerButtonsStyle[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BlazeStoryPlayerButtonsStyle(@NotNull BlazeStoryPlayerButtonStyle blazeStoryPlayerButtonStyle, @NotNull BlazeStoryPlayerButtonStyle blazeStoryPlayerButtonStyle2, @NotNull BlazeStoryPlayerButtonStyle blazeStoryPlayerButtonStyle3, @NotNull BlazeStoryPlayerButtonStyle blazeStoryPlayerButtonStyle4, @NotNull List<? extends TopStackButtons> list, @NotNull List<? extends TopStackButtons> list2, @NotNull List<BlazeStoryPlayerCustomActionButton> list3) {
        blazeStoryPlayerButtonStyle.getClass();
        blazeStoryPlayerButtonStyle2.getClass();
        blazeStoryPlayerButtonStyle3.getClass();
        blazeStoryPlayerButtonStyle4.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.$$delegate_0 = new k1m();
        this.mute = blazeStoryPlayerButtonStyle;
        this.exit = blazeStoryPlayerButtonStyle2;
        this.share = blazeStoryPlayerButtonStyle3;
        this.captions = blazeStoryPlayerButtonStyle4;
        this.defaultTopStackOrder = list;
        this.topStackOrder = list2;
        this.topStackCustomActionButtons = list3;
        validateNoDuplications(list, new vs1(16));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object _init_$lambda$0() {
        return "Stories default top stack order cannot contain duplicate buttons.";
    }

    private final List<TopStackButtons> component5() {
        return this.defaultTopStackOrder;
    }

    private final List<TopStackButtons> component6() {
        return this.topStackOrder;
    }

    private final List<BlazeStoryPlayerCustomActionButton> component7() {
        return this.topStackCustomActionButtons;
    }

    public static /* synthetic */ BlazeStoryPlayerButtonsStyle copy$default(BlazeStoryPlayerButtonsStyle blazeStoryPlayerButtonsStyle, BlazeStoryPlayerButtonStyle blazeStoryPlayerButtonStyle, BlazeStoryPlayerButtonStyle blazeStoryPlayerButtonStyle2, BlazeStoryPlayerButtonStyle blazeStoryPlayerButtonStyle3, BlazeStoryPlayerButtonStyle blazeStoryPlayerButtonStyle4, List list, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            blazeStoryPlayerButtonStyle = blazeStoryPlayerButtonsStyle.mute;
        }
        if ((i & 2) != 0) {
            blazeStoryPlayerButtonStyle2 = blazeStoryPlayerButtonsStyle.exit;
        }
        if ((i & 4) != 0) {
            blazeStoryPlayerButtonStyle3 = blazeStoryPlayerButtonsStyle.share;
        }
        if ((i & 8) != 0) {
            blazeStoryPlayerButtonStyle4 = blazeStoryPlayerButtonsStyle.captions;
        }
        if ((i & 16) != 0) {
            list = blazeStoryPlayerButtonsStyle.defaultTopStackOrder;
        }
        if ((i & 32) != 0) {
            list2 = blazeStoryPlayerButtonsStyle.topStackOrder;
        }
        if ((i & 64) != 0) {
            list3 = blazeStoryPlayerButtonsStyle.topStackCustomActionButtons;
        }
        List list4 = list2;
        List list5 = list3;
        List list6 = list;
        BlazeStoryPlayerButtonStyle blazeStoryPlayerButtonStyle5 = blazeStoryPlayerButtonStyle3;
        return blazeStoryPlayerButtonsStyle.copy(blazeStoryPlayerButtonStyle, blazeStoryPlayerButtonStyle2, blazeStoryPlayerButtonStyle5, blazeStoryPlayerButtonStyle4, list6, list4, list5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object setTopStackOrder$lambda$1() {
        return "Stories custom top stack order cannot contain duplicated elements.";
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final BlazeStoryPlayerButtonStyle getMute() {
        return this.mute;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final BlazeStoryPlayerButtonStyle getExit() {
        return this.exit;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final BlazeStoryPlayerButtonStyle getShare() {
        return this.share;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final BlazeStoryPlayerButtonStyle getCaptions() {
        return this.captions;
    }

    @NotNull
    public final BlazeStoryPlayerButtonsStyle copy(@NotNull BlazeStoryPlayerButtonStyle mute, @NotNull BlazeStoryPlayerButtonStyle exit, @NotNull BlazeStoryPlayerButtonStyle share, @NotNull BlazeStoryPlayerButtonStyle captions, @NotNull List<? extends TopStackButtons> defaultTopStackOrder, @NotNull List<? extends TopStackButtons> topStackOrder, @NotNull List<BlazeStoryPlayerCustomActionButton> topStackCustomActionButtons) {
        mute.getClass();
        exit.getClass();
        share.getClass();
        captions.getClass();
        defaultTopStackOrder.getClass();
        topStackOrder.getClass();
        topStackCustomActionButtons.getClass();
        return new BlazeStoryPlayerButtonsStyle(mute, exit, share, captions, defaultTopStackOrder, topStackOrder, topStackCustomActionButtons);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlazeStoryPlayerButtonsStyle)) {
            return false;
        }
        BlazeStoryPlayerButtonsStyle blazeStoryPlayerButtonsStyle = (BlazeStoryPlayerButtonsStyle) other;
        return Intrinsics.c(this.mute, blazeStoryPlayerButtonsStyle.mute) && Intrinsics.c(this.exit, blazeStoryPlayerButtonsStyle.exit) && Intrinsics.c(this.share, blazeStoryPlayerButtonsStyle.share) && Intrinsics.c(this.captions, blazeStoryPlayerButtonsStyle.captions) && Intrinsics.c(this.defaultTopStackOrder, blazeStoryPlayerButtonsStyle.defaultTopStackOrder) && Intrinsics.c(this.topStackOrder, blazeStoryPlayerButtonsStyle.topStackOrder) && Intrinsics.c(this.topStackCustomActionButtons, blazeStoryPlayerButtonsStyle.topStackCustomActionButtons);
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
    public final BlazeStoryPlayerButtonStyle getCaptions() {
        return this.captions;
    }

    @NotNull
    public final List<BlazeStoryPlayerCustomActionButton> getTopStackCustomActionButtons() {
        return this.topStackCustomActionButtons;
    }

    @NotNull
    public final List<TopStackButtons> getTopStackOrderMergedWithMissingCustomActionButtons$blazesdk_release() {
        List<? extends TopStackButtons> list = this.topStackOrder;
        List<BlazeStoryPlayerCustomActionButton> list2 = this.topStackCustomActionButtons;
        ArrayList arrayList = new ArrayList(k13.r(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((BlazeStoryPlayerCustomActionButton) it.next()).asPlayerCustomStackButton());
        }
        return getButtonsStackOrderMergedWithMissingCustomActionButtons(list, arrayList, w4m.BOTTOM);
    }

    public int hashCode() {
        return this.topStackCustomActionButtons.hashCode() + dmi.d(dmi.d((this.captions.hashCode() + ((this.share.hashCode() + ((this.exit.hashCode() + (this.mute.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.defaultTopStackOrder), 31, this.topStackOrder);
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

    public final void setCaptions(@NotNull BlazeStoryPlayerButtonStyle blazeStoryPlayerButtonStyle) {
        blazeStoryPlayerButtonStyle.getClass();
        this.captions = blazeStoryPlayerButtonStyle;
    }

    public void setExit(@NotNull BlazeStoryPlayerButtonStyle blazeStoryPlayerButtonStyle) {
        blazeStoryPlayerButtonStyle.getClass();
        this.exit = blazeStoryPlayerButtonStyle;
    }

    public void setMute(@NotNull BlazeStoryPlayerButtonStyle blazeStoryPlayerButtonStyle) {
        blazeStoryPlayerButtonStyle.getClass();
        this.mute = blazeStoryPlayerButtonStyle;
    }

    public void setShare(@NotNull BlazeStoryPlayerButtonStyle blazeStoryPlayerButtonStyle) {
        blazeStoryPlayerButtonStyle.getClass();
        this.share = blazeStoryPlayerButtonStyle;
    }

    public final void setTopStackCustomActionButtons(@NotNull List<BlazeStoryPlayerCustomActionButton> customButtons) {
        customButtons.getClass();
        validateUserInput(customButtons);
        this.topStackCustomActionButtons = customButtons;
    }

    public final void setTopStackOrder(@NotNull List<? extends TopStackButtons> customOrder) {
        customOrder.getClass();
        validateNoDuplications(customOrder, new vs1(17));
        this.topStackOrder = mergeWithDefaultOrder(customOrder, this.defaultTopStackOrder);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("BlazeStoryPlayerButtonsStyle(mute=");
        sb.append(this.mute);
        sb.append(", exit=");
        sb.append(this.exit);
        sb.append(", share=");
        sb.append(this.share);
        sb.append(", captions=");
        sb.append(this.captions);
        sb.append(", defaultTopStackOrder=");
        sb.append(this.defaultTopStackOrder);
        sb.append(", topStackOrder=");
        sb.append(this.topStackOrder);
        sb.append(", topStackCustomActionButtons=");
        return fc6.p(sb, this.topStackCustomActionButtons, ')');
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
        this.captions.writeToParcel(dest, flags);
        List<TopStackButtons> list = this.defaultTopStackOrder;
        dest.writeInt(list.size());
        Iterator<TopStackButtons> it = list.iterator();
        while (it.hasNext()) {
            dest.writeParcelable(it.next(), flags);
        }
        List<? extends TopStackButtons> list2 = this.topStackOrder;
        dest.writeInt(list2.size());
        Iterator<? extends TopStackButtons> it2 = list2.iterator();
        while (it2.hasNext()) {
            dest.writeParcelable(it2.next(), flags);
        }
        List<BlazeStoryPlayerCustomActionButton> list3 = this.topStackCustomActionButtons;
        dest.writeInt(list3.size());
        Iterator<BlazeStoryPlayerCustomActionButton> it3 = list3.iterator();
        while (it3.hasNext()) {
            it3.next().writeToParcel(dest, flags);
        }
    }

    @Override // com.blaze.blazesdk.style.players.IPlayerItemButtonsStyle
    @NotNull
    public BlazeStoryPlayerButtonStyle getExit() {
        return this.exit;
    }

    @Override // com.blaze.blazesdk.style.players.IPlayerItemButtonsStyle
    @NotNull
    public BlazeStoryPlayerButtonStyle getMute() {
        return this.mute;
    }

    @Override // com.blaze.blazesdk.style.players.IPlayerItemButtonsStyle
    @NotNull
    public BlazeStoryPlayerButtonStyle getShare() {
        return this.share;
    }

    public BlazeStoryPlayerButtonsStyle(BlazeStoryPlayerButtonStyle blazeStoryPlayerButtonStyle, BlazeStoryPlayerButtonStyle blazeStoryPlayerButtonStyle2, BlazeStoryPlayerButtonStyle blazeStoryPlayerButtonStyle3, BlazeStoryPlayerButtonStyle blazeStoryPlayerButtonStyle4, List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(blazeStoryPlayerButtonStyle, blazeStoryPlayerButtonStyle2, blazeStoryPlayerButtonStyle3, blazeStoryPlayerButtonStyle4, list, (i & 32) != 0 ? list : list2, (i & 64) != 0 ? km5.a : list3);
    }
}
