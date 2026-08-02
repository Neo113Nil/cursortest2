package ru.ozon.app.android.cart.marketingdetail.presentation;

import G.g;
import Lh.b;
import N3.C3660k;
import Nh.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.marketingdetail.presentation.MarketingDetailsAdapter;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u001bB\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/cart/marketingdetail/presentation/MarketingDetailVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "Lru/ozon/app/android/cart/marketingdetail/presentation/MarketingDetailVO$DetailListItem;", "list", "<init>", "(JLjava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getList", "()Ljava/util/List;", "DetailListItem", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class MarketingDetailVO implements c {
    private final long id;

    @NotNull
    private final List<DetailListItem> list;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/cart/marketingdetail/presentation/MarketingDetailVO$DetailListItem;", "Landroid/os/Parcelable;", "<init>", "()V", "viewType", "Lru/ozon/app/android/cart/marketingdetail/presentation/MarketingDetailsAdapter$ViewType;", "getViewType", "()Lru/ozon/app/android/cart/marketingdetail/presentation/MarketingDetailsAdapter$ViewType;", "Title", "Action", "Total", "Lru/ozon/app/android/cart/marketingdetail/presentation/MarketingDetailVO$DetailListItem$Action;", "Lru/ozon/app/android/cart/marketingdetail/presentation/MarketingDetailVO$DetailListItem$Title;", "Lru/ozon/app/android/cart/marketingdetail/presentation/MarketingDetailVO$DetailListItem$Total;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class DetailListItem implements Parcelable {

        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/cart/marketingdetail/presentation/MarketingDetailVO$DetailListItem$Title;", "Lru/ozon/app/android/cart/marketingdetail/presentation/MarketingDetailVO$DetailListItem;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/app/android/cart/marketingdetail/presentation/MarketingDetailsAdapter$ViewType;", "viewType", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/cart/marketingdetail/presentation/MarketingDetailsAdapter$ViewType;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "Lru/ozon/app/android/cart/marketingdetail/presentation/MarketingDetailsAdapter$ViewType;", "getViewType", "()Lru/ozon/app/android/cart/marketingdetail/presentation/MarketingDetailsAdapter$ViewType;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Title extends DetailListItem {

            @NotNull
            public static final Parcelable.Creator<Title> CREATOR = new Creator();

            @NotNull
            private final String title;

            @NotNull
            private final MarketingDetailsAdapter.ViewType viewType;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Title> {
                @Override // android.os.Parcelable.Creator
                public final Title createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Title(parcel.readString(), MarketingDetailsAdapter.ViewType.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final Title[] newArray(int i11) {
                    return new Title[i11];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Title(@NotNull String title, @NotNull MarketingDetailsAdapter.ViewType viewType) {
                super(null);
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(viewType, "viewType");
                this.title = title;
                this.viewType = viewType;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Title)) {
                    return false;
                }
                Title title = (Title) other;
                return Intrinsics.d(this.title, title.title) && this.viewType == title.viewType;
            }

            @NotNull
            public final String getTitle() {
                return this.title;
            }

            @Override // ru.ozon.app.android.cart.marketingdetail.presentation.MarketingDetailVO.DetailListItem
            @NotNull
            public MarketingDetailsAdapter.ViewType getViewType() {
                return this.viewType;
            }

            public int hashCode() {
                return this.viewType.hashCode() + (this.title.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return "Title(title=" + this.title + ", viewType=" + this.viewType + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.title);
                dest.writeString(this.viewType.name());
            }

            public /* synthetic */ Title(String str, MarketingDetailsAdapter.ViewType viewType, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i11 & 2) != 0 ? MarketingDetailsAdapter.ViewType.TITLE : viewType);
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0011J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/cart/marketingdetail/presentation/MarketingDetailVO$DetailListItem$Total;", "Lru/ozon/app/android/cart/marketingdetail/presentation/MarketingDetailVO$DetailListItem;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, AppMeasurementSdk.ConditionalUserProperty.VALUE, "Lru/ozon/app/android/cart/marketingdetail/presentation/MarketingDetailsAdapter$ViewType;", "viewType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/cart/marketingdetail/presentation/MarketingDetailsAdapter$ViewType;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getValue", "Lru/ozon/app/android/cart/marketingdetail/presentation/MarketingDetailsAdapter$ViewType;", "getViewType", "()Lru/ozon/app/android/cart/marketingdetail/presentation/MarketingDetailsAdapter$ViewType;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Total extends DetailListItem {

            @NotNull
            public static final Parcelable.Creator<Total> CREATOR = new Creator();

            @NotNull
            private final String title;

            @NotNull
            private final String value;

            @NotNull
            private final MarketingDetailsAdapter.ViewType viewType;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Total> {
                @Override // android.os.Parcelable.Creator
                public final Total createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Total(parcel.readString(), parcel.readString(), MarketingDetailsAdapter.ViewType.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final Total[] newArray(int i11) {
                    return new Total[i11];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Total(@NotNull String title, @NotNull String value, @NotNull MarketingDetailsAdapter.ViewType viewType) {
                super(null);
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(value, "value");
                Intrinsics.checkNotNullParameter(viewType, "viewType");
                this.title = title;
                this.value = value;
                this.viewType = viewType;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Total)) {
                    return false;
                }
                Total total = (Total) other;
                return Intrinsics.d(this.title, total.title) && Intrinsics.d(this.value, total.value) && this.viewType == total.viewType;
            }

            @NotNull
            public final String getTitle() {
                return this.title;
            }

            @NotNull
            public final String getValue() {
                return this.value;
            }

            @Override // ru.ozon.app.android.cart.marketingdetail.presentation.MarketingDetailVO.DetailListItem
            @NotNull
            public MarketingDetailsAdapter.ViewType getViewType() {
                return this.viewType;
            }

            public int hashCode() {
                return this.viewType.hashCode() + g.a(this.title.hashCode() * 31, 31, this.value);
            }

            @NotNull
            public String toString() {
                String str = this.title;
                String str2 = this.value;
                MarketingDetailsAdapter.ViewType viewType = this.viewType;
                StringBuilder d11 = C3660k.d("Total(title=", str, ", value=", str2, ", viewType=");
                d11.append(viewType);
                d11.append(")");
                return d11.toString();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.title);
                dest.writeString(this.value);
                dest.writeString(this.viewType.name());
            }

            public /* synthetic */ Total(String str, String str2, MarketingDetailsAdapter.ViewType viewType, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, (i11 & 4) != 0 ? MarketingDetailsAdapter.ViewType.TOTAL : viewType);
            }
        }

        public /* synthetic */ DetailListItem(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public abstract MarketingDetailsAdapter.ViewType getViewType();

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0013J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0015R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001f\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b \u0010\u0015R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/cart/marketingdetail/presentation/MarketingDetailVO$DetailListItem$Action;", "Lru/ozon/app/android/cart/marketingdetail/presentation/MarketingDetailVO$DetailListItem;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", AppMeasurementSdk.ConditionalUserProperty.VALUE, "subValue", "Lru/ozon/app/android/cart/marketingdetail/presentation/MarketingDetailsAdapter$ViewType;", "viewType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/cart/marketingdetail/presentation/MarketingDetailsAdapter$ViewType;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getSubtitle", "getValue", "getSubValue", "Lru/ozon/app/android/cart/marketingdetail/presentation/MarketingDetailsAdapter$ViewType;", "getViewType", "()Lru/ozon/app/android/cart/marketingdetail/presentation/MarketingDetailsAdapter$ViewType;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Action extends DetailListItem {

            @NotNull
            public static final Parcelable.Creator<Action> CREATOR = new Creator();
            private final String subValue;
            private final String subtitle;

            @NotNull
            private final String title;

            @NotNull
            private final String value;

            @NotNull
            private final MarketingDetailsAdapter.ViewType viewType;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Action> {
                @Override // android.os.Parcelable.Creator
                public final Action createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Action(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), MarketingDetailsAdapter.ViewType.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final Action[] newArray(int i11) {
                    return new Action[i11];
                }
            }

            public /* synthetic */ Action(String str, String str2, String str3, String str4, MarketingDetailsAdapter.ViewType viewType, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, str3, str4, (i11 & 16) != 0 ? MarketingDetailsAdapter.ViewType.ACTION : viewType);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Action)) {
                    return false;
                }
                Action action = (Action) other;
                return Intrinsics.d(this.title, action.title) && Intrinsics.d(this.subtitle, action.subtitle) && Intrinsics.d(this.value, action.value) && Intrinsics.d(this.subValue, action.subValue) && this.viewType == action.viewType;
            }

            public final String getSubValue() {
                return this.subValue;
            }

            public final String getSubtitle() {
                return this.subtitle;
            }

            @NotNull
            public final String getTitle() {
                return this.title;
            }

            @NotNull
            public final String getValue() {
                return this.value;
            }

            @Override // ru.ozon.app.android.cart.marketingdetail.presentation.MarketingDetailVO.DetailListItem
            @NotNull
            public MarketingDetailsAdapter.ViewType getViewType() {
                return this.viewType;
            }

            public int hashCode() {
                int hashCode = this.title.hashCode() * 31;
                String str = this.subtitle;
                int a11 = g.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.value);
                String str2 = this.subValue;
                return this.viewType.hashCode() + ((a11 + (str2 != null ? str2.hashCode() : 0)) * 31);
            }

            @NotNull
            public String toString() {
                String str = this.title;
                String str2 = this.subtitle;
                String str3 = this.value;
                String str4 = this.subValue;
                MarketingDetailsAdapter.ViewType viewType = this.viewType;
                StringBuilder d11 = C3660k.d("Action(title=", str, ", subtitle=", str2, ", value=");
                a.h(d11, str3, ", subValue=", str4, ", viewType=");
                d11.append(viewType);
                d11.append(")");
                return d11.toString();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.title);
                dest.writeString(this.subtitle);
                dest.writeString(this.value);
                dest.writeString(this.subValue);
                dest.writeString(this.viewType.name());
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Action(@NotNull String title, String str, @NotNull String value, String str2, @NotNull MarketingDetailsAdapter.ViewType viewType) {
                super(null);
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(value, "value");
                Intrinsics.checkNotNullParameter(viewType, "viewType");
                this.title = title;
                this.subtitle = str;
                this.value = value;
                this.subValue = str2;
                this.viewType = viewType;
            }
        }

        private DetailListItem() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MarketingDetailVO(long j11, @NotNull List<? extends DetailListItem> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.id = j11;
        this.list = list;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarketingDetailVO)) {
            return false;
        }
        MarketingDetailVO marketingDetailVO = (MarketingDetailVO) other;
        return this.id == marketingDetailVO.id && Intrinsics.d(this.list, marketingDetailVO.list);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<DetailListItem> getList() {
        return this.list;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        return this.list.hashCode() + (Long.hashCode(this.id) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder b11 = b.b(this.id, "MarketingDetailVO(id=", ", list=", this.list);
        b11.append(")");
        return b11.toString();
    }
}
