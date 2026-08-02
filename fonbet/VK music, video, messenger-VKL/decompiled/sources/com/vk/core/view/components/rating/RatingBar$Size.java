package com.vk.core.view.components.rating;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RatingBar.kt */
/* loaded from: classes17.dex */
public final class RatingBar$Size {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ RatingBar$Size[] $VALUES;
    public static final RatingBar$Size Large;
    public static final RatingBar$Size Medium;
    public static final RatingBar$Size Small;

    static {
        RatingBar$Size ratingBar$Size = new RatingBar$Size("Small", 0);
        Small = ratingBar$Size;
        RatingBar$Size ratingBar$Size2 = new RatingBar$Size("Medium", 1);
        Medium = ratingBar$Size2;
        RatingBar$Size ratingBar$Size3 = new RatingBar$Size("Large", 2);
        Large = ratingBar$Size3;
        RatingBar$Size[] ratingBar$SizeArr = {ratingBar$Size, ratingBar$Size2, ratingBar$Size3};
        $VALUES = ratingBar$SizeArr;
        $ENTRIES = new asp(ratingBar$SizeArr);
    }

    public RatingBar$Size() {
        throw null;
    }

    public static zrp<RatingBar$Size> h() {
        return $ENTRIES;
    }

    public static RatingBar$Size valueOf(String str) {
        return (RatingBar$Size) Enum.valueOf(RatingBar$Size.class, str);
    }

    public static RatingBar$Size[] values() {
        return (RatingBar$Size[]) $VALUES.clone();
    }
}
