package com.vk.superapp.browser.internal.ui.identity;

import com.vk.core.serialize.Serializer;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.superapp.api.dto.identity.WebIdentityCardData;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.drm0;
import xsna.p4g;
import xsna.zcl;

/* compiled from: WebIdentityContext.kt */
/* loaded from: classes6.dex */
public final class WebIdentityContext extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<WebIdentityContext> CREATOR = new a();
    public final List<String> b;
    public final WebIdentityCardData c;
    public final WebApiApplication d;
    public final int e;
    public String f;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<WebIdentityContext> {
        @Override // com.vk.core.serialize.Serializer.c
        public final WebIdentityContext a(Serializer serializer) {
            return new WebIdentityContext(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WebIdentityContext[i];
        }
    }

    public /* synthetic */ WebIdentityContext(List list, WebIdentityCardData webIdentityCardData, WebApiApplication webApiApplication, int i, String str, int i2, zcl zclVar) {
        this(list, webIdentityCardData, webApiApplication, i, (i2 & 16) != 0 ? null : str);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.e);
        serializer.j0(p4g.k(this.b, StringUtils.COMMA, null));
        serializer.i0(this.c);
        serializer.e0(this.d);
        serializer.j0(this.f);
    }

    public final boolean isEmpty() {
        WebIdentityCardData webIdentityCardData = this.c;
        webIdentityCardData.getClass();
        List<String> list = this.b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            String str = list.get(i);
            int hashCode = str.hashCode();
            if (hashCode != -1147692044) {
                if (hashCode != 96619420) {
                    if (hashCode == 106642798 && str.equals("phone") && webIdentityCardData.b.isEmpty()) {
                        return true;
                    }
                } else if (str.equals("email") && webIdentityCardData.c.isEmpty()) {
                    return true;
                }
            } else if (str.equals(RTCStatsConstants.KEY_ADDRESS) && webIdentityCardData.d.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public WebIdentityContext(List<String> list, WebIdentityCardData webIdentityCardData, WebApiApplication webApiApplication, int i, String str) {
        this.b = list;
        this.c = webIdentityCardData;
        this.d = webApiApplication;
        this.e = i;
        this.f = str;
    }

    public WebIdentityContext(Serializer serializer) {
        this(drm0.c0(serializer.H(), new String[]{StringUtils.COMMA}, 0, 6), (WebIdentityCardData) serializer.G(WebIdentityCardData.class.getClassLoader()), (WebApiApplication) serializer.A(WebApiApplication.class.getClassLoader()), serializer.u(), serializer.H());
    }
}
