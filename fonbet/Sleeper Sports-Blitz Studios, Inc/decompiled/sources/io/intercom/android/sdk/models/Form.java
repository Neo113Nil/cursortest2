package io.intercom.android.sdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Form.kt */
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÇ\u0001J\b\u0010\u0015\u001a\u00020\u0016H\u0007J\u0013\u0010\u0017\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H×\u0003J\t\u0010\u001a\u001a\u00020\u0016H×\u0001J\t\u0010\u001b\u001a\u00020\u0003H×\u0001J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0016H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006!"}, d2 = {"Lio/intercom/android/sdk/models/Form;", "Landroid/os/Parcelable;", "type", "", "attributes", "", "Lio/intercom/android/sdk/models/Attribute;", "disabled", "", "<init>", "(Ljava/lang/String;Ljava/util/List;Z)V", "getType", "()Ljava/lang/String;", "getAttributes", "()Ljava/util/List;", "getDisabled", "()Z", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class Form implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<Form> CREATOR = new Creator();

    @SerializedName("attributes")
    private final List<Attribute> attributes;

    @SerializedName("disabled")
    private final boolean disabled;

    @SerializedName("type")
    private final String type;

    /* compiled from: Form.kt */
    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Form> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Form createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(Attribute.CREATOR.createFromParcel(parcel));
            }
            return new Form(readString, arrayList, parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Form[] newArray(int i) {
            return new Form[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Form copy$default(Form form, String str, List list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = form.type;
        }
        if ((i & 2) != 0) {
            list = form.attributes;
        }
        if ((i & 4) != 0) {
            z = form.disabled;
        }
        return form.copy(str, list, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final List<Attribute> component2() {
        return this.attributes;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getDisabled() {
        return this.disabled;
    }

    public final Form copy(String type, List<Attribute> attributes, boolean disabled) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        return new Form(type, attributes, disabled);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Form)) {
            return false;
        }
        Form form = (Form) other;
        return Intrinsics.areEqual(this.type, form.type) && Intrinsics.areEqual(this.attributes, form.attributes) && this.disabled == form.disabled;
    }

    public int hashCode() {
        return (((this.type.hashCode() * 31) + this.attributes.hashCode()) * 31) + Boolean.hashCode(this.disabled);
    }

    public String toString() {
        return "Form(type=" + this.type + ", attributes=" + this.attributes + ", disabled=" + this.disabled + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.type);
        List<Attribute> list = this.attributes;
        dest.writeInt(list.size());
        Iterator<Attribute> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
        dest.writeInt(this.disabled ? 1 : 0);
    }

    public Form(String type, List<Attribute> attributes, boolean z) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        this.type = type;
        this.attributes = attributes;
        this.disabled = z;
    }

    public final String getType() {
        return this.type;
    }

    public final List<Attribute> getAttributes() {
        return this.attributes;
    }

    public final boolean getDisabled() {
        return this.disabled;
    }
}
