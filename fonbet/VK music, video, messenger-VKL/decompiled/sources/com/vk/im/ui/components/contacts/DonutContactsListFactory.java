package com.vk.im.ui.components.contacts;

import com.vk.im.ui.components.contacts.vc.ContactsViews;
import java.util.List;
import java.util.Set;
import xsna.asp;
import xsna.cc5;
import xsna.e1w;
import xsna.fzn;
import xsna.gzn;
import xsna.izs;
import xsna.k60;
import xsna.mo1;
import xsna.ob;
import xsna.oue;
import xsna.pbm;
import xsna.qtd0;
import xsna.rl3;
import xsna.w8j;
import xsna.wzs;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DonutContactsListFactory.kt */
/* loaded from: classes2.dex */
public final class DonutContactsListFactory {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ DonutContactsListFactory[] $VALUES;
    public static final DonutContactsListFactory SELECT_DONUT_FRIENDS_VKAPP;
    public static final DonutContactsListFactory SELECT_DONUT_USERS_VKAPP;
    private final izs<w8j, e1w<pbm>> checkInChatCmdProvider;
    private final boolean disableContactsWithForbiddenWrite;
    private final boolean forceContactNameForUsers;
    private final izs<fzn, e1w<ContactsList>> loadCmdProvider;
    private final boolean openChatWithOpenKeyboard;
    private final boolean resetNewUsers;
    private final wzs<String, fzn, e1w<List<qtd0>>> searchCmdProvider;
    private final boolean searchOnlyInContacts;
    private final boolean searchWithLocalsContacts;
    private final Set<ContactsViews> views;

    static {
        ContactsViews contactsViews = ContactsViews.USERS;
        ContactsViews contactsViews2 = ContactsViews.HINTS;
        ContactsViews contactsViews3 = ContactsViews.EMPTY;
        ContactsViews contactsViews4 = ContactsViews.SELECTION_PREVIEW;
        DonutContactsListFactory donutContactsListFactory = new DonutContactsListFactory("SELECT_DONUT_USERS_VKAPP", 0, rl3.y0(new ContactsViews[]{contactsViews, contactsViews2, contactsViews3, contactsViews4}), new gzn(0), new k60(26), new oue(3));
        SELECT_DONUT_USERS_VKAPP = donutContactsListFactory;
        DonutContactsListFactory donutContactsListFactory2 = new DonutContactsListFactory("SELECT_DONUT_FRIENDS_VKAPP", 1, rl3.y0(new ContactsViews[]{contactsViews, contactsViews2, contactsViews3, contactsViews4}), new ob(22), new mo1(27), new cc5(4));
        SELECT_DONUT_FRIENDS_VKAPP = donutContactsListFactory2;
        DonutContactsListFactory[] donutContactsListFactoryArr = {donutContactsListFactory, donutContactsListFactory2};
        $VALUES = donutContactsListFactoryArr;
        $ENTRIES = new asp(donutContactsListFactoryArr);
    }

    public DonutContactsListFactory() {
        throw null;
    }

    public DonutContactsListFactory(String str, int i, Set set, izs izsVar, izs izsVar2, wzs wzsVar) {
        this.views = set;
        this.forceContactNameForUsers = false;
        this.resetNewUsers = false;
        this.searchOnlyInContacts = false;
        this.searchWithLocalsContacts = false;
        this.openChatWithOpenKeyboard = false;
        this.disableContactsWithForbiddenWrite = false;
        this.loadCmdProvider = izsVar;
        this.checkInChatCmdProvider = izsVar2;
        this.searchCmdProvider = wzsVar;
    }

    public static DonutContactsListFactory valueOf(String str) {
        return (DonutContactsListFactory) Enum.valueOf(DonutContactsListFactory.class, str);
    }

    public static DonutContactsListFactory[] values() {
        return (DonutContactsListFactory[]) $VALUES.clone();
    }

    public final izs<w8j, e1w<pbm>> h() {
        return this.checkInChatCmdProvider;
    }

    public final boolean i() {
        return this.forceContactNameForUsers;
    }

    public final izs<fzn, e1w<ContactsList>> j() {
        return this.loadCmdProvider;
    }

    public final boolean k() {
        return this.resetNewUsers;
    }

    public final Set<ContactsViews> l() {
        return this.views;
    }
}
