package com.vk.video.polls.entrypoint.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UxPollEntryPointLocation.kt */
/* loaded from: classes6.dex */
public final class UxPollEntryPointLocation implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ UxPollEntryPointLocation[] $VALUES;
    public static final Parcelable.Creator<UxPollEntryPointLocation> CREATOR;
    public static final a Companion;
    public static final UxPollEntryPointLocation Discovery;
    public static final UxPollEntryPointLocation MainPageTabs;
    public static final UxPollEntryPointLocation PlayerDiscovery;
    public static final UxPollEntryPointLocation PlayerDiscoveryMenu;
    public static final UxPollEntryPointLocation PlayerFullscreen;
    public static final UxPollEntryPointLocation PlayerFullscreenMenu;
    public static final UxPollEntryPointLocation SimilarMenu;
    private final String id;

    /* compiled from: UxPollEntryPointLocation.kt */
    public static final class a {

        /* compiled from: UxPollEntryPointLocation.kt */
        /* renamed from: com.vk.video.polls.entrypoint.model.UxPollEntryPointLocation$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C1956a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[UxPollEntryPointLocation.values().length];
                try {
                    iArr[UxPollEntryPointLocation.Discovery.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[UxPollEntryPointLocation.PlayerDiscoveryMenu.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[UxPollEntryPointLocation.PlayerFullscreenMenu.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[UxPollEntryPointLocation.SimilarMenu.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[UxPollEntryPointLocation.PlayerDiscovery.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[UxPollEntryPointLocation.PlayerFullscreen.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[UxPollEntryPointLocation.MainPageTabs.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public static UxPollType a(UxPollEntryPointLocation uxPollEntryPointLocation) {
            switch (C1956a.$EnumSwitchMapping$0[uxPollEntryPointLocation.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    return UxPollType.DiscoveryPoll;
                case 7:
                    return UxPollType.RecommendationsPoll;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* compiled from: UxPollEntryPointLocation.kt */
    public static final class b implements Parcelable.Creator<UxPollEntryPointLocation> {
        @Override // android.os.Parcelable.Creator
        public final UxPollEntryPointLocation createFromParcel(Parcel parcel) {
            return UxPollEntryPointLocation.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final UxPollEntryPointLocation[] newArray(int i) {
            return new UxPollEntryPointLocation[i];
        }
    }

    static {
        UxPollEntryPointLocation uxPollEntryPointLocation = new UxPollEntryPointLocation("Discovery", 0, "discovery");
        Discovery = uxPollEntryPointLocation;
        UxPollEntryPointLocation uxPollEntryPointLocation2 = new UxPollEntryPointLocation("PlayerDiscoveryMenu", 1, "player_discovery_menu");
        PlayerDiscoveryMenu = uxPollEntryPointLocation2;
        UxPollEntryPointLocation uxPollEntryPointLocation3 = new UxPollEntryPointLocation("PlayerFullscreenMenu", 2, "player_fullscreen_menu");
        PlayerFullscreenMenu = uxPollEntryPointLocation3;
        UxPollEntryPointLocation uxPollEntryPointLocation4 = new UxPollEntryPointLocation("SimilarMenu", 3, "similar_menu");
        SimilarMenu = uxPollEntryPointLocation4;
        UxPollEntryPointLocation uxPollEntryPointLocation5 = new UxPollEntryPointLocation("PlayerDiscovery", 4, "player_discovery");
        PlayerDiscovery = uxPollEntryPointLocation5;
        UxPollEntryPointLocation uxPollEntryPointLocation6 = new UxPollEntryPointLocation("PlayerFullscreen", 5, "player_fullscreen");
        PlayerFullscreen = uxPollEntryPointLocation6;
        UxPollEntryPointLocation uxPollEntryPointLocation7 = new UxPollEntryPointLocation("MainPageTabs", 6, "main_page_tabs");
        MainPageTabs = uxPollEntryPointLocation7;
        UxPollEntryPointLocation[] uxPollEntryPointLocationArr = {uxPollEntryPointLocation, uxPollEntryPointLocation2, uxPollEntryPointLocation3, uxPollEntryPointLocation4, uxPollEntryPointLocation5, uxPollEntryPointLocation6, uxPollEntryPointLocation7};
        $VALUES = uxPollEntryPointLocationArr;
        $ENTRIES = new asp(uxPollEntryPointLocationArr);
        Companion = new a();
        CREATOR = new b();
    }

    public UxPollEntryPointLocation(String str, int i, String str2) {
        this.id = str2;
    }

    public static zrp<UxPollEntryPointLocation> i() {
        return $ENTRIES;
    }

    public static UxPollEntryPointLocation valueOf(String str) {
        return (UxPollEntryPointLocation) Enum.valueOf(UxPollEntryPointLocation.class, str);
    }

    public static UxPollEntryPointLocation[] values() {
        return (UxPollEntryPointLocation[]) $VALUES.clone();
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
