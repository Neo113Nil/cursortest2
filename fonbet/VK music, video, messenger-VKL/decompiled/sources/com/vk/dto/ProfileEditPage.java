package com.vk.dto;

import xsna.asp;
import xsna.jgp;
import xsna.zrp;

/* compiled from: ProfileEditPage.kt */
/* loaded from: classes18.dex */
public abstract class ProfileEditPage {
    public final String a;

    /* compiled from: ProfileEditPage.kt */
    public static final class PersonalAccount extends ProfileEditPage {
        public final Tab b;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ProfileEditPage.kt */
        public static final class Tab {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ Tab[] $VALUES;
            public static final Tab PERSONAL;
            public static final Tab SECURITY;
            private final String flowService;

            static {
                Tab tab = new Tab("PERSONAL", 0, "vkcom_edit_personal");
                PERSONAL = tab;
                Tab tab2 = new Tab("SECURITY", 1, "vkcom_edit_security");
                SECURITY = tab2;
                Tab[] tabArr = {tab, tab2};
                $VALUES = tabArr;
                $ENTRIES = new asp(tabArr);
            }

            public Tab(String str, int i, String str2) {
                this.flowService = str2;
            }

            public static Tab valueOf(String str) {
                return (Tab) Enum.valueOf(Tab.class, str);
            }

            public static Tab[] values() {
                return (Tab[]) $VALUES.clone();
            }

            public final String h() {
                return this.flowService;
            }
        }

        public PersonalAccount(Tab tab) {
            super("personalAccount");
            this.b = tab;
        }
    }

    /* compiled from: ProfileEditPage.kt */
    public static final class a extends ProfileEditPage {
        public static final a b = new a("career");
    }

    /* compiled from: ProfileEditPage.kt */
    public static final class b extends ProfileEditPage {
        public static final b b = new b("contacts");
    }

    /* compiled from: ProfileEditPage.kt */
    public static final class c extends ProfileEditPage {
        @Override // com.vk.dto.ProfileEditPage
        public final jgp a() {
            return jgp.b;
        }
    }

    /* compiled from: ProfileEditPage.kt */
    public static final class d extends ProfileEditPage {
        public static final d b = new d("interests");
    }

    /* compiled from: ProfileEditPage.kt */
    public static final class e extends ProfileEditPage {
        public static final e b = new e("military");
    }

    /* compiled from: ProfileEditPage.kt */
    public static final class f extends ProfileEditPage {
        public static final f b = new f("personal");
    }

    /* compiled from: ProfileEditPage.kt */
    public static final class g extends ProfileEditPage {
        public static final g b = new g("general");
    }

    public ProfileEditPage(String str) {
        this.a = str;
    }

    public jgp a() {
        return jgp.b;
    }
}
