package com.vk.im.ui.components.contacts;

import com.vk.im.engine.models.ProfilesSimpleInfo;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.asp;
import xsna.epx;
import xsna.qtd0;
import xsna.sbj;
import xsna.zrp;

/* compiled from: ContactsList.kt */
/* loaded from: classes2.dex */
public final class ContactsList {
    public final List<qtd0> a;
    public final ProfilesSimpleInfo b;
    public final sbj c;
    public final ChangeMode d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ContactsList.kt */
    public static final class ChangeMode {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ChangeMode[] $VALUES;
        public static final ChangeMode APPEND;
        public static final ChangeMode REPLACE;

        static {
            ChangeMode changeMode = new ChangeMode("REPLACE", 0);
            REPLACE = changeMode;
            ChangeMode changeMode2 = new ChangeMode("APPEND", 1);
            APPEND = changeMode2;
            ChangeMode[] changeModeArr = {changeMode, changeMode2};
            $VALUES = changeModeArr;
            $ENTRIES = new asp(changeModeArr);
        }

        public ChangeMode() {
            throw null;
        }

        public static ChangeMode valueOf(String str) {
            return (ChangeMode) Enum.valueOf(ChangeMode.class, str);
        }

        public static ChangeMode[] values() {
            return (ChangeMode[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ContactsList(List<? extends qtd0> list, ProfilesSimpleInfo profilesSimpleInfo, sbj sbjVar, ChangeMode changeMode) {
        this.a = list;
        this.b = profilesSimpleInfo;
        this.c = sbjVar;
        this.d = changeMode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactsList)) {
            return false;
        }
        ContactsList contactsList = (ContactsList) obj;
        return epx.f(this.a, contactsList.a) && epx.f(this.b, contactsList.b) && epx.f(this.c, contactsList.c) && this.d == contactsList.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + io.reactivex.rxjava3.subjects.c.a(this.b, this.a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "ContactsList(contacts=" + this.a + ", profiles=" + this.b + ", state=" + this.c + ", changeMode=" + this.d + ')';
    }

    public ContactsList(List list, ProfilesSimpleInfo profilesSimpleInfo, sbj sbjVar, int i) {
        this((List<? extends qtd0>) ((i & 1) != 0 ? EmptyList.b : list), profilesSimpleInfo, sbjVar, ChangeMode.REPLACE);
    }
}
