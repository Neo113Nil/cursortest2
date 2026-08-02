package com.vk.profile.core.tabs.state;

import com.vk.core.view.components.button.VkButton;
import com.vk.profile.core.content.ContentTab;
import defpackage.q0;
import xsna.asp;
import xsna.epx;
import xsna.vu5;
import xsna.zrp;

/* compiled from: CommunityProfileContentItem.kt */
/* loaded from: classes5.dex */
public abstract class CommunityProfileContentItem {
    public final ContentTab a;
    public final int b;
    public final b c;
    public final c d;
    public final State e;
    public final d f;
    public final State g;
    public final int h;
    public final e i;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommunityProfileContentItem.kt */
    public static final class ContentType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ContentType[] $VALUES;
        public static final ContentType ALBUMS;
        public static final ContentType ITEMS;
        public static final ContentType MIXED;

        static {
            ContentType contentType = new ContentType("ITEMS", 0);
            ITEMS = contentType;
            ContentType contentType2 = new ContentType("ALBUMS", 1);
            ALBUMS = contentType2;
            ContentType contentType3 = new ContentType("MIXED", 2);
            MIXED = contentType3;
            ContentType[] contentTypeArr = {contentType, contentType2, contentType3};
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

        public final boolean h() {
            return this == ALBUMS;
        }

        public final boolean i() {
            return this == ALBUMS || this == MIXED;
        }

        public final boolean j() {
            return this == ITEMS;
        }

        public final boolean k() {
            return this == ITEMS || this == MIXED;
        }

        public final boolean l() {
            return this == MIXED;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommunityProfileContentItem.kt */
    public static final class State {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State EMPTY;
        public static final State ERROR;
        public static final State INITIAL;
        public static final State LOADED;
        public static final State LOADING;
        public static final State RELOAD;

        static {
            State state = new State("INITIAL", 0);
            INITIAL = state;
            State state2 = new State("EMPTY", 1);
            EMPTY = state2;
            State state3 = new State("ERROR", 2);
            ERROR = state3;
            State state4 = new State("LOADING", 3);
            LOADING = state4;
            State state5 = new State("LOADED", 4);
            LOADED = state5;
            State state6 = new State("RELOAD", 5);
            RELOAD = state6;
            State[] stateArr = {state, state2, state3, state4, state5, state6};
            $VALUES = stateArr;
            $ENTRIES = new asp(stateArr);
        }

        public State() {
            throw null;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }

        public final boolean h() {
            return this == INITIAL || this == LOADED;
        }
    }

    /* compiled from: CommunityProfileContentItem.kt */
    public static final class c {
        public final int a;

        public c(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a == ((c) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("ErrorContent(messageRes="), this.a, ')');
        }
    }

    /* compiled from: CommunityProfileContentItem.kt */
    public static final class d {
        public final com.vk.profile.core.tabs.state.a a;
        public final com.vk.profile.core.tabs.state.b b;
        public final com.vk.profile.core.tabs.state.b c;

        /* JADX WARN: Multi-variable type inference failed */
        public d() {
            this((com.vk.profile.core.tabs.state.a) null, (com.vk.profile.core.tabs.state.b) (0 == true ? 1 : 0), 7);
        }

        public static d a(d dVar, com.vk.profile.core.tabs.state.a aVar) {
            com.vk.profile.core.tabs.state.b bVar = dVar.b;
            com.vk.profile.core.tabs.state.b bVar2 = dVar.c;
            dVar.getClass();
            return new d(aVar, bVar, bVar2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.a, dVar.a) && epx.f(this.b, dVar.b) && epx.f(this.c, dVar.c);
        }

        public final int hashCode() {
            com.vk.profile.core.tabs.state.a aVar = this.a;
            int hashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
            com.vk.profile.core.tabs.state.b bVar = this.b;
            int hashCode2 = (hashCode + (bVar == null ? 0 : Integer.hashCode(bVar.a))) * 31;
            com.vk.profile.core.tabs.state.b bVar2 = this.c;
            return hashCode2 + (bVar2 != null ? Integer.hashCode(bVar2.a) : 0);
        }

        public final String toString() {
            return "FabState(leftButton=" + this.a + ", rightButton=" + this.b + ", growthButton=" + this.c + ')';
        }

        public /* synthetic */ d(com.vk.profile.core.tabs.state.a aVar, com.vk.profile.core.tabs.state.b bVar, int i) {
            this((i & 1) != 0 ? null : aVar, (i & 2) != 0 ? null : bVar, (com.vk.profile.core.tabs.state.b) null);
        }

        public d(com.vk.profile.core.tabs.state.a aVar, com.vk.profile.core.tabs.state.b bVar, com.vk.profile.core.tabs.state.b bVar2) {
            this.a = aVar;
            this.b = bVar;
            this.c = bVar2;
        }
    }

    /* compiled from: CommunityProfileContentItem.kt */
    public static final class e {
        public final String a;
        public final int b;

        public e(String str, int i) {
            this.a = str;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return epx.f(this.a, eVar.a) && this.b == eVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnboardingState(hintId=");
            sb.append(this.a);
            sb.append(", textId=");
            return vu5.b(sb, this.b, ')');
        }
    }

    public CommunityProfileContentItem(ContentTab contentTab, int i, b bVar, c cVar, State state, d dVar, State state2, int i2, e eVar, int i3) {
        eVar = (i3 & 1024) != 0 ? null : eVar;
        this.a = contentTab;
        this.b = i;
        this.c = bVar;
        this.d = cVar;
        this.e = state;
        this.f = dVar;
        this.g = state2;
        this.h = i2;
        this.i = eVar;
    }

    public b a() {
        return this.c;
    }

    public c b() {
        return this.d;
    }

    public d c() {
        return this.f;
    }

    public State d() {
        return this.g;
    }

    public e e() {
        return this.i;
    }

    public State f() {
        return this.e;
    }

    public boolean g() {
        return false;
    }

    public int h() {
        int hashCode = (d().hashCode() + ((f().hashCode() + (this.b * 31)) * 31)) * 31;
        e e2 = e();
        return hashCode + (e2 != null ? e2.hashCode() : 0);
    }

    /* compiled from: CommunityProfileContentItem.kt */
    public static final class a {
        public final VkButton.Size a;
        public final VkButton.Mode b;
        public final VkButton.Appearance c;
        public final boolean d;

        public a(VkButton.Size size, VkButton.Mode mode, VkButton.Appearance appearance, boolean z) {
            this.a = size;
            this.b = mode;
            this.c = appearance;
            this.d = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ButtonStyle(size=");
            sb.append(this.a);
            sb.append(", mode=");
            sb.append(this.b);
            sb.append(", appearance=");
            sb.append(this.c);
            sb.append(", showIcon=");
            return q0.a(sb, this.d, ')');
        }

        public a() {
            this(VkButton.Size.Medium, VkButton.Mode.Primary, VkButton.Appearance.Accent, true);
        }
    }

    /* compiled from: CommunityProfileContentItem.kt */
    public static final class b {
        public final int a;
        public final Integer b;
        public final Integer c;
        public final String d;
        public final a e;

        public b(int i, Integer num, Integer num2, String str, a aVar) {
            this.a = i;
            this.b = num;
            this.c = num2;
            this.d = str;
            this.e = aVar;
        }

        public static b a(b bVar, String str) {
            int i = bVar.a;
            Integer num = bVar.b;
            Integer num2 = bVar.c;
            a aVar = bVar.e;
            bVar.getClass();
            return new b(i, num, num2, str, aVar);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d) && epx.f(this.e, bVar.e);
        }

        public final int hashCode() {
            int hashCode = Integer.hashCode(this.a) * 31;
            Integer num = this.b;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.c;
            int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str = this.d;
            int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            a aVar = this.e;
            return hashCode4 + (aVar != null ? aVar.hashCode() : 0);
        }

        public final String toString() {
            return "EmptyContent(messageRes=" + this.a + ", addMessageRes=" + this.b + ", secondButtonTextResId=" + this.c + ", secondButtonText=" + this.d + ", buttonStyle=" + this.e + ')';
        }

        public /* synthetic */ b(int i, Integer num, Integer num2, String str, a aVar, int i2) {
            this(i, (i2 & 2) != 0 ? null : num, (i2 & 4) != 0 ? null : num2, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? null : aVar);
        }
    }
}
