package com.vk.dto.music.audiobook;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.audiobook.AudioBooksChapterProgressStatus;
import com.vk.dto.music.moosic.MoosicAudio;
import org.json.JSONObject;
import xsna.aay;
import xsna.bxx;
import xsna.d370;
import xsna.epx;
import xsna.n40;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: AudioBookChapter.kt */
/* loaded from: classes18.dex */
public final class AudioBookChapter extends Serializer.StreamParcelableAdapter implements bxx {
    public static final Serializer.c<AudioBookChapter> CREATOR = new c();
    public final String b;
    public final String c;
    public final AudioBookFile d;
    public int e;
    public final AudioBooksChapterProgressStatus f;
    public final String g;
    public final Integer h;
    public final int i;
    public final DownloadingState j;
    public final MoosicAudio k;

    /* compiled from: AudioBookChapter.kt */
    public static final class a {
        public static String a(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append(UserId.d);
            sb.append('_');
            sb.append(com.vk.dto.music.audiobook.a.a(str));
            return sb.toString();
        }
    }

    /* compiled from: JsonParser.kt */
    public static final class b extends aay<AudioBookChapter> {
        @Override // xsna.aay
        public final AudioBookChapter a(JSONObject jSONObject) {
            return new AudioBookChapter(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class c extends Serializer.c<AudioBookChapter> {
        @Override // com.vk.core.serialize.Serializer.c
        public final AudioBookChapter a(Serializer serializer) {
            return new AudioBookChapter(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AudioBookChapter[i];
        }
    }

    static {
        new b();
    }

    public /* synthetic */ AudioBookChapter(String str, String str2, AudioBookFile audioBookFile, int i, AudioBooksChapterProgressStatus audioBooksChapterProgressStatus, String str3, Integer num, int i2, DownloadingState downloadingState, MoosicAudio moosicAudio, int i3, zcl zclVar) {
        this(str, str2, audioBookFile, i, audioBooksChapterProgressStatus, str3, num, i2, (i3 & 256) != 0 ? DownloadingState.NotLoaded.b : downloadingState, (i3 & 512) != 0 ? null : moosicAudio);
    }

    public static AudioBookChapter zb(AudioBookChapter audioBookChapter, int i, AudioBooksChapterProgressStatus audioBooksChapterProgressStatus, DownloadingState downloadingState, MoosicAudio moosicAudio, int i2) {
        String str = audioBookChapter.b;
        String str2 = audioBookChapter.c;
        AudioBookFile audioBookFile = audioBookChapter.d;
        if ((i2 & 8) != 0) {
            i = audioBookChapter.e;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            audioBooksChapterProgressStatus = audioBookChapter.f;
        }
        AudioBooksChapterProgressStatus audioBooksChapterProgressStatus2 = audioBooksChapterProgressStatus;
        String str3 = audioBookChapter.g;
        Integer num = audioBookChapter.h;
        int i4 = audioBookChapter.i;
        if ((i2 & 512) != 0) {
            moosicAudio = audioBookChapter.k;
        }
        return new AudioBookChapter(str, str2, audioBookFile, i3, audioBooksChapterProgressStatus2, str3, num, i4, downloadingState, moosicAudio);
    }

    public final AudioBookFile Ab() {
        return this.d;
    }

    public final DownloadingState Bb() {
        return this.j;
    }

    public final MoosicAudio Cb() {
        return this.k;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.i0(this.d);
        serializer.S(this.e);
        serializer.g0(this.f);
        serializer.j0(this.g);
        serializer.V(this.h);
        serializer.S(this.i);
        serializer.i0(this.j);
        serializer.i0(this.k);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        return d370.C(new n40(this, 4));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioBookChapter)) {
            return false;
        }
        AudioBookChapter audioBookChapter = (AudioBookChapter) obj;
        return epx.f(this.b, audioBookChapter.b) && epx.f(this.c, audioBookChapter.c) && epx.f(this.d, audioBookChapter.d) && this.e == audioBookChapter.e && this.f == audioBookChapter.f && epx.f(this.g, audioBookChapter.g) && epx.f(this.h, audioBookChapter.h) && this.i == audioBookChapter.i && epx.f(this.j, audioBookChapter.j) && epx.f(this.k, audioBookChapter.k);
    }

    public final String getId() {
        return this.b;
    }

    public final int hashCode() {
        int a2 = urd0.a(this.b.hashCode() * 31, 31, this.c);
        AudioBookFile audioBookFile = this.d;
        int a3 = urd0.a((this.f.hashCode() + shy.a(this.e, (a2 + (audioBookFile == null ? 0 : audioBookFile.hashCode())) * 31, 31)) * 31, 31, this.g);
        Integer num = this.h;
        int hashCode = (this.j.hashCode() + shy.a(this.i, (a3 + (num == null ? 0 : num.hashCode())) * 31, 31)) * 31;
        MoosicAudio moosicAudio = this.k;
        return hashCode + (moosicAudio != null ? moosicAudio.hashCode() : 0);
    }

    public final String toString() {
        return "AudioBookChapter(id=" + this.b + ", title=" + this.c + ", file=" + AudioBookFile.d;
    }

    public AudioBookChapter(String str, String str2, AudioBookFile audioBookFile, int i, AudioBooksChapterProgressStatus audioBooksChapterProgressStatus, String str3, Integer num, int i2, DownloadingState downloadingState, MoosicAudio moosicAudio) {
        this.b = str;
        this.c = str2;
        this.d = audioBookFile;
        this.e = i;
        this.f = audioBooksChapterProgressStatus;
        this.g = str3;
        this.h = num;
        this.i = i2;
        this.j = downloadingState;
        this.k = moosicAudio;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AudioBookChapter(JSONObject jSONObject) {
        this(r2, r3, r4, r5, AudioBooksChapterProgressStatus.a.a(r1), jSONObject.optString("track_code"), Integer.valueOf(jSONObject.optInt("special_project_id")), jSONObject.optInt("flags_context"), null, jSONObject.has("moosic_audio") ? new MoosicAudio(jSONObject.getJSONObject("moosic_audio")) : null, 256, null);
        String optString = jSONObject.optString("id");
        String optString2 = jSONObject.optString("title");
        AudioBookFile audioBookFile = new AudioBookFile(jSONObject.optJSONObject("audio_file"));
        int optInt = jSONObject.optInt("progress_time");
        AudioBooksChapterProgressStatus.a aVar = AudioBooksChapterProgressStatus.Companion;
        String optString3 = jSONObject.optString("progress_status");
        aVar.getClass();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AudioBookChapter(Serializer serializer) {
        this(r3, r4, r5, r6, r7, r0 == null ? "" : r0, serializer.v(), serializer.u(), (DownloadingState) serializer.G(DownloadingState.class.getClassLoader()), (MoosicAudio) serializer.G(MoosicAudio.class.getClassLoader()));
        String H = serializer.H();
        String str = H == null ? "" : H;
        String H2 = serializer.H();
        String str2 = H2 == null ? "" : H2;
        AudioBookFile audioBookFile = (AudioBookFile) serializer.G(AudioBookFile.class.getClassLoader());
        int u = serializer.u();
        AudioBooksChapterProgressStatus audioBooksChapterProgressStatus = (AudioBooksChapterProgressStatus) serializer.C();
        AudioBooksChapterProgressStatus audioBooksChapterProgressStatus2 = audioBooksChapterProgressStatus == null ? AudioBooksChapterProgressStatus.UNREAD : audioBooksChapterProgressStatus;
        String H3 = serializer.H();
    }
}
