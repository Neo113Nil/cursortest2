package com.vk.superapp.common.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.bd6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.qoy;
import xsna.zcl;

/* compiled from: AddToHomeScreenInfo.kt */
/* loaded from: classes6.dex */
public final class AddToHomeScreenInfo$Response implements bd6 {

    @pmi0("data")
    private final Data data;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("type")
    private final String type;

    /* compiled from: AddToHomeScreenInfo.kt */
    public static final class Data {

        @pmi0("is_added_to_home_screen")
        private final boolean isAddedToHomeScreen;

        @pmi0("is_feature_supported")
        private final boolean isFeatureSupported;

        @pmi0(CommonUrlParts.REQUEST_ID)
        private final String requestId;

        public Data(boolean z, boolean z2, String str) {
            this.isFeatureSupported = z;
            this.isAddedToHomeScreen = z2;
            this.requestId = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            return this.isFeatureSupported == data.isFeatureSupported && this.isAddedToHomeScreen == data.isAddedToHomeScreen && epx.f(this.requestId, data.requestId);
        }

        public final int hashCode() {
            int b = qoy.b(Boolean.hashCode(this.isFeatureSupported) * 31, 31, this.isAddedToHomeScreen);
            String str = this.requestId;
            return b + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Data(isFeatureSupported=");
            sb.append(this.isFeatureSupported);
            sb.append(", isAddedToHomeScreen=");
            sb.append(this.isAddedToHomeScreen);
            sb.append(", requestId=");
            return ho8.a(sb, this.requestId, ')');
        }
    }

    public AddToHomeScreenInfo$Response(String str, Data data, String str2) {
        this.type = str;
        this.data = data;
        this.requestId = str2;
    }

    @Override // xsna.bd6
    public final bd6 a(String str) {
        return new AddToHomeScreenInfo$Response(this.type, this.data, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddToHomeScreenInfo$Response)) {
            return false;
        }
        AddToHomeScreenInfo$Response addToHomeScreenInfo$Response = (AddToHomeScreenInfo$Response) obj;
        return epx.f(this.type, addToHomeScreenInfo$Response.type) && epx.f(this.data, addToHomeScreenInfo$Response.data) && epx.f(this.requestId, addToHomeScreenInfo$Response.requestId);
    }

    public final int hashCode() {
        int hashCode = (this.data.hashCode() + (this.type.hashCode() * 31)) * 31;
        String str = this.requestId;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Response(type=");
        sb.append(this.type);
        sb.append(", data=");
        sb.append(this.data);
        sb.append(", requestId=");
        return ho8.a(sb, this.requestId, ')');
    }

    public /* synthetic */ AddToHomeScreenInfo$Response(String str, Data data, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? "VKWebAppAddToHomeScreenInfoResult" : str, data, str2);
    }
}
