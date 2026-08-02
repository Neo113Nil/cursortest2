package ru.ozon.app.android.storefront.core.socialAtoms.text;

import C.C2702w;
import C.J;
import De.C2859b;
import Pk0.c;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.j;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0017\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003JM\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001J\u0006\u0010\u001b\u001a\u00020\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u001cHÖ\u0001J\t\u0010\"\u001a\u00020\u0006HÖ\u0001J\u0016\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006("}, d2 = {"Lru/ozon/app/android/storefront/core/socialAtoms/text/TextTag;", "Landroid/os/Parcelable;", "startPosition", "", "length", "deeplink", "", "textColor", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(JJLjava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getStartPosition", "()J", "getLength", "getDeeplink", "()Ljava/lang/String;", "getTextColor", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class TextTag implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TextTag> CREATOR = new Creator();
    private final String deeplink;
    private final long length;
    private final long startPosition;
    private final String textColor;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<TextTag> {
        @Override // android.os.Parcelable.Creator
        public final TextTag createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            long readLong = parcel.readLong();
            long readLong2 = parcel.readLong();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                int i11 = 0;
                while (i11 != readInt) {
                    i11 = C2859b.a(TextTag.class, parcel, linkedHashMap2, parcel.readString(), i11, 1);
                }
                linkedHashMap = linkedHashMap2;
            }
            return new TextTag(readLong, readLong2, readString, readString2, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final TextTag[] newArray(int i11) {
            return new TextTag[i11];
        }
    }

    public TextTag(long j11, long j12, String str, String str2, Map<String, TokenizedTrackingInfo> map) {
        this.startPosition = j11;
        this.length = j12;
        this.deeplink = str;
        this.textColor = str2;
        this.trackingInfo = map;
    }

    public static /* synthetic */ TextTag copy$default(TextTag textTag, long j11, long j12, String str, String str2, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = textTag.startPosition;
        }
        long j13 = j11;
        if ((i11 & 2) != 0) {
            j12 = textTag.length;
        }
        long j14 = j12;
        if ((i11 & 4) != 0) {
            str = textTag.deeplink;
        }
        String str3 = str;
        if ((i11 & 8) != 0) {
            str2 = textTag.textColor;
        }
        String str4 = str2;
        if ((i11 & 16) != 0) {
            map = textTag.trackingInfo;
        }
        return textTag.copy(j13, j14, str3, str4, map);
    }

    /* renamed from: component1, reason: from getter */
    public final long getStartPosition() {
        return this.startPosition;
    }

    /* renamed from: component2, reason: from getter */
    public final long getLength() {
        return this.length;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDeeplink() {
        return this.deeplink;
    }

    /* renamed from: component4, reason: from getter */
    public final String getTextColor() {
        return this.textColor;
    }

    public final Map<String, TokenizedTrackingInfo> component5() {
        return this.trackingInfo;
    }

    @NotNull
    public final TextTag copy(long startPosition, long length, String deeplink, String textColor, Map<String, TokenizedTrackingInfo> trackingInfo) {
        return new TextTag(startPosition, length, deeplink, textColor, trackingInfo);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextTag)) {
            return false;
        }
        TextTag textTag = (TextTag) other;
        return this.startPosition == textTag.startPosition && this.length == textTag.length && Intrinsics.d(this.deeplink, textTag.deeplink) && Intrinsics.d(this.textColor, textTag.textColor) && Intrinsics.d(this.trackingInfo, textTag.trackingInfo);
    }

    public final String getDeeplink() {
        return this.deeplink;
    }

    public final long getLength() {
        return this.length;
    }

    public final long getStartPosition() {
        return this.startPosition;
    }

    public final String getTextColor() {
        return this.textColor;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int a11 = c.a(Long.hashCode(this.startPosition) * 31, 31, this.length);
        String str = this.deeplink;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.textColor;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.startPosition;
        long j12 = this.length;
        String str = this.deeplink;
        String str2 = this.textColor;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder d11 = C2702w.d(j11, "TextTag(startPosition=", ", length=");
        d11.append(j12);
        d11.append(", deeplink=");
        d11.append(str);
        d11.append(", textColor=");
        d11.append(str2);
        d11.append(", trackingInfo=");
        d11.append(map);
        d11.append(")");
        return d11.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeLong(this.startPosition);
        dest.writeLong(this.length);
        dest.writeString(this.deeplink);
        dest.writeString(this.textColor);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        if (map == null) {
            dest.writeInt(0);
            return;
        }
        Iterator e11 = J.e(map, dest, 1);
        while (e11.hasNext()) {
            Map.Entry entry = (Map.Entry) e11.next();
            dest.writeString((String) entry.getKey());
            dest.writeParcelable((Parcelable) entry.getValue(), flags);
        }
    }
}
