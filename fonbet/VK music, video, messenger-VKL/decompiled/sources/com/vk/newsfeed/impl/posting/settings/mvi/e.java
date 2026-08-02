package com.vk.newsfeed.impl.posting.settings.mvi;

import com.vk.newsfeed.impl.posting.settings.mvi.PostingSettingsState;
import defpackage.q0;
import xsna.epx;
import xsna.ho8;
import xsna.qoy;
import xsna.uqi;
import xsna.vu5;
import xsna.xl50;

/* compiled from: PostingSettingsPatch.kt */
/* loaded from: classes4.dex */
public abstract class e implements xl50 {

    /* compiled from: PostingSettingsPatch.kt */
    public static final class a extends e {
        public final String b;
        public final boolean c;
        public final String d;

        public a(String str, boolean z, String str2) {
            this.b = str;
            this.c = z;
            this.d = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && this.c == aVar.c && epx.f(this.d, aVar.d);
        }

        public final int hashCode() {
            String str = this.b;
            int b = qoy.b((str == null ? 0 : str.hashCode()) * 31, 31, this.c);
            String str2 = this.d;
            return b + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ChangeAdvertisingOrd(predIdAdvertising=");
            sb.append(this.b);
            sb.append(", isAddAdvertisingOrd=");
            sb.append(this.c);
            sb.append(", erId=");
            return ho8.a(sb, this.d, ')');
        }
    }

    /* compiled from: PostingSettingsPatch.kt */
    public static final class b extends e {
        public final boolean b;

        public b(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.b == ((b) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return q0.a(new StringBuilder("ChangeCommentsState(isEnabled="), this.b, ')');
        }
    }

    /* compiled from: PostingSettingsPatch.kt */
    public static final class c extends e {
        public final PostingSettingsState.CommentsGlobalState b;

        public c(PostingSettingsState.CommentsGlobalState commentsGlobalState) {
            this.b = commentsGlobalState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.b == ((c) obj).b;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "ChangeGlobalCommentPrivacy(commentsGlobalState=" + this.b + ')';
        }
    }

    /* compiled from: PostingSettingsPatch.kt */
    public static final class d extends e {
        public final boolean b;

        public d(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.b == ((d) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return q0.a(new StringBuilder("ChangeHideNameState(needHide="), this.b, ')');
        }
    }

    /* compiled from: PostingSettingsPatch.kt */
    /* renamed from: com.vk.newsfeed.impl.posting.settings.mvi.e$e, reason: collision with other inner class name */
    public static final class C1390e extends e {
        public final boolean b;

        public C1390e(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1390e) && this.b == ((C1390e) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return q0.a(new StringBuilder("ChangeNotificationState(isEnabled="), this.b, ')');
        }
    }

    /* compiled from: PostingSettingsPatch.kt */
    public static final class f extends e {
        public final long b;

        public f(long j) {
            this.b = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.b == ((f) obj).b;
        }

        public final int hashCode() {
            return Long.hashCode(this.b);
        }

        public final String toString() {
            return vu5.a(')', this.b, new StringBuilder("ChangePostingTime(newTimestamp="));
        }
    }

    /* compiled from: PostingSettingsPatch.kt */
    public static final class g extends e {
        public final String b;

        public g(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && epx.f(this.b, ((g) obj).b);
        }

        public final int hashCode() {
            String str = this.b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("ChangeSource(newSource="), this.b, ')');
        }
    }

    /* compiled from: PostingSettingsPatch.kt */
    public static final class h extends e {
        public final int b;
        public final Integer c;

        public h(int i, Integer num) {
            this.b = i;
            this.c = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return this.b == hVar.b && epx.f(this.c, hVar.c);
        }

        public final int hashCode() {
            int hashCode = Integer.hashCode(this.b) * 31;
            Integer num = this.c;
            return hashCode + (num == null ? 0 : num.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("InitCommentPrivacy(wallState=");
            sb.append(this.b);
            sb.append(", repliesState=");
            return uqi.b(sb, this.c, ')');
        }
    }

    /* compiled from: PostingSettingsPatch.kt */
    public static final class i extends e {
        public static final i b = new i();
    }
}
