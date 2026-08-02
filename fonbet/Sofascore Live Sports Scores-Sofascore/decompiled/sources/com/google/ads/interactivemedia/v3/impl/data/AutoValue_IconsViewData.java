package com.google.ads.interactivemedia.v3.impl.data;

import defpackage.wt3;
import defpackage.yhk;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
final class AutoValue_IconsViewData extends IconsViewData {
    private final List<IconData> icons;

    public AutoValue_IconsViewData(List<IconData> list) {
        if (list != null) {
            this.icons = list;
        } else {
            yhk.s("Null icons");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof IconsViewData) {
            return this.icons.equals(((IconsViewData) obj).icons());
        }
        return false;
    }

    public int hashCode() {
        return this.icons.hashCode() ^ 1000003;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.IconsViewData
    public List<IconData> icons() {
        return this.icons;
    }

    public String toString() {
        String valueOf = String.valueOf(this.icons);
        return wt3.m("IconsViewData{icons=", valueOf, new StringBuilder(valueOf.length() + 21), "}");
    }
}
