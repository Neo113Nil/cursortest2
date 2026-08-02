package ru.ozon.android.messenger.blocks.messagetext;

import B0.A0;
import N3.C3660k;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@com.squareup.moshi.j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001:\u0002\u0017\u0018B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b¨\u0006\u0019"}, d2 = {"Lru/ozon/android/messenger/blocks/messagetext/MessageTextDTO;", "", "", "Lru/ozon/android/messenger/blocks/messagetext/MessageTextDTO$MessageTextType;", "text", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lru/ozon/android/messenger/blocks/messagetext/MessageTextDTO;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getText", "a", "MessageTextType", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class MessageTextDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<MessageTextType> text;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000 \u00112\u00020\u0001:\u0007\u0012\u0013\u0014\u0015\u0016\u0017\u0018B\u001b\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\u0082\u0001\u0006\u0019\u001a\u001b\u001c\u001d\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/android/messenger/blocks/messagetext/MessageTextDTO$MessageTextType;", "", "Lru/ozon/android/messenger/blocks/messagetext/MessageTextDTO$a;", "type", "data", "<init>", "(Lru/ozon/android/messenger/blocks/messagetext/MessageTextDTO$a;Ljava/lang/Object;)V", "", "isNewLineAtTheEnd", "()Z", "isNullDataSupported", "Lru/ozon/android/messenger/blocks/messagetext/MessageTextDTO$a;", "getType", "()Lru/ozon/android/messenger/blocks/messagetext/MessageTextDTO$a;", "Ljava/lang/Object;", "getData", "()Ljava/lang/Object;", "Companion", "a", "TextType", "NewLine", "BoldType", "LinkType", "OlType", "UlType", "Lru/ozon/android/messenger/blocks/messagetext/MessageTextDTO$MessageTextType$BoldType;", "Lru/ozon/android/messenger/blocks/messagetext/MessageTextDTO$MessageTextType$LinkType;", "Lru/ozon/android/messenger/blocks/messagetext/MessageTextDTO$MessageTextType$NewLine;", "Lru/ozon/android/messenger/blocks/messagetext/MessageTextDTO$MessageTextType$OlType;", "Lru/ozon/android/messenger/blocks/messagetext/MessageTextDTO$MessageTextType$TextType;", "Lru/ozon/android/messenger/blocks/messagetext/MessageTextDTO$MessageTextType$UlType;", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class MessageTextType {
        public static final int $stable = 8;
        private static final char NEW_LINE = '\n';
        private final Object data;

        @NotNull
        private final a type;

        @com.squareup.moshi.j(generateAdapter = true)
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/android/messenger/blocks/messagetext/MessageTextDTO$MessageTextType$BoldType;", "Lru/ozon/android/messenger/blocks/messagetext/MessageTextDTO$MessageTextType;", "data", "", "<init>", "(Ljava/lang/String;)V", "getData", "()Ljava/lang/String;", "isNewLineAtTheEnd", "", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class BoldType extends MessageTextType {
            public static final int $stable = 0;
            private final String data;

            public BoldType(String str) {
                super(a.BOLD, str, null);
                this.data = str;
            }

            public static /* synthetic */ BoldType copy$default(BoldType boldType, String str, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = boldType.data;
                }
                return boldType.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getData() {
                return this.data;
            }

            @NotNull
            public final BoldType copy(String data) {
                return new BoldType(data);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof BoldType) && Intrinsics.d(this.data, ((BoldType) other).data);
            }

            public int hashCode() {
                String str = this.data;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            @Override // ru.ozon.android.messenger.blocks.messagetext.MessageTextDTO.MessageTextType
            public boolean isNewLineAtTheEnd() {
                Character O11;
                String data = getData();
                return (data == null || (O11 = kotlin.text.h.O(data)) == null || O11.charValue() != '\n') ? false : true;
            }

            @NotNull
            public String toString() {
                return A0.b("BoldType(data=", this.data, ")");
            }

            @Override // ru.ozon.android.messenger.blocks.messagetext.MessageTextDTO.MessageTextType
            public String getData() {
                return this.data;
            }
        }

        @com.squareup.moshi.j(generateAdapter = true)
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0017\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003JE\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00142\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006 "}, d2 = {"Lru/ozon/android/messenger/blocks/messagetext/MessageTextDTO$MessageTextType$LinkType;", "Lru/ozon/android/messenger/blocks/messagetext/MessageTextDTO$MessageTextType;", "data", "", ImagesContract.URL, "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/messenger/framework/analytics/MessengerTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getData", "()Ljava/lang/String;", "getUrl", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "isNewLineAtTheEnd", "", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class LinkType extends MessageTextType {
            public static final int $stable = 8;
            private final AtomActionDTO action;
            private final String data;
            private final Map<String, MessengerTrackingInfo> trackingInfo;
            private final String url;

            public LinkType(String str, String str2, AtomActionDTO atomActionDTO, Map<String, MessengerTrackingInfo> map) {
                super(a.LINK, str, null);
                this.data = str;
                this.url = str2;
                this.action = atomActionDTO;
                this.trackingInfo = map;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ LinkType copy$default(LinkType linkType, String str, String str2, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = linkType.data;
                }
                if ((i11 & 2) != 0) {
                    str2 = linkType.url;
                }
                if ((i11 & 4) != 0) {
                    atomActionDTO = linkType.action;
                }
                if ((i11 & 8) != 0) {
                    map = linkType.trackingInfo;
                }
                return linkType.copy(str, str2, atomActionDTO, map);
            }

            /* renamed from: component1, reason: from getter */
            public final String getData() {
                return this.data;
            }

            /* renamed from: component2, reason: from getter */
            public final String getUrl() {
                return this.url;
            }

            /* renamed from: component3, reason: from getter */
            public final AtomActionDTO getAction() {
                return this.action;
            }

            public final Map<String, MessengerTrackingInfo> component4() {
                return this.trackingInfo;
            }

            @NotNull
            public final LinkType copy(String data, String url, AtomActionDTO action, Map<String, MessengerTrackingInfo> trackingInfo) {
                return new LinkType(data, url, action, trackingInfo);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof LinkType)) {
                    return false;
                }
                LinkType linkType = (LinkType) other;
                return Intrinsics.d(this.data, linkType.data) && Intrinsics.d(this.url, linkType.url) && Intrinsics.d(this.action, linkType.action) && Intrinsics.d(this.trackingInfo, linkType.trackingInfo);
            }

            public final AtomActionDTO getAction() {
                return this.action;
            }

            public final Map<String, MessengerTrackingInfo> getTrackingInfo() {
                return this.trackingInfo;
            }

            public final String getUrl() {
                return this.url;
            }

            public int hashCode() {
                String str = this.data;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.url;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                AtomActionDTO atomActionDTO = this.action;
                int hashCode3 = (hashCode2 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
                Map<String, MessengerTrackingInfo> map = this.trackingInfo;
                return hashCode3 + (map != null ? map.hashCode() : 0);
            }

            @Override // ru.ozon.android.messenger.blocks.messagetext.MessageTextDTO.MessageTextType
            public boolean isNewLineAtTheEnd() {
                Character O11;
                String data = getData();
                return (data == null || (O11 = kotlin.text.h.O(data)) == null || O11.charValue() != '\n') ? false : true;
            }

            @NotNull
            public String toString() {
                String str = this.data;
                String str2 = this.url;
                return D40.a.d(C3660k.d("LinkType(data=", str, ", url=", str2, ", action="), this.action, ", trackingInfo=", this.trackingInfo, ")");
            }

            @Override // ru.ozon.android.messenger.blocks.messagetext.MessageTextDTO.MessageTextType
            public String getData() {
                return this.data;
            }
        }

        @com.squareup.moshi.j(generateAdapter = true)
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0013\u0010\u0007\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0096\u0002J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016¨\u0006\u000e"}, d2 = {"Lru/ozon/android/messenger/blocks/messagetext/MessageTextDTO$MessageTextType$NewLine;", "Lru/ozon/android/messenger/blocks/messagetext/MessageTextDTO$MessageTextType;", "<init>", "()V", "isNewLineAtTheEnd", "", "isNullDataSupported", "equals", "other", "", "hashCode", "", "toString", "", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class NewLine extends MessageTextType {
            public static final int $stable = 0;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public NewLine() {
                super(a.NEW_LINE, r1, r1);
                DefaultConstructorMarker defaultConstructorMarker = null;
            }

            public boolean equals(Object other) {
                return other instanceof NewLine;
            }

            public int hashCode() {
                return toString().hashCode();
            }

            @Override // ru.ozon.android.messenger.blocks.messagetext.MessageTextDTO.MessageTextType
            public boolean isNewLineAtTheEnd() {
                return true;
            }

            @Override // ru.ozon.android.messenger.blocks.messagetext.MessageTextDTO.MessageTextType
            public boolean isNullDataSupported() {
                return true;
            }

            @NotNull
            public String toString() {
                return "MessageTextType::NewLine";
            }
        }

        @com.squareup.moshi.j(generateAdapter = true)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001c\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/android/messenger/blocks/messagetext/MessageTextDTO$MessageTextType$OlType;", "Lru/ozon/android/messenger/blocks/messagetext/MessageTextDTO$MessageTextType;", "data", "", "<init>", "(Ljava/util/List;)V", "getData", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class OlType extends MessageTextType {
            public static final int $stable = 8;
            private final List<MessageTextType> data;

            /* JADX WARN: Multi-variable type inference failed */
            public OlType(List<? extends MessageTextType> list) {
                super(a.f85801OL, list, null);
                this.data = list;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ OlType copy$default(OlType olType, List list, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    list = olType.data;
                }
                return olType.copy(list);
            }

            public final List<MessageTextType> component1() {
                return this.data;
            }

            @NotNull
            public final OlType copy(List<? extends MessageTextType> data) {
                return new OlType(data);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof OlType) && Intrinsics.d(this.data, ((OlType) other).data);
            }

            public int hashCode() {
                List<MessageTextType> list = this.data;
                if (list == null) {
                    return 0;
                }
                return list.hashCode();
            }

            @NotNull
            public String toString() {
                return H3.c.a("OlType(data=", ")", this.data);
            }

            @Override // ru.ozon.android.messenger.blocks.messagetext.MessageTextDTO.MessageTextType
            public List<MessageTextType> getData() {
                return this.data;
            }
        }

        @com.squareup.moshi.j(generateAdapter = true)
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/android/messenger/blocks/messagetext/MessageTextDTO$MessageTextType$TextType;", "Lru/ozon/android/messenger/blocks/messagetext/MessageTextDTO$MessageTextType;", "data", "", "<init>", "(Ljava/lang/String;)V", "getData", "()Ljava/lang/String;", "isNewLineAtTheEnd", "", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class TextType extends MessageTextType {
            public static final int $stable = 0;
            private final String data;

            public TextType(String str) {
                super(a.TEXT, str, null);
                this.data = str;
            }

            public static /* synthetic */ TextType copy$default(TextType textType, String str, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = textType.data;
                }
                return textType.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getData() {
                return this.data;
            }

            @NotNull
            public final TextType copy(String data) {
                return new TextType(data);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof TextType) && Intrinsics.d(this.data, ((TextType) other).data);
            }

            public int hashCode() {
                String str = this.data;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            @Override // ru.ozon.android.messenger.blocks.messagetext.MessageTextDTO.MessageTextType
            public boolean isNewLineAtTheEnd() {
                Character O11;
                String data = getData();
                return (data == null || (O11 = kotlin.text.h.O(data)) == null || O11.charValue() != '\n') ? false : true;
            }

            @NotNull
            public String toString() {
                return A0.b("TextType(data=", this.data, ")");
            }

            @Override // ru.ozon.android.messenger.blocks.messagetext.MessageTextDTO.MessageTextType
            public String getData() {
                return this.data;
            }
        }

        @com.squareup.moshi.j(generateAdapter = true)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001c\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/android/messenger/blocks/messagetext/MessageTextDTO$MessageTextType$UlType;", "Lru/ozon/android/messenger/blocks/messagetext/MessageTextDTO$MessageTextType;", "data", "", "<init>", "(Ljava/util/List;)V", "getData", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class UlType extends MessageTextType {
            public static final int $stable = 8;
            private final List<MessageTextType> data;

            /* JADX WARN: Multi-variable type inference failed */
            public UlType(List<? extends MessageTextType> list) {
                super(a.f85802UL, list, null);
                this.data = list;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ UlType copy$default(UlType ulType, List list, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    list = ulType.data;
                }
                return ulType.copy(list);
            }

            public final List<MessageTextType> component1() {
                return this.data;
            }

            @NotNull
            public final UlType copy(List<? extends MessageTextType> data) {
                return new UlType(data);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof UlType) && Intrinsics.d(this.data, ((UlType) other).data);
            }

            public int hashCode() {
                List<MessageTextType> list = this.data;
                if (list == null) {
                    return 0;
                }
                return list.hashCode();
            }

            @NotNull
            public String toString() {
                return H3.c.a("UlType(data=", ")", this.data);
            }

            @Override // ru.ozon.android.messenger.blocks.messagetext.MessageTextDTO.MessageTextType
            public List<MessageTextType> getData() {
                return this.data;
            }
        }

        public /* synthetic */ MessageTextType(a aVar, Object obj, DefaultConstructorMarker defaultConstructorMarker) {
            this(aVar, obj);
        }

        public Object getData() {
            return this.data;
        }

        @NotNull
        public final a getType() {
            return this.type;
        }

        public boolean isNewLineAtTheEnd() {
            return false;
        }

        public boolean isNullDataSupported() {
            return false;
        }

        private MessageTextType(a aVar, Object obj) {
            this.type = aVar;
            this.data = obj;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;

        @com.squareup.moshi.i(name = "bold")
        public static final a BOLD;

        @com.squareup.moshi.i(name = "link")
        public static final a LINK;

        @com.squareup.moshi.i(name = "newLine")
        public static final a NEW_LINE;

        /* renamed from: OL, reason: collision with root package name */
        @com.squareup.moshi.i(name = "ol")
        public static final a f85801OL;

        @com.squareup.moshi.i(name = "text")
        public static final a TEXT;

        /* renamed from: UL, reason: collision with root package name */
        @com.squareup.moshi.i(name = "ul")
        public static final a f85802UL;

        @NotNull
        private final String value;

        static {
            a aVar = new a("TEXT", 0, "text");
            TEXT = aVar;
            a aVar2 = new a("NEW_LINE", 1, "newLine");
            NEW_LINE = aVar2;
            a aVar3 = new a("BOLD", 2, "bold");
            BOLD = aVar3;
            a aVar4 = new a("LINK", 3, "link");
            LINK = aVar4;
            a aVar5 = new a("OL", 4, "ol");
            f85801OL = aVar5;
            a aVar6 = new a("UL", 5, "ul");
            f85802UL = aVar6;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6};
            $VALUES = aVarArr;
            $ENTRIES = Xc.b.a(aVarArr);
        }

        private a(String str, int i11, String str2) {
            this.value = str2;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        @NotNull
        public final String a() {
            return this.value;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MessageTextDTO(@NotNull List<? extends MessageTextType> text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.text = text;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MessageTextDTO copy$default(MessageTextDTO messageTextDTO, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = messageTextDTO.text;
        }
        return messageTextDTO.copy(list);
    }

    @NotNull
    public final List<MessageTextType> component1() {
        return this.text;
    }

    @NotNull
    public final MessageTextDTO copy(@NotNull List<? extends MessageTextType> text) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new MessageTextDTO(text);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MessageTextDTO) && Intrinsics.d(this.text, ((MessageTextDTO) other).text);
    }

    @NotNull
    public final List<MessageTextType> getText() {
        return this.text;
    }

    public int hashCode() {
        return this.text.hashCode();
    }

    @NotNull
    public String toString() {
        return H3.c.a("MessageTextDTO(text=", ")", this.text);
    }
}
