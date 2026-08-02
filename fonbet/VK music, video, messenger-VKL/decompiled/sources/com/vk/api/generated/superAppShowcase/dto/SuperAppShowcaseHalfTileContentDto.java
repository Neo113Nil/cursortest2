package com.vk.api.generated.superAppShowcase.dto;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.vk.api.generated.superApp.dto.SuperAppUniversalWidgetImageBlockDto;
import com.vk.api.generated.superApp.dto.SuperAppUniversalWidgetImageItemDto;
import io.appmetrica.analytics.impl.L2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.a9y;
import xsna.ao;
import xsna.asp;
import xsna.b9y;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.go9;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.up;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SuperAppShowcaseHalfTileContentDto.kt */
/* loaded from: classes.dex */
public abstract class SuperAppShowcaseHalfTileContentDto implements Parcelable {

    /* compiled from: SuperAppShowcaseHalfTileContentDto.kt */
    public static final class Deserializer implements a9y<SuperAppShowcaseHalfTileContentDto> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            String f = up.f(b9yVar, "type");
            if (f != null) {
                int hashCode = f.hashCode();
                if (hashCode != -1001078227) {
                    if (hashCode != 1086463900) {
                        if (hashCode == 1934806292 && f.equals("user_stack")) {
                            return (SuperAppShowcaseHalfTileContentDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppShowcaseTileForegroundUserStackDto.class);
                        }
                    } else if (f.equals("regular")) {
                        return (SuperAppShowcaseHalfTileContentDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppShowcaseHalfTileContentRegularDto.class);
                    }
                } else if (f.equals(NotificationCompat.CATEGORY_PROGRESS)) {
                    return (SuperAppShowcaseHalfTileContentDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppShowcaseHalfTileContentProgressDto.class);
                }
            }
            throw new IllegalStateException(go9.b("no mapping for the type:", f));
        }
    }

    /* compiled from: SuperAppShowcaseHalfTileContentDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppShowcaseHalfTileContentProgressDto extends SuperAppShowcaseHalfTileContentDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppShowcaseHalfTileContentProgressDto> CREATOR = new a();

        @pmi0("icon")
        private final SuperAppShowcaseHalfTileUniversalIconDto icon;

        @pmi0(NotificationCompat.CATEGORY_PROGRESS)
        private final SuperAppShowcaseHalfTileContentProgressProgressBarDto progress;

        @pmi0("title_block")
        private final SuperAppShowcaseHalfTileTitleBlockDto titleBlock;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppShowcaseHalfTileContentDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0(NotificationCompat.CATEGORY_PROGRESS)
            public static final TypeDto PROGRESS;
            private final String value;

            /* compiled from: SuperAppShowcaseHalfTileContentDto.kt */
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
                TypeDto typeDto = new TypeDto("PROGRESS", 0, NotificationCompat.CATEGORY_PROGRESS);
                PROGRESS = typeDto;
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

        /* compiled from: SuperAppShowcaseHalfTileContentDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppShowcaseHalfTileContentProgressDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcaseHalfTileContentProgressDto createFromParcel(Parcel parcel) {
                return new SuperAppShowcaseHalfTileContentProgressDto(TypeDto.CREATOR.createFromParcel(parcel), SuperAppShowcaseHalfTileTitleBlockDto.CREATOR.createFromParcel(parcel), SuperAppShowcaseHalfTileContentProgressProgressBarDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SuperAppShowcaseHalfTileUniversalIconDto.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcaseHalfTileContentProgressDto[] newArray(int i) {
                return new SuperAppShowcaseHalfTileContentProgressDto[i];
            }
        }

        public /* synthetic */ SuperAppShowcaseHalfTileContentProgressDto(TypeDto typeDto, SuperAppShowcaseHalfTileTitleBlockDto superAppShowcaseHalfTileTitleBlockDto, SuperAppShowcaseHalfTileContentProgressProgressBarDto superAppShowcaseHalfTileContentProgressProgressBarDto, SuperAppShowcaseHalfTileUniversalIconDto superAppShowcaseHalfTileUniversalIconDto, int i, zcl zclVar) {
            this(typeDto, superAppShowcaseHalfTileTitleBlockDto, superAppShowcaseHalfTileContentProgressProgressBarDto, (i & 8) != 0 ? null : superAppShowcaseHalfTileUniversalIconDto);
        }

        public final SuperAppShowcaseHalfTileUniversalIconDto d() {
            return this.icon;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final SuperAppShowcaseHalfTileContentProgressProgressBarDto e() {
            return this.progress;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppShowcaseHalfTileContentProgressDto)) {
                return false;
            }
            SuperAppShowcaseHalfTileContentProgressDto superAppShowcaseHalfTileContentProgressDto = (SuperAppShowcaseHalfTileContentProgressDto) obj;
            return this.type == superAppShowcaseHalfTileContentProgressDto.type && epx.f(this.titleBlock, superAppShowcaseHalfTileContentProgressDto.titleBlock) && epx.f(this.progress, superAppShowcaseHalfTileContentProgressDto.progress) && epx.f(this.icon, superAppShowcaseHalfTileContentProgressDto.icon);
        }

        public final SuperAppShowcaseHalfTileTitleBlockDto f() {
            return this.titleBlock;
        }

        public final int hashCode() {
            int hashCode = (this.progress.hashCode() + ((this.titleBlock.hashCode() + (this.type.hashCode() * 31)) * 31)) * 31;
            SuperAppShowcaseHalfTileUniversalIconDto superAppShowcaseHalfTileUniversalIconDto = this.icon;
            return hashCode + (superAppShowcaseHalfTileUniversalIconDto == null ? 0 : superAppShowcaseHalfTileUniversalIconDto.hashCode());
        }

        public final String toString() {
            return "SuperAppShowcaseHalfTileContentProgressDto(type=" + this.type + ", titleBlock=" + this.titleBlock + ", progress=" + this.progress + ", icon=" + this.icon + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            this.titleBlock.writeToParcel(parcel, i);
            this.progress.writeToParcel(parcel, i);
            SuperAppShowcaseHalfTileUniversalIconDto superAppShowcaseHalfTileUniversalIconDto = this.icon;
            if (superAppShowcaseHalfTileUniversalIconDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppShowcaseHalfTileUniversalIconDto.writeToParcel(parcel, i);
            }
        }

        public SuperAppShowcaseHalfTileContentProgressDto(TypeDto typeDto, SuperAppShowcaseHalfTileTitleBlockDto superAppShowcaseHalfTileTitleBlockDto, SuperAppShowcaseHalfTileContentProgressProgressBarDto superAppShowcaseHalfTileContentProgressProgressBarDto, SuperAppShowcaseHalfTileUniversalIconDto superAppShowcaseHalfTileUniversalIconDto) {
            super(null);
            this.type = typeDto;
            this.titleBlock = superAppShowcaseHalfTileTitleBlockDto;
            this.progress = superAppShowcaseHalfTileContentProgressProgressBarDto;
            this.icon = superAppShowcaseHalfTileUniversalIconDto;
        }
    }

    /* compiled from: SuperAppShowcaseHalfTileContentDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppShowcaseHalfTileContentRegularDto extends SuperAppShowcaseHalfTileContentDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppShowcaseHalfTileContentRegularDto> CREATOR = new a();

        @pmi0(L2.g)
        private final List<SuperAppUniversalWidgetImageItemDto> background;

        @pmi0("description")
        private final String description;

        @pmi0("icon")
        private final SuperAppShowcaseHalfTileContentRegularIconDto icon;

        @pmi0("title_block")
        private final SuperAppShowcaseHalfTileTitleBlockDto titleBlock;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppShowcaseHalfTileContentDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("regular")
            public static final TypeDto REGULAR;
            private final String value;

            /* compiled from: SuperAppShowcaseHalfTileContentDto.kt */
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
                TypeDto typeDto = new TypeDto("REGULAR", 0, "regular");
                REGULAR = typeDto;
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

        /* compiled from: SuperAppShowcaseHalfTileContentDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppShowcaseHalfTileContentRegularDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcaseHalfTileContentRegularDto createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
                SuperAppShowcaseHalfTileTitleBlockDto createFromParcel2 = SuperAppShowcaseHalfTileTitleBlockDto.CREATOR.createFromParcel(parcel);
                String readString = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(readInt);
                    int i = 0;
                    while (i != readInt) {
                        i = en.a(SuperAppUniversalWidgetImageItemDto.CREATOR, parcel, arrayList2, i, 1);
                    }
                    arrayList = arrayList2;
                }
                return new SuperAppShowcaseHalfTileContentRegularDto(createFromParcel, createFromParcel2, readString, arrayList, (SuperAppShowcaseHalfTileContentRegularIconDto) parcel.readParcelable(SuperAppShowcaseHalfTileContentRegularDto.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcaseHalfTileContentRegularDto[] newArray(int i) {
                return new SuperAppShowcaseHalfTileContentRegularDto[i];
            }
        }

        public /* synthetic */ SuperAppShowcaseHalfTileContentRegularDto(TypeDto typeDto, SuperAppShowcaseHalfTileTitleBlockDto superAppShowcaseHalfTileTitleBlockDto, String str, List list, SuperAppShowcaseHalfTileContentRegularIconDto superAppShowcaseHalfTileContentRegularIconDto, int i, zcl zclVar) {
            this(typeDto, superAppShowcaseHalfTileTitleBlockDto, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : superAppShowcaseHalfTileContentRegularIconDto);
        }

        public final List<SuperAppUniversalWidgetImageItemDto> d() {
            return this.background;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final SuperAppShowcaseHalfTileContentRegularIconDto e() {
            return this.icon;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppShowcaseHalfTileContentRegularDto)) {
                return false;
            }
            SuperAppShowcaseHalfTileContentRegularDto superAppShowcaseHalfTileContentRegularDto = (SuperAppShowcaseHalfTileContentRegularDto) obj;
            return this.type == superAppShowcaseHalfTileContentRegularDto.type && epx.f(this.titleBlock, superAppShowcaseHalfTileContentRegularDto.titleBlock) && epx.f(this.description, superAppShowcaseHalfTileContentRegularDto.description) && epx.f(this.background, superAppShowcaseHalfTileContentRegularDto.background) && epx.f(this.icon, superAppShowcaseHalfTileContentRegularDto.icon);
        }

        public final SuperAppShowcaseHalfTileTitleBlockDto f() {
            return this.titleBlock;
        }

        public final String getDescription() {
            return this.description;
        }

        public final int hashCode() {
            int hashCode = (this.titleBlock.hashCode() + (this.type.hashCode() * 31)) * 31;
            String str = this.description;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            List<SuperAppUniversalWidgetImageItemDto> list = this.background;
            int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
            SuperAppShowcaseHalfTileContentRegularIconDto superAppShowcaseHalfTileContentRegularIconDto = this.icon;
            return hashCode3 + (superAppShowcaseHalfTileContentRegularIconDto != null ? superAppShowcaseHalfTileContentRegularIconDto.hashCode() : 0);
        }

        public final String toString() {
            return "SuperAppShowcaseHalfTileContentRegularDto(type=" + this.type + ", titleBlock=" + this.titleBlock + ", description=" + this.description + ", background=" + this.background + ", icon=" + this.icon + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            this.titleBlock.writeToParcel(parcel, i);
            parcel.writeString(this.description);
            List<SuperAppUniversalWidgetImageItemDto> list = this.background;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator f = dn.f(parcel, list, 1);
                while (f.hasNext()) {
                    ((SuperAppUniversalWidgetImageItemDto) f.next()).writeToParcel(parcel, i);
                }
            }
            parcel.writeParcelable(this.icon, i);
        }

        public SuperAppShowcaseHalfTileContentRegularDto(TypeDto typeDto, SuperAppShowcaseHalfTileTitleBlockDto superAppShowcaseHalfTileTitleBlockDto, String str, List<SuperAppUniversalWidgetImageItemDto> list, SuperAppShowcaseHalfTileContentRegularIconDto superAppShowcaseHalfTileContentRegularIconDto) {
            super(null);
            this.type = typeDto;
            this.titleBlock = superAppShowcaseHalfTileTitleBlockDto;
            this.description = str;
            this.background = list;
            this.icon = superAppShowcaseHalfTileContentRegularIconDto;
        }
    }

    /* compiled from: SuperAppShowcaseHalfTileContentDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppShowcaseTileForegroundUserStackDto extends SuperAppShowcaseHalfTileContentDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppShowcaseTileForegroundUserStackDto> CREATOR = new a();

        @pmi0("count")
        private final Integer count;

        @pmi0("items")
        private final List<SuperAppUniversalWidgetImageBlockDto> items;

        @pmi0("text")
        private final String text;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppShowcaseHalfTileContentDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("user_stack")
            public static final TypeDto USER_STACK;
            private final String value;

            /* compiled from: SuperAppShowcaseHalfTileContentDto.kt */
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
                TypeDto typeDto = new TypeDto("USER_STACK", 0, "user_stack");
                USER_STACK = typeDto;
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

        /* compiled from: SuperAppShowcaseHalfTileContentDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppShowcaseTileForegroundUserStackDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcaseTileForegroundUserStackDto createFromParcel(Parcel parcel) {
                TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(SuperAppShowcaseTileForegroundUserStackDto.class, parcel, arrayList, i, 1);
                }
                return new SuperAppShowcaseTileForegroundUserStackDto(createFromParcel, arrayList, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcaseTileForegroundUserStackDto[] newArray(int i) {
                return new SuperAppShowcaseTileForegroundUserStackDto[i];
            }
        }

        public /* synthetic */ SuperAppShowcaseTileForegroundUserStackDto(TypeDto typeDto, List list, Integer num, String str, int i, zcl zclVar) {
            this(typeDto, list, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str);
        }

        public final Integer d() {
            return this.count;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final List<SuperAppUniversalWidgetImageBlockDto> e() {
            return this.items;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppShowcaseTileForegroundUserStackDto)) {
                return false;
            }
            SuperAppShowcaseTileForegroundUserStackDto superAppShowcaseTileForegroundUserStackDto = (SuperAppShowcaseTileForegroundUserStackDto) obj;
            return this.type == superAppShowcaseTileForegroundUserStackDto.type && epx.f(this.items, superAppShowcaseTileForegroundUserStackDto.items) && epx.f(this.count, superAppShowcaseTileForegroundUserStackDto.count) && epx.f(this.text, superAppShowcaseTileForegroundUserStackDto.text);
        }

        public final String f() {
            return this.text;
        }

        public final int hashCode() {
            int a2 = fw3.a(this.type.hashCode() * 31, 31, this.items);
            Integer num = this.count;
            int hashCode = (a2 + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.text;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SuperAppShowcaseTileForegroundUserStackDto(type=");
            sb.append(this.type);
            sb.append(", items=");
            sb.append(this.items);
            sb.append(", count=");
            sb.append(this.count);
            sb.append(", text=");
            return ho8.a(sb, this.text, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            Iterator a2 = ao.a(parcel, this.items);
            while (a2.hasNext()) {
                parcel.writeParcelable((Parcelable) a2.next(), i);
            }
            Integer num = this.count;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num);
            }
            parcel.writeString(this.text);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SuperAppShowcaseTileForegroundUserStackDto(TypeDto typeDto, List<? extends SuperAppUniversalWidgetImageBlockDto> list, Integer num, String str) {
            super(null);
            this.type = typeDto;
            this.items = list;
            this.count = num;
            this.text = str;
        }
    }

    public /* synthetic */ SuperAppShowcaseHalfTileContentDto(zcl zclVar) {
        this();
    }

    private SuperAppShowcaseHalfTileContentDto() {
    }
}
