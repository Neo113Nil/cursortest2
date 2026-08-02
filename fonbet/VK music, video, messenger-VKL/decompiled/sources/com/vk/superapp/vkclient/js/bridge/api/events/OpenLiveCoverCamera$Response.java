package com.vk.superapp.vkclient.js.bridge.api.events;

import androidx.core.app.NotificationCompat;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.List;
import xsna.asp;
import xsna.b9y;
import xsna.bd6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: OpenLiveCoverCamera.kt */
/* loaded from: classes6.dex */
public final class OpenLiveCoverCamera$Response implements bd6 {

    @pmi0("data")
    private final Data data;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("type")
    private final String type;

    public OpenLiveCoverCamera$Response(String str, Data data, String str2) {
        this.type = str;
        this.data = data;
        this.requestId = str2;
    }

    @Override // xsna.bd6
    public final bd6 a(String str) {
        return new OpenLiveCoverCamera$Response(this.type, this.data, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OpenLiveCoverCamera$Response)) {
            return false;
        }
        OpenLiveCoverCamera$Response openLiveCoverCamera$Response = (OpenLiveCoverCamera$Response) obj;
        return epx.f(this.type, openLiveCoverCamera$Response.type) && epx.f(this.data, openLiveCoverCamera$Response.data) && epx.f(this.requestId, openLiveCoverCamera$Response.requestId);
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

    public /* synthetic */ OpenLiveCoverCamera$Response(String str, Data data, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? "VKWebAppOpenLiveCoverCameraResult" : str, data, str2);
    }

    /* compiled from: OpenLiveCoverCamera.kt */
    public static final class Data {

        @pmi0("platforms")
        private final List<Platforms> platforms;

        @pmi0(NotificationCompat.CATEGORY_PROGRESS)
        private final Integer progress;

        @pmi0(CommonUrlParts.REQUEST_ID)
        private final String requestId;

        @pmi0("status")
        private final Status status;

        @pmi0("story")
        private final b9y story;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: OpenLiveCoverCamera.kt */
        public static final class Platforms {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ Platforms[] $VALUES;

            @pmi0("mobile_iphone_messenger")
            public static final Platforms MOBILE_IPHONE_MESSENGER;

            static {
                Platforms platforms = new Platforms("MOBILE_IPHONE_MESSENGER", 0);
                MOBILE_IPHONE_MESSENGER = platforms;
                Platforms[] platformsArr = {platforms};
                $VALUES = platformsArr;
                $ENTRIES = new asp(platformsArr);
            }

            private Platforms(String str, int i) {
            }

            public static Platforms valueOf(String str) {
                return (Platforms) Enum.valueOf(Platforms.class, str);
            }

            public static Platforms[] values() {
                return (Platforms[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: OpenLiveCoverCamera.kt */
        public static final class Status {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ Status[] $VALUES;

            @pmi0("cancel")
            public static final Status CANCEL;

            @pmi0("error")
            public static final Status ERROR;

            @pmi0("uploaded")
            public static final Status UPLOADED;

            @pmi0("uploading")
            public static final Status UPLOADING;

            static {
                Status status = new Status("ERROR", 0);
                ERROR = status;
                Status status2 = new Status("CANCEL", 1);
                CANCEL = status2;
                Status status3 = new Status("UPLOADING", 2);
                UPLOADING = status3;
                Status status4 = new Status("UPLOADED", 3);
                UPLOADED = status4;
                Status[] statusArr = {status, status2, status3, status4};
                $VALUES = statusArr;
                $ENTRIES = new asp(statusArr);
            }

            private Status(String str, int i) {
            }

            public static Status valueOf(String str) {
                return (Status) Enum.valueOf(Status.class, str);
            }

            public static Status[] values() {
                return (Status[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Data(Status status, Integer num, b9y b9yVar, List<? extends Platforms> list, String str) {
            this.status = status;
            this.progress = num;
            this.story = b9yVar;
            this.platforms = list;
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
            return this.status == data.status && epx.f(this.progress, data.progress) && epx.f(this.story, data.story) && epx.f(this.platforms, data.platforms) && epx.f(this.requestId, data.requestId);
        }

        public final int hashCode() {
            int hashCode = this.status.hashCode() * 31;
            Integer num = this.progress;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            b9y b9yVar = this.story;
            int hashCode3 = (hashCode2 + (b9yVar == null ? 0 : b9yVar.hashCode())) * 31;
            List<Platforms> list = this.platforms;
            int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.requestId;
            return hashCode4 + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Data(status=");
            sb.append(this.status);
            sb.append(", progress=");
            sb.append(this.progress);
            sb.append(", story=");
            sb.append(this.story);
            sb.append(", platforms=");
            sb.append(this.platforms);
            sb.append(", requestId=");
            return ho8.a(sb, this.requestId, ')');
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ Data(Status status, Integer num, b9y b9yVar, List list, String str, int i, zcl zclVar) {
            this(status, num, b9yVar, r6, r7);
            String str2;
            List list2;
            num = (i & 2) != 0 ? null : num;
            b9yVar = (i & 4) != 0 ? null : b9yVar;
            if ((i & 8) != 0) {
                str2 = str;
                list2 = null;
            } else {
                str2 = str;
                list2 = list;
            }
        }
    }
}
