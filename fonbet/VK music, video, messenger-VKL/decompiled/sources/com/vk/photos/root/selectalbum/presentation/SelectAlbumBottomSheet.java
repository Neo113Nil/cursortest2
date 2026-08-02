package com.vk.photos.root.selectalbum.presentation;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.vk.dto.common.id.UserId;
import com.vk.photos.root.selectalbum.domain.PhotoAlbumWrapper;
import com.vk.photos.root.selectalbum.domain.a;
import com.vk.photos.root.selectalbum.domain.b;
import com.vk.photos.root.selectalbum.domain.h;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import xsna.ao;
import xsna.ao50;
import xsna.bpn0;
import xsna.dw20;
import xsna.ebx;
import xsna.el1;
import xsna.emh0;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.g6;
import xsna.gd70;
import xsna.gm50;
import xsna.h6i0;
import xsna.i6i0;
import xsna.izs;
import xsna.k6i0;
import xsna.kdg0;
import xsna.km50;
import xsna.mk50;
import xsna.n6i0;
import xsna.nt10;
import xsna.oqh0;
import xsna.p1d0;
import xsna.pf40;
import xsna.s3q0;
import xsna.so40;
import xsna.tl50;
import xsna.ts90;
import xsna.tzp0;
import xsna.ur;
import xsna.urd0;
import xsna.v100;
import xsna.vk50;
import xsna.w8i;
import xsna.xd40;
import xsna.zcl;

/* compiled from: SelectAlbumBottomSheet.kt */
/* loaded from: classes4.dex */
public final class SelectAlbumBottomSheet extends tl50<b, h, a> implements w8i {
    public static final /* synthetic */ int p1 = 0;
    public izs<? super PhotoAlbumWrapper, s3q0> i1;
    public i6i0 j1;
    public final bpn0 k1 = new bpn0(new so40(this, 20));
    public final bpn0 l1 = new bpn0(new p1d0(this, 11));
    public final bpn0 m1 = new bpn0(new gd70(this, 24));
    public final bpn0 n1 = new bpn0(new v100(this, 29));
    public final bpn0 o1 = new bpn0(new oqh0(this, 2));

    @Override // xsna.xn50
    public final mk50 Fl() {
        return new mk50.b(R.layout.fragment_select_album);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        h hVar = (h) ao50Var;
        kdg0 kdg0Var = (kdg0) this.m1.getValue();
        k6i0 k6i0Var = (k6i0) this.o1.getValue();
        String str = bo().c;
        n6i0 n6i0Var = new n6i0(view, new nt10(this, 22), this, (el1) this.n1.getValue(), k6i0Var, kdg0Var, str, new xd40(this, 18));
        gm50.a.b(n6i0Var, hVar.b, new emh0(n6i0Var, 1));
        gm50.a.b(n6i0Var, hVar.a, new ebx(n6i0Var, 24));
        this.i0 = new h6i0(this.i0, n6i0Var);
        getFeature().f.a(new g6(28, this, n6i0Var), this);
    }

    @Override // xsna.tl50
    public final void Yn(h hVar, View view) {
        this.j1 = new i6i0(view, bo().d, this, new pf40(this, 15));
    }

    @Override // xsna.tl50
    public final mk50 Zn() {
        return new mk50.b(R.layout.view_return_from_archive);
    }

    public final Builder.Arguments bo() {
        return (Builder.Arguments) this.k1.getValue();
    }

    @Override // xsna.dw20, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        getFeature().C(a.g.b);
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.j1 = null;
        super.onDestroyView();
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        return new b(bo().f, bo().e);
    }

    /* compiled from: SelectAlbumBottomSheet.kt */
    public static final class Builder extends dw20.b {
        public final Arguments e;
        public final izs<PhotoAlbumWrapper, s3q0> f;

        public Builder(Context context, Arguments arguments, izs izsVar) {
            super(context, tzp0.a(null, 3));
            this.e = arguments;
            this.f = izsVar;
            c(new ts90(0.73f, 2));
            q0(true);
            F0(true);
            x(0);
            this.d.C1 = true;
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            SelectAlbumBottomSheet selectAlbumBottomSheet = new SelectAlbumBottomSheet();
            Bundle bundle = new Bundle();
            bundle.putParcelable("ARGS", this.e);
            selectAlbumBottomSheet.setArguments(bundle);
            selectAlbumBottomSheet.i1 = this.f;
            return selectAlbumBottomSheet;
        }

        /* compiled from: SelectAlbumBottomSheet.kt */
        public static final class Arguments implements Parcelable {
            public static final Parcelable.Creator<Arguments> CREATOR = new a();
            public final UserId b;
            public final String c;
            public final String d;
            public final List<PhotoAlbumWrapper.SpecialPhotoAlbum> e;
            public final Set<Integer> f;
            public final Set<Integer> g;

            /* compiled from: SelectAlbumBottomSheet.kt */
            public static final class a implements Parcelable.Creator<Arguments> {
                @Override // android.os.Parcelable.Creator
                public final Arguments createFromParcel(Parcel parcel) {
                    UserId userId = (UserId) parcel.readParcelable(Arguments.class.getClassLoader());
                    String readString = parcel.readString();
                    String readString2 = parcel.readString();
                    int readInt = parcel.readInt();
                    ArrayList arrayList = new ArrayList(readInt);
                    int i = 0;
                    while (i != readInt) {
                        i = en.a(PhotoAlbumWrapper.SpecialPhotoAlbum.CREATOR, parcel, arrayList, i, 1);
                    }
                    int readInt2 = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(readInt2);
                    for (int i2 = 0; i2 != readInt2; i2++) {
                        linkedHashSet.add(Integer.valueOf(parcel.readInt()));
                    }
                    int readInt3 = parcel.readInt();
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet(readInt3);
                    for (int i3 = 0; i3 != readInt3; i3++) {
                        linkedHashSet2.add(Integer.valueOf(parcel.readInt()));
                    }
                    return new Arguments(userId, readString, readString2, arrayList, linkedHashSet, linkedHashSet2);
                }

                @Override // android.os.Parcelable.Creator
                public final Arguments[] newArray(int i) {
                    return new Arguments[i];
                }
            }

            public Arguments(UserId userId, String str, String str2, List list, Set set, Set set2, int i, zcl zclVar) {
                this(userId, str, str2, (i & 8) != 0 ? EmptyList.b : list, (i & 16) != 0 ? EmptySet.b : set, (i & 32) != 0 ? EmptySet.b : set2);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Arguments)) {
                    return false;
                }
                Arguments arguments = (Arguments) obj;
                return epx.f(this.b, arguments.b) && epx.f(this.c, arguments.c) && epx.f(this.d, arguments.d) && epx.f(this.e, arguments.e) && epx.f(this.f, arguments.f) && epx.f(this.g, arguments.g);
            }

            public final int hashCode() {
                return this.g.hashCode() + fw3.b(fw3.a(urd0.a(urd0.a(Long.hashCode(this.b.b) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Arguments(userId=");
                sb.append(this.b);
                sb.append(", title=");
                sb.append(this.c);
                sb.append(", actionText=");
                sb.append(this.d);
                sb.append(", addAlbums=");
                sb.append(this.e);
                sb.append(", excludeAlbumsWithIds=");
                sb.append(this.f);
                sb.append(", allowedSystemAlbums=");
                return ur.c(sb, this.g, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeParcelable(this.b, i);
                parcel.writeString(this.c);
                parcel.writeString(this.d);
                Iterator a2 = ao.a(parcel, this.e);
                while (a2.hasNext()) {
                    ((PhotoAlbumWrapper.SpecialPhotoAlbum) a2.next()).writeToParcel(parcel, i);
                }
                Set<Integer> set = this.f;
                parcel.writeInt(set.size());
                Iterator<Integer> it = set.iterator();
                while (it.hasNext()) {
                    parcel.writeInt(it.next().intValue());
                }
                Set<Integer> set2 = this.g;
                parcel.writeInt(set2.size());
                Iterator<Integer> it2 = set2.iterator();
                while (it2.hasNext()) {
                    parcel.writeInt(it2.next().intValue());
                }
            }

            public Arguments(UserId userId, String str, String str2, List<PhotoAlbumWrapper.SpecialPhotoAlbum> list, Set<Integer> set, Set<Integer> set2) {
                this.b = userId;
                this.c = str;
                this.d = str2;
                this.e = list;
                this.f = set;
                this.g = set2;
            }
        }
    }
}
