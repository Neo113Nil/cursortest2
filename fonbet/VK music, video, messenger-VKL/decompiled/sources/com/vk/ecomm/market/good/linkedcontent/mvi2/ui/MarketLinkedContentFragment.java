package com.vk.ecomm.market.good.linkedcontent.mvi2.ui;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.market.api.marketlinkedcontent.router.LinkedContentAnalyticsParams;
import defpackage.q0;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.bh10;
import xsna.cvs;
import xsna.epx;
import xsna.fpf0;
import xsna.jai;
import xsna.k7z;
import xsna.m710;
import xsna.msy;
import xsna.o9d;
import xsna.oz50;
import xsna.q610;
import xsna.qcy;
import xsna.tvj;
import xsna.u1h0;
import xsna.x2e;

/* compiled from: MarketLinkedContentFragment.kt */
/* loaded from: classes18.dex */
public final class MarketLinkedContentFragment extends FragmentImpl {
    public static final /* synthetic */ qcy<Object>[] R;
    public final Object N;
    public final Object O;
    public final Object P;
    public final u1h0 Q;

    /* compiled from: MarketLinkedContentFragment.kt */
    public static final class LinkedContentArguments implements Parcelable {
        public static final Parcelable.Creator<LinkedContentArguments> CREATOR = new a();
        public final UserId b;
        public final long c;
        public final LinkedContentAnalyticsParams d;
        public final boolean e;

        /* compiled from: MarketLinkedContentFragment.kt */
        public static final class a implements Parcelable.Creator<LinkedContentArguments> {
            @Override // android.os.Parcelable.Creator
            public final LinkedContentArguments createFromParcel(Parcel parcel) {
                return new LinkedContentArguments((UserId) parcel.readParcelable(LinkedContentArguments.class.getClassLoader()), parcel.readLong(), (LinkedContentAnalyticsParams) parcel.readParcelable(LinkedContentArguments.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final LinkedContentArguments[] newArray(int i) {
                return new LinkedContentArguments[i];
            }
        }

        public LinkedContentArguments(UserId userId, long j, LinkedContentAnalyticsParams linkedContentAnalyticsParams, boolean z) {
            this.b = userId;
            this.c = j;
            this.d = linkedContentAnalyticsParams;
            this.e = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LinkedContentArguments)) {
                return false;
            }
            LinkedContentArguments linkedContentArguments = (LinkedContentArguments) obj;
            return epx.f(this.b, linkedContentArguments.b) && this.c == linkedContentArguments.c && epx.f(this.d, linkedContentArguments.d) && this.e == linkedContentArguments.e;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.e) + ((this.d.hashCode() + bh10.a(Long.hashCode(this.b.b) * 31, 31, this.c)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("LinkedContentArguments(ownerId=");
            sb.append(this.b);
            sb.append(", goodId=");
            sb.append(this.c);
            sb.append(", analyticsParams=");
            sb.append(this.d);
            sb.append(", isService=");
            return q0.a(sb, this.e, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.b, i);
            parcel.writeLong(this.c);
            parcel.writeParcelable(this.d, i);
            parcel.writeInt(this.e ? 1 : 0);
        }
    }

    /* compiled from: MarketLinkedContentFragment.kt */
    public static final class a extends oz50 {
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(MarketLinkedContentFragment.class, "linkedContentStore", "getLinkedContentStore()Lcom/vk/ecomm/market/good/linkedcontent/mvi2/MarketLinkedContentStore;", 0);
        fpf0.a.getClass();
        R = new qcy[]{propertyReference1Impl};
    }

    public MarketLinkedContentFragment() {
        tvj tvjVar = new tvj(this, 22);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.N = msy.a(lazyThreadSafetyMode, tvjVar);
        this.O = msy.a(lazyThreadSafetyMode, new k7z(this, 2));
        this.P = msy.a(lazyThreadSafetyMode, new cvs(this, 15));
        this.Q = new u1h0(fpf0.d(m710.class).toString(), this, this, new x2e(this, 29));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ComposeView composeView = new ComposeView(requireContext(), null, 6);
        composeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        composeView.setContent(new jai(1337380460, new o9d(5, this, composeView), true));
        return composeView;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        qcy<Object> qcyVar = R[0];
        ((m710) this.Q.getValue()).b(q610.c.b);
    }
}
