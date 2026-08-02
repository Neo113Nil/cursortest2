package com.vk.newsfeed.impl.posting.settings.mvi;

import com.vk.posting.domain.PostingMetricsCreationEntryPoint;
import xsna.epx;
import xsna.ho8;
import xsna.vu5;

/* compiled from: PostingSettingsAction.kt */
/* loaded from: classes4.dex */
public abstract class g {

    /* compiled from: PostingSettingsAction.kt */
    public static final class a extends g {
        public final String a;
        public final PostingMetricsCreationEntryPoint b;

        public a(String str, PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint) {
            this.a = str;
            this.b = postingMetricsCreationEntryPoint;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "NavigateAdvertisingOrd(requestParams=" + this.a + ", creationEntryPoint=" + this.b + ')';
        }
    }

    /* compiled from: PostingSettingsAction.kt */
    public static final class b extends g {
        public final PostingSettingsState a;

        public b(PostingSettingsState postingSettingsState) {
            this.a = postingSettingsState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "NavigateBack(state=" + this.a + ')';
        }
    }

    /* compiled from: PostingSettingsAction.kt */
    public static final class c extends g {
        public final long a;

        public c(long j) {
            this.a = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a == ((c) obj).a;
        }

        public final int hashCode() {
            return Long.hashCode(this.a);
        }

        public final String toString() {
            return vu5.a(')', this.a, new StringBuilder("NavigateDateTimeDialog(currentTimestamp="));
        }
    }

    /* compiled from: PostingSettingsAction.kt */
    public static final class d extends g {
        public final int a;

        public d(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.a == ((d) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("NavigatePostponePopup(anchorViewPosition="), this.a, ')');
        }
    }

    /* compiled from: PostingSettingsAction.kt */
    public static final class e extends g {
        public final String a;

        public e(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.a, ((e) obj).a);
        }

        public final int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("NavigateSourceDialog(source="), this.a, ')');
        }
    }

    /* compiled from: PostingSettingsAction.kt */
    public static final class f extends g {
        public final int a;

        public f(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.a == ((f) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("NavigateSourcePopup(anchorViewPosition="), this.a, ')');
        }
    }

    /* compiled from: PostingSettingsAction.kt */
    /* renamed from: com.vk.newsfeed.impl.posting.settings.mvi.g$g, reason: collision with other inner class name */
    public static final class C1391g extends g {
        public static final C1391g a = new C1391g();
    }

    /* compiled from: PostingSettingsAction.kt */
    public static final class h extends g {
        public static final h a = new h();
    }

    /* compiled from: PostingSettingsAction.kt */
    public static final class i extends g {
        public static final i a = new i();
    }

    /* compiled from: PostingSettingsAction.kt */
    public static final class j extends g {
        public static final j a = new j();
    }
}
