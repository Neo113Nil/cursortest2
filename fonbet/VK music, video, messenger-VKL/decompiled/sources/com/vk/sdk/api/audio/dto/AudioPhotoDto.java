package com.vk.sdk.api.audio.dto;

import java.util.List;
import xsna.epx;
import xsna.n6j;
import xsna.odj;
import xsna.pmi0;
import xsna.shy;
import xsna.vp;
import xsna.zcl;

/* compiled from: AudioPhotoDto.kt */
/* loaded from: classes5.dex */
public final class AudioPhotoDto {

    @pmi0("height")
    private final int height;

    @pmi0("id")
    private final String id;

    @pmi0("photo_1200")
    private final String photo1200;

    @pmi0("photo_135")
    private final String photo135;

    @pmi0("photo_270")
    private final String photo270;

    @pmi0("photo_300")
    private final String photo300;

    @pmi0("photo_34")
    private final String photo34;

    @pmi0("photo_600")
    private final String photo600;

    @pmi0("photo_68")
    private final String photo68;

    @pmi0("sizes")
    private final List<AudioPhotoSizesDto> sizes;

    @pmi0("width")
    private final int width;

    public AudioPhotoDto(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List<AudioPhotoSizesDto> list) {
        this.width = i;
        this.height = i2;
        this.id = str;
        this.photo34 = str2;
        this.photo68 = str3;
        this.photo135 = str4;
        this.photo270 = str5;
        this.photo300 = str6;
        this.photo600 = str7;
        this.photo1200 = str8;
        this.sizes = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioPhotoDto)) {
            return false;
        }
        AudioPhotoDto audioPhotoDto = (AudioPhotoDto) obj;
        return this.width == audioPhotoDto.width && this.height == audioPhotoDto.height && epx.f(this.id, audioPhotoDto.id) && epx.f(this.photo34, audioPhotoDto.photo34) && epx.f(this.photo68, audioPhotoDto.photo68) && epx.f(this.photo135, audioPhotoDto.photo135) && epx.f(this.photo270, audioPhotoDto.photo270) && epx.f(this.photo300, audioPhotoDto.photo300) && epx.f(this.photo600, audioPhotoDto.photo600) && epx.f(this.photo1200, audioPhotoDto.photo1200) && epx.f(this.sizes, audioPhotoDto.sizes);
    }

    public final int hashCode() {
        int a = shy.a(this.height, Integer.hashCode(this.width) * 31, 31);
        String str = this.id;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.photo34;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.photo68;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.photo135;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.photo270;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.photo300;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.photo600;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.photo1200;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        List<AudioPhotoSizesDto> list = this.sizes;
        return hashCode8 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        int i = this.width;
        int i2 = this.height;
        String str = this.id;
        String str2 = this.photo34;
        String str3 = this.photo68;
        String str4 = this.photo135;
        String str5 = this.photo270;
        String str6 = this.photo300;
        String str7 = this.photo600;
        String str8 = this.photo1200;
        List<AudioPhotoSizesDto> list = this.sizes;
        StringBuilder a = odj.a(i, i2, "AudioPhotoDto(width=", ", height=", ", id=");
        n6j.b(a, str, ", photo34=", str2, ", photo68=");
        n6j.b(a, str3, ", photo135=", str4, ", photo270=");
        n6j.b(a, str5, ", photo300=", str6, ", photo600=");
        n6j.b(a, str7, ", photo1200=", str8, ", sizes=");
        return vp.b(")", a, list);
    }

    public /* synthetic */ AudioPhotoDto(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, int i3, zcl zclVar) {
        this(i, i2, (i3 & 4) != 0 ? null : str, (i3 & 8) != 0 ? null : str2, (i3 & 16) != 0 ? null : str3, (i3 & 32) != 0 ? null : str4, (i3 & 64) != 0 ? null : str5, (i3 & 128) != 0 ? null : str6, (i3 & 256) != 0 ? null : str7, (i3 & 512) != 0 ? null : str8, (i3 & 1024) != 0 ? null : list);
    }
}
