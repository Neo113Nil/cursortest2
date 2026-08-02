package com.vk.clips.attachments.impl.publish.geolocation.presentation;

import com.vk.dto.clips.ClipsVideoItemLocation;
import com.vk.dto.geo.GeoLocation;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.asp;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.km50;
import xsna.ms9;
import xsna.zrp;

/* compiled from: ClipsGeoPickerState.kt */
/* loaded from: classes16.dex */
public final class ClipsGeoPickerState implements km50 {
    public static final ClipsGeoPickerState g;
    public final String b;
    public final List<GeoLocation> c;
    public final FullscreenState d;
    public final a e;
    public final List<ClipsVideoItemLocation> f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ClipsGeoPickerState.kt */
    public static final class FullscreenState {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ FullscreenState[] $VALUES;
        public static final FullscreenState Loading;
        public static final FullscreenState None;
        public static final FullscreenState Unavailable;

        static {
            FullscreenState fullscreenState = new FullscreenState("Loading", 0);
            Loading = fullscreenState;
            FullscreenState fullscreenState2 = new FullscreenState("Unavailable", 1);
            Unavailable = fullscreenState2;
            FullscreenState fullscreenState3 = new FullscreenState("None", 2);
            None = fullscreenState3;
            FullscreenState[] fullscreenStateArr = {fullscreenState, fullscreenState2, fullscreenState3};
            $VALUES = fullscreenStateArr;
            $ENTRIES = new asp(fullscreenStateArr);
        }

        public FullscreenState() {
            throw null;
        }

        public static FullscreenState valueOf(String str) {
            return (FullscreenState) Enum.valueOf(FullscreenState.class, str);
        }

        public static FullscreenState[] values() {
            return (FullscreenState[]) $VALUES.clone();
        }
    }

    /* compiled from: ClipsGeoPickerState.kt */
    public static final class a {
        public static final a c = new a("", "");
        public final String a;
        public final String b;

        public a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FragmentResultKeys(fragmentResultBundleKey=");
            sb.append(this.a);
            sb.append(", fragmentResultRequestKey=");
            return ho8.a(sb, this.b, ')');
        }
    }

    static {
        EmptyList emptyList = EmptyList.b;
        g = new ClipsGeoPickerState("", emptyList, FullscreenState.Loading, a.c, emptyList);
    }

    public ClipsGeoPickerState(String str, List<GeoLocation> list, FullscreenState fullscreenState, a aVar, List<ClipsVideoItemLocation> list2) {
        this.b = str;
        this.c = list;
        this.d = fullscreenState;
        this.e = aVar;
        this.f = list2;
    }

    public static ClipsGeoPickerState a(ClipsGeoPickerState clipsGeoPickerState, List list, FullscreenState fullscreenState, a aVar, List list2, int i) {
        String str = (i & 1) != 0 ? clipsGeoPickerState.b : null;
        if ((i & 2) != 0) {
            list = clipsGeoPickerState.c;
        }
        if ((i & 4) != 0) {
            fullscreenState = clipsGeoPickerState.d;
        }
        if ((i & 8) != 0) {
            aVar = clipsGeoPickerState.e;
        }
        if ((i & 16) != 0) {
            list2 = clipsGeoPickerState.f;
        }
        List list3 = list2;
        clipsGeoPickerState.getClass();
        a aVar2 = aVar;
        return new ClipsGeoPickerState(str, list, fullscreenState, aVar2, list3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClipsGeoPickerState)) {
            return false;
        }
        ClipsGeoPickerState clipsGeoPickerState = (ClipsGeoPickerState) obj;
        return epx.f(this.b, clipsGeoPickerState.b) && epx.f(this.c, clipsGeoPickerState.c) && this.d == clipsGeoPickerState.d && epx.f(this.e, clipsGeoPickerState.e) && epx.f(this.f, clipsGeoPickerState.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + fw3.a(this.b.hashCode() * 31, 31, this.c)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsGeoPickerState(input=");
        sb.append(this.b);
        sb.append(", locations=");
        sb.append(this.c);
        sb.append(", fullscreenState=");
        sb.append(this.d);
        sb.append(", resultKeys=");
        sb.append(this.e);
        sb.append(", rawLocations=");
        return ms9.a(')', sb, this.f);
    }
}
