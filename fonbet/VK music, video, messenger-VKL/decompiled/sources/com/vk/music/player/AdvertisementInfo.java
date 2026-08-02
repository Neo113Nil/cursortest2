package com.vk.music.player;

import android.net.Uri;
import android.util.SparseArray;
import defpackage.q0;
import xsna.asp;
import xsna.epx;
import xsna.qoy;
import xsna.shy;
import xsna.zrp;

/* compiled from: AdvertisementInfo.kt */
/* loaded from: classes3.dex */
public final class AdvertisementInfo {
    public final String a;
    public int b = 0;
    public final SparseArray<Uri> c;
    public final boolean d;
    public final boolean e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AdvertisementInfo.kt */
    public static final class Action {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Action[] $VALUES;
        public static final Action AD_CHOICE_CLICK;
        public static final Action CLICK;
        public static final Action VIEW;

        static {
            Action action = new Action("VIEW", 0);
            VIEW = action;
            Action action2 = new Action("CLICK", 1);
            CLICK = action2;
            Action action3 = new Action("AD_CHOICE_CLICK", 2);
            AD_CHOICE_CLICK = action3;
            Action[] actionArr = {action, action2, action3};
            $VALUES = actionArr;
            $ENTRIES = new asp(actionArr);
        }

        public Action() {
            throw null;
        }

        public static Action valueOf(String str) {
            return (Action) Enum.valueOf(Action.class, str);
        }

        public static Action[] values() {
            return (Action[]) $VALUES.clone();
        }
    }

    public AdvertisementInfo(String str, SparseArray sparseArray, boolean z, boolean z2) {
        this.a = str;
        this.c = sparseArray;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertisementInfo)) {
            return false;
        }
        AdvertisementInfo advertisementInfo = (AdvertisementInfo) obj;
        advertisementInfo.getClass();
        return epx.f(this.a, advertisementInfo.a) && this.b == advertisementInfo.b && this.c.equals(advertisementInfo.c) && this.d == advertisementInfo.d && this.e == advertisementInfo.e;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.e) + qoy.b((this.c.hashCode() + shy.a(this.b, (str == null ? 0 : str.hashCode()) * 31, 31)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdvertisementInfo(btnTitle=null, btnUrl=");
        sb.append(this.a);
        sb.append(", duration=");
        sb.append(this.b);
        sb.append(", imgUrls=");
        sb.append(this.c);
        sb.append(", isClickable=");
        sb.append(this.d);
        sb.append(", hasAdChoices=");
        return q0.a(sb, this.e, ')');
    }
}
