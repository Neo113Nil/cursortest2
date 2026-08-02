package com.vk.newsfeed.posting.geo_picker.presentation;

import android.location.Location;
import com.vk.newsfeed.posting.impl.domain.model.PickerTechMetrics;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.asp;
import xsna.epx;
import xsna.fw3;
import xsna.km50;
import xsna.lra0;
import xsna.qoy;
import xsna.shy;
import xsna.urd0;
import xsna.yqa0;
import xsna.zrp;

/* compiled from: PlacePickerState.kt */
/* loaded from: classes4.dex */
public final class PlacePickerState implements km50 {
    public static final PlacePickerState o = new PlacePickerState(EmptyList.b, Collections.singletonList(new lra0()), 0, "", LoadingState.RELOADING, false, false, false, null, false, false, false, new PickerTechMetrics(0, null, null));
    public final List<yqa0> b;
    public final List<yqa0> c;
    public final int d;
    public final String e;
    public final LoadingState f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final Location j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final PickerTechMetrics n;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PlacePickerState.kt */
    public static final class LoadingState {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ LoadingState[] $VALUES;
        public static final LoadingState ERROR;
        public static final LoadingState IDLE;
        public static final LoadingState LOADING;
        public static final LoadingState NEED_PERMISSION;
        public static final LoadingState RELOADING;

        static {
            LoadingState loadingState = new LoadingState("IDLE", 0);
            IDLE = loadingState;
            LoadingState loadingState2 = new LoadingState("RELOADING", 1);
            RELOADING = loadingState2;
            LoadingState loadingState3 = new LoadingState("LOADING", 2);
            LOADING = loadingState3;
            LoadingState loadingState4 = new LoadingState("ERROR", 3);
            ERROR = loadingState4;
            LoadingState loadingState5 = new LoadingState("NEED_PERMISSION", 4);
            NEED_PERMISSION = loadingState5;
            LoadingState[] loadingStateArr = {loadingState, loadingState2, loadingState3, loadingState4, loadingState5};
            $VALUES = loadingStateArr;
            $ENTRIES = new asp(loadingStateArr);
        }

        public LoadingState() {
            throw null;
        }

        public static LoadingState valueOf(String str) {
            return (LoadingState) Enum.valueOf(LoadingState.class, str);
        }

        public static LoadingState[] values() {
            return (LoadingState[]) $VALUES.clone();
        }
    }

    public PlacePickerState(List list, List list2, int i, String str, LoadingState loadingState, boolean z, boolean z2, boolean z3, Location location, boolean z4, boolean z5, boolean z6, PickerTechMetrics pickerTechMetrics) {
        this.b = list;
        this.c = list2;
        this.d = i;
        this.e = str;
        this.f = loadingState;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = location;
        this.k = z4;
        this.l = z5;
        this.m = z6;
        this.n = pickerTechMetrics;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static PlacePickerState a(PlacePickerState placePickerState, List list, ArrayList arrayList, int i, String str, LoadingState loadingState, boolean z, Location location, boolean z2, boolean z3, boolean z4, PickerTechMetrics pickerTechMetrics, int i2) {
        List list2 = (i2 & 1) != 0 ? placePickerState.b : list;
        List list3 = (i2 & 2) != 0 ? placePickerState.c : arrayList;
        int i3 = (i2 & 4) != 0 ? placePickerState.d : i;
        placePickerState.getClass();
        String str2 = (i2 & 16) != 0 ? placePickerState.e : str;
        LoadingState loadingState2 = (i2 & 32) != 0 ? placePickerState.f : loadingState;
        boolean z5 = (i2 & 64) != 0 ? placePickerState.g : z;
        boolean z6 = (i2 & 128) != 0 ? placePickerState.h : false;
        boolean z7 = (i2 & 256) != 0 ? placePickerState.i : false;
        Location location2 = (i2 & 512) != 0 ? placePickerState.j : location;
        boolean z8 = (i2 & 1024) != 0 ? placePickerState.k : z2;
        boolean z9 = (i2 & 2048) != 0 ? placePickerState.l : z3;
        boolean z10 = (i2 & 4096) != 0 ? placePickerState.m : z4;
        PickerTechMetrics pickerTechMetrics2 = (i2 & 8192) != 0 ? placePickerState.n : pickerTechMetrics;
        placePickerState.getClass();
        return new PlacePickerState(list2, list3, i3, str2, loadingState2, z5, z6, z7, location2, z8, z9, z10, pickerTechMetrics2);
    }

    public final boolean b() {
        return (this.k || this.l) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlacePickerState)) {
            return false;
        }
        PlacePickerState placePickerState = (PlacePickerState) obj;
        return epx.f(this.b, placePickerState.b) && epx.f(this.c, placePickerState.c) && this.d == placePickerState.d && epx.f(this.e, placePickerState.e) && this.f == placePickerState.f && this.g == placePickerState.g && this.h == placePickerState.h && this.i == placePickerState.i && epx.f(this.j, placePickerState.j) && this.k == placePickerState.k && this.l == placePickerState.l && this.m == placePickerState.m && epx.f(this.n, placePickerState.n);
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(qoy.b((this.f.hashCode() + urd0.a(shy.a(0, shy.a(this.d, fw3.a(this.b.hashCode() * 31, 31, this.c), 31), 31), 31, this.e)) * 31, 31, this.g), 31, this.h), 31, this.i);
        Location location = this.j;
        return this.n.hashCode() + qoy.b(qoy.b(qoy.b((b + (location != null ? location.hashCode() : 0)) * 31, 31, this.k), 31, this.l), 31, this.m);
    }

    public final String toString() {
        return "PlacePickerState(items=" + this.b + ", displayItems=" + this.c + ", offset=" + this.d + ", totalCount=0, query=" + this.e + ", loadingState=" + this.f + ", isShowEmpty=" + this.g + ", isShowRefresh=" + this.h + ", showEmptySearchResults=" + this.i + ", location=" + this.j + ", isGeoRestrictedDevice=" + this.k + ", isGeoRestrictedApplication=" + this.l + ", shouldScrollToTop=" + this.m + ", techMetrics=" + this.n + ')';
    }
}
