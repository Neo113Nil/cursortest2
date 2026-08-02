package com.vk.dto.common;

import com.vk.dto.common.ImageSize;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;
import xsna.asp;
import xsna.cqm0;
import xsna.j5g;
import xsna.ozl;
import xsna.rl3;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AvatarSize.kt */
/* loaded from: classes18.dex */
public final class AvatarSize {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AvatarSize[] $VALUES;
    public static final a Companion;

    @ozl
    public static final AvatarSize PHOTO_100;

    @ozl
    public static final AvatarSize PHOTO_200;

    @ozl
    public static final AvatarSize PHOTO_200_ORIG;

    @ozl
    public static final AvatarSize PHOTO_400;

    @ozl
    public static final AvatarSize PHOTO_400_ORIG;

    @ozl
    public static final AvatarSize PHOTO_50;
    public static final AvatarSize PHOTO_BASE;
    private static final Set<AvatarSize> SIZES_EXTENDED_OBSOLETE;
    private static final Set<AvatarSize> SIZES_OBSOLETE;
    private final boolean isBase;
    private final String param;
    private final int size;

    /* compiled from: AvatarSize.kt */
    public static final class a {
        public static Image a(Iterable iterable, JSONObject jSONObject) {
            List list;
            ImageSize n;
            AvatarSize avatarSize = AvatarSize.PHOTO_BASE;
            if (!j5g.P(iterable, avatarSize) || (n = avatarSize.n(jSONObject)) == null) {
                Iterator it = iterable.iterator();
                ArrayList arrayList = null;
                while (it.hasNext()) {
                    ImageSize n2 = ((AvatarSize) it.next()).n(jSONObject);
                    if (n2 != null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(n2);
                    }
                }
                list = arrayList;
            } else {
                list = Collections.singletonList(n);
            }
            if (list != null) {
                return new Image((List<ImageSize>) list);
            }
            return null;
        }
    }

    static {
        AvatarSize avatarSize = new AvatarSize(0, "PHOTO_50", "photo_50", 50, false);
        PHOTO_50 = avatarSize;
        AvatarSize avatarSize2 = new AvatarSize(1, "PHOTO_100", "photo_100", 100, false);
        PHOTO_100 = avatarSize2;
        AvatarSize avatarSize3 = new AvatarSize(2, "PHOTO_200", "photo_200", 200, false);
        PHOTO_200 = avatarSize3;
        AvatarSize avatarSize4 = new AvatarSize(3, "PHOTO_200_ORIG", "photo_200_orig", 200, false);
        PHOTO_200_ORIG = avatarSize4;
        AvatarSize avatarSize5 = new AvatarSize(4, "PHOTO_400", "photo_400", 400, false);
        PHOTO_400 = avatarSize5;
        AvatarSize avatarSize6 = new AvatarSize(5, "PHOTO_400_ORIG", "photo_400_orig", 400, false);
        PHOTO_400_ORIG = avatarSize6;
        AvatarSize avatarSize7 = new AvatarSize(6, "PHOTO_BASE", "photo_base", 480, true);
        PHOTO_BASE = avatarSize7;
        AvatarSize[] avatarSizeArr = {avatarSize, avatarSize2, avatarSize3, avatarSize4, avatarSize5, avatarSize6, avatarSize7};
        $VALUES = avatarSizeArr;
        $ENTRIES = new asp(avatarSizeArr);
        Companion = new a();
        SIZES_OBSOLETE = rl3.y0(new AvatarSize[]{avatarSize, avatarSize2, avatarSize3, avatarSize5});
        SIZES_EXTENDED_OBSOLETE = rl3.y0(new AvatarSize[]{avatarSize, avatarSize2, avatarSize3, avatarSize4, avatarSize5, avatarSize6});
    }

    public AvatarSize(int i, String str, String str2, int i2, boolean z) {
        this.param = str2;
        this.size = i2;
        this.isBase = z;
    }

    public static AvatarSize valueOf(String str) {
        return (AvatarSize) Enum.valueOf(AvatarSize.class, str);
    }

    public static AvatarSize[] values() {
        return (AvatarSize[]) $VALUES.clone();
    }

    public final String j() {
        return this.param;
    }

    public final int k() {
        return this.size;
    }

    public final boolean l() {
        return this.isBase;
    }

    public final com.vk.dto.common.im.Image m(JSONObject jSONObject) {
        String a2 = cqm0.a(jSONObject.optString(this.param));
        if (a2 == null) {
            return null;
        }
        int i = this.size;
        return new com.vk.dto.common.im.Image(i, i, a2, this.isBase);
    }

    public final ImageSize n(JSONObject jSONObject) {
        String a2 = cqm0.a(jSONObject.optString(this.param));
        if (a2 == null) {
            return null;
        }
        int i = this.size;
        return new ImageSize(a2, i, i, null, ImageSize.b.d(i, i, this.isBase), false, 40, null);
    }
}
