package com.vk.music.playlist.display.audiobook.offline.presentation.feature;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.music.audiobook.AudioBook;
import java.util.LinkedHashMap;
import java.util.Map;
import xsna.cjl0;
import xsna.epx;
import xsna.jgp;
import xsna.lm50;
import xsna.zcl;

/* compiled from: OfflineAudioBookChaptersMviState.kt */
/* loaded from: classes3.dex */
public abstract class OfflineAudioBookChaptersMviState implements lm50, Parcelable {

    /* compiled from: OfflineAudioBookChaptersMviState.kt */
    public static final class Content extends OfflineAudioBookChaptersMviState {
        public static final Parcelable.Creator<Content> CREATOR = new a();
        public final AudioBook b;
        public final Map<String, DownloadingState> c;

        /* compiled from: OfflineAudioBookChaptersMviState.kt */
        public static final class a implements Parcelable.Creator<Content> {
            @Override // android.os.Parcelable.Creator
            public final Content createFromParcel(Parcel parcel) {
                AudioBook audioBook = (AudioBook) parcel.readParcelable(Content.class.getClassLoader());
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
                for (int i = 0; i != readInt; i++) {
                    linkedHashMap.put(parcel.readString(), parcel.readParcelable(Content.class.getClassLoader()));
                }
                return new Content(audioBook, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final Content[] newArray(int i) {
                return new Content[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Content(AudioBook audioBook, Map<String, ? extends DownloadingState> map) {
            super(null);
            this.b = audioBook;
            this.c = map;
        }

        @Override // com.vk.music.playlist.display.audiobook.offline.presentation.feature.OfflineAudioBookChaptersMviState
        public final Content a(AudioBook audioBook) {
            return new Content(audioBook, this.c);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return epx.f(this.b, content.b) && epx.f(this.c, content.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        @Override // com.vk.music.playlist.display.audiobook.offline.presentation.feature.OfflineAudioBookChaptersMviState
        public final OfflineAudioBookChaptersMviState j(Map<String, ? extends DownloadingState> map) {
            return new Content(this.b, map);
        }

        @Override // com.vk.music.playlist.display.audiobook.offline.presentation.feature.OfflineAudioBookChaptersMviState
        public final AudioBook o() {
            return this.b;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Content(audioBook=");
            sb.append(this.b);
            sb.append(", downloadStates=");
            return cjl0.a(sb, this.c, ')');
        }

        @Override // com.vk.music.playlist.display.audiobook.offline.presentation.feature.OfflineAudioBookChaptersMviState
        public final Map<String, DownloadingState> u() {
            return this.c;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.b, i);
            Map<String, DownloadingState> map = this.c;
            parcel.writeInt(map.size());
            for (Map.Entry<String, DownloadingState> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeParcelable(entry.getValue(), i);
            }
        }
    }

    public /* synthetic */ OfflineAudioBookChaptersMviState(zcl zclVar) {
        this();
    }

    public abstract Content a(AudioBook audioBook);

    public abstract OfflineAudioBookChaptersMviState j(Map<String, ? extends DownloadingState> map);

    public abstract AudioBook o();

    public abstract Map<String, DownloadingState> u();

    /* compiled from: OfflineAudioBookChaptersMviState.kt */
    public static final class Loading extends OfflineAudioBookChaptersMviState {
        public static final Parcelable.Creator<Loading> CREATOR = new a();
        public final String b;
        public final Map<String, DownloadingState> c;

        /* compiled from: OfflineAudioBookChaptersMviState.kt */
        public static final class a implements Parcelable.Creator<Loading> {
            @Override // android.os.Parcelable.Creator
            public final Loading createFromParcel(Parcel parcel) {
                String readString = parcel.readString();
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
                for (int i = 0; i != readInt; i++) {
                    linkedHashMap.put(parcel.readString(), parcel.readParcelable(Loading.class.getClassLoader()));
                }
                return new Loading(readString, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final Loading[] newArray(int i) {
                return new Loading[i];
            }
        }

        public /* synthetic */ Loading(String str, Map map, int i, zcl zclVar) {
            this(str, (i & 2) != 0 ? jgp.b : map);
        }

        @Override // com.vk.music.playlist.display.audiobook.offline.presentation.feature.OfflineAudioBookChaptersMviState
        public final Content a(AudioBook audioBook) {
            return new Content(audioBook, this.c);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loading)) {
                return false;
            }
            Loading loading = (Loading) obj;
            return epx.f(this.b, loading.b) && epx.f(this.c, loading.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        @Override // com.vk.music.playlist.display.audiobook.offline.presentation.feature.OfflineAudioBookChaptersMviState
        public final OfflineAudioBookChaptersMviState j(Map<String, ? extends DownloadingState> map) {
            return new Loading(this.b, map);
        }

        @Override // com.vk.music.playlist.display.audiobook.offline.presentation.feature.OfflineAudioBookChaptersMviState
        public final AudioBook o() {
            return null;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Loading(audioBookTitle=");
            sb.append(this.b);
            sb.append(", downloadStates=");
            return cjl0.a(sb, this.c, ')');
        }

        @Override // com.vk.music.playlist.display.audiobook.offline.presentation.feature.OfflineAudioBookChaptersMviState
        public final Map<String, DownloadingState> u() {
            return this.c;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
            Map<String, DownloadingState> map = this.c;
            parcel.writeInt(map.size());
            for (Map.Entry<String, DownloadingState> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeParcelable(entry.getValue(), i);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Loading(String str, Map<String, ? extends DownloadingState> map) {
            super(null);
            this.b = str;
            this.c = map;
        }
    }

    public OfflineAudioBookChaptersMviState() {
    }
}
