package ru.ozon.id.nativeauth.data.models;

import C.J;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Html;
import com.squareup.moshi.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.id.nativeauth.data.models.RestoreAccesDTO;
import ru.ozon.uni.atoms.html.OzonHtmlParser;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import zc0.C11092g;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJD\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0017J\u0010\u0010!\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b!\u0010\u0015J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u0019R\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b,\u0010\u001bR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b.\u0010\u001d¨\u0006/"}, d2 = {"Lru/ozon/id/nativeauth/data/models/RestoreAccesVO;", "Landroid/os/Parcelable;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "subtitle", "", "Lzc0/g$a;", "cells", "Lru/ozon/id/nativeauth/data/models/RestoreAccesDTO$FeatureFlags;", "featureFlags", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/util/List;Lru/ozon/id/nativeauth/data/models/RestoreAccesDTO$FeatureFlags;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "component3", "()Ljava/util/List;", "component4", "()Lru/ozon/id/nativeauth/data/models/RestoreAccesDTO$FeatureFlags;", "copy", "(Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/util/List;Lru/ozon/id/nativeauth/data/models/RestoreAccesDTO$FeatureFlags;)Lru/ozon/id/nativeauth/data/models/RestoreAccesVO;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getSubtitle", "Ljava/util/List;", "getCells", "Lru/ozon/id/nativeauth/data/models/RestoreAccesDTO$FeatureFlags;", "getFeatureFlags", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RestoreAccesVO implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RestoreAccesVO> CREATOR = new a();
    private final List<C11092g.a> cells;
    private final RestoreAccesDTO.FeatureFlags featureFlags;
    private final OzonSpannableString subtitle;

    @NotNull
    private final String title;

    public static final class a implements Parcelable.Creator<RestoreAccesVO> {
        @Override // android.os.Parcelable.Creator
        public final RestoreAccesVO createFromParcel(Parcel parcel) {
            OzonSpannableString ozonSpannableString;
            ArrayList arrayList;
            int i11 = 0;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (parcel.readInt() == 0) {
                ozonSpannableString = null;
            } else {
                String readString2 = parcel.readString();
                if (readString2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                ozonSpannableString = OzonSpannableStringKt.toOzonSpannableString(h.A0(OzonHtmlParser.INSTANCE.parseHtml(readString2, 63), '\n'));
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                while (i11 != readInt) {
                    i11 = Ak.b.b(C11092g.a.CREATOR, parcel, arrayList, i11, 1);
                }
            }
            return new RestoreAccesVO(readString, ozonSpannableString, arrayList, parcel.readInt() != 0 ? RestoreAccesDTO.FeatureFlags.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final RestoreAccesVO[] newArray(int i11) {
            return new RestoreAccesVO[i11];
        }
    }

    public RestoreAccesVO(@NotNull String title, OzonSpannableString ozonSpannableString, List<C11092g.a> list, RestoreAccesDTO.FeatureFlags featureFlags) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.title = title;
        this.subtitle = ozonSpannableString;
        this.cells = list;
        this.featureFlags = featureFlags;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RestoreAccesVO copy$default(RestoreAccesVO restoreAccesVO, String str, OzonSpannableString ozonSpannableString, List list, RestoreAccesDTO.FeatureFlags featureFlags, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = restoreAccesVO.title;
        }
        if ((i11 & 2) != 0) {
            ozonSpannableString = restoreAccesVO.subtitle;
        }
        if ((i11 & 4) != 0) {
            list = restoreAccesVO.cells;
        }
        if ((i11 & 8) != 0) {
            featureFlags = restoreAccesVO.featureFlags;
        }
        return restoreAccesVO.copy(str, ozonSpannableString, list, featureFlags);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final OzonSpannableString getSubtitle() {
        return this.subtitle;
    }

    public final List<C11092g.a> component3() {
        return this.cells;
    }

    /* renamed from: component4, reason: from getter */
    public final RestoreAccesDTO.FeatureFlags getFeatureFlags() {
        return this.featureFlags;
    }

    @NotNull
    public final RestoreAccesVO copy(@NotNull String title, OzonSpannableString subtitle, List<C11092g.a> cells, RestoreAccesDTO.FeatureFlags featureFlags) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new RestoreAccesVO(title, subtitle, cells, featureFlags);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RestoreAccesVO)) {
            return false;
        }
        RestoreAccesVO restoreAccesVO = (RestoreAccesVO) other;
        return Intrinsics.d(this.title, restoreAccesVO.title) && Intrinsics.d(this.subtitle, restoreAccesVO.subtitle) && Intrinsics.d(this.cells, restoreAccesVO.cells) && Intrinsics.d(this.featureFlags, restoreAccesVO.featureFlags);
    }

    public final List<C11092g.a> getCells() {
        return this.cells;
    }

    public final RestoreAccesDTO.FeatureFlags getFeatureFlags() {
        return this.featureFlags;
    }

    public final OzonSpannableString getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        OzonSpannableString ozonSpannableString = this.subtitle;
        int hashCode2 = (hashCode + (ozonSpannableString == null ? 0 : ozonSpannableString.hashCode())) * 31;
        List<C11092g.a> list = this.cells;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        RestoreAccesDTO.FeatureFlags featureFlags = this.featureFlags;
        return hashCode3 + (featureFlags != null ? featureFlags.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        OzonSpannableString ozonSpannableString = this.subtitle;
        return "RestoreAccesVO(title=" + str + ", subtitle=" + ((Object) ozonSpannableString) + ", cells=" + this.cells + ", featureFlags=" + this.featureFlags + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.title);
        OzonSpannableString ozonSpannableString = this.subtitle;
        Intrinsics.checkNotNullParameter(dest, "parcel");
        if (ozonSpannableString == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(Html.toHtml(ozonSpannableString, 1));
        }
        List<C11092g.a> list = this.cells;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator c11 = J.c(dest, 1, list);
            while (c11.hasNext()) {
                ((C11092g.a) c11.next()).writeToParcel(dest, flags);
            }
        }
        RestoreAccesDTO.FeatureFlags featureFlags = this.featureFlags;
        if (featureFlags == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            featureFlags.writeToParcel(dest, flags);
        }
    }
}
