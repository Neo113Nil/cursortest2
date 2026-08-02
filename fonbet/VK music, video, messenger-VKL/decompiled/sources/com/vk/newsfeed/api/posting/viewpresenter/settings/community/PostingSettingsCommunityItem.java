package com.vk.newsfeed.api.posting.viewpresenter.settings.community;

import com.vk.dto.posting.DonutPostingSettings;
import com.vk.newsfeed.api.posting.viewpresenter.settings.community.DonutSettingsDialogConfig;
import defpackage.q0;
import java.util.Date;
import xsna.asp;
import xsna.epx;
import xsna.qoy;
import xsna.zif0;
import xsna.zrp;

/* compiled from: PostingSettingsCommunityItem.kt */
/* loaded from: classes3.dex */
public abstract class PostingSettingsCommunityItem extends zif0 {
    public final boolean a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PostingSettingsCommunityItem.kt */
    public static final class ViewType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ViewType[] $VALUES;
        public static final ViewType AuthorSign;
        public static final ViewType Donut;
        public static final ViewType Postpone;
        public static final ViewType Settings;

        static {
            ViewType viewType = new ViewType("Settings", 0);
            Settings = viewType;
            ViewType viewType2 = new ViewType("Postpone", 1);
            Postpone = viewType2;
            ViewType viewType3 = new ViewType("AuthorSign", 2);
            AuthorSign = viewType3;
            ViewType viewType4 = new ViewType("Donut", 3);
            Donut = viewType4;
            ViewType[] viewTypeArr = {viewType, viewType2, viewType3, viewType4};
            $VALUES = viewTypeArr;
            $ENTRIES = new asp(viewTypeArr);
        }

        public ViewType() {
            throw null;
        }

        public static ViewType valueOf(String str) {
            return (ViewType) Enum.valueOf(ViewType.class, str);
        }

        public static ViewType[] values() {
            return (ViewType[]) $VALUES.clone();
        }
    }

    /* compiled from: PostingSettingsCommunityItem.kt */
    public static final class a extends PostingSettingsCommunityItem {
        public final boolean b;
        public final boolean c;
        public final boolean d;

        public a() {
            this(0);
        }

        public static a d(a aVar, boolean z, boolean z2, boolean z3, int i) {
            if ((i & 1) != 0) {
                z = aVar.b;
            }
            if ((i & 2) != 0) {
                z2 = aVar.c;
            }
            if ((i & 4) != 0) {
                z3 = aVar.d;
            }
            aVar.getClass();
            return new a(z, z2, z3);
        }

        @Override // xsna.zif0
        public final int b() {
            return ViewType.AuthorSign.ordinal();
        }

        @Override // com.vk.newsfeed.api.posting.viewpresenter.settings.community.PostingSettingsCommunityItem
        public final boolean c() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.b == aVar.b && this.c == aVar.c && this.d == aVar.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + qoy.b(Boolean.hashCode(this.b) * 31, 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AuthorSignInfo(isEnabled=");
            sb.append(this.b);
            sb.append(", isForbidden=");
            sb.append(this.c);
            sb.append(", isAllowed=");
            return q0.a(sb, this.d, ')');
        }

        public /* synthetic */ a(int i) {
            this(false, false, true);
        }

        public a(boolean z, boolean z2, boolean z3) {
            super(z3);
            this.b = z;
            this.c = z2;
            this.d = z3;
        }
    }

    /* compiled from: PostingSettingsCommunityItem.kt */
    public static final class b extends PostingSettingsCommunityItem {
        public final DonutSettingsDialogConfig.Mode b;
        public final DonutPostingSettings.Duration c;
        public final boolean d;
        public final boolean e;
        public final boolean f;

        public b() {
            this(0);
        }

        public static b d(b bVar, DonutSettingsDialogConfig.Mode mode, DonutPostingSettings.Duration duration, boolean z, boolean z2, boolean z3, int i) {
            if ((i & 1) != 0) {
                mode = bVar.b;
            }
            DonutSettingsDialogConfig.Mode mode2 = mode;
            if ((i & 2) != 0) {
                duration = bVar.c;
            }
            DonutPostingSettings.Duration duration2 = duration;
            if ((i & 4) != 0) {
                z = bVar.d;
            }
            boolean z4 = z;
            if ((i & 8) != 0) {
                z2 = bVar.e;
            }
            boolean z5 = z2;
            if ((i & 16) != 0) {
                z3 = bVar.f;
            }
            bVar.getClass();
            return new b(mode2, duration2, z4, z5, z3);
        }

        @Override // xsna.zif0
        public final int b() {
            return ViewType.Donut.ordinal();
        }

        @Override // com.vk.newsfeed.api.posting.viewpresenter.settings.community.PostingSettingsCommunityItem
        public final boolean c() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.b == bVar.b && epx.f(this.c, bVar.c) && this.d == bVar.d && this.e == bVar.e && this.f == bVar.f;
        }

        public final int hashCode() {
            int hashCode = this.b.hashCode() * 31;
            DonutPostingSettings.Duration duration = this.c;
            return Boolean.hashCode(this.f) + qoy.b(qoy.b((hashCode + (duration == null ? 0 : duration.hashCode())) * 31, 31, this.d), 31, this.e);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("DonutInfo(mode=");
            sb.append(this.b);
            sb.append(", paidDuration=");
            sb.append(this.c);
            sb.append(", isAllowed=");
            sb.append(this.d);
            sb.append(", isAllowChangeMode=");
            sb.append(this.e);
            sb.append(", isAllowChangeDuration=");
            return q0.a(sb, this.f, ')');
        }

        public /* synthetic */ b(int i) {
            this(DonutSettingsDialogConfig.Mode.All, null, true, true, true);
        }

        public b(DonutSettingsDialogConfig.Mode mode, DonutPostingSettings.Duration duration, boolean z, boolean z2, boolean z3) {
            super(z);
            this.b = mode;
            this.c = duration;
            this.d = z;
            this.e = z2;
            this.f = z3;
        }
    }

    /* compiled from: PostingSettingsCommunityItem.kt */
    public static final class c extends PostingSettingsCommunityItem {
        public final Date b;
        public final boolean c;

        public c() {
            this(0);
        }

        public static c d(c cVar, Date date, boolean z, int i) {
            if ((i & 1) != 0) {
                date = cVar.b;
            }
            if ((i & 2) != 0) {
                z = cVar.c;
            }
            cVar.getClass();
            return new c(date, z);
        }

        @Override // xsna.zif0
        public final int b() {
            return ViewType.Postpone.ordinal();
        }

        @Override // com.vk.newsfeed.api.posting.viewpresenter.settings.community.PostingSettingsCommunityItem
        public final boolean c() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.b, cVar.b) && this.c == cVar.c;
        }

        public final int hashCode() {
            Date date = this.b;
            return Boolean.hashCode(this.c) + ((date == null ? 0 : date.hashCode()) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PostponeInfo(date=");
            sb.append(this.b);
            sb.append(", isAllowed=");
            return q0.a(sb, this.c, ')');
        }

        public /* synthetic */ c(int i) {
            this(null, true);
        }

        public c(Date date, boolean z) {
            super(z);
            this.b = date;
            this.c = z;
        }
    }

    /* compiled from: PostingSettingsCommunityItem.kt */
    public static final class d extends PostingSettingsCommunityItem {
        public final boolean b;
        public final boolean c;

        public d() {
            this(0);
        }

        @Override // xsna.zif0
        public final int b() {
            return ViewType.Settings.ordinal();
        }

        @Override // com.vk.newsfeed.api.posting.viewpresenter.settings.community.PostingSettingsCommunityItem
        public final boolean c() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.b == dVar.b && this.c == dVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + (Boolean.hashCode(this.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SettingsInfo(isModified=");
            sb.append(this.b);
            sb.append(", isAllowed=");
            return q0.a(sb, this.c, ')');
        }

        public /* synthetic */ d(int i) {
            this(false, true);
        }

        public d(boolean z, boolean z2) {
            super(z2);
            this.b = z;
            this.c = z2;
        }
    }

    public PostingSettingsCommunityItem(boolean z) {
        this.a = z;
    }

    public boolean c() {
        return this.a;
    }
}
