package com.vk.superapp.api.dto.widgets.actions;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.asp;
import xsna.c5g;
import xsna.epx;
import xsna.ho8;
import xsna.zrp;

/* compiled from: WebActionRequestPermission.kt */
/* loaded from: classes6.dex */
public final class WebActionRequestPermission extends WebAction {
    public static final a CREATOR = new a();
    public final List<Permission> c;
    public final WebAction d;
    public final String e;
    public final String f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WebActionRequestPermission.kt */
    public static final class Permission {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Permission[] $VALUES;
        public static final Permission CONTACTS;
        public static final Permission GEO;

        static {
            Permission permission = new Permission("GEO", 0);
            GEO = permission;
            Permission permission2 = new Permission("CONTACTS", 1);
            CONTACTS = permission2;
            Permission[] permissionArr = {permission, permission2};
            $VALUES = permissionArr;
            $ENTRIES = new asp(permissionArr);
        }

        public Permission() {
            throw null;
        }

        public static Permission valueOf(String str) {
            return (Permission) Enum.valueOf(Permission.class, str);
        }

        public static Permission[] values() {
            return (Permission[]) $VALUES.clone();
        }
    }

    /* compiled from: WebActionRequestPermission.kt */
    public static final class a implements Parcelable.Creator<WebActionRequestPermission> {
        @Override // android.os.Parcelable.Creator
        public final WebActionRequestPermission createFromParcel(Parcel parcel) {
            return new WebActionRequestPermission(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final WebActionRequestPermission[] newArray(int i) {
            return new WebActionRequestPermission[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WebActionRequestPermission(List<? extends Permission> list, WebAction webAction, String str, String str2) {
        this.c = list;
        this.d = webAction;
        this.e = str;
        this.f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebActionRequestPermission)) {
            return false;
        }
        WebActionRequestPermission webActionRequestPermission = (WebActionRequestPermission) obj;
        return epx.f(this.c, webActionRequestPermission.c) && epx.f(this.d, webActionRequestPermission.d) && epx.f(this.e, webActionRequestPermission.e) && epx.f(this.f, webActionRequestPermission.f);
    }

    @Override // com.vk.superapp.api.dto.widgets.actions.WebAction
    public final String f() {
        return this.e;
    }

    @Override // com.vk.superapp.api.dto.widgets.actions.WebAction
    public final WebAction g() {
        return this.d;
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode() * 31;
        WebAction webAction = this.d;
        int hashCode2 = (hashCode + (webAction == null ? 0 : webAction.hashCode())) * 31;
        String str = this.e;
        return this.f.hashCode() + ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebActionRequestPermission(permissions=");
        sb.append(this.c);
        sb.append(", fallbackAction=");
        sb.append(this.d);
        sb.append(", accessibilityLabel=");
        sb.append(this.e);
        sb.append(", type=");
        return ho8.a(sb, this.f, ')');
    }

    @Override // com.vk.superapp.api.dto.widgets.actions.WebAction, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<Permission> list = this.c;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Permission) it.next()).name());
        }
        parcel.writeStringList(arrayList);
        parcel.writeParcelable(this.d, i);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public WebActionRequestPermission(Parcel parcel) {
        this(r1, (WebAction) parcel.readParcelable(WebAction.class.getClassLoader()), parcel.readString(), parcel.readString());
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        ArrayList arrayList = new ArrayList(c5g.u(createStringArrayList, 10));
        Iterator<T> it = createStringArrayList.iterator();
        while (it.hasNext()) {
            arrayList.add(Permission.valueOf((String) it.next()));
        }
    }
}
