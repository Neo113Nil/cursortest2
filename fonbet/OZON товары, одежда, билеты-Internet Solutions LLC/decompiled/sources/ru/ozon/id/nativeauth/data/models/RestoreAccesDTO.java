package ru.ozon.id.nativeauth.data.models;

import C.J;
import D40.c;
import G.g;
import N3.C3660k;
import Ul.C4070a;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Html;
import com.squareup.moshi.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.id.nativeauth.data.models.a;
import ru.ozon.uni.atoms.html.OzonHtmlParser;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0002'(B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\nHÆ\u0003J=\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u001bHÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006)"}, d2 = {"Lru/ozon/id/nativeauth/data/models/RestoreAccesDTO;", "Landroid/os/Parcelable;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "subtitle", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "cells", "", "Lru/ozon/id/nativeauth/data/models/RestoreAccesDTO$CellButtonDTO;", "featureFlags", "Lru/ozon/id/nativeauth/data/models/RestoreAccesDTO$FeatureFlags;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/util/List;Lru/ozon/id/nativeauth/data/models/RestoreAccesDTO$FeatureFlags;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getCells", "()Ljava/util/List;", "getFeatureFlags", "()Lru/ozon/id/nativeauth/data/models/RestoreAccesDTO$FeatureFlags;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "CellButtonDTO", "FeatureFlags", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RestoreAccesDTO implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RestoreAccesDTO> CREATOR = new a();
    private final List<CellButtonDTO> cells;
    private final FeatureFlags featureFlags;
    private final OzonSpannableString subtitle;

    @NotNull
    private final String title;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BM\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0019J\u001e\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001f\u0010 Jb\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b#\u0010\u0019J\u0010\u0010$\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b$\u0010\u0017J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b'\u0010(R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b*\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b+\u0010\u0019R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u001cR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b.\u0010\u0019R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b/\u0010\u0019R%\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\f\u00100\u001a\u0004\b1\u0010 ¨\u00062"}, d2 = {"Lru/ozon/id/nativeauth/data/models/RestoreAccesDTO$CellButtonDTO;", "Lru/ozon/id/nativeauth/data/models/a;", "Landroid/os/Parcelable;", "", "deeplink", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/id/nativeauth/data/models/a$a;", "type", "action", "trackClick", "", "", "data", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/id/nativeauth/data/models/a$a;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lru/ozon/id/nativeauth/data/models/a$a;", "component4", "component5", "component6", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/id/nativeauth/data/models/a$a;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lru/ozon/id/nativeauth/data/models/RestoreAccesDTO$CellButtonDTO;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDeeplink", "getTitle", "Lru/ozon/id/nativeauth/data/models/a$a;", "getType", "getAction", "getTrackClick", "Ljava/util/Map;", "getData", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CellButtonDTO extends ru.ozon.id.nativeauth.data.models.a implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<CellButtonDTO> CREATOR = new a();
        private final String action;
        private final Map<String, Object> data;
        private final String deeplink;

        @NotNull
        private final String title;
        private final String trackClick;
        private final a.EnumC2132a type;

        public static final class a implements Parcelable.Creator<CellButtonDTO> {
            @Override // android.os.Parcelable.Creator
            public final CellButtonDTO createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                LinkedHashMap linkedHashMap = null;
                a.EnumC2132a valueOf = parcel.readInt() == 0 ? null : a.EnumC2132a.valueOf(parcel.readString());
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                if (parcel.readInt() != 0) {
                    int readInt = parcel.readInt();
                    linkedHashMap = new LinkedHashMap(readInt);
                    for (int i11 = 0; i11 != readInt; i11++) {
                        linkedHashMap.put(parcel.readString(), parcel.readValue(CellButtonDTO.class.getClassLoader()));
                    }
                }
                return new CellButtonDTO(readString, readString2, valueOf, readString3, readString4, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final CellButtonDTO[] newArray(int i11) {
                return new CellButtonDTO[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CellButtonDTO(String str, @NotNull String title, a.EnumC2132a enumC2132a, String str2, String str3, Map<String, ? extends Object> map) {
            super(str, title, enumC2132a, str2, str3);
            Intrinsics.checkNotNullParameter(title, "title");
            this.deeplink = str;
            this.title = title;
            this.type = enumC2132a;
            this.action = str2;
            this.trackClick = str3;
            this.data = map;
        }

        public static /* synthetic */ CellButtonDTO copy$default(CellButtonDTO cellButtonDTO, String str, String str2, a.EnumC2132a enumC2132a, String str3, String str4, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = cellButtonDTO.deeplink;
            }
            if ((i11 & 2) != 0) {
                str2 = cellButtonDTO.title;
            }
            if ((i11 & 4) != 0) {
                enumC2132a = cellButtonDTO.type;
            }
            if ((i11 & 8) != 0) {
                str3 = cellButtonDTO.action;
            }
            if ((i11 & 16) != 0) {
                str4 = cellButtonDTO.trackClick;
            }
            if ((i11 & 32) != 0) {
                map = cellButtonDTO.data;
            }
            String str5 = str4;
            Map map2 = map;
            return cellButtonDTO.copy(str, str2, enumC2132a, str3, str5, map2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getDeeplink() {
            return this.deeplink;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final a.EnumC2132a getType() {
            return this.type;
        }

        /* renamed from: component4, reason: from getter */
        public final String getAction() {
            return this.action;
        }

        /* renamed from: component5, reason: from getter */
        public final String getTrackClick() {
            return this.trackClick;
        }

        public final Map<String, Object> component6() {
            return this.data;
        }

        @NotNull
        public final CellButtonDTO copy(String deeplink, @NotNull String title, a.EnumC2132a type, String action, String trackClick, Map<String, ? extends Object> data) {
            Intrinsics.checkNotNullParameter(title, "title");
            return new CellButtonDTO(deeplink, title, type, action, trackClick, data);
        }

        @Override // ru.ozon.id.nativeauth.data.models.a, android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CellButtonDTO)) {
                return false;
            }
            CellButtonDTO cellButtonDTO = (CellButtonDTO) other;
            return Intrinsics.d(this.deeplink, cellButtonDTO.deeplink) && Intrinsics.d(this.title, cellButtonDTO.title) && this.type == cellButtonDTO.type && Intrinsics.d(this.action, cellButtonDTO.action) && Intrinsics.d(this.trackClick, cellButtonDTO.trackClick) && Intrinsics.d(this.data, cellButtonDTO.data);
        }

        @Override // ru.ozon.id.nativeauth.data.models.a
        public String getAction() {
            return this.action;
        }

        public final Map<String, Object> getData() {
            return this.data;
        }

        @Override // ru.ozon.id.nativeauth.data.models.a
        public String getDeeplink() {
            return this.deeplink;
        }

        @Override // ru.ozon.id.nativeauth.data.models.a
        @NotNull
        public String getTitle() {
            return this.title;
        }

        @Override // ru.ozon.id.nativeauth.data.models.a
        public String getTrackClick() {
            return this.trackClick;
        }

        @Override // ru.ozon.id.nativeauth.data.models.a
        public a.EnumC2132a getType() {
            return this.type;
        }

        public int hashCode() {
            String str = this.deeplink;
            int a11 = g.a((str == null ? 0 : str.hashCode()) * 31, 31, this.title);
            a.EnumC2132a enumC2132a = this.type;
            int hashCode = (a11 + (enumC2132a == null ? 0 : enumC2132a.hashCode())) * 31;
            String str2 = this.action;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.trackClick;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Map<String, Object> map = this.data;
            return hashCode3 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.deeplink;
            String str2 = this.title;
            a.EnumC2132a enumC2132a = this.type;
            String str3 = this.action;
            String str4 = this.trackClick;
            Map<String, Object> map = this.data;
            StringBuilder d11 = C3660k.d("CellButtonDTO(deeplink=", str, ", title=", str2, ", type=");
            d11.append(enumC2132a);
            d11.append(", action=");
            d11.append(str3);
            d11.append(", trackClick=");
            return C4070a.a(d11, str4, ", data=", map, ")");
        }

        @Override // ru.ozon.id.nativeauth.data.models.a, android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.deeplink);
            dest.writeString(this.title);
            a.EnumC2132a enumC2132a = this.type;
            if (enumC2132a == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(enumC2132a.name());
            }
            dest.writeString(this.action);
            dest.writeString(this.trackClick);
            Map<String, Object> map = this.data;
            if (map == null) {
                dest.writeInt(0);
                return;
            }
            Iterator e11 = J.e(map, dest, 1);
            while (e11.hasNext()) {
                Map.Entry entry = (Map.Entry) e11.next();
                dest.writeString((String) entry.getKey());
                dest.writeValue(entry.getValue());
            }
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001a\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0006\u0010\f\u001a\u00020\rJ\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\rHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\rR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0019"}, d2 = {"Lru/ozon/id/nativeauth/data/models/RestoreAccesDTO$FeatureFlags;", "Landroid/os/Parcelable;", "forceMobileIdOverCellular", "", "<init>", "(Ljava/lang/Boolean;)V", "getForceMobileIdOverCellular", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "copy", "(Ljava/lang/Boolean;)Lru/ozon/id/nativeauth/data/models/RestoreAccesDTO$FeatureFlags;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FeatureFlags implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<FeatureFlags> CREATOR = new a();
        private final Boolean forceMobileIdOverCellular;

        public static final class a implements Parcelable.Creator<FeatureFlags> {
            @Override // android.os.Parcelable.Creator
            public final FeatureFlags createFromParcel(Parcel parcel) {
                Boolean valueOf;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new FeatureFlags(valueOf);
            }

            @Override // android.os.Parcelable.Creator
            public final FeatureFlags[] newArray(int i11) {
                return new FeatureFlags[i11];
            }
        }

        public FeatureFlags(Boolean bool) {
            this.forceMobileIdOverCellular = bool;
        }

        public static /* synthetic */ FeatureFlags copy$default(FeatureFlags featureFlags, Boolean bool, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                bool = featureFlags.forceMobileIdOverCellular;
            }
            return featureFlags.copy(bool);
        }

        /* renamed from: component1, reason: from getter */
        public final Boolean getForceMobileIdOverCellular() {
            return this.forceMobileIdOverCellular;
        }

        @NotNull
        public final FeatureFlags copy(Boolean forceMobileIdOverCellular) {
            return new FeatureFlags(forceMobileIdOverCellular);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FeatureFlags) && Intrinsics.d(this.forceMobileIdOverCellular, ((FeatureFlags) other).forceMobileIdOverCellular);
        }

        public final Boolean getForceMobileIdOverCellular() {
            return this.forceMobileIdOverCellular;
        }

        public int hashCode() {
            Boolean bool = this.forceMobileIdOverCellular;
            if (bool == null) {
                return 0;
            }
            return bool.hashCode();
        }

        @NotNull
        public String toString() {
            return "FeatureFlags(forceMobileIdOverCellular=" + this.forceMobileIdOverCellular + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Boolean bool = this.forceMobileIdOverCellular;
            if (bool == null) {
                dest.writeInt(0);
            } else {
                c.c(dest, 1, bool);
            }
        }
    }

    public static final class a implements Parcelable.Creator<RestoreAccesDTO> {
        @Override // android.os.Parcelable.Creator
        public final RestoreAccesDTO createFromParcel(Parcel parcel) {
            OzonSpannableString ozonSpannableString;
            ArrayList arrayList;
            int i11 = 0;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (parcel.readInt() == 0) {
                ozonSpannableString = null;
            } else {
                String readString2 = parcel.readString();
                if (readString2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                ozonSpannableString = OzonSpannableStringKt.toOzonSpannableString(h.A0(OzonHtmlParser.INSTANCE.parseHtml(readString2, 63), '\n'));
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                while (i11 != readInt) {
                    i11 = Ak.b.b(CellButtonDTO.CREATOR, parcel, arrayList, i11, 1);
                }
            }
            return new RestoreAccesDTO(readString, ozonSpannableString, arrayList, parcel.readInt() != 0 ? FeatureFlags.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final RestoreAccesDTO[] newArray(int i11) {
            return new RestoreAccesDTO[i11];
        }
    }

    public RestoreAccesDTO(@NotNull String title, OzonSpannableString ozonSpannableString, List<CellButtonDTO> list, FeatureFlags featureFlags) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.title = title;
        this.subtitle = ozonSpannableString;
        this.cells = list;
        this.featureFlags = featureFlags;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RestoreAccesDTO copy$default(RestoreAccesDTO restoreAccesDTO, String str, OzonSpannableString ozonSpannableString, List list, FeatureFlags featureFlags, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = restoreAccesDTO.title;
        }
        if ((i11 & 2) != 0) {
            ozonSpannableString = restoreAccesDTO.subtitle;
        }
        if ((i11 & 4) != 0) {
            list = restoreAccesDTO.cells;
        }
        if ((i11 & 8) != 0) {
            featureFlags = restoreAccesDTO.featureFlags;
        }
        return restoreAccesDTO.copy(str, ozonSpannableString, list, featureFlags);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final OzonSpannableString getSubtitle() {
        return this.subtitle;
    }

    public final List<CellButtonDTO> component3() {
        return this.cells;
    }

    /* renamed from: component4, reason: from getter */
    public final FeatureFlags getFeatureFlags() {
        return this.featureFlags;
    }

    @NotNull
    public final RestoreAccesDTO copy(@NotNull String title, OzonSpannableString subtitle, List<CellButtonDTO> cells, FeatureFlags featureFlags) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new RestoreAccesDTO(title, subtitle, cells, featureFlags);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RestoreAccesDTO)) {
            return false;
        }
        RestoreAccesDTO restoreAccesDTO = (RestoreAccesDTO) other;
        return Intrinsics.d(this.title, restoreAccesDTO.title) && Intrinsics.d(this.subtitle, restoreAccesDTO.subtitle) && Intrinsics.d(this.cells, restoreAccesDTO.cells) && Intrinsics.d(this.featureFlags, restoreAccesDTO.featureFlags);
    }

    public final List<CellButtonDTO> getCells() {
        return this.cells;
    }

    public final FeatureFlags getFeatureFlags() {
        return this.featureFlags;
    }

    public final OzonSpannableString getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        OzonSpannableString ozonSpannableString = this.subtitle;
        int hashCode2 = (hashCode + (ozonSpannableString == null ? 0 : ozonSpannableString.hashCode())) * 31;
        List<CellButtonDTO> list = this.cells;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        FeatureFlags featureFlags = this.featureFlags;
        return hashCode3 + (featureFlags != null ? featureFlags.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        OzonSpannableString ozonSpannableString = this.subtitle;
        return "RestoreAccesDTO(title=" + str + ", subtitle=" + ((Object) ozonSpannableString) + ", cells=" + this.cells + ", featureFlags=" + this.featureFlags + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.title);
        OzonSpannableString ozonSpannableString = this.subtitle;
        Intrinsics.checkNotNullParameter(dest, "parcel");
        if (ozonSpannableString == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(Html.toHtml(ozonSpannableString, 1));
        }
        List<CellButtonDTO> list = this.cells;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator c11 = J.c(dest, 1, list);
            while (c11.hasNext()) {
                ((CellButtonDTO) c11.next()).writeToParcel(dest, flags);
            }
        }
        FeatureFlags featureFlags = this.featureFlags;
        if (featureFlags == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            featureFlags.writeToParcel(dest, flags);
        }
    }
}
