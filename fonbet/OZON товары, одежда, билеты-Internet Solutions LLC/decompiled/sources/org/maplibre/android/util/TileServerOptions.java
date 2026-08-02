package org.maplibre.android.util;

import Wf.c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import org.maplibre.android.f;

/* loaded from: classes10.dex */
public class TileServerOptions implements Parcelable {
    public static final Parcelable.Creator<TileServerOptions> CREATOR = new a();

    @Keep
    private String apiKeyParameterName;

    @Keep
    private boolean apiKeyRequired;

    @Keep
    private String baseURL;

    @Keep
    private String defaultStyle;

    @Keep
    private DefaultStyle[] defaultStyles;

    @Keep
    private String glyphsDomainName;

    @Keep
    private String glyphsTemplate;

    @Keep
    private String glyphsVersionPrefix;

    @Keep
    private String sourceDomainName;

    @Keep
    private String sourceTemplate;

    @Keep
    private String sourceVersionPrefix;

    @Keep
    private String spritesDomainName;

    @Keep
    private String spritesTemplate;

    @Keep
    private String spritesVersionPrefix;

    @Keep
    private String styleDomainName;

    @Keep
    private String styleTemplate;

    @Keep
    private String styleVersionPrefix;

    @Keep
    private String tileDomainName;

    @Keep
    private String tileTemplate;

    @Keep
    private String tileVersionPrefix;

    @Keep
    private String uriSchemeAlias;

    final class a implements Parcelable.Creator<TileServerOptions> {
        @Override // android.os.Parcelable.Creator
        public final TileServerOptions createFromParcel(@NonNull Parcel parcel) {
            return new TileServerOptions(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final TileServerOptions[] newArray(int i11) {
            return new TileServerOptions[i11];
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f79996a;

        static {
            int[] iArr = new int[f.values().length];
            f79996a = iArr;
            try {
                iArr[f.Mapbox.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f79996a[f.MapTiler.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f79996a[f.MapLibre.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Keep
    public TileServerOptions(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, boolean z11, String str19, DefaultStyle[] defaultStyleArr) {
        this.baseURL = str;
        this.uriSchemeAlias = str2;
        this.sourceTemplate = str3;
        this.sourceDomainName = str4;
        this.sourceVersionPrefix = str5;
        this.styleTemplate = str6;
        this.styleDomainName = str7;
        this.styleVersionPrefix = str8;
        this.spritesTemplate = str9;
        this.spritesDomainName = str10;
        this.spritesVersionPrefix = str11;
        this.glyphsTemplate = str12;
        this.glyphsDomainName = str13;
        this.glyphsVersionPrefix = str14;
        this.tileTemplate = str15;
        this.tileDomainName = str16;
        this.tileVersionPrefix = str17;
        this.apiKeyParameterName = str18;
        this.defaultStyles = defaultStyleArr;
        this.defaultStyle = str19;
        this.apiKeyRequired = z11;
    }

    public static TileServerOptions a(f fVar) {
        int i11 = b.f79996a[fVar.ordinal()];
        if (i11 == 1) {
            return mapboxConfiguration();
        }
        if (i11 == 2) {
            return mapTilerConfiguration();
        }
        if (i11 == 3) {
            return mapLibreConfiguration();
        }
        throw new c("Unknown tile server");
    }

    @NonNull
    @Keep
    private static native TileServerOptions defaultConfiguration();

    @NonNull
    @Keep
    private static native TileServerOptions mapLibreConfiguration();

    @NonNull
    @Keep
    private static native TileServerOptions mapTilerConfiguration();

    @NonNull
    @Keep
    private static native TileServerOptions mapboxConfiguration();

    public final DefaultStyle[] b() {
        return this.defaultStyles;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i11) {
        parcel.writeString(this.baseURL);
        parcel.writeString(this.uriSchemeAlias);
        parcel.writeString(this.sourceTemplate);
        parcel.writeString(this.sourceDomainName);
        parcel.writeString(this.sourceVersionPrefix);
        parcel.writeString(this.styleTemplate);
        parcel.writeString(this.styleDomainName);
        parcel.writeString(this.styleVersionPrefix);
        parcel.writeString(this.spritesTemplate);
        parcel.writeString(this.spritesDomainName);
        parcel.writeString(this.spritesVersionPrefix);
        parcel.writeString(this.glyphsTemplate);
        parcel.writeString(this.glyphsDomainName);
        parcel.writeString(this.glyphsVersionPrefix);
        parcel.writeString(this.tileTemplate);
        parcel.writeString(this.tileDomainName);
        parcel.writeString(this.tileVersionPrefix);
        parcel.writeString(this.apiKeyParameterName);
        parcel.writeByte(this.apiKeyRequired ? (byte) 1 : (byte) 0);
        parcel.writeString(this.defaultStyle);
        parcel.writeTypedArray(this.defaultStyles, 0);
    }

    protected TileServerOptions(Parcel parcel) {
        this.baseURL = parcel.readString();
        this.uriSchemeAlias = parcel.readString();
        this.sourceTemplate = parcel.readString();
        this.sourceDomainName = parcel.readString();
        this.sourceVersionPrefix = parcel.readString();
        this.styleTemplate = parcel.readString();
        this.styleDomainName = parcel.readString();
        this.styleVersionPrefix = parcel.readString();
        this.spritesTemplate = parcel.readString();
        this.spritesDomainName = parcel.readString();
        this.spritesVersionPrefix = parcel.readString();
        this.glyphsTemplate = parcel.readString();
        this.glyphsDomainName = parcel.readString();
        this.glyphsVersionPrefix = parcel.readString();
        this.tileTemplate = parcel.readString();
        this.tileDomainName = parcel.readString();
        this.tileVersionPrefix = parcel.readString();
        this.apiKeyParameterName = parcel.readString();
        this.apiKeyRequired = parcel.readByte() != 0;
        this.defaultStyle = parcel.readString();
        parcel.createTypedArray(DefaultStyle.CREATOR);
    }
}
