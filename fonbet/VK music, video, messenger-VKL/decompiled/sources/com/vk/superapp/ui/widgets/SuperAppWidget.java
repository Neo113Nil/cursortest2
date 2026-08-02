package com.vk.superapp.ui.widgets;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.superapp.api.dto.menu.QueueSettings;
import com.vk.superapp.api.dto.menu.UpdateOptions;
import com.vk.superapp.api.dto.menu.WidgetIds;
import com.vk.superapp.api.dto.menu.WidgetSettings;
import xsna.zcl;

/* compiled from: SuperAppWidget.kt */
/* loaded from: classes6.dex */
public abstract class SuperAppWidget implements Parcelable {
    public final WidgetIds b;
    public final String c;
    public final String d;
    public final SuperAppWidgetSize e;
    public final WidgetSettings f;
    public final double g;
    public final UpdateOptions h;
    public String i;

    public SuperAppWidget(WidgetIds widgetIds, String str, String str2, SuperAppWidgetSize superAppWidgetSize, QueueSettings queueSettings, WidgetSettings widgetSettings, double d, UpdateOptions updateOptions, String str3) {
        this.b = widgetIds;
        this.c = str;
        this.d = str2;
        this.e = superAppWidgetSize;
        this.f = widgetSettings;
        this.g = d;
        this.h = updateOptions;
        this.i = str3;
    }

    public abstract SuperAppWidget b(boolean z);

    public WidgetIds d() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public WidgetSettings e() {
        return this.f;
    }

    public double f() {
        return this.g;
    }

    public String getType() {
        return this.c;
    }

    public String r() {
        return this.d;
    }

    public /* synthetic */ SuperAppWidget(WidgetIds widgetIds, String str, String str2, SuperAppWidgetSize superAppWidgetSize, QueueSettings queueSettings, WidgetSettings widgetSettings, double d, UpdateOptions updateOptions, String str3, int i, zcl zclVar) {
        this(widgetIds, str, str2, superAppWidgetSize, queueSettings, widgetSettings, d, (i & 128) != 0 ? null : updateOptions, (i & 256) != 0 ? null : str3);
    }

    public SuperAppWidget g(SuperAppWidget superAppWidget) {
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
    }
}
