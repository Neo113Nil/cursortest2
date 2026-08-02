package ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscription.presentation;

import Nh.a;
import Ns.b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0003\u001c\u001d\u001eB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscription/presentation/NotificationSubscriptionVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscription/presentation/NotificationSubscriptionVO$State;", "state", "<init>", "(JLru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscription/presentation/NotificationSubscriptionVO$State;)V", "copy", "(JLru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscription/presentation/NotificationSubscriptionVO$State;)Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscription/presentation/NotificationSubscriptionVO;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscription/presentation/NotificationSubscriptionVO$State;", "getState", "()Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscription/presentation/NotificationSubscriptionVO$State;", "State", "Fetch", "Loaded", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class NotificationSubscriptionVO implements c {
    private final long id;

    @NotNull
    private final State state;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\tR%\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscription/presentation/NotificationSubscriptionVO$Fetch;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscription/presentation/NotificationSubscriptionVO$State;", "", "asyncData", "", "asyncParams", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAsyncData", "Ljava/util/Map;", "getAsyncParams", "()Ljava/util/Map;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Fetch implements State {

        @NotNull
        private final String asyncData;
        private final Map<String, String> asyncParams;

        public Fetch(@NotNull String asyncData, Map<String, String> map) {
            Intrinsics.checkNotNullParameter(asyncData, "asyncData");
            this.asyncData = asyncData;
            this.asyncParams = map;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Fetch)) {
                return false;
            }
            Fetch fetch = (Fetch) other;
            return Intrinsics.d(this.asyncData, fetch.asyncData) && Intrinsics.d(this.asyncParams, fetch.asyncParams);
        }

        @NotNull
        public final String getAsyncData() {
            return this.asyncData;
        }

        public final Map<String, String> getAsyncParams() {
            return this.asyncParams;
        }

        public int hashCode() {
            int hashCode = this.asyncData.hashCode() * 31;
            Map<String, String> map = this.asyncParams;
            return hashCode + (map == null ? 0 : map.hashCode());
        }

        @NotNull
        public String toString() {
            return a.d("Fetch(asyncData=", this.asyncData, ", asyncParams=", ")", this.asyncParams);
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\u0004\b\f\u0010\rJH\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\"R%\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscription/presentation/NotificationSubscriptionVO$Loaded;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscription/presentation/NotificationSubscriptionVO$State;", "Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO;", "checkbox", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "Lru/ozon/uni/atoms/af/AtomAction;", "checkboxAction", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "analytics", "<init>", "(Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/af/AtomAction;Ljava/util/Map;)V", "copy", "(Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/af/AtomAction;Ljava/util/Map;)Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscription/presentation/NotificationSubscriptionVO$Loaded;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO;", "getCheckbox", "()Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getCheckboxAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Ljava/util/Map;", "getAnalytics", "()Ljava/util/Map;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Loaded implements State {
        private final Map<String, TokenizedTrackingInfo> analytics;

        @NotNull
        private final CheckBoxDTO checkbox;
        private final AtomAction checkboxAction;

        @NotNull
        private final TextDTO text;

        public Loaded(@NotNull CheckBoxDTO checkbox, @NotNull TextDTO text, AtomAction atomAction, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(checkbox, "checkbox");
            Intrinsics.checkNotNullParameter(text, "text");
            this.checkbox = checkbox;
            this.text = text;
            this.checkboxAction = atomAction;
            this.analytics = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Loaded copy$default(Loaded loaded, CheckBoxDTO checkBoxDTO, TextDTO textDTO, AtomAction atomAction, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                checkBoxDTO = loaded.checkbox;
            }
            if ((i11 & 2) != 0) {
                textDTO = loaded.text;
            }
            if ((i11 & 4) != 0) {
                atomAction = loaded.checkboxAction;
            }
            if ((i11 & 8) != 0) {
                map = loaded.analytics;
            }
            return loaded.copy(checkBoxDTO, textDTO, atomAction, map);
        }

        @NotNull
        public final Loaded copy(@NotNull CheckBoxDTO checkbox, @NotNull TextDTO text, AtomAction checkboxAction, Map<String, TokenizedTrackingInfo> analytics) {
            Intrinsics.checkNotNullParameter(checkbox, "checkbox");
            Intrinsics.checkNotNullParameter(text, "text");
            return new Loaded(checkbox, text, checkboxAction, analytics);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.d(this.checkbox, loaded.checkbox) && Intrinsics.d(this.text, loaded.text) && Intrinsics.d(this.checkboxAction, loaded.checkboxAction) && Intrinsics.d(this.analytics, loaded.analytics);
        }

        public final Map<String, TokenizedTrackingInfo> getAnalytics() {
            return this.analytics;
        }

        @NotNull
        public final CheckBoxDTO getCheckbox() {
            return this.checkbox;
        }

        public final AtomAction getCheckboxAction() {
            return this.checkboxAction;
        }

        @NotNull
        public final TextDTO getText() {
            return this.text;
        }

        public int hashCode() {
            int a11 = b.a(this.text, this.checkbox.hashCode() * 31, 31);
            AtomAction atomAction = this.checkboxAction;
            int hashCode = (a11 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.analytics;
            return hashCode + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Loaded(checkbox=" + this.checkbox + ", text=" + this.text + ", checkboxAction=" + this.checkboxAction + ", analytics=" + this.analytics + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscription/presentation/NotificationSubscriptionVO$State;", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscription/presentation/NotificationSubscriptionVO$Fetch;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscription/presentation/NotificationSubscriptionVO$Loaded;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface State {
    }

    public NotificationSubscriptionVO(long j11, @NotNull State state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.id = j11;
        this.state = state;
    }

    public static /* synthetic */ NotificationSubscriptionVO copy$default(NotificationSubscriptionVO notificationSubscriptionVO, long j11, State state, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = notificationSubscriptionVO.id;
        }
        if ((i11 & 2) != 0) {
            state = notificationSubscriptionVO.state;
        }
        return notificationSubscriptionVO.copy(j11, state);
    }

    @NotNull
    public final NotificationSubscriptionVO copy(long id2, @NotNull State state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return new NotificationSubscriptionVO(id2, state);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationSubscriptionVO)) {
            return false;
        }
        NotificationSubscriptionVO notificationSubscriptionVO = (NotificationSubscriptionVO) other;
        return this.id == notificationSubscriptionVO.id && Intrinsics.d(this.state, notificationSubscriptionVO.state);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final State getState() {
        return this.state;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        return this.state.hashCode() + (Long.hashCode(this.id) * 31);
    }

    @NotNull
    public String toString() {
        return "NotificationSubscriptionVO(id=" + this.id + ", state=" + this.state + ")";
    }
}
