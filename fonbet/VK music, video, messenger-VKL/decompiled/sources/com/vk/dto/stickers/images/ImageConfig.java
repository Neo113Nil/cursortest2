package com.vk.dto.stickers.images;

import com.vk.core.serialize.Serializer;
import com.vk.dto.stickers.images.ModifierType;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import xsna.c730;
import xsna.drm0;
import xsna.epx;
import xsna.fw3;
import xsna.iqm0;
import xsna.ms9;
import xsna.urd0;

/* compiled from: ImageConfig.kt */
/* loaded from: classes18.dex */
public final class ImageConfig extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<ImageConfig> CREATOR = new b();
    public final int b;
    public final String c;
    public final List<ImageSize> d;
    public final List<ImageTheme> e;
    public final ArrayList f;

    /* compiled from: ImageConfig.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ModifierType.values().length];
            try {
                iArr[ModifierType.IMAGE_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ModifierType.SIZE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ModifierType.THEME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ModifierType.FORMAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ModifierType.VERSION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<ImageConfig> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ImageConfig a(Serializer serializer) {
            return new ImageConfig(serializer.u(), serializer.H(), serializer.j(ImageSize.CREATOR), serializer.j(ImageTheme.CREATOR));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ImageConfig[i];
        }
    }

    public ImageConfig(int i, String str, List<ImageSize> list, List<ImageTheme> list2) {
        String k0;
        Map map;
        this.b = i;
        this.c = str;
        this.d = list;
        this.e = list2;
        ArrayList arrayList = new ArrayList();
        Matcher matcher = Pattern.compile("\\{(.*?)\\}").matcher(str);
        ArrayList arrayList2 = new ArrayList();
        while (matcher.find()) {
            arrayList2.add(matcher.group());
        }
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (i2 == 0) {
                String str2 = this.c;
                k0 = drm0.k0(str2, (String) arrayList2.get(i2), str2);
            } else {
                String str3 = this.c;
                String g0 = drm0.g0(str3, (String) arrayList2.get(i2 - 1), str3);
                k0 = drm0.k0(g0, (String) arrayList2.get(i2), g0);
            }
            if (k0.length() > 0) {
                arrayList.add(new iqm0(k0));
            }
            ModifierType.a aVar = ModifierType.Companion;
            String str4 = (String) arrayList2.get(i2);
            aVar.getClass();
            map = ModifierType.map;
            arrayList.add(new c730((ModifierType) map.get(str4.toLowerCase(Locale.ROOT))));
            if (i2 == arrayList2.size() - 1) {
                String str5 = this.c;
                String g02 = drm0.g0(str5, (String) arrayList2.get(i2), str5);
                if (g02.length() > 0) {
                    arrayList.add(new iqm0(g02));
                }
            }
        }
        this.f = arrayList;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.j0(this.c);
        serializer.o0(this.d);
        serializer.o0(this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageConfig)) {
            return false;
        }
        ImageConfig imageConfig = (ImageConfig) obj;
        return this.b == imageConfig.b && epx.f(this.c, imageConfig.c) && epx.f(this.d, imageConfig.d) && epx.f(this.e, imageConfig.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + fw3.a(urd0.a(Integer.hashCode(this.b) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageConfig(id=");
        sb.append(this.b);
        sb.append(", template=");
        sb.append(this.c);
        sb.append(", sizes=");
        sb.append(this.d);
        sb.append(", themes=");
        return ms9.a(')', sb, this.e);
    }
}
