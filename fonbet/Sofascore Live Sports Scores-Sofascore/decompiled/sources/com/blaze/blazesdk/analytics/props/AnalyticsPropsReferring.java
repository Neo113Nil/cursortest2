package com.blaze.blazesdk.analytics.props;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import defpackage.b6h;
import defpackage.lnb;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001d"}, d2 = {"Lcom/blaze/blazesdk/analytics/props/AnalyticsPropsReferring;", "Landroid/os/Parcelable;", "origin_widget_id", "", "origin_widget_type", "labels_expression", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getOrigin_widget_id", "()Ljava/lang/String;", "getOrigin_widget_type", "getLabels_expression", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class AnalyticsPropsReferring implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<AnalyticsPropsReferring> CREATOR = new a();

    @b6h("labels_expression")
    @Nullable
    private final String labels_expression;

    @b6h("origin_widget_id")
    @Nullable
    private final String origin_widget_id;

    @b6h("origin_widget_type")
    @Nullable
    private final String origin_widget_type;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new AnalyticsPropsReferring(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AnalyticsPropsReferring[i];
        }
    }

    public /* synthetic */ AnalyticsPropsReferring(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }

    public static /* synthetic */ AnalyticsPropsReferring copy$default(AnalyticsPropsReferring analyticsPropsReferring, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = analyticsPropsReferring.origin_widget_id;
        }
        if ((i & 2) != 0) {
            str2 = analyticsPropsReferring.origin_widget_type;
        }
        if ((i & 4) != 0) {
            str3 = analyticsPropsReferring.labels_expression;
        }
        return analyticsPropsReferring.copy(str, str2, str3);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getOrigin_widget_id() {
        return this.origin_widget_id;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getOrigin_widget_type() {
        return this.origin_widget_type;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getLabels_expression() {
        return this.labels_expression;
    }

    @NotNull
    public final AnalyticsPropsReferring copy(@Nullable String origin_widget_id, @Nullable String origin_widget_type, @Nullable String labels_expression) {
        return new AnalyticsPropsReferring(origin_widget_id, origin_widget_type, labels_expression);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnalyticsPropsReferring)) {
            return false;
        }
        AnalyticsPropsReferring analyticsPropsReferring = (AnalyticsPropsReferring) other;
        return Intrinsics.c(this.origin_widget_id, analyticsPropsReferring.origin_widget_id) && Intrinsics.c(this.origin_widget_type, analyticsPropsReferring.origin_widget_type) && Intrinsics.c(this.labels_expression, analyticsPropsReferring.labels_expression);
    }

    @Nullable
    public final String getLabels_expression() {
        return this.labels_expression;
    }

    @Nullable
    public final String getOrigin_widget_id() {
        return this.origin_widget_id;
    }

    @Nullable
    public final String getOrigin_widget_type() {
        return this.origin_widget_type;
    }

    public int hashCode() {
        String str = this.origin_widget_id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.origin_widget_type;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.labels_expression;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("AnalyticsPropsReferring(origin_widget_id=");
        sb.append(this.origin_widget_id);
        sb.append(", origin_widget_type=");
        sb.append(this.origin_widget_type);
        sb.append(", labels_expression=");
        return lnb.q(sb, this.labels_expression, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.origin_widget_id);
        dest.writeString(this.origin_widget_type);
        dest.writeString(this.labels_expression);
    }

    public AnalyticsPropsReferring(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.origin_widget_id = str;
        this.origin_widget_type = str2;
        this.labels_expression = str3;
    }

    public AnalyticsPropsReferring() {
        this(null, null, null, 7, null);
    }
}
