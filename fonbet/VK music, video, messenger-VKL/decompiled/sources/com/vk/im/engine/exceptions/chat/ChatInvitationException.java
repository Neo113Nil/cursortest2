package com.vk.im.engine.exceptions.chat;

import com.vk.im.engine.models.ProfilesInfo;
import xsna.qtd0;

/* compiled from: ChatInvitationException.kt */
/* loaded from: classes2.dex */
public abstract class ChatInvitationException extends Exception {
    private final String link;
    private final ProfilesInfo profiles;

    /* compiled from: ChatInvitationException.kt */
    public static final class AllMembers extends ChatInvitationException {
    }

    /* compiled from: ChatInvitationException.kt */
    public static final class OneMember extends ChatInvitationException {
        private final qtd0 profile;

        public OneMember(qtd0 qtd0Var, String str) {
            super(new ProfilesInfo(qtd0Var), str);
            this.profile = qtd0Var;
        }

        public final qtd0 h() {
            return this.profile;
        }
    }

    /* compiled from: ChatInvitationException.kt */
    public static final class SeveralMembers extends ChatInvitationException {
    }

    public ChatInvitationException(ProfilesInfo profilesInfo, String str) {
        this.profiles = profilesInfo;
        this.link = str;
    }

    public final String d() {
        return this.link;
    }

    public final ProfilesInfo g() {
        return this.profiles;
    }
}
