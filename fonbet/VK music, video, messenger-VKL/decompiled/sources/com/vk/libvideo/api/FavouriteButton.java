package com.vk.libvideo.api;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ClipsControllersConfig.kt */
/* loaded from: classes2.dex */
public final class FavouriteButton {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ FavouriteButton[] $VALUES;
    public static final FavouriteButton HIDDEN;
    public static final FavouriteButton SHOWN;

    static {
        FavouriteButton favouriteButton = new FavouriteButton("SHOWN", 0);
        SHOWN = favouriteButton;
        FavouriteButton favouriteButton2 = new FavouriteButton("HIDDEN", 1);
        HIDDEN = favouriteButton2;
        FavouriteButton[] favouriteButtonArr = {favouriteButton, favouriteButton2};
        $VALUES = favouriteButtonArr;
        $ENTRIES = new asp(favouriteButtonArr);
    }

    public FavouriteButton() {
        throw null;
    }

    public static FavouriteButton valueOf(String str) {
        return (FavouriteButton) Enum.valueOf(FavouriteButton.class, str);
    }

    public static FavouriteButton[] values() {
        return (FavouriteButton[]) $VALUES.clone();
    }
}
