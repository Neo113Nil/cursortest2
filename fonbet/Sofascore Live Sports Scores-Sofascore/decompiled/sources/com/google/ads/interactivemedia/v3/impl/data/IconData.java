package com.google.ads.interactivemedia.v3.impl.data;

import androidx.annotation.NonNull;
import defpackage.h4n;
import defpackage.q1p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@q1p(zza = AutoValue_IconData.class)
/* loaded from: classes2.dex */
public abstract class IconData implements h4n {
    @NonNull
    public abstract String alternateText();

    public abstract int duration();

    @NonNull
    public abstract List<IconClickFallbackImageMsgData> fallbackImages();

    public int getDuration() {
        return duration();
    }

    public int getHeight() {
        return height();
    }

    @NonNull
    public List getIconClickFallbackImages() {
        ArrayList arrayList = new ArrayList();
        Iterator<IconClickFallbackImageMsgData> it = fallbackImages().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    @Override // defpackage.h4n
    public int getId() {
        return id();
    }

    public int getOffset() {
        return offset();
    }

    public double getPixelRatio() {
        return pixelRatio();
    }

    @NonNull
    public String getResourceUri() {
        return imageUrl();
    }

    public int getWidth() {
        return width();
    }

    @NonNull
    public String getXPosition() {
        return xPosition();
    }

    @NonNull
    public String getYPosition() {
        return yPosition();
    }

    public abstract int height();

    public abstract int id();

    @NonNull
    public abstract String imageUrl();

    public abstract int offset();

    public abstract double pixelRatio();

    public abstract int width();

    @NonNull
    public abstract String xPosition();

    @NonNull
    public abstract String yPosition();
}
