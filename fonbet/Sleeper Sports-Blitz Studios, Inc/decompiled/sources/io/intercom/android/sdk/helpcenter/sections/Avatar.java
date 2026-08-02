package io.intercom.android.sdk.helpcenter.sections;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jacoco.core.runtime.AgentOptions;

/* compiled from: HelpCenterCollectionContent.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002\"#B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0005\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0018\u001a\u00020\bH×\u0001J\t\u0010\u0019\u001a\u00020\u0003H×\u0001J%\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0001¢\u0006\u0002\b!R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000f¨\u0006$"}, d2 = {"Lio/intercom/android/sdk/helpcenter/sections/Avatar;", "", "initials", "", "imageUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getInitials$annotations", "()V", "getInitials", "()Ljava/lang/String;", "getImageUrl$annotations", "getImageUrl", "component1", "component2", "copy", "equals", "", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "write$Self", "", "self", AgentOptions.OUTPUT, "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$intercom_sdk_base_release", "$serializer", "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
/* loaded from: classes9.dex */
public final /* data */ class Avatar {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String imageUrl;
    private final String initials;

    /* JADX WARN: Multi-variable type inference failed */
    public Avatar() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ Avatar copy$default(Avatar avatar, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = avatar.initials;
        }
        if ((i & 2) != 0) {
            str2 = avatar.imageUrl;
        }
        return avatar.copy(str, str2);
    }

    @SerialName("image_url")
    public static /* synthetic */ void getImageUrl$annotations() {
    }

    @SerialName("initials")
    public static /* synthetic */ void getInitials$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getInitials() {
        return this.initials;
    }

    /* renamed from: component2, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final Avatar copy(String initials, String imageUrl) {
        Intrinsics.checkNotNullParameter(initials, "initials");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        return new Avatar(initials, imageUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Avatar)) {
            return false;
        }
        Avatar avatar = (Avatar) other;
        return Intrinsics.areEqual(this.initials, avatar.initials) && Intrinsics.areEqual(this.imageUrl, avatar.imageUrl);
    }

    public int hashCode() {
        return (this.initials.hashCode() * 31) + this.imageUrl.hashCode();
    }

    public String toString() {
        return "Avatar(initials=" + this.initials + ", imageUrl=" + this.imageUrl + ')';
    }

    /* compiled from: HelpCenterCollectionContent.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¨\u0006\u0007"}, d2 = {"Lio/intercom/android/sdk/helpcenter/sections/Avatar$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/intercom/android/sdk/helpcenter/sections/Avatar;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Avatar> serializer() {
            return Avatar$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ Avatar(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.initials = "";
        } else {
            this.initials = str;
        }
        if ((i & 2) == 0) {
            this.imageUrl = "";
        } else {
            this.imageUrl = str2;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$intercom_sdk_base_release(Avatar self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !Intrinsics.areEqual(self.initials, "")) {
            output.encodeStringElement(serialDesc, 0, self.initials);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && Intrinsics.areEqual(self.imageUrl, "")) {
            return;
        }
        output.encodeStringElement(serialDesc, 1, self.imageUrl);
    }

    public Avatar(String initials, String imageUrl) {
        Intrinsics.checkNotNullParameter(initials, "initials");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        this.initials = initials;
        this.imageUrl = imageUrl;
    }

    public /* synthetic */ Avatar(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }

    public final String getInitials() {
        return this.initials;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }
}
