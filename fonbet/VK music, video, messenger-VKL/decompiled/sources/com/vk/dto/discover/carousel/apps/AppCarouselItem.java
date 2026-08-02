package com.vk.dto.discover.carousel.apps;

import com.mbridge.msdk.MBridgeConstans;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.LinkButton;
import com.vk.dto.common.data.ApiApplication;
import com.vk.dto.discover.carousel.CarouselDescription;
import com.vk.dto.discover.carousel.CarouselItem;
import org.json.JSONObject;
import xsna.epx;

/* compiled from: AppCarouselItem.kt */
/* loaded from: classes18.dex */
public final class AppCarouselItem extends CarouselItem {
    public static final Serializer.c<AppCarouselItem> CREATOR = new a();
    public final String b;
    public final Image c;
    public final LinkButton d;
    public final CarouselDescription e;
    public final ApiApplication f;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<AppCarouselItem> {
        @Override // com.vk.core.serialize.Serializer.c
        public final AppCarouselItem a(Serializer serializer) {
            return new AppCarouselItem(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AppCarouselItem[i];
        }
    }

    public AppCarouselItem(String str, Image image, LinkButton linkButton, CarouselDescription carouselDescription, ApiApplication apiApplication) {
        this.b = str;
        this.c = image;
        this.d = linkButton;
        this.e = carouselDescription;
        this.f = apiApplication;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.i0(this.c);
        serializer.i0(this.d);
        serializer.i0(this.e);
        serializer.i0(this.f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppCarouselItem)) {
            return false;
        }
        AppCarouselItem appCarouselItem = (AppCarouselItem) obj;
        return epx.f(this.b, appCarouselItem.b) && epx.f(this.c, appCarouselItem.c) && epx.f(this.d, appCarouselItem.d) && epx.f(this.e, appCarouselItem.e) && epx.f(this.f, appCarouselItem.f);
    }

    public final int hashCode() {
        String str = this.b;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Image image = this.c;
        int hashCode2 = (hashCode + (image == null ? 0 : image.hashCode())) * 31;
        LinkButton linkButton = this.d;
        int hashCode3 = (hashCode2 + (linkButton == null ? 0 : linkButton.hashCode())) * 31;
        CarouselDescription carouselDescription = this.e;
        int hashCode4 = (hashCode3 + (carouselDescription == null ? 0 : carouselDescription.hashCode())) * 31;
        ApiApplication apiApplication = this.f;
        return hashCode4 + (apiApplication != null ? apiApplication.hashCode() : 0);
    }

    public final String toString() {
        return "AppCarouselItem(title=" + this.b + ", image=" + this.c + ", button=" + this.d + ", description=" + this.e + ", app=" + this.f + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AppCarouselItem(JSONObject jSONObject) {
        this(r2, r3, r1, r4, new ApiApplication(jSONObject.getJSONObject(MBridgeConstans.DYNAMIC_VIEW_WX_APP)));
        String optString = jSONObject.optString("title");
        CarouselDescription carouselDescription = null;
        Image image = new Image(jSONObject.getJSONArray("images"), null, 2, null);
        JSONObject optJSONObject = jSONObject.optJSONObject("button");
        LinkButton linkButton = optJSONObject != null ? new LinkButton(optJSONObject) : null;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("description");
        if (optJSONObject2 != null) {
            Serializer.c<CarouselDescription> cVar = CarouselDescription.CREATOR;
            carouselDescription = new CarouselDescription(optJSONObject2.optString("text"), optJSONObject2.optString("type"));
        }
    }

    public AppCarouselItem(Serializer serializer) {
        this(serializer.H(), (Image) serializer.G(Image.class.getClassLoader()), (LinkButton) serializer.G(LinkButton.class.getClassLoader()), (CarouselDescription) serializer.G(CarouselDescription.class.getClassLoader()), (ApiApplication) serializer.G(ApiApplication.class.getClassLoader()));
    }
}
