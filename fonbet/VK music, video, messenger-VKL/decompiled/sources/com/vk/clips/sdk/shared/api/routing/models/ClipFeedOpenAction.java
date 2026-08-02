package com.vk.clips.sdk.shared.api.routing.models;

import com.vk.clips.sdk.shared.api.comment.SdkReplyInfo;
import com.vk.core.serialize.Serializer;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.epx;
import xsna.zcl;
import xsna.zrp;

/* compiled from: ClipFeedOpenAction.kt */
/* loaded from: classes17.dex */
public abstract class ClipFeedOpenAction extends Serializer.StreamParcelableAdapter {

    /* compiled from: ClipFeedOpenAction.kt */
    public static final class OpenComments extends ClipFeedOpenAction {
        public static final Serializer.c<OpenComments> CREATOR = new a();
        public final SdkReplyInfo b;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<OpenComments> {
            @Override // com.vk.core.serialize.Serializer.c
            public final OpenComments a(Serializer serializer) {
                SdkReplyInfo sdkReplyInfo = (SdkReplyInfo) serializer.A(SdkReplyInfo.class.getClassLoader());
                if (sdkReplyInfo == null) {
                    sdkReplyInfo = new SdkReplyInfo(0, null);
                }
                return new OpenComments(sdkReplyInfo);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OpenComments[i];
            }
        }

        public OpenComments(SdkReplyInfo sdkReplyInfo) {
            super(null);
            this.b = sdkReplyInfo;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.e0(this.b);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenComments) && epx.f(this.b, ((OpenComments) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "OpenComments(replyInfo=" + this.b + ')';
        }
    }

    /* compiled from: ClipFeedOpenAction.kt */
    public static final class ShowActionButton extends ClipFeedOpenAction {
        public static final Serializer.c<ShowActionButton> CREATOR = new a();
        public final String b;
        public final State c;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ClipFeedOpenAction.kt */
        public static final class State {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ State[] $VALUES;
            public static final State ACTIVE;
            public static final State INACTIVE;

            static {
                State state = new State(SignalingProtocol.STATE_ACTIVE, 0);
                ACTIVE = state;
                State state2 = new State("INACTIVE", 1);
                INACTIVE = state2;
                State[] stateArr = {state, state2};
                $VALUES = stateArr;
                $ENTRIES = new asp(stateArr);
            }

            public State() {
                throw null;
            }

            public static zrp<State> h() {
                return $ENTRIES;
            }

            public static State valueOf(String str) {
                return (State) Enum.valueOf(State.class, str);
            }

            public static State[] values() {
                return (State[]) $VALUES.clone();
            }
        }

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<ShowActionButton> {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.vk.core.serialize.Serializer.c
            public final ShowActionButton a(Serializer serializer) {
                String H = serializer.H();
                if (H == null) {
                    H = "";
                }
                return new ShowActionButton(H, (State) State.h().get(serializer.u()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ShowActionButton[i];
            }
        }

        public ShowActionButton(String str, State state) {
            super(null);
            this.b = str;
            this.c = state;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.b);
            serializer.S(this.c.ordinal());
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowActionButton)) {
                return false;
            }
            ShowActionButton showActionButton = (ShowActionButton) obj;
            return epx.f(this.b, showActionButton.b) && this.c == showActionButton.c;
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            return "ShowActionButton(clipUniqueKey=" + this.b + ", state=" + this.c + ')';
        }
    }

    public /* synthetic */ ClipFeedOpenAction(zcl zclVar) {
        this();
    }

    public ClipFeedOpenAction() {
    }

    /* compiled from: ClipFeedOpenAction.kt */
    public static final class OpenDiscover extends ClipFeedOpenAction {
        public static final OpenDiscover b = new OpenDiscover(null);
        public static final Serializer.c<OpenDiscover> CREATOR = new a();

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<OpenDiscover> {
            @Override // com.vk.core.serialize.Serializer.c
            public final OpenDiscover a(Serializer serializer) {
                return OpenDiscover.b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OpenDiscover[i];
            }
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
        }
    }

    /* compiled from: ClipFeedOpenAction.kt */
    public static final class ShowInterestsChoice extends ClipFeedOpenAction {
        public static final ShowInterestsChoice b = new ShowInterestsChoice(null);
        public static final Serializer.c<ShowInterestsChoice> CREATOR = new a();

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<ShowInterestsChoice> {
            @Override // com.vk.core.serialize.Serializer.c
            public final ShowInterestsChoice a(Serializer serializer) {
                return ShowInterestsChoice.b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ShowInterestsChoice[i];
            }
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
        }
    }

    /* compiled from: ClipFeedOpenAction.kt */
    public static final class ShowLogin extends ClipFeedOpenAction {
        public static final ShowLogin b = new ShowLogin(null);
        public static final Serializer.c<ShowLogin> CREATOR = new a();

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<ShowLogin> {
            @Override // com.vk.core.serialize.Serializer.c
            public final ShowLogin a(Serializer serializer) {
                return ShowLogin.b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ShowLogin[i];
            }
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
        }
    }
}
