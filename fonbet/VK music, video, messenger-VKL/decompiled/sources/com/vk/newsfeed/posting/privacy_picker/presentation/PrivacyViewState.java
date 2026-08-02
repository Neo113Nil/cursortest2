package com.vk.newsfeed.posting.privacy_picker.presentation;

import com.vk.newsfeed.posting.impl.presentation.model.DonutLevel;
import com.vk.newsfeed.posting.privacy_picker.model.PrivacyPostType;
import defpackage.q0;
import io.reactivex.rxjava3.internal.operators.mixed.j;
import java.util.ArrayList;
import java.util.Date;
import xsna.asp;
import xsna.epx;
import xsna.lcd0;
import xsna.qoy;
import xsna.tn;
import xsna.zrp;

/* compiled from: PrivacySettingsViewState.kt */
/* loaded from: classes4.dex */
public final class PrivacyViewState {
    public final Type a;
    public final a b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PrivacySettingsViewState.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type Dons;
        public static final Type Privacy;
        public static final Type PrivacyAndDons;

        static {
            Type type = new Type("Privacy", 0);
            Privacy = type;
            Type type2 = new Type("PrivacyAndDons", 1);
            PrivacyAndDons = type2;
            Type type3 = new Type("Dons", 2);
            Dons = type3;
            Type[] typeArr = {type, type2, type3};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    /* compiled from: PrivacySettingsViewState.kt */
    public interface a {

        /* compiled from: PrivacySettingsViewState.kt */
        /* renamed from: com.vk.newsfeed.posting.privacy_picker.presentation.PrivacyViewState$a$a, reason: collision with other inner class name */
        public static final class C1434a implements a {
            public final ArrayList a;
            public final b b;

            public C1434a(ArrayList arrayList, b bVar) {
                this.a = arrayList;
                this.b = bVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1434a)) {
                    return false;
                }
                C1434a c1434a = (C1434a) obj;
                return this.a.equals(c1434a.a) && this.b.equals(c1434a.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "Blocks(privacyTypes=" + this.a + ", donutWithoutAccess=" + this.b + ')';
            }
        }

        /* compiled from: PrivacySettingsViewState.kt */
        public static final class b implements a {
            public final DonutLevel a;
            public final boolean b;
            public final b c;

            public b(DonutLevel donutLevel, boolean z, b bVar) {
                this.a = donutLevel;
                this.b = z;
                this.c = bVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.a, bVar.a) && this.b == bVar.b && epx.f(this.c, bVar.c);
            }

            public final int hashCode() {
                DonutLevel donutLevel = this.a;
                return this.c.hashCode() + qoy.b((donutLevel == null ? 0 : donutLevel.hashCode()) * 31, 31, this.b);
            }

            public final String toString() {
                return "OnlyDonut(selectedDonutLevel=" + this.a + ", canSelectAnotherLevel=" + this.b + ", donutWithoutAccess=" + this.c + ')';
            }
        }

        /* compiled from: PrivacySettingsViewState.kt */
        public static final class c implements a {
            public final ArrayList a;

            public c(ArrayList arrayList) {
                this.a = arrayList;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && this.a.equals(((c) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return j.b(')', new StringBuilder("OnlyPrivacyTypes(privacyTypes="), this.a);
            }
        }
    }

    /* compiled from: PrivacySettingsViewState.kt */
    public static final class b {
        public final Date a;
        public final a b;

        /* compiled from: PrivacySettingsViewState.kt */
        public static final class a {
            public final String a;
            public final boolean b;

            public a(String str, boolean z) {
                this.a = str;
                this.b = z;
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
                String str = this.a;
                return Boolean.hashCode(this.b) + ((str == null ? 0 : str.hashCode()) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Teaser(customText=");
                sb.append(this.a);
                sb.append(", isHighlighted=");
                return q0.a(sb, this.b, ')');
            }
        }

        public b(Date date, a aVar) {
            this.a = date;
            this.b = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
        }

        public final int hashCode() {
            Date date = this.a;
            return this.b.hashCode() + ((date == null ? 0 : date.hashCode()) * 31);
        }

        public final String toString() {
            return "DonutWithoutAccess(openForAllDate=" + this.a + ", teaser=" + this.b + ')';
        }
    }

    /* compiled from: PrivacySettingsViewState.kt */
    public static abstract class c {
        public final PrivacyPostType a;
        public final boolean b;
        public final Boolean c;

        /* compiled from: PrivacySettingsViewState.kt */
        public static final class a extends c {
            public final Boolean d;

            public a() {
                this(null);
            }

            @Override // com.vk.newsfeed.posting.privacy_picker.presentation.PrivacyViewState.c
            public final Boolean b() {
                return this.d;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.d, ((a) obj).d);
            }

            public final int hashCode() {
                Boolean bool = this.d;
                if (bool == null) {
                    return 0;
                }
                return bool.hashCode();
            }

            public final String toString() {
                return tn.a(new StringBuilder("All(isSelected="), this.d, ')');
            }

            public a(Boolean bool) {
                super(PrivacyPostType.AllUsers.b, false, bool);
                this.d = bool;
            }
        }

        /* compiled from: PrivacySettingsViewState.kt */
        public static final class b extends c {
            public final Boolean d;
            public final lcd0 e;

            public b(Boolean bool, lcd0 lcd0Var) {
                super(PrivacyPostType.BestFriends.b, lcd0Var == null, bool);
                this.d = bool;
                this.e = lcd0Var;
            }

            @Override // com.vk.newsfeed.posting.privacy_picker.presentation.PrivacyViewState.c
            public final Boolean b() {
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
                return epx.f(this.d, bVar.d) && epx.f(this.e, bVar.e);
            }

            public final int hashCode() {
                Boolean bool = this.d;
                int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
                lcd0 lcd0Var = this.e;
                return hashCode + (lcd0Var != null ? lcd0Var.hashCode() : 0);
            }

            public final String toString() {
                return "BestFriends(isSelected=" + this.d + ", bestFriends=" + this.e + ')';
            }
        }

        /* compiled from: PrivacySettingsViewState.kt */
        /* renamed from: com.vk.newsfeed.posting.privacy_picker.presentation.PrivacyViewState$c$c, reason: collision with other inner class name */
        public static final class C1435c extends c {
            public final Boolean d;
            public final boolean e;
            public final DonutLevel f;

            public C1435c(Boolean bool, boolean z, DonutLevel donutLevel) {
                super(new PrivacyPostType.SingleDonutLevel(donutLevel), z, bool);
                this.d = bool;
                this.e = z;
                this.f = donutLevel;
            }

            @Override // com.vk.newsfeed.posting.privacy_picker.presentation.PrivacyViewState.c
            public final boolean a() {
                return this.e;
            }

            @Override // com.vk.newsfeed.posting.privacy_picker.presentation.PrivacyViewState.c
            public final Boolean b() {
                return this.d;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1435c)) {
                    return false;
                }
                C1435c c1435c = (C1435c) obj;
                return epx.f(this.d, c1435c.d) && this.e == c1435c.e && epx.f(this.f, c1435c.f);
            }

            public final int hashCode() {
                Boolean bool = this.d;
                int b = qoy.b((bool == null ? 0 : bool.hashCode()) * 31, 31, this.e);
                DonutLevel donutLevel = this.f;
                return b + (donutLevel != null ? donutLevel.hashCode() : 0);
            }

            public final String toString() {
                return "DonutLevel(isSelected=" + this.d + ", isComplex=" + this.e + ", level=" + this.f + ')';
            }
        }

        /* compiled from: PrivacySettingsViewState.kt */
        public static final class d extends c {
            public final Boolean d;

            public d() {
                this(null);
            }

            @Override // com.vk.newsfeed.posting.privacy_picker.presentation.PrivacyViewState.c
            public final Boolean b() {
                return this.d;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && epx.f(this.d, ((d) obj).d);
            }

            public final int hashCode() {
                Boolean bool = this.d;
                if (bool == null) {
                    return 0;
                }
                return bool.hashCode();
            }

            public final String toString() {
                return tn.a(new StringBuilder("Friends(isSelected="), this.d, ')');
            }

            public d(Boolean bool) {
                super(PrivacyPostType.FriendsOnly.b, false, bool);
                this.d = bool;
            }
        }

        public c(PrivacyPostType privacyPostType, boolean z, Boolean bool) {
            this.a = privacyPostType;
            this.b = z;
            this.c = bool;
        }

        public boolean a() {
            return this.b;
        }

        public Boolean b() {
            return this.c;
        }
    }

    public PrivacyViewState(Type type, a aVar) {
        this.a = type;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrivacyViewState)) {
            return false;
        }
        PrivacyViewState privacyViewState = (PrivacyViewState) obj;
        return this.a == privacyViewState.a && this.b.equals(privacyViewState.b);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PrivacyViewState(type=" + this.a + ", content=" + this.b + ", hasDoneButton=false)";
    }
}
