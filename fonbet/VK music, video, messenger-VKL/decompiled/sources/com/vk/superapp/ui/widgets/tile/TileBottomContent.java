package com.vk.superapp.ui.widgets.tile;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.vk.superapp.api.dto.widgets.actions.WebAction;
import defpackage.q0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.asp;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.qoy;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: TileBottomContent.kt */
/* loaded from: classes6.dex */
public final class TileBottomContent implements Parcelable {
    public static final Parcelable.Creator<TileBottomContent> CREATOR = new a();
    public final BottomContentType b;
    public final String c;
    public final List<ImageWithAction> d;
    public final WebAction e;
    public final boolean f;
    public final boolean g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TileBottomContent.kt */
    public static final class BottomContentType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ BottomContentType[] $VALUES;
        public static final BottomContentType BUTTON;
        public static final BottomContentType SUBTITLE;
        public static final BottomContentType TITLE;
        public static final BottomContentType USER_STACK;

        static {
            BottomContentType bottomContentType = new BottomContentType(NativeAdContent.ViewTag.AD_TITLE, 0);
            TITLE = bottomContentType;
            BottomContentType bottomContentType2 = new BottomContentType("SUBTITLE", 1);
            SUBTITLE = bottomContentType2;
            BottomContentType bottomContentType3 = new BottomContentType("BUTTON", 2);
            BUTTON = bottomContentType3;
            BottomContentType bottomContentType4 = new BottomContentType("USER_STACK", 3);
            USER_STACK = bottomContentType4;
            BottomContentType[] bottomContentTypeArr = {bottomContentType, bottomContentType2, bottomContentType3, bottomContentType4};
            $VALUES = bottomContentTypeArr;
            $ENTRIES = new asp(bottomContentTypeArr);
        }

        public BottomContentType() {
            throw null;
        }

        public static BottomContentType valueOf(String str) {
            return (BottomContentType) Enum.valueOf(BottomContentType.class, str);
        }

        public static BottomContentType[] values() {
            return (BottomContentType[]) $VALUES.clone();
        }
    }

    /* compiled from: TileBottomContent.kt */
    public static final class a implements Parcelable.Creator<TileBottomContent> {
        @Override // android.os.Parcelable.Creator
        public final TileBottomContent createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            BottomContentType valueOf = BottomContentType.valueOf(parcel.readString());
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(ImageWithAction.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new TileBottomContent(valueOf, readString, arrayList, (WebAction) parcel.readParcelable(TileBottomContent.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final TileBottomContent[] newArray(int i) {
            return new TileBottomContent[i];
        }
    }

    public TileBottomContent(BottomContentType bottomContentType, String str, List<ImageWithAction> list, WebAction webAction, boolean z, boolean z2) {
        this.b = bottomContentType;
        this.c = str;
        this.d = list;
        this.e = webAction;
        this.f = z;
        this.g = z2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TileBottomContent)) {
            return false;
        }
        TileBottomContent tileBottomContent = (TileBottomContent) obj;
        return this.b == tileBottomContent.b && epx.f(this.c, tileBottomContent.c) && epx.f(this.d, tileBottomContent.d) && epx.f(this.e, tileBottomContent.e) && this.f == tileBottomContent.f && this.g == tileBottomContent.g;
    }

    public final int hashCode() {
        int a2 = urd0.a(this.b.hashCode() * 31, 31, this.c);
        List<ImageWithAction> list = this.d;
        int hashCode = (a2 + (list == null ? 0 : list.hashCode())) * 31;
        WebAction webAction = this.e;
        return Boolean.hashCode(this.g) + qoy.b((hashCode + (webAction != null ? webAction.hashCode() : 0)) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TileBottomContent(type=");
        sb.append(this.b);
        sb.append(", text=");
        sb.append(this.c);
        sb.append(", images=");
        sb.append(this.d);
        sb.append(", action=");
        sb.append(this.e);
        sb.append(", useTint=");
        sb.append(this.f);
        sb.append(", isIconRight=");
        return q0.a(sb, this.g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b.name());
        parcel.writeString(this.c);
        List<ImageWithAction> list = this.d;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((ImageWithAction) f.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeParcelable(this.e, i);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.g ? 1 : 0);
    }

    public /* synthetic */ TileBottomContent(BottomContentType bottomContentType, String str, List list, WebAction webAction, boolean z, boolean z2, int i, zcl zclVar) {
        this(bottomContentType, str, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : webAction, (i & 16) != 0 ? false : z, (i & 32) != 0 ? false : z2);
    }
}
