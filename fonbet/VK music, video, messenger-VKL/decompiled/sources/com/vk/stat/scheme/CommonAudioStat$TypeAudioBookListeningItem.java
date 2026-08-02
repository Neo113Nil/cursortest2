package com.vk.stat.scheme;

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
import xsna.uqi;
import xsna.x9y;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CommonAudioStat.kt */
/* loaded from: classes11.dex */
public final class CommonAudioStat$TypeAudioBookListeningItem {
    public final transient String a;

    @pmi0("book_id")
    private final int bookId;

    @pmi0("content_type")
    private final ContentType contentType;

    @pmi0("duration")
    private final Integer duration;

    @pmi0("chapter_id")
    private final FilteredString filteredChapterId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonAudioStat.kt */
    /* loaded from: classes5.dex */
    public static final class ContentType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ContentType[] $VALUES;

        @pmi0("audiobook_chapter")
        public static final ContentType AUDIOBOOK_CHAPTER;

        static {
            ContentType contentType = new ContentType("AUDIOBOOK_CHAPTER", 0);
            AUDIOBOOK_CHAPTER = contentType;
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
    public static final class PersistenceSerializer implements uay<CommonAudioStat$TypeAudioBookListeningItem>, a9y<CommonAudioStat$TypeAudioBookListeningItem> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            return new CommonAudioStat$TypeAudioBookListeningItem(fai.p(x9yVar, "book_id"), (ContentType) dq.f(x9yVar, "content_type", tru.a(), ContentType.class), fai.C(x9yVar, "chapter_id"), fai.A(x9yVar, "duration"));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            CommonAudioStat$TypeAudioBookListeningItem commonAudioStat$TypeAudioBookListeningItem = (CommonAudioStat$TypeAudioBookListeningItem) obj;
            x9y x9yVar = new x9y();
            x9yVar.n("book_id", Integer.valueOf(commonAudioStat$TypeAudioBookListeningItem.a()));
            x9yVar.o("content_type", tru.a().toJson(commonAudioStat$TypeAudioBookListeningItem.b()));
            x9yVar.o("chapter_id", commonAudioStat$TypeAudioBookListeningItem.a);
            x9yVar.n("duration", commonAudioStat$TypeAudioBookListeningItem.c());
            return x9yVar;
        }
    }

    public CommonAudioStat$TypeAudioBookListeningItem(int i, ContentType contentType, String str, Integer num) {
        this.bookId = i;
        this.contentType = contentType;
        this.a = str;
        this.duration = num;
        FilteredString filteredString = new FilteredString(lhg.b(20));
        this.filteredChapterId = filteredString;
        filteredString.a(str);
    }

    public final int a() {
        return this.bookId;
    }

    public final ContentType b() {
        return this.contentType;
    }

    public final Integer c() {
        return this.duration;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonAudioStat$TypeAudioBookListeningItem)) {
            return false;
        }
        CommonAudioStat$TypeAudioBookListeningItem commonAudioStat$TypeAudioBookListeningItem = (CommonAudioStat$TypeAudioBookListeningItem) obj;
        return this.bookId == commonAudioStat$TypeAudioBookListeningItem.bookId && this.contentType == commonAudioStat$TypeAudioBookListeningItem.contentType && epx.f(this.a, commonAudioStat$TypeAudioBookListeningItem.a) && epx.f(this.duration, commonAudioStat$TypeAudioBookListeningItem.duration);
    }

    public final int hashCode() {
        int hashCode = (this.contentType.hashCode() + (Integer.hashCode(this.bookId) * 31)) * 31;
        String str = this.a;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.duration;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeAudioBookListeningItem(bookId=");
        sb.append(this.bookId);
        sb.append(", contentType=");
        sb.append(this.contentType);
        sb.append(", chapterId=");
        sb.append(this.a);
        sb.append(", duration=");
        return uqi.b(sb, this.duration, ')');
    }

    public /* synthetic */ CommonAudioStat$TypeAudioBookListeningItem(int i, ContentType contentType, String str, Integer num, int i2, zcl zclVar) {
        this(i, contentType, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? null : num);
    }
}
