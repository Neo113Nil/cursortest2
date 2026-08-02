package com.vk.api.generated.audioBooks.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.Hb;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.api.generated.media.dto.MediaPopupDto;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.qoy;
import xsna.shy;
import xsna.sn;
import xsna.urd0;
import xsna.zcl;

/* compiled from: AudioBooksAudioBookDto.kt */
/* loaded from: classes14.dex */
public final class AudioBooksAudioBookDto implements Parcelable {
    public static final Parcelable.Creator<AudioBooksAudioBookDto> CREATOR = new a();

    @pmi0("access_status")
    private final AudioBooksAccessStatusDto accessStatus;

    @pmi0("annotation")
    private final String annotation;

    @pmi0("authors")
    private final List<AudioBooksItemPersonDto> authors;

    @pmi0("chapters")
    private final List<AudioBooksChapterDto> chapters;

    @pmi0("code")
    private final String code;

    @pmi0("copyright")
    private final String copyright;

    @pmi0("cover")
    private final List<AudioBooksImageDto> cover;

    @pmi0("duration")
    private final int duration;

    @pmi0("file_size")
    private final int fileSize;

    @pmi0("flags_context")
    private final Integer flagsContext;

    @pmi0("genres")
    private final List<AudioBooksGenreDto> genres;

    @pmi0("has_illegal_mentions")
    private final Boolean hasIllegalMentions;

    @pmi0("id")
    private final int id;

    @pmi0("illegal_mentions_text")
    private final String illegalMentionsText;

    @pmi0("in_favorites")
    private final boolean inFavorites;

    @pmi0("is_explicit")
    private final boolean isExplicit;

    @pmi0("main_genre")
    private final AudioBooksGenreDto mainGenre;

    @pmi0("minimum_age")
    private final int minimumAge;

    @pmi0("narrators")
    private final List<AudioBooksItemPersonDto> narrators;

    @pmi0("progress_percentage")
    private final int progressPercentage;

    @pmi0(Hb.b)
    private final AudioBooksPublisherDto publisher;

    @pmi0("release_date")
    private final Integer releaseDate;

    @pmi0("restriction")
    private final MediaPopupDto restriction;

    @pmi0("title")
    private final String title;

    @pmi0("track_code")
    private final String trackCode;

    @pmi0("translators")
    private final List<AudioBooksItemPersonDto> translators;

    @pmi0("updated_at")
    private final int updatedAt;

    /* compiled from: AudioBooksAudioBookDto.kt */
    public static final class a implements Parcelable.Creator<AudioBooksAudioBookDto> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final AudioBooksAudioBookDto createFromParcel(Parcel parcel) {
            boolean z;
            AudioBooksPublisherDto audioBooksPublisherDto;
            boolean z2;
            int i;
            ArrayList arrayList;
            String str;
            String str2;
            ArrayList arrayList2;
            Integer valueOf;
            Boolean bool;
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt2 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(readInt2);
            int i2 = 0;
            while (i2 != readInt2) {
                i2 = en.a(AudioBooksChapterDto.CREATOR, parcel, arrayList3, i2, 1);
            }
            int readInt3 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(readInt3);
            int i3 = 0;
            while (i3 != readInt3) {
                i3 = en.a(AudioBooksItemPersonDto.CREATOR, parcel, arrayList4, i3, 1);
            }
            int readInt4 = parcel.readInt();
            boolean z3 = false;
            ArrayList arrayList5 = new ArrayList(readInt4);
            int i4 = 0;
            while (i4 != readInt4) {
                i4 = en.a(AudioBooksItemPersonDto.CREATOR, parcel, arrayList5, i4, 1);
            }
            int readInt5 = parcel.readInt();
            ArrayList arrayList6 = new ArrayList(readInt5);
            int i5 = 0;
            while (i5 != readInt5) {
                i5 = en.a(AudioBooksGenreDto.CREATOR, parcel, arrayList6, i5, 1);
            }
            int readInt6 = parcel.readInt();
            if (parcel.readInt() != 0) {
                z = false;
                z3 = true;
            } else {
                z = false;
            }
            ArrayList arrayList7 = arrayList3;
            int readInt7 = parcel.readInt();
            AudioBooksPublisherDto createFromParcel = AudioBooksPublisherDto.CREATOR.createFromParcel(parcel);
            int readInt8 = parcel.readInt();
            if (parcel.readInt() != 0) {
                audioBooksPublisherDto = createFromParcel;
                z2 = true;
            } else {
                boolean z4 = z;
                audioBooksPublisherDto = createFromParcel;
                z2 = z4;
            }
            int readInt9 = parcel.readInt();
            AudioBooksAccessStatusDto createFromParcel2 = AudioBooksAccessStatusDto.CREATOR.createFromParcel(parcel);
            String readString3 = parcel.readString();
            int readInt10 = parcel.readInt();
            if (parcel.readInt() != 0) {
                int readInt11 = parcel.readInt();
                i = readInt;
                arrayList = new ArrayList(readInt11);
                str = readString;
                int i6 = 0;
                while (true) {
                    str2 = readString2;
                    if (i6 == readInt11) {
                        break;
                    }
                    i6 = en.a(AudioBooksImageDto.CREATOR, parcel, arrayList, i6, 1);
                    readString2 = str2;
                    arrayList7 = arrayList7;
                }
            } else {
                i = readInt;
                str = readString;
                arrayList = null;
                str2 = readString2;
            }
            ArrayList arrayList8 = arrayList7;
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt12 = parcel.readInt();
                arrayList2 = new ArrayList(readInt12);
                int i7 = 0;
                while (i7 != readInt12) {
                    i7 = en.a(AudioBooksItemPersonDto.CREATOR, parcel, arrayList2, i7, 1);
                    arrayList = arrayList;
                }
            }
            ArrayList arrayList9 = arrayList;
            AudioBooksGenreDto createFromParcel3 = parcel.readInt() == 0 ? null : AudioBooksGenreDto.CREATOR.createFromParcel(parcel);
            String readString4 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
                bool = null;
            } else {
                valueOf = Integer.valueOf(parcel.readInt());
                bool = null;
            }
            String str3 = str;
            String readString5 = parcel.readString();
            Object valueOf2 = parcel.readInt() == 0 ? bool : Integer.valueOf(parcel.readInt());
            MediaPopupDto mediaPopupDto = (MediaPopupDto) parcel.readParcelable(AudioBooksAudioBookDto.class.getClassLoader());
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AudioBooksAudioBookDto(i, str3, str2, arrayList8, arrayList4, arrayList5, arrayList6, readInt6, z3, readInt7, audioBooksPublisherDto, readInt8, z2, readInt9, createFromParcel2, readString3, readInt10, arrayList9, arrayList2, createFromParcel3, readString4, valueOf, readString5, valueOf2, mediaPopupDto, bool, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AudioBooksAudioBookDto[] newArray(int i) {
            return new AudioBooksAudioBookDto[i];
        }
    }

    public AudioBooksAudioBookDto(int i, String str, String str2, List<AudioBooksChapterDto> list, List<AudioBooksItemPersonDto> list2, List<AudioBooksItemPersonDto> list3, List<AudioBooksGenreDto> list4, int i2, boolean z, int i3, AudioBooksPublisherDto audioBooksPublisherDto, int i4, boolean z2, int i5, AudioBooksAccessStatusDto audioBooksAccessStatusDto, String str3, int i6, List<AudioBooksImageDto> list5, List<AudioBooksItemPersonDto> list6, AudioBooksGenreDto audioBooksGenreDto, String str4, Integer num, String str5, Integer num2, MediaPopupDto mediaPopupDto, Boolean bool, String str6) {
        this.id = i;
        this.title = str;
        this.annotation = str2;
        this.chapters = list;
        this.authors = list2;
        this.narrators = list3;
        this.genres = list4;
        this.minimumAge = i2;
        this.isExplicit = z;
        this.duration = i3;
        this.publisher = audioBooksPublisherDto;
        this.updatedAt = i4;
        this.inFavorites = z2;
        this.progressPercentage = i5;
        this.accessStatus = audioBooksAccessStatusDto;
        this.trackCode = str3;
        this.fileSize = i6;
        this.cover = list5;
        this.translators = list6;
        this.mainGenre = audioBooksGenreDto;
        this.copyright = str4;
        this.releaseDate = num;
        this.code = str5;
        this.flagsContext = num2;
        this.restriction = mediaPopupDto;
        this.hasIllegalMentions = bool;
        this.illegalMentionsText = str6;
    }

    public final AudioBooksPublisherDto B() {
        return this.publisher;
    }

    public final Integer C() {
        return this.releaseDate;
    }

    public final MediaPopupDto D() {
        return this.restriction;
    }

    public final List<AudioBooksItemPersonDto> F() {
        return this.translators;
    }

    public final int G() {
        return this.updatedAt;
    }

    public final boolean K() {
        return this.isExplicit;
    }

    public final AudioBooksAccessStatusDto d() {
        return this.accessStatus;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.annotation;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioBooksAudioBookDto)) {
            return false;
        }
        AudioBooksAudioBookDto audioBooksAudioBookDto = (AudioBooksAudioBookDto) obj;
        return this.id == audioBooksAudioBookDto.id && epx.f(this.title, audioBooksAudioBookDto.title) && epx.f(this.annotation, audioBooksAudioBookDto.annotation) && epx.f(this.chapters, audioBooksAudioBookDto.chapters) && epx.f(this.authors, audioBooksAudioBookDto.authors) && epx.f(this.narrators, audioBooksAudioBookDto.narrators) && epx.f(this.genres, audioBooksAudioBookDto.genres) && this.minimumAge == audioBooksAudioBookDto.minimumAge && this.isExplicit == audioBooksAudioBookDto.isExplicit && this.duration == audioBooksAudioBookDto.duration && epx.f(this.publisher, audioBooksAudioBookDto.publisher) && this.updatedAt == audioBooksAudioBookDto.updatedAt && this.inFavorites == audioBooksAudioBookDto.inFavorites && this.progressPercentage == audioBooksAudioBookDto.progressPercentage && this.accessStatus == audioBooksAudioBookDto.accessStatus && epx.f(this.trackCode, audioBooksAudioBookDto.trackCode) && this.fileSize == audioBooksAudioBookDto.fileSize && epx.f(this.cover, audioBooksAudioBookDto.cover) && epx.f(this.translators, audioBooksAudioBookDto.translators) && epx.f(this.mainGenre, audioBooksAudioBookDto.mainGenre) && epx.f(this.copyright, audioBooksAudioBookDto.copyright) && epx.f(this.releaseDate, audioBooksAudioBookDto.releaseDate) && epx.f(this.code, audioBooksAudioBookDto.code) && epx.f(this.flagsContext, audioBooksAudioBookDto.flagsContext) && epx.f(this.restriction, audioBooksAudioBookDto.restriction) && epx.f(this.hasIllegalMentions, audioBooksAudioBookDto.hasIllegalMentions) && epx.f(this.illegalMentionsText, audioBooksAudioBookDto.illegalMentionsText);
    }

    public final List<AudioBooksItemPersonDto> f() {
        return this.authors;
    }

    public final List<AudioBooksChapterDto> g() {
        return this.chapters;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final int getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int a2 = shy.a(this.fileSize, urd0.a((this.accessStatus.hashCode() + shy.a(this.progressPercentage, qoy.b(shy.a(this.updatedAt, (this.publisher.hashCode() + shy.a(this.duration, qoy.b(shy.a(this.minimumAge, fw3.a(fw3.a(fw3.a(fw3.a(urd0.a(urd0.a(Integer.hashCode(this.id) * 31, 31, this.title), 31, this.annotation), 31, this.chapters), 31, this.authors), 31, this.narrators), 31, this.genres), 31), 31, this.isExplicit), 31)) * 31, 31), 31, this.inFavorites), 31)) * 31, 31, this.trackCode), 31);
        List<AudioBooksImageDto> list = this.cover;
        int hashCode = (a2 + (list == null ? 0 : list.hashCode())) * 31;
        List<AudioBooksItemPersonDto> list2 = this.translators;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        AudioBooksGenreDto audioBooksGenreDto = this.mainGenre;
        int hashCode3 = (hashCode2 + (audioBooksGenreDto == null ? 0 : audioBooksGenreDto.hashCode())) * 31;
        String str = this.copyright;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.releaseDate;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.code;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.flagsContext;
        int hashCode7 = (hashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        MediaPopupDto mediaPopupDto = this.restriction;
        int hashCode8 = (hashCode7 + (mediaPopupDto == null ? 0 : mediaPopupDto.hashCode())) * 31;
        Boolean bool = this.hasIllegalMentions;
        int hashCode9 = (hashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.illegalMentionsText;
        return hashCode9 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String i() {
        return this.copyright;
    }

    public final List<AudioBooksImageDto> j() {
        return this.cover;
    }

    public final Integer k() {
        return this.flagsContext;
    }

    public final List<AudioBooksGenreDto> l() {
        return this.genres;
    }

    public final String n() {
        return this.illegalMentionsText;
    }

    public final boolean o() {
        return this.inFavorites;
    }

    public final int p() {
        return this.minimumAge;
    }

    public final String r() {
        return this.trackCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioBooksAudioBookDto(id=");
        sb.append(this.id);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", annotation=");
        sb.append(this.annotation);
        sb.append(", chapters=");
        sb.append(this.chapters);
        sb.append(", authors=");
        sb.append(this.authors);
        sb.append(", narrators=");
        sb.append(this.narrators);
        sb.append(", genres=");
        sb.append(this.genres);
        sb.append(", minimumAge=");
        sb.append(this.minimumAge);
        sb.append(", isExplicit=");
        sb.append(this.isExplicit);
        sb.append(", duration=");
        sb.append(this.duration);
        sb.append(", publisher=");
        sb.append(this.publisher);
        sb.append(", updatedAt=");
        sb.append(this.updatedAt);
        sb.append(", inFavorites=");
        sb.append(this.inFavorites);
        sb.append(", progressPercentage=");
        sb.append(this.progressPercentage);
        sb.append(", accessStatus=");
        sb.append(this.accessStatus);
        sb.append(", trackCode=");
        sb.append(this.trackCode);
        sb.append(", fileSize=");
        sb.append(this.fileSize);
        sb.append(", cover=");
        sb.append(this.cover);
        sb.append(", translators=");
        sb.append(this.translators);
        sb.append(", mainGenre=");
        sb.append(this.mainGenre);
        sb.append(", copyright=");
        sb.append(this.copyright);
        sb.append(", releaseDate=");
        sb.append(this.releaseDate);
        sb.append(", code=");
        sb.append(this.code);
        sb.append(", flagsContext=");
        sb.append(this.flagsContext);
        sb.append(", restriction=");
        sb.append(this.restriction);
        sb.append(", hasIllegalMentions=");
        sb.append(this.hasIllegalMentions);
        sb.append(", illegalMentionsText=");
        return ho8.a(sb, this.illegalMentionsText, ')');
    }

    public final List<AudioBooksItemPersonDto> u() {
        return this.narrators;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.title);
        parcel.writeString(this.annotation);
        Iterator a2 = ao.a(parcel, this.chapters);
        while (a2.hasNext()) {
            ((AudioBooksChapterDto) a2.next()).writeToParcel(parcel, i);
        }
        Iterator a3 = ao.a(parcel, this.authors);
        while (a3.hasNext()) {
            ((AudioBooksItemPersonDto) a3.next()).writeToParcel(parcel, i);
        }
        Iterator a4 = ao.a(parcel, this.narrators);
        while (a4.hasNext()) {
            ((AudioBooksItemPersonDto) a4.next()).writeToParcel(parcel, i);
        }
        Iterator a5 = ao.a(parcel, this.genres);
        while (a5.hasNext()) {
            ((AudioBooksGenreDto) a5.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.minimumAge);
        parcel.writeInt(this.isExplicit ? 1 : 0);
        parcel.writeInt(this.duration);
        this.publisher.writeToParcel(parcel, i);
        parcel.writeInt(this.updatedAt);
        parcel.writeInt(this.inFavorites ? 1 : 0);
        parcel.writeInt(this.progressPercentage);
        this.accessStatus.writeToParcel(parcel, i);
        parcel.writeString(this.trackCode);
        parcel.writeInt(this.fileSize);
        List<AudioBooksImageDto> list = this.cover;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((AudioBooksImageDto) f.next()).writeToParcel(parcel, i);
            }
        }
        List<AudioBooksItemPersonDto> list2 = this.translators;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                ((AudioBooksItemPersonDto) f2.next()).writeToParcel(parcel, i);
            }
        }
        AudioBooksGenreDto audioBooksGenreDto = this.mainGenre;
        if (audioBooksGenreDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            audioBooksGenreDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.copyright);
        Integer num = this.releaseDate;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.code);
        Integer num2 = this.flagsContext;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        parcel.writeParcelable(this.restriction, i);
        Boolean bool = this.hasIllegalMentions;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        parcel.writeString(this.illegalMentionsText);
    }

    public /* synthetic */ AudioBooksAudioBookDto(int i, String str, String str2, List list, List list2, List list3, List list4, int i2, boolean z, int i3, AudioBooksPublisherDto audioBooksPublisherDto, int i4, boolean z2, int i5, AudioBooksAccessStatusDto audioBooksAccessStatusDto, String str3, int i6, List list5, List list6, AudioBooksGenreDto audioBooksGenreDto, String str4, Integer num, String str5, Integer num2, MediaPopupDto mediaPopupDto, Boolean bool, String str6, int i7, zcl zclVar) {
        this(i, str, str2, list, list2, list3, list4, i2, z, i3, audioBooksPublisherDto, i4, z2, i5, audioBooksAccessStatusDto, str3, i6, (i7 & 131072) != 0 ? null : list5, (i7 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : list6, (i7 & 524288) != 0 ? null : audioBooksGenreDto, (i7 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : str4, (i7 & 2097152) != 0 ? null : num, (i7 & 4194304) != 0 ? null : str5, (i7 & 8388608) != 0 ? null : num2, (i7 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : mediaPopupDto, (i7 & 33554432) != 0 ? null : bool, (i7 & 67108864) != 0 ? null : str6);
    }
}
