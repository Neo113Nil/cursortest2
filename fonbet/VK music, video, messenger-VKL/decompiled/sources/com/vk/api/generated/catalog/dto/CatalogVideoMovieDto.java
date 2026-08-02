package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.video.dto.VideoKinoMailCountryDto;
import com.vk.api.generated.video.dto.VideoKinoMailGenreDto;
import com.vk.api.generated.video.dto.VideoKinoMailPersonDto;
import com.vk.api.generated.video.dto.VideoKinoMailPictureDto;
import com.vk.api.generated.video.dto.VideoKinoMailSeasonDto;
import com.vk.api.generated.video.dto.VideoKinoMailStudioDto;
import io.reactivex.rxjava3.subjects.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.asp;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CatalogVideoMovieDto.kt */
/* loaded from: classes14.dex */
public final class CatalogVideoMovieDto implements Parcelable {
    public static final Parcelable.Creator<CatalogVideoMovieDto> CREATOR = new a();

    @pmi0("actors")
    private final List<VideoKinoMailPersonDto> actors;

    @pmi0("age_restrict")
    private final String ageRestrict;

    @pmi0("composers")
    private final List<VideoKinoMailPersonDto> composers;

    @pmi0("countries")
    private final List<VideoKinoMailCountryDto> countries;

    @pmi0("description")
    private final String description;

    @pmi0("directors")
    private final List<VideoKinoMailPersonDto> directors;

    @pmi0("duration")
    private final Integer duration;

    @pmi0("genres")
    private final List<VideoKinoMailGenreDto> genres;

    @pmi0("id")
    private final int id;

    @pmi0("imdb_rating")
    private final Float imdbRating;

    @pmi0("kinomail_rating")
    private final Float kinomailRating;

    @pmi0("license_type")
    private final LicenseTypeDto licenseType;

    @pmi0("main_rubric")
    private final MainRubricDto mainRubric;

    @pmi0("name")
    private final String name;

    @pmi0("name_eng")
    private final String nameEng;

    @pmi0("operators")
    private final List<VideoKinoMailPersonDto> operators;

    @pmi0("page_buttons")
    private final List<CatalogVideoMoviePageButtonDto> pageButtons;

    @pmi0("poster_picture")
    private final VideoKinoMailPictureDto posterPicture;

    @pmi0("premiere_ru")
    private final String premiereRu;

    @pmi0("premiere_world")
    private final String premiereWorld;

    @pmi0("screenwriters")
    private final List<VideoKinoMailPersonDto> screenwriters;

    @pmi0("seasons")
    private final List<VideoKinoMailSeasonDto> seasons;

    @pmi0("series_stop_year")
    private final Integer seriesStopYear;

    @pmi0("slides_orig_url")
    private final List<String> slidesOrigUrl;

    @pmi0("studios")
    private final List<VideoKinoMailStudioDto> studios;

    @pmi0("url")
    private final String url;

    @pmi0("year")
    private final Integer year;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CatalogVideoMovieDto.kt */
    public static final class LicenseTypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ LicenseTypeDto[] $VALUES;
        public static final Parcelable.Creator<LicenseTypeDto> CREATOR;

        @pmi0("external_pirate")
        public static final LicenseTypeDto EXTERNAL_PIRATE;

        @pmi0("internal_pirate")
        public static final LicenseTypeDto INTERNAL_PIRATE;

        @pmi0("license")
        public static final LicenseTypeDto LICENSE;
        private final String value;

        /* compiled from: CatalogVideoMovieDto.kt */
        public static final class a implements Parcelable.Creator<LicenseTypeDto> {
            @Override // android.os.Parcelable.Creator
            public final LicenseTypeDto createFromParcel(Parcel parcel) {
                return LicenseTypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final LicenseTypeDto[] newArray(int i) {
                return new LicenseTypeDto[i];
            }
        }

        static {
            LicenseTypeDto licenseTypeDto = new LicenseTypeDto("LICENSE", 0, "license");
            LICENSE = licenseTypeDto;
            LicenseTypeDto licenseTypeDto2 = new LicenseTypeDto("EXTERNAL_PIRATE", 1, "external_pirate");
            EXTERNAL_PIRATE = licenseTypeDto2;
            LicenseTypeDto licenseTypeDto3 = new LicenseTypeDto("INTERNAL_PIRATE", 2, "internal_pirate");
            INTERNAL_PIRATE = licenseTypeDto3;
            LicenseTypeDto[] licenseTypeDtoArr = {licenseTypeDto, licenseTypeDto2, licenseTypeDto3};
            $VALUES = licenseTypeDtoArr;
            $ENTRIES = new asp(licenseTypeDtoArr);
            CREATOR = new a();
        }

        private LicenseTypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static LicenseTypeDto valueOf(String str) {
            return (LicenseTypeDto) Enum.valueOf(LicenseTypeDto.class, str);
        }

        public static LicenseTypeDto[] values() {
            return (LicenseTypeDto[]) $VALUES.clone();
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CatalogVideoMovieDto.kt */
    public static final class MainRubricDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ MainRubricDto[] $VALUES;
        public static final Parcelable.Creator<MainRubricDto> CREATOR;

        @pmi0("movies")
        public static final MainRubricDto MOVIES;

        @pmi0("series")
        public static final MainRubricDto SERIES;

        @pmi0("tvshow")
        public static final MainRubricDto TVSHOW;
        private final String value;

        /* compiled from: CatalogVideoMovieDto.kt */
        public static final class a implements Parcelable.Creator<MainRubricDto> {
            @Override // android.os.Parcelable.Creator
            public final MainRubricDto createFromParcel(Parcel parcel) {
                return MainRubricDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final MainRubricDto[] newArray(int i) {
                return new MainRubricDto[i];
            }
        }

        static {
            MainRubricDto mainRubricDto = new MainRubricDto("MOVIES", 0, "movies");
            MOVIES = mainRubricDto;
            MainRubricDto mainRubricDto2 = new MainRubricDto("SERIES", 1, "series");
            SERIES = mainRubricDto2;
            MainRubricDto mainRubricDto3 = new MainRubricDto("TVSHOW", 2, "tvshow");
            TVSHOW = mainRubricDto3;
            MainRubricDto[] mainRubricDtoArr = {mainRubricDto, mainRubricDto2, mainRubricDto3};
            $VALUES = mainRubricDtoArr;
            $ENTRIES = new asp(mainRubricDtoArr);
            CREATOR = new a();
        }

        private MainRubricDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static MainRubricDto valueOf(String str) {
            return (MainRubricDto) Enum.valueOf(MainRubricDto.class, str);
        }

        public static MainRubricDto[] values() {
            return (MainRubricDto[]) $VALUES.clone();
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

    /* compiled from: CatalogVideoMovieDto.kt */
    public static final class a implements Parcelable.Creator<CatalogVideoMovieDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogVideoMovieDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            ArrayList arrayList5;
            int i;
            ArrayList arrayList6;
            ArrayList arrayList7;
            VideoKinoMailPictureDto videoKinoMailPictureDto;
            ArrayList arrayList8;
            ArrayList arrayList9;
            int i2;
            ArrayList arrayList10;
            ArrayList arrayList11;
            ArrayList arrayList12;
            ArrayList arrayList13;
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                ArrayList arrayList14 = new ArrayList(readInt2);
                int i3 = 0;
                while (i3 != readInt2) {
                    i3 = en.a(VideoKinoMailPersonDto.CREATOR, parcel, arrayList14, i3, 1);
                }
                arrayList = arrayList14;
            }
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList2 = new ArrayList(readInt3);
                int i4 = 0;
                while (i4 != readInt3) {
                    i4 = en.a(VideoKinoMailPersonDto.CREATOR, parcel, arrayList2, i4, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int readInt4 = parcel.readInt();
                arrayList3 = new ArrayList(readInt4);
                int i5 = 0;
                while (i5 != readInt4) {
                    i5 = en.a(VideoKinoMailPersonDto.CREATOR, parcel, arrayList3, i5, 1);
                }
            }
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                arrayList4 = null;
            } else {
                int readInt5 = parcel.readInt();
                arrayList4 = new ArrayList(readInt5);
                int i6 = 0;
                while (i6 != readInt5) {
                    i6 = en.a(VideoKinoMailGenreDto.CREATOR, parcel, arrayList4, i6, 1);
                }
            }
            Float valueOf2 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            Float valueOf3 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            LicenseTypeDto createFromParcel = parcel.readInt() == 0 ? null : LicenseTypeDto.CREATOR.createFromParcel(parcel);
            MainRubricDto createFromParcel2 = parcel.readInt() == 0 ? null : MainRubricDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int readInt6 = parcel.readInt();
                arrayList5 = new ArrayList(readInt6);
                int i7 = 0;
                while (true) {
                    i = readInt;
                    if (i7 == readInt6) {
                        break;
                    }
                    i7 = en.a(VideoKinoMailPersonDto.CREATOR, parcel, arrayList5, i7, 1);
                    readInt = i;
                    readString = readString;
                }
            } else {
                arrayList5 = null;
                i = readInt;
            }
            String str = readString;
            if (parcel.readInt() == 0) {
                arrayList6 = null;
            } else {
                int readInt7 = parcel.readInt();
                arrayList6 = new ArrayList(readInt7);
                int i8 = 0;
                while (i8 != readInt7) {
                    i8 = en.a(CatalogVideoMoviePageButtonDto.CREATOR, parcel, arrayList6, i8, 1);
                    readInt7 = readInt7;
                }
            }
            VideoKinoMailPictureDto createFromParcel3 = parcel.readInt() == 0 ? null : VideoKinoMailPictureDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int readInt8 = parcel.readInt();
                arrayList7 = new ArrayList(readInt8);
                videoKinoMailPictureDto = createFromParcel3;
                int i9 = 0;
                while (true) {
                    arrayList8 = arrayList6;
                    if (i9 == readInt8) {
                        break;
                    }
                    i9 = en.a(VideoKinoMailPersonDto.CREATOR, parcel, arrayList7, i9, 1);
                    arrayList6 = arrayList8;
                    arrayList = arrayList;
                }
            } else {
                videoKinoMailPictureDto = createFromParcel3;
                arrayList7 = null;
                arrayList8 = arrayList6;
            }
            ArrayList arrayList15 = arrayList;
            if (parcel.readInt() == 0) {
                arrayList9 = null;
            } else {
                int readInt9 = parcel.readInt();
                arrayList9 = new ArrayList(readInt9);
                int i10 = 0;
                while (i10 != readInt9) {
                    i10 = en.a(VideoKinoMailSeasonDto.CREATOR, parcel, arrayList9, i10, 1);
                    readInt9 = readInt9;
                }
            }
            String readString3 = parcel.readString();
            int i11 = i;
            String readString4 = parcel.readString();
            Integer valueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer num = valueOf;
            ArrayList arrayList16 = arrayList4;
            VideoKinoMailPictureDto videoKinoMailPictureDto2 = videoKinoMailPictureDto;
            String readString5 = parcel.readString();
            ArrayList arrayList17 = arrayList7;
            ArrayList arrayList18 = arrayList2;
            Float f = valueOf2;
            ArrayList arrayList19 = arrayList8;
            String readString6 = parcel.readString();
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            Integer valueOf5 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                i2 = i11;
                arrayList10 = arrayList9;
                arrayList12 = arrayList15;
                arrayList11 = null;
            } else {
                i2 = i11;
                int readInt10 = parcel.readInt();
                arrayList10 = arrayList9;
                arrayList11 = new ArrayList(readInt10);
                arrayList12 = arrayList15;
                int i12 = 0;
                while (i12 != readInt10) {
                    i12 = en.a(VideoKinoMailCountryDto.CREATOR, parcel, arrayList11, i12, 1);
                    readInt10 = readInt10;
                    valueOf4 = valueOf4;
                }
            }
            Integer num2 = valueOf4;
            if (parcel.readInt() == 0) {
                arrayList13 = null;
            } else {
                int readInt11 = parcel.readInt();
                ArrayList arrayList20 = new ArrayList(readInt11);
                int i13 = 0;
                while (i13 != readInt11) {
                    i13 = en.a(VideoKinoMailStudioDto.CREATOR, parcel, arrayList20, i13, 1);
                    readInt11 = readInt11;
                    arrayList11 = arrayList11;
                }
                arrayList13 = arrayList20;
            }
            return new CatalogVideoMovieDto(i2, str, arrayList12, readString2, arrayList18, arrayList3, num, arrayList16, f, valueOf3, createFromParcel, createFromParcel2, arrayList5, arrayList19, videoKinoMailPictureDto2, arrayList17, arrayList10, readString3, readString4, num2, readString5, readString6, createStringArrayList, valueOf5, arrayList11, arrayList13, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogVideoMovieDto[] newArray(int i) {
            return new CatalogVideoMovieDto[i];
        }
    }

    public CatalogVideoMovieDto(int i, String str, List<VideoKinoMailPersonDto> list, String str2, List<VideoKinoMailPersonDto> list2, List<VideoKinoMailPersonDto> list3, Integer num, List<VideoKinoMailGenreDto> list4, Float f, Float f2, LicenseTypeDto licenseTypeDto, MainRubricDto mainRubricDto, List<VideoKinoMailPersonDto> list5, List<CatalogVideoMoviePageButtonDto> list6, VideoKinoMailPictureDto videoKinoMailPictureDto, List<VideoKinoMailPersonDto> list7, List<VideoKinoMailSeasonDto> list8, String str3, String str4, Integer num2, String str5, String str6, List<String> list9, Integer num3, List<VideoKinoMailCountryDto> list10, List<VideoKinoMailStudioDto> list11, String str7) {
        this.id = i;
        this.name = str;
        this.actors = list;
        this.ageRestrict = str2;
        this.composers = list2;
        this.directors = list3;
        this.duration = num;
        this.genres = list4;
        this.imdbRating = f;
        this.kinomailRating = f2;
        this.licenseType = licenseTypeDto;
        this.mainRubric = mainRubricDto;
        this.operators = list5;
        this.pageButtons = list6;
        this.posterPicture = videoKinoMailPictureDto;
        this.screenwriters = list7;
        this.seasons = list8;
        this.description = str3;
        this.url = str4;
        this.year = num2;
        this.premiereRu = str5;
        this.premiereWorld = str6;
        this.slidesOrigUrl = list9;
        this.seriesStopYear = num3;
        this.countries = list10;
        this.studios = list11;
        this.nameEng = str7;
    }

    public final String B() {
        return this.nameEng;
    }

    public final List<VideoKinoMailPersonDto> C() {
        return this.operators;
    }

    public final List<CatalogVideoMoviePageButtonDto> D() {
        return this.pageButtons;
    }

    public final VideoKinoMailPictureDto F() {
        return this.posterPicture;
    }

    public final String G() {
        return this.premiereRu;
    }

    public final String K() {
        return this.premiereWorld;
    }

    public final List<VideoKinoMailPersonDto> M() {
        return this.screenwriters;
    }

    public final List<VideoKinoMailSeasonDto> R() {
        return this.seasons;
    }

    public final Integer T() {
        return this.seriesStopYear;
    }

    public final Integer W() {
        return this.year;
    }

    public final List<VideoKinoMailPersonDto> d() {
        return this.actors;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.ageRestrict;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogVideoMovieDto)) {
            return false;
        }
        CatalogVideoMovieDto catalogVideoMovieDto = (CatalogVideoMovieDto) obj;
        return this.id == catalogVideoMovieDto.id && epx.f(this.name, catalogVideoMovieDto.name) && epx.f(this.actors, catalogVideoMovieDto.actors) && epx.f(this.ageRestrict, catalogVideoMovieDto.ageRestrict) && epx.f(this.composers, catalogVideoMovieDto.composers) && epx.f(this.directors, catalogVideoMovieDto.directors) && epx.f(this.duration, catalogVideoMovieDto.duration) && epx.f(this.genres, catalogVideoMovieDto.genres) && epx.f(this.imdbRating, catalogVideoMovieDto.imdbRating) && epx.f(this.kinomailRating, catalogVideoMovieDto.kinomailRating) && this.licenseType == catalogVideoMovieDto.licenseType && this.mainRubric == catalogVideoMovieDto.mainRubric && epx.f(this.operators, catalogVideoMovieDto.operators) && epx.f(this.pageButtons, catalogVideoMovieDto.pageButtons) && epx.f(this.posterPicture, catalogVideoMovieDto.posterPicture) && epx.f(this.screenwriters, catalogVideoMovieDto.screenwriters) && epx.f(this.seasons, catalogVideoMovieDto.seasons) && epx.f(this.description, catalogVideoMovieDto.description) && epx.f(this.url, catalogVideoMovieDto.url) && epx.f(this.year, catalogVideoMovieDto.year) && epx.f(this.premiereRu, catalogVideoMovieDto.premiereRu) && epx.f(this.premiereWorld, catalogVideoMovieDto.premiereWorld) && epx.f(this.slidesOrigUrl, catalogVideoMovieDto.slidesOrigUrl) && epx.f(this.seriesStopYear, catalogVideoMovieDto.seriesStopYear) && epx.f(this.countries, catalogVideoMovieDto.countries) && epx.f(this.studios, catalogVideoMovieDto.studios) && epx.f(this.nameEng, catalogVideoMovieDto.nameEng);
    }

    public final List<VideoKinoMailPersonDto> f() {
        return this.composers;
    }

    public final List<VideoKinoMailCountryDto> g() {
        return this.countries;
    }

    public final String getDescription() {
        return this.description;
    }

    public final int getId() {
        return this.id;
    }

    public final int hashCode() {
        int a2 = urd0.a(Integer.hashCode(this.id) * 31, 31, this.name);
        List<VideoKinoMailPersonDto> list = this.actors;
        int hashCode = (a2 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.ageRestrict;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<VideoKinoMailPersonDto> list2 = this.composers;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<VideoKinoMailPersonDto> list3 = this.directors;
        int hashCode4 = (hashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Integer num = this.duration;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        List<VideoKinoMailGenreDto> list4 = this.genres;
        int hashCode6 = (hashCode5 + (list4 == null ? 0 : list4.hashCode())) * 31;
        Float f = this.imdbRating;
        int hashCode7 = (hashCode6 + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.kinomailRating;
        int hashCode8 = (hashCode7 + (f2 == null ? 0 : f2.hashCode())) * 31;
        LicenseTypeDto licenseTypeDto = this.licenseType;
        int hashCode9 = (hashCode8 + (licenseTypeDto == null ? 0 : licenseTypeDto.hashCode())) * 31;
        MainRubricDto mainRubricDto = this.mainRubric;
        int hashCode10 = (hashCode9 + (mainRubricDto == null ? 0 : mainRubricDto.hashCode())) * 31;
        List<VideoKinoMailPersonDto> list5 = this.operators;
        int hashCode11 = (hashCode10 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<CatalogVideoMoviePageButtonDto> list6 = this.pageButtons;
        int hashCode12 = (hashCode11 + (list6 == null ? 0 : list6.hashCode())) * 31;
        VideoKinoMailPictureDto videoKinoMailPictureDto = this.posterPicture;
        int hashCode13 = (hashCode12 + (videoKinoMailPictureDto == null ? 0 : videoKinoMailPictureDto.hashCode())) * 31;
        List<VideoKinoMailPersonDto> list7 = this.screenwriters;
        int hashCode14 = (hashCode13 + (list7 == null ? 0 : list7.hashCode())) * 31;
        List<VideoKinoMailSeasonDto> list8 = this.seasons;
        int hashCode15 = (hashCode14 + (list8 == null ? 0 : list8.hashCode())) * 31;
        String str2 = this.description;
        int hashCode16 = (hashCode15 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.url;
        int hashCode17 = (hashCode16 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.year;
        int hashCode18 = (hashCode17 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str4 = this.premiereRu;
        int hashCode19 = (hashCode18 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.premiereWorld;
        int hashCode20 = (hashCode19 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<String> list9 = this.slidesOrigUrl;
        int hashCode21 = (hashCode20 + (list9 == null ? 0 : list9.hashCode())) * 31;
        Integer num3 = this.seriesStopYear;
        int hashCode22 = (hashCode21 + (num3 == null ? 0 : num3.hashCode())) * 31;
        List<VideoKinoMailCountryDto> list10 = this.countries;
        int hashCode23 = (hashCode22 + (list10 == null ? 0 : list10.hashCode())) * 31;
        List<VideoKinoMailStudioDto> list11 = this.studios;
        int hashCode24 = (hashCode23 + (list11 == null ? 0 : list11.hashCode())) * 31;
        String str6 = this.nameEng;
        return hashCode24 + (str6 != null ? str6.hashCode() : 0);
    }

    public final List<VideoKinoMailPersonDto> i() {
        return this.directors;
    }

    public final Integer j() {
        return this.duration;
    }

    public final List<VideoKinoMailGenreDto> k() {
        return this.genres;
    }

    public final Float l() {
        return this.imdbRating;
    }

    public final Float n() {
        return this.kinomailRating;
    }

    public final LicenseTypeDto o() {
        return this.licenseType;
    }

    public final MainRubricDto p() {
        return this.mainRubric;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogVideoMovieDto(id=");
        sb.append(this.id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", actors=");
        sb.append(this.actors);
        sb.append(", ageRestrict=");
        sb.append(this.ageRestrict);
        sb.append(", composers=");
        sb.append(this.composers);
        sb.append(", directors=");
        sb.append(this.directors);
        sb.append(", duration=");
        sb.append(this.duration);
        sb.append(", genres=");
        sb.append(this.genres);
        sb.append(", imdbRating=");
        sb.append(this.imdbRating);
        sb.append(", kinomailRating=");
        sb.append(this.kinomailRating);
        sb.append(", licenseType=");
        sb.append(this.licenseType);
        sb.append(", mainRubric=");
        sb.append(this.mainRubric);
        sb.append(", operators=");
        sb.append(this.operators);
        sb.append(", pageButtons=");
        sb.append(this.pageButtons);
        sb.append(", posterPicture=");
        sb.append(this.posterPicture);
        sb.append(", screenwriters=");
        sb.append(this.screenwriters);
        sb.append(", seasons=");
        sb.append(this.seasons);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", year=");
        sb.append(this.year);
        sb.append(", premiereRu=");
        sb.append(this.premiereRu);
        sb.append(", premiereWorld=");
        sb.append(this.premiereWorld);
        sb.append(", slidesOrigUrl=");
        sb.append(this.slidesOrigUrl);
        sb.append(", seriesStopYear=");
        sb.append(this.seriesStopYear);
        sb.append(", countries=");
        sb.append(this.countries);
        sb.append(", studios=");
        sb.append(this.studios);
        sb.append(", nameEng=");
        return ho8.a(sb, this.nameEng, ')');
    }

    public final String u() {
        return this.name;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.name);
        List<VideoKinoMailPersonDto> list = this.actors;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((VideoKinoMailPersonDto) f.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.ageRestrict);
        List<VideoKinoMailPersonDto> list2 = this.composers;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                ((VideoKinoMailPersonDto) f2.next()).writeToParcel(parcel, i);
            }
        }
        List<VideoKinoMailPersonDto> list3 = this.directors;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f3 = dn.f(parcel, list3, 1);
            while (f3.hasNext()) {
                ((VideoKinoMailPersonDto) f3.next()).writeToParcel(parcel, i);
            }
        }
        Integer num = this.duration;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        List<VideoKinoMailGenreDto> list4 = this.genres;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f4 = dn.f(parcel, list4, 1);
            while (f4.hasNext()) {
                ((VideoKinoMailGenreDto) f4.next()).writeToParcel(parcel, i);
            }
        }
        Float f5 = this.imdbRating;
        if (f5 == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f5);
        }
        Float f6 = this.kinomailRating;
        if (f6 == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f6);
        }
        LicenseTypeDto licenseTypeDto = this.licenseType;
        if (licenseTypeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            licenseTypeDto.writeToParcel(parcel, i);
        }
        MainRubricDto mainRubricDto = this.mainRubric;
        if (mainRubricDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            mainRubricDto.writeToParcel(parcel, i);
        }
        List<VideoKinoMailPersonDto> list5 = this.operators;
        if (list5 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f7 = dn.f(parcel, list5, 1);
            while (f7.hasNext()) {
                ((VideoKinoMailPersonDto) f7.next()).writeToParcel(parcel, i);
            }
        }
        List<CatalogVideoMoviePageButtonDto> list6 = this.pageButtons;
        if (list6 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f8 = dn.f(parcel, list6, 1);
            while (f8.hasNext()) {
                ((CatalogVideoMoviePageButtonDto) f8.next()).writeToParcel(parcel, i);
            }
        }
        VideoKinoMailPictureDto videoKinoMailPictureDto = this.posterPicture;
        if (videoKinoMailPictureDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoKinoMailPictureDto.writeToParcel(parcel, i);
        }
        List<VideoKinoMailPersonDto> list7 = this.screenwriters;
        if (list7 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f9 = dn.f(parcel, list7, 1);
            while (f9.hasNext()) {
                ((VideoKinoMailPersonDto) f9.next()).writeToParcel(parcel, i);
            }
        }
        List<VideoKinoMailSeasonDto> list8 = this.seasons;
        if (list8 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f10 = dn.f(parcel, list8, 1);
            while (f10.hasNext()) {
                ((VideoKinoMailSeasonDto) f10.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.description);
        parcel.writeString(this.url);
        Integer num2 = this.year;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        parcel.writeString(this.premiereRu);
        parcel.writeString(this.premiereWorld);
        parcel.writeStringList(this.slidesOrigUrl);
        Integer num3 = this.seriesStopYear;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        List<VideoKinoMailCountryDto> list9 = this.countries;
        if (list9 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f11 = dn.f(parcel, list9, 1);
            while (f11.hasNext()) {
                ((VideoKinoMailCountryDto) f11.next()).writeToParcel(parcel, i);
            }
        }
        List<VideoKinoMailStudioDto> list10 = this.studios;
        if (list10 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f12 = dn.f(parcel, list10, 1);
            while (f12.hasNext()) {
                ((VideoKinoMailStudioDto) f12.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.nameEng);
    }

    public /* synthetic */ CatalogVideoMovieDto(int i, String str, List list, String str2, List list2, List list3, Integer num, List list4, Float f, Float f2, LicenseTypeDto licenseTypeDto, MainRubricDto mainRubricDto, List list5, List list6, VideoKinoMailPictureDto videoKinoMailPictureDto, List list7, List list8, String str3, String str4, Integer num2, String str5, String str6, List list9, Integer num3, List list10, List list11, String str7, int i2, zcl zclVar) {
        this(i, str, (i2 & 4) != 0 ? null : list, (i2 & 8) != 0 ? null : str2, (i2 & 16) != 0 ? null : list2, (i2 & 32) != 0 ? null : list3, (i2 & 64) != 0 ? null : num, (i2 & 128) != 0 ? null : list4, (i2 & 256) != 0 ? null : f, (i2 & 512) != 0 ? null : f2, (i2 & 1024) != 0 ? null : licenseTypeDto, (i2 & 2048) != 0 ? null : mainRubricDto, (i2 & 4096) != 0 ? null : list5, (i2 & 8192) != 0 ? null : list6, (i2 & 16384) != 0 ? null : videoKinoMailPictureDto, (32768 & i2) != 0 ? null : list7, (65536 & i2) != 0 ? null : list8, (131072 & i2) != 0 ? null : str3, (262144 & i2) != 0 ? null : str4, (524288 & i2) != 0 ? null : num2, (1048576 & i2) != 0 ? null : str5, (2097152 & i2) != 0 ? null : str6, (4194304 & i2) != 0 ? null : list9, (8388608 & i2) != 0 ? null : num3, (16777216 & i2) != 0 ? null : list10, (33554432 & i2) != 0 ? null : list11, (i2 & 67108864) != 0 ? null : str7);
    }
}
