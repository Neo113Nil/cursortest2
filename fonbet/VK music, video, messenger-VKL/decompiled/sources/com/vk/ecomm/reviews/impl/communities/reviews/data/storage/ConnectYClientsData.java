package com.vk.ecomm.reviews.impl.communities.reviews.data.storage;

import xsna.epx;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: ConnectYClientsData.kt */
/* loaded from: classes18.dex */
public final class ConnectYClientsData {

    @pmi0("hideCount")
    private final int hideCount;

    @pmi0("lastHideDate")
    private final String lastHideDate;

    public ConnectYClientsData(String str, int i) {
        this.lastHideDate = str;
        this.hideCount = i;
    }

    public final int a() {
        return this.hideCount;
    }

    public final String b() {
        return this.lastHideDate;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConnectYClientsData)) {
            return false;
        }
        ConnectYClientsData connectYClientsData = (ConnectYClientsData) obj;
        return epx.f(this.lastHideDate, connectYClientsData.lastHideDate) && this.hideCount == connectYClientsData.hideCount;
    }

    public final int hashCode() {
        return Integer.hashCode(this.hideCount) + (this.lastHideDate.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConnectYClientsData(lastHideDate=");
        sb.append(this.lastHideDate);
        sb.append(", hideCount=");
        return vu5.b(sb, this.hideCount, ')');
    }
}
