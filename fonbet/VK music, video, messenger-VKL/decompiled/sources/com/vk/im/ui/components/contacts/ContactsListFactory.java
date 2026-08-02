package com.vk.im.ui.components.contacts;

import com.ironsource.Z3;
import com.vk.im.ui.components.contacts.vc.ContactsViews;
import com.vk.movika.sdk.base.logic.interactor.f;
import com.vk.movika.sdk.base.logic.interactor.g;
import com.vk.movika.sdk.base.logic.interactor.l;
import com.vk.movika.sdk.base.ui.o0;
import java.util.Set;
import xsna.a60;
import xsna.am0;
import xsna.asp;
import xsna.cu1;
import xsna.e1w;
import xsna.e20;
import xsna.e60;
import xsna.gt;
import xsna.gv3;
import xsna.gzs;
import xsna.ht;
import xsna.hy2;
import xsna.izs;
import xsna.jg0;
import xsna.kk1;
import xsna.la0;
import xsna.lt0;
import xsna.lz2;
import xsna.mg;
import xsna.nt;
import xsna.pbm;
import xsna.pf;
import xsna.sm0;
import xsna.t61;
import xsna.tb4;
import xsna.w8j;
import xsna.wb1;
import xsna.x50;
import xsna.x8j;
import xsna.y90;
import xsna.zq3;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ContactsListFactory.kt */
/* loaded from: classes2.dex */
public final class ContactsListFactory {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ContactsListFactory[] $VALUES;
    public static final ContactsListFactory CONTACTS_LIST_VKAPP;
    public static final ContactsListFactory CONTACTS_LIST_VKCLIPS;
    public static final ContactsListFactory CONTACTS_LIST_VKME;
    public static final ContactsListFactory CONTACT_LIST_CALLS_APP;
    public static final ContactsListFactory CREATE_CONVERSATION_VKAPP;
    public static final ContactsListFactory CREATE_CONVERSATION_VKME;
    public static final ContactsListFactory CREATE_CONVERSATION_WITH_CONTACT_SYNC_VKME;
    public static final ContactsListFactory CREATE_CONVERSATION_WITH_SYNC_CONTACT_VKAPP;
    public static final ContactsListFactory PERSONAL_CHANNEL_USERS_INVITATION;
    public static final ContactsListFactory SELECT_USERS_TO_EXISTED_CHAT;
    public static final ContactsListFactory SELECT_USERS_TO_NEW_BASED_ON_EXISTED_CHAT;
    public static final ContactsListFactory SELECT_USERS_TO_NEW_CHAT;
    public static final ContactsListFactory SELECT_USERS_VKAPP_NO_CONTACTS;
    public static final ContactsListFactory SELECT_USERS_WITHOUT_CONTACTS_VKME;
    private final izs<w8j, e1w<pbm>> checkInChatCmdProvider;
    private final boolean disableContactsWithForbiddenWrite;
    private final boolean forceContactNameForUsers;
    private final izs<x8j, e1w<ContactsList>> loadCmdProvider;
    private final boolean openChatWithOpenKeyboard;
    private final boolean openContactListOnGrantedSyncPermission;
    private final boolean resetNewUsers;
    private final boolean searchOnlyInContacts;
    private final boolean searchWithLocalsContacts;
    private final boolean separatorsEnabled;
    private final boolean suggestGrantSyncPermission;
    private final gzs<Set<ContactsViews>> viewsProvider;

    static {
        ContactsListFactory contactsListFactory = new ContactsListFactory("CREATE_CONVERSATION_VKME", 0, new t61(18), false, false, false, false, false, true, new y90(20), null, 2680);
        CREATE_CONVERSATION_VKME = contactsListFactory;
        ContactsListFactory contactsListFactory2 = new ContactsListFactory("CREATE_CONVERSATION_WITH_CONTACT_SYNC_VKME", 1, new e20(9), false, false, false, false, false, true, new com.vk.movika.sdk.base.utils.b(19), null, 2680);
        CREATE_CONVERSATION_WITH_CONTACT_SYNC_VKME = contactsListFactory2;
        ContactsListFactory contactsListFactory3 = new ContactsListFactory("CREATE_CONVERSATION_VKAPP", 2, new wb1(7), false, false, false, false, false, true, new tb4(16), null, 2680);
        CREATE_CONVERSATION_VKAPP = contactsListFactory3;
        ContactsListFactory contactsListFactory4 = new ContactsListFactory("CREATE_CONVERSATION_WITH_SYNC_CONTACT_VKAPP", 3, new jg0(12), false, false, false, false, false, true, new x50(11), null, 2680);
        CREATE_CONVERSATION_WITH_SYNC_CONTACT_VKAPP = contactsListFactory4;
        ContactsListFactory contactsListFactory5 = new ContactsListFactory("SELECT_USERS_WITHOUT_CONTACTS_VKME", 4, new kk1(4), false, false, false, false, false, false, new gt(14), null, 3064);
        SELECT_USERS_WITHOUT_CONTACTS_VKME = contactsListFactory5;
        ContactsListFactory contactsListFactory6 = new ContactsListFactory("SELECT_USERS_TO_NEW_CHAT", 5, new zq3(12), false, false, false, false, false, false, new a60(21), null, 3064);
        SELECT_USERS_TO_NEW_CHAT = contactsListFactory6;
        ContactsListFactory contactsListFactory7 = new ContactsListFactory("SELECT_USERS_TO_NEW_BASED_ON_EXISTED_CHAT", 6, new lz2(9), false, false, false, false, false, false, new ht(18), null, 3064);
        SELECT_USERS_TO_NEW_BASED_ON_EXISTED_CHAT = contactsListFactory7;
        ContactsListFactory contactsListFactory8 = new ContactsListFactory("SELECT_USERS_TO_EXISTED_CHAT", 7, new mg(7), false, false, false, false, false, false, new sm0(15), new e60(22), Z3.l);
        SELECT_USERS_TO_EXISTED_CHAT = contactsListFactory8;
        ContactsListFactory contactsListFactory9 = new ContactsListFactory("SELECT_USERS_VKAPP_NO_CONTACTS", 8, new cu1(9), false, false, false, false, false, false, new nt(27), null, 3064);
        SELECT_USERS_VKAPP_NO_CONTACTS = contactsListFactory9;
        ContactsListFactory contactsListFactory10 = new ContactsListFactory("CONTACTS_LIST_VKME", 9, new hy2(9), false, false, false, false, false, true, new f(16), null, 2936);
        CONTACTS_LIST_VKME = contactsListFactory10;
        ContactsListFactory contactsListFactory11 = new ContactsListFactory("CONTACT_LIST_CALLS_APP", 10, new g(11), false, false, false, false, false, true, new lt0(27), null, 2936);
        CONTACT_LIST_CALLS_APP = contactsListFactory11;
        ContactsListFactory contactsListFactory12 = new ContactsListFactory("CONTACTS_LIST_VKAPP", 11, new o0(14), true, true, true, true, true, true, new am0(29), null, 2320);
        CONTACTS_LIST_VKAPP = contactsListFactory12;
        ContactsListFactory contactsListFactory13 = new ContactsListFactory("CONTACTS_LIST_VKCLIPS", 12, new l(16), true, true, true, true, true, true, new pf(20), null, 2816);
        CONTACTS_LIST_VKCLIPS = contactsListFactory13;
        ContactsListFactory contactsListFactory14 = new ContactsListFactory("PERSONAL_CHANNEL_USERS_INVITATION", 13, new la0(8), false, false, false, false, false, false, new gv3(14), null, 2816);
        PERSONAL_CHANNEL_USERS_INVITATION = contactsListFactory14;
        ContactsListFactory[] contactsListFactoryArr = {contactsListFactory, contactsListFactory2, contactsListFactory3, contactsListFactory4, contactsListFactory5, contactsListFactory6, contactsListFactory7, contactsListFactory8, contactsListFactory9, contactsListFactory10, contactsListFactory11, contactsListFactory12, contactsListFactory13, contactsListFactory14};
        $VALUES = contactsListFactoryArr;
        $ENTRIES = new asp(contactsListFactoryArr);
    }

    public ContactsListFactory() {
        throw null;
    }

    public ContactsListFactory(String str, int i, gzs gzsVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, izs izsVar, e60 e60Var, int i2) {
        boolean z7 = (i2 & 8) != 0 ? false : z3;
        boolean z8 = (i2 & 16) != 0;
        boolean z9 = (i2 & 32) != 0 ? false : z4;
        boolean z10 = (i2 & 64) != 0 ? false : z5;
        boolean z11 = (i2 & 128) != 0 ? false : z6;
        boolean z12 = (i2 & 256) == 0;
        boolean z13 = (i2 & 512) != 0;
        e60 e60Var2 = (i2 & 2048) != 0 ? null : e60Var;
        this.viewsProvider = gzsVar;
        this.forceContactNameForUsers = z;
        this.resetNewUsers = z2;
        this.searchOnlyInContacts = z7;
        this.searchWithLocalsContacts = z8;
        this.openChatWithOpenKeyboard = z9;
        this.disableContactsWithForbiddenWrite = z10;
        this.suggestGrantSyncPermission = z11;
        this.openContactListOnGrantedSyncPermission = z12;
        this.separatorsEnabled = z13;
        this.loadCmdProvider = izsVar;
        this.checkInChatCmdProvider = e60Var2;
    }

    public static ContactsListFactory valueOf(String str) {
        return (ContactsListFactory) Enum.valueOf(ContactsListFactory.class, str);
    }

    public static ContactsListFactory[] values() {
        return (ContactsListFactory[]) $VALUES.clone();
    }

    public final izs<w8j, e1w<pbm>> h() {
        return this.checkInChatCmdProvider;
    }

    public final boolean i() {
        return this.disableContactsWithForbiddenWrite;
    }

    public final boolean j() {
        return this.forceContactNameForUsers;
    }

    public final izs<x8j, e1w<ContactsList>> k() {
        return this.loadCmdProvider;
    }

    public final boolean l() {
        return this.openChatWithOpenKeyboard;
    }

    public final boolean m() {
        return this.openContactListOnGrantedSyncPermission;
    }

    public final boolean n() {
        return this.resetNewUsers;
    }

    public final boolean o() {
        return this.searchOnlyInContacts;
    }

    public final boolean p() {
        return this.searchWithLocalsContacts;
    }

    public final boolean q() {
        return this.separatorsEnabled;
    }

    public final boolean r() {
        return this.suggestGrantSyncPermission;
    }

    public final gzs<Set<ContactsViews>> s() {
        return this.viewsProvider;
    }
}
