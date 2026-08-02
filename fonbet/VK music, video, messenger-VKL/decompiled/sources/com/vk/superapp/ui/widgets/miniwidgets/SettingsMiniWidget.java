package com.vk.superapp.ui.widgets.miniwidgets;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.external.miniapp.net.app.WebImage;
import com.vk.superapp.api.dto.widgets.actions.WebAction;
import com.vk.superapp.ui.widgets.miniwidgets.MiniWidgetItem;

/* compiled from: SettingsMiniWidget.kt */
/* loaded from: classes6.dex */
public final class SettingsMiniWidget extends MiniWidgetItem {
    public static final a CREATOR = new a();
    public final String h;
    public final WebAction i;
    public final WebImage j;
    public final MiniWidgetItem.HeaderIconAlign k;
    public final String l;
    public final String m;

    /* compiled from: SettingsMiniWidget.kt */
    public static final class a implements Parcelable.Creator<SettingsMiniWidget> {
        @Override // android.os.Parcelable.Creator
        public final SettingsMiniWidget createFromParcel(Parcel parcel) {
            return new SettingsMiniWidget(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final SettingsMiniWidget[] newArray(int i) {
            return new SettingsMiniWidget[i];
        }
    }

    public SettingsMiniWidget(String str, WebAction webAction, WebImage webImage, MiniWidgetItem.HeaderIconAlign headerIconAlign, String str2, String str3) {
        super(str, webAction, webImage, headerIconAlign, str2, false, true);
        this.h = str;
        this.i = webAction;
        this.j = webImage;
        this.k = headerIconAlign;
        this.l = str2;
        this.m = str3;
    }

    @Override // com.vk.superapp.ui.widgets.miniwidgets.MiniWidgetItem
    public final WebAction d() {
        return this.i;
    }

    @Override // com.vk.superapp.ui.widgets.miniwidgets.MiniWidgetItem, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.vk.superapp.ui.widgets.miniwidgets.MiniWidgetItem
    public final MiniWidgetItem.HeaderIconAlign f() {
        return this.k;
    }

    @Override // com.vk.superapp.ui.widgets.miniwidgets.MiniWidgetItem
    public final String g() {
        return this.l;
    }

    @Override // com.vk.superapp.ui.widgets.miniwidgets.MiniWidgetItem
    public final String getType() {
        return this.h;
    }

    @Override // com.vk.superapp.ui.widgets.miniwidgets.MiniWidgetItem, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.h);
        parcel.writeParcelable(this.i, i);
        parcel.writeParcelable(this.j, i);
        parcel.writeInt(this.k.ordinal());
        parcel.writeString(this.l);
        parcel.writeString(this.m);
    }

    public SettingsMiniWidget(Parcel parcel) {
        this(parcel.readString(), (WebAction) parcel.readParcelable(WebAction.class.getClassLoader()), (WebImage) parcel.readParcelable(WebImage.class.getClassLoader()), MiniWidgetItem.HeaderIconAlign.values()[parcel.readInt()], parcel.readString(), parcel.readString());
    }
}
