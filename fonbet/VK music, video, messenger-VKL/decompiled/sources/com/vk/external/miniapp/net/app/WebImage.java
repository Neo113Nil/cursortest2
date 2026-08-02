package com.vk.external.miniapp.net.app;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.external.miniapp.net.app.WebImageSize;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.arm0;
import xsna.brm0;
import xsna.epx;
import xsna.j5g;
import xsna.ms9;

/* compiled from: WebImage.kt */
/* loaded from: classes18.dex */
public final class WebImage implements Parcelable {
    public static final a CREATOR = new a();
    public final List<WebImageSize> b;

    /* compiled from: WebImage.kt */
    public static final class a implements Parcelable.Creator<WebImage> {
        public static WebImage a(JSONArray jSONArray) throws JSONException {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; jSONArray != null && i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    WebImageSize.CREATOR.getClass();
                    arrayList.add(WebImageSize.a.b(optJSONObject));
                }
            }
            return new WebImage(arrayList);
        }

        public static WebImage b(JSONObject jSONObject) throws JSONException {
            Integer m;
            String optString = jSONObject.optString("photo_base");
            if (optString != null && optString.length() != 0) {
                return c(optString);
            }
            ArrayList arrayList = new ArrayList();
            if (jSONObject.length() > 0) {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (brm0.B(next, "photo_", false) && (m = arm0.m(10, next.substring(6))) != null) {
                        int intValue = m.intValue();
                        arrayList.add(new WebImageSize(jSONObject.getString(next), intValue, intValue, (char) 0, false, null, 56, null));
                    }
                }
            }
            return new WebImage(arrayList);
        }

        public static WebImage c(String str) {
            WebImageSize.CREATOR.getClass();
            return new WebImage((List<WebImageSize>) Collections.singletonList(WebImageSize.a.a(null, str)));
        }

        @Override // android.os.Parcelable.Creator
        public final WebImage createFromParcel(Parcel parcel) {
            return new WebImage(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final WebImage[] newArray(int i) {
            return new WebImage[i];
        }
    }

    public WebImage(List<WebImageSize> list) {
        this.b = list;
    }

    public final WebImageSize d() {
        List<WebImageSize> list = this.b;
        Object obj = null;
        if (list.isEmpty()) {
            return null;
        }
        Iterator<T> it = list.iterator();
        if (it.hasNext()) {
            obj = it.next();
            if (it.hasNext()) {
                WebImageSize webImageSize = (WebImageSize) obj;
                int i = webImageSize.d * webImageSize.c;
                do {
                    Object next = it.next();
                    WebImageSize webImageSize2 = (WebImageSize) next;
                    int i2 = webImageSize2.d * webImageSize2.c;
                    if (i < i2) {
                        obj = next;
                        i = i2;
                    }
                } while (it.hasNext());
            }
        }
        return (WebImageSize) obj;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final WebImageSize e(int i) {
        WebImageSize webImageSize;
        Object obj;
        List<WebImageSize> list = this.b;
        Iterator<T> it = list.iterator();
        while (true) {
            webImageSize = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (epx.f(((WebImageSize) obj).g, Boolean.TRUE)) {
                break;
            }
        }
        WebImageSize webImageSize2 = (WebImageSize) obj;
        if (webImageSize2 != null) {
            WebImageSize.a aVar = WebImageSize.CREATOR;
            String str = webImageSize2.b;
            Integer valueOf = Integer.valueOf(i);
            aVar.getClass();
            return WebImageSize.a.a(valueOf, str);
        }
        if (list.isEmpty()) {
            return null;
        }
        for (WebImageSize webImageSize3 : list) {
            if (webImageSize != null) {
                int i2 = webImageSize.d;
                int i3 = webImageSize3.d;
                if (i2 < i3) {
                    if (Math.abs(i3 - i) < Math.abs(i2 - i) && webImageSize3.b.length() > 0) {
                    }
                }
            }
            webImageSize = webImageSize3;
        }
        return webImageSize;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WebImage) && epx.f(this.b, ((WebImage) obj).b);
    }

    public final WebImageSize f(int i) {
        Object obj;
        int i2;
        List<WebImageSize> list = this.b;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (epx.f(((WebImageSize) obj).g, Boolean.TRUE)) {
                break;
            }
        }
        WebImageSize webImageSize = (WebImageSize) obj;
        if (webImageSize != null) {
            WebImageSize.a aVar = WebImageSize.CREATOR;
            String str = webImageSize.b;
            Integer valueOf = Integer.valueOf(i);
            aVar.getClass();
            return WebImageSize.a.a(valueOf, str);
        }
        WebImageSize webImageSize2 = (WebImageSize) j5g.a0(list);
        if (webImageSize2 == null) {
            return null;
        }
        int size = list.size();
        for (int i3 = 1; i3 < size; i3++) {
            WebImageSize webImageSize3 = list.get(i3);
            String str2 = webImageSize3.b;
            int i4 = webImageSize3.d;
            if (str2.length() != 0 && (((i2 = webImageSize2.d) < i && i4 >= i2) || (i2 >= i && i4 >= i && i4 < i2))) {
                webImageSize2 = webImageSize3;
            }
        }
        return webImageSize2;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("WebImage(images="), this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.b);
    }

    public WebImage(Parcel parcel) {
        this(parcel.createTypedArrayList(WebImageSize.CREATOR));
    }
}
