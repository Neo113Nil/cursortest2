package com.vk.music.podcast.impl.ui.offlinepage.presentation.feature;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.music.MusicTrack;
import com.vk.music.offline.api.model.OfflineEntitySortType;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import xsna.ao;
import xsna.asp;
import xsna.bo;
import xsna.epx;
import xsna.fw3;
import xsna.jgp;
import xsna.lm50;
import xsna.v11;
import xsna.zcl;
import xsna.zrp;

/* compiled from: OfflinePodcastEpisodesMviState.kt */
/* loaded from: classes3.dex */
public abstract class OfflinePodcastEpisodesMviState implements lm50, Parcelable {

    /* compiled from: OfflinePodcastEpisodesMviState.kt */
    public static final class Content extends OfflinePodcastEpisodesMviState {
        public static final Parcelable.Creator<Content> CREATOR = new a();
        public final String b;
        public final List<MusicTrack> c;
        public final Map<String, DownloadingState> d;
        public final SortType e;

        /* compiled from: OfflinePodcastEpisodesMviState.kt */
        public static final class a implements Parcelable.Creator<Content> {
            @Override // android.os.Parcelable.Creator
            public final Content createFromParcel(Parcel parcel) {
                String readString = parcel.readString();
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(Content.class, parcel, arrayList, i, 1);
                }
                int readInt2 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(readInt2);
                for (int i2 = 0; i2 != readInt2; i2++) {
                    linkedHashMap.put(parcel.readString(), parcel.readParcelable(Content.class.getClassLoader()));
                }
                return new Content(readString, arrayList, linkedHashMap, SortType.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Content[] newArray(int i) {
                return new Content[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Content(String str, List<MusicTrack> list, Map<String, ? extends DownloadingState> map, SortType sortType) {
            super(null);
            this.b = str;
            this.c = list;
            this.d = map;
            this.e = sortType;
        }

        public static Content u(Content content, List list, Map map, SortType sortType, int i) {
            String str = content.b;
            if ((i & 2) != 0) {
                list = content.c;
            }
            if ((i & 8) != 0) {
                sortType = content.e;
            }
            return new Content(str, list, map, sortType);
        }

        @Override // com.vk.music.podcast.impl.ui.offlinepage.presentation.feature.OfflinePodcastEpisodesMviState
        public final Content a(List list, SortType sortType) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                linkedHashSet.add(((MusicTrack) it.next()).Fb());
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, DownloadingState> entry : this.d.entrySet()) {
                if (linkedHashSet.contains(entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            return u(this, list, linkedHashMap, sortType, 1);
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
            return epx.f(this.b, content.b) && epx.f(this.c, content.c) && epx.f(this.d, content.d) && this.e == content.e;
        }

        @Override // com.vk.music.podcast.impl.ui.offlinepage.presentation.feature.OfflinePodcastEpisodesMviState
        public final SortType f() {
            return this.e;
        }

        public final int hashCode() {
            return this.e.hashCode() + v11.a(fw3.a(this.b.hashCode() * 31, 31, this.c), 31, this.d);
        }

        @Override // com.vk.music.podcast.impl.ui.offlinepage.presentation.feature.OfflinePodcastEpisodesMviState
        public final OfflinePodcastEpisodesMviState j(Map<String, ? extends DownloadingState> map) {
            return u(this, null, map, null, 11);
        }

        @Override // com.vk.music.podcast.impl.ui.offlinepage.presentation.feature.OfflinePodcastEpisodesMviState
        public final Map<String, DownloadingState> o() {
            return this.d;
        }

        public final String toString() {
            return "Content(podcastTitle=" + this.b + ", episodes=" + this.c + ", downloadStates=" + this.d + ", selectedSortType=" + this.e + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
            Iterator a2 = ao.a(parcel, this.c);
            while (a2.hasNext()) {
                parcel.writeParcelable((Parcelable) a2.next(), i);
            }
            Map<String, DownloadingState> map = this.d;
            parcel.writeInt(map.size());
            for (Map.Entry<String, DownloadingState> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeParcelable(entry.getValue(), i);
            }
            parcel.writeString(this.e.name());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: OfflinePodcastEpisodesMviState.kt */
    public static final class SortType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SortType[] $VALUES;
        public static final SortType ByTitle;
        public static final SortType Default;
        public static final SortType OlderFirst;
        private final OfflineEntitySortType entitySortType;
        private final int titleRes;

        static {
            SortType sortType = new SortType("Default", 0, R.string.catalog_offline_new_replacement, OfflineEntitySortType.NewerFirst);
            Default = sortType;
            SortType sortType2 = new SortType("OlderFirst", 1, R.string.catalog_offline_old_replacement, OfflineEntitySortType.OlderFirst);
            OlderFirst = sortType2;
            SortType sortType3 = new SortType("ByTitle", 2, R.string.catalog_offline_name_replacement, OfflineEntitySortType.ByTitle);
            ByTitle = sortType3;
            SortType[] sortTypeArr = {sortType, sortType2, sortType3};
            $VALUES = sortTypeArr;
            $ENTRIES = new asp(sortTypeArr);
        }

        public SortType(String str, int i, int i2, OfflineEntitySortType offlineEntitySortType) {
            this.titleRes = i2;
            this.entitySortType = offlineEntitySortType;
        }

        public static zrp<SortType> i() {
            return $ENTRIES;
        }

        public static SortType valueOf(String str) {
            return (SortType) Enum.valueOf(SortType.class, str);
        }

        public static SortType[] values() {
            return (SortType[]) $VALUES.clone();
        }

        public final OfflineEntitySortType h() {
            return this.entitySortType;
        }

        public final int j() {
            return this.titleRes;
        }
    }

    public /* synthetic */ OfflinePodcastEpisodesMviState(zcl zclVar) {
        this();
    }

    public abstract Content a(List list, SortType sortType);

    public abstract SortType f();

    public abstract OfflinePodcastEpisodesMviState j(Map<String, ? extends DownloadingState> map);

    public abstract Map<String, DownloadingState> o();

    public OfflinePodcastEpisodesMviState() {
    }

    /* compiled from: OfflinePodcastEpisodesMviState.kt */
    public static final class Loading extends OfflinePodcastEpisodesMviState {
        public static final Parcelable.Creator<Loading> CREATOR = new a();
        public final String b;
        public final Map<String, DownloadingState> c;
        public final SortType d;

        /* compiled from: OfflinePodcastEpisodesMviState.kt */
        public static final class a implements Parcelable.Creator<Loading> {
            @Override // android.os.Parcelable.Creator
            public final Loading createFromParcel(Parcel parcel) {
                String readString = parcel.readString();
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
                for (int i = 0; i != readInt; i++) {
                    linkedHashMap.put(parcel.readString(), parcel.readParcelable(Loading.class.getClassLoader()));
                }
                return new Loading(readString, linkedHashMap, SortType.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Loading[] newArray(int i) {
                return new Loading[i];
            }
        }

        public /* synthetic */ Loading(String str, Map map, SortType sortType, int i, zcl zclVar) {
            this(str, (i & 2) != 0 ? jgp.b : map, (i & 4) != 0 ? SortType.Default : sortType);
        }

        @Override // com.vk.music.podcast.impl.ui.offlinepage.presentation.feature.OfflinePodcastEpisodesMviState
        public final Content a(List list, SortType sortType) {
            return new Content(this.b, EmptyList.b, this.c, this.d).a(list, sortType);
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
            return epx.f(this.b, loading.b) && epx.f(this.c, loading.c) && this.d == loading.d;
        }

        @Override // com.vk.music.podcast.impl.ui.offlinepage.presentation.feature.OfflinePodcastEpisodesMviState
        public final SortType f() {
            return this.d;
        }

        public final int hashCode() {
            return this.d.hashCode() + v11.a(this.b.hashCode() * 31, 31, this.c);
        }

        @Override // com.vk.music.podcast.impl.ui.offlinepage.presentation.feature.OfflinePodcastEpisodesMviState
        public final OfflinePodcastEpisodesMviState j(Map<String, ? extends DownloadingState> map) {
            return new Loading(this.b, map, this.d);
        }

        @Override // com.vk.music.podcast.impl.ui.offlinepage.presentation.feature.OfflinePodcastEpisodesMviState
        public final Map<String, DownloadingState> o() {
            return this.c;
        }

        public final String toString() {
            return "Loading(podcastTitle=" + this.b + ", downloadStates=" + this.c + ", selectedSortType=" + this.d + ')';
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
            parcel.writeString(this.d.name());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Loading(String str, Map<String, ? extends DownloadingState> map, SortType sortType) {
            super(null);
            this.b = str;
            this.c = map;
            this.d = sortType;
        }
    }
}
