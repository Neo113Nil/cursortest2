package com.vk.catalog.mvi.block.video.impl.downloaded;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.block.CatalogBlockState;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import com.vk.catalog.mvi.section.ui.utils.ParcelableLazyListState;
import io.reactivex.rxjava3.subjects.b;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.czs0;
import xsna.epx;
import xsna.fw3;
import xsna.xvy;
import xsna.zcl;

/* compiled from: DownloadedSliderView.kt */
/* loaded from: classes.dex */
public final class DownloadedSliderView$DownloadedSliderState implements CatalogBlockState {
    public static final Parcelable.Creator<DownloadedSliderView$DownloadedSliderState> CREATOR = new a();
    public final String b;
    public final CatalogBlockVariant c;
    public final String d;
    public final List<czs0> e;
    public final xvy f;

    /* compiled from: DownloadedSliderView.kt */
    /* loaded from: classes16.dex */
    public static final class a implements Parcelable.Creator<DownloadedSliderView$DownloadedSliderState> {
        @Override // android.os.Parcelable.Creator
        public final DownloadedSliderView$DownloadedSliderState createFromParcel(Parcel parcel) {
            String str = ((BlockId.Simple) parcel.readParcelable(DownloadedSliderView$DownloadedSliderState.class.getClassLoader())).b;
            CatalogBlockVariant valueOf = CatalogBlockVariant.valueOf(parcel.readString());
            String readString = parcel.readString();
            ParcelableLazyListState parcelableLazyListState = (ParcelableLazyListState) parcel.readParcelable(DownloadedSliderView$DownloadedSliderState.class.getClassLoader());
            return new DownloadedSliderView$DownloadedSliderState(str, valueOf, readString, null, parcelableLazyListState != null ? parcelableLazyListState.b : null, 8, null);
        }

        @Override // android.os.Parcelable.Creator
        public final DownloadedSliderView$DownloadedSliderState[] newArray(int i) {
            return new DownloadedSliderView$DownloadedSliderState[i];
        }
    }

    public DownloadedSliderView$DownloadedSliderState() {
        throw null;
    }

    public DownloadedSliderView$DownloadedSliderState(String str, CatalogBlockVariant catalogBlockVariant, String str2, List list, xvy xvyVar, int i, zcl zclVar) {
        this(str, catalogBlockVariant, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? EmptyList.b : list, (i & 16) != 0 ? ParcelableLazyListState.d() : xvyVar, null);
    }

    public static DownloadedSliderView$DownloadedSliderState a(DownloadedSliderView$DownloadedSliderState downloadedSliderView$DownloadedSliderState, List list) {
        String str = downloadedSliderView$DownloadedSliderState.b;
        CatalogBlockVariant catalogBlockVariant = downloadedSliderView$DownloadedSliderState.c;
        String str2 = downloadedSliderView$DownloadedSliderState.d;
        xvy xvyVar = downloadedSliderView$DownloadedSliderState.f;
        downloadedSliderView$DownloadedSliderState.getClass();
        return new DownloadedSliderView$DownloadedSliderState(str, catalogBlockVariant, str2, list, xvyVar, null);
    }

    @Override // com.vk.catalog.mvi.block.CatalogBlockState
    public final CatalogBlockVariant M7() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DownloadedSliderView$DownloadedSliderState)) {
            return false;
        }
        DownloadedSliderView$DownloadedSliderState downloadedSliderView$DownloadedSliderState = (DownloadedSliderView$DownloadedSliderState) obj;
        return BlockId.Simple.b(this.b, downloadedSliderView$DownloadedSliderState.b) && this.c == downloadedSliderView$DownloadedSliderState.c && epx.f(this.d, downloadedSliderView$DownloadedSliderState.d) && epx.f(this.e, downloadedSliderView$DownloadedSliderState.e) && ParcelableLazyListState.e(this.f, downloadedSliderView$DownloadedSliderState.f);
    }

    public final int hashCode() {
        int b = b.b(this.c, BlockId.Simple.d(this.b) * 31, 31);
        String str = this.d;
        return ParcelableLazyListState.f(this.f) + fw3.a((b + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DownloadedSliderState(blockId=");
        io.reactivex.rxjava3.processors.b.b(sb, this.b, ", blockVariant=");
        sb.append(this.c);
        sb.append(", title=");
        sb.append(this.d);
        sb.append(", sliderStateList=");
        sb.append(this.e);
        sb.append(", lazyListState=");
        sb.append((Object) ParcelableLazyListState.g(this.f));
        sb.append(')');
        return sb.toString();
    }

    @Override // com.vk.catalog.mvi.block.CatalogBlockState
    public final BlockId w() {
        return BlockId.Simple.a(this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(BlockId.Simple.a(this.b), i);
        parcel.writeString(this.c.name());
        parcel.writeString(this.d);
        parcel.writeParcelable(ParcelableLazyListState.a(this.f), i);
    }

    public DownloadedSliderView$DownloadedSliderState(String str, CatalogBlockVariant catalogBlockVariant, String str2, List list, xvy xvyVar, zcl zclVar) {
        this.b = str;
        this.c = catalogBlockVariant;
        this.d = str2;
        this.e = list;
        this.f = xvyVar;
    }
}
