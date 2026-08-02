package com.vk.im.ui.fragments;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewStub;
import com.vk.channels.api.ChannelHistoryOpenMode;
import com.vk.contacts.AndroidContact;
import com.vk.core.apps.BuildInfo;
import com.vk.core.voip.VoipCallSource;
import com.vk.dto.common.Peer;
import com.vk.im.channelcreation.api.ChannelCreationDiComponent;
import com.vk.im.chatmembers.api.ChatMembersFeatureComponent;
import com.vk.im.engine.commands.channels.ChannelInviteUsersCmd;
import com.vk.im.ui.calls.CallStartAction;
import com.vk.im.ui.components.contacts.ContactsListFactory;
import com.vk.im.ui.components.contacts.SortOrder;
import com.vk.im.ui.fragments.ImContactsListFragment;
import com.vk.im.ui.fragments.ImCreateChatFragment;
import com.vk.im.ui.utils.CreateChannelFlowTracker;
import com.vk.stat.scheme.MobileOfficialAppsCallsStat$TypeVoipCallItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.a1w;
import xsna.asu0;
import xsna.bzb0;
import xsna.f4m;
import xsna.fpf0;
import xsna.g2v;
import xsna.ies;
import xsna.jbs;
import xsna.k9u0;
import xsna.m7m;
import xsna.mxv;
import xsna.o0r0;
import xsna.o0w;
import xsna.q1w;
import xsna.q2a0;
import xsna.qtd0;
import xsna.qv20;
import xsna.rl3;
import xsna.rvv;
import xsna.ryc;
import xsna.ver0;
import xsna.xyv;

/* compiled from: ImCreateConversationFragment.kt */
/* loaded from: classes2.dex */
public final class ImCreateConversationFragment extends ImContactsListFragment implements ies {
    public static final /* synthetic */ int t0 = 0;
    public boolean l0;
    public Peer o0;
    public Peer p0;
    public boolean q0;
    public long[] m0 = new long[0];
    public List<AndroidContact> n0 = EmptyList.b;
    public final rvv r0 = new rvv();
    public final mxv s0 = g2v.c();

    /* compiled from: ImCreateConversationFragment.kt */
    public static final class a extends ImContactsListFragment.a {

        /* compiled from: ImCreateConversationFragment.kt */
        /* renamed from: com.vk.im.ui.fragments.ImCreateConversationFragment$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C1175a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[BuildInfo.Client.values().length];
                try {
                    iArr[BuildInfo.Client.VK_ME.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public a() {
            super(ImCreateConversationFragment.class);
            this.j.putSerializable("factory", C1175a.$EnumSwitchMapping$0[BuildInfo.a.ordinal()] == 1 ? ContactsListFactory.CREATE_CONVERSATION_VKME : ContactsListFactory.CREATE_CONVERSATION_VKAPP);
            this.j.putSerializable("sort", SortOrder.BY_NAME);
            s(true);
            y(R.attr.im_ic_cancel);
            this.j.putString("force_entry_point_for_create_contact", "start_conv_create_contact");
        }

        public final void B() {
            this.j.putSerializable("factory", C1175a.$EnumSwitchMapping$0[BuildInfo.a.ordinal()] == 1 ? ContactsListFactory.CREATE_CONVERSATION_WITH_CONTACT_SYNC_VKME : ContactsListFactory.CREATE_CONVERSATION_WITH_SYNC_CONTACT_VKAPP);
        }

        @Override // xsna.oz50
        public final void r(Intent intent) {
            CreateChannelFlowTracker.a(CreateChannelFlowTracker.CreateChannelFlowTrackEvent.BUTTON_START_WRITING);
        }
    }

    @Override // com.vk.im.ui.fragments.ImContactsListFragment, com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        this.y = true;
        return super.a0();
    }

    @Override // com.vk.im.ui.fragments.ImContactsListFragment
    public final void mo() {
        this.s0.j().c(kn(), new VoipCallSource(MobileOfficialAppsCallsStat$TypeVoipCallItem.Source.IM_CREATE, MobileOfficialAppsCoreNavStat$EventScreen.IM_FRIENDS_SEND), Collections.singleton(CallStartAction.f.a));
    }

    @Override // com.vk.im.ui.fragments.ImContactsListFragment
    public final void no() {
        mxv mxvVar = this.s0;
        mxvVar.getClass();
        mxvVar.a().k(new jbs(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00eb  */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List<com.vk.contacts.AndroidContact>] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onActivityResult(int i, int i2, Intent intent) {
        long[] jArr;
        ?? r2;
        Parcelable[] parcelableArrayExtra;
        long j;
        Object obj;
        Object parcelableExtra;
        Object obj2;
        Object parcelableExtra2;
        Peer peer = null;
        if (i == 2) {
            if (i2 != -1) {
                this.m0 = new long[0];
                this.n0 = EmptyList.b;
                return;
            }
            if (intent == null || (jArr = intent.getLongArrayExtra("ids")) == null) {
                jArr = new long[0];
            }
            this.m0 = jArr;
            this.q0 = intent != null ? intent.getBooleanExtra("empty_data", this.q0) : this.q0;
            if (intent == null || (parcelableArrayExtra = intent.getParcelableArrayExtra("selectedContacts")) == null) {
                r2 = EmptyList.b;
            } else {
                r2 = new ArrayList();
                for (Parcelable parcelable : parcelableArrayExtra) {
                    if (parcelable instanceof AndroidContact) {
                        r2.add(parcelable);
                    }
                }
            }
            this.n0 = r2;
            Peer peer2 = this.o0;
            Long valueOf = peer2 != null ? Long.valueOf(peer2.d) : null;
            if (valueOf == null) {
                new ImCreateChatFragment.a(rl3.t0(this.m0), this.n0, this.l0, false, null, 56).g(3, this);
                return;
            }
            long j2 = -valueOf.longValue();
            boolean z = intent != null && intent.getBooleanExtra("channel_select_all", false);
            boolean z2 = intent != null && intent.getBooleanExtra("channel_select_subscribers", false);
            List<Long> t02 = rl3.t0(this.m0);
            ChannelInviteUsersCmd.InviteOptions inviteOptions = z ? ChannelInviteUsersCmd.InviteOptions.ALL : z2 ? ChannelInviteUsersCmd.InviteOptions.SUBSCRIBERS : ChannelInviteUsersCmd.InviteOptions.NOT_DEFINED;
            if (inviteOptions != ChannelInviteUsersCmd.InviteOptions.NOT_DEFINED || !t02.isEmpty()) {
                CreateChannelFlowTracker.a(CreateChannelFlowTracker.CreateChannelFlowTrackEvent.INVITES_SENT_PERSONAL_CHANNEL);
                ChannelInviteUsersCmd channelInviteUsersCmd = new ChannelInviteUsersCmd(j2, inviteOptions, t02);
                a1w a1wVar = q1w.a;
                ver0.a((a1wVar != null ? a1wVar : null).C(this, channelInviteUsersCmd).q(asu0.a.c()).subscribe());
            }
            xyv.i(this.s0.a(), kn(), j2, ChannelHistoryOpenMode.OpenAtUnread.b, null, 8);
            this.r0.b(300L, new ryc(this, 5));
            return;
        }
        if (i == 3) {
            if (i2 == -1) {
                if (intent != null) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        parcelableExtra = intent.getParcelableExtra("dialog_id", Peer.class);
                        obj = (Parcelable) parcelableExtra;
                    } else {
                        Object parcelableExtra3 = intent.getParcelableExtra("dialog_id");
                        obj = (Peer) (parcelableExtra3 instanceof Peer ? parcelableExtra3 : null);
                    }
                    Peer peer3 = (Peer) obj;
                    if (peer3 != null) {
                        j = peer3.b;
                        if (j != 0) {
                            o0w.x(this.s0.b(), kn(), null, j, null, null, null, false, null, null, null, null, null, null, "create_conversation", null, null, null, false, null, null, null, null, null, 939515898);
                        }
                        this.m0 = new long[0];
                        this.n0 = EmptyList.b;
                    }
                }
                j = 0;
                if (j != 0) {
                }
                this.m0 = new long[0];
                this.n0 = EmptyList.b;
            } else if (!this.q0) {
                oo(this.l0);
                return;
            } else if (i2 == 0) {
                return;
            }
            this.r0.b(300L, new ryc(this, 5));
            return;
        }
        if (i == 4) {
            if (i2 != -1) {
                this.m0 = new long[0];
                this.n0 = EmptyList.b;
                return;
            }
            Peer peer4 = intent != null ? (Peer) intent.getParcelableExtra("select") : null;
            if (peer4 != null && peer4.Ab(Peer.Type.USER)) {
                this.p0 = peer4;
                ((ChannelCreationDiComponent) m7m.d(this).mo408a(fpf0.a(ChannelCreationDiComponent.class))).f1().a(peer4.b, new jbs(this));
                return;
            } else {
                if (peer4 == null || !peer4.Ab(Peer.Type.GROUP)) {
                    return;
                }
                xyv.i(this.s0.a(), kn(), peer4.b, ChannelHistoryOpenMode.OpenAtUnread.b, null, 8);
                this.r0.b(300L, new ryc(this, 5));
                return;
            }
        }
        if (i == 5) {
            if (i2 == -1) {
                finish();
            }
        } else {
            if (i != 6) {
                super.onActivityResult(i, i2, intent);
                return;
            }
            if (i2 != -1) {
                return;
            }
            if (intent != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelableExtra2 = intent.getParcelableExtra("channel_id", Peer.class);
                    obj2 = (Parcelable) parcelableExtra2;
                } else {
                    Object parcelableExtra4 = intent.getParcelableExtra("channel_id");
                    obj2 = (Peer) (parcelableExtra4 instanceof Peer ? parcelableExtra4 : null);
                }
                peer = (Peer) obj2;
            }
            this.o0 = peer;
            oo(false);
        }
    }

    @Override // com.vk.im.ui.fragments.ImContactsListFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.y = false;
        new bzb0(kn());
    }

    @Override // com.vk.im.ui.fragments.ImContactsListFragment, com.vk.im.ui.fragments.ImFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.r0.a();
    }

    @Override // com.vk.im.ui.fragments.ImContactsListFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putLongArray("user_ids", this.m0);
        bundle.putParcelableArray("phonebook_contacts", (Parcelable[]) this.n0.toArray(new AndroidContact[0]));
        bundle.putBoolean("casper_chat", this.l0);
        bundle.putBoolean("no_contacts_to_select", this.q0);
    }

    @Override // com.vk.im.ui.fragments.ImContactsListFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ViewStub viewStub = this.X;
        if (viewStub == null) {
            viewStub = null;
        }
        f4m.t(0, viewStub);
    }

    @Override // com.vk.im.ui.fragments.ImContactsListFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onViewStateRestored(Bundle bundle) {
        long[] jArr;
        List list;
        Parcelable[] parcelableArray;
        List u0;
        super.onViewStateRestored(bundle);
        if (bundle == null || (jArr = bundle.getLongArray("user_ids")) == null) {
            jArr = this.m0;
        }
        this.m0 = jArr;
        if (bundle == null || (parcelableArray = bundle.getParcelableArray("phonebook_contacts")) == null || (u0 = rl3.u0(parcelableArray)) == null) {
            list = this.n0;
        } else {
            list = new ArrayList();
            for (Object obj : u0) {
                if (obj instanceof AndroidContact) {
                    list.add(obj);
                }
            }
        }
        this.n0 = list;
        this.l0 = bundle != null ? bundle.getBoolean("casper_chat") : this.l0;
        this.q0 = bundle != null ? bundle.getBoolean("no_contacts_to_select") : this.q0;
    }

    @Override // com.vk.im.ui.fragments.ImContactsListFragment
    public final void oo(boolean z) {
        String str;
        this.l0 = z;
        ((ChatMembersFeatureComponent) m7m.d(this).mo408a(fpf0.a(ChatMembersFeatureComponent.class))).S1().getClass();
        o0r0 d = this.s0.d();
        jbs jbsVar = new jbs(this);
        String string = this.o0 != null ? requireContext().getString(R.string.vkim_create_channel_title) : requireContext().getString(R.string.vkim_create_chat_title);
        String string2 = this.o0 != null ? requireContext().getString(R.string.vkim_empty_selection_hint_channel) : requireContext().getString(R.string.vkim_empty_selection_hint);
        String string3 = this.o0 != null ? requireContext().getString(R.string.vkim_channel_continue_btn) : requireContext().getString(R.string.vkim_continue);
        Integer num = null;
        if (z) {
            str = requireContext().getString(R.string.vkim_create_casper_chat_description);
        } else {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            str = null;
        }
        if (z) {
            num = Integer.valueOf(R.drawable.ic_ghost_circle_blue_32);
        } else if (z) {
            throw new NoWhenBranchMatchedException();
        }
        o0r0.h(d, jbsVar, true, true, 2, string, string2, string3, str, num, null, null, MobileOfficialAppsCoreNavStat$EventScreen.IM_CONVERSATION_CREATE_FRIENDS_ADD, this.p0, 112640);
    }

    @Override // com.vk.im.ui.fragments.ImContactsListFragment
    public final void po(qtd0 qtd0Var) {
        Peer.Type t8 = qtd0Var.t8();
        Peer.Type type = Peer.Type.UNKNOWN;
        mxv mxvVar = this.s0;
        if (t8 != type || !(qtd0Var instanceof q2a0)) {
            o0w.x(mxvVar.b(), kn(), null, qtd0Var.G3(), qv20.m(qtd0Var), null, null, false, null, null, null, null, null, null, "create_conversation", null, null, null, false, null, null, null, null, null, 1073733618);
            this.r0.b(300L, new ryc(this, 5));
        } else {
            mxvVar.getClass();
            k9u0.a.g(requireContext(), (q2a0) qtd0Var);
            finish();
        }
    }
}
