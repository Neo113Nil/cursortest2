package com.sofascore.model.newNetwork;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.a7a;
import defpackage.bf3;
import defpackage.dmi;
import defpackage.mz1;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.vxd;
import defpackage.wf3;
import defpackage.wv8;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000276BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fB_\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000b\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001bJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001bJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001bJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010#JX\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001bJ\u0010\u0010'\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b'\u0010\u001dJ\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b/\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b0\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b1\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b2\u0010\u001bR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b3\u0010\u001bR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b5\u0010#¨\u00068"}, d2 = {"Lcom/sofascore/model/newNetwork/InfoMessage;", "", "", "title", "", "id", PglCryptUtils.KEY_MESSAGE, "downloadLink", "okText", "cancelText", "notificationId", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/InfoMessage;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "component4", "component5", "component6", "component7", "()Ljava/lang/Integer;", "copy", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/sofascore/model/newNetwork/InfoMessage;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "I", "getId", "getMessage", "getDownloadLink", "getOkText", "getCancelText", "Ljava/lang/Integer;", "getNotificationId", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class InfoMessage {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String cancelText;

    @NotNull
    private final String downloadLink;
    private final int id;

    @NotNull
    private final String message;

    @Nullable
    private final Integer notificationId;

    @NotNull
    private final String okText;

    @NotNull
    private final String title;

    public /* synthetic */ InfoMessage(int i, String str, int i2, String str2, String str3, String str4, String str5, Integer num, t5h t5hVar) {
        if (127 != (i & Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE)) {
            oea.z(i, Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, InfoMessage$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.title = str;
        this.id = i2;
        this.message = str2;
        this.downloadLink = str3;
        this.okText = str4;
        this.cancelText = str5;
        this.notificationId = num;
    }

    public static /* synthetic */ InfoMessage copy$default(InfoMessage infoMessage, String str, int i, String str2, String str3, String str4, String str5, Integer num, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = infoMessage.title;
        }
        if ((i2 & 2) != 0) {
            i = infoMessage.id;
        }
        if ((i2 & 4) != 0) {
            str2 = infoMessage.message;
        }
        if ((i2 & 8) != 0) {
            str3 = infoMessage.downloadLink;
        }
        if ((i2 & 16) != 0) {
            str4 = infoMessage.okText;
        }
        if ((i2 & 32) != 0) {
            str5 = infoMessage.cancelText;
        }
        if ((i2 & 64) != 0) {
            num = infoMessage.notificationId;
        }
        String str6 = str5;
        Integer num2 = num;
        String str7 = str4;
        String str8 = str2;
        return infoMessage.copy(str, i, str8, str3, str7, str6, num2);
    }

    public static final /* synthetic */ void write$Self$model_release(InfoMessage self, wf3 output, SerialDescriptor serialDesc) {
        output.y(serialDesc, 0, self.title);
        output.u(1, self.id, serialDesc);
        output.y(serialDesc, 2, self.message);
        output.y(serialDesc, 3, self.downloadLink);
        output.y(serialDesc, 4, self.okText);
        output.y(serialDesc, 5, self.cancelText);
        output.h(serialDesc, 6, a7a.a, self.notificationId);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getDownloadLink() {
        return this.downloadLink;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getOkText() {
        return this.okText;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getCancelText() {
        return this.cancelText;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Integer getNotificationId() {
        return this.notificationId;
    }

    @NotNull
    public final InfoMessage copy(@NotNull String title, int id, @NotNull String message, @NotNull String downloadLink, @NotNull String okText, @NotNull String cancelText, @Nullable Integer notificationId) {
        title.getClass();
        message.getClass();
        downloadLink.getClass();
        okText.getClass();
        cancelText.getClass();
        return new InfoMessage(title, id, message, downloadLink, okText, cancelText, notificationId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InfoMessage)) {
            return false;
        }
        InfoMessage infoMessage = (InfoMessage) other;
        return Intrinsics.c(this.title, infoMessage.title) && this.id == infoMessage.id && Intrinsics.c(this.message, infoMessage.message) && Intrinsics.c(this.downloadLink, infoMessage.downloadLink) && Intrinsics.c(this.okText, infoMessage.okText) && Intrinsics.c(this.cancelText, infoMessage.cancelText) && Intrinsics.c(this.notificationId, infoMessage.notificationId);
    }

    @NotNull
    public final String getCancelText() {
        return this.cancelText;
    }

    @NotNull
    public final String getDownloadLink() {
        return this.downloadLink;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    public final Integer getNotificationId() {
        return this.notificationId;
    }

    @NotNull
    public final String getOkText() {
        return this.okText;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int c = dmi.c(dmi.c(dmi.c(dmi.c(wv8.a(this.id, this.title.hashCode() * 31, 31), 31, this.message), 31, this.downloadLink), 31, this.okText), 31, this.cancelText);
        Integer num = this.notificationId;
        return c + (num == null ? 0 : num.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.title;
        int i = this.id;
        String str2 = this.message;
        String str3 = this.downloadLink;
        String str4 = this.okText;
        String str5 = this.cancelText;
        Integer num = this.notificationId;
        StringBuilder q = mz1.q(i, "InfoMessage(title=", str, ", id=", ", message=");
        bf3.v(q, str2, ", downloadLink=", str3, ", okText=");
        bf3.v(q, str4, ", cancelText=", str5, ", notificationId=");
        return vxd.n(q, num, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/InfoMessage$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/InfoMessage;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return InfoMessage$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public InfoMessage(@NotNull String str, int i, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @Nullable Integer num) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        this.title = str;
        this.id = i;
        this.message = str2;
        this.downloadLink = str3;
        this.okText = str4;
        this.cancelText = str5;
        this.notificationId = num;
    }
}
