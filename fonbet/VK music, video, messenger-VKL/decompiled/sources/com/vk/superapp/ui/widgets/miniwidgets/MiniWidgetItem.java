package com.vk.superapp.ui.widgets.miniwidgets;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.vk.external.miniapp.net.app.WebImage;
import com.vk.superapp.api.dto.widgets.actions.WebAction;
import xsna.asp;
import xsna.enx0;
import xsna.zrp;

/* compiled from: MiniWidgetItem.kt */
/* loaded from: classes6.dex */
public abstract class MiniWidgetItem implements Parcelable, enx0 {
    public final String b;
    public final WebAction c;
    public final HeaderIconAlign d;
    public final String e;
    public final boolean f;
    public final boolean g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MiniWidgetItem.kt */
    public static final class HeaderIconAlign {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ HeaderIconAlign[] $VALUES;
        public static final HeaderIconAlign BOTTOM;
        public static final HeaderIconAlign TOP;
        public static final HeaderIconAlign UNKNOWN;

        static {
            HeaderIconAlign headerIconAlign = new HeaderIconAlign("TOP", 0);
            TOP = headerIconAlign;
            HeaderIconAlign headerIconAlign2 = new HeaderIconAlign("BOTTOM", 1);
            BOTTOM = headerIconAlign2;
            HeaderIconAlign headerIconAlign3 = new HeaderIconAlign(GrsBaseInfo.CountryCodeSource.UNKNOWN, 2);
            UNKNOWN = headerIconAlign3;
            HeaderIconAlign[] headerIconAlignArr = {headerIconAlign, headerIconAlign2, headerIconAlign3};
            $VALUES = headerIconAlignArr;
            $ENTRIES = new asp(headerIconAlignArr);
        }

        public HeaderIconAlign() {
            throw null;
        }

        public static HeaderIconAlign valueOf(String str) {
            return (HeaderIconAlign) Enum.valueOf(HeaderIconAlign.class, str);
        }

        public static HeaderIconAlign[] values() {
            return (HeaderIconAlign[]) $VALUES.clone();
        }
    }

    public MiniWidgetItem(String str, WebAction webAction, WebImage webImage, HeaderIconAlign headerIconAlign, String str2, boolean z, boolean z2) {
        this.b = str;
        this.c = webAction;
        this.d = headerIconAlign;
        this.e = str2;
        this.f = z;
        this.g = z2;
    }

    public WebAction d() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean e() {
        return this.f;
    }

    public HeaderIconAlign f() {
        return this.d;
    }

    public String g() {
        return this.e;
    }

    public String getType() {
        return this.b;
    }

    public boolean i() {
        return this.g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
    }
}
