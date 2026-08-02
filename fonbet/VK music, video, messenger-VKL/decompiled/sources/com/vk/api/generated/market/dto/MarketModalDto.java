package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.unity3d.ads.BuildConfig;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.vk.api.generated.base.dto.BaseImageDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.go9;
import xsna.ho8;
import xsna.ms9;
import xsna.pmi0;
import xsna.up;
import xsna.urd0;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MarketModalDto.kt */
/* loaded from: classes15.dex */
public abstract class MarketModalDto implements Parcelable {

    /* compiled from: MarketModalDto.kt */
    public static final class Deserializer implements a9y<MarketModalDto> {
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
         */
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            String f = up.f(b9yVar, "type");
            if (f != null) {
                switch (f.hashCode()) {
                    case 327164512:
                        if (f.equals("approve_info")) {
                            return (MarketModalDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, MarketModalApproveInfoDto.class);
                        }
                        break;
                    case 609087238:
                        if (f.equals("integration_full_size")) {
                            return (MarketModalDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, MarketModalIntegrationFullSizeDto.class);
                        }
                        break;
                    case 758299324:
                        if (f.equals("ozon_full_size")) {
                            return (MarketModalDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, MarketModalOzonFullSizeDto.class);
                        }
                        break;
                    case 1544803905:
                        if (f.equals(BuildConfig.FLAVOR)) {
                            return (MarketModalDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, MarketModalDefaultDto.class);
                        }
                        break;
                }
            }
            throw new IllegalStateException(go9.b("no mapping for the type:", f));
        }
    }

    /* compiled from: MarketModalDto.kt */
    public static final class MarketModalApproveInfoDto extends MarketModalDto implements Parcelable {
        public static final Parcelable.Creator<MarketModalApproveInfoDto> CREATOR = new a();

        @pmi0("button_text")
        private final String buttonText;

        @pmi0("image")
        private final List<BaseImageDto> image;

        @pmi0("text")
        private final String text;

        @pmi0("title")
        private final String title;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: MarketModalDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;

            @pmi0("approve_info")
            public static final TypeDto APPROVE_INFO;
            public static final Parcelable.Creator<TypeDto> CREATOR;
            private final String value;

            /* compiled from: MarketModalDto.kt */
            public static final class a implements Parcelable.Creator<TypeDto> {
                @Override // android.os.Parcelable.Creator
                public final TypeDto createFromParcel(Parcel parcel) {
                    return TypeDto.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final TypeDto[] newArray(int i) {
                    return new TypeDto[i];
                }
            }

            static {
                TypeDto typeDto = new TypeDto("APPROVE_INFO", 0, "approve_info");
                APPROVE_INFO = typeDto;
                TypeDto[] typeDtoArr = {typeDto};
                $VALUES = typeDtoArr;
                $ENTRIES = new asp(typeDtoArr);
                CREATOR = new a();
            }

            private TypeDto(String str, int i, String str2) {
                this.value = str2;
            }

            public static TypeDto valueOf(String str) {
                return (TypeDto) Enum.valueOf(TypeDto.class, str);
            }

            public static TypeDto[] values() {
                return (TypeDto[]) $VALUES.clone();
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(name());
            }
        }

        /* compiled from: MarketModalDto.kt */
        public static final class a implements Parcelable.Creator<MarketModalApproveInfoDto> {
            @Override // android.os.Parcelable.Creator
            public final MarketModalApproveInfoDto createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(readInt);
                    int i = 0;
                    while (i != readInt) {
                        i = bo.b(MarketModalApproveInfoDto.class, parcel, arrayList2, i, 1);
                    }
                    arrayList = arrayList2;
                }
                return new MarketModalApproveInfoDto(createFromParcel, readString, readString2, readString3, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final MarketModalApproveInfoDto[] newArray(int i) {
                return new MarketModalApproveInfoDto[i];
            }
        }

        public /* synthetic */ MarketModalApproveInfoDto(TypeDto typeDto, String str, String str2, String str3, List list, int i, zcl zclVar) {
            this(typeDto, str, str2, str3, (i & 16) != 0 ? null : list);
        }

        public final String d() {
            return this.buttonText;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final List<BaseImageDto> e() {
            return this.image;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MarketModalApproveInfoDto)) {
                return false;
            }
            MarketModalApproveInfoDto marketModalApproveInfoDto = (MarketModalApproveInfoDto) obj;
            return this.type == marketModalApproveInfoDto.type && epx.f(this.title, marketModalApproveInfoDto.title) && epx.f(this.text, marketModalApproveInfoDto.text) && epx.f(this.buttonText, marketModalApproveInfoDto.buttonText) && epx.f(this.image, marketModalApproveInfoDto.image);
        }

        public final String f() {
            return this.text;
        }

        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            int a2 = urd0.a(urd0.a(urd0.a(this.type.hashCode() * 31, 31, this.title), 31, this.text), 31, this.buttonText);
            List<BaseImageDto> list = this.image;
            return a2 + (list == null ? 0 : list.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MarketModalApproveInfoDto(type=");
            sb.append(this.type);
            sb.append(", title=");
            sb.append(this.title);
            sb.append(", text=");
            sb.append(this.text);
            sb.append(", buttonText=");
            sb.append(this.buttonText);
            sb.append(", image=");
            return ms9.a(')', sb, this.image);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeString(this.title);
            parcel.writeString(this.text);
            parcel.writeString(this.buttonText);
            List<BaseImageDto> list = this.image;
            if (list == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }

        public MarketModalApproveInfoDto(TypeDto typeDto, String str, String str2, String str3, List<BaseImageDto> list) {
            super(null);
            this.type = typeDto;
            this.title = str;
            this.text = str2;
            this.buttonText = str3;
            this.image = list;
        }
    }

    /* compiled from: MarketModalDto.kt */
    public static final class MarketModalDefaultDto extends MarketModalDto implements Parcelable {
        public static final Parcelable.Creator<MarketModalDefaultDto> CREATOR = new a();

        @pmi0("text")
        private final String text;

        @pmi0("title")
        private final String title;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: MarketModalDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0(BuildConfig.FLAVOR)
            public static final TypeDto DEFAULT;
            private final String value;

            /* compiled from: MarketModalDto.kt */
            public static final class a implements Parcelable.Creator<TypeDto> {
                @Override // android.os.Parcelable.Creator
                public final TypeDto createFromParcel(Parcel parcel) {
                    return TypeDto.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final TypeDto[] newArray(int i) {
                    return new TypeDto[i];
                }
            }

            static {
                TypeDto typeDto = new TypeDto("DEFAULT", 0, BuildConfig.FLAVOR);
                DEFAULT = typeDto;
                TypeDto[] typeDtoArr = {typeDto};
                $VALUES = typeDtoArr;
                $ENTRIES = new asp(typeDtoArr);
                CREATOR = new a();
            }

            private TypeDto(String str, int i, String str2) {
                this.value = str2;
            }

            public static TypeDto valueOf(String str) {
                return (TypeDto) Enum.valueOf(TypeDto.class, str);
            }

            public static TypeDto[] values() {
                return (TypeDto[]) $VALUES.clone();
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(name());
            }
        }

        /* compiled from: MarketModalDto.kt */
        public static final class a implements Parcelable.Creator<MarketModalDefaultDto> {
            @Override // android.os.Parcelable.Creator
            public final MarketModalDefaultDto createFromParcel(Parcel parcel) {
                return new MarketModalDefaultDto(TypeDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final MarketModalDefaultDto[] newArray(int i) {
                return new MarketModalDefaultDto[i];
            }
        }

        public MarketModalDefaultDto(TypeDto typeDto, String str, String str2) {
            super(null);
            this.type = typeDto;
            this.title = str;
            this.text = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MarketModalDefaultDto)) {
                return false;
            }
            MarketModalDefaultDto marketModalDefaultDto = (MarketModalDefaultDto) obj;
            return this.type == marketModalDefaultDto.type && epx.f(this.title, marketModalDefaultDto.title) && epx.f(this.text, marketModalDefaultDto.text);
        }

        public final int hashCode() {
            return this.text.hashCode() + urd0.a(this.type.hashCode() * 31, 31, this.title);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MarketModalDefaultDto(type=");
            sb.append(this.type);
            sb.append(", title=");
            sb.append(this.title);
            sb.append(", text=");
            return ho8.a(sb, this.text, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeString(this.title);
            parcel.writeString(this.text);
        }
    }

    /* compiled from: MarketModalDto.kt */
    public static final class MarketModalIntegrationFullSizeDto extends MarketModalDto implements Parcelable {
        public static final Parcelable.Creator<MarketModalIntegrationFullSizeDto> CREATOR = new a();

        @pmi0("button_text")
        private final String buttonText;

        @pmi0(HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT)
        private final List<MarketModalIntegrationFullSizeContentItemDto> content;

        @pmi0("image")
        private final List<BaseImageDto> image;

        @pmi0("text")
        private final String text;

        @pmi0("title")
        private final String title;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: MarketModalDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("integration_full_size")
            public static final TypeDto INTEGRATION_FULL_SIZE;
            private final String value;

            /* compiled from: MarketModalDto.kt */
            public static final class a implements Parcelable.Creator<TypeDto> {
                @Override // android.os.Parcelable.Creator
                public final TypeDto createFromParcel(Parcel parcel) {
                    return TypeDto.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final TypeDto[] newArray(int i) {
                    return new TypeDto[i];
                }
            }

            static {
                TypeDto typeDto = new TypeDto("INTEGRATION_FULL_SIZE", 0, "integration_full_size");
                INTEGRATION_FULL_SIZE = typeDto;
                TypeDto[] typeDtoArr = {typeDto};
                $VALUES = typeDtoArr;
                $ENTRIES = new asp(typeDtoArr);
                CREATOR = new a();
            }

            private TypeDto(String str, int i, String str2) {
                this.value = str2;
            }

            public static TypeDto valueOf(String str) {
                return (TypeDto) Enum.valueOf(TypeDto.class, str);
            }

            public static TypeDto[] values() {
                return (TypeDto[]) $VALUES.clone();
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(name());
            }
        }

        /* compiled from: MarketModalDto.kt */
        public static final class a implements Parcelable.Creator<MarketModalIntegrationFullSizeDto> {
            @Override // android.os.Parcelable.Creator
            public final MarketModalIntegrationFullSizeDto createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                int i = 0;
                ArrayList arrayList2 = null;
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    arrayList = new ArrayList(readInt);
                    int i2 = 0;
                    while (i2 != readInt) {
                        i2 = bo.b(MarketModalIntegrationFullSizeDto.class, parcel, arrayList, i2, 1);
                    }
                }
                if (parcel.readInt() != 0) {
                    int readInt2 = parcel.readInt();
                    arrayList2 = new ArrayList(readInt2);
                    while (i != readInt2) {
                        i = en.a(MarketModalIntegrationFullSizeContentItemDto.CREATOR, parcel, arrayList2, i, 1);
                    }
                }
                return new MarketModalIntegrationFullSizeDto(createFromParcel, readString, readString2, readString3, arrayList, arrayList2);
            }

            @Override // android.os.Parcelable.Creator
            public final MarketModalIntegrationFullSizeDto[] newArray(int i) {
                return new MarketModalIntegrationFullSizeDto[i];
            }
        }

        public /* synthetic */ MarketModalIntegrationFullSizeDto(TypeDto typeDto, String str, String str2, String str3, List list, List list2, int i, zcl zclVar) {
            this(typeDto, str, str2, str3, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : list2);
        }

        public final String d() {
            return this.buttonText;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final List<MarketModalIntegrationFullSizeContentItemDto> e() {
            return this.content;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MarketModalIntegrationFullSizeDto)) {
                return false;
            }
            MarketModalIntegrationFullSizeDto marketModalIntegrationFullSizeDto = (MarketModalIntegrationFullSizeDto) obj;
            return this.type == marketModalIntegrationFullSizeDto.type && epx.f(this.title, marketModalIntegrationFullSizeDto.title) && epx.f(this.text, marketModalIntegrationFullSizeDto.text) && epx.f(this.buttonText, marketModalIntegrationFullSizeDto.buttonText) && epx.f(this.image, marketModalIntegrationFullSizeDto.image) && epx.f(this.content, marketModalIntegrationFullSizeDto.content);
        }

        public final List<BaseImageDto> f() {
            return this.image;
        }

        public final String g() {
            return this.text;
        }

        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            int a2 = urd0.a(urd0.a(urd0.a(this.type.hashCode() * 31, 31, this.title), 31, this.text), 31, this.buttonText);
            List<BaseImageDto> list = this.image;
            int hashCode = (a2 + (list == null ? 0 : list.hashCode())) * 31;
            List<MarketModalIntegrationFullSizeContentItemDto> list2 = this.content;
            return hashCode + (list2 != null ? list2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MarketModalIntegrationFullSizeDto(type=");
            sb.append(this.type);
            sb.append(", title=");
            sb.append(this.title);
            sb.append(", text=");
            sb.append(this.text);
            sb.append(", buttonText=");
            sb.append(this.buttonText);
            sb.append(", image=");
            sb.append(this.image);
            sb.append(", content=");
            return ms9.a(')', sb, this.content);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeString(this.title);
            parcel.writeString(this.text);
            parcel.writeString(this.buttonText);
            List<BaseImageDto> list = this.image;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator f = dn.f(parcel, list, 1);
                while (f.hasNext()) {
                    parcel.writeParcelable((Parcelable) f.next(), i);
                }
            }
            List<MarketModalIntegrationFullSizeContentItemDto> list2 = this.content;
            if (list2 == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                ((MarketModalIntegrationFullSizeContentItemDto) f2.next()).writeToParcel(parcel, i);
            }
        }

        public MarketModalIntegrationFullSizeDto(TypeDto typeDto, String str, String str2, String str3, List<BaseImageDto> list, List<MarketModalIntegrationFullSizeContentItemDto> list2) {
            super(null);
            this.type = typeDto;
            this.title = str;
            this.text = str2;
            this.buttonText = str3;
            this.image = list;
            this.content = list2;
        }
    }

    /* compiled from: MarketModalDto.kt */
    public static final class MarketModalOzonFullSizeDto extends MarketModalDto implements Parcelable {
        public static final Parcelable.Creator<MarketModalOzonFullSizeDto> CREATOR = new a();

        @pmi0("button_text")
        private final String buttonText;

        @pmi0(HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT)
        private final List<MarketModalOzonFullSizeContentItemDto> content;

        @pmi0("image")
        private final List<BaseImageDto> image;

        @pmi0("text")
        private final String text;

        @pmi0("title")
        private final String title;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: MarketModalDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("ozon_full_size")
            public static final TypeDto OZON_FULL_SIZE;
            private final String value;

            /* compiled from: MarketModalDto.kt */
            public static final class a implements Parcelable.Creator<TypeDto> {
                @Override // android.os.Parcelable.Creator
                public final TypeDto createFromParcel(Parcel parcel) {
                    return TypeDto.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final TypeDto[] newArray(int i) {
                    return new TypeDto[i];
                }
            }

            static {
                TypeDto typeDto = new TypeDto("OZON_FULL_SIZE", 0, "ozon_full_size");
                OZON_FULL_SIZE = typeDto;
                TypeDto[] typeDtoArr = {typeDto};
                $VALUES = typeDtoArr;
                $ENTRIES = new asp(typeDtoArr);
                CREATOR = new a();
            }

            private TypeDto(String str, int i, String str2) {
                this.value = str2;
            }

            public static TypeDto valueOf(String str) {
                return (TypeDto) Enum.valueOf(TypeDto.class, str);
            }

            public static TypeDto[] values() {
                return (TypeDto[]) $VALUES.clone();
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(name());
            }
        }

        /* compiled from: MarketModalDto.kt */
        public static final class a implements Parcelable.Creator<MarketModalOzonFullSizeDto> {
            @Override // android.os.Parcelable.Creator
            public final MarketModalOzonFullSizeDto createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                int i = 0;
                ArrayList arrayList2 = null;
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    arrayList = new ArrayList(readInt);
                    int i2 = 0;
                    while (i2 != readInt) {
                        i2 = bo.b(MarketModalOzonFullSizeDto.class, parcel, arrayList, i2, 1);
                    }
                }
                if (parcel.readInt() != 0) {
                    int readInt2 = parcel.readInt();
                    arrayList2 = new ArrayList(readInt2);
                    while (i != readInt2) {
                        i = en.a(MarketModalOzonFullSizeContentItemDto.CREATOR, parcel, arrayList2, i, 1);
                    }
                }
                return new MarketModalOzonFullSizeDto(createFromParcel, readString, readString2, readString3, arrayList, arrayList2);
            }

            @Override // android.os.Parcelable.Creator
            public final MarketModalOzonFullSizeDto[] newArray(int i) {
                return new MarketModalOzonFullSizeDto[i];
            }
        }

        public /* synthetic */ MarketModalOzonFullSizeDto(TypeDto typeDto, String str, String str2, String str3, List list, List list2, int i, zcl zclVar) {
            this(typeDto, str, str2, str3, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : list2);
        }

        public final String d() {
            return this.buttonText;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final List<MarketModalOzonFullSizeContentItemDto> e() {
            return this.content;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MarketModalOzonFullSizeDto)) {
                return false;
            }
            MarketModalOzonFullSizeDto marketModalOzonFullSizeDto = (MarketModalOzonFullSizeDto) obj;
            return this.type == marketModalOzonFullSizeDto.type && epx.f(this.title, marketModalOzonFullSizeDto.title) && epx.f(this.text, marketModalOzonFullSizeDto.text) && epx.f(this.buttonText, marketModalOzonFullSizeDto.buttonText) && epx.f(this.image, marketModalOzonFullSizeDto.image) && epx.f(this.content, marketModalOzonFullSizeDto.content);
        }

        public final List<BaseImageDto> f() {
            return this.image;
        }

        public final String g() {
            return this.text;
        }

        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            int a2 = urd0.a(urd0.a(urd0.a(this.type.hashCode() * 31, 31, this.title), 31, this.text), 31, this.buttonText);
            List<BaseImageDto> list = this.image;
            int hashCode = (a2 + (list == null ? 0 : list.hashCode())) * 31;
            List<MarketModalOzonFullSizeContentItemDto> list2 = this.content;
            return hashCode + (list2 != null ? list2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MarketModalOzonFullSizeDto(type=");
            sb.append(this.type);
            sb.append(", title=");
            sb.append(this.title);
            sb.append(", text=");
            sb.append(this.text);
            sb.append(", buttonText=");
            sb.append(this.buttonText);
            sb.append(", image=");
            sb.append(this.image);
            sb.append(", content=");
            return ms9.a(')', sb, this.content);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeString(this.title);
            parcel.writeString(this.text);
            parcel.writeString(this.buttonText);
            List<BaseImageDto> list = this.image;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator f = dn.f(parcel, list, 1);
                while (f.hasNext()) {
                    parcel.writeParcelable((Parcelable) f.next(), i);
                }
            }
            List<MarketModalOzonFullSizeContentItemDto> list2 = this.content;
            if (list2 == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                ((MarketModalOzonFullSizeContentItemDto) f2.next()).writeToParcel(parcel, i);
            }
        }

        public MarketModalOzonFullSizeDto(TypeDto typeDto, String str, String str2, String str3, List<BaseImageDto> list, List<MarketModalOzonFullSizeContentItemDto> list2) {
            super(null);
            this.type = typeDto;
            this.title = str;
            this.text = str2;
            this.buttonText = str3;
            this.image = list;
            this.content = list2;
        }
    }

    public /* synthetic */ MarketModalDto(zcl zclVar) {
        this();
    }

    private MarketModalDto() {
    }
}
