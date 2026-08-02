package com.vk.api.generated.marusia.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.vk.api.generated.base.dto.BaseImageDto;
import io.reactivex.rxjava3.subjects.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.a9y;
import xsna.ao;
import xsna.b9y;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.go9;
import xsna.ms9;
import xsna.pmi0;
import xsna.shy;
import xsna.up;
import xsna.urd0;
import xsna.z8y;
import xsna.zcl;

/* compiled from: MarusiaWidgetOneOfItemDto.kt */
/* loaded from: classes15.dex */
public abstract class MarusiaWidgetOneOfItemDto implements Parcelable {

    /* compiled from: MarusiaWidgetOneOfItemDto.kt */
    public static final class Deserializer implements a9y<MarusiaWidgetOneOfItemDto> {
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException
         */
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            String f = up.f(b9yVar, "type");
            if (f != null) {
                switch (f.hashCode()) {
                    case -1729946800:
                        if (f.equals("horoscope")) {
                            return (MarusiaWidgetOneOfItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, MarusiaWidgetHoroscopeDto.class);
                        }
                        break;
                    case -1209078378:
                        if (f.equals("birthdays")) {
                            return (MarusiaWidgetOneOfItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, MarusiaWidgetBirthdaysDto.class);
                        }
                        break;
                    case -462094004:
                        if (f.equals("messages")) {
                            return (MarusiaWidgetOneOfItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, MarusiaWidgetMessagesDto.class);
                        }
                        break;
                    case 3377875:
                        if (f.equals("news")) {
                            return (MarusiaWidgetOneOfItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, MarusiaWidgetNewsDto.class);
                        }
                        break;
                    case 949122880:
                        if (f.equals("security")) {
                            return (MarusiaWidgetOneOfItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, MarusiaWidgetIbadviceDto.class);
                        }
                        break;
                    case 1223440372:
                        if (f.equals("weather")) {
                            return (MarusiaWidgetOneOfItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, MarusiaWidgetWeatherDto.class);
                        }
                        break;
                    case 1989774883:
                        if (f.equals("exchange")) {
                            return (MarusiaWidgetOneOfItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, MarusiaWidgetExchangeDto.class);
                        }
                        break;
                }
            }
            throw new IllegalStateException(go9.b("no mapping for the type:", f));
        }
    }

    /* compiled from: MarusiaWidgetOneOfItemDto.kt */
    public static final class MarusiaWidgetBirthdaysDto extends MarusiaWidgetOneOfItemDto implements Parcelable {
        public static final Parcelable.Creator<MarusiaWidgetBirthdaysDto> CREATOR = new a();

        @pmi0("count")
        private final int count;

        @pmi0("icons")
        private final List<BaseImageDto> icons;

        @pmi0("type")
        private final String type;

        @pmi0("url")
        private final String url;

        /* compiled from: MarusiaWidgetOneOfItemDto.kt */
        public static final class a implements Parcelable.Creator<MarusiaWidgetBirthdaysDto> {
            @Override // android.os.Parcelable.Creator
            public final MarusiaWidgetBirthdaysDto createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                int readInt = parcel.readInt();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt2 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(readInt2);
                    int i = 0;
                    while (i != readInt2) {
                        i = bo.b(MarusiaWidgetBirthdaysDto.class, parcel, arrayList2, i, 1);
                    }
                    arrayList = arrayList2;
                }
                return new MarusiaWidgetBirthdaysDto(readString, readString2, readInt, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final MarusiaWidgetBirthdaysDto[] newArray(int i) {
                return new MarusiaWidgetBirthdaysDto[i];
            }
        }

        public /* synthetic */ MarusiaWidgetBirthdaysDto(String str, String str2, int i, List list, int i2, zcl zclVar) {
            this(str, str2, i, (i2 & 8) != 0 ? null : list);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MarusiaWidgetBirthdaysDto)) {
                return false;
            }
            MarusiaWidgetBirthdaysDto marusiaWidgetBirthdaysDto = (MarusiaWidgetBirthdaysDto) obj;
            return epx.f(this.type, marusiaWidgetBirthdaysDto.type) && epx.f(this.url, marusiaWidgetBirthdaysDto.url) && this.count == marusiaWidgetBirthdaysDto.count && epx.f(this.icons, marusiaWidgetBirthdaysDto.icons);
        }

        public final int hashCode() {
            int a2 = shy.a(this.count, urd0.a(this.type.hashCode() * 31, 31, this.url), 31);
            List<BaseImageDto> list = this.icons;
            return a2 + (list == null ? 0 : list.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MarusiaWidgetBirthdaysDto(type=");
            sb.append(this.type);
            sb.append(", url=");
            sb.append(this.url);
            sb.append(", count=");
            sb.append(this.count);
            sb.append(", icons=");
            return ms9.a(')', sb, this.icons);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.type);
            parcel.writeString(this.url);
            parcel.writeInt(this.count);
            List<BaseImageDto> list = this.icons;
            if (list == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }

        public MarusiaWidgetBirthdaysDto(String str, String str2, int i, List<BaseImageDto> list) {
            super(null);
            this.type = str;
            this.url = str2;
            this.count = i;
            this.icons = list;
        }
    }

    /* compiled from: MarusiaWidgetOneOfItemDto.kt */
    public static final class MarusiaWidgetExchangeDto extends MarusiaWidgetOneOfItemDto implements Parcelable {
        public static final Parcelable.Creator<MarusiaWidgetExchangeDto> CREATOR = new a();

        @pmi0("base_currency")
        private final String baseCurrency;

        @pmi0("delta_absolute")
        private final float deltaAbsolute;

        @pmi0("delta_percent")
        private final float deltaPercent;

        @pmi0("icons")
        private final List<BaseImageDto> icons;

        @pmi0("measure_currency")
        private final String measureCurrency;

        @pmi0("name")
        private final String name;

        @pmi0("symbol")
        private final String symbol;

        @pmi0("type")
        private final String type;

        @pmi0("url")
        private final String url;

        @pmi0("value")
        private final float value;

        /* compiled from: MarusiaWidgetOneOfItemDto.kt */
        public static final class a implements Parcelable.Creator<MarusiaWidgetExchangeDto> {
            @Override // android.os.Parcelable.Creator
            public final MarusiaWidgetExchangeDto createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                float readFloat = parcel.readFloat();
                float readFloat2 = parcel.readFloat();
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                float readFloat3 = parcel.readFloat();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    arrayList = new ArrayList(readInt);
                    int i = 0;
                    while (i != readInt) {
                        i = bo.b(MarusiaWidgetExchangeDto.class, parcel, arrayList, i, 1);
                    }
                }
                return new MarusiaWidgetExchangeDto(readString, readString2, readString3, readString4, readFloat, readFloat2, readString5, readString6, readFloat3, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final MarusiaWidgetExchangeDto[] newArray(int i) {
                return new MarusiaWidgetExchangeDto[i];
            }
        }

        public /* synthetic */ MarusiaWidgetExchangeDto(String str, String str2, String str3, String str4, float f, float f2, String str5, String str6, float f3, List list, int i, zcl zclVar) {
            this(str, str2, str3, str4, f, f2, str5, str6, f3, (i & 512) != 0 ? null : list);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MarusiaWidgetExchangeDto)) {
                return false;
            }
            MarusiaWidgetExchangeDto marusiaWidgetExchangeDto = (MarusiaWidgetExchangeDto) obj;
            return epx.f(this.type, marusiaWidgetExchangeDto.type) && epx.f(this.url, marusiaWidgetExchangeDto.url) && epx.f(this.baseCurrency, marusiaWidgetExchangeDto.baseCurrency) && epx.f(this.measureCurrency, marusiaWidgetExchangeDto.measureCurrency) && Float.compare(this.value, marusiaWidgetExchangeDto.value) == 0 && Float.compare(this.deltaAbsolute, marusiaWidgetExchangeDto.deltaAbsolute) == 0 && epx.f(this.name, marusiaWidgetExchangeDto.name) && epx.f(this.symbol, marusiaWidgetExchangeDto.symbol) && Float.compare(this.deltaPercent, marusiaWidgetExchangeDto.deltaPercent) == 0 && epx.f(this.icons, marusiaWidgetExchangeDto.icons);
        }

        public final int hashCode() {
            int a2 = b.a(this.deltaPercent, urd0.a(urd0.a(b.a(this.deltaAbsolute, b.a(this.value, urd0.a(urd0.a(urd0.a(this.type.hashCode() * 31, 31, this.url), 31, this.baseCurrency), 31, this.measureCurrency), 31), 31), 31, this.name), 31, this.symbol), 31);
            List<BaseImageDto> list = this.icons;
            return a2 + (list == null ? 0 : list.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MarusiaWidgetExchangeDto(type=");
            sb.append(this.type);
            sb.append(", url=");
            sb.append(this.url);
            sb.append(", baseCurrency=");
            sb.append(this.baseCurrency);
            sb.append(", measureCurrency=");
            sb.append(this.measureCurrency);
            sb.append(", value=");
            sb.append(this.value);
            sb.append(", deltaAbsolute=");
            sb.append(this.deltaAbsolute);
            sb.append(", name=");
            sb.append(this.name);
            sb.append(", symbol=");
            sb.append(this.symbol);
            sb.append(", deltaPercent=");
            sb.append(this.deltaPercent);
            sb.append(", icons=");
            return ms9.a(')', sb, this.icons);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.type);
            parcel.writeString(this.url);
            parcel.writeString(this.baseCurrency);
            parcel.writeString(this.measureCurrency);
            parcel.writeFloat(this.value);
            parcel.writeFloat(this.deltaAbsolute);
            parcel.writeString(this.name);
            parcel.writeString(this.symbol);
            parcel.writeFloat(this.deltaPercent);
            List<BaseImageDto> list = this.icons;
            if (list == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }

        public MarusiaWidgetExchangeDto(String str, String str2, String str3, String str4, float f, float f2, String str5, String str6, float f3, List<BaseImageDto> list) {
            super(null);
            this.type = str;
            this.url = str2;
            this.baseCurrency = str3;
            this.measureCurrency = str4;
            this.value = f;
            this.deltaAbsolute = f2;
            this.name = str5;
            this.symbol = str6;
            this.deltaPercent = f3;
            this.icons = list;
        }
    }

    /* compiled from: MarusiaWidgetOneOfItemDto.kt */
    public static final class MarusiaWidgetHoroscopeDto extends MarusiaWidgetOneOfItemDto implements Parcelable {
        public static final Parcelable.Creator<MarusiaWidgetHoroscopeDto> CREATOR = new a();

        @pmi0("icons")
        private final List<BaseImageDto> icons;

        @pmi0("title")
        private final String title;

        @pmi0("type")
        private final String type;

        @pmi0("url")
        private final String url;

        /* compiled from: MarusiaWidgetOneOfItemDto.kt */
        public static final class a implements Parcelable.Creator<MarusiaWidgetHoroscopeDto> {
            @Override // android.os.Parcelable.Creator
            public final MarusiaWidgetHoroscopeDto createFromParcel(Parcel parcel) {
                ArrayList arrayList;
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
                        i = bo.b(MarusiaWidgetHoroscopeDto.class, parcel, arrayList2, i, 1);
                    }
                    arrayList = arrayList2;
                }
                return new MarusiaWidgetHoroscopeDto(readString, readString2, readString3, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final MarusiaWidgetHoroscopeDto[] newArray(int i) {
                return new MarusiaWidgetHoroscopeDto[i];
            }
        }

        public /* synthetic */ MarusiaWidgetHoroscopeDto(String str, String str2, String str3, List list, int i, zcl zclVar) {
            this(str, str2, str3, (i & 8) != 0 ? null : list);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MarusiaWidgetHoroscopeDto)) {
                return false;
            }
            MarusiaWidgetHoroscopeDto marusiaWidgetHoroscopeDto = (MarusiaWidgetHoroscopeDto) obj;
            return epx.f(this.type, marusiaWidgetHoroscopeDto.type) && epx.f(this.url, marusiaWidgetHoroscopeDto.url) && epx.f(this.title, marusiaWidgetHoroscopeDto.title) && epx.f(this.icons, marusiaWidgetHoroscopeDto.icons);
        }

        public final int hashCode() {
            int a2 = urd0.a(urd0.a(this.type.hashCode() * 31, 31, this.url), 31, this.title);
            List<BaseImageDto> list = this.icons;
            return a2 + (list == null ? 0 : list.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MarusiaWidgetHoroscopeDto(type=");
            sb.append(this.type);
            sb.append(", url=");
            sb.append(this.url);
            sb.append(", title=");
            sb.append(this.title);
            sb.append(", icons=");
            return ms9.a(')', sb, this.icons);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.type);
            parcel.writeString(this.url);
            parcel.writeString(this.title);
            List<BaseImageDto> list = this.icons;
            if (list == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }

        public MarusiaWidgetHoroscopeDto(String str, String str2, String str3, List<BaseImageDto> list) {
            super(null);
            this.type = str;
            this.url = str2;
            this.title = str3;
            this.icons = list;
        }
    }

    /* compiled from: MarusiaWidgetOneOfItemDto.kt */
    public static final class MarusiaWidgetIbadviceDto extends MarusiaWidgetOneOfItemDto implements Parcelable {
        public static final Parcelable.Creator<MarusiaWidgetIbadviceDto> CREATOR = new a();

        @pmi0("icons")
        private final List<BaseImageDto> icons;

        @pmi0("title")
        private final String title;

        @pmi0("type")
        private final String type;

        @pmi0("url")
        private final String url;

        /* compiled from: MarusiaWidgetOneOfItemDto.kt */
        public static final class a implements Parcelable.Creator<MarusiaWidgetIbadviceDto> {
            @Override // android.os.Parcelable.Creator
            public final MarusiaWidgetIbadviceDto createFromParcel(Parcel parcel) {
                ArrayList arrayList;
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
                        i = bo.b(MarusiaWidgetIbadviceDto.class, parcel, arrayList2, i, 1);
                    }
                    arrayList = arrayList2;
                }
                return new MarusiaWidgetIbadviceDto(readString, readString2, readString3, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final MarusiaWidgetIbadviceDto[] newArray(int i) {
                return new MarusiaWidgetIbadviceDto[i];
            }
        }

        public /* synthetic */ MarusiaWidgetIbadviceDto(String str, String str2, String str3, List list, int i, zcl zclVar) {
            this(str, str2, str3, (i & 8) != 0 ? null : list);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MarusiaWidgetIbadviceDto)) {
                return false;
            }
            MarusiaWidgetIbadviceDto marusiaWidgetIbadviceDto = (MarusiaWidgetIbadviceDto) obj;
            return epx.f(this.type, marusiaWidgetIbadviceDto.type) && epx.f(this.url, marusiaWidgetIbadviceDto.url) && epx.f(this.title, marusiaWidgetIbadviceDto.title) && epx.f(this.icons, marusiaWidgetIbadviceDto.icons);
        }

        public final int hashCode() {
            int a2 = urd0.a(urd0.a(this.type.hashCode() * 31, 31, this.url), 31, this.title);
            List<BaseImageDto> list = this.icons;
            return a2 + (list == null ? 0 : list.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MarusiaWidgetIbadviceDto(type=");
            sb.append(this.type);
            sb.append(", url=");
            sb.append(this.url);
            sb.append(", title=");
            sb.append(this.title);
            sb.append(", icons=");
            return ms9.a(')', sb, this.icons);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.type);
            parcel.writeString(this.url);
            parcel.writeString(this.title);
            List<BaseImageDto> list = this.icons;
            if (list == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }

        public MarusiaWidgetIbadviceDto(String str, String str2, String str3, List<BaseImageDto> list) {
            super(null);
            this.type = str;
            this.url = str2;
            this.title = str3;
            this.icons = list;
        }
    }

    /* compiled from: MarusiaWidgetOneOfItemDto.kt */
    public static final class MarusiaWidgetMessagesDto extends MarusiaWidgetOneOfItemDto implements Parcelable {
        public static final Parcelable.Creator<MarusiaWidgetMessagesDto> CREATOR = new a();

        @pmi0("conversations")
        private final List<MarusiaWidgetMessagesConversationItemDto> conversations;

        @pmi0("count")
        private final int count;

        @pmi0("icons")
        private final List<BaseImageDto> icons;

        @pmi0("type")
        private final String type;

        @pmi0("url")
        private final String url;

        /* compiled from: MarusiaWidgetOneOfItemDto.kt */
        public static final class a implements Parcelable.Creator<MarusiaWidgetMessagesDto> {
            @Override // android.os.Parcelable.Creator
            public final MarusiaWidgetMessagesDto createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                int readInt = parcel.readInt();
                int i = 0;
                ArrayList arrayList2 = null;
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt2 = parcel.readInt();
                    arrayList = new ArrayList(readInt2);
                    int i2 = 0;
                    while (i2 != readInt2) {
                        i2 = en.a(MarusiaWidgetMessagesConversationItemDto.CREATOR, parcel, arrayList, i2, 1);
                    }
                }
                if (parcel.readInt() != 0) {
                    int readInt3 = parcel.readInt();
                    arrayList2 = new ArrayList(readInt3);
                    while (i != readInt3) {
                        i = bo.b(MarusiaWidgetMessagesDto.class, parcel, arrayList2, i, 1);
                    }
                }
                return new MarusiaWidgetMessagesDto(readString, readString2, readInt, arrayList, arrayList2);
            }

            @Override // android.os.Parcelable.Creator
            public final MarusiaWidgetMessagesDto[] newArray(int i) {
                return new MarusiaWidgetMessagesDto[i];
            }
        }

        public /* synthetic */ MarusiaWidgetMessagesDto(String str, String str2, int i, List list, List list2, int i2, zcl zclVar) {
            this(str, str2, i, (i2 & 8) != 0 ? null : list, (i2 & 16) != 0 ? null : list2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MarusiaWidgetMessagesDto)) {
                return false;
            }
            MarusiaWidgetMessagesDto marusiaWidgetMessagesDto = (MarusiaWidgetMessagesDto) obj;
            return epx.f(this.type, marusiaWidgetMessagesDto.type) && epx.f(this.url, marusiaWidgetMessagesDto.url) && this.count == marusiaWidgetMessagesDto.count && epx.f(this.conversations, marusiaWidgetMessagesDto.conversations) && epx.f(this.icons, marusiaWidgetMessagesDto.icons);
        }

        public final int hashCode() {
            int a2 = shy.a(this.count, urd0.a(this.type.hashCode() * 31, 31, this.url), 31);
            List<MarusiaWidgetMessagesConversationItemDto> list = this.conversations;
            int hashCode = (a2 + (list == null ? 0 : list.hashCode())) * 31;
            List<BaseImageDto> list2 = this.icons;
            return hashCode + (list2 != null ? list2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MarusiaWidgetMessagesDto(type=");
            sb.append(this.type);
            sb.append(", url=");
            sb.append(this.url);
            sb.append(", count=");
            sb.append(this.count);
            sb.append(", conversations=");
            sb.append(this.conversations);
            sb.append(", icons=");
            return ms9.a(')', sb, this.icons);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.type);
            parcel.writeString(this.url);
            parcel.writeInt(this.count);
            List<MarusiaWidgetMessagesConversationItemDto> list = this.conversations;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator f = dn.f(parcel, list, 1);
                while (f.hasNext()) {
                    ((MarusiaWidgetMessagesConversationItemDto) f.next()).writeToParcel(parcel, i);
                }
            }
            List<BaseImageDto> list2 = this.icons;
            if (list2 == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                parcel.writeParcelable((Parcelable) f2.next(), i);
            }
        }

        public MarusiaWidgetMessagesDto(String str, String str2, int i, List<MarusiaWidgetMessagesConversationItemDto> list, List<BaseImageDto> list2) {
            super(null);
            this.type = str;
            this.url = str2;
            this.count = i;
            this.conversations = list;
            this.icons = list2;
        }
    }

    /* compiled from: MarusiaWidgetOneOfItemDto.kt */
    public static final class MarusiaWidgetNewsDto extends MarusiaWidgetOneOfItemDto implements Parcelable {
        public static final Parcelable.Creator<MarusiaWidgetNewsDto> CREATOR = new a();

        @pmi0("icons")
        private final List<BaseImageDto> icons;

        @pmi0("title")
        private final String title;

        @pmi0("type")
        private final String type;

        @pmi0("url")
        private final String url;

        /* compiled from: MarusiaWidgetOneOfItemDto.kt */
        public static final class a implements Parcelable.Creator<MarusiaWidgetNewsDto> {
            @Override // android.os.Parcelable.Creator
            public final MarusiaWidgetNewsDto createFromParcel(Parcel parcel) {
                ArrayList arrayList;
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
                        i = bo.b(MarusiaWidgetNewsDto.class, parcel, arrayList2, i, 1);
                    }
                    arrayList = arrayList2;
                }
                return new MarusiaWidgetNewsDto(readString, readString2, readString3, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final MarusiaWidgetNewsDto[] newArray(int i) {
                return new MarusiaWidgetNewsDto[i];
            }
        }

        public /* synthetic */ MarusiaWidgetNewsDto(String str, String str2, String str3, List list, int i, zcl zclVar) {
            this(str, str2, str3, (i & 8) != 0 ? null : list);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MarusiaWidgetNewsDto)) {
                return false;
            }
            MarusiaWidgetNewsDto marusiaWidgetNewsDto = (MarusiaWidgetNewsDto) obj;
            return epx.f(this.type, marusiaWidgetNewsDto.type) && epx.f(this.url, marusiaWidgetNewsDto.url) && epx.f(this.title, marusiaWidgetNewsDto.title) && epx.f(this.icons, marusiaWidgetNewsDto.icons);
        }

        public final int hashCode() {
            int a2 = urd0.a(urd0.a(this.type.hashCode() * 31, 31, this.url), 31, this.title);
            List<BaseImageDto> list = this.icons;
            return a2 + (list == null ? 0 : list.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MarusiaWidgetNewsDto(type=");
            sb.append(this.type);
            sb.append(", url=");
            sb.append(this.url);
            sb.append(", title=");
            sb.append(this.title);
            sb.append(", icons=");
            return ms9.a(')', sb, this.icons);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.type);
            parcel.writeString(this.url);
            parcel.writeString(this.title);
            List<BaseImageDto> list = this.icons;
            if (list == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }

        public MarusiaWidgetNewsDto(String str, String str2, String str3, List<BaseImageDto> list) {
            super(null);
            this.type = str;
            this.url = str2;
            this.title = str3;
            this.icons = list;
        }
    }

    /* compiled from: MarusiaWidgetOneOfItemDto.kt */
    public static final class MarusiaWidgetWeatherDto extends MarusiaWidgetOneOfItemDto implements Parcelable {
        public static final Parcelable.Creator<MarusiaWidgetWeatherDto> CREATOR = new a();

        @pmi0("current_weather")
        private final MarusiaWidgetCurrentWeatherDto currentWeather;

        @pmi0("hour_forecast")
        private final List<MarusiaWidgetWeatherHourForecastItemDto> hourForecast;

        @pmi0("type")
        private final String type;

        @pmi0("url")
        private final String url;

        /* compiled from: MarusiaWidgetOneOfItemDto.kt */
        public static final class a implements Parcelable.Creator<MarusiaWidgetWeatherDto> {
            @Override // android.os.Parcelable.Creator
            public final MarusiaWidgetWeatherDto createFromParcel(Parcel parcel) {
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                MarusiaWidgetCurrentWeatherDto createFromParcel = MarusiaWidgetCurrentWeatherDto.CREATOR.createFromParcel(parcel);
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(MarusiaWidgetWeatherHourForecastItemDto.CREATOR, parcel, arrayList, i, 1);
                }
                return new MarusiaWidgetWeatherDto(readString, readString2, createFromParcel, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final MarusiaWidgetWeatherDto[] newArray(int i) {
                return new MarusiaWidgetWeatherDto[i];
            }
        }

        public MarusiaWidgetWeatherDto(String str, String str2, MarusiaWidgetCurrentWeatherDto marusiaWidgetCurrentWeatherDto, List<MarusiaWidgetWeatherHourForecastItemDto> list) {
            super(null);
            this.type = str;
            this.url = str2;
            this.currentWeather = marusiaWidgetCurrentWeatherDto;
            this.hourForecast = list;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MarusiaWidgetWeatherDto)) {
                return false;
            }
            MarusiaWidgetWeatherDto marusiaWidgetWeatherDto = (MarusiaWidgetWeatherDto) obj;
            return epx.f(this.type, marusiaWidgetWeatherDto.type) && epx.f(this.url, marusiaWidgetWeatherDto.url) && epx.f(this.currentWeather, marusiaWidgetWeatherDto.currentWeather) && epx.f(this.hourForecast, marusiaWidgetWeatherDto.hourForecast);
        }

        public final int hashCode() {
            return this.hourForecast.hashCode() + ((this.currentWeather.hashCode() + urd0.a(this.type.hashCode() * 31, 31, this.url)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MarusiaWidgetWeatherDto(type=");
            sb.append(this.type);
            sb.append(", url=");
            sb.append(this.url);
            sb.append(", currentWeather=");
            sb.append(this.currentWeather);
            sb.append(", hourForecast=");
            return ms9.a(')', sb, this.hourForecast);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.type);
            parcel.writeString(this.url);
            this.currentWeather.writeToParcel(parcel, i);
            Iterator a2 = ao.a(parcel, this.hourForecast);
            while (a2.hasNext()) {
                ((MarusiaWidgetWeatherHourForecastItemDto) a2.next()).writeToParcel(parcel, i);
            }
        }
    }

    public /* synthetic */ MarusiaWidgetOneOfItemDto(zcl zclVar) {
        this();
    }

    private MarusiaWidgetOneOfItemDto() {
    }
}
