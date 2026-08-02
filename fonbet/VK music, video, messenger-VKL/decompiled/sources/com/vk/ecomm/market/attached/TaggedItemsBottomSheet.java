package com.vk.ecomm.market.attached;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.market.api.di.MarketComponent;
import com.vk.fave.di.FaveComponent;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketContextContent;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vkontakte.android.R;
import java.util.HashSet;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import xsna.a1o0;
import xsna.ao50;
import xsna.bd0;
import xsna.c1o0;
import xsna.d1o0;
import xsna.dw20;
import xsna.e1o0;
import xsna.ef90;
import xsna.epx;
import xsna.f1o0;
import xsna.fhb0;
import xsna.fnj;
import xsna.fpf0;
import xsna.g010;
import xsna.gm50;
import xsna.h7m;
import xsna.iah0;
import xsna.if90;
import xsna.km50;
import xsna.l7s;
import xsna.mk50;
import xsna.msy;
import xsna.nr;
import xsna.ofc0;
import xsna.q530;
import xsna.rrn0;
import xsna.sn;
import xsna.tf90;
import xsna.tl50;
import xsna.tzp0;
import xsna.up2;
import xsna.vk50;
import xsna.vqb;
import xsna.xn50;
import xsna.yfb;
import xsna.yka0;
import xsna.z0o0;

/* compiled from: TaggedItemsBottomSheet.kt */
/* loaded from: classes18.dex */
public final class TaggedItemsBottomSheet extends tl50<f1o0, z0o0, a1o0> {
    public static final /* synthetic */ int o1 = 0;
    public final FrameLayout.LayoutParams i1 = new FrameLayout.LayoutParams(-1, -1);
    public final Object j1;
    public final Object k1;
    public String l1;
    public final b m1;
    public final fhb0 n1;

    /* compiled from: TaggedItemsBottomSheet.kt */
    public static final class FragmentArgs implements Parcelable {
        public static final Parcelable.Creator<FragmentArgs> CREATOR = new a();
        public final UserId b;
        public final int c;
        public final String d;
        public final String e;
        public final Boolean f;
        public final Boolean g;
        public final Integer h;
        public final CommonMarketStat$TypeMarketContextContent.Type i;
        public final Long j;
        public final CommonMarketStat$TypeRefSource k;

        /* compiled from: TaggedItemsBottomSheet.kt */
        public static final class a implements Parcelable.Creator<FragmentArgs> {
            @Override // android.os.Parcelable.Creator
            public final FragmentArgs createFromParcel(Parcel parcel) {
                Boolean valueOf;
                Boolean valueOf2;
                UserId userId = (UserId) parcel.readParcelable(FragmentArgs.class.getClassLoader());
                int readInt = parcel.readInt();
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new FragmentArgs(userId, readInt, readString, readString2, valueOf, valueOf2, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : CommonMarketStat$TypeMarketContextContent.Type.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? CommonMarketStat$TypeRefSource.valueOf(parcel.readString()) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final FragmentArgs[] newArray(int i) {
                return new FragmentArgs[i];
            }
        }

        public FragmentArgs(UserId userId, int i, String str, String str2, Boolean bool, Boolean bool2, Integer num, CommonMarketStat$TypeMarketContextContent.Type type, Long l, CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource) {
            this.b = userId;
            this.c = i;
            this.d = str;
            this.e = str2;
            this.f = bool;
            this.g = bool2;
            this.h = num;
            this.i = type;
            this.j = l;
            this.k = commonMarketStat$TypeRefSource;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.b, i);
            parcel.writeInt(this.c);
            parcel.writeString(this.d);
            parcel.writeString(this.e);
            Boolean bool = this.f;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool);
            }
            Boolean bool2 = this.g;
            if (bool2 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool2);
            }
            Integer num = this.h;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num);
            }
            CommonMarketStat$TypeMarketContextContent.Type type = this.i;
            if (type == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(type.name());
            }
            Long l = this.j;
            if (l == null) {
                parcel.writeInt(0);
            } else {
                io.reactivex.rxjava3.subjects.b.f(parcel, 1, l);
            }
            CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource = this.k;
            if (commonMarketStat$TypeRefSource == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(commonMarketStat$TypeRefSource.name());
            }
        }
    }

    /* compiled from: TaggedItemsBottomSheet.kt */
    public static final class a extends dw20.b {
        public final e1o0 e;

        public a(e1o0 e1o0Var, Context context) {
            super(context, tzp0.a(null, 3));
            this.e = e1o0Var;
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            TaggedItemsBottomSheet taggedItemsBottomSheet = new TaggedItemsBottomSheet();
            e1o0 e1o0Var = this.e;
            taggedItemsBottomSheet.setArguments(yfb.b(new Pair("tagged_goods_args", new FragmentArgs(e1o0Var.a, e1o0Var.b, e1o0Var.c, e1o0Var.d, e1o0Var.e, e1o0Var.f, e1o0Var.g, e1o0Var.h, e1o0Var.i, e1o0Var.j))));
            return taggedItemsBottomSheet;
        }
    }

    /* compiled from: TaggedItemsBottomSheet.kt */
    public static final class b implements tf90 {
        public b() {
        }

        @Override // xsna.tf90
        public final void a() {
            TaggedItemsBottomSheet taggedItemsBottomSheet = TaggedItemsBottomSheet.this;
            taggedItemsBottomSheet.getClass();
            xn50.a.c(taggedItemsBottomSheet, a1o0.c.b);
        }
    }

    public TaggedItemsBottomSheet() {
        ofc0 ofc0Var = new ofc0(this, 14);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.j1 = msy.a(lazyThreadSafetyMode, ofc0Var);
        this.k1 = msy.a(lazyThreadSafetyMode, new rrn0(this, 1));
        this.m1 = new b();
        this.n1 = new fhb0(this, 10);
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        Context Mn = Mn();
        return new mk50.c(LayoutInflater.from(Mn != null ? new l7s(Mn, this.A0) : mo2getContext()).inflate(R.layout.market_tagged_goods, (ViewGroup) null, false));
    }

    @Override // xsna.dw20
    public final FrameLayout.LayoutParams In() {
        return this.i1;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        z0o0 z0o0Var = (z0o0) ao50Var;
        ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.progress_bar);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        TextView textView = (TextView) view.findViewById(R.id.toolbarTitle);
        ImageView imageView = (ImageView) view.findViewById(R.id.close_button);
        if90 if90Var = new if90(this.m1);
        Boolean bool = bo().g;
        int i = 0;
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        ?? r4 = this.j1;
        q530 f = up2.f((h7m) r4.getValue(), requireContext(), this);
        g010 g010Var = new g010(this.n1, recyclerView, booleanValue, f, ((FaveComponent) ((h7m) r4.getValue()).mo408a(fpf0.a(FaveComponent.class))).xf());
        f.d(g010Var);
        recyclerView.setAdapter(g010Var);
        Context requireContext = requireContext();
        HashSet hashSet = iah0.a;
        int i2 = fnj.d(requireContext) ? 3 : 2;
        requireContext();
        d1o0 d1o0Var = new d1o0(g010Var, i2);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(i2);
        gridLayoutManager.x = d1o0Var;
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setItemAnimator(null);
        recyclerView.addOnScrollListener(new ef90(if90Var));
        Boolean bool2 = bo().f;
        Boolean bool3 = bo().g;
        Boolean bool4 = Boolean.TRUE;
        textView.setText(requireContext().getString((epx.f(bool2, bool4) && epx.f(bool3, bool4)) ? R.string.photo_tagged_goods_and_services : epx.f(bool3, bool4) ? R.string.photo_tagged_services : epx.f(bool2, bool4) ? R.string.photo_tagged_goods_short : R.string.photo_tagged_goods));
        imageView.setOnClickListener(new bd0(this, 15));
        gm50.a.b(this, z0o0Var.b, new c1o0(i, progressBar, recyclerView));
        gm50.a.b(this, z0o0Var.a, new yka0(this, 14));
        gm50.a.b(this, z0o0Var.c, new vqb(recyclerView, progressBar, this, g010Var, 2));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final FragmentArgs bo() {
        return (FragmentArgs) this.k1.getValue();
    }

    @Override // xsna.tl50, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        xn50.a.c(this, a1o0.b.b);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        Parcelable parcelable;
        Object parcelable2;
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable2 = bundle.getParcelable("tagged_goods_args", FragmentArgs.class);
            parcelable = (Parcelable) parcelable2;
        } else {
            Parcelable parcelable3 = bundle.getParcelable("tagged_goods_args");
            if (!(parcelable3 instanceof FragmentArgs)) {
                parcelable3 = null;
            }
            parcelable = (FragmentArgs) parcelable3;
        }
        FragmentArgs fragmentArgs = (FragmentArgs) parcelable;
        this.l1 = fragmentArgs.e;
        return new f1o0(fragmentArgs, ((MarketComponent) ((h7m) this.j1.getValue()).a(fpf0.a(MarketComponent.class))).U1());
    }
}
