package com.vk.newsfeed.presentation.model;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import java.util.LinkedHashMap;
import xsna.epx;

/* compiled from: ClickArea.kt */
/* loaded from: classes4.dex */
public final class ClickArea implements Serializer.StreamParcelable {
    public static final Serializer.c<ClickArea> CREATOR = new b();
    public final int b;
    public final LinkedHashMap c;
    public final boolean d;

    /* compiled from: ClickArea.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AdClickContext.values().length];
            try {
                iArr[AdClickContext.TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdClickContext.BUTTON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AdClickContext.HEADER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<ClickArea> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ClickArea a(Serializer serializer) {
            return new ClickArea(serializer.u());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ClickArea[i];
        }
    }

    public ClickArea(int i) {
        this.b = i;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.c = linkedHashMap;
        this.d = (i & 4096) == 4096;
        boolean z = (i & 1) == 1;
        boolean z2 = (i & 2) == 2;
        boolean z3 = (i & 4) == 4;
        boolean z4 = (i & 8) == 8;
        boolean z5 = (i & 16) == 16;
        boolean z6 = (i & 32) == 32;
        boolean z7 = (i & 64) == 64;
        boolean z8 = (i & 128) == 128;
        boolean z9 = (i & 256) == 256;
        boolean z10 = (i & 512) == 512;
        boolean z11 = (i & 1024) == 1024;
        boolean z12 = (i & 2048) == 2048;
        boolean z13 = (i & 8192) == 8192;
        linkedHashMap.put(AdClickContext.TITLE, Boolean.valueOf(z));
        linkedHashMap.put(AdClickContext.ICON, Boolean.valueOf(z3));
        linkedHashMap.put(AdClickContext.DESCRIPTION, Boolean.valueOf(z2));
        linkedHashMap.put(AdClickContext.IMAGE, Boolean.valueOf(z4));
        linkedHashMap.put(AdClickContext.RATING, Boolean.valueOf(z5));
        linkedHashMap.put(AdClickContext.VOTES, Boolean.valueOf(z6));
        linkedHashMap.put(AdClickContext.CTA_BUTTON, Boolean.valueOf(z7));
        linkedHashMap.put(AdClickContext.AGE_RESTRICTION, Boolean.valueOf(z8));
        linkedHashMap.put(AdClickContext.ADVERTISING_LABEL, Boolean.valueOf(z9));
        linkedHashMap.put(AdClickContext.DOMAIN, Boolean.valueOf(z10));
        linkedHashMap.put(AdClickContext.APP_CATEGORY, Boolean.valueOf(z11));
        linkedHashMap.put(AdClickContext.BACKGROUND, Boolean.valueOf(z12));
        linkedHashMap.put(AdClickContext.VIDEO, Boolean.valueOf(z13));
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
    }

    public final boolean a(AdClickContext adClickContext) {
        int i = adClickContext == null ? -1 : a.$EnumSwitchMapping$0[adClickContext.ordinal()];
        return adClickContext == null || this.d || epx.f(this.c.get(i != 1 ? i != 2 ? i != 3 ? adClickContext : AdClickContext.TITLE : AdClickContext.CTA_BUTTON : AdClickContext.DESCRIPTION), Boolean.TRUE);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }
}
