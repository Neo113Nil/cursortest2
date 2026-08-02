package com.vk.dto.shortvideo.entries;

import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.user.UserProfile;
import xsna.asp;
import xsna.epx;
import xsna.fkq0;
import xsna.nmv;
import xsna.qoy;
import xsna.urd0;
import xsna.zrp;

/* compiled from: ClipsGridHeaderEntry.kt */
/* loaded from: classes18.dex */
public abstract class ClipsGridHeaderEntry implements nmv {

    /* compiled from: ClipsGridHeaderEntry.kt */
    public static final class Author extends ClipsGridHeaderEntry {
        public final UserId a;
        public final String b;
        public final String c;
        public final boolean d;
        public final ContentType e;
        public final VerifyInfo f;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ClipsGridHeaderEntry.kt */
        public static final class ContentType {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ ContentType[] $VALUES;
            public static final ContentType CHALLENGE;
            public static final ContentType COMPILATION;
            public static final ContentType EFFECT;
            public static final ContentType MASK;

            static {
                ContentType contentType = new ContentType("CHALLENGE", 0);
                CHALLENGE = contentType;
                ContentType contentType2 = new ContentType("MASK", 1);
                MASK = contentType2;
                ContentType contentType3 = new ContentType("EFFECT", 2);
                EFFECT = contentType3;
                ContentType contentType4 = new ContentType("COMPILATION", 3);
                COMPILATION = contentType4;
                ContentType[] contentTypeArr = {contentType, contentType2, contentType3, contentType4};
                $VALUES = contentTypeArr;
                $ENTRIES = new asp(contentTypeArr);
            }

            public ContentType() {
                throw null;
            }

            public static ContentType valueOf(String str) {
                return (ContentType) Enum.valueOf(ContentType.class, str);
            }

            public static ContentType[] values() {
                return (ContentType[]) $VALUES.clone();
            }
        }

        /* compiled from: ClipsGridHeaderEntry.kt */
        public static final class a {
            public static Author a(UserProfile userProfile, Group group, ContentType contentType) {
                boolean z = true;
                if (userProfile != null) {
                    UserId userId = userProfile.c;
                    String str = userProfile.e;
                    String str2 = userProfile.h;
                    int i = userProfile.v;
                    return new Author(userId, str, str2, userId.b <= 0 ? !(i == 0 || i == -1) : !(i == 0 || i == -1), contentType, userProfile.B);
                }
                if (group == null) {
                    return null;
                }
                UserId e = fkq0.e(fkq0.a(group.c));
                String str3 = group.d;
                String str4 = group.e;
                UserId e2 = fkq0.e(fkq0.a(group.c));
                int i2 = group.C;
                if (i2 == -1) {
                    i2 = group.j ? 1 : 0;
                }
                if (e2.b <= 0 ? i2 == 0 || i2 == -1 : i2 == 0 || i2 == -1) {
                    z = false;
                }
                return new Author(e, str3, str4, z, contentType, group.y);
            }
        }

        public Author(UserId userId, String str, String str2, boolean z, ContentType contentType, VerifyInfo verifyInfo) {
            this.a = userId;
            this.b = str;
            this.c = str2;
            this.d = z;
            this.e = contentType;
            this.f = verifyInfo;
        }

        public static Author a(Author author, boolean z) {
            UserId userId = author.a;
            String str = author.b;
            String str2 = author.c;
            ContentType contentType = author.e;
            VerifyInfo verifyInfo = author.f;
            author.getClass();
            return new Author(userId, str, str2, z, contentType, verifyInfo);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Author)) {
                return false;
            }
            Author author = (Author) obj;
            return epx.f(this.a, author.a) && epx.f(this.b, author.b) && epx.f(this.c, author.c) && this.d == author.d && this.e == author.e && epx.f(this.f, author.f);
        }

        public final int hashCode() {
            return this.f.hashCode() + ((this.e.hashCode() + qoy.b(urd0.a(urd0.a(Long.hashCode(this.a.b) * 31, 31, this.b), 31, this.c), 31, this.d)) * 31);
        }

        public final String toString() {
            return "Author(id=" + this.a + ", name=" + this.b + ", picture=" + this.c + ", subscribed=" + this.d + ", contentType=" + this.e + ", verifyInfo=" + this.f + ')';
        }
    }

    /* compiled from: ClipsGridHeaderEntry.kt */
    public static final class a extends ClipsGridHeaderEntry {
        public final MusicTrack a;

        public a(MusicTrack musicTrack) {
            this.a = musicTrack;
        }
    }

    /* compiled from: ClipsGridHeaderEntry.kt */
    public static final class b extends ClipsGridHeaderEntry {
        public final UserId a;

        public b(UserId userId) {
            this.a = userId;
        }
    }

    /* compiled from: ClipsGridHeaderEntry.kt */
    public static final class c extends ClipsGridHeaderEntry {
    }
}
