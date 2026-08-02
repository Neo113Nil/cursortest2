package com.blaze.blazesdk.ads.models.ui;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import defpackage.dmi;
import defpackage.w1l;
import defpackage.w3a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001c\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÀ\u0003¢\u0006\u0002\b\u0015J\u001c\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÀ\u0003¢\u0006\u0002\b\u0017J\u0081\u0001\u0010\u0018\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001aHÖ\u0001J\t\u0010 \u001a\u00020\u0004HÖ\u0001J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001aR\u001f\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001f\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\"\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\"\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\f¨\u0006&"}, d2 = {"Lcom/blaze/blazesdk/ads/models/ui/BlazeContentExtraInfo;", "Landroid/os/Parcelable;", "previous", "", "", "current", "next", "extraInfoForAnalytics", "storyPageExtraInfoForAnalytics", "<init>", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V", "getPrevious", "()Ljava/util/Map;", "getCurrent", "getNext", "getExtraInfoForAnalytics$blazesdk_release", "getStoryPageExtraInfoForAnalytics$blazesdk_release", "component1", "component2", "component3", "component4", "component4$blazesdk_release", "component5", "component5$blazesdk_release", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class BlazeContentExtraInfo implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<BlazeContentExtraInfo> CREATOR = new a();

    @Nullable
    private final Map<String, String> current;

    @Nullable
    private final Map<String, String> extraInfoForAnalytics;

    @Nullable
    private final Map<String, String> next;

    @Nullable
    private final Map<String, String> previous;

    @Nullable
    private final Map<String, String> storyPageExtraInfoForAnalytics;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            LinkedHashMap linkedHashMap2;
            LinkedHashMap linkedHashMap3;
            LinkedHashMap linkedHashMap4;
            parcel.getClass();
            int i = 0;
            LinkedHashMap linkedHashMap5 = null;
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap6 = new LinkedHashMap(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = w1l.a(parcel, linkedHashMap6, parcel.readString(), i2, 1);
                }
                linkedHashMap = linkedHashMap6;
            }
            if (parcel.readInt() == 0) {
                linkedHashMap2 = null;
            } else {
                int readInt2 = parcel.readInt();
                LinkedHashMap linkedHashMap7 = new LinkedHashMap(readInt2);
                int i3 = 0;
                while (i3 != readInt2) {
                    i3 = w1l.a(parcel, linkedHashMap7, parcel.readString(), i3, 1);
                }
                linkedHashMap2 = linkedHashMap7;
            }
            if (parcel.readInt() == 0) {
                linkedHashMap3 = null;
            } else {
                int readInt3 = parcel.readInt();
                LinkedHashMap linkedHashMap8 = new LinkedHashMap(readInt3);
                int i4 = 0;
                while (i4 != readInt3) {
                    i4 = w1l.a(parcel, linkedHashMap8, parcel.readString(), i4, 1);
                }
                linkedHashMap3 = linkedHashMap8;
            }
            if (parcel.readInt() == 0) {
                linkedHashMap4 = null;
            } else {
                int readInt4 = parcel.readInt();
                LinkedHashMap linkedHashMap9 = new LinkedHashMap(readInt4);
                int i5 = 0;
                while (i5 != readInt4) {
                    i5 = w1l.a(parcel, linkedHashMap9, parcel.readString(), i5, 1);
                }
                linkedHashMap4 = linkedHashMap9;
            }
            if (parcel.readInt() != 0) {
                int readInt5 = parcel.readInt();
                linkedHashMap5 = new LinkedHashMap(readInt5);
                while (i != readInt5) {
                    i = w1l.a(parcel, linkedHashMap5, parcel.readString(), i, 1);
                }
            }
            return new BlazeContentExtraInfo(linkedHashMap, linkedHashMap2, linkedHashMap3, linkedHashMap4, linkedHashMap5);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BlazeContentExtraInfo[i];
        }
    }

    public /* synthetic */ BlazeContentExtraInfo(Map map, Map map2, Map map3, Map map4, Map map5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : map, (i & 2) != 0 ? null : map2, (i & 4) != 0 ? null : map3, (i & 8) != 0 ? null : map4, (i & 16) != 0 ? null : map5);
    }

    public static /* synthetic */ BlazeContentExtraInfo copy$default(BlazeContentExtraInfo blazeContentExtraInfo, Map map, Map map2, Map map3, Map map4, Map map5, int i, Object obj) {
        if ((i & 1) != 0) {
            map = blazeContentExtraInfo.previous;
        }
        if ((i & 2) != 0) {
            map2 = blazeContentExtraInfo.current;
        }
        if ((i & 4) != 0) {
            map3 = blazeContentExtraInfo.next;
        }
        if ((i & 8) != 0) {
            map4 = blazeContentExtraInfo.extraInfoForAnalytics;
        }
        if ((i & 16) != 0) {
            map5 = blazeContentExtraInfo.storyPageExtraInfoForAnalytics;
        }
        Map map6 = map5;
        Map map7 = map3;
        return blazeContentExtraInfo.copy(map, map2, map7, map4, map6);
    }

    @Nullable
    public final Map<String, String> component1() {
        return this.previous;
    }

    @Nullable
    public final Map<String, String> component2() {
        return this.current;
    }

    @Nullable
    public final Map<String, String> component3() {
        return this.next;
    }

    @Nullable
    public final Map<String, String> component4$blazesdk_release() {
        return this.extraInfoForAnalytics;
    }

    @Nullable
    public final Map<String, String> component5$blazesdk_release() {
        return this.storyPageExtraInfoForAnalytics;
    }

    @NotNull
    public final BlazeContentExtraInfo copy(@Nullable Map<String, String> previous, @Nullable Map<String, String> current, @Nullable Map<String, String> next, @Nullable Map<String, String> extraInfoForAnalytics, @Nullable Map<String, String> storyPageExtraInfoForAnalytics) {
        return new BlazeContentExtraInfo(previous, current, next, extraInfoForAnalytics, storyPageExtraInfoForAnalytics);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlazeContentExtraInfo)) {
            return false;
        }
        BlazeContentExtraInfo blazeContentExtraInfo = (BlazeContentExtraInfo) other;
        return Intrinsics.c(this.previous, blazeContentExtraInfo.previous) && Intrinsics.c(this.current, blazeContentExtraInfo.current) && Intrinsics.c(this.next, blazeContentExtraInfo.next) && Intrinsics.c(this.extraInfoForAnalytics, blazeContentExtraInfo.extraInfoForAnalytics) && Intrinsics.c(this.storyPageExtraInfoForAnalytics, blazeContentExtraInfo.storyPageExtraInfoForAnalytics);
    }

    @Nullable
    public final Map<String, String> getCurrent() {
        return this.current;
    }

    @Nullable
    public final Map<String, String> getExtraInfoForAnalytics$blazesdk_release() {
        return this.extraInfoForAnalytics;
    }

    @Nullable
    public final Map<String, String> getNext() {
        return this.next;
    }

    @Nullable
    public final Map<String, String> getPrevious() {
        return this.previous;
    }

    @Nullable
    public final Map<String, String> getStoryPageExtraInfoForAnalytics$blazesdk_release() {
        return this.storyPageExtraInfoForAnalytics;
    }

    public int hashCode() {
        Map<String, String> map = this.previous;
        int hashCode = (map == null ? 0 : map.hashCode()) * 31;
        Map<String, String> map2 = this.current;
        int hashCode2 = (hashCode + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map<String, String> map3 = this.next;
        int hashCode3 = (hashCode2 + (map3 == null ? 0 : map3.hashCode())) * 31;
        Map<String, String> map4 = this.extraInfoForAnalytics;
        int hashCode4 = (hashCode3 + (map4 == null ? 0 : map4.hashCode())) * 31;
        Map<String, String> map5 = this.storyPageExtraInfoForAnalytics;
        return hashCode4 + (map5 != null ? map5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("BlazeContentExtraInfo(previous=");
        sb.append(this.previous);
        sb.append(", current=");
        sb.append(this.current);
        sb.append(", next=");
        sb.append(this.next);
        sb.append(", extraInfoForAnalytics=");
        sb.append(this.extraInfoForAnalytics);
        sb.append(", storyPageExtraInfoForAnalytics=");
        return dmi.s(sb, this.storyPageExtraInfoForAnalytics, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        Map<String, String> map = this.previous;
        if (map == null) {
            dest.writeInt(0);
        } else {
            Iterator k = w3a.k(dest, map);
            while (k.hasNext()) {
                Map.Entry entry = (Map.Entry) k.next();
                dest.writeString((String) entry.getKey());
                dest.writeString((String) entry.getValue());
            }
        }
        Map<String, String> map2 = this.current;
        if (map2 == null) {
            dest.writeInt(0);
        } else {
            Iterator k2 = w3a.k(dest, map2);
            while (k2.hasNext()) {
                Map.Entry entry2 = (Map.Entry) k2.next();
                dest.writeString((String) entry2.getKey());
                dest.writeString((String) entry2.getValue());
            }
        }
        Map<String, String> map3 = this.next;
        if (map3 == null) {
            dest.writeInt(0);
        } else {
            Iterator k3 = w3a.k(dest, map3);
            while (k3.hasNext()) {
                Map.Entry entry3 = (Map.Entry) k3.next();
                dest.writeString((String) entry3.getKey());
                dest.writeString((String) entry3.getValue());
            }
        }
        Map<String, String> map4 = this.extraInfoForAnalytics;
        if (map4 == null) {
            dest.writeInt(0);
        } else {
            Iterator k4 = w3a.k(dest, map4);
            while (k4.hasNext()) {
                Map.Entry entry4 = (Map.Entry) k4.next();
                dest.writeString((String) entry4.getKey());
                dest.writeString((String) entry4.getValue());
            }
        }
        Map<String, String> map5 = this.storyPageExtraInfoForAnalytics;
        if (map5 == null) {
            dest.writeInt(0);
            return;
        }
        Iterator k5 = w3a.k(dest, map5);
        while (k5.hasNext()) {
            Map.Entry entry5 = (Map.Entry) k5.next();
            dest.writeString((String) entry5.getKey());
            dest.writeString((String) entry5.getValue());
        }
    }

    public BlazeContentExtraInfo(@Nullable Map<String, String> map, @Nullable Map<String, String> map2, @Nullable Map<String, String> map3, @Nullable Map<String, String> map4, @Nullable Map<String, String> map5) {
        this.previous = map;
        this.current = map2;
        this.next = map3;
        this.extraInfoForAnalytics = map4;
        this.storyPageExtraInfoForAnalytics = map5;
    }

    public BlazeContentExtraInfo() {
        this(null, null, null, null, null, 31, null);
    }
}
