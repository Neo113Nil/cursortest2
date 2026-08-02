package com.vk.stat.scheme;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.dq;
import xsna.epx;
import xsna.fai;
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
public final class CommonAudioStat$TypeAudioAdvListeningItem {
    public final transient String a;

    @pmi0("content_type")
    private final ContentType contentType;

    @pmi0(CommonUrlParts.ADV_ID)
    private final FilteredString filteredAdvId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonAudioStat.kt */
    /* loaded from: classes5.dex */
    public static final class ContentType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ContentType[] $VALUES;

        @pmi0("audio_adv")
        public static final ContentType AUDIO_ADV;

        static {
            ContentType contentType = new ContentType("AUDIO_ADV", 0);
            AUDIO_ADV = contentType;
            ContentType[] contentTypeArr = {contentType};
            $VALUES = contentTypeArr;
            $ENTRIES = new asp(contentTypeArr);
        }

        private ContentType(String str, int i) {
        }

        public static ContentType valueOf(String str) {
            return (ContentType) Enum.valueOf(ContentType.class, str);
        }

        public static ContentType[] values() {
            return (ContentType[]) $VALUES.clone();
        }
    }

    /* compiled from: CommonAudioStat.kt */
    public static final class PersistenceSerializer implements uay<CommonAudioStat$TypeAudioAdvListeningItem>, a9y<CommonAudioStat$TypeAudioAdvListeningItem> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            return new CommonAudioStat$TypeAudioAdvListeningItem(fai.s(x9yVar, CommonUrlParts.ADV_ID), (ContentType) dq.f(x9yVar, "content_type", tru.a(), ContentType.class));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            CommonAudioStat$TypeAudioAdvListeningItem commonAudioStat$TypeAudioAdvListeningItem = (CommonAudioStat$TypeAudioAdvListeningItem) obj;
            x9y x9yVar = new x9y();
            x9yVar.o(CommonUrlParts.ADV_ID, commonAudioStat$TypeAudioAdvListeningItem.a);
            x9yVar.o("content_type", tru.a().toJson(commonAudioStat$TypeAudioAdvListeningItem.a()));
            return x9yVar;
        }
    }

    public CommonAudioStat$TypeAudioAdvListeningItem(String str, ContentType contentType) {
        this.a = str;
        this.contentType = contentType;
        FilteredString filteredString = new FilteredString(lhg.b(256));
        this.filteredAdvId = filteredString;
        filteredString.a(str);
    }

    public final ContentType a() {
        return this.contentType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonAudioStat$TypeAudioAdvListeningItem)) {
            return false;
        }
        CommonAudioStat$TypeAudioAdvListeningItem commonAudioStat$TypeAudioAdvListeningItem = (CommonAudioStat$TypeAudioAdvListeningItem) obj;
        return epx.f(this.a, commonAudioStat$TypeAudioAdvListeningItem.a) && this.contentType == commonAudioStat$TypeAudioAdvListeningItem.contentType;
    }

    public final int hashCode() {
        return this.contentType.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TypeAudioAdvListeningItem(advId=" + this.a + ", contentType=" + this.contentType + ')';
    }
}
