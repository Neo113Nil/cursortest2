package com.vk.api.generated.superAppShowcase.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.vk.api.generated.apps.dto.AppsAppDto;
import com.vk.api.generated.apps.dto.AppsAppMinDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.a9y;
import xsna.ao;
import xsna.asp;
import xsna.b9y;
import xsna.bo;
import xsna.epx;
import xsna.fw3;
import xsna.go9;
import xsna.ho8;
import xsna.ms9;
import xsna.pmi0;
import xsna.up;
import xsna.urd0;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SuperAppShowcaseQueueEventDto.kt */
/* loaded from: classes.dex */
public abstract class SuperAppShowcaseQueueEventDto implements Parcelable {

    /* compiled from: SuperAppShowcaseQueueEventDto.kt */
    public static final class Deserializer implements a9y<SuperAppShowcaseQueueEventDto> {
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException
         */
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            String f = up.f(b9yVar, "action");
            if (f != null) {
                switch (f.hashCode()) {
                    case -379150967:
                        if (f.equals("rerender")) {
                            return (SuperAppShowcaseQueueEventDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppShowcaseRerenderEventDto.class);
                        }
                        break;
                    case -292928480:
                        if (f.equals("rerender_inner")) {
                            return (SuperAppShowcaseQueueEventDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppShowcaseRerenderInnerEventDto.class);
                        }
                        break;
                    case 3202370:
                        if (f.equals("hide")) {
                            return (SuperAppShowcaseQueueEventDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppShowcaseHideEventDto.class);
                        }
                        break;
                    case 3529469:
                        if (f.equals("show")) {
                            return (SuperAppShowcaseQueueEventDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppShowcaseShowEventDto.class);
                        }
                        break;
                }
            }
            throw new IllegalStateException(go9.b("no mapping for the type:", f));
        }
    }

    /* compiled from: SuperAppShowcaseQueueEventDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppShowcaseHideEventDto extends SuperAppShowcaseQueueEventDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppShowcaseHideEventDto> CREATOR = new a();

        @pmi0("action")
        private final ActionDto action;

        @pmi0("object_uid")
        private final String objectUid;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppShowcaseQueueEventDto.kt */
        public static final class ActionDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ ActionDto[] $VALUES;
            public static final Parcelable.Creator<ActionDto> CREATOR;

            @pmi0("hide")
            public static final ActionDto HIDE;
            private final String value;

            /* compiled from: SuperAppShowcaseQueueEventDto.kt */
            public static final class a implements Parcelable.Creator<ActionDto> {
                @Override // android.os.Parcelable.Creator
                public final ActionDto createFromParcel(Parcel parcel) {
                    return ActionDto.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final ActionDto[] newArray(int i) {
                    return new ActionDto[i];
                }
            }

            static {
                ActionDto actionDto = new ActionDto("HIDE", 0, "hide");
                HIDE = actionDto;
                ActionDto[] actionDtoArr = {actionDto};
                $VALUES = actionDtoArr;
                $ENTRIES = new asp(actionDtoArr);
                CREATOR = new a();
            }

            private ActionDto(String str, int i, String str2) {
                this.value = str2;
            }

            public static ActionDto valueOf(String str) {
                return (ActionDto) Enum.valueOf(ActionDto.class, str);
            }

            public static ActionDto[] values() {
                return (ActionDto[]) $VALUES.clone();
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

        /* compiled from: SuperAppShowcaseQueueEventDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppShowcaseHideEventDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcaseHideEventDto createFromParcel(Parcel parcel) {
                return new SuperAppShowcaseHideEventDto(ActionDto.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcaseHideEventDto[] newArray(int i) {
                return new SuperAppShowcaseHideEventDto[i];
            }
        }

        public SuperAppShowcaseHideEventDto(ActionDto actionDto, String str) {
            super(null);
            this.action = actionDto;
            this.objectUid = str;
        }

        public final String d() {
            return this.objectUid;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppShowcaseHideEventDto)) {
                return false;
            }
            SuperAppShowcaseHideEventDto superAppShowcaseHideEventDto = (SuperAppShowcaseHideEventDto) obj;
            return this.action == superAppShowcaseHideEventDto.action && epx.f(this.objectUid, superAppShowcaseHideEventDto.objectUid);
        }

        public final int hashCode() {
            return this.objectUid.hashCode() + (this.action.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SuperAppShowcaseHideEventDto(action=");
            sb.append(this.action);
            sb.append(", objectUid=");
            return ho8.a(sb, this.objectUid, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.action.writeToParcel(parcel, i);
            parcel.writeString(this.objectUid);
        }
    }

    /* compiled from: SuperAppShowcaseQueueEventDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppShowcaseRerenderEventDto extends SuperAppShowcaseQueueEventDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppShowcaseRerenderEventDto> CREATOR = new a();

        @pmi0("action")
        private final ActionDto action;

        @pmi0("games")
        private final List<AppsAppDto> games;

        @pmi0("mini_apps")
        private final List<AppsAppMinDto> miniApps;

        @pmi0("object_uid")
        private final String objectUid;

        @pmi0("payload")
        private final SuperAppShowcaseItemPayloadDto payload;

        @pmi0("profiles")
        private final List<UsersUserFullDto> profiles;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppShowcaseQueueEventDto.kt */
        public static final class ActionDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ ActionDto[] $VALUES;
            public static final Parcelable.Creator<ActionDto> CREATOR;

            @pmi0("rerender")
            public static final ActionDto RERENDER;
            private final String value;

            /* compiled from: SuperAppShowcaseQueueEventDto.kt */
            public static final class a implements Parcelable.Creator<ActionDto> {
                @Override // android.os.Parcelable.Creator
                public final ActionDto createFromParcel(Parcel parcel) {
                    return ActionDto.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final ActionDto[] newArray(int i) {
                    return new ActionDto[i];
                }
            }

            static {
                ActionDto actionDto = new ActionDto("RERENDER", 0, "rerender");
                RERENDER = actionDto;
                ActionDto[] actionDtoArr = {actionDto};
                $VALUES = actionDtoArr;
                $ENTRIES = new asp(actionDtoArr);
                CREATOR = new a();
            }

            private ActionDto(String str, int i, String str2) {
                this.value = str2;
            }

            public static ActionDto valueOf(String str) {
                return (ActionDto) Enum.valueOf(ActionDto.class, str);
            }

            public static ActionDto[] values() {
                return (ActionDto[]) $VALUES.clone();
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

        /* compiled from: SuperAppShowcaseQueueEventDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppShowcaseRerenderEventDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcaseRerenderEventDto createFromParcel(Parcel parcel) {
                ActionDto createFromParcel = ActionDto.CREATOR.createFromParcel(parcel);
                String readString = parcel.readString();
                SuperAppShowcaseItemPayloadDto superAppShowcaseItemPayloadDto = (SuperAppShowcaseItemPayloadDto) parcel.readParcelable(SuperAppShowcaseRerenderEventDto.class.getClassLoader());
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(SuperAppShowcaseRerenderEventDto.class, parcel, arrayList, i, 1);
                }
                int readInt2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt2);
                int i2 = 0;
                while (i2 != readInt2) {
                    i2 = bo.b(SuperAppShowcaseRerenderEventDto.class, parcel, arrayList2, i2, 1);
                }
                int readInt3 = parcel.readInt();
                int i3 = 0;
                ArrayList arrayList3 = new ArrayList(readInt3);
                while (i3 != readInt3) {
                    i3 = bo.b(SuperAppShowcaseRerenderEventDto.class, parcel, arrayList3, i3, 1);
                }
                return new SuperAppShowcaseRerenderEventDto(createFromParcel, readString, superAppShowcaseItemPayloadDto, arrayList, arrayList2, arrayList3);
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcaseRerenderEventDto[] newArray(int i) {
                return new SuperAppShowcaseRerenderEventDto[i];
            }
        }

        public SuperAppShowcaseRerenderEventDto(ActionDto actionDto, String str, SuperAppShowcaseItemPayloadDto superAppShowcaseItemPayloadDto, List<AppsAppMinDto> list, List<AppsAppDto> list2, List<UsersUserFullDto> list3) {
            super(null);
            this.action = actionDto;
            this.objectUid = str;
            this.payload = superAppShowcaseItemPayloadDto;
            this.miniApps = list;
            this.games = list2;
            this.profiles = list3;
        }

        public final List<AppsAppDto> d() {
            return this.games;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final List<AppsAppMinDto> e() {
            return this.miniApps;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppShowcaseRerenderEventDto)) {
                return false;
            }
            SuperAppShowcaseRerenderEventDto superAppShowcaseRerenderEventDto = (SuperAppShowcaseRerenderEventDto) obj;
            return this.action == superAppShowcaseRerenderEventDto.action && epx.f(this.objectUid, superAppShowcaseRerenderEventDto.objectUid) && epx.f(this.payload, superAppShowcaseRerenderEventDto.payload) && epx.f(this.miniApps, superAppShowcaseRerenderEventDto.miniApps) && epx.f(this.games, superAppShowcaseRerenderEventDto.games) && epx.f(this.profiles, superAppShowcaseRerenderEventDto.profiles);
        }

        public final String f() {
            return this.objectUid;
        }

        public final SuperAppShowcaseItemPayloadDto g() {
            return this.payload;
        }

        public final int hashCode() {
            return this.profiles.hashCode() + fw3.a(fw3.a((this.payload.hashCode() + urd0.a(this.action.hashCode() * 31, 31, this.objectUid)) * 31, 31, this.miniApps), 31, this.games);
        }

        public final List<UsersUserFullDto> i() {
            return this.profiles;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SuperAppShowcaseRerenderEventDto(action=");
            sb.append(this.action);
            sb.append(", objectUid=");
            sb.append(this.objectUid);
            sb.append(", payload=");
            sb.append(this.payload);
            sb.append(", miniApps=");
            sb.append(this.miniApps);
            sb.append(", games=");
            sb.append(this.games);
            sb.append(", profiles=");
            return ms9.a(')', sb, this.profiles);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.action.writeToParcel(parcel, i);
            parcel.writeString(this.objectUid);
            parcel.writeParcelable(this.payload, i);
            Iterator a2 = ao.a(parcel, this.miniApps);
            while (a2.hasNext()) {
                parcel.writeParcelable((Parcelable) a2.next(), i);
            }
            Iterator a3 = ao.a(parcel, this.games);
            while (a3.hasNext()) {
                parcel.writeParcelable((Parcelable) a3.next(), i);
            }
            Iterator a4 = ao.a(parcel, this.profiles);
            while (a4.hasNext()) {
                parcel.writeParcelable((Parcelable) a4.next(), i);
            }
        }
    }

    /* compiled from: SuperAppShowcaseQueueEventDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppShowcaseRerenderInnerEventDto extends SuperAppShowcaseQueueEventDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppShowcaseRerenderInnerEventDto> CREATOR = new a();

        @pmi0("action")
        private final ActionDto action;

        @pmi0("games")
        private final List<AppsAppDto> games;

        @pmi0("inner_uid")
        private final String innerUid;

        @pmi0("mini_apps")
        private final List<AppsAppMinDto> miniApps;

        @pmi0("object_uid")
        private final String objectUid;

        @pmi0("payload")
        private final SuperAppShowcaseItemInnerDto payload;

        @pmi0("profiles")
        private final List<UsersUserFullDto> profiles;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppShowcaseQueueEventDto.kt */
        public static final class ActionDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ ActionDto[] $VALUES;
            public static final Parcelable.Creator<ActionDto> CREATOR;

            @pmi0("rerender_inner")
            public static final ActionDto RERENDER_INNER;
            private final String value;

            /* compiled from: SuperAppShowcaseQueueEventDto.kt */
            public static final class a implements Parcelable.Creator<ActionDto> {
                @Override // android.os.Parcelable.Creator
                public final ActionDto createFromParcel(Parcel parcel) {
                    return ActionDto.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final ActionDto[] newArray(int i) {
                    return new ActionDto[i];
                }
            }

            static {
                ActionDto actionDto = new ActionDto("RERENDER_INNER", 0, "rerender_inner");
                RERENDER_INNER = actionDto;
                ActionDto[] actionDtoArr = {actionDto};
                $VALUES = actionDtoArr;
                $ENTRIES = new asp(actionDtoArr);
                CREATOR = new a();
            }

            private ActionDto(String str, int i, String str2) {
                this.value = str2;
            }

            public static ActionDto valueOf(String str) {
                return (ActionDto) Enum.valueOf(ActionDto.class, str);
            }

            public static ActionDto[] values() {
                return (ActionDto[]) $VALUES.clone();
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

        /* compiled from: SuperAppShowcaseQueueEventDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppShowcaseRerenderInnerEventDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcaseRerenderInnerEventDto createFromParcel(Parcel parcel) {
                ActionDto createFromParcel = ActionDto.CREATOR.createFromParcel(parcel);
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                SuperAppShowcaseItemInnerDto superAppShowcaseItemInnerDto = (SuperAppShowcaseItemInnerDto) parcel.readParcelable(SuperAppShowcaseRerenderInnerEventDto.class.getClassLoader());
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(SuperAppShowcaseRerenderInnerEventDto.class, parcel, arrayList, i, 1);
                }
                int readInt2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt2);
                int i2 = 0;
                while (i2 != readInt2) {
                    i2 = bo.b(SuperAppShowcaseRerenderInnerEventDto.class, parcel, arrayList2, i2, 1);
                }
                int readInt3 = parcel.readInt();
                int i3 = 0;
                ArrayList arrayList3 = new ArrayList(readInt3);
                while (i3 != readInt3) {
                    i3 = bo.b(SuperAppShowcaseRerenderInnerEventDto.class, parcel, arrayList3, i3, 1);
                }
                return new SuperAppShowcaseRerenderInnerEventDto(createFromParcel, readString, readString2, superAppShowcaseItemInnerDto, arrayList, arrayList2, arrayList3);
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcaseRerenderInnerEventDto[] newArray(int i) {
                return new SuperAppShowcaseRerenderInnerEventDto[i];
            }
        }

        public SuperAppShowcaseRerenderInnerEventDto(ActionDto actionDto, String str, String str2, SuperAppShowcaseItemInnerDto superAppShowcaseItemInnerDto, List<AppsAppMinDto> list, List<AppsAppDto> list2, List<UsersUserFullDto> list3) {
            super(null);
            this.action = actionDto;
            this.objectUid = str;
            this.innerUid = str2;
            this.payload = superAppShowcaseItemInnerDto;
            this.miniApps = list;
            this.games = list2;
            this.profiles = list3;
        }

        public final List<AppsAppDto> d() {
            return this.games;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String e() {
            return this.innerUid;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppShowcaseRerenderInnerEventDto)) {
                return false;
            }
            SuperAppShowcaseRerenderInnerEventDto superAppShowcaseRerenderInnerEventDto = (SuperAppShowcaseRerenderInnerEventDto) obj;
            return this.action == superAppShowcaseRerenderInnerEventDto.action && epx.f(this.objectUid, superAppShowcaseRerenderInnerEventDto.objectUid) && epx.f(this.innerUid, superAppShowcaseRerenderInnerEventDto.innerUid) && epx.f(this.payload, superAppShowcaseRerenderInnerEventDto.payload) && epx.f(this.miniApps, superAppShowcaseRerenderInnerEventDto.miniApps) && epx.f(this.games, superAppShowcaseRerenderInnerEventDto.games) && epx.f(this.profiles, superAppShowcaseRerenderInnerEventDto.profiles);
        }

        public final List<AppsAppMinDto> f() {
            return this.miniApps;
        }

        public final String g() {
            return this.objectUid;
        }

        public final int hashCode() {
            return this.profiles.hashCode() + fw3.a(fw3.a((this.payload.hashCode() + urd0.a(urd0.a(this.action.hashCode() * 31, 31, this.objectUid), 31, this.innerUid)) * 31, 31, this.miniApps), 31, this.games);
        }

        public final SuperAppShowcaseItemInnerDto i() {
            return this.payload;
        }

        public final List<UsersUserFullDto> j() {
            return this.profiles;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SuperAppShowcaseRerenderInnerEventDto(action=");
            sb.append(this.action);
            sb.append(", objectUid=");
            sb.append(this.objectUid);
            sb.append(", innerUid=");
            sb.append(this.innerUid);
            sb.append(", payload=");
            sb.append(this.payload);
            sb.append(", miniApps=");
            sb.append(this.miniApps);
            sb.append(", games=");
            sb.append(this.games);
            sb.append(", profiles=");
            return ms9.a(')', sb, this.profiles);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.action.writeToParcel(parcel, i);
            parcel.writeString(this.objectUid);
            parcel.writeString(this.innerUid);
            parcel.writeParcelable(this.payload, i);
            Iterator a2 = ao.a(parcel, this.miniApps);
            while (a2.hasNext()) {
                parcel.writeParcelable((Parcelable) a2.next(), i);
            }
            Iterator a3 = ao.a(parcel, this.games);
            while (a3.hasNext()) {
                parcel.writeParcelable((Parcelable) a3.next(), i);
            }
            Iterator a4 = ao.a(parcel, this.profiles);
            while (a4.hasNext()) {
                parcel.writeParcelable((Parcelable) a4.next(), i);
            }
        }
    }

    /* compiled from: SuperAppShowcaseQueueEventDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppShowcaseShowEventDto extends SuperAppShowcaseQueueEventDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppShowcaseShowEventDto> CREATOR = new a();

        @pmi0("action")
        private final ActionDto action;

        @pmi0("games")
        private final List<AppsAppDto> games;

        @pmi0("mini_apps")
        private final List<AppsAppMinDto> miniApps;

        @pmi0("object_uid")
        private final String objectUid;

        @pmi0("object")
        private final SuperAppShowcaseItemDto objectValue;

        @pmi0("profiles")
        private final List<UsersUserFullDto> profiles;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppShowcaseQueueEventDto.kt */
        public static final class ActionDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ ActionDto[] $VALUES;
            public static final Parcelable.Creator<ActionDto> CREATOR;

            @pmi0("show")
            public static final ActionDto SHOW;
            private final String value;

            /* compiled from: SuperAppShowcaseQueueEventDto.kt */
            public static final class a implements Parcelable.Creator<ActionDto> {
                @Override // android.os.Parcelable.Creator
                public final ActionDto createFromParcel(Parcel parcel) {
                    return ActionDto.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final ActionDto[] newArray(int i) {
                    return new ActionDto[i];
                }
            }

            static {
                ActionDto actionDto = new ActionDto("SHOW", 0, "show");
                SHOW = actionDto;
                ActionDto[] actionDtoArr = {actionDto};
                $VALUES = actionDtoArr;
                $ENTRIES = new asp(actionDtoArr);
                CREATOR = new a();
            }

            private ActionDto(String str, int i, String str2) {
                this.value = str2;
            }

            public static ActionDto valueOf(String str) {
                return (ActionDto) Enum.valueOf(ActionDto.class, str);
            }

            public static ActionDto[] values() {
                return (ActionDto[]) $VALUES.clone();
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

        /* compiled from: SuperAppShowcaseQueueEventDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppShowcaseShowEventDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcaseShowEventDto createFromParcel(Parcel parcel) {
                ActionDto createFromParcel = ActionDto.CREATOR.createFromParcel(parcel);
                String readString = parcel.readString();
                SuperAppShowcaseItemDto createFromParcel2 = SuperAppShowcaseItemDto.CREATOR.createFromParcel(parcel);
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = bo.b(SuperAppShowcaseShowEventDto.class, parcel, arrayList, i2, 1);
                }
                int readInt2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt2);
                int i3 = 0;
                while (i3 != readInt2) {
                    i3 = bo.b(SuperAppShowcaseShowEventDto.class, parcel, arrayList2, i3, 1);
                }
                int readInt3 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt3);
                while (i != readInt3) {
                    i = bo.b(SuperAppShowcaseShowEventDto.class, parcel, arrayList3, i, 1);
                }
                return new SuperAppShowcaseShowEventDto(createFromParcel, readString, createFromParcel2, arrayList, arrayList2, arrayList3);
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcaseShowEventDto[] newArray(int i) {
                return new SuperAppShowcaseShowEventDto[i];
            }
        }

        public SuperAppShowcaseShowEventDto(ActionDto actionDto, String str, SuperAppShowcaseItemDto superAppShowcaseItemDto, List<AppsAppMinDto> list, List<AppsAppDto> list2, List<UsersUserFullDto> list3) {
            super(null);
            this.action = actionDto;
            this.objectUid = str;
            this.objectValue = superAppShowcaseItemDto;
            this.miniApps = list;
            this.games = list2;
            this.profiles = list3;
        }

        public final List<AppsAppDto> d() {
            return this.games;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final List<AppsAppMinDto> e() {
            return this.miniApps;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppShowcaseShowEventDto)) {
                return false;
            }
            SuperAppShowcaseShowEventDto superAppShowcaseShowEventDto = (SuperAppShowcaseShowEventDto) obj;
            return this.action == superAppShowcaseShowEventDto.action && epx.f(this.objectUid, superAppShowcaseShowEventDto.objectUid) && epx.f(this.objectValue, superAppShowcaseShowEventDto.objectValue) && epx.f(this.miniApps, superAppShowcaseShowEventDto.miniApps) && epx.f(this.games, superAppShowcaseShowEventDto.games) && epx.f(this.profiles, superAppShowcaseShowEventDto.profiles);
        }

        public final SuperAppShowcaseItemDto f() {
            return this.objectValue;
        }

        public final List<UsersUserFullDto> g() {
            return this.profiles;
        }

        public final int hashCode() {
            return this.profiles.hashCode() + fw3.a(fw3.a((this.objectValue.hashCode() + urd0.a(this.action.hashCode() * 31, 31, this.objectUid)) * 31, 31, this.miniApps), 31, this.games);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SuperAppShowcaseShowEventDto(action=");
            sb.append(this.action);
            sb.append(", objectUid=");
            sb.append(this.objectUid);
            sb.append(", objectValue=");
            sb.append(this.objectValue);
            sb.append(", miniApps=");
            sb.append(this.miniApps);
            sb.append(", games=");
            sb.append(this.games);
            sb.append(", profiles=");
            return ms9.a(')', sb, this.profiles);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.action.writeToParcel(parcel, i);
            parcel.writeString(this.objectUid);
            this.objectValue.writeToParcel(parcel, i);
            Iterator a2 = ao.a(parcel, this.miniApps);
            while (a2.hasNext()) {
                parcel.writeParcelable((Parcelable) a2.next(), i);
            }
            Iterator a3 = ao.a(parcel, this.games);
            while (a3.hasNext()) {
                parcel.writeParcelable((Parcelable) a3.next(), i);
            }
            Iterator a4 = ao.a(parcel, this.profiles);
            while (a4.hasNext()) {
                parcel.writeParcelable((Parcelable) a4.next(), i);
            }
        }
    }

    public /* synthetic */ SuperAppShowcaseQueueEventDto(zcl zclVar) {
        this();
    }

    private SuperAppShowcaseQueueEventDto() {
    }
}
