package androidx.car.app.messaging.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.car.app.model.Action;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import xsna.alk;
import xsna.fai;
import xsna.grj;
import xsna.hrj;
import xsna.j1a0;
import xsna.ktx;
import xsna.obr;

/* loaded from: classes11.dex */
public class ConversationItem implements ktx {

    @NonNull
    private final List<Action> mActions;

    @NonNull
    private final hrj mConversationCallbackDelegate;

    @Nullable
    private final CarIcon mIcon;

    @NonNull
    private final String mId;
    private final boolean mIsGroupConversation;

    @NonNull
    private final List<CarMessage> mMessages;

    @NonNull
    private final j1a0 mSelf;

    @NonNull
    private final CarText mTitle;

    public class a implements grj {
    }

    public static final class b {

        @Nullable
        public final String a;

        @Nullable
        public final CarText b;

        @Nullable
        public final j1a0 c;

        @Nullable
        public final CarIcon d;
        public final boolean e;

        @Nullable
        public List<CarMessage> f;

        @Nullable
        public final hrj g;
        public final ArrayList h;

        public b(@NonNull ConversationItem conversationItem) {
            this.a = conversationItem.getId();
            this.b = conversationItem.getTitle();
            this.c = conversationItem.getSelf();
            this.d = conversationItem.getIcon();
            this.e = conversationItem.isGroupConversation();
            this.g = conversationItem.getConversationCallbackDelegate();
            this.f = conversationItem.getMessages();
            this.h = new ArrayList(conversationItem.getActions());
        }
    }

    public ConversationItem(@NonNull b bVar) {
        String str = bVar.a;
        Objects.requireNonNull(str);
        this.mId = str;
        CarText carText = bVar.b;
        Objects.requireNonNull(carText);
        this.mTitle = carText;
        this.mSelf = validateSender(bVar.c);
        this.mIcon = bVar.d;
        this.mIsGroupConversation = bVar.e;
        List<CarMessage> H = alk.H(bVar.f);
        Objects.requireNonNull(H);
        this.mMessages = H;
        obr.f("Message list cannot be empty.", !r0.isEmpty());
        hrj hrjVar = bVar.g;
        Objects.requireNonNull(hrjVar);
        this.mConversationCallbackDelegate = hrjVar;
        this.mActions = alk.H(bVar.h);
    }

    public static j1a0 validateSender(@Nullable j1a0 j1a0Var) {
        Objects.requireNonNull(j1a0Var);
        Objects.requireNonNull(j1a0Var.a);
        Objects.requireNonNull(j1a0Var.d);
        return j1a0Var;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConversationItem)) {
            return false;
        }
        ConversationItem conversationItem = (ConversationItem) obj;
        return Objects.equals(this.mId, conversationItem.mId) && Objects.equals(this.mTitle, conversationItem.mTitle) && Objects.equals(this.mIcon, conversationItem.mIcon) && fai.e(getSelf(), conversationItem.getSelf()) && this.mIsGroupConversation == conversationItem.mIsGroupConversation && Objects.equals(this.mMessages, conversationItem.mMessages) && Objects.equals(this.mActions, conversationItem.mActions);
    }

    @NonNull
    public List<Action> getActions() {
        return this.mActions;
    }

    @NonNull
    public hrj getConversationCallbackDelegate() {
        return this.mConversationCallbackDelegate;
    }

    @Nullable
    public CarIcon getIcon() {
        return this.mIcon;
    }

    @NonNull
    public String getId() {
        return this.mId;
    }

    @NonNull
    public List<CarMessage> getMessages() {
        return this.mMessages;
    }

    @NonNull
    public j1a0 getSelf() {
        return this.mSelf;
    }

    @NonNull
    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(fai.r(getSelf())), this.mId, this.mTitle, this.mIcon, Boolean.valueOf(this.mIsGroupConversation), this.mMessages, this.mActions);
    }

    public boolean isGroupConversation() {
        return this.mIsGroupConversation;
    }

    private ConversationItem() {
        this.mId = "";
        this.mTitle = new CarText.Builder("").build();
        j1a0 j1a0Var = new j1a0();
        j1a0Var.a = "";
        j1a0Var.b = null;
        j1a0Var.c = null;
        j1a0Var.d = null;
        j1a0Var.e = false;
        j1a0Var.f = false;
        this.mSelf = j1a0Var;
        this.mIcon = null;
        this.mIsGroupConversation = false;
        this.mMessages = new ArrayList();
        this.mConversationCallbackDelegate = new ConversationCallbackDelegateImpl(new a());
        this.mActions = Collections.EMPTY_LIST;
    }
}
