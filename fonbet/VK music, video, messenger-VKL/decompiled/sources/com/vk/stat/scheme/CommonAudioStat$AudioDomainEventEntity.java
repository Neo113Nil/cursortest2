package com.vk.stat.scheme;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.dq;
import xsna.epx;
import xsna.fai;
import xsna.ho8;
import xsna.lhg;
import xsna.pmi0;
import xsna.tay;
import xsna.tru;
import xsna.uay;
import xsna.x9y;
import xsna.z8y;
import xsna.zrp;

/* compiled from: CommonAudioStat.kt */
/* loaded from: classes11.dex */
public final class CommonAudioStat$AudioDomainEventEntity {
    public final transient String a;

    @pmi0("id")
    private final FilteredString filteredId;

    @pmi0("type")
    private final Type type;

    /* compiled from: CommonAudioStat.kt */
    public static final class PersistenceSerializer implements uay<CommonAudioStat$AudioDomainEventEntity>, a9y<CommonAudioStat$AudioDomainEventEntity> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            return new CommonAudioStat$AudioDomainEventEntity((Type) dq.f(x9yVar, "type", tru.a(), Type.class), fai.s(x9yVar, "id"));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            CommonAudioStat$AudioDomainEventEntity commonAudioStat$AudioDomainEventEntity = (CommonAudioStat$AudioDomainEventEntity) obj;
            x9y x9yVar = new x9y();
            x9yVar.o("type", tru.a().toJson(commonAudioStat$AudioDomainEventEntity.a()));
            x9yVar.o("id", commonAudioStat$AudioDomainEventEntity.a);
            return x9yVar;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonAudioStat.kt */
    /* loaded from: classes5.dex */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0("advertisement")
        public static final Type ADVERTISEMENT;

        @pmi0("artist")
        public static final Type ARTIST;

        @pmi0("audio")
        public static final Type AUDIO;

        @pmi0("banner")
        public static final Type BANNER;

        @pmi0("book")
        public static final Type BOOK;

        @pmi0("playlist")
        public static final Type PLAYLIST;

        @pmi0("podcast")
        public static final Type PODCAST;

        @pmi0("radio")
        public static final Type RADIO;

        static {
            Type type = new Type("BANNER", 0);
            BANNER = type;
            Type type2 = new Type(SignalingProtocol.MEDIA_OPTION_AUDIO, 1);
            AUDIO = type2;
            Type type3 = new Type("ARTIST", 2);
            ARTIST = type3;
            Type type4 = new Type("PODCAST", 3);
            PODCAST = type4;
            Type type5 = new Type("BOOK", 4);
            BOOK = type5;
            Type type6 = new Type("RADIO", 5);
            RADIO = type6;
            Type type7 = new Type("PLAYLIST", 6);
            PLAYLIST = type7;
            Type type8 = new Type("ADVERTISEMENT", 7);
            ADVERTISEMENT = type8;
            Type[] typeArr = {type, type2, type3, type4, type5, type6, type7, type8};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
        }

        private Type(String str, int i) {
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public CommonAudioStat$AudioDomainEventEntity(Type type, String str) {
        this.type = type;
        this.a = str;
        FilteredString filteredString = new FilteredString(lhg.b(256));
        this.filteredId = filteredString;
        filteredString.a(str);
    }

    public final Type a() {
        return this.type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonAudioStat$AudioDomainEventEntity)) {
            return false;
        }
        CommonAudioStat$AudioDomainEventEntity commonAudioStat$AudioDomainEventEntity = (CommonAudioStat$AudioDomainEventEntity) obj;
        return this.type == commonAudioStat$AudioDomainEventEntity.type && epx.f(this.a, commonAudioStat$AudioDomainEventEntity.a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.type.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioDomainEventEntity(type=");
        sb.append(this.type);
        sb.append(", id=");
        return ho8.a(sb, this.a, ')');
    }
}
