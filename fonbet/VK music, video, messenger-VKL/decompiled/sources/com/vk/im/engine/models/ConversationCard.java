package com.vk.im.engine.models;

import android.os.Parcel;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.ironsource.X3;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.actions.Action;
import java.util.Iterator;
import java.util.List;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: ConversationCard.kt */
/* loaded from: classes2.dex */
public final class ConversationCard implements Serializer.StreamParcelable {
    public static final Serializer.c<ConversationCard> CREATOR = new a();
    public final ConversationBarType b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final List<ConversationButton> g;
    public final String h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ConversationCard.kt */
    public static final class ConversationBarType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ConversationBarType[] $VALUES;
        public static final ConversationBarType CUSTOM;
        public static final ConversationBarType GIFT;
        public static final ConversationBarType PROFILE;
        public static final ConversationBarType UNKNOWN;
        private final String nameType;

        static {
            ConversationBarType conversationBarType = new ConversationBarType("CUSTOM", 0, "custom");
            CUSTOM = conversationBarType;
            ConversationBarType conversationBarType2 = new ConversationBarType("PROFILE", 1, CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE);
            PROFILE = conversationBarType2;
            ConversationBarType conversationBarType3 = new ConversationBarType(GrsBaseInfo.CountryCodeSource.UNKNOWN, 2, "unknown");
            UNKNOWN = conversationBarType3;
            ConversationBarType conversationBarType4 = new ConversationBarType("GIFT", 3, "gift");
            GIFT = conversationBarType4;
            ConversationBarType[] conversationBarTypeArr = {conversationBarType, conversationBarType2, conversationBarType3, conversationBarType4};
            $VALUES = conversationBarTypeArr;
            $ENTRIES = new asp(conversationBarTypeArr);
        }

        public ConversationBarType(String str, int i, String str2) {
            this.nameType = str2;
        }

        public static zrp<ConversationBarType> h() {
            return $ENTRIES;
        }

        public static ConversationBarType valueOf(String str) {
            return (ConversationBarType) Enum.valueOf(ConversationBarType.class, str);
        }

        public static ConversationBarType[] values() {
            return (ConversationBarType[]) $VALUES.clone();
        }

        public final String i() {
            return this.nameType;
        }
    }

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ConversationCard> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ConversationCard a(Serializer serializer) {
            return new ConversationCard(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ConversationCard[i];
        }
    }

    public ConversationCard(ConversationBarType conversationBarType, String str, String str2, String str3, String str4, List<ConversationButton> list, String str5) {
        this.b = conversationBarType;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = list;
        this.h = str5;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b.i());
        serializer.m0(this.c);
        serializer.m0(this.d);
        serializer.m0(this.e);
        serializer.m0(this.f);
        serializer.o0(this.g);
        serializer.m0(this.h);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConversationCard)) {
            return false;
        }
        ConversationCard conversationCard = (ConversationCard) obj;
        return this.b == conversationCard.b && epx.f(this.c, conversationCard.c) && epx.f(this.d, conversationCard.d) && epx.f(this.e, conversationCard.e) && epx.f(this.f, conversationCard.f) && epx.f(this.g, conversationCard.g) && epx.f(this.h, conversationCard.h);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<ConversationButton> list = this.g;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        String str5 = this.h;
        return hashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConversationCard(type=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", subtitle=");
        sb.append(this.d);
        sb.append(", content=");
        sb.append(this.e);
        sb.append(", imageUrl=");
        sb.append(this.f);
        sb.append(", buttons=");
        sb.append(this.g);
        sb.append(", id=");
        return ho8.a(sb, this.h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    /* compiled from: ConversationCard.kt */
    public static final class ConversationButton extends Serializer.StreamParcelableAdapter {
        public static final Serializer.c<ConversationButton> CREATOR = new a();
        public final LayoutType b;
        public final String c;
        public final TypeDto d;
        public final StyleType e;
        public final Integer f;
        public final Action g;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ConversationCard.kt */
        public static final class LayoutType {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ LayoutType[] $VALUES;
            public static final LayoutType PRIMARY;
            public static final LayoutType SECONDARY;
            private final String nameType;

            static {
                LayoutType layoutType = new LayoutType("PRIMARY", 0, "primary");
                PRIMARY = layoutType;
                LayoutType layoutType2 = new LayoutType("SECONDARY", 1, X3.i.Y);
                SECONDARY = layoutType2;
                LayoutType[] layoutTypeArr = {layoutType, layoutType2};
                $VALUES = layoutTypeArr;
                $ENTRIES = new asp(layoutTypeArr);
            }

            public LayoutType(String str, int i, String str2) {
                this.nameType = str2;
            }

            public static zrp<LayoutType> h() {
                return $ENTRIES;
            }

            public static LayoutType valueOf(String str) {
                return (LayoutType) Enum.valueOf(LayoutType.class, str);
            }

            public static LayoutType[] values() {
                return (LayoutType[]) $VALUES.clone();
            }

            public final String i() {
                return this.nameType;
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ConversationCard.kt */
        public static final class StyleType {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ StyleType[] $VALUES;
            public static final StyleType DESTRUCTIVE;
            public static final StyleType REGULAR;
            private final String styleName;

            static {
                StyleType styleType = new StyleType("REGULAR", 0, "regular");
                REGULAR = styleType;
                StyleType styleType2 = new StyleType("DESTRUCTIVE", 1, "destructive");
                DESTRUCTIVE = styleType2;
                StyleType[] styleTypeArr = {styleType, styleType2};
                $VALUES = styleTypeArr;
                $ENTRIES = new asp(styleTypeArr);
            }

            public StyleType(String str, int i, String str2) {
                this.styleName = str2;
            }

            public static zrp<StyleType> h() {
                return $ENTRIES;
            }

            public static StyleType valueOf(String str) {
                return (StyleType) Enum.valueOf(StyleType.class, str);
            }

            public static StyleType[] values() {
                return (StyleType[]) $VALUES.clone();
            }

            public final String i() {
                return this.styleName;
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ConversationCard.kt */
        public static final class TypeDto {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final TypeDto ACCEPT_MESSAGE_REQUEST;
            public static final TypeDto CUSTOM_ACTION;
            public static final TypeDto OPEN_MINIAPP;
            public static final TypeDto REJECT_MESSAGE_REQUEST;
            public static final TypeDto SEND_MESSAGE_REQUEST;
            public static final TypeDto UNKNOWN;
            private final String nameType;

            static {
                TypeDto typeDto = new TypeDto("SEND_MESSAGE_REQUEST", 0, "send_message_request");
                SEND_MESSAGE_REQUEST = typeDto;
                TypeDto typeDto2 = new TypeDto("ACCEPT_MESSAGE_REQUEST", 1, "accept_message_request");
                ACCEPT_MESSAGE_REQUEST = typeDto2;
                TypeDto typeDto3 = new TypeDto("REJECT_MESSAGE_REQUEST", 2, "reject_message_request");
                REJECT_MESSAGE_REQUEST = typeDto3;
                TypeDto typeDto4 = new TypeDto("OPEN_MINIAPP", 3, "open_miniapp");
                OPEN_MINIAPP = typeDto4;
                TypeDto typeDto5 = new TypeDto("CUSTOM_ACTION", 4, "custom_action");
                CUSTOM_ACTION = typeDto5;
                TypeDto typeDto6 = new TypeDto(GrsBaseInfo.CountryCodeSource.UNKNOWN, 5, "unknown");
                UNKNOWN = typeDto6;
                TypeDto[] typeDtoArr = {typeDto, typeDto2, typeDto3, typeDto4, typeDto5, typeDto6};
                $VALUES = typeDtoArr;
                $ENTRIES = new asp(typeDtoArr);
            }

            public TypeDto(String str, int i, String str2) {
                this.nameType = str2;
            }

            public static zrp<TypeDto> h() {
                return $ENTRIES;
            }

            public static TypeDto valueOf(String str) {
                return (TypeDto) Enum.valueOf(TypeDto.class, str);
            }

            public static TypeDto[] values() {
                return (TypeDto[]) $VALUES.clone();
            }

            public final String i() {
                return this.nameType;
            }
        }

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<ConversationButton> {
            @Override // com.vk.core.serialize.Serializer.c
            public final ConversationButton a(Serializer serializer) {
                return new ConversationButton(serializer, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ConversationButton[i];
            }
        }

        public ConversationButton(LayoutType layoutType, String str, TypeDto typeDto, StyleType styleType, Integer num, Action action) {
            this.b = layoutType;
            this.c = str;
            this.d = typeDto;
            this.e = styleType;
            this.f = num;
            this.g = action;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.b.i());
            serializer.j0(this.c);
            serializer.j0(this.d.i());
            serializer.j0(this.e.i());
            serializer.V(this.f);
            serializer.i0(this.g);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ConversationButton)) {
                return false;
            }
            ConversationButton conversationButton = (ConversationButton) obj;
            return this.b == conversationButton.b && epx.f(this.c, conversationButton.c) && this.d == conversationButton.d && this.e == conversationButton.e && epx.f(this.f, conversationButton.f) && epx.f(this.g, conversationButton.g);
        }

        public final int hashCode() {
            int hashCode = (this.e.hashCode() + ((this.d.hashCode() + urd0.a(this.b.hashCode() * 31, 31, this.c)) * 31)) * 31;
            Integer num = this.f;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            Action action = this.g;
            return hashCode2 + (action != null ? action.hashCode() : 0);
        }

        public final String toString() {
            return "ConversationButton(layout=" + this.b + ", text=" + this.c + ", type=" + this.d + ", style=" + this.e + ", miniappId=" + this.f + ", action=" + this.g + ')';
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
        
            if (r2 == null) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x005f, code lost:
        
            if (r2 == null) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x008f, code lost:
        
            if (r0 == null) goto L42;
         */
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public ConversationButton(Serializer serializer, zcl zclVar) {
            this(r4, r5, r6, r0, serializer.v(), (Action) serializer.G(Action.class.getClassLoader()));
            LayoutType layoutType;
            TypeDto typeDto;
            StyleType styleType;
            Object obj;
            Object obj2;
            String H = serializer.H();
            Object obj3 = null;
            if (H != null) {
                Iterator<E> it = LayoutType.h().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    } else {
                        obj2 = it.next();
                        if (epx.f(((LayoutType) obj2).i(), H)) {
                            break;
                        }
                    }
                }
                layoutType = (LayoutType) obj2;
            }
            layoutType = LayoutType.SECONDARY;
            LayoutType layoutType2 = layoutType;
            String H2 = serializer.H();
            String H3 = serializer.H();
            if (H3 != null) {
                Iterator<E> it2 = TypeDto.h().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it2.next();
                        if (epx.f(((TypeDto) obj).i(), H3)) {
                            break;
                        }
                    }
                }
                typeDto = (TypeDto) obj;
            }
            typeDto = TypeDto.UNKNOWN;
            TypeDto typeDto2 = typeDto;
            String H4 = serializer.H();
            if (H4 != null) {
                Iterator<E> it3 = StyleType.h().iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    Object next = it3.next();
                    if (epx.f(((StyleType) next).i(), H4)) {
                        obj3 = next;
                        break;
                    }
                }
                styleType = (StyleType) obj3;
            }
            styleType = StyleType.REGULAR;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ConversationCard(Serializer serializer, zcl zclVar) {
        this(r0 == null ? ConversationBarType.UNKNOWN : r0, serializer.I(), serializer.I(), serializer.I(), serializer.I(), serializer.j(ConversationButton.CREATOR), serializer.I());
        Object obj;
        Iterator<E> it = ConversationBarType.h().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (epx.f(((ConversationBarType) obj).i(), serializer.I())) {
                    break;
                }
            }
        }
        ConversationBarType conversationBarType = (ConversationBarType) obj;
    }
}
