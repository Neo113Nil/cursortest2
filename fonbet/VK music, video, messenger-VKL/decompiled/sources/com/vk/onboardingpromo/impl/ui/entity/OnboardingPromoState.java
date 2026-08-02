package com.vk.onboardingpromo.impl.ui.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.libvideo.autoplay.e;
import com.vk.onboardingpromo.impl.domain.objects.OnboardingPromoDo;
import defpackage.q0;
import io.reactivex.rxjava3.subjects.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.ho8;
import xsna.iq;
import xsna.lm50;
import xsna.qg80;
import xsna.urd0;
import xsna.zcl;

/* compiled from: OnboardingPromoState.kt */
/* loaded from: classes4.dex */
public final class OnboardingPromoState implements lm50, Parcelable {
    public static final Parcelable.Creator<OnboardingPromoState> CREATOR = new a();
    public final List<CachedMedia> b;
    public final OnboardingPromoDo c;
    public final CurrentSlide d;
    public final boolean e;

    /* compiled from: OnboardingPromoState.kt */
    public static final class CachedMedia implements Parcelable {
        public static final Parcelable.Creator<CachedMedia> CREATOR = new a();
        public final String b;
        public final String c;
        public final String d;

        /* compiled from: OnboardingPromoState.kt */
        public static final class a implements Parcelable.Creator<CachedMedia> {
            @Override // android.os.Parcelable.Creator
            public final CachedMedia createFromParcel(Parcel parcel) {
                return new CachedMedia(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final CachedMedia[] newArray(int i) {
                return new CachedMedia[i];
            }
        }

        public CachedMedia(String str, String str2, String str3) {
            this.b = str;
            this.c = str2;
            this.d = str3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CachedMedia)) {
                return false;
            }
            CachedMedia cachedMedia = (CachedMedia) obj;
            return epx.f(this.b, cachedMedia.b) && epx.f(this.c, cachedMedia.c) && epx.f(this.d, cachedMedia.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + urd0.a(this.b.hashCode() * 31, 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CachedMedia(type=");
            sb.append(this.b);
            sb.append(", light=");
            sb.append(this.c);
            sb.append(", dark=");
            return ho8.a(sb, this.d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
            parcel.writeString(this.c);
            parcel.writeString(this.d);
        }
    }

    /* compiled from: OnboardingPromoState.kt */
    public static final class CurrentSlide implements Parcelable {
        public static final Parcelable.Creator<CurrentSlide> CREATOR = new a();
        public final qg80 b;
        public final Long c;

        /* compiled from: OnboardingPromoState.kt */
        public static final class a implements Parcelable.Creator<CurrentSlide> {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.os.Parcelable.Creator
            public final CurrentSlide createFromParcel(Parcel parcel) {
                return new CurrentSlide(null, parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), 1, 0 == true ? 1 : 0);
            }

            @Override // android.os.Parcelable.Creator
            public final CurrentSlide[] newArray(int i) {
                return new CurrentSlide[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public CurrentSlide() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CurrentSlide)) {
                return false;
            }
            CurrentSlide currentSlide = (CurrentSlide) obj;
            return epx.f(this.b, currentSlide.b) && epx.f(this.c, currentSlide.c);
        }

        public final int hashCode() {
            int hashCode = this.b.hashCode() * 31;
            Long l = this.c;
            return hashCode + (l == null ? 0 : l.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CurrentSlide(media=");
            sb.append(this.b);
            sb.append(", showTime=");
            return iq.b(sb, this.c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            Long l = this.c;
            if (l == null) {
                parcel.writeInt(0);
            } else {
                b.f(parcel, 1, l);
            }
        }

        public CurrentSlide(qg80 qg80Var, Long l) {
            this.b = qg80Var;
            this.c = l;
        }

        public /* synthetic */ CurrentSlide(qg80 qg80Var, Long l, int i, zcl zclVar) {
            this((i & 1) != 0 ? qg80.a.a : qg80Var, (i & 2) != 0 ? null : l);
        }
    }

    /* compiled from: OnboardingPromoState.kt */
    public static final class a implements Parcelable.Creator<OnboardingPromoState> {
        @Override // android.os.Parcelable.Creator
        public final OnboardingPromoState createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(CachedMedia.CREATOR, parcel, arrayList, i, 1);
            }
            return new OnboardingPromoState(arrayList, OnboardingPromoDo.CREATOR.createFromParcel(parcel), CurrentSlide.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final OnboardingPromoState[] newArray(int i) {
            return new OnboardingPromoState[i];
        }
    }

    public OnboardingPromoState(List<CachedMedia> list, OnboardingPromoDo onboardingPromoDo, CurrentSlide currentSlide, boolean z) {
        this.b = list;
        this.c = onboardingPromoDo;
        this.d = currentSlide;
        this.e = z;
    }

    public static OnboardingPromoState a(OnboardingPromoState onboardingPromoState, List list, OnboardingPromoDo onboardingPromoDo, CurrentSlide currentSlide, boolean z, int i) {
        if ((i & 1) != 0) {
            list = onboardingPromoState.b;
        }
        if ((i & 2) != 0) {
            onboardingPromoDo = onboardingPromoState.c;
        }
        if ((i & 4) != 0) {
            currentSlide = onboardingPromoState.d;
        }
        if ((i & 8) != 0) {
            z = onboardingPromoState.e;
        }
        onboardingPromoState.getClass();
        return new OnboardingPromoState(list, onboardingPromoDo, currentSlide, z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnboardingPromoState)) {
            return false;
        }
        OnboardingPromoState onboardingPromoState = (OnboardingPromoState) obj;
        return epx.f(this.b, onboardingPromoState.b) && epx.f(this.c, onboardingPromoState.c) && epx.f(this.d, onboardingPromoState.d) && this.e == onboardingPromoState.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnboardingPromoState(cachedMedia=");
        sb.append(this.b);
        sb.append(", onboardingPromoDo=");
        sb.append(this.c);
        sb.append(", currentSlide=");
        sb.append(this.d);
        sb.append(", isMuted=");
        return q0.a(sb, this.e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.b);
        while (a2.hasNext()) {
            ((CachedMedia) a2.next()).writeToParcel(parcel, i);
        }
        this.c.writeToParcel(parcel, i);
        this.d.writeToParcel(parcel, i);
        parcel.writeInt(this.e ? 1 : 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public OnboardingPromoState(List list, OnboardingPromoDo onboardingPromoDo, CurrentSlide currentSlide, boolean z, int i, zcl zclVar) {
        this(list, onboardingPromoDo, currentSlide, z);
        list = (i & 1) != 0 ? EmptyList.b : list;
        currentSlide = (i & 4) != 0 ? new CurrentSlide(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0) : currentSlide;
        if ((i & 8) != 0) {
            e eVar = e.a;
            z = e.c();
        }
    }
}
