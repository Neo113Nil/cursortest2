package com.vk.catalog2.common.dto.api.music;

import com.vk.catalog2.common.dto.api.CatalogButton;
import com.vk.catalog2.common.dto.api.CatalogButtonOpenUrl;
import com.vk.core.serialize.Serializer;
import com.vk.dto.music.Concert;
import com.vk.log.L;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.aay;
import xsna.epx;
import xsna.ho8;

/* compiled from: CatalogConcertItem.kt */
/* loaded from: classes16.dex */
public final class CatalogConcertItem extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<CatalogConcertItem> CREATOR = new b();
    public static final a e = new a();
    public final Concert b;
    public final CatalogButtonOpenUrl c;
    public final String d;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<CatalogConcertItem> {
        @Override // xsna.aay
        public final CatalogConcertItem a(JSONObject jSONObject) {
            return new CatalogConcertItem(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<CatalogConcertItem> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CatalogConcertItem a(Serializer serializer) {
            return new CatalogConcertItem(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogConcertItem[i];
        }
    }

    static {
        new CatalogConcertItem(Concert.l, null, null);
    }

    public CatalogConcertItem(Concert concert, CatalogButtonOpenUrl catalogButtonOpenUrl, String str) {
        this.b = concert;
        this.c = catalogButtonOpenUrl;
        this.d = str;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.b);
        serializer.i0(this.c);
        serializer.j0(this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogConcertItem)) {
            return false;
        }
        CatalogConcertItem catalogConcertItem = (CatalogConcertItem) obj;
        return epx.f(this.b, catalogConcertItem.b) && epx.f(this.c, catalogConcertItem.c) && epx.f(this.d, catalogConcertItem.d);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        CatalogButtonOpenUrl catalogButtonOpenUrl = this.c;
        int hashCode2 = (hashCode + (catalogButtonOpenUrl == null ? 0 : catalogButtonOpenUrl.hashCode())) * 31;
        String str = this.d;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogConcertItem(id=");
        Concert concert = this.b;
        sb.append(concert.b);
        sb.append(", name=");
        return ho8.a(sb, concert.c, ')');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CatalogConcertItem(JSONObject jSONObject) {
        this(r0, r1 instanceof CatalogButtonOpenUrl ? (CatalogButtonOpenUrl) r1 : null, jSONObject.optString("track_code"));
        Object obj;
        Concert concert = new Concert(jSONObject.optJSONObject("concert_data"));
        CatalogButton.b bVar = CatalogButton.b;
        if (jSONObject.has("purchase_action")) {
            try {
                obj = bVar.a(jSONObject.getJSONObject("purchase_action"));
            } catch (JSONException e2) {
                L.i(e2);
            }
        }
        obj = null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CatalogConcertItem(Serializer serializer) {
        this(r0, (CatalogButtonOpenUrl) serializer.G(CatalogButtonOpenUrl.class.getClassLoader()), serializer.H());
        Concert concert = (Concert) serializer.G(Concert.class.getClassLoader());
        if (concert == null) {
            Serializer.c<Concert> cVar = Concert.CREATOR;
            concert = Concert.l;
        }
    }
}
